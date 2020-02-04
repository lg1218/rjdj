package com.accp.controller;

import com.accp.domain.BillnotPurchaseRequisitions;
import com.accp.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/perms")
public class indexController {

    @Autowired
    testService se;

    @GetMapping("/loginin")
    public List<BillnotPurchaseRequisitions> ss(){
        System.out.print(se.selectByExample()+"sssss");
        return se.selectByExample();
    }
}
