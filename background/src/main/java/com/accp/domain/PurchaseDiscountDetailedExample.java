package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PurchaseDiscountDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseDiscountDetailedExample() {
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

        public Criteria andPddIdIsNull() {
            addCriterion("pdd_id is null");
            return (Criteria) this;
        }

        public Criteria andPddIdIsNotNull() {
            addCriterion("pdd_id is not null");
            return (Criteria) this;
        }

        public Criteria andPddIdEqualTo(String value) {
            addCriterion("pdd_id =", value, "pddId");
            return (Criteria) this;
        }

        public Criteria andPddIdNotEqualTo(String value) {
            addCriterion("pdd_id <>", value, "pddId");
            return (Criteria) this;
        }

        public Criteria andPddIdGreaterThan(String value) {
            addCriterion("pdd_id >", value, "pddId");
            return (Criteria) this;
        }

        public Criteria andPddIdGreaterThanOrEqualTo(String value) {
            addCriterion("pdd_id >=", value, "pddId");
            return (Criteria) this;
        }

        public Criteria andPddIdLessThan(String value) {
            addCriterion("pdd_id <", value, "pddId");
            return (Criteria) this;
        }

        public Criteria andPddIdLessThanOrEqualTo(String value) {
            addCriterion("pdd_id <=", value, "pddId");
            return (Criteria) this;
        }

        public Criteria andPddIdLike(String value) {
            addCriterion("pdd_id like", value, "pddId");
            return (Criteria) this;
        }

        public Criteria andPddIdNotLike(String value) {
            addCriterion("pdd_id not like", value, "pddId");
            return (Criteria) this;
        }

        public Criteria andPddIdIn(List<String> values) {
            addCriterion("pdd_id in", values, "pddId");
            return (Criteria) this;
        }

        public Criteria andPddIdNotIn(List<String> values) {
            addCriterion("pdd_id not in", values, "pddId");
            return (Criteria) this;
        }

        public Criteria andPddIdBetween(String value1, String value2) {
            addCriterion("pdd_id between", value1, value2, "pddId");
            return (Criteria) this;
        }

        public Criteria andPddIdNotBetween(String value1, String value2) {
            addCriterion("pdd_id not between", value1, value2, "pddId");
            return (Criteria) this;
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

        public Criteria andPddMatterIdIsNull() {
            addCriterion("pdd_matter_id is null");
            return (Criteria) this;
        }

        public Criteria andPddMatterIdIsNotNull() {
            addCriterion("pdd_matter_id is not null");
            return (Criteria) this;
        }

        public Criteria andPddMatterIdEqualTo(String value) {
            addCriterion("pdd_matter_id =", value, "pddMatterId");
            return (Criteria) this;
        }

        public Criteria andPddMatterIdNotEqualTo(String value) {
            addCriterion("pdd_matter_id <>", value, "pddMatterId");
            return (Criteria) this;
        }

        public Criteria andPddMatterIdGreaterThan(String value) {
            addCriterion("pdd_matter_id >", value, "pddMatterId");
            return (Criteria) this;
        }

        public Criteria andPddMatterIdGreaterThanOrEqualTo(String value) {
            addCriterion("pdd_matter_id >=", value, "pddMatterId");
            return (Criteria) this;
        }

        public Criteria andPddMatterIdLessThan(String value) {
            addCriterion("pdd_matter_id <", value, "pddMatterId");
            return (Criteria) this;
        }

        public Criteria andPddMatterIdLessThanOrEqualTo(String value) {
            addCriterion("pdd_matter_id <=", value, "pddMatterId");
            return (Criteria) this;
        }

        public Criteria andPddMatterIdLike(String value) {
            addCriterion("pdd_matter_id like", value, "pddMatterId");
            return (Criteria) this;
        }

        public Criteria andPddMatterIdNotLike(String value) {
            addCriterion("pdd_matter_id not like", value, "pddMatterId");
            return (Criteria) this;
        }

        public Criteria andPddMatterIdIn(List<String> values) {
            addCriterion("pdd_matter_id in", values, "pddMatterId");
            return (Criteria) this;
        }

        public Criteria andPddMatterIdNotIn(List<String> values) {
            addCriterion("pdd_matter_id not in", values, "pddMatterId");
            return (Criteria) this;
        }

        public Criteria andPddMatterIdBetween(String value1, String value2) {
            addCriterion("pdd_matter_id between", value1, value2, "pddMatterId");
            return (Criteria) this;
        }

        public Criteria andPddMatterIdNotBetween(String value1, String value2) {
            addCriterion("pdd_matter_id not between", value1, value2, "pddMatterId");
            return (Criteria) this;
        }

        public Criteria andPddMatterNameIsNull() {
            addCriterion("pdd_matter_name is null");
            return (Criteria) this;
        }

        public Criteria andPddMatterNameIsNotNull() {
            addCriterion("pdd_matter_name is not null");
            return (Criteria) this;
        }

        public Criteria andPddMatterNameEqualTo(String value) {
            addCriterion("pdd_matter_name =", value, "pddMatterName");
            return (Criteria) this;
        }

        public Criteria andPddMatterNameNotEqualTo(String value) {
            addCriterion("pdd_matter_name <>", value, "pddMatterName");
            return (Criteria) this;
        }

        public Criteria andPddMatterNameGreaterThan(String value) {
            addCriterion("pdd_matter_name >", value, "pddMatterName");
            return (Criteria) this;
        }

        public Criteria andPddMatterNameGreaterThanOrEqualTo(String value) {
            addCriterion("pdd_matter_name >=", value, "pddMatterName");
            return (Criteria) this;
        }

        public Criteria andPddMatterNameLessThan(String value) {
            addCriterion("pdd_matter_name <", value, "pddMatterName");
            return (Criteria) this;
        }

        public Criteria andPddMatterNameLessThanOrEqualTo(String value) {
            addCriterion("pdd_matter_name <=", value, "pddMatterName");
            return (Criteria) this;
        }

        public Criteria andPddMatterNameLike(String value) {
            addCriterion("pdd_matter_name like", value, "pddMatterName");
            return (Criteria) this;
        }

        public Criteria andPddMatterNameNotLike(String value) {
            addCriterion("pdd_matter_name not like", value, "pddMatterName");
            return (Criteria) this;
        }

        public Criteria andPddMatterNameIn(List<String> values) {
            addCriterion("pdd_matter_name in", values, "pddMatterName");
            return (Criteria) this;
        }

        public Criteria andPddMatterNameNotIn(List<String> values) {
            addCriterion("pdd_matter_name not in", values, "pddMatterName");
            return (Criteria) this;
        }

        public Criteria andPddMatterNameBetween(String value1, String value2) {
            addCriterion("pdd_matter_name between", value1, value2, "pddMatterName");
            return (Criteria) this;
        }

        public Criteria andPddMatterNameNotBetween(String value1, String value2) {
            addCriterion("pdd_matter_name not between", value1, value2, "pddMatterName");
            return (Criteria) this;
        }

        public Criteria andPddSpecificationsIsNull() {
            addCriterion("pdd_specifications is null");
            return (Criteria) this;
        }

        public Criteria andPddSpecificationsIsNotNull() {
            addCriterion("pdd_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andPddSpecificationsEqualTo(String value) {
            addCriterion("pdd_specifications =", value, "pddSpecifications");
            return (Criteria) this;
        }

        public Criteria andPddSpecificationsNotEqualTo(String value) {
            addCriterion("pdd_specifications <>", value, "pddSpecifications");
            return (Criteria) this;
        }

        public Criteria andPddSpecificationsGreaterThan(String value) {
            addCriterion("pdd_specifications >", value, "pddSpecifications");
            return (Criteria) this;
        }

        public Criteria andPddSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("pdd_specifications >=", value, "pddSpecifications");
            return (Criteria) this;
        }

        public Criteria andPddSpecificationsLessThan(String value) {
            addCriterion("pdd_specifications <", value, "pddSpecifications");
            return (Criteria) this;
        }

        public Criteria andPddSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("pdd_specifications <=", value, "pddSpecifications");
            return (Criteria) this;
        }

        public Criteria andPddSpecificationsLike(String value) {
            addCriterion("pdd_specifications like", value, "pddSpecifications");
            return (Criteria) this;
        }

        public Criteria andPddSpecificationsNotLike(String value) {
            addCriterion("pdd_specifications not like", value, "pddSpecifications");
            return (Criteria) this;
        }

        public Criteria andPddSpecificationsIn(List<String> values) {
            addCriterion("pdd_specifications in", values, "pddSpecifications");
            return (Criteria) this;
        }

        public Criteria andPddSpecificationsNotIn(List<String> values) {
            addCriterion("pdd_specifications not in", values, "pddSpecifications");
            return (Criteria) this;
        }

        public Criteria andPddSpecificationsBetween(String value1, String value2) {
            addCriterion("pdd_specifications between", value1, value2, "pddSpecifications");
            return (Criteria) this;
        }

        public Criteria andPddSpecificationsNotBetween(String value1, String value2) {
            addCriterion("pdd_specifications not between", value1, value2, "pddSpecifications");
            return (Criteria) this;
        }

        public Criteria andPddCompanyNameIsNull() {
            addCriterion("pdd_company_name is null");
            return (Criteria) this;
        }

        public Criteria andPddCompanyNameIsNotNull() {
            addCriterion("pdd_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andPddCompanyNameEqualTo(String value) {
            addCriterion("pdd_company_name =", value, "pddCompanyName");
            return (Criteria) this;
        }

        public Criteria andPddCompanyNameNotEqualTo(String value) {
            addCriterion("pdd_company_name <>", value, "pddCompanyName");
            return (Criteria) this;
        }

        public Criteria andPddCompanyNameGreaterThan(String value) {
            addCriterion("pdd_company_name >", value, "pddCompanyName");
            return (Criteria) this;
        }

        public Criteria andPddCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("pdd_company_name >=", value, "pddCompanyName");
            return (Criteria) this;
        }

        public Criteria andPddCompanyNameLessThan(String value) {
            addCriterion("pdd_company_name <", value, "pddCompanyName");
            return (Criteria) this;
        }

        public Criteria andPddCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("pdd_company_name <=", value, "pddCompanyName");
            return (Criteria) this;
        }

        public Criteria andPddCompanyNameLike(String value) {
            addCriterion("pdd_company_name like", value, "pddCompanyName");
            return (Criteria) this;
        }

        public Criteria andPddCompanyNameNotLike(String value) {
            addCriterion("pdd_company_name not like", value, "pddCompanyName");
            return (Criteria) this;
        }

        public Criteria andPddCompanyNameIn(List<String> values) {
            addCriterion("pdd_company_name in", values, "pddCompanyName");
            return (Criteria) this;
        }

        public Criteria andPddCompanyNameNotIn(List<String> values) {
            addCriterion("pdd_company_name not in", values, "pddCompanyName");
            return (Criteria) this;
        }

        public Criteria andPddCompanyNameBetween(String value1, String value2) {
            addCriterion("pdd_company_name between", value1, value2, "pddCompanyName");
            return (Criteria) this;
        }

        public Criteria andPddCompanyNameNotBetween(String value1, String value2) {
            addCriterion("pdd_company_name not between", value1, value2, "pddCompanyName");
            return (Criteria) this;
        }

        public Criteria andPddAmountIsNull() {
            addCriterion("pdd_amount is null");
            return (Criteria) this;
        }

        public Criteria andPddAmountIsNotNull() {
            addCriterion("pdd_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPddAmountEqualTo(Integer value) {
            addCriterion("pdd_amount =", value, "pddAmount");
            return (Criteria) this;
        }

        public Criteria andPddAmountNotEqualTo(Integer value) {
            addCriterion("pdd_amount <>", value, "pddAmount");
            return (Criteria) this;
        }

        public Criteria andPddAmountGreaterThan(Integer value) {
            addCriterion("pdd_amount >", value, "pddAmount");
            return (Criteria) this;
        }

        public Criteria andPddAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdd_amount >=", value, "pddAmount");
            return (Criteria) this;
        }

        public Criteria andPddAmountLessThan(Integer value) {
            addCriterion("pdd_amount <", value, "pddAmount");
            return (Criteria) this;
        }

        public Criteria andPddAmountLessThanOrEqualTo(Integer value) {
            addCriterion("pdd_amount <=", value, "pddAmount");
            return (Criteria) this;
        }

        public Criteria andPddAmountIn(List<Integer> values) {
            addCriterion("pdd_amount in", values, "pddAmount");
            return (Criteria) this;
        }

        public Criteria andPddAmountNotIn(List<Integer> values) {
            addCriterion("pdd_amount not in", values, "pddAmount");
            return (Criteria) this;
        }

        public Criteria andPddAmountBetween(Integer value1, Integer value2) {
            addCriterion("pdd_amount between", value1, value2, "pddAmount");
            return (Criteria) this;
        }

        public Criteria andPddAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("pdd_amount not between", value1, value2, "pddAmount");
            return (Criteria) this;
        }

        public Criteria andPddPriceIsNull() {
            addCriterion("pdd_price is null");
            return (Criteria) this;
        }

        public Criteria andPddPriceIsNotNull() {
            addCriterion("pdd_price is not null");
            return (Criteria) this;
        }

        public Criteria andPddPriceEqualTo(Float value) {
            addCriterion("pdd_price =", value, "pddPrice");
            return (Criteria) this;
        }

        public Criteria andPddPriceNotEqualTo(Float value) {
            addCriterion("pdd_price <>", value, "pddPrice");
            return (Criteria) this;
        }

        public Criteria andPddPriceGreaterThan(Float value) {
            addCriterion("pdd_price >", value, "pddPrice");
            return (Criteria) this;
        }

        public Criteria andPddPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("pdd_price >=", value, "pddPrice");
            return (Criteria) this;
        }

        public Criteria andPddPriceLessThan(Float value) {
            addCriterion("pdd_price <", value, "pddPrice");
            return (Criteria) this;
        }

        public Criteria andPddPriceLessThanOrEqualTo(Float value) {
            addCriterion("pdd_price <=", value, "pddPrice");
            return (Criteria) this;
        }

        public Criteria andPddPriceIn(List<Float> values) {
            addCriterion("pdd_price in", values, "pddPrice");
            return (Criteria) this;
        }

        public Criteria andPddPriceNotIn(List<Float> values) {
            addCriterion("pdd_price not in", values, "pddPrice");
            return (Criteria) this;
        }

        public Criteria andPddPriceBetween(Float value1, Float value2) {
            addCriterion("pdd_price between", value1, value2, "pddPrice");
            return (Criteria) this;
        }

        public Criteria andPddPriceNotBetween(Float value1, Float value2) {
            addCriterion("pdd_price not between", value1, value2, "pddPrice");
            return (Criteria) this;
        }

        public Criteria andPddMoneyIsNull() {
            addCriterion("pdd_money is null");
            return (Criteria) this;
        }

        public Criteria andPddMoneyIsNotNull() {
            addCriterion("pdd_money is not null");
            return (Criteria) this;
        }

        public Criteria andPddMoneyEqualTo(Float value) {
            addCriterion("pdd_money =", value, "pddMoney");
            return (Criteria) this;
        }

        public Criteria andPddMoneyNotEqualTo(Float value) {
            addCriterion("pdd_money <>", value, "pddMoney");
            return (Criteria) this;
        }

        public Criteria andPddMoneyGreaterThan(Float value) {
            addCriterion("pdd_money >", value, "pddMoney");
            return (Criteria) this;
        }

        public Criteria andPddMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("pdd_money >=", value, "pddMoney");
            return (Criteria) this;
        }

        public Criteria andPddMoneyLessThan(Float value) {
            addCriterion("pdd_money <", value, "pddMoney");
            return (Criteria) this;
        }

        public Criteria andPddMoneyLessThanOrEqualTo(Float value) {
            addCriterion("pdd_money <=", value, "pddMoney");
            return (Criteria) this;
        }

        public Criteria andPddMoneyIn(List<Float> values) {
            addCriterion("pdd_money in", values, "pddMoney");
            return (Criteria) this;
        }

        public Criteria andPddMoneyNotIn(List<Float> values) {
            addCriterion("pdd_money not in", values, "pddMoney");
            return (Criteria) this;
        }

        public Criteria andPddMoneyBetween(Float value1, Float value2) {
            addCriterion("pdd_money between", value1, value2, "pddMoney");
            return (Criteria) this;
        }

        public Criteria andPddMoneyNotBetween(Float value1, Float value2) {
            addCriterion("pdd_money not between", value1, value2, "pddMoney");
            return (Criteria) this;
        }

        public Criteria andPddTaxRateIsNull() {
            addCriterion("pdd_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andPddTaxRateIsNotNull() {
            addCriterion("pdd_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPddTaxRateEqualTo(Float value) {
            addCriterion("pdd_tax_rate =", value, "pddTaxRate");
            return (Criteria) this;
        }

        public Criteria andPddTaxRateNotEqualTo(Float value) {
            addCriterion("pdd_tax_rate <>", value, "pddTaxRate");
            return (Criteria) this;
        }

        public Criteria andPddTaxRateGreaterThan(Float value) {
            addCriterion("pdd_tax_rate >", value, "pddTaxRate");
            return (Criteria) this;
        }

        public Criteria andPddTaxRateGreaterThanOrEqualTo(Float value) {
            addCriterion("pdd_tax_rate >=", value, "pddTaxRate");
            return (Criteria) this;
        }

        public Criteria andPddTaxRateLessThan(Float value) {
            addCriterion("pdd_tax_rate <", value, "pddTaxRate");
            return (Criteria) this;
        }

        public Criteria andPddTaxRateLessThanOrEqualTo(Float value) {
            addCriterion("pdd_tax_rate <=", value, "pddTaxRate");
            return (Criteria) this;
        }

        public Criteria andPddTaxRateIn(List<Float> values) {
            addCriterion("pdd_tax_rate in", values, "pddTaxRate");
            return (Criteria) this;
        }

        public Criteria andPddTaxRateNotIn(List<Float> values) {
            addCriterion("pdd_tax_rate not in", values, "pddTaxRate");
            return (Criteria) this;
        }

        public Criteria andPddTaxRateBetween(Float value1, Float value2) {
            addCriterion("pdd_tax_rate between", value1, value2, "pddTaxRate");
            return (Criteria) this;
        }

        public Criteria andPddTaxRateNotBetween(Float value1, Float value2) {
            addCriterion("pdd_tax_rate not between", value1, value2, "pddTaxRate");
            return (Criteria) this;
        }

        public Criteria andPddTaxAmountIsNull() {
            addCriterion("pdd_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andPddTaxAmountIsNotNull() {
            addCriterion("pdd_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPddTaxAmountEqualTo(Float value) {
            addCriterion("pdd_tax_amount =", value, "pddTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPddTaxAmountNotEqualTo(Float value) {
            addCriterion("pdd_tax_amount <>", value, "pddTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPddTaxAmountGreaterThan(Float value) {
            addCriterion("pdd_tax_amount >", value, "pddTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPddTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("pdd_tax_amount >=", value, "pddTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPddTaxAmountLessThan(Float value) {
            addCriterion("pdd_tax_amount <", value, "pddTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPddTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("pdd_tax_amount <=", value, "pddTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPddTaxAmountIn(List<Float> values) {
            addCriterion("pdd_tax_amount in", values, "pddTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPddTaxAmountNotIn(List<Float> values) {
            addCriterion("pdd_tax_amount not in", values, "pddTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPddTaxAmountBetween(Float value1, Float value2) {
            addCriterion("pdd_tax_amount between", value1, value2, "pddTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPddTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("pdd_tax_amount not between", value1, value2, "pddTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPddDiscountAmountIsNull() {
            addCriterion("pdd_discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andPddDiscountAmountIsNotNull() {
            addCriterion("pdd_discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPddDiscountAmountEqualTo(Float value) {
            addCriterion("pdd_discount_amount =", value, "pddDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPddDiscountAmountNotEqualTo(Float value) {
            addCriterion("pdd_discount_amount <>", value, "pddDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPddDiscountAmountGreaterThan(Float value) {
            addCriterion("pdd_discount_amount >", value, "pddDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPddDiscountAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("pdd_discount_amount >=", value, "pddDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPddDiscountAmountLessThan(Float value) {
            addCriterion("pdd_discount_amount <", value, "pddDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPddDiscountAmountLessThanOrEqualTo(Float value) {
            addCriterion("pdd_discount_amount <=", value, "pddDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPddDiscountAmountIn(List<Float> values) {
            addCriterion("pdd_discount_amount in", values, "pddDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPddDiscountAmountNotIn(List<Float> values) {
            addCriterion("pdd_discount_amount not in", values, "pddDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPddDiscountAmountBetween(Float value1, Float value2) {
            addCriterion("pdd_discount_amount between", value1, value2, "pddDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPddDiscountAmountNotBetween(Float value1, Float value2) {
            addCriterion("pdd_discount_amount not between", value1, value2, "pddDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andPddDiscountTaxIsNull() {
            addCriterion("pdd_discount_tax is null");
            return (Criteria) this;
        }

        public Criteria andPddDiscountTaxIsNotNull() {
            addCriterion("pdd_discount_tax is not null");
            return (Criteria) this;
        }

        public Criteria andPddDiscountTaxEqualTo(String value) {
            addCriterion("pdd_discount_tax =", value, "pddDiscountTax");
            return (Criteria) this;
        }

        public Criteria andPddDiscountTaxNotEqualTo(String value) {
            addCriterion("pdd_discount_tax <>", value, "pddDiscountTax");
            return (Criteria) this;
        }

        public Criteria andPddDiscountTaxGreaterThan(String value) {
            addCriterion("pdd_discount_tax >", value, "pddDiscountTax");
            return (Criteria) this;
        }

        public Criteria andPddDiscountTaxGreaterThanOrEqualTo(String value) {
            addCriterion("pdd_discount_tax >=", value, "pddDiscountTax");
            return (Criteria) this;
        }

        public Criteria andPddDiscountTaxLessThan(String value) {
            addCriterion("pdd_discount_tax <", value, "pddDiscountTax");
            return (Criteria) this;
        }

        public Criteria andPddDiscountTaxLessThanOrEqualTo(String value) {
            addCriterion("pdd_discount_tax <=", value, "pddDiscountTax");
            return (Criteria) this;
        }

        public Criteria andPddDiscountTaxLike(String value) {
            addCriterion("pdd_discount_tax like", value, "pddDiscountTax");
            return (Criteria) this;
        }

        public Criteria andPddDiscountTaxNotLike(String value) {
            addCriterion("pdd_discount_tax not like", value, "pddDiscountTax");
            return (Criteria) this;
        }

        public Criteria andPddDiscountTaxIn(List<String> values) {
            addCriterion("pdd_discount_tax in", values, "pddDiscountTax");
            return (Criteria) this;
        }

        public Criteria andPddDiscountTaxNotIn(List<String> values) {
            addCriterion("pdd_discount_tax not in", values, "pddDiscountTax");
            return (Criteria) this;
        }

        public Criteria andPddDiscountTaxBetween(String value1, String value2) {
            addCriterion("pdd_discount_tax between", value1, value2, "pddDiscountTax");
            return (Criteria) this;
        }

        public Criteria andPddDiscountTaxNotBetween(String value1, String value2) {
            addCriterion("pdd_discount_tax not between", value1, value2, "pddDiscountTax");
            return (Criteria) this;
        }

        public Criteria andPddTotalDiscountIsNull() {
            addCriterion("pdd_total_discount is null");
            return (Criteria) this;
        }

        public Criteria andPddTotalDiscountIsNotNull() {
            addCriterion("pdd_total_discount is not null");
            return (Criteria) this;
        }

        public Criteria andPddTotalDiscountEqualTo(Integer value) {
            addCriterion("pdd_total_discount =", value, "pddTotalDiscount");
            return (Criteria) this;
        }

        public Criteria andPddTotalDiscountNotEqualTo(Integer value) {
            addCriterion("pdd_total_discount <>", value, "pddTotalDiscount");
            return (Criteria) this;
        }

        public Criteria andPddTotalDiscountGreaterThan(Integer value) {
            addCriterion("pdd_total_discount >", value, "pddTotalDiscount");
            return (Criteria) this;
        }

        public Criteria andPddTotalDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdd_total_discount >=", value, "pddTotalDiscount");
            return (Criteria) this;
        }

        public Criteria andPddTotalDiscountLessThan(Integer value) {
            addCriterion("pdd_total_discount <", value, "pddTotalDiscount");
            return (Criteria) this;
        }

        public Criteria andPddTotalDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("pdd_total_discount <=", value, "pddTotalDiscount");
            return (Criteria) this;
        }

        public Criteria andPddTotalDiscountIn(List<Integer> values) {
            addCriterion("pdd_total_discount in", values, "pddTotalDiscount");
            return (Criteria) this;
        }

        public Criteria andPddTotalDiscountNotIn(List<Integer> values) {
            addCriterion("pdd_total_discount not in", values, "pddTotalDiscount");
            return (Criteria) this;
        }

        public Criteria andPddTotalDiscountBetween(Integer value1, Integer value2) {
            addCriterion("pdd_total_discount between", value1, value2, "pddTotalDiscount");
            return (Criteria) this;
        }

        public Criteria andPddTotalDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("pdd_total_discount not between", value1, value2, "pddTotalDiscount");
            return (Criteria) this;
        }

        public Criteria andPddDeferredBalanceIsNull() {
            addCriterion("pdd_deferred_balance is null");
            return (Criteria) this;
        }

        public Criteria andPddDeferredBalanceIsNotNull() {
            addCriterion("pdd_deferred_balance is not null");
            return (Criteria) this;
        }

        public Criteria andPddDeferredBalanceEqualTo(String value) {
            addCriterion("pdd_deferred_balance =", value, "pddDeferredBalance");
            return (Criteria) this;
        }

        public Criteria andPddDeferredBalanceNotEqualTo(String value) {
            addCriterion("pdd_deferred_balance <>", value, "pddDeferredBalance");
            return (Criteria) this;
        }

        public Criteria andPddDeferredBalanceGreaterThan(String value) {
            addCriterion("pdd_deferred_balance >", value, "pddDeferredBalance");
            return (Criteria) this;
        }

        public Criteria andPddDeferredBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("pdd_deferred_balance >=", value, "pddDeferredBalance");
            return (Criteria) this;
        }

        public Criteria andPddDeferredBalanceLessThan(String value) {
            addCriterion("pdd_deferred_balance <", value, "pddDeferredBalance");
            return (Criteria) this;
        }

        public Criteria andPddDeferredBalanceLessThanOrEqualTo(String value) {
            addCriterion("pdd_deferred_balance <=", value, "pddDeferredBalance");
            return (Criteria) this;
        }

        public Criteria andPddDeferredBalanceLike(String value) {
            addCriterion("pdd_deferred_balance like", value, "pddDeferredBalance");
            return (Criteria) this;
        }

        public Criteria andPddDeferredBalanceNotLike(String value) {
            addCriterion("pdd_deferred_balance not like", value, "pddDeferredBalance");
            return (Criteria) this;
        }

        public Criteria andPddDeferredBalanceIn(List<String> values) {
            addCriterion("pdd_deferred_balance in", values, "pddDeferredBalance");
            return (Criteria) this;
        }

        public Criteria andPddDeferredBalanceNotIn(List<String> values) {
            addCriterion("pdd_deferred_balance not in", values, "pddDeferredBalance");
            return (Criteria) this;
        }

        public Criteria andPddDeferredBalanceBetween(String value1, String value2) {
            addCriterion("pdd_deferred_balance between", value1, value2, "pddDeferredBalance");
            return (Criteria) this;
        }

        public Criteria andPddDeferredBalanceNotBetween(String value1, String value2) {
            addCriterion("pdd_deferred_balance not between", value1, value2, "pddDeferredBalance");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsIsNull() {
            addCriterion("psd_invoice_details is null");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsIsNotNull() {
            addCriterion("psd_invoice_details is not null");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsEqualTo(String value) {
            addCriterion("psd_invoice_details =", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsNotEqualTo(String value) {
            addCriterion("psd_invoice_details <>", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsGreaterThan(String value) {
            addCriterion("psd_invoice_details >", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("psd_invoice_details >=", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsLessThan(String value) {
            addCriterion("psd_invoice_details <", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsLessThanOrEqualTo(String value) {
            addCriterion("psd_invoice_details <=", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsLike(String value) {
            addCriterion("psd_invoice_details like", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsNotLike(String value) {
            addCriterion("psd_invoice_details not like", value, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsIn(List<String> values) {
            addCriterion("psd_invoice_details in", values, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsNotIn(List<String> values) {
            addCriterion("psd_invoice_details not in", values, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsBetween(String value1, String value2) {
            addCriterion("psd_invoice_details between", value1, value2, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPsdInvoiceDetailsNotBetween(String value1, String value2) {
            addCriterion("psd_invoice_details not between", value1, value2, "psdInvoiceDetails");
            return (Criteria) this;
        }

        public Criteria andPddAuditionIsNull() {
            addCriterion("pdd_audition is null");
            return (Criteria) this;
        }

        public Criteria andPddAuditionIsNotNull() {
            addCriterion("pdd_audition is not null");
            return (Criteria) this;
        }

        public Criteria andPddAuditionEqualTo(String value) {
            addCriterion("pdd_audition =", value, "pddAudition");
            return (Criteria) this;
        }

        public Criteria andPddAuditionNotEqualTo(String value) {
            addCriterion("pdd_audition <>", value, "pddAudition");
            return (Criteria) this;
        }

        public Criteria andPddAuditionGreaterThan(String value) {
            addCriterion("pdd_audition >", value, "pddAudition");
            return (Criteria) this;
        }

        public Criteria andPddAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("pdd_audition >=", value, "pddAudition");
            return (Criteria) this;
        }

        public Criteria andPddAuditionLessThan(String value) {
            addCriterion("pdd_audition <", value, "pddAudition");
            return (Criteria) this;
        }

        public Criteria andPddAuditionLessThanOrEqualTo(String value) {
            addCriterion("pdd_audition <=", value, "pddAudition");
            return (Criteria) this;
        }

        public Criteria andPddAuditionLike(String value) {
            addCriterion("pdd_audition like", value, "pddAudition");
            return (Criteria) this;
        }

        public Criteria andPddAuditionNotLike(String value) {
            addCriterion("pdd_audition not like", value, "pddAudition");
            return (Criteria) this;
        }

        public Criteria andPddAuditionIn(List<String> values) {
            addCriterion("pdd_audition in", values, "pddAudition");
            return (Criteria) this;
        }

        public Criteria andPddAuditionNotIn(List<String> values) {
            addCriterion("pdd_audition not in", values, "pddAudition");
            return (Criteria) this;
        }

        public Criteria andPddAuditionBetween(String value1, String value2) {
            addCriterion("pdd_audition between", value1, value2, "pddAudition");
            return (Criteria) this;
        }

        public Criteria andPddAuditionNotBetween(String value1, String value2) {
            addCriterion("pdd_audition not between", value1, value2, "pddAudition");
            return (Criteria) this;
        }

        public Criteria andPddYnIsNull() {
            addCriterion("pdd_yn is null");
            return (Criteria) this;
        }

        public Criteria andPddYnIsNotNull() {
            addCriterion("pdd_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPddYnEqualTo(String value) {
            addCriterion("pdd_yn =", value, "pddYn");
            return (Criteria) this;
        }

        public Criteria andPddYnNotEqualTo(String value) {
            addCriterion("pdd_yn <>", value, "pddYn");
            return (Criteria) this;
        }

        public Criteria andPddYnGreaterThan(String value) {
            addCriterion("pdd_yn >", value, "pddYn");
            return (Criteria) this;
        }

        public Criteria andPddYnGreaterThanOrEqualTo(String value) {
            addCriterion("pdd_yn >=", value, "pddYn");
            return (Criteria) this;
        }

        public Criteria andPddYnLessThan(String value) {
            addCriterion("pdd_yn <", value, "pddYn");
            return (Criteria) this;
        }

        public Criteria andPddYnLessThanOrEqualTo(String value) {
            addCriterion("pdd_yn <=", value, "pddYn");
            return (Criteria) this;
        }

        public Criteria andPddYnLike(String value) {
            addCriterion("pdd_yn like", value, "pddYn");
            return (Criteria) this;
        }

        public Criteria andPddYnNotLike(String value) {
            addCriterion("pdd_yn not like", value, "pddYn");
            return (Criteria) this;
        }

        public Criteria andPddYnIn(List<String> values) {
            addCriterion("pdd_yn in", values, "pddYn");
            return (Criteria) this;
        }

        public Criteria andPddYnNotIn(List<String> values) {
            addCriterion("pdd_yn not in", values, "pddYn");
            return (Criteria) this;
        }

        public Criteria andPddYnBetween(String value1, String value2) {
            addCriterion("pdd_yn between", value1, value2, "pddYn");
            return (Criteria) this;
        }

        public Criteria andPddYnNotBetween(String value1, String value2) {
            addCriterion("pdd_yn not between", value1, value2, "pddYn");
            return (Criteria) this;
        }

        public Criteria andPddCustom1IsNull() {
            addCriterion("pdd_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPddCustom1IsNotNull() {
            addCriterion("pdd_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPddCustom1EqualTo(String value) {
            addCriterion("pdd_custom1 =", value, "pddCustom1");
            return (Criteria) this;
        }

        public Criteria andPddCustom1NotEqualTo(String value) {
            addCriterion("pdd_custom1 <>", value, "pddCustom1");
            return (Criteria) this;
        }

        public Criteria andPddCustom1GreaterThan(String value) {
            addCriterion("pdd_custom1 >", value, "pddCustom1");
            return (Criteria) this;
        }

        public Criteria andPddCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("pdd_custom1 >=", value, "pddCustom1");
            return (Criteria) this;
        }

        public Criteria andPddCustom1LessThan(String value) {
            addCriterion("pdd_custom1 <", value, "pddCustom1");
            return (Criteria) this;
        }

        public Criteria andPddCustom1LessThanOrEqualTo(String value) {
            addCriterion("pdd_custom1 <=", value, "pddCustom1");
            return (Criteria) this;
        }

        public Criteria andPddCustom1Like(String value) {
            addCriterion("pdd_custom1 like", value, "pddCustom1");
            return (Criteria) this;
        }

        public Criteria andPddCustom1NotLike(String value) {
            addCriterion("pdd_custom1 not like", value, "pddCustom1");
            return (Criteria) this;
        }

        public Criteria andPddCustom1In(List<String> values) {
            addCriterion("pdd_custom1 in", values, "pddCustom1");
            return (Criteria) this;
        }

        public Criteria andPddCustom1NotIn(List<String> values) {
            addCriterion("pdd_custom1 not in", values, "pddCustom1");
            return (Criteria) this;
        }

        public Criteria andPddCustom1Between(String value1, String value2) {
            addCriterion("pdd_custom1 between", value1, value2, "pddCustom1");
            return (Criteria) this;
        }

        public Criteria andPddCustom1NotBetween(String value1, String value2) {
            addCriterion("pdd_custom1 not between", value1, value2, "pddCustom1");
            return (Criteria) this;
        }

        public Criteria andPddCustom2IsNull() {
            addCriterion("pdd_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPddCustom2IsNotNull() {
            addCriterion("pdd_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPddCustom2EqualTo(String value) {
            addCriterion("pdd_custom2 =", value, "pddCustom2");
            return (Criteria) this;
        }

        public Criteria andPddCustom2NotEqualTo(String value) {
            addCriterion("pdd_custom2 <>", value, "pddCustom2");
            return (Criteria) this;
        }

        public Criteria andPddCustom2GreaterThan(String value) {
            addCriterion("pdd_custom2 >", value, "pddCustom2");
            return (Criteria) this;
        }

        public Criteria andPddCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("pdd_custom2 >=", value, "pddCustom2");
            return (Criteria) this;
        }

        public Criteria andPddCustom2LessThan(String value) {
            addCriterion("pdd_custom2 <", value, "pddCustom2");
            return (Criteria) this;
        }

        public Criteria andPddCustom2LessThanOrEqualTo(String value) {
            addCriterion("pdd_custom2 <=", value, "pddCustom2");
            return (Criteria) this;
        }

        public Criteria andPddCustom2Like(String value) {
            addCriterion("pdd_custom2 like", value, "pddCustom2");
            return (Criteria) this;
        }

        public Criteria andPddCustom2NotLike(String value) {
            addCriterion("pdd_custom2 not like", value, "pddCustom2");
            return (Criteria) this;
        }

        public Criteria andPddCustom2In(List<String> values) {
            addCriterion("pdd_custom2 in", values, "pddCustom2");
            return (Criteria) this;
        }

        public Criteria andPddCustom2NotIn(List<String> values) {
            addCriterion("pdd_custom2 not in", values, "pddCustom2");
            return (Criteria) this;
        }

        public Criteria andPddCustom2Between(String value1, String value2) {
            addCriterion("pdd_custom2 between", value1, value2, "pddCustom2");
            return (Criteria) this;
        }

        public Criteria andPddCustom2NotBetween(String value1, String value2) {
            addCriterion("pdd_custom2 not between", value1, value2, "pddCustom2");
            return (Criteria) this;
        }

        public Criteria andPddCustom3IsNull() {
            addCriterion("pdd_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPddCustom3IsNotNull() {
            addCriterion("pdd_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPddCustom3EqualTo(String value) {
            addCriterion("pdd_custom3 =", value, "pddCustom3");
            return (Criteria) this;
        }

        public Criteria andPddCustom3NotEqualTo(String value) {
            addCriterion("pdd_custom3 <>", value, "pddCustom3");
            return (Criteria) this;
        }

        public Criteria andPddCustom3GreaterThan(String value) {
            addCriterion("pdd_custom3 >", value, "pddCustom3");
            return (Criteria) this;
        }

        public Criteria andPddCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("pdd_custom3 >=", value, "pddCustom3");
            return (Criteria) this;
        }

        public Criteria andPddCustom3LessThan(String value) {
            addCriterion("pdd_custom3 <", value, "pddCustom3");
            return (Criteria) this;
        }

        public Criteria andPddCustom3LessThanOrEqualTo(String value) {
            addCriterion("pdd_custom3 <=", value, "pddCustom3");
            return (Criteria) this;
        }

        public Criteria andPddCustom3Like(String value) {
            addCriterion("pdd_custom3 like", value, "pddCustom3");
            return (Criteria) this;
        }

        public Criteria andPddCustom3NotLike(String value) {
            addCriterion("pdd_custom3 not like", value, "pddCustom3");
            return (Criteria) this;
        }

        public Criteria andPddCustom3In(List<String> values) {
            addCriterion("pdd_custom3 in", values, "pddCustom3");
            return (Criteria) this;
        }

        public Criteria andPddCustom3NotIn(List<String> values) {
            addCriterion("pdd_custom3 not in", values, "pddCustom3");
            return (Criteria) this;
        }

        public Criteria andPddCustom3Between(String value1, String value2) {
            addCriterion("pdd_custom3 between", value1, value2, "pddCustom3");
            return (Criteria) this;
        }

        public Criteria andPddCustom3NotBetween(String value1, String value2) {
            addCriterion("pdd_custom3 not between", value1, value2, "pddCustom3");
            return (Criteria) this;
        }

        public Criteria andPddCustom4IsNull() {
            addCriterion("pdd_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPddCustom4IsNotNull() {
            addCriterion("pdd_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPddCustom4EqualTo(String value) {
            addCriterion("pdd_custom4 =", value, "pddCustom4");
            return (Criteria) this;
        }

        public Criteria andPddCustom4NotEqualTo(String value) {
            addCriterion("pdd_custom4 <>", value, "pddCustom4");
            return (Criteria) this;
        }

        public Criteria andPddCustom4GreaterThan(String value) {
            addCriterion("pdd_custom4 >", value, "pddCustom4");
            return (Criteria) this;
        }

        public Criteria andPddCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("pdd_custom4 >=", value, "pddCustom4");
            return (Criteria) this;
        }

        public Criteria andPddCustom4LessThan(String value) {
            addCriterion("pdd_custom4 <", value, "pddCustom4");
            return (Criteria) this;
        }

        public Criteria andPddCustom4LessThanOrEqualTo(String value) {
            addCriterion("pdd_custom4 <=", value, "pddCustom4");
            return (Criteria) this;
        }

        public Criteria andPddCustom4Like(String value) {
            addCriterion("pdd_custom4 like", value, "pddCustom4");
            return (Criteria) this;
        }

        public Criteria andPddCustom4NotLike(String value) {
            addCriterion("pdd_custom4 not like", value, "pddCustom4");
            return (Criteria) this;
        }

        public Criteria andPddCustom4In(List<String> values) {
            addCriterion("pdd_custom4 in", values, "pddCustom4");
            return (Criteria) this;
        }

        public Criteria andPddCustom4NotIn(List<String> values) {
            addCriterion("pdd_custom4 not in", values, "pddCustom4");
            return (Criteria) this;
        }

        public Criteria andPddCustom4Between(String value1, String value2) {
            addCriterion("pdd_custom4 between", value1, value2, "pddCustom4");
            return (Criteria) this;
        }

        public Criteria andPddCustom4NotBetween(String value1, String value2) {
            addCriterion("pdd_custom4 not between", value1, value2, "pddCustom4");
            return (Criteria) this;
        }

        public Criteria andPddCustom5IsNull() {
            addCriterion("pdd_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPddCustom5IsNotNull() {
            addCriterion("pdd_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPddCustom5EqualTo(String value) {
            addCriterion("pdd_custom5 =", value, "pddCustom5");
            return (Criteria) this;
        }

        public Criteria andPddCustom5NotEqualTo(String value) {
            addCriterion("pdd_custom5 <>", value, "pddCustom5");
            return (Criteria) this;
        }

        public Criteria andPddCustom5GreaterThan(String value) {
            addCriterion("pdd_custom5 >", value, "pddCustom5");
            return (Criteria) this;
        }

        public Criteria andPddCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("pdd_custom5 >=", value, "pddCustom5");
            return (Criteria) this;
        }

        public Criteria andPddCustom5LessThan(String value) {
            addCriterion("pdd_custom5 <", value, "pddCustom5");
            return (Criteria) this;
        }

        public Criteria andPddCustom5LessThanOrEqualTo(String value) {
            addCriterion("pdd_custom5 <=", value, "pddCustom5");
            return (Criteria) this;
        }

        public Criteria andPddCustom5Like(String value) {
            addCriterion("pdd_custom5 like", value, "pddCustom5");
            return (Criteria) this;
        }

        public Criteria andPddCustom5NotLike(String value) {
            addCriterion("pdd_custom5 not like", value, "pddCustom5");
            return (Criteria) this;
        }

        public Criteria andPddCustom5In(List<String> values) {
            addCriterion("pdd_custom5 in", values, "pddCustom5");
            return (Criteria) this;
        }

        public Criteria andPddCustom5NotIn(List<String> values) {
            addCriterion("pdd_custom5 not in", values, "pddCustom5");
            return (Criteria) this;
        }

        public Criteria andPddCustom5Between(String value1, String value2) {
            addCriterion("pdd_custom5 between", value1, value2, "pddCustom5");
            return (Criteria) this;
        }

        public Criteria andPddCustom5NotBetween(String value1, String value2) {
            addCriterion("pdd_custom5 not between", value1, value2, "pddCustom5");
            return (Criteria) this;
        }

        public Criteria andPddCustom6IsNull() {
            addCriterion("pdd_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPddCustom6IsNotNull() {
            addCriterion("pdd_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPddCustom6EqualTo(String value) {
            addCriterion("pdd_custom6 =", value, "pddCustom6");
            return (Criteria) this;
        }

        public Criteria andPddCustom6NotEqualTo(String value) {
            addCriterion("pdd_custom6 <>", value, "pddCustom6");
            return (Criteria) this;
        }

        public Criteria andPddCustom6GreaterThan(String value) {
            addCriterion("pdd_custom6 >", value, "pddCustom6");
            return (Criteria) this;
        }

        public Criteria andPddCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("pdd_custom6 >=", value, "pddCustom6");
            return (Criteria) this;
        }

        public Criteria andPddCustom6LessThan(String value) {
            addCriterion("pdd_custom6 <", value, "pddCustom6");
            return (Criteria) this;
        }

        public Criteria andPddCustom6LessThanOrEqualTo(String value) {
            addCriterion("pdd_custom6 <=", value, "pddCustom6");
            return (Criteria) this;
        }

        public Criteria andPddCustom6Like(String value) {
            addCriterion("pdd_custom6 like", value, "pddCustom6");
            return (Criteria) this;
        }

        public Criteria andPddCustom6NotLike(String value) {
            addCriterion("pdd_custom6 not like", value, "pddCustom6");
            return (Criteria) this;
        }

        public Criteria andPddCustom6In(List<String> values) {
            addCriterion("pdd_custom6 in", values, "pddCustom6");
            return (Criteria) this;
        }

        public Criteria andPddCustom6NotIn(List<String> values) {
            addCriterion("pdd_custom6 not in", values, "pddCustom6");
            return (Criteria) this;
        }

        public Criteria andPddCustom6Between(String value1, String value2) {
            addCriterion("pdd_custom6 between", value1, value2, "pddCustom6");
            return (Criteria) this;
        }

        public Criteria andPddCustom6NotBetween(String value1, String value2) {
            addCriterion("pdd_custom6 not between", value1, value2, "pddCustom6");
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