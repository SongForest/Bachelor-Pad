package jsdx.zjj.ssl.dao;

import java.util.List;
import java.util.Map;

import jsdx.zjj.ssl.entity.TRoomer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface TRoomerMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TRoomer record);

    TRoomer selectByPrimaryKey(Integer tableId);

    List<TRoomer> listAll(Map<Object,Object>map);

    int updateByPrimaryKey(TRoomer record);

    int countRoomer(Map<Object,Object>map);
}