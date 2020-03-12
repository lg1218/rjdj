package com.accp.service.kl;

import com.accp.domain.*;
import com.accp.mapper.*;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class payableService {
    @Autowired
    SupplierMapper SupplierMapper;//客户表/供应商
    @Autowired
    AccountsDetailMapper AccountsDetailMapper;//销售明细
    @Autowired
    PayablesMapper PayablesMapper;//应付冲款主表
    @Autowired
    Payables_detailMapper Payables_detailMapper;//应付冲款详表
    @Autowired
    PriabillMapper PriabillMapper;//预付款主表
    @Autowired
    PriadetailsMapper PriadetailsMapper;//预付款详表
    @Autowired
    CurrencyMapper CurrencyMapper;//币别表

    //根据供应商名字查询供应商信息
    public Supplier queryByCustomerName(String Name){
        Supplier Supplier = this.SupplierMapper.queryByName(Name);
        System.out.println(Supplier.getSupplierName());
        return Supplier;
    }
    //转入单币别收款:依据供应商ID
    public List<Payables_detail> queryBySingleCurrency(String SupplierId){
      List<AccountsDetail> AccountsDetail_list = this.AccountsDetailMapper.queryBySingleCurrency(SupplierId);
      List<Payables_detail> Payables_detail_list = new ArrayList<Payables_detail>();
        for (AccountsDetail AccountsDetail: AccountsDetail_list) {
            Payables_detail Payables_detail =new Payables_detail();
            Payables_detail.setPaydetailId(AccountsDetail.getAccedeId().toString());
            Payables_detail.setPadeSourcelist(AccountsDetail.getAccedeType());
            Payables_detail.setPadeSourcetime(AccountsDetail.getAccedeDate());
            Payables_detail.setPadeSourcenumber(AccountsDetail.getAccedeNumber());
            Payables_detail.setPadeTransaction(AccountsDetail.getAccedePcId());
            Payables_detail.setPadeTransactionname(AccountsDetail.getAccedePcName());
            Payables_detail.setPadeTeamId(AccountsDetail.getAccedeTeamId());
            Payables_detail.setPadeTeamName(AccountsDetail.getAccedeTeamName());
            Payables_detail.setPadeStaffName(AccountsDetail.getAccedeBuyer());
            Payables_detail.setPadeProjectName(AccountsDetail.getAccedeProjectName());
            Payables_detail.setPadeCurrencyName(AccountsDetail.getAccedeCurrency());
            Payables_detail.setPadeCurrencyInexchange(AccountsDetail.getAccedeExchangeRate());
            Payables_detail.setPadePrice(AccountsDetail.getAccedePayablesmainPrice());
            Payables_detail.setPadeCurrentbalance(AccountsDetail.getAccedeCurrentbalance());
            Payables_detail.setPadeAmountcharged(AccountsDetail.getAccedeAmountcharged());
            Payables_detail.setPadeOffsetamount(AccountsDetail.getAccedeOffsetamount());
            Payables_detail_list.add(Payables_detail);
        }
        return Payables_detail_list;
    }
    //转入多币别收款:依据供应商ID
    public List<Payables_detail> queryByMoreCurrency(String SupplierId){
        List<AccountsDetail> AccountsDetail_list =this.AccountsDetailMapper.queryByMoreCurrency(SupplierId);
        System.out.println(JSON.toJSONString(AccountsDetail_list));
        List<Payables_detail> Payables_detail_list = new ArrayList<Payables_detail>();
        for (AccountsDetail AccountsDetail: AccountsDetail_list) {
            Payables_detail Payables_detail = new Payables_detail();
            Payables_detail.setPaydetailId(AccountsDetail.getAccedeId().toString());
            Payables_detail.setPadeSourcelist(AccountsDetail.getAccedeType());
            Payables_detail.setPadeSourcetime(AccountsDetail.getAccedeDate());
            Payables_detail.setPadeSourcenumber(AccountsDetail.getAccedeNumber());
            Payables_detail.setPadeTransaction(AccountsDetail.getAccedePcId());
            Payables_detail.setPadeTransactionname(AccountsDetail.getAccedePcName());
            Payables_detail.setPadeTeamId(AccountsDetail.getAccedeTeamId());
            Payables_detail.setPadeTeamName(AccountsDetail.getAccedeTeamName());
            Payables_detail.setPadeStaffName(AccountsDetail.getAccedeBuyer());
            Payables_detail.setPadeProjectName(AccountsDetail.getAccedeProjectName());
            Payables_detail.setPadeCurrencyName(AccountsDetail.getAccedeCurrency());
            Payables_detail.setPadePrice(Float.parseFloat(String.valueOf(AccountsDetail.getAccedeExchangeRate())));
            Payables_detail.setPadeCustom1(AccountsDetail.getAccedePayablesmainPrice());
            Payables_detail.setPadeCurrentbalance(AccountsDetail.getAccedeCurrentbalance());
            Payables_detail.setPadeAmountcharged(AccountsDetail.getAccedeAmountcharged());
            Payables_detail.setPadeOffsetamount(AccountsDetail.getAccedeOffsetamount());
            Payables_detail_list.add(Payables_detail);
        }
        return Payables_detail_list;
    }
    //自动获取单号
    public String queryByBillno(String date){
       int num =  this.PayablesMapper.queryByBillno(date);
       String billno = date.replace("-","");
       num++;
       if(num>9){
        return billno+"0"+num;
       }else if(num>99){
           return billno+num;
       }else{
           return billno+"00"+num;
       }
    }

    public String queryByPriabillBillno(String date){
        int num =  this.PriabillMapper.queryByBillno(date);
        String billno = date.replace("-","");
        num++;
        if(num>9){
            return billno+"0"+num;
        }else if(num>99){
            return billno+num;
        }else{
            return billno+"00"+num;
        }
    }
    //新增应付款主表
    public boolean insertByPayables(Payables Payables){
        System.out.println(JSON.toJSONString(Payables.getPayables_detailList())+"3344");
        Payables.setPayablesYn("0");
        int num = this.PayablesMapper.insert(Payables);
        if (num==1){
            for (Payables_detail detail:Payables.getPayables_detailList()) {
                detail.setPayablesId(Payables.getPayablesId());
                detail.setPadeYn("0");
                AccountsDetail AccountsDetail = this.AccountsDetailMapper.selectByPrimaryKey(Integer.parseInt(detail.getPaydetailId()));
                AccountsDetail.setPayablesId(Payables.getPayablesId());
                detail.setPaydetailId(null);
                this.Payables_detailMapper.insert(detail);
                this.AccountsDetailMapper.updateByPrimaryKey(AccountsDetail);
            }
        }
        return false;
    }
    //修改应付款主表
    public boolean updateByPayables(Payables payables){
        System.out.println(JSON.toJSONString(payables.getPayables_detailList())+"3344");
        int num = this.PayablesMapper.updateByPrimaryKey(payables);
           for (Payables_detail detail:payables.getPayables_detailList()) {
                this.Payables_detailMapper.updateByPrimaryKey(detail);
            }
          return true;

    }
    //删除应付款主表
    public boolean deleteBypayables(Payables Payables){
        System.out.println(JSON.toJSONString(Payables)+"3344");
        Payables.setPayablesYn("1");
        int num = this.PayablesMapper.updateByPrimaryKey(Payables);
        if (num==1){
            for (Payables_detail detail:Payables.getPayables_detailList()) {
                detail.setPadeYn("1");
                this.Payables_detailMapper.updateByPrimaryKey(detail);
                List<AccountsDetail> AccountsDetail = this.AccountsDetailMapper.selectBypayablesId(Integer.parseInt(Payables.getPayablesId()));
                for ( AccountsDetail accountsDetail:AccountsDetail){
                    System.out.println(JSON.toJSONString(accountsDetail)+"1123");
                    accountsDetail.setPayablesId(null);
                    this.AccountsDetailMapper.updateByPrimaryKey(accountsDetail);
                }

            }
            return true;
        }
        return false;
    }
    //查询最近一个单据
    public PageInfo queryByPayables(Integer pageSize, Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        List<Payables> Payables =this.PayablesMapper.queryByTime();
        Payables.get(0).setPayables_detailList(this.Payables_detailMapper.queryByPayablesId(Payables.get(0).getPayablesId()));
        PageInfo pageInfo = new PageInfo(Payables);
        System.out.println(JSON.toJSONString(pageInfo));
        return pageInfo;
    }
    //查询汇率币别
    public Currency queryByCurrency(String currencyId){
        return this.CurrencyMapper.selectByPrimaryKey(currencyId);
    }
    //查询所有供应商
    public List<Supplier> queryBySupplier(){
        return this.SupplierMapper.queryBySupplier();
    }



}
