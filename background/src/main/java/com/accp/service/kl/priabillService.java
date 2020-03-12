package com.accp.service.kl;

import com.accp.domain.Priabill;
import com.accp.domain.Priadetails;
import com.accp.domain.Supplier;
import com.accp.mapper.PriabillMapper;
import com.accp.mapper.PriadetailsMapper;
import com.accp.mapper.SupplierMapper;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class priabillService {
    @Autowired
    PriabillMapper PriabillMapper;//预付款主表
    @Autowired
    PriadetailsMapper PriadetailsMapper;//预付款从表
    @Autowired
    SupplierMapper SupplierMapper;//供应商
    //新增预付款
    public boolean insertByPriabill(Priabill Priabill){
        Priabill.setPriabillYn("0");
        int num = this.PriabillMapper.insert(Priabill);
        float sum = 0;
        if(num>=1){
            for (Priadetails details:Priabill.getPriadetails_list()) {
                details.setPriabillId(Priabill.getPriabillId());
                num = this.PriadetailsMapper.insert(details);
            }
            return  true;
        }
        return  false;
    }
    //查询预付款
    public PageInfo queryByPriabill(Integer pageSize, Integer pageNum){
        PageHelper.startPage(pageNum,pageSize);
        List<Priabill> Priabill = this.PriabillMapper.queryByTime();
        Priabill.get(0).setPriadetails_list(this.PriadetailsMapper.queryByPriabillId(Priabill.get(0).getPriabillId()));
        PageInfo PageInfo = new PageInfo(Priabill);
        return PageInfo;
    }
    //修改预付款
    public boolean updateByPriabill(Priabill Priabill){
        this.PriabillMapper.updateByPrimaryKey(Priabill);
        for (Priadetails details:Priabill.getPriadetails_list()) {
            int num =this.PriadetailsMapper.deleteByPrimaryKey(details.getPriadetailsId().toString());
            details.setPriabillId(Priabill.getPriabillId());
            this.PriadetailsMapper.insert(details);
            System.out.println(JSON.toJSONString(details));
            System.out.println(num);
        }
        return true;
    }
    //删除预付款
    public boolean deleteByPriabill(Priabill Priabill){
        Priabill.setPriabillYn("1");
        int num =  this.PriabillMapper.updateByPrimaryKey(Priabill);
        if(num>0){
            return true;
        }
        return false;
    }
    //审核预收款
    public boolean priabillAudit(Priabill Priabill){
        this.PriabillMapper.updateByPrimaryKey(Priabill);
        float sum = 0;
        for (Priadetails details:Priabill.getPriadetails_list()) {
            int num =this.PriadetailsMapper.deleteByPrimaryKey(details.getPriadetailsId().toString());
            details.setPriabillId(Priabill.getPriabillId());
            this.PriadetailsMapper.insert(details);
            sum+=details.getPriabillPrice();
            System.out.println(JSON.toJSONString(details));
            System.out.println(num);
        }
        Supplier Supplier = this.SupplierMapper.selectByPrimaryKey(Priabill.getSupplierId());
        if(Priabill.getPriabillAuditstatus()==1){
            System.out.println(sum+"：修改金额");
            System.out.println(Supplier.getSupplierResiduemonet());
            System.out.println(Supplier.getSupplierCuendcollect());
            Supplier.setSupplierResiduemonet(sum+Supplier.getSupplierResiduemonet());
            Supplier.setSupplierCuendcollect(sum+Supplier.getSupplierCuendcollect());
        }else{
            Supplier.setSupplierResiduemonet(Supplier.getSupplierResiduemonet()-sum);
            Supplier.setSupplierCuendcollect(Supplier.getSupplierCuendcollect()-sum);
        }
        this.SupplierMapper.update(Supplier);
        return true;
    }
    /*产生新的详表Id*/
    public int geteBillno(){
       int num =  this.PriadetailsMapper.getBillno();
       num++;
        System.out.println(num);
       return num;
    }
    /*载入预收*/
    public List<Priabill> queryByPriadetails(String supplierId){
        List<Priabill> Priabill = this.PriabillMapper.queryBySupplierId(supplierId);
        for (com.accp.domain.Priabill priabill:Priabill){
            priabill.setPriadetails_list(this.PriadetailsMapper.queryByPriabillIdToBlance(priabill.getPriabillId()));
        }
        return Priabill;
    }
}
