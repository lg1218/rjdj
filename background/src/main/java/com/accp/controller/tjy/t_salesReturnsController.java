package com.accp.controller.tjy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.SalesOutWarehouse;
import com.accp.domain.SalesReturnWarehouse;
import com.accp.service.tjys.t_salesReturnsService;

@RestController
@RequestMapping("/trc")
@CrossOrigin
public class t_salesReturnsController {

	@Autowired
	t_salesReturnsService srs;
	
	/***
	 * 进入页面显示最后一条记录
	 */
	
	@GetMapping("/c")//
	public SalesReturnWarehouse c() {
		if(srs.selectByExample()==null) {
			return null;
		}else {
			return srs.selectByExample();
		}
	}
	
	//新增的时候自动根据当前日期查询
	//新增根据选中日期自动生成单号
    @GetMapping("/wx")
    public String test(String da) {
    	System.out.println(da+"====");
    	return da+srs.selectDate(da);
    }
    
  //转单销售询价
  	@GetMapping("/lss")
      public List<SalesOutWarehouse> lss(String data1,String data2){
  		System.err.println(data1+"===="+data2);
      	return srs.seleBytime(data1, data2);
      }
  	
  	//新增
  	@PostMapping("/x")
  	@ResponseBody
  	public int x(@RequestBody SalesReturnWarehouse e) {
  		return srs.insertSelective(e);
  	}
  	
  	//审核和反审核都是一个单
  	@GetMapping("/s")
  	public int s(String srwAuditing,String srwId) {
  		System.out.println(srwAuditing+"=="+srwId);
  		return srs.updateStatus(srwAuditing,srwId);
  	}
  	
  	 //假删除
    @GetMapping("/d")
    public int delete(String srwId) {
    	System.out.println(srwId);
    	return srs.updata(srwId);
    } 
    
  //修改
    @PostMapping("/u")
    @ResponseBody
    public int u(@RequestBody SalesReturnWarehouse e) {
    	//System.out.println(e.getSowDocumentDate()+"sss");
    	return srs.updateByPrimaryKeySelective(e);
    }
}
