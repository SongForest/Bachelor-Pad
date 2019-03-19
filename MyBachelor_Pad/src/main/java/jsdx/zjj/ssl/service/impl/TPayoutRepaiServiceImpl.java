package jsdx.zjj.ssl.service.impl;

import jsdx.zjj.ssl.dao.TPayoutRepaiMapper;
import jsdx.zjj.ssl.entity.TPayoutRepai;
import jsdx.zjj.ssl.service.TPayoutRepaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TPayoutRepaiServiceImpl implements TPayoutRepaiService {
    @Autowired
    private TPayoutRepaiMapper payoutRepaiMapper;
    @Override
    public int deleteByPrimaryKey(Integer tableId) {
        return payoutRepaiMapper.deleteByPrimaryKey(tableId);
    }

    @Override
    public int insert(TPayoutRepai record) {
        return payoutRepaiMapper.insert(record);
    }

    @Override
    public TPayoutRepai selectByPrimaryKey(Integer tableId) {
        return payoutRepaiMapper.selectByPrimaryKey(tableId);
    }

    @Override
    public List<TPayoutRepai> selectAll() {
        return payoutRepaiMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(TPayoutRepai record) {
        return payoutRepaiMapper.updateByPrimaryKey(record);
    }
}
