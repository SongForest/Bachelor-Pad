package jsdx.zjj.ssl.service;

import jsdx.zjj.ssl.entity.TPayou;

import java.util.List;
import java.util.Map;

public interface TPayouService {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TPayou record);

    TPayou selectByPrimaryKey(Integer tableId);

    List<TPayou> ListAll(Map<Object,Object> map);

    int updateByPrimaryKey(TPayou record);
}
