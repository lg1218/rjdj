package com.accp.controller.kl;

import com.accp.domain.Priabill;
import com.accp.service.kl.priabillService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priabill")
public class priabillController {
    @Autowired
    priabillService priabillService;
    @GetMapping("/queryByPriabill")
    public PageInfo queryBypriabill(Integer pageSize, Integer pageNum){
        return this.priabillService.queryByPriabill(pageSize,pageNum);
    }

    @PostMapping("/insertByPriabill")
    public boolean insertByPriabill(@RequestBody Priabill Priabill){
        System.out.println(JSON.toJSONString(Priabill)+"5566");
        return  this.priabillService.insertByPriabill(Priabill);
    }
    @PostMapping("/updateByPriabill")
    @ResponseBody
    public  boolean updateByPriabill( @RequestBody Priabill Priabill){
        System.out.println(JSON.toJSONString(Priabill.getPriadetails_list()));
        return this.priabillService.updateByPriabill(Priabill);
    }
    @PostMapping("/deleteBypriabill")
    @ResponseBody
    public boolean deleteByPriabill(@RequestBody Priabill Priabill){
        return this.priabillService.deleteByPriabill(Priabill);
    }
    @GetMapping("/getBillno")
    public int getBillno(){
        return this.priabillService.geteBillno();
    }

    @PostMapping("/priabillAudit")
    public boolean priabillAudit(@RequestBody Priabill Priabill){
        return this.priabillService.priabillAudit(Priabill);
    }
    /*载入预收*/
    @GetMapping("/queryByPriadetails")
    public List<Priabill> queryByPriadetails(String supplierId){
        return this.priabillService.queryByPriadetails(supplierId);
    }
}
