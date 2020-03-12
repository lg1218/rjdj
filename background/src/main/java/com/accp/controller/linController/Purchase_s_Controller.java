package com.accp.controller.linController;

import com.accp.domain.PurchaseRequisitionDetailed;
import com.accp.domain.PurchaseStorage;
import com.accp.service.linService.Purchase_s_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2020-02-12   23:14
 * 采购入库的访问地址
 */
@RestController
public class Purchase_s_Controller {
    @Autowired
    Purchase_s_Service prds;//导入采购入库的业务

    @GetMapping("/getqueryNearFisrt")
    public PurchaseStorage queryNearFisrt(){
        return prds.queryNearFisrt();
    }
}
