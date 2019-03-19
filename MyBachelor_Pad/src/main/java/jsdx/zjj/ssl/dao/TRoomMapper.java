package jsdx.zjj.ssl.dao;

import java.util.List;
import java.util.Map;

import jsdx.zjj.ssl.entity.TRoom;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface TRoomMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TRoom record);

    TRoom selectByPrimaryKey(Integer tableId);

    List<TRoom> selectAll();

    int updateByPrimaryKey(TRoom record);

    //查询房间数量
    int coutAllRoom(Map<Object,Object> map);
}