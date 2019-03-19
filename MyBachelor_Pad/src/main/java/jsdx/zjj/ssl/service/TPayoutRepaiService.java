package jsdx.zjj.ssl.service;

import jsdx.zjj.ssl.entity.TPayoutRepai;

import java.util.List;

public interface TPayoutRepaiService {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TPayoutRepai record);

    TPayoutRepai selectByPrimaryKey(Integer tableId);

    List<TPayoutRepai> selectAll();

    int updateByPrimaryKey(TPayoutRepai record);
}
