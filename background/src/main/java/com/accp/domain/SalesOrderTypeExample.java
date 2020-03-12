package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SalesOrderTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesOrderTypeExample() {
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

        public Criteria andSotIdIsNull() {
            addCriterion("sot_id is null");
            return (Criteria) this;
        }

        public Criteria andSotIdIsNotNull() {
            addCriterion("sot_id is not null");
            return (Criteria) this;
        }

        public Criteria andSotIdEqualTo(String value) {
            addCriterion("sot_id =", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdNotEqualTo(String value) {
            addCriterion("sot_id <>", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdGreaterThan(String value) {
            addCriterion("sot_id >", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdGreaterThanOrEqualTo(String value) {
            addCriterion("sot_id >=", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdLessThan(String value) {
            addCriterion("sot_id <", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdLessThanOrEqualTo(String value) {
            addCriterion("sot_id <=", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdLike(String value) {
            addCriterion("sot_id like", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdNotLike(String value) {
            addCriterion("sot_id not like", value, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdIn(List<String> values) {
            addCriterion("sot_id in", values, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdNotIn(List<String> values) {
            addCriterion("sot_id not in", values, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdBetween(String value1, String value2) {
            addCriterion("sot_id between", value1, value2, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotIdNotBetween(String value1, String value2) {
            addCriterion("sot_id not between", value1, value2, "sotId");
            return (Criteria) this;
        }

        public Criteria andSotNameIsNull() {
            addCriterion("sot_name is null");
            return (Criteria) this;
        }

        public Criteria andSotNameIsNotNull() {
            addCriterion("sot_name is not null");
            return (Criteria) this;
        }

        public Criteria andSotNameEqualTo(String value) {
            addCriterion("sot_name =", value, "sotName");
            return (Criteria) this;
        }

        public Criteria andSotNameNotEqualTo(String value) {
            addCriterion("sot_name <>", value, "sotName");
            return (Criteria) this;
        }

        public Criteria andSotNameGreaterThan(String value) {
            addCriterion("sot_name >", value, "sotName");
            return (Criteria) this;
        }

        public Criteria andSotNameGreaterThanOrEqualTo(String value) {
            addCriterion("sot_name >=", value, "sotName");
            return (Criteria) this;
        }

        public Criteria andSotNameLessThan(String value) {
            addCriterion("sot_name <", value, "sotName");
            return (Criteria) this;
        }

        public Criteria andSotNameLessThanOrEqualTo(String value) {
            addCriterion("sot_name <=", value, "sotName");
            return (Criteria) this;
        }

        public Criteria andSotNameLike(String value) {
            addCriterion("sot_name like", value, "sotName");
            return (Criteria) this;
        }

        public Criteria andSotNameNotLike(String value) {
            addCriterion("sot_name not like", value, "sotName");
            return (Criteria) this;
        }

        public Criteria andSotNameIn(List<String> values) {
            addCriterion("sot_name in", values, "sotName");
            return (Criteria) this;
        }

        public Criteria andSotNameNotIn(List<String> values) {
            addCriterion("sot_name not in", values, "sotName");
            return (Criteria) this;
        }

        public Criteria andSotNameBetween(String value1, String value2) {
            addCriterion("sot_name between", value1, value2, "sotName");
            return (Criteria) this;
        }

        public Criteria andSotNameNotBetween(String value1, String value2) {
            addCriterion("sot_name not between", value1, value2, "sotName");
            return (Criteria) this;
        }

        public Criteria andSotEngnameIsNull() {
            addCriterion("sot_engname is null");
            return (Criteria) this;
        }

        public Criteria andSotEngnameIsNotNull() {
            addCriterion("sot_engname is not null");
            return (Criteria) this;
        }

        public Criteria andSotEngnameEqualTo(String value) {
            addCriterion("sot_engname =", value, "sotEngname");
            return (Criteria) this;
        }

        public Criteria andSotEngnameNotEqualTo(String value) {
            addCriterion("sot_engname <>", value, "sotEngname");
            return (Criteria) this;
        }

        public Criteria andSotEngnameGreaterThan(String value) {
            addCriterion("sot_engname >", value, "sotEngname");
            return (Criteria) this;
        }

        public Criteria andSotEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("sot_engname >=", value, "sotEngname");
            return (Criteria) this;
        }

        public Criteria andSotEngnameLessThan(String value) {
            addCriterion("sot_engname <", value, "sotEngname");
            return (Criteria) this;
        }

        public Criteria andSotEngnameLessThanOrEqualTo(String value) {
            addCriterion("sot_engname <=", value, "sotEngname");
            return (Criteria) this;
        }

        public Criteria andSotEngnameLike(String value) {
            addCriterion("sot_engname like", value, "sotEngname");
            return (Criteria) this;
        }

        public Criteria andSotEngnameNotLike(String value) {
            addCriterion("sot_engname not like", value, "sotEngname");
            return (Criteria) this;
        }

        public Criteria andSotEngnameIn(List<String> values) {
            addCriterion("sot_engname in", values, "sotEngname");
            return (Criteria) this;
        }

        public Criteria andSotEngnameNotIn(List<String> values) {
            addCriterion("sot_engname not in", values, "sotEngname");
            return (Criteria) this;
        }

        public Criteria andSotEngnameBetween(String value1, String value2) {
            addCriterion("sot_engname between", value1, value2, "sotEngname");
            return (Criteria) this;
        }

        public Criteria andSotEngnameNotBetween(String value1, String value2) {
            addCriterion("sot_engname not between", value1, value2, "sotEngname");
            return (Criteria) this;
        }

        public Criteria andSotRemarkIsNull() {
            addCriterion("sot_remark is null");
            return (Criteria) this;
        }

        public Criteria andSotRemarkIsNotNull() {
            addCriterion("sot_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSotRemarkEqualTo(String value) {
            addCriterion("sot_remark =", value, "sotRemark");
            return (Criteria) this;
        }

        public Criteria andSotRemarkNotEqualTo(String value) {
            addCriterion("sot_remark <>", value, "sotRemark");
            return (Criteria) this;
        }

        public Criteria andSotRemarkGreaterThan(String value) {
            addCriterion("sot_remark >", value, "sotRemark");
            return (Criteria) this;
        }

        public Criteria andSotRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sot_remark >=", value, "sotRemark");
            return (Criteria) this;
        }

        public Criteria andSotRemarkLessThan(String value) {
            addCriterion("sot_remark <", value, "sotRemark");
            return (Criteria) this;
        }

        public Criteria andSotRemarkLessThanOrEqualTo(String value) {
            addCriterion("sot_remark <=", value, "sotRemark");
            return (Criteria) this;
        }

        public Criteria andSotRemarkLike(String value) {
            addCriterion("sot_remark like", value, "sotRemark");
            return (Criteria) this;
        }

        public Criteria andSotRemarkNotLike(String value) {
            addCriterion("sot_remark not like", value, "sotRemark");
            return (Criteria) this;
        }

        public Criteria andSotRemarkIn(List<String> values) {
            addCriterion("sot_remark in", values, "sotRemark");
            return (Criteria) this;
        }

        public Criteria andSotRemarkNotIn(List<String> values) {
            addCriterion("sot_remark not in", values, "sotRemark");
            return (Criteria) this;
        }

        public Criteria andSotRemarkBetween(String value1, String value2) {
            addCriterion("sot_remark between", value1, value2, "sotRemark");
            return (Criteria) this;
        }

        public Criteria andSotRemarkNotBetween(String value1, String value2) {
            addCriterion("sot_remark not between", value1, value2, "sotRemark");
            return (Criteria) this;
        }

        public Criteria andSotAuditingIsNull() {
            addCriterion("sot_auditing is null");
            return (Criteria) this;
        }

        public Criteria andSotAuditingIsNotNull() {
            addCriterion("sot_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andSotAuditingEqualTo(String value) {
            addCriterion("sot_auditing =", value, "sotAuditing");
            return (Criteria) this;
        }

        public Criteria andSotAuditingNotEqualTo(String value) {
            addCriterion("sot_auditing <>", value, "sotAuditing");
            return (Criteria) this;
        }

        public Criteria andSotAuditingGreaterThan(String value) {
            addCriterion("sot_auditing >", value, "sotAuditing");
            return (Criteria) this;
        }

        public Criteria andSotAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("sot_auditing >=", value, "sotAuditing");
            return (Criteria) this;
        }

        public Criteria andSotAuditingLessThan(String value) {
            addCriterion("sot_auditing <", value, "sotAuditing");
            return (Criteria) this;
        }

        public Criteria andSotAuditingLessThanOrEqualTo(String value) {
            addCriterion("sot_auditing <=", value, "sotAuditing");
            return (Criteria) this;
        }

        public Criteria andSotAuditingLike(String value) {
            addCriterion("sot_auditing like", value, "sotAuditing");
            return (Criteria) this;
        }

        public Criteria andSotAuditingNotLike(String value) {
            addCriterion("sot_auditing not like", value, "sotAuditing");
            return (Criteria) this;
        }

        public Criteria andSotAuditingIn(List<String> values) {
            addCriterion("sot_auditing in", values, "sotAuditing");
            return (Criteria) this;
        }

        public Criteria andSotAuditingNotIn(List<String> values) {
            addCriterion("sot_auditing not in", values, "sotAuditing");
            return (Criteria) this;
        }

        public Criteria andSotAuditingBetween(String value1, String value2) {
            addCriterion("sot_auditing between", value1, value2, "sotAuditing");
            return (Criteria) this;
        }

        public Criteria andSotAuditingNotBetween(String value1, String value2) {
            addCriterion("sot_auditing not between", value1, value2, "sotAuditing");
            return (Criteria) this;
        }

        public Criteria andSotYnIsNull() {
            addCriterion("sot_yn is null");
            return (Criteria) this;
        }

        public Criteria andSotYnIsNotNull() {
            addCriterion("sot_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSotYnEqualTo(String value) {
            addCriterion("sot_yn =", value, "sotYn");
            return (Criteria) this;
        }

        public Criteria andSotYnNotEqualTo(String value) {
            addCriterion("sot_yn <>", value, "sotYn");
            return (Criteria) this;
        }

        public Criteria andSotYnGreaterThan(String value) {
            addCriterion("sot_yn >", value, "sotYn");
            return (Criteria) this;
        }

        public Criteria andSotYnGreaterThanOrEqualTo(String value) {
            addCriterion("sot_yn >=", value, "sotYn");
            return (Criteria) this;
        }

        public Criteria andSotYnLessThan(String value) {
            addCriterion("sot_yn <", value, "sotYn");
            return (Criteria) this;
        }

        public Criteria andSotYnLessThanOrEqualTo(String value) {
            addCriterion("sot_yn <=", value, "sotYn");
            return (Criteria) this;
        }

        public Criteria andSotYnLike(String value) {
            addCriterion("sot_yn like", value, "sotYn");
            return (Criteria) this;
        }

        public Criteria andSotYnNotLike(String value) {
            addCriterion("sot_yn not like", value, "sotYn");
            return (Criteria) this;
        }

        public Criteria andSotYnIn(List<String> values) {
            addCriterion("sot_yn in", values, "sotYn");
            return (Criteria) this;
        }

        public Criteria andSotYnNotIn(List<String> values) {
            addCriterion("sot_yn not in", values, "sotYn");
            return (Criteria) this;
        }

        public Criteria andSotYnBetween(String value1, String value2) {
            addCriterion("sot_yn between", value1, value2, "sotYn");
            return (Criteria) this;
        }

        public Criteria andSotYnNotBetween(String value1, String value2) {
            addCriterion("sot_yn not between", value1, value2, "sotYn");
            return (Criteria) this;
        }

        public Criteria andSotCustom1IsNull() {
            addCriterion("sot_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andSotCustom1IsNotNull() {
            addCriterion("sot_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSotCustom1EqualTo(String value) {
            addCriterion("sot_custom1 =", value, "sotCustom1");
            return (Criteria) this;
        }

        public Criteria andSotCustom1NotEqualTo(String value) {
            addCriterion("sot_custom1 <>", value, "sotCustom1");
            return (Criteria) this;
        }

        public Criteria andSotCustom1GreaterThan(String value) {
            addCriterion("sot_custom1 >", value, "sotCustom1");
            return (Criteria) this;
        }

        public Criteria andSotCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("sot_custom1 >=", value, "sotCustom1");
            return (Criteria) this;
        }

        public Criteria andSotCustom1LessThan(String value) {
            addCriterion("sot_custom1 <", value, "sotCustom1");
            return (Criteria) this;
        }

        public Criteria andSotCustom1LessThanOrEqualTo(String value) {
            addCriterion("sot_custom1 <=", value, "sotCustom1");
            return (Criteria) this;
        }

        public Criteria andSotCustom1Like(String value) {
            addCriterion("sot_custom1 like", value, "sotCustom1");
            return (Criteria) this;
        }

        public Criteria andSotCustom1NotLike(String value) {
            addCriterion("sot_custom1 not like", value, "sotCustom1");
            return (Criteria) this;
        }

        public Criteria andSotCustom1In(List<String> values) {
            addCriterion("sot_custom1 in", values, "sotCustom1");
            return (Criteria) this;
        }

        public Criteria andSotCustom1NotIn(List<String> values) {
            addCriterion("sot_custom1 not in", values, "sotCustom1");
            return (Criteria) this;
        }

        public Criteria andSotCustom1Between(String value1, String value2) {
            addCriterion("sot_custom1 between", value1, value2, "sotCustom1");
            return (Criteria) this;
        }

        public Criteria andSotCustom1NotBetween(String value1, String value2) {
            addCriterion("sot_custom1 not between", value1, value2, "sotCustom1");
            return (Criteria) this;
        }

        public Criteria andSotCustom2IsNull() {
            addCriterion("sot_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andSotCustom2IsNotNull() {
            addCriterion("sot_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSotCustom2EqualTo(String value) {
            addCriterion("sot_custom2 =", value, "sotCustom2");
            return (Criteria) this;
        }

        public Criteria andSotCustom2NotEqualTo(String value) {
            addCriterion("sot_custom2 <>", value, "sotCustom2");
            return (Criteria) this;
        }

        public Criteria andSotCustom2GreaterThan(String value) {
            addCriterion("sot_custom2 >", value, "sotCustom2");
            return (Criteria) this;
        }

        public Criteria andSotCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("sot_custom2 >=", value, "sotCustom2");
            return (Criteria) this;
        }

        public Criteria andSotCustom2LessThan(String value) {
            addCriterion("sot_custom2 <", value, "sotCustom2");
            return (Criteria) this;
        }

        public Criteria andSotCustom2LessThanOrEqualTo(String value) {
            addCriterion("sot_custom2 <=", value, "sotCustom2");
            return (Criteria) this;
        }

        public Criteria andSotCustom2Like(String value) {
            addCriterion("sot_custom2 like", value, "sotCustom2");
            return (Criteria) this;
        }

        public Criteria andSotCustom2NotLike(String value) {
            addCriterion("sot_custom2 not like", value, "sotCustom2");
            return (Criteria) this;
        }

        public Criteria andSotCustom2In(List<String> values) {
            addCriterion("sot_custom2 in", values, "sotCustom2");
            return (Criteria) this;
        }

        public Criteria andSotCustom2NotIn(List<String> values) {
            addCriterion("sot_custom2 not in", values, "sotCustom2");
            return (Criteria) this;
        }

        public Criteria andSotCustom2Between(String value1, String value2) {
            addCriterion("sot_custom2 between", value1, value2, "sotCustom2");
            return (Criteria) this;
        }

        public Criteria andSotCustom2NotBetween(String value1, String value2) {
            addCriterion("sot_custom2 not between", value1, value2, "sotCustom2");
            return (Criteria) this;
        }

        public Criteria andSotCustom3IsNull() {
            addCriterion("sot_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andSotCustom3IsNotNull() {
            addCriterion("sot_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSotCustom3EqualTo(String value) {
            addCriterion("sot_custom3 =", value, "sotCustom3");
            return (Criteria) this;
        }

        public Criteria andSotCustom3NotEqualTo(String value) {
            addCriterion("sot_custom3 <>", value, "sotCustom3");
            return (Criteria) this;
        }

        public Criteria andSotCustom3GreaterThan(String value) {
            addCriterion("sot_custom3 >", value, "sotCustom3");
            return (Criteria) this;
        }

        public Criteria andSotCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("sot_custom3 >=", value, "sotCustom3");
            return (Criteria) this;
        }

        public Criteria andSotCustom3LessThan(String value) {
            addCriterion("sot_custom3 <", value, "sotCustom3");
            return (Criteria) this;
        }

        public Criteria andSotCustom3LessThanOrEqualTo(String value) {
            addCriterion("sot_custom3 <=", value, "sotCustom3");
            return (Criteria) this;
        }

        public Criteria andSotCustom3Like(String value) {
            addCriterion("sot_custom3 like", value, "sotCustom3");
            return (Criteria) this;
        }

        public Criteria andSotCustom3NotLike(String value) {
            addCriterion("sot_custom3 not like", value, "sotCustom3");
            return (Criteria) this;
        }

        public Criteria andSotCustom3In(List<String> values) {
            addCriterion("sot_custom3 in", values, "sotCustom3");
            return (Criteria) this;
        }

        public Criteria andSotCustom3NotIn(List<String> values) {
            addCriterion("sot_custom3 not in", values, "sotCustom3");
            return (Criteria) this;
        }

        public Criteria andSotCustom3Between(String value1, String value2) {
            addCriterion("sot_custom3 between", value1, value2, "sotCustom3");
            return (Criteria) this;
        }

        public Criteria andSotCustom3NotBetween(String value1, String value2) {
            addCriterion("sot_custom3 not between", value1, value2, "sotCustom3");
            return (Criteria) this;
        }

        public Criteria andSotCustom4IsNull() {
            addCriterion("sot_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andSotCustom4IsNotNull() {
            addCriterion("sot_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andSotCustom4EqualTo(String value) {
            addCriterion("sot_custom4 =", value, "sotCustom4");
            return (Criteria) this;
        }

        public Criteria andSotCustom4NotEqualTo(String value) {
            addCriterion("sot_custom4 <>", value, "sotCustom4");
            return (Criteria) this;
        }

        public Criteria andSotCustom4GreaterThan(String value) {
            addCriterion("sot_custom4 >", value, "sotCustom4");
            return (Criteria) this;
        }

        public Criteria andSotCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("sot_custom4 >=", value, "sotCustom4");
            return (Criteria) this;
        }

        public Criteria andSotCustom4LessThan(String value) {
            addCriterion("sot_custom4 <", value, "sotCustom4");
            return (Criteria) this;
        }

        public Criteria andSotCustom4LessThanOrEqualTo(String value) {
            addCriterion("sot_custom4 <=", value, "sotCustom4");
            return (Criteria) this;
        }

        public Criteria andSotCustom4Like(String value) {
            addCriterion("sot_custom4 like", value, "sotCustom4");
            return (Criteria) this;
        }

        public Criteria andSotCustom4NotLike(String value) {
            addCriterion("sot_custom4 not like", value, "sotCustom4");
            return (Criteria) this;
        }

        public Criteria andSotCustom4In(List<String> values) {
            addCriterion("sot_custom4 in", values, "sotCustom4");
            return (Criteria) this;
        }

        public Criteria andSotCustom4NotIn(List<String> values) {
            addCriterion("sot_custom4 not in", values, "sotCustom4");
            return (Criteria) this;
        }

        public Criteria andSotCustom4Between(String value1, String value2) {
            addCriterion("sot_custom4 between", value1, value2, "sotCustom4");
            return (Criteria) this;
        }

        public Criteria andSotCustom4NotBetween(String value1, String value2) {
            addCriterion("sot_custom4 not between", value1, value2, "sotCustom4");
            return (Criteria) this;
        }

        public Criteria andSotCustom5IsNull() {
            addCriterion("sot_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andSotCustom5IsNotNull() {
            addCriterion("sot_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andSotCustom5EqualTo(String value) {
            addCriterion("sot_custom5 =", value, "sotCustom5");
            return (Criteria) this;
        }

        public Criteria andSotCustom5NotEqualTo(String value) {
            addCriterion("sot_custom5 <>", value, "sotCustom5");
            return (Criteria) this;
        }

        public Criteria andSotCustom5GreaterThan(String value) {
            addCriterion("sot_custom5 >", value, "sotCustom5");
            return (Criteria) this;
        }

        public Criteria andSotCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("sot_custom5 >=", value, "sotCustom5");
            return (Criteria) this;
        }

        public Criteria andSotCustom5LessThan(String value) {
            addCriterion("sot_custom5 <", value, "sotCustom5");
            return (Criteria) this;
        }

        public Criteria andSotCustom5LessThanOrEqualTo(String value) {
            addCriterion("sot_custom5 <=", value, "sotCustom5");
            return (Criteria) this;
        }

        public Criteria andSotCustom5Like(String value) {
            addCriterion("sot_custom5 like", value, "sotCustom5");
            return (Criteria) this;
        }

        public Criteria andSotCustom5NotLike(String value) {
            addCriterion("sot_custom5 not like", value, "sotCustom5");
            return (Criteria) this;
        }

        public Criteria andSotCustom5In(List<String> values) {
            addCriterion("sot_custom5 in", values, "sotCustom5");
            return (Criteria) this;
        }

        public Criteria andSotCustom5NotIn(List<String> values) {
            addCriterion("sot_custom5 not in", values, "sotCustom5");
            return (Criteria) this;
        }

        public Criteria andSotCustom5Between(String value1, String value2) {
            addCriterion("sot_custom5 between", value1, value2, "sotCustom5");
            return (Criteria) this;
        }

        public Criteria andSotCustom5NotBetween(String value1, String value2) {
            addCriterion("sot_custom5 not between", value1, value2, "sotCustom5");
            return (Criteria) this;
        }

        public Criteria andSotCustom6IsNull() {
            addCriterion("sot_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andSotCustom6IsNotNull() {
            addCriterion("sot_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andSotCustom6EqualTo(String value) {
            addCriterion("sot_custom6 =", value, "sotCustom6");
            return (Criteria) this;
        }

        public Criteria andSotCustom6NotEqualTo(String value) {
            addCriterion("sot_custom6 <>", value, "sotCustom6");
            return (Criteria) this;
        }

        public Criteria andSotCustom6GreaterThan(String value) {
            addCriterion("sot_custom6 >", value, "sotCustom6");
            return (Criteria) this;
        }

        public Criteria andSotCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("sot_custom6 >=", value, "sotCustom6");
            return (Criteria) this;
        }

        public Criteria andSotCustom6LessThan(String value) {
            addCriterion("sot_custom6 <", value, "sotCustom6");
            return (Criteria) this;
        }

        public Criteria andSotCustom6LessThanOrEqualTo(String value) {
            addCriterion("sot_custom6 <=", value, "sotCustom6");
            return (Criteria) this;
        }

        public Criteria andSotCustom6Like(String value) {
            addCriterion("sot_custom6 like", value, "sotCustom6");
            return (Criteria) this;
        }

        public Criteria andSotCustom6NotLike(String value) {
            addCriterion("sot_custom6 not like", value, "sotCustom6");
            return (Criteria) this;
        }

        public Criteria andSotCustom6In(List<String> values) {
            addCriterion("sot_custom6 in", values, "sotCustom6");
            return (Criteria) this;
        }

        public Criteria andSotCustom6NotIn(List<String> values) {
            addCriterion("sot_custom6 not in", values, "sotCustom6");
            return (Criteria) this;
        }

        public Criteria andSotCustom6Between(String value1, String value2) {
            addCriterion("sot_custom6 between", value1, value2, "sotCustom6");
            return (Criteria) this;
        }

        public Criteria andSotCustom6NotBetween(String value1, String value2) {
            addCriterion("sot_custom6 not between", value1, value2, "sotCustom6");
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