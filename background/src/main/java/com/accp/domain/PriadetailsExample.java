package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PriadetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PriadetailsExample() {
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

        public Criteria andPriadetailsIdIsNull() {
            addCriterion("Priadetails_id is null");
            return (Criteria) this;
        }

        public Criteria andPriadetailsIdIsNotNull() {
            addCriterion("Priadetails_id is not null");
            return (Criteria) this;
        }

        public Criteria andPriadetailsIdEqualTo(String value) {
            addCriterion("Priadetails_id =", value, "priadetailsId");
            return (Criteria) this;
        }

        public Criteria andPriadetailsIdNotEqualTo(String value) {
            addCriterion("Priadetails_id <>", value, "priadetailsId");
            return (Criteria) this;
        }

        public Criteria andPriadetailsIdGreaterThan(String value) {
            addCriterion("Priadetails_id >", value, "priadetailsId");
            return (Criteria) this;
        }

        public Criteria andPriadetailsIdGreaterThanOrEqualTo(String value) {
            addCriterion("Priadetails_id >=", value, "priadetailsId");
            return (Criteria) this;
        }

        public Criteria andPriadetailsIdLessThan(String value) {
            addCriterion("Priadetails_id <", value, "priadetailsId");
            return (Criteria) this;
        }

        public Criteria andPriadetailsIdLessThanOrEqualTo(String value) {
            addCriterion("Priadetails_id <=", value, "priadetailsId");
            return (Criteria) this;
        }

        public Criteria andPriadetailsIdLike(String value) {
            addCriterion("Priadetails_id like", value, "priadetailsId");
            return (Criteria) this;
        }

        public Criteria andPriadetailsIdNotLike(String value) {
            addCriterion("Priadetails_id not like", value, "priadetailsId");
            return (Criteria) this;
        }

        public Criteria andPriadetailsIdIn(List<String> values) {
            addCriterion("Priadetails_id in", values, "priadetailsId");
            return (Criteria) this;
        }

        public Criteria andPriadetailsIdNotIn(List<String> values) {
            addCriterion("Priadetails_id not in", values, "priadetailsId");
            return (Criteria) this;
        }

        public Criteria andPriadetailsIdBetween(String value1, String value2) {
            addCriterion("Priadetails_id between", value1, value2, "priadetailsId");
            return (Criteria) this;
        }

        public Criteria andPriadetailsIdNotBetween(String value1, String value2) {
            addCriterion("Priadetails_id not between", value1, value2, "priadetailsId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdIsNull() {
            addCriterion("Priabill_id is null");
            return (Criteria) this;
        }

        public Criteria andPriabillIdIsNotNull() {
            addCriterion("Priabill_id is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillIdEqualTo(String value) {
            addCriterion("Priabill_id =", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdNotEqualTo(String value) {
            addCriterion("Priabill_id <>", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdGreaterThan(String value) {
            addCriterion("Priabill_id >", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdGreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_id >=", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdLessThan(String value) {
            addCriterion("Priabill_id <", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdLessThanOrEqualTo(String value) {
            addCriterion("Priabill_id <=", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdLike(String value) {
            addCriterion("Priabill_id like", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdNotLike(String value) {
            addCriterion("Priabill_id not like", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdIn(List<String> values) {
            addCriterion("Priabill_id in", values, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdNotIn(List<String> values) {
            addCriterion("Priabill_id not in", values, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdBetween(String value1, String value2) {
            addCriterion("Priabill_id between", value1, value2, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdNotBetween(String value1, String value2) {
            addCriterion("Priabill_id not between", value1, value2, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillPriceIsNull() {
            addCriterion("Priabill_price is null");
            return (Criteria) this;
        }

        public Criteria andPriabillPriceIsNotNull() {
            addCriterion("Priabill_price is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillPriceEqualTo(Float value) {
            addCriterion("Priabill_price =", value, "priabillPrice");
            return (Criteria) this;
        }

        public Criteria andPriabillPriceNotEqualTo(Float value) {
            addCriterion("Priabill_price <>", value, "priabillPrice");
            return (Criteria) this;
        }

        public Criteria andPriabillPriceGreaterThan(Float value) {
            addCriterion("Priabill_price >", value, "priabillPrice");
            return (Criteria) this;
        }

        public Criteria andPriabillPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("Priabill_price >=", value, "priabillPrice");
            return (Criteria) this;
        }

        public Criteria andPriabillPriceLessThan(Float value) {
            addCriterion("Priabill_price <", value, "priabillPrice");
            return (Criteria) this;
        }

        public Criteria andPriabillPriceLessThanOrEqualTo(Float value) {
            addCriterion("Priabill_price <=", value, "priabillPrice");
            return (Criteria) this;
        }

        public Criteria andPriabillPriceIn(List<Float> values) {
            addCriterion("Priabill_price in", values, "priabillPrice");
            return (Criteria) this;
        }

        public Criteria andPriabillPriceNotIn(List<Float> values) {
            addCriterion("Priabill_price not in", values, "priabillPrice");
            return (Criteria) this;
        }

        public Criteria andPriabillPriceBetween(Float value1, Float value2) {
            addCriterion("Priabill_price between", value1, value2, "priabillPrice");
            return (Criteria) this;
        }

        public Criteria andPriabillPriceNotBetween(Float value1, Float value2) {
            addCriterion("Priabill_price not between", value1, value2, "priabillPrice");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeIsNull() {
            addCriterion("Priabill_type is null");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeIsNotNull() {
            addCriterion("Priabill_type is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeEqualTo(String value) {
            addCriterion("Priabill_type =", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeNotEqualTo(String value) {
            addCriterion("Priabill_type <>", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeGreaterThan(String value) {
            addCriterion("Priabill_type >", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_type >=", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeLessThan(String value) {
            addCriterion("Priabill_type <", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeLessThanOrEqualTo(String value) {
            addCriterion("Priabill_type <=", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeLike(String value) {
            addCriterion("Priabill_type like", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeNotLike(String value) {
            addCriterion("Priabill_type not like", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeIn(List<String> values) {
            addCriterion("Priabill_type in", values, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeNotIn(List<String> values) {
            addCriterion("Priabill_type not in", values, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeBetween(String value1, String value2) {
            addCriterion("Priabill_type between", value1, value2, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeNotBetween(String value1, String value2) {
            addCriterion("Priabill_type not between", value1, value2, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberIsNull() {
            addCriterion("Priabill_number is null");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberIsNotNull() {
            addCriterion("Priabill_number is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberEqualTo(String value) {
            addCriterion("Priabill_number =", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberNotEqualTo(String value) {
            addCriterion("Priabill_number <>", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberGreaterThan(String value) {
            addCriterion("Priabill_number >", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_number >=", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberLessThan(String value) {
            addCriterion("Priabill_number <", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberLessThanOrEqualTo(String value) {
            addCriterion("Priabill_number <=", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberLike(String value) {
            addCriterion("Priabill_number like", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberNotLike(String value) {
            addCriterion("Priabill_number not like", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberIn(List<String> values) {
            addCriterion("Priabill_number in", values, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberNotIn(List<String> values) {
            addCriterion("Priabill_number not in", values, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberBetween(String value1, String value2) {
            addCriterion("Priabill_number between", value1, value2, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberNotBetween(String value1, String value2) {
            addCriterion("Priabill_number not between", value1, value2, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksIsNull() {
            addCriterion("Priabill_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksIsNotNull() {
            addCriterion("Priabill_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksEqualTo(String value) {
            addCriterion("Priabill_remarks =", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksNotEqualTo(String value) {
            addCriterion("Priabill_remarks <>", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksGreaterThan(String value) {
            addCriterion("Priabill_remarks >", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_remarks >=", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksLessThan(String value) {
            addCriterion("Priabill_remarks <", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksLessThanOrEqualTo(String value) {
            addCriterion("Priabill_remarks <=", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksLike(String value) {
            addCriterion("Priabill_remarks like", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksNotLike(String value) {
            addCriterion("Priabill_remarks not like", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksIn(List<String> values) {
            addCriterion("Priabill_remarks in", values, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksNotIn(List<String> values) {
            addCriterion("Priabill_remarks not in", values, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksBetween(String value1, String value2) {
            addCriterion("Priabill_remarks between", value1, value2, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksNotBetween(String value1, String value2) {
            addCriterion("Priabill_remarks not between", value1, value2, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingIsNull() {
            addCriterion("Priabill_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingIsNotNull() {
            addCriterion("Priabill_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingEqualTo(String value) {
            addCriterion("Priabill_Auditing =", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingNotEqualTo(String value) {
            addCriterion("Priabill_Auditing <>", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingGreaterThan(String value) {
            addCriterion("Priabill_Auditing >", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_Auditing >=", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingLessThan(String value) {
            addCriterion("Priabill_Auditing <", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingLessThanOrEqualTo(String value) {
            addCriterion("Priabill_Auditing <=", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingLike(String value) {
            addCriterion("Priabill_Auditing like", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingNotLike(String value) {
            addCriterion("Priabill_Auditing not like", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingIn(List<String> values) {
            addCriterion("Priabill_Auditing in", values, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingNotIn(List<String> values) {
            addCriterion("Priabill_Auditing not in", values, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingBetween(String value1, String value2) {
            addCriterion("Priabill_Auditing between", value1, value2, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingNotBetween(String value1, String value2) {
            addCriterion("Priabill_Auditing not between", value1, value2, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillYnIsNull() {
            addCriterion("Priabill_yn is null");
            return (Criteria) this;
        }

        public Criteria andPriabillYnIsNotNull() {
            addCriterion("Priabill_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillYnEqualTo(String value) {
            addCriterion("Priabill_yn =", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnNotEqualTo(String value) {
            addCriterion("Priabill_yn <>", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnGreaterThan(String value) {
            addCriterion("Priabill_yn >", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnGreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_yn >=", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnLessThan(String value) {
            addCriterion("Priabill_yn <", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnLessThanOrEqualTo(String value) {
            addCriterion("Priabill_yn <=", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnLike(String value) {
            addCriterion("Priabill_yn like", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnNotLike(String value) {
            addCriterion("Priabill_yn not like", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnIn(List<String> values) {
            addCriterion("Priabill_yn in", values, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnNotIn(List<String> values) {
            addCriterion("Priabill_yn not in", values, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnBetween(String value1, String value2) {
            addCriterion("Priabill_yn between", value1, value2, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnNotBetween(String value1, String value2) {
            addCriterion("Priabill_yn not between", value1, value2, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom1IsNull() {
            addCriterion("Priabill_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom1IsNotNull() {
            addCriterion("Priabill_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom1EqualTo(String value) {
            addCriterion("Priabill_custom1 =", value, "priabillCustom1");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom1NotEqualTo(String value) {
            addCriterion("Priabill_custom1 <>", value, "priabillCustom1");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom1GreaterThan(String value) {
            addCriterion("Priabill_custom1 >", value, "priabillCustom1");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_custom1 >=", value, "priabillCustom1");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom1LessThan(String value) {
            addCriterion("Priabill_custom1 <", value, "priabillCustom1");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom1LessThanOrEqualTo(String value) {
            addCriterion("Priabill_custom1 <=", value, "priabillCustom1");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom1Like(String value) {
            addCriterion("Priabill_custom1 like", value, "priabillCustom1");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom1NotLike(String value) {
            addCriterion("Priabill_custom1 not like", value, "priabillCustom1");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom1In(List<String> values) {
            addCriterion("Priabill_custom1 in", values, "priabillCustom1");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom1NotIn(List<String> values) {
            addCriterion("Priabill_custom1 not in", values, "priabillCustom1");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom1Between(String value1, String value2) {
            addCriterion("Priabill_custom1 between", value1, value2, "priabillCustom1");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom1NotBetween(String value1, String value2) {
            addCriterion("Priabill_custom1 not between", value1, value2, "priabillCustom1");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2IsNull() {
            addCriterion("Priabill_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2IsNotNull() {
            addCriterion("Priabill_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2EqualTo(String value) {
            addCriterion("Priabill_custom2 =", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2NotEqualTo(String value) {
            addCriterion("Priabill_custom2 <>", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2GreaterThan(String value) {
            addCriterion("Priabill_custom2 >", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_custom2 >=", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2LessThan(String value) {
            addCriterion("Priabill_custom2 <", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2LessThanOrEqualTo(String value) {
            addCriterion("Priabill_custom2 <=", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2Like(String value) {
            addCriterion("Priabill_custom2 like", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2NotLike(String value) {
            addCriterion("Priabill_custom2 not like", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2In(List<String> values) {
            addCriterion("Priabill_custom2 in", values, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2NotIn(List<String> values) {
            addCriterion("Priabill_custom2 not in", values, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2Between(String value1, String value2) {
            addCriterion("Priabill_custom2 between", value1, value2, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2NotBetween(String value1, String value2) {
            addCriterion("Priabill_custom2 not between", value1, value2, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3IsNull() {
            addCriterion("Priabill_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3IsNotNull() {
            addCriterion("Priabill_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3EqualTo(String value) {
            addCriterion("Priabill_custom3 =", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3NotEqualTo(String value) {
            addCriterion("Priabill_custom3 <>", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3GreaterThan(String value) {
            addCriterion("Priabill_custom3 >", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_custom3 >=", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3LessThan(String value) {
            addCriterion("Priabill_custom3 <", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3LessThanOrEqualTo(String value) {
            addCriterion("Priabill_custom3 <=", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3Like(String value) {
            addCriterion("Priabill_custom3 like", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3NotLike(String value) {
            addCriterion("Priabill_custom3 not like", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3In(List<String> values) {
            addCriterion("Priabill_custom3 in", values, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3NotIn(List<String> values) {
            addCriterion("Priabill_custom3 not in", values, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3Between(String value1, String value2) {
            addCriterion("Priabill_custom3 between", value1, value2, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3NotBetween(String value1, String value2) {
            addCriterion("Priabill_custom3 not between", value1, value2, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4IsNull() {
            addCriterion("Priabill_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4IsNotNull() {
            addCriterion("Priabill_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4EqualTo(String value) {
            addCriterion("Priabill_custom4 =", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4NotEqualTo(String value) {
            addCriterion("Priabill_custom4 <>", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4GreaterThan(String value) {
            addCriterion("Priabill_custom4 >", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_custom4 >=", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4LessThan(String value) {
            addCriterion("Priabill_custom4 <", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4LessThanOrEqualTo(String value) {
            addCriterion("Priabill_custom4 <=", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4Like(String value) {
            addCriterion("Priabill_custom4 like", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4NotLike(String value) {
            addCriterion("Priabill_custom4 not like", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4In(List<String> values) {
            addCriterion("Priabill_custom4 in", values, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4NotIn(List<String> values) {
            addCriterion("Priabill_custom4 not in", values, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4Between(String value1, String value2) {
            addCriterion("Priabill_custom4 between", value1, value2, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4NotBetween(String value1, String value2) {
            addCriterion("Priabill_custom4 not between", value1, value2, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5IsNull() {
            addCriterion("Priabill_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5IsNotNull() {
            addCriterion("Priabill_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5EqualTo(String value) {
            addCriterion("Priabill_custom5 =", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5NotEqualTo(String value) {
            addCriterion("Priabill_custom5 <>", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5GreaterThan(String value) {
            addCriterion("Priabill_custom5 >", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_custom5 >=", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5LessThan(String value) {
            addCriterion("Priabill_custom5 <", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5LessThanOrEqualTo(String value) {
            addCriterion("Priabill_custom5 <=", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5Like(String value) {
            addCriterion("Priabill_custom5 like", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5NotLike(String value) {
            addCriterion("Priabill_custom5 not like", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5In(List<String> values) {
            addCriterion("Priabill_custom5 in", values, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5NotIn(List<String> values) {
            addCriterion("Priabill_custom5 not in", values, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5Between(String value1, String value2) {
            addCriterion("Priabill_custom5 between", value1, value2, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5NotBetween(String value1, String value2) {
            addCriterion("Priabill_custom5 not between", value1, value2, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6IsNull() {
            addCriterion("Priabill_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6IsNotNull() {
            addCriterion("Priabill_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6EqualTo(String value) {
            addCriterion("Priabill_custom6 =", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6NotEqualTo(String value) {
            addCriterion("Priabill_custom6 <>", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6GreaterThan(String value) {
            addCriterion("Priabill_custom6 >", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_custom6 >=", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6LessThan(String value) {
            addCriterion("Priabill_custom6 <", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6LessThanOrEqualTo(String value) {
            addCriterion("Priabill_custom6 <=", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6Like(String value) {
            addCriterion("Priabill_custom6 like", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6NotLike(String value) {
            addCriterion("Priabill_custom6 not like", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6In(List<String> values) {
            addCriterion("Priabill_custom6 in", values, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6NotIn(List<String> values) {
            addCriterion("Priabill_custom6 not in", values, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6Between(String value1, String value2) {
            addCriterion("Priabill_custom6 between", value1, value2, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6NotBetween(String value1, String value2) {
            addCriterion("Priabill_custom6 not between", value1, value2, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7IsNull() {
            addCriterion("Priabill_custom7 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7IsNotNull() {
            addCriterion("Priabill_custom7 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7EqualTo(String value) {
            addCriterion("Priabill_custom7 =", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7NotEqualTo(String value) {
            addCriterion("Priabill_custom7 <>", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7GreaterThan(String value) {
            addCriterion("Priabill_custom7 >", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7GreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_custom7 >=", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7LessThan(String value) {
            addCriterion("Priabill_custom7 <", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7LessThanOrEqualTo(String value) {
            addCriterion("Priabill_custom7 <=", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7Like(String value) {
            addCriterion("Priabill_custom7 like", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7NotLike(String value) {
            addCriterion("Priabill_custom7 not like", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7In(List<String> values) {
            addCriterion("Priabill_custom7 in", values, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7NotIn(List<String> values) {
            addCriterion("Priabill_custom7 not in", values, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7Between(String value1, String value2) {
            addCriterion("Priabill_custom7 between", value1, value2, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7NotBetween(String value1, String value2) {
            addCriterion("Priabill_custom7 not between", value1, value2, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8IsNull() {
            addCriterion("Priabill_custom8 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8IsNotNull() {
            addCriterion("Priabill_custom8 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8EqualTo(String value) {
            addCriterion("Priabill_custom8 =", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8NotEqualTo(String value) {
            addCriterion("Priabill_custom8 <>", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8GreaterThan(String value) {
            addCriterion("Priabill_custom8 >", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8GreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_custom8 >=", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8LessThan(String value) {
            addCriterion("Priabill_custom8 <", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8LessThanOrEqualTo(String value) {
            addCriterion("Priabill_custom8 <=", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8Like(String value) {
            addCriterion("Priabill_custom8 like", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8NotLike(String value) {
            addCriterion("Priabill_custom8 not like", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8In(List<String> values) {
            addCriterion("Priabill_custom8 in", values, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8NotIn(List<String> values) {
            addCriterion("Priabill_custom8 not in", values, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8Between(String value1, String value2) {
            addCriterion("Priabill_custom8 between", value1, value2, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8NotBetween(String value1, String value2) {
            addCriterion("Priabill_custom8 not between", value1, value2, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9IsNull() {
            addCriterion("Priabill_custom9 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9IsNotNull() {
            addCriterion("Priabill_custom9 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9EqualTo(String value) {
            addCriterion("Priabill_custom9 =", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9NotEqualTo(String value) {
            addCriterion("Priabill_custom9 <>", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9GreaterThan(String value) {
            addCriterion("Priabill_custom9 >", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9GreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_custom9 >=", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9LessThan(String value) {
            addCriterion("Priabill_custom9 <", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9LessThanOrEqualTo(String value) {
            addCriterion("Priabill_custom9 <=", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9Like(String value) {
            addCriterion("Priabill_custom9 like", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9NotLike(String value) {
            addCriterion("Priabill_custom9 not like", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9In(List<String> values) {
            addCriterion("Priabill_custom9 in", values, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9NotIn(List<String> values) {
            addCriterion("Priabill_custom9 not in", values, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9Between(String value1, String value2) {
            addCriterion("Priabill_custom9 between", value1, value2, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9NotBetween(String value1, String value2) {
            addCriterion("Priabill_custom9 not between", value1, value2, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10IsNull() {
            addCriterion("Priabill_custom10 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10IsNotNull() {
            addCriterion("Priabill_custom10 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10EqualTo(String value) {
            addCriterion("Priabill_custom10 =", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10NotEqualTo(String value) {
            addCriterion("Priabill_custom10 <>", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10GreaterThan(String value) {
            addCriterion("Priabill_custom10 >", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10GreaterThanOrEqualTo(String value) {
            addCriterion("Priabill_custom10 >=", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10LessThan(String value) {
            addCriterion("Priabill_custom10 <", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10LessThanOrEqualTo(String value) {
            addCriterion("Priabill_custom10 <=", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10Like(String value) {
            addCriterion("Priabill_custom10 like", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10NotLike(String value) {
            addCriterion("Priabill_custom10 not like", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10In(List<String> values) {
            addCriterion("Priabill_custom10 in", values, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10NotIn(List<String> values) {
            addCriterion("Priabill_custom10 not in", values, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10Between(String value1, String value2) {
            addCriterion("Priabill_custom10 between", value1, value2, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10NotBetween(String value1, String value2) {
            addCriterion("Priabill_custom10 not between", value1, value2, "priabillCustom10");
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