package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CustomerGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerGradeExample() {
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

        public Criteria andCgIdIsNull() {
            addCriterion("cg_id is null");
            return (Criteria) this;
        }

        public Criteria andCgIdIsNotNull() {
            addCriterion("cg_id is not null");
            return (Criteria) this;
        }

        public Criteria andCgIdEqualTo(String value) {
            addCriterion("cg_id =", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotEqualTo(String value) {
            addCriterion("cg_id <>", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdGreaterThan(String value) {
            addCriterion("cg_id >", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdGreaterThanOrEqualTo(String value) {
            addCriterion("cg_id >=", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdLessThan(String value) {
            addCriterion("cg_id <", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdLessThanOrEqualTo(String value) {
            addCriterion("cg_id <=", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdLike(String value) {
            addCriterion("cg_id like", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotLike(String value) {
            addCriterion("cg_id not like", value, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdIn(List<String> values) {
            addCriterion("cg_id in", values, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotIn(List<String> values) {
            addCriterion("cg_id not in", values, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdBetween(String value1, String value2) {
            addCriterion("cg_id between", value1, value2, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgIdNotBetween(String value1, String value2) {
            addCriterion("cg_id not between", value1, value2, "cgId");
            return (Criteria) this;
        }

        public Criteria andCgNameIsNull() {
            addCriterion("cg_name is null");
            return (Criteria) this;
        }

        public Criteria andCgNameIsNotNull() {
            addCriterion("cg_name is not null");
            return (Criteria) this;
        }

        public Criteria andCgNameEqualTo(String value) {
            addCriterion("cg_name =", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameNotEqualTo(String value) {
            addCriterion("cg_name <>", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameGreaterThan(String value) {
            addCriterion("cg_name >", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameGreaterThanOrEqualTo(String value) {
            addCriterion("cg_name >=", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameLessThan(String value) {
            addCriterion("cg_name <", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameLessThanOrEqualTo(String value) {
            addCriterion("cg_name <=", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameLike(String value) {
            addCriterion("cg_name like", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameNotLike(String value) {
            addCriterion("cg_name not like", value, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameIn(List<String> values) {
            addCriterion("cg_name in", values, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameNotIn(List<String> values) {
            addCriterion("cg_name not in", values, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameBetween(String value1, String value2) {
            addCriterion("cg_name between", value1, value2, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgNameNotBetween(String value1, String value2) {
            addCriterion("cg_name not between", value1, value2, "cgName");
            return (Criteria) this;
        }

        public Criteria andCgRemarkIsNull() {
            addCriterion("cg_remark is null");
            return (Criteria) this;
        }

        public Criteria andCgRemarkIsNotNull() {
            addCriterion("cg_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCgRemarkEqualTo(String value) {
            addCriterion("cg_remark =", value, "cgRemark");
            return (Criteria) this;
        }

        public Criteria andCgRemarkNotEqualTo(String value) {
            addCriterion("cg_remark <>", value, "cgRemark");
            return (Criteria) this;
        }

        public Criteria andCgRemarkGreaterThan(String value) {
            addCriterion("cg_remark >", value, "cgRemark");
            return (Criteria) this;
        }

        public Criteria andCgRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("cg_remark >=", value, "cgRemark");
            return (Criteria) this;
        }

        public Criteria andCgRemarkLessThan(String value) {
            addCriterion("cg_remark <", value, "cgRemark");
            return (Criteria) this;
        }

        public Criteria andCgRemarkLessThanOrEqualTo(String value) {
            addCriterion("cg_remark <=", value, "cgRemark");
            return (Criteria) this;
        }

        public Criteria andCgRemarkLike(String value) {
            addCriterion("cg_remark like", value, "cgRemark");
            return (Criteria) this;
        }

        public Criteria andCgRemarkNotLike(String value) {
            addCriterion("cg_remark not like", value, "cgRemark");
            return (Criteria) this;
        }

        public Criteria andCgRemarkIn(List<String> values) {
            addCriterion("cg_remark in", values, "cgRemark");
            return (Criteria) this;
        }

        public Criteria andCgRemarkNotIn(List<String> values) {
            addCriterion("cg_remark not in", values, "cgRemark");
            return (Criteria) this;
        }

        public Criteria andCgRemarkBetween(String value1, String value2) {
            addCriterion("cg_remark between", value1, value2, "cgRemark");
            return (Criteria) this;
        }

        public Criteria andCgRemarkNotBetween(String value1, String value2) {
            addCriterion("cg_remark not between", value1, value2, "cgRemark");
            return (Criteria) this;
        }

        public Criteria andCgAuditingIsNull() {
            addCriterion("cg_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andCgAuditingIsNotNull() {
            addCriterion("cg_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andCgAuditingEqualTo(String value) {
            addCriterion("cg_Auditing =", value, "cgAuditing");
            return (Criteria) this;
        }

        public Criteria andCgAuditingNotEqualTo(String value) {
            addCriterion("cg_Auditing <>", value, "cgAuditing");
            return (Criteria) this;
        }

        public Criteria andCgAuditingGreaterThan(String value) {
            addCriterion("cg_Auditing >", value, "cgAuditing");
            return (Criteria) this;
        }

        public Criteria andCgAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("cg_Auditing >=", value, "cgAuditing");
            return (Criteria) this;
        }

        public Criteria andCgAuditingLessThan(String value) {
            addCriterion("cg_Auditing <", value, "cgAuditing");
            return (Criteria) this;
        }

        public Criteria andCgAuditingLessThanOrEqualTo(String value) {
            addCriterion("cg_Auditing <=", value, "cgAuditing");
            return (Criteria) this;
        }

        public Criteria andCgAuditingLike(String value) {
            addCriterion("cg_Auditing like", value, "cgAuditing");
            return (Criteria) this;
        }

        public Criteria andCgAuditingNotLike(String value) {
            addCriterion("cg_Auditing not like", value, "cgAuditing");
            return (Criteria) this;
        }

        public Criteria andCgAuditingIn(List<String> values) {
            addCriterion("cg_Auditing in", values, "cgAuditing");
            return (Criteria) this;
        }

        public Criteria andCgAuditingNotIn(List<String> values) {
            addCriterion("cg_Auditing not in", values, "cgAuditing");
            return (Criteria) this;
        }

        public Criteria andCgAuditingBetween(String value1, String value2) {
            addCriterion("cg_Auditing between", value1, value2, "cgAuditing");
            return (Criteria) this;
        }

        public Criteria andCgAuditingNotBetween(String value1, String value2) {
            addCriterion("cg_Auditing not between", value1, value2, "cgAuditing");
            return (Criteria) this;
        }

        public Criteria andCgYnIsNull() {
            addCriterion("cg_yn is null");
            return (Criteria) this;
        }

        public Criteria andCgYnIsNotNull() {
            addCriterion("cg_yn is not null");
            return (Criteria) this;
        }

        public Criteria andCgYnEqualTo(String value) {
            addCriterion("cg_yn =", value, "cgYn");
            return (Criteria) this;
        }

        public Criteria andCgYnNotEqualTo(String value) {
            addCriterion("cg_yn <>", value, "cgYn");
            return (Criteria) this;
        }

        public Criteria andCgYnGreaterThan(String value) {
            addCriterion("cg_yn >", value, "cgYn");
            return (Criteria) this;
        }

        public Criteria andCgYnGreaterThanOrEqualTo(String value) {
            addCriterion("cg_yn >=", value, "cgYn");
            return (Criteria) this;
        }

        public Criteria andCgYnLessThan(String value) {
            addCriterion("cg_yn <", value, "cgYn");
            return (Criteria) this;
        }

        public Criteria andCgYnLessThanOrEqualTo(String value) {
            addCriterion("cg_yn <=", value, "cgYn");
            return (Criteria) this;
        }

        public Criteria andCgYnLike(String value) {
            addCriterion("cg_yn like", value, "cgYn");
            return (Criteria) this;
        }

        public Criteria andCgYnNotLike(String value) {
            addCriterion("cg_yn not like", value, "cgYn");
            return (Criteria) this;
        }

        public Criteria andCgYnIn(List<String> values) {
            addCriterion("cg_yn in", values, "cgYn");
            return (Criteria) this;
        }

        public Criteria andCgYnNotIn(List<String> values) {
            addCriterion("cg_yn not in", values, "cgYn");
            return (Criteria) this;
        }

        public Criteria andCgYnBetween(String value1, String value2) {
            addCriterion("cg_yn between", value1, value2, "cgYn");
            return (Criteria) this;
        }

        public Criteria andCgYnNotBetween(String value1, String value2) {
            addCriterion("cg_yn not between", value1, value2, "cgYn");
            return (Criteria) this;
        }

        public Criteria andCgCustom1IsNull() {
            addCriterion("cg_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCgCustom1IsNotNull() {
            addCriterion("cg_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCgCustom1EqualTo(String value) {
            addCriterion("cg_custom1 =", value, "cgCustom1");
            return (Criteria) this;
        }

        public Criteria andCgCustom1NotEqualTo(String value) {
            addCriterion("cg_custom1 <>", value, "cgCustom1");
            return (Criteria) this;
        }

        public Criteria andCgCustom1GreaterThan(String value) {
            addCriterion("cg_custom1 >", value, "cgCustom1");
            return (Criteria) this;
        }

        public Criteria andCgCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("cg_custom1 >=", value, "cgCustom1");
            return (Criteria) this;
        }

        public Criteria andCgCustom1LessThan(String value) {
            addCriterion("cg_custom1 <", value, "cgCustom1");
            return (Criteria) this;
        }

        public Criteria andCgCustom1LessThanOrEqualTo(String value) {
            addCriterion("cg_custom1 <=", value, "cgCustom1");
            return (Criteria) this;
        }

        public Criteria andCgCustom1Like(String value) {
            addCriterion("cg_custom1 like", value, "cgCustom1");
            return (Criteria) this;
        }

        public Criteria andCgCustom1NotLike(String value) {
            addCriterion("cg_custom1 not like", value, "cgCustom1");
            return (Criteria) this;
        }

        public Criteria andCgCustom1In(List<String> values) {
            addCriterion("cg_custom1 in", values, "cgCustom1");
            return (Criteria) this;
        }

        public Criteria andCgCustom1NotIn(List<String> values) {
            addCriterion("cg_custom1 not in", values, "cgCustom1");
            return (Criteria) this;
        }

        public Criteria andCgCustom1Between(String value1, String value2) {
            addCriterion("cg_custom1 between", value1, value2, "cgCustom1");
            return (Criteria) this;
        }

        public Criteria andCgCustom1NotBetween(String value1, String value2) {
            addCriterion("cg_custom1 not between", value1, value2, "cgCustom1");
            return (Criteria) this;
        }

        public Criteria andCgCustom2IsNull() {
            addCriterion("cg_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCgCustom2IsNotNull() {
            addCriterion("cg_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCgCustom2EqualTo(String value) {
            addCriterion("cg_custom2 =", value, "cgCustom2");
            return (Criteria) this;
        }

        public Criteria andCgCustom2NotEqualTo(String value) {
            addCriterion("cg_custom2 <>", value, "cgCustom2");
            return (Criteria) this;
        }

        public Criteria andCgCustom2GreaterThan(String value) {
            addCriterion("cg_custom2 >", value, "cgCustom2");
            return (Criteria) this;
        }

        public Criteria andCgCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("cg_custom2 >=", value, "cgCustom2");
            return (Criteria) this;
        }

        public Criteria andCgCustom2LessThan(String value) {
            addCriterion("cg_custom2 <", value, "cgCustom2");
            return (Criteria) this;
        }

        public Criteria andCgCustom2LessThanOrEqualTo(String value) {
            addCriterion("cg_custom2 <=", value, "cgCustom2");
            return (Criteria) this;
        }

        public Criteria andCgCustom2Like(String value) {
            addCriterion("cg_custom2 like", value, "cgCustom2");
            return (Criteria) this;
        }

        public Criteria andCgCustom2NotLike(String value) {
            addCriterion("cg_custom2 not like", value, "cgCustom2");
            return (Criteria) this;
        }

        public Criteria andCgCustom2In(List<String> values) {
            addCriterion("cg_custom2 in", values, "cgCustom2");
            return (Criteria) this;
        }

        public Criteria andCgCustom2NotIn(List<String> values) {
            addCriterion("cg_custom2 not in", values, "cgCustom2");
            return (Criteria) this;
        }

        public Criteria andCgCustom2Between(String value1, String value2) {
            addCriterion("cg_custom2 between", value1, value2, "cgCustom2");
            return (Criteria) this;
        }

        public Criteria andCgCustom2NotBetween(String value1, String value2) {
            addCriterion("cg_custom2 not between", value1, value2, "cgCustom2");
            return (Criteria) this;
        }

        public Criteria andCgCustom3IsNull() {
            addCriterion("cg_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andCgCustom3IsNotNull() {
            addCriterion("cg_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andCgCustom3EqualTo(String value) {
            addCriterion("cg_custom3 =", value, "cgCustom3");
            return (Criteria) this;
        }

        public Criteria andCgCustom3NotEqualTo(String value) {
            addCriterion("cg_custom3 <>", value, "cgCustom3");
            return (Criteria) this;
        }

        public Criteria andCgCustom3GreaterThan(String value) {
            addCriterion("cg_custom3 >", value, "cgCustom3");
            return (Criteria) this;
        }

        public Criteria andCgCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("cg_custom3 >=", value, "cgCustom3");
            return (Criteria) this;
        }

        public Criteria andCgCustom3LessThan(String value) {
            addCriterion("cg_custom3 <", value, "cgCustom3");
            return (Criteria) this;
        }

        public Criteria andCgCustom3LessThanOrEqualTo(String value) {
            addCriterion("cg_custom3 <=", value, "cgCustom3");
            return (Criteria) this;
        }

        public Criteria andCgCustom3Like(String value) {
            addCriterion("cg_custom3 like", value, "cgCustom3");
            return (Criteria) this;
        }

        public Criteria andCgCustom3NotLike(String value) {
            addCriterion("cg_custom3 not like", value, "cgCustom3");
            return (Criteria) this;
        }

        public Criteria andCgCustom3In(List<String> values) {
            addCriterion("cg_custom3 in", values, "cgCustom3");
            return (Criteria) this;
        }

        public Criteria andCgCustom3NotIn(List<String> values) {
            addCriterion("cg_custom3 not in", values, "cgCustom3");
            return (Criteria) this;
        }

        public Criteria andCgCustom3Between(String value1, String value2) {
            addCriterion("cg_custom3 between", value1, value2, "cgCustom3");
            return (Criteria) this;
        }

        public Criteria andCgCustom3NotBetween(String value1, String value2) {
            addCriterion("cg_custom3 not between", value1, value2, "cgCustom3");
            return (Criteria) this;
        }

        public Criteria andCgCustom4IsNull() {
            addCriterion("cg_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andCgCustom4IsNotNull() {
            addCriterion("cg_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andCgCustom4EqualTo(String value) {
            addCriterion("cg_custom4 =", value, "cgCustom4");
            return (Criteria) this;
        }

        public Criteria andCgCustom4NotEqualTo(String value) {
            addCriterion("cg_custom4 <>", value, "cgCustom4");
            return (Criteria) this;
        }

        public Criteria andCgCustom4GreaterThan(String value) {
            addCriterion("cg_custom4 >", value, "cgCustom4");
            return (Criteria) this;
        }

        public Criteria andCgCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("cg_custom4 >=", value, "cgCustom4");
            return (Criteria) this;
        }

        public Criteria andCgCustom4LessThan(String value) {
            addCriterion("cg_custom4 <", value, "cgCustom4");
            return (Criteria) this;
        }

        public Criteria andCgCustom4LessThanOrEqualTo(String value) {
            addCriterion("cg_custom4 <=", value, "cgCustom4");
            return (Criteria) this;
        }

        public Criteria andCgCustom4Like(String value) {
            addCriterion("cg_custom4 like", value, "cgCustom4");
            return (Criteria) this;
        }

        public Criteria andCgCustom4NotLike(String value) {
            addCriterion("cg_custom4 not like", value, "cgCustom4");
            return (Criteria) this;
        }

        public Criteria andCgCustom4In(List<String> values) {
            addCriterion("cg_custom4 in", values, "cgCustom4");
            return (Criteria) this;
        }

        public Criteria andCgCustom4NotIn(List<String> values) {
            addCriterion("cg_custom4 not in", values, "cgCustom4");
            return (Criteria) this;
        }

        public Criteria andCgCustom4Between(String value1, String value2) {
            addCriterion("cg_custom4 between", value1, value2, "cgCustom4");
            return (Criteria) this;
        }

        public Criteria andCgCustom4NotBetween(String value1, String value2) {
            addCriterion("cg_custom4 not between", value1, value2, "cgCustom4");
            return (Criteria) this;
        }

        public Criteria andCgCustom5IsNull() {
            addCriterion("cg_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andCgCustom5IsNotNull() {
            addCriterion("cg_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andCgCustom5EqualTo(String value) {
            addCriterion("cg_custom5 =", value, "cgCustom5");
            return (Criteria) this;
        }

        public Criteria andCgCustom5NotEqualTo(String value) {
            addCriterion("cg_custom5 <>", value, "cgCustom5");
            return (Criteria) this;
        }

        public Criteria andCgCustom5GreaterThan(String value) {
            addCriterion("cg_custom5 >", value, "cgCustom5");
            return (Criteria) this;
        }

        public Criteria andCgCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("cg_custom5 >=", value, "cgCustom5");
            return (Criteria) this;
        }

        public Criteria andCgCustom5LessThan(String value) {
            addCriterion("cg_custom5 <", value, "cgCustom5");
            return (Criteria) this;
        }

        public Criteria andCgCustom5LessThanOrEqualTo(String value) {
            addCriterion("cg_custom5 <=", value, "cgCustom5");
            return (Criteria) this;
        }

        public Criteria andCgCustom5Like(String value) {
            addCriterion("cg_custom5 like", value, "cgCustom5");
            return (Criteria) this;
        }

        public Criteria andCgCustom5NotLike(String value) {
            addCriterion("cg_custom5 not like", value, "cgCustom5");
            return (Criteria) this;
        }

        public Criteria andCgCustom5In(List<String> values) {
            addCriterion("cg_custom5 in", values, "cgCustom5");
            return (Criteria) this;
        }

        public Criteria andCgCustom5NotIn(List<String> values) {
            addCriterion("cg_custom5 not in", values, "cgCustom5");
            return (Criteria) this;
        }

        public Criteria andCgCustom5Between(String value1, String value2) {
            addCriterion("cg_custom5 between", value1, value2, "cgCustom5");
            return (Criteria) this;
        }

        public Criteria andCgCustom5NotBetween(String value1, String value2) {
            addCriterion("cg_custom5 not between", value1, value2, "cgCustom5");
            return (Criteria) this;
        }

        public Criteria andCgCustom6IsNull() {
            addCriterion("cg_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andCgCustom6IsNotNull() {
            addCriterion("cg_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andCgCustom6EqualTo(String value) {
            addCriterion("cg_custom6 =", value, "cgCustom6");
            return (Criteria) this;
        }

        public Criteria andCgCustom6NotEqualTo(String value) {
            addCriterion("cg_custom6 <>", value, "cgCustom6");
            return (Criteria) this;
        }

        public Criteria andCgCustom6GreaterThan(String value) {
            addCriterion("cg_custom6 >", value, "cgCustom6");
            return (Criteria) this;
        }

        public Criteria andCgCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("cg_custom6 >=", value, "cgCustom6");
            return (Criteria) this;
        }

        public Criteria andCgCustom6LessThan(String value) {
            addCriterion("cg_custom6 <", value, "cgCustom6");
            return (Criteria) this;
        }

        public Criteria andCgCustom6LessThanOrEqualTo(String value) {
            addCriterion("cg_custom6 <=", value, "cgCustom6");
            return (Criteria) this;
        }

        public Criteria andCgCustom6Like(String value) {
            addCriterion("cg_custom6 like", value, "cgCustom6");
            return (Criteria) this;
        }

        public Criteria andCgCustom6NotLike(String value) {
            addCriterion("cg_custom6 not like", value, "cgCustom6");
            return (Criteria) this;
        }

        public Criteria andCgCustom6In(List<String> values) {
            addCriterion("cg_custom6 in", values, "cgCustom6");
            return (Criteria) this;
        }

        public Criteria andCgCustom6NotIn(List<String> values) {
            addCriterion("cg_custom6 not in", values, "cgCustom6");
            return (Criteria) this;
        }

        public Criteria andCgCustom6Between(String value1, String value2) {
            addCriterion("cg_custom6 between", value1, value2, "cgCustom6");
            return (Criteria) this;
        }

        public Criteria andCgCustom6NotBetween(String value1, String value2) {
            addCriterion("cg_custom6 not between", value1, value2, "cgCustom6");
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