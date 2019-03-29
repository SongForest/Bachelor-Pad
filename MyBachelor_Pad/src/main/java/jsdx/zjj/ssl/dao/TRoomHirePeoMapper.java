package jsdx.zjj.ssl.dao;

import java.util.List;
import jsdx.zjj.ssl.entity.TRoomHirePeo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TRoomHirePeoMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TRoomHirePeo record);

    TRoomHirePeo selectByPrimaryKey(Integer tableId);

    List<TRoomHirePeo> selectAll();

    int updateByPrimaryKey(TRoomHirePeo record);
}