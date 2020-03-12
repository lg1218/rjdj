package com.accp.domain;

import java.util.Date;

public class PurchaseStorageDetailed {
    private String psdId;

    private String psId;

    private String matterId;

    private String psdEngname;

    private String psdRemark;

    private String psdPriceIncludeTax;

    private Integer psdSingleStatus;

    private Date psdDocumentDate;

    private String psdDocumentNumber;

    private Float psdPrice;

    private Float psdMoney;

    private Float psdTaxRate;

    private Float psdTaxAmount;

    private Float psdIncludingTaxAmount;

    private String psdBatchNumber;

    private String psdIfgift;

    private String psdInvoiceDetails;

    private String psdRemarks;

    private String psdSourceOrder;

    private String psdSourceNo;

    private String psdAuditing;

    private String psdYn;

    private String psdCustom1;

    private String psdCustom2;

    private String psdCustom3;

    private String psdCustom4;

    private String psdCustom5;

    private String psdCustom6;

    public String getPsdId() {
        return psdId;
    }

    public void setPsdId(String psdId) {
        this.psdId = psdId;
    }

    public String getPsId() {
        return psId;
    }

    public void setPsId(String psId) {
        this.psId = psId;
    }

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId;
    }

    public String getPsdEngname() {
        return psdEngname;
    }

    public void setPsdEngname(String psdEngname) {
        this.psdEngname = psdEngname;
    }

    public String getPsdRemark() {
        return psdRemark;
    }

    public void setPsdRemark(String psdRemark) {
        this.psdRemark = psdRemark;
    }

    public String getPsdPriceIncludeTax() {
        return psdPriceIncludeTax;
    }

    public void setPsdPriceIncludeTax(String psdPriceIncludeTax) {
        this.psdPriceIncludeTax = psdPriceIncludeTax;
    }

    public Integer getPsdSingleStatus() {
        return psdSingleStatus;
    }

    public void setPsdSingleStatus(Integer psdSingleStatus) {
        this.psdSingleStatus = psdSingleStatus;
    }

    public Date getPsdDocumentDate() {
        return psdDocumentDate;
    }

    public void setPsdDocumentDate(Date psdDocumentDate) {
        this.psdDocumentDate = psdDocumentDate;
    }

    public String getPsdDocumentNumber() {
        return psdDocumentNumber;
    }

    public void setPsdDocumentNumber(String psdDocumentNumber) {
        this.psdDocumentNumber = psdDocumentNumber;
    }

    public Float getPsdPrice() {
        return psdPrice;
    }

    public void setPsdPrice(Float psdPrice) {
        this.psdPrice = psdPrice;
    }

    public Float getPsdMoney() {
        return psdMoney;
    }

    public void setPsdMoney(Float psdMoney) {
        this.psdMoney = psdMoney;
    }

    public Float getPsdTaxRate() {
        return psdTaxRate;
    }

    public void setPsdTaxRate(Float psdTaxRate) {
        this.psdTaxRate = psdTaxRate;
    }

    public Float getPsdTaxAmount() {
        return psdTaxAmount;
    }

    public void setPsdTaxAmount(Float psdTaxAmount) {
        this.psdTaxAmount = psdTaxAmount;
    }

    public Float getPsdIncludingTaxAmount() {
        return psdIncludingTaxAmount;
    }

    public void setPsdIncludingTaxAmount(Float psdIncludingTaxAmount) {
        this.psdIncludingTaxAmount = psdIncludingTaxAmount;
    }

    public String getPsdBatchNumber() {
        return psdBatchNumber;
    }

    public void setPsdBatchNumber(String psdBatchNumber) {
        this.psdBatchNumber = psdBatchNumber;
    }

    public String getPsdIfgift() {
        return psdIfgift;
    }

    public void setPsdIfgift(String psdIfgift) {
        this.psdIfgift = psdIfgift;
    }

    public String getPsdInvoiceDetails() {
        return psdInvoiceDetails;
    }

    public void setPsdInvoiceDetails(String psdInvoiceDetails) {
        this.psdInvoiceDetails = psdInvoiceDetails;
    }

    public String getPsdRemarks() {
        return psdRemarks;
    }

    public void setPsdRemarks(String psdRemarks) {
        this.psdRemarks = psdRemarks;
    }

    public String getPsdSourceOrder() {
        return psdSourceOrder;
    }

    public void setPsdSourceOrder(String psdSourceOrder) {
        this.psdSourceOrder = psdSourceOrder;
    }

    public String getPsdSourceNo() {
        return psdSourceNo;
    }

    public void setPsdSourceNo(String psdSourceNo) {
        this.psdSourceNo = psdSourceNo;
    }

    public String getPsdAuditing() {
        return psdAuditing;
    }

    public void setPsdAuditing(String psdAuditing) {
        this.psdAuditing = psdAuditing;
    }

    public String getPsdYn() {
        return psdYn;
    }

    public void setPsdYn(String psdYn) {
        this.psdYn = psdYn;
    }

    public String getPsdCustom1() {
        return psdCustom1;
    }

    public void setPsdCustom1(String psdCustom1) {
        this.psdCustom1 = psdCustom1;
    }

    public String getPsdCustom2() {
        return psdCustom2;
    }

    public void setPsdCustom2(String psdCustom2) {
        this.psdCustom2 = psdCustom2;
    }

    public String getPsdCustom3() {
        return psdCustom3;
    }

    public void setPsdCustom3(String psdCustom3) {
        this.psdCustom3 = psdCustom3;
    }

    public String getPsdCustom4() {
        return psdCustom4;
    }

    public void setPsdCustom4(String psdCustom4) {
        this.psdCustom4 = psdCustom4;
    }

    public String getPsdCustom5() {
        return psdCustom5;
    }

    public void setPsdCustom5(String psdCustom5) {
        this.psdCustom5 = psdCustom5;
    }

    public String getPsdCustom6() {
        return psdCustom6;
    }

    public void setPsdCustom6(String psdCustom6) {
        this.psdCustom6 = psdCustom6;
    }


    private Matter Matter; //一对一的物料


}