package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SSellOutparticularExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SSellOutparticularExample() {
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

        public Criteria andOuNumberIsNull() {
            addCriterion("ou_number is null");
            return (Criteria) this;
        }

        public Criteria andOuNumberIsNotNull() {
            addCriterion("ou_number is not null");
            return (Criteria) this;
        }

        public Criteria andOuNumberEqualTo(String value) {
            addCriterion("ou_number =", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberNotEqualTo(String value) {
            addCriterion("ou_number <>", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberGreaterThan(String value) {
            addCriterion("ou_number >", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ou_number >=", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberLessThan(String value) {
            addCriterion("ou_number <", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberLessThanOrEqualTo(String value) {
            addCriterion("ou_number <=", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberLike(String value) {
            addCriterion("ou_number like", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberNotLike(String value) {
            addCriterion("ou_number not like", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberIn(List<String> values) {
            addCriterion("ou_number in", values, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberNotIn(List<String> values) {
            addCriterion("ou_number not in", values, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberBetween(String value1, String value2) {
            addCriterion("ou_number between", value1, value2, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberNotBetween(String value1, String value2) {
            addCriterion("ou_number not between", value1, value2, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andSLineIsNull() {
            addCriterion("S_line is null");
            return (Criteria) this;
        }

        public Criteria andSLineIsNotNull() {
            addCriterion("S_line is not null");
            return (Criteria) this;
        }

        public Criteria andSLineEqualTo(String value) {
            addCriterion("S_line =", value, "sLine");
            return (Criteria) this;
        }

        public Criteria andSLineNotEqualTo(String value) {
            addCriterion("S_line <>", value, "sLine");
            return (Criteria) this;
        }

        public Criteria andSLineGreaterThan(String value) {
            addCriterion("S_line >", value, "sLine");
            return (Criteria) this;
        }

        public Criteria andSLineGreaterThanOrEqualTo(String value) {
            addCriterion("S_line >=", value, "sLine");
            return (Criteria) this;
        }

        public Criteria andSLineLessThan(String value) {
            addCriterion("S_line <", value, "sLine");
            return (Criteria) this;
        }

        public Criteria andSLineLessThanOrEqualTo(String value) {
            addCriterion("S_line <=", value, "sLine");
            return (Criteria) this;
        }

        public Criteria andSLineLike(String value) {
            addCriterion("S_line like", value, "sLine");
            return (Criteria) this;
        }

        public Criteria andSLineNotLike(String value) {
            addCriterion("S_line not like", value, "sLine");
            return (Criteria) this;
        }

        public Criteria andSLineIn(List<String> values) {
            addCriterion("S_line in", values, "sLine");
            return (Criteria) this;
        }

        public Criteria andSLineNotIn(List<String> values) {
            addCriterion("S_line not in", values, "sLine");
            return (Criteria) this;
        }

        public Criteria andSLineBetween(String value1, String value2) {
            addCriterion("S_line between", value1, value2, "sLine");
            return (Criteria) this;
        }

        public Criteria andSLineNotBetween(String value1, String value2) {
            addCriterion("S_line not between", value1, value2, "sLine");
            return (Criteria) this;
        }

        public Criteria andSIdentifierIsNull() {
            addCriterion("S_identifier is null");
            return (Criteria) this;
        }

        public Criteria andSIdentifierIsNotNull() {
            addCriterion("S_identifier is not null");
            return (Criteria) this;
        }

        public Criteria andSIdentifierEqualTo(String value) {
            addCriterion("S_identifier =", value, "sIdentifier");
            return (Criteria) this;
        }

        public Criteria andSIdentifierNotEqualTo(String value) {
            addCriterion("S_identifier <>", value, "sIdentifier");
            return (Criteria) this;
        }

        public Criteria andSIdentifierGreaterThan(String value) {
            addCriterion("S_identifier >", value, "sIdentifier");
            return (Criteria) this;
        }

        public Criteria andSIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("S_identifier >=", value, "sIdentifier");
            return (Criteria) this;
        }

        public Criteria andSIdentifierLessThan(String value) {
            addCriterion("S_identifier <", value, "sIdentifier");
            return (Criteria) this;
        }

        public Criteria andSIdentifierLessThanOrEqualTo(String value) {
            addCriterion("S_identifier <=", value, "sIdentifier");
            return (Criteria) this;
        }

        public Criteria andSIdentifierLike(String value) {
            addCriterion("S_identifier like", value, "sIdentifier");
            return (Criteria) this;
        }

        public Criteria andSIdentifierNotLike(String value) {
            addCriterion("S_identifier not like", value, "sIdentifier");
            return (Criteria) this;
        }

        public Criteria andSIdentifierIn(List<String> values) {
            addCriterion("S_identifier in", values, "sIdentifier");
            return (Criteria) this;
        }

        public Criteria andSIdentifierNotIn(List<String> values) {
            addCriterion("S_identifier not in", values, "sIdentifier");
            return (Criteria) this;
        }

        public Criteria andSIdentifierBetween(String value1, String value2) {
            addCriterion("S_identifier between", value1, value2, "sIdentifier");
            return (Criteria) this;
        }

        public Criteria andSIdentifierNotBetween(String value1, String value2) {
            addCriterion("S_identifier not between", value1, value2, "sIdentifier");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("S_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("S_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("S_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("S_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("S_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("S_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("S_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("S_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("S_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("S_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("S_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("S_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("S_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("S_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSModelIsNull() {
            addCriterion("S_model is null");
            return (Criteria) this;
        }

        public Criteria andSModelIsNotNull() {
            addCriterion("S_model is not null");
            return (Criteria) this;
        }

        public Criteria andSModelEqualTo(String value) {
            addCriterion("S_model =", value, "sModel");
            return (Criteria) this;
        }

        public Criteria andSModelNotEqualTo(String value) {
            addCriterion("S_model <>", value, "sModel");
            return (Criteria) this;
        }

        public Criteria andSModelGreaterThan(String value) {
            addCriterion("S_model >", value, "sModel");
            return (Criteria) this;
        }

        public Criteria andSModelGreaterThanOrEqualTo(String value) {
            addCriterion("S_model >=", value, "sModel");
            return (Criteria) this;
        }

        public Criteria andSModelLessThan(String value) {
            addCriterion("S_model <", value, "sModel");
            return (Criteria) this;
        }

        public Criteria andSModelLessThanOrEqualTo(String value) {
            addCriterion("S_model <=", value, "sModel");
            return (Criteria) this;
        }

        public Criteria andSModelLike(String value) {
            addCriterion("S_model like", value, "sModel");
            return (Criteria) this;
        }

        public Criteria andSModelNotLike(String value) {
            addCriterion("S_model not like", value, "sModel");
            return (Criteria) this;
        }

        public Criteria andSModelIn(List<String> values) {
            addCriterion("S_model in", values, "sModel");
            return (Criteria) this;
        }

        public Criteria andSModelNotIn(List<String> values) {
            addCriterion("S_model not in", values, "sModel");
            return (Criteria) this;
        }

        public Criteria andSModelBetween(String value1, String value2) {
            addCriterion("S_model between", value1, value2, "sModel");
            return (Criteria) this;
        }

        public Criteria andSModelNotBetween(String value1, String value2) {
            addCriterion("S_model not between", value1, value2, "sModel");
            return (Criteria) this;
        }

        public Criteria andSUnitnameIsNull() {
            addCriterion("S_unitName is null");
            return (Criteria) this;
        }

        public Criteria andSUnitnameIsNotNull() {
            addCriterion("S_unitName is not null");
            return (Criteria) this;
        }

        public Criteria andSUnitnameEqualTo(String value) {
            addCriterion("S_unitName =", value, "sUnitname");
            return (Criteria) this;
        }

        public Criteria andSUnitnameNotEqualTo(String value) {
            addCriterion("S_unitName <>", value, "sUnitname");
            return (Criteria) this;
        }

        public Criteria andSUnitnameGreaterThan(String value) {
            addCriterion("S_unitName >", value, "sUnitname");
            return (Criteria) this;
        }

        public Criteria andSUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("S_unitName >=", value, "sUnitname");
            return (Criteria) this;
        }

        public Criteria andSUnitnameLessThan(String value) {
            addCriterion("S_unitName <", value, "sUnitname");
            return (Criteria) this;
        }

        public Criteria andSUnitnameLessThanOrEqualTo(String value) {
            addCriterion("S_unitName <=", value, "sUnitname");
            return (Criteria) this;
        }

        public Criteria andSUnitnameLike(String value) {
            addCriterion("S_unitName like", value, "sUnitname");
            return (Criteria) this;
        }

        public Criteria andSUnitnameNotLike(String value) {
            addCriterion("S_unitName not like", value, "sUnitname");
            return (Criteria) this;
        }

        public Criteria andSUnitnameIn(List<String> values) {
            addCriterion("S_unitName in", values, "sUnitname");
            return (Criteria) this;
        }

        public Criteria andSUnitnameNotIn(List<String> values) {
            addCriterion("S_unitName not in", values, "sUnitname");
            return (Criteria) this;
        }

        public Criteria andSUnitnameBetween(String value1, String value2) {
            addCriterion("S_unitName between", value1, value2, "sUnitname");
            return (Criteria) this;
        }

        public Criteria andSUnitnameNotBetween(String value1, String value2) {
            addCriterion("S_unitName not between", value1, value2, "sUnitname");
            return (Criteria) this;
        }

        public Criteria andSCountIsNull() {
            addCriterion("S_count is null");
            return (Criteria) this;
        }

        public Criteria andSCountIsNotNull() {
            addCriterion("S_count is not null");
            return (Criteria) this;
        }

        public Criteria andSCountEqualTo(Integer value) {
            addCriterion("S_count =", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountNotEqualTo(Integer value) {
            addCriterion("S_count <>", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountGreaterThan(Integer value) {
            addCriterion("S_count >", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("S_count >=", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountLessThan(Integer value) {
            addCriterion("S_count <", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountLessThanOrEqualTo(Integer value) {
            addCriterion("S_count <=", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountIn(List<Integer> values) {
            addCriterion("S_count in", values, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountNotIn(List<Integer> values) {
            addCriterion("S_count not in", values, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountBetween(Integer value1, Integer value2) {
            addCriterion("S_count between", value1, value2, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountNotBetween(Integer value1, Integer value2) {
            addCriterion("S_count not between", value1, value2, "sCount");
            return (Criteria) this;
        }

        public Criteria andSRebatepriceIsNull() {
            addCriterion("S_rebatePrice is null");
            return (Criteria) this;
        }

        public Criteria andSRebatepriceIsNotNull() {
            addCriterion("S_rebatePrice is not null");
            return (Criteria) this;
        }

        public Criteria andSRebatepriceEqualTo(Double value) {
            addCriterion("S_rebatePrice =", value, "sRebateprice");
            return (Criteria) this;
        }

        public Criteria andSRebatepriceNotEqualTo(Double value) {
            addCriterion("S_rebatePrice <>", value, "sRebateprice");
            return (Criteria) this;
        }

        public Criteria andSRebatepriceGreaterThan(Double value) {
            addCriterion("S_rebatePrice >", value, "sRebateprice");
            return (Criteria) this;
        }

        public Criteria andSRebatepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("S_rebatePrice >=", value, "sRebateprice");
            return (Criteria) this;
        }

        public Criteria andSRebatepriceLessThan(Double value) {
            addCriterion("S_rebatePrice <", value, "sRebateprice");
            return (Criteria) this;
        }

        public Criteria andSRebatepriceLessThanOrEqualTo(Double value) {
            addCriterion("S_rebatePrice <=", value, "sRebateprice");
            return (Criteria) this;
        }

        public Criteria andSRebatepriceIn(List<Double> values) {
            addCriterion("S_rebatePrice in", values, "sRebateprice");
            return (Criteria) this;
        }

        public Criteria andSRebatepriceNotIn(List<Double> values) {
            addCriterion("S_rebatePrice not in", values, "sRebateprice");
            return (Criteria) this;
        }

        public Criteria andSRebatepriceBetween(Double value1, Double value2) {
            addCriterion("S_rebatePrice between", value1, value2, "sRebateprice");
            return (Criteria) this;
        }

        public Criteria andSRebatepriceNotBetween(Double value1, Double value2) {
            addCriterion("S_rebatePrice not between", value1, value2, "sRebateprice");
            return (Criteria) this;
        }

        public Criteria andSRebateIsNull() {
            addCriterion("s_rebate is null");
            return (Criteria) this;
        }

        public Criteria andSRebateIsNotNull() {
            addCriterion("s_rebate is not null");
            return (Criteria) this;
        }

        public Criteria andSRebateEqualTo(Integer value) {
            addCriterion("s_rebate =", value, "sRebate");
            return (Criteria) this;
        }

        public Criteria andSRebateNotEqualTo(Integer value) {
            addCriterion("s_rebate <>", value, "sRebate");
            return (Criteria) this;
        }

        public Criteria andSRebateGreaterThan(Integer value) {
            addCriterion("s_rebate >", value, "sRebate");
            return (Criteria) this;
        }

        public Criteria andSRebateGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_rebate >=", value, "sRebate");
            return (Criteria) this;
        }

        public Criteria andSRebateLessThan(Integer value) {
            addCriterion("s_rebate <", value, "sRebate");
            return (Criteria) this;
        }

        public Criteria andSRebateLessThanOrEqualTo(Integer value) {
            addCriterion("s_rebate <=", value, "sRebate");
            return (Criteria) this;
        }

        public Criteria andSRebateIn(List<Integer> values) {
            addCriterion("s_rebate in", values, "sRebate");
            return (Criteria) this;
        }

        public Criteria andSRebateNotIn(List<Integer> values) {
            addCriterion("s_rebate not in", values, "sRebate");
            return (Criteria) this;
        }

        public Criteria andSRebateBetween(Integer value1, Integer value2) {
            addCriterion("s_rebate between", value1, value2, "sRebate");
            return (Criteria) this;
        }

        public Criteria andSRebateNotBetween(Integer value1, Integer value2) {
            addCriterion("s_rebate not between", value1, value2, "sRebate");
            return (Criteria) this;
        }

        public Criteria andSPriceIsNull() {
            addCriterion("S_price is null");
            return (Criteria) this;
        }

        public Criteria andSPriceIsNotNull() {
            addCriterion("S_price is not null");
            return (Criteria) this;
        }

        public Criteria andSPriceEqualTo(Double value) {
            addCriterion("S_price =", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotEqualTo(Double value) {
            addCriterion("S_price <>", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceGreaterThan(Double value) {
            addCriterion("S_price >", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("S_price >=", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceLessThan(Double value) {
            addCriterion("S_price <", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceLessThanOrEqualTo(Double value) {
            addCriterion("S_price <=", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceIn(List<Double> values) {
            addCriterion("S_price in", values, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotIn(List<Double> values) {
            addCriterion("S_price not in", values, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceBetween(Double value1, Double value2) {
            addCriterion("S_price between", value1, value2, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotBetween(Double value1, Double value2) {
            addCriterion("S_price not between", value1, value2, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSMoneyIsNull() {
            addCriterion("S_money is null");
            return (Criteria) this;
        }

        public Criteria andSMoneyIsNotNull() {
            addCriterion("S_money is not null");
            return (Criteria) this;
        }

        public Criteria andSMoneyEqualTo(Double value) {
            addCriterion("S_money =", value, "sMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyNotEqualTo(Double value) {
            addCriterion("S_money <>", value, "sMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyGreaterThan(Double value) {
            addCriterion("S_money >", value, "sMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("S_money >=", value, "sMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyLessThan(Double value) {
            addCriterion("S_money <", value, "sMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyLessThanOrEqualTo(Double value) {
            addCriterion("S_money <=", value, "sMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyIn(List<Double> values) {
            addCriterion("S_money in", values, "sMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyNotIn(List<Double> values) {
            addCriterion("S_money not in", values, "sMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyBetween(Double value1, Double value2) {
            addCriterion("S_money between", value1, value2, "sMoney");
            return (Criteria) this;
        }

        public Criteria andSMoneyNotBetween(Double value1, Double value2) {
            addCriterion("S_money not between", value1, value2, "sMoney");
            return (Criteria) this;
        }

        public Criteria andSTaxesIsNull() {
            addCriterion("S_taxes is null");
            return (Criteria) this;
        }

        public Criteria andSTaxesIsNotNull() {
            addCriterion("S_taxes is not null");
            return (Criteria) this;
        }

        public Criteria andSTaxesEqualTo(Integer value) {
            addCriterion("S_taxes =", value, "sTaxes");
            return (Criteria) this;
        }

        public Criteria andSTaxesNotEqualTo(Integer value) {
            addCriterion("S_taxes <>", value, "sTaxes");
            return (Criteria) this;
        }

        public Criteria andSTaxesGreaterThan(Integer value) {
            addCriterion("S_taxes >", value, "sTaxes");
            return (Criteria) this;
        }

        public Criteria andSTaxesGreaterThanOrEqualTo(Integer value) {
            addCriterion("S_taxes >=", value, "sTaxes");
            return (Criteria) this;
        }

        public Criteria andSTaxesLessThan(Integer value) {
            addCriterion("S_taxes <", value, "sTaxes");
            return (Criteria) this;
        }

        public Criteria andSTaxesLessThanOrEqualTo(Integer value) {
            addCriterion("S_taxes <=", value, "sTaxes");
            return (Criteria) this;
        }

        public Criteria andSTaxesIn(List<Integer> values) {
            addCriterion("S_taxes in", values, "sTaxes");
            return (Criteria) this;
        }

        public Criteria andSTaxesNotIn(List<Integer> values) {
            addCriterion("S_taxes not in", values, "sTaxes");
            return (Criteria) this;
        }

        public Criteria andSTaxesBetween(Integer value1, Integer value2) {
            addCriterion("S_taxes between", value1, value2, "sTaxes");
            return (Criteria) this;
        }

        public Criteria andSTaxesNotBetween(Integer value1, Integer value2) {
            addCriterion("S_taxes not between", value1, value2, "sTaxes");
            return (Criteria) this;
        }

        public Criteria andSTaxIsNull() {
            addCriterion("S_tax is null");
            return (Criteria) this;
        }

        public Criteria andSTaxIsNotNull() {
            addCriterion("S_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSTaxEqualTo(Double value) {
            addCriterion("S_tax =", value, "sTax");
            return (Criteria) this;
        }

        public Criteria andSTaxNotEqualTo(Double value) {
            addCriterion("S_tax <>", value, "sTax");
            return (Criteria) this;
        }

        public Criteria andSTaxGreaterThan(Double value) {
            addCriterion("S_tax >", value, "sTax");
            return (Criteria) this;
        }

        public Criteria andSTaxGreaterThanOrEqualTo(Double value) {
            addCriterion("S_tax >=", value, "sTax");
            return (Criteria) this;
        }

        public Criteria andSTaxLessThan(Double value) {
            addCriterion("S_tax <", value, "sTax");
            return (Criteria) this;
        }

        public Criteria andSTaxLessThanOrEqualTo(Double value) {
            addCriterion("S_tax <=", value, "sTax");
            return (Criteria) this;
        }

        public Criteria andSTaxIn(List<Double> values) {
            addCriterion("S_tax in", values, "sTax");
            return (Criteria) this;
        }

        public Criteria andSTaxNotIn(List<Double> values) {
            addCriterion("S_tax not in", values, "sTax");
            return (Criteria) this;
        }

        public Criteria andSTaxBetween(Double value1, Double value2) {
            addCriterion("S_tax between", value1, value2, "sTax");
            return (Criteria) this;
        }

        public Criteria andSTaxNotBetween(Double value1, Double value2) {
            addCriterion("S_tax not between", value1, value2, "sTax");
            return (Criteria) this;
        }

        public Criteria andSCostpriceIsNull() {
            addCriterion("S_costPrice is null");
            return (Criteria) this;
        }

        public Criteria andSCostpriceIsNotNull() {
            addCriterion("S_costPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSCostpriceEqualTo(Double value) {
            addCriterion("S_costPrice =", value, "sCostprice");
            return (Criteria) this;
        }

        public Criteria andSCostpriceNotEqualTo(Double value) {
            addCriterion("S_costPrice <>", value, "sCostprice");
            return (Criteria) this;
        }

        public Criteria andSCostpriceGreaterThan(Double value) {
            addCriterion("S_costPrice >", value, "sCostprice");
            return (Criteria) this;
        }

        public Criteria andSCostpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("S_costPrice >=", value, "sCostprice");
            return (Criteria) this;
        }

        public Criteria andSCostpriceLessThan(Double value) {
            addCriterion("S_costPrice <", value, "sCostprice");
            return (Criteria) this;
        }

        public Criteria andSCostpriceLessThanOrEqualTo(Double value) {
            addCriterion("S_costPrice <=", value, "sCostprice");
            return (Criteria) this;
        }

        public Criteria andSCostpriceIn(List<Double> values) {
            addCriterion("S_costPrice in", values, "sCostprice");
            return (Criteria) this;
        }

        public Criteria andSCostpriceNotIn(List<Double> values) {
            addCriterion("S_costPrice not in", values, "sCostprice");
            return (Criteria) this;
        }

        public Criteria andSCostpriceBetween(Double value1, Double value2) {
            addCriterion("S_costPrice between", value1, value2, "sCostprice");
            return (Criteria) this;
        }

        public Criteria andSCostpriceNotBetween(Double value1, Double value2) {
            addCriterion("S_costPrice not between", value1, value2, "sCostprice");
            return (Criteria) this;
        }

        public Criteria andSNormpriceIsNull() {
            addCriterion("S_normPrice is null");
            return (Criteria) this;
        }

        public Criteria andSNormpriceIsNotNull() {
            addCriterion("S_normPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSNormpriceEqualTo(Double value) {
            addCriterion("S_normPrice =", value, "sNormprice");
            return (Criteria) this;
        }

        public Criteria andSNormpriceNotEqualTo(Double value) {
            addCriterion("S_normPrice <>", value, "sNormprice");
            return (Criteria) this;
        }

        public Criteria andSNormpriceGreaterThan(Double value) {
            addCriterion("S_normPrice >", value, "sNormprice");
            return (Criteria) this;
        }

        public Criteria andSNormpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("S_normPrice >=", value, "sNormprice");
            return (Criteria) this;
        }

        public Criteria andSNormpriceLessThan(Double value) {
            addCriterion("S_normPrice <", value, "sNormprice");
            return (Criteria) this;
        }

        public Criteria andSNormpriceLessThanOrEqualTo(Double value) {
            addCriterion("S_normPrice <=", value, "sNormprice");
            return (Criteria) this;
        }

        public Criteria andSNormpriceIn(List<Double> values) {
            addCriterion("S_normPrice in", values, "sNormprice");
            return (Criteria) this;
        }

        public Criteria andSNormpriceNotIn(List<Double> values) {
            addCriterion("S_normPrice not in", values, "sNormprice");
            return (Criteria) this;
        }

        public Criteria andSNormpriceBetween(Double value1, Double value2) {
            addCriterion("S_normPrice between", value1, value2, "sNormprice");
            return (Criteria) this;
        }

        public Criteria andSNormpriceNotBetween(Double value1, Double value2) {
            addCriterion("S_normPrice not between", value1, value2, "sNormprice");
            return (Criteria) this;
        }

        public Criteria andSTaxmoneyIsNull() {
            addCriterion("S_taxMoney is null");
            return (Criteria) this;
        }

        public Criteria andSTaxmoneyIsNotNull() {
            addCriterion("S_taxMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSTaxmoneyEqualTo(Double value) {
            addCriterion("S_taxMoney =", value, "sTaxmoney");
            return (Criteria) this;
        }

        public Criteria andSTaxmoneyNotEqualTo(Double value) {
            addCriterion("S_taxMoney <>", value, "sTaxmoney");
            return (Criteria) this;
        }

        public Criteria andSTaxmoneyGreaterThan(Double value) {
            addCriterion("S_taxMoney >", value, "sTaxmoney");
            return (Criteria) this;
        }

        public Criteria andSTaxmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("S_taxMoney >=", value, "sTaxmoney");
            return (Criteria) this;
        }

        public Criteria andSTaxmoneyLessThan(Double value) {
            addCriterion("S_taxMoney <", value, "sTaxmoney");
            return (Criteria) this;
        }

        public Criteria andSTaxmoneyLessThanOrEqualTo(Double value) {
            addCriterion("S_taxMoney <=", value, "sTaxmoney");
            return (Criteria) this;
        }

        public Criteria andSTaxmoneyIn(List<Double> values) {
            addCriterion("S_taxMoney in", values, "sTaxmoney");
            return (Criteria) this;
        }

        public Criteria andSTaxmoneyNotIn(List<Double> values) {
            addCriterion("S_taxMoney not in", values, "sTaxmoney");
            return (Criteria) this;
        }

        public Criteria andSTaxmoneyBetween(Double value1, Double value2) {
            addCriterion("S_taxMoney between", value1, value2, "sTaxmoney");
            return (Criteria) this;
        }

        public Criteria andSTaxmoneyNotBetween(Double value1, Double value2) {
            addCriterion("S_taxMoney not between", value1, value2, "sTaxmoney");
            return (Criteria) this;
        }

        public Criteria andSGiftIsNull() {
            addCriterion("S_gift is null");
            return (Criteria) this;
        }

        public Criteria andSGiftIsNotNull() {
            addCriterion("S_gift is not null");
            return (Criteria) this;
        }

        public Criteria andSGiftEqualTo(Integer value) {
            addCriterion("S_gift =", value, "sGift");
            return (Criteria) this;
        }

        public Criteria andSGiftNotEqualTo(Integer value) {
            addCriterion("S_gift <>", value, "sGift");
            return (Criteria) this;
        }

        public Criteria andSGiftGreaterThan(Integer value) {
            addCriterion("S_gift >", value, "sGift");
            return (Criteria) this;
        }

        public Criteria andSGiftGreaterThanOrEqualTo(Integer value) {
            addCriterion("S_gift >=", value, "sGift");
            return (Criteria) this;
        }

        public Criteria andSGiftLessThan(Integer value) {
            addCriterion("S_gift <", value, "sGift");
            return (Criteria) this;
        }

        public Criteria andSGiftLessThanOrEqualTo(Integer value) {
            addCriterion("S_gift <=", value, "sGift");
            return (Criteria) this;
        }

        public Criteria andSGiftIn(List<Integer> values) {
            addCriterion("S_gift in", values, "sGift");
            return (Criteria) this;
        }

        public Criteria andSGiftNotIn(List<Integer> values) {
            addCriterion("S_gift not in", values, "sGift");
            return (Criteria) this;
        }

        public Criteria andSGiftBetween(Integer value1, Integer value2) {
            addCriterion("S_gift between", value1, value2, "sGift");
            return (Criteria) this;
        }

        public Criteria andSGiftNotBetween(Integer value1, Integer value2) {
            addCriterion("S_gift not between", value1, value2, "sGift");
            return (Criteria) this;
        }

        public Criteria andSNumbersIsNull() {
            addCriterion("S_numbers is null");
            return (Criteria) this;
        }

        public Criteria andSNumbersIsNotNull() {
            addCriterion("S_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andSNumbersEqualTo(String value) {
            addCriterion("S_numbers =", value, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersNotEqualTo(String value) {
            addCriterion("S_numbers <>", value, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersGreaterThan(String value) {
            addCriterion("S_numbers >", value, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersGreaterThanOrEqualTo(String value) {
            addCriterion("S_numbers >=", value, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersLessThan(String value) {
            addCriterion("S_numbers <", value, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersLessThanOrEqualTo(String value) {
            addCriterion("S_numbers <=", value, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersLike(String value) {
            addCriterion("S_numbers like", value, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersNotLike(String value) {
            addCriterion("S_numbers not like", value, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersIn(List<String> values) {
            addCriterion("S_numbers in", values, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersNotIn(List<String> values) {
            addCriterion("S_numbers not in", values, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersBetween(String value1, String value2) {
            addCriterion("S_numbers between", value1, value2, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSNumbersNotBetween(String value1, String value2) {
            addCriterion("S_numbers not between", value1, value2, "sNumbers");
            return (Criteria) this;
        }

        public Criteria andSSourceIsNull() {
            addCriterion("S_source is null");
            return (Criteria) this;
        }

        public Criteria andSSourceIsNotNull() {
            addCriterion("S_source is not null");
            return (Criteria) this;
        }

        public Criteria andSSourceEqualTo(String value) {
            addCriterion("S_source =", value, "sSource");
            return (Criteria) this;
        }

        public Criteria andSSourceNotEqualTo(String value) {
            addCriterion("S_source <>", value, "sSource");
            return (Criteria) this;
        }

        public Criteria andSSourceGreaterThan(String value) {
            addCriterion("S_source >", value, "sSource");
            return (Criteria) this;
        }

        public Criteria andSSourceGreaterThanOrEqualTo(String value) {
            addCriterion("S_source >=", value, "sSource");
            return (Criteria) this;
        }

        public Criteria andSSourceLessThan(String value) {
            addCriterion("S_source <", value, "sSource");
            return (Criteria) this;
        }

        public Criteria andSSourceLessThanOrEqualTo(String value) {
            addCriterion("S_source <=", value, "sSource");
            return (Criteria) this;
        }

        public Criteria andSSourceLike(String value) {
            addCriterion("S_source like", value, "sSource");
            return (Criteria) this;
        }

        public Criteria andSSourceNotLike(String value) {
            addCriterion("S_source not like", value, "sSource");
            return (Criteria) this;
        }

        public Criteria andSSourceIn(List<String> values) {
            addCriterion("S_source in", values, "sSource");
            return (Criteria) this;
        }

        public Criteria andSSourceNotIn(List<String> values) {
            addCriterion("S_source not in", values, "sSource");
            return (Criteria) this;
        }

        public Criteria andSSourceBetween(String value1, String value2) {
            addCriterion("S_source between", value1, value2, "sSource");
            return (Criteria) this;
        }

        public Criteria andSSourceNotBetween(String value1, String value2) {
            addCriterion("S_source not between", value1, value2, "sSource");
            return (Criteria) this;
        }

        public Criteria andSRemarkIsNull() {
            addCriterion("S_remark is null");
            return (Criteria) this;
        }

        public Criteria andSRemarkIsNotNull() {
            addCriterion("S_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSRemarkEqualTo(String value) {
            addCriterion("S_remark =", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkNotEqualTo(String value) {
            addCriterion("S_remark <>", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkGreaterThan(String value) {
            addCriterion("S_remark >", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("S_remark >=", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkLessThan(String value) {
            addCriterion("S_remark <", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkLessThanOrEqualTo(String value) {
            addCriterion("S_remark <=", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkLike(String value) {
            addCriterion("S_remark like", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkNotLike(String value) {
            addCriterion("S_remark not like", value, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkIn(List<String> values) {
            addCriterion("S_remark in", values, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkNotIn(List<String> values) {
            addCriterion("S_remark not in", values, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkBetween(String value1, String value2) {
            addCriterion("S_remark between", value1, value2, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSRemarkNotBetween(String value1, String value2) {
            addCriterion("S_remark not between", value1, value2, "sRemark");
            return (Criteria) this;
        }

        public Criteria andSByzd1IsNull() {
            addCriterion("s_byzd1 is null");
            return (Criteria) this;
        }

        public Criteria andSByzd1IsNotNull() {
            addCriterion("s_byzd1 is not null");
            return (Criteria) this;
        }

        public Criteria andSByzd1EqualTo(String value) {
            addCriterion("s_byzd1 =", value, "sByzd1");
            return (Criteria) this;
        }

        public Criteria andSByzd1NotEqualTo(String value) {
            addCriterion("s_byzd1 <>", value, "sByzd1");
            return (Criteria) this;
        }

        public Criteria andSByzd1GreaterThan(String value) {
            addCriterion("s_byzd1 >", value, "sByzd1");
            return (Criteria) this;
        }

        public Criteria andSByzd1GreaterThanOrEqualTo(String value) {
            addCriterion("s_byzd1 >=", value, "sByzd1");
            return (Criteria) this;
        }

        public Criteria andSByzd1LessThan(String value) {
            addCriterion("s_byzd1 <", value, "sByzd1");
            return (Criteria) this;
        }

        public Criteria andSByzd1LessThanOrEqualTo(String value) {
            addCriterion("s_byzd1 <=", value, "sByzd1");
            return (Criteria) this;
        }

        public Criteria andSByzd1Like(String value) {
            addCriterion("s_byzd1 like", value, "sByzd1");
            return (Criteria) this;
        }

        public Criteria andSByzd1NotLike(String value) {
            addCriterion("s_byzd1 not like", value, "sByzd1");
            return (Criteria) this;
        }

        public Criteria andSByzd1In(List<String> values) {
            addCriterion("s_byzd1 in", values, "sByzd1");
            return (Criteria) this;
        }

        public Criteria andSByzd1NotIn(List<String> values) {
            addCriterion("s_byzd1 not in", values, "sByzd1");
            return (Criteria) this;
        }

        public Criteria andSByzd1Between(String value1, String value2) {
            addCriterion("s_byzd1 between", value1, value2, "sByzd1");
            return (Criteria) this;
        }

        public Criteria andSByzd1NotBetween(String value1, String value2) {
            addCriterion("s_byzd1 not between", value1, value2, "sByzd1");
            return (Criteria) this;
        }

        public Criteria andSByzd2IsNull() {
            addCriterion("s_byzd2 is null");
            return (Criteria) this;
        }

        public Criteria andSByzd2IsNotNull() {
            addCriterion("s_byzd2 is not null");
            return (Criteria) this;
        }

        public Criteria andSByzd2EqualTo(String value) {
            addCriterion("s_byzd2 =", value, "sByzd2");
            return (Criteria) this;
        }

        public Criteria andSByzd2NotEqualTo(String value) {
            addCriterion("s_byzd2 <>", value, "sByzd2");
            return (Criteria) this;
        }

        public Criteria andSByzd2GreaterThan(String value) {
            addCriterion("s_byzd2 >", value, "sByzd2");
            return (Criteria) this;
        }

        public Criteria andSByzd2GreaterThanOrEqualTo(String value) {
            addCriterion("s_byzd2 >=", value, "sByzd2");
            return (Criteria) this;
        }

        public Criteria andSByzd2LessThan(String value) {
            addCriterion("s_byzd2 <", value, "sByzd2");
            return (Criteria) this;
        }

        public Criteria andSByzd2LessThanOrEqualTo(String value) {
            addCriterion("s_byzd2 <=", value, "sByzd2");
            return (Criteria) this;
        }

        public Criteria andSByzd2Like(String value) {
            addCriterion("s_byzd2 like", value, "sByzd2");
            return (Criteria) this;
        }

        public Criteria andSByzd2NotLike(String value) {
            addCriterion("s_byzd2 not like", value, "sByzd2");
            return (Criteria) this;
        }

        public Criteria andSByzd2In(List<String> values) {
            addCriterion("s_byzd2 in", values, "sByzd2");
            return (Criteria) this;
        }

        public Criteria andSByzd2NotIn(List<String> values) {
            addCriterion("s_byzd2 not in", values, "sByzd2");
            return (Criteria) this;
        }

        public Criteria andSByzd2Between(String value1, String value2) {
            addCriterion("s_byzd2 between", value1, value2, "sByzd2");
            return (Criteria) this;
        }

        public Criteria andSByzd2NotBetween(String value1, String value2) {
            addCriterion("s_byzd2 not between", value1, value2, "sByzd2");
            return (Criteria) this;
        }

        public Criteria andSByzd3IsNull() {
            addCriterion("s_byzd3 is null");
            return (Criteria) this;
        }

        public Criteria andSByzd3IsNotNull() {
            addCriterion("s_byzd3 is not null");
            return (Criteria) this;
        }

        public Criteria andSByzd3EqualTo(String value) {
            addCriterion("s_byzd3 =", value, "sByzd3");
            return (Criteria) this;
        }

        public Criteria andSByzd3NotEqualTo(String value) {
            addCriterion("s_byzd3 <>", value, "sByzd3");
            return (Criteria) this;
        }

        public Criteria andSByzd3GreaterThan(String value) {
            addCriterion("s_byzd3 >", value, "sByzd3");
            return (Criteria) this;
        }

        public Criteria andSByzd3GreaterThanOrEqualTo(String value) {
            addCriterion("s_byzd3 >=", value, "sByzd3");
            return (Criteria) this;
        }

        public Criteria andSByzd3LessThan(String value) {
            addCriterion("s_byzd3 <", value, "sByzd3");
            return (Criteria) this;
        }

        public Criteria andSByzd3LessThanOrEqualTo(String value) {
            addCriterion("s_byzd3 <=", value, "sByzd3");
            return (Criteria) this;
        }

        public Criteria andSByzd3Like(String value) {
            addCriterion("s_byzd3 like", value, "sByzd3");
            return (Criteria) this;
        }

        public Criteria andSByzd3NotLike(String value) {
            addCriterion("s_byzd3 not like", value, "sByzd3");
            return (Criteria) this;
        }

        public Criteria andSByzd3In(List<String> values) {
            addCriterion("s_byzd3 in", values, "sByzd3");
            return (Criteria) this;
        }

        public Criteria andSByzd3NotIn(List<String> values) {
            addCriterion("s_byzd3 not in", values, "sByzd3");
            return (Criteria) this;
        }

        public Criteria andSByzd3Between(String value1, String value2) {
            addCriterion("s_byzd3 between", value1, value2, "sByzd3");
            return (Criteria) this;
        }

        public Criteria andSByzd3NotBetween(String value1, String value2) {
            addCriterion("s_byzd3 not between", value1, value2, "sByzd3");
            return (Criteria) this;
        }

        public Criteria andSByzd4IsNull() {
            addCriterion("s_byzd4 is null");
            return (Criteria) this;
        }

        public Criteria andSByzd4IsNotNull() {
            addCriterion("s_byzd4 is not null");
            return (Criteria) this;
        }

        public Criteria andSByzd4EqualTo(String value) {
            addCriterion("s_byzd4 =", value, "sByzd4");
            return (Criteria) this;
        }

        public Criteria andSByzd4NotEqualTo(String value) {
            addCriterion("s_byzd4 <>", value, "sByzd4");
            return (Criteria) this;
        }

        public Criteria andSByzd4GreaterThan(String value) {
            addCriterion("s_byzd4 >", value, "sByzd4");
            return (Criteria) this;
        }

        public Criteria andSByzd4GreaterThanOrEqualTo(String value) {
            addCriterion("s_byzd4 >=", value, "sByzd4");
            return (Criteria) this;
        }

        public Criteria andSByzd4LessThan(String value) {
            addCriterion("s_byzd4 <", value, "sByzd4");
            return (Criteria) this;
        }

        public Criteria andSByzd4LessThanOrEqualTo(String value) {
            addCriterion("s_byzd4 <=", value, "sByzd4");
            return (Criteria) this;
        }

        public Criteria andSByzd4Like(String value) {
            addCriterion("s_byzd4 like", value, "sByzd4");
            return (Criteria) this;
        }

        public Criteria andSByzd4NotLike(String value) {
            addCriterion("s_byzd4 not like", value, "sByzd4");
            return (Criteria) this;
        }

        public Criteria andSByzd4In(List<String> values) {
            addCriterion("s_byzd4 in", values, "sByzd4");
            return (Criteria) this;
        }

        public Criteria andSByzd4NotIn(List<String> values) {
            addCriterion("s_byzd4 not in", values, "sByzd4");
            return (Criteria) this;
        }

        public Criteria andSByzd4Between(String value1, String value2) {
            addCriterion("s_byzd4 between", value1, value2, "sByzd4");
            return (Criteria) this;
        }

        public Criteria andSByzd4NotBetween(String value1, String value2) {
            addCriterion("s_byzd4 not between", value1, value2, "sByzd4");
            return (Criteria) this;
        }

        public Criteria andSByzd5IsNull() {
            addCriterion("s_byzd5 is null");
            return (Criteria) this;
        }

        public Criteria andSByzd5IsNotNull() {
            addCriterion("s_byzd5 is not null");
            return (Criteria) this;
        }

        public Criteria andSByzd5EqualTo(String value) {
            addCriterion("s_byzd5 =", value, "sByzd5");
            return (Criteria) this;
        }

        public Criteria andSByzd5NotEqualTo(String value) {
            addCriterion("s_byzd5 <>", value, "sByzd5");
            return (Criteria) this;
        }

        public Criteria andSByzd5GreaterThan(String value) {
            addCriterion("s_byzd5 >", value, "sByzd5");
            return (Criteria) this;
        }

        public Criteria andSByzd5GreaterThanOrEqualTo(String value) {
            addCriterion("s_byzd5 >=", value, "sByzd5");
            return (Criteria) this;
        }

        public Criteria andSByzd5LessThan(String value) {
            addCriterion("s_byzd5 <", value, "sByzd5");
            return (Criteria) this;
        }

        public Criteria andSByzd5LessThanOrEqualTo(String value) {
            addCriterion("s_byzd5 <=", value, "sByzd5");
            return (Criteria) this;
        }

        public Criteria andSByzd5Like(String value) {
            addCriterion("s_byzd5 like", value, "sByzd5");
            return (Criteria) this;
        }

        public Criteria andSByzd5NotLike(String value) {
            addCriterion("s_byzd5 not like", value, "sByzd5");
            return (Criteria) this;
        }

        public Criteria andSByzd5In(List<String> values) {
            addCriterion("s_byzd5 in", values, "sByzd5");
            return (Criteria) this;
        }

        public Criteria andSByzd5NotIn(List<String> values) {
            addCriterion("s_byzd5 not in", values, "sByzd5");
            return (Criteria) this;
        }

        public Criteria andSByzd5Between(String value1, String value2) {
            addCriterion("s_byzd5 between", value1, value2, "sByzd5");
            return (Criteria) this;
        }

        public Criteria andSByzd5NotBetween(String value1, String value2) {
            addCriterion("s_byzd5 not between", value1, value2, "sByzd5");
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