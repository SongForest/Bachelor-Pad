package jsdx.zjj.ssl.service;

import jsdx.zjj.ssl.entity.TLogin;

import java.util.List;
import java.util.Map;

public interface TLoginService {
    Map<Object, Object> MapIndex();

    Map<Object, Object> MapHead();

    int deleteByPrimaryKey(Integer tableId);

    int insert(TLogin record);

    TLogin selectByPrimaryKey(Integer tableId);

    List<TLogin> ListAll();

    int updateByPrimaryKey(TLogin record);
}
