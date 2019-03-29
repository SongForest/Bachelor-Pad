package jsdx.zjj.ssl.dao;

import java.util.List;
import java.util.Map;

import jsdx.zjj.ssl.entity.TRoomHire;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TRoomHireMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TRoomHire record);

    TRoomHire selectByPrimaryKey(Integer tableId);

    List<TRoomHire> selectAll();

    int updateByPrimaryKey(TRoomHire record);

    int countHire(Map<String,Object>map);
}