package com.accp.service.kl;

import com.accp.domain.AccountsDetail;
import com.accp.domain.DetailedStatement;
import com.accp.domain.Payables_detail;
import com.accp.domain.Supplier;
import com.accp.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DetailedStatementServise {
  /*  @Autowired
    private PriabillMapper PriabillMapper;//预付款单主表
    @Autowired
    private PriadetailsMapper PriadetailsMapper;//预付款单详表
    @Autowired
    private SupplierMapper SupplierMapper;//供应商主表
    @Autowired
    private AccountsDetailMapper AccountsDetailMapper;//账款明细表
    @Autowired
    private PayablesMapper PayablesMapper;//应付冲款主表
    @Autowired
    private Payables_detailMapper Payables_detailMapper;//应付冲款单详表
    *//*查询供应商应付款明细表所需信息*//*
    public List<DetailedStatement> queryByDetailedStatement(String  supplierId1,String supplierId2,String date1,String date2,String status){
        *//*根据供应商编号查询出所有供应商的信息*//*
        List<Supplier> Supplier = this.SupplierMapper.queryById(supplierId1,supplierId2);
        List<DetailedStatement> DetailedStatement = new ArrayList<com.accp.domain.DetailedStatement>();
        for (com.accp.domain.Supplier supplier:Supplier){
            DetailedStatement DetailedStatement1 = new DetailedStatement();
            DetailedStatement1.setSupplierId(supplier.getSupplierId());
            DetailedStatement1.setSupplierName(supplier.getSupplierName());
            DetailedStatement.add(DetailedStatement1);
        }
        *//*根据status判断是否查询期末余额为0的单据*//*
        if(status=="1"){//不查询为0的
            *//*去应付冲款单与账款明细表查询该时间段该供应商现行余额不为0的账款*//*
            for (DetailedStatement Detailed:DetailedStatement){
                List<AccountsDetail> AccountsDetail = this.AccountsDetailMapper.queryByfirstDue(Detailed.getSupplierId(),date1);//应付款1
                List<Payables_detail> Payables_detail = this.Payables_detailMapper.queryByfirstDue(Detailed.getSupplierName(),date1);//应付款2

            }
        }else if(status=="2"){//查询为0的
            *//*去应付冲款单与账款明细表内查询该时间段内该供应商所有交易记录*//*
        }
    }*/
}
