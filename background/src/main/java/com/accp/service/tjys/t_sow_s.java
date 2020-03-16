package com.accp.service.tjys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Historical_query;
import com.accp.domain.SalesOutWarehouse;
import com.accp.domain.SalesOutWarehouseDetailed;
import com.accp.domain.SalesQuotation;
import com.accp.domain.SalesQuotationDetails;
import com.accp.domain.Salesorder;
import com.accp.mapper.Historical_queryMapper;
import com.accp.mapper.MatterMapper;
import com.accp.mapper.SalesOutWarehouseDetailedMapper;
import com.accp.mapper.SalesOutWarehouseMapper;
import com.accp.mapper.SalesQuotationDetailsMapper;
import com.accp.mapper.SalesQuotationMapper;
import com.accp.mapper.SalesorderMapper;
import com.accp.mapper.SalesorderlistMapper;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class t_sow_s {

    @Autowired
    SalesOutWarehouseMapper swe;

    @Autowired
    SalesOutWarehouseDetailedMapper swed;
    
    @Autowired
    SalesQuotationMapper salesQuotationMapper;

    @Autowired
    SalesQuotationDetailsMapper salesQuotationDetailsMapper;
    
    @Autowired
    SalesorderMapper salesorderMapper;
    
    @Autowired
    SalesorderlistMapper salesorderlistMapper;
    
    @Autowired
    MatterMapper matterMapper;
    
    //chauxn
    public SalesOutWarehouse seleAll(){
        List<SalesOutWarehouse> sow=swe.seleAll();
        SalesOutWarehouse sow1=sow.get(sow.size()-1);
        sow1.setSowd(swed.selectId(sow1.getSowId()));
        return sow1;
    }
    
    //新增自动生成单号
    public int insets(SalesOutWarehouse e){
    	String z;
    	String s=e.getSowId().substring(8,e.getSowId().length());
    	String s2=e.getSowId().substring(0,e.getSowId().length()-2);
    	int s1=Integer.parseInt(s);
    	if(s1>0 && s1<10) {
    		z=s2+"0"+(s1+1);
    	}else if(s1>=10 && s1<100) {
    		z=s2+s1;
    	}else {
    		z=s2+"01";
    	}
    	e.setSowId(z);
    	int a=swe.insertSelective(e);   
    	for (SalesOutWarehouseDetailed ss : e.getSowd()) {
			ss.setZuid(e.getSowId());
			a=swed.insertSelective(ss);
		}
        return a;
    }
    
    //删除
    public int updata(String sow_id) {
  
    	if(swe.selectsow_custom2(sow_id)!=1) {
    		int a=swe.updata(sow_id);
        	if(a>0) {
        		swed.updaate(sow_id);
        		return 1;
        	}
        	return 0;
    	}else {
    		return 2;
    	}
    	
    }
    
    //按日期查询单号生成新单号
    public String selecydata(String s) {
      	System.out.println(s);
    	int a=swe.selecydata(s);
    	if(a>0 && a<10) {
    		return "0"+(a+1);
    	}else if(a>=10 && a<100){
    		return (a+1)+"";
    	}else {
    		return "01";
    	}
    }
    
    //修改审核状态
    public int updateStatus(String sowAuditing,String sow_id,String sow_custom3) {
    	
    	
    //	System.out.println("进来了！！！"+sowAuditing+"==="+sow_id);
    		SalesOutWarehouse s=swe.selectByPrimaryKey(sow_id);
    		s.setSowd(swed.selectId(s.getSowId()));
    		
    		if(sowAuditing!="1") {//全部出库完成才能完成审核
    			if(swe.selectsow_custom2(sow_id)>0) {//大于才真正出库
    				for (int i = 0; i < s.getSowd().size(); i++) {
            			int Number=matterMapper.selectCount(s.getSowd().get(i).getMatterId());//库存
            			int id=s.getSowd().get(i).getZiid();//id
            			if(Number > s.getSowd().get(i).getCount()) {
            				matterMapper.Reduce(s.getSowd().get(i).getCount(),s.getSowd().get(i).getMatterId());
            				swed.Stock("0",id);
            			}else {
            				double a=s.getSowd().get(i).getCount();
            				matterMapper.Reduce(a-Number,s.getSowd().get(i).getMatterId());
            				swed.Stock((a-Number)+"",id);
            			}
        			}
    				swe.updateStatus(sowAuditing,sow_id);
    				return 1;
    			}else {
    				swe.updateStatus(sowAuditing,sow_id);
    				return 1;
    			}
			}else{
				if(swe.selectsow_custom2(sow_id)<1) {//小于就可以取消审核
					swe.updateStatus(sowAuditing,sow_id);
					return 1;
				}else {
					return 0;
				}
				
			}	
    }
    
    //开发票
    public void invoice(String sow_custom3,String sow_id) {
    		swe.invoice(sow_custom3, sow_id);
    }
    
    
    //修改单据
    public int updateByPrimaryKeySelective(SalesOutWarehouse e) {
    	int a=swe.updateByPrimaryKeySelective(e);
    	if(a==1) {
    		for (SalesOutWarehouseDetailed e1 : e.getSowd()) {
        		int b=swed.updateByPrimaryKeySelective(e1);
        		if(b!=1) {
        			return a;
        		}
    		}
    		return a;
    	}else {
    		return a;
    	}
    	
    }
    
    //选单销售询价
    public List<Salesorder> selectCid(String data1,String data2){
    	List<Salesorder> s=salesorderMapper.seleBytime(data1, data2);
    	for (int i = 0; i < s.size(); i++) {
			s.get(i).setList(salesorderlistMapper.selectzhuid(s.get(i).getSoDocumentnumber()));
		}
    	return s;
    }
}
