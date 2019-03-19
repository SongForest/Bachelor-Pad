package jsdx.zjj.ssl.service;

import jsdx.zjj.ssl.entity.TAdmin;

import java.util.List;

public interface TAdminService {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TAdmin record);

    TAdmin selectByPrimaryKey(Integer tableId);

    List<TAdmin> selectAll();

    int updateByPrimaryKey(TAdmin record);
}
