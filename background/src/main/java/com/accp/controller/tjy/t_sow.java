package com.accp.controller.tjy;


import com.accp.domain.Historical_query;
import com.accp.domain.SalesOutWarehouse;
import com.accp.domain.SalesQuotation;
import com.accp.domain.SalesQuotationDetails;
import com.accp.domain.Salesorder;
import com.accp.service.tjys.t_sow_s;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t_sow")
@CrossOrigin
public class t_sow {

    @Autowired
    t_sow_s s;


    //查询最后一条
    @GetMapping("/x")
    public  SalesOutWarehouse seleAll(){
        return s.seleAll();
    }
    
    //新增
    @PostMapping("/w")
    @ResponseBody
    public int ss(@RequestBody SalesOutWarehouse e) {
    	s.insets(e);
    	return 1;
    }
    
    
    //修改
    @PostMapping("/u")
    @ResponseBody
    public int u(@RequestBody SalesOutWarehouse e) {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    	String da=sdf.format(e.getSowDocumentDate());
    	System.out.println(da);
    	System.out.println(e.getSowDocumentDate()+"sss");
    	return s.updateByPrimaryKeySelective(e);
    }
    
    
    //假删除
    @GetMapping("/d")
    public int delete(String sowId) {
    	System.out.println(sowId);
    	return s.updata(sowId);
    } 
    
    //新增根据日期自动生成单号
    @GetMapping("/wx")
    public String test(String da) {
    	System.out.println(da+"====");
    	return da+s.selecydata(da);
    }
   
	//审核
	@GetMapping("/s")
	public int s(String sowAuditing,String sowId,String sowCustom3) {
		return s.updateStatus(sowAuditing, sowId,sowCustom3);
		
	}
	
	//开票
	@GetMapping("/p")
	public int p(String sowCustom3,String sowId) {
		System.out.println("sss");
	    s.invoice(sowCustom3,sowId);	
		return 0;
	}
	
	//转单销售询价
	@GetMapping("/lss")
    public List<Salesorder> lss(String data1,String data2){
		System.err.println(data1+"===="+data2);
    	return s.selectCid(data1,data2);
    }
}
