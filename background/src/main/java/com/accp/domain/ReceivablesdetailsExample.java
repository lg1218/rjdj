package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ReceivablesdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceivablesdetailsExample() {
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

        public Criteria andRecedetailIdIsNull() {
            addCriterion("recedetail_id is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailIdIsNotNull() {
            addCriterion("recedetail_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailIdEqualTo(String value) {
            addCriterion("recedetail_id =", value, "recedetailId");
            return (Criteria) this;
        }

        public Criteria andRecedetailIdNotEqualTo(String value) {
            addCriterion("recedetail_id <>", value, "recedetailId");
            return (Criteria) this;
        }

        public Criteria andRecedetailIdGreaterThan(String value) {
            addCriterion("recedetail_id >", value, "recedetailId");
            return (Criteria) this;
        }

        public Criteria andRecedetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("recedetail_id >=", value, "recedetailId");
            return (Criteria) this;
        }

        public Criteria andRecedetailIdLessThan(String value) {
            addCriterion("recedetail_id <", value, "recedetailId");
            return (Criteria) this;
        }

        public Criteria andRecedetailIdLessThanOrEqualTo(String value) {
            addCriterion("recedetail_id <=", value, "recedetailId");
            return (Criteria) this;
        }

        public Criteria andRecedetailIdLike(String value) {
            addCriterion("recedetail_id like", value, "recedetailId");
            return (Criteria) this;
        }

        public Criteria andRecedetailIdNotLike(String value) {
            addCriterion("recedetail_id not like", value, "recedetailId");
            return (Criteria) this;
        }

        public Criteria andRecedetailIdIn(List<String> values) {
            addCriterion("recedetail_id in", values, "recedetailId");
            return (Criteria) this;
        }

        public Criteria andRecedetailIdNotIn(List<String> values) {
            addCriterion("recedetail_id not in", values, "recedetailId");
            return (Criteria) this;
        }

        public Criteria andRecedetailIdBetween(String value1, String value2) {
            addCriterion("recedetail_id between", value1, value2, "recedetailId");
            return (Criteria) this;
        }

        public Criteria andRecedetailIdNotBetween(String value1, String value2) {
            addCriterion("recedetail_id not between", value1, value2, "recedetailId");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillIdIsNull() {
            addCriterion("receivablesbill_id is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillIdIsNotNull() {
            addCriterion("receivablesbill_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillIdEqualTo(String value) {
            addCriterion("receivablesbill_id =", value, "receivablesbillId");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillIdNotEqualTo(String value) {
            addCriterion("receivablesbill_id <>", value, "receivablesbillId");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillIdGreaterThan(String value) {
            addCriterion("receivablesbill_id >", value, "receivablesbillId");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillIdGreaterThanOrEqualTo(String value) {
            addCriterion("receivablesbill_id >=", value, "receivablesbillId");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillIdLessThan(String value) {
            addCriterion("receivablesbill_id <", value, "receivablesbillId");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillIdLessThanOrEqualTo(String value) {
            addCriterion("receivablesbill_id <=", value, "receivablesbillId");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillIdLike(String value) {
            addCriterion("receivablesbill_id like", value, "receivablesbillId");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillIdNotLike(String value) {
            addCriterion("receivablesbill_id not like", value, "receivablesbillId");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillIdIn(List<String> values) {
            addCriterion("receivablesbill_id in", values, "receivablesbillId");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillIdNotIn(List<String> values) {
            addCriterion("receivablesbill_id not in", values, "receivablesbillId");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillIdBetween(String value1, String value2) {
            addCriterion("receivablesbill_id between", value1, value2, "receivablesbillId");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillIdNotBetween(String value1, String value2) {
            addCriterion("receivablesbill_id not between", value1, value2, "receivablesbillId");
            return (Criteria) this;
        }

        public Criteria andRecedetailPriceIsNull() {
            addCriterion("\"recedetail _price\" is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailPriceIsNotNull() {
            addCriterion("\"recedetail _price\" is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailPriceEqualTo(Float value) {
            addCriterion("\"recedetail _price\" =", value, "recedetailPrice");
            return (Criteria) this;
        }

        public Criteria andRecedetailPriceNotEqualTo(Float value) {
            addCriterion("\"recedetail _price\" <>", value, "recedetailPrice");
            return (Criteria) this;
        }

        public Criteria andRecedetailPriceGreaterThan(Float value) {
            addCriterion("\"recedetail _price\" >", value, "recedetailPrice");
            return (Criteria) this;
        }

        public Criteria andRecedetailPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("\"recedetail _price\" >=", value, "recedetailPrice");
            return (Criteria) this;
        }

        public Criteria andRecedetailPriceLessThan(Float value) {
            addCriterion("\"recedetail _price\" <", value, "recedetailPrice");
            return (Criteria) this;
        }

        public Criteria andRecedetailPriceLessThanOrEqualTo(Float value) {
            addCriterion("\"recedetail _price\" <=", value, "recedetailPrice");
            return (Criteria) this;
        }

        public Criteria andRecedetailPriceIn(List<Float> values) {
            addCriterion("\"recedetail _price\" in", values, "recedetailPrice");
            return (Criteria) this;
        }

        public Criteria andRecedetailPriceNotIn(List<Float> values) {
            addCriterion("\"recedetail _price\" not in", values, "recedetailPrice");
            return (Criteria) this;
        }

        public Criteria andRecedetailPriceBetween(Float value1, Float value2) {
            addCriterion("\"recedetail _price\" between", value1, value2, "recedetailPrice");
            return (Criteria) this;
        }

        public Criteria andRecedetailPriceNotBetween(Float value1, Float value2) {
            addCriterion("\"recedetail _price\" not between", value1, value2, "recedetailPrice");
            return (Criteria) this;
        }

        public Criteria andRecedetailTypeIsNull() {
            addCriterion("\"recedetail _type\" is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailTypeIsNotNull() {
            addCriterion("\"recedetail _type\" is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailTypeEqualTo(String value) {
            addCriterion("\"recedetail _type\" =", value, "recedetailType");
            return (Criteria) this;
        }

        public Criteria andRecedetailTypeNotEqualTo(String value) {
            addCriterion("\"recedetail _type\" <>", value, "recedetailType");
            return (Criteria) this;
        }

        public Criteria andRecedetailTypeGreaterThan(String value) {
            addCriterion("\"recedetail _type\" >", value, "recedetailType");
            return (Criteria) this;
        }

        public Criteria andRecedetailTypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"recedetail _type\" >=", value, "recedetailType");
            return (Criteria) this;
        }

        public Criteria andRecedetailTypeLessThan(String value) {
            addCriterion("\"recedetail _type\" <", value, "recedetailType");
            return (Criteria) this;
        }

        public Criteria andRecedetailTypeLessThanOrEqualTo(String value) {
            addCriterion("\"recedetail _type\" <=", value, "recedetailType");
            return (Criteria) this;
        }

        public Criteria andRecedetailTypeLike(String value) {
            addCriterion("\"recedetail _type\" like", value, "recedetailType");
            return (Criteria) this;
        }

        public Criteria andRecedetailTypeNotLike(String value) {
            addCriterion("\"recedetail _type\" not like", value, "recedetailType");
            return (Criteria) this;
        }

        public Criteria andRecedetailTypeIn(List<String> values) {
            addCriterion("\"recedetail _type\" in", values, "recedetailType");
            return (Criteria) this;
        }

        public Criteria andRecedetailTypeNotIn(List<String> values) {
            addCriterion("\"recedetail _type\" not in", values, "recedetailType");
            return (Criteria) this;
        }

        public Criteria andRecedetailTypeBetween(String value1, String value2) {
            addCriterion("\"recedetail _type\" between", value1, value2, "recedetailType");
            return (Criteria) this;
        }

        public Criteria andRecedetailTypeNotBetween(String value1, String value2) {
            addCriterion("\"recedetail _type\" not between", value1, value2, "recedetailType");
            return (Criteria) this;
        }

        public Criteria andRecedetailNumberIsNull() {
            addCriterion("\"recedetail _number\" is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailNumberIsNotNull() {
            addCriterion("\"recedetail _number\" is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailNumberEqualTo(String value) {
            addCriterion("\"recedetail _number\" =", value, "recedetailNumber");
            return (Criteria) this;
        }

        public Criteria andRecedetailNumberNotEqualTo(String value) {
            addCriterion("\"recedetail _number\" <>", value, "recedetailNumber");
            return (Criteria) this;
        }

        public Criteria andRecedetailNumberGreaterThan(String value) {
            addCriterion("\"recedetail _number\" >", value, "recedetailNumber");
            return (Criteria) this;
        }

        public Criteria andRecedetailNumberGreaterThanOrEqualTo(String value) {
            addCriterion("\"recedetail _number\" >=", value, "recedetailNumber");
            return (Criteria) this;
        }

        public Criteria andRecedetailNumberLessThan(String value) {
            addCriterion("\"recedetail _number\" <", value, "recedetailNumber");
            return (Criteria) this;
        }

        public Criteria andRecedetailNumberLessThanOrEqualTo(String value) {
            addCriterion("\"recedetail _number\" <=", value, "recedetailNumber");
            return (Criteria) this;
        }

        public Criteria andRecedetailNumberLike(String value) {
            addCriterion("\"recedetail _number\" like", value, "recedetailNumber");
            return (Criteria) this;
        }

        public Criteria andRecedetailNumberNotLike(String value) {
            addCriterion("\"recedetail _number\" not like", value, "recedetailNumber");
            return (Criteria) this;
        }

        public Criteria andRecedetailNumberIn(List<String> values) {
            addCriterion("\"recedetail _number\" in", values, "recedetailNumber");
            return (Criteria) this;
        }

        public Criteria andRecedetailNumberNotIn(List<String> values) {
            addCriterion("\"recedetail _number\" not in", values, "recedetailNumber");
            return (Criteria) this;
        }

        public Criteria andRecedetailNumberBetween(String value1, String value2) {
            addCriterion("\"recedetail _number\" between", value1, value2, "recedetailNumber");
            return (Criteria) this;
        }

        public Criteria andRecedetailNumberNotBetween(String value1, String value2) {
            addCriterion("\"recedetail _number\" not between", value1, value2, "recedetailNumber");
            return (Criteria) this;
        }

        public Criteria andRecedetailRemarksIsNull() {
            addCriterion("\"recedetail _remarks\" is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailRemarksIsNotNull() {
            addCriterion("\"recedetail _remarks\" is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailRemarksEqualTo(String value) {
            addCriterion("\"recedetail _remarks\" =", value, "recedetailRemarks");
            return (Criteria) this;
        }

        public Criteria andRecedetailRemarksNotEqualTo(String value) {
            addCriterion("\"recedetail _remarks\" <>", value, "recedetailRemarks");
            return (Criteria) this;
        }

        public Criteria andRecedetailRemarksGreaterThan(String value) {
            addCriterion("\"recedetail _remarks\" >", value, "recedetailRemarks");
            return (Criteria) this;
        }

        public Criteria andRecedetailRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("\"recedetail _remarks\" >=", value, "recedetailRemarks");
            return (Criteria) this;
        }

        public Criteria andRecedetailRemarksLessThan(String value) {
            addCriterion("\"recedetail _remarks\" <", value, "recedetailRemarks");
            return (Criteria) this;
        }

        public Criteria andRecedetailRemarksLessThanOrEqualTo(String value) {
            addCriterion("\"recedetail _remarks\" <=", value, "recedetailRemarks");
            return (Criteria) this;
        }

        public Criteria andRecedetailRemarksLike(String value) {
            addCriterion("\"recedetail _remarks\" like", value, "recedetailRemarks");
            return (Criteria) this;
        }

        public Criteria andRecedetailRemarksNotLike(String value) {
            addCriterion("\"recedetail _remarks\" not like", value, "recedetailRemarks");
            return (Criteria) this;
        }

        public Criteria andRecedetailRemarksIn(List<String> values) {
            addCriterion("\"recedetail _remarks\" in", values, "recedetailRemarks");
            return (Criteria) this;
        }

        public Criteria andRecedetailRemarksNotIn(List<String> values) {
            addCriterion("\"recedetail _remarks\" not in", values, "recedetailRemarks");
            return (Criteria) this;
        }

        public Criteria andRecedetailRemarksBetween(String value1, String value2) {
            addCriterion("\"recedetail _remarks\" between", value1, value2, "recedetailRemarks");
            return (Criteria) this;
        }

        public Criteria andRecedetailRemarksNotBetween(String value1, String value2) {
            addCriterion("\"recedetail _remarks\" not between", value1, value2, "recedetailRemarks");
            return (Criteria) this;
        }

        public Criteria andRecedetailAuditingIsNull() {
            addCriterion("recedetail_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailAuditingIsNotNull() {
            addCriterion("recedetail_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailAuditingEqualTo(String value) {
            addCriterion("recedetail_Auditing =", value, "recedetailAuditing");
            return (Criteria) this;
        }

        public Criteria andRecedetailAuditingNotEqualTo(String value) {
            addCriterion("recedetail_Auditing <>", value, "recedetailAuditing");
            return (Criteria) this;
        }

        public Criteria andRecedetailAuditingGreaterThan(String value) {
            addCriterion("recedetail_Auditing >", value, "recedetailAuditing");
            return (Criteria) this;
        }

        public Criteria andRecedetailAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("recedetail_Auditing >=", value, "recedetailAuditing");
            return (Criteria) this;
        }

        public Criteria andRecedetailAuditingLessThan(String value) {
            addCriterion("recedetail_Auditing <", value, "recedetailAuditing");
            return (Criteria) this;
        }

        public Criteria andRecedetailAuditingLessThanOrEqualTo(String value) {
            addCriterion("recedetail_Auditing <=", value, "recedetailAuditing");
            return (Criteria) this;
        }

        public Criteria andRecedetailAuditingLike(String value) {
            addCriterion("recedetail_Auditing like", value, "recedetailAuditing");
            return (Criteria) this;
        }

        public Criteria andRecedetailAuditingNotLike(String value) {
            addCriterion("recedetail_Auditing not like", value, "recedetailAuditing");
            return (Criteria) this;
        }

        public Criteria andRecedetailAuditingIn(List<String> values) {
            addCriterion("recedetail_Auditing in", values, "recedetailAuditing");
            return (Criteria) this;
        }

        public Criteria andRecedetailAuditingNotIn(List<String> values) {
            addCriterion("recedetail_Auditing not in", values, "recedetailAuditing");
            return (Criteria) this;
        }

        public Criteria andRecedetailAuditingBetween(String value1, String value2) {
            addCriterion("recedetail_Auditing between", value1, value2, "recedetailAuditing");
            return (Criteria) this;
        }

        public Criteria andRecedetailAuditingNotBetween(String value1, String value2) {
            addCriterion("recedetail_Auditing not between", value1, value2, "recedetailAuditing");
            return (Criteria) this;
        }

        public Criteria andRecedetailYnIsNull() {
            addCriterion("recedetail_yn is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailYnIsNotNull() {
            addCriterion("recedetail_yn is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailYnEqualTo(String value) {
            addCriterion("recedetail_yn =", value, "recedetailYn");
            return (Criteria) this;
        }

        public Criteria andRecedetailYnNotEqualTo(String value) {
            addCriterion("recedetail_yn <>", value, "recedetailYn");
            return (Criteria) this;
        }

        public Criteria andRecedetailYnGreaterThan(String value) {
            addCriterion("recedetail_yn >", value, "recedetailYn");
            return (Criteria) this;
        }

        public Criteria andRecedetailYnGreaterThanOrEqualTo(String value) {
            addCriterion("recedetail_yn >=", value, "recedetailYn");
            return (Criteria) this;
        }

        public Criteria andRecedetailYnLessThan(String value) {
            addCriterion("recedetail_yn <", value, "recedetailYn");
            return (Criteria) this;
        }

        public Criteria andRecedetailYnLessThanOrEqualTo(String value) {
            addCriterion("recedetail_yn <=", value, "recedetailYn");
            return (Criteria) this;
        }

        public Criteria andRecedetailYnLike(String value) {
            addCriterion("recedetail_yn like", value, "recedetailYn");
            return (Criteria) this;
        }

        public Criteria andRecedetailYnNotLike(String value) {
            addCriterion("recedetail_yn not like", value, "recedetailYn");
            return (Criteria) this;
        }

        public Criteria andRecedetailYnIn(List<String> values) {
            addCriterion("recedetail_yn in", values, "recedetailYn");
            return (Criteria) this;
        }

        public Criteria andRecedetailYnNotIn(List<String> values) {
            addCriterion("recedetail_yn not in", values, "recedetailYn");
            return (Criteria) this;
        }

        public Criteria andRecedetailYnBetween(String value1, String value2) {
            addCriterion("recedetail_yn between", value1, value2, "recedetailYn");
            return (Criteria) this;
        }

        public Criteria andRecedetailYnNotBetween(String value1, String value2) {
            addCriterion("recedetail_yn not between", value1, value2, "recedetailYn");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom1IsNull() {
            addCriterion("recedetail_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom1IsNotNull() {
            addCriterion("recedetail_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom1EqualTo(String value) {
            addCriterion("recedetail_custom1 =", value, "recedetailCustom1");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom1NotEqualTo(String value) {
            addCriterion("recedetail_custom1 <>", value, "recedetailCustom1");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom1GreaterThan(String value) {
            addCriterion("recedetail_custom1 >", value, "recedetailCustom1");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("recedetail_custom1 >=", value, "recedetailCustom1");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom1LessThan(String value) {
            addCriterion("recedetail_custom1 <", value, "recedetailCustom1");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom1LessThanOrEqualTo(String value) {
            addCriterion("recedetail_custom1 <=", value, "recedetailCustom1");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom1Like(String value) {
            addCriterion("recedetail_custom1 like", value, "recedetailCustom1");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom1NotLike(String value) {
            addCriterion("recedetail_custom1 not like", value, "recedetailCustom1");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom1In(List<String> values) {
            addCriterion("recedetail_custom1 in", values, "recedetailCustom1");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom1NotIn(List<String> values) {
            addCriterion("recedetail_custom1 not in", values, "recedetailCustom1");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom1Between(String value1, String value2) {
            addCriterion("recedetail_custom1 between", value1, value2, "recedetailCustom1");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom1NotBetween(String value1, String value2) {
            addCriterion("recedetail_custom1 not between", value1, value2, "recedetailCustom1");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom2IsNull() {
            addCriterion("recedetail_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom2IsNotNull() {
            addCriterion("recedetail_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom2EqualTo(String value) {
            addCriterion("recedetail_custom2 =", value, "recedetailCustom2");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom2NotEqualTo(String value) {
            addCriterion("recedetail_custom2 <>", value, "recedetailCustom2");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom2GreaterThan(String value) {
            addCriterion("recedetail_custom2 >", value, "recedetailCustom2");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("recedetail_custom2 >=", value, "recedetailCustom2");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom2LessThan(String value) {
            addCriterion("recedetail_custom2 <", value, "recedetailCustom2");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom2LessThanOrEqualTo(String value) {
            addCriterion("recedetail_custom2 <=", value, "recedetailCustom2");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom2Like(String value) {
            addCriterion("recedetail_custom2 like", value, "recedetailCustom2");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom2NotLike(String value) {
            addCriterion("recedetail_custom2 not like", value, "recedetailCustom2");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom2In(List<String> values) {
            addCriterion("recedetail_custom2 in", values, "recedetailCustom2");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom2NotIn(List<String> values) {
            addCriterion("recedetail_custom2 not in", values, "recedetailCustom2");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom2Between(String value1, String value2) {
            addCriterion("recedetail_custom2 between", value1, value2, "recedetailCustom2");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom2NotBetween(String value1, String value2) {
            addCriterion("recedetail_custom2 not between", value1, value2, "recedetailCustom2");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom3IsNull() {
            addCriterion("recedetail_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom3IsNotNull() {
            addCriterion("recedetail_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom3EqualTo(String value) {
            addCriterion("recedetail_custom3 =", value, "recedetailCustom3");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom3NotEqualTo(String value) {
            addCriterion("recedetail_custom3 <>", value, "recedetailCustom3");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom3GreaterThan(String value) {
            addCriterion("recedetail_custom3 >", value, "recedetailCustom3");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("recedetail_custom3 >=", value, "recedetailCustom3");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom3LessThan(String value) {
            addCriterion("recedetail_custom3 <", value, "recedetailCustom3");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom3LessThanOrEqualTo(String value) {
            addCriterion("recedetail_custom3 <=", value, "recedetailCustom3");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom3Like(String value) {
            addCriterion("recedetail_custom3 like", value, "recedetailCustom3");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom3NotLike(String value) {
            addCriterion("recedetail_custom3 not like", value, "recedetailCustom3");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom3In(List<String> values) {
            addCriterion("recedetail_custom3 in", values, "recedetailCustom3");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom3NotIn(List<String> values) {
            addCriterion("recedetail_custom3 not in", values, "recedetailCustom3");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom3Between(String value1, String value2) {
            addCriterion("recedetail_custom3 between", value1, value2, "recedetailCustom3");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom3NotBetween(String value1, String value2) {
            addCriterion("recedetail_custom3 not between", value1, value2, "recedetailCustom3");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom4IsNull() {
            addCriterion("recedetail_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom4IsNotNull() {
            addCriterion("recedetail_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom4EqualTo(String value) {
            addCriterion("recedetail_custom4 =", value, "recedetailCustom4");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom4NotEqualTo(String value) {
            addCriterion("recedetail_custom4 <>", value, "recedetailCustom4");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom4GreaterThan(String value) {
            addCriterion("recedetail_custom4 >", value, "recedetailCustom4");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("recedetail_custom4 >=", value, "recedetailCustom4");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom4LessThan(String value) {
            addCriterion("recedetail_custom4 <", value, "recedetailCustom4");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom4LessThanOrEqualTo(String value) {
            addCriterion("recedetail_custom4 <=", value, "recedetailCustom4");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom4Like(String value) {
            addCriterion("recedetail_custom4 like", value, "recedetailCustom4");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom4NotLike(String value) {
            addCriterion("recedetail_custom4 not like", value, "recedetailCustom4");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom4In(List<String> values) {
            addCriterion("recedetail_custom4 in", values, "recedetailCustom4");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom4NotIn(List<String> values) {
            addCriterion("recedetail_custom4 not in", values, "recedetailCustom4");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom4Between(String value1, String value2) {
            addCriterion("recedetail_custom4 between", value1, value2, "recedetailCustom4");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom4NotBetween(String value1, String value2) {
            addCriterion("recedetail_custom4 not between", value1, value2, "recedetailCustom4");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom5IsNull() {
            addCriterion("recedetail_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom5IsNotNull() {
            addCriterion("recedetail_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom5EqualTo(String value) {
            addCriterion("recedetail_custom5 =", value, "recedetailCustom5");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom5NotEqualTo(String value) {
            addCriterion("recedetail_custom5 <>", value, "recedetailCustom5");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom5GreaterThan(String value) {
            addCriterion("recedetail_custom5 >", value, "recedetailCustom5");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("recedetail_custom5 >=", value, "recedetailCustom5");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom5LessThan(String value) {
            addCriterion("recedetail_custom5 <", value, "recedetailCustom5");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom5LessThanOrEqualTo(String value) {
            addCriterion("recedetail_custom5 <=", value, "recedetailCustom5");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom5Like(String value) {
            addCriterion("recedetail_custom5 like", value, "recedetailCustom5");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom5NotLike(String value) {
            addCriterion("recedetail_custom5 not like", value, "recedetailCustom5");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom5In(List<String> values) {
            addCriterion("recedetail_custom5 in", values, "recedetailCustom5");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom5NotIn(List<String> values) {
            addCriterion("recedetail_custom5 not in", values, "recedetailCustom5");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom5Between(String value1, String value2) {
            addCriterion("recedetail_custom5 between", value1, value2, "recedetailCustom5");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom5NotBetween(String value1, String value2) {
            addCriterion("recedetail_custom5 not between", value1, value2, "recedetailCustom5");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom6IsNull() {
            addCriterion("recedetail_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom6IsNotNull() {
            addCriterion("recedetail_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom6EqualTo(String value) {
            addCriterion("recedetail_custom6 =", value, "recedetailCustom6");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom6NotEqualTo(String value) {
            addCriterion("recedetail_custom6 <>", value, "recedetailCustom6");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom6GreaterThan(String value) {
            addCriterion("recedetail_custom6 >", value, "recedetailCustom6");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("recedetail_custom6 >=", value, "recedetailCustom6");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom6LessThan(String value) {
            addCriterion("recedetail_custom6 <", value, "recedetailCustom6");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom6LessThanOrEqualTo(String value) {
            addCriterion("recedetail_custom6 <=", value, "recedetailCustom6");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom6Like(String value) {
            addCriterion("recedetail_custom6 like", value, "recedetailCustom6");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom6NotLike(String value) {
            addCriterion("recedetail_custom6 not like", value, "recedetailCustom6");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom6In(List<String> values) {
            addCriterion("recedetail_custom6 in", values, "recedetailCustom6");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom6NotIn(List<String> values) {
            addCriterion("recedetail_custom6 not in", values, "recedetailCustom6");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom6Between(String value1, String value2) {
            addCriterion("recedetail_custom6 between", value1, value2, "recedetailCustom6");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom6NotBetween(String value1, String value2) {
            addCriterion("recedetail_custom6 not between", value1, value2, "recedetailCustom6");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom7IsNull() {
            addCriterion("recedetail_custom7 is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom7IsNotNull() {
            addCriterion("recedetail_custom7 is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom7EqualTo(String value) {
            addCriterion("recedetail_custom7 =", value, "recedetailCustom7");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom7NotEqualTo(String value) {
            addCriterion("recedetail_custom7 <>", value, "recedetailCustom7");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom7GreaterThan(String value) {
            addCriterion("recedetail_custom7 >", value, "recedetailCustom7");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom7GreaterThanOrEqualTo(String value) {
            addCriterion("recedetail_custom7 >=", value, "recedetailCustom7");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom7LessThan(String value) {
            addCriterion("recedetail_custom7 <", value, "recedetailCustom7");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom7LessThanOrEqualTo(String value) {
            addCriterion("recedetail_custom7 <=", value, "recedetailCustom7");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom7Like(String value) {
            addCriterion("recedetail_custom7 like", value, "recedetailCustom7");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom7NotLike(String value) {
            addCriterion("recedetail_custom7 not like", value, "recedetailCustom7");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom7In(List<String> values) {
            addCriterion("recedetail_custom7 in", values, "recedetailCustom7");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom7NotIn(List<String> values) {
            addCriterion("recedetail_custom7 not in", values, "recedetailCustom7");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom7Between(String value1, String value2) {
            addCriterion("recedetail_custom7 between", value1, value2, "recedetailCustom7");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom7NotBetween(String value1, String value2) {
            addCriterion("recedetail_custom7 not between", value1, value2, "recedetailCustom7");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom8IsNull() {
            addCriterion("recedetail_custom8 is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom8IsNotNull() {
            addCriterion("recedetail_custom8 is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom8EqualTo(String value) {
            addCriterion("recedetail_custom8 =", value, "recedetailCustom8");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom8NotEqualTo(String value) {
            addCriterion("recedetail_custom8 <>", value, "recedetailCustom8");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom8GreaterThan(String value) {
            addCriterion("recedetail_custom8 >", value, "recedetailCustom8");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom8GreaterThanOrEqualTo(String value) {
            addCriterion("recedetail_custom8 >=", value, "recedetailCustom8");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom8LessThan(String value) {
            addCriterion("recedetail_custom8 <", value, "recedetailCustom8");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom8LessThanOrEqualTo(String value) {
            addCriterion("recedetail_custom8 <=", value, "recedetailCustom8");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom8Like(String value) {
            addCriterion("recedetail_custom8 like", value, "recedetailCustom8");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom8NotLike(String value) {
            addCriterion("recedetail_custom8 not like", value, "recedetailCustom8");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom8In(List<String> values) {
            addCriterion("recedetail_custom8 in", values, "recedetailCustom8");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom8NotIn(List<String> values) {
            addCriterion("recedetail_custom8 not in", values, "recedetailCustom8");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom8Between(String value1, String value2) {
            addCriterion("recedetail_custom8 between", value1, value2, "recedetailCustom8");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom8NotBetween(String value1, String value2) {
            addCriterion("recedetail_custom8 not between", value1, value2, "recedetailCustom8");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom9IsNull() {
            addCriterion("recedetail_custom9 is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom9IsNotNull() {
            addCriterion("recedetail_custom9 is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom9EqualTo(String value) {
            addCriterion("recedetail_custom9 =", value, "recedetailCustom9");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom9NotEqualTo(String value) {
            addCriterion("recedetail_custom9 <>", value, "recedetailCustom9");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom9GreaterThan(String value) {
            addCriterion("recedetail_custom9 >", value, "recedetailCustom9");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom9GreaterThanOrEqualTo(String value) {
            addCriterion("recedetail_custom9 >=", value, "recedetailCustom9");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom9LessThan(String value) {
            addCriterion("recedetail_custom9 <", value, "recedetailCustom9");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom9LessThanOrEqualTo(String value) {
            addCriterion("recedetail_custom9 <=", value, "recedetailCustom9");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom9Like(String value) {
            addCriterion("recedetail_custom9 like", value, "recedetailCustom9");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom9NotLike(String value) {
            addCriterion("recedetail_custom9 not like", value, "recedetailCustom9");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom9In(List<String> values) {
            addCriterion("recedetail_custom9 in", values, "recedetailCustom9");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom9NotIn(List<String> values) {
            addCriterion("recedetail_custom9 not in", values, "recedetailCustom9");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom9Between(String value1, String value2) {
            addCriterion("recedetail_custom9 between", value1, value2, "recedetailCustom9");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom9NotBetween(String value1, String value2) {
            addCriterion("recedetail_custom9 not between", value1, value2, "recedetailCustom9");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom10IsNull() {
            addCriterion("recedetail_custom10 is null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom10IsNotNull() {
            addCriterion("recedetail_custom10 is not null");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom10EqualTo(String value) {
            addCriterion("recedetail_custom10 =", value, "recedetailCustom10");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom10NotEqualTo(String value) {
            addCriterion("recedetail_custom10 <>", value, "recedetailCustom10");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom10GreaterThan(String value) {
            addCriterion("recedetail_custom10 >", value, "recedetailCustom10");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom10GreaterThanOrEqualTo(String value) {
            addCriterion("recedetail_custom10 >=", value, "recedetailCustom10");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom10LessThan(String value) {
            addCriterion("recedetail_custom10 <", value, "recedetailCustom10");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom10LessThanOrEqualTo(String value) {
            addCriterion("recedetail_custom10 <=", value, "recedetailCustom10");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom10Like(String value) {
            addCriterion("recedetail_custom10 like", value, "recedetailCustom10");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom10NotLike(String value) {
            addCriterion("recedetail_custom10 not like", value, "recedetailCustom10");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom10In(List<String> values) {
            addCriterion("recedetail_custom10 in", values, "recedetailCustom10");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom10NotIn(List<String> values) {
            addCriterion("recedetail_custom10 not in", values, "recedetailCustom10");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom10Between(String value1, String value2) {
            addCriterion("recedetail_custom10 between", value1, value2, "recedetailCustom10");
            return (Criteria) this;
        }

        public Criteria andRecedetailCustom10NotBetween(String value1, String value2) {
            addCriterion("recedetail_custom10 not between", value1, value2, "recedetailCustom10");
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