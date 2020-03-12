package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class OtherOutStorageDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OtherOutStorageDetailedExample() {
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

        public Criteria andOosdIdIsNull() {
            addCriterion("oosd_id is null");
            return (Criteria) this;
        }

        public Criteria andOosdIdIsNotNull() {
            addCriterion("oosd_id is not null");
            return (Criteria) this;
        }

        public Criteria andOosdIdEqualTo(String value) {
            addCriterion("oosd_id =", value, "oosdId");
            return (Criteria) this;
        }

        public Criteria andOosdIdNotEqualTo(String value) {
            addCriterion("oosd_id <>", value, "oosdId");
            return (Criteria) this;
        }

        public Criteria andOosdIdGreaterThan(String value) {
            addCriterion("oosd_id >", value, "oosdId");
            return (Criteria) this;
        }

        public Criteria andOosdIdGreaterThanOrEqualTo(String value) {
            addCriterion("oosd_id >=", value, "oosdId");
            return (Criteria) this;
        }

        public Criteria andOosdIdLessThan(String value) {
            addCriterion("oosd_id <", value, "oosdId");
            return (Criteria) this;
        }

        public Criteria andOosdIdLessThanOrEqualTo(String value) {
            addCriterion("oosd_id <=", value, "oosdId");
            return (Criteria) this;
        }

        public Criteria andOosdIdLike(String value) {
            addCriterion("oosd_id like", value, "oosdId");
            return (Criteria) this;
        }

        public Criteria andOosdIdNotLike(String value) {
            addCriterion("oosd_id not like", value, "oosdId");
            return (Criteria) this;
        }

        public Criteria andOosdIdIn(List<String> values) {
            addCriterion("oosd_id in", values, "oosdId");
            return (Criteria) this;
        }

        public Criteria andOosdIdNotIn(List<String> values) {
            addCriterion("oosd_id not in", values, "oosdId");
            return (Criteria) this;
        }

        public Criteria andOosdIdBetween(String value1, String value2) {
            addCriterion("oosd_id between", value1, value2, "oosdId");
            return (Criteria) this;
        }

        public Criteria andOosdIdNotBetween(String value1, String value2) {
            addCriterion("oosd_id not between", value1, value2, "oosdId");
            return (Criteria) this;
        }

        public Criteria andOosIdIsNull() {
            addCriterion("oos_id is null");
            return (Criteria) this;
        }

        public Criteria andOosIdIsNotNull() {
            addCriterion("oos_id is not null");
            return (Criteria) this;
        }

        public Criteria andOosIdEqualTo(String value) {
            addCriterion("oos_id =", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdNotEqualTo(String value) {
            addCriterion("oos_id <>", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdGreaterThan(String value) {
            addCriterion("oos_id >", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdGreaterThanOrEqualTo(String value) {
            addCriterion("oos_id >=", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdLessThan(String value) {
            addCriterion("oos_id <", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdLessThanOrEqualTo(String value) {
            addCriterion("oos_id <=", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdLike(String value) {
            addCriterion("oos_id like", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdNotLike(String value) {
            addCriterion("oos_id not like", value, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdIn(List<String> values) {
            addCriterion("oos_id in", values, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdNotIn(List<String> values) {
            addCriterion("oos_id not in", values, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdBetween(String value1, String value2) {
            addCriterion("oos_id between", value1, value2, "oosId");
            return (Criteria) this;
        }

        public Criteria andOosIdNotBetween(String value1, String value2) {
            addCriterion("oos_id not between", value1, value2, "oosId");
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

        public Criteria andOosdEngnameIsNull() {
            addCriterion("oosd_engname is null");
            return (Criteria) this;
        }

        public Criteria andOosdEngnameIsNotNull() {
            addCriterion("oosd_engname is not null");
            return (Criteria) this;
        }

        public Criteria andOosdEngnameEqualTo(String value) {
            addCriterion("oosd_engname =", value, "oosdEngname");
            return (Criteria) this;
        }

        public Criteria andOosdEngnameNotEqualTo(String value) {
            addCriterion("oosd_engname <>", value, "oosdEngname");
            return (Criteria) this;
        }

        public Criteria andOosdEngnameGreaterThan(String value) {
            addCriterion("oosd_engname >", value, "oosdEngname");
            return (Criteria) this;
        }

        public Criteria andOosdEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("oosd_engname >=", value, "oosdEngname");
            return (Criteria) this;
        }

        public Criteria andOosdEngnameLessThan(String value) {
            addCriterion("oosd_engname <", value, "oosdEngname");
            return (Criteria) this;
        }

        public Criteria andOosdEngnameLessThanOrEqualTo(String value) {
            addCriterion("oosd_engname <=", value, "oosdEngname");
            return (Criteria) this;
        }

        public Criteria andOosdEngnameLike(String value) {
            addCriterion("oosd_engname like", value, "oosdEngname");
            return (Criteria) this;
        }

        public Criteria andOosdEngnameNotLike(String value) {
            addCriterion("oosd_engname not like", value, "oosdEngname");
            return (Criteria) this;
        }

        public Criteria andOosdEngnameIn(List<String> values) {
            addCriterion("oosd_engname in", values, "oosdEngname");
            return (Criteria) this;
        }

        public Criteria andOosdEngnameNotIn(List<String> values) {
            addCriterion("oosd_engname not in", values, "oosdEngname");
            return (Criteria) this;
        }

        public Criteria andOosdEngnameBetween(String value1, String value2) {
            addCriterion("oosd_engname between", value1, value2, "oosdEngname");
            return (Criteria) this;
        }

        public Criteria andOosdEngnameNotBetween(String value1, String value2) {
            addCriterion("oosd_engname not between", value1, value2, "oosdEngname");
            return (Criteria) this;
        }

        public Criteria andOosdRemarkIsNull() {
            addCriterion("oosd_remark is null");
            return (Criteria) this;
        }

        public Criteria andOosdRemarkIsNotNull() {
            addCriterion("oosd_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOosdRemarkEqualTo(String value) {
            addCriterion("oosd_remark =", value, "oosdRemark");
            return (Criteria) this;
        }

        public Criteria andOosdRemarkNotEqualTo(String value) {
            addCriterion("oosd_remark <>", value, "oosdRemark");
            return (Criteria) this;
        }

        public Criteria andOosdRemarkGreaterThan(String value) {
            addCriterion("oosd_remark >", value, "oosdRemark");
            return (Criteria) this;
        }

        public Criteria andOosdRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("oosd_remark >=", value, "oosdRemark");
            return (Criteria) this;
        }

        public Criteria andOosdRemarkLessThan(String value) {
            addCriterion("oosd_remark <", value, "oosdRemark");
            return (Criteria) this;
        }

        public Criteria andOosdRemarkLessThanOrEqualTo(String value) {
            addCriterion("oosd_remark <=", value, "oosdRemark");
            return (Criteria) this;
        }

        public Criteria andOosdRemarkLike(String value) {
            addCriterion("oosd_remark like", value, "oosdRemark");
            return (Criteria) this;
        }

        public Criteria andOosdRemarkNotLike(String value) {
            addCriterion("oosd_remark not like", value, "oosdRemark");
            return (Criteria) this;
        }

        public Criteria andOosdRemarkIn(List<String> values) {
            addCriterion("oosd_remark in", values, "oosdRemark");
            return (Criteria) this;
        }

        public Criteria andOosdRemarkNotIn(List<String> values) {
            addCriterion("oosd_remark not in", values, "oosdRemark");
            return (Criteria) this;
        }

        public Criteria andOosdRemarkBetween(String value1, String value2) {
            addCriterion("oosd_remark between", value1, value2, "oosdRemark");
            return (Criteria) this;
        }

        public Criteria andOosdRemarkNotBetween(String value1, String value2) {
            addCriterion("oosd_remark not between", value1, value2, "oosdRemark");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIncludeTaxIsNull() {
            addCriterion("oosd_price_include_tax is null");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIncludeTaxIsNotNull() {
            addCriterion("oosd_price_include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIncludeTaxEqualTo(String value) {
            addCriterion("oosd_price_include_tax =", value, "oosdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIncludeTaxNotEqualTo(String value) {
            addCriterion("oosd_price_include_tax <>", value, "oosdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIncludeTaxGreaterThan(String value) {
            addCriterion("oosd_price_include_tax >", value, "oosdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("oosd_price_include_tax >=", value, "oosdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIncludeTaxLessThan(String value) {
            addCriterion("oosd_price_include_tax <", value, "oosdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("oosd_price_include_tax <=", value, "oosdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIncludeTaxLike(String value) {
            addCriterion("oosd_price_include_tax like", value, "oosdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIncludeTaxNotLike(String value) {
            addCriterion("oosd_price_include_tax not like", value, "oosdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIncludeTaxIn(List<String> values) {
            addCriterion("oosd_price_include_tax in", values, "oosdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIncludeTaxNotIn(List<String> values) {
            addCriterion("oosd_price_include_tax not in", values, "oosdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIncludeTaxBetween(String value1, String value2) {
            addCriterion("oosd_price_include_tax between", value1, value2, "oosdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("oosd_price_include_tax not between", value1, value2, "oosdPriceIncludeTax");
            return (Criteria) this;
        }

        public Criteria andOosdSingleStatusIsNull() {
            addCriterion("oosd_single_status is null");
            return (Criteria) this;
        }

        public Criteria andOosdSingleStatusIsNotNull() {
            addCriterion("oosd_single_status is not null");
            return (Criteria) this;
        }

        public Criteria andOosdSingleStatusEqualTo(Integer value) {
            addCriterion("oosd_single_status =", value, "oosdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOosdSingleStatusNotEqualTo(Integer value) {
            addCriterion("oosd_single_status <>", value, "oosdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOosdSingleStatusGreaterThan(Integer value) {
            addCriterion("oosd_single_status >", value, "oosdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOosdSingleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("oosd_single_status >=", value, "oosdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOosdSingleStatusLessThan(Integer value) {
            addCriterion("oosd_single_status <", value, "oosdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOosdSingleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("oosd_single_status <=", value, "oosdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOosdSingleStatusIn(List<Integer> values) {
            addCriterion("oosd_single_status in", values, "oosdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOosdSingleStatusNotIn(List<Integer> values) {
            addCriterion("oosd_single_status not in", values, "oosdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOosdSingleStatusBetween(Integer value1, Integer value2) {
            addCriterion("oosd_single_status between", value1, value2, "oosdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOosdSingleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("oosd_single_status not between", value1, value2, "oosdSingleStatus");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIsNull() {
            addCriterion("oosd_price is null");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIsNotNull() {
            addCriterion("oosd_price is not null");
            return (Criteria) this;
        }

        public Criteria andOosdPriceEqualTo(Float value) {
            addCriterion("oosd_price =", value, "oosdPrice");
            return (Criteria) this;
        }

        public Criteria andOosdPriceNotEqualTo(Float value) {
            addCriterion("oosd_price <>", value, "oosdPrice");
            return (Criteria) this;
        }

        public Criteria andOosdPriceGreaterThan(Float value) {
            addCriterion("oosd_price >", value, "oosdPrice");
            return (Criteria) this;
        }

        public Criteria andOosdPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("oosd_price >=", value, "oosdPrice");
            return (Criteria) this;
        }

        public Criteria andOosdPriceLessThan(Float value) {
            addCriterion("oosd_price <", value, "oosdPrice");
            return (Criteria) this;
        }

        public Criteria andOosdPriceLessThanOrEqualTo(Float value) {
            addCriterion("oosd_price <=", value, "oosdPrice");
            return (Criteria) this;
        }

        public Criteria andOosdPriceIn(List<Float> values) {
            addCriterion("oosd_price in", values, "oosdPrice");
            return (Criteria) this;
        }

        public Criteria andOosdPriceNotIn(List<Float> values) {
            addCriterion("oosd_price not in", values, "oosdPrice");
            return (Criteria) this;
        }

        public Criteria andOosdPriceBetween(Float value1, Float value2) {
            addCriterion("oosd_price between", value1, value2, "oosdPrice");
            return (Criteria) this;
        }

        public Criteria andOosdPriceNotBetween(Float value1, Float value2) {
            addCriterion("oosd_price not between", value1, value2, "oosdPrice");
            return (Criteria) this;
        }

        public Criteria andOosdMoneyIsNull() {
            addCriterion("oosd_money is null");
            return (Criteria) this;
        }

        public Criteria andOosdMoneyIsNotNull() {
            addCriterion("oosd_money is not null");
            return (Criteria) this;
        }

        public Criteria andOosdMoneyEqualTo(Float value) {
            addCriterion("oosd_money =", value, "oosdMoney");
            return (Criteria) this;
        }

        public Criteria andOosdMoneyNotEqualTo(Float value) {
            addCriterion("oosd_money <>", value, "oosdMoney");
            return (Criteria) this;
        }

        public Criteria andOosdMoneyGreaterThan(Float value) {
            addCriterion("oosd_money >", value, "oosdMoney");
            return (Criteria) this;
        }

        public Criteria andOosdMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("oosd_money >=", value, "oosdMoney");
            return (Criteria) this;
        }

        public Criteria andOosdMoneyLessThan(Float value) {
            addCriterion("oosd_money <", value, "oosdMoney");
            return (Criteria) this;
        }

        public Criteria andOosdMoneyLessThanOrEqualTo(Float value) {
            addCriterion("oosd_money <=", value, "oosdMoney");
            return (Criteria) this;
        }

        public Criteria andOosdMoneyIn(List<Float> values) {
            addCriterion("oosd_money in", values, "oosdMoney");
            return (Criteria) this;
        }

        public Criteria andOosdMoneyNotIn(List<Float> values) {
            addCriterion("oosd_money not in", values, "oosdMoney");
            return (Criteria) this;
        }

        public Criteria andOosdMoneyBetween(Float value1, Float value2) {
            addCriterion("oosd_money between", value1, value2, "oosdMoney");
            return (Criteria) this;
        }

        public Criteria andOosdMoneyNotBetween(Float value1, Float value2) {
            addCriterion("oosd_money not between", value1, value2, "oosdMoney");
            return (Criteria) this;
        }

        public Criteria andOosdRemarksIsNull() {
            addCriterion("oosd_remarks is null");
            return (Criteria) this;
        }

        public Criteria andOosdRemarksIsNotNull() {
            addCriterion("oosd_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andOosdRemarksEqualTo(String value) {
            addCriterion("oosd_remarks =", value, "oosdRemarks");
            return (Criteria) this;
        }

        public Criteria andOosdRemarksNotEqualTo(String value) {
            addCriterion("oosd_remarks <>", value, "oosdRemarks");
            return (Criteria) this;
        }

        public Criteria andOosdRemarksGreaterThan(String value) {
            addCriterion("oosd_remarks >", value, "oosdRemarks");
            return (Criteria) this;
        }

        public Criteria andOosdRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("oosd_remarks >=", value, "oosdRemarks");
            return (Criteria) this;
        }

        public Criteria andOosdRemarksLessThan(String value) {
            addCriterion("oosd_remarks <", value, "oosdRemarks");
            return (Criteria) this;
        }

        public Criteria andOosdRemarksLessThanOrEqualTo(String value) {
            addCriterion("oosd_remarks <=", value, "oosdRemarks");
            return (Criteria) this;
        }

        public Criteria andOosdRemarksLike(String value) {
            addCriterion("oosd_remarks like", value, "oosdRemarks");
            return (Criteria) this;
        }

        public Criteria andOosdRemarksNotLike(String value) {
            addCriterion("oosd_remarks not like", value, "oosdRemarks");
            return (Criteria) this;
        }

        public Criteria andOosdRemarksIn(List<String> values) {
            addCriterion("oosd_remarks in", values, "oosdRemarks");
            return (Criteria) this;
        }

        public Criteria andOosdRemarksNotIn(List<String> values) {
            addCriterion("oosd_remarks not in", values, "oosdRemarks");
            return (Criteria) this;
        }

        public Criteria andOosdRemarksBetween(String value1, String value2) {
            addCriterion("oosd_remarks between", value1, value2, "oosdRemarks");
            return (Criteria) this;
        }

        public Criteria andOosdRemarksNotBetween(String value1, String value2) {
            addCriterion("oosd_remarks not between", value1, value2, "oosdRemarks");
            return (Criteria) this;
        }

        public Criteria andOosdSourceOrderIsNull() {
            addCriterion("oosd_source_order is null");
            return (Criteria) this;
        }

        public Criteria andOosdSourceOrderIsNotNull() {
            addCriterion("oosd_source_order is not null");
            return (Criteria) this;
        }

        public Criteria andOosdSourceOrderEqualTo(String value) {
            addCriterion("oosd_source_order =", value, "oosdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOosdSourceOrderNotEqualTo(String value) {
            addCriterion("oosd_source_order <>", value, "oosdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOosdSourceOrderGreaterThan(String value) {
            addCriterion("oosd_source_order >", value, "oosdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOosdSourceOrderGreaterThanOrEqualTo(String value) {
            addCriterion("oosd_source_order >=", value, "oosdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOosdSourceOrderLessThan(String value) {
            addCriterion("oosd_source_order <", value, "oosdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOosdSourceOrderLessThanOrEqualTo(String value) {
            addCriterion("oosd_source_order <=", value, "oosdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOosdSourceOrderLike(String value) {
            addCriterion("oosd_source_order like", value, "oosdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOosdSourceOrderNotLike(String value) {
            addCriterion("oosd_source_order not like", value, "oosdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOosdSourceOrderIn(List<String> values) {
            addCriterion("oosd_source_order in", values, "oosdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOosdSourceOrderNotIn(List<String> values) {
            addCriterion("oosd_source_order not in", values, "oosdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOosdSourceOrderBetween(String value1, String value2) {
            addCriterion("oosd_source_order between", value1, value2, "oosdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOosdSourceOrderNotBetween(String value1, String value2) {
            addCriterion("oosd_source_order not between", value1, value2, "oosdSourceOrder");
            return (Criteria) this;
        }

        public Criteria andOosdSourceNoIsNull() {
            addCriterion("oosd_source_no is null");
            return (Criteria) this;
        }

        public Criteria andOosdSourceNoIsNotNull() {
            addCriterion("oosd_source_no is not null");
            return (Criteria) this;
        }

        public Criteria andOosdSourceNoEqualTo(String value) {
            addCriterion("oosd_source_no =", value, "oosdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOosdSourceNoNotEqualTo(String value) {
            addCriterion("oosd_source_no <>", value, "oosdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOosdSourceNoGreaterThan(String value) {
            addCriterion("oosd_source_no >", value, "oosdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOosdSourceNoGreaterThanOrEqualTo(String value) {
            addCriterion("oosd_source_no >=", value, "oosdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOosdSourceNoLessThan(String value) {
            addCriterion("oosd_source_no <", value, "oosdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOosdSourceNoLessThanOrEqualTo(String value) {
            addCriterion("oosd_source_no <=", value, "oosdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOosdSourceNoLike(String value) {
            addCriterion("oosd_source_no like", value, "oosdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOosdSourceNoNotLike(String value) {
            addCriterion("oosd_source_no not like", value, "oosdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOosdSourceNoIn(List<String> values) {
            addCriterion("oosd_source_no in", values, "oosdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOosdSourceNoNotIn(List<String> values) {
            addCriterion("oosd_source_no not in", values, "oosdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOosdSourceNoBetween(String value1, String value2) {
            addCriterion("oosd_source_no between", value1, value2, "oosdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOosdSourceNoNotBetween(String value1, String value2) {
            addCriterion("oosd_source_no not between", value1, value2, "oosdSourceNo");
            return (Criteria) this;
        }

        public Criteria andOosdAuditingIsNull() {
            addCriterion("oosd_auditing is null");
            return (Criteria) this;
        }

        public Criteria andOosdAuditingIsNotNull() {
            addCriterion("oosd_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andOosdAuditingEqualTo(String value) {
            addCriterion("oosd_auditing =", value, "oosdAuditing");
            return (Criteria) this;
        }

        public Criteria andOosdAuditingNotEqualTo(String value) {
            addCriterion("oosd_auditing <>", value, "oosdAuditing");
            return (Criteria) this;
        }

        public Criteria andOosdAuditingGreaterThan(String value) {
            addCriterion("oosd_auditing >", value, "oosdAuditing");
            return (Criteria) this;
        }

        public Criteria andOosdAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("oosd_auditing >=", value, "oosdAuditing");
            return (Criteria) this;
        }

        public Criteria andOosdAuditingLessThan(String value) {
            addCriterion("oosd_auditing <", value, "oosdAuditing");
            return (Criteria) this;
        }

        public Criteria andOosdAuditingLessThanOrEqualTo(String value) {
            addCriterion("oosd_auditing <=", value, "oosdAuditing");
            return (Criteria) this;
        }

        public Criteria andOosdAuditingLike(String value) {
            addCriterion("oosd_auditing like", value, "oosdAuditing");
            return (Criteria) this;
        }

        public Criteria andOosdAuditingNotLike(String value) {
            addCriterion("oosd_auditing not like", value, "oosdAuditing");
            return (Criteria) this;
        }

        public Criteria andOosdAuditingIn(List<String> values) {
            addCriterion("oosd_auditing in", values, "oosdAuditing");
            return (Criteria) this;
        }

        public Criteria andOosdAuditingNotIn(List<String> values) {
            addCriterion("oosd_auditing not in", values, "oosdAuditing");
            return (Criteria) this;
        }

        public Criteria andOosdAuditingBetween(String value1, String value2) {
            addCriterion("oosd_auditing between", value1, value2, "oosdAuditing");
            return (Criteria) this;
        }

        public Criteria andOosdAuditingNotBetween(String value1, String value2) {
            addCriterion("oosd_auditing not between", value1, value2, "oosdAuditing");
            return (Criteria) this;
        }

        public Criteria andOosdYnIsNull() {
            addCriterion("oosd_yn is null");
            return (Criteria) this;
        }

        public Criteria andOosdYnIsNotNull() {
            addCriterion("oosd_yn is not null");
            return (Criteria) this;
        }

        public Criteria andOosdYnEqualTo(String value) {
            addCriterion("oosd_yn =", value, "oosdYn");
            return (Criteria) this;
        }

        public Criteria andOosdYnNotEqualTo(String value) {
            addCriterion("oosd_yn <>", value, "oosdYn");
            return (Criteria) this;
        }

        public Criteria andOosdYnGreaterThan(String value) {
            addCriterion("oosd_yn >", value, "oosdYn");
            return (Criteria) this;
        }

        public Criteria andOosdYnGreaterThanOrEqualTo(String value) {
            addCriterion("oosd_yn >=", value, "oosdYn");
            return (Criteria) this;
        }

        public Criteria andOosdYnLessThan(String value) {
            addCriterion("oosd_yn <", value, "oosdYn");
            return (Criteria) this;
        }

        public Criteria andOosdYnLessThanOrEqualTo(String value) {
            addCriterion("oosd_yn <=", value, "oosdYn");
            return (Criteria) this;
        }

        public Criteria andOosdYnLike(String value) {
            addCriterion("oosd_yn like", value, "oosdYn");
            return (Criteria) this;
        }

        public Criteria andOosdYnNotLike(String value) {
            addCriterion("oosd_yn not like", value, "oosdYn");
            return (Criteria) this;
        }

        public Criteria andOosdYnIn(List<String> values) {
            addCriterion("oosd_yn in", values, "oosdYn");
            return (Criteria) this;
        }

        public Criteria andOosdYnNotIn(List<String> values) {
            addCriterion("oosd_yn not in", values, "oosdYn");
            return (Criteria) this;
        }

        public Criteria andOosdYnBetween(String value1, String value2) {
            addCriterion("oosd_yn between", value1, value2, "oosdYn");
            return (Criteria) this;
        }

        public Criteria andOosdYnNotBetween(String value1, String value2) {
            addCriterion("oosd_yn not between", value1, value2, "oosdYn");
            return (Criteria) this;
        }

        public Criteria andOosdCustom1IsNull() {
            addCriterion("oosd_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andOosdCustom1IsNotNull() {
            addCriterion("oosd_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andOosdCustom1EqualTo(String value) {
            addCriterion("oosd_custom1 =", value, "oosdCustom1");
            return (Criteria) this;
        }

        public Criteria andOosdCustom1NotEqualTo(String value) {
            addCriterion("oosd_custom1 <>", value, "oosdCustom1");
            return (Criteria) this;
        }

        public Criteria andOosdCustom1GreaterThan(String value) {
            addCriterion("oosd_custom1 >", value, "oosdCustom1");
            return (Criteria) this;
        }

        public Criteria andOosdCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("oosd_custom1 >=", value, "oosdCustom1");
            return (Criteria) this;
        }

        public Criteria andOosdCustom1LessThan(String value) {
            addCriterion("oosd_custom1 <", value, "oosdCustom1");
            return (Criteria) this;
        }

        public Criteria andOosdCustom1LessThanOrEqualTo(String value) {
            addCriterion("oosd_custom1 <=", value, "oosdCustom1");
            return (Criteria) this;
        }

        public Criteria andOosdCustom1Like(String value) {
            addCriterion("oosd_custom1 like", value, "oosdCustom1");
            return (Criteria) this;
        }

        public Criteria andOosdCustom1NotLike(String value) {
            addCriterion("oosd_custom1 not like", value, "oosdCustom1");
            return (Criteria) this;
        }

        public Criteria andOosdCustom1In(List<String> values) {
            addCriterion("oosd_custom1 in", values, "oosdCustom1");
            return (Criteria) this;
        }

        public Criteria andOosdCustom1NotIn(List<String> values) {
            addCriterion("oosd_custom1 not in", values, "oosdCustom1");
            return (Criteria) this;
        }

        public Criteria andOosdCustom1Between(String value1, String value2) {
            addCriterion("oosd_custom1 between", value1, value2, "oosdCustom1");
            return (Criteria) this;
        }

        public Criteria andOosdCustom1NotBetween(String value1, String value2) {
            addCriterion("oosd_custom1 not between", value1, value2, "oosdCustom1");
            return (Criteria) this;
        }

        public Criteria andOosdCustom2IsNull() {
            addCriterion("oosd_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andOosdCustom2IsNotNull() {
            addCriterion("oosd_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andOosdCustom2EqualTo(String value) {
            addCriterion("oosd_custom2 =", value, "oosdCustom2");
            return (Criteria) this;
        }

        public Criteria andOosdCustom2NotEqualTo(String value) {
            addCriterion("oosd_custom2 <>", value, "oosdCustom2");
            return (Criteria) this;
        }

        public Criteria andOosdCustom2GreaterThan(String value) {
            addCriterion("oosd_custom2 >", value, "oosdCustom2");
            return (Criteria) this;
        }

        public Criteria andOosdCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("oosd_custom2 >=", value, "oosdCustom2");
            return (Criteria) this;
        }

        public Criteria andOosdCustom2LessThan(String value) {
            addCriterion("oosd_custom2 <", value, "oosdCustom2");
            return (Criteria) this;
        }

        public Criteria andOosdCustom2LessThanOrEqualTo(String value) {
            addCriterion("oosd_custom2 <=", value, "oosdCustom2");
            return (Criteria) this;
        }

        public Criteria andOosdCustom2Like(String value) {
            addCriterion("oosd_custom2 like", value, "oosdCustom2");
            return (Criteria) this;
        }

        public Criteria andOosdCustom2NotLike(String value) {
            addCriterion("oosd_custom2 not like", value, "oosdCustom2");
            return (Criteria) this;
        }

        public Criteria andOosdCustom2In(List<String> values) {
            addCriterion("oosd_custom2 in", values, "oosdCustom2");
            return (Criteria) this;
        }

        public Criteria andOosdCustom2NotIn(List<String> values) {
            addCriterion("oosd_custom2 not in", values, "oosdCustom2");
            return (Criteria) this;
        }

        public Criteria andOosdCustom2Between(String value1, String value2) {
            addCriterion("oosd_custom2 between", value1, value2, "oosdCustom2");
            return (Criteria) this;
        }

        public Criteria andOosdCustom2NotBetween(String value1, String value2) {
            addCriterion("oosd_custom2 not between", value1, value2, "oosdCustom2");
            return (Criteria) this;
        }

        public Criteria andOosdCustom3IsNull() {
            addCriterion("oosd_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andOosdCustom3IsNotNull() {
            addCriterion("oosd_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andOosdCustom3EqualTo(String value) {
            addCriterion("oosd_custom3 =", value, "oosdCustom3");
            return (Criteria) this;
        }

        public Criteria andOosdCustom3NotEqualTo(String value) {
            addCriterion("oosd_custom3 <>", value, "oosdCustom3");
            return (Criteria) this;
        }

        public Criteria andOosdCustom3GreaterThan(String value) {
            addCriterion("oosd_custom3 >", value, "oosdCustom3");
            return (Criteria) this;
        }

        public Criteria andOosdCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("oosd_custom3 >=", value, "oosdCustom3");
            return (Criteria) this;
        }

        public Criteria andOosdCustom3LessThan(String value) {
            addCriterion("oosd_custom3 <", value, "oosdCustom3");
            return (Criteria) this;
        }

        public Criteria andOosdCustom3LessThanOrEqualTo(String value) {
            addCriterion("oosd_custom3 <=", value, "oosdCustom3");
            return (Criteria) this;
        }

        public Criteria andOosdCustom3Like(String value) {
            addCriterion("oosd_custom3 like", value, "oosdCustom3");
            return (Criteria) this;
        }

        public Criteria andOosdCustom3NotLike(String value) {
            addCriterion("oosd_custom3 not like", value, "oosdCustom3");
            return (Criteria) this;
        }

        public Criteria andOosdCustom3In(List<String> values) {
            addCriterion("oosd_custom3 in", values, "oosdCustom3");
            return (Criteria) this;
        }

        public Criteria andOosdCustom3NotIn(List<String> values) {
            addCriterion("oosd_custom3 not in", values, "oosdCustom3");
            return (Criteria) this;
        }

        public Criteria andOosdCustom3Between(String value1, String value2) {
            addCriterion("oosd_custom3 between", value1, value2, "oosdCustom3");
            return (Criteria) this;
        }

        public Criteria andOosdCustom3NotBetween(String value1, String value2) {
            addCriterion("oosd_custom3 not between", value1, value2, "oosdCustom3");
            return (Criteria) this;
        }

        public Criteria andOosdCustom4IsNull() {
            addCriterion("oosd_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andOosdCustom4IsNotNull() {
            addCriterion("oosd_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andOosdCustom4EqualTo(String value) {
            addCriterion("oosd_custom4 =", value, "oosdCustom4");
            return (Criteria) this;
        }

        public Criteria andOosdCustom4NotEqualTo(String value) {
            addCriterion("oosd_custom4 <>", value, "oosdCustom4");
            return (Criteria) this;
        }

        public Criteria andOosdCustom4GreaterThan(String value) {
            addCriterion("oosd_custom4 >", value, "oosdCustom4");
            return (Criteria) this;
        }

        public Criteria andOosdCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("oosd_custom4 >=", value, "oosdCustom4");
            return (Criteria) this;
        }

        public Criteria andOosdCustom4LessThan(String value) {
            addCriterion("oosd_custom4 <", value, "oosdCustom4");
            return (Criteria) this;
        }

        public Criteria andOosdCustom4LessThanOrEqualTo(String value) {
            addCriterion("oosd_custom4 <=", value, "oosdCustom4");
            return (Criteria) this;
        }

        public Criteria andOosdCustom4Like(String value) {
            addCriterion("oosd_custom4 like", value, "oosdCustom4");
            return (Criteria) this;
        }

        public Criteria andOosdCustom4NotLike(String value) {
            addCriterion("oosd_custom4 not like", value, "oosdCustom4");
            return (Criteria) this;
        }

        public Criteria andOosdCustom4In(List<String> values) {
            addCriterion("oosd_custom4 in", values, "oosdCustom4");
            return (Criteria) this;
        }

        public Criteria andOosdCustom4NotIn(List<String> values) {
            addCriterion("oosd_custom4 not in", values, "oosdCustom4");
            return (Criteria) this;
        }

        public Criteria andOosdCustom4Between(String value1, String value2) {
            addCriterion("oosd_custom4 between", value1, value2, "oosdCustom4");
            return (Criteria) this;
        }

        public Criteria andOosdCustom4NotBetween(String value1, String value2) {
            addCriterion("oosd_custom4 not between", value1, value2, "oosdCustom4");
            return (Criteria) this;
        }

        public Criteria andOosdCustom5IsNull() {
            addCriterion("oosd_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andOosdCustom5IsNotNull() {
            addCriterion("oosd_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andOosdCustom5EqualTo(String value) {
            addCriterion("oosd_custom5 =", value, "oosdCustom5");
            return (Criteria) this;
        }

        public Criteria andOosdCustom5NotEqualTo(String value) {
            addCriterion("oosd_custom5 <>", value, "oosdCustom5");
            return (Criteria) this;
        }

        public Criteria andOosdCustom5GreaterThan(String value) {
            addCriterion("oosd_custom5 >", value, "oosdCustom5");
            return (Criteria) this;
        }

        public Criteria andOosdCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("oosd_custom5 >=", value, "oosdCustom5");
            return (Criteria) this;
        }

        public Criteria andOosdCustom5LessThan(String value) {
            addCriterion("oosd_custom5 <", value, "oosdCustom5");
            return (Criteria) this;
        }

        public Criteria andOosdCustom5LessThanOrEqualTo(String value) {
            addCriterion("oosd_custom5 <=", value, "oosdCustom5");
            return (Criteria) this;
        }

        public Criteria andOosdCustom5Like(String value) {
            addCriterion("oosd_custom5 like", value, "oosdCustom5");
            return (Criteria) this;
        }

        public Criteria andOosdCustom5NotLike(String value) {
            addCriterion("oosd_custom5 not like", value, "oosdCustom5");
            return (Criteria) this;
        }

        public Criteria andOosdCustom5In(List<String> values) {
            addCriterion("oosd_custom5 in", values, "oosdCustom5");
            return (Criteria) this;
        }

        public Criteria andOosdCustom5NotIn(List<String> values) {
            addCriterion("oosd_custom5 not in", values, "oosdCustom5");
            return (Criteria) this;
        }

        public Criteria andOosdCustom5Between(String value1, String value2) {
            addCriterion("oosd_custom5 between", value1, value2, "oosdCustom5");
            return (Criteria) this;
        }

        public Criteria andOosdCustom5NotBetween(String value1, String value2) {
            addCriterion("oosd_custom5 not between", value1, value2, "oosdCustom5");
            return (Criteria) this;
        }

        public Criteria andOosdCustom6IsNull() {
            addCriterion("oosd_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andOosdCustom6IsNotNull() {
            addCriterion("oosd_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andOosdCustom6EqualTo(String value) {
            addCriterion("oosd_custom6 =", value, "oosdCustom6");
            return (Criteria) this;
        }

        public Criteria andOosdCustom6NotEqualTo(String value) {
            addCriterion("oosd_custom6 <>", value, "oosdCustom6");
            return (Criteria) this;
        }

        public Criteria andOosdCustom6GreaterThan(String value) {
            addCriterion("oosd_custom6 >", value, "oosdCustom6");
            return (Criteria) this;
        }

        public Criteria andOosdCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("oosd_custom6 >=", value, "oosdCustom6");
            return (Criteria) this;
        }

        public Criteria andOosdCustom6LessThan(String value) {
            addCriterion("oosd_custom6 <", value, "oosdCustom6");
            return (Criteria) this;
        }

        public Criteria andOosdCustom6LessThanOrEqualTo(String value) {
            addCriterion("oosd_custom6 <=", value, "oosdCustom6");
            return (Criteria) this;
        }

        public Criteria andOosdCustom6Like(String value) {
            addCriterion("oosd_custom6 like", value, "oosdCustom6");
            return (Criteria) this;
        }

        public Criteria andOosdCustom6NotLike(String value) {
            addCriterion("oosd_custom6 not like", value, "oosdCustom6");
            return (Criteria) this;
        }

        public Criteria andOosdCustom6In(List<String> values) {
            addCriterion("oosd_custom6 in", values, "oosdCustom6");
            return (Criteria) this;
        }

        public Criteria andOosdCustom6NotIn(List<String> values) {
            addCriterion("oosd_custom6 not in", values, "oosdCustom6");
            return (Criteria) this;
        }

        public Criteria andOosdCustom6Between(String value1, String value2) {
            addCriterion("oosd_custom6 between", value1, value2, "oosdCustom6");
            return (Criteria) this;
        }

        public Criteria andOosdCustom6NotBetween(String value1, String value2) {
            addCriterion("oosd_custom6 not between", value1, value2, "oosdCustom6");
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