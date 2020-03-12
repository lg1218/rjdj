package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class NegotiationStageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NegotiationStageExample() {
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

        public Criteria andNsIdIsNull() {
            addCriterion("ns_id is null");
            return (Criteria) this;
        }

        public Criteria andNsIdIsNotNull() {
            addCriterion("ns_id is not null");
            return (Criteria) this;
        }

        public Criteria andNsIdEqualTo(String value) {
            addCriterion("ns_id =", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdNotEqualTo(String value) {
            addCriterion("ns_id <>", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdGreaterThan(String value) {
            addCriterion("ns_id >", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdGreaterThanOrEqualTo(String value) {
            addCriterion("ns_id >=", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdLessThan(String value) {
            addCriterion("ns_id <", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdLessThanOrEqualTo(String value) {
            addCriterion("ns_id <=", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdLike(String value) {
            addCriterion("ns_id like", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdNotLike(String value) {
            addCriterion("ns_id not like", value, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdIn(List<String> values) {
            addCriterion("ns_id in", values, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdNotIn(List<String> values) {
            addCriterion("ns_id not in", values, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdBetween(String value1, String value2) {
            addCriterion("ns_id between", value1, value2, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsIdNotBetween(String value1, String value2) {
            addCriterion("ns_id not between", value1, value2, "nsId");
            return (Criteria) this;
        }

        public Criteria andNsNameIsNull() {
            addCriterion("ns_name is null");
            return (Criteria) this;
        }

        public Criteria andNsNameIsNotNull() {
            addCriterion("ns_name is not null");
            return (Criteria) this;
        }

        public Criteria andNsNameEqualTo(String value) {
            addCriterion("ns_name =", value, "nsName");
            return (Criteria) this;
        }

        public Criteria andNsNameNotEqualTo(String value) {
            addCriterion("ns_name <>", value, "nsName");
            return (Criteria) this;
        }

        public Criteria andNsNameGreaterThan(String value) {
            addCriterion("ns_name >", value, "nsName");
            return (Criteria) this;
        }

        public Criteria andNsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ns_name >=", value, "nsName");
            return (Criteria) this;
        }

        public Criteria andNsNameLessThan(String value) {
            addCriterion("ns_name <", value, "nsName");
            return (Criteria) this;
        }

        public Criteria andNsNameLessThanOrEqualTo(String value) {
            addCriterion("ns_name <=", value, "nsName");
            return (Criteria) this;
        }

        public Criteria andNsNameLike(String value) {
            addCriterion("ns_name like", value, "nsName");
            return (Criteria) this;
        }

        public Criteria andNsNameNotLike(String value) {
            addCriterion("ns_name not like", value, "nsName");
            return (Criteria) this;
        }

        public Criteria andNsNameIn(List<String> values) {
            addCriterion("ns_name in", values, "nsName");
            return (Criteria) this;
        }

        public Criteria andNsNameNotIn(List<String> values) {
            addCriterion("ns_name not in", values, "nsName");
            return (Criteria) this;
        }

        public Criteria andNsNameBetween(String value1, String value2) {
            addCriterion("ns_name between", value1, value2, "nsName");
            return (Criteria) this;
        }

        public Criteria andNsNameNotBetween(String value1, String value2) {
            addCriterion("ns_name not between", value1, value2, "nsName");
            return (Criteria) this;
        }

        public Criteria andNsEngnameIsNull() {
            addCriterion("ns_engname is null");
            return (Criteria) this;
        }

        public Criteria andNsEngnameIsNotNull() {
            addCriterion("ns_engname is not null");
            return (Criteria) this;
        }

        public Criteria andNsEngnameEqualTo(Float value) {
            addCriterion("ns_engname =", value, "nsEngname");
            return (Criteria) this;
        }

        public Criteria andNsEngnameNotEqualTo(Float value) {
            addCriterion("ns_engname <>", value, "nsEngname");
            return (Criteria) this;
        }

        public Criteria andNsEngnameGreaterThan(Float value) {
            addCriterion("ns_engname >", value, "nsEngname");
            return (Criteria) this;
        }

        public Criteria andNsEngnameGreaterThanOrEqualTo(Float value) {
            addCriterion("ns_engname >=", value, "nsEngname");
            return (Criteria) this;
        }

        public Criteria andNsEngnameLessThan(Float value) {
            addCriterion("ns_engname <", value, "nsEngname");
            return (Criteria) this;
        }

        public Criteria andNsEngnameLessThanOrEqualTo(Float value) {
            addCriterion("ns_engname <=", value, "nsEngname");
            return (Criteria) this;
        }

        public Criteria andNsEngnameIn(List<Float> values) {
            addCriterion("ns_engname in", values, "nsEngname");
            return (Criteria) this;
        }

        public Criteria andNsEngnameNotIn(List<Float> values) {
            addCriterion("ns_engname not in", values, "nsEngname");
            return (Criteria) this;
        }

        public Criteria andNsEngnameBetween(Float value1, Float value2) {
            addCriterion("ns_engname between", value1, value2, "nsEngname");
            return (Criteria) this;
        }

        public Criteria andNsEngnameNotBetween(Float value1, Float value2) {
            addCriterion("ns_engname not between", value1, value2, "nsEngname");
            return (Criteria) this;
        }

        public Criteria andNsRemarkIsNull() {
            addCriterion("ns_remark is null");
            return (Criteria) this;
        }

        public Criteria andNsRemarkIsNotNull() {
            addCriterion("ns_remark is not null");
            return (Criteria) this;
        }

        public Criteria andNsRemarkEqualTo(String value) {
            addCriterion("ns_remark =", value, "nsRemark");
            return (Criteria) this;
        }

        public Criteria andNsRemarkNotEqualTo(String value) {
            addCriterion("ns_remark <>", value, "nsRemark");
            return (Criteria) this;
        }

        public Criteria andNsRemarkGreaterThan(String value) {
            addCriterion("ns_remark >", value, "nsRemark");
            return (Criteria) this;
        }

        public Criteria andNsRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ns_remark >=", value, "nsRemark");
            return (Criteria) this;
        }

        public Criteria andNsRemarkLessThan(String value) {
            addCriterion("ns_remark <", value, "nsRemark");
            return (Criteria) this;
        }

        public Criteria andNsRemarkLessThanOrEqualTo(String value) {
            addCriterion("ns_remark <=", value, "nsRemark");
            return (Criteria) this;
        }

        public Criteria andNsRemarkLike(String value) {
            addCriterion("ns_remark like", value, "nsRemark");
            return (Criteria) this;
        }

        public Criteria andNsRemarkNotLike(String value) {
            addCriterion("ns_remark not like", value, "nsRemark");
            return (Criteria) this;
        }

        public Criteria andNsRemarkIn(List<String> values) {
            addCriterion("ns_remark in", values, "nsRemark");
            return (Criteria) this;
        }

        public Criteria andNsRemarkNotIn(List<String> values) {
            addCriterion("ns_remark not in", values, "nsRemark");
            return (Criteria) this;
        }

        public Criteria andNsRemarkBetween(String value1, String value2) {
            addCriterion("ns_remark between", value1, value2, "nsRemark");
            return (Criteria) this;
        }

        public Criteria andNsRemarkNotBetween(String value1, String value2) {
            addCriterion("ns_remark not between", value1, value2, "nsRemark");
            return (Criteria) this;
        }

        public Criteria andNsAuditingIsNull() {
            addCriterion("ns_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andNsAuditingIsNotNull() {
            addCriterion("ns_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andNsAuditingEqualTo(String value) {
            addCriterion("ns_Auditing =", value, "nsAuditing");
            return (Criteria) this;
        }

        public Criteria andNsAuditingNotEqualTo(String value) {
            addCriterion("ns_Auditing <>", value, "nsAuditing");
            return (Criteria) this;
        }

        public Criteria andNsAuditingGreaterThan(String value) {
            addCriterion("ns_Auditing >", value, "nsAuditing");
            return (Criteria) this;
        }

        public Criteria andNsAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("ns_Auditing >=", value, "nsAuditing");
            return (Criteria) this;
        }

        public Criteria andNsAuditingLessThan(String value) {
            addCriterion("ns_Auditing <", value, "nsAuditing");
            return (Criteria) this;
        }

        public Criteria andNsAuditingLessThanOrEqualTo(String value) {
            addCriterion("ns_Auditing <=", value, "nsAuditing");
            return (Criteria) this;
        }

        public Criteria andNsAuditingLike(String value) {
            addCriterion("ns_Auditing like", value, "nsAuditing");
            return (Criteria) this;
        }

        public Criteria andNsAuditingNotLike(String value) {
            addCriterion("ns_Auditing not like", value, "nsAuditing");
            return (Criteria) this;
        }

        public Criteria andNsAuditingIn(List<String> values) {
            addCriterion("ns_Auditing in", values, "nsAuditing");
            return (Criteria) this;
        }

        public Criteria andNsAuditingNotIn(List<String> values) {
            addCriterion("ns_Auditing not in", values, "nsAuditing");
            return (Criteria) this;
        }

        public Criteria andNsAuditingBetween(String value1, String value2) {
            addCriterion("ns_Auditing between", value1, value2, "nsAuditing");
            return (Criteria) this;
        }

        public Criteria andNsAuditingNotBetween(String value1, String value2) {
            addCriterion("ns_Auditing not between", value1, value2, "nsAuditing");
            return (Criteria) this;
        }

        public Criteria andNsYnIsNull() {
            addCriterion("ns_yn is null");
            return (Criteria) this;
        }

        public Criteria andNsYnIsNotNull() {
            addCriterion("ns_yn is not null");
            return (Criteria) this;
        }

        public Criteria andNsYnEqualTo(String value) {
            addCriterion("ns_yn =", value, "nsYn");
            return (Criteria) this;
        }

        public Criteria andNsYnNotEqualTo(String value) {
            addCriterion("ns_yn <>", value, "nsYn");
            return (Criteria) this;
        }

        public Criteria andNsYnGreaterThan(String value) {
            addCriterion("ns_yn >", value, "nsYn");
            return (Criteria) this;
        }

        public Criteria andNsYnGreaterThanOrEqualTo(String value) {
            addCriterion("ns_yn >=", value, "nsYn");
            return (Criteria) this;
        }

        public Criteria andNsYnLessThan(String value) {
            addCriterion("ns_yn <", value, "nsYn");
            return (Criteria) this;
        }

        public Criteria andNsYnLessThanOrEqualTo(String value) {
            addCriterion("ns_yn <=", value, "nsYn");
            return (Criteria) this;
        }

        public Criteria andNsYnLike(String value) {
            addCriterion("ns_yn like", value, "nsYn");
            return (Criteria) this;
        }

        public Criteria andNsYnNotLike(String value) {
            addCriterion("ns_yn not like", value, "nsYn");
            return (Criteria) this;
        }

        public Criteria andNsYnIn(List<String> values) {
            addCriterion("ns_yn in", values, "nsYn");
            return (Criteria) this;
        }

        public Criteria andNsYnNotIn(List<String> values) {
            addCriterion("ns_yn not in", values, "nsYn");
            return (Criteria) this;
        }

        public Criteria andNsYnBetween(String value1, String value2) {
            addCriterion("ns_yn between", value1, value2, "nsYn");
            return (Criteria) this;
        }

        public Criteria andNsYnNotBetween(String value1, String value2) {
            addCriterion("ns_yn not between", value1, value2, "nsYn");
            return (Criteria) this;
        }

        public Criteria andNsCustom1IsNull() {
            addCriterion("ns_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andNsCustom1IsNotNull() {
            addCriterion("ns_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andNsCustom1EqualTo(String value) {
            addCriterion("ns_custom1 =", value, "nsCustom1");
            return (Criteria) this;
        }

        public Criteria andNsCustom1NotEqualTo(String value) {
            addCriterion("ns_custom1 <>", value, "nsCustom1");
            return (Criteria) this;
        }

        public Criteria andNsCustom1GreaterThan(String value) {
            addCriterion("ns_custom1 >", value, "nsCustom1");
            return (Criteria) this;
        }

        public Criteria andNsCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("ns_custom1 >=", value, "nsCustom1");
            return (Criteria) this;
        }

        public Criteria andNsCustom1LessThan(String value) {
            addCriterion("ns_custom1 <", value, "nsCustom1");
            return (Criteria) this;
        }

        public Criteria andNsCustom1LessThanOrEqualTo(String value) {
            addCriterion("ns_custom1 <=", value, "nsCustom1");
            return (Criteria) this;
        }

        public Criteria andNsCustom1Like(String value) {
            addCriterion("ns_custom1 like", value, "nsCustom1");
            return (Criteria) this;
        }

        public Criteria andNsCustom1NotLike(String value) {
            addCriterion("ns_custom1 not like", value, "nsCustom1");
            return (Criteria) this;
        }

        public Criteria andNsCustom1In(List<String> values) {
            addCriterion("ns_custom1 in", values, "nsCustom1");
            return (Criteria) this;
        }

        public Criteria andNsCustom1NotIn(List<String> values) {
            addCriterion("ns_custom1 not in", values, "nsCustom1");
            return (Criteria) this;
        }

        public Criteria andNsCustom1Between(String value1, String value2) {
            addCriterion("ns_custom1 between", value1, value2, "nsCustom1");
            return (Criteria) this;
        }

        public Criteria andNsCustom1NotBetween(String value1, String value2) {
            addCriterion("ns_custom1 not between", value1, value2, "nsCustom1");
            return (Criteria) this;
        }

        public Criteria andNsCustom2IsNull() {
            addCriterion("ns_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andNsCustom2IsNotNull() {
            addCriterion("ns_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andNsCustom2EqualTo(String value) {
            addCriterion("ns_custom2 =", value, "nsCustom2");
            return (Criteria) this;
        }

        public Criteria andNsCustom2NotEqualTo(String value) {
            addCriterion("ns_custom2 <>", value, "nsCustom2");
            return (Criteria) this;
        }

        public Criteria andNsCustom2GreaterThan(String value) {
            addCriterion("ns_custom2 >", value, "nsCustom2");
            return (Criteria) this;
        }

        public Criteria andNsCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("ns_custom2 >=", value, "nsCustom2");
            return (Criteria) this;
        }

        public Criteria andNsCustom2LessThan(String value) {
            addCriterion("ns_custom2 <", value, "nsCustom2");
            return (Criteria) this;
        }

        public Criteria andNsCustom2LessThanOrEqualTo(String value) {
            addCriterion("ns_custom2 <=", value, "nsCustom2");
            return (Criteria) this;
        }

        public Criteria andNsCustom2Like(String value) {
            addCriterion("ns_custom2 like", value, "nsCustom2");
            return (Criteria) this;
        }

        public Criteria andNsCustom2NotLike(String value) {
            addCriterion("ns_custom2 not like", value, "nsCustom2");
            return (Criteria) this;
        }

        public Criteria andNsCustom2In(List<String> values) {
            addCriterion("ns_custom2 in", values, "nsCustom2");
            return (Criteria) this;
        }

        public Criteria andNsCustom2NotIn(List<String> values) {
            addCriterion("ns_custom2 not in", values, "nsCustom2");
            return (Criteria) this;
        }

        public Criteria andNsCustom2Between(String value1, String value2) {
            addCriterion("ns_custom2 between", value1, value2, "nsCustom2");
            return (Criteria) this;
        }

        public Criteria andNsCustom2NotBetween(String value1, String value2) {
            addCriterion("ns_custom2 not between", value1, value2, "nsCustom2");
            return (Criteria) this;
        }

        public Criteria andNsCustom3IsNull() {
            addCriterion("ns_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andNsCustom3IsNotNull() {
            addCriterion("ns_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andNsCustom3EqualTo(String value) {
            addCriterion("ns_custom3 =", value, "nsCustom3");
            return (Criteria) this;
        }

        public Criteria andNsCustom3NotEqualTo(String value) {
            addCriterion("ns_custom3 <>", value, "nsCustom3");
            return (Criteria) this;
        }

        public Criteria andNsCustom3GreaterThan(String value) {
            addCriterion("ns_custom3 >", value, "nsCustom3");
            return (Criteria) this;
        }

        public Criteria andNsCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("ns_custom3 >=", value, "nsCustom3");
            return (Criteria) this;
        }

        public Criteria andNsCustom3LessThan(String value) {
            addCriterion("ns_custom3 <", value, "nsCustom3");
            return (Criteria) this;
        }

        public Criteria andNsCustom3LessThanOrEqualTo(String value) {
            addCriterion("ns_custom3 <=", value, "nsCustom3");
            return (Criteria) this;
        }

        public Criteria andNsCustom3Like(String value) {
            addCriterion("ns_custom3 like", value, "nsCustom3");
            return (Criteria) this;
        }

        public Criteria andNsCustom3NotLike(String value) {
            addCriterion("ns_custom3 not like", value, "nsCustom3");
            return (Criteria) this;
        }

        public Criteria andNsCustom3In(List<String> values) {
            addCriterion("ns_custom3 in", values, "nsCustom3");
            return (Criteria) this;
        }

        public Criteria andNsCustom3NotIn(List<String> values) {
            addCriterion("ns_custom3 not in", values, "nsCustom3");
            return (Criteria) this;
        }

        public Criteria andNsCustom3Between(String value1, String value2) {
            addCriterion("ns_custom3 between", value1, value2, "nsCustom3");
            return (Criteria) this;
        }

        public Criteria andNsCustom3NotBetween(String value1, String value2) {
            addCriterion("ns_custom3 not between", value1, value2, "nsCustom3");
            return (Criteria) this;
        }

        public Criteria andNsCustom4IsNull() {
            addCriterion("ns_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andNsCustom4IsNotNull() {
            addCriterion("ns_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andNsCustom4EqualTo(String value) {
            addCriterion("ns_custom4 =", value, "nsCustom4");
            return (Criteria) this;
        }

        public Criteria andNsCustom4NotEqualTo(String value) {
            addCriterion("ns_custom4 <>", value, "nsCustom4");
            return (Criteria) this;
        }

        public Criteria andNsCustom4GreaterThan(String value) {
            addCriterion("ns_custom4 >", value, "nsCustom4");
            return (Criteria) this;
        }

        public Criteria andNsCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("ns_custom4 >=", value, "nsCustom4");
            return (Criteria) this;
        }

        public Criteria andNsCustom4LessThan(String value) {
            addCriterion("ns_custom4 <", value, "nsCustom4");
            return (Criteria) this;
        }

        public Criteria andNsCustom4LessThanOrEqualTo(String value) {
            addCriterion("ns_custom4 <=", value, "nsCustom4");
            return (Criteria) this;
        }

        public Criteria andNsCustom4Like(String value) {
            addCriterion("ns_custom4 like", value, "nsCustom4");
            return (Criteria) this;
        }

        public Criteria andNsCustom4NotLike(String value) {
            addCriterion("ns_custom4 not like", value, "nsCustom4");
            return (Criteria) this;
        }

        public Criteria andNsCustom4In(List<String> values) {
            addCriterion("ns_custom4 in", values, "nsCustom4");
            return (Criteria) this;
        }

        public Criteria andNsCustom4NotIn(List<String> values) {
            addCriterion("ns_custom4 not in", values, "nsCustom4");
            return (Criteria) this;
        }

        public Criteria andNsCustom4Between(String value1, String value2) {
            addCriterion("ns_custom4 between", value1, value2, "nsCustom4");
            return (Criteria) this;
        }

        public Criteria andNsCustom4NotBetween(String value1, String value2) {
            addCriterion("ns_custom4 not between", value1, value2, "nsCustom4");
            return (Criteria) this;
        }

        public Criteria andNsCustom5IsNull() {
            addCriterion("ns_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andNsCustom5IsNotNull() {
            addCriterion("ns_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andNsCustom5EqualTo(String value) {
            addCriterion("ns_custom5 =", value, "nsCustom5");
            return (Criteria) this;
        }

        public Criteria andNsCustom5NotEqualTo(String value) {
            addCriterion("ns_custom5 <>", value, "nsCustom5");
            return (Criteria) this;
        }

        public Criteria andNsCustom5GreaterThan(String value) {
            addCriterion("ns_custom5 >", value, "nsCustom5");
            return (Criteria) this;
        }

        public Criteria andNsCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("ns_custom5 >=", value, "nsCustom5");
            return (Criteria) this;
        }

        public Criteria andNsCustom5LessThan(String value) {
            addCriterion("ns_custom5 <", value, "nsCustom5");
            return (Criteria) this;
        }

        public Criteria andNsCustom5LessThanOrEqualTo(String value) {
            addCriterion("ns_custom5 <=", value, "nsCustom5");
            return (Criteria) this;
        }

        public Criteria andNsCustom5Like(String value) {
            addCriterion("ns_custom5 like", value, "nsCustom5");
            return (Criteria) this;
        }

        public Criteria andNsCustom5NotLike(String value) {
            addCriterion("ns_custom5 not like", value, "nsCustom5");
            return (Criteria) this;
        }

        public Criteria andNsCustom5In(List<String> values) {
            addCriterion("ns_custom5 in", values, "nsCustom5");
            return (Criteria) this;
        }

        public Criteria andNsCustom5NotIn(List<String> values) {
            addCriterion("ns_custom5 not in", values, "nsCustom5");
            return (Criteria) this;
        }

        public Criteria andNsCustom5Between(String value1, String value2) {
            addCriterion("ns_custom5 between", value1, value2, "nsCustom5");
            return (Criteria) this;
        }

        public Criteria andNsCustom5NotBetween(String value1, String value2) {
            addCriterion("ns_custom5 not between", value1, value2, "nsCustom5");
            return (Criteria) this;
        }

        public Criteria andNsCustom6IsNull() {
            addCriterion("ns_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andNsCustom6IsNotNull() {
            addCriterion("ns_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andNsCustom6EqualTo(String value) {
            addCriterion("ns_custom6 =", value, "nsCustom6");
            return (Criteria) this;
        }

        public Criteria andNsCustom6NotEqualTo(String value) {
            addCriterion("ns_custom6 <>", value, "nsCustom6");
            return (Criteria) this;
        }

        public Criteria andNsCustom6GreaterThan(String value) {
            addCriterion("ns_custom6 >", value, "nsCustom6");
            return (Criteria) this;
        }

        public Criteria andNsCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("ns_custom6 >=", value, "nsCustom6");
            return (Criteria) this;
        }

        public Criteria andNsCustom6LessThan(String value) {
            addCriterion("ns_custom6 <", value, "nsCustom6");
            return (Criteria) this;
        }

        public Criteria andNsCustom6LessThanOrEqualTo(String value) {
            addCriterion("ns_custom6 <=", value, "nsCustom6");
            return (Criteria) this;
        }

        public Criteria andNsCustom6Like(String value) {
            addCriterion("ns_custom6 like", value, "nsCustom6");
            return (Criteria) this;
        }

        public Criteria andNsCustom6NotLike(String value) {
            addCriterion("ns_custom6 not like", value, "nsCustom6");
            return (Criteria) this;
        }

        public Criteria andNsCustom6In(List<String> values) {
            addCriterion("ns_custom6 in", values, "nsCustom6");
            return (Criteria) this;
        }

        public Criteria andNsCustom6NotIn(List<String> values) {
            addCriterion("ns_custom6 not in", values, "nsCustom6");
            return (Criteria) this;
        }

        public Criteria andNsCustom6Between(String value1, String value2) {
            addCriterion("ns_custom6 between", value1, value2, "nsCustom6");
            return (Criteria) this;
        }

        public Criteria andNsCustom6NotBetween(String value1, String value2) {
            addCriterion("ns_custom6 not between", value1, value2, "nsCustom6");
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