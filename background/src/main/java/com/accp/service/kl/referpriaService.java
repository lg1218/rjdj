package com.accp.service.kl;

import com.accp.domain.*;
import com.accp.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class referpriaService {
    @Autowired
    ReferreceMapper ReferreceMapper;//取用预付明细
    @Autowired
    PayablesMapper PayablesMapper;//应付冲款
    @Autowired
    Payables_detailMapper Payables_detailMapper;//应付冲款单详表
    @Autowired
    PriabillMapper PriabillMapper;
    @Autowired
    PriadetailsMapper PriadetailsMapper;
  /*  //新增应付冲款
    public boolean insertToPayables(Payables Payables){
        int num = this.PayablesMapper.insert(Payables);
        for (Payables_detail detals:Payables.getPayables_detailList()){
            num = this.Payables_detailMapper.insert(detals);
        }
        return true;
    }*/
    //新增取用预付款
    public boolean insert(Priabill Priabill){
        int num = this.PriabillMapper.insert(Priabill);
        for (Priadetails detals:Priabill.getPriadetails_list()){
            num = this.PriadetailsMapper.insert(detals);
        }
        return true;
    }
    //修改取用预付款
    public boolean update(Priabill Priabill){
        int num = this.PriabillMapper.updateByPrimaryKey(Priabill);
        for (Priadetails detals:Priabill.getPriadetails_list()){
            num = this.PriadetailsMapper.updateByPrimaryKey(detals);
        }
        return true;
    }
}
