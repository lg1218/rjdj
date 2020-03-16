package com.accp.controller.tjy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Currency;
import com.accp.domain.Customer;
import com.accp.domain.Matter;
import com.accp.domain.Warehouse;
import com.accp.service.tjys.t_khzl_Service;

@RestController
@RequestMapping("/t_khzl_Controller")
@CrossOrigin
public class t_khzl_Controller {

	@Autowired
	t_khzl_Service t_khzl;
	
	/**
	 * 查询全部客户信息
	 * 查询全部货币类型信息
	 */
	@GetMapping("/x")
	public List<Customer> x() {
		return t_khzl.selectByExample();
	}
	
	//货币
	@GetMapping("/b")
	public List<Currency> b() {
		return t_khzl.CselectByExample();
	}
	
	//仓库
	@GetMapping("/w")
	public List<Warehouse> w() {
		return t_khzl.wselectByExample();
	}
	
	//选择物料
	@GetMapping("/wl")
	public List<Matter> wl() {
		
		return t_khzl.wlelectByExample();
	}
	
	/**
	 *
	 * 这是选取物料后查询此物料的数量 如果是转单的话
	 */
	
}
