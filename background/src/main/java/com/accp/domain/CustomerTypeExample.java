package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CustomerTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerTypeExample() {
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

        public Criteria andCutyIdIsNull() {
            addCriterion("cuty_id is null");
            return (Criteria) this;
        }

        public Criteria andCutyIdIsNotNull() {
            addCriterion("cuty_id is not null");
            return (Criteria) this;
        }

        public Criteria andCutyIdEqualTo(String value) {
            addCriterion("cuty_id =", value, "cutyId");
            return (Criteria) this;
        }

        public Criteria andCutyIdNotEqualTo(String value) {
            addCriterion("cuty_id <>", value, "cutyId");
            return (Criteria) this;
        }

        public Criteria andCutyIdGreaterThan(String value) {
            addCriterion("cuty_id >", value, "cutyId");
            return (Criteria) this;
        }

        public Criteria andCutyIdGreaterThanOrEqualTo(String value) {
            addCriterion("cuty_id >=", value, "cutyId");
            return (Criteria) this;
        }

        public Criteria andCutyIdLessThan(String value) {
            addCriterion("cuty_id <", value, "cutyId");
            return (Criteria) this;
        }

        public Criteria andCutyIdLessThanOrEqualTo(String value) {
            addCriterion("cuty_id <=", value, "cutyId");
            return (Criteria) this;
        }

        public Criteria andCutyIdLike(String value) {
            addCriterion("cuty_id like", value, "cutyId");
            return (Criteria) this;
        }

        public Criteria andCutyIdNotLike(String value) {
            addCriterion("cuty_id not like", value, "cutyId");
            return (Criteria) this;
        }

        public Criteria andCutyIdIn(List<String> values) {
            addCriterion("cuty_id in", values, "cutyId");
            return (Criteria) this;
        }

        public Criteria andCutyIdNotIn(List<String> values) {
            addCriterion("cuty_id not in", values, "cutyId");
            return (Criteria) this;
        }

        public Criteria andCutyIdBetween(String value1, String value2) {
            addCriterion("cuty_id between", value1, value2, "cutyId");
            return (Criteria) this;
        }

        public Criteria andCutyIdNotBetween(String value1, String value2) {
            addCriterion("cuty_id not between", value1, value2, "cutyId");
            return (Criteria) this;
        }

        public Criteria andCutyNameIsNull() {
            addCriterion("cuty_name is null");
            return (Criteria) this;
        }

        public Criteria andCutyNameIsNotNull() {
            addCriterion("cuty_name is not null");
            return (Criteria) this;
        }

        public Criteria andCutyNameEqualTo(String value) {
            addCriterion("cuty_name =", value, "cutyName");
            return (Criteria) this;
        }

        public Criteria andCutyNameNotEqualTo(String value) {
            addCriterion("cuty_name <>", value, "cutyName");
            return (Criteria) this;
        }

        public Criteria andCutyNameGreaterThan(String value) {
            addCriterion("cuty_name >", value, "cutyName");
            return (Criteria) this;
        }

        public Criteria andCutyNameGreaterThanOrEqualTo(String value) {
            addCriterion("cuty_name >=", value, "cutyName");
            return (Criteria) this;
        }

        public Criteria andCutyNameLessThan(String value) {
            addCriterion("cuty_name <", value, "cutyName");
            return (Criteria) this;
        }

        public Criteria andCutyNameLessThanOrEqualTo(String value) {
            addCriterion("cuty_name <=", value, "cutyName");
            return (Criteria) this;
        }

        public Criteria andCutyNameLike(String value) {
            addCriterion("cuty_name like", value, "cutyName");
            return (Criteria) this;
        }

        public Criteria andCutyNameNotLike(String value) {
            addCriterion("cuty_name not like", value, "cutyName");
            return (Criteria) this;
        }

        public Criteria andCutyNameIn(List<String> values) {
            addCriterion("cuty_name in", values, "cutyName");
            return (Criteria) this;
        }

        public Criteria andCutyNameNotIn(List<String> values) {
            addCriterion("cuty_name not in", values, "cutyName");
            return (Criteria) this;
        }

        public Criteria andCutyNameBetween(String value1, String value2) {
            addCriterion("cuty_name between", value1, value2, "cutyName");
            return (Criteria) this;
        }

        public Criteria andCutyNameNotBetween(String value1, String value2) {
            addCriterion("cuty_name not between", value1, value2, "cutyName");
            return (Criteria) this;
        }

        public Criteria andCutyEngnameIsNull() {
            addCriterion("cuty_engname is null");
            return (Criteria) this;
        }

        public Criteria andCutyEngnameIsNotNull() {
            addCriterion("cuty_engname is not null");
            return (Criteria) this;
        }

        public Criteria andCutyEngnameEqualTo(String value) {
            addCriterion("cuty_engname =", value, "cutyEngname");
            return (Criteria) this;
        }

        public Criteria andCutyEngnameNotEqualTo(String value) {
            addCriterion("cuty_engname <>", value, "cutyEngname");
            return (Criteria) this;
        }

        public Criteria andCutyEngnameGreaterThan(String value) {
            addCriterion("cuty_engname >", value, "cutyEngname");
            return (Criteria) this;
        }

        public Criteria andCutyEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("cuty_engname >=", value, "cutyEngname");
            return (Criteria) this;
        }

        public Criteria andCutyEngnameLessThan(String value) {
            addCriterion("cuty_engname <", value, "cutyEngname");
            return (Criteria) this;
        }

        public Criteria andCutyEngnameLessThanOrEqualTo(String value) {
            addCriterion("cuty_engname <=", value, "cutyEngname");
            return (Criteria) this;
        }

        public Criteria andCutyEngnameLike(String value) {
            addCriterion("cuty_engname like", value, "cutyEngname");
            return (Criteria) this;
        }

        public Criteria andCutyEngnameNotLike(String value) {
            addCriterion("cuty_engname not like", value, "cutyEngname");
            return (Criteria) this;
        }

        public Criteria andCutyEngnameIn(List<String> values) {
            addCriterion("cuty_engname in", values, "cutyEngname");
            return (Criteria) this;
        }

        public Criteria andCutyEngnameNotIn(List<String> values) {
            addCriterion("cuty_engname not in", values, "cutyEngname");
            return (Criteria) this;
        }

        public Criteria andCutyEngnameBetween(String value1, String value2) {
            addCriterion("cuty_engname between", value1, value2, "cutyEngname");
            return (Criteria) this;
        }

        public Criteria andCutyEngnameNotBetween(String value1, String value2) {
            addCriterion("cuty_engname not between", value1, value2, "cutyEngname");
            return (Criteria) this;
        }

        public Criteria andCutyRemarkIsNull() {
            addCriterion("cuty_remark is null");
            return (Criteria) this;
        }

        public Criteria andCutyRemarkIsNotNull() {
            addCriterion("cuty_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCutyRemarkEqualTo(String value) {
            addCriterion("cuty_remark =", value, "cutyRemark");
            return (Criteria) this;
        }

        public Criteria andCutyRemarkNotEqualTo(String value) {
            addCriterion("cuty_remark <>", value, "cutyRemark");
            return (Criteria) this;
        }

        public Criteria andCutyRemarkGreaterThan(String value) {
            addCriterion("cuty_remark >", value, "cutyRemark");
            return (Criteria) this;
        }

        public Criteria andCutyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("cuty_remark >=", value, "cutyRemark");
            return (Criteria) this;
        }

        public Criteria andCutyRemarkLessThan(String value) {
            addCriterion("cuty_remark <", value, "cutyRemark");
            return (Criteria) this;
        }

        public Criteria andCutyRemarkLessThanOrEqualTo(String value) {
            addCriterion("cuty_remark <=", value, "cutyRemark");
            return (Criteria) this;
        }

        public Criteria andCutyRemarkLike(String value) {
            addCriterion("cuty_remark like", value, "cutyRemark");
            return (Criteria) this;
        }

        public Criteria andCutyRemarkNotLike(String value) {
            addCriterion("cuty_remark not like", value, "cutyRemark");
            return (Criteria) this;
        }

        public Criteria andCutyRemarkIn(List<String> values) {
            addCriterion("cuty_remark in", values, "cutyRemark");
            return (Criteria) this;
        }

        public Criteria andCutyRemarkNotIn(List<String> values) {
            addCriterion("cuty_remark not in", values, "cutyRemark");
            return (Criteria) this;
        }

        public Criteria andCutyRemarkBetween(String value1, String value2) {
            addCriterion("cuty_remark between", value1, value2, "cutyRemark");
            return (Criteria) this;
        }

        public Criteria andCutyRemarkNotBetween(String value1, String value2) {
            addCriterion("cuty_remark not between", value1, value2, "cutyRemark");
            return (Criteria) this;
        }

        public Criteria andCutyAuditingIsNull() {
            addCriterion("cuty_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andCutyAuditingIsNotNull() {
            addCriterion("cuty_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andCutyAuditingEqualTo(String value) {
            addCriterion("cuty_Auditing =", value, "cutyAuditing");
            return (Criteria) this;
        }

        public Criteria andCutyAuditingNotEqualTo(String value) {
            addCriterion("cuty_Auditing <>", value, "cutyAuditing");
            return (Criteria) this;
        }

        public Criteria andCutyAuditingGreaterThan(String value) {
            addCriterion("cuty_Auditing >", value, "cutyAuditing");
            return (Criteria) this;
        }

        public Criteria andCutyAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("cuty_Auditing >=", value, "cutyAuditing");
            return (Criteria) this;
        }

        public Criteria andCutyAuditingLessThan(String value) {
            addCriterion("cuty_Auditing <", value, "cutyAuditing");
            return (Criteria) this;
        }

        public Criteria andCutyAuditingLessThanOrEqualTo(String value) {
            addCriterion("cuty_Auditing <=", value, "cutyAuditing");
            return (Criteria) this;
        }

        public Criteria andCutyAuditingLike(String value) {
            addCriterion("cuty_Auditing like", value, "cutyAuditing");
            return (Criteria) this;
        }

        public Criteria andCutyAuditingNotLike(String value) {
            addCriterion("cuty_Auditing not like", value, "cutyAuditing");
            return (Criteria) this;
        }

        public Criteria andCutyAuditingIn(List<String> values) {
            addCriterion("cuty_Auditing in", values, "cutyAuditing");
            return (Criteria) this;
        }

        public Criteria andCutyAuditingNotIn(List<String> values) {
            addCriterion("cuty_Auditing not in", values, "cutyAuditing");
            return (Criteria) this;
        }

        public Criteria andCutyAuditingBetween(String value1, String value2) {
            addCriterion("cuty_Auditing between", value1, value2, "cutyAuditing");
            return (Criteria) this;
        }

        public Criteria andCutyAuditingNotBetween(String value1, String value2) {
            addCriterion("cuty_Auditing not between", value1, value2, "cutyAuditing");
            return (Criteria) this;
        }

        public Criteria andCutyYnIsNull() {
            addCriterion("cuty_yn is null");
            return (Criteria) this;
        }

        public Criteria andCutyYnIsNotNull() {
            addCriterion("cuty_yn is not null");
            return (Criteria) this;
        }

        public Criteria andCutyYnEqualTo(String value) {
            addCriterion("cuty_yn =", value, "cutyYn");
            return (Criteria) this;
        }

        public Criteria andCutyYnNotEqualTo(String value) {
            addCriterion("cuty_yn <>", value, "cutyYn");
            return (Criteria) this;
        }

        public Criteria andCutyYnGreaterThan(String value) {
            addCriterion("cuty_yn >", value, "cutyYn");
            return (Criteria) this;
        }

        public Criteria andCutyYnGreaterThanOrEqualTo(String value) {
            addCriterion("cuty_yn >=", value, "cutyYn");
            return (Criteria) this;
        }

        public Criteria andCutyYnLessThan(String value) {
            addCriterion("cuty_yn <", value, "cutyYn");
            return (Criteria) this;
        }

        public Criteria andCutyYnLessThanOrEqualTo(String value) {
            addCriterion("cuty_yn <=", value, "cutyYn");
            return (Criteria) this;
        }

        public Criteria andCutyYnLike(String value) {
            addCriterion("cuty_yn like", value, "cutyYn");
            return (Criteria) this;
        }

        public Criteria andCutyYnNotLike(String value) {
            addCriterion("cuty_yn not like", value, "cutyYn");
            return (Criteria) this;
        }

        public Criteria andCutyYnIn(List<String> values) {
            addCriterion("cuty_yn in", values, "cutyYn");
            return (Criteria) this;
        }

        public Criteria andCutyYnNotIn(List<String> values) {
            addCriterion("cuty_yn not in", values, "cutyYn");
            return (Criteria) this;
        }

        public Criteria andCutyYnBetween(String value1, String value2) {
            addCriterion("cuty_yn between", value1, value2, "cutyYn");
            return (Criteria) this;
        }

        public Criteria andCutyYnNotBetween(String value1, String value2) {
            addCriterion("cuty_yn not between", value1, value2, "cutyYn");
            return (Criteria) this;
        }

        public Criteria andCutyCustom1IsNull() {
            addCriterion("cuty_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCutyCustom1IsNotNull() {
            addCriterion("cuty_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCutyCustom1EqualTo(String value) {
            addCriterion("cuty_custom1 =", value, "cutyCustom1");
            return (Criteria) this;
        }

        public Criteria andCutyCustom1NotEqualTo(String value) {
            addCriterion("cuty_custom1 <>", value, "cutyCustom1");
            return (Criteria) this;
        }

        public Criteria andCutyCustom1GreaterThan(String value) {
            addCriterion("cuty_custom1 >", value, "cutyCustom1");
            return (Criteria) this;
        }

        public Criteria andCutyCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("cuty_custom1 >=", value, "cutyCustom1");
            return (Criteria) this;
        }

        public Criteria andCutyCustom1LessThan(String value) {
            addCriterion("cuty_custom1 <", value, "cutyCustom1");
            return (Criteria) this;
        }

        public Criteria andCutyCustom1LessThanOrEqualTo(String value) {
            addCriterion("cuty_custom1 <=", value, "cutyCustom1");
            return (Criteria) this;
        }

        public Criteria andCutyCustom1Like(String value) {
            addCriterion("cuty_custom1 like", value, "cutyCustom1");
            return (Criteria) this;
        }

        public Criteria andCutyCustom1NotLike(String value) {
            addCriterion("cuty_custom1 not like", value, "cutyCustom1");
            return (Criteria) this;
        }

        public Criteria andCutyCustom1In(List<String> values) {
            addCriterion("cuty_custom1 in", values, "cutyCustom1");
            return (Criteria) this;
        }

        public Criteria andCutyCustom1NotIn(List<String> values) {
            addCriterion("cuty_custom1 not in", values, "cutyCustom1");
            return (Criteria) this;
        }

        public Criteria andCutyCustom1Between(String value1, String value2) {
            addCriterion("cuty_custom1 between", value1, value2, "cutyCustom1");
            return (Criteria) this;
        }

        public Criteria andCutyCustom1NotBetween(String value1, String value2) {
            addCriterion("cuty_custom1 not between", value1, value2, "cutyCustom1");
            return (Criteria) this;
        }

        public Criteria andCutyCustom2IsNull() {
            addCriterion("cuty_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCutyCustom2IsNotNull() {
            addCriterion("cuty_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCutyCustom2EqualTo(String value) {
            addCriterion("cuty_custom2 =", value, "cutyCustom2");
            return (Criteria) this;
        }

        public Criteria andCutyCustom2NotEqualTo(String value) {
            addCriterion("cuty_custom2 <>", value, "cutyCustom2");
            return (Criteria) this;
        }

        public Criteria andCutyCustom2GreaterThan(String value) {
            addCriterion("cuty_custom2 >", value, "cutyCustom2");
            return (Criteria) this;
        }

        public Criteria andCutyCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("cuty_custom2 >=", value, "cutyCustom2");
            return (Criteria) this;
        }

        public Criteria andCutyCustom2LessThan(String value) {
            addCriterion("cuty_custom2 <", value, "cutyCustom2");
            return (Criteria) this;
        }

        public Criteria andCutyCustom2LessThanOrEqualTo(String value) {
            addCriterion("cuty_custom2 <=", value, "cutyCustom2");
            return (Criteria) this;
        }

        public Criteria andCutyCustom2Like(String value) {
            addCriterion("cuty_custom2 like", value, "cutyCustom2");
            return (Criteria) this;
        }

        public Criteria andCutyCustom2NotLike(String value) {
            addCriterion("cuty_custom2 not like", value, "cutyCustom2");
            return (Criteria) this;
        }

        public Criteria andCutyCustom2In(List<String> values) {
            addCriterion("cuty_custom2 in", values, "cutyCustom2");
            return (Criteria) this;
        }

        public Criteria andCutyCustom2NotIn(List<String> values) {
            addCriterion("cuty_custom2 not in", values, "cutyCustom2");
            return (Criteria) this;
        }

        public Criteria andCutyCustom2Between(String value1, String value2) {
            addCriterion("cuty_custom2 between", value1, value2, "cutyCustom2");
            return (Criteria) this;
        }

        public Criteria andCutyCustom2NotBetween(String value1, String value2) {
            addCriterion("cuty_custom2 not between", value1, value2, "cutyCustom2");
            return (Criteria) this;
        }

        public Criteria andCutyCustom3IsNull() {
            addCriterion("cuty_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andCutyCustom3IsNotNull() {
            addCriterion("cuty_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andCutyCustom3EqualTo(String value) {
            addCriterion("cuty_custom3 =", value, "cutyCustom3");
            return (Criteria) this;
        }

        public Criteria andCutyCustom3NotEqualTo(String value) {
            addCriterion("cuty_custom3 <>", value, "cutyCustom3");
            return (Criteria) this;
        }

        public Criteria andCutyCustom3GreaterThan(String value) {
            addCriterion("cuty_custom3 >", value, "cutyCustom3");
            return (Criteria) this;
        }

        public Criteria andCutyCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("cuty_custom3 >=", value, "cutyCustom3");
            return (Criteria) this;
        }

        public Criteria andCutyCustom3LessThan(String value) {
            addCriterion("cuty_custom3 <", value, "cutyCustom3");
            return (Criteria) this;
        }

        public Criteria andCutyCustom3LessThanOrEqualTo(String value) {
            addCriterion("cuty_custom3 <=", value, "cutyCustom3");
            return (Criteria) this;
        }

        public Criteria andCutyCustom3Like(String value) {
            addCriterion("cuty_custom3 like", value, "cutyCustom3");
            return (Criteria) this;
        }

        public Criteria andCutyCustom3NotLike(String value) {
            addCriterion("cuty_custom3 not like", value, "cutyCustom3");
            return (Criteria) this;
        }

        public Criteria andCutyCustom3In(List<String> values) {
            addCriterion("cuty_custom3 in", values, "cutyCustom3");
            return (Criteria) this;
        }

        public Criteria andCutyCustom3NotIn(List<String> values) {
            addCriterion("cuty_custom3 not in", values, "cutyCustom3");
            return (Criteria) this;
        }

        public Criteria andCutyCustom3Between(String value1, String value2) {
            addCriterion("cuty_custom3 between", value1, value2, "cutyCustom3");
            return (Criteria) this;
        }

        public Criteria andCutyCustom3NotBetween(String value1, String value2) {
            addCriterion("cuty_custom3 not between", value1, value2, "cutyCustom3");
            return (Criteria) this;
        }

        public Criteria andCutyCustom4IsNull() {
            addCriterion("cuty_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andCutyCustom4IsNotNull() {
            addCriterion("cuty_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andCutyCustom4EqualTo(String value) {
            addCriterion("cuty_custom4 =", value, "cutyCustom4");
            return (Criteria) this;
        }

        public Criteria andCutyCustom4NotEqualTo(String value) {
            addCriterion("cuty_custom4 <>", value, "cutyCustom4");
            return (Criteria) this;
        }

        public Criteria andCutyCustom4GreaterThan(String value) {
            addCriterion("cuty_custom4 >", value, "cutyCustom4");
            return (Criteria) this;
        }

        public Criteria andCutyCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("cuty_custom4 >=", value, "cutyCustom4");
            return (Criteria) this;
        }

        public Criteria andCutyCustom4LessThan(String value) {
            addCriterion("cuty_custom4 <", value, "cutyCustom4");
            return (Criteria) this;
        }

        public Criteria andCutyCustom4LessThanOrEqualTo(String value) {
            addCriterion("cuty_custom4 <=", value, "cutyCustom4");
            return (Criteria) this;
        }

        public Criteria andCutyCustom4Like(String value) {
            addCriterion("cuty_custom4 like", value, "cutyCustom4");
            return (Criteria) this;
        }

        public Criteria andCutyCustom4NotLike(String value) {
            addCriterion("cuty_custom4 not like", value, "cutyCustom4");
            return (Criteria) this;
        }

        public Criteria andCutyCustom4In(List<String> values) {
            addCriterion("cuty_custom4 in", values, "cutyCustom4");
            return (Criteria) this;
        }

        public Criteria andCutyCustom4NotIn(List<String> values) {
            addCriterion("cuty_custom4 not in", values, "cutyCustom4");
            return (Criteria) this;
        }

        public Criteria andCutyCustom4Between(String value1, String value2) {
            addCriterion("cuty_custom4 between", value1, value2, "cutyCustom4");
            return (Criteria) this;
        }

        public Criteria andCutyCustom4NotBetween(String value1, String value2) {
            addCriterion("cuty_custom4 not between", value1, value2, "cutyCustom4");
            return (Criteria) this;
        }

        public Criteria andCutyCustom5IsNull() {
            addCriterion("cuty_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andCutyCustom5IsNotNull() {
            addCriterion("cuty_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andCutyCustom5EqualTo(String value) {
            addCriterion("cuty_custom5 =", value, "cutyCustom5");
            return (Criteria) this;
        }

        public Criteria andCutyCustom5NotEqualTo(String value) {
            addCriterion("cuty_custom5 <>", value, "cutyCustom5");
            return (Criteria) this;
        }

        public Criteria andCutyCustom5GreaterThan(String value) {
            addCriterion("cuty_custom5 >", value, "cutyCustom5");
            return (Criteria) this;
        }

        public Criteria andCutyCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("cuty_custom5 >=", value, "cutyCustom5");
            return (Criteria) this;
        }

        public Criteria andCutyCustom5LessThan(String value) {
            addCriterion("cuty_custom5 <", value, "cutyCustom5");
            return (Criteria) this;
        }

        public Criteria andCutyCustom5LessThanOrEqualTo(String value) {
            addCriterion("cuty_custom5 <=", value, "cutyCustom5");
            return (Criteria) this;
        }

        public Criteria andCutyCustom5Like(String value) {
            addCriterion("cuty_custom5 like", value, "cutyCustom5");
            return (Criteria) this;
        }

        public Criteria andCutyCustom5NotLike(String value) {
            addCriterion("cuty_custom5 not like", value, "cutyCustom5");
            return (Criteria) this;
        }

        public Criteria andCutyCustom5In(List<String> values) {
            addCriterion("cuty_custom5 in", values, "cutyCustom5");
            return (Criteria) this;
        }

        public Criteria andCutyCustom5NotIn(List<String> values) {
            addCriterion("cuty_custom5 not in", values, "cutyCustom5");
            return (Criteria) this;
        }

        public Criteria andCutyCustom5Between(String value1, String value2) {
            addCriterion("cuty_custom5 between", value1, value2, "cutyCustom5");
            return (Criteria) this;
        }

        public Criteria andCutyCustom5NotBetween(String value1, String value2) {
            addCriterion("cuty_custom5 not between", value1, value2, "cutyCustom5");
            return (Criteria) this;
        }

        public Criteria andCutyCustom6IsNull() {
            addCriterion("cuty_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andCutyCustom6IsNotNull() {
            addCriterion("cuty_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andCutyCustom6EqualTo(String value) {
            addCriterion("cuty_custom6 =", value, "cutyCustom6");
            return (Criteria) this;
        }

        public Criteria andCutyCustom6NotEqualTo(String value) {
            addCriterion("cuty_custom6 <>", value, "cutyCustom6");
            return (Criteria) this;
        }

        public Criteria andCutyCustom6GreaterThan(String value) {
            addCriterion("cuty_custom6 >", value, "cutyCustom6");
            return (Criteria) this;
        }

        public Criteria andCutyCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("cuty_custom6 >=", value, "cutyCustom6");
            return (Criteria) this;
        }

        public Criteria andCutyCustom6LessThan(String value) {
            addCriterion("cuty_custom6 <", value, "cutyCustom6");
            return (Criteria) this;
        }

        public Criteria andCutyCustom6LessThanOrEqualTo(String value) {
            addCriterion("cuty_custom6 <=", value, "cutyCustom6");
            return (Criteria) this;
        }

        public Criteria andCutyCustom6Like(String value) {
            addCriterion("cuty_custom6 like", value, "cutyCustom6");
            return (Criteria) this;
        }

        public Criteria andCutyCustom6NotLike(String value) {
            addCriterion("cuty_custom6 not like", value, "cutyCustom6");
            return (Criteria) this;
        }

        public Criteria andCutyCustom6In(List<String> values) {
            addCriterion("cuty_custom6 in", values, "cutyCustom6");
            return (Criteria) this;
        }

        public Criteria andCutyCustom6NotIn(List<String> values) {
            addCriterion("cuty_custom6 not in", values, "cutyCustom6");
            return (Criteria) this;
        }

        public Criteria andCutyCustom6Between(String value1, String value2) {
            addCriterion("cuty_custom6 between", value1, value2, "cutyCustom6");
            return (Criteria) this;
        }

        public Criteria andCutyCustom6NotBetween(String value1, String value2) {
            addCriterion("cuty_custom6 not between", value1, value2, "cutyCustom6");
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