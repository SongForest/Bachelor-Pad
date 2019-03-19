package jsdx.zjj.ssl.dao;

import java.util.List;
import java.util.Map;

import jsdx.zjj.ssl.entity.TPayoutRepai;
import jsdx.zjj.ssl.until.PayouUntil;
import org.springframework.stereotype.Repository;

@Repository
public interface TPayoutRepaiMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TPayoutRepai record);

    TPayoutRepai selectByPrimaryKey(Integer tableId);

    List<TPayoutRepai> selectAll();

    int updateByPrimaryKey(TPayoutRepai record);

    List<PayouUntil> sumMoneyByMon(Map<Object,Object> map);
}