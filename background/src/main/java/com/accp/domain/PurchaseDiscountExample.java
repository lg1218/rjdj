package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseDiscountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseDiscountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPdIdIsNull() {
            addCriterion("pd_id is null");
            return (Criteria) this;
        }

        public Criteria andPdIdIsNotNull() {
            addCriterion("pd_id is not null");
            return (Criteria) this;
        }

        public Criteria andPdIdEqualTo(String value) {
            addCriterion("pd_id =", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdNotEqualTo(String value) {
            addCriterion("pd_id <>", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdGreaterThan(String value) {
            addCriterion("pd_id >", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdGreaterThanOrEqualTo(String value) {
            addCriterion("pd_id >=", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdLessThan(String value) {
            addCriterion("pd_id <", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdLessThanOrEqualTo(String value) {
            addCriterion("pd_id <=", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdLike(String value) {
            addCriterion("pd_id like", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdNotLike(String value) {
            addCriterion("pd_id not like", value, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdIn(List<String> values) {
            addCriterion("pd_id in", values, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdNotIn(List<String> values) {
            addCriterion("pd_id not in", values, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdBetween(String value1, String value2) {
            addCriterion("pd_id between", value1, value2, "pdId");
            return (Criteria) this;
        }

        public Criteria andPdIdNotBetween(String value1, String value2) {
            addCriterion("pd_id not between", value1, value2, "pdId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("supplier_id like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("supplier_id not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andPdAttributionOfAccountIsNull() {
            addCriterion("pd_attribution_of_account is null");
            return (Criteria) this;
        }

        public Criteria andPdAttributionOfAccountIsNotNull() {
            addCriterion("pd_attribution_of_account is not null");
            return (Criteria) this;
        }

        public Criteria andPdAttributionOfAccountEqualTo(String value) {
            addCriterion("pd_attribution_of_account =", value, "pdAttributionOfAccount");
            return (Criteria) this;
        }

        public Criteria andPdAttributionOfAccountNotEqualTo(String value) {
            addCriterion("pd_attribution_of_account <>", value, "pdAttributionOfAccount");
            return (Criteria) this;
        }

        public Criteria andPdAttributionOfAccountGreaterThan(String value) {
            addCriterion("pd_attribution_of_account >", value, "pdAttributionOfAccount");
            return (Criteria) this;
        }

        public Criteria andPdAttributionOfAccountGreaterThanOrEqualTo(String value) {
            addCriterion("pd_attribution_of_account >=", value, "pdAttributionOfAccount");
            return (Criteria) this;
        }

        public Criteria andPdAttributionOfAccountLessThan(String value) {
            addCriterion("pd_attribution_of_account <", value, "pdAttributionOfAccount");
            return (Criteria) this;
        }

        public Criteria andPdAttributionOfAccountLessThanOrEqualTo(String value) {
            addCriterion("pd_attribution_of_account <=", value, "pdAttributionOfAccount");
            return (Criteria) this;
        }

        public Criteria andPdAttributionOfAccountLike(String value) {
            addCriterion("pd_attribution_of_account like", value, "pdAttributionOfAccount");
            return (Criteria) this;
        }

        public Criteria andPdAttributionOfAccountNotLike(String value) {
            addCriterion("pd_attribution_of_account not like", value, "pdAttributionOfAccount");
            return (Criteria) this;
        }

        public Criteria andPdAttributionOfAccountIn(List<String> values) {
            addCriterion("pd_attribution_of_account in", values, "pdAttributionOfAccount");
            return (Criteria) this;
        }

        public Criteria andPdAttributionOfAccountNotIn(List<String> values) {
            addCriterion("pd_attribution_of_account not in", values, "pdAttributionOfAccount");
            return (Criteria) this;
        }

        public Criteria andPdAttributionOfAccountBetween(String value1, String value2) {
            addCriterion("pd_attribution_of_account between", value1, value2, "pdAttributionOfAccount");
            return (Criteria) this;
        }

        public Criteria andPdAttributionOfAccountNotBetween(String value1, String value2) {
            addCriterion("pd_attribution_of_account not between", value1, value2, "pdAttributionOfAccount");
            return (Criteria) this;
        }

        public Criteria andPdAccountsMonthIsNull() {
            addCriterion("pd_accounts_month is null");
            return (Criteria) this;
        }

        public Criteria andPdAccountsMonthIsNotNull() {
            addCriterion("pd_accounts_month is not null");
            return (Criteria) this;
        }

        public Criteria andPdAccountsMonthEqualTo(Date value) {
            addCriterionForJDBCDate("pd_accounts_month =", value, "pdAccountsMonth");
            return (Criteria) this;
        }

        public Criteria andPdAccountsMonthNotEqualTo(Date value) {
            addCriterionForJDBCDate("pd_accounts_month <>", value, "pdAccountsMonth");
            return (Criteria) this;
        }

        public Criteria andPdAccountsMonthGreaterThan(Date value) {
            addCriterionForJDBCDate("pd_accounts_month >", value, "pdAccountsMonth");
            return (Criteria) this;
        }

        public Criteria andPdAccountsMonthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pd_accounts_month >=", value, "pdAccountsMonth");
            return (Criteria) this;
        }

        public Criteria andPdAccountsMonthLessThan(Date value) {
            addCriterionForJDBCDate("pd_accounts_month <", value, "pdAccountsMonth");
            return (Criteria) this;
        }

        public Criteria andPdAccountsMonthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pd_accounts_month <=", value, "pdAccountsMonth");
            return (Criteria) this;
        }

        public Criteria andPdAccountsMonthIn(List<Date> values) {
            addCriterionForJDBCDate("pd_accounts_month in", values, "pdAccountsMonth");
            return (Criteria) this;
        }

        public Criteria andPdAccountsMonthNotIn(List<Date> values) {
            addCriterionForJDBCDate("pd_accounts_month not in", values, "pdAccountsMonth");
            return (Criteria) this;
        }

        public Criteria andPdAccountsMonthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pd_accounts_month between", value1, value2, "pdAccountsMonth");
            return (Criteria) this;
        }

        public Criteria andPdAccountsMonthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pd_accounts_month not between", value1, value2, "pdAccountsMonth");
            return (Criteria) this;
        }

        public Criteria andPdSupplierAddressIsNull() {
            addCriterion("pd_supplier_address is null");
            return (Criteria) this;
        }

        public Criteria andPdSupplierAddressIsNotNull() {
            addCriterion("pd_supplier_address is not null");
            return (Criteria) this;
        }

        public Criteria andPdSupplierAddressEqualTo(String value) {
            addCriterion("pd_supplier_address =", value, "pdSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPdSupplierAddressNotEqualTo(String value) {
            addCriterion("pd_supplier_address <>", value, "pdSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPdSupplierAddressGreaterThan(String value) {
            addCriterion("pd_supplier_address >", value, "pdSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPdSupplierAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pd_supplier_address >=", value, "pdSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPdSupplierAddressLessThan(String value) {
            addCriterion("pd_supplier_address <", value, "pdSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPdSupplierAddressLessThanOrEqualTo(String value) {
            addCriterion("pd_supplier_address <=", value, "pdSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPdSupplierAddressLike(String value) {
            addCriterion("pd_supplier_address like", value, "pdSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPdSupplierAddressNotLike(String value) {
            addCriterion("pd_supplier_address not like", value, "pdSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPdSupplierAddressIn(List<String> values) {
            addCriterion("pd_supplier_address in", values, "pdSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPdSupplierAddressNotIn(List<String> values) {
            addCriterion("pd_supplier_address not in", values, "pdSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPdSupplierAddressBetween(String value1, String value2) {
            addCriterion("pd_supplier_address between", value1, value2, "pdSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPdSupplierAddressNotBetween(String value1, String value2) {
            addCriterion("pd_supplier_address not between", value1, value2, "pdSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPsIdIsNull() {
            addCriterion("ps_id is null");
            return (Criteria) this;
        }

        public Criteria andPsIdIsNotNull() {
            addCriterion("ps_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsIdEqualTo(String value) {
            addCriterion("ps_id =", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotEqualTo(String value) {
            addCriterion("ps_id <>", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThan(String value) {
            addCriterion("ps_id >", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThanOrEqualTo(String value) {
            addCriterion("ps_id >=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThan(String value) {
            addCriterion("ps_id <", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThanOrEqualTo(String value) {
            addCriterion("ps_id <=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLike(String value) {
            addCriterion("ps_id like", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotLike(String value) {
            addCriterion("ps_id not like", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdIn(List<String> values) {
            addCriterion("ps_id in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotIn(List<String> values) {
            addCriterion("ps_id not in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdBetween(String value1, String value2) {
            addCriterion("ps_id between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotBetween(String value1, String value2) {
            addCriterion("ps_id not between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(String value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(String value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(String value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(String value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(String value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLike(String value) {
            addCriterion("warehouse_id like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotLike(String value) {
            addCriterion("warehouse_id not like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<String> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<String> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(String value1, String value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(String value1, String value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andPdDocumentDateIsNull() {
            addCriterion("pd_document_date is null");
            return (Criteria) this;
        }

        public Criteria andPdDocumentDateIsNotNull() {
            addCriterion("pd_document_date is not null");
            return (Criteria) this;
        }

        public Criteria andPdDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("pd_document_date =", value, "pdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPdDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pd_document_date <>", value, "pdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPdDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pd_document_date >", value, "pdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPdDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pd_document_date >=", value, "pdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPdDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("pd_document_date <", value, "pdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPdDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pd_document_date <=", value, "pdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPdDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("pd_document_date in", values, "pdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPdDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pd_document_date not in", values, "pdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPdDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pd_document_date between", value1, value2, "pdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPdDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pd_document_date not between", value1, value2, "pdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPdDocumentNumberIsNull() {
            addCriterion("pd_document_number is null");
            return (Criteria) this;
        }

        public Criteria andPdDocumentNumberIsNotNull() {
            addCriterion("pd_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andPdDocumentNumberEqualTo(String value) {
            addCriterion("pd_document_number =", value, "pdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPdDocumentNumberNotEqualTo(String value) {
            addCriterion("pd_document_number <>", value, "pdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPdDocumentNumberGreaterThan(String value) {
            addCriterion("pd_document_number >", value, "pdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPdDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pd_document_number >=", value, "pdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPdDocumentNumberLessThan(String value) {
            addCriterion("pd_document_number <", value, "pdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPdDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("pd_document_number <=", value, "pdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPdDocumentNumberLike(String value) {
            addCriterion("pd_document_number like", value, "pdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPdDocumentNumberNotLike(String value) {
            addCriterion("pd_document_number not like", value, "pdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPdDocumentNumberIn(List<String> values) {
            addCriterion("pd_document_number in", values, "pdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPdDocumentNumberNotIn(List<String> values) {
            addCriterion("pd_document_number not in", values, "pdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPdDocumentNumberBetween(String value1, String value2) {
            addCriterion("pd_document_number between", value1, value2, "pdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPdDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("pd_document_number not between", value1, value2, "pdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNull() {
            addCriterion("currency_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNotNull() {
            addCriterion("currency_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdEqualTo(String value) {
            addCriterion("currency_id =", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotEqualTo(String value) {
            addCriterion("currency_id <>", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThan(String value) {
            addCriterion("currency_id >", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("currency_id >=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThan(String value) {
            addCriterion("currency_id <", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThanOrEqualTo(String value) {
            addCriterion("currency_id <=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLike(String value) {
            addCriterion("currency_id like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotLike(String value) {
            addCriterion("currency_id not like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIn(List<String> values) {
            addCriterion("currency_id in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotIn(List<String> values) {
            addCriterion("currency_id not in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdBetween(String value1, String value2) {
            addCriterion("currency_id between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotBetween(String value1, String value2) {
            addCriterion("currency_id not between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andPdExchangeRateIsNull() {
            addCriterion("pd_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andPdExchangeRateIsNotNull() {
            addCriterion("pd_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPdExchangeRateEqualTo(Float value) {
            addCriterion("pd_exchange_rate =", value, "pdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPdExchangeRateNotEqualTo(Float value) {
            addCriterion("pd_exchange_rate <>", value, "pdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPdExchangeRateGreaterThan(Float value) {
            addCriterion("pd_exchange_rate >", value, "pdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPdExchangeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("pd_exchange_rate >=", value, "pdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPdExchangeRateLessThan(Float value) {
            addCriterion("pd_exchange_rate <", value, "pdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPdExchangeRateLessThanOrEqualTo(Float value) {
            addCriterion("pd_exchange_rate <=", value, "pdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPdExchangeRateIn(List<Float> values) {
            addCriterion("pd_exchange_rate in", values, "pdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPdExchangeRateNotIn(List<Float> values) {
            addCriterion("pd_exchange_rate not in", values, "pdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPdExchangeRateBetween(Float value1, Float value2) {
            addCriterion("pd_exchange_rate between", value1, value2, "pdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPdExchangeRateNotBetween(Float value1, Float value2) {
            addCriterion("pd_exchange_rate not between", value1, value2, "pdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPdSingleStatusIsNull() {
            addCriterion("pd_single_status is null");
            return (Criteria) this;
        }

        public Criteria andPdSingleStatusIsNotNull() {
            addCriterion("pd_single_status is not null");
            return (Criteria) this;
        }

        public Criteria andPdSingleStatusEqualTo(String value) {
            addCriterion("pd_single_status =", value, "pdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPdSingleStatusNotEqualTo(String value) {
            addCriterion("pd_single_status <>", value, "pdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPdSingleStatusGreaterThan(String value) {
            addCriterion("pd_single_status >", value, "pdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPdSingleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pd_single_status >=", value, "pdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPdSingleStatusLessThan(String value) {
            addCriterion("pd_single_status <", value, "pdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPdSingleStatusLessThanOrEqualTo(String value) {
            addCriterion("pd_single_status <=", value, "pdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPdSingleStatusLike(String value) {
            addCriterion("pd_single_status like", value, "pdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPdSingleStatusNotLike(String value) {
            addCriterion("pd_single_status not like", value, "pdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPdSingleStatusIn(List<String> values) {
            addCriterion("pd_single_status in", values, "pdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPdSingleStatusNotIn(List<String> values) {
            addCriterion("pd_single_status not in", values, "pdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPdSingleStatusBetween(String value1, String value2) {
            addCriterion("pd_single_status between", value1, value2, "pdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPdSingleStatusNotBetween(String value1, String value2) {
            addCriterion("pd_single_status not between", value1, value2, "pdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPdSunnumIsNull() {
            addCriterion("pd_sunnum is null");
            return (Criteria) this;
        }

        public Criteria andPdSunnumIsNotNull() {
            addCriterion("pd_sunnum is not null");
            return (Criteria) this;
        }

        public Criteria andPdSunnumEqualTo(Integer value) {
            addCriterion("pd_sunnum =", value, "pdSunnum");
            return (Criteria) this;
        }

        public Criteria andPdSunnumNotEqualTo(Integer value) {
            addCriterion("pd_sunnum <>", value, "pdSunnum");
            return (Criteria) this;
        }

        public Criteria andPdSunnumGreaterThan(Integer value) {
            addCriterion("pd_sunnum >", value, "pdSunnum");
            return (Criteria) this;
        }

        public Criteria andPdSunnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pd_sunnum >=", value, "pdSunnum");
            return (Criteria) this;
        }

        public Criteria andPdSunnumLessThan(Integer value) {
            addCriterion("pd_sunnum <", value, "pdSunnum");
            return (Criteria) this;
        }

        public Criteria andPdSunnumLessThanOrEqualTo(Integer value) {
            addCriterion("pd_sunnum <=", value, "pdSunnum");
            return (Criteria) this;
        }

        public Criteria andPdSunnumIn(List<Integer> values) {
            addCriterion("pd_sunnum in", values, "pdSunnum");
            return (Criteria) this;
        }

        public Criteria andPdSunnumNotIn(List<Integer> values) {
            addCriterion("pd_sunnum not in", values, "pdSunnum");
            return (Criteria) this;
        }

        public Criteria andPdSunnumBetween(Integer value1, Integer value2) {
            addCriterion("pd_sunnum between", value1, value2, "pdSunnum");
            return (Criteria) this;
        }

        public Criteria andPdSunnumNotBetween(Integer value1, Integer value2) {
            addCriterion("pd_sunnum not between", value1, value2, "pdSunnum");
            return (Criteria) this;
        }

        public Criteria andPdSunmoneyIsNull() {
            addCriterion("pd_sunmoney is null");
            return (Criteria) this;
        }

        public Criteria andPdSunmoneyIsNotNull() {
            addCriterion("pd_sunmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPdSunmoneyEqualTo(Float value) {
            addCriterion("pd_sunmoney =", value, "pdSunmoney");
            return (Criteria) this;
        }

        public Criteria andPdSunmoneyNotEqualTo(Float value) {
            addCriterion("pd_sunmoney <>", value, "pdSunmoney");
            return (Criteria) this;
        }

        public Criteria andPdSunmoneyGreaterThan(Float value) {
            addCriterion("pd_sunmoney >", value, "pdSunmoney");
            return (Criteria) this;
        }

        public Criteria andPdSunmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("pd_sunmoney >=", value, "pdSunmoney");
            return (Criteria) this;
        }

        public Criteria andPdSunmoneyLessThan(Float value) {
            addCriterion("pd_sunmoney <", value, "pdSunmoney");
            return (Criteria) this;
        }

        public Criteria andPdSunmoneyLessThanOrEqualTo(Float value) {
            addCriterion("pd_sunmoney <=", value, "pdSunmoney");
            return (Criteria) this;
        }

        public Criteria andPdSunmoneyIn(List<Float> values) {
            addCriterion("pd_sunmoney in", values, "pdSunmoney");
            return (Criteria) this;
        }

        public Criteria andPdSunmoneyNotIn(List<Float> values) {
            addCriterion("pd_sunmoney not in", values, "pdSunmoney");
            return (Criteria) this;
        }

        public Criteria andPdSunmoneyBetween(Float value1, Float value2) {
            addCriterion("pd_sunmoney between", value1, value2, "pdSunmoney");
            return (Criteria) this;
        }

        public Criteria andPdSunmoneyNotBetween(Float value1, Float value2) {
            addCriterion("pd_sunmoney not between", value1, value2, "pdSunmoney");
            return (Criteria) this;
        }

        public Criteria andPdTaxIsNull() {
            addCriterion("pd_tax is null");
            return (Criteria) this;
        }

        public Criteria andPdTaxIsNotNull() {
            addCriterion("pd_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPdTaxEqualTo(Float value) {
            addCriterion("pd_tax =", value, "pdTax");
            return (Criteria) this;
        }

        public Criteria andPdTaxNotEqualTo(Float value) {
            addCriterion("pd_tax <>", value, "pdTax");
            return (Criteria) this;
        }

        public Criteria andPdTaxGreaterThan(Float value) {
            addCriterion("pd_tax >", value, "pdTax");
            return (Criteria) this;
        }

        public Criteria andPdTaxGreaterThanOrEqualTo(Float value) {
            addCriterion("pd_tax >=", value, "pdTax");
            return (Criteria) this;
        }

        public Criteria andPdTaxLessThan(Float value) {
            addCriterion("pd_tax <", value, "pdTax");
            return (Criteria) this;
        }

        public Criteria andPdTaxLessThanOrEqualTo(Float value) {
            addCriterion("pd_tax <=", value, "pdTax");
            return (Criteria) this;
        }

        public Criteria andPdTaxIn(List<Float> values) {
            addCriterion("pd_tax in", values, "pdTax");
            return (Criteria) this;
        }

        public Criteria andPdTaxNotIn(List<Float> values) {
            addCriterion("pd_tax not in", values, "pdTax");
            return (Criteria) this;
        }

        public Criteria andPdTaxBetween(Float value1, Float value2) {
            addCriterion("pd_tax between", value1, value2, "pdTax");
            return (Criteria) this;
        }

        public Criteria andPdTaxNotBetween(Float value1, Float value2) {
            addCriterion("pd_tax not between", value1, value2, "pdTax");
            return (Criteria) this;
        }

        public Criteria andPdIncludeTaxAmountIsNull() {
            addCriterion("pd_include_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andPdIncludeTaxAmountIsNotNull() {
            addCriterion("pd_include_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPdIncludeTaxAmountEqualTo(Float value) {
            addCriterion("pd_include_tax_amount =", value, "pdIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPdIncludeTaxAmountNotEqualTo(Float value) {
            addCriterion("pd_include_tax_amount <>", value, "pdIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPdIncludeTaxAmountGreaterThan(Float value) {
            addCriterion("pd_include_tax_amount >", value, "pdIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPdIncludeTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("pd_include_tax_amount >=", value, "pdIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPdIncludeTaxAmountLessThan(Float value) {
            addCriterion("pd_include_tax_amount <", value, "pdIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPdIncludeTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("pd_include_tax_amount <=", value, "pdIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPdIncludeTaxAmountIn(List<Float> values) {
            addCriterion("pd_include_tax_amount in", values, "pdIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPdIncludeTaxAmountNotIn(List<Float> values) {
            addCriterion("pd_include_tax_amount not in", values, "pdIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPdIncludeTaxAmountBetween(Float value1, Float value2) {
            addCriterion("pd_include_tax_amount between", value1, value2, "pdIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPdIncludeTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("pd_include_tax_amount not between", value1, value2, "pdIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPdDeliveryAddressIsNull() {
            addCriterion("pd_delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andPdDeliveryAddressIsNotNull() {
            addCriterion("pd_delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andPdDeliveryAddressEqualTo(String value) {
            addCriterion("pd_delivery_address =", value, "pdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPdDeliveryAddressNotEqualTo(String value) {
            addCriterion("pd_delivery_address <>", value, "pdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPdDeliveryAddressGreaterThan(String value) {
            addCriterion("pd_delivery_address >", value, "pdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPdDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pd_delivery_address >=", value, "pdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPdDeliveryAddressLessThan(String value) {
            addCriterion("pd_delivery_address <", value, "pdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPdDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("pd_delivery_address <=", value, "pdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPdDeliveryAddressLike(String value) {
            addCriterion("pd_delivery_address like", value, "pdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPdDeliveryAddressNotLike(String value) {
            addCriterion("pd_delivery_address not like", value, "pdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPdDeliveryAddressIn(List<String> values) {
            addCriterion("pd_delivery_address in", values, "pdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPdDeliveryAddressNotIn(List<String> values) {
            addCriterion("pd_delivery_address not in", values, "pdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPdDeliveryAddressBetween(String value1, String value2) {
            addCriterion("pd_delivery_address between", value1, value2, "pdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPdDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("pd_delivery_address not between", value1, value2, "pdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPdBuyerIsNull() {
            addCriterion("pd_buyer is null");
            return (Criteria) this;
        }

        public Criteria andPdBuyerIsNotNull() {
            addCriterion("pd_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andPdBuyerEqualTo(String value) {
            addCriterion("pd_buyer =", value, "pdBuyer");
            return (Criteria) this;
        }

        public Criteria andPdBuyerNotEqualTo(String value) {
            addCriterion("pd_buyer <>", value, "pdBuyer");
            return (Criteria) this;
        }

        public Criteria andPdBuyerGreaterThan(String value) {
            addCriterion("pd_buyer >", value, "pdBuyer");
            return (Criteria) this;
        }

        public Criteria andPdBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("pd_buyer >=", value, "pdBuyer");
            return (Criteria) this;
        }

        public Criteria andPdBuyerLessThan(String value) {
            addCriterion("pd_buyer <", value, "pdBuyer");
            return (Criteria) this;
        }

        public Criteria andPdBuyerLessThanOrEqualTo(String value) {
            addCriterion("pd_buyer <=", value, "pdBuyer");
            return (Criteria) this;
        }

        public Criteria andPdBuyerLike(String value) {
            addCriterion("pd_buyer like", value, "pdBuyer");
            return (Criteria) this;
        }

        public Criteria andPdBuyerNotLike(String value) {
            addCriterion("pd_buyer not like", value, "pdBuyer");
            return (Criteria) this;
        }

        public Criteria andPdBuyerIn(List<String> values) {
            addCriterion("pd_buyer in", values, "pdBuyer");
            return (Criteria) this;
        }

        public Criteria andPdBuyerNotIn(List<String> values) {
            addCriterion("pd_buyer not in", values, "pdBuyer");
            return (Criteria) this;
        }

        public Criteria andPdBuyerBetween(String value1, String value2) {
            addCriterion("pd_buyer between", value1, value2, "pdBuyer");
            return (Criteria) this;
        }

        public Criteria andPdBuyerNotBetween(String value1, String value2) {
            addCriterion("pd_buyer not between", value1, value2, "pdBuyer");
            return (Criteria) this;
        }

        public Criteria andPdBelongsSectionIsNull() {
            addCriterion("pd_belongs_section is null");
            return (Criteria) this;
        }

        public Criteria andPdBelongsSectionIsNotNull() {
            addCriterion("pd_belongs_section is not null");
            return (Criteria) this;
        }

        public Criteria andPdBelongsSectionEqualTo(String value) {
            addCriterion("pd_belongs_section =", value, "pdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPdBelongsSectionNotEqualTo(String value) {
            addCriterion("pd_belongs_section <>", value, "pdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPdBelongsSectionGreaterThan(String value) {
            addCriterion("pd_belongs_section >", value, "pdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPdBelongsSectionGreaterThanOrEqualTo(String value) {
            addCriterion("pd_belongs_section >=", value, "pdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPdBelongsSectionLessThan(String value) {
            addCriterion("pd_belongs_section <", value, "pdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPdBelongsSectionLessThanOrEqualTo(String value) {
            addCriterion("pd_belongs_section <=", value, "pdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPdBelongsSectionLike(String value) {
            addCriterion("pd_belongs_section like", value, "pdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPdBelongsSectionNotLike(String value) {
            addCriterion("pd_belongs_section not like", value, "pdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPdBelongsSectionIn(List<String> values) {
            addCriterion("pd_belongs_section in", values, "pdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPdBelongsSectionNotIn(List<String> values) {
            addCriterion("pd_belongs_section not in", values, "pdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPdBelongsSectionBetween(String value1, String value2) {
            addCriterion("pd_belongs_section between", value1, value2, "pdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPdBelongsSectionNotBetween(String value1, String value2) {
            addCriterion("pd_belongs_section not between", value1, value2, "pdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPdBelongsProjectIsNull() {
            addCriterion("pd_belongs_project is null");
            return (Criteria) this;
        }

        public Criteria andPdBelongsProjectIsNotNull() {
            addCriterion("pd_belongs_project is not null");
            return (Criteria) this;
        }

        public Criteria andPdBelongsProjectEqualTo(String value) {
            addCriterion("pd_belongs_project =", value, "pdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPdBelongsProjectNotEqualTo(String value) {
            addCriterion("pd_belongs_project <>", value, "pdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPdBelongsProjectGreaterThan(String value) {
            addCriterion("pd_belongs_project >", value, "pdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPdBelongsProjectGreaterThanOrEqualTo(String value) {
            addCriterion("pd_belongs_project >=", value, "pdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPdBelongsProjectLessThan(String value) {
            addCriterion("pd_belongs_project <", value, "pdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPdBelongsProjectLessThanOrEqualTo(String value) {
            addCriterion("pd_belongs_project <=", value, "pdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPdBelongsProjectLike(String value) {
            addCriterion("pd_belongs_project like", value, "pdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPdBelongsProjectNotLike(String value) {
            addCriterion("pd_belongs_project not like", value, "pdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPdBelongsProjectIn(List<String> values) {
            addCriterion("pd_belongs_project in", values, "pdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPdBelongsProjectNotIn(List<String> values) {
            addCriterion("pd_belongs_project not in", values, "pdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPdBelongsProjectBetween(String value1, String value2) {
            addCriterion("pd_belongs_project between", value1, value2, "pdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPdBelongsProjectNotBetween(String value1, String value2) {
            addCriterion("pd_belongs_project not between", value1, value2, "pdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPdExecutorIsNull() {
            addCriterion("pd_executor is null");
            return (Criteria) this;
        }

        public Criteria andPdExecutorIsNotNull() {
            addCriterion("pd_executor is not null");
            return (Criteria) this;
        }

        public Criteria andPdExecutorEqualTo(String value) {
            addCriterion("pd_executor =", value, "pdExecutor");
            return (Criteria) this;
        }

        public Criteria andPdExecutorNotEqualTo(String value) {
            addCriterion("pd_executor <>", value, "pdExecutor");
            return (Criteria) this;
        }

        public Criteria andPdExecutorGreaterThan(String value) {
            addCriterion("pd_executor >", value, "pdExecutor");
            return (Criteria) this;
        }

        public Criteria andPdExecutorGreaterThanOrEqualTo(String value) {
            addCriterion("pd_executor >=", value, "pdExecutor");
            return (Criteria) this;
        }

        public Criteria andPdExecutorLessThan(String value) {
            addCriterion("pd_executor <", value, "pdExecutor");
            return (Criteria) this;
        }

        public Criteria andPdExecutorLessThanOrEqualTo(String value) {
            addCriterion("pd_executor <=", value, "pdExecutor");
            return (Criteria) this;
        }

        public Criteria andPdExecutorLike(String value) {
            addCriterion("pd_executor like", value, "pdExecutor");
            return (Criteria) this;
        }

        public Criteria andPdExecutorNotLike(String value) {
            addCriterion("pd_executor not like", value, "pdExecutor");
            return (Criteria) this;
        }

        public Criteria andPdExecutorIn(List<String> values) {
            addCriterion("pd_executor in", values, "pdExecutor");
            return (Criteria) this;
        }

        public Criteria andPdExecutorNotIn(List<String> values) {
            addCriterion("pd_executor not in", values, "pdExecutor");
            return (Criteria) this;
        }

        public Criteria andPdExecutorBetween(String value1, String value2) {
            addCriterion("pd_executor between", value1, value2, "pdExecutor");
            return (Criteria) this;
        }

        public Criteria andPdExecutorNotBetween(String value1, String value2) {
            addCriterion("pd_executor not between", value1, value2, "pdExecutor");
            return (Criteria) this;
        }

        public Criteria andPdCheckagainStaffIsNull() {
            addCriterion("pd_checkagain_staff is null");
            return (Criteria) this;
        }

        public Criteria andPdCheckagainStaffIsNotNull() {
            addCriterion("pd_checkagain_staff is not null");
            return (Criteria) this;
        }

        public Criteria andPdCheckagainStaffEqualTo(String value) {
            addCriterion("pd_checkagain_staff =", value, "pdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPdCheckagainStaffNotEqualTo(String value) {
            addCriterion("pd_checkagain_staff <>", value, "pdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPdCheckagainStaffGreaterThan(String value) {
            addCriterion("pd_checkagain_staff >", value, "pdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPdCheckagainStaffGreaterThanOrEqualTo(String value) {
            addCriterion("pd_checkagain_staff >=", value, "pdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPdCheckagainStaffLessThan(String value) {
            addCriterion("pd_checkagain_staff <", value, "pdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPdCheckagainStaffLessThanOrEqualTo(String value) {
            addCriterion("pd_checkagain_staff <=", value, "pdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPdCheckagainStaffLike(String value) {
            addCriterion("pd_checkagain_staff like", value, "pdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPdCheckagainStaffNotLike(String value) {
            addCriterion("pd_checkagain_staff not like", value, "pdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPdCheckagainStaffIn(List<String> values) {
            addCriterion("pd_checkagain_staff in", values, "pdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPdCheckagainStaffNotIn(List<String> values) {
            addCriterion("pd_checkagain_staff not in", values, "pdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPdCheckagainStaffBetween(String value1, String value2) {
            addCriterion("pd_checkagain_staff between", value1, value2, "pdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPdCheckagainStaffNotBetween(String value1, String value2) {
            addCriterion("pd_checkagain_staff not between", value1, value2, "pdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPdHeaderProvisionIsNull() {
            addCriterion("pd_header_provision is null");
            return (Criteria) this;
        }

        public Criteria andPdHeaderProvisionIsNotNull() {
            addCriterion("pd_header_provision is not null");
            return (Criteria) this;
        }

        public Criteria andPdHeaderProvisionEqualTo(String value) {
            addCriterion("pd_header_provision =", value, "pdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPdHeaderProvisionNotEqualTo(String value) {
            addCriterion("pd_header_provision <>", value, "pdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPdHeaderProvisionGreaterThan(String value) {
            addCriterion("pd_header_provision >", value, "pdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPdHeaderProvisionGreaterThanOrEqualTo(String value) {
            addCriterion("pd_header_provision >=", value, "pdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPdHeaderProvisionLessThan(String value) {
            addCriterion("pd_header_provision <", value, "pdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPdHeaderProvisionLessThanOrEqualTo(String value) {
            addCriterion("pd_header_provision <=", value, "pdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPdHeaderProvisionLike(String value) {
            addCriterion("pd_header_provision like", value, "pdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPdHeaderProvisionNotLike(String value) {
            addCriterion("pd_header_provision not like", value, "pdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPdHeaderProvisionIn(List<String> values) {
            addCriterion("pd_header_provision in", values, "pdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPdHeaderProvisionNotIn(List<String> values) {
            addCriterion("pd_header_provision not in", values, "pdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPdHeaderProvisionBetween(String value1, String value2) {
            addCriterion("pd_header_provision between", value1, value2, "pdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPdHeaderProvisionNotBetween(String value1, String value2) {
            addCriterion("pd_header_provision not between", value1, value2, "pdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPdEndClauseIsNull() {
            addCriterion("pd_end_clause is null");
            return (Criteria) this;
        }

        public Criteria andPdEndClauseIsNotNull() {
            addCriterion("pd_end_clause is not null");
            return (Criteria) this;
        }

        public Criteria andPdEndClauseEqualTo(String value) {
            addCriterion("pd_end_clause =", value, "pdEndClause");
            return (Criteria) this;
        }

        public Criteria andPdEndClauseNotEqualTo(String value) {
            addCriterion("pd_end_clause <>", value, "pdEndClause");
            return (Criteria) this;
        }

        public Criteria andPdEndClauseGreaterThan(String value) {
            addCriterion("pd_end_clause >", value, "pdEndClause");
            return (Criteria) this;
        }

        public Criteria andPdEndClauseGreaterThanOrEqualTo(String value) {
            addCriterion("pd_end_clause >=", value, "pdEndClause");
            return (Criteria) this;
        }

        public Criteria andPdEndClauseLessThan(String value) {
            addCriterion("pd_end_clause <", value, "pdEndClause");
            return (Criteria) this;
        }

        public Criteria andPdEndClauseLessThanOrEqualTo(String value) {
            addCriterion("pd_end_clause <=", value, "pdEndClause");
            return (Criteria) this;
        }

        public Criteria andPdEndClauseLike(String value) {
            addCriterion("pd_end_clause like", value, "pdEndClause");
            return (Criteria) this;
        }

        public Criteria andPdEndClauseNotLike(String value) {
            addCriterion("pd_end_clause not like", value, "pdEndClause");
            return (Criteria) this;
        }

        public Criteria andPdEndClauseIn(List<String> values) {
            addCriterion("pd_end_clause in", values, "pdEndClause");
            return (Criteria) this;
        }

        public Criteria andPdEndClauseNotIn(List<String> values) {
            addCriterion("pd_end_clause not in", values, "pdEndClause");
            return (Criteria) this;
        }

        public Criteria andPdEndClauseBetween(String value1, String value2) {
            addCriterion("pd_end_clause between", value1, value2, "pdEndClause");
            return (Criteria) this;
        }

        public Criteria andPdEndClauseNotBetween(String value1, String value2) {
            addCriterion("pd_end_clause not between", value1, value2, "pdEndClause");
            return (Criteria) this;
        }

        public Criteria andPdRemarkIsNull() {
            addCriterion("pd_remark is null");
            return (Criteria) this;
        }

        public Criteria andPdRemarkIsNotNull() {
            addCriterion("pd_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPdRemarkEqualTo(String value) {
            addCriterion("pd_remark =", value, "pdRemark");
            return (Criteria) this;
        }

        public Criteria andPdRemarkNotEqualTo(String value) {
            addCriterion("pd_remark <>", value, "pdRemark");
            return (Criteria) this;
        }

        public Criteria andPdRemarkGreaterThan(String value) {
            addCriterion("pd_remark >", value, "pdRemark");
            return (Criteria) this;
        }

        public Criteria andPdRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pd_remark >=", value, "pdRemark");
            return (Criteria) this;
        }

        public Criteria andPdRemarkLessThan(String value) {
            addCriterion("pd_remark <", value, "pdRemark");
            return (Criteria) this;
        }

        public Criteria andPdRemarkLessThanOrEqualTo(String value) {
            addCriterion("pd_remark <=", value, "pdRemark");
            return (Criteria) this;
        }

        public Criteria andPdRemarkLike(String value) {
            addCriterion("pd_remark like", value, "pdRemark");
            return (Criteria) this;
        }

        public Criteria andPdRemarkNotLike(String value) {
            addCriterion("pd_remark not like", value, "pdRemark");
            return (Criteria) this;
        }

        public Criteria andPdRemarkIn(List<String> values) {
            addCriterion("pd_remark in", values, "pdRemark");
            return (Criteria) this;
        }

        public Criteria andPdRemarkNotIn(List<String> values) {
            addCriterion("pd_remark not in", values, "pdRemark");
            return (Criteria) this;
        }

        public Criteria andPdRemarkBetween(String value1, String value2) {
            addCriterion("pd_remark between", value1, value2, "pdRemark");
            return (Criteria) this;
        }

        public Criteria andPdRemarkNotBetween(String value1, String value2) {
            addCriterion("pd_remark not between", value1, value2, "pdRemark");
            return (Criteria) this;
        }

        public Criteria andPdAuditionIsNull() {
            addCriterion("pd_audition is null");
            return (Criteria) this;
        }

        public Criteria andPdAuditionIsNotNull() {
            addCriterion("pd_audition is not null");
            return (Criteria) this;
        }

        public Criteria andPdAuditionEqualTo(String value) {
            addCriterion("pd_audition =", value, "pdAudition");
            return (Criteria) this;
        }

        public Criteria andPdAuditionNotEqualTo(String value) {
            addCriterion("pd_audition <>", value, "pdAudition");
            return (Criteria) this;
        }

        public Criteria andPdAuditionGreaterThan(String value) {
            addCriterion("pd_audition >", value, "pdAudition");
            return (Criteria) this;
        }

        public Criteria andPdAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("pd_audition >=", value, "pdAudition");
            return (Criteria) this;
        }

        public Criteria andPdAuditionLessThan(String value) {
            addCriterion("pd_audition <", value, "pdAudition");
            return (Criteria) this;
        }

        public Criteria andPdAuditionLessThanOrEqualTo(String value) {
            addCriterion("pd_audition <=", value, "pdAudition");
            return (Criteria) this;
        }

        public Criteria andPdAuditionLike(String value) {
            addCriterion("pd_audition like", value, "pdAudition");
            return (Criteria) this;
        }

        public Criteria andPdAuditionNotLike(String value) {
            addCriterion("pd_audition not like", value, "pdAudition");
            return (Criteria) this;
        }

        public Criteria andPdAuditionIn(List<String> values) {
            addCriterion("pd_audition in", values, "pdAudition");
            return (Criteria) this;
        }

        public Criteria andPdAuditionNotIn(List<String> values) {
            addCriterion("pd_audition not in", values, "pdAudition");
            return (Criteria) this;
        }

        public Criteria andPdAuditionBetween(String value1, String value2) {
            addCriterion("pd_audition between", value1, value2, "pdAudition");
            return (Criteria) this;
        }

        public Criteria andPdAuditionNotBetween(String value1, String value2) {
            addCriterion("pd_audition not between", value1, value2, "pdAudition");
            return (Criteria) this;
        }

        public Criteria andPdYnIsNull() {
            addCriterion("pd_yn is null");
            return (Criteria) this;
        }

        public Criteria andPdYnIsNotNull() {
            addCriterion("pd_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPdYnEqualTo(String value) {
            addCriterion("pd_yn =", value, "pdYn");
            return (Criteria) this;
        }

        public Criteria andPdYnNotEqualTo(String value) {
            addCriterion("pd_yn <>", value, "pdYn");
            return (Criteria) this;
        }

        public Criteria andPdYnGreaterThan(String value) {
            addCriterion("pd_yn >", value, "pdYn");
            return (Criteria) this;
        }

        public Criteria andPdYnGreaterThanOrEqualTo(String value) {
            addCriterion("pd_yn >=", value, "pdYn");
            return (Criteria) this;
        }

        public Criteria andPdYnLessThan(String value) {
            addCriterion("pd_yn <", value, "pdYn");
            return (Criteria) this;
        }

        public Criteria andPdYnLessThanOrEqualTo(String value) {
            addCriterion("pd_yn <=", value, "pdYn");
            return (Criteria) this;
        }

        public Criteria andPdYnLike(String value) {
            addCriterion("pd_yn like", value, "pdYn");
            return (Criteria) this;
        }

        public Criteria andPdYnNotLike(String value) {
            addCriterion("pd_yn not like", value, "pdYn");
            return (Criteria) this;
        }

        public Criteria andPdYnIn(List<String> values) {
            addCriterion("pd_yn in", values, "pdYn");
            return (Criteria) this;
        }

        public Criteria andPdYnNotIn(List<String> values) {
            addCriterion("pd_yn not in", values, "pdYn");
            return (Criteria) this;
        }

        public Criteria andPdYnBetween(String value1, String value2) {
            addCriterion("pd_yn between", value1, value2, "pdYn");
            return (Criteria) this;
        }

        public Criteria andPdYnNotBetween(String value1, String value2) {
            addCriterion("pd_yn not between", value1, value2, "pdYn");
            return (Criteria) this;
        }

        public Criteria andPdCustom1IsNull() {
            addCriterion("pd_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPdCustom1IsNotNull() {
            addCriterion("pd_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPdCustom1EqualTo(String value) {
            addCriterion("pd_custom1 =", value, "pdCustom1");
            return (Criteria) this;
        }

        public Criteria andPdCustom1NotEqualTo(String value) {
            addCriterion("pd_custom1 <>", value, "pdCustom1");
            return (Criteria) this;
        }

        public Criteria andPdCustom1GreaterThan(String value) {
            addCriterion("pd_custom1 >", value, "pdCustom1");
            return (Criteria) this;
        }

        public Criteria andPdCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("pd_custom1 >=", value, "pdCustom1");
            return (Criteria) this;
        }

        public Criteria andPdCustom1LessThan(String value) {
            addCriterion("pd_custom1 <", value, "pdCustom1");
            return (Criteria) this;
        }

        public Criteria andPdCustom1LessThanOrEqualTo(String value) {
            addCriterion("pd_custom1 <=", value, "pdCustom1");
            return (Criteria) this;
        }

        public Criteria andPdCustom1Like(String value) {
            addCriterion("pd_custom1 like", value, "pdCustom1");
            return (Criteria) this;
        }

        public Criteria andPdCustom1NotLike(String value) {
            addCriterion("pd_custom1 not like", value, "pdCustom1");
            return (Criteria) this;
        }

        public Criteria andPdCustom1In(List<String> values) {
            addCriterion("pd_custom1 in", values, "pdCustom1");
            return (Criteria) this;
        }

        public Criteria andPdCustom1NotIn(List<String> values) {
            addCriterion("pd_custom1 not in", values, "pdCustom1");
            return (Criteria) this;
        }

        public Criteria andPdCustom1Between(String value1, String value2) {
            addCriterion("pd_custom1 between", value1, value2, "pdCustom1");
            return (Criteria) this;
        }

        public Criteria andPdCustom1NotBetween(String value1, String value2) {
            addCriterion("pd_custom1 not between", value1, value2, "pdCustom1");
            return (Criteria) this;
        }

        public Criteria andPdCustom2IsNull() {
            addCriterion("pd_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPdCustom2IsNotNull() {
            addCriterion("pd_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPdCustom2EqualTo(String value) {
            addCriterion("pd_custom2 =", value, "pdCustom2");
            return (Criteria) this;
        }

        public Criteria andPdCustom2NotEqualTo(String value) {
            addCriterion("pd_custom2 <>", value, "pdCustom2");
            return (Criteria) this;
        }

        public Criteria andPdCustom2GreaterThan(String value) {
            addCriterion("pd_custom2 >", value, "pdCustom2");
            return (Criteria) this;
        }

        public Criteria andPdCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("pd_custom2 >=", value, "pdCustom2");
            return (Criteria) this;
        }

        public Criteria andPdCustom2LessThan(String value) {
            addCriterion("pd_custom2 <", value, "pdCustom2");
            return (Criteria) this;
        }

        public Criteria andPdCustom2LessThanOrEqualTo(String value) {
            addCriterion("pd_custom2 <=", value, "pdCustom2");
            return (Criteria) this;
        }

        public Criteria andPdCustom2Like(String value) {
            addCriterion("pd_custom2 like", value, "pdCustom2");
            return (Criteria) this;
        }

        public Criteria andPdCustom2NotLike(String value) {
            addCriterion("pd_custom2 not like", value, "pdCustom2");
            return (Criteria) this;
        }

        public Criteria andPdCustom2In(List<String> values) {
            addCriterion("pd_custom2 in", values, "pdCustom2");
            return (Criteria) this;
        }

        public Criteria andPdCustom2NotIn(List<String> values) {
            addCriterion("pd_custom2 not in", values, "pdCustom2");
            return (Criteria) this;
        }

        public Criteria andPdCustom2Between(String value1, String value2) {
            addCriterion("pd_custom2 between", value1, value2, "pdCustom2");
            return (Criteria) this;
        }

        public Criteria andPdCustom2NotBetween(String value1, String value2) {
            addCriterion("pd_custom2 not between", value1, value2, "pdCustom2");
            return (Criteria) this;
        }

        public Criteria andPdCustom3IsNull() {
            addCriterion("pd_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPdCustom3IsNotNull() {
            addCriterion("pd_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPdCustom3EqualTo(String value) {
            addCriterion("pd_custom3 =", value, "pdCustom3");
            return (Criteria) this;
        }

        public Criteria andPdCustom3NotEqualTo(String value) {
            addCriterion("pd_custom3 <>", value, "pdCustom3");
            return (Criteria) this;
        }

        public Criteria andPdCustom3GreaterThan(String value) {
            addCriterion("pd_custom3 >", value, "pdCustom3");
            return (Criteria) this;
        }

        public Criteria andPdCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("pd_custom3 >=", value, "pdCustom3");
            return (Criteria) this;
        }

        public Criteria andPdCustom3LessThan(String value) {
            addCriterion("pd_custom3 <", value, "pdCustom3");
            return (Criteria) this;
        }

        public Criteria andPdCustom3LessThanOrEqualTo(String value) {
            addCriterion("pd_custom3 <=", value, "pdCustom3");
            return (Criteria) this;
        }

        public Criteria andPdCustom3Like(String value) {
            addCriterion("pd_custom3 like", value, "pdCustom3");
            return (Criteria) this;
        }

        public Criteria andPdCustom3NotLike(String value) {
            addCriterion("pd_custom3 not like", value, "pdCustom3");
            return (Criteria) this;
        }

        public Criteria andPdCustom3In(List<String> values) {
            addCriterion("pd_custom3 in", values, "pdCustom3");
            return (Criteria) this;
        }

        public Criteria andPdCustom3NotIn(List<String> values) {
            addCriterion("pd_custom3 not in", values, "pdCustom3");
            return (Criteria) this;
        }

        public Criteria andPdCustom3Between(String value1, String value2) {
            addCriterion("pd_custom3 between", value1, value2, "pdCustom3");
            return (Criteria) this;
        }

        public Criteria andPdCustom3NotBetween(String value1, String value2) {
            addCriterion("pd_custom3 not between", value1, value2, "pdCustom3");
            return (Criteria) this;
        }

        public Criteria andPdCustom4IsNull() {
            addCriterion("pd_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPdCustom4IsNotNull() {
            addCriterion("pd_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPdCustom4EqualTo(String value) {
            addCriterion("pd_custom4 =", value, "pdCustom4");
            return (Criteria) this;
        }

        public Criteria andPdCustom4NotEqualTo(String value) {
            addCriterion("pd_custom4 <>", value, "pdCustom4");
            return (Criteria) this;
        }

        public Criteria andPdCustom4GreaterThan(String value) {
            addCriterion("pd_custom4 >", value, "pdCustom4");
            return (Criteria) this;
        }

        public Criteria andPdCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("pd_custom4 >=", value, "pdCustom4");
            return (Criteria) this;
        }

        public Criteria andPdCustom4LessThan(String value) {
            addCriterion("pd_custom4 <", value, "pdCustom4");
            return (Criteria) this;
        }

        public Criteria andPdCustom4LessThanOrEqualTo(String value) {
            addCriterion("pd_custom4 <=", value, "pdCustom4");
            return (Criteria) this;
        }

        public Criteria andPdCustom4Like(String value) {
            addCriterion("pd_custom4 like", value, "pdCustom4");
            return (Criteria) this;
        }

        public Criteria andPdCustom4NotLike(String value) {
            addCriterion("pd_custom4 not like", value, "pdCustom4");
            return (Criteria) this;
        }

        public Criteria andPdCustom4In(List<String> values) {
            addCriterion("pd_custom4 in", values, "pdCustom4");
            return (Criteria) this;
        }

        public Criteria andPdCustom4NotIn(List<String> values) {
            addCriterion("pd_custom4 not in", values, "pdCustom4");
            return (Criteria) this;
        }

        public Criteria andPdCustom4Between(String value1, String value2) {
            addCriterion("pd_custom4 between", value1, value2, "pdCustom4");
            return (Criteria) this;
        }

        public Criteria andPdCustom4NotBetween(String value1, String value2) {
            addCriterion("pd_custom4 not between", value1, value2, "pdCustom4");
            return (Criteria) this;
        }

        public Criteria andPdCustom5IsNull() {
            addCriterion("pd_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPdCustom5IsNotNull() {
            addCriterion("pd_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPdCustom5EqualTo(String value) {
            addCriterion("pd_custom5 =", value, "pdCustom5");
            return (Criteria) this;
        }

        public Criteria andPdCustom5NotEqualTo(String value) {
            addCriterion("pd_custom5 <>", value, "pdCustom5");
            return (Criteria) this;
        }

        public Criteria andPdCustom5GreaterThan(String value) {
            addCriterion("pd_custom5 >", value, "pdCustom5");
            return (Criteria) this;
        }

        public Criteria andPdCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("pd_custom5 >=", value, "pdCustom5");
            return (Criteria) this;
        }

        public Criteria andPdCustom5LessThan(String value) {
            addCriterion("pd_custom5 <", value, "pdCustom5");
            return (Criteria) this;
        }

        public Criteria andPdCustom5LessThanOrEqualTo(String value) {
            addCriterion("pd_custom5 <=", value, "pdCustom5");
            return (Criteria) this;
        }

        public Criteria andPdCustom5Like(String value) {
            addCriterion("pd_custom5 like", value, "pdCustom5");
            return (Criteria) this;
        }

        public Criteria andPdCustom5NotLike(String value) {
            addCriterion("pd_custom5 not like", value, "pdCustom5");
            return (Criteria) this;
        }

        public Criteria andPdCustom5In(List<String> values) {
            addCriterion("pd_custom5 in", values, "pdCustom5");
            return (Criteria) this;
        }

        public Criteria andPdCustom5NotIn(List<String> values) {
            addCriterion("pd_custom5 not in", values, "pdCustom5");
            return (Criteria) this;
        }

        public Criteria andPdCustom5Between(String value1, String value2) {
            addCriterion("pd_custom5 between", value1, value2, "pdCustom5");
            return (Criteria) this;
        }

        public Criteria andPdCustom5NotBetween(String value1, String value2) {
            addCriterion("pd_custom5 not between", value1, value2, "pdCustom5");
            return (Criteria) this;
        }

        public Criteria andPdCustom6IsNull() {
            addCriterion("pd_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPdCustom6IsNotNull() {
            addCriterion("pd_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPdCustom6EqualTo(String value) {
            addCriterion("pd_custom6 =", value, "pdCustom6");
            return (Criteria) this;
        }

        public Criteria andPdCustom6NotEqualTo(String value) {
            addCriterion("pd_custom6 <>", value, "pdCustom6");
            return (Criteria) this;
        }

        public Criteria andPdCustom6GreaterThan(String value) {
            addCriterion("pd_custom6 >", value, "pdCustom6");
            return (Criteria) this;
        }

        public Criteria andPdCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("pd_custom6 >=", value, "pdCustom6");
            return (Criteria) this;
        }

        public Criteria andPdCustom6LessThan(String value) {
            addCriterion("pd_custom6 <", value, "pdCustom6");
            return (Criteria) this;
        }

        public Criteria andPdCustom6LessThanOrEqualTo(String value) {
            addCriterion("pd_custom6 <=", value, "pdCustom6");
            return (Criteria) this;
        }

        public Criteria andPdCustom6Like(String value) {
            addCriterion("pd_custom6 like", value, "pdCustom6");
            return (Criteria) this;
        }

        public Criteria andPdCustom6NotLike(String value) {
            addCriterion("pd_custom6 not like", value, "pdCustom6");
            return (Criteria) this;
        }

        public Criteria andPdCustom6In(List<String> values) {
            addCriterion("pd_custom6 in", values, "pdCustom6");
            return (Criteria) this;
        }

        public Criteria andPdCustom6NotIn(List<String> values) {
            addCriterion("pd_custom6 not in", values, "pdCustom6");
            return (Criteria) this;
        }

        public Criteria andPdCustom6Between(String value1, String value2) {
            addCriterion("pd_custom6 between", value1, value2, "pdCustom6");
            return (Criteria) this;
        }

        public Criteria andPdCustom6NotBetween(String value1, String value2) {
            addCriterion("pd_custom6 not between", value1, value2, "pdCustom6");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}