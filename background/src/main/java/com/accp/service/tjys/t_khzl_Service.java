package com.accp.service.tjys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Currency;
import com.accp.domain.Customer;
import com.accp.domain.Matter;
import com.accp.domain.Warehouse;
import com.accp.mapper.CurrencyMapper;
import com.accp.mapper.CustomerMapper;
import com.accp.mapper.MatterMapper;
import com.accp.mapper.WarehouseMapper;

@Service
@Transactional
public class t_khzl_Service {
	
	@Autowired
	CustomerMapper customerMapper;
	
	@Autowired
	CurrencyMapper currencyMapper;
	
	@Autowired
	WarehouseMapper warehouseMapper;
	
	@Autowired
	MatterMapper matterMapper;
	
	//查询全部客户
	public List<Customer> selectByExample() {
		return customerMapper.selectByExample(null);
	}
	
	//查询全部客户currency
	public List<Currency> CselectByExample() {
		return currencyMapper.selectByExample(null);
	}
	
	//查询全部仓库主表warehouse
	public List<Warehouse> wselectByExample() {
		return warehouseMapper.selectByExample(null);
	}
	
	//查询物料主表
	public List<Matter> wlelectByExample() {
		return matterMapper.selectByExample(null);
	}
}
