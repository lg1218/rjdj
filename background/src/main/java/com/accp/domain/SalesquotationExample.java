package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SalesquotationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesquotationExample() {
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

        public Criteria andSqDocumentnumberIsNull() {
            addCriterion("Sq_documentnumber is null");
            return (Criteria) this;
        }

        public Criteria andSqDocumentnumberIsNotNull() {
            addCriterion("Sq_documentnumber is not null");
            return (Criteria) this;
        }

        public Criteria andSqDocumentnumberEqualTo(String value) {
            addCriterion("Sq_documentnumber =", value, "sqDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqDocumentnumberNotEqualTo(String value) {
            addCriterion("Sq_documentnumber <>", value, "sqDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqDocumentnumberGreaterThan(String value) {
            addCriterion("Sq_documentnumber >", value, "sqDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqDocumentnumberGreaterThanOrEqualTo(String value) {
            addCriterion("Sq_documentnumber >=", value, "sqDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqDocumentnumberLessThan(String value) {
            addCriterion("Sq_documentnumber <", value, "sqDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqDocumentnumberLessThanOrEqualTo(String value) {
            addCriterion("Sq_documentnumber <=", value, "sqDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqDocumentnumberLike(String value) {
            addCriterion("Sq_documentnumber like", value, "sqDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqDocumentnumberNotLike(String value) {
            addCriterion("Sq_documentnumber not like", value, "sqDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqDocumentnumberIn(List<String> values) {
            addCriterion("Sq_documentnumber in", values, "sqDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqDocumentnumberNotIn(List<String> values) {
            addCriterion("Sq_documentnumber not in", values, "sqDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqDocumentnumberBetween(String value1, String value2) {
            addCriterion("Sq_documentnumber between", value1, value2, "sqDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqDocumentnumberNotBetween(String value1, String value2) {
            addCriterion("Sq_documentnumber not between", value1, value2, "sqDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeIsNull() {
            addCriterion("Sq_Document_time is null");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeIsNotNull() {
            addCriterion("Sq_Document_time is not null");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeEqualTo(Date value) {
            addCriterionForJDBCDate("Sq_Document_time =", value, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Sq_Document_time <>", value, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Sq_Document_time >", value, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Sq_Document_time >=", value, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeLessThan(Date value) {
            addCriterionForJDBCDate("Sq_Document_time <", value, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Sq_Document_time <=", value, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeIn(List<Date> values) {
            addCriterionForJDBCDate("Sq_Document_time in", values, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Sq_Document_time not in", values, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Sq_Document_time between", value1, value2, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqDocumentTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Sq_Document_time not between", value1, value2, "sqDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSqCoinArewellIsNull() {
            addCriterion("Sq_Coin_arewell is null");
            return (Criteria) this;
        }

        public Criteria andSqCoinArewellIsNotNull() {
            addCriterion("Sq_Coin_arewell is not null");
            return (Criteria) this;
        }

        public Criteria andSqCoinArewellEqualTo(String value) {
            addCriterion("Sq_Coin_arewell =", value, "sqCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSqCoinArewellNotEqualTo(String value) {
            addCriterion("Sq_Coin_arewell <>", value, "sqCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSqCoinArewellGreaterThan(String value) {
            addCriterion("Sq_Coin_arewell >", value, "sqCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSqCoinArewellGreaterThanOrEqualTo(String value) {
            addCriterion("Sq_Coin_arewell >=", value, "sqCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSqCoinArewellLessThan(String value) {
            addCriterion("Sq_Coin_arewell <", value, "sqCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSqCoinArewellLessThanOrEqualTo(String value) {
            addCriterion("Sq_Coin_arewell <=", value, "sqCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSqCoinArewellLike(String value) {
            addCriterion("Sq_Coin_arewell like", value, "sqCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSqCoinArewellNotLike(String value) {
            addCriterion("Sq_Coin_arewell not like", value, "sqCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSqCoinArewellIn(List<String> values) {
            addCriterion("Sq_Coin_arewell in", values, "sqCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSqCoinArewellNotIn(List<String> values) {
            addCriterion("Sq_Coin_arewell not in", values, "sqCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSqCoinArewellBetween(String value1, String value2) {
            addCriterion("Sq_Coin_arewell between", value1, value2, "sqCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSqCoinArewellNotBetween(String value1, String value2) {
            addCriterion("Sq_Coin_arewell not between", value1, value2, "sqCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateIsNull() {
            addCriterion("Sq_Exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateIsNotNull() {
            addCriterion("Sq_Exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateEqualTo(Double value) {
            addCriterion("Sq_Exchange_rate =", value, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateNotEqualTo(Double value) {
            addCriterion("Sq_Exchange_rate <>", value, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateGreaterThan(Double value) {
            addCriterion("Sq_Exchange_rate >", value, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateGreaterThanOrEqualTo(Double value) {
            addCriterion("Sq_Exchange_rate >=", value, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateLessThan(Double value) {
            addCriterion("Sq_Exchange_rate <", value, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateLessThanOrEqualTo(Double value) {
            addCriterion("Sq_Exchange_rate <=", value, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateIn(List<Double> values) {
            addCriterion("Sq_Exchange_rate in", values, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateNotIn(List<Double> values) {
            addCriterion("Sq_Exchange_rate not in", values, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateBetween(Double value1, Double value2) {
            addCriterion("Sq_Exchange_rate between", value1, value2, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqExchangeRateNotBetween(Double value1, Double value2) {
            addCriterion("Sq_Exchange_rate not between", value1, value2, "sqExchangeRate");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeIsNull() {
            addCriterion("Sq_Effective_time is null");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeIsNotNull() {
            addCriterion("Sq_Effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeEqualTo(Date value) {
            addCriterionForJDBCDate("Sq_Effective_time =", value, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Sq_Effective_time <>", value, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Sq_Effective_time >", value, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Sq_Effective_time >=", value, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeLessThan(Date value) {
            addCriterionForJDBCDate("Sq_Effective_time <", value, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Sq_Effective_time <=", value, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeIn(List<Date> values) {
            addCriterionForJDBCDate("Sq_Effective_time in", values, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Sq_Effective_time not in", values, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Sq_Effective_time between", value1, value2, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqEffectiveTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Sq_Effective_time not between", value1, value2, "sqEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andSqTaxIsNull() {
            addCriterion("Sq_tax is null");
            return (Criteria) this;
        }

        public Criteria andSqTaxIsNotNull() {
            addCriterion("Sq_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSqTaxEqualTo(Integer value) {
            addCriterion("Sq_tax =", value, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxNotEqualTo(Integer value) {
            addCriterion("Sq_tax <>", value, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxGreaterThan(Integer value) {
            addCriterion("Sq_tax >", value, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sq_tax >=", value, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxLessThan(Integer value) {
            addCriterion("Sq_tax <", value, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxLessThanOrEqualTo(Integer value) {
            addCriterion("Sq_tax <=", value, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxIn(List<Integer> values) {
            addCriterion("Sq_tax in", values, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxNotIn(List<Integer> values) {
            addCriterion("Sq_tax not in", values, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxBetween(Integer value1, Integer value2) {
            addCriterion("Sq_tax between", value1, value2, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqTaxNotBetween(Integer value1, Integer value2) {
            addCriterion("Sq_tax not between", value1, value2, "sqTax");
            return (Criteria) this;
        }

        public Criteria andSqCustomerNumberIsNull() {
            addCriterion("Sq_Customer_number is null");
            return (Criteria) this;
        }

        public Criteria andSqCustomerNumberIsNotNull() {
            addCriterion("Sq_Customer_number is not null");
            return (Criteria) this;
        }

        public Criteria andSqCustomerNumberEqualTo(String value) {
            addCriterion("Sq_Customer_number =", value, "sqCustomerNumber");
            return (Criteria) this;
        }

        public Criteria andSqCustomerNumberNotEqualTo(String value) {
            addCriterion("Sq_Customer_number <>", value, "sqCustomerNumber");
            return (Criteria) this;
        }

        public Criteria andSqCustomerNumberGreaterThan(String value) {
            addCriterion("Sq_Customer_number >", value, "sqCustomerNumber");
            return (Criteria) this;
        }

        public Criteria andSqCustomerNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Sq_Customer_number >=", value, "sqCustomerNumber");
            return (Criteria) this;
        }

        public Criteria andSqCustomerNumberLessThan(String value) {
            addCriterion("Sq_Customer_number <", value, "sqCustomerNumber");
            return (Criteria) this;
        }

        public Criteria andSqCustomerNumberLessThanOrEqualTo(String value) {
            addCriterion("Sq_Customer_number <=", value, "sqCustomerNumber");
            return (Criteria) this;
        }

        public Criteria andSqCustomerNumberLike(String value) {
            addCriterion("Sq_Customer_number like", value, "sqCustomerNumber");
            return (Criteria) this;
        }

        public Criteria andSqCustomerNumberNotLike(String value) {
            addCriterion("Sq_Customer_number not like", value, "sqCustomerNumber");
            return (Criteria) this;
        }

        public Criteria andSqCustomerNumberIn(List<String> values) {
            addCriterion("Sq_Customer_number in", values, "sqCustomerNumber");
            return (Criteria) this;
        }

        public Criteria andSqCustomerNumberNotIn(List<String> values) {
            addCriterion("Sq_Customer_number not in", values, "sqCustomerNumber");
            return (Criteria) this;
        }

        public Criteria andSqCustomerNumberBetween(String value1, String value2) {
            addCriterion("Sq_Customer_number between", value1, value2, "sqCustomerNumber");
            return (Criteria) this;
        }

        public Criteria andSqCustomerNumberNotBetween(String value1, String value2) {
            addCriterion("Sq_Customer_number not between", value1, value2, "sqCustomerNumber");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressIsNull() {
            addCriterion("Sq_Delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressIsNotNull() {
            addCriterion("Sq_Delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressEqualTo(String value) {
            addCriterion("Sq_Delivery_address =", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressNotEqualTo(String value) {
            addCriterion("Sq_Delivery_address <>", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressGreaterThan(String value) {
            addCriterion("Sq_Delivery_address >", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Sq_Delivery_address >=", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressLessThan(String value) {
            addCriterion("Sq_Delivery_address <", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("Sq_Delivery_address <=", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressLike(String value) {
            addCriterion("Sq_Delivery_address like", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressNotLike(String value) {
            addCriterion("Sq_Delivery_address not like", value, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressIn(List<String> values) {
            addCriterion("Sq_Delivery_address in", values, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressNotIn(List<String> values) {
            addCriterion("Sq_Delivery_address not in", values, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressBetween(String value1, String value2) {
            addCriterion("Sq_Delivery_address between", value1, value2, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("Sq_Delivery_address not between", value1, value2, "sqDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSqBusinessPersonnelIsNull() {
            addCriterion("Sq_Business_personnel is null");
            return (Criteria) this;
        }

        public Criteria andSqBusinessPersonnelIsNotNull() {
            addCriterion("Sq_Business_personnel is not null");
            return (Criteria) this;
        }

        public Criteria andSqBusinessPersonnelEqualTo(String value) {
            addCriterion("Sq_Business_personnel =", value, "sqBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSqBusinessPersonnelNotEqualTo(String value) {
            addCriterion("Sq_Business_personnel <>", value, "sqBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSqBusinessPersonnelGreaterThan(String value) {
            addCriterion("Sq_Business_personnel >", value, "sqBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSqBusinessPersonnelGreaterThanOrEqualTo(String value) {
            addCriterion("Sq_Business_personnel >=", value, "sqBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSqBusinessPersonnelLessThan(String value) {
            addCriterion("Sq_Business_personnel <", value, "sqBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSqBusinessPersonnelLessThanOrEqualTo(String value) {
            addCriterion("Sq_Business_personnel <=", value, "sqBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSqBusinessPersonnelLike(String value) {
            addCriterion("Sq_Business_personnel like", value, "sqBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSqBusinessPersonnelNotLike(String value) {
            addCriterion("Sq_Business_personnel not like", value, "sqBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSqBusinessPersonnelIn(List<String> values) {
            addCriterion("Sq_Business_personnel in", values, "sqBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSqBusinessPersonnelNotIn(List<String> values) {
            addCriterion("Sq_Business_personnel not in", values, "sqBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSqBusinessPersonnelBetween(String value1, String value2) {
            addCriterion("Sq_Business_personnel between", value1, value2, "sqBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSqBusinessPersonnelNotBetween(String value1, String value2) {
            addCriterion("Sq_Business_personnel not between", value1, value2, "sqBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSqSubordinateDepartmentIsNull() {
            addCriterion("Sq_Subordinate_department is null");
            return (Criteria) this;
        }

        public Criteria andSqSubordinateDepartmentIsNotNull() {
            addCriterion("Sq_Subordinate_department is not null");
            return (Criteria) this;
        }

        public Criteria andSqSubordinateDepartmentEqualTo(String value) {
            addCriterion("Sq_Subordinate_department =", value, "sqSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSqSubordinateDepartmentNotEqualTo(String value) {
            addCriterion("Sq_Subordinate_department <>", value, "sqSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSqSubordinateDepartmentGreaterThan(String value) {
            addCriterion("Sq_Subordinate_department >", value, "sqSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSqSubordinateDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("Sq_Subordinate_department >=", value, "sqSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSqSubordinateDepartmentLessThan(String value) {
            addCriterion("Sq_Subordinate_department <", value, "sqSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSqSubordinateDepartmentLessThanOrEqualTo(String value) {
            addCriterion("Sq_Subordinate_department <=", value, "sqSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSqSubordinateDepartmentLike(String value) {
            addCriterion("Sq_Subordinate_department like", value, "sqSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSqSubordinateDepartmentNotLike(String value) {
            addCriterion("Sq_Subordinate_department not like", value, "sqSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSqSubordinateDepartmentIn(List<String> values) {
            addCriterion("Sq_Subordinate_department in", values, "sqSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSqSubordinateDepartmentNotIn(List<String> values) {
            addCriterion("Sq_Subordinate_department not in", values, "sqSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSqSubordinateDepartmentBetween(String value1, String value2) {
            addCriterion("Sq_Subordinate_department between", value1, value2, "sqSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSqSubordinateDepartmentNotBetween(String value1, String value2) {
            addCriterion("Sq_Subordinate_department not between", value1, value2, "sqSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSqMonographIsNull() {
            addCriterion("Sq_monograph is null");
            return (Criteria) this;
        }

        public Criteria andSqMonographIsNotNull() {
            addCriterion("Sq_monograph is not null");
            return (Criteria) this;
        }

        public Criteria andSqMonographEqualTo(String value) {
            addCriterion("Sq_monograph =", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographNotEqualTo(String value) {
            addCriterion("Sq_monograph <>", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographGreaterThan(String value) {
            addCriterion("Sq_monograph >", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographGreaterThanOrEqualTo(String value) {
            addCriterion("Sq_monograph >=", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographLessThan(String value) {
            addCriterion("Sq_monograph <", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographLessThanOrEqualTo(String value) {
            addCriterion("Sq_monograph <=", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographLike(String value) {
            addCriterion("Sq_monograph like", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographNotLike(String value) {
            addCriterion("Sq_monograph not like", value, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographIn(List<String> values) {
            addCriterion("Sq_monograph in", values, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographNotIn(List<String> values) {
            addCriterion("Sq_monograph not in", values, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographBetween(String value1, String value2) {
            addCriterion("Sq_monograph between", value1, value2, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqMonographNotBetween(String value1, String value2) {
            addCriterion("Sq_monograph not between", value1, value2, "sqMonograph");
            return (Criteria) this;
        }

        public Criteria andSqReviewersIsNull() {
            addCriterion("Sq_reviewers is null");
            return (Criteria) this;
        }

        public Criteria andSqReviewersIsNotNull() {
            addCriterion("Sq_reviewers is not null");
            return (Criteria) this;
        }

        public Criteria andSqReviewersEqualTo(String value) {
            addCriterion("Sq_reviewers =", value, "sqReviewers");
            return (Criteria) this;
        }

        public Criteria andSqReviewersNotEqualTo(String value) {
            addCriterion("Sq_reviewers <>", value, "sqReviewers");
            return (Criteria) this;
        }

        public Criteria andSqReviewersGreaterThan(String value) {
            addCriterion("Sq_reviewers >", value, "sqReviewers");
            return (Criteria) this;
        }

        public Criteria andSqReviewersGreaterThanOrEqualTo(String value) {
            addCriterion("Sq_reviewers >=", value, "sqReviewers");
            return (Criteria) this;
        }

        public Criteria andSqReviewersLessThan(String value) {
            addCriterion("Sq_reviewers <", value, "sqReviewers");
            return (Criteria) this;
        }

        public Criteria andSqReviewersLessThanOrEqualTo(String value) {
            addCriterion("Sq_reviewers <=", value, "sqReviewers");
            return (Criteria) this;
        }

        public Criteria andSqReviewersLike(String value) {
            addCriterion("Sq_reviewers like", value, "sqReviewers");
            return (Criteria) this;
        }

        public Criteria andSqReviewersNotLike(String value) {
            addCriterion("Sq_reviewers not like", value, "sqReviewers");
            return (Criteria) this;
        }

        public Criteria andSqReviewersIn(List<String> values) {
            addCriterion("Sq_reviewers in", values, "sqReviewers");
            return (Criteria) this;
        }

        public Criteria andSqReviewersNotIn(List<String> values) {
            addCriterion("Sq_reviewers not in", values, "sqReviewers");
            return (Criteria) this;
        }

        public Criteria andSqReviewersBetween(String value1, String value2) {
            addCriterion("Sq_reviewers between", value1, value2, "sqReviewers");
            return (Criteria) this;
        }

        public Criteria andSqReviewersNotBetween(String value1, String value2) {
            addCriterion("Sq_reviewers not between", value1, value2, "sqReviewers");
            return (Criteria) this;
        }

        public Criteria andSqSpare1IsNull() {
            addCriterion("Sq_Spare1 is null");
            return (Criteria) this;
        }

        public Criteria andSqSpare1IsNotNull() {
            addCriterion("Sq_Spare1 is not null");
            return (Criteria) this;
        }

        public Criteria andSqSpare1EqualTo(String value) {
            addCriterion("Sq_Spare1 =", value, "sqSpare1");
            return (Criteria) this;
        }

        public Criteria andSqSpare1NotEqualTo(String value) {
            addCriterion("Sq_Spare1 <>", value, "sqSpare1");
            return (Criteria) this;
        }

        public Criteria andSqSpare1GreaterThan(String value) {
            addCriterion("Sq_Spare1 >", value, "sqSpare1");
            return (Criteria) this;
        }

        public Criteria andSqSpare1GreaterThanOrEqualTo(String value) {
            addCriterion("Sq_Spare1 >=", value, "sqSpare1");
            return (Criteria) this;
        }

        public Criteria andSqSpare1LessThan(String value) {
            addCriterion("Sq_Spare1 <", value, "sqSpare1");
            return (Criteria) this;
        }

        public Criteria andSqSpare1LessThanOrEqualTo(String value) {
            addCriterion("Sq_Spare1 <=", value, "sqSpare1");
            return (Criteria) this;
        }

        public Criteria andSqSpare1Like(String value) {
            addCriterion("Sq_Spare1 like", value, "sqSpare1");
            return (Criteria) this;
        }

        public Criteria andSqSpare1NotLike(String value) {
            addCriterion("Sq_Spare1 not like", value, "sqSpare1");
            return (Criteria) this;
        }

        public Criteria andSqSpare1In(List<String> values) {
            addCriterion("Sq_Spare1 in", values, "sqSpare1");
            return (Criteria) this;
        }

        public Criteria andSqSpare1NotIn(List<String> values) {
            addCriterion("Sq_Spare1 not in", values, "sqSpare1");
            return (Criteria) this;
        }

        public Criteria andSqSpare1Between(String value1, String value2) {
            addCriterion("Sq_Spare1 between", value1, value2, "sqSpare1");
            return (Criteria) this;
        }

        public Criteria andSqSpare1NotBetween(String value1, String value2) {
            addCriterion("Sq_Spare1 not between", value1, value2, "sqSpare1");
            return (Criteria) this;
        }

        public Criteria andSqSpare2IsNull() {
            addCriterion("Sq_Spare2 is null");
            return (Criteria) this;
        }

        public Criteria andSqSpare2IsNotNull() {
            addCriterion("Sq_Spare2 is not null");
            return (Criteria) this;
        }

        public Criteria andSqSpare2EqualTo(String value) {
            addCriterion("Sq_Spare2 =", value, "sqSpare2");
            return (Criteria) this;
        }

        public Criteria andSqSpare2NotEqualTo(String value) {
            addCriterion("Sq_Spare2 <>", value, "sqSpare2");
            return (Criteria) this;
        }

        public Criteria andSqSpare2GreaterThan(String value) {
            addCriterion("Sq_Spare2 >", value, "sqSpare2");
            return (Criteria) this;
        }

        public Criteria andSqSpare2GreaterThanOrEqualTo(String value) {
            addCriterion("Sq_Spare2 >=", value, "sqSpare2");
            return (Criteria) this;
        }

        public Criteria andSqSpare2LessThan(String value) {
            addCriterion("Sq_Spare2 <", value, "sqSpare2");
            return (Criteria) this;
        }

        public Criteria andSqSpare2LessThanOrEqualTo(String value) {
            addCriterion("Sq_Spare2 <=", value, "sqSpare2");
            return (Criteria) this;
        }

        public Criteria andSqSpare2Like(String value) {
            addCriterion("Sq_Spare2 like", value, "sqSpare2");
            return (Criteria) this;
        }

        public Criteria andSqSpare2NotLike(String value) {
            addCriterion("Sq_Spare2 not like", value, "sqSpare2");
            return (Criteria) this;
        }

        public Criteria andSqSpare2In(List<String> values) {
            addCriterion("Sq_Spare2 in", values, "sqSpare2");
            return (Criteria) this;
        }

        public Criteria andSqSpare2NotIn(List<String> values) {
            addCriterion("Sq_Spare2 not in", values, "sqSpare2");
            return (Criteria) this;
        }

        public Criteria andSqSpare2Between(String value1, String value2) {
            addCriterion("Sq_Spare2 between", value1, value2, "sqSpare2");
            return (Criteria) this;
        }

        public Criteria andSqSpare2NotBetween(String value1, String value2) {
            addCriterion("Sq_Spare2 not between", value1, value2, "sqSpare2");
            return (Criteria) this;
        }

        public Criteria andSqSpare3IsNull() {
            addCriterion("Sq_Spare3 is null");
            return (Criteria) this;
        }

        public Criteria andSqSpare3IsNotNull() {
            addCriterion("Sq_Spare3 is not null");
            return (Criteria) this;
        }

        public Criteria andSqSpare3EqualTo(String value) {
            addCriterion("Sq_Spare3 =", value, "sqSpare3");
            return (Criteria) this;
        }

        public Criteria andSqSpare3NotEqualTo(String value) {
            addCriterion("Sq_Spare3 <>", value, "sqSpare3");
            return (Criteria) this;
        }

        public Criteria andSqSpare3GreaterThan(String value) {
            addCriterion("Sq_Spare3 >", value, "sqSpare3");
            return (Criteria) this;
        }

        public Criteria andSqSpare3GreaterThanOrEqualTo(String value) {
            addCriterion("Sq_Spare3 >=", value, "sqSpare3");
            return (Criteria) this;
        }

        public Criteria andSqSpare3LessThan(String value) {
            addCriterion("Sq_Spare3 <", value, "sqSpare3");
            return (Criteria) this;
        }

        public Criteria andSqSpare3LessThanOrEqualTo(String value) {
            addCriterion("Sq_Spare3 <=", value, "sqSpare3");
            return (Criteria) this;
        }

        public Criteria andSqSpare3Like(String value) {
            addCriterion("Sq_Spare3 like", value, "sqSpare3");
            return (Criteria) this;
        }

        public Criteria andSqSpare3NotLike(String value) {
            addCriterion("Sq_Spare3 not like", value, "sqSpare3");
            return (Criteria) this;
        }

        public Criteria andSqSpare3In(List<String> values) {
            addCriterion("Sq_Spare3 in", values, "sqSpare3");
            return (Criteria) this;
        }

        public Criteria andSqSpare3NotIn(List<String> values) {
            addCriterion("Sq_Spare3 not in", values, "sqSpare3");
            return (Criteria) this;
        }

        public Criteria andSqSpare3Between(String value1, String value2) {
            addCriterion("Sq_Spare3 between", value1, value2, "sqSpare3");
            return (Criteria) this;
        }

        public Criteria andSqSpare3NotBetween(String value1, String value2) {
            addCriterion("Sq_Spare3 not between", value1, value2, "sqSpare3");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordIsNull() {
            addCriterion("Sq_watchword is null");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordIsNotNull() {
            addCriterion("Sq_watchword is not null");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordEqualTo(String value) {
            addCriterion("Sq_watchword =", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordNotEqualTo(String value) {
            addCriterion("Sq_watchword <>", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordGreaterThan(String value) {
            addCriterion("Sq_watchword >", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordGreaterThanOrEqualTo(String value) {
            addCriterion("Sq_watchword >=", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordLessThan(String value) {
            addCriterion("Sq_watchword <", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordLessThanOrEqualTo(String value) {
            addCriterion("Sq_watchword <=", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordLike(String value) {
            addCriterion("Sq_watchword like", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordNotLike(String value) {
            addCriterion("Sq_watchword not like", value, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordIn(List<String> values) {
            addCriterion("Sq_watchword in", values, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordNotIn(List<String> values) {
            addCriterion("Sq_watchword not in", values, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordBetween(String value1, String value2) {
            addCriterion("Sq_watchword between", value1, value2, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqWatchwordNotBetween(String value1, String value2) {
            addCriterion("Sq_watchword not between", value1, value2, "sqWatchword");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseIsNull() {
            addCriterion("Sq_Tailclause is null");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseIsNotNull() {
            addCriterion("Sq_Tailclause is not null");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseEqualTo(String value) {
            addCriterion("Sq_Tailclause =", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseNotEqualTo(String value) {
            addCriterion("Sq_Tailclause <>", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseGreaterThan(String value) {
            addCriterion("Sq_Tailclause >", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseGreaterThanOrEqualTo(String value) {
            addCriterion("Sq_Tailclause >=", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseLessThan(String value) {
            addCriterion("Sq_Tailclause <", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseLessThanOrEqualTo(String value) {
            addCriterion("Sq_Tailclause <=", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseLike(String value) {
            addCriterion("Sq_Tailclause like", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseNotLike(String value) {
            addCriterion("Sq_Tailclause not like", value, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseIn(List<String> values) {
            addCriterion("Sq_Tailclause in", values, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseNotIn(List<String> values) {
            addCriterion("Sq_Tailclause not in", values, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseBetween(String value1, String value2) {
            addCriterion("Sq_Tailclause between", value1, value2, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqTailclauseNotBetween(String value1, String value2) {
            addCriterion("Sq_Tailclause not between", value1, value2, "sqTailclause");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn1IsNull() {
            addCriterion("Sq_Self_bound_column1 is null");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn1IsNotNull() {
            addCriterion("Sq_Self_bound_column1 is not null");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn1EqualTo(String value) {
            addCriterion("Sq_Self_bound_column1 =", value, "sqSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn1NotEqualTo(String value) {
            addCriterion("Sq_Self_bound_column1 <>", value, "sqSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn1GreaterThan(String value) {
            addCriterion("Sq_Self_bound_column1 >", value, "sqSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn1GreaterThanOrEqualTo(String value) {
            addCriterion("Sq_Self_bound_column1 >=", value, "sqSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn1LessThan(String value) {
            addCriterion("Sq_Self_bound_column1 <", value, "sqSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn1LessThanOrEqualTo(String value) {
            addCriterion("Sq_Self_bound_column1 <=", value, "sqSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn1Like(String value) {
            addCriterion("Sq_Self_bound_column1 like", value, "sqSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn1NotLike(String value) {
            addCriterion("Sq_Self_bound_column1 not like", value, "sqSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn1In(List<String> values) {
            addCriterion("Sq_Self_bound_column1 in", values, "sqSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn1NotIn(List<String> values) {
            addCriterion("Sq_Self_bound_column1 not in", values, "sqSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn1Between(String value1, String value2) {
            addCriterion("Sq_Self_bound_column1 between", value1, value2, "sqSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn1NotBetween(String value1, String value2) {
            addCriterion("Sq_Self_bound_column1 not between", value1, value2, "sqSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn2IsNull() {
            addCriterion("Sq_Self_bound_column2 is null");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn2IsNotNull() {
            addCriterion("Sq_Self_bound_column2 is not null");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn2EqualTo(String value) {
            addCriterion("Sq_Self_bound_column2 =", value, "sqSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn2NotEqualTo(String value) {
            addCriterion("Sq_Self_bound_column2 <>", value, "sqSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn2GreaterThan(String value) {
            addCriterion("Sq_Self_bound_column2 >", value, "sqSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn2GreaterThanOrEqualTo(String value) {
            addCriterion("Sq_Self_bound_column2 >=", value, "sqSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn2LessThan(String value) {
            addCriterion("Sq_Self_bound_column2 <", value, "sqSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn2LessThanOrEqualTo(String value) {
            addCriterion("Sq_Self_bound_column2 <=", value, "sqSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn2Like(String value) {
            addCriterion("Sq_Self_bound_column2 like", value, "sqSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn2NotLike(String value) {
            addCriterion("Sq_Self_bound_column2 not like", value, "sqSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn2In(List<String> values) {
            addCriterion("Sq_Self_bound_column2 in", values, "sqSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn2NotIn(List<String> values) {
            addCriterion("Sq_Self_bound_column2 not in", values, "sqSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn2Between(String value1, String value2) {
            addCriterion("Sq_Self_bound_column2 between", value1, value2, "sqSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSqSelfBoundColumn2NotBetween(String value1, String value2) {
            addCriterion("Sq_Self_bound_column2 not between", value1, value2, "sqSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSqRemarkIsNull() {
            addCriterion("Sq_remark is null");
            return (Criteria) this;
        }

        public Criteria andSqRemarkIsNotNull() {
            addCriterion("Sq_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSqRemarkEqualTo(String value) {
            addCriterion("Sq_remark =", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkNotEqualTo(String value) {
            addCriterion("Sq_remark <>", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkGreaterThan(String value) {
            addCriterion("Sq_remark >", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Sq_remark >=", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkLessThan(String value) {
            addCriterion("Sq_remark <", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkLessThanOrEqualTo(String value) {
            addCriterion("Sq_remark <=", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkLike(String value) {
            addCriterion("Sq_remark like", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkNotLike(String value) {
            addCriterion("Sq_remark not like", value, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkIn(List<String> values) {
            addCriterion("Sq_remark in", values, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkNotIn(List<String> values) {
            addCriterion("Sq_remark not in", values, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkBetween(String value1, String value2) {
            addCriterion("Sq_remark between", value1, value2, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqRemarkNotBetween(String value1, String value2) {
            addCriterion("Sq_remark not between", value1, value2, "sqRemark");
            return (Criteria) this;
        }

        public Criteria andSqStaticIsNull() {
            addCriterion("Sq_static is null");
            return (Criteria) this;
        }

        public Criteria andSqStaticIsNotNull() {
            addCriterion("Sq_static is not null");
            return (Criteria) this;
        }

        public Criteria andSqStaticEqualTo(Integer value) {
            addCriterion("Sq_static =", value, "sqStatic");
            return (Criteria) this;
        }

        public Criteria andSqStaticNotEqualTo(Integer value) {
            addCriterion("Sq_static <>", value, "sqStatic");
            return (Criteria) this;
        }

        public Criteria andSqStaticGreaterThan(Integer value) {
            addCriterion("Sq_static >", value, "sqStatic");
            return (Criteria) this;
        }

        public Criteria andSqStaticGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sq_static >=", value, "sqStatic");
            return (Criteria) this;
        }

        public Criteria andSqStaticLessThan(Integer value) {
            addCriterion("Sq_static <", value, "sqStatic");
            return (Criteria) this;
        }

        public Criteria andSqStaticLessThanOrEqualTo(Integer value) {
            addCriterion("Sq_static <=", value, "sqStatic");
            return (Criteria) this;
        }

        public Criteria andSqStaticIn(List<Integer> values) {
            addCriterion("Sq_static in", values, "sqStatic");
            return (Criteria) this;
        }

        public Criteria andSqStaticNotIn(List<Integer> values) {
            addCriterion("Sq_static not in", values, "sqStatic");
            return (Criteria) this;
        }

        public Criteria andSqStaticBetween(Integer value1, Integer value2) {
            addCriterion("Sq_static between", value1, value2, "sqStatic");
            return (Criteria) this;
        }

        public Criteria andSqStaticNotBetween(Integer value1, Integer value2) {
            addCriterion("Sq_static not between", value1, value2, "sqStatic");
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