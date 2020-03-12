package com.accp.controller.kl;

import com.accp.domain.*;
import com.accp.service.kl.payableService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payable")
public class payableController {
    @Autowired
    com.accp.service.kl.payableService payableService;

    @GetMapping("/queryByCustomerName")
    public Supplier queryByCustomerName(String name){
        System.out.println(name);
        return this.payableService.queryByCustomerName(name);
    }
    @GetMapping("/queryBySupplier")
    public List<Supplier> queryBySupplier(){
        return this.payableService.queryBySupplier();
    }
   @GetMapping("/queryBySingleCurrency")
    public List<Payables_detail> queryBySingleCurrency(String id){
       System.out.println("id："+id);
       return this.payableService.queryBySingleCurrency(id);
   }
   @GetMapping("/queryByMoreCurrency")
    public List<Payables_detail> queryByMoreCurrency(String id){
       System.out.println("id:"+id);
       return this.payableService.queryByMoreCurrency(id);
   }
    @GetMapping("/queryByBillno")
    public String queryByBillno(String date){
        System.out.println("date:"+date);
        return this.payableService.queryByBillno(date);
    }
    @GetMapping("/queryByPriabillBillno")
    public String queryByPriabillBillno(String date){
        System.out.println("date:"+date);
        return this.payableService.queryByPriabillBillno(date);
    }
    @PostMapping("/insertByPayables")
    @ResponseBody
    public boolean insertByPayables(@RequestBody Payables payables){

        return this.payableService.insertByPayables(payables);
    }
    @PostMapping("/updateByPayables")
    @ResponseBody
    public boolean updateByPayables(@RequestBody Payables payables){
        return this.payableService.updateByPayables(payables);
    }
    @PostMapping("/deleteByPayables")
    @ResponseBody
    public boolean deleteByPayables(@RequestBody Payables payables){

        return this.payableService.deleteBypayables(payables);
    }
    @GetMapping("/queryByPayablesId")
    public PageInfo queryByPayablesId(Integer pageSize, Integer pageNum){
        return this.payableService.queryByPayables(pageSize,pageNum);
    }


    @GetMapping("/queryByCurrencyId")
    public Currency queryByCurrencyId(String currencyId){
        System.out.println("currencyId"+currencyId);
    return this.payableService.queryByCurrency(currencyId);
    }

}
