package com.accp.controller.kl;

import com.accp.domain.DetailedStatement;
import com.accp.service.kl.DetailedStatementServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Statement")
public class DetailedStatementController {
  /*  @Autowired
    DetailedStatementServise DetailedStatementServise;
    public List<DetailedStatement> queryByDetailedStatement(String  supplierId1, String supplierId2, String date1, String date2,String status){
        return this.DetailedStatementServise.queryByDetailedStatement(supplierId1,supplierId2,date1,date2,status);
    }*/
}
