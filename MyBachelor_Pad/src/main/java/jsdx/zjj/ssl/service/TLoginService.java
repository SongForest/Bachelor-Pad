package jsdx.zjj.ssl.service;

import jsdx.zjj.ssl.entity.TLogin;

import java.util.List;
import java.util.Map;

public interface TLoginService {
    /**
     * 获取首页部分信息
     * @return 返回首页信息
     */
    Map<Object, Object> MapIndex();

    /**
     * 或取头信息
     * @return
     */
    Map<Object, Object> MapHead();

    /**
     * 获取首页中需要用javasvript中的list集合信息
     * @return
     */
    Map<Object,Object>getHireAndPy();

    int deleteByPrimaryKey(Integer tableId);

    int insert(TLogin record);

    TLogin selectByPrimaryKey(Integer tableId);

    List<TLogin> ListAll();

    int updateByPrimaryKey(TLogin record);


}
