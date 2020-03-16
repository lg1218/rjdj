package com.accp.service.tjys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.SalesOutWarehouse;
import com.accp.domain.SalesOutWarehouseDetailed;
import com.accp.domain.SalesReturnWarehouse;
import com.accp.domain.SalesReturnWarehouseDetailed;
import com.accp.mapper.SalesOutWarehouseDetailedMapper;
import com.accp.mapper.SalesOutWarehouseMapper;
import com.accp.mapper.SalesReturnWarehouseDetailedMapper;
import com.accp.mapper.SalesReturnWarehouseMapper;

@Service
@Transactional
public class t_salesReturnsService {

	@Autowired
	SalesReturnWarehouseMapper salesReturnWarehouseMapper;//退货主
	
	@Autowired
	SalesReturnWarehouseDetailedMapper salesReturnWarehouseDetailedMapper;//退货子
	
	@Autowired
	SalesOutWarehouseMapper salesOutWarehouseMapper;
	
	@Autowired
	SalesOutWarehouseDetailedMapper salesOutWarehouseDetailedMapper;
	
	//查询
	public SalesReturnWarehouse selectByExample() {
		List<SalesReturnWarehouse> s=salesReturnWarehouseMapper.seleAll();
		SalesReturnWarehouse s1=s.get(s.size()-1);
		s1.setList(salesReturnWarehouseDetailedMapper.selectzhuID(s1.getSrwId()));
		return s1;
	}
	
	//根据日期自动生成单号
	public String selectDate(String s) {
		System.out.println(s);
    	int a=salesReturnWarehouseMapper.selectDate(s);
    	if(a>0 && a<10) {
    		return "0"+(a+1);
    	}else if(a>=10 && a<100){
    		return (a+1)+"";
    	}else {
    		return "01";
    	}
	}
	
	//查询
	public List<SalesOutWarehouse> seleBytime(String data1,String data2) {
		List<SalesOutWarehouse> s=salesOutWarehouseMapper.seleBytime(data1, data2);
		for (int i = 0; i < s.size(); i++) {
			s.get(i).setSowd(salesOutWarehouseDetailedMapper.selectId(s.get(i).getSowId()));
		}
		return s;
	}
	
	//新增
	public int insertSelective(SalesReturnWarehouse e) {
		int a=salesReturnWarehouseMapper.insertSelective(e);  
    	for (SalesReturnWarehouseDetailed ss : e.getList()) {
			ss.setZuid(e.getSrwId());
			a=salesReturnWarehouseDetailedMapper.insertSelective(ss);
		}
        return a;
	}
	
	 //修改审核状态
    public int updateStatus(String sowAuditing,String srw_id) {
    	/*if(salesReturnWarehouseMapper.selectSrw(srw_id)!=1) {*/
    		return salesReturnWarehouseMapper.updateStatus(sowAuditing,srw_id);
    	/*}else {
    		return 2;
    	}*/
    	
    }
    
    //删除
    public int updata(String srw_id) {
    		int a=salesReturnWarehouseMapper.updata(srw_id);
        	if(a>0) {
        		salesReturnWarehouseDetailedMapper.updaate(srw_id);
        		return 1;
        	}
        	return 0;    	
    }
    
    //修改单据
    public int updateByPrimaryKeySelective(SalesReturnWarehouse e) {
    	int a=salesReturnWarehouseMapper.updateByPrimaryKeySelective(e);
    	if(a==1) {
    		for (SalesReturnWarehouseDetailed e1 : e.getList()) {
        		int b=salesReturnWarehouseDetailedMapper.updateByPrimaryKeySelective(e1);
    		}
    		return a;
    	}else {
    		return a;
    	}
    	
    }
}
