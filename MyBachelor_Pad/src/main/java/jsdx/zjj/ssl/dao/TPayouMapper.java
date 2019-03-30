package jsdx.zjj.ssl.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import jsdx.zjj.ssl.entity.TPayou;
import jsdx.zjj.ssl.until.PayouUntil;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TPayouMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TPayou record);

    TPayou selectByPrimaryKey(Integer tableId);

    List<TPayou> listAll(Map<Object,Object> map);

    int updateByPrimaryKey(TPayou record);

    List<PayouUntil> listPayouMoney(Map<Object,Object> map);

    /**
     * 根據某些条件统计金额
     * @param map
     * @return
     */
    BigDecimal countMoneyBySome(Map<Object,Object> map);
}