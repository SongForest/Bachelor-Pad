package jsdx.zjj.ssl.dao;

import java.util.List;
import jsdx.zjj.ssl.entity.TRoomReserve;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TRoomReserveMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TRoomReserve record);

    TRoomReserve selectByPrimaryKey(Integer tableId);

    List<TRoomReserve> selectAll();

    int updateByPrimaryKey(TRoomReserve record);
}