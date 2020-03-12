package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SalesDiscountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesDiscountExample() {
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

        public Criteria andSdIdIsNull() {
            addCriterion("sd_id is null");
            return (Criteria) this;
        }

        public Criteria andSdIdIsNotNull() {
            addCriterion("sd_id is not null");
            return (Criteria) this;
        }

        public Criteria andSdIdEqualTo(String value) {
            addCriterion("sd_id =", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotEqualTo(String value) {
            addCriterion("sd_id <>", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdGreaterThan(String value) {
            addCriterion("sd_id >", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdGreaterThanOrEqualTo(String value) {
            addCriterion("sd_id >=", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdLessThan(String value) {
            addCriterion("sd_id <", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdLessThanOrEqualTo(String value) {
            addCriterion("sd_id <=", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdLike(String value) {
            addCriterion("sd_id like", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotLike(String value) {
            addCriterion("sd_id not like", value, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdIn(List<String> values) {
            addCriterion("sd_id in", values, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotIn(List<String> values) {
            addCriterion("sd_id not in", values, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdBetween(String value1, String value2) {
            addCriterion("sd_id between", value1, value2, "sdId");
            return (Criteria) this;
        }

        public Criteria andSdIdNotBetween(String value1, String value2) {
            addCriterion("sd_id not between", value1, value2, "sdId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
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

        public Criteria andSdDocumentDateIsNull() {
            addCriterion("sd_document_date is null");
            return (Criteria) this;
        }

        public Criteria andSdDocumentDateIsNotNull() {
            addCriterion("sd_document_date is not null");
            return (Criteria) this;
        }

        public Criteria andSdDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("sd_document_date =", value, "sdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSdDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sd_document_date <>", value, "sdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSdDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sd_document_date >", value, "sdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSdDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sd_document_date >=", value, "sdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSdDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("sd_document_date <", value, "sdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSdDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sd_document_date <=", value, "sdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSdDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("sd_document_date in", values, "sdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSdDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sd_document_date not in", values, "sdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSdDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sd_document_date between", value1, value2, "sdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSdDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sd_document_date not between", value1, value2, "sdDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSdDocumentNumberIsNull() {
            addCriterion("sd_document_number is null");
            return (Criteria) this;
        }

        public Criteria andSdDocumentNumberIsNotNull() {
            addCriterion("sd_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andSdDocumentNumberEqualTo(String value) {
            addCriterion("sd_document_number =", value, "sdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSdDocumentNumberNotEqualTo(String value) {
            addCriterion("sd_document_number <>", value, "sdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSdDocumentNumberGreaterThan(String value) {
            addCriterion("sd_document_number >", value, "sdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSdDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sd_document_number >=", value, "sdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSdDocumentNumberLessThan(String value) {
            addCriterion("sd_document_number <", value, "sdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSdDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("sd_document_number <=", value, "sdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSdDocumentNumberLike(String value) {
            addCriterion("sd_document_number like", value, "sdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSdDocumentNumberNotLike(String value) {
            addCriterion("sd_document_number not like", value, "sdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSdDocumentNumberIn(List<String> values) {
            addCriterion("sd_document_number in", values, "sdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSdDocumentNumberNotIn(List<String> values) {
            addCriterion("sd_document_number not in", values, "sdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSdDocumentNumberBetween(String value1, String value2) {
            addCriterion("sd_document_number between", value1, value2, "sdDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andSdDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("sd_document_number not between", value1, value2, "sdDocumentNumber");
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

        public Criteria andSdExchangeRateIsNull() {
            addCriterion("sd_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andSdExchangeRateIsNotNull() {
            addCriterion("sd_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSdExchangeRateEqualTo(Float value) {
            addCriterion("sd_exchange_rate =", value, "sdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSdExchangeRateNotEqualTo(Float value) {
            addCriterion("sd_exchange_rate <>", value, "sdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSdExchangeRateGreaterThan(Float value) {
            addCriterion("sd_exchange_rate >", value, "sdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSdExchangeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("sd_exchange_rate >=", value, "sdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSdExchangeRateLessThan(Float value) {
            addCriterion("sd_exchange_rate <", value, "sdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSdExchangeRateLessThanOrEqualTo(Float value) {
            addCriterion("sd_exchange_rate <=", value, "sdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSdExchangeRateIn(List<Float> values) {
            addCriterion("sd_exchange_rate in", values, "sdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSdExchangeRateNotIn(List<Float> values) {
            addCriterion("sd_exchange_rate not in", values, "sdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSdExchangeRateBetween(Float value1, Float value2) {
            addCriterion("sd_exchange_rate between", value1, value2, "sdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSdExchangeRateNotBetween(Float value1, Float value2) {
            addCriterion("sd_exchange_rate not between", value1, value2, "sdExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSdCertificateNumberIsNull() {
            addCriterion("sd_certificate_number is null");
            return (Criteria) this;
        }

        public Criteria andSdCertificateNumberIsNotNull() {
            addCriterion("sd_certificate_number is not null");
            return (Criteria) this;
        }

        public Criteria andSdCertificateNumberEqualTo(String value) {
            addCriterion("sd_certificate_number =", value, "sdCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSdCertificateNumberNotEqualTo(String value) {
            addCriterion("sd_certificate_number <>", value, "sdCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSdCertificateNumberGreaterThan(String value) {
            addCriterion("sd_certificate_number >", value, "sdCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSdCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sd_certificate_number >=", value, "sdCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSdCertificateNumberLessThan(String value) {
            addCriterion("sd_certificate_number <", value, "sdCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSdCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("sd_certificate_number <=", value, "sdCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSdCertificateNumberLike(String value) {
            addCriterion("sd_certificate_number like", value, "sdCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSdCertificateNumberNotLike(String value) {
            addCriterion("sd_certificate_number not like", value, "sdCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSdCertificateNumberIn(List<String> values) {
            addCriterion("sd_certificate_number in", values, "sdCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSdCertificateNumberNotIn(List<String> values) {
            addCriterion("sd_certificate_number not in", values, "sdCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSdCertificateNumberBetween(String value1, String value2) {
            addCriterion("sd_certificate_number between", value1, value2, "sdCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSdCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("sd_certificate_number not between", value1, value2, "sdCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andSdSunnumIsNull() {
            addCriterion("sd_sunnum is null");
            return (Criteria) this;
        }

        public Criteria andSdSunnumIsNotNull() {
            addCriterion("sd_sunnum is not null");
            return (Criteria) this;
        }

        public Criteria andSdSunnumEqualTo(Integer value) {
            addCriterion("sd_sunnum =", value, "sdSunnum");
            return (Criteria) this;
        }

        public Criteria andSdSunnumNotEqualTo(Integer value) {
            addCriterion("sd_sunnum <>", value, "sdSunnum");
            return (Criteria) this;
        }

        public Criteria andSdSunnumGreaterThan(Integer value) {
            addCriterion("sd_sunnum >", value, "sdSunnum");
            return (Criteria) this;
        }

        public Criteria andSdSunnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sd_sunnum >=", value, "sdSunnum");
            return (Criteria) this;
        }

        public Criteria andSdSunnumLessThan(Integer value) {
            addCriterion("sd_sunnum <", value, "sdSunnum");
            return (Criteria) this;
        }

        public Criteria andSdSunnumLessThanOrEqualTo(Integer value) {
            addCriterion("sd_sunnum <=", value, "sdSunnum");
            return (Criteria) this;
        }

        public Criteria andSdSunnumIn(List<Integer> values) {
            addCriterion("sd_sunnum in", values, "sdSunnum");
            return (Criteria) this;
        }

        public Criteria andSdSunnumNotIn(List<Integer> values) {
            addCriterion("sd_sunnum not in", values, "sdSunnum");
            return (Criteria) this;
        }

        public Criteria andSdSunnumBetween(Integer value1, Integer value2) {
            addCriterion("sd_sunnum between", value1, value2, "sdSunnum");
            return (Criteria) this;
        }

        public Criteria andSdSunnumNotBetween(Integer value1, Integer value2) {
            addCriterion("sd_sunnum not between", value1, value2, "sdSunnum");
            return (Criteria) this;
        }

        public Criteria andSdSunmoneyIsNull() {
            addCriterion("sd_sunmoney is null");
            return (Criteria) this;
        }

        public Criteria andSdSunmoneyIsNotNull() {
            addCriterion("sd_sunmoney is not null");
            return (Criteria) this;
        }

        public Criteria andSdSunmoneyEqualTo(Float value) {
            addCriterion("sd_sunmoney =", value, "sdSunmoney");
            return (Criteria) this;
        }

        public Criteria andSdSunmoneyNotEqualTo(Float value) {
            addCriterion("sd_sunmoney <>", value, "sdSunmoney");
            return (Criteria) this;
        }

        public Criteria andSdSunmoneyGreaterThan(Float value) {
            addCriterion("sd_sunmoney >", value, "sdSunmoney");
            return (Criteria) this;
        }

        public Criteria andSdSunmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("sd_sunmoney >=", value, "sdSunmoney");
            return (Criteria) this;
        }

        public Criteria andSdSunmoneyLessThan(Float value) {
            addCriterion("sd_sunmoney <", value, "sdSunmoney");
            return (Criteria) this;
        }

        public Criteria andSdSunmoneyLessThanOrEqualTo(Float value) {
            addCriterion("sd_sunmoney <=", value, "sdSunmoney");
            return (Criteria) this;
        }

        public Criteria andSdSunmoneyIn(List<Float> values) {
            addCriterion("sd_sunmoney in", values, "sdSunmoney");
            return (Criteria) this;
        }

        public Criteria andSdSunmoneyNotIn(List<Float> values) {
            addCriterion("sd_sunmoney not in", values, "sdSunmoney");
            return (Criteria) this;
        }

        public Criteria andSdSunmoneyBetween(Float value1, Float value2) {
            addCriterion("sd_sunmoney between", value1, value2, "sdSunmoney");
            return (Criteria) this;
        }

        public Criteria andSdSunmoneyNotBetween(Float value1, Float value2) {
            addCriterion("sd_sunmoney not between", value1, value2, "sdSunmoney");
            return (Criteria) this;
        }

        public Criteria andSdTaxIsNull() {
            addCriterion("sd_tax is null");
            return (Criteria) this;
        }

        public Criteria andSdTaxIsNotNull() {
            addCriterion("sd_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSdTaxEqualTo(Float value) {
            addCriterion("sd_tax =", value, "sdTax");
            return (Criteria) this;
        }

        public Criteria andSdTaxNotEqualTo(Float value) {
            addCriterion("sd_tax <>", value, "sdTax");
            return (Criteria) this;
        }

        public Criteria andSdTaxGreaterThan(Float value) {
            addCriterion("sd_tax >", value, "sdTax");
            return (Criteria) this;
        }

        public Criteria andSdTaxGreaterThanOrEqualTo(Float value) {
            addCriterion("sd_tax >=", value, "sdTax");
            return (Criteria) this;
        }

        public Criteria andSdTaxLessThan(Float value) {
            addCriterion("sd_tax <", value, "sdTax");
            return (Criteria) this;
        }

        public Criteria andSdTaxLessThanOrEqualTo(Float value) {
            addCriterion("sd_tax <=", value, "sdTax");
            return (Criteria) this;
        }

        public Criteria andSdTaxIn(List<Float> values) {
            addCriterion("sd_tax in", values, "sdTax");
            return (Criteria) this;
        }

        public Criteria andSdTaxNotIn(List<Float> values) {
            addCriterion("sd_tax not in", values, "sdTax");
            return (Criteria) this;
        }

        public Criteria andSdTaxBetween(Float value1, Float value2) {
            addCriterion("sd_tax between", value1, value2, "sdTax");
            return (Criteria) this;
        }

        public Criteria andSdTaxNotBetween(Float value1, Float value2) {
            addCriterion("sd_tax not between", value1, value2, "sdTax");
            return (Criteria) this;
        }

        public Criteria andSdIncludingTaxAmountIsNull() {
            addCriterion("sd_including_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andSdIncludingTaxAmountIsNotNull() {
            addCriterion("sd_including_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSdIncludingTaxAmountEqualTo(Float value) {
            addCriterion("sd_including_tax_amount =", value, "sdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSdIncludingTaxAmountNotEqualTo(Float value) {
            addCriterion("sd_including_tax_amount <>", value, "sdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSdIncludingTaxAmountGreaterThan(Float value) {
            addCriterion("sd_including_tax_amount >", value, "sdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSdIncludingTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("sd_including_tax_amount >=", value, "sdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSdIncludingTaxAmountLessThan(Float value) {
            addCriterion("sd_including_tax_amount <", value, "sdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSdIncludingTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("sd_including_tax_amount <=", value, "sdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSdIncludingTaxAmountIn(List<Float> values) {
            addCriterion("sd_including_tax_amount in", values, "sdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSdIncludingTaxAmountNotIn(List<Float> values) {
            addCriterion("sd_including_tax_amount not in", values, "sdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSdIncludingTaxAmountBetween(Float value1, Float value2) {
            addCriterion("sd_including_tax_amount between", value1, value2, "sdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSdIncludingTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("sd_including_tax_amount not between", value1, value2, "sdIncludingTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSdDeliveryAddressIsNull() {
            addCriterion("sd_delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andSdDeliveryAddressIsNotNull() {
            addCriterion("sd_delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andSdDeliveryAddressEqualTo(String value) {
            addCriterion("sd_delivery_address =", value, "sdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSdDeliveryAddressNotEqualTo(String value) {
            addCriterion("sd_delivery_address <>", value, "sdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSdDeliveryAddressGreaterThan(String value) {
            addCriterion("sd_delivery_address >", value, "sdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSdDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sd_delivery_address >=", value, "sdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSdDeliveryAddressLessThan(String value) {
            addCriterion("sd_delivery_address <", value, "sdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSdDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("sd_delivery_address <=", value, "sdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSdDeliveryAddressLike(String value) {
            addCriterion("sd_delivery_address like", value, "sdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSdDeliveryAddressNotLike(String value) {
            addCriterion("sd_delivery_address not like", value, "sdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSdDeliveryAddressIn(List<String> values) {
            addCriterion("sd_delivery_address in", values, "sdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSdDeliveryAddressNotIn(List<String> values) {
            addCriterion("sd_delivery_address not in", values, "sdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSdDeliveryAddressBetween(String value1, String value2) {
            addCriterion("sd_delivery_address between", value1, value2, "sdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSdDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("sd_delivery_address not between", value1, value2, "sdDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSdBuyerIsNull() {
            addCriterion("sd_buyer is null");
            return (Criteria) this;
        }

        public Criteria andSdBuyerIsNotNull() {
            addCriterion("sd_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andSdBuyerEqualTo(String value) {
            addCriterion("sd_buyer =", value, "sdBuyer");
            return (Criteria) this;
        }

        public Criteria andSdBuyerNotEqualTo(String value) {
            addCriterion("sd_buyer <>", value, "sdBuyer");
            return (Criteria) this;
        }

        public Criteria andSdBuyerGreaterThan(String value) {
            addCriterion("sd_buyer >", value, "sdBuyer");
            return (Criteria) this;
        }

        public Criteria andSdBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("sd_buyer >=", value, "sdBuyer");
            return (Criteria) this;
        }

        public Criteria andSdBuyerLessThan(String value) {
            addCriterion("sd_buyer <", value, "sdBuyer");
            return (Criteria) this;
        }

        public Criteria andSdBuyerLessThanOrEqualTo(String value) {
            addCriterion("sd_buyer <=", value, "sdBuyer");
            return (Criteria) this;
        }

        public Criteria andSdBuyerLike(String value) {
            addCriterion("sd_buyer like", value, "sdBuyer");
            return (Criteria) this;
        }

        public Criteria andSdBuyerNotLike(String value) {
            addCriterion("sd_buyer not like", value, "sdBuyer");
            return (Criteria) this;
        }

        public Criteria andSdBuyerIn(List<String> values) {
            addCriterion("sd_buyer in", values, "sdBuyer");
            return (Criteria) this;
        }

        public Criteria andSdBuyerNotIn(List<String> values) {
            addCriterion("sd_buyer not in", values, "sdBuyer");
            return (Criteria) this;
        }

        public Criteria andSdBuyerBetween(String value1, String value2) {
            addCriterion("sd_buyer between", value1, value2, "sdBuyer");
            return (Criteria) this;
        }

        public Criteria andSdBuyerNotBetween(String value1, String value2) {
            addCriterion("sd_buyer not between", value1, value2, "sdBuyer");
            return (Criteria) this;
        }

        public Criteria andSdBelongsSectionIsNull() {
            addCriterion("sd_belongs_section is null");
            return (Criteria) this;
        }

        public Criteria andSdBelongsSectionIsNotNull() {
            addCriterion("sd_belongs_section is not null");
            return (Criteria) this;
        }

        public Criteria andSdBelongsSectionEqualTo(String value) {
            addCriterion("sd_belongs_section =", value, "sdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSdBelongsSectionNotEqualTo(String value) {
            addCriterion("sd_belongs_section <>", value, "sdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSdBelongsSectionGreaterThan(String value) {
            addCriterion("sd_belongs_section >", value, "sdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSdBelongsSectionGreaterThanOrEqualTo(String value) {
            addCriterion("sd_belongs_section >=", value, "sdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSdBelongsSectionLessThan(String value) {
            addCriterion("sd_belongs_section <", value, "sdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSdBelongsSectionLessThanOrEqualTo(String value) {
            addCriterion("sd_belongs_section <=", value, "sdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSdBelongsSectionLike(String value) {
            addCriterion("sd_belongs_section like", value, "sdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSdBelongsSectionNotLike(String value) {
            addCriterion("sd_belongs_section not like", value, "sdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSdBelongsSectionIn(List<String> values) {
            addCriterion("sd_belongs_section in", values, "sdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSdBelongsSectionNotIn(List<String> values) {
            addCriterion("sd_belongs_section not in", values, "sdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSdBelongsSectionBetween(String value1, String value2) {
            addCriterion("sd_belongs_section between", value1, value2, "sdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSdBelongsSectionNotBetween(String value1, String value2) {
            addCriterion("sd_belongs_section not between", value1, value2, "sdBelongsSection");
            return (Criteria) this;
        }

        public Criteria andSdBelongsProjectIsNull() {
            addCriterion("sd_belongs_project is null");
            return (Criteria) this;
        }

        public Criteria andSdBelongsProjectIsNotNull() {
            addCriterion("sd_belongs_project is not null");
            return (Criteria) this;
        }

        public Criteria andSdBelongsProjectEqualTo(String value) {
            addCriterion("sd_belongs_project =", value, "sdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSdBelongsProjectNotEqualTo(String value) {
            addCriterion("sd_belongs_project <>", value, "sdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSdBelongsProjectGreaterThan(String value) {
            addCriterion("sd_belongs_project >", value, "sdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSdBelongsProjectGreaterThanOrEqualTo(String value) {
            addCriterion("sd_belongs_project >=", value, "sdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSdBelongsProjectLessThan(String value) {
            addCriterion("sd_belongs_project <", value, "sdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSdBelongsProjectLessThanOrEqualTo(String value) {
            addCriterion("sd_belongs_project <=", value, "sdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSdBelongsProjectLike(String value) {
            addCriterion("sd_belongs_project like", value, "sdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSdBelongsProjectNotLike(String value) {
            addCriterion("sd_belongs_project not like", value, "sdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSdBelongsProjectIn(List<String> values) {
            addCriterion("sd_belongs_project in", values, "sdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSdBelongsProjectNotIn(List<String> values) {
            addCriterion("sd_belongs_project not in", values, "sdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSdBelongsProjectBetween(String value1, String value2) {
            addCriterion("sd_belongs_project between", value1, value2, "sdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSdBelongsProjectNotBetween(String value1, String value2) {
            addCriterion("sd_belongs_project not between", value1, value2, "sdBelongsProject");
            return (Criteria) this;
        }

        public Criteria andSdFormIsNull() {
            addCriterion("sd_form is null");
            return (Criteria) this;
        }

        public Criteria andSdFormIsNotNull() {
            addCriterion("sd_form is not null");
            return (Criteria) this;
        }

        public Criteria andSdFormEqualTo(String value) {
            addCriterion("sd_form =", value, "sdForm");
            return (Criteria) this;
        }

        public Criteria andSdFormNotEqualTo(String value) {
            addCriterion("sd_form <>", value, "sdForm");
            return (Criteria) this;
        }

        public Criteria andSdFormGreaterThan(String value) {
            addCriterion("sd_form >", value, "sdForm");
            return (Criteria) this;
        }

        public Criteria andSdFormGreaterThanOrEqualTo(String value) {
            addCriterion("sd_form >=", value, "sdForm");
            return (Criteria) this;
        }

        public Criteria andSdFormLessThan(String value) {
            addCriterion("sd_form <", value, "sdForm");
            return (Criteria) this;
        }

        public Criteria andSdFormLessThanOrEqualTo(String value) {
            addCriterion("sd_form <=", value, "sdForm");
            return (Criteria) this;
        }

        public Criteria andSdFormLike(String value) {
            addCriterion("sd_form like", value, "sdForm");
            return (Criteria) this;
        }

        public Criteria andSdFormNotLike(String value) {
            addCriterion("sd_form not like", value, "sdForm");
            return (Criteria) this;
        }

        public Criteria andSdFormIn(List<String> values) {
            addCriterion("sd_form in", values, "sdForm");
            return (Criteria) this;
        }

        public Criteria andSdFormNotIn(List<String> values) {
            addCriterion("sd_form not in", values, "sdForm");
            return (Criteria) this;
        }

        public Criteria andSdFormBetween(String value1, String value2) {
            addCriterion("sd_form between", value1, value2, "sdForm");
            return (Criteria) this;
        }

        public Criteria andSdFormNotBetween(String value1, String value2) {
            addCriterion("sd_form not between", value1, value2, "sdForm");
            return (Criteria) this;
        }

        public Criteria andSdCheckagainStaffIsNull() {
            addCriterion("sd_checkagain_staff is null");
            return (Criteria) this;
        }

        public Criteria andSdCheckagainStaffIsNotNull() {
            addCriterion("sd_checkagain_staff is not null");
            return (Criteria) this;
        }

        public Criteria andSdCheckagainStaffEqualTo(String value) {
            addCriterion("sd_checkagain_staff =", value, "sdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSdCheckagainStaffNotEqualTo(String value) {
            addCriterion("sd_checkagain_staff <>", value, "sdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSdCheckagainStaffGreaterThan(String value) {
            addCriterion("sd_checkagain_staff >", value, "sdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSdCheckagainStaffGreaterThanOrEqualTo(String value) {
            addCriterion("sd_checkagain_staff >=", value, "sdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSdCheckagainStaffLessThan(String value) {
            addCriterion("sd_checkagain_staff <", value, "sdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSdCheckagainStaffLessThanOrEqualTo(String value) {
            addCriterion("sd_checkagain_staff <=", value, "sdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSdCheckagainStaffLike(String value) {
            addCriterion("sd_checkagain_staff like", value, "sdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSdCheckagainStaffNotLike(String value) {
            addCriterion("sd_checkagain_staff not like", value, "sdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSdCheckagainStaffIn(List<String> values) {
            addCriterion("sd_checkagain_staff in", values, "sdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSdCheckagainStaffNotIn(List<String> values) {
            addCriterion("sd_checkagain_staff not in", values, "sdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSdCheckagainStaffBetween(String value1, String value2) {
            addCriterion("sd_checkagain_staff between", value1, value2, "sdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSdCheckagainStaffNotBetween(String value1, String value2) {
            addCriterion("sd_checkagain_staff not between", value1, value2, "sdCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andSdProjectIsNull() {
            addCriterion("sd_project is null");
            return (Criteria) this;
        }

        public Criteria andSdProjectIsNotNull() {
            addCriterion("sd_project is not null");
            return (Criteria) this;
        }

        public Criteria andSdProjectEqualTo(String value) {
            addCriterion("sd_project =", value, "sdProject");
            return (Criteria) this;
        }

        public Criteria andSdProjectNotEqualTo(String value) {
            addCriterion("sd_project <>", value, "sdProject");
            return (Criteria) this;
        }

        public Criteria andSdProjectGreaterThan(String value) {
            addCriterion("sd_project >", value, "sdProject");
            return (Criteria) this;
        }

        public Criteria andSdProjectGreaterThanOrEqualTo(String value) {
            addCriterion("sd_project >=", value, "sdProject");
            return (Criteria) this;
        }

        public Criteria andSdProjectLessThan(String value) {
            addCriterion("sd_project <", value, "sdProject");
            return (Criteria) this;
        }

        public Criteria andSdProjectLessThanOrEqualTo(String value) {
            addCriterion("sd_project <=", value, "sdProject");
            return (Criteria) this;
        }

        public Criteria andSdProjectLike(String value) {
            addCriterion("sd_project like", value, "sdProject");
            return (Criteria) this;
        }

        public Criteria andSdProjectNotLike(String value) {
            addCriterion("sd_project not like", value, "sdProject");
            return (Criteria) this;
        }

        public Criteria andSdProjectIn(List<String> values) {
            addCriterion("sd_project in", values, "sdProject");
            return (Criteria) this;
        }

        public Criteria andSdProjectNotIn(List<String> values) {
            addCriterion("sd_project not in", values, "sdProject");
            return (Criteria) this;
        }

        public Criteria andSdProjectBetween(String value1, String value2) {
            addCriterion("sd_project between", value1, value2, "sdProject");
            return (Criteria) this;
        }

        public Criteria andSdProjectNotBetween(String value1, String value2) {
            addCriterion("sd_project not between", value1, value2, "sdProject");
            return (Criteria) this;
        }

        public Criteria andSdHeaderProvisionIsNull() {
            addCriterion("sd_header_provision is null");
            return (Criteria) this;
        }

        public Criteria andSdHeaderProvisionIsNotNull() {
            addCriterion("sd_header_provision is not null");
            return (Criteria) this;
        }

        public Criteria andSdHeaderProvisionEqualTo(String value) {
            addCriterion("sd_header_provision =", value, "sdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSdHeaderProvisionNotEqualTo(String value) {
            addCriterion("sd_header_provision <>", value, "sdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSdHeaderProvisionGreaterThan(String value) {
            addCriterion("sd_header_provision >", value, "sdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSdHeaderProvisionGreaterThanOrEqualTo(String value) {
            addCriterion("sd_header_provision >=", value, "sdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSdHeaderProvisionLessThan(String value) {
            addCriterion("sd_header_provision <", value, "sdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSdHeaderProvisionLessThanOrEqualTo(String value) {
            addCriterion("sd_header_provision <=", value, "sdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSdHeaderProvisionLike(String value) {
            addCriterion("sd_header_provision like", value, "sdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSdHeaderProvisionNotLike(String value) {
            addCriterion("sd_header_provision not like", value, "sdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSdHeaderProvisionIn(List<String> values) {
            addCriterion("sd_header_provision in", values, "sdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSdHeaderProvisionNotIn(List<String> values) {
            addCriterion("sd_header_provision not in", values, "sdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSdHeaderProvisionBetween(String value1, String value2) {
            addCriterion("sd_header_provision between", value1, value2, "sdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSdHeaderProvisionNotBetween(String value1, String value2) {
            addCriterion("sd_header_provision not between", value1, value2, "sdHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andSdEndClauseIsNull() {
            addCriterion("sd_end_clause is null");
            return (Criteria) this;
        }

        public Criteria andSdEndClauseIsNotNull() {
            addCriterion("sd_end_clause is not null");
            return (Criteria) this;
        }

        public Criteria andSdEndClauseEqualTo(String value) {
            addCriterion("sd_end_clause =", value, "sdEndClause");
            return (Criteria) this;
        }

        public Criteria andSdEndClauseNotEqualTo(String value) {
            addCriterion("sd_end_clause <>", value, "sdEndClause");
            return (Criteria) this;
        }

        public Criteria andSdEndClauseGreaterThan(String value) {
            addCriterion("sd_end_clause >", value, "sdEndClause");
            return (Criteria) this;
        }

        public Criteria andSdEndClauseGreaterThanOrEqualTo(String value) {
            addCriterion("sd_end_clause >=", value, "sdEndClause");
            return (Criteria) this;
        }

        public Criteria andSdEndClauseLessThan(String value) {
            addCriterion("sd_end_clause <", value, "sdEndClause");
            return (Criteria) this;
        }

        public Criteria andSdEndClauseLessThanOrEqualTo(String value) {
            addCriterion("sd_end_clause <=", value, "sdEndClause");
            return (Criteria) this;
        }

        public Criteria andSdEndClauseLike(String value) {
            addCriterion("sd_end_clause like", value, "sdEndClause");
            return (Criteria) this;
        }

        public Criteria andSdEndClauseNotLike(String value) {
            addCriterion("sd_end_clause not like", value, "sdEndClause");
            return (Criteria) this;
        }

        public Criteria andSdEndClauseIn(List<String> values) {
            addCriterion("sd_end_clause in", values, "sdEndClause");
            return (Criteria) this;
        }

        public Criteria andSdEndClauseNotIn(List<String> values) {
            addCriterion("sd_end_clause not in", values, "sdEndClause");
            return (Criteria) this;
        }

        public Criteria andSdEndClauseBetween(String value1, String value2) {
            addCriterion("sd_end_clause between", value1, value2, "sdEndClause");
            return (Criteria) this;
        }

        public Criteria andSdEndClauseNotBetween(String value1, String value2) {
            addCriterion("sd_end_clause not between", value1, value2, "sdEndClause");
            return (Criteria) this;
        }

        public Criteria andSdRemarkIsNull() {
            addCriterion("sd_remark is null");
            return (Criteria) this;
        }

        public Criteria andSdRemarkIsNotNull() {
            addCriterion("sd_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSdRemarkEqualTo(String value) {
            addCriterion("sd_remark =", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkNotEqualTo(String value) {
            addCriterion("sd_remark <>", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkGreaterThan(String value) {
            addCriterion("sd_remark >", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sd_remark >=", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkLessThan(String value) {
            addCriterion("sd_remark <", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkLessThanOrEqualTo(String value) {
            addCriterion("sd_remark <=", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkLike(String value) {
            addCriterion("sd_remark like", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkNotLike(String value) {
            addCriterion("sd_remark not like", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkIn(List<String> values) {
            addCriterion("sd_remark in", values, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkNotIn(List<String> values) {
            addCriterion("sd_remark not in", values, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkBetween(String value1, String value2) {
            addCriterion("sd_remark between", value1, value2, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkNotBetween(String value1, String value2) {
            addCriterion("sd_remark not between", value1, value2, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdAuditingIsNull() {
            addCriterion("sd_auditing is null");
            return (Criteria) this;
        }

        public Criteria andSdAuditingIsNotNull() {
            addCriterion("sd_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andSdAuditingEqualTo(String value) {
            addCriterion("sd_auditing =", value, "sdAuditing");
            return (Criteria) this;
        }

        public Criteria andSdAuditingNotEqualTo(String value) {
            addCriterion("sd_auditing <>", value, "sdAuditing");
            return (Criteria) this;
        }

        public Criteria andSdAuditingGreaterThan(String value) {
            addCriterion("sd_auditing >", value, "sdAuditing");
            return (Criteria) this;
        }

        public Criteria andSdAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("sd_auditing >=", value, "sdAuditing");
            return (Criteria) this;
        }

        public Criteria andSdAuditingLessThan(String value) {
            addCriterion("sd_auditing <", value, "sdAuditing");
            return (Criteria) this;
        }

        public Criteria andSdAuditingLessThanOrEqualTo(String value) {
            addCriterion("sd_auditing <=", value, "sdAuditing");
            return (Criteria) this;
        }

        public Criteria andSdAuditingLike(String value) {
            addCriterion("sd_auditing like", value, "sdAuditing");
            return (Criteria) this;
        }

        public Criteria andSdAuditingNotLike(String value) {
            addCriterion("sd_auditing not like", value, "sdAuditing");
            return (Criteria) this;
        }

        public Criteria andSdAuditingIn(List<String> values) {
            addCriterion("sd_auditing in", values, "sdAuditing");
            return (Criteria) this;
        }

        public Criteria andSdAuditingNotIn(List<String> values) {
            addCriterion("sd_auditing not in", values, "sdAuditing");
            return (Criteria) this;
        }

        public Criteria andSdAuditingBetween(String value1, String value2) {
            addCriterion("sd_auditing between", value1, value2, "sdAuditing");
            return (Criteria) this;
        }

        public Criteria andSdAuditingNotBetween(String value1, String value2) {
            addCriterion("sd_auditing not between", value1, value2, "sdAuditing");
            return (Criteria) this;
        }

        public Criteria andSdYnIsNull() {
            addCriterion("sd_yn is null");
            return (Criteria) this;
        }

        public Criteria andSdYnIsNotNull() {
            addCriterion("sd_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSdYnEqualTo(String value) {
            addCriterion("sd_yn =", value, "sdYn");
            return (Criteria) this;
        }

        public Criteria andSdYnNotEqualTo(String value) {
            addCriterion("sd_yn <>", value, "sdYn");
            return (Criteria) this;
        }

        public Criteria andSdYnGreaterThan(String value) {
            addCriterion("sd_yn >", value, "sdYn");
            return (Criteria) this;
        }

        public Criteria andSdYnGreaterThanOrEqualTo(String value) {
            addCriterion("sd_yn >=", value, "sdYn");
            return (Criteria) this;
        }

        public Criteria andSdYnLessThan(String value) {
            addCriterion("sd_yn <", value, "sdYn");
            return (Criteria) this;
        }

        public Criteria andSdYnLessThanOrEqualTo(String value) {
            addCriterion("sd_yn <=", value, "sdYn");
            return (Criteria) this;
        }

        public Criteria andSdYnLike(String value) {
            addCriterion("sd_yn like", value, "sdYn");
            return (Criteria) this;
        }

        public Criteria andSdYnNotLike(String value) {
            addCriterion("sd_yn not like", value, "sdYn");
            return (Criteria) this;
        }

        public Criteria andSdYnIn(List<String> values) {
            addCriterion("sd_yn in", values, "sdYn");
            return (Criteria) this;
        }

        public Criteria andSdYnNotIn(List<String> values) {
            addCriterion("sd_yn not in", values, "sdYn");
            return (Criteria) this;
        }

        public Criteria andSdYnBetween(String value1, String value2) {
            addCriterion("sd_yn between", value1, value2, "sdYn");
            return (Criteria) this;
        }

        public Criteria andSdYnNotBetween(String value1, String value2) {
            addCriterion("sd_yn not between", value1, value2, "sdYn");
            return (Criteria) this;
        }

        public Criteria andSdCustom1IsNull() {
            addCriterion("sd_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andSdCustom1IsNotNull() {
            addCriterion("sd_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSdCustom1EqualTo(String value) {
            addCriterion("sd_custom1 =", value, "sdCustom1");
            return (Criteria) this;
        }

        public Criteria andSdCustom1NotEqualTo(String value) {
            addCriterion("sd_custom1 <>", value, "sdCustom1");
            return (Criteria) this;
        }

        public Criteria andSdCustom1GreaterThan(String value) {
            addCriterion("sd_custom1 >", value, "sdCustom1");
            return (Criteria) this;
        }

        public Criteria andSdCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("sd_custom1 >=", value, "sdCustom1");
            return (Criteria) this;
        }

        public Criteria andSdCustom1LessThan(String value) {
            addCriterion("sd_custom1 <", value, "sdCustom1");
            return (Criteria) this;
        }

        public Criteria andSdCustom1LessThanOrEqualTo(String value) {
            addCriterion("sd_custom1 <=", value, "sdCustom1");
            return (Criteria) this;
        }

        public Criteria andSdCustom1Like(String value) {
            addCriterion("sd_custom1 like", value, "sdCustom1");
            return (Criteria) this;
        }

        public Criteria andSdCustom1NotLike(String value) {
            addCriterion("sd_custom1 not like", value, "sdCustom1");
            return (Criteria) this;
        }

        public Criteria andSdCustom1In(List<String> values) {
            addCriterion("sd_custom1 in", values, "sdCustom1");
            return (Criteria) this;
        }

        public Criteria andSdCustom1NotIn(List<String> values) {
            addCriterion("sd_custom1 not in", values, "sdCustom1");
            return (Criteria) this;
        }

        public Criteria andSdCustom1Between(String value1, String value2) {
            addCriterion("sd_custom1 between", value1, value2, "sdCustom1");
            return (Criteria) this;
        }

        public Criteria andSdCustom1NotBetween(String value1, String value2) {
            addCriterion("sd_custom1 not between", value1, value2, "sdCustom1");
            return (Criteria) this;
        }

        public Criteria andSdCustom2IsNull() {
            addCriterion("sd_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andSdCustom2IsNotNull() {
            addCriterion("sd_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSdCustom2EqualTo(String value) {
            addCriterion("sd_custom2 =", value, "sdCustom2");
            return (Criteria) this;
        }

        public Criteria andSdCustom2NotEqualTo(String value) {
            addCriterion("sd_custom2 <>", value, "sdCustom2");
            return (Criteria) this;
        }

        public Criteria andSdCustom2GreaterThan(String value) {
            addCriterion("sd_custom2 >", value, "sdCustom2");
            return (Criteria) this;
        }

        public Criteria andSdCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("sd_custom2 >=", value, "sdCustom2");
            return (Criteria) this;
        }

        public Criteria andSdCustom2LessThan(String value) {
            addCriterion("sd_custom2 <", value, "sdCustom2");
            return (Criteria) this;
        }

        public Criteria andSdCustom2LessThanOrEqualTo(String value) {
            addCriterion("sd_custom2 <=", value, "sdCustom2");
            return (Criteria) this;
        }

        public Criteria andSdCustom2Like(String value) {
            addCriterion("sd_custom2 like", value, "sdCustom2");
            return (Criteria) this;
        }

        public Criteria andSdCustom2NotLike(String value) {
            addCriterion("sd_custom2 not like", value, "sdCustom2");
            return (Criteria) this;
        }

        public Criteria andSdCustom2In(List<String> values) {
            addCriterion("sd_custom2 in", values, "sdCustom2");
            return (Criteria) this;
        }

        public Criteria andSdCustom2NotIn(List<String> values) {
            addCriterion("sd_custom2 not in", values, "sdCustom2");
            return (Criteria) this;
        }

        public Criteria andSdCustom2Between(String value1, String value2) {
            addCriterion("sd_custom2 between", value1, value2, "sdCustom2");
            return (Criteria) this;
        }

        public Criteria andSdCustom2NotBetween(String value1, String value2) {
            addCriterion("sd_custom2 not between", value1, value2, "sdCustom2");
            return (Criteria) this;
        }

        public Criteria andSdCustom3IsNull() {
            addCriterion("sd_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andSdCustom3IsNotNull() {
            addCriterion("sd_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSdCustom3EqualTo(String value) {
            addCriterion("sd_custom3 =", value, "sdCustom3");
            return (Criteria) this;
        }

        public Criteria andSdCustom3NotEqualTo(String value) {
            addCriterion("sd_custom3 <>", value, "sdCustom3");
            return (Criteria) this;
        }

        public Criteria andSdCustom3GreaterThan(String value) {
            addCriterion("sd_custom3 >", value, "sdCustom3");
            return (Criteria) this;
        }

        public Criteria andSdCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("sd_custom3 >=", value, "sdCustom3");
            return (Criteria) this;
        }

        public Criteria andSdCustom3LessThan(String value) {
            addCriterion("sd_custom3 <", value, "sdCustom3");
            return (Criteria) this;
        }

        public Criteria andSdCustom3LessThanOrEqualTo(String value) {
            addCriterion("sd_custom3 <=", value, "sdCustom3");
            return (Criteria) this;
        }

        public Criteria andSdCustom3Like(String value) {
            addCriterion("sd_custom3 like", value, "sdCustom3");
            return (Criteria) this;
        }

        public Criteria andSdCustom3NotLike(String value) {
            addCriterion("sd_custom3 not like", value, "sdCustom3");
            return (Criteria) this;
        }

        public Criteria andSdCustom3In(List<String> values) {
            addCriterion("sd_custom3 in", values, "sdCustom3");
            return (Criteria) this;
        }

        public Criteria andSdCustom3NotIn(List<String> values) {
            addCriterion("sd_custom3 not in", values, "sdCustom3");
            return (Criteria) this;
        }

        public Criteria andSdCustom3Between(String value1, String value2) {
            addCriterion("sd_custom3 between", value1, value2, "sdCustom3");
            return (Criteria) this;
        }

        public Criteria andSdCustom3NotBetween(String value1, String value2) {
            addCriterion("sd_custom3 not between", value1, value2, "sdCustom3");
            return (Criteria) this;
        }

        public Criteria andSdCustom4IsNull() {
            addCriterion("sd_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andSdCustom4IsNotNull() {
            addCriterion("sd_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andSdCustom4EqualTo(String value) {
            addCriterion("sd_custom4 =", value, "sdCustom4");
            return (Criteria) this;
        }

        public Criteria andSdCustom4NotEqualTo(String value) {
            addCriterion("sd_custom4 <>", value, "sdCustom4");
            return (Criteria) this;
        }

        public Criteria andSdCustom4GreaterThan(String value) {
            addCriterion("sd_custom4 >", value, "sdCustom4");
            return (Criteria) this;
        }

        public Criteria andSdCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("sd_custom4 >=", value, "sdCustom4");
            return (Criteria) this;
        }

        public Criteria andSdCustom4LessThan(String value) {
            addCriterion("sd_custom4 <", value, "sdCustom4");
            return (Criteria) this;
        }

        public Criteria andSdCustom4LessThanOrEqualTo(String value) {
            addCriterion("sd_custom4 <=", value, "sdCustom4");
            return (Criteria) this;
        }

        public Criteria andSdCustom4Like(String value) {
            addCriterion("sd_custom4 like", value, "sdCustom4");
            return (Criteria) this;
        }

        public Criteria andSdCustom4NotLike(String value) {
            addCriterion("sd_custom4 not like", value, "sdCustom4");
            return (Criteria) this;
        }

        public Criteria andSdCustom4In(List<String> values) {
            addCriterion("sd_custom4 in", values, "sdCustom4");
            return (Criteria) this;
        }

        public Criteria andSdCustom4NotIn(List<String> values) {
            addCriterion("sd_custom4 not in", values, "sdCustom4");
            return (Criteria) this;
        }

        public Criteria andSdCustom4Between(String value1, String value2) {
            addCriterion("sd_custom4 between", value1, value2, "sdCustom4");
            return (Criteria) this;
        }

        public Criteria andSdCustom4NotBetween(String value1, String value2) {
            addCriterion("sd_custom4 not between", value1, value2, "sdCustom4");
            return (Criteria) this;
        }

        public Criteria andSdCustom5IsNull() {
            addCriterion("sd_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andSdCustom5IsNotNull() {
            addCriterion("sd_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andSdCustom5EqualTo(String value) {
            addCriterion("sd_custom5 =", value, "sdCustom5");
            return (Criteria) this;
        }

        public Criteria andSdCustom5NotEqualTo(String value) {
            addCriterion("sd_custom5 <>", value, "sdCustom5");
            return (Criteria) this;
        }

        public Criteria andSdCustom5GreaterThan(String value) {
            addCriterion("sd_custom5 >", value, "sdCustom5");
            return (Criteria) this;
        }

        public Criteria andSdCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("sd_custom5 >=", value, "sdCustom5");
            return (Criteria) this;
        }

        public Criteria andSdCustom5LessThan(String value) {
            addCriterion("sd_custom5 <", value, "sdCustom5");
            return (Criteria) this;
        }

        public Criteria andSdCustom5LessThanOrEqualTo(String value) {
            addCriterion("sd_custom5 <=", value, "sdCustom5");
            return (Criteria) this;
        }

        public Criteria andSdCustom5Like(String value) {
            addCriterion("sd_custom5 like", value, "sdCustom5");
            return (Criteria) this;
        }

        public Criteria andSdCustom5NotLike(String value) {
            addCriterion("sd_custom5 not like", value, "sdCustom5");
            return (Criteria) this;
        }

        public Criteria andSdCustom5In(List<String> values) {
            addCriterion("sd_custom5 in", values, "sdCustom5");
            return (Criteria) this;
        }

        public Criteria andSdCustom5NotIn(List<String> values) {
            addCriterion("sd_custom5 not in", values, "sdCustom5");
            return (Criteria) this;
        }

        public Criteria andSdCustom5Between(String value1, String value2) {
            addCriterion("sd_custom5 between", value1, value2, "sdCustom5");
            return (Criteria) this;
        }

        public Criteria andSdCustom5NotBetween(String value1, String value2) {
            addCriterion("sd_custom5 not between", value1, value2, "sdCustom5");
            return (Criteria) this;
        }

        public Criteria andSdCustom6IsNull() {
            addCriterion("sd_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andSdCustom6IsNotNull() {
            addCriterion("sd_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andSdCustom6EqualTo(String value) {
            addCriterion("sd_custom6 =", value, "sdCustom6");
            return (Criteria) this;
        }

        public Criteria andSdCustom6NotEqualTo(String value) {
            addCriterion("sd_custom6 <>", value, "sdCustom6");
            return (Criteria) this;
        }

        public Criteria andSdCustom6GreaterThan(String value) {
            addCriterion("sd_custom6 >", value, "sdCustom6");
            return (Criteria) this;
        }

        public Criteria andSdCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("sd_custom6 >=", value, "sdCustom6");
            return (Criteria) this;
        }

        public Criteria andSdCustom6LessThan(String value) {
            addCriterion("sd_custom6 <", value, "sdCustom6");
            return (Criteria) this;
        }

        public Criteria andSdCustom6LessThanOrEqualTo(String value) {
            addCriterion("sd_custom6 <=", value, "sdCustom6");
            return (Criteria) this;
        }

        public Criteria andSdCustom6Like(String value) {
            addCriterion("sd_custom6 like", value, "sdCustom6");
            return (Criteria) this;
        }

        public Criteria andSdCustom6NotLike(String value) {
            addCriterion("sd_custom6 not like", value, "sdCustom6");
            return (Criteria) this;
        }

        public Criteria andSdCustom6In(List<String> values) {
            addCriterion("sd_custom6 in", values, "sdCustom6");
            return (Criteria) this;
        }

        public Criteria andSdCustom6NotIn(List<String> values) {
            addCriterion("sd_custom6 not in", values, "sdCustom6");
            return (Criteria) this;
        }

        public Criteria andSdCustom6Between(String value1, String value2) {
            addCriterion("sd_custom6 between", value1, value2, "sdCustom6");
            return (Criteria) this;
        }

        public Criteria andSdCustom6NotBetween(String value1, String value2) {
            addCriterion("sd_custom6 not between", value1, value2, "sdCustom6");
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