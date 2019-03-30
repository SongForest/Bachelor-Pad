package jsdx.zjj.ssl.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import jsdx.zjj.ssl.entity.TPayoutRepai;
import jsdx.zjj.ssl.until.PayouUntil;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TPayoutRepaiMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TPayoutRepai record);

    TPayoutRepai selectByPrimaryKey(Integer tableId);

    List<TPayoutRepai> selectAll();

    int updateByPrimaryKey(TPayoutRepai record);

    /**
     * 根據某些類型分組統計維修類型，維修金額
     * @param map
     * @return
     */
    List<PayouUntil> sumMoneyByMon(Map<Object,Object> map);


    /**
     * 根據某些条件统计金额
     * @param map
     * @return
     */
    BigDecimal countMoneyBySome(Map<Object,Object> map);
}