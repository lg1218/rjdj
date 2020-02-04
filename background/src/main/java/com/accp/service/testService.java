package com.accp.service;

import com.accp.domain.BillnotPurchaseRequisitions;

import com.accp.mapper.BillnotPurchaseRequisitionsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class testService {

    @Autowired
    BillnotPurchaseRequisitionsMapper BMapper;

    public List<BillnotPurchaseRequisitions> selectByExample() {
        return BMapper.selectByExample(null);
    }
}
