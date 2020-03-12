package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ReferreceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReferreceExample() {
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

        public Criteria andReferreceIdIsNull() {
            addCriterion("referrece_id is null");
            return (Criteria) this;
        }

        public Criteria andReferreceIdIsNotNull() {
            addCriterion("referrece_id is not null");
            return (Criteria) this;
        }

        public Criteria andReferreceIdEqualTo(String value) {
            addCriterion("referrece_id =", value, "referreceId");
            return (Criteria) this;
        }

        public Criteria andReferreceIdNotEqualTo(String value) {
            addCriterion("referrece_id <>", value, "referreceId");
            return (Criteria) this;
        }

        public Criteria andReferreceIdGreaterThan(String value) {
            addCriterion("referrece_id >", value, "referreceId");
            return (Criteria) this;
        }

        public Criteria andReferreceIdGreaterThanOrEqualTo(String value) {
            addCriterion("referrece_id >=", value, "referreceId");
            return (Criteria) this;
        }

        public Criteria andReferreceIdLessThan(String value) {
            addCriterion("referrece_id <", value, "referreceId");
            return (Criteria) this;
        }

        public Criteria andReferreceIdLessThanOrEqualTo(String value) {
            addCriterion("referrece_id <=", value, "referreceId");
            return (Criteria) this;
        }

        public Criteria andReferreceIdLike(String value) {
            addCriterion("referrece_id like", value, "referreceId");
            return (Criteria) this;
        }

        public Criteria andReferreceIdNotLike(String value) {
            addCriterion("referrece_id not like", value, "referreceId");
            return (Criteria) this;
        }

        public Criteria andReferreceIdIn(List<String> values) {
            addCriterion("referrece_id in", values, "referreceId");
            return (Criteria) this;
        }

        public Criteria andReferreceIdNotIn(List<String> values) {
            addCriterion("referrece_id not in", values, "referreceId");
            return (Criteria) this;
        }

        public Criteria andReferreceIdBetween(String value1, String value2) {
            addCriterion("referrece_id between", value1, value2, "referreceId");
            return (Criteria) this;
        }

        public Criteria andReferreceIdNotBetween(String value1, String value2) {
            addCriterion("referrece_id not between", value1, value2, "referreceId");
            return (Criteria) this;
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

        public Criteria andReceivablesbillNumberIsNull() {
            addCriterion("receivablesbill_number is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillNumberIsNotNull() {
            addCriterion("receivablesbill_number is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillNumberEqualTo(String value) {
            addCriterion("receivablesbill_number =", value, "receivablesbillNumber");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillNumberNotEqualTo(String value) {
            addCriterion("receivablesbill_number <>", value, "receivablesbillNumber");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillNumberGreaterThan(String value) {
            addCriterion("receivablesbill_number >", value, "receivablesbillNumber");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillNumberGreaterThanOrEqualTo(String value) {
            addCriterion("receivablesbill_number >=", value, "receivablesbillNumber");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillNumberLessThan(String value) {
            addCriterion("receivablesbill_number <", value, "receivablesbillNumber");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillNumberLessThanOrEqualTo(String value) {
            addCriterion("receivablesbill_number <=", value, "receivablesbillNumber");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillNumberLike(String value) {
            addCriterion("receivablesbill_number like", value, "receivablesbillNumber");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillNumberNotLike(String value) {
            addCriterion("receivablesbill_number not like", value, "receivablesbillNumber");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillNumberIn(List<String> values) {
            addCriterion("receivablesbill_number in", values, "receivablesbillNumber");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillNumberNotIn(List<String> values) {
            addCriterion("receivablesbill_number not in", values, "receivablesbillNumber");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillNumberBetween(String value1, String value2) {
            addCriterion("receivablesbill_number between", value1, value2, "receivablesbillNumber");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillNumberNotBetween(String value1, String value2) {
            addCriterion("receivablesbill_number not between", value1, value2, "receivablesbillNumber");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillTypeIsNull() {
            addCriterion("receivablesbill_type is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillTypeIsNotNull() {
            addCriterion("receivablesbill_type is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillTypeEqualTo(String value) {
            addCriterion("receivablesbill_type =", value, "receivablesbillType");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillTypeNotEqualTo(String value) {
            addCriterion("receivablesbill_type <>", value, "receivablesbillType");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillTypeGreaterThan(String value) {
            addCriterion("receivablesbill_type >", value, "receivablesbillType");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("receivablesbill_type >=", value, "receivablesbillType");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillTypeLessThan(String value) {
            addCriterion("receivablesbill_type <", value, "receivablesbillType");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillTypeLessThanOrEqualTo(String value) {
            addCriterion("receivablesbill_type <=", value, "receivablesbillType");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillTypeLike(String value) {
            addCriterion("receivablesbill_type like", value, "receivablesbillType");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillTypeNotLike(String value) {
            addCriterion("receivablesbill_type not like", value, "receivablesbillType");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillTypeIn(List<String> values) {
            addCriterion("receivablesbill_type in", values, "receivablesbillType");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillTypeNotIn(List<String> values) {
            addCriterion("receivablesbill_type not in", values, "receivablesbillType");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillTypeBetween(String value1, String value2) {
            addCriterion("receivablesbill_type between", value1, value2, "receivablesbillType");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillTypeNotBetween(String value1, String value2) {
            addCriterion("receivablesbill_type not between", value1, value2, "receivablesbillType");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillAdvanceIsNull() {
            addCriterion("receivablesbill_advance is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillAdvanceIsNotNull() {
            addCriterion("receivablesbill_advance is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillAdvanceEqualTo(Float value) {
            addCriterion("receivablesbill_advance =", value, "receivablesbillAdvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillAdvanceNotEqualTo(Float value) {
            addCriterion("receivablesbill_advance <>", value, "receivablesbillAdvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillAdvanceGreaterThan(Float value) {
            addCriterion("receivablesbill_advance >", value, "receivablesbillAdvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillAdvanceGreaterThanOrEqualTo(Float value) {
            addCriterion("receivablesbill_advance >=", value, "receivablesbillAdvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillAdvanceLessThan(Float value) {
            addCriterion("receivablesbill_advance <", value, "receivablesbillAdvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillAdvanceLessThanOrEqualTo(Float value) {
            addCriterion("receivablesbill_advance <=", value, "receivablesbillAdvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillAdvanceIn(List<Float> values) {
            addCriterion("receivablesbill_advance in", values, "receivablesbillAdvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillAdvanceNotIn(List<Float> values) {
            addCriterion("receivablesbill_advance not in", values, "receivablesbillAdvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillAdvanceBetween(Float value1, Float value2) {
            addCriterion("receivablesbill_advance between", value1, value2, "receivablesbillAdvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillAdvanceNotBetween(Float value1, Float value2) {
            addCriterion("receivablesbill_advance not between", value1, value2, "receivablesbillAdvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillQyadvanceIsNull() {
            addCriterion("receivablesbill_qyadvance is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillQyadvanceIsNotNull() {
            addCriterion("receivablesbill_qyadvance is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillQyadvanceEqualTo(Float value) {
            addCriterion("receivablesbill_qyadvance =", value, "receivablesbillQyadvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillQyadvanceNotEqualTo(Float value) {
            addCriterion("receivablesbill_qyadvance <>", value, "receivablesbillQyadvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillQyadvanceGreaterThan(Float value) {
            addCriterion("receivablesbill_qyadvance >", value, "receivablesbillQyadvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillQyadvanceGreaterThanOrEqualTo(Float value) {
            addCriterion("receivablesbill_qyadvance >=", value, "receivablesbillQyadvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillQyadvanceLessThan(Float value) {
            addCriterion("receivablesbill_qyadvance <", value, "receivablesbillQyadvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillQyadvanceLessThanOrEqualTo(Float value) {
            addCriterion("receivablesbill_qyadvance <=", value, "receivablesbillQyadvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillQyadvanceIn(List<Float> values) {
            addCriterion("receivablesbill_qyadvance in", values, "receivablesbillQyadvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillQyadvanceNotIn(List<Float> values) {
            addCriterion("receivablesbill_qyadvance not in", values, "receivablesbillQyadvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillQyadvanceBetween(Float value1, Float value2) {
            addCriterion("receivablesbill_qyadvance between", value1, value2, "receivablesbillQyadvance");
            return (Criteria) this;
        }

        public Criteria andReceivablesbillQyadvanceNotBetween(Float value1, Float value2) {
            addCriterion("receivablesbill_qyadvance not between", value1, value2, "receivablesbillQyadvance");
            return (Criteria) this;
        }

        public Criteria andReferreceRemarksIsNull() {
            addCriterion("referrece_remarks is null");
            return (Criteria) this;
        }

        public Criteria andReferreceRemarksIsNotNull() {
            addCriterion("referrece_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andReferreceRemarksEqualTo(String value) {
            addCriterion("referrece_remarks =", value, "referreceRemarks");
            return (Criteria) this;
        }

        public Criteria andReferreceRemarksNotEqualTo(String value) {
            addCriterion("referrece_remarks <>", value, "referreceRemarks");
            return (Criteria) this;
        }

        public Criteria andReferreceRemarksGreaterThan(String value) {
            addCriterion("referrece_remarks >", value, "referreceRemarks");
            return (Criteria) this;
        }

        public Criteria andReferreceRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("referrece_remarks >=", value, "referreceRemarks");
            return (Criteria) this;
        }

        public Criteria andReferreceRemarksLessThan(String value) {
            addCriterion("referrece_remarks <", value, "referreceRemarks");
            return (Criteria) this;
        }

        public Criteria andReferreceRemarksLessThanOrEqualTo(String value) {
            addCriterion("referrece_remarks <=", value, "referreceRemarks");
            return (Criteria) this;
        }

        public Criteria andReferreceRemarksLike(String value) {
            addCriterion("referrece_remarks like", value, "referreceRemarks");
            return (Criteria) this;
        }

        public Criteria andReferreceRemarksNotLike(String value) {
            addCriterion("referrece_remarks not like", value, "referreceRemarks");
            return (Criteria) this;
        }

        public Criteria andReferreceRemarksIn(List<String> values) {
            addCriterion("referrece_remarks in", values, "referreceRemarks");
            return (Criteria) this;
        }

        public Criteria andReferreceRemarksNotIn(List<String> values) {
            addCriterion("referrece_remarks not in", values, "referreceRemarks");
            return (Criteria) this;
        }

        public Criteria andReferreceRemarksBetween(String value1, String value2) {
            addCriterion("referrece_remarks between", value1, value2, "referreceRemarks");
            return (Criteria) this;
        }

        public Criteria andReferreceRemarksNotBetween(String value1, String value2) {
            addCriterion("referrece_remarks not between", value1, value2, "referreceRemarks");
            return (Criteria) this;
        }

        public Criteria andReferreceAuditingIsNull() {
            addCriterion("referrece_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andReferreceAuditingIsNotNull() {
            addCriterion("referrece_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andReferreceAuditingEqualTo(String value) {
            addCriterion("referrece_Auditing =", value, "referreceAuditing");
            return (Criteria) this;
        }

        public Criteria andReferreceAuditingNotEqualTo(String value) {
            addCriterion("referrece_Auditing <>", value, "referreceAuditing");
            return (Criteria) this;
        }

        public Criteria andReferreceAuditingGreaterThan(String value) {
            addCriterion("referrece_Auditing >", value, "referreceAuditing");
            return (Criteria) this;
        }

        public Criteria andReferreceAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("referrece_Auditing >=", value, "referreceAuditing");
            return (Criteria) this;
        }

        public Criteria andReferreceAuditingLessThan(String value) {
            addCriterion("referrece_Auditing <", value, "referreceAuditing");
            return (Criteria) this;
        }

        public Criteria andReferreceAuditingLessThanOrEqualTo(String value) {
            addCriterion("referrece_Auditing <=", value, "referreceAuditing");
            return (Criteria) this;
        }

        public Criteria andReferreceAuditingLike(String value) {
            addCriterion("referrece_Auditing like", value, "referreceAuditing");
            return (Criteria) this;
        }

        public Criteria andReferreceAuditingNotLike(String value) {
            addCriterion("referrece_Auditing not like", value, "referreceAuditing");
            return (Criteria) this;
        }

        public Criteria andReferreceAuditingIn(List<String> values) {
            addCriterion("referrece_Auditing in", values, "referreceAuditing");
            return (Criteria) this;
        }

        public Criteria andReferreceAuditingNotIn(List<String> values) {
            addCriterion("referrece_Auditing not in", values, "referreceAuditing");
            return (Criteria) this;
        }

        public Criteria andReferreceAuditingBetween(String value1, String value2) {
            addCriterion("referrece_Auditing between", value1, value2, "referreceAuditing");
            return (Criteria) this;
        }

        public Criteria andReferreceAuditingNotBetween(String value1, String value2) {
            addCriterion("referrece_Auditing not between", value1, value2, "referreceAuditing");
            return (Criteria) this;
        }

        public Criteria andReferreceYnIsNull() {
            addCriterion("referrece_yn is null");
            return (Criteria) this;
        }

        public Criteria andReferreceYnIsNotNull() {
            addCriterion("referrece_yn is not null");
            return (Criteria) this;
        }

        public Criteria andReferreceYnEqualTo(String value) {
            addCriterion("referrece_yn =", value, "referreceYn");
            return (Criteria) this;
        }

        public Criteria andReferreceYnNotEqualTo(String value) {
            addCriterion("referrece_yn <>", value, "referreceYn");
            return (Criteria) this;
        }

        public Criteria andReferreceYnGreaterThan(String value) {
            addCriterion("referrece_yn >", value, "referreceYn");
            return (Criteria) this;
        }

        public Criteria andReferreceYnGreaterThanOrEqualTo(String value) {
            addCriterion("referrece_yn >=", value, "referreceYn");
            return (Criteria) this;
        }

        public Criteria andReferreceYnLessThan(String value) {
            addCriterion("referrece_yn <", value, "referreceYn");
            return (Criteria) this;
        }

        public Criteria andReferreceYnLessThanOrEqualTo(String value) {
            addCriterion("referrece_yn <=", value, "referreceYn");
            return (Criteria) this;
        }

        public Criteria andReferreceYnLike(String value) {
            addCriterion("referrece_yn like", value, "referreceYn");
            return (Criteria) this;
        }

        public Criteria andReferreceYnNotLike(String value) {
            addCriterion("referrece_yn not like", value, "referreceYn");
            return (Criteria) this;
        }

        public Criteria andReferreceYnIn(List<String> values) {
            addCriterion("referrece_yn in", values, "referreceYn");
            return (Criteria) this;
        }

        public Criteria andReferreceYnNotIn(List<String> values) {
            addCriterion("referrece_yn not in", values, "referreceYn");
            return (Criteria) this;
        }

        public Criteria andReferreceYnBetween(String value1, String value2) {
            addCriterion("referrece_yn between", value1, value2, "referreceYn");
            return (Criteria) this;
        }

        public Criteria andReferreceYnNotBetween(String value1, String value2) {
            addCriterion("referrece_yn not between", value1, value2, "referreceYn");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom1IsNull() {
            addCriterion("referrece_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom1IsNotNull() {
            addCriterion("referrece_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom1EqualTo(String value) {
            addCriterion("referrece_custom1 =", value, "referreceCustom1");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom1NotEqualTo(String value) {
            addCriterion("referrece_custom1 <>", value, "referreceCustom1");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom1GreaterThan(String value) {
            addCriterion("referrece_custom1 >", value, "referreceCustom1");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("referrece_custom1 >=", value, "referreceCustom1");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom1LessThan(String value) {
            addCriterion("referrece_custom1 <", value, "referreceCustom1");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom1LessThanOrEqualTo(String value) {
            addCriterion("referrece_custom1 <=", value, "referreceCustom1");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom1Like(String value) {
            addCriterion("referrece_custom1 like", value, "referreceCustom1");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom1NotLike(String value) {
            addCriterion("referrece_custom1 not like", value, "referreceCustom1");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom1In(List<String> values) {
            addCriterion("referrece_custom1 in", values, "referreceCustom1");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom1NotIn(List<String> values) {
            addCriterion("referrece_custom1 not in", values, "referreceCustom1");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom1Between(String value1, String value2) {
            addCriterion("referrece_custom1 between", value1, value2, "referreceCustom1");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom1NotBetween(String value1, String value2) {
            addCriterion("referrece_custom1 not between", value1, value2, "referreceCustom1");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom2IsNull() {
            addCriterion("referrece_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom2IsNotNull() {
            addCriterion("referrece_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom2EqualTo(String value) {
            addCriterion("referrece_custom2 =", value, "referreceCustom2");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom2NotEqualTo(String value) {
            addCriterion("referrece_custom2 <>", value, "referreceCustom2");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom2GreaterThan(String value) {
            addCriterion("referrece_custom2 >", value, "referreceCustom2");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("referrece_custom2 >=", value, "referreceCustom2");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom2LessThan(String value) {
            addCriterion("referrece_custom2 <", value, "referreceCustom2");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom2LessThanOrEqualTo(String value) {
            addCriterion("referrece_custom2 <=", value, "referreceCustom2");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom2Like(String value) {
            addCriterion("referrece_custom2 like", value, "referreceCustom2");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom2NotLike(String value) {
            addCriterion("referrece_custom2 not like", value, "referreceCustom2");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom2In(List<String> values) {
            addCriterion("referrece_custom2 in", values, "referreceCustom2");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom2NotIn(List<String> values) {
            addCriterion("referrece_custom2 not in", values, "referreceCustom2");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom2Between(String value1, String value2) {
            addCriterion("referrece_custom2 between", value1, value2, "referreceCustom2");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom2NotBetween(String value1, String value2) {
            addCriterion("referrece_custom2 not between", value1, value2, "referreceCustom2");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom3IsNull() {
            addCriterion("referrece_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom3IsNotNull() {
            addCriterion("referrece_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom3EqualTo(String value) {
            addCriterion("referrece_custom3 =", value, "referreceCustom3");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom3NotEqualTo(String value) {
            addCriterion("referrece_custom3 <>", value, "referreceCustom3");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom3GreaterThan(String value) {
            addCriterion("referrece_custom3 >", value, "referreceCustom3");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("referrece_custom3 >=", value, "referreceCustom3");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom3LessThan(String value) {
            addCriterion("referrece_custom3 <", value, "referreceCustom3");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom3LessThanOrEqualTo(String value) {
            addCriterion("referrece_custom3 <=", value, "referreceCustom3");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom3Like(String value) {
            addCriterion("referrece_custom3 like", value, "referreceCustom3");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom3NotLike(String value) {
            addCriterion("referrece_custom3 not like", value, "referreceCustom3");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom3In(List<String> values) {
            addCriterion("referrece_custom3 in", values, "referreceCustom3");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom3NotIn(List<String> values) {
            addCriterion("referrece_custom3 not in", values, "referreceCustom3");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom3Between(String value1, String value2) {
            addCriterion("referrece_custom3 between", value1, value2, "referreceCustom3");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom3NotBetween(String value1, String value2) {
            addCriterion("referrece_custom3 not between", value1, value2, "referreceCustom3");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom4IsNull() {
            addCriterion("referrece_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom4IsNotNull() {
            addCriterion("referrece_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom4EqualTo(String value) {
            addCriterion("referrece_custom4 =", value, "referreceCustom4");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom4NotEqualTo(String value) {
            addCriterion("referrece_custom4 <>", value, "referreceCustom4");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom4GreaterThan(String value) {
            addCriterion("referrece_custom4 >", value, "referreceCustom4");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("referrece_custom4 >=", value, "referreceCustom4");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom4LessThan(String value) {
            addCriterion("referrece_custom4 <", value, "referreceCustom4");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom4LessThanOrEqualTo(String value) {
            addCriterion("referrece_custom4 <=", value, "referreceCustom4");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom4Like(String value) {
            addCriterion("referrece_custom4 like", value, "referreceCustom4");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom4NotLike(String value) {
            addCriterion("referrece_custom4 not like", value, "referreceCustom4");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom4In(List<String> values) {
            addCriterion("referrece_custom4 in", values, "referreceCustom4");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom4NotIn(List<String> values) {
            addCriterion("referrece_custom4 not in", values, "referreceCustom4");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom4Between(String value1, String value2) {
            addCriterion("referrece_custom4 between", value1, value2, "referreceCustom4");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom4NotBetween(String value1, String value2) {
            addCriterion("referrece_custom4 not between", value1, value2, "referreceCustom4");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom5IsNull() {
            addCriterion("referrece_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom5IsNotNull() {
            addCriterion("referrece_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom5EqualTo(String value) {
            addCriterion("referrece_custom5 =", value, "referreceCustom5");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom5NotEqualTo(String value) {
            addCriterion("referrece_custom5 <>", value, "referreceCustom5");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom5GreaterThan(String value) {
            addCriterion("referrece_custom5 >", value, "referreceCustom5");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("referrece_custom5 >=", value, "referreceCustom5");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom5LessThan(String value) {
            addCriterion("referrece_custom5 <", value, "referreceCustom5");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom5LessThanOrEqualTo(String value) {
            addCriterion("referrece_custom5 <=", value, "referreceCustom5");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom5Like(String value) {
            addCriterion("referrece_custom5 like", value, "referreceCustom5");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom5NotLike(String value) {
            addCriterion("referrece_custom5 not like", value, "referreceCustom5");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom5In(List<String> values) {
            addCriterion("referrece_custom5 in", values, "referreceCustom5");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom5NotIn(List<String> values) {
            addCriterion("referrece_custom5 not in", values, "referreceCustom5");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom5Between(String value1, String value2) {
            addCriterion("referrece_custom5 between", value1, value2, "referreceCustom5");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom5NotBetween(String value1, String value2) {
            addCriterion("referrece_custom5 not between", value1, value2, "referreceCustom5");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom6IsNull() {
            addCriterion("referrece_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom6IsNotNull() {
            addCriterion("referrece_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom6EqualTo(String value) {
            addCriterion("referrece_custom6 =", value, "referreceCustom6");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom6NotEqualTo(String value) {
            addCriterion("referrece_custom6 <>", value, "referreceCustom6");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom6GreaterThan(String value) {
            addCriterion("referrece_custom6 >", value, "referreceCustom6");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("referrece_custom6 >=", value, "referreceCustom6");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom6LessThan(String value) {
            addCriterion("referrece_custom6 <", value, "referreceCustom6");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom6LessThanOrEqualTo(String value) {
            addCriterion("referrece_custom6 <=", value, "referreceCustom6");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom6Like(String value) {
            addCriterion("referrece_custom6 like", value, "referreceCustom6");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom6NotLike(String value) {
            addCriterion("referrece_custom6 not like", value, "referreceCustom6");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom6In(List<String> values) {
            addCriterion("referrece_custom6 in", values, "referreceCustom6");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom6NotIn(List<String> values) {
            addCriterion("referrece_custom6 not in", values, "referreceCustom6");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom6Between(String value1, String value2) {
            addCriterion("referrece_custom6 between", value1, value2, "referreceCustom6");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom6NotBetween(String value1, String value2) {
            addCriterion("referrece_custom6 not between", value1, value2, "referreceCustom6");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom7IsNull() {
            addCriterion("referrece_custom7 is null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom7IsNotNull() {
            addCriterion("referrece_custom7 is not null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom7EqualTo(String value) {
            addCriterion("referrece_custom7 =", value, "referreceCustom7");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom7NotEqualTo(String value) {
            addCriterion("referrece_custom7 <>", value, "referreceCustom7");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom7GreaterThan(String value) {
            addCriterion("referrece_custom7 >", value, "referreceCustom7");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom7GreaterThanOrEqualTo(String value) {
            addCriterion("referrece_custom7 >=", value, "referreceCustom7");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom7LessThan(String value) {
            addCriterion("referrece_custom7 <", value, "referreceCustom7");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom7LessThanOrEqualTo(String value) {
            addCriterion("referrece_custom7 <=", value, "referreceCustom7");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom7Like(String value) {
            addCriterion("referrece_custom7 like", value, "referreceCustom7");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom7NotLike(String value) {
            addCriterion("referrece_custom7 not like", value, "referreceCustom7");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom7In(List<String> values) {
            addCriterion("referrece_custom7 in", values, "referreceCustom7");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom7NotIn(List<String> values) {
            addCriterion("referrece_custom7 not in", values, "referreceCustom7");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom7Between(String value1, String value2) {
            addCriterion("referrece_custom7 between", value1, value2, "referreceCustom7");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom7NotBetween(String value1, String value2) {
            addCriterion("referrece_custom7 not between", value1, value2, "referreceCustom7");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom8IsNull() {
            addCriterion("referrece_custom8 is null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom8IsNotNull() {
            addCriterion("referrece_custom8 is not null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom8EqualTo(String value) {
            addCriterion("referrece_custom8 =", value, "referreceCustom8");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom8NotEqualTo(String value) {
            addCriterion("referrece_custom8 <>", value, "referreceCustom8");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom8GreaterThan(String value) {
            addCriterion("referrece_custom8 >", value, "referreceCustom8");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom8GreaterThanOrEqualTo(String value) {
            addCriterion("referrece_custom8 >=", value, "referreceCustom8");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom8LessThan(String value) {
            addCriterion("referrece_custom8 <", value, "referreceCustom8");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom8LessThanOrEqualTo(String value) {
            addCriterion("referrece_custom8 <=", value, "referreceCustom8");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom8Like(String value) {
            addCriterion("referrece_custom8 like", value, "referreceCustom8");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom8NotLike(String value) {
            addCriterion("referrece_custom8 not like", value, "referreceCustom8");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom8In(List<String> values) {
            addCriterion("referrece_custom8 in", values, "referreceCustom8");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom8NotIn(List<String> values) {
            addCriterion("referrece_custom8 not in", values, "referreceCustom8");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom8Between(String value1, String value2) {
            addCriterion("referrece_custom8 between", value1, value2, "referreceCustom8");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom8NotBetween(String value1, String value2) {
            addCriterion("referrece_custom8 not between", value1, value2, "referreceCustom8");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom9IsNull() {
            addCriterion("referrece_custom9 is null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom9IsNotNull() {
            addCriterion("referrece_custom9 is not null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom9EqualTo(String value) {
            addCriterion("referrece_custom9 =", value, "referreceCustom9");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom9NotEqualTo(String value) {
            addCriterion("referrece_custom9 <>", value, "referreceCustom9");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom9GreaterThan(String value) {
            addCriterion("referrece_custom9 >", value, "referreceCustom9");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom9GreaterThanOrEqualTo(String value) {
            addCriterion("referrece_custom9 >=", value, "referreceCustom9");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom9LessThan(String value) {
            addCriterion("referrece_custom9 <", value, "referreceCustom9");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom9LessThanOrEqualTo(String value) {
            addCriterion("referrece_custom9 <=", value, "referreceCustom9");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom9Like(String value) {
            addCriterion("referrece_custom9 like", value, "referreceCustom9");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom9NotLike(String value) {
            addCriterion("referrece_custom9 not like", value, "referreceCustom9");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom9In(List<String> values) {
            addCriterion("referrece_custom9 in", values, "referreceCustom9");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom9NotIn(List<String> values) {
            addCriterion("referrece_custom9 not in", values, "referreceCustom9");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom9Between(String value1, String value2) {
            addCriterion("referrece_custom9 between", value1, value2, "referreceCustom9");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom9NotBetween(String value1, String value2) {
            addCriterion("referrece_custom9 not between", value1, value2, "referreceCustom9");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom10IsNull() {
            addCriterion("referrece_custom10 is null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom10IsNotNull() {
            addCriterion("referrece_custom10 is not null");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom10EqualTo(String value) {
            addCriterion("referrece_custom10 =", value, "referreceCustom10");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom10NotEqualTo(String value) {
            addCriterion("referrece_custom10 <>", value, "referreceCustom10");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom10GreaterThan(String value) {
            addCriterion("referrece_custom10 >", value, "referreceCustom10");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom10GreaterThanOrEqualTo(String value) {
            addCriterion("referrece_custom10 >=", value, "referreceCustom10");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom10LessThan(String value) {
            addCriterion("referrece_custom10 <", value, "referreceCustom10");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom10LessThanOrEqualTo(String value) {
            addCriterion("referrece_custom10 <=", value, "referreceCustom10");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom10Like(String value) {
            addCriterion("referrece_custom10 like", value, "referreceCustom10");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom10NotLike(String value) {
            addCriterion("referrece_custom10 not like", value, "referreceCustom10");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom10In(List<String> values) {
            addCriterion("referrece_custom10 in", values, "referreceCustom10");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom10NotIn(List<String> values) {
            addCriterion("referrece_custom10 not in", values, "referreceCustom10");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom10Between(String value1, String value2) {
            addCriterion("referrece_custom10 between", value1, value2, "referreceCustom10");
            return (Criteria) this;
        }

        public Criteria andReferreceCustom10NotBetween(String value1, String value2) {
            addCriterion("referrece_custom10 not between", value1, value2, "referreceCustom10");
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