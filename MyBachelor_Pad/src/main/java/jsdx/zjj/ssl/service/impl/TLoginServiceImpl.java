package jsdx.zjj.ssl.service.impl;

import jsdx.zjj.ssl.dao.*;
import jsdx.zjj.ssl.entity.TLogin;
import jsdx.zjj.ssl.service.TLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TLoginServiceImpl implements TLoginService {

    @Autowired
    private TLoginMapper loginMapper;

    @Autowired
    private TRoomMapper roomMapper;

    @Autowired
    private TRoomerMapper roomerMapper;

    @Autowired
    private TPayouMapper payouMapper;

    @Autowired
    private TPayoutRepaiMapper payoutRepaiMapper;

    @Override
    public Map<Object, Object> MapHead() {
        return null;
    }

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
        //获取今日出租房子数量
        parMap.put("romsta", 2);
        indexMap.put("renTodayRoom", roomMapper.coutAllRoom(parMap));
        //获取尚未出租房间数量
        parMap.put("romsta", 3);
        indexMap.put("notLetRoom", roomMapper.coutAllRoom(parMap));
        //按月统计今年入住人数
        parMap.remove("romsta");
        parMap.put("yearByMonRoom", 1);
        indexMap.put("yearRoom", roomMapper.coutAllRoom(parMap));
        //查询最新入住的五人信息
        parMap.remove("yearRoom");
        parMap.put("dateOrd", 1);
        parMap.put("page", 0);
        parMap.put("pageSize", 5);
        indexMap.put("listPeo", roomerMapper.listAll(parMap));
        //本月支出金钱情况
        parMap.put("payMon", 1);
        parMap.remove("dateOrd");
        parMap.remove("pageSize");
        parMap.remove("page");
        indexMap.put("payout", payouMapper.listPayouMoney(parMap));
        indexMap.put("repairPayout", payoutRepaiMapper.sumMoneyByMon(parMap));
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
}
