package com.accp.domain;

public class DetailedStatement_son {
    /*单据号码*/
    private String documentNumber;
    /*单别*/
    private  String singleStatus;
    /*期初余额*/
    /*期初预付款*/
    private String InitialAdvance;
    /*期初本币预付款*/
    private String InitialAdvanceInLocalCurrency;
    /*期初应付款*/
    private  String firstDue;
    /*期初本币应付款*/
    private  String InitialLocalCurrencyPayables;
    /*期末余额*/
    /*期末预付款*/
    private  String finalAdvance;
    /*期末本币预付款*/
    private String EndingAdvanceInLocalCurrency;
    /*期末应付款*/
    private  String finalPayables;
    /*期末本币应付款*/
    private String PayableInEndingLocalCurrency;

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getSingleStatus() {
        return singleStatus;
    }

    public void setSingleStatus(String singleStatus) {
        this.singleStatus = singleStatus;
    }

    public String getInitialAdvance() {
        return InitialAdvance;
    }

    public void setInitialAdvance(String initialAdvance) {
        InitialAdvance = initialAdvance;
    }

    public String getInitialAdvanceInLocalCurrency() {
        return InitialAdvanceInLocalCurrency;
    }

    public void setInitialAdvanceInLocalCurrency(String initialAdvanceInLocalCurrency) {
        InitialAdvanceInLocalCurrency = initialAdvanceInLocalCurrency;
    }

    public String getFirstDue() {
        return firstDue;
    }

    public void setFirstDue(String firstDue) {
        this.firstDue = firstDue;
    }

    public String getInitialLocalCurrencyPayables() {
        return InitialLocalCurrencyPayables;
    }

    public void setInitialLocalCurrencyPayables(String initialLocalCurrencyPayables) {
        InitialLocalCurrencyPayables = initialLocalCurrencyPayables;
    }

    public String getFinalAdvance() {
        return finalAdvance;
    }

    public void setFinalAdvance(String finalAdvance) {
        this.finalAdvance = finalAdvance;
    }

    public String getEndingAdvanceInLocalCurrency() {
        return EndingAdvanceInLocalCurrency;
    }

    public void setEndingAdvanceInLocalCurrency(String endingAdvanceInLocalCurrency) {
        EndingAdvanceInLocalCurrency = endingAdvanceInLocalCurrency;
    }

    public String getFinalPayables() {
        return finalPayables;
    }

    public void setFinalPayables(String finalPayables) {
        this.finalPayables = finalPayables;
    }

    public String getPayableInEndingLocalCurrency() {
        return PayableInEndingLocalCurrency;
    }

    public void setPayableInEndingLocalCurrency(String payableInEndingLocalCurrency) {
        PayableInEndingLocalCurrency = payableInEndingLocalCurrency;
    }
}
