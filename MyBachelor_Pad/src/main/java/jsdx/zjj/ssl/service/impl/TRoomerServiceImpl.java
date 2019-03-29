package jsdx.zjj.ssl.service.impl;

import jsdx.zjj.ssl.dao.TRoomerMapper;
import jsdx.zjj.ssl.entity.TRoomer;
import jsdx.zjj.ssl.service.TRoomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TRoomerServiceImpl implements TRoomerService{

    @Autowired
    private TRoomerMapper roomerMapper;

    @Override
    public int deleteByPrimaryKey(Integer tableId) {
        return roomerMapper.deleteByPrimaryKey(tableId);
    }

    @Override
    public int insert(TRoomer record) {
        return roomerMapper.insert(record);
    }

    @Override
    public TRoomer selectByPrimaryKey(Integer tableId) {
        return roomerMapper.selectByPrimaryKey(tableId);
    }

    @Override
    public List<TRoomer> listAll(Map<Object,Object> map) {
        return roomerMapper.listAll(map);
    }

    @Override
    public int updateByPrimaryKey(TRoomer record) {
        return roomerMapper.updateByPrimaryKey(record);
    }
}
