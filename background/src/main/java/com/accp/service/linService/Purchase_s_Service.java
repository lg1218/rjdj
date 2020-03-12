package com.accp.service.linService;

import com.accp.domain.*;
import com.accp.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @date 2020-02-12   23:08
 * 采购入库业务
 */
@Service
@Transactional
public class Purchase_s_Service {

    @Autowired
    PurchaseStorageMapper psm;  // 入库主表的数据层
    @Autowired
    SupplierMapper supplierMapper; // 供应商的数据层
    @Autowired
    PurchaseStorageTypeMapper purchaseStorageTypeMapper; // 采购类型的数据层
    @Autowired
    WarehouseMapper warehouseMapper; //仓库的数据层
    @Autowired
    CurrencyMapper currencyMapper; // 币别的数据层
    @Autowired
    PurchaseStorageDetailedMapper purchaseStorageDetailedMapper; //入库详表的数据层


    /**
     * 入库进去的的查询(查询最近新增修改的一条)
     */
    public PurchaseStorage queryNearFisrt(){
        /*
            1. 先得到最近一个的采购入库id (日期最大)
            2. 根据这个id 去查询里面绑定的内容的值
            3. 重新给采购入库主表里面的关联属性赋值
            4. 返回
         */
        int psid = psm.selectMaxpsId();
        PurchaseStorage psObject = psm.selectByPrimaryKey(psid+"");
        // 1 end
        psObject.setSupplier(supplierMapper.selectByPrimaryKey(psObject.getSupplierId())); //供应商
        psObject.setPurchaseStorageType(purchaseStorageTypeMapper.selectByPrimaryKey(psObject.getPstId()));  //采购类型
        psObject.setWarehouse(warehouseMapper.selectByPrimaryKey(psObject.getWarehouseId()+""));  //仓库
        psObject.setCurrency(currencyMapper.selectByPrimaryKey(psObject.getCurrencyId())); // 币别
        PurchaseStorageDetailedExample psde = new PurchaseStorageDetailedExample(); //查询详表
        psde.createCriteria().andPsIdEqualTo(psObject.getPstId());
        psObject.setPurchaseStorageDetaileds(purchaseStorageDetailedMapper.selectByExample(psde));
        // 2 3 end
        return psObject;
        // 4 end
    }
}
