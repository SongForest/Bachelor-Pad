package jsdx.zjj.ssl.dao;

import java.util.List;
import jsdx.zjj.ssl.entity.TRoomRelet;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TRoomReletMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TRoomRelet record);

    TRoomRelet selectByPrimaryKey(Integer tableId);

    List<TRoomRelet> selectAll();

    int updateByPrimaryKey(TRoomRelet record);
}