package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ReferpriaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReferpriaExample() {
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

        public Criteria andReferpriaIdIsNull() {
            addCriterion("Referpria_id is null");
            return (Criteria) this;
        }

        public Criteria andReferpriaIdIsNotNull() {
            addCriterion("Referpria_id is not null");
            return (Criteria) this;
        }

        public Criteria andReferpriaIdEqualTo(String value) {
            addCriterion("Referpria_id =", value, "referpriaId");
            return (Criteria) this;
        }

        public Criteria andReferpriaIdNotEqualTo(String value) {
            addCriterion("Referpria_id <>", value, "referpriaId");
            return (Criteria) this;
        }

        public Criteria andReferpriaIdGreaterThan(String value) {
            addCriterion("Referpria_id >", value, "referpriaId");
            return (Criteria) this;
        }

        public Criteria andReferpriaIdGreaterThanOrEqualTo(String value) {
            addCriterion("Referpria_id >=", value, "referpriaId");
            return (Criteria) this;
        }

        public Criteria andReferpriaIdLessThan(String value) {
            addCriterion("Referpria_id <", value, "referpriaId");
            return (Criteria) this;
        }

        public Criteria andReferpriaIdLessThanOrEqualTo(String value) {
            addCriterion("Referpria_id <=", value, "referpriaId");
            return (Criteria) this;
        }

        public Criteria andReferpriaIdLike(String value) {
            addCriterion("Referpria_id like", value, "referpriaId");
            return (Criteria) this;
        }

        public Criteria andReferpriaIdNotLike(String value) {
            addCriterion("Referpria_id not like", value, "referpriaId");
            return (Criteria) this;
        }

        public Criteria andReferpriaIdIn(List<String> values) {
            addCriterion("Referpria_id in", values, "referpriaId");
            return (Criteria) this;
        }

        public Criteria andReferpriaIdNotIn(List<String> values) {
            addCriterion("Referpria_id not in", values, "referpriaId");
            return (Criteria) this;
        }

        public Criteria andReferpriaIdBetween(String value1, String value2) {
            addCriterion("Referpria_id between", value1, value2, "referpriaId");
            return (Criteria) this;
        }

        public Criteria andReferpriaIdNotBetween(String value1, String value2) {
            addCriterion("Referpria_id not between", value1, value2, "referpriaId");
            return (Criteria) this;
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

        public Criteria andPriabillNumberIsNull() {
            addCriterion("\"Priabill _number\" is null");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberIsNotNull() {
            addCriterion("\"Priabill _number\" is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberEqualTo(String value) {
            addCriterion("\"Priabill _number\" =", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberNotEqualTo(String value) {
            addCriterion("\"Priabill _number\" <>", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberGreaterThan(String value) {
            addCriterion("\"Priabill _number\" >", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberGreaterThanOrEqualTo(String value) {
            addCriterion("\"Priabill _number\" >=", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberLessThan(String value) {
            addCriterion("\"Priabill _number\" <", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberLessThanOrEqualTo(String value) {
            addCriterion("\"Priabill _number\" <=", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberLike(String value) {
            addCriterion("\"Priabill _number\" like", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberNotLike(String value) {
            addCriterion("\"Priabill _number\" not like", value, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberIn(List<String> values) {
            addCriterion("\"Priabill _number\" in", values, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberNotIn(List<String> values) {
            addCriterion("\"Priabill _number\" not in", values, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberBetween(String value1, String value2) {
            addCriterion("\"Priabill _number\" between", value1, value2, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillNumberNotBetween(String value1, String value2) {
            addCriterion("\"Priabill _number\" not between", value1, value2, "priabillNumber");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeIsNull() {
            addCriterion("\"Priabill _type\" is null");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeIsNotNull() {
            addCriterion("\"Priabill _type\" is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeEqualTo(String value) {
            addCriterion("\"Priabill _type\" =", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeNotEqualTo(String value) {
            addCriterion("\"Priabill _type\" <>", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeGreaterThan(String value) {
            addCriterion("\"Priabill _type\" >", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"Priabill _type\" >=", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeLessThan(String value) {
            addCriterion("\"Priabill _type\" <", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeLessThanOrEqualTo(String value) {
            addCriterion("\"Priabill _type\" <=", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeLike(String value) {
            addCriterion("\"Priabill _type\" like", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeNotLike(String value) {
            addCriterion("\"Priabill _type\" not like", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeIn(List<String> values) {
            addCriterion("\"Priabill _type\" in", values, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeNotIn(List<String> values) {
            addCriterion("\"Priabill _type\" not in", values, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeBetween(String value1, String value2) {
            addCriterion("\"Priabill _type\" between", value1, value2, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeNotBetween(String value1, String value2) {
            addCriterion("\"Priabill _type\" not between", value1, value2, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillAdvanceIsNull() {
            addCriterion("Priabill_advance is null");
            return (Criteria) this;
        }

        public Criteria andPriabillAdvanceIsNotNull() {
            addCriterion("Priabill_advance is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillAdvanceEqualTo(Float value) {
            addCriterion("Priabill_advance =", value, "priabillAdvance");
            return (Criteria) this;
        }

        public Criteria andPriabillAdvanceNotEqualTo(Float value) {
            addCriterion("Priabill_advance <>", value, "priabillAdvance");
            return (Criteria) this;
        }

        public Criteria andPriabillAdvanceGreaterThan(Float value) {
            addCriterion("Priabill_advance >", value, "priabillAdvance");
            return (Criteria) this;
        }

        public Criteria andPriabillAdvanceGreaterThanOrEqualTo(Float value) {
            addCriterion("Priabill_advance >=", value, "priabillAdvance");
            return (Criteria) this;
        }

        public Criteria andPriabillAdvanceLessThan(Float value) {
            addCriterion("Priabill_advance <", value, "priabillAdvance");
            return (Criteria) this;
        }

        public Criteria andPriabillAdvanceLessThanOrEqualTo(Float value) {
            addCriterion("Priabill_advance <=", value, "priabillAdvance");
            return (Criteria) this;
        }

        public Criteria andPriabillAdvanceIn(List<Float> values) {
            addCriterion("Priabill_advance in", values, "priabillAdvance");
            return (Criteria) this;
        }

        public Criteria andPriabillAdvanceNotIn(List<Float> values) {
            addCriterion("Priabill_advance not in", values, "priabillAdvance");
            return (Criteria) this;
        }

        public Criteria andPriabillAdvanceBetween(Float value1, Float value2) {
            addCriterion("Priabill_advance between", value1, value2, "priabillAdvance");
            return (Criteria) this;
        }

        public Criteria andPriabillAdvanceNotBetween(Float value1, Float value2) {
            addCriterion("Priabill_advance not between", value1, value2, "priabillAdvance");
            return (Criteria) this;
        }

        public Criteria andPriabillQyadvanceIsNull() {
            addCriterion("Priabill_qyadvance is null");
            return (Criteria) this;
        }

        public Criteria andPriabillQyadvanceIsNotNull() {
            addCriterion("Priabill_qyadvance is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillQyadvanceEqualTo(Float value) {
            addCriterion("Priabill_qyadvance =", value, "priabillQyadvance");
            return (Criteria) this;
        }

        public Criteria andPriabillQyadvanceNotEqualTo(Float value) {
            addCriterion("Priabill_qyadvance <>", value, "priabillQyadvance");
            return (Criteria) this;
        }

        public Criteria andPriabillQyadvanceGreaterThan(Float value) {
            addCriterion("Priabill_qyadvance >", value, "priabillQyadvance");
            return (Criteria) this;
        }

        public Criteria andPriabillQyadvanceGreaterThanOrEqualTo(Float value) {
            addCriterion("Priabill_qyadvance >=", value, "priabillQyadvance");
            return (Criteria) this;
        }

        public Criteria andPriabillQyadvanceLessThan(Float value) {
            addCriterion("Priabill_qyadvance <", value, "priabillQyadvance");
            return (Criteria) this;
        }

        public Criteria andPriabillQyadvanceLessThanOrEqualTo(Float value) {
            addCriterion("Priabill_qyadvance <=", value, "priabillQyadvance");
            return (Criteria) this;
        }

        public Criteria andPriabillQyadvanceIn(List<Float> values) {
            addCriterion("Priabill_qyadvance in", values, "priabillQyadvance");
            return (Criteria) this;
        }

        public Criteria andPriabillQyadvanceNotIn(List<Float> values) {
            addCriterion("Priabill_qyadvance not in", values, "priabillQyadvance");
            return (Criteria) this;
        }

        public Criteria andPriabillQyadvanceBetween(Float value1, Float value2) {
            addCriterion("Priabill_qyadvance between", value1, value2, "priabillQyadvance");
            return (Criteria) this;
        }

        public Criteria andPriabillQyadvanceNotBetween(Float value1, Float value2) {
            addCriterion("Priabill_qyadvance not between", value1, value2, "priabillQyadvance");
            return (Criteria) this;
        }

        public Criteria andReferpriaRemarksIsNull() {
            addCriterion("Referpria_remarks is null");
            return (Criteria) this;
        }

        public Criteria andReferpriaRemarksIsNotNull() {
            addCriterion("Referpria_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andReferpriaRemarksEqualTo(String value) {
            addCriterion("Referpria_remarks =", value, "referpriaRemarks");
            return (Criteria) this;
        }

        public Criteria andReferpriaRemarksNotEqualTo(String value) {
            addCriterion("Referpria_remarks <>", value, "referpriaRemarks");
            return (Criteria) this;
        }

        public Criteria andReferpriaRemarksGreaterThan(String value) {
            addCriterion("Referpria_remarks >", value, "referpriaRemarks");
            return (Criteria) this;
        }

        public Criteria andReferpriaRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("Referpria_remarks >=", value, "referpriaRemarks");
            return (Criteria) this;
        }

        public Criteria andReferpriaRemarksLessThan(String value) {
            addCriterion("Referpria_remarks <", value, "referpriaRemarks");
            return (Criteria) this;
        }

        public Criteria andReferpriaRemarksLessThanOrEqualTo(String value) {
            addCriterion("Referpria_remarks <=", value, "referpriaRemarks");
            return (Criteria) this;
        }

        public Criteria andReferpriaRemarksLike(String value) {
            addCriterion("Referpria_remarks like", value, "referpriaRemarks");
            return (Criteria) this;
        }

        public Criteria andReferpriaRemarksNotLike(String value) {
            addCriterion("Referpria_remarks not like", value, "referpriaRemarks");
            return (Criteria) this;
        }

        public Criteria andReferpriaRemarksIn(List<String> values) {
            addCriterion("Referpria_remarks in", values, "referpriaRemarks");
            return (Criteria) this;
        }

        public Criteria andReferpriaRemarksNotIn(List<String> values) {
            addCriterion("Referpria_remarks not in", values, "referpriaRemarks");
            return (Criteria) this;
        }

        public Criteria andReferpriaRemarksBetween(String value1, String value2) {
            addCriterion("Referpria_remarks between", value1, value2, "referpriaRemarks");
            return (Criteria) this;
        }

        public Criteria andReferpriaRemarksNotBetween(String value1, String value2) {
            addCriterion("Referpria_remarks not between", value1, value2, "referpriaRemarks");
            return (Criteria) this;
        }

        public Criteria andReferpriaAuditingIsNull() {
            addCriterion("Referpria_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andReferpriaAuditingIsNotNull() {
            addCriterion("Referpria_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andReferpriaAuditingEqualTo(String value) {
            addCriterion("Referpria_Auditing =", value, "referpriaAuditing");
            return (Criteria) this;
        }

        public Criteria andReferpriaAuditingNotEqualTo(String value) {
            addCriterion("Referpria_Auditing <>", value, "referpriaAuditing");
            return (Criteria) this;
        }

        public Criteria andReferpriaAuditingGreaterThan(String value) {
            addCriterion("Referpria_Auditing >", value, "referpriaAuditing");
            return (Criteria) this;
        }

        public Criteria andReferpriaAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("Referpria_Auditing >=", value, "referpriaAuditing");
            return (Criteria) this;
        }

        public Criteria andReferpriaAuditingLessThan(String value) {
            addCriterion("Referpria_Auditing <", value, "referpriaAuditing");
            return (Criteria) this;
        }

        public Criteria andReferpriaAuditingLessThanOrEqualTo(String value) {
            addCriterion("Referpria_Auditing <=", value, "referpriaAuditing");
            return (Criteria) this;
        }

        public Criteria andReferpriaAuditingLike(String value) {
            addCriterion("Referpria_Auditing like", value, "referpriaAuditing");
            return (Criteria) this;
        }

        public Criteria andReferpriaAuditingNotLike(String value) {
            addCriterion("Referpria_Auditing not like", value, "referpriaAuditing");
            return (Criteria) this;
        }

        public Criteria andReferpriaAuditingIn(List<String> values) {
            addCriterion("Referpria_Auditing in", values, "referpriaAuditing");
            return (Criteria) this;
        }

        public Criteria andReferpriaAuditingNotIn(List<String> values) {
            addCriterion("Referpria_Auditing not in", values, "referpriaAuditing");
            return (Criteria) this;
        }

        public Criteria andReferpriaAuditingBetween(String value1, String value2) {
            addCriterion("Referpria_Auditing between", value1, value2, "referpriaAuditing");
            return (Criteria) this;
        }

        public Criteria andReferpriaAuditingNotBetween(String value1, String value2) {
            addCriterion("Referpria_Auditing not between", value1, value2, "referpriaAuditing");
            return (Criteria) this;
        }

        public Criteria andReferpriaYnIsNull() {
            addCriterion("Referpria_yn is null");
            return (Criteria) this;
        }

        public Criteria andReferpriaYnIsNotNull() {
            addCriterion("Referpria_yn is not null");
            return (Criteria) this;
        }

        public Criteria andReferpriaYnEqualTo(String value) {
            addCriterion("Referpria_yn =", value, "referpriaYn");
            return (Criteria) this;
        }

        public Criteria andReferpriaYnNotEqualTo(String value) {
            addCriterion("Referpria_yn <>", value, "referpriaYn");
            return (Criteria) this;
        }

        public Criteria andReferpriaYnGreaterThan(String value) {
            addCriterion("Referpria_yn >", value, "referpriaYn");
            return (Criteria) this;
        }

        public Criteria andReferpriaYnGreaterThanOrEqualTo(String value) {
            addCriterion("Referpria_yn >=", value, "referpriaYn");
            return (Criteria) this;
        }

        public Criteria andReferpriaYnLessThan(String value) {
            addCriterion("Referpria_yn <", value, "referpriaYn");
            return (Criteria) this;
        }

        public Criteria andReferpriaYnLessThanOrEqualTo(String value) {
            addCriterion("Referpria_yn <=", value, "referpriaYn");
            return (Criteria) this;
        }

        public Criteria andReferpriaYnLike(String value) {
            addCriterion("Referpria_yn like", value, "referpriaYn");
            return (Criteria) this;
        }

        public Criteria andReferpriaYnNotLike(String value) {
            addCriterion("Referpria_yn not like", value, "referpriaYn");
            return (Criteria) this;
        }

        public Criteria andReferpriaYnIn(List<String> values) {
            addCriterion("Referpria_yn in", values, "referpriaYn");
            return (Criteria) this;
        }

        public Criteria andReferpriaYnNotIn(List<String> values) {
            addCriterion("Referpria_yn not in", values, "referpriaYn");
            return (Criteria) this;
        }

        public Criteria andReferpriaYnBetween(String value1, String value2) {
            addCriterion("Referpria_yn between", value1, value2, "referpriaYn");
            return (Criteria) this;
        }

        public Criteria andReferpriaYnNotBetween(String value1, String value2) {
            addCriterion("Referpria_yn not between", value1, value2, "referpriaYn");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom1IsNull() {
            addCriterion("Referpria_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom1IsNotNull() {
            addCriterion("Referpria_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom1EqualTo(String value) {
            addCriterion("Referpria_custom1 =", value, "referpriaCustom1");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom1NotEqualTo(String value) {
            addCriterion("Referpria_custom1 <>", value, "referpriaCustom1");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom1GreaterThan(String value) {
            addCriterion("Referpria_custom1 >", value, "referpriaCustom1");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("Referpria_custom1 >=", value, "referpriaCustom1");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom1LessThan(String value) {
            addCriterion("Referpria_custom1 <", value, "referpriaCustom1");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom1LessThanOrEqualTo(String value) {
            addCriterion("Referpria_custom1 <=", value, "referpriaCustom1");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom1Like(String value) {
            addCriterion("Referpria_custom1 like", value, "referpriaCustom1");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom1NotLike(String value) {
            addCriterion("Referpria_custom1 not like", value, "referpriaCustom1");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom1In(List<String> values) {
            addCriterion("Referpria_custom1 in", values, "referpriaCustom1");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom1NotIn(List<String> values) {
            addCriterion("Referpria_custom1 not in", values, "referpriaCustom1");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom1Between(String value1, String value2) {
            addCriterion("Referpria_custom1 between", value1, value2, "referpriaCustom1");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom1NotBetween(String value1, String value2) {
            addCriterion("Referpria_custom1 not between", value1, value2, "referpriaCustom1");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom2IsNull() {
            addCriterion("Referpria_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom2IsNotNull() {
            addCriterion("Referpria_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom2EqualTo(String value) {
            addCriterion("Referpria_custom2 =", value, "referpriaCustom2");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom2NotEqualTo(String value) {
            addCriterion("Referpria_custom2 <>", value, "referpriaCustom2");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom2GreaterThan(String value) {
            addCriterion("Referpria_custom2 >", value, "referpriaCustom2");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("Referpria_custom2 >=", value, "referpriaCustom2");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom2LessThan(String value) {
            addCriterion("Referpria_custom2 <", value, "referpriaCustom2");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom2LessThanOrEqualTo(String value) {
            addCriterion("Referpria_custom2 <=", value, "referpriaCustom2");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom2Like(String value) {
            addCriterion("Referpria_custom2 like", value, "referpriaCustom2");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom2NotLike(String value) {
            addCriterion("Referpria_custom2 not like", value, "referpriaCustom2");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom2In(List<String> values) {
            addCriterion("Referpria_custom2 in", values, "referpriaCustom2");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom2NotIn(List<String> values) {
            addCriterion("Referpria_custom2 not in", values, "referpriaCustom2");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom2Between(String value1, String value2) {
            addCriterion("Referpria_custom2 between", value1, value2, "referpriaCustom2");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom2NotBetween(String value1, String value2) {
            addCriterion("Referpria_custom2 not between", value1, value2, "referpriaCustom2");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom3IsNull() {
            addCriterion("Referpria_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom3IsNotNull() {
            addCriterion("Referpria_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom3EqualTo(String value) {
            addCriterion("Referpria_custom3 =", value, "referpriaCustom3");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom3NotEqualTo(String value) {
            addCriterion("Referpria_custom3 <>", value, "referpriaCustom3");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom3GreaterThan(String value) {
            addCriterion("Referpria_custom3 >", value, "referpriaCustom3");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("Referpria_custom3 >=", value, "referpriaCustom3");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom3LessThan(String value) {
            addCriterion("Referpria_custom3 <", value, "referpriaCustom3");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom3LessThanOrEqualTo(String value) {
            addCriterion("Referpria_custom3 <=", value, "referpriaCustom3");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom3Like(String value) {
            addCriterion("Referpria_custom3 like", value, "referpriaCustom3");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom3NotLike(String value) {
            addCriterion("Referpria_custom3 not like", value, "referpriaCustom3");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom3In(List<String> values) {
            addCriterion("Referpria_custom3 in", values, "referpriaCustom3");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom3NotIn(List<String> values) {
            addCriterion("Referpria_custom3 not in", values, "referpriaCustom3");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom3Between(String value1, String value2) {
            addCriterion("Referpria_custom3 between", value1, value2, "referpriaCustom3");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom3NotBetween(String value1, String value2) {
            addCriterion("Referpria_custom3 not between", value1, value2, "referpriaCustom3");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom4IsNull() {
            addCriterion("Referpria_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom4IsNotNull() {
            addCriterion("Referpria_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom4EqualTo(String value) {
            addCriterion("Referpria_custom4 =", value, "referpriaCustom4");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom4NotEqualTo(String value) {
            addCriterion("Referpria_custom4 <>", value, "referpriaCustom4");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom4GreaterThan(String value) {
            addCriterion("Referpria_custom4 >", value, "referpriaCustom4");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("Referpria_custom4 >=", value, "referpriaCustom4");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom4LessThan(String value) {
            addCriterion("Referpria_custom4 <", value, "referpriaCustom4");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom4LessThanOrEqualTo(String value) {
            addCriterion("Referpria_custom4 <=", value, "referpriaCustom4");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom4Like(String value) {
            addCriterion("Referpria_custom4 like", value, "referpriaCustom4");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom4NotLike(String value) {
            addCriterion("Referpria_custom4 not like", value, "referpriaCustom4");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom4In(List<String> values) {
            addCriterion("Referpria_custom4 in", values, "referpriaCustom4");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom4NotIn(List<String> values) {
            addCriterion("Referpria_custom4 not in", values, "referpriaCustom4");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom4Between(String value1, String value2) {
            addCriterion("Referpria_custom4 between", value1, value2, "referpriaCustom4");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom4NotBetween(String value1, String value2) {
            addCriterion("Referpria_custom4 not between", value1, value2, "referpriaCustom4");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom5IsNull() {
            addCriterion("Referpria_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom5IsNotNull() {
            addCriterion("Referpria_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom5EqualTo(String value) {
            addCriterion("Referpria_custom5 =", value, "referpriaCustom5");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom5NotEqualTo(String value) {
            addCriterion("Referpria_custom5 <>", value, "referpriaCustom5");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom5GreaterThan(String value) {
            addCriterion("Referpria_custom5 >", value, "referpriaCustom5");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("Referpria_custom5 >=", value, "referpriaCustom5");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom5LessThan(String value) {
            addCriterion("Referpria_custom5 <", value, "referpriaCustom5");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom5LessThanOrEqualTo(String value) {
            addCriterion("Referpria_custom5 <=", value, "referpriaCustom5");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom5Like(String value) {
            addCriterion("Referpria_custom5 like", value, "referpriaCustom5");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom5NotLike(String value) {
            addCriterion("Referpria_custom5 not like", value, "referpriaCustom5");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom5In(List<String> values) {
            addCriterion("Referpria_custom5 in", values, "referpriaCustom5");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom5NotIn(List<String> values) {
            addCriterion("Referpria_custom5 not in", values, "referpriaCustom5");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom5Between(String value1, String value2) {
            addCriterion("Referpria_custom5 between", value1, value2, "referpriaCustom5");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom5NotBetween(String value1, String value2) {
            addCriterion("Referpria_custom5 not between", value1, value2, "referpriaCustom5");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom6IsNull() {
            addCriterion("Referpria_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom6IsNotNull() {
            addCriterion("Referpria_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom6EqualTo(String value) {
            addCriterion("Referpria_custom6 =", value, "referpriaCustom6");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom6NotEqualTo(String value) {
            addCriterion("Referpria_custom6 <>", value, "referpriaCustom6");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom6GreaterThan(String value) {
            addCriterion("Referpria_custom6 >", value, "referpriaCustom6");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("Referpria_custom6 >=", value, "referpriaCustom6");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom6LessThan(String value) {
            addCriterion("Referpria_custom6 <", value, "referpriaCustom6");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom6LessThanOrEqualTo(String value) {
            addCriterion("Referpria_custom6 <=", value, "referpriaCustom6");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom6Like(String value) {
            addCriterion("Referpria_custom6 like", value, "referpriaCustom6");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom6NotLike(String value) {
            addCriterion("Referpria_custom6 not like", value, "referpriaCustom6");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom6In(List<String> values) {
            addCriterion("Referpria_custom6 in", values, "referpriaCustom6");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom6NotIn(List<String> values) {
            addCriterion("Referpria_custom6 not in", values, "referpriaCustom6");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom6Between(String value1, String value2) {
            addCriterion("Referpria_custom6 between", value1, value2, "referpriaCustom6");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom6NotBetween(String value1, String value2) {
            addCriterion("Referpria_custom6 not between", value1, value2, "referpriaCustom6");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom7IsNull() {
            addCriterion("Referpria_custom7 is null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom7IsNotNull() {
            addCriterion("Referpria_custom7 is not null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom7EqualTo(String value) {
            addCriterion("Referpria_custom7 =", value, "referpriaCustom7");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom7NotEqualTo(String value) {
            addCriterion("Referpria_custom7 <>", value, "referpriaCustom7");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom7GreaterThan(String value) {
            addCriterion("Referpria_custom7 >", value, "referpriaCustom7");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom7GreaterThanOrEqualTo(String value) {
            addCriterion("Referpria_custom7 >=", value, "referpriaCustom7");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom7LessThan(String value) {
            addCriterion("Referpria_custom7 <", value, "referpriaCustom7");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom7LessThanOrEqualTo(String value) {
            addCriterion("Referpria_custom7 <=", value, "referpriaCustom7");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom7Like(String value) {
            addCriterion("Referpria_custom7 like", value, "referpriaCustom7");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom7NotLike(String value) {
            addCriterion("Referpria_custom7 not like", value, "referpriaCustom7");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom7In(List<String> values) {
            addCriterion("Referpria_custom7 in", values, "referpriaCustom7");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom7NotIn(List<String> values) {
            addCriterion("Referpria_custom7 not in", values, "referpriaCustom7");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom7Between(String value1, String value2) {
            addCriterion("Referpria_custom7 between", value1, value2, "referpriaCustom7");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom7NotBetween(String value1, String value2) {
            addCriterion("Referpria_custom7 not between", value1, value2, "referpriaCustom7");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom8IsNull() {
            addCriterion("Referpria_custom8 is null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom8IsNotNull() {
            addCriterion("Referpria_custom8 is not null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom8EqualTo(String value) {
            addCriterion("Referpria_custom8 =", value, "referpriaCustom8");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom8NotEqualTo(String value) {
            addCriterion("Referpria_custom8 <>", value, "referpriaCustom8");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom8GreaterThan(String value) {
            addCriterion("Referpria_custom8 >", value, "referpriaCustom8");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom8GreaterThanOrEqualTo(String value) {
            addCriterion("Referpria_custom8 >=", value, "referpriaCustom8");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom8LessThan(String value) {
            addCriterion("Referpria_custom8 <", value, "referpriaCustom8");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom8LessThanOrEqualTo(String value) {
            addCriterion("Referpria_custom8 <=", value, "referpriaCustom8");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom8Like(String value) {
            addCriterion("Referpria_custom8 like", value, "referpriaCustom8");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom8NotLike(String value) {
            addCriterion("Referpria_custom8 not like", value, "referpriaCustom8");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom8In(List<String> values) {
            addCriterion("Referpria_custom8 in", values, "referpriaCustom8");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom8NotIn(List<String> values) {
            addCriterion("Referpria_custom8 not in", values, "referpriaCustom8");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom8Between(String value1, String value2) {
            addCriterion("Referpria_custom8 between", value1, value2, "referpriaCustom8");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom8NotBetween(String value1, String value2) {
            addCriterion("Referpria_custom8 not between", value1, value2, "referpriaCustom8");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom9IsNull() {
            addCriterion("Referpria_custom9 is null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom9IsNotNull() {
            addCriterion("Referpria_custom9 is not null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom9EqualTo(String value) {
            addCriterion("Referpria_custom9 =", value, "referpriaCustom9");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom9NotEqualTo(String value) {
            addCriterion("Referpria_custom9 <>", value, "referpriaCustom9");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom9GreaterThan(String value) {
            addCriterion("Referpria_custom9 >", value, "referpriaCustom9");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom9GreaterThanOrEqualTo(String value) {
            addCriterion("Referpria_custom9 >=", value, "referpriaCustom9");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom9LessThan(String value) {
            addCriterion("Referpria_custom9 <", value, "referpriaCustom9");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom9LessThanOrEqualTo(String value) {
            addCriterion("Referpria_custom9 <=", value, "referpriaCustom9");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom9Like(String value) {
            addCriterion("Referpria_custom9 like", value, "referpriaCustom9");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom9NotLike(String value) {
            addCriterion("Referpria_custom9 not like", value, "referpriaCustom9");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom9In(List<String> values) {
            addCriterion("Referpria_custom9 in", values, "referpriaCustom9");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom9NotIn(List<String> values) {
            addCriterion("Referpria_custom9 not in", values, "referpriaCustom9");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom9Between(String value1, String value2) {
            addCriterion("Referpria_custom9 between", value1, value2, "referpriaCustom9");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom9NotBetween(String value1, String value2) {
            addCriterion("Referpria_custom9 not between", value1, value2, "referpriaCustom9");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom10IsNull() {
            addCriterion("Referpria_custom10 is null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom10IsNotNull() {
            addCriterion("Referpria_custom10 is not null");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom10EqualTo(String value) {
            addCriterion("Referpria_custom10 =", value, "referpriaCustom10");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom10NotEqualTo(String value) {
            addCriterion("Referpria_custom10 <>", value, "referpriaCustom10");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom10GreaterThan(String value) {
            addCriterion("Referpria_custom10 >", value, "referpriaCustom10");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom10GreaterThanOrEqualTo(String value) {
            addCriterion("Referpria_custom10 >=", value, "referpriaCustom10");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom10LessThan(String value) {
            addCriterion("Referpria_custom10 <", value, "referpriaCustom10");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom10LessThanOrEqualTo(String value) {
            addCriterion("Referpria_custom10 <=", value, "referpriaCustom10");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom10Like(String value) {
            addCriterion("Referpria_custom10 like", value, "referpriaCustom10");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom10NotLike(String value) {
            addCriterion("Referpria_custom10 not like", value, "referpriaCustom10");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom10In(List<String> values) {
            addCriterion("Referpria_custom10 in", values, "referpriaCustom10");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom10NotIn(List<String> values) {
            addCriterion("Referpria_custom10 not in", values, "referpriaCustom10");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom10Between(String value1, String value2) {
            addCriterion("Referpria_custom10 between", value1, value2, "referpriaCustom10");
            return (Criteria) this;
        }

        public Criteria andReferpriaCustom10NotBetween(String value1, String value2) {
            addCriterion("Referpria_custom10 not between", value1, value2, "referpriaCustom10");
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