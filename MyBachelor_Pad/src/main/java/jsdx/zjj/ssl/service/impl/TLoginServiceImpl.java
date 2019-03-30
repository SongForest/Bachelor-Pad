package jsdx.zjj.ssl.service.impl;

import jsdx.zjj.ssl.dao.*;
import jsdx.zjj.ssl.entity.TLogin;
import jsdx.zjj.ssl.service.TLoginService;
import jsdx.zjj.ssl.until.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TLoginServiceImpl implements TLoginService {
    private static final Logger LOG = LoggerFactory.getLogger(TLoginServiceImpl.class);

    @Autowired
    private TLoginMapper loginMapper;

    @Autowired
    private TRoomMapper roomMapper;

    @Autowired
    private TRoomHireMapper roomHireMapper;

    @Autowired
    private TRoomerMapper roomerMapper;

    @Autowired
    private TPayouMapper payouMapper;

    @Autowired
    private TPayoutRepaiMapper payoutRepaiMapper;

    /**
     * 或取头信息
     *
     * @return
     */
    @Override
    public Map<Object, Object> MapHead() {
        return null;
    }


    /**
     * 获取首页部分信息
     *
     * @return 返回首页信息
     */
    @Override
    public Map<Object, Object> MapIndex() {
        //返回页面的数据保存在这个map中
        Map<Object, Object> indexMap = new HashMap<>();
        //传入查询方法中的参数
        Map<Object, Object> parMap = new HashMap<>();
        //获取全部房子
        indexMap.put("allRoom", roomMapper.coutAllRoom(parMap));

        //获取全部预租房屋数量
        parMap.put("romsta", 1);
        indexMap.put("preLeasingRoom", roomMapper.coutAllRoom(parMap));
        //获取今日租房数量
        parMap.put("romsta", 2);
        indexMap.put("renTodayRoom", roomMapper.coutAllRoom(parMap));
        //获取尚未出租房间数量
        parMap.put("romsta", 3);
        indexMap.put("notLetRoom", roomMapper.coutAllRoom(parMap));
        //按月统计今年入住人数
        parMap.remove("romsta");
        parMap.put("yearByMonRoom", 1);
        indexMap.put("yearRoom", countYearBymon());
        //查询最新入住的五人信息
        parMap.remove("yearRoom");
        parMap.put("dateOrd", 1);
        parMap.put("page", 0);
        parMap.put("pageSize", 5);
        indexMap.put("listPeo", roomerMapper.listAll(parMap));
        //本月按类型统计支出金钱情况
        parMap.put("payMon", DateUtil.getSDate("yyyy-MM-dd"));
        parMap.remove("dateOrd");
        parMap.remove("pageSize");
        parMap.remove("page");
        indexMap.put("payout", payouMapper.listPayouMoney(parMap));
        indexMap.put("repairPayout", payoutRepaiMapper.sumMoneyByMon(parMap));

        //获取当月支出
        indexMap.put("coutPay", payouMapper.countMoneyBySome(parMap));
        indexMap.put("countRepair", payoutRepaiMapper.countMoneyBySome(parMap));
        //获取全部注册用户
        indexMap.put("coutRoomer", roomerMapper.countRoomer(parMap));


        //查询全部入住用户
        indexMap.put("allRoomer", roomerMapper.countRoomer(parMap));
        return indexMap;
    }


    @Override
    public int deleteByPrimaryKey(Integer tableId) {
        return loginMapper.deleteByPrimaryKey(tableId);
    }

    @Override
    public int insert(TLogin record) {
        return loginMapper.insert(record);
    }

    @Override
    public TLogin selectByPrimaryKey(Integer tableId) {
        return loginMapper.selectByPrimaryKey(tableId);
    }

    @Override
    public List<TLogin> ListAll() {
        return loginMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(TLogin record) {
        return loginMapper.updateByPrimaryKey(record);
    }

    private List<Integer> countYearBymon() {
        List<Integer> integerList = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        for (int i = 1; i < 13; i++) {
            calendar.set(Calendar.MONTH, i);
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("dateMon", calendar.getTime());
            integerList.add(roomHireMapper.countHire(paramMap));
        }
        return integerList;
    }
}
