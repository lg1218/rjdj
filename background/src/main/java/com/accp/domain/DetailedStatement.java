package com.accp.domain;

import java.util.List;

public class DetailedStatement {
    /*供应商编号*/
    private String supplierId;
    /*供应商名称*/
    private String supplierName;
    /*币别Id*/
    private String currencyId;
    /*币别*/
    private  String currencyName;

    /*数据子集*/
    private List<DetailedStatement_son> DetailedStatement_son;
    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public List<com.accp.domain.DetailedStatement_son> getDetailedStatement_son() {
        return DetailedStatement_son;
    }

    public void setDetailedStatement_son(List<com.accp.domain.DetailedStatement_son> detailedStatement_son) {
        DetailedStatement_son = detailedStatement_son;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }


}
