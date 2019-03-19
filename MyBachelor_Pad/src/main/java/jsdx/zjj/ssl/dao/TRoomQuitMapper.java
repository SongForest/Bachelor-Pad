package jsdx.zjj.ssl.dao;

import java.util.List;
import jsdx.zjj.ssl.entity.TRoomQuit;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface TRoomQuitMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TRoomQuit record);

    TRoomQuit selectByPrimaryKey(Integer tableId);

    List<TRoomQuit> selectAll();

    int updateByPrimaryKey(TRoomQuit record);
}