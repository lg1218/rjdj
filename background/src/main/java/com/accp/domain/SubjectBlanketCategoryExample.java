package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SubjectBlanketCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectBlanketCategoryExample() {
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

        public Criteria andSbcIdIsNull() {
            addCriterion("sbc_id is null");
            return (Criteria) this;
        }

        public Criteria andSbcIdIsNotNull() {
            addCriterion("sbc_id is not null");
            return (Criteria) this;
        }

        public Criteria andSbcIdEqualTo(String value) {
            addCriterion("sbc_id =", value, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdNotEqualTo(String value) {
            addCriterion("sbc_id <>", value, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdGreaterThan(String value) {
            addCriterion("sbc_id >", value, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdGreaterThanOrEqualTo(String value) {
            addCriterion("sbc_id >=", value, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdLessThan(String value) {
            addCriterion("sbc_id <", value, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdLessThanOrEqualTo(String value) {
            addCriterion("sbc_id <=", value, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdLike(String value) {
            addCriterion("sbc_id like", value, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdNotLike(String value) {
            addCriterion("sbc_id not like", value, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdIn(List<String> values) {
            addCriterion("sbc_id in", values, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdNotIn(List<String> values) {
            addCriterion("sbc_id not in", values, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdBetween(String value1, String value2) {
            addCriterion("sbc_id between", value1, value2, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdNotBetween(String value1, String value2) {
            addCriterion("sbc_id not between", value1, value2, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcNameIsNull() {
            addCriterion("sbc_name is null");
            return (Criteria) this;
        }

        public Criteria andSbcNameIsNotNull() {
            addCriterion("sbc_name is not null");
            return (Criteria) this;
        }

        public Criteria andSbcNameEqualTo(String value) {
            addCriterion("sbc_name =", value, "sbcName");
            return (Criteria) this;
        }

        public Criteria andSbcNameNotEqualTo(String value) {
            addCriterion("sbc_name <>", value, "sbcName");
            return (Criteria) this;
        }

        public Criteria andSbcNameGreaterThan(String value) {
            addCriterion("sbc_name >", value, "sbcName");
            return (Criteria) this;
        }

        public Criteria andSbcNameGreaterThanOrEqualTo(String value) {
            addCriterion("sbc_name >=", value, "sbcName");
            return (Criteria) this;
        }

        public Criteria andSbcNameLessThan(String value) {
            addCriterion("sbc_name <", value, "sbcName");
            return (Criteria) this;
        }

        public Criteria andSbcNameLessThanOrEqualTo(String value) {
            addCriterion("sbc_name <=", value, "sbcName");
            return (Criteria) this;
        }

        public Criteria andSbcNameLike(String value) {
            addCriterion("sbc_name like", value, "sbcName");
            return (Criteria) this;
        }

        public Criteria andSbcNameNotLike(String value) {
            addCriterion("sbc_name not like", value, "sbcName");
            return (Criteria) this;
        }

        public Criteria andSbcNameIn(List<String> values) {
            addCriterion("sbc_name in", values, "sbcName");
            return (Criteria) this;
        }

        public Criteria andSbcNameNotIn(List<String> values) {
            addCriterion("sbc_name not in", values, "sbcName");
            return (Criteria) this;
        }

        public Criteria andSbcNameBetween(String value1, String value2) {
            addCriterion("sbc_name between", value1, value2, "sbcName");
            return (Criteria) this;
        }

        public Criteria andSbcNameNotBetween(String value1, String value2) {
            addCriterion("sbc_name not between", value1, value2, "sbcName");
            return (Criteria) this;
        }

        public Criteria andSbcEngnameIsNull() {
            addCriterion("sbc_engname is null");
            return (Criteria) this;
        }

        public Criteria andSbcEngnameIsNotNull() {
            addCriterion("sbc_engname is not null");
            return (Criteria) this;
        }

        public Criteria andSbcEngnameEqualTo(String value) {
            addCriterion("sbc_engname =", value, "sbcEngname");
            return (Criteria) this;
        }

        public Criteria andSbcEngnameNotEqualTo(String value) {
            addCriterion("sbc_engname <>", value, "sbcEngname");
            return (Criteria) this;
        }

        public Criteria andSbcEngnameGreaterThan(String value) {
            addCriterion("sbc_engname >", value, "sbcEngname");
            return (Criteria) this;
        }

        public Criteria andSbcEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("sbc_engname >=", value, "sbcEngname");
            return (Criteria) this;
        }

        public Criteria andSbcEngnameLessThan(String value) {
            addCriterion("sbc_engname <", value, "sbcEngname");
            return (Criteria) this;
        }

        public Criteria andSbcEngnameLessThanOrEqualTo(String value) {
            addCriterion("sbc_engname <=", value, "sbcEngname");
            return (Criteria) this;
        }

        public Criteria andSbcEngnameLike(String value) {
            addCriterion("sbc_engname like", value, "sbcEngname");
            return (Criteria) this;
        }

        public Criteria andSbcEngnameNotLike(String value) {
            addCriterion("sbc_engname not like", value, "sbcEngname");
            return (Criteria) this;
        }

        public Criteria andSbcEngnameIn(List<String> values) {
            addCriterion("sbc_engname in", values, "sbcEngname");
            return (Criteria) this;
        }

        public Criteria andSbcEngnameNotIn(List<String> values) {
            addCriterion("sbc_engname not in", values, "sbcEngname");
            return (Criteria) this;
        }

        public Criteria andSbcEngnameBetween(String value1, String value2) {
            addCriterion("sbc_engname between", value1, value2, "sbcEngname");
            return (Criteria) this;
        }

        public Criteria andSbcEngnameNotBetween(String value1, String value2) {
            addCriterion("sbc_engname not between", value1, value2, "sbcEngname");
            return (Criteria) this;
        }

        public Criteria andSbcRemarkIsNull() {
            addCriterion("sbc_remark is null");
            return (Criteria) this;
        }

        public Criteria andSbcRemarkIsNotNull() {
            addCriterion("sbc_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSbcRemarkEqualTo(String value) {
            addCriterion("sbc_remark =", value, "sbcRemark");
            return (Criteria) this;
        }

        public Criteria andSbcRemarkNotEqualTo(String value) {
            addCriterion("sbc_remark <>", value, "sbcRemark");
            return (Criteria) this;
        }

        public Criteria andSbcRemarkGreaterThan(String value) {
            addCriterion("sbc_remark >", value, "sbcRemark");
            return (Criteria) this;
        }

        public Criteria andSbcRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sbc_remark >=", value, "sbcRemark");
            return (Criteria) this;
        }

        public Criteria andSbcRemarkLessThan(String value) {
            addCriterion("sbc_remark <", value, "sbcRemark");
            return (Criteria) this;
        }

        public Criteria andSbcRemarkLessThanOrEqualTo(String value) {
            addCriterion("sbc_remark <=", value, "sbcRemark");
            return (Criteria) this;
        }

        public Criteria andSbcRemarkLike(String value) {
            addCriterion("sbc_remark like", value, "sbcRemark");
            return (Criteria) this;
        }

        public Criteria andSbcRemarkNotLike(String value) {
            addCriterion("sbc_remark not like", value, "sbcRemark");
            return (Criteria) this;
        }

        public Criteria andSbcRemarkIn(List<String> values) {
            addCriterion("sbc_remark in", values, "sbcRemark");
            return (Criteria) this;
        }

        public Criteria andSbcRemarkNotIn(List<String> values) {
            addCriterion("sbc_remark not in", values, "sbcRemark");
            return (Criteria) this;
        }

        public Criteria andSbcRemarkBetween(String value1, String value2) {
            addCriterion("sbc_remark between", value1, value2, "sbcRemark");
            return (Criteria) this;
        }

        public Criteria andSbcRemarkNotBetween(String value1, String value2) {
            addCriterion("sbc_remark not between", value1, value2, "sbcRemark");
            return (Criteria) this;
        }

        public Criteria andSbcAuditingIsNull() {
            addCriterion("sbc_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andSbcAuditingIsNotNull() {
            addCriterion("sbc_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andSbcAuditingEqualTo(String value) {
            addCriterion("sbc_Auditing =", value, "sbcAuditing");
            return (Criteria) this;
        }

        public Criteria andSbcAuditingNotEqualTo(String value) {
            addCriterion("sbc_Auditing <>", value, "sbcAuditing");
            return (Criteria) this;
        }

        public Criteria andSbcAuditingGreaterThan(String value) {
            addCriterion("sbc_Auditing >", value, "sbcAuditing");
            return (Criteria) this;
        }

        public Criteria andSbcAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("sbc_Auditing >=", value, "sbcAuditing");
            return (Criteria) this;
        }

        public Criteria andSbcAuditingLessThan(String value) {
            addCriterion("sbc_Auditing <", value, "sbcAuditing");
            return (Criteria) this;
        }

        public Criteria andSbcAuditingLessThanOrEqualTo(String value) {
            addCriterion("sbc_Auditing <=", value, "sbcAuditing");
            return (Criteria) this;
        }

        public Criteria andSbcAuditingLike(String value) {
            addCriterion("sbc_Auditing like", value, "sbcAuditing");
            return (Criteria) this;
        }

        public Criteria andSbcAuditingNotLike(String value) {
            addCriterion("sbc_Auditing not like", value, "sbcAuditing");
            return (Criteria) this;
        }

        public Criteria andSbcAuditingIn(List<String> values) {
            addCriterion("sbc_Auditing in", values, "sbcAuditing");
            return (Criteria) this;
        }

        public Criteria andSbcAuditingNotIn(List<String> values) {
            addCriterion("sbc_Auditing not in", values, "sbcAuditing");
            return (Criteria) this;
        }

        public Criteria andSbcAuditingBetween(String value1, String value2) {
            addCriterion("sbc_Auditing between", value1, value2, "sbcAuditing");
            return (Criteria) this;
        }

        public Criteria andSbcAuditingNotBetween(String value1, String value2) {
            addCriterion("sbc_Auditing not between", value1, value2, "sbcAuditing");
            return (Criteria) this;
        }

        public Criteria andSbcYnIsNull() {
            addCriterion("sbc_yn is null");
            return (Criteria) this;
        }

        public Criteria andSbcYnIsNotNull() {
            addCriterion("sbc_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSbcYnEqualTo(String value) {
            addCriterion("sbc_yn =", value, "sbcYn");
            return (Criteria) this;
        }

        public Criteria andSbcYnNotEqualTo(String value) {
            addCriterion("sbc_yn <>", value, "sbcYn");
            return (Criteria) this;
        }

        public Criteria andSbcYnGreaterThan(String value) {
            addCriterion("sbc_yn >", value, "sbcYn");
            return (Criteria) this;
        }

        public Criteria andSbcYnGreaterThanOrEqualTo(String value) {
            addCriterion("sbc_yn >=", value, "sbcYn");
            return (Criteria) this;
        }

        public Criteria andSbcYnLessThan(String value) {
            addCriterion("sbc_yn <", value, "sbcYn");
            return (Criteria) this;
        }

        public Criteria andSbcYnLessThanOrEqualTo(String value) {
            addCriterion("sbc_yn <=", value, "sbcYn");
            return (Criteria) this;
        }

        public Criteria andSbcYnLike(String value) {
            addCriterion("sbc_yn like", value, "sbcYn");
            return (Criteria) this;
        }

        public Criteria andSbcYnNotLike(String value) {
            addCriterion("sbc_yn not like", value, "sbcYn");
            return (Criteria) this;
        }

        public Criteria andSbcYnIn(List<String> values) {
            addCriterion("sbc_yn in", values, "sbcYn");
            return (Criteria) this;
        }

        public Criteria andSbcYnNotIn(List<String> values) {
            addCriterion("sbc_yn not in", values, "sbcYn");
            return (Criteria) this;
        }

        public Criteria andSbcYnBetween(String value1, String value2) {
            addCriterion("sbc_yn between", value1, value2, "sbcYn");
            return (Criteria) this;
        }

        public Criteria andSbcYnNotBetween(String value1, String value2) {
            addCriterion("sbc_yn not between", value1, value2, "sbcYn");
            return (Criteria) this;
        }

        public Criteria andSbcCustom1IsNull() {
            addCriterion("sbc_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andSbcCustom1IsNotNull() {
            addCriterion("sbc_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSbcCustom1EqualTo(String value) {
            addCriterion("sbc_custom1 =", value, "sbcCustom1");
            return (Criteria) this;
        }

        public Criteria andSbcCustom1NotEqualTo(String value) {
            addCriterion("sbc_custom1 <>", value, "sbcCustom1");
            return (Criteria) this;
        }

        public Criteria andSbcCustom1GreaterThan(String value) {
            addCriterion("sbc_custom1 >", value, "sbcCustom1");
            return (Criteria) this;
        }

        public Criteria andSbcCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("sbc_custom1 >=", value, "sbcCustom1");
            return (Criteria) this;
        }

        public Criteria andSbcCustom1LessThan(String value) {
            addCriterion("sbc_custom1 <", value, "sbcCustom1");
            return (Criteria) this;
        }

        public Criteria andSbcCustom1LessThanOrEqualTo(String value) {
            addCriterion("sbc_custom1 <=", value, "sbcCustom1");
            return (Criteria) this;
        }

        public Criteria andSbcCustom1Like(String value) {
            addCriterion("sbc_custom1 like", value, "sbcCustom1");
            return (Criteria) this;
        }

        public Criteria andSbcCustom1NotLike(String value) {
            addCriterion("sbc_custom1 not like", value, "sbcCustom1");
            return (Criteria) this;
        }

        public Criteria andSbcCustom1In(List<String> values) {
            addCriterion("sbc_custom1 in", values, "sbcCustom1");
            return (Criteria) this;
        }

        public Criteria andSbcCustom1NotIn(List<String> values) {
            addCriterion("sbc_custom1 not in", values, "sbcCustom1");
            return (Criteria) this;
        }

        public Criteria andSbcCustom1Between(String value1, String value2) {
            addCriterion("sbc_custom1 between", value1, value2, "sbcCustom1");
            return (Criteria) this;
        }

        public Criteria andSbcCustom1NotBetween(String value1, String value2) {
            addCriterion("sbc_custom1 not between", value1, value2, "sbcCustom1");
            return (Criteria) this;
        }

        public Criteria andSbcCustom2IsNull() {
            addCriterion("sbc_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andSbcCustom2IsNotNull() {
            addCriterion("sbc_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSbcCustom2EqualTo(String value) {
            addCriterion("sbc_custom2 =", value, "sbcCustom2");
            return (Criteria) this;
        }

        public Criteria andSbcCustom2NotEqualTo(String value) {
            addCriterion("sbc_custom2 <>", value, "sbcCustom2");
            return (Criteria) this;
        }

        public Criteria andSbcCustom2GreaterThan(String value) {
            addCriterion("sbc_custom2 >", value, "sbcCustom2");
            return (Criteria) this;
        }

        public Criteria andSbcCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("sbc_custom2 >=", value, "sbcCustom2");
            return (Criteria) this;
        }

        public Criteria andSbcCustom2LessThan(String value) {
            addCriterion("sbc_custom2 <", value, "sbcCustom2");
            return (Criteria) this;
        }

        public Criteria andSbcCustom2LessThanOrEqualTo(String value) {
            addCriterion("sbc_custom2 <=", value, "sbcCustom2");
            return (Criteria) this;
        }

        public Criteria andSbcCustom2Like(String value) {
            addCriterion("sbc_custom2 like", value, "sbcCustom2");
            return (Criteria) this;
        }

        public Criteria andSbcCustom2NotLike(String value) {
            addCriterion("sbc_custom2 not like", value, "sbcCustom2");
            return (Criteria) this;
        }

        public Criteria andSbcCustom2In(List<String> values) {
            addCriterion("sbc_custom2 in", values, "sbcCustom2");
            return (Criteria) this;
        }

        public Criteria andSbcCustom2NotIn(List<String> values) {
            addCriterion("sbc_custom2 not in", values, "sbcCustom2");
            return (Criteria) this;
        }

        public Criteria andSbcCustom2Between(String value1, String value2) {
            addCriterion("sbc_custom2 between", value1, value2, "sbcCustom2");
            return (Criteria) this;
        }

        public Criteria andSbcCustom2NotBetween(String value1, String value2) {
            addCriterion("sbc_custom2 not between", value1, value2, "sbcCustom2");
            return (Criteria) this;
        }

        public Criteria andSbcCustom3IsNull() {
            addCriterion("sbc_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andSbcCustom3IsNotNull() {
            addCriterion("sbc_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSbcCustom3EqualTo(String value) {
            addCriterion("sbc_custom3 =", value, "sbcCustom3");
            return (Criteria) this;
        }

        public Criteria andSbcCustom3NotEqualTo(String value) {
            addCriterion("sbc_custom3 <>", value, "sbcCustom3");
            return (Criteria) this;
        }

        public Criteria andSbcCustom3GreaterThan(String value) {
            addCriterion("sbc_custom3 >", value, "sbcCustom3");
            return (Criteria) this;
        }

        public Criteria andSbcCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("sbc_custom3 >=", value, "sbcCustom3");
            return (Criteria) this;
        }

        public Criteria andSbcCustom3LessThan(String value) {
            addCriterion("sbc_custom3 <", value, "sbcCustom3");
            return (Criteria) this;
        }

        public Criteria andSbcCustom3LessThanOrEqualTo(String value) {
            addCriterion("sbc_custom3 <=", value, "sbcCustom3");
            return (Criteria) this;
        }

        public Criteria andSbcCustom3Like(String value) {
            addCriterion("sbc_custom3 like", value, "sbcCustom3");
            return (Criteria) this;
        }

        public Criteria andSbcCustom3NotLike(String value) {
            addCriterion("sbc_custom3 not like", value, "sbcCustom3");
            return (Criteria) this;
        }

        public Criteria andSbcCustom3In(List<String> values) {
            addCriterion("sbc_custom3 in", values, "sbcCustom3");
            return (Criteria) this;
        }

        public Criteria andSbcCustom3NotIn(List<String> values) {
            addCriterion("sbc_custom3 not in", values, "sbcCustom3");
            return (Criteria) this;
        }

        public Criteria andSbcCustom3Between(String value1, String value2) {
            addCriterion("sbc_custom3 between", value1, value2, "sbcCustom3");
            return (Criteria) this;
        }

        public Criteria andSbcCustom3NotBetween(String value1, String value2) {
            addCriterion("sbc_custom3 not between", value1, value2, "sbcCustom3");
            return (Criteria) this;
        }

        public Criteria andSbcCustom4IsNull() {
            addCriterion("sbc_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andSbcCustom4IsNotNull() {
            addCriterion("sbc_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andSbcCustom4EqualTo(String value) {
            addCriterion("sbc_custom4 =", value, "sbcCustom4");
            return (Criteria) this;
        }

        public Criteria andSbcCustom4NotEqualTo(String value) {
            addCriterion("sbc_custom4 <>", value, "sbcCustom4");
            return (Criteria) this;
        }

        public Criteria andSbcCustom4GreaterThan(String value) {
            addCriterion("sbc_custom4 >", value, "sbcCustom4");
            return (Criteria) this;
        }

        public Criteria andSbcCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("sbc_custom4 >=", value, "sbcCustom4");
            return (Criteria) this;
        }

        public Criteria andSbcCustom4LessThan(String value) {
            addCriterion("sbc_custom4 <", value, "sbcCustom4");
            return (Criteria) this;
        }

        public Criteria andSbcCustom4LessThanOrEqualTo(String value) {
            addCriterion("sbc_custom4 <=", value, "sbcCustom4");
            return (Criteria) this;
        }

        public Criteria andSbcCustom4Like(String value) {
            addCriterion("sbc_custom4 like", value, "sbcCustom4");
            return (Criteria) this;
        }

        public Criteria andSbcCustom4NotLike(String value) {
            addCriterion("sbc_custom4 not like", value, "sbcCustom4");
            return (Criteria) this;
        }

        public Criteria andSbcCustom4In(List<String> values) {
            addCriterion("sbc_custom4 in", values, "sbcCustom4");
            return (Criteria) this;
        }

        public Criteria andSbcCustom4NotIn(List<String> values) {
            addCriterion("sbc_custom4 not in", values, "sbcCustom4");
            return (Criteria) this;
        }

        public Criteria andSbcCustom4Between(String value1, String value2) {
            addCriterion("sbc_custom4 between", value1, value2, "sbcCustom4");
            return (Criteria) this;
        }

        public Criteria andSbcCustom4NotBetween(String value1, String value2) {
            addCriterion("sbc_custom4 not between", value1, value2, "sbcCustom4");
            return (Criteria) this;
        }

        public Criteria andSbcCustom5IsNull() {
            addCriterion("sbc_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andSbcCustom5IsNotNull() {
            addCriterion("sbc_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andSbcCustom5EqualTo(String value) {
            addCriterion("sbc_custom5 =", value, "sbcCustom5");
            return (Criteria) this;
        }

        public Criteria andSbcCustom5NotEqualTo(String value) {
            addCriterion("sbc_custom5 <>", value, "sbcCustom5");
            return (Criteria) this;
        }

        public Criteria andSbcCustom5GreaterThan(String value) {
            addCriterion("sbc_custom5 >", value, "sbcCustom5");
            return (Criteria) this;
        }

        public Criteria andSbcCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("sbc_custom5 >=", value, "sbcCustom5");
            return (Criteria) this;
        }

        public Criteria andSbcCustom5LessThan(String value) {
            addCriterion("sbc_custom5 <", value, "sbcCustom5");
            return (Criteria) this;
        }

        public Criteria andSbcCustom5LessThanOrEqualTo(String value) {
            addCriterion("sbc_custom5 <=", value, "sbcCustom5");
            return (Criteria) this;
        }

        public Criteria andSbcCustom5Like(String value) {
            addCriterion("sbc_custom5 like", value, "sbcCustom5");
            return (Criteria) this;
        }

        public Criteria andSbcCustom5NotLike(String value) {
            addCriterion("sbc_custom5 not like", value, "sbcCustom5");
            return (Criteria) this;
        }

        public Criteria andSbcCustom5In(List<String> values) {
            addCriterion("sbc_custom5 in", values, "sbcCustom5");
            return (Criteria) this;
        }

        public Criteria andSbcCustom5NotIn(List<String> values) {
            addCriterion("sbc_custom5 not in", values, "sbcCustom5");
            return (Criteria) this;
        }

        public Criteria andSbcCustom5Between(String value1, String value2) {
            addCriterion("sbc_custom5 between", value1, value2, "sbcCustom5");
            return (Criteria) this;
        }

        public Criteria andSbcCustom5NotBetween(String value1, String value2) {
            addCriterion("sbc_custom5 not between", value1, value2, "sbcCustom5");
            return (Criteria) this;
        }

        public Criteria andSbcCustom6IsNull() {
            addCriterion("sbc_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andSbcCustom6IsNotNull() {
            addCriterion("sbc_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andSbcCustom6EqualTo(String value) {
            addCriterion("sbc_custom6 =", value, "sbcCustom6");
            return (Criteria) this;
        }

        public Criteria andSbcCustom6NotEqualTo(String value) {
            addCriterion("sbc_custom6 <>", value, "sbcCustom6");
            return (Criteria) this;
        }

        public Criteria andSbcCustom6GreaterThan(String value) {
            addCriterion("sbc_custom6 >", value, "sbcCustom6");
            return (Criteria) this;
        }

        public Criteria andSbcCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("sbc_custom6 >=", value, "sbcCustom6");
            return (Criteria) this;
        }

        public Criteria andSbcCustom6LessThan(String value) {
            addCriterion("sbc_custom6 <", value, "sbcCustom6");
            return (Criteria) this;
        }

        public Criteria andSbcCustom6LessThanOrEqualTo(String value) {
            addCriterion("sbc_custom6 <=", value, "sbcCustom6");
            return (Criteria) this;
        }

        public Criteria andSbcCustom6Like(String value) {
            addCriterion("sbc_custom6 like", value, "sbcCustom6");
            return (Criteria) this;
        }

        public Criteria andSbcCustom6NotLike(String value) {
            addCriterion("sbc_custom6 not like", value, "sbcCustom6");
            return (Criteria) this;
        }

        public Criteria andSbcCustom6In(List<String> values) {
            addCriterion("sbc_custom6 in", values, "sbcCustom6");
            return (Criteria) this;
        }

        public Criteria andSbcCustom6NotIn(List<String> values) {
            addCriterion("sbc_custom6 not in", values, "sbcCustom6");
            return (Criteria) this;
        }

        public Criteria andSbcCustom6Between(String value1, String value2) {
            addCriterion("sbc_custom6 between", value1, value2, "sbcCustom6");
            return (Criteria) this;
        }

        public Criteria andSbcCustom6NotBetween(String value1, String value2) {
            addCriterion("sbc_custom6 not between", value1, value2, "sbcCustom6");
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