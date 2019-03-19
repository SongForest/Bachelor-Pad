package jsdx.zjj.ssl.service;

import jsdx.zjj.ssl.entity.TRoomer;

import java.util.List;
import java.util.Map;

public interface TRoomerService {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TRoomer record);

    TRoomer selectByPrimaryKey(Integer tableId);

    List<TRoomer> listAll(Map<Object,Object> map);

    int updateByPrimaryKey(TRoomer record);
}
