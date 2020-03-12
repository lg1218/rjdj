package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class OtherInputStorageDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OtherInputStorageDetailedExample() {
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

        public Criteria andOisdIdIsNull() {
            addCriterion("oisd_id is null");
            return (Criteria) this;
        }

        public Criteria andOisdIdIsNotNull() {
            addCriterion("oisd_id is not null");
            return (Criteria) this;
        }

        public Criteria andOisdIdEqualTo(String value) {
            addCriterion("oisd_id =", value, "oisdId");
            return (Criteria) this;
        }

        public Criteria andOisdIdNotEqualTo(String value) {
            addCriterion("oisd_id <>", value, "oisdId");
            return (Criteria) this;
        }

        public Criteria andOisdIdGreaterThan(String value) {
            addCriterion("oisd_id >", value, "oisdId");
            return (Criteria) this;
        }

        public Criteria andOisdIdGreaterThanOrEqualTo(String value) {
            addCriterion("oisd_id >=", value, "oisdId");
            return (Criteria) this;
        }

        public Criteria andOisdIdLessThan(String value) {
            addCriterion("oisd_id <", value, "oisdId");
            return (Criteria) this;
        }

        public Criteria andOisdIdLessThanOrEqualTo(String value) {
            addCriterion("oisd_id <=", value, "oisdId");
            return (Criteria) this;
        }

        public Criteria andOisdIdLike(String value) {
            addCriterion("oisd_id like", value, "oisdId");
            return (Criteria) this;
        }

        public Criteria andOisdIdNotLike(String value) {
            addCriterion("oisd_id not like", value, "oisdId");
            return (Criteria) this;
        }

        public Criteria andOisdIdIn(List<String> values) {
            addCriterion("oisd_id in", values, "oisdId");
            return (Criteria) this;
        }

        public Criteria andOisdIdNotIn(List<String> values) {
            addCriterion("oisd_id not in", values, "oisdId");
            return (Criteria) this;
        }

        public Criteria andOisdIdBetween(String value1, String value2) {
            addCriterion("oisd_id between", value1, value2, "oisdId");
            return (Criteria) this;
        }

        public Criteria andOisdIdNotBetween(String value1, String value2) {
            addCriterion("oisd_id not between", value1, value2, "oisdId");
            return (Criteria) this;
        }

        public Criteria andOisIdIsNull() {
            addCriterion("ois_id is null");
            return (Criteria) this;
        }

        public Criteria andOisIdIsNotNull() {
            addCriterion("ois_id is not null");
            return (Criteria) this;
        }

        public Criteria andOisIdEqualTo(String value) {
            addCriterion("ois_id =", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdNotEqualTo(String value) {
            addCriterion("ois_id <>", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdGreaterThan(String value) {
            addCriterion("ois_id >", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdGreaterThanOrEqualTo(String value) {
            addCriterion("ois_id >=", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdLessThan(String value) {
            addCriterion("ois_id <", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdLessThanOrEqualTo(String value) {
            addCriterion("ois_id <=", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdLike(String value) {
            addCriterion("ois_id like", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdNotLike(String value) {
            addCriterion("ois_id not like", value, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdIn(List<String> values) {
            addCriterion("ois_id in", values, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdNotIn(List<String> values) {
            addCriterion("ois_id not in", values, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdBetween(String value1, String value2) {
            addCriterion("ois_id between", value1, value2, "oisId");
            return (Criteria) this;
        }

        public Criteria andOisIdNotBetween(String value1, String value2) {
            addCriterion("ois_id not between", value1, value2, "oisId");
            return (Criteria) this;
        }

        public Criteria andMatterIdIsNull() {
            addCriterion("matter_id is null");
            return (Criteria) this;
        }

        public Criteria andMatterIdIsNotNull() {
            addCriterion("matter_id is not null");
            return (Criteria) this;
        }

        public Criteria andMatterIdEqualTo(String value) {
            addCriterion("matter_id =", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotEqualTo(String value) {
            addCriterion("matter_id <>", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdGreaterThan(String value) {
            addCriterion("matter_id >", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdGreaterThanOrEqualTo(String value) {
            addCriterion("matter_id >=", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLessThan(String value) {
            addCriterion("matter_id <", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLessThanOrEqualTo(String value) {
            addCriterion("matter_id <=", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLike(String value) {
            addCriterion("matter_id like", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotLike(String value) {
            addCriterion("matter_id not like", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdIn(List<String> values) {
            addCriterion("matter_id in", values, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotIn(List<String> values) {
            addCriterion("matter_id not in", values, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdBetween(String value1, String value2) {
            addCriterion("matter_id between", value1, value2, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotBetween(String value1, String value2) {
            addCriterion("matter_id not between", value1, value2, "matterId");
            return (Criteria) this;
        }

        public Criteria andOisdEngnameIsNull() {
            addCriterion("oisd_engname is null");
            return (Criteria) this;
        }

        public Criteria andOisdEngnameIsNotNull() {
            addCriterion("oisd_engname is not null");
            return (Criteria) this;
        }

        public Criteria andOisdEngnameEqualTo(String value) {
            addCriterion("oisd_engname =", value, "oisdEngname");
            return (Criteria) this;
        }

        public Criteria andOisdEngnameNotEqualTo(String value) {
            addCriterion("oisd_engname <>", value, "oisdEngname");
            return (Criteria) this;
        }

        public Criteria andOisdEngnameGreaterThan(String value) {
            addCriterion("oisd_engname >", value, "oisdEngname");
            return (Criteria) this;
        }

        public Criteria andOisdEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("oisd_engname >=", value, "oisdEngname");
            return (Criteria) this;
        }

        public Criteria andOisdEngnameLessThan(String value) {
            addCriterion("oisd_engname <", value, "oisdEngname");
            return (Criteria) this;
        }

        public Criteria andOisdEngnameLessThanOrEqualTo(String value) {
            addCriterion("oisd_engname <=", value, "oisdEngname");
            return (Criteria) this;
        }

        public Criteria andOisdEngnameLike(String value) {
            addCriterion("oisd_engname like", value, "oisdEngname");
            return (Criteria) this;
        }

        public Criteria andOisdEngnameNotLike(String value) {
            addCriterion("oisd_engname not like", value, "oisdEngname");
            return (Criteria) this;
        }

        public Criteria andOisdEngnameIn(List<String> values) {
            addCriterion("oisd_engname in", values, "oisdEngname");
            return (Criteria) this;
        }

        public Criteria andOisdEngnameNotIn(List<String> values) {
            addCriterion("oisd_engname not in", values, "oisdEngname");
            return (Criteria) this;
        }

        public Criteria andOisdEngnameBetween(String value1, String value2) {
            addCriterion("oisd_engname between", value1, value2, "oisdEngname");
            return (Criteria) this;
        }

        public Criteria andOisdEngnameNotBetween(String value1, String value2) {
            addCriterion("oisd_engname not between", value1, value2, "oisdEngname");
            return (Criteria) this;
        }

        public Criteria andOisdRemarkIsNull() {
            addCriterion("oisd_remark is null");
            return (Criteria) this;
        }

        public Criteria andOisdRemarkIsNotNull() {
            addCriterion("oisd_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOisdRemarkEqualTo(String value) {
            addCriterion("oisd_remark =", value, "oisdRemark");
            return (Criteria) this;
        }

        public Criteria andOisdRemarkNotEqualTo(String value) {
            addCriterion("oisd_remark <>", value, "oisdRemark");
            return (Criteria) this;
        }

        public Criteria andOisdRemarkGreaterThan(String value) {
            addCriterion("oisd_remark >", value, "oisdRemark");
            return (Criteria) this;
        }

        public Criteria andOisdRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("oisd_remark >=", value, "oisdRemark");
            return (Criteria) this;
        }

        public Criteria andOisdRemarkLessThan(String value) {
            addCriterion("oisd_remark <", value, "oisdRemark");
            return (Criteria) this;
        }

        public Criteria andOisdRemarkLessThanOrEqualTo(String value) {
            addCriterion("oisd_remark <=", value, "oisdRemark");
            return (Criteria) this;
        }

        public Criteria andOisdRemarkLike(String value) {
            addCriterion("oisd_remark like", value, "oisdRemark");
            return (Criteria) this;
        }

        public Criteria andOisdRemarkNotLike(String value) {
            addCriterion("oisd_remark not like", value, "oisdRemark");
            return (Criteria) this;
        }

        public Criteria andOisdRemarkIn(List<String> values) {
            addCriterion("oisd_remark in", values, "oisdRemark");
            return (Criteria) this;
        }

        public Criteria andOisdRemarkNotIn(List<String> values) {
            addCriterion("oisd_remark not in", values, "oisdRemark");
            return (Criteria) this;
        }

        public Criteria andOisdRemarkBetween(String value1, String value2) {
            addCriterion("oisd_remark between", value1, value2, "oisdRemark");
            return (Criteria) this;
        }

        public Criteria andOisdRemarkNotBetween(String value1, String value2) {
            addCriterion("oisd_remark not between", value1, value2, "oisdRemark");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIncludeTaxIsNull() {
            addCriterion("oisd_price_include_tax is null");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIncludeTaxIsNotNull() {
            addCriterion("oisd_price_include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIncludeTaxEqualTo(String value) {
            addCriterion("oisd_price_include_tax =", value, "oisdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIncludeTaxNotEqualTo(String value) {
            addCriterion("oisd_price_include_tax <>", value, "oisdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIncludeTaxGreaterThan(String value) {
            addCriterion("oisd_price_include_tax >", value, "oisdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("oisd_price_include_tax >=", value, "oisdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIncludeTaxLessThan(String value) {
            addCriterion("oisd_price_include_tax <", value, "oisdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("oisd_price_include_tax <=", value, "oisdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIncludeTaxLike(String value) {
            addCriterion("oisd_price_include_tax like", value, "oisdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIncludeTaxNotLike(String value) {
            addCriterion("oisd_price_include_tax not like", value, "oisdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIncludeTaxIn(List<String> values) {
            addCriterion("oisd_price_include_tax in", values, "oisdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIncludeTaxNotIn(List<String> values) {
            addCriterion("oisd_price_include_tax not in", values, "oisdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIncludeTaxBetween(String value1, String value2) {
            addCriterion("oisd_price_include_tax between", value1, value2, "oisdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("oisd_price_include_tax not between", value1, value2, "oisdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOisdSingleStatusIsNull() {
            addCriterion("oisd_single_status is null");
            return (Criteria) this;
        }

        public Criteria andOisdSingleStatusIsNotNull() {
            addCriterion("oisd_single_status is not null");
            return (Criteria) this;
        }

        public Criteria andOisdSingleStatusEqualTo(Integer value) {
            addCriterion("oisd_single_status =", value, "oisdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOisdSingleStatusNotEqualTo(Integer value) {
            addCriterion("oisd_single_status <>", value, "oisdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOisdSingleStatusGreaterThan(Integer value) {
            addCriterion("oisd_single_status >", value, "oisdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOisdSingleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("oisd_single_status >=", value, "oisdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOisdSingleStatusLessThan(Integer value) {
            addCriterion("oisd_single_status <", value, "oisdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOisdSingleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("oisd_single_status <=", value, "oisdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOisdSingleStatusIn(List<Integer> values) {
            addCriterion("oisd_single_status in", values, "oisdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOisdSingleStatusNotIn(List<Integer> values) {
            addCriterion("oisd_single_status not in", values, "oisdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOisdSingleStatusBetween(Integer value1, Integer value2) {
            addCriterion("oisd_single_status between", value1, value2, "oisdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOisdSingleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("oisd_single_status not between", value1, value2, "oisdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIsNull() {
            addCriterion("oisd_price is null");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIsNotNull() {
            addCriterion("oisd_price is not null");
            return (Criteria) this;
        }

        public Criteria andOisdPriceEqualTo(Float value) {
            addCriterion("oisd_price =", value, "oisdPrice");
            return (Criteria) this;
        }

        public Criteria andOisdPriceNotEqualTo(Float value) {
            addCriterion("oisd_price <>", value, "oisdPrice");
            return (Criteria) this;
        }

        public Criteria andOisdPriceGreaterThan(Float value) {
            addCriterion("oisd_price >", value, "oisdPrice");
            return (Criteria) this;
        }

        public Criteria andOisdPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("oisd_price >=", value, "oisdPrice");
            return (Criteria) this;
        }

        public Criteria andOisdPriceLessThan(Float value) {
            addCriterion("oisd_price <", value, "oisdPrice");
            return (Criteria) this;
        }

        public Criteria andOisdPriceLessThanOrEqualTo(Float value) {
            addCriterion("oisd_price <=", value, "oisdPrice");
            return (Criteria) this;
        }

        public Criteria andOisdPriceIn(List<Float> values) {
            addCriterion("oisd_price in", values, "oisdPrice");
            return (Criteria) this;
        }

        public Criteria andOisdPriceNotIn(List<Float> values) {
            addCriterion("oisd_price not in", values, "oisdPrice");
            return (Criteria) this;
        }

        public Criteria andOisdPriceBetween(Float value1, Float value2) {
            addCriterion("oisd_price between", value1, value2, "oisdPrice");
            return (Criteria) this;
        }

        public Criteria andOisdPriceNotBetween(Float value1, Float value2) {
            addCriterion("oisd_price not between", value1, value2, "oisdPrice");
            return (Criteria) this;
        }

        public Criteria andOisdMoneyIsNull() {
            addCriterion("oisd_money is null");
            return (Criteria) this;
        }

        public Criteria andOisdMoneyIsNotNull() {
            addCriterion("oisd_money is not null");
            return (Criteria) this;
        }

        public Criteria andOisdMoneyEqualTo(Float value) {
            addCriterion("oisd_money =", value, "oisdMoney");
            return (Criteria) this;
        }

        public Criteria andOisdMoneyNotEqualTo(Float value) {
            addCriterion("oisd_money <>", value, "oisdMoney");
            return (Criteria) this;
        }

        public Criteria andOisdMoneyGreaterThan(Float value) {
            addCriterion("oisd_money >", value, "oisdMoney");
            return (Criteria) this;
        }

        public Criteria andOisdMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("oisd_money >=", value, "oisdMoney");
            return (Criteria) this;
        }

        public Criteria andOisdMoneyLessThan(Float value) {
            addCriterion("oisd_money <", value, "oisdMoney");
            return (Criteria) this;
        }

        public Criteria andOisdMoneyLessThanOrEqualTo(Float value) {
            addCriterion("oisd_money <=", value, "oisdMoney");
            return (Criteria) this;
        }

        public Criteria andOisdMoneyIn(List<Float> values) {
            addCriterion("oisd_money in", values, "oisdMoney");
            return (Criteria) this;
        }

        public Criteria andOisdMoneyNotIn(List<Float> values) {
            addCriterion("oisd_money not in", values, "oisdMoney");
            return (Criteria) this;
        }

        public Criteria andOisdMoneyBetween(Float value1, Float value2) {
            addCriterion("oisd_money between", value1, value2, "oisdMoney");
            return (Criteria) this;
        }

        public Criteria andOisdMoneyNotBetween(Float value1, Float value2) {
            addCriterion("oisd_money not between", value1, value2, "oisdMoney");
            return (Criteria) this;
        }

        public Criteria andOisdRemarksIsNull() {
            addCriterion("oisd_remarks is null");
            return (Criteria) this;
        }

        public Criteria andOisdRemarksIsNotNull() {
            addCriterion("oisd_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andOisdRemarksEqualTo(String value) {
            addCriterion("oisd_remarks =", value, "oisdRemarks");
            return (Criteria) this;
        }

        public Criteria andOisdRemarksNotEqualTo(String value) {
            addCriterion("oisd_remarks <>", value, "oisdRemarks");
            return (Criteria) this;
        }

        public Criteria andOisdRemarksGreaterThan(String value) {
            addCriterion("oisd_remarks >", value, "oisdRemarks");
            return (Criteria) this;
        }

        public Criteria andOisdRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("oisd_remarks >=", value, "oisdRemarks");
            return (Criteria) this;
        }

        public Criteria andOisdRemarksLessThan(String value) {
            addCriterion("oisd_remarks <", value, "oisdRemarks");
            return (Criteria) this;
        }

        public Criteria andOisdRemarksLessThanOrEqualTo(String value) {
            addCriterion("oisd_remarks <=", value, "oisdRemarks");
            return (Criteria) this;
        }

        public Criteria andOisdRemarksLike(String value) {
            addCriterion("oisd_remarks like", value, "oisdRemarks");
            return (Criteria) this;
        }

        public Criteria andOisdRemarksNotLike(String value) {
            addCriterion("oisd_remarks not like", value, "oisdRemarks");
            return (Criteria) this;
        }

        public Criteria andOisdRemarksIn(List<String> values) {
            addCriterion("oisd_remarks in", values, "oisdRemarks");
            return (Criteria) this;
        }

        public Criteria andOisdRemarksNotIn(List<String> values) {
            addCriterion("oisd_remarks not in", values, "oisdRemarks");
            return (Criteria) this;
        }

        public Criteria andOisdRemarksBetween(String value1, String value2) {
            addCriterion("oisd_remarks between", value1, value2, "oisdRemarks");
            return (Criteria) this;
        }

        public Criteria andOisdRemarksNotBetween(String value1, String value2) {
            addCriterion("oisd_remarks not between", value1, value2, "oisdRemarks");
            return (Criteria) this;
        }

        public Criteria andOisdSourceOrderIsNull() {
            addCriterion("oisd_source_order is null");
            return (Criteria) this;
        }

        public Criteria andOisdSourceOrderIsNotNull() {
            addCriterion("oisd_source_order is not null");
            return (Criteria) this;
        }

        public Criteria andOisdSourceOrderEqualTo(String value) {
            addCriterion("oisd_source_order =", value, "oisdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOisdSourceOrderNotEqualTo(String value) {
            addCriterion("oisd_source_order <>", value, "oisdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOisdSourceOrderGreaterThan(String value) {
            addCriterion("oisd_source_order >", value, "oisdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOisdSourceOrderGreaterThanOrEqualTo(String value) {
            addCriterion("oisd_source_order >=", value, "oisdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOisdSourceOrderLessThan(String value) {
            addCriterion("oisd_source_order <", value, "oisdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOisdSourceOrderLessThanOrEqualTo(String value) {
            addCriterion("oisd_source_order <=", value, "oisdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOisdSourceOrderLike(String value) {
            addCriterion("oisd_source_order like", value, "oisdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOisdSourceOrderNotLike(String value) {
            addCriterion("oisd_source_order not like", value, "oisdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOisdSourceOrderIn(List<String> values) {
            addCriterion("oisd_source_order in", values, "oisdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOisdSourceOrderNotIn(List<String> values) {
            addCriterion("oisd_source_order not in", values, "oisdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOisdSourceOrderBetween(String value1, String value2) {
            addCriterion("oisd_source_order between", value1, value2, "oisdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOisdSourceOrderNotBetween(String value1, String value2) {
            addCriterion("oisd_source_order not between", value1, value2, "oisdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOisdSourceNoIsNull() {
            addCriterion("oisd_source_no is null");
            return (Criteria) this;
        }

        public Criteria andOisdSourceNoIsNotNull() {
            addCriterion("oisd_source_no is not null");
            return (Criteria) this;
        }

        public Criteria andOisdSourceNoEqualTo(String value) {
            addCriterion("oisd_source_no =", value, "oisdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOisdSourceNoNotEqualTo(String value) {
            addCriterion("oisd_source_no <>", value, "oisdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOisdSourceNoGreaterThan(String value) {
            addCriterion("oisd_source_no >", value, "oisdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOisdSourceNoGreaterThanOrEqualTo(String value) {
            addCriterion("oisd_source_no >=", value, "oisdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOisdSourceNoLessThan(String value) {
            addCriterion("oisd_source_no <", value, "oisdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOisdSourceNoLessThanOrEqualTo(String value) {
            addCriterion("oisd_source_no <=", value, "oisdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOisdSourceNoLike(String value) {
            addCriterion("oisd_source_no like", value, "oisdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOisdSourceNoNotLike(String value) {
            addCriterion("oisd_source_no not like", value, "oisdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOisdSourceNoIn(List<String> values) {
            addCriterion("oisd_source_no in", values, "oisdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOisdSourceNoNotIn(List<String> values) {
            addCriterion("oisd_source_no not in", values, "oisdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOisdSourceNoBetween(String value1, String value2) {
            addCriterion("oisd_source_no between", value1, value2, "oisdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOisdSourceNoNotBetween(String value1, String value2) {
            addCriterion("oisd_source_no not between", value1, value2, "oisdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOisdAuditingIsNull() {
            addCriterion("oisd_auditing is null");
            return (Criteria) this;
        }

        public Criteria andOisdAuditingIsNotNull() {
            addCriterion("oisd_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andOisdAuditingEqualTo(String value) {
            addCriterion("oisd_auditing =", value, "oisdAuditing");
            return (Criteria) this;
        }

        public Criteria andOisdAuditingNotEqualTo(String value) {
            addCriterion("oisd_auditing <>", value, "oisdAuditing");
            return (Criteria) this;
        }

        public Criteria andOisdAuditingGreaterThan(String value) {
            addCriterion("oisd_auditing >", value, "oisdAuditing");
            return (Criteria) this;
        }

        public Criteria andOisdAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("oisd_auditing >=", value, "oisdAuditing");
            return (Criteria) this;
        }

        public Criteria andOisdAuditingLessThan(String value) {
            addCriterion("oisd_auditing <", value, "oisdAuditing");
            return (Criteria) this;
        }

        public Criteria andOisdAuditingLessThanOrEqualTo(String value) {
            addCriterion("oisd_auditing <=", value, "oisdAuditing");
            return (Criteria) this;
        }

        public Criteria andOisdAuditingLike(String value) {
            addCriterion("oisd_auditing like", value, "oisdAuditing");
            return (Criteria) this;
        }

        public Criteria andOisdAuditingNotLike(String value) {
            addCriterion("oisd_auditing not like", value, "oisdAuditing");
            return (Criteria) this;
        }

        public Criteria andOisdAuditingIn(List<String> values) {
            addCriterion("oisd_auditing in", values, "oisdAuditing");
            return (Criteria) this;
        }

        public Criteria andOisdAuditingNotIn(List<String> values) {
            addCriterion("oisd_auditing not in", values, "oisdAuditing");
            return (Criteria) this;
        }

        public Criteria andOisdAuditingBetween(String value1, String value2) {
            addCriterion("oisd_auditing between", value1, value2, "oisdAuditing");
            return (Criteria) this;
        }

        public Criteria andOisdAuditingNotBetween(String value1, String value2) {
            addCriterion("oisd_auditing not between", value1, value2, "oisdAuditing");
            return (Criteria) this;
        }

        public Criteria andOisdYnIsNull() {
            addCriterion("oisd_yn is null");
            return (Criteria) this;
        }

        public Criteria andOisdYnIsNotNull() {
            addCriterion("oisd_yn is not null");
            return (Criteria) this;
        }

        public Criteria andOisdYnEqualTo(String value) {
            addCriterion("oisd_yn =", value, "oisdYn");
            return (Criteria) this;
        }

        public Criteria andOisdYnNotEqualTo(String value) {
            addCriterion("oisd_yn <>", value, "oisdYn");
            return (Criteria) this;
        }

        public Criteria andOisdYnGreaterThan(String value) {
            addCriterion("oisd_yn >", value, "oisdYn");
            return (Criteria) this;
        }

        public Criteria andOisdYnGreaterThanOrEqualTo(String value) {
            addCriterion("oisd_yn >=", value, "oisdYn");
            return (Criteria) this;
        }

        public Criteria andOisdYnLessThan(String value) {
            addCriterion("oisd_yn <", value, "oisdYn");
            return (Criteria) this;
        }

        public Criteria andOisdYnLessThanOrEqualTo(String value) {
            addCriterion("oisd_yn <=", value, "oisdYn");
            return (Criteria) this;
        }

        public Criteria andOisdYnLike(String value) {
            addCriterion("oisd_yn like", value, "oisdYn");
            return (Criteria) this;
        }

        public Criteria andOisdYnNotLike(String value) {
            addCriterion("oisd_yn not like", value, "oisdYn");
            return (Criteria) this;
        }

        public Criteria andOisdYnIn(List<String> values) {
            addCriterion("oisd_yn in", values, "oisdYn");
            return (Criteria) this;
        }

        public Criteria andOisdYnNotIn(List<String> values) {
            addCriterion("oisd_yn not in", values, "oisdYn");
            return (Criteria) this;
        }

        public Criteria andOisdYnBetween(String value1, String value2) {
            addCriterion("oisd_yn between", value1, value2, "oisdYn");
            return (Criteria) this;
        }

        public Criteria andOisdYnNotBetween(String value1, String value2) {
            addCriterion("oisd_yn not between", value1, value2, "oisdYn");
            return (Criteria) this;
        }

        public Criteria andOisdCustom1IsNull() {
            addCriterion("oisd_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andOisdCustom1IsNotNull() {
            addCriterion("oisd_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andOisdCustom1EqualTo(String value) {
            addCriterion("oisd_custom1 =", value, "oisdCustom1");
            return (Criteria) this;
        }

        public Criteria andOisdCustom1NotEqualTo(String value) {
            addCriterion("oisd_custom1 <>", value, "oisdCustom1");
            return (Criteria) this;
        }

        public Criteria andOisdCustom1GreaterThan(String value) {
            addCriterion("oisd_custom1 >", value, "oisdCustom1");
            return (Criteria) this;
        }

        public Criteria andOisdCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("oisd_custom1 >=", value, "oisdCustom1");
            return (Criteria) this;
        }

        public Criteria andOisdCustom1LessThan(String value) {
            addCriterion("oisd_custom1 <", value, "oisdCustom1");
            return (Criteria) this;
        }

        public Criteria andOisdCustom1LessThanOrEqualTo(String value) {
            addCriterion("oisd_custom1 <=", value, "oisdCustom1");
            return (Criteria) this;
        }

        public Criteria andOisdCustom1Like(String value) {
            addCriterion("oisd_custom1 like", value, "oisdCustom1");
            return (Criteria) this;
        }

        public Criteria andOisdCustom1NotLike(String value) {
            addCriterion("oisd_custom1 not like", value, "oisdCustom1");
            return (Criteria) this;
        }

        public Criteria andOisdCustom1In(List<String> values) {
            addCriterion("oisd_custom1 in", values, "oisdCustom1");
            return (Criteria) this;
        }

        public Criteria andOisdCustom1NotIn(List<String> values) {
            addCriterion("oisd_custom1 not in", values, "oisdCustom1");
            return (Criteria) this;
        }

        public Criteria andOisdCustom1Between(String value1, String value2) {
            addCriterion("oisd_custom1 between", value1, value2, "oisdCustom1");
            return (Criteria) this;
        }

        public Criteria andOisdCustom1NotBetween(String value1, String value2) {
            addCriterion("oisd_custom1 not between", value1, value2, "oisdCustom1");
            return (Criteria) this;
        }

        public Criteria andOisdCustom2IsNull() {
            addCriterion("oisd_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andOisdCustom2IsNotNull() {
            addCriterion("oisd_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andOisdCustom2EqualTo(String value) {
            addCriterion("oisd_custom2 =", value, "oisdCustom2");
            return (Criteria) this;
        }

        public Criteria andOisdCustom2NotEqualTo(String value) {
            addCriterion("oisd_custom2 <>", value, "oisdCustom2");
            return (Criteria) this;
        }

        public Criteria andOisdCustom2GreaterThan(String value) {
            addCriterion("oisd_custom2 >", value, "oisdCustom2");
            return (Criteria) this;
        }

        public Criteria andOisdCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("oisd_custom2 >=", value, "oisdCustom2");
            return (Criteria) this;
        }

        public Criteria andOisdCustom2LessThan(String value) {
            addCriterion("oisd_custom2 <", value, "oisdCustom2");
            return (Criteria) this;
        }

        public Criteria andOisdCustom2LessThanOrEqualTo(String value) {
            addCriterion("oisd_custom2 <=", value, "oisdCustom2");
            return (Criteria) this;
        }

        public Criteria andOisdCustom2Like(String value) {
            addCriterion("oisd_custom2 like", value, "oisdCustom2");
            return (Criteria) this;
        }

        public Criteria andOisdCustom2NotLike(String value) {
            addCriterion("oisd_custom2 not like", value, "oisdCustom2");
            return (Criteria) this;
        }

        public Criteria andOisdCustom2In(List<String> values) {
            addCriterion("oisd_custom2 in", values, "oisdCustom2");
            return (Criteria) this;
        }

        public Criteria andOisdCustom2NotIn(List<String> values) {
            addCriterion("oisd_custom2 not in", values, "oisdCustom2");
            return (Criteria) this;
        }

        public Criteria andOisdCustom2Between(String value1, String value2) {
            addCriterion("oisd_custom2 between", value1, value2, "oisdCustom2");
            return (Criteria) this;
        }

        public Criteria andOisdCustom2NotBetween(String value1, String value2) {
            addCriterion("oisd_custom2 not between", value1, value2, "oisdCustom2");
            return (Criteria) this;
        }

        public Criteria andOisdCustom3IsNull() {
            addCriterion("oisd_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andOisdCustom3IsNotNull() {
            addCriterion("oisd_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andOisdCustom3EqualTo(String value) {
            addCriterion("oisd_custom3 =", value, "oisdCustom3");
            return (Criteria) this;
        }

        public Criteria andOisdCustom3NotEqualTo(String value) {
            addCriterion("oisd_custom3 <>", value, "oisdCustom3");
            return (Criteria) this;
        }

        public Criteria andOisdCustom3GreaterThan(String value) {
            addCriterion("oisd_custom3 >", value, "oisdCustom3");
            return (Criteria) this;
        }

        public Criteria andOisdCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("oisd_custom3 >=", value, "oisdCustom3");
            return (Criteria) this;
        }

        public Criteria andOisdCustom3LessThan(String value) {
            addCriterion("oisd_custom3 <", value, "oisdCustom3");
            return (Criteria) this;
        }

        public Criteria andOisdCustom3LessThanOrEqualTo(String value) {
            addCriterion("oisd_custom3 <=", value, "oisdCustom3");
            return (Criteria) this;
        }

        public Criteria andOisdCustom3Like(String value) {
            addCriterion("oisd_custom3 like", value, "oisdCustom3");
            return (Criteria) this;
        }

        public Criteria andOisdCustom3NotLike(String value) {
            addCriterion("oisd_custom3 not like", value, "oisdCustom3");
            return (Criteria) this;
        }

        public Criteria andOisdCustom3In(List<String> values) {
            addCriterion("oisd_custom3 in", values, "oisdCustom3");
            return (Criteria) this;
        }

        public Criteria andOisdCustom3NotIn(List<String> values) {
            addCriterion("oisd_custom3 not in", values, "oisdCustom3");
            return (Criteria) this;
        }

        public Criteria andOisdCustom3Between(String value1, String value2) {
            addCriterion("oisd_custom3 between", value1, value2, "oisdCustom3");
            return (Criteria) this;
        }

        public Criteria andOisdCustom3NotBetween(String value1, String value2) {
            addCriterion("oisd_custom3 not between", value1, value2, "oisdCustom3");
            return (Criteria) this;
        }

        public Criteria andOisdCustom4IsNull() {
            addCriterion("oisd_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andOisdCustom4IsNotNull() {
            addCriterion("oisd_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andOisdCustom4EqualTo(String value) {
            addCriterion("oisd_custom4 =", value, "oisdCustom4");
            return (Criteria) this;
        }

        public Criteria andOisdCustom4NotEqualTo(String value) {
            addCriterion("oisd_custom4 <>", value, "oisdCustom4");
            return (Criteria) this;
        }

        public Criteria andOisdCustom4GreaterThan(String value) {
            addCriterion("oisd_custom4 >", value, "oisdCustom4");
            return (Criteria) this;
        }

        public Criteria andOisdCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("oisd_custom4 >=", value, "oisdCustom4");
            return (Criteria) this;
        }

        public Criteria andOisdCustom4LessThan(String value) {
            addCriterion("oisd_custom4 <", value, "oisdCustom4");
            return (Criteria) this;
        }

        public Criteria andOisdCustom4LessThanOrEqualTo(String value) {
            addCriterion("oisd_custom4 <=", value, "oisdCustom4");
            return (Criteria) this;
        }

        public Criteria andOisdCustom4Like(String value) {
            addCriterion("oisd_custom4 like", value, "oisdCustom4");
            return (Criteria) this;
        }

        public Criteria andOisdCustom4NotLike(String value) {
            addCriterion("oisd_custom4 not like", value, "oisdCustom4");
            return (Criteria) this;
        }

        public Criteria andOisdCustom4In(List<String> values) {
            addCriterion("oisd_custom4 in", values, "oisdCustom4");
            return (Criteria) this;
        }

        public Criteria andOisdCustom4NotIn(List<String> values) {
            addCriterion("oisd_custom4 not in", values, "oisdCustom4");
            return (Criteria) this;
        }

        public Criteria andOisdCustom4Between(String value1, String value2) {
            addCriterion("oisd_custom4 between", value1, value2, "oisdCustom4");
            return (Criteria) this;
        }

        public Criteria andOisdCustom4NotBetween(String value1, String value2) {
            addCriterion("oisd_custom4 not between", value1, value2, "oisdCustom4");
            return (Criteria) this;
        }

        public Criteria andOisdCustom5IsNull() {
            addCriterion("oisd_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andOisdCustom5IsNotNull() {
            addCriterion("oisd_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andOisdCustom5EqualTo(String value) {
            addCriterion("oisd_custom5 =", value, "oisdCustom5");
            return (Criteria) this;
        }

        public Criteria andOisdCustom5NotEqualTo(String value) {
            addCriterion("oisd_custom5 <>", value, "oisdCustom5");
            return (Criteria) this;
        }

        public Criteria andOisdCustom5GreaterThan(String value) {
            addCriterion("oisd_custom5 >", value, "oisdCustom5");
            return (Criteria) this;
        }

        public Criteria andOisdCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("oisd_custom5 >=", value, "oisdCustom5");
            return (Criteria) this;
        }

        public Criteria andOisdCustom5LessThan(String value) {
            addCriterion("oisd_custom5 <", value, "oisdCustom5");
            return (Criteria) this;
        }

        public Criteria andOisdCustom5LessThanOrEqualTo(String value) {
            addCriterion("oisd_custom5 <=", value, "oisdCustom5");
            return (Criteria) this;
        }

        public Criteria andOisdCustom5Like(String value) {
            addCriterion("oisd_custom5 like", value, "oisdCustom5");
            return (Criteria) this;
        }

        public Criteria andOisdCustom5NotLike(String value) {
            addCriterion("oisd_custom5 not like", value, "oisdCustom5");
            return (Criteria) this;
        }

        public Criteria andOisdCustom5In(List<String> values) {
            addCriterion("oisd_custom5 in", values, "oisdCustom5");
            return (Criteria) this;
        }

        public Criteria andOisdCustom5NotIn(List<String> values) {
            addCriterion("oisd_custom5 not in", values, "oisdCustom5");
            return (Criteria) this;
        }

        public Criteria andOisdCustom5Between(String value1, String value2) {
            addCriterion("oisd_custom5 between", value1, value2, "oisdCustom5");
            return (Criteria) this;
        }

        public Criteria andOisdCustom5NotBetween(String value1, String value2) {
            addCriterion("oisd_custom5 not between", value1, value2, "oisdCustom5");
            return (Criteria) this;
        }

        public Criteria andOisdCustom6IsNull() {
            addCriterion("oisd_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andOisdCustom6IsNotNull() {
            addCriterion("oisd_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andOisdCustom6EqualTo(String value) {
            addCriterion("oisd_custom6 =", value, "oisdCustom6");
            return (Criteria) this;
        }

        public Criteria andOisdCustom6NotEqualTo(String value) {
            addCriterion("oisd_custom6 <>", value, "oisdCustom6");
            return (Criteria) this;
        }

        public Criteria andOisdCustom6GreaterThan(String value) {
            addCriterion("oisd_custom6 >", value, "oisdCustom6");
            return (Criteria) this;
        }

        public Criteria andOisdCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("oisd_custom6 >=", value, "oisdCustom6");
            return (Criteria) this;
        }

        public Criteria andOisdCustom6LessThan(String value) {
            addCriterion("oisd_custom6 <", value, "oisdCustom6");
            return (Criteria) this;
        }

        public Criteria andOisdCustom6LessThanOrEqualTo(String value) {
            addCriterion("oisd_custom6 <=", value, "oisdCustom6");
            return (Criteria) this;
        }

        public Criteria andOisdCustom6Like(String value) {
            addCriterion("oisd_custom6 like", value, "oisdCustom6");
            return (Criteria) this;
        }

        public Criteria andOisdCustom6NotLike(String value) {
            addCriterion("oisd_custom6 not like", value, "oisdCustom6");
            return (Criteria) this;
        }

        public Criteria andOisdCustom6In(List<String> values) {
            addCriterion("oisd_custom6 in", values, "oisdCustom6");
            return (Criteria) this;
        }

        public Criteria andOisdCustom6NotIn(List<String> values) {
            addCriterion("oisd_custom6 not in", values, "oisdCustom6");
            return (Criteria) this;
        }

        public Criteria andOisdCustom6Between(String value1, String value2) {
            addCriterion("oisd_custom6 between", value1, value2, "oisdCustom6");
            return (Criteria) this;
        }

        public Criteria andOisdCustom6NotBetween(String value1, String value2) {
            addCriterion("oisd_custom6 not between", value1, value2, "oisdCustom6");
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