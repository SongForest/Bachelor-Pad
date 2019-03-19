package jsdx.zjj.ssl.service.impl;

import jsdx.zjj.ssl.dao.TPayouMapper;
import jsdx.zjj.ssl.entity.TPayou;
import jsdx.zjj.ssl.service.TPayouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TPayouServiceImpl implements TPayouService {
    @Autowired
    private TPayouMapper payouMapper;

    @Override
    public int deleteByPrimaryKey(Integer tableId) {
        return payouMapper.deleteByPrimaryKey(tableId);
    }

    @Override
    public int insert(TPayou record) {
        return payouMapper.insert(record);
    }

    @Override
    public TPayou selectByPrimaryKey(Integer tableId) {
        return payouMapper.selectByPrimaryKey(tableId);
    }

    @Override
    public List<TPayou> ListAll(Map<Object,Object> map) {
        return payouMapper.listAll(map);
    }

    @Override
    public int updateByPrimaryKey(TPayou record) {
        return payouMapper.updateByPrimaryKey(record);
    }
}
