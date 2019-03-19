package jsdx.zjj.ssl.service.impl;

import jsdx.zjj.ssl.dao.TAdminMapper;
import jsdx.zjj.ssl.entity.TAdmin;
import jsdx.zjj.ssl.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TAdminServiceImpl implements TAdminService {

    @Autowired
    private TAdminMapper adminMapper;

    @Override
    public int deleteByPrimaryKey(Integer tableId) {
        return adminMapper.deleteByPrimaryKey(tableId);
    }

    @Override
    public int insert(TAdmin record) {
        return adminMapper.insert(record);
    }

    @Override
    public TAdmin selectByPrimaryKey(Integer tableId) {
        return adminMapper.selectByPrimaryKey(tableId);
    }

    @Override
    public List<TAdmin> selectAll() {
        return adminMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(TAdmin record) {
        return adminMapper.updateByPrimaryKey(record);
    }
}
