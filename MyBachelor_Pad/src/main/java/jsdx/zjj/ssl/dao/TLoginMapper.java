package jsdx.zjj.ssl.dao;

import java.util.List;
import jsdx.zjj.ssl.entity.TLogin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TLoginMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TLogin record);

    TLogin selectByPrimaryKey(Integer tableId);

    List<TLogin> selectAll();

    int updateByPrimaryKey(TLogin record);
}