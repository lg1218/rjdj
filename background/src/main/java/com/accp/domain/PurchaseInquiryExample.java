package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseInquiryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseInquiryExample() {
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

        public Criteria andPiIdIsNull() {
            addCriterion("pi_id is null");
            return (Criteria) this;
        }

        public Criteria andPiIdIsNotNull() {
            addCriterion("pi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPiIdEqualTo(String value) {
            addCriterion("pi_id =", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotEqualTo(String value) {
            addCriterion("pi_id <>", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdGreaterThan(String value) {
            addCriterion("pi_id >", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdGreaterThanOrEqualTo(String value) {
            addCriterion("pi_id >=", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLessThan(String value) {
            addCriterion("pi_id <", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLessThanOrEqualTo(String value) {
            addCriterion("pi_id <=", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLike(String value) {
            addCriterion("pi_id like", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotLike(String value) {
            addCriterion("pi_id not like", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdIn(List<String> values) {
            addCriterion("pi_id in", values, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotIn(List<String> values) {
            addCriterion("pi_id not in", values, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdBetween(String value1, String value2) {
            addCriterion("pi_id between", value1, value2, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotBetween(String value1, String value2) {
            addCriterion("pi_id not between", value1, value2, "piId");
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

        public Criteria andPiSupplierAddressIsNull() {
            addCriterion("pi_supplier_address is null");
            return (Criteria) this;
        }

        public Criteria andPiSupplierAddressIsNotNull() {
            addCriterion("pi_supplier_address is not null");
            return (Criteria) this;
        }

        public Criteria andPiSupplierAddressEqualTo(String value) {
            addCriterion("pi_supplier_address =", value, "piSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPiSupplierAddressNotEqualTo(String value) {
            addCriterion("pi_supplier_address <>", value, "piSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPiSupplierAddressGreaterThan(String value) {
            addCriterion("pi_supplier_address >", value, "piSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPiSupplierAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pi_supplier_address >=", value, "piSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPiSupplierAddressLessThan(String value) {
            addCriterion("pi_supplier_address <", value, "piSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPiSupplierAddressLessThanOrEqualTo(String value) {
            addCriterion("pi_supplier_address <=", value, "piSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPiSupplierAddressLike(String value) {
            addCriterion("pi_supplier_address like", value, "piSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPiSupplierAddressNotLike(String value) {
            addCriterion("pi_supplier_address not like", value, "piSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPiSupplierAddressIn(List<String> values) {
            addCriterion("pi_supplier_address in", values, "piSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPiSupplierAddressNotIn(List<String> values) {
            addCriterion("pi_supplier_address not in", values, "piSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPiSupplierAddressBetween(String value1, String value2) {
            addCriterion("pi_supplier_address between", value1, value2, "piSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPiSupplierAddressNotBetween(String value1, String value2) {
            addCriterion("pi_supplier_address not between", value1, value2, "piSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andPitIdIsNull() {
            addCriterion("pit_id is null");
            return (Criteria) this;
        }

        public Criteria andPitIdIsNotNull() {
            addCriterion("pit_id is not null");
            return (Criteria) this;
        }

        public Criteria andPitIdEqualTo(String value) {
            addCriterion("pit_id =", value, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdNotEqualTo(String value) {
            addCriterion("pit_id <>", value, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdGreaterThan(String value) {
            addCriterion("pit_id >", value, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdGreaterThanOrEqualTo(String value) {
            addCriterion("pit_id >=", value, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdLessThan(String value) {
            addCriterion("pit_id <", value, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdLessThanOrEqualTo(String value) {
            addCriterion("pit_id <=", value, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdLike(String value) {
            addCriterion("pit_id like", value, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdNotLike(String value) {
            addCriterion("pit_id not like", value, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdIn(List<String> values) {
            addCriterion("pit_id in", values, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdNotIn(List<String> values) {
            addCriterion("pit_id not in", values, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdBetween(String value1, String value2) {
            addCriterion("pit_id between", value1, value2, "pitId");
            return (Criteria) this;
        }

        public Criteria andPitIdNotBetween(String value1, String value2) {
            addCriterion("pit_id not between", value1, value2, "pitId");
            return (Criteria) this;
        }

        public Criteria andPiPriceIncludeTaxIsNull() {
            addCriterion("pi_price_include_tax is null");
            return (Criteria) this;
        }

        public Criteria andPiPriceIncludeTaxIsNotNull() {
            addCriterion("pi_price_include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPiPriceIncludeTaxEqualTo(String value) {
            addCriterion("pi_price_include_tax =", value, "piPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPiPriceIncludeTaxNotEqualTo(String value) {
            addCriterion("pi_price_include_tax <>", value, "piPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPiPriceIncludeTaxGreaterThan(String value) {
            addCriterion("pi_price_include_tax >", value, "piPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPiPriceIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("pi_price_include_tax >=", value, "piPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPiPriceIncludeTaxLessThan(String value) {
            addCriterion("pi_price_include_tax <", value, "piPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPiPriceIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("pi_price_include_tax <=", value, "piPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPiPriceIncludeTaxLike(String value) {
            addCriterion("pi_price_include_tax like", value, "piPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPiPriceIncludeTaxNotLike(String value) {
            addCriterion("pi_price_include_tax not like", value, "piPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPiPriceIncludeTaxIn(List<String> values) {
            addCriterion("pi_price_include_tax in", values, "piPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPiPriceIncludeTaxNotIn(List<String> values) {
            addCriterion("pi_price_include_tax not in", values, "piPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPiPriceIncludeTaxBetween(String value1, String value2) {
            addCriterion("pi_price_include_tax between", value1, value2, "piPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPiPriceIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("pi_price_include_tax not between", value1, value2, "piPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andPiSingleStatusIsNull() {
            addCriterion("pi_single_status is null");
            return (Criteria) this;
        }

        public Criteria andPiSingleStatusIsNotNull() {
            addCriterion("pi_single_status is not null");
            return (Criteria) this;
        }

        public Criteria andPiSingleStatusEqualTo(String value) {
            addCriterion("pi_single_status =", value, "piSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPiSingleStatusNotEqualTo(String value) {
            addCriterion("pi_single_status <>", value, "piSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPiSingleStatusGreaterThan(String value) {
            addCriterion("pi_single_status >", value, "piSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPiSingleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pi_single_status >=", value, "piSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPiSingleStatusLessThan(String value) {
            addCriterion("pi_single_status <", value, "piSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPiSingleStatusLessThanOrEqualTo(String value) {
            addCriterion("pi_single_status <=", value, "piSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPiSingleStatusLike(String value) {
            addCriterion("pi_single_status like", value, "piSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPiSingleStatusNotLike(String value) {
            addCriterion("pi_single_status not like", value, "piSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPiSingleStatusIn(List<String> values) {
            addCriterion("pi_single_status in", values, "piSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPiSingleStatusNotIn(List<String> values) {
            addCriterion("pi_single_status not in", values, "piSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPiSingleStatusBetween(String value1, String value2) {
            addCriterion("pi_single_status between", value1, value2, "piSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPiSingleStatusNotBetween(String value1, String value2) {
            addCriterion("pi_single_status not between", value1, value2, "piSingleStatus");
            return (Criteria) this;
        }

        public Criteria andPiDocumentDateIsNull() {
            addCriterion("pi_document_date is null");
            return (Criteria) this;
        }

        public Criteria andPiDocumentDateIsNotNull() {
            addCriterion("pi_document_date is not null");
            return (Criteria) this;
        }

        public Criteria andPiDocumentDateEqualTo(Date value) {
            addCriterionForJDBCDate("pi_document_date =", value, "piDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPiDocumentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pi_document_date <>", value, "piDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPiDocumentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pi_document_date >", value, "piDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPiDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pi_document_date >=", value, "piDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPiDocumentDateLessThan(Date value) {
            addCriterionForJDBCDate("pi_document_date <", value, "piDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPiDocumentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pi_document_date <=", value, "piDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPiDocumentDateIn(List<Date> values) {
            addCriterionForJDBCDate("pi_document_date in", values, "piDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPiDocumentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pi_document_date not in", values, "piDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPiDocumentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pi_document_date between", value1, value2, "piDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPiDocumentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pi_document_date not between", value1, value2, "piDocumentDate");
            return (Criteria) this;
        }

        public Criteria andPiDocumentNumberIsNull() {
            addCriterion("pi_document_number is null");
            return (Criteria) this;
        }

        public Criteria andPiDocumentNumberIsNotNull() {
            addCriterion("pi_document_number is not null");
            return (Criteria) this;
        }

        public Criteria andPiDocumentNumberEqualTo(String value) {
            addCriterion("pi_document_number =", value, "piDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPiDocumentNumberNotEqualTo(String value) {
            addCriterion("pi_document_number <>", value, "piDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPiDocumentNumberGreaterThan(String value) {
            addCriterion("pi_document_number >", value, "piDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPiDocumentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pi_document_number >=", value, "piDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPiDocumentNumberLessThan(String value) {
            addCriterion("pi_document_number <", value, "piDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPiDocumentNumberLessThanOrEqualTo(String value) {
            addCriterion("pi_document_number <=", value, "piDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPiDocumentNumberLike(String value) {
            addCriterion("pi_document_number like", value, "piDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPiDocumentNumberNotLike(String value) {
            addCriterion("pi_document_number not like", value, "piDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPiDocumentNumberIn(List<String> values) {
            addCriterion("pi_document_number in", values, "piDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPiDocumentNumberNotIn(List<String> values) {
            addCriterion("pi_document_number not in", values, "piDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPiDocumentNumberBetween(String value1, String value2) {
            addCriterion("pi_document_number between", value1, value2, "piDocumentNumber");
            return (Criteria) this;
        }

        public Criteria andPiDocumentNumberNotBetween(String value1, String value2) {
            addCriterion("pi_document_number not between", value1, value2, "piDocumentNumber");
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

        public Criteria andPiExchangeRateIsNull() {
            addCriterion("pi_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andPiExchangeRateIsNotNull() {
            addCriterion("pi_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPiExchangeRateEqualTo(Float value) {
            addCriterion("pi_exchange_rate =", value, "piExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPiExchangeRateNotEqualTo(Float value) {
            addCriterion("pi_exchange_rate <>", value, "piExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPiExchangeRateGreaterThan(Float value) {
            addCriterion("pi_exchange_rate >", value, "piExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPiExchangeRateGreaterThanOrEqualTo(Float value) {
            addCriterion("pi_exchange_rate >=", value, "piExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPiExchangeRateLessThan(Float value) {
            addCriterion("pi_exchange_rate <", value, "piExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPiExchangeRateLessThanOrEqualTo(Float value) {
            addCriterion("pi_exchange_rate <=", value, "piExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPiExchangeRateIn(List<Float> values) {
            addCriterion("pi_exchange_rate in", values, "piExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPiExchangeRateNotIn(List<Float> values) {
            addCriterion("pi_exchange_rate not in", values, "piExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPiExchangeRateBetween(Float value1, Float value2) {
            addCriterion("pi_exchange_rate between", value1, value2, "piExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPiExchangeRateNotBetween(Float value1, Float value2) {
            addCriterion("pi_exchange_rate not between", value1, value2, "piExchangeRate");
            return (Criteria) this;
        }

        public Criteria andPiSunnumIsNull() {
            addCriterion("pi_sunnum is null");
            return (Criteria) this;
        }

        public Criteria andPiSunnumIsNotNull() {
            addCriterion("pi_sunnum is not null");
            return (Criteria) this;
        }

        public Criteria andPiSunnumEqualTo(Integer value) {
            addCriterion("pi_sunnum =", value, "piSunnum");
            return (Criteria) this;
        }

        public Criteria andPiSunnumNotEqualTo(Integer value) {
            addCriterion("pi_sunnum <>", value, "piSunnum");
            return (Criteria) this;
        }

        public Criteria andPiSunnumGreaterThan(Integer value) {
            addCriterion("pi_sunnum >", value, "piSunnum");
            return (Criteria) this;
        }

        public Criteria andPiSunnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pi_sunnum >=", value, "piSunnum");
            return (Criteria) this;
        }

        public Criteria andPiSunnumLessThan(Integer value) {
            addCriterion("pi_sunnum <", value, "piSunnum");
            return (Criteria) this;
        }

        public Criteria andPiSunnumLessThanOrEqualTo(Integer value) {
            addCriterion("pi_sunnum <=", value, "piSunnum");
            return (Criteria) this;
        }

        public Criteria andPiSunnumIn(List<Integer> values) {
            addCriterion("pi_sunnum in", values, "piSunnum");
            return (Criteria) this;
        }

        public Criteria andPiSunnumNotIn(List<Integer> values) {
            addCriterion("pi_sunnum not in", values, "piSunnum");
            return (Criteria) this;
        }

        public Criteria andPiSunnumBetween(Integer value1, Integer value2) {
            addCriterion("pi_sunnum between", value1, value2, "piSunnum");
            return (Criteria) this;
        }

        public Criteria andPiSunnumNotBetween(Integer value1, Integer value2) {
            addCriterion("pi_sunnum not between", value1, value2, "piSunnum");
            return (Criteria) this;
        }

        public Criteria andPiSunmoneyIsNull() {
            addCriterion("pi_sunmoney is null");
            return (Criteria) this;
        }

        public Criteria andPiSunmoneyIsNotNull() {
            addCriterion("pi_sunmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPiSunmoneyEqualTo(Float value) {
            addCriterion("pi_sunmoney =", value, "piSunmoney");
            return (Criteria) this;
        }

        public Criteria andPiSunmoneyNotEqualTo(Float value) {
            addCriterion("pi_sunmoney <>", value, "piSunmoney");
            return (Criteria) this;
        }

        public Criteria andPiSunmoneyGreaterThan(Float value) {
            addCriterion("pi_sunmoney >", value, "piSunmoney");
            return (Criteria) this;
        }

        public Criteria andPiSunmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("pi_sunmoney >=", value, "piSunmoney");
            return (Criteria) this;
        }

        public Criteria andPiSunmoneyLessThan(Float value) {
            addCriterion("pi_sunmoney <", value, "piSunmoney");
            return (Criteria) this;
        }

        public Criteria andPiSunmoneyLessThanOrEqualTo(Float value) {
            addCriterion("pi_sunmoney <=", value, "piSunmoney");
            return (Criteria) this;
        }

        public Criteria andPiSunmoneyIn(List<Float> values) {
            addCriterion("pi_sunmoney in", values, "piSunmoney");
            return (Criteria) this;
        }

        public Criteria andPiSunmoneyNotIn(List<Float> values) {
            addCriterion("pi_sunmoney not in", values, "piSunmoney");
            return (Criteria) this;
        }

        public Criteria andPiSunmoneyBetween(Float value1, Float value2) {
            addCriterion("pi_sunmoney between", value1, value2, "piSunmoney");
            return (Criteria) this;
        }

        public Criteria andPiSunmoneyNotBetween(Float value1, Float value2) {
            addCriterion("pi_sunmoney not between", value1, value2, "piSunmoney");
            return (Criteria) this;
        }

        public Criteria andPiTaxIsNull() {
            addCriterion("pi_tax is null");
            return (Criteria) this;
        }

        public Criteria andPiTaxIsNotNull() {
            addCriterion("pi_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPiTaxEqualTo(Float value) {
            addCriterion("pi_tax =", value, "piTax");
            return (Criteria) this;
        }

        public Criteria andPiTaxNotEqualTo(Float value) {
            addCriterion("pi_tax <>", value, "piTax");
            return (Criteria) this;
        }

        public Criteria andPiTaxGreaterThan(Float value) {
            addCriterion("pi_tax >", value, "piTax");
            return (Criteria) this;
        }

        public Criteria andPiTaxGreaterThanOrEqualTo(Float value) {
            addCriterion("pi_tax >=", value, "piTax");
            return (Criteria) this;
        }

        public Criteria andPiTaxLessThan(Float value) {
            addCriterion("pi_tax <", value, "piTax");
            return (Criteria) this;
        }

        public Criteria andPiTaxLessThanOrEqualTo(Float value) {
            addCriterion("pi_tax <=", value, "piTax");
            return (Criteria) this;
        }

        public Criteria andPiTaxIn(List<Float> values) {
            addCriterion("pi_tax in", values, "piTax");
            return (Criteria) this;
        }

        public Criteria andPiTaxNotIn(List<Float> values) {
            addCriterion("pi_tax not in", values, "piTax");
            return (Criteria) this;
        }

        public Criteria andPiTaxBetween(Float value1, Float value2) {
            addCriterion("pi_tax between", value1, value2, "piTax");
            return (Criteria) this;
        }

        public Criteria andPiTaxNotBetween(Float value1, Float value2) {
            addCriterion("pi_tax not between", value1, value2, "piTax");
            return (Criteria) this;
        }

        public Criteria andPiIncludeTaxAmountIsNull() {
            addCriterion("pi_include_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andPiIncludeTaxAmountIsNotNull() {
            addCriterion("pi_include_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPiIncludeTaxAmountEqualTo(Float value) {
            addCriterion("pi_include_tax_amount =", value, "piIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPiIncludeTaxAmountNotEqualTo(Float value) {
            addCriterion("pi_include_tax_amount <>", value, "piIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPiIncludeTaxAmountGreaterThan(Float value) {
            addCriterion("pi_include_tax_amount >", value, "piIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPiIncludeTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("pi_include_tax_amount >=", value, "piIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPiIncludeTaxAmountLessThan(Float value) {
            addCriterion("pi_include_tax_amount <", value, "piIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPiIncludeTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("pi_include_tax_amount <=", value, "piIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPiIncludeTaxAmountIn(List<Float> values) {
            addCriterion("pi_include_tax_amount in", values, "piIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPiIncludeTaxAmountNotIn(List<Float> values) {
            addCriterion("pi_include_tax_amount not in", values, "piIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPiIncludeTaxAmountBetween(Float value1, Float value2) {
            addCriterion("pi_include_tax_amount between", value1, value2, "piIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPiIncludeTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("pi_include_tax_amount not between", value1, value2, "piIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPiDeliveryAddressIsNull() {
            addCriterion("pi_delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andPiDeliveryAddressIsNotNull() {
            addCriterion("pi_delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andPiDeliveryAddressEqualTo(String value) {
            addCriterion("pi_delivery_address =", value, "piDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPiDeliveryAddressNotEqualTo(String value) {
            addCriterion("pi_delivery_address <>", value, "piDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPiDeliveryAddressGreaterThan(String value) {
            addCriterion("pi_delivery_address >", value, "piDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPiDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pi_delivery_address >=", value, "piDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPiDeliveryAddressLessThan(String value) {
            addCriterion("pi_delivery_address <", value, "piDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPiDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("pi_delivery_address <=", value, "piDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPiDeliveryAddressLike(String value) {
            addCriterion("pi_delivery_address like", value, "piDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPiDeliveryAddressNotLike(String value) {
            addCriterion("pi_delivery_address not like", value, "piDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPiDeliveryAddressIn(List<String> values) {
            addCriterion("pi_delivery_address in", values, "piDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPiDeliveryAddressNotIn(List<String> values) {
            addCriterion("pi_delivery_address not in", values, "piDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPiDeliveryAddressBetween(String value1, String value2) {
            addCriterion("pi_delivery_address between", value1, value2, "piDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPiDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("pi_delivery_address not between", value1, value2, "piDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andPiBuyerIsNull() {
            addCriterion("pi_buyer is null");
            return (Criteria) this;
        }

        public Criteria andPiBuyerIsNotNull() {
            addCriterion("pi_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andPiBuyerEqualTo(String value) {
            addCriterion("pi_buyer =", value, "piBuyer");
            return (Criteria) this;
        }

        public Criteria andPiBuyerNotEqualTo(String value) {
            addCriterion("pi_buyer <>", value, "piBuyer");
            return (Criteria) this;
        }

        public Criteria andPiBuyerGreaterThan(String value) {
            addCriterion("pi_buyer >", value, "piBuyer");
            return (Criteria) this;
        }

        public Criteria andPiBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("pi_buyer >=", value, "piBuyer");
            return (Criteria) this;
        }

        public Criteria andPiBuyerLessThan(String value) {
            addCriterion("pi_buyer <", value, "piBuyer");
            return (Criteria) this;
        }

        public Criteria andPiBuyerLessThanOrEqualTo(String value) {
            addCriterion("pi_buyer <=", value, "piBuyer");
            return (Criteria) this;
        }

        public Criteria andPiBuyerLike(String value) {
            addCriterion("pi_buyer like", value, "piBuyer");
            return (Criteria) this;
        }

        public Criteria andPiBuyerNotLike(String value) {
            addCriterion("pi_buyer not like", value, "piBuyer");
            return (Criteria) this;
        }

        public Criteria andPiBuyerIn(List<String> values) {
            addCriterion("pi_buyer in", values, "piBuyer");
            return (Criteria) this;
        }

        public Criteria andPiBuyerNotIn(List<String> values) {
            addCriterion("pi_buyer not in", values, "piBuyer");
            return (Criteria) this;
        }

        public Criteria andPiBuyerBetween(String value1, String value2) {
            addCriterion("pi_buyer between", value1, value2, "piBuyer");
            return (Criteria) this;
        }

        public Criteria andPiBuyerNotBetween(String value1, String value2) {
            addCriterion("pi_buyer not between", value1, value2, "piBuyer");
            return (Criteria) this;
        }

        public Criteria andPiBelongsSectionIsNull() {
            addCriterion("pi_belongs_section is null");
            return (Criteria) this;
        }

        public Criteria andPiBelongsSectionIsNotNull() {
            addCriterion("pi_belongs_section is not null");
            return (Criteria) this;
        }

        public Criteria andPiBelongsSectionEqualTo(String value) {
            addCriterion("pi_belongs_section =", value, "piBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPiBelongsSectionNotEqualTo(String value) {
            addCriterion("pi_belongs_section <>", value, "piBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPiBelongsSectionGreaterThan(String value) {
            addCriterion("pi_belongs_section >", value, "piBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPiBelongsSectionGreaterThanOrEqualTo(String value) {
            addCriterion("pi_belongs_section >=", value, "piBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPiBelongsSectionLessThan(String value) {
            addCriterion("pi_belongs_section <", value, "piBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPiBelongsSectionLessThanOrEqualTo(String value) {
            addCriterion("pi_belongs_section <=", value, "piBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPiBelongsSectionLike(String value) {
            addCriterion("pi_belongs_section like", value, "piBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPiBelongsSectionNotLike(String value) {
            addCriterion("pi_belongs_section not like", value, "piBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPiBelongsSectionIn(List<String> values) {
            addCriterion("pi_belongs_section in", values, "piBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPiBelongsSectionNotIn(List<String> values) {
            addCriterion("pi_belongs_section not in", values, "piBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPiBelongsSectionBetween(String value1, String value2) {
            addCriterion("pi_belongs_section between", value1, value2, "piBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPiBelongsSectionNotBetween(String value1, String value2) {
            addCriterion("pi_belongs_section not between", value1, value2, "piBelongsSection");
            return (Criteria) this;
        }

        public Criteria andPiBelongsProjectIsNull() {
            addCriterion("pi_belongs_project is null");
            return (Criteria) this;
        }

        public Criteria andPiBelongsProjectIsNotNull() {
            addCriterion("pi_belongs_project is not null");
            return (Criteria) this;
        }

        public Criteria andPiBelongsProjectEqualTo(String value) {
            addCriterion("pi_belongs_project =", value, "piBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPiBelongsProjectNotEqualTo(String value) {
            addCriterion("pi_belongs_project <>", value, "piBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPiBelongsProjectGreaterThan(String value) {
            addCriterion("pi_belongs_project >", value, "piBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPiBelongsProjectGreaterThanOrEqualTo(String value) {
            addCriterion("pi_belongs_project >=", value, "piBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPiBelongsProjectLessThan(String value) {
            addCriterion("pi_belongs_project <", value, "piBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPiBelongsProjectLessThanOrEqualTo(String value) {
            addCriterion("pi_belongs_project <=", value, "piBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPiBelongsProjectLike(String value) {
            addCriterion("pi_belongs_project like", value, "piBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPiBelongsProjectNotLike(String value) {
            addCriterion("pi_belongs_project not like", value, "piBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPiBelongsProjectIn(List<String> values) {
            addCriterion("pi_belongs_project in", values, "piBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPiBelongsProjectNotIn(List<String> values) {
            addCriterion("pi_belongs_project not in", values, "piBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPiBelongsProjectBetween(String value1, String value2) {
            addCriterion("pi_belongs_project between", value1, value2, "piBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPiBelongsProjectNotBetween(String value1, String value2) {
            addCriterion("pi_belongs_project not between", value1, value2, "piBelongsProject");
            return (Criteria) this;
        }

        public Criteria andPiExecutorIsNull() {
            addCriterion("pi_executor is null");
            return (Criteria) this;
        }

        public Criteria andPiExecutorIsNotNull() {
            addCriterion("pi_executor is not null");
            return (Criteria) this;
        }

        public Criteria andPiExecutorEqualTo(String value) {
            addCriterion("pi_executor =", value, "piExecutor");
            return (Criteria) this;
        }

        public Criteria andPiExecutorNotEqualTo(String value) {
            addCriterion("pi_executor <>", value, "piExecutor");
            return (Criteria) this;
        }

        public Criteria andPiExecutorGreaterThan(String value) {
            addCriterion("pi_executor >", value, "piExecutor");
            return (Criteria) this;
        }

        public Criteria andPiExecutorGreaterThanOrEqualTo(String value) {
            addCriterion("pi_executor >=", value, "piExecutor");
            return (Criteria) this;
        }

        public Criteria andPiExecutorLessThan(String value) {
            addCriterion("pi_executor <", value, "piExecutor");
            return (Criteria) this;
        }

        public Criteria andPiExecutorLessThanOrEqualTo(String value) {
            addCriterion("pi_executor <=", value, "piExecutor");
            return (Criteria) this;
        }

        public Criteria andPiExecutorLike(String value) {
            addCriterion("pi_executor like", value, "piExecutor");
            return (Criteria) this;
        }

        public Criteria andPiExecutorNotLike(String value) {
            addCriterion("pi_executor not like", value, "piExecutor");
            return (Criteria) this;
        }

        public Criteria andPiExecutorIn(List<String> values) {
            addCriterion("pi_executor in", values, "piExecutor");
            return (Criteria) this;
        }

        public Criteria andPiExecutorNotIn(List<String> values) {
            addCriterion("pi_executor not in", values, "piExecutor");
            return (Criteria) this;
        }

        public Criteria andPiExecutorBetween(String value1, String value2) {
            addCriterion("pi_executor between", value1, value2, "piExecutor");
            return (Criteria) this;
        }

        public Criteria andPiExecutorNotBetween(String value1, String value2) {
            addCriterion("pi_executor not between", value1, value2, "piExecutor");
            return (Criteria) this;
        }

        public Criteria andPiCheckagainStaffIsNull() {
            addCriterion("pi_checkagain_staff is null");
            return (Criteria) this;
        }

        public Criteria andPiCheckagainStaffIsNotNull() {
            addCriterion("pi_checkagain_staff is not null");
            return (Criteria) this;
        }

        public Criteria andPiCheckagainStaffEqualTo(String value) {
            addCriterion("pi_checkagain_staff =", value, "piCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPiCheckagainStaffNotEqualTo(String value) {
            addCriterion("pi_checkagain_staff <>", value, "piCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPiCheckagainStaffGreaterThan(String value) {
            addCriterion("pi_checkagain_staff >", value, "piCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPiCheckagainStaffGreaterThanOrEqualTo(String value) {
            addCriterion("pi_checkagain_staff >=", value, "piCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPiCheckagainStaffLessThan(String value) {
            addCriterion("pi_checkagain_staff <", value, "piCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPiCheckagainStaffLessThanOrEqualTo(String value) {
            addCriterion("pi_checkagain_staff <=", value, "piCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPiCheckagainStaffLike(String value) {
            addCriterion("pi_checkagain_staff like", value, "piCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPiCheckagainStaffNotLike(String value) {
            addCriterion("pi_checkagain_staff not like", value, "piCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPiCheckagainStaffIn(List<String> values) {
            addCriterion("pi_checkagain_staff in", values, "piCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPiCheckagainStaffNotIn(List<String> values) {
            addCriterion("pi_checkagain_staff not in", values, "piCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPiCheckagainStaffBetween(String value1, String value2) {
            addCriterion("pi_checkagain_staff between", value1, value2, "piCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPiCheckagainStaffNotBetween(String value1, String value2) {
            addCriterion("pi_checkagain_staff not between", value1, value2, "piCheckagainStaff");
            return (Criteria) this;
        }

        public Criteria andPiHeaderProvisionIsNull() {
            addCriterion("pi_header_provision is null");
            return (Criteria) this;
        }

        public Criteria andPiHeaderProvisionIsNotNull() {
            addCriterion("pi_header_provision is not null");
            return (Criteria) this;
        }

        public Criteria andPiHeaderProvisionEqualTo(String value) {
            addCriterion("pi_header_provision =", value, "piHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPiHeaderProvisionNotEqualTo(String value) {
            addCriterion("pi_header_provision <>", value, "piHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPiHeaderProvisionGreaterThan(String value) {
            addCriterion("pi_header_provision >", value, "piHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPiHeaderProvisionGreaterThanOrEqualTo(String value) {
            addCriterion("pi_header_provision >=", value, "piHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPiHeaderProvisionLessThan(String value) {
            addCriterion("pi_header_provision <", value, "piHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPiHeaderProvisionLessThanOrEqualTo(String value) {
            addCriterion("pi_header_provision <=", value, "piHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPiHeaderProvisionLike(String value) {
            addCriterion("pi_header_provision like", value, "piHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPiHeaderProvisionNotLike(String value) {
            addCriterion("pi_header_provision not like", value, "piHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPiHeaderProvisionIn(List<String> values) {
            addCriterion("pi_header_provision in", values, "piHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPiHeaderProvisionNotIn(List<String> values) {
            addCriterion("pi_header_provision not in", values, "piHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPiHeaderProvisionBetween(String value1, String value2) {
            addCriterion("pi_header_provision between", value1, value2, "piHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPiHeaderProvisionNotBetween(String value1, String value2) {
            addCriterion("pi_header_provision not between", value1, value2, "piHeaderProvision");
            return (Criteria) this;
        }

        public Criteria andPiEndClauseIsNull() {
            addCriterion("pi_end_clause is null");
            return (Criteria) this;
        }

        public Criteria andPiEndClauseIsNotNull() {
            addCriterion("pi_end_clause is not null");
            return (Criteria) this;
        }

        public Criteria andPiEndClauseEqualTo(String value) {
            addCriterion("pi_end_clause =", value, "piEndClause");
            return (Criteria) this;
        }

        public Criteria andPiEndClauseNotEqualTo(String value) {
            addCriterion("pi_end_clause <>", value, "piEndClause");
            return (Criteria) this;
        }

        public Criteria andPiEndClauseGreaterThan(String value) {
            addCriterion("pi_end_clause >", value, "piEndClause");
            return (Criteria) this;
        }

        public Criteria andPiEndClauseGreaterThanOrEqualTo(String value) {
            addCriterion("pi_end_clause >=", value, "piEndClause");
            return (Criteria) this;
        }

        public Criteria andPiEndClauseLessThan(String value) {
            addCriterion("pi_end_clause <", value, "piEndClause");
            return (Criteria) this;
        }

        public Criteria andPiEndClauseLessThanOrEqualTo(String value) {
            addCriterion("pi_end_clause <=", value, "piEndClause");
            return (Criteria) this;
        }

        public Criteria andPiEndClauseLike(String value) {
            addCriterion("pi_end_clause like", value, "piEndClause");
            return (Criteria) this;
        }

        public Criteria andPiEndClauseNotLike(String value) {
            addCriterion("pi_end_clause not like", value, "piEndClause");
            return (Criteria) this;
        }

        public Criteria andPiEndClauseIn(List<String> values) {
            addCriterion("pi_end_clause in", values, "piEndClause");
            return (Criteria) this;
        }

        public Criteria andPiEndClauseNotIn(List<String> values) {
            addCriterion("pi_end_clause not in", values, "piEndClause");
            return (Criteria) this;
        }

        public Criteria andPiEndClauseBetween(String value1, String value2) {
            addCriterion("pi_end_clause between", value1, value2, "piEndClause");
            return (Criteria) this;
        }

        public Criteria andPiEndClauseNotBetween(String value1, String value2) {
            addCriterion("pi_end_clause not between", value1, value2, "piEndClause");
            return (Criteria) this;
        }

        public Criteria andPiRemarkIsNull() {
            addCriterion("pi_remark is null");
            return (Criteria) this;
        }

        public Criteria andPiRemarkIsNotNull() {
            addCriterion("pi_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPiRemarkEqualTo(String value) {
            addCriterion("pi_remark =", value, "piRemark");
            return (Criteria) this;
        }

        public Criteria andPiRemarkNotEqualTo(String value) {
            addCriterion("pi_remark <>", value, "piRemark");
            return (Criteria) this;
        }

        public Criteria andPiRemarkGreaterThan(String value) {
            addCriterion("pi_remark >", value, "piRemark");
            return (Criteria) this;
        }

        public Criteria andPiRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pi_remark >=", value, "piRemark");
            return (Criteria) this;
        }

        public Criteria andPiRemarkLessThan(String value) {
            addCriterion("pi_remark <", value, "piRemark");
            return (Criteria) this;
        }

        public Criteria andPiRemarkLessThanOrEqualTo(String value) {
            addCriterion("pi_remark <=", value, "piRemark");
            return (Criteria) this;
        }

        public Criteria andPiRemarkLike(String value) {
            addCriterion("pi_remark like", value, "piRemark");
            return (Criteria) this;
        }

        public Criteria andPiRemarkNotLike(String value) {
            addCriterion("pi_remark not like", value, "piRemark");
            return (Criteria) this;
        }

        public Criteria andPiRemarkIn(List<String> values) {
            addCriterion("pi_remark in", values, "piRemark");
            return (Criteria) this;
        }

        public Criteria andPiRemarkNotIn(List<String> values) {
            addCriterion("pi_remark not in", values, "piRemark");
            return (Criteria) this;
        }

        public Criteria andPiRemarkBetween(String value1, String value2) {
            addCriterion("pi_remark between", value1, value2, "piRemark");
            return (Criteria) this;
        }

        public Criteria andPiRemarkNotBetween(String value1, String value2) {
            addCriterion("pi_remark not between", value1, value2, "piRemark");
            return (Criteria) this;
        }

        public Criteria andPiAuditionIsNull() {
            addCriterion("pi_audition is null");
            return (Criteria) this;
        }

        public Criteria andPiAuditionIsNotNull() {
            addCriterion("pi_audition is not null");
            return (Criteria) this;
        }

        public Criteria andPiAuditionEqualTo(String value) {
            addCriterion("pi_audition =", value, "piAudition");
            return (Criteria) this;
        }

        public Criteria andPiAuditionNotEqualTo(String value) {
            addCriterion("pi_audition <>", value, "piAudition");
            return (Criteria) this;
        }

        public Criteria andPiAuditionGreaterThan(String value) {
            addCriterion("pi_audition >", value, "piAudition");
            return (Criteria) this;
        }

        public Criteria andPiAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("pi_audition >=", value, "piAudition");
            return (Criteria) this;
        }

        public Criteria andPiAuditionLessThan(String value) {
            addCriterion("pi_audition <", value, "piAudition");
            return (Criteria) this;
        }

        public Criteria andPiAuditionLessThanOrEqualTo(String value) {
            addCriterion("pi_audition <=", value, "piAudition");
            return (Criteria) this;
        }

        public Criteria andPiAuditionLike(String value) {
            addCriterion("pi_audition like", value, "piAudition");
            return (Criteria) this;
        }

        public Criteria andPiAuditionNotLike(String value) {
            addCriterion("pi_audition not like", value, "piAudition");
            return (Criteria) this;
        }

        public Criteria andPiAuditionIn(List<String> values) {
            addCriterion("pi_audition in", values, "piAudition");
            return (Criteria) this;
        }

        public Criteria andPiAuditionNotIn(List<String> values) {
            addCriterion("pi_audition not in", values, "piAudition");
            return (Criteria) this;
        }

        public Criteria andPiAuditionBetween(String value1, String value2) {
            addCriterion("pi_audition between", value1, value2, "piAudition");
            return (Criteria) this;
        }

        public Criteria andPiAuditionNotBetween(String value1, String value2) {
            addCriterion("pi_audition not between", value1, value2, "piAudition");
            return (Criteria) this;
        }

        public Criteria andPiYnIsNull() {
            addCriterion("pi_yn is null");
            return (Criteria) this;
        }

        public Criteria andPiYnIsNotNull() {
            addCriterion("pi_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPiYnEqualTo(String value) {
            addCriterion("pi_yn =", value, "piYn");
            return (Criteria) this;
        }

        public Criteria andPiYnNotEqualTo(String value) {
            addCriterion("pi_yn <>", value, "piYn");
            return (Criteria) this;
        }

        public Criteria andPiYnGreaterThan(String value) {
            addCriterion("pi_yn >", value, "piYn");
            return (Criteria) this;
        }

        public Criteria andPiYnGreaterThanOrEqualTo(String value) {
            addCriterion("pi_yn >=", value, "piYn");
            return (Criteria) this;
        }

        public Criteria andPiYnLessThan(String value) {
            addCriterion("pi_yn <", value, "piYn");
            return (Criteria) this;
        }

        public Criteria andPiYnLessThanOrEqualTo(String value) {
            addCriterion("pi_yn <=", value, "piYn");
            return (Criteria) this;
        }

        public Criteria andPiYnLike(String value) {
            addCriterion("pi_yn like", value, "piYn");
            return (Criteria) this;
        }

        public Criteria andPiYnNotLike(String value) {
            addCriterion("pi_yn not like", value, "piYn");
            return (Criteria) this;
        }

        public Criteria andPiYnIn(List<String> values) {
            addCriterion("pi_yn in", values, "piYn");
            return (Criteria) this;
        }

        public Criteria andPiYnNotIn(List<String> values) {
            addCriterion("pi_yn not in", values, "piYn");
            return (Criteria) this;
        }

        public Criteria andPiYnBetween(String value1, String value2) {
            addCriterion("pi_yn between", value1, value2, "piYn");
            return (Criteria) this;
        }

        public Criteria andPiYnNotBetween(String value1, String value2) {
            addCriterion("pi_yn not between", value1, value2, "piYn");
            return (Criteria) this;
        }

        public Criteria andPiCustom1IsNull() {
            addCriterion("pi_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPiCustom1IsNotNull() {
            addCriterion("pi_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPiCustom1EqualTo(String value) {
            addCriterion("pi_custom1 =", value, "piCustom1");
            return (Criteria) this;
        }

        public Criteria andPiCustom1NotEqualTo(String value) {
            addCriterion("pi_custom1 <>", value, "piCustom1");
            return (Criteria) this;
        }

        public Criteria andPiCustom1GreaterThan(String value) {
            addCriterion("pi_custom1 >", value, "piCustom1");
            return (Criteria) this;
        }

        public Criteria andPiCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("pi_custom1 >=", value, "piCustom1");
            return (Criteria) this;
        }

        public Criteria andPiCustom1LessThan(String value) {
            addCriterion("pi_custom1 <", value, "piCustom1");
            return (Criteria) this;
        }

        public Criteria andPiCustom1LessThanOrEqualTo(String value) {
            addCriterion("pi_custom1 <=", value, "piCustom1");
            return (Criteria) this;
        }

        public Criteria andPiCustom1Like(String value) {
            addCriterion("pi_custom1 like", value, "piCustom1");
            return (Criteria) this;
        }

        public Criteria andPiCustom1NotLike(String value) {
            addCriterion("pi_custom1 not like", value, "piCustom1");
            return (Criteria) this;
        }

        public Criteria andPiCustom1In(List<String> values) {
            addCriterion("pi_custom1 in", values, "piCustom1");
            return (Criteria) this;
        }

        public Criteria andPiCustom1NotIn(List<String> values) {
            addCriterion("pi_custom1 not in", values, "piCustom1");
            return (Criteria) this;
        }

        public Criteria andPiCustom1Between(String value1, String value2) {
            addCriterion("pi_custom1 between", value1, value2, "piCustom1");
            return (Criteria) this;
        }

        public Criteria andPiCustom1NotBetween(String value1, String value2) {
            addCriterion("pi_custom1 not between", value1, value2, "piCustom1");
            return (Criteria) this;
        }

        public Criteria andPiCustom2IsNull() {
            addCriterion("pi_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPiCustom2IsNotNull() {
            addCriterion("pi_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPiCustom2EqualTo(String value) {
            addCriterion("pi_custom2 =", value, "piCustom2");
            return (Criteria) this;
        }

        public Criteria andPiCustom2NotEqualTo(String value) {
            addCriterion("pi_custom2 <>", value, "piCustom2");
            return (Criteria) this;
        }

        public Criteria andPiCustom2GreaterThan(String value) {
            addCriterion("pi_custom2 >", value, "piCustom2");
            return (Criteria) this;
        }

        public Criteria andPiCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("pi_custom2 >=", value, "piCustom2");
            return (Criteria) this;
        }

        public Criteria andPiCustom2LessThan(String value) {
            addCriterion("pi_custom2 <", value, "piCustom2");
            return (Criteria) this;
        }

        public Criteria andPiCustom2LessThanOrEqualTo(String value) {
            addCriterion("pi_custom2 <=", value, "piCustom2");
            return (Criteria) this;
        }

        public Criteria andPiCustom2Like(String value) {
            addCriterion("pi_custom2 like", value, "piCustom2");
            return (Criteria) this;
        }

        public Criteria andPiCustom2NotLike(String value) {
            addCriterion("pi_custom2 not like", value, "piCustom2");
            return (Criteria) this;
        }

        public Criteria andPiCustom2In(List<String> values) {
            addCriterion("pi_custom2 in", values, "piCustom2");
            return (Criteria) this;
        }

        public Criteria andPiCustom2NotIn(List<String> values) {
            addCriterion("pi_custom2 not in", values, "piCustom2");
            return (Criteria) this;
        }

        public Criteria andPiCustom2Between(String value1, String value2) {
            addCriterion("pi_custom2 between", value1, value2, "piCustom2");
            return (Criteria) this;
        }

        public Criteria andPiCustom2NotBetween(String value1, String value2) {
            addCriterion("pi_custom2 not between", value1, value2, "piCustom2");
            return (Criteria) this;
        }

        public Criteria andPiCustom3IsNull() {
            addCriterion("pi_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPiCustom3IsNotNull() {
            addCriterion("pi_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPiCustom3EqualTo(String value) {
            addCriterion("pi_custom3 =", value, "piCustom3");
            return (Criteria) this;
        }

        public Criteria andPiCustom3NotEqualTo(String value) {
            addCriterion("pi_custom3 <>", value, "piCustom3");
            return (Criteria) this;
        }

        public Criteria andPiCustom3GreaterThan(String value) {
            addCriterion("pi_custom3 >", value, "piCustom3");
            return (Criteria) this;
        }

        public Criteria andPiCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("pi_custom3 >=", value, "piCustom3");
            return (Criteria) this;
        }

        public Criteria andPiCustom3LessThan(String value) {
            addCriterion("pi_custom3 <", value, "piCustom3");
            return (Criteria) this;
        }

        public Criteria andPiCustom3LessThanOrEqualTo(String value) {
            addCriterion("pi_custom3 <=", value, "piCustom3");
            return (Criteria) this;
        }

        public Criteria andPiCustom3Like(String value) {
            addCriterion("pi_custom3 like", value, "piCustom3");
            return (Criteria) this;
        }

        public Criteria andPiCustom3NotLike(String value) {
            addCriterion("pi_custom3 not like", value, "piCustom3");
            return (Criteria) this;
        }

        public Criteria andPiCustom3In(List<String> values) {
            addCriterion("pi_custom3 in", values, "piCustom3");
            return (Criteria) this;
        }

        public Criteria andPiCustom3NotIn(List<String> values) {
            addCriterion("pi_custom3 not in", values, "piCustom3");
            return (Criteria) this;
        }

        public Criteria andPiCustom3Between(String value1, String value2) {
            addCriterion("pi_custom3 between", value1, value2, "piCustom3");
            return (Criteria) this;
        }

        public Criteria andPiCustom3NotBetween(String value1, String value2) {
            addCriterion("pi_custom3 not between", value1, value2, "piCustom3");
            return (Criteria) this;
        }

        public Criteria andPiCustom4IsNull() {
            addCriterion("pi_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPiCustom4IsNotNull() {
            addCriterion("pi_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPiCustom4EqualTo(String value) {
            addCriterion("pi_custom4 =", value, "piCustom4");
            return (Criteria) this;
        }

        public Criteria andPiCustom4NotEqualTo(String value) {
            addCriterion("pi_custom4 <>", value, "piCustom4");
            return (Criteria) this;
        }

        public Criteria andPiCustom4GreaterThan(String value) {
            addCriterion("pi_custom4 >", value, "piCustom4");
            return (Criteria) this;
        }

        public Criteria andPiCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("pi_custom4 >=", value, "piCustom4");
            return (Criteria) this;
        }

        public Criteria andPiCustom4LessThan(String value) {
            addCriterion("pi_custom4 <", value, "piCustom4");
            return (Criteria) this;
        }

        public Criteria andPiCustom4LessThanOrEqualTo(String value) {
            addCriterion("pi_custom4 <=", value, "piCustom4");
            return (Criteria) this;
        }

        public Criteria andPiCustom4Like(String value) {
            addCriterion("pi_custom4 like", value, "piCustom4");
            return (Criteria) this;
        }

        public Criteria andPiCustom4NotLike(String value) {
            addCriterion("pi_custom4 not like", value, "piCustom4");
            return (Criteria) this;
        }

        public Criteria andPiCustom4In(List<String> values) {
            addCriterion("pi_custom4 in", values, "piCustom4");
            return (Criteria) this;
        }

        public Criteria andPiCustom4NotIn(List<String> values) {
            addCriterion("pi_custom4 not in", values, "piCustom4");
            return (Criteria) this;
        }

        public Criteria andPiCustom4Between(String value1, String value2) {
            addCriterion("pi_custom4 between", value1, value2, "piCustom4");
            return (Criteria) this;
        }

        public Criteria andPiCustom4NotBetween(String value1, String value2) {
            addCriterion("pi_custom4 not between", value1, value2, "piCustom4");
            return (Criteria) this;
        }

        public Criteria andPiCustom5IsNull() {
            addCriterion("pi_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPiCustom5IsNotNull() {
            addCriterion("pi_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPiCustom5EqualTo(String value) {
            addCriterion("pi_custom5 =", value, "piCustom5");
            return (Criteria) this;
        }

        public Criteria andPiCustom5NotEqualTo(String value) {
            addCriterion("pi_custom5 <>", value, "piCustom5");
            return (Criteria) this;
        }

        public Criteria andPiCustom5GreaterThan(String value) {
            addCriterion("pi_custom5 >", value, "piCustom5");
            return (Criteria) this;
        }

        public Criteria andPiCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("pi_custom5 >=", value, "piCustom5");
            return (Criteria) this;
        }

        public Criteria andPiCustom5LessThan(String value) {
            addCriterion("pi_custom5 <", value, "piCustom5");
            return (Criteria) this;
        }

        public Criteria andPiCustom5LessThanOrEqualTo(String value) {
            addCriterion("pi_custom5 <=", value, "piCustom5");
            return (Criteria) this;
        }

        public Criteria andPiCustom5Like(String value) {
            addCriterion("pi_custom5 like", value, "piCustom5");
            return (Criteria) this;
        }

        public Criteria andPiCustom5NotLike(String value) {
            addCriterion("pi_custom5 not like", value, "piCustom5");
            return (Criteria) this;
        }

        public Criteria andPiCustom5In(List<String> values) {
            addCriterion("pi_custom5 in", values, "piCustom5");
            return (Criteria) this;
        }

        public Criteria andPiCustom5NotIn(List<String> values) {
            addCriterion("pi_custom5 not in", values, "piCustom5");
            return (Criteria) this;
        }

        public Criteria andPiCustom5Between(String value1, String value2) {
            addCriterion("pi_custom5 between", value1, value2, "piCustom5");
            return (Criteria) this;
        }

        public Criteria andPiCustom5NotBetween(String value1, String value2) {
            addCriterion("pi_custom5 not between", value1, value2, "piCustom5");
            return (Criteria) this;
        }

        public Criteria andPiCustom6IsNull() {
            addCriterion("pi_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPiCustom6IsNotNull() {
            addCriterion("pi_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPiCustom6EqualTo(String value) {
            addCriterion("pi_custom6 =", value, "piCustom6");
            return (Criteria) this;
        }

        public Criteria andPiCustom6NotEqualTo(String value) {
            addCriterion("pi_custom6 <>", value, "piCustom6");
            return (Criteria) this;
        }

        public Criteria andPiCustom6GreaterThan(String value) {
            addCriterion("pi_custom6 >", value, "piCustom6");
            return (Criteria) this;
        }

        public Criteria andPiCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("pi_custom6 >=", value, "piCustom6");
            return (Criteria) this;
        }

        public Criteria andPiCustom6LessThan(String value) {
            addCriterion("pi_custom6 <", value, "piCustom6");
            return (Criteria) this;
        }

        public Criteria andPiCustom6LessThanOrEqualTo(String value) {
            addCriterion("pi_custom6 <=", value, "piCustom6");
            return (Criteria) this;
        }

        public Criteria andPiCustom6Like(String value) {
            addCriterion("pi_custom6 like", value, "piCustom6");
            return (Criteria) this;
        }

        public Criteria andPiCustom6NotLike(String value) {
            addCriterion("pi_custom6 not like", value, "piCustom6");
            return (Criteria) this;
        }

        public Criteria andPiCustom6In(List<String> values) {
            addCriterion("pi_custom6 in", values, "piCustom6");
            return (Criteria) this;
        }

        public Criteria andPiCustom6NotIn(List<String> values) {
            addCriterion("pi_custom6 not in", values, "piCustom6");
            return (Criteria) this;
        }

        public Criteria andPiCustom6Between(String value1, String value2) {
            addCriterion("pi_custom6 between", value1, value2, "piCustom6");
            return (Criteria) this;
        }

        public Criteria andPiCustom6NotBetween(String value1, String value2) {
            addCriterion("pi_custom6 not between", value1, value2, "piCustom6");
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