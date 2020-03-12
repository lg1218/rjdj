package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class InputStorageTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InputStorageTypeExample() {
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

        public Criteria andIstIdIsNull() {
            addCriterion("ist_id is null");
            return (Criteria) this;
        }

        public Criteria andIstIdIsNotNull() {
            addCriterion("ist_id is not null");
            return (Criteria) this;
        }

        public Criteria andIstIdEqualTo(String value) {
            addCriterion("ist_id =", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdNotEqualTo(String value) {
            addCriterion("ist_id <>", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdGreaterThan(String value) {
            addCriterion("ist_id >", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdGreaterThanOrEqualTo(String value) {
            addCriterion("ist_id >=", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdLessThan(String value) {
            addCriterion("ist_id <", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdLessThanOrEqualTo(String value) {
            addCriterion("ist_id <=", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdLike(String value) {
            addCriterion("ist_id like", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdNotLike(String value) {
            addCriterion("ist_id not like", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdIn(List<String> values) {
            addCriterion("ist_id in", values, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdNotIn(List<String> values) {
            addCriterion("ist_id not in", values, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdBetween(String value1, String value2) {
            addCriterion("ist_id between", value1, value2, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdNotBetween(String value1, String value2) {
            addCriterion("ist_id not between", value1, value2, "istId");
            return (Criteria) this;
        }

        public Criteria andIstNameIsNull() {
            addCriterion("ist_name is null");
            return (Criteria) this;
        }

        public Criteria andIstNameIsNotNull() {
            addCriterion("ist_name is not null");
            return (Criteria) this;
        }

        public Criteria andIstNameEqualTo(String value) {
            addCriterion("ist_name =", value, "istName");
            return (Criteria) this;
        }

        public Criteria andIstNameNotEqualTo(String value) {
            addCriterion("ist_name <>", value, "istName");
            return (Criteria) this;
        }

        public Criteria andIstNameGreaterThan(String value) {
            addCriterion("ist_name >", value, "istName");
            return (Criteria) this;
        }

        public Criteria andIstNameGreaterThanOrEqualTo(String value) {
            addCriterion("ist_name >=", value, "istName");
            return (Criteria) this;
        }

        public Criteria andIstNameLessThan(String value) {
            addCriterion("ist_name <", value, "istName");
            return (Criteria) this;
        }

        public Criteria andIstNameLessThanOrEqualTo(String value) {
            addCriterion("ist_name <=", value, "istName");
            return (Criteria) this;
        }

        public Criteria andIstNameLike(String value) {
            addCriterion("ist_name like", value, "istName");
            return (Criteria) this;
        }

        public Criteria andIstNameNotLike(String value) {
            addCriterion("ist_name not like", value, "istName");
            return (Criteria) this;
        }

        public Criteria andIstNameIn(List<String> values) {
            addCriterion("ist_name in", values, "istName");
            return (Criteria) this;
        }

        public Criteria andIstNameNotIn(List<String> values) {
            addCriterion("ist_name not in", values, "istName");
            return (Criteria) this;
        }

        public Criteria andIstNameBetween(String value1, String value2) {
            addCriterion("ist_name between", value1, value2, "istName");
            return (Criteria) this;
        }

        public Criteria andIstNameNotBetween(String value1, String value2) {
            addCriterion("ist_name not between", value1, value2, "istName");
            return (Criteria) this;
        }

        public Criteria andIstEngnameIsNull() {
            addCriterion("ist_engname is null");
            return (Criteria) this;
        }

        public Criteria andIstEngnameIsNotNull() {
            addCriterion("ist_engname is not null");
            return (Criteria) this;
        }

        public Criteria andIstEngnameEqualTo(String value) {
            addCriterion("ist_engname =", value, "istEngname");
            return (Criteria) this;
        }

        public Criteria andIstEngnameNotEqualTo(String value) {
            addCriterion("ist_engname <>", value, "istEngname");
            return (Criteria) this;
        }

        public Criteria andIstEngnameGreaterThan(String value) {
            addCriterion("ist_engname >", value, "istEngname");
            return (Criteria) this;
        }

        public Criteria andIstEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("ist_engname >=", value, "istEngname");
            return (Criteria) this;
        }

        public Criteria andIstEngnameLessThan(String value) {
            addCriterion("ist_engname <", value, "istEngname");
            return (Criteria) this;
        }

        public Criteria andIstEngnameLessThanOrEqualTo(String value) {
            addCriterion("ist_engname <=", value, "istEngname");
            return (Criteria) this;
        }

        public Criteria andIstEngnameLike(String value) {
            addCriterion("ist_engname like", value, "istEngname");
            return (Criteria) this;
        }

        public Criteria andIstEngnameNotLike(String value) {
            addCriterion("ist_engname not like", value, "istEngname");
            return (Criteria) this;
        }

        public Criteria andIstEngnameIn(List<String> values) {
            addCriterion("ist_engname in", values, "istEngname");
            return (Criteria) this;
        }

        public Criteria andIstEngnameNotIn(List<String> values) {
            addCriterion("ist_engname not in", values, "istEngname");
            return (Criteria) this;
        }

        public Criteria andIstEngnameBetween(String value1, String value2) {
            addCriterion("ist_engname between", value1, value2, "istEngname");
            return (Criteria) this;
        }

        public Criteria andIstEngnameNotBetween(String value1, String value2) {
            addCriterion("ist_engname not between", value1, value2, "istEngname");
            return (Criteria) this;
        }

        public Criteria andIstRemarkIsNull() {
            addCriterion("ist_remark is null");
            return (Criteria) this;
        }

        public Criteria andIstRemarkIsNotNull() {
            addCriterion("ist_remark is not null");
            return (Criteria) this;
        }

        public Criteria andIstRemarkEqualTo(String value) {
            addCriterion("ist_remark =", value, "istRemark");
            return (Criteria) this;
        }

        public Criteria andIstRemarkNotEqualTo(String value) {
            addCriterion("ist_remark <>", value, "istRemark");
            return (Criteria) this;
        }

        public Criteria andIstRemarkGreaterThan(String value) {
            addCriterion("ist_remark >", value, "istRemark");
            return (Criteria) this;
        }

        public Criteria andIstRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ist_remark >=", value, "istRemark");
            return (Criteria) this;
        }

        public Criteria andIstRemarkLessThan(String value) {
            addCriterion("ist_remark <", value, "istRemark");
            return (Criteria) this;
        }

        public Criteria andIstRemarkLessThanOrEqualTo(String value) {
            addCriterion("ist_remark <=", value, "istRemark");
            return (Criteria) this;
        }

        public Criteria andIstRemarkLike(String value) {
            addCriterion("ist_remark like", value, "istRemark");
            return (Criteria) this;
        }

        public Criteria andIstRemarkNotLike(String value) {
            addCriterion("ist_remark not like", value, "istRemark");
            return (Criteria) this;
        }

        public Criteria andIstRemarkIn(List<String> values) {
            addCriterion("ist_remark in", values, "istRemark");
            return (Criteria) this;
        }

        public Criteria andIstRemarkNotIn(List<String> values) {
            addCriterion("ist_remark not in", values, "istRemark");
            return (Criteria) this;
        }

        public Criteria andIstRemarkBetween(String value1, String value2) {
            addCriterion("ist_remark between", value1, value2, "istRemark");
            return (Criteria) this;
        }

        public Criteria andIstRemarkNotBetween(String value1, String value2) {
            addCriterion("ist_remark not between", value1, value2, "istRemark");
            return (Criteria) this;
        }

        public Criteria andIstAuditingIsNull() {
            addCriterion("ist_auditing is null");
            return (Criteria) this;
        }

        public Criteria andIstAuditingIsNotNull() {
            addCriterion("ist_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andIstAuditingEqualTo(String value) {
            addCriterion("ist_auditing =", value, "istAuditing");
            return (Criteria) this;
        }

        public Criteria andIstAuditingNotEqualTo(String value) {
            addCriterion("ist_auditing <>", value, "istAuditing");
            return (Criteria) this;
        }

        public Criteria andIstAuditingGreaterThan(String value) {
            addCriterion("ist_auditing >", value, "istAuditing");
            return (Criteria) this;
        }

        public Criteria andIstAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("ist_auditing >=", value, "istAuditing");
            return (Criteria) this;
        }

        public Criteria andIstAuditingLessThan(String value) {
            addCriterion("ist_auditing <", value, "istAuditing");
            return (Criteria) this;
        }

        public Criteria andIstAuditingLessThanOrEqualTo(String value) {
            addCriterion("ist_auditing <=", value, "istAuditing");
            return (Criteria) this;
        }

        public Criteria andIstAuditingLike(String value) {
            addCriterion("ist_auditing like", value, "istAuditing");
            return (Criteria) this;
        }

        public Criteria andIstAuditingNotLike(String value) {
            addCriterion("ist_auditing not like", value, "istAuditing");
            return (Criteria) this;
        }

        public Criteria andIstAuditingIn(List<String> values) {
            addCriterion("ist_auditing in", values, "istAuditing");
            return (Criteria) this;
        }

        public Criteria andIstAuditingNotIn(List<String> values) {
            addCriterion("ist_auditing not in", values, "istAuditing");
            return (Criteria) this;
        }

        public Criteria andIstAuditingBetween(String value1, String value2) {
            addCriterion("ist_auditing between", value1, value2, "istAuditing");
            return (Criteria) this;
        }

        public Criteria andIstAuditingNotBetween(String value1, String value2) {
            addCriterion("ist_auditing not between", value1, value2, "istAuditing");
            return (Criteria) this;
        }

        public Criteria andIstYnIsNull() {
            addCriterion("ist_yn is null");
            return (Criteria) this;
        }

        public Criteria andIstYnIsNotNull() {
            addCriterion("ist_yn is not null");
            return (Criteria) this;
        }

        public Criteria andIstYnEqualTo(String value) {
            addCriterion("ist_yn =", value, "istYn");
            return (Criteria) this;
        }

        public Criteria andIstYnNotEqualTo(String value) {
            addCriterion("ist_yn <>", value, "istYn");
            return (Criteria) this;
        }

        public Criteria andIstYnGreaterThan(String value) {
            addCriterion("ist_yn >", value, "istYn");
            return (Criteria) this;
        }

        public Criteria andIstYnGreaterThanOrEqualTo(String value) {
            addCriterion("ist_yn >=", value, "istYn");
            return (Criteria) this;
        }

        public Criteria andIstYnLessThan(String value) {
            addCriterion("ist_yn <", value, "istYn");
            return (Criteria) this;
        }

        public Criteria andIstYnLessThanOrEqualTo(String value) {
            addCriterion("ist_yn <=", value, "istYn");
            return (Criteria) this;
        }

        public Criteria andIstYnLike(String value) {
            addCriterion("ist_yn like", value, "istYn");
            return (Criteria) this;
        }

        public Criteria andIstYnNotLike(String value) {
            addCriterion("ist_yn not like", value, "istYn");
            return (Criteria) this;
        }

        public Criteria andIstYnIn(List<String> values) {
            addCriterion("ist_yn in", values, "istYn");
            return (Criteria) this;
        }

        public Criteria andIstYnNotIn(List<String> values) {
            addCriterion("ist_yn not in", values, "istYn");
            return (Criteria) this;
        }

        public Criteria andIstYnBetween(String value1, String value2) {
            addCriterion("ist_yn between", value1, value2, "istYn");
            return (Criteria) this;
        }

        public Criteria andIstYnNotBetween(String value1, String value2) {
            addCriterion("ist_yn not between", value1, value2, "istYn");
            return (Criteria) this;
        }

        public Criteria andIstCustom1IsNull() {
            addCriterion("ist_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andIstCustom1IsNotNull() {
            addCriterion("ist_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andIstCustom1EqualTo(String value) {
            addCriterion("ist_custom1 =", value, "istCustom1");
            return (Criteria) this;
        }

        public Criteria andIstCustom1NotEqualTo(String value) {
            addCriterion("ist_custom1 <>", value, "istCustom1");
            return (Criteria) this;
        }

        public Criteria andIstCustom1GreaterThan(String value) {
            addCriterion("ist_custom1 >", value, "istCustom1");
            return (Criteria) this;
        }

        public Criteria andIstCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("ist_custom1 >=", value, "istCustom1");
            return (Criteria) this;
        }

        public Criteria andIstCustom1LessThan(String value) {
            addCriterion("ist_custom1 <", value, "istCustom1");
            return (Criteria) this;
        }

        public Criteria andIstCustom1LessThanOrEqualTo(String value) {
            addCriterion("ist_custom1 <=", value, "istCustom1");
            return (Criteria) this;
        }

        public Criteria andIstCustom1Like(String value) {
            addCriterion("ist_custom1 like", value, "istCustom1");
            return (Criteria) this;
        }

        public Criteria andIstCustom1NotLike(String value) {
            addCriterion("ist_custom1 not like", value, "istCustom1");
            return (Criteria) this;
        }

        public Criteria andIstCustom1In(List<String> values) {
            addCriterion("ist_custom1 in", values, "istCustom1");
            return (Criteria) this;
        }

        public Criteria andIstCustom1NotIn(List<String> values) {
            addCriterion("ist_custom1 not in", values, "istCustom1");
            return (Criteria) this;
        }

        public Criteria andIstCustom1Between(String value1, String value2) {
            addCriterion("ist_custom1 between", value1, value2, "istCustom1");
            return (Criteria) this;
        }

        public Criteria andIstCustom1NotBetween(String value1, String value2) {
            addCriterion("ist_custom1 not between", value1, value2, "istCustom1");
            return (Criteria) this;
        }

        public Criteria andIstCustom2IsNull() {
            addCriterion("ist_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andIstCustom2IsNotNull() {
            addCriterion("ist_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andIstCustom2EqualTo(String value) {
            addCriterion("ist_custom2 =", value, "istCustom2");
            return (Criteria) this;
        }

        public Criteria andIstCustom2NotEqualTo(String value) {
            addCriterion("ist_custom2 <>", value, "istCustom2");
            return (Criteria) this;
        }

        public Criteria andIstCustom2GreaterThan(String value) {
            addCriterion("ist_custom2 >", value, "istCustom2");
            return (Criteria) this;
        }

        public Criteria andIstCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("ist_custom2 >=", value, "istCustom2");
            return (Criteria) this;
        }

        public Criteria andIstCustom2LessThan(String value) {
            addCriterion("ist_custom2 <", value, "istCustom2");
            return (Criteria) this;
        }

        public Criteria andIstCustom2LessThanOrEqualTo(String value) {
            addCriterion("ist_custom2 <=", value, "istCustom2");
            return (Criteria) this;
        }

        public Criteria andIstCustom2Like(String value) {
            addCriterion("ist_custom2 like", value, "istCustom2");
            return (Criteria) this;
        }

        public Criteria andIstCustom2NotLike(String value) {
            addCriterion("ist_custom2 not like", value, "istCustom2");
            return (Criteria) this;
        }

        public Criteria andIstCustom2In(List<String> values) {
            addCriterion("ist_custom2 in", values, "istCustom2");
            return (Criteria) this;
        }

        public Criteria andIstCustom2NotIn(List<String> values) {
            addCriterion("ist_custom2 not in", values, "istCustom2");
            return (Criteria) this;
        }

        public Criteria andIstCustom2Between(String value1, String value2) {
            addCriterion("ist_custom2 between", value1, value2, "istCustom2");
            return (Criteria) this;
        }

        public Criteria andIstCustom2NotBetween(String value1, String value2) {
            addCriterion("ist_custom2 not between", value1, value2, "istCustom2");
            return (Criteria) this;
        }

        public Criteria andIstCustom3IsNull() {
            addCriterion("ist_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andIstCustom3IsNotNull() {
            addCriterion("ist_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andIstCustom3EqualTo(String value) {
            addCriterion("ist_custom3 =", value, "istCustom3");
            return (Criteria) this;
        }

        public Criteria andIstCustom3NotEqualTo(String value) {
            addCriterion("ist_custom3 <>", value, "istCustom3");
            return (Criteria) this;
        }

        public Criteria andIstCustom3GreaterThan(String value) {
            addCriterion("ist_custom3 >", value, "istCustom3");
            return (Criteria) this;
        }

        public Criteria andIstCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("ist_custom3 >=", value, "istCustom3");
            return (Criteria) this;
        }

        public Criteria andIstCustom3LessThan(String value) {
            addCriterion("ist_custom3 <", value, "istCustom3");
            return (Criteria) this;
        }

        public Criteria andIstCustom3LessThanOrEqualTo(String value) {
            addCriterion("ist_custom3 <=", value, "istCustom3");
            return (Criteria) this;
        }

        public Criteria andIstCustom3Like(String value) {
            addCriterion("ist_custom3 like", value, "istCustom3");
            return (Criteria) this;
        }

        public Criteria andIstCustom3NotLike(String value) {
            addCriterion("ist_custom3 not like", value, "istCustom3");
            return (Criteria) this;
        }

        public Criteria andIstCustom3In(List<String> values) {
            addCriterion("ist_custom3 in", values, "istCustom3");
            return (Criteria) this;
        }

        public Criteria andIstCustom3NotIn(List<String> values) {
            addCriterion("ist_custom3 not in", values, "istCustom3");
            return (Criteria) this;
        }

        public Criteria andIstCustom3Between(String value1, String value2) {
            addCriterion("ist_custom3 between", value1, value2, "istCustom3");
            return (Criteria) this;
        }

        public Criteria andIstCustom3NotBetween(String value1, String value2) {
            addCriterion("ist_custom3 not between", value1, value2, "istCustom3");
            return (Criteria) this;
        }

        public Criteria andIstCustom4IsNull() {
            addCriterion("ist_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andIstCustom4IsNotNull() {
            addCriterion("ist_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andIstCustom4EqualTo(String value) {
            addCriterion("ist_custom4 =", value, "istCustom4");
            return (Criteria) this;
        }

        public Criteria andIstCustom4NotEqualTo(String value) {
            addCriterion("ist_custom4 <>", value, "istCustom4");
            return (Criteria) this;
        }

        public Criteria andIstCustom4GreaterThan(String value) {
            addCriterion("ist_custom4 >", value, "istCustom4");
            return (Criteria) this;
        }

        public Criteria andIstCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("ist_custom4 >=", value, "istCustom4");
            return (Criteria) this;
        }

        public Criteria andIstCustom4LessThan(String value) {
            addCriterion("ist_custom4 <", value, "istCustom4");
            return (Criteria) this;
        }

        public Criteria andIstCustom4LessThanOrEqualTo(String value) {
            addCriterion("ist_custom4 <=", value, "istCustom4");
            return (Criteria) this;
        }

        public Criteria andIstCustom4Like(String value) {
            addCriterion("ist_custom4 like", value, "istCustom4");
            return (Criteria) this;
        }

        public Criteria andIstCustom4NotLike(String value) {
            addCriterion("ist_custom4 not like", value, "istCustom4");
            return (Criteria) this;
        }

        public Criteria andIstCustom4In(List<String> values) {
            addCriterion("ist_custom4 in", values, "istCustom4");
            return (Criteria) this;
        }

        public Criteria andIstCustom4NotIn(List<String> values) {
            addCriterion("ist_custom4 not in", values, "istCustom4");
            return (Criteria) this;
        }

        public Criteria andIstCustom4Between(String value1, String value2) {
            addCriterion("ist_custom4 between", value1, value2, "istCustom4");
            return (Criteria) this;
        }

        public Criteria andIstCustom4NotBetween(String value1, String value2) {
            addCriterion("ist_custom4 not between", value1, value2, "istCustom4");
            return (Criteria) this;
        }

        public Criteria andIstCustom5IsNull() {
            addCriterion("ist_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andIstCustom5IsNotNull() {
            addCriterion("ist_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andIstCustom5EqualTo(String value) {
            addCriterion("ist_custom5 =", value, "istCustom5");
            return (Criteria) this;
        }

        public Criteria andIstCustom5NotEqualTo(String value) {
            addCriterion("ist_custom5 <>", value, "istCustom5");
            return (Criteria) this;
        }

        public Criteria andIstCustom5GreaterThan(String value) {
            addCriterion("ist_custom5 >", value, "istCustom5");
            return (Criteria) this;
        }

        public Criteria andIstCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("ist_custom5 >=", value, "istCustom5");
            return (Criteria) this;
        }

        public Criteria andIstCustom5LessThan(String value) {
            addCriterion("ist_custom5 <", value, "istCustom5");
            return (Criteria) this;
        }

        public Criteria andIstCustom5LessThanOrEqualTo(String value) {
            addCriterion("ist_custom5 <=", value, "istCustom5");
            return (Criteria) this;
        }

        public Criteria andIstCustom5Like(String value) {
            addCriterion("ist_custom5 like", value, "istCustom5");
            return (Criteria) this;
        }

        public Criteria andIstCustom5NotLike(String value) {
            addCriterion("ist_custom5 not like", value, "istCustom5");
            return (Criteria) this;
        }

        public Criteria andIstCustom5In(List<String> values) {
            addCriterion("ist_custom5 in", values, "istCustom5");
            return (Criteria) this;
        }

        public Criteria andIstCustom5NotIn(List<String> values) {
            addCriterion("ist_custom5 not in", values, "istCustom5");
            return (Criteria) this;
        }

        public Criteria andIstCustom5Between(String value1, String value2) {
            addCriterion("ist_custom5 between", value1, value2, "istCustom5");
            return (Criteria) this;
        }

        public Criteria andIstCustom5NotBetween(String value1, String value2) {
            addCriterion("ist_custom5 not between", value1, value2, "istCustom5");
            return (Criteria) this;
        }

        public Criteria andIstCustom6IsNull() {
            addCriterion("ist_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andIstCustom6IsNotNull() {
            addCriterion("ist_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andIstCustom6EqualTo(String value) {
            addCriterion("ist_custom6 =", value, "istCustom6");
            return (Criteria) this;
        }

        public Criteria andIstCustom6NotEqualTo(String value) {
            addCriterion("ist_custom6 <>", value, "istCustom6");
            return (Criteria) this;
        }

        public Criteria andIstCustom6GreaterThan(String value) {
            addCriterion("ist_custom6 >", value, "istCustom6");
            return (Criteria) this;
        }

        public Criteria andIstCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("ist_custom6 >=", value, "istCustom6");
            return (Criteria) this;
        }

        public Criteria andIstCustom6LessThan(String value) {
            addCriterion("ist_custom6 <", value, "istCustom6");
            return (Criteria) this;
        }

        public Criteria andIstCustom6LessThanOrEqualTo(String value) {
            addCriterion("ist_custom6 <=", value, "istCustom6");
            return (Criteria) this;
        }

        public Criteria andIstCustom6Like(String value) {
            addCriterion("ist_custom6 like", value, "istCustom6");
            return (Criteria) this;
        }

        public Criteria andIstCustom6NotLike(String value) {
            addCriterion("ist_custom6 not like", value, "istCustom6");
            return (Criteria) this;
        }

        public Criteria andIstCustom6In(List<String> values) {
            addCriterion("ist_custom6 in", values, "istCustom6");
            return (Criteria) this;
        }

        public Criteria andIstCustom6NotIn(List<String> values) {
            addCriterion("ist_custom6 not in", values, "istCustom6");
            return (Criteria) this;
        }

        public Criteria andIstCustom6Between(String value1, String value2) {
            addCriterion("ist_custom6 between", value1, value2, "istCustom6");
            return (Criteria) this;
        }

        public Criteria andIstCustom6NotBetween(String value1, String value2) {
            addCriterion("ist_custom6 not between", value1, value2, "istCustom6");
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