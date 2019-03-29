package jsdx.zjj.ssl.dao;

import java.util.List;
import jsdx.zjj.ssl.entity.TAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
@Repository
public interface TAdminMapper {
    int deleteByPrimaryKey(Integer tableId);

    int insert(TAdmin record);

    TAdmin selectByPrimaryKey(Integer tableId);

    List<TAdmin> selectAll();

    int updateByPrimaryKey(TAdmin record);
}