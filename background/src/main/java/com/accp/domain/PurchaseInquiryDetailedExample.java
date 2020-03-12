package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PurchaseInquiryDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseInquiryDetailedExample() {
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

        public Criteria andDidIdIsNull() {
            addCriterion("did_id is null");
            return (Criteria) this;
        }

        public Criteria andDidIdIsNotNull() {
            addCriterion("did_id is not null");
            return (Criteria) this;
        }

        public Criteria andDidIdEqualTo(String value) {
            addCriterion("did_id =", value, "didId");
            return (Criteria) this;
        }

        public Criteria andDidIdNotEqualTo(String value) {
            addCriterion("did_id <>", value, "didId");
            return (Criteria) this;
        }

        public Criteria andDidIdGreaterThan(String value) {
            addCriterion("did_id >", value, "didId");
            return (Criteria) this;
        }

        public Criteria andDidIdGreaterThanOrEqualTo(String value) {
            addCriterion("did_id >=", value, "didId");
            return (Criteria) this;
        }

        public Criteria andDidIdLessThan(String value) {
            addCriterion("did_id <", value, "didId");
            return (Criteria) this;
        }

        public Criteria andDidIdLessThanOrEqualTo(String value) {
            addCriterion("did_id <=", value, "didId");
            return (Criteria) this;
        }

        public Criteria andDidIdLike(String value) {
            addCriterion("did_id like", value, "didId");
            return (Criteria) this;
        }

        public Criteria andDidIdNotLike(String value) {
            addCriterion("did_id not like", value, "didId");
            return (Criteria) this;
        }

        public Criteria andDidIdIn(List<String> values) {
            addCriterion("did_id in", values, "didId");
            return (Criteria) this;
        }

        public Criteria andDidIdNotIn(List<String> values) {
            addCriterion("did_id not in", values, "didId");
            return (Criteria) this;
        }

        public Criteria andDidIdBetween(String value1, String value2) {
            addCriterion("did_id between", value1, value2, "didId");
            return (Criteria) this;
        }

        public Criteria andDidIdNotBetween(String value1, String value2) {
            addCriterion("did_id not between", value1, value2, "didId");
            return (Criteria) this;
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

        public Criteria andDidMatterIdIsNull() {
            addCriterion("did_matter_id is null");
            return (Criteria) this;
        }

        public Criteria andDidMatterIdIsNotNull() {
            addCriterion("did_matter_id is not null");
            return (Criteria) this;
        }

        public Criteria andDidMatterIdEqualTo(String value) {
            addCriterion("did_matter_id =", value, "didMatterId");
            return (Criteria) this;
        }

        public Criteria andDidMatterIdNotEqualTo(String value) {
            addCriterion("did_matter_id <>", value, "didMatterId");
            return (Criteria) this;
        }

        public Criteria andDidMatterIdGreaterThan(String value) {
            addCriterion("did_matter_id >", value, "didMatterId");
            return (Criteria) this;
        }

        public Criteria andDidMatterIdGreaterThanOrEqualTo(String value) {
            addCriterion("did_matter_id >=", value, "didMatterId");
            return (Criteria) this;
        }

        public Criteria andDidMatterIdLessThan(String value) {
            addCriterion("did_matter_id <", value, "didMatterId");
            return (Criteria) this;
        }

        public Criteria andDidMatterIdLessThanOrEqualTo(String value) {
            addCriterion("did_matter_id <=", value, "didMatterId");
            return (Criteria) this;
        }

        public Criteria andDidMatterIdLike(String value) {
            addCriterion("did_matter_id like", value, "didMatterId");
            return (Criteria) this;
        }

        public Criteria andDidMatterIdNotLike(String value) {
            addCriterion("did_matter_id not like", value, "didMatterId");
            return (Criteria) this;
        }

        public Criteria andDidMatterIdIn(List<String> values) {
            addCriterion("did_matter_id in", values, "didMatterId");
            return (Criteria) this;
        }

        public Criteria andDidMatterIdNotIn(List<String> values) {
            addCriterion("did_matter_id not in", values, "didMatterId");
            return (Criteria) this;
        }

        public Criteria andDidMatterIdBetween(String value1, String value2) {
            addCriterion("did_matter_id between", value1, value2, "didMatterId");
            return (Criteria) this;
        }

        public Criteria andDidMatterIdNotBetween(String value1, String value2) {
            addCriterion("did_matter_id not between", value1, value2, "didMatterId");
            return (Criteria) this;
        }

        public Criteria andDidMatterNameIsNull() {
            addCriterion("did_matter_name is null");
            return (Criteria) this;
        }

        public Criteria andDidMatterNameIsNotNull() {
            addCriterion("did_matter_name is not null");
            return (Criteria) this;
        }

        public Criteria andDidMatterNameEqualTo(String value) {
            addCriterion("did_matter_name =", value, "didMatterName");
            return (Criteria) this;
        }

        public Criteria andDidMatterNameNotEqualTo(String value) {
            addCriterion("did_matter_name <>", value, "didMatterName");
            return (Criteria) this;
        }

        public Criteria andDidMatterNameGreaterThan(String value) {
            addCriterion("did_matter_name >", value, "didMatterName");
            return (Criteria) this;
        }

        public Criteria andDidMatterNameGreaterThanOrEqualTo(String value) {
            addCriterion("did_matter_name >=", value, "didMatterName");
            return (Criteria) this;
        }

        public Criteria andDidMatterNameLessThan(String value) {
            addCriterion("did_matter_name <", value, "didMatterName");
            return (Criteria) this;
        }

        public Criteria andDidMatterNameLessThanOrEqualTo(String value) {
            addCriterion("did_matter_name <=", value, "didMatterName");
            return (Criteria) this;
        }

        public Criteria andDidMatterNameLike(String value) {
            addCriterion("did_matter_name like", value, "didMatterName");
            return (Criteria) this;
        }

        public Criteria andDidMatterNameNotLike(String value) {
            addCriterion("did_matter_name not like", value, "didMatterName");
            return (Criteria) this;
        }

        public Criteria andDidMatterNameIn(List<String> values) {
            addCriterion("did_matter_name in", values, "didMatterName");
            return (Criteria) this;
        }

        public Criteria andDidMatterNameNotIn(List<String> values) {
            addCriterion("did_matter_name not in", values, "didMatterName");
            return (Criteria) this;
        }

        public Criteria andDidMatterNameBetween(String value1, String value2) {
            addCriterion("did_matter_name between", value1, value2, "didMatterName");
            return (Criteria) this;
        }

        public Criteria andDidMatterNameNotBetween(String value1, String value2) {
            addCriterion("did_matter_name not between", value1, value2, "didMatterName");
            return (Criteria) this;
        }

        public Criteria andDidSpecificationsIsNull() {
            addCriterion("did_specifications is null");
            return (Criteria) this;
        }

        public Criteria andDidSpecificationsIsNotNull() {
            addCriterion("did_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andDidSpecificationsEqualTo(String value) {
            addCriterion("did_specifications =", value, "didSpecifications");
            return (Criteria) this;
        }

        public Criteria andDidSpecificationsNotEqualTo(String value) {
            addCriterion("did_specifications <>", value, "didSpecifications");
            return (Criteria) this;
        }

        public Criteria andDidSpecificationsGreaterThan(String value) {
            addCriterion("did_specifications >", value, "didSpecifications");
            return (Criteria) this;
        }

        public Criteria andDidSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("did_specifications >=", value, "didSpecifications");
            return (Criteria) this;
        }

        public Criteria andDidSpecificationsLessThan(String value) {
            addCriterion("did_specifications <", value, "didSpecifications");
            return (Criteria) this;
        }

        public Criteria andDidSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("did_specifications <=", value, "didSpecifications");
            return (Criteria) this;
        }

        public Criteria andDidSpecificationsLike(String value) {
            addCriterion("did_specifications like", value, "didSpecifications");
            return (Criteria) this;
        }

        public Criteria andDidSpecificationsNotLike(String value) {
            addCriterion("did_specifications not like", value, "didSpecifications");
            return (Criteria) this;
        }

        public Criteria andDidSpecificationsIn(List<String> values) {
            addCriterion("did_specifications in", values, "didSpecifications");
            return (Criteria) this;
        }

        public Criteria andDidSpecificationsNotIn(List<String> values) {
            addCriterion("did_specifications not in", values, "didSpecifications");
            return (Criteria) this;
        }

        public Criteria andDidSpecificationsBetween(String value1, String value2) {
            addCriterion("did_specifications between", value1, value2, "didSpecifications");
            return (Criteria) this;
        }

        public Criteria andDidSpecificationsNotBetween(String value1, String value2) {
            addCriterion("did_specifications not between", value1, value2, "didSpecifications");
            return (Criteria) this;
        }

        public Criteria andDidCompanyNameIsNull() {
            addCriterion("did_company_name is null");
            return (Criteria) this;
        }

        public Criteria andDidCompanyNameIsNotNull() {
            addCriterion("did_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andDidCompanyNameEqualTo(String value) {
            addCriterion("did_company_name =", value, "didCompanyName");
            return (Criteria) this;
        }

        public Criteria andDidCompanyNameNotEqualTo(String value) {
            addCriterion("did_company_name <>", value, "didCompanyName");
            return (Criteria) this;
        }

        public Criteria andDidCompanyNameGreaterThan(String value) {
            addCriterion("did_company_name >", value, "didCompanyName");
            return (Criteria) this;
        }

        public Criteria andDidCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("did_company_name >=", value, "didCompanyName");
            return (Criteria) this;
        }

        public Criteria andDidCompanyNameLessThan(String value) {
            addCriterion("did_company_name <", value, "didCompanyName");
            return (Criteria) this;
        }

        public Criteria andDidCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("did_company_name <=", value, "didCompanyName");
            return (Criteria) this;
        }

        public Criteria andDidCompanyNameLike(String value) {
            addCriterion("did_company_name like", value, "didCompanyName");
            return (Criteria) this;
        }

        public Criteria andDidCompanyNameNotLike(String value) {
            addCriterion("did_company_name not like", value, "didCompanyName");
            return (Criteria) this;
        }

        public Criteria andDidCompanyNameIn(List<String> values) {
            addCriterion("did_company_name in", values, "didCompanyName");
            return (Criteria) this;
        }

        public Criteria andDidCompanyNameNotIn(List<String> values) {
            addCriterion("did_company_name not in", values, "didCompanyName");
            return (Criteria) this;
        }

        public Criteria andDidCompanyNameBetween(String value1, String value2) {
            addCriterion("did_company_name between", value1, value2, "didCompanyName");
            return (Criteria) this;
        }

        public Criteria andDidCompanyNameNotBetween(String value1, String value2) {
            addCriterion("did_company_name not between", value1, value2, "didCompanyName");
            return (Criteria) this;
        }

        public Criteria andDidAmountIsNull() {
            addCriterion("did_amount is null");
            return (Criteria) this;
        }

        public Criteria andDidAmountIsNotNull() {
            addCriterion("did_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDidAmountEqualTo(Integer value) {
            addCriterion("did_amount =", value, "didAmount");
            return (Criteria) this;
        }

        public Criteria andDidAmountNotEqualTo(Integer value) {
            addCriterion("did_amount <>", value, "didAmount");
            return (Criteria) this;
        }

        public Criteria andDidAmountGreaterThan(Integer value) {
            addCriterion("did_amount >", value, "didAmount");
            return (Criteria) this;
        }

        public Criteria andDidAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("did_amount >=", value, "didAmount");
            return (Criteria) this;
        }

        public Criteria andDidAmountLessThan(Integer value) {
            addCriterion("did_amount <", value, "didAmount");
            return (Criteria) this;
        }

        public Criteria andDidAmountLessThanOrEqualTo(Integer value) {
            addCriterion("did_amount <=", value, "didAmount");
            return (Criteria) this;
        }

        public Criteria andDidAmountIn(List<Integer> values) {
            addCriterion("did_amount in", values, "didAmount");
            return (Criteria) this;
        }

        public Criteria andDidAmountNotIn(List<Integer> values) {
            addCriterion("did_amount not in", values, "didAmount");
            return (Criteria) this;
        }

        public Criteria andDidAmountBetween(Integer value1, Integer value2) {
            addCriterion("did_amount between", value1, value2, "didAmount");
            return (Criteria) this;
        }

        public Criteria andDidAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("did_amount not between", value1, value2, "didAmount");
            return (Criteria) this;
        }

        public Criteria andDidMoneyDiscountBeforeIsNull() {
            addCriterion("did_money_discount_before is null");
            return (Criteria) this;
        }

        public Criteria andDidMoneyDiscountBeforeIsNotNull() {
            addCriterion("did_money_discount_before is not null");
            return (Criteria) this;
        }

        public Criteria andDidMoneyDiscountBeforeEqualTo(Float value) {
            addCriterion("did_money_discount_before =", value, "didMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andDidMoneyDiscountBeforeNotEqualTo(Float value) {
            addCriterion("did_money_discount_before <>", value, "didMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andDidMoneyDiscountBeforeGreaterThan(Float value) {
            addCriterion("did_money_discount_before >", value, "didMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andDidMoneyDiscountBeforeGreaterThanOrEqualTo(Float value) {
            addCriterion("did_money_discount_before >=", value, "didMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andDidMoneyDiscountBeforeLessThan(Float value) {
            addCriterion("did_money_discount_before <", value, "didMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andDidMoneyDiscountBeforeLessThanOrEqualTo(Float value) {
            addCriterion("did_money_discount_before <=", value, "didMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andDidMoneyDiscountBeforeIn(List<Float> values) {
            addCriterion("did_money_discount_before in", values, "didMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andDidMoneyDiscountBeforeNotIn(List<Float> values) {
            addCriterion("did_money_discount_before not in", values, "didMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andDidMoneyDiscountBeforeBetween(Float value1, Float value2) {
            addCriterion("did_money_discount_before between", value1, value2, "didMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andDidMoneyDiscountBeforeNotBetween(Float value1, Float value2) {
            addCriterion("did_money_discount_before not between", value1, value2, "didMoneyDiscountBefore");
            return (Criteria) this;
        }

        public Criteria andDidDiscountNumberIsNull() {
            addCriterion("did_discount_number is null");
            return (Criteria) this;
        }

        public Criteria andDidDiscountNumberIsNotNull() {
            addCriterion("did_discount_number is not null");
            return (Criteria) this;
        }

        public Criteria andDidDiscountNumberEqualTo(String value) {
            addCriterion("did_discount_number =", value, "didDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andDidDiscountNumberNotEqualTo(String value) {
            addCriterion("did_discount_number <>", value, "didDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andDidDiscountNumberGreaterThan(String value) {
            addCriterion("did_discount_number >", value, "didDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andDidDiscountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("did_discount_number >=", value, "didDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andDidDiscountNumberLessThan(String value) {
            addCriterion("did_discount_number <", value, "didDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andDidDiscountNumberLessThanOrEqualTo(String value) {
            addCriterion("did_discount_number <=", value, "didDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andDidDiscountNumberLike(String value) {
            addCriterion("did_discount_number like", value, "didDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andDidDiscountNumberNotLike(String value) {
            addCriterion("did_discount_number not like", value, "didDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andDidDiscountNumberIn(List<String> values) {
            addCriterion("did_discount_number in", values, "didDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andDidDiscountNumberNotIn(List<String> values) {
            addCriterion("did_discount_number not in", values, "didDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andDidDiscountNumberBetween(String value1, String value2) {
            addCriterion("did_discount_number between", value1, value2, "didDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andDidDiscountNumberNotBetween(String value1, String value2) {
            addCriterion("did_discount_number not between", value1, value2, "didDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andDidPriceIsNull() {
            addCriterion("did_price is null");
            return (Criteria) this;
        }

        public Criteria andDidPriceIsNotNull() {
            addCriterion("did_price is not null");
            return (Criteria) this;
        }

        public Criteria andDidPriceEqualTo(Float value) {
            addCriterion("did_price =", value, "didPrice");
            return (Criteria) this;
        }

        public Criteria andDidPriceNotEqualTo(Float value) {
            addCriterion("did_price <>", value, "didPrice");
            return (Criteria) this;
        }

        public Criteria andDidPriceGreaterThan(Float value) {
            addCriterion("did_price >", value, "didPrice");
            return (Criteria) this;
        }

        public Criteria andDidPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("did_price >=", value, "didPrice");
            return (Criteria) this;
        }

        public Criteria andDidPriceLessThan(Float value) {
            addCriterion("did_price <", value, "didPrice");
            return (Criteria) this;
        }

        public Criteria andDidPriceLessThanOrEqualTo(Float value) {
            addCriterion("did_price <=", value, "didPrice");
            return (Criteria) this;
        }

        public Criteria andDidPriceIn(List<Float> values) {
            addCriterion("did_price in", values, "didPrice");
            return (Criteria) this;
        }

        public Criteria andDidPriceNotIn(List<Float> values) {
            addCriterion("did_price not in", values, "didPrice");
            return (Criteria) this;
        }

        public Criteria andDidPriceBetween(Float value1, Float value2) {
            addCriterion("did_price between", value1, value2, "didPrice");
            return (Criteria) this;
        }

        public Criteria andDidPriceNotBetween(Float value1, Float value2) {
            addCriterion("did_price not between", value1, value2, "didPrice");
            return (Criteria) this;
        }

        public Criteria andDidMoneyIsNull() {
            addCriterion("did_money is null");
            return (Criteria) this;
        }

        public Criteria andDidMoneyIsNotNull() {
            addCriterion("did_money is not null");
            return (Criteria) this;
        }

        public Criteria andDidMoneyEqualTo(Float value) {
            addCriterion("did_money =", value, "didMoney");
            return (Criteria) this;
        }

        public Criteria andDidMoneyNotEqualTo(Float value) {
            addCriterion("did_money <>", value, "didMoney");
            return (Criteria) this;
        }

        public Criteria andDidMoneyGreaterThan(Float value) {
            addCriterion("did_money >", value, "didMoney");
            return (Criteria) this;
        }

        public Criteria andDidMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("did_money >=", value, "didMoney");
            return (Criteria) this;
        }

        public Criteria andDidMoneyLessThan(Float value) {
            addCriterion("did_money <", value, "didMoney");
            return (Criteria) this;
        }

        public Criteria andDidMoneyLessThanOrEqualTo(Float value) {
            addCriterion("did_money <=", value, "didMoney");
            return (Criteria) this;
        }

        public Criteria andDidMoneyIn(List<Float> values) {
            addCriterion("did_money in", values, "didMoney");
            return (Criteria) this;
        }

        public Criteria andDidMoneyNotIn(List<Float> values) {
            addCriterion("did_money not in", values, "didMoney");
            return (Criteria) this;
        }

        public Criteria andDidMoneyBetween(Float value1, Float value2) {
            addCriterion("did_money between", value1, value2, "didMoney");
            return (Criteria) this;
        }

        public Criteria andDidMoneyNotBetween(Float value1, Float value2) {
            addCriterion("did_money not between", value1, value2, "didMoney");
            return (Criteria) this;
        }

        public Criteria andDidTaxRateIsNull() {
            addCriterion("did_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andDidTaxRateIsNotNull() {
            addCriterion("did_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDidTaxRateEqualTo(Float value) {
            addCriterion("did_tax_rate =", value, "didTaxRate");
            return (Criteria) this;
        }

        public Criteria andDidTaxRateNotEqualTo(Float value) {
            addCriterion("did_tax_rate <>", value, "didTaxRate");
            return (Criteria) this;
        }

        public Criteria andDidTaxRateGreaterThan(Float value) {
            addCriterion("did_tax_rate >", value, "didTaxRate");
            return (Criteria) this;
        }

        public Criteria andDidTaxRateGreaterThanOrEqualTo(Float value) {
            addCriterion("did_tax_rate >=", value, "didTaxRate");
            return (Criteria) this;
        }

        public Criteria andDidTaxRateLessThan(Float value) {
            addCriterion("did_tax_rate <", value, "didTaxRate");
            return (Criteria) this;
        }

        public Criteria andDidTaxRateLessThanOrEqualTo(Float value) {
            addCriterion("did_tax_rate <=", value, "didTaxRate");
            return (Criteria) this;
        }

        public Criteria andDidTaxRateIn(List<Float> values) {
            addCriterion("did_tax_rate in", values, "didTaxRate");
            return (Criteria) this;
        }

        public Criteria andDidTaxRateNotIn(List<Float> values) {
            addCriterion("did_tax_rate not in", values, "didTaxRate");
            return (Criteria) this;
        }

        public Criteria andDidTaxRateBetween(Float value1, Float value2) {
            addCriterion("did_tax_rate between", value1, value2, "didTaxRate");
            return (Criteria) this;
        }

        public Criteria andDidTaxRateNotBetween(Float value1, Float value2) {
            addCriterion("did_tax_rate not between", value1, value2, "didTaxRate");
            return (Criteria) this;
        }

        public Criteria andDidTaxAmountIsNull() {
            addCriterion("did_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andDidTaxAmountIsNotNull() {
            addCriterion("did_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDidTaxAmountEqualTo(Float value) {
            addCriterion("did_tax_amount =", value, "didTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidTaxAmountNotEqualTo(Float value) {
            addCriterion("did_tax_amount <>", value, "didTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidTaxAmountGreaterThan(Float value) {
            addCriterion("did_tax_amount >", value, "didTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("did_tax_amount >=", value, "didTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidTaxAmountLessThan(Float value) {
            addCriterion("did_tax_amount <", value, "didTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("did_tax_amount <=", value, "didTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidTaxAmountIn(List<Float> values) {
            addCriterion("did_tax_amount in", values, "didTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidTaxAmountNotIn(List<Float> values) {
            addCriterion("did_tax_amount not in", values, "didTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidTaxAmountBetween(Float value1, Float value2) {
            addCriterion("did_tax_amount between", value1, value2, "didTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("did_tax_amount not between", value1, value2, "didTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidIncludeTaxAmountIsNull() {
            addCriterion("did_include_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andDidIncludeTaxAmountIsNotNull() {
            addCriterion("did_include_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDidIncludeTaxAmountEqualTo(Float value) {
            addCriterion("did_include_tax_amount =", value, "didIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidIncludeTaxAmountNotEqualTo(Float value) {
            addCriterion("did_include_tax_amount <>", value, "didIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidIncludeTaxAmountGreaterThan(Float value) {
            addCriterion("did_include_tax_amount >", value, "didIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidIncludeTaxAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("did_include_tax_amount >=", value, "didIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidIncludeTaxAmountLessThan(Float value) {
            addCriterion("did_include_tax_amount <", value, "didIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidIncludeTaxAmountLessThanOrEqualTo(Float value) {
            addCriterion("did_include_tax_amount <=", value, "didIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidIncludeTaxAmountIn(List<Float> values) {
            addCriterion("did_include_tax_amount in", values, "didIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidIncludeTaxAmountNotIn(List<Float> values) {
            addCriterion("did_include_tax_amount not in", values, "didIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidIncludeTaxAmountBetween(Float value1, Float value2) {
            addCriterion("did_include_tax_amount between", value1, value2, "didIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidIncludeTaxAmountNotBetween(Float value1, Float value2) {
            addCriterion("did_include_tax_amount not between", value1, value2, "didIncludeTaxAmount");
            return (Criteria) this;
        }

        public Criteria andDidIfgiftIsNull() {
            addCriterion("did_ifgift is null");
            return (Criteria) this;
        }

        public Criteria andDidIfgiftIsNotNull() {
            addCriterion("did_ifgift is not null");
            return (Criteria) this;
        }

        public Criteria andDidIfgiftEqualTo(String value) {
            addCriterion("did_ifgift =", value, "didIfgift");
            return (Criteria) this;
        }

        public Criteria andDidIfgiftNotEqualTo(String value) {
            addCriterion("did_ifgift <>", value, "didIfgift");
            return (Criteria) this;
        }

        public Criteria andDidIfgiftGreaterThan(String value) {
            addCriterion("did_ifgift >", value, "didIfgift");
            return (Criteria) this;
        }

        public Criteria andDidIfgiftGreaterThanOrEqualTo(String value) {
            addCriterion("did_ifgift >=", value, "didIfgift");
            return (Criteria) this;
        }

        public Criteria andDidIfgiftLessThan(String value) {
            addCriterion("did_ifgift <", value, "didIfgift");
            return (Criteria) this;
        }

        public Criteria andDidIfgiftLessThanOrEqualTo(String value) {
            addCriterion("did_ifgift <=", value, "didIfgift");
            return (Criteria) this;
        }

        public Criteria andDidIfgiftLike(String value) {
            addCriterion("did_ifgift like", value, "didIfgift");
            return (Criteria) this;
        }

        public Criteria andDidIfgiftNotLike(String value) {
            addCriterion("did_ifgift not like", value, "didIfgift");
            return (Criteria) this;
        }

        public Criteria andDidIfgiftIn(List<String> values) {
            addCriterion("did_ifgift in", values, "didIfgift");
            return (Criteria) this;
        }

        public Criteria andDidIfgiftNotIn(List<String> values) {
            addCriterion("did_ifgift not in", values, "didIfgift");
            return (Criteria) this;
        }

        public Criteria andDidIfgiftBetween(String value1, String value2) {
            addCriterion("did_ifgift between", value1, value2, "didIfgift");
            return (Criteria) this;
        }

        public Criteria andDidIfgiftNotBetween(String value1, String value2) {
            addCriterion("did_ifgift not between", value1, value2, "didIfgift");
            return (Criteria) this;
        }

        public Criteria andDidRemarksIsNull() {
            addCriterion("did_remarks is null");
            return (Criteria) this;
        }

        public Criteria andDidRemarksIsNotNull() {
            addCriterion("did_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andDidRemarksEqualTo(String value) {
            addCriterion("did_remarks =", value, "didRemarks");
            return (Criteria) this;
        }

        public Criteria andDidRemarksNotEqualTo(String value) {
            addCriterion("did_remarks <>", value, "didRemarks");
            return (Criteria) this;
        }

        public Criteria andDidRemarksGreaterThan(String value) {
            addCriterion("did_remarks >", value, "didRemarks");
            return (Criteria) this;
        }

        public Criteria andDidRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("did_remarks >=", value, "didRemarks");
            return (Criteria) this;
        }

        public Criteria andDidRemarksLessThan(String value) {
            addCriterion("did_remarks <", value, "didRemarks");
            return (Criteria) this;
        }

        public Criteria andDidRemarksLessThanOrEqualTo(String value) {
            addCriterion("did_remarks <=", value, "didRemarks");
            return (Criteria) this;
        }

        public Criteria andDidRemarksLike(String value) {
            addCriterion("did_remarks like", value, "didRemarks");
            return (Criteria) this;
        }

        public Criteria andDidRemarksNotLike(String value) {
            addCriterion("did_remarks not like", value, "didRemarks");
            return (Criteria) this;
        }

        public Criteria andDidRemarksIn(List<String> values) {
            addCriterion("did_remarks in", values, "didRemarks");
            return (Criteria) this;
        }

        public Criteria andDidRemarksNotIn(List<String> values) {
            addCriterion("did_remarks not in", values, "didRemarks");
            return (Criteria) this;
        }

        public Criteria andDidRemarksBetween(String value1, String value2) {
            addCriterion("did_remarks between", value1, value2, "didRemarks");
            return (Criteria) this;
        }

        public Criteria andDidRemarksNotBetween(String value1, String value2) {
            addCriterion("did_remarks not between", value1, value2, "didRemarks");
            return (Criteria) this;
        }

        public Criteria andDidSourceOrderIsNull() {
            addCriterion("did_source_order is null");
            return (Criteria) this;
        }

        public Criteria andDidSourceOrderIsNotNull() {
            addCriterion("did_source_order is not null");
            return (Criteria) this;
        }

        public Criteria andDidSourceOrderEqualTo(String value) {
            addCriterion("did_source_order =", value, "didSourceOrder");
            return (Criteria) this;
        }

        public Criteria andDidSourceOrderNotEqualTo(String value) {
            addCriterion("did_source_order <>", value, "didSourceOrder");
            return (Criteria) this;
        }

        public Criteria andDidSourceOrderGreaterThan(String value) {
            addCriterion("did_source_order >", value, "didSourceOrder");
            return (Criteria) this;
        }

        public Criteria andDidSourceOrderGreaterThanOrEqualTo(String value) {
            addCriterion("did_source_order >=", value, "didSourceOrder");
            return (Criteria) this;
        }

        public Criteria andDidSourceOrderLessThan(String value) {
            addCriterion("did_source_order <", value, "didSourceOrder");
            return (Criteria) this;
        }

        public Criteria andDidSourceOrderLessThanOrEqualTo(String value) {
            addCriterion("did_source_order <=", value, "didSourceOrder");
            return (Criteria) this;
        }

        public Criteria andDidSourceOrderLike(String value) {
            addCriterion("did_source_order like", value, "didSourceOrder");
            return (Criteria) this;
        }

        public Criteria andDidSourceOrderNotLike(String value) {
            addCriterion("did_source_order not like", value, "didSourceOrder");
            return (Criteria) this;
        }

        public Criteria andDidSourceOrderIn(List<String> values) {
            addCriterion("did_source_order in", values, "didSourceOrder");
            return (Criteria) this;
        }

        public Criteria andDidSourceOrderNotIn(List<String> values) {
            addCriterion("did_source_order not in", values, "didSourceOrder");
            return (Criteria) this;
        }

        public Criteria andDidSourceOrderBetween(String value1, String value2) {
            addCriterion("did_source_order between", value1, value2, "didSourceOrder");
            return (Criteria) this;
        }

        public Criteria andDidSourceOrderNotBetween(String value1, String value2) {
            addCriterion("did_source_order not between", value1, value2, "didSourceOrder");
            return (Criteria) this;
        }

        public Criteria andDidSourceNoIsNull() {
            addCriterion("did_source_no is null");
            return (Criteria) this;
        }

        public Criteria andDidSourceNoIsNotNull() {
            addCriterion("did_source_no is not null");
            return (Criteria) this;
        }

        public Criteria andDidSourceNoEqualTo(String value) {
            addCriterion("did_source_no =", value, "didSourceNo");
            return (Criteria) this;
        }

        public Criteria andDidSourceNoNotEqualTo(String value) {
            addCriterion("did_source_no <>", value, "didSourceNo");
            return (Criteria) this;
        }

        public Criteria andDidSourceNoGreaterThan(String value) {
            addCriterion("did_source_no >", value, "didSourceNo");
            return (Criteria) this;
        }

        public Criteria andDidSourceNoGreaterThanOrEqualTo(String value) {
            addCriterion("did_source_no >=", value, "didSourceNo");
            return (Criteria) this;
        }

        public Criteria andDidSourceNoLessThan(String value) {
            addCriterion("did_source_no <", value, "didSourceNo");
            return (Criteria) this;
        }

        public Criteria andDidSourceNoLessThanOrEqualTo(String value) {
            addCriterion("did_source_no <=", value, "didSourceNo");
            return (Criteria) this;
        }

        public Criteria andDidSourceNoLike(String value) {
            addCriterion("did_source_no like", value, "didSourceNo");
            return (Criteria) this;
        }

        public Criteria andDidSourceNoNotLike(String value) {
            addCriterion("did_source_no not like", value, "didSourceNo");
            return (Criteria) this;
        }

        public Criteria andDidSourceNoIn(List<String> values) {
            addCriterion("did_source_no in", values, "didSourceNo");
            return (Criteria) this;
        }

        public Criteria andDidSourceNoNotIn(List<String> values) {
            addCriterion("did_source_no not in", values, "didSourceNo");
            return (Criteria) this;
        }

        public Criteria andDidSourceNoBetween(String value1, String value2) {
            addCriterion("did_source_no between", value1, value2, "didSourceNo");
            return (Criteria) this;
        }

        public Criteria andDidSourceNoNotBetween(String value1, String value2) {
            addCriterion("did_source_no not between", value1, value2, "didSourceNo");
            return (Criteria) this;
        }

        public Criteria andDidAuditionIsNull() {
            addCriterion("did_audition is null");
            return (Criteria) this;
        }

        public Criteria andDidAuditionIsNotNull() {
            addCriterion("did_audition is not null");
            return (Criteria) this;
        }

        public Criteria andDidAuditionEqualTo(String value) {
            addCriterion("did_audition =", value, "didAudition");
            return (Criteria) this;
        }

        public Criteria andDidAuditionNotEqualTo(String value) {
            addCriterion("did_audition <>", value, "didAudition");
            return (Criteria) this;
        }

        public Criteria andDidAuditionGreaterThan(String value) {
            addCriterion("did_audition >", value, "didAudition");
            return (Criteria) this;
        }

        public Criteria andDidAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("did_audition >=", value, "didAudition");
            return (Criteria) this;
        }

        public Criteria andDidAuditionLessThan(String value) {
            addCriterion("did_audition <", value, "didAudition");
            return (Criteria) this;
        }

        public Criteria andDidAuditionLessThanOrEqualTo(String value) {
            addCriterion("did_audition <=", value, "didAudition");
            return (Criteria) this;
        }

        public Criteria andDidAuditionLike(String value) {
            addCriterion("did_audition like", value, "didAudition");
            return (Criteria) this;
        }

        public Criteria andDidAuditionNotLike(String value) {
            addCriterion("did_audition not like", value, "didAudition");
            return (Criteria) this;
        }

        public Criteria andDidAuditionIn(List<String> values) {
            addCriterion("did_audition in", values, "didAudition");
            return (Criteria) this;
        }

        public Criteria andDidAuditionNotIn(List<String> values) {
            addCriterion("did_audition not in", values, "didAudition");
            return (Criteria) this;
        }

        public Criteria andDidAuditionBetween(String value1, String value2) {
            addCriterion("did_audition between", value1, value2, "didAudition");
            return (Criteria) this;
        }

        public Criteria andDidAuditionNotBetween(String value1, String value2) {
            addCriterion("did_audition not between", value1, value2, "didAudition");
            return (Criteria) this;
        }

        public Criteria andDidYnIsNull() {
            addCriterion("did_yn is null");
            return (Criteria) this;
        }

        public Criteria andDidYnIsNotNull() {
            addCriterion("did_yn is not null");
            return (Criteria) this;
        }

        public Criteria andDidYnEqualTo(String value) {
            addCriterion("did_yn =", value, "didYn");
            return (Criteria) this;
        }

        public Criteria andDidYnNotEqualTo(String value) {
            addCriterion("did_yn <>", value, "didYn");
            return (Criteria) this;
        }

        public Criteria andDidYnGreaterThan(String value) {
            addCriterion("did_yn >", value, "didYn");
            return (Criteria) this;
        }

        public Criteria andDidYnGreaterThanOrEqualTo(String value) {
            addCriterion("did_yn >=", value, "didYn");
            return (Criteria) this;
        }

        public Criteria andDidYnLessThan(String value) {
            addCriterion("did_yn <", value, "didYn");
            return (Criteria) this;
        }

        public Criteria andDidYnLessThanOrEqualTo(String value) {
            addCriterion("did_yn <=", value, "didYn");
            return (Criteria) this;
        }

        public Criteria andDidYnLike(String value) {
            addCriterion("did_yn like", value, "didYn");
            return (Criteria) this;
        }

        public Criteria andDidYnNotLike(String value) {
            addCriterion("did_yn not like", value, "didYn");
            return (Criteria) this;
        }

        public Criteria andDidYnIn(List<String> values) {
            addCriterion("did_yn in", values, "didYn");
            return (Criteria) this;
        }

        public Criteria andDidYnNotIn(List<String> values) {
            addCriterion("did_yn not in", values, "didYn");
            return (Criteria) this;
        }

        public Criteria andDidYnBetween(String value1, String value2) {
            addCriterion("did_yn between", value1, value2, "didYn");
            return (Criteria) this;
        }

        public Criteria andDidYnNotBetween(String value1, String value2) {
            addCriterion("did_yn not between", value1, value2, "didYn");
            return (Criteria) this;
        }

        public Criteria andDidCustom1IsNull() {
            addCriterion("did_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andDidCustom1IsNotNull() {
            addCriterion("did_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andDidCustom1EqualTo(String value) {
            addCriterion("did_custom1 =", value, "didCustom1");
            return (Criteria) this;
        }

        public Criteria andDidCustom1NotEqualTo(String value) {
            addCriterion("did_custom1 <>", value, "didCustom1");
            return (Criteria) this;
        }

        public Criteria andDidCustom1GreaterThan(String value) {
            addCriterion("did_custom1 >", value, "didCustom1");
            return (Criteria) this;
        }

        public Criteria andDidCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("did_custom1 >=", value, "didCustom1");
            return (Criteria) this;
        }

        public Criteria andDidCustom1LessThan(String value) {
            addCriterion("did_custom1 <", value, "didCustom1");
            return (Criteria) this;
        }

        public Criteria andDidCustom1LessThanOrEqualTo(String value) {
            addCriterion("did_custom1 <=", value, "didCustom1");
            return (Criteria) this;
        }

        public Criteria andDidCustom1Like(String value) {
            addCriterion("did_custom1 like", value, "didCustom1");
            return (Criteria) this;
        }

        public Criteria andDidCustom1NotLike(String value) {
            addCriterion("did_custom1 not like", value, "didCustom1");
            return (Criteria) this;
        }

        public Criteria andDidCustom1In(List<String> values) {
            addCriterion("did_custom1 in", values, "didCustom1");
            return (Criteria) this;
        }

        public Criteria andDidCustom1NotIn(List<String> values) {
            addCriterion("did_custom1 not in", values, "didCustom1");
            return (Criteria) this;
        }

        public Criteria andDidCustom1Between(String value1, String value2) {
            addCriterion("did_custom1 between", value1, value2, "didCustom1");
            return (Criteria) this;
        }

        public Criteria andDidCustom1NotBetween(String value1, String value2) {
            addCriterion("did_custom1 not between", value1, value2, "didCustom1");
            return (Criteria) this;
        }

        public Criteria andDidCustom2IsNull() {
            addCriterion("did_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andDidCustom2IsNotNull() {
            addCriterion("did_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andDidCustom2EqualTo(String value) {
            addCriterion("did_custom2 =", value, "didCustom2");
            return (Criteria) this;
        }

        public Criteria andDidCustom2NotEqualTo(String value) {
            addCriterion("did_custom2 <>", value, "didCustom2");
            return (Criteria) this;
        }

        public Criteria andDidCustom2GreaterThan(String value) {
            addCriterion("did_custom2 >", value, "didCustom2");
            return (Criteria) this;
        }

        public Criteria andDidCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("did_custom2 >=", value, "didCustom2");
            return (Criteria) this;
        }

        public Criteria andDidCustom2LessThan(String value) {
            addCriterion("did_custom2 <", value, "didCustom2");
            return (Criteria) this;
        }

        public Criteria andDidCustom2LessThanOrEqualTo(String value) {
            addCriterion("did_custom2 <=", value, "didCustom2");
            return (Criteria) this;
        }

        public Criteria andDidCustom2Like(String value) {
            addCriterion("did_custom2 like", value, "didCustom2");
            return (Criteria) this;
        }

        public Criteria andDidCustom2NotLike(String value) {
            addCriterion("did_custom2 not like", value, "didCustom2");
            return (Criteria) this;
        }

        public Criteria andDidCustom2In(List<String> values) {
            addCriterion("did_custom2 in", values, "didCustom2");
            return (Criteria) this;
        }

        public Criteria andDidCustom2NotIn(List<String> values) {
            addCriterion("did_custom2 not in", values, "didCustom2");
            return (Criteria) this;
        }

        public Criteria andDidCustom2Between(String value1, String value2) {
            addCriterion("did_custom2 between", value1, value2, "didCustom2");
            return (Criteria) this;
        }

        public Criteria andDidCustom2NotBetween(String value1, String value2) {
            addCriterion("did_custom2 not between", value1, value2, "didCustom2");
            return (Criteria) this;
        }

        public Criteria andDidCustom3IsNull() {
            addCriterion("did_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andDidCustom3IsNotNull() {
            addCriterion("did_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andDidCustom3EqualTo(String value) {
            addCriterion("did_custom3 =", value, "didCustom3");
            return (Criteria) this;
        }

        public Criteria andDidCustom3NotEqualTo(String value) {
            addCriterion("did_custom3 <>", value, "didCustom3");
            return (Criteria) this;
        }

        public Criteria andDidCustom3GreaterThan(String value) {
            addCriterion("did_custom3 >", value, "didCustom3");
            return (Criteria) this;
        }

        public Criteria andDidCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("did_custom3 >=", value, "didCustom3");
            return (Criteria) this;
        }

        public Criteria andDidCustom3LessThan(String value) {
            addCriterion("did_custom3 <", value, "didCustom3");
            return (Criteria) this;
        }

        public Criteria andDidCustom3LessThanOrEqualTo(String value) {
            addCriterion("did_custom3 <=", value, "didCustom3");
            return (Criteria) this;
        }

        public Criteria andDidCustom3Like(String value) {
            addCriterion("did_custom3 like", value, "didCustom3");
            return (Criteria) this;
        }

        public Criteria andDidCustom3NotLike(String value) {
            addCriterion("did_custom3 not like", value, "didCustom3");
            return (Criteria) this;
        }

        public Criteria andDidCustom3In(List<String> values) {
            addCriterion("did_custom3 in", values, "didCustom3");
            return (Criteria) this;
        }

        public Criteria andDidCustom3NotIn(List<String> values) {
            addCriterion("did_custom3 not in", values, "didCustom3");
            return (Criteria) this;
        }

        public Criteria andDidCustom3Between(String value1, String value2) {
            addCriterion("did_custom3 between", value1, value2, "didCustom3");
            return (Criteria) this;
        }

        public Criteria andDidCustom3NotBetween(String value1, String value2) {
            addCriterion("did_custom3 not between", value1, value2, "didCustom3");
            return (Criteria) this;
        }

        public Criteria andDidCustom4IsNull() {
            addCriterion("did_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andDidCustom4IsNotNull() {
            addCriterion("did_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andDidCustom4EqualTo(String value) {
            addCriterion("did_custom4 =", value, "didCustom4");
            return (Criteria) this;
        }

        public Criteria andDidCustom4NotEqualTo(String value) {
            addCriterion("did_custom4 <>", value, "didCustom4");
            return (Criteria) this;
        }

        public Criteria andDidCustom4GreaterThan(String value) {
            addCriterion("did_custom4 >", value, "didCustom4");
            return (Criteria) this;
        }

        public Criteria andDidCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("did_custom4 >=", value, "didCustom4");
            return (Criteria) this;
        }

        public Criteria andDidCustom4LessThan(String value) {
            addCriterion("did_custom4 <", value, "didCustom4");
            return (Criteria) this;
        }

        public Criteria andDidCustom4LessThanOrEqualTo(String value) {
            addCriterion("did_custom4 <=", value, "didCustom4");
            return (Criteria) this;
        }

        public Criteria andDidCustom4Like(String value) {
            addCriterion("did_custom4 like", value, "didCustom4");
            return (Criteria) this;
        }

        public Criteria andDidCustom4NotLike(String value) {
            addCriterion("did_custom4 not like", value, "didCustom4");
            return (Criteria) this;
        }

        public Criteria andDidCustom4In(List<String> values) {
            addCriterion("did_custom4 in", values, "didCustom4");
            return (Criteria) this;
        }

        public Criteria andDidCustom4NotIn(List<String> values) {
            addCriterion("did_custom4 not in", values, "didCustom4");
            return (Criteria) this;
        }

        public Criteria andDidCustom4Between(String value1, String value2) {
            addCriterion("did_custom4 between", value1, value2, "didCustom4");
            return (Criteria) this;
        }

        public Criteria andDidCustom4NotBetween(String value1, String value2) {
            addCriterion("did_custom4 not between", value1, value2, "didCustom4");
            return (Criteria) this;
        }

        public Criteria andDidCustom5IsNull() {
            addCriterion("did_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andDidCustom5IsNotNull() {
            addCriterion("did_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andDidCustom5EqualTo(String value) {
            addCriterion("did_custom5 =", value, "didCustom5");
            return (Criteria) this;
        }

        public Criteria andDidCustom5NotEqualTo(String value) {
            addCriterion("did_custom5 <>", value, "didCustom5");
            return (Criteria) this;
        }

        public Criteria andDidCustom5GreaterThan(String value) {
            addCriterion("did_custom5 >", value, "didCustom5");
            return (Criteria) this;
        }

        public Criteria andDidCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("did_custom5 >=", value, "didCustom5");
            return (Criteria) this;
        }

        public Criteria andDidCustom5LessThan(String value) {
            addCriterion("did_custom5 <", value, "didCustom5");
            return (Criteria) this;
        }

        public Criteria andDidCustom5LessThanOrEqualTo(String value) {
            addCriterion("did_custom5 <=", value, "didCustom5");
            return (Criteria) this;
        }

        public Criteria andDidCustom5Like(String value) {
            addCriterion("did_custom5 like", value, "didCustom5");
            return (Criteria) this;
        }

        public Criteria andDidCustom5NotLike(String value) {
            addCriterion("did_custom5 not like", value, "didCustom5");
            return (Criteria) this;
        }

        public Criteria andDidCustom5In(List<String> values) {
            addCriterion("did_custom5 in", values, "didCustom5");
            return (Criteria) this;
        }

        public Criteria andDidCustom5NotIn(List<String> values) {
            addCriterion("did_custom5 not in", values, "didCustom5");
            return (Criteria) this;
        }

        public Criteria andDidCustom5Between(String value1, String value2) {
            addCriterion("did_custom5 between", value1, value2, "didCustom5");
            return (Criteria) this;
        }

        public Criteria andDidCustom5NotBetween(String value1, String value2) {
            addCriterion("did_custom5 not between", value1, value2, "didCustom5");
            return (Criteria) this;
        }

        public Criteria andDidCustom6IsNull() {
            addCriterion("did_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andDidCustom6IsNotNull() {
            addCriterion("did_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andDidCustom6EqualTo(String value) {
            addCriterion("did_custom6 =", value, "didCustom6");
            return (Criteria) this;
        }

        public Criteria andDidCustom6NotEqualTo(String value) {
            addCriterion("did_custom6 <>", value, "didCustom6");
            return (Criteria) this;
        }

        public Criteria andDidCustom6GreaterThan(String value) {
            addCriterion("did_custom6 >", value, "didCustom6");
            return (Criteria) this;
        }

        public Criteria andDidCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("did_custom6 >=", value, "didCustom6");
            return (Criteria) this;
        }

        public Criteria andDidCustom6LessThan(String value) {
            addCriterion("did_custom6 <", value, "didCustom6");
            return (Criteria) this;
        }

        public Criteria andDidCustom6LessThanOrEqualTo(String value) {
            addCriterion("did_custom6 <=", value, "didCustom6");
            return (Criteria) this;
        }

        public Criteria andDidCustom6Like(String value) {
            addCriterion("did_custom6 like", value, "didCustom6");
            return (Criteria) this;
        }

        public Criteria andDidCustom6NotLike(String value) {
            addCriterion("did_custom6 not like", value, "didCustom6");
            return (Criteria) this;
        }

        public Criteria andDidCustom6In(List<String> values) {
            addCriterion("did_custom6 in", values, "didCustom6");
            return (Criteria) this;
        }

        public Criteria andDidCustom6NotIn(List<String> values) {
            addCriterion("did_custom6 not in", values, "didCustom6");
            return (Criteria) this;
        }

        public Criteria andDidCustom6Between(String value1, String value2) {
            addCriterion("did_custom6 between", value1, value2, "didCustom6");
            return (Criteria) this;
        }

        public Criteria andDidCustom6NotBetween(String value1, String value2) {
            addCriterion("did_custom6 not between", value1, value2, "didCustom6");
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