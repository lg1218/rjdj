package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SalesquotationlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesquotationlistExample() {
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

        public Criteria andSqlDocumentnumberIsNull() {
            addCriterion("Sql_documentnumber is null");
            return (Criteria) this;
        }

        public Criteria andSqlDocumentnumberIsNotNull() {
            addCriterion("Sql_documentnumber is not null");
            return (Criteria) this;
        }

        public Criteria andSqlDocumentnumberEqualTo(String value) {
            addCriterion("Sql_documentnumber =", value, "sqlDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqlDocumentnumberNotEqualTo(String value) {
            addCriterion("Sql_documentnumber <>", value, "sqlDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqlDocumentnumberGreaterThan(String value) {
            addCriterion("Sql_documentnumber >", value, "sqlDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqlDocumentnumberGreaterThanOrEqualTo(String value) {
            addCriterion("Sql_documentnumber >=", value, "sqlDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqlDocumentnumberLessThan(String value) {
            addCriterion("Sql_documentnumber <", value, "sqlDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqlDocumentnumberLessThanOrEqualTo(String value) {
            addCriterion("Sql_documentnumber <=", value, "sqlDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqlDocumentnumberLike(String value) {
            addCriterion("Sql_documentnumber like", value, "sqlDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqlDocumentnumberNotLike(String value) {
            addCriterion("Sql_documentnumber not like", value, "sqlDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqlDocumentnumberIn(List<String> values) {
            addCriterion("Sql_documentnumber in", values, "sqlDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqlDocumentnumberNotIn(List<String> values) {
            addCriterion("Sql_documentnumber not in", values, "sqlDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqlDocumentnumberBetween(String value1, String value2) {
            addCriterion("Sql_documentnumber between", value1, value2, "sqlDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqlDocumentnumberNotBetween(String value1, String value2) {
            addCriterion("Sql_documentnumber not between", value1, value2, "sqlDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSqlIdIsNull() {
            addCriterion("Sql_Id is null");
            return (Criteria) this;
        }

        public Criteria andSqlIdIsNotNull() {
            addCriterion("Sql_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSqlIdEqualTo(Integer value) {
            addCriterion("Sql_Id =", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdNotEqualTo(Integer value) {
            addCriterion("Sql_Id <>", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdGreaterThan(Integer value) {
            addCriterion("Sql_Id >", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sql_Id >=", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdLessThan(Integer value) {
            addCriterion("Sql_Id <", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdLessThanOrEqualTo(Integer value) {
            addCriterion("Sql_Id <=", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdIn(List<Integer> values) {
            addCriterion("Sql_Id in", values, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdNotIn(List<Integer> values) {
            addCriterion("Sql_Id not in", values, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdBetween(Integer value1, Integer value2) {
            addCriterion("Sql_Id between", value1, value2, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Sql_Id not between", value1, value2, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlMatNumberIsNull() {
            addCriterion("Sql_mat_number is null");
            return (Criteria) this;
        }

        public Criteria andSqlMatNumberIsNotNull() {
            addCriterion("Sql_mat_number is not null");
            return (Criteria) this;
        }

        public Criteria andSqlMatNumberEqualTo(String value) {
            addCriterion("Sql_mat_number =", value, "sqlMatNumber");
            return (Criteria) this;
        }

        public Criteria andSqlMatNumberNotEqualTo(String value) {
            addCriterion("Sql_mat_number <>", value, "sqlMatNumber");
            return (Criteria) this;
        }

        public Criteria andSqlMatNumberGreaterThan(String value) {
            addCriterion("Sql_mat_number >", value, "sqlMatNumber");
            return (Criteria) this;
        }

        public Criteria andSqlMatNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Sql_mat_number >=", value, "sqlMatNumber");
            return (Criteria) this;
        }

        public Criteria andSqlMatNumberLessThan(String value) {
            addCriterion("Sql_mat_number <", value, "sqlMatNumber");
            return (Criteria) this;
        }

        public Criteria andSqlMatNumberLessThanOrEqualTo(String value) {
            addCriterion("Sql_mat_number <=", value, "sqlMatNumber");
            return (Criteria) this;
        }

        public Criteria andSqlMatNumberLike(String value) {
            addCriterion("Sql_mat_number like", value, "sqlMatNumber");
            return (Criteria) this;
        }

        public Criteria andSqlMatNumberNotLike(String value) {
            addCriterion("Sql_mat_number not like", value, "sqlMatNumber");
            return (Criteria) this;
        }

        public Criteria andSqlMatNumberIn(List<String> values) {
            addCriterion("Sql_mat_number in", values, "sqlMatNumber");
            return (Criteria) this;
        }

        public Criteria andSqlMatNumberNotIn(List<String> values) {
            addCriterion("Sql_mat_number not in", values, "sqlMatNumber");
            return (Criteria) this;
        }

        public Criteria andSqlMatNumberBetween(String value1, String value2) {
            addCriterion("Sql_mat_number between", value1, value2, "sqlMatNumber");
            return (Criteria) this;
        }

        public Criteria andSqlMatNumberNotBetween(String value1, String value2) {
            addCriterion("Sql_mat_number not between", value1, value2, "sqlMatNumber");
            return (Criteria) this;
        }

        public Criteria andSqlMatNameIsNull() {
            addCriterion("Sql_mat_name is null");
            return (Criteria) this;
        }

        public Criteria andSqlMatNameIsNotNull() {
            addCriterion("Sql_mat_name is not null");
            return (Criteria) this;
        }

        public Criteria andSqlMatNameEqualTo(String value) {
            addCriterion("Sql_mat_name =", value, "sqlMatName");
            return (Criteria) this;
        }

        public Criteria andSqlMatNameNotEqualTo(String value) {
            addCriterion("Sql_mat_name <>", value, "sqlMatName");
            return (Criteria) this;
        }

        public Criteria andSqlMatNameGreaterThan(String value) {
            addCriterion("Sql_mat_name >", value, "sqlMatName");
            return (Criteria) this;
        }

        public Criteria andSqlMatNameGreaterThanOrEqualTo(String value) {
            addCriterion("Sql_mat_name >=", value, "sqlMatName");
            return (Criteria) this;
        }

        public Criteria andSqlMatNameLessThan(String value) {
            addCriterion("Sql_mat_name <", value, "sqlMatName");
            return (Criteria) this;
        }

        public Criteria andSqlMatNameLessThanOrEqualTo(String value) {
            addCriterion("Sql_mat_name <=", value, "sqlMatName");
            return (Criteria) this;
        }

        public Criteria andSqlMatNameLike(String value) {
            addCriterion("Sql_mat_name like", value, "sqlMatName");
            return (Criteria) this;
        }

        public Criteria andSqlMatNameNotLike(String value) {
            addCriterion("Sql_mat_name not like", value, "sqlMatName");
            return (Criteria) this;
        }

        public Criteria andSqlMatNameIn(List<String> values) {
            addCriterion("Sql_mat_name in", values, "sqlMatName");
            return (Criteria) this;
        }

        public Criteria andSqlMatNameNotIn(List<String> values) {
            addCriterion("Sql_mat_name not in", values, "sqlMatName");
            return (Criteria) this;
        }

        public Criteria andSqlMatNameBetween(String value1, String value2) {
            addCriterion("Sql_mat_name between", value1, value2, "sqlMatName");
            return (Criteria) this;
        }

        public Criteria andSqlMatNameNotBetween(String value1, String value2) {
            addCriterion("Sql_mat_name not between", value1, value2, "sqlMatName");
            return (Criteria) this;
        }

        public Criteria andSqlMatTypeIsNull() {
            addCriterion("Sql_mat_type is null");
            return (Criteria) this;
        }

        public Criteria andSqlMatTypeIsNotNull() {
            addCriterion("Sql_mat_type is not null");
            return (Criteria) this;
        }

        public Criteria andSqlMatTypeEqualTo(String value) {
            addCriterion("Sql_mat_type =", value, "sqlMatType");
            return (Criteria) this;
        }

        public Criteria andSqlMatTypeNotEqualTo(String value) {
            addCriterion("Sql_mat_type <>", value, "sqlMatType");
            return (Criteria) this;
        }

        public Criteria andSqlMatTypeGreaterThan(String value) {
            addCriterion("Sql_mat_type >", value, "sqlMatType");
            return (Criteria) this;
        }

        public Criteria andSqlMatTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Sql_mat_type >=", value, "sqlMatType");
            return (Criteria) this;
        }

        public Criteria andSqlMatTypeLessThan(String value) {
            addCriterion("Sql_mat_type <", value, "sqlMatType");
            return (Criteria) this;
        }

        public Criteria andSqlMatTypeLessThanOrEqualTo(String value) {
            addCriterion("Sql_mat_type <=", value, "sqlMatType");
            return (Criteria) this;
        }

        public Criteria andSqlMatTypeLike(String value) {
            addCriterion("Sql_mat_type like", value, "sqlMatType");
            return (Criteria) this;
        }

        public Criteria andSqlMatTypeNotLike(String value) {
            addCriterion("Sql_mat_type not like", value, "sqlMatType");
            return (Criteria) this;
        }

        public Criteria andSqlMatTypeIn(List<String> values) {
            addCriterion("Sql_mat_type in", values, "sqlMatType");
            return (Criteria) this;
        }

        public Criteria andSqlMatTypeNotIn(List<String> values) {
            addCriterion("Sql_mat_type not in", values, "sqlMatType");
            return (Criteria) this;
        }

        public Criteria andSqlMatTypeBetween(String value1, String value2) {
            addCriterion("Sql_mat_type between", value1, value2, "sqlMatType");
            return (Criteria) this;
        }

        public Criteria andSqlMatTypeNotBetween(String value1, String value2) {
            addCriterion("Sql_mat_type not between", value1, value2, "sqlMatType");
            return (Criteria) this;
        }

        public Criteria andSqlNominalIsNull() {
            addCriterion("Sql_nominal is null");
            return (Criteria) this;
        }

        public Criteria andSqlNominalIsNotNull() {
            addCriterion("Sql_nominal is not null");
            return (Criteria) this;
        }

        public Criteria andSqlNominalEqualTo(String value) {
            addCriterion("Sql_nominal =", value, "sqlNominal");
            return (Criteria) this;
        }

        public Criteria andSqlNominalNotEqualTo(String value) {
            addCriterion("Sql_nominal <>", value, "sqlNominal");
            return (Criteria) this;
        }

        public Criteria andSqlNominalGreaterThan(String value) {
            addCriterion("Sql_nominal >", value, "sqlNominal");
            return (Criteria) this;
        }

        public Criteria andSqlNominalGreaterThanOrEqualTo(String value) {
            addCriterion("Sql_nominal >=", value, "sqlNominal");
            return (Criteria) this;
        }

        public Criteria andSqlNominalLessThan(String value) {
            addCriterion("Sql_nominal <", value, "sqlNominal");
            return (Criteria) this;
        }

        public Criteria andSqlNominalLessThanOrEqualTo(String value) {
            addCriterion("Sql_nominal <=", value, "sqlNominal");
            return (Criteria) this;
        }

        public Criteria andSqlNominalLike(String value) {
            addCriterion("Sql_nominal like", value, "sqlNominal");
            return (Criteria) this;
        }

        public Criteria andSqlNominalNotLike(String value) {
            addCriterion("Sql_nominal not like", value, "sqlNominal");
            return (Criteria) this;
        }

        public Criteria andSqlNominalIn(List<String> values) {
            addCriterion("Sql_nominal in", values, "sqlNominal");
            return (Criteria) this;
        }

        public Criteria andSqlNominalNotIn(List<String> values) {
            addCriterion("Sql_nominal not in", values, "sqlNominal");
            return (Criteria) this;
        }

        public Criteria andSqlNominalBetween(String value1, String value2) {
            addCriterion("Sql_nominal between", value1, value2, "sqlNominal");
            return (Criteria) this;
        }

        public Criteria andSqlNominalNotBetween(String value1, String value2) {
            addCriterion("Sql_nominal not between", value1, value2, "sqlNominal");
            return (Criteria) this;
        }

        public Criteria andSqlQuantityIsNull() {
            addCriterion("Sql_quantity is null");
            return (Criteria) this;
        }

        public Criteria andSqlQuantityIsNotNull() {
            addCriterion("Sql_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andSqlQuantityEqualTo(Integer value) {
            addCriterion("Sql_quantity =", value, "sqlQuantity");
            return (Criteria) this;
        }

        public Criteria andSqlQuantityNotEqualTo(Integer value) {
            addCriterion("Sql_quantity <>", value, "sqlQuantity");
            return (Criteria) this;
        }

        public Criteria andSqlQuantityGreaterThan(Integer value) {
            addCriterion("Sql_quantity >", value, "sqlQuantity");
            return (Criteria) this;
        }

        public Criteria andSqlQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sql_quantity >=", value, "sqlQuantity");
            return (Criteria) this;
        }

        public Criteria andSqlQuantityLessThan(Integer value) {
            addCriterion("Sql_quantity <", value, "sqlQuantity");
            return (Criteria) this;
        }

        public Criteria andSqlQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("Sql_quantity <=", value, "sqlQuantity");
            return (Criteria) this;
        }

        public Criteria andSqlQuantityIn(List<Integer> values) {
            addCriterion("Sql_quantity in", values, "sqlQuantity");
            return (Criteria) this;
        }

        public Criteria andSqlQuantityNotIn(List<Integer> values) {
            addCriterion("Sql_quantity not in", values, "sqlQuantity");
            return (Criteria) this;
        }

        public Criteria andSqlQuantityBetween(Integer value1, Integer value2) {
            addCriterion("Sql_quantity between", value1, value2, "sqlQuantity");
            return (Criteria) this;
        }

        public Criteria andSqlQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("Sql_quantity not between", value1, value2, "sqlQuantity");
            return (Criteria) this;
        }

        public Criteria andSqlPrePriceIsNull() {
            addCriterion("Sql_pre_price is null");
            return (Criteria) this;
        }

        public Criteria andSqlPrePriceIsNotNull() {
            addCriterion("Sql_pre_price is not null");
            return (Criteria) this;
        }

        public Criteria andSqlPrePriceEqualTo(Double value) {
            addCriterion("Sql_pre_price =", value, "sqlPrePrice");
            return (Criteria) this;
        }

        public Criteria andSqlPrePriceNotEqualTo(Double value) {
            addCriterion("Sql_pre_price <>", value, "sqlPrePrice");
            return (Criteria) this;
        }

        public Criteria andSqlPrePriceGreaterThan(Double value) {
            addCriterion("Sql_pre_price >", value, "sqlPrePrice");
            return (Criteria) this;
        }

        public Criteria andSqlPrePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Sql_pre_price >=", value, "sqlPrePrice");
            return (Criteria) this;
        }

        public Criteria andSqlPrePriceLessThan(Double value) {
            addCriterion("Sql_pre_price <", value, "sqlPrePrice");
            return (Criteria) this;
        }

        public Criteria andSqlPrePriceLessThanOrEqualTo(Double value) {
            addCriterion("Sql_pre_price <=", value, "sqlPrePrice");
            return (Criteria) this;
        }

        public Criteria andSqlPrePriceIn(List<Double> values) {
            addCriterion("Sql_pre_price in", values, "sqlPrePrice");
            return (Criteria) this;
        }

        public Criteria andSqlPrePriceNotIn(List<Double> values) {
            addCriterion("Sql_pre_price not in", values, "sqlPrePrice");
            return (Criteria) this;
        }

        public Criteria andSqlPrePriceBetween(Double value1, Double value2) {
            addCriterion("Sql_pre_price between", value1, value2, "sqlPrePrice");
            return (Criteria) this;
        }

        public Criteria andSqlPrePriceNotBetween(Double value1, Double value2) {
            addCriterion("Sql_pre_price not between", value1, value2, "sqlPrePrice");
            return (Criteria) this;
        }

        public Criteria andSqlFoldIsNull() {
            addCriterion("Sql_fold is null");
            return (Criteria) this;
        }

        public Criteria andSqlFoldIsNotNull() {
            addCriterion("Sql_fold is not null");
            return (Criteria) this;
        }

        public Criteria andSqlFoldEqualTo(Integer value) {
            addCriterion("Sql_fold =", value, "sqlFold");
            return (Criteria) this;
        }

        public Criteria andSqlFoldNotEqualTo(Integer value) {
            addCriterion("Sql_fold <>", value, "sqlFold");
            return (Criteria) this;
        }

        public Criteria andSqlFoldGreaterThan(Integer value) {
            addCriterion("Sql_fold >", value, "sqlFold");
            return (Criteria) this;
        }

        public Criteria andSqlFoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sql_fold >=", value, "sqlFold");
            return (Criteria) this;
        }

        public Criteria andSqlFoldLessThan(Integer value) {
            addCriterion("Sql_fold <", value, "sqlFold");
            return (Criteria) this;
        }

        public Criteria andSqlFoldLessThanOrEqualTo(Integer value) {
            addCriterion("Sql_fold <=", value, "sqlFold");
            return (Criteria) this;
        }

        public Criteria andSqlFoldIn(List<Integer> values) {
            addCriterion("Sql_fold in", values, "sqlFold");
            return (Criteria) this;
        }

        public Criteria andSqlFoldNotIn(List<Integer> values) {
            addCriterion("Sql_fold not in", values, "sqlFold");
            return (Criteria) this;
        }

        public Criteria andSqlFoldBetween(Integer value1, Integer value2) {
            addCriterion("Sql_fold between", value1, value2, "sqlFold");
            return (Criteria) this;
        }

        public Criteria andSqlFoldNotBetween(Integer value1, Integer value2) {
            addCriterion("Sql_fold not between", value1, value2, "sqlFold");
            return (Criteria) this;
        }

        public Criteria andSqlPriceIsNull() {
            addCriterion("Sql_price is null");
            return (Criteria) this;
        }

        public Criteria andSqlPriceIsNotNull() {
            addCriterion("Sql_price is not null");
            return (Criteria) this;
        }

        public Criteria andSqlPriceEqualTo(Double value) {
            addCriterion("Sql_price =", value, "sqlPrice");
            return (Criteria) this;
        }

        public Criteria andSqlPriceNotEqualTo(Double value) {
            addCriterion("Sql_price <>", value, "sqlPrice");
            return (Criteria) this;
        }

        public Criteria andSqlPriceGreaterThan(Double value) {
            addCriterion("Sql_price >", value, "sqlPrice");
            return (Criteria) this;
        }

        public Criteria andSqlPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Sql_price >=", value, "sqlPrice");
            return (Criteria) this;
        }

        public Criteria andSqlPriceLessThan(Double value) {
            addCriterion("Sql_price <", value, "sqlPrice");
            return (Criteria) this;
        }

        public Criteria andSqlPriceLessThanOrEqualTo(Double value) {
            addCriterion("Sql_price <=", value, "sqlPrice");
            return (Criteria) this;
        }

        public Criteria andSqlPriceIn(List<Double> values) {
            addCriterion("Sql_price in", values, "sqlPrice");
            return (Criteria) this;
        }

        public Criteria andSqlPriceNotIn(List<Double> values) {
            addCriterion("Sql_price not in", values, "sqlPrice");
            return (Criteria) this;
        }

        public Criteria andSqlPriceBetween(Double value1, Double value2) {
            addCriterion("Sql_price between", value1, value2, "sqlPrice");
            return (Criteria) this;
        }

        public Criteria andSqlPriceNotBetween(Double value1, Double value2) {
            addCriterion("Sql_price not between", value1, value2, "sqlPrice");
            return (Criteria) this;
        }

        public Criteria andSqlAmountIsNull() {
            addCriterion("Sql_amount is null");
            return (Criteria) this;
        }

        public Criteria andSqlAmountIsNotNull() {
            addCriterion("Sql_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSqlAmountEqualTo(Double value) {
            addCriterion("Sql_amount =", value, "sqlAmount");
            return (Criteria) this;
        }

        public Criteria andSqlAmountNotEqualTo(Double value) {
            addCriterion("Sql_amount <>", value, "sqlAmount");
            return (Criteria) this;
        }

        public Criteria andSqlAmountGreaterThan(Double value) {
            addCriterion("Sql_amount >", value, "sqlAmount");
            return (Criteria) this;
        }

        public Criteria andSqlAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("Sql_amount >=", value, "sqlAmount");
            return (Criteria) this;
        }

        public Criteria andSqlAmountLessThan(Double value) {
            addCriterion("Sql_amount <", value, "sqlAmount");
            return (Criteria) this;
        }

        public Criteria andSqlAmountLessThanOrEqualTo(Double value) {
            addCriterion("Sql_amount <=", value, "sqlAmount");
            return (Criteria) this;
        }

        public Criteria andSqlAmountIn(List<Double> values) {
            addCriterion("Sql_amount in", values, "sqlAmount");
            return (Criteria) this;
        }

        public Criteria andSqlAmountNotIn(List<Double> values) {
            addCriterion("Sql_amount not in", values, "sqlAmount");
            return (Criteria) this;
        }

        public Criteria andSqlAmountBetween(Double value1, Double value2) {
            addCriterion("Sql_amount between", value1, value2, "sqlAmount");
            return (Criteria) this;
        }

        public Criteria andSqlAmountNotBetween(Double value1, Double value2) {
            addCriterion("Sql_amount not between", value1, value2, "sqlAmount");
            return (Criteria) this;
        }

        public Criteria andSqlTaxRateIsNull() {
            addCriterion("Sql_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andSqlTaxRateIsNotNull() {
            addCriterion("Sql_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSqlTaxRateEqualTo(Double value) {
            addCriterion("Sql_tax_rate =", value, "sqlTaxRate");
            return (Criteria) this;
        }

        public Criteria andSqlTaxRateNotEqualTo(Double value) {
            addCriterion("Sql_tax_rate <>", value, "sqlTaxRate");
            return (Criteria) this;
        }

        public Criteria andSqlTaxRateGreaterThan(Double value) {
            addCriterion("Sql_tax_rate >", value, "sqlTaxRate");
            return (Criteria) this;
        }

        public Criteria andSqlTaxRateGreaterThanOrEqualTo(Double value) {
            addCriterion("Sql_tax_rate >=", value, "sqlTaxRate");
            return (Criteria) this;
        }

        public Criteria andSqlTaxRateLessThan(Double value) {
            addCriterion("Sql_tax_rate <", value, "sqlTaxRate");
            return (Criteria) this;
        }

        public Criteria andSqlTaxRateLessThanOrEqualTo(Double value) {
            addCriterion("Sql_tax_rate <=", value, "sqlTaxRate");
            return (Criteria) this;
        }

        public Criteria andSqlTaxRateIn(List<Double> values) {
            addCriterion("Sql_tax_rate in", values, "sqlTaxRate");
            return (Criteria) this;
        }

        public Criteria andSqlTaxRateNotIn(List<Double> values) {
            addCriterion("Sql_tax_rate not in", values, "sqlTaxRate");
            return (Criteria) this;
        }

        public Criteria andSqlTaxRateBetween(Double value1, Double value2) {
            addCriterion("Sql_tax_rate between", value1, value2, "sqlTaxRate");
            return (Criteria) this;
        }

        public Criteria andSqlTaxRateNotBetween(Double value1, Double value2) {
            addCriterion("Sql_tax_rate not between", value1, value2, "sqlTaxRate");
            return (Criteria) this;
        }

        public Criteria andSqlTaxIsNull() {
            addCriterion("Sql_tax is null");
            return (Criteria) this;
        }

        public Criteria andSqlTaxIsNotNull() {
            addCriterion("Sql_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSqlTaxEqualTo(Double value) {
            addCriterion("Sql_tax =", value, "sqlTax");
            return (Criteria) this;
        }

        public Criteria andSqlTaxNotEqualTo(Double value) {
            addCriterion("Sql_tax <>", value, "sqlTax");
            return (Criteria) this;
        }

        public Criteria andSqlTaxGreaterThan(Double value) {
            addCriterion("Sql_tax >", value, "sqlTax");
            return (Criteria) this;
        }

        public Criteria andSqlTaxGreaterThanOrEqualTo(Double value) {
            addCriterion("Sql_tax >=", value, "sqlTax");
            return (Criteria) this;
        }

        public Criteria andSqlTaxLessThan(Double value) {
            addCriterion("Sql_tax <", value, "sqlTax");
            return (Criteria) this;
        }

        public Criteria andSqlTaxLessThanOrEqualTo(Double value) {
            addCriterion("Sql_tax <=", value, "sqlTax");
            return (Criteria) this;
        }

        public Criteria andSqlTaxIn(List<Double> values) {
            addCriterion("Sql_tax in", values, "sqlTax");
            return (Criteria) this;
        }

        public Criteria andSqlTaxNotIn(List<Double> values) {
            addCriterion("Sql_tax not in", values, "sqlTax");
            return (Criteria) this;
        }

        public Criteria andSqlTaxBetween(Double value1, Double value2) {
            addCriterion("Sql_tax between", value1, value2, "sqlTax");
            return (Criteria) this;
        }

        public Criteria andSqlTaxNotBetween(Double value1, Double value2) {
            addCriterion("Sql_tax not between", value1, value2, "sqlTax");
            return (Criteria) this;
        }

        public Criteria andSqlTaxAmountIsNull() {
            addCriterion("Sql_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andSqlTaxAmountIsNotNull() {
            addCriterion("Sql_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSqlTaxAmountEqualTo(Double value) {
            addCriterion("Sql_tax_amount =", value, "sqlTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSqlTaxAmountNotEqualTo(Double value) {
            addCriterion("Sql_tax_amount <>", value, "sqlTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSqlTaxAmountGreaterThan(Double value) {
            addCriterion("Sql_tax_amount >", value, "sqlTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSqlTaxAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("Sql_tax_amount >=", value, "sqlTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSqlTaxAmountLessThan(Double value) {
            addCriterion("Sql_tax_amount <", value, "sqlTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSqlTaxAmountLessThanOrEqualTo(Double value) {
            addCriterion("Sql_tax_amount <=", value, "sqlTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSqlTaxAmountIn(List<Double> values) {
            addCriterion("Sql_tax_amount in", values, "sqlTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSqlTaxAmountNotIn(List<Double> values) {
            addCriterion("Sql_tax_amount not in", values, "sqlTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSqlTaxAmountBetween(Double value1, Double value2) {
            addCriterion("Sql_tax_amount between", value1, value2, "sqlTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSqlTaxAmountNotBetween(Double value1, Double value2) {
            addCriterion("Sql_tax_amount not between", value1, value2, "sqlTaxAmount");
            return (Criteria) this;
        }

        public Criteria andSqlGiveawayIsNull() {
            addCriterion("Sql_giveaway is null");
            return (Criteria) this;
        }

        public Criteria andSqlGiveawayIsNotNull() {
            addCriterion("Sql_giveaway is not null");
            return (Criteria) this;
        }

        public Criteria andSqlGiveawayEqualTo(Integer value) {
            addCriterion("Sql_giveaway =", value, "sqlGiveaway");
            return (Criteria) this;
        }

        public Criteria andSqlGiveawayNotEqualTo(Integer value) {
            addCriterion("Sql_giveaway <>", value, "sqlGiveaway");
            return (Criteria) this;
        }

        public Criteria andSqlGiveawayGreaterThan(Integer value) {
            addCriterion("Sql_giveaway >", value, "sqlGiveaway");
            return (Criteria) this;
        }

        public Criteria andSqlGiveawayGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sql_giveaway >=", value, "sqlGiveaway");
            return (Criteria) this;
        }

        public Criteria andSqlGiveawayLessThan(Integer value) {
            addCriterion("Sql_giveaway <", value, "sqlGiveaway");
            return (Criteria) this;
        }

        public Criteria andSqlGiveawayLessThanOrEqualTo(Integer value) {
            addCriterion("Sql_giveaway <=", value, "sqlGiveaway");
            return (Criteria) this;
        }

        public Criteria andSqlGiveawayIn(List<Integer> values) {
            addCriterion("Sql_giveaway in", values, "sqlGiveaway");
            return (Criteria) this;
        }

        public Criteria andSqlGiveawayNotIn(List<Integer> values) {
            addCriterion("Sql_giveaway not in", values, "sqlGiveaway");
            return (Criteria) this;
        }

        public Criteria andSqlGiveawayBetween(Integer value1, Integer value2) {
            addCriterion("Sql_giveaway between", value1, value2, "sqlGiveaway");
            return (Criteria) this;
        }

        public Criteria andSqlGiveawayNotBetween(Integer value1, Integer value2) {
            addCriterion("Sql_giveaway not between", value1, value2, "sqlGiveaway");
            return (Criteria) this;
        }

        public Criteria andSqlRemarkIsNull() {
            addCriterion("Sql_remark is null");
            return (Criteria) this;
        }

        public Criteria andSqlRemarkIsNotNull() {
            addCriterion("Sql_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSqlRemarkEqualTo(String value) {
            addCriterion("Sql_remark =", value, "sqlRemark");
            return (Criteria) this;
        }

        public Criteria andSqlRemarkNotEqualTo(String value) {
            addCriterion("Sql_remark <>", value, "sqlRemark");
            return (Criteria) this;
        }

        public Criteria andSqlRemarkGreaterThan(String value) {
            addCriterion("Sql_remark >", value, "sqlRemark");
            return (Criteria) this;
        }

        public Criteria andSqlRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Sql_remark >=", value, "sqlRemark");
            return (Criteria) this;
        }

        public Criteria andSqlRemarkLessThan(String value) {
            addCriterion("Sql_remark <", value, "sqlRemark");
            return (Criteria) this;
        }

        public Criteria andSqlRemarkLessThanOrEqualTo(String value) {
            addCriterion("Sql_remark <=", value, "sqlRemark");
            return (Criteria) this;
        }

        public Criteria andSqlRemarkLike(String value) {
            addCriterion("Sql_remark like", value, "sqlRemark");
            return (Criteria) this;
        }

        public Criteria andSqlRemarkNotLike(String value) {
            addCriterion("Sql_remark not like", value, "sqlRemark");
            return (Criteria) this;
        }

        public Criteria andSqlRemarkIn(List<String> values) {
            addCriterion("Sql_remark in", values, "sqlRemark");
            return (Criteria) this;
        }

        public Criteria andSqlRemarkNotIn(List<String> values) {
            addCriterion("Sql_remark not in", values, "sqlRemark");
            return (Criteria) this;
        }

        public Criteria andSqlRemarkBetween(String value1, String value2) {
            addCriterion("Sql_remark between", value1, value2, "sqlRemark");
            return (Criteria) this;
        }

        public Criteria andSqlRemarkNotBetween(String value1, String value2) {
            addCriterion("Sql_remark not between", value1, value2, "sqlRemark");
            return (Criteria) this;
        }

        public Criteria andSqlSpare1IsNull() {
            addCriterion("Sql_Spare1 is null");
            return (Criteria) this;
        }

        public Criteria andSqlSpare1IsNotNull() {
            addCriterion("Sql_Spare1 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlSpare1EqualTo(String value) {
            addCriterion("Sql_Spare1 =", value, "sqlSpare1");
            return (Criteria) this;
        }

        public Criteria andSqlSpare1NotEqualTo(String value) {
            addCriterion("Sql_Spare1 <>", value, "sqlSpare1");
            return (Criteria) this;
        }

        public Criteria andSqlSpare1GreaterThan(String value) {
            addCriterion("Sql_Spare1 >", value, "sqlSpare1");
            return (Criteria) this;
        }

        public Criteria andSqlSpare1GreaterThanOrEqualTo(String value) {
            addCriterion("Sql_Spare1 >=", value, "sqlSpare1");
            return (Criteria) this;
        }

        public Criteria andSqlSpare1LessThan(String value) {
            addCriterion("Sql_Spare1 <", value, "sqlSpare1");
            return (Criteria) this;
        }

        public Criteria andSqlSpare1LessThanOrEqualTo(String value) {
            addCriterion("Sql_Spare1 <=", value, "sqlSpare1");
            return (Criteria) this;
        }

        public Criteria andSqlSpare1Like(String value) {
            addCriterion("Sql_Spare1 like", value, "sqlSpare1");
            return (Criteria) this;
        }

        public Criteria andSqlSpare1NotLike(String value) {
            addCriterion("Sql_Spare1 not like", value, "sqlSpare1");
            return (Criteria) this;
        }

        public Criteria andSqlSpare1In(List<String> values) {
            addCriterion("Sql_Spare1 in", values, "sqlSpare1");
            return (Criteria) this;
        }

        public Criteria andSqlSpare1NotIn(List<String> values) {
            addCriterion("Sql_Spare1 not in", values, "sqlSpare1");
            return (Criteria) this;
        }

        public Criteria andSqlSpare1Between(String value1, String value2) {
            addCriterion("Sql_Spare1 between", value1, value2, "sqlSpare1");
            return (Criteria) this;
        }

        public Criteria andSqlSpare1NotBetween(String value1, String value2) {
            addCriterion("Sql_Spare1 not between", value1, value2, "sqlSpare1");
            return (Criteria) this;
        }

        public Criteria andSqlSpare2IsNull() {
            addCriterion("Sql_Spare2 is null");
            return (Criteria) this;
        }

        public Criteria andSqlSpare2IsNotNull() {
            addCriterion("Sql_Spare2 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlSpare2EqualTo(String value) {
            addCriterion("Sql_Spare2 =", value, "sqlSpare2");
            return (Criteria) this;
        }

        public Criteria andSqlSpare2NotEqualTo(String value) {
            addCriterion("Sql_Spare2 <>", value, "sqlSpare2");
            return (Criteria) this;
        }

        public Criteria andSqlSpare2GreaterThan(String value) {
            addCriterion("Sql_Spare2 >", value, "sqlSpare2");
            return (Criteria) this;
        }

        public Criteria andSqlSpare2GreaterThanOrEqualTo(String value) {
            addCriterion("Sql_Spare2 >=", value, "sqlSpare2");
            return (Criteria) this;
        }

        public Criteria andSqlSpare2LessThan(String value) {
            addCriterion("Sql_Spare2 <", value, "sqlSpare2");
            return (Criteria) this;
        }

        public Criteria andSqlSpare2LessThanOrEqualTo(String value) {
            addCriterion("Sql_Spare2 <=", value, "sqlSpare2");
            return (Criteria) this;
        }

        public Criteria andSqlSpare2Like(String value) {
            addCriterion("Sql_Spare2 like", value, "sqlSpare2");
            return (Criteria) this;
        }

        public Criteria andSqlSpare2NotLike(String value) {
            addCriterion("Sql_Spare2 not like", value, "sqlSpare2");
            return (Criteria) this;
        }

        public Criteria andSqlSpare2In(List<String> values) {
            addCriterion("Sql_Spare2 in", values, "sqlSpare2");
            return (Criteria) this;
        }

        public Criteria andSqlSpare2NotIn(List<String> values) {
            addCriterion("Sql_Spare2 not in", values, "sqlSpare2");
            return (Criteria) this;
        }

        public Criteria andSqlSpare2Between(String value1, String value2) {
            addCriterion("Sql_Spare2 between", value1, value2, "sqlSpare2");
            return (Criteria) this;
        }

        public Criteria andSqlSpare2NotBetween(String value1, String value2) {
            addCriterion("Sql_Spare2 not between", value1, value2, "sqlSpare2");
            return (Criteria) this;
        }

        public Criteria andSqlSpare3IsNull() {
            addCriterion("Sql_Spare3 is null");
            return (Criteria) this;
        }

        public Criteria andSqlSpare3IsNotNull() {
            addCriterion("Sql_Spare3 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlSpare3EqualTo(String value) {
            addCriterion("Sql_Spare3 =", value, "sqlSpare3");
            return (Criteria) this;
        }

        public Criteria andSqlSpare3NotEqualTo(String value) {
            addCriterion("Sql_Spare3 <>", value, "sqlSpare3");
            return (Criteria) this;
        }

        public Criteria andSqlSpare3GreaterThan(String value) {
            addCriterion("Sql_Spare3 >", value, "sqlSpare3");
            return (Criteria) this;
        }

        public Criteria andSqlSpare3GreaterThanOrEqualTo(String value) {
            addCriterion("Sql_Spare3 >=", value, "sqlSpare3");
            return (Criteria) this;
        }

        public Criteria andSqlSpare3LessThan(String value) {
            addCriterion("Sql_Spare3 <", value, "sqlSpare3");
            return (Criteria) this;
        }

        public Criteria andSqlSpare3LessThanOrEqualTo(String value) {
            addCriterion("Sql_Spare3 <=", value, "sqlSpare3");
            return (Criteria) this;
        }

        public Criteria andSqlSpare3Like(String value) {
            addCriterion("Sql_Spare3 like", value, "sqlSpare3");
            return (Criteria) this;
        }

        public Criteria andSqlSpare3NotLike(String value) {
            addCriterion("Sql_Spare3 not like", value, "sqlSpare3");
            return (Criteria) this;
        }

        public Criteria andSqlSpare3In(List<String> values) {
            addCriterion("Sql_Spare3 in", values, "sqlSpare3");
            return (Criteria) this;
        }

        public Criteria andSqlSpare3NotIn(List<String> values) {
            addCriterion("Sql_Spare3 not in", values, "sqlSpare3");
            return (Criteria) this;
        }

        public Criteria andSqlSpare3Between(String value1, String value2) {
            addCriterion("Sql_Spare3 between", value1, value2, "sqlSpare3");
            return (Criteria) this;
        }

        public Criteria andSqlSpare3NotBetween(String value1, String value2) {
            addCriterion("Sql_Spare3 not between", value1, value2, "sqlSpare3");
            return (Criteria) this;
        }

        public Criteria andSqlSpare4IsNull() {
            addCriterion("Sql_Spare4 is null");
            return (Criteria) this;
        }

        public Criteria andSqlSpare4IsNotNull() {
            addCriterion("Sql_Spare4 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlSpare4EqualTo(String value) {
            addCriterion("Sql_Spare4 =", value, "sqlSpare4");
            return (Criteria) this;
        }

        public Criteria andSqlSpare4NotEqualTo(String value) {
            addCriterion("Sql_Spare4 <>", value, "sqlSpare4");
            return (Criteria) this;
        }

        public Criteria andSqlSpare4GreaterThan(String value) {
            addCriterion("Sql_Spare4 >", value, "sqlSpare4");
            return (Criteria) this;
        }

        public Criteria andSqlSpare4GreaterThanOrEqualTo(String value) {
            addCriterion("Sql_Spare4 >=", value, "sqlSpare4");
            return (Criteria) this;
        }

        public Criteria andSqlSpare4LessThan(String value) {
            addCriterion("Sql_Spare4 <", value, "sqlSpare4");
            return (Criteria) this;
        }

        public Criteria andSqlSpare4LessThanOrEqualTo(String value) {
            addCriterion("Sql_Spare4 <=", value, "sqlSpare4");
            return (Criteria) this;
        }

        public Criteria andSqlSpare4Like(String value) {
            addCriterion("Sql_Spare4 like", value, "sqlSpare4");
            return (Criteria) this;
        }

        public Criteria andSqlSpare4NotLike(String value) {
            addCriterion("Sql_Spare4 not like", value, "sqlSpare4");
            return (Criteria) this;
        }

        public Criteria andSqlSpare4In(List<String> values) {
            addCriterion("Sql_Spare4 in", values, "sqlSpare4");
            return (Criteria) this;
        }

        public Criteria andSqlSpare4NotIn(List<String> values) {
            addCriterion("Sql_Spare4 not in", values, "sqlSpare4");
            return (Criteria) this;
        }

        public Criteria andSqlSpare4Between(String value1, String value2) {
            addCriterion("Sql_Spare4 between", value1, value2, "sqlSpare4");
            return (Criteria) this;
        }

        public Criteria andSqlSpare4NotBetween(String value1, String value2) {
            addCriterion("Sql_Spare4 not between", value1, value2, "sqlSpare4");
            return (Criteria) this;
        }

        public Criteria andSqlSpare5IsNull() {
            addCriterion("Sql_Spare5 is null");
            return (Criteria) this;
        }

        public Criteria andSqlSpare5IsNotNull() {
            addCriterion("Sql_Spare5 is not null");
            return (Criteria) this;
        }

        public Criteria andSqlSpare5EqualTo(String value) {
            addCriterion("Sql_Spare5 =", value, "sqlSpare5");
            return (Criteria) this;
        }

        public Criteria andSqlSpare5NotEqualTo(String value) {
            addCriterion("Sql_Spare5 <>", value, "sqlSpare5");
            return (Criteria) this;
        }

        public Criteria andSqlSpare5GreaterThan(String value) {
            addCriterion("Sql_Spare5 >", value, "sqlSpare5");
            return (Criteria) this;
        }

        public Criteria andSqlSpare5GreaterThanOrEqualTo(String value) {
            addCriterion("Sql_Spare5 >=", value, "sqlSpare5");
            return (Criteria) this;
        }

        public Criteria andSqlSpare5LessThan(String value) {
            addCriterion("Sql_Spare5 <", value, "sqlSpare5");
            return (Criteria) this;
        }

        public Criteria andSqlSpare5LessThanOrEqualTo(String value) {
            addCriterion("Sql_Spare5 <=", value, "sqlSpare5");
            return (Criteria) this;
        }

        public Criteria andSqlSpare5Like(String value) {
            addCriterion("Sql_Spare5 like", value, "sqlSpare5");
            return (Criteria) this;
        }

        public Criteria andSqlSpare5NotLike(String value) {
            addCriterion("Sql_Spare5 not like", value, "sqlSpare5");
            return (Criteria) this;
        }

        public Criteria andSqlSpare5In(List<String> values) {
            addCriterion("Sql_Spare5 in", values, "sqlSpare5");
            return (Criteria) this;
        }

        public Criteria andSqlSpare5NotIn(List<String> values) {
            addCriterion("Sql_Spare5 not in", values, "sqlSpare5");
            return (Criteria) this;
        }

        public Criteria andSqlSpare5Between(String value1, String value2) {
            addCriterion("Sql_Spare5 between", value1, value2, "sqlSpare5");
            return (Criteria) this;
        }

        public Criteria andSqlSpare5NotBetween(String value1, String value2) {
            addCriterion("Sql_Spare5 not between", value1, value2, "sqlSpare5");
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