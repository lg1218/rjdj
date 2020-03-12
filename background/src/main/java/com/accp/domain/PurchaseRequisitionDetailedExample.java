package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseRequisitionDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseRequisitionDetailedExample() {
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

        public Criteria andPrdIdIsNull() {
            addCriterion("prd_id is null");
            return (Criteria) this;
        }

        public Criteria andPrdIdIsNotNull() {
            addCriterion("prd_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrdIdEqualTo(String value) {
            addCriterion("prd_id =", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdNotEqualTo(String value) {
            addCriterion("prd_id <>", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdGreaterThan(String value) {
            addCriterion("prd_id >", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdGreaterThanOrEqualTo(String value) {
            addCriterion("prd_id >=", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdLessThan(String value) {
            addCriterion("prd_id <", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdLessThanOrEqualTo(String value) {
            addCriterion("prd_id <=", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdLike(String value) {
            addCriterion("prd_id like", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdNotLike(String value) {
            addCriterion("prd_id not like", value, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdIn(List<String> values) {
            addCriterion("prd_id in", values, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdNotIn(List<String> values) {
            addCriterion("prd_id not in", values, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdBetween(String value1, String value2) {
            addCriterion("prd_id between", value1, value2, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrdIdNotBetween(String value1, String value2) {
            addCriterion("prd_id not between", value1, value2, "prdId");
            return (Criteria) this;
        }

        public Criteria andPrIdIsNull() {
            addCriterion("pr_id is null");
            return (Criteria) this;
        }

        public Criteria andPrIdIsNotNull() {
            addCriterion("pr_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrIdEqualTo(String value) {
            addCriterion("pr_id =", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotEqualTo(String value) {
            addCriterion("pr_id <>", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdGreaterThan(String value) {
            addCriterion("pr_id >", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdGreaterThanOrEqualTo(String value) {
            addCriterion("pr_id >=", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdLessThan(String value) {
            addCriterion("pr_id <", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdLessThanOrEqualTo(String value) {
            addCriterion("pr_id <=", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdLike(String value) {
            addCriterion("pr_id like", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotLike(String value) {
            addCriterion("pr_id not like", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdIn(List<String> values) {
            addCriterion("pr_id in", values, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotIn(List<String> values) {
            addCriterion("pr_id not in", values, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdBetween(String value1, String value2) {
            addCriterion("pr_id between", value1, value2, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotBetween(String value1, String value2) {
            addCriterion("pr_id not between", value1, value2, "prId");
            return (Criteria) this;
        }

        public Criteria andPrMatterIdIsNull() {
            addCriterion("pr_matter_id is null");
            return (Criteria) this;
        }

        public Criteria andPrMatterIdIsNotNull() {
            addCriterion("pr_matter_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrMatterIdEqualTo(String value) {
            addCriterion("pr_matter_id =", value, "prMatterId");
            return (Criteria) this;
        }

        public Criteria andPrMatterIdNotEqualTo(String value) {
            addCriterion("pr_matter_id <>", value, "prMatterId");
            return (Criteria) this;
        }

        public Criteria andPrMatterIdGreaterThan(String value) {
            addCriterion("pr_matter_id >", value, "prMatterId");
            return (Criteria) this;
        }

        public Criteria andPrMatterIdGreaterThanOrEqualTo(String value) {
            addCriterion("pr_matter_id >=", value, "prMatterId");
            return (Criteria) this;
        }

        public Criteria andPrMatterIdLessThan(String value) {
            addCriterion("pr_matter_id <", value, "prMatterId");
            return (Criteria) this;
        }

        public Criteria andPrMatterIdLessThanOrEqualTo(String value) {
            addCriterion("pr_matter_id <=", value, "prMatterId");
            return (Criteria) this;
        }

        public Criteria andPrMatterIdLike(String value) {
            addCriterion("pr_matter_id like", value, "prMatterId");
            return (Criteria) this;
        }

        public Criteria andPrMatterIdNotLike(String value) {
            addCriterion("pr_matter_id not like", value, "prMatterId");
            return (Criteria) this;
        }

        public Criteria andPrMatterIdIn(List<String> values) {
            addCriterion("pr_matter_id in", values, "prMatterId");
            return (Criteria) this;
        }

        public Criteria andPrMatterIdNotIn(List<String> values) {
            addCriterion("pr_matter_id not in", values, "prMatterId");
            return (Criteria) this;
        }

        public Criteria andPrMatterIdBetween(String value1, String value2) {
            addCriterion("pr_matter_id between", value1, value2, "prMatterId");
            return (Criteria) this;
        }

        public Criteria andPrMatterIdNotBetween(String value1, String value2) {
            addCriterion("pr_matter_id not between", value1, value2, "prMatterId");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameIsNull() {
            addCriterion("prd_matter_name is null");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameIsNotNull() {
            addCriterion("prd_matter_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameEqualTo(String value) {
            addCriterion("prd_matter_name =", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameNotEqualTo(String value) {
            addCriterion("prd_matter_name <>", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameGreaterThan(String value) {
            addCriterion("prd_matter_name >", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameGreaterThanOrEqualTo(String value) {
            addCriterion("prd_matter_name >=", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameLessThan(String value) {
            addCriterion("prd_matter_name <", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameLessThanOrEqualTo(String value) {
            addCriterion("prd_matter_name <=", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameLike(String value) {
            addCriterion("prd_matter_name like", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameNotLike(String value) {
            addCriterion("prd_matter_name not like", value, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameIn(List<String> values) {
            addCriterion("prd_matter_name in", values, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameNotIn(List<String> values) {
            addCriterion("prd_matter_name not in", values, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameBetween(String value1, String value2) {
            addCriterion("prd_matter_name between", value1, value2, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdMatterNameNotBetween(String value1, String value2) {
            addCriterion("prd_matter_name not between", value1, value2, "prdMatterName");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsIsNull() {
            addCriterion("prd_specifications is null");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsIsNotNull() {
            addCriterion("prd_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsEqualTo(String value) {
            addCriterion("prd_specifications =", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsNotEqualTo(String value) {
            addCriterion("prd_specifications <>", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsGreaterThan(String value) {
            addCriterion("prd_specifications >", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("prd_specifications >=", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsLessThan(String value) {
            addCriterion("prd_specifications <", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("prd_specifications <=", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsLike(String value) {
            addCriterion("prd_specifications like", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsNotLike(String value) {
            addCriterion("prd_specifications not like", value, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsIn(List<String> values) {
            addCriterion("prd_specifications in", values, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsNotIn(List<String> values) {
            addCriterion("prd_specifications not in", values, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsBetween(String value1, String value2) {
            addCriterion("prd_specifications between", value1, value2, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdSpecificationsNotBetween(String value1, String value2) {
            addCriterion("prd_specifications not between", value1, value2, "prdSpecifications");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameIsNull() {
            addCriterion("prd_company_name is null");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameIsNotNull() {
            addCriterion("prd_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameEqualTo(String value) {
            addCriterion("prd_company_name =", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameNotEqualTo(String value) {
            addCriterion("prd_company_name <>", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameGreaterThan(String value) {
            addCriterion("prd_company_name >", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("prd_company_name >=", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameLessThan(String value) {
            addCriterion("prd_company_name <", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("prd_company_name <=", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameLike(String value) {
            addCriterion("prd_company_name like", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameNotLike(String value) {
            addCriterion("prd_company_name not like", value, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameIn(List<String> values) {
            addCriterion("prd_company_name in", values, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameNotIn(List<String> values) {
            addCriterion("prd_company_name not in", values, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameBetween(String value1, String value2) {
            addCriterion("prd_company_name between", value1, value2, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdCompanyNameNotBetween(String value1, String value2) {
            addCriterion("prd_company_name not between", value1, value2, "prdCompanyName");
            return (Criteria) this;
        }

        public Criteria andPrdAmountIsNull() {
            addCriterion("prd_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrdAmountIsNotNull() {
            addCriterion("prd_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrdAmountEqualTo(Integer value) {
            addCriterion("prd_amount =", value, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountNotEqualTo(Integer value) {
            addCriterion("prd_amount <>", value, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountGreaterThan(Integer value) {
            addCriterion("prd_amount >", value, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("prd_amount >=", value, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountLessThan(Integer value) {
            addCriterion("prd_amount <", value, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountLessThanOrEqualTo(Integer value) {
            addCriterion("prd_amount <=", value, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountIn(List<Integer> values) {
            addCriterion("prd_amount in", values, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountNotIn(List<Integer> values) {
            addCriterion("prd_amount not in", values, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountBetween(Integer value1, Integer value2) {
            addCriterion("prd_amount between", value1, value2, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("prd_amount not between", value1, value2, "prdAmount");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIdIsNull() {
            addCriterion("prd_currency_id is null");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIdIsNotNull() {
            addCriterion("prd_currency_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIdEqualTo(String value) {
            addCriterion("prd_currency_id =", value, "prdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIdNotEqualTo(String value) {
            addCriterion("prd_currency_id <>", value, "prdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIdGreaterThan(String value) {
            addCriterion("prd_currency_id >", value, "prdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("prd_currency_id >=", value, "prdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIdLessThan(String value) {
            addCriterion("prd_currency_id <", value, "prdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIdLessThanOrEqualTo(String value) {
            addCriterion("prd_currency_id <=", value, "prdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIdLike(String value) {
            addCriterion("prd_currency_id like", value, "prdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIdNotLike(String value) {
            addCriterion("prd_currency_id not like", value, "prdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIdIn(List<String> values) {
            addCriterion("prd_currency_id in", values, "prdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIdNotIn(List<String> values) {
            addCriterion("prd_currency_id not in", values, "prdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIdBetween(String value1, String value2) {
            addCriterion("prd_currency_id between", value1, value2, "prdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andPrdCurrencyIdNotBetween(String value1, String value2) {
            addCriterion("prd_currency_id not between", value1, value2, "prdCurrencyId");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceIsNull() {
            addCriterion("prd_standard_price is null");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceIsNotNull() {
            addCriterion("prd_standard_price is not null");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceEqualTo(Float value) {
            addCriterion("prd_standard_price =", value, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceNotEqualTo(Float value) {
            addCriterion("prd_standard_price <>", value, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceGreaterThan(Float value) {
            addCriterion("prd_standard_price >", value, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("prd_standard_price >=", value, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceLessThan(Float value) {
            addCriterion("prd_standard_price <", value, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceLessThanOrEqualTo(Float value) {
            addCriterion("prd_standard_price <=", value, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceIn(List<Float> values) {
            addCriterion("prd_standard_price in", values, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceNotIn(List<Float> values) {
            addCriterion("prd_standard_price not in", values, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceBetween(Float value1, Float value2) {
            addCriterion("prd_standard_price between", value1, value2, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPriceNotBetween(Float value1, Float value2) {
            addCriterion("prd_standard_price not between", value1, value2, "prdStandardPrice");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPurchaseAmountIsNull() {
            addCriterion("prd_standard_purchase_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPurchaseAmountIsNotNull() {
            addCriterion("prd_standard_purchase_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPurchaseAmountEqualTo(Float value) {
            addCriterion("prd_standard_purchase_amount =", value, "prdStandardPurchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPurchaseAmountNotEqualTo(Float value) {
            addCriterion("prd_standard_purchase_amount <>", value, "prdStandardPurchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPurchaseAmountGreaterThan(Float value) {
            addCriterion("prd_standard_purchase_amount >", value, "prdStandardPurchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPurchaseAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("prd_standard_purchase_amount >=", value, "prdStandardPurchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPurchaseAmountLessThan(Float value) {
            addCriterion("prd_standard_purchase_amount <", value, "prdStandardPurchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPurchaseAmountLessThanOrEqualTo(Float value) {
            addCriterion("prd_standard_purchase_amount <=", value, "prdStandardPurchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPurchaseAmountIn(List<Float> values) {
            addCriterion("prd_standard_purchase_amount in", values, "prdStandardPurchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPurchaseAmountNotIn(List<Float> values) {
            addCriterion("prd_standard_purchase_amount not in", values, "prdStandardPurchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPurchaseAmountBetween(Float value1, Float value2) {
            addCriterion("prd_standard_purchase_amount between", value1, value2, "prdStandardPurchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPrdStandardPurchaseAmountNotBetween(Float value1, Float value2) {
            addCriterion("prd_standard_purchase_amount not between", value1, value2, "prdStandardPurchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPrdUnitPriceIsNull() {
            addCriterion("prd_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andPrdUnitPriceIsNotNull() {
            addCriterion("prd_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andPrdUnitPriceEqualTo(Float value) {
            addCriterion("prd_unit_price =", value, "prdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPrdUnitPriceNotEqualTo(Float value) {
            addCriterion("prd_unit_price <>", value, "prdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPrdUnitPriceGreaterThan(Float value) {
            addCriterion("prd_unit_price >", value, "prdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPrdUnitPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("prd_unit_price >=", value, "prdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPrdUnitPriceLessThan(Float value) {
            addCriterion("prd_unit_price <", value, "prdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPrdUnitPriceLessThanOrEqualTo(Float value) {
            addCriterion("prd_unit_price <=", value, "prdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPrdUnitPriceIn(List<Float> values) {
            addCriterion("prd_unit_price in", values, "prdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPrdUnitPriceNotIn(List<Float> values) {
            addCriterion("prd_unit_price not in", values, "prdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPrdUnitPriceBetween(Float value1, Float value2) {
            addCriterion("prd_unit_price between", value1, value2, "prdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPrdUnitPriceNotBetween(Float value1, Float value2) {
            addCriterion("prd_unit_price not between", value1, value2, "prdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPrdIncomingAmountIsNull() {
            addCriterion("prd_incoming_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrdIncomingAmountIsNotNull() {
            addCriterion("prd_incoming_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrdIncomingAmountEqualTo(Float value) {
            addCriterion("prd_incoming_amount =", value, "prdIncomingAmount");
            return (Criteria) this;
        }

        public Criteria andPrdIncomingAmountNotEqualTo(Float value) {
            addCriterion("prd_incoming_amount <>", value, "prdIncomingAmount");
            return (Criteria) this;
        }

        public Criteria andPrdIncomingAmountGreaterThan(Float value) {
            addCriterion("prd_incoming_amount >", value, "prdIncomingAmount");
            return (Criteria) this;
        }

        public Criteria andPrdIncomingAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("prd_incoming_amount >=", value, "prdIncomingAmount");
            return (Criteria) this;
        }

        public Criteria andPrdIncomingAmountLessThan(Float value) {
            addCriterion("prd_incoming_amount <", value, "prdIncomingAmount");
            return (Criteria) this;
        }

        public Criteria andPrdIncomingAmountLessThanOrEqualTo(Float value) {
            addCriterion("prd_incoming_amount <=", value, "prdIncomingAmount");
            return (Criteria) this;
        }

        public Criteria andPrdIncomingAmountIn(List<Float> values) {
            addCriterion("prd_incoming_amount in", values, "prdIncomingAmount");
            return (Criteria) this;
        }

        public Criteria andPrdIncomingAmountNotIn(List<Float> values) {
            addCriterion("prd_incoming_amount not in", values, "prdIncomingAmount");
            return (Criteria) this;
        }

        public Criteria andPrdIncomingAmountBetween(Float value1, Float value2) {
            addCriterion("prd_incoming_amount between", value1, value2, "prdIncomingAmount");
            return (Criteria) this;
        }

        public Criteria andPrdIncomingAmountNotBetween(Float value1, Float value2) {
            addCriterion("prd_incoming_amount not between", value1, value2, "prdIncomingAmount");
            return (Criteria) this;
        }

        public Criteria andPrdDemandDateIsNull() {
            addCriterion("prd_demand_date is null");
            return (Criteria) this;
        }

        public Criteria andPrdDemandDateIsNotNull() {
            addCriterion("prd_demand_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrdDemandDateEqualTo(Date value) {
            addCriterionForJDBCDate("prd_demand_date =", value, "prdDemandDate");
            return (Criteria) this;
        }

        public Criteria andPrdDemandDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("prd_demand_date <>", value, "prdDemandDate");
            return (Criteria) this;
        }

        public Criteria andPrdDemandDateGreaterThan(Date value) {
            addCriterionForJDBCDate("prd_demand_date >", value, "prdDemandDate");
            return (Criteria) this;
        }

        public Criteria andPrdDemandDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prd_demand_date >=", value, "prdDemandDate");
            return (Criteria) this;
        }

        public Criteria andPrdDemandDateLessThan(Date value) {
            addCriterionForJDBCDate("prd_demand_date <", value, "prdDemandDate");
            return (Criteria) this;
        }

        public Criteria andPrdDemandDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prd_demand_date <=", value, "prdDemandDate");
            return (Criteria) this;
        }

        public Criteria andPrdDemandDateIn(List<Date> values) {
            addCriterionForJDBCDate("prd_demand_date in", values, "prdDemandDate");
            return (Criteria) this;
        }

        public Criteria andPrdDemandDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("prd_demand_date not in", values, "prdDemandDate");
            return (Criteria) this;
        }

        public Criteria andPrdDemandDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prd_demand_date between", value1, value2, "prdDemandDate");
            return (Criteria) this;
        }

        public Criteria andPrdDemandDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prd_demand_date not between", value1, value2, "prdDemandDate");
            return (Criteria) this;
        }

        public Criteria andPrdRecommendedProcurementDateIsNull() {
            addCriterion("prd_recommended_procurement_date is null");
            return (Criteria) this;
        }

        public Criteria andPrdRecommendedProcurementDateIsNotNull() {
            addCriterion("prd_recommended_procurement_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrdRecommendedProcurementDateEqualTo(Date value) {
            addCriterionForJDBCDate("prd_recommended_procurement_date =", value, "prdRecommendedProcurementDate");
            return (Criteria) this;
        }

        public Criteria andPrdRecommendedProcurementDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("prd_recommended_procurement_date <>", value, "prdRecommendedProcurementDate");
            return (Criteria) this;
        }

        public Criteria andPrdRecommendedProcurementDateGreaterThan(Date value) {
            addCriterionForJDBCDate("prd_recommended_procurement_date >", value, "prdRecommendedProcurementDate");
            return (Criteria) this;
        }

        public Criteria andPrdRecommendedProcurementDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prd_recommended_procurement_date >=", value, "prdRecommendedProcurementDate");
            return (Criteria) this;
        }

        public Criteria andPrdRecommendedProcurementDateLessThan(Date value) {
            addCriterionForJDBCDate("prd_recommended_procurement_date <", value, "prdRecommendedProcurementDate");
            return (Criteria) this;
        }

        public Criteria andPrdRecommendedProcurementDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prd_recommended_procurement_date <=", value, "prdRecommendedProcurementDate");
            return (Criteria) this;
        }

        public Criteria andPrdRecommendedProcurementDateIn(List<Date> values) {
            addCriterionForJDBCDate("prd_recommended_procurement_date in", values, "prdRecommendedProcurementDate");
            return (Criteria) this;
        }

        public Criteria andPrdRecommendedProcurementDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("prd_recommended_procurement_date not in", values, "prdRecommendedProcurementDate");
            return (Criteria) this;
        }

        public Criteria andPrdRecommendedProcurementDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prd_recommended_procurement_date between", value1, value2, "prdRecommendedProcurementDate");
            return (Criteria) this;
        }

        public Criteria andPrdRecommendedProcurementDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prd_recommended_procurement_date not between", value1, value2, "prdRecommendedProcurementDate");
            return (Criteria) this;
        }

        public Criteria andPrdUnpurchasedQuantityIsNull() {
            addCriterion("prd_unpurchased_quantity is null");
            return (Criteria) this;
        }

        public Criteria andPrdUnpurchasedQuantityIsNotNull() {
            addCriterion("prd_unpurchased_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andPrdUnpurchasedQuantityEqualTo(Integer value) {
            addCriterion("prd_unpurchased_quantity =", value, "prdUnpurchasedQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdUnpurchasedQuantityNotEqualTo(Integer value) {
            addCriterion("prd_unpurchased_quantity <>", value, "prdUnpurchasedQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdUnpurchasedQuantityGreaterThan(Integer value) {
            addCriterion("prd_unpurchased_quantity >", value, "prdUnpurchasedQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdUnpurchasedQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("prd_unpurchased_quantity >=", value, "prdUnpurchasedQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdUnpurchasedQuantityLessThan(Integer value) {
            addCriterion("prd_unpurchased_quantity <", value, "prdUnpurchasedQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdUnpurchasedQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("prd_unpurchased_quantity <=", value, "prdUnpurchasedQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdUnpurchasedQuantityIn(List<Integer> values) {
            addCriterion("prd_unpurchased_quantity in", values, "prdUnpurchasedQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdUnpurchasedQuantityNotIn(List<Integer> values) {
            addCriterion("prd_unpurchased_quantity not in", values, "prdUnpurchasedQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdUnpurchasedQuantityBetween(Integer value1, Integer value2) {
            addCriterion("prd_unpurchased_quantity between", value1, value2, "prdUnpurchasedQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdUnpurchasedQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("prd_unpurchased_quantity not between", value1, value2, "prdUnpurchasedQuantity");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksIsNull() {
            addCriterion("prd_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksIsNotNull() {
            addCriterion("prd_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksEqualTo(String value) {
            addCriterion("prd_remarks =", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksNotEqualTo(String value) {
            addCriterion("prd_remarks <>", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksGreaterThan(String value) {
            addCriterion("prd_remarks >", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("prd_remarks >=", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksLessThan(String value) {
            addCriterion("prd_remarks <", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksLessThanOrEqualTo(String value) {
            addCriterion("prd_remarks <=", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksLike(String value) {
            addCriterion("prd_remarks like", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksNotLike(String value) {
            addCriterion("prd_remarks not like", value, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksIn(List<String> values) {
            addCriterion("prd_remarks in", values, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksNotIn(List<String> values) {
            addCriterion("prd_remarks not in", values, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksBetween(String value1, String value2) {
            addCriterion("prd_remarks between", value1, value2, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdRemarksNotBetween(String value1, String value2) {
            addCriterion("prd_remarks not between", value1, value2, "prdRemarks");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderIsNull() {
            addCriterion("prd_source_order is null");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderIsNotNull() {
            addCriterion("prd_source_order is not null");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderEqualTo(String value) {
            addCriterion("prd_source_order =", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderNotEqualTo(String value) {
            addCriterion("prd_source_order <>", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderGreaterThan(String value) {
            addCriterion("prd_source_order >", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderGreaterThanOrEqualTo(String value) {
            addCriterion("prd_source_order >=", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderLessThan(String value) {
            addCriterion("prd_source_order <", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderLessThanOrEqualTo(String value) {
            addCriterion("prd_source_order <=", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderLike(String value) {
            addCriterion("prd_source_order like", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderNotLike(String value) {
            addCriterion("prd_source_order not like", value, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderIn(List<String> values) {
            addCriterion("prd_source_order in", values, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderNotIn(List<String> values) {
            addCriterion("prd_source_order not in", values, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderBetween(String value1, String value2) {
            addCriterion("prd_source_order between", value1, value2, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceOrderNotBetween(String value1, String value2) {
            addCriterion("prd_source_order not between", value1, value2, "prdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoIsNull() {
            addCriterion("prd_source_no is null");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoIsNotNull() {
            addCriterion("prd_source_no is not null");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoEqualTo(String value) {
            addCriterion("prd_source_no =", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoNotEqualTo(String value) {
            addCriterion("prd_source_no <>", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoGreaterThan(String value) {
            addCriterion("prd_source_no >", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoGreaterThanOrEqualTo(String value) {
            addCriterion("prd_source_no >=", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoLessThan(String value) {
            addCriterion("prd_source_no <", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoLessThanOrEqualTo(String value) {
            addCriterion("prd_source_no <=", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoLike(String value) {
            addCriterion("prd_source_no like", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoNotLike(String value) {
            addCriterion("prd_source_no not like", value, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoIn(List<String> values) {
            addCriterion("prd_source_no in", values, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoNotIn(List<String> values) {
            addCriterion("prd_source_no not in", values, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoBetween(String value1, String value2) {
            addCriterion("prd_source_no between", value1, value2, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdSourceNoNotBetween(String value1, String value2) {
            addCriterion("prd_source_no not between", value1, value2, "prdSourceNo");
            return (Criteria) this;
        }

        public Criteria andPrdAuditionIsNull() {
            addCriterion("prd_audition is null");
            return (Criteria) this;
        }

        public Criteria andPrdAuditionIsNotNull() {
            addCriterion("prd_audition is not null");
            return (Criteria) this;
        }

        public Criteria andPrdAuditionEqualTo(String value) {
            addCriterion("prd_audition =", value, "prdAudition");
            return (Criteria) this;
        }

        public Criteria andPrdAuditionNotEqualTo(String value) {
            addCriterion("prd_audition <>", value, "prdAudition");
            return (Criteria) this;
        }

        public Criteria andPrdAuditionGreaterThan(String value) {
            addCriterion("prd_audition >", value, "prdAudition");
            return (Criteria) this;
        }

        public Criteria andPrdAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("prd_audition >=", value, "prdAudition");
            return (Criteria) this;
        }

        public Criteria andPrdAuditionLessThan(String value) {
            addCriterion("prd_audition <", value, "prdAudition");
            return (Criteria) this;
        }

        public Criteria andPrdAuditionLessThanOrEqualTo(String value) {
            addCriterion("prd_audition <=", value, "prdAudition");
            return (Criteria) this;
        }

        public Criteria andPrdAuditionLike(String value) {
            addCriterion("prd_audition like", value, "prdAudition");
            return (Criteria) this;
        }

        public Criteria andPrdAuditionNotLike(String value) {
            addCriterion("prd_audition not like", value, "prdAudition");
            return (Criteria) this;
        }

        public Criteria andPrdAuditionIn(List<String> values) {
            addCriterion("prd_audition in", values, "prdAudition");
            return (Criteria) this;
        }

        public Criteria andPrdAuditionNotIn(List<String> values) {
            addCriterion("prd_audition not in", values, "prdAudition");
            return (Criteria) this;
        }

        public Criteria andPrdAuditionBetween(String value1, String value2) {
            addCriterion("prd_audition between", value1, value2, "prdAudition");
            return (Criteria) this;
        }

        public Criteria andPrdAuditionNotBetween(String value1, String value2) {
            addCriterion("prd_audition not between", value1, value2, "prdAudition");
            return (Criteria) this;
        }

        public Criteria andPrdYnIsNull() {
            addCriterion("prd_yn is null");
            return (Criteria) this;
        }

        public Criteria andPrdYnIsNotNull() {
            addCriterion("prd_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPrdYnEqualTo(String value) {
            addCriterion("prd_yn =", value, "prdYn");
            return (Criteria) this;
        }

        public Criteria andPrdYnNotEqualTo(String value) {
            addCriterion("prd_yn <>", value, "prdYn");
            return (Criteria) this;
        }

        public Criteria andPrdYnGreaterThan(String value) {
            addCriterion("prd_yn >", value, "prdYn");
            return (Criteria) this;
        }

        public Criteria andPrdYnGreaterThanOrEqualTo(String value) {
            addCriterion("prd_yn >=", value, "prdYn");
            return (Criteria) this;
        }

        public Criteria andPrdYnLessThan(String value) {
            addCriterion("prd_yn <", value, "prdYn");
            return (Criteria) this;
        }

        public Criteria andPrdYnLessThanOrEqualTo(String value) {
            addCriterion("prd_yn <=", value, "prdYn");
            return (Criteria) this;
        }

        public Criteria andPrdYnLike(String value) {
            addCriterion("prd_yn like", value, "prdYn");
            return (Criteria) this;
        }

        public Criteria andPrdYnNotLike(String value) {
            addCriterion("prd_yn not like", value, "prdYn");
            return (Criteria) this;
        }

        public Criteria andPrdYnIn(List<String> values) {
            addCriterion("prd_yn in", values, "prdYn");
            return (Criteria) this;
        }

        public Criteria andPrdYnNotIn(List<String> values) {
            addCriterion("prd_yn not in", values, "prdYn");
            return (Criteria) this;
        }

        public Criteria andPrdYnBetween(String value1, String value2) {
            addCriterion("prd_yn between", value1, value2, "prdYn");
            return (Criteria) this;
        }

        public Criteria andPrdYnNotBetween(String value1, String value2) {
            addCriterion("prd_yn not between", value1, value2, "prdYn");
            return (Criteria) this;
        }

        public Criteria andPrdCustom1IsNull() {
            addCriterion("prd_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPrdCustom1IsNotNull() {
            addCriterion("prd_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPrdCustom1EqualTo(String value) {
            addCriterion("prd_custom1 =", value, "prdCustom1");
            return (Criteria) this;
        }

        public Criteria andPrdCustom1NotEqualTo(String value) {
            addCriterion("prd_custom1 <>", value, "prdCustom1");
            return (Criteria) this;
        }

        public Criteria andPrdCustom1GreaterThan(String value) {
            addCriterion("prd_custom1 >", value, "prdCustom1");
            return (Criteria) this;
        }

        public Criteria andPrdCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("prd_custom1 >=", value, "prdCustom1");
            return (Criteria) this;
        }

        public Criteria andPrdCustom1LessThan(String value) {
            addCriterion("prd_custom1 <", value, "prdCustom1");
            return (Criteria) this;
        }

        public Criteria andPrdCustom1LessThanOrEqualTo(String value) {
            addCriterion("prd_custom1 <=", value, "prdCustom1");
            return (Criteria) this;
        }

        public Criteria andPrdCustom1Like(String value) {
            addCriterion("prd_custom1 like", value, "prdCustom1");
            return (Criteria) this;
        }

        public Criteria andPrdCustom1NotLike(String value) {
            addCriterion("prd_custom1 not like", value, "prdCustom1");
            return (Criteria) this;
        }

        public Criteria andPrdCustom1In(List<String> values) {
            addCriterion("prd_custom1 in", values, "prdCustom1");
            return (Criteria) this;
        }

        public Criteria andPrdCustom1NotIn(List<String> values) {
            addCriterion("prd_custom1 not in", values, "prdCustom1");
            return (Criteria) this;
        }

        public Criteria andPrdCustom1Between(String value1, String value2) {
            addCriterion("prd_custom1 between", value1, value2, "prdCustom1");
            return (Criteria) this;
        }

        public Criteria andPrdCustom1NotBetween(String value1, String value2) {
            addCriterion("prd_custom1 not between", value1, value2, "prdCustom1");
            return (Criteria) this;
        }

        public Criteria andPrdCustom2IsNull() {
            addCriterion("prd_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPrdCustom2IsNotNull() {
            addCriterion("prd_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrdCustom2EqualTo(String value) {
            addCriterion("prd_custom2 =", value, "prdCustom2");
            return (Criteria) this;
        }

        public Criteria andPrdCustom2NotEqualTo(String value) {
            addCriterion("prd_custom2 <>", value, "prdCustom2");
            return (Criteria) this;
        }

        public Criteria andPrdCustom2GreaterThan(String value) {
            addCriterion("prd_custom2 >", value, "prdCustom2");
            return (Criteria) this;
        }

        public Criteria andPrdCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("prd_custom2 >=", value, "prdCustom2");
            return (Criteria) this;
        }

        public Criteria andPrdCustom2LessThan(String value) {
            addCriterion("prd_custom2 <", value, "prdCustom2");
            return (Criteria) this;
        }

        public Criteria andPrdCustom2LessThanOrEqualTo(String value) {
            addCriterion("prd_custom2 <=", value, "prdCustom2");
            return (Criteria) this;
        }

        public Criteria andPrdCustom2Like(String value) {
            addCriterion("prd_custom2 like", value, "prdCustom2");
            return (Criteria) this;
        }

        public Criteria andPrdCustom2NotLike(String value) {
            addCriterion("prd_custom2 not like", value, "prdCustom2");
            return (Criteria) this;
        }

        public Criteria andPrdCustom2In(List<String> values) {
            addCriterion("prd_custom2 in", values, "prdCustom2");
            return (Criteria) this;
        }

        public Criteria andPrdCustom2NotIn(List<String> values) {
            addCriterion("prd_custom2 not in", values, "prdCustom2");
            return (Criteria) this;
        }

        public Criteria andPrdCustom2Between(String value1, String value2) {
            addCriterion("prd_custom2 between", value1, value2, "prdCustom2");
            return (Criteria) this;
        }

        public Criteria andPrdCustom2NotBetween(String value1, String value2) {
            addCriterion("prd_custom2 not between", value1, value2, "prdCustom2");
            return (Criteria) this;
        }

        public Criteria andPrdCustom3IsNull() {
            addCriterion("prd_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPrdCustom3IsNotNull() {
            addCriterion("prd_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPrdCustom3EqualTo(String value) {
            addCriterion("prd_custom3 =", value, "prdCustom3");
            return (Criteria) this;
        }

        public Criteria andPrdCustom3NotEqualTo(String value) {
            addCriterion("prd_custom3 <>", value, "prdCustom3");
            return (Criteria) this;
        }

        public Criteria andPrdCustom3GreaterThan(String value) {
            addCriterion("prd_custom3 >", value, "prdCustom3");
            return (Criteria) this;
        }

        public Criteria andPrdCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("prd_custom3 >=", value, "prdCustom3");
            return (Criteria) this;
        }

        public Criteria andPrdCustom3LessThan(String value) {
            addCriterion("prd_custom3 <", value, "prdCustom3");
            return (Criteria) this;
        }

        public Criteria andPrdCustom3LessThanOrEqualTo(String value) {
            addCriterion("prd_custom3 <=", value, "prdCustom3");
            return (Criteria) this;
        }

        public Criteria andPrdCustom3Like(String value) {
            addCriterion("prd_custom3 like", value, "prdCustom3");
            return (Criteria) this;
        }

        public Criteria andPrdCustom3NotLike(String value) {
            addCriterion("prd_custom3 not like", value, "prdCustom3");
            return (Criteria) this;
        }

        public Criteria andPrdCustom3In(List<String> values) {
            addCriterion("prd_custom3 in", values, "prdCustom3");
            return (Criteria) this;
        }

        public Criteria andPrdCustom3NotIn(List<String> values) {
            addCriterion("prd_custom3 not in", values, "prdCustom3");
            return (Criteria) this;
        }

        public Criteria andPrdCustom3Between(String value1, String value2) {
            addCriterion("prd_custom3 between", value1, value2, "prdCustom3");
            return (Criteria) this;
        }

        public Criteria andPrdCustom3NotBetween(String value1, String value2) {
            addCriterion("prd_custom3 not between", value1, value2, "prdCustom3");
            return (Criteria) this;
        }

        public Criteria andPrdCustom4IsNull() {
            addCriterion("prd_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPrdCustom4IsNotNull() {
            addCriterion("prd_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPrdCustom4EqualTo(String value) {
            addCriterion("prd_custom4 =", value, "prdCustom4");
            return (Criteria) this;
        }

        public Criteria andPrdCustom4NotEqualTo(String value) {
            addCriterion("prd_custom4 <>", value, "prdCustom4");
            return (Criteria) this;
        }

        public Criteria andPrdCustom4GreaterThan(String value) {
            addCriterion("prd_custom4 >", value, "prdCustom4");
            return (Criteria) this;
        }

        public Criteria andPrdCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("prd_custom4 >=", value, "prdCustom4");
            return (Criteria) this;
        }

        public Criteria andPrdCustom4LessThan(String value) {
            addCriterion("prd_custom4 <", value, "prdCustom4");
            return (Criteria) this;
        }

        public Criteria andPrdCustom4LessThanOrEqualTo(String value) {
            addCriterion("prd_custom4 <=", value, "prdCustom4");
            return (Criteria) this;
        }

        public Criteria andPrdCustom4Like(String value) {
            addCriterion("prd_custom4 like", value, "prdCustom4");
            return (Criteria) this;
        }

        public Criteria andPrdCustom4NotLike(String value) {
            addCriterion("prd_custom4 not like", value, "prdCustom4");
            return (Criteria) this;
        }

        public Criteria andPrdCustom4In(List<String> values) {
            addCriterion("prd_custom4 in", values, "prdCustom4");
            return (Criteria) this;
        }

        public Criteria andPrdCustom4NotIn(List<String> values) {
            addCriterion("prd_custom4 not in", values, "prdCustom4");
            return (Criteria) this;
        }

        public Criteria andPrdCustom4Between(String value1, String value2) {
            addCriterion("prd_custom4 between", value1, value2, "prdCustom4");
            return (Criteria) this;
        }

        public Criteria andPrdCustom4NotBetween(String value1, String value2) {
            addCriterion("prd_custom4 not between", value1, value2, "prdCustom4");
            return (Criteria) this;
        }

        public Criteria andPrdCustom5IsNull() {
            addCriterion("prd_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPrdCustom5IsNotNull() {
            addCriterion("prd_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPrdCustom5EqualTo(String value) {
            addCriterion("prd_custom5 =", value, "prdCustom5");
            return (Criteria) this;
        }

        public Criteria andPrdCustom5NotEqualTo(String value) {
            addCriterion("prd_custom5 <>", value, "prdCustom5");
            return (Criteria) this;
        }

        public Criteria andPrdCustom5GreaterThan(String value) {
            addCriterion("prd_custom5 >", value, "prdCustom5");
            return (Criteria) this;
        }

        public Criteria andPrdCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("prd_custom5 >=", value, "prdCustom5");
            return (Criteria) this;
        }

        public Criteria andPrdCustom5LessThan(String value) {
            addCriterion("prd_custom5 <", value, "prdCustom5");
            return (Criteria) this;
        }

        public Criteria andPrdCustom5LessThanOrEqualTo(String value) {
            addCriterion("prd_custom5 <=", value, "prdCustom5");
            return (Criteria) this;
        }

        public Criteria andPrdCustom5Like(String value) {
            addCriterion("prd_custom5 like", value, "prdCustom5");
            return (Criteria) this;
        }

        public Criteria andPrdCustom5NotLike(String value) {
            addCriterion("prd_custom5 not like", value, "prdCustom5");
            return (Criteria) this;
        }

        public Criteria andPrdCustom5In(List<String> values) {
            addCriterion("prd_custom5 in", values, "prdCustom5");
            return (Criteria) this;
        }

        public Criteria andPrdCustom5NotIn(List<String> values) {
            addCriterion("prd_custom5 not in", values, "prdCustom5");
            return (Criteria) this;
        }

        public Criteria andPrdCustom5Between(String value1, String value2) {
            addCriterion("prd_custom5 between", value1, value2, "prdCustom5");
            return (Criteria) this;
        }

        public Criteria andPrdCustom5NotBetween(String value1, String value2) {
            addCriterion("prd_custom5 not between", value1, value2, "prdCustom5");
            return (Criteria) this;
        }

        public Criteria andPrdCustom6IsNull() {
            addCriterion("prd_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPrdCustom6IsNotNull() {
            addCriterion("prd_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPrdCustom6EqualTo(String value) {
            addCriterion("prd_custom6 =", value, "prdCustom6");
            return (Criteria) this;
        }

        public Criteria andPrdCustom6NotEqualTo(String value) {
            addCriterion("prd_custom6 <>", value, "prdCustom6");
            return (Criteria) this;
        }

        public Criteria andPrdCustom6GreaterThan(String value) {
            addCriterion("prd_custom6 >", value, "prdCustom6");
            return (Criteria) this;
        }

        public Criteria andPrdCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("prd_custom6 >=", value, "prdCustom6");
            return (Criteria) this;
        }

        public Criteria andPrdCustom6LessThan(String value) {
            addCriterion("prd_custom6 <", value, "prdCustom6");
            return (Criteria) this;
        }

        public Criteria andPrdCustom6LessThanOrEqualTo(String value) {
            addCriterion("prd_custom6 <=", value, "prdCustom6");
            return (Criteria) this;
        }

        public Criteria andPrdCustom6Like(String value) {
            addCriterion("prd_custom6 like", value, "prdCustom6");
            return (Criteria) this;
        }

        public Criteria andPrdCustom6NotLike(String value) {
            addCriterion("prd_custom6 not like", value, "prdCustom6");
            return (Criteria) this;
        }

        public Criteria andPrdCustom6In(List<String> values) {
            addCriterion("prd_custom6 in", values, "prdCustom6");
            return (Criteria) this;
        }

        public Criteria andPrdCustom6NotIn(List<String> values) {
            addCriterion("prd_custom6 not in", values, "prdCustom6");
            return (Criteria) this;
        }

        public Criteria andPrdCustom6Between(String value1, String value2) {
            addCriterion("prd_custom6 between", value1, value2, "prdCustom6");
            return (Criteria) this;
        }

        public Criteria andPrdCustom6NotBetween(String value1, String value2) {
            addCriterion("prd_custom6 not between", value1, value2, "prdCustom6");
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