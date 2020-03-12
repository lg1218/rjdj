package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class OutStorageTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutStorageTypeExample() {
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

        public Criteria andOstIdIsNull() {
            addCriterion("ost_id is null");
            return (Criteria) this;
        }

        public Criteria andOstIdIsNotNull() {
            addCriterion("ost_id is not null");
            return (Criteria) this;
        }

        public Criteria andOstIdEqualTo(String value) {
            addCriterion("ost_id =", value, "ostId");
            return (Criteria) this;
        }

        public Criteria andOstIdNotEqualTo(String value) {
            addCriterion("ost_id <>", value, "ostId");
            return (Criteria) this;
        }

        public Criteria andOstIdGreaterThan(String value) {
            addCriterion("ost_id >", value, "ostId");
            return (Criteria) this;
        }

        public Criteria andOstIdGreaterThanOrEqualTo(String value) {
            addCriterion("ost_id >=", value, "ostId");
            return (Criteria) this;
        }

        public Criteria andOstIdLessThan(String value) {
            addCriterion("ost_id <", value, "ostId");
            return (Criteria) this;
        }

        public Criteria andOstIdLessThanOrEqualTo(String value) {
            addCriterion("ost_id <=", value, "ostId");
            return (Criteria) this;
        }

        public Criteria andOstIdLike(String value) {
            addCriterion("ost_id like", value, "ostId");
            return (Criteria) this;
        }

        public Criteria andOstIdNotLike(String value) {
            addCriterion("ost_id not like", value, "ostId");
            return (Criteria) this;
        }

        public Criteria andOstIdIn(List<String> values) {
            addCriterion("ost_id in", values, "ostId");
            return (Criteria) this;
        }

        public Criteria andOstIdNotIn(List<String> values) {
            addCriterion("ost_id not in", values, "ostId");
            return (Criteria) this;
        }

        public Criteria andOstIdBetween(String value1, String value2) {
            addCriterion("ost_id between", value1, value2, "ostId");
            return (Criteria) this;
        }

        public Criteria andOstIdNotBetween(String value1, String value2) {
            addCriterion("ost_id not between", value1, value2, "ostId");
            return (Criteria) this;
        }

        public Criteria andOstNameIsNull() {
            addCriterion("ost_name is null");
            return (Criteria) this;
        }

        public Criteria andOstNameIsNotNull() {
            addCriterion("ost_name is not null");
            return (Criteria) this;
        }

        public Criteria andOstNameEqualTo(String value) {
            addCriterion("ost_name =", value, "ostName");
            return (Criteria) this;
        }

        public Criteria andOstNameNotEqualTo(String value) {
            addCriterion("ost_name <>", value, "ostName");
            return (Criteria) this;
        }

        public Criteria andOstNameGreaterThan(String value) {
            addCriterion("ost_name >", value, "ostName");
            return (Criteria) this;
        }

        public Criteria andOstNameGreaterThanOrEqualTo(String value) {
            addCriterion("ost_name >=", value, "ostName");
            return (Criteria) this;
        }

        public Criteria andOstNameLessThan(String value) {
            addCriterion("ost_name <", value, "ostName");
            return (Criteria) this;
        }

        public Criteria andOstNameLessThanOrEqualTo(String value) {
            addCriterion("ost_name <=", value, "ostName");
            return (Criteria) this;
        }

        public Criteria andOstNameLike(String value) {
            addCriterion("ost_name like", value, "ostName");
            return (Criteria) this;
        }

        public Criteria andOstNameNotLike(String value) {
            addCriterion("ost_name not like", value, "ostName");
            return (Criteria) this;
        }

        public Criteria andOstNameIn(List<String> values) {
            addCriterion("ost_name in", values, "ostName");
            return (Criteria) this;
        }

        public Criteria andOstNameNotIn(List<String> values) {
            addCriterion("ost_name not in", values, "ostName");
            return (Criteria) this;
        }

        public Criteria andOstNameBetween(String value1, String value2) {
            addCriterion("ost_name between", value1, value2, "ostName");
            return (Criteria) this;
        }

        public Criteria andOstNameNotBetween(String value1, String value2) {
            addCriterion("ost_name not between", value1, value2, "ostName");
            return (Criteria) this;
        }

        public Criteria andOstEngnameIsNull() {
            addCriterion("ost_engname is null");
            return (Criteria) this;
        }

        public Criteria andOstEngnameIsNotNull() {
            addCriterion("ost_engname is not null");
            return (Criteria) this;
        }

        public Criteria andOstEngnameEqualTo(String value) {
            addCriterion("ost_engname =", value, "ostEngname");
            return (Criteria) this;
        }

        public Criteria andOstEngnameNotEqualTo(String value) {
            addCriterion("ost_engname <>", value, "ostEngname");
            return (Criteria) this;
        }

        public Criteria andOstEngnameGreaterThan(String value) {
            addCriterion("ost_engname >", value, "ostEngname");
            return (Criteria) this;
        }

        public Criteria andOstEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("ost_engname >=", value, "ostEngname");
            return (Criteria) this;
        }

        public Criteria andOstEngnameLessThan(String value) {
            addCriterion("ost_engname <", value, "ostEngname");
            return (Criteria) this;
        }

        public Criteria andOstEngnameLessThanOrEqualTo(String value) {
            addCriterion("ost_engname <=", value, "ostEngname");
            return (Criteria) this;
        }

        public Criteria andOstEngnameLike(String value) {
            addCriterion("ost_engname like", value, "ostEngname");
            return (Criteria) this;
        }

        public Criteria andOstEngnameNotLike(String value) {
            addCriterion("ost_engname not like", value, "ostEngname");
            return (Criteria) this;
        }

        public Criteria andOstEngnameIn(List<String> values) {
            addCriterion("ost_engname in", values, "ostEngname");
            return (Criteria) this;
        }

        public Criteria andOstEngnameNotIn(List<String> values) {
            addCriterion("ost_engname not in", values, "ostEngname");
            return (Criteria) this;
        }

        public Criteria andOstEngnameBetween(String value1, String value2) {
            addCriterion("ost_engname between", value1, value2, "ostEngname");
            return (Criteria) this;
        }

        public Criteria andOstEngnameNotBetween(String value1, String value2) {
            addCriterion("ost_engname not between", value1, value2, "ostEngname");
            return (Criteria) this;
        }

        public Criteria andOstRemarkIsNull() {
            addCriterion("ost_remark is null");
            return (Criteria) this;
        }

        public Criteria andOstRemarkIsNotNull() {
            addCriterion("ost_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOstRemarkEqualTo(String value) {
            addCriterion("ost_remark =", value, "ostRemark");
            return (Criteria) this;
        }

        public Criteria andOstRemarkNotEqualTo(String value) {
            addCriterion("ost_remark <>", value, "ostRemark");
            return (Criteria) this;
        }

        public Criteria andOstRemarkGreaterThan(String value) {
            addCriterion("ost_remark >", value, "ostRemark");
            return (Criteria) this;
        }

        public Criteria andOstRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ost_remark >=", value, "ostRemark");
            return (Criteria) this;
        }

        public Criteria andOstRemarkLessThan(String value) {
            addCriterion("ost_remark <", value, "ostRemark");
            return (Criteria) this;
        }

        public Criteria andOstRemarkLessThanOrEqualTo(String value) {
            addCriterion("ost_remark <=", value, "ostRemark");
            return (Criteria) this;
        }

        public Criteria andOstRemarkLike(String value) {
            addCriterion("ost_remark like", value, "ostRemark");
            return (Criteria) this;
        }

        public Criteria andOstRemarkNotLike(String value) {
            addCriterion("ost_remark not like", value, "ostRemark");
            return (Criteria) this;
        }

        public Criteria andOstRemarkIn(List<String> values) {
            addCriterion("ost_remark in", values, "ostRemark");
            return (Criteria) this;
        }

        public Criteria andOstRemarkNotIn(List<String> values) {
            addCriterion("ost_remark not in", values, "ostRemark");
            return (Criteria) this;
        }

        public Criteria andOstRemarkBetween(String value1, String value2) {
            addCriterion("ost_remark between", value1, value2, "ostRemark");
            return (Criteria) this;
        }

        public Criteria andOstRemarkNotBetween(String value1, String value2) {
            addCriterion("ost_remark not between", value1, value2, "ostRemark");
            return (Criteria) this;
        }

        public Criteria andOstAuditingIsNull() {
            addCriterion("ost_auditing is null");
            return (Criteria) this;
        }

        public Criteria andOstAuditingIsNotNull() {
            addCriterion("ost_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andOstAuditingEqualTo(String value) {
            addCriterion("ost_auditing =", value, "ostAuditing");
            return (Criteria) this;
        }

        public Criteria andOstAuditingNotEqualTo(String value) {
            addCriterion("ost_auditing <>", value, "ostAuditing");
            return (Criteria) this;
        }

        public Criteria andOstAuditingGreaterThan(String value) {
            addCriterion("ost_auditing >", value, "ostAuditing");
            return (Criteria) this;
        }

        public Criteria andOstAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("ost_auditing >=", value, "ostAuditing");
            return (Criteria) this;
        }

        public Criteria andOstAuditingLessThan(String value) {
            addCriterion("ost_auditing <", value, "ostAuditing");
            return (Criteria) this;
        }

        public Criteria andOstAuditingLessThanOrEqualTo(String value) {
            addCriterion("ost_auditing <=", value, "ostAuditing");
            return (Criteria) this;
        }

        public Criteria andOstAuditingLike(String value) {
            addCriterion("ost_auditing like", value, "ostAuditing");
            return (Criteria) this;
        }

        public Criteria andOstAuditingNotLike(String value) {
            addCriterion("ost_auditing not like", value, "ostAuditing");
            return (Criteria) this;
        }

        public Criteria andOstAuditingIn(List<String> values) {
            addCriterion("ost_auditing in", values, "ostAuditing");
            return (Criteria) this;
        }

        public Criteria andOstAuditingNotIn(List<String> values) {
            addCriterion("ost_auditing not in", values, "ostAuditing");
            return (Criteria) this;
        }

        public Criteria andOstAuditingBetween(String value1, String value2) {
            addCriterion("ost_auditing between", value1, value2, "ostAuditing");
            return (Criteria) this;
        }

        public Criteria andOstAuditingNotBetween(String value1, String value2) {
            addCriterion("ost_auditing not between", value1, value2, "ostAuditing");
            return (Criteria) this;
        }

        public Criteria andOstYnIsNull() {
            addCriterion("ost_yn is null");
            return (Criteria) this;
        }

        public Criteria andOstYnIsNotNull() {
            addCriterion("ost_yn is not null");
            return (Criteria) this;
        }

        public Criteria andOstYnEqualTo(String value) {
            addCriterion("ost_yn =", value, "ostYn");
            return (Criteria) this;
        }

        public Criteria andOstYnNotEqualTo(String value) {
            addCriterion("ost_yn <>", value, "ostYn");
            return (Criteria) this;
        }

        public Criteria andOstYnGreaterThan(String value) {
            addCriterion("ost_yn >", value, "ostYn");
            return (Criteria) this;
        }

        public Criteria andOstYnGreaterThanOrEqualTo(String value) {
            addCriterion("ost_yn >=", value, "ostYn");
            return (Criteria) this;
        }

        public Criteria andOstYnLessThan(String value) {
            addCriterion("ost_yn <", value, "ostYn");
            return (Criteria) this;
        }

        public Criteria andOstYnLessThanOrEqualTo(String value) {
            addCriterion("ost_yn <=", value, "ostYn");
            return (Criteria) this;
        }

        public Criteria andOstYnLike(String value) {
            addCriterion("ost_yn like", value, "ostYn");
            return (Criteria) this;
        }

        public Criteria andOstYnNotLike(String value) {
            addCriterion("ost_yn not like", value, "ostYn");
            return (Criteria) this;
        }

        public Criteria andOstYnIn(List<String> values) {
            addCriterion("ost_yn in", values, "ostYn");
            return (Criteria) this;
        }

        public Criteria andOstYnNotIn(List<String> values) {
            addCriterion("ost_yn not in", values, "ostYn");
            return (Criteria) this;
        }

        public Criteria andOstYnBetween(String value1, String value2) {
            addCriterion("ost_yn between", value1, value2, "ostYn");
            return (Criteria) this;
        }

        public Criteria andOstYnNotBetween(String value1, String value2) {
            addCriterion("ost_yn not between", value1, value2, "ostYn");
            return (Criteria) this;
        }

        public Criteria andOstCustom1IsNull() {
            addCriterion("ost_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andOstCustom1IsNotNull() {
            addCriterion("ost_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andOstCustom1EqualTo(String value) {
            addCriterion("ost_custom1 =", value, "ostCustom1");
            return (Criteria) this;
        }

        public Criteria andOstCustom1NotEqualTo(String value) {
            addCriterion("ost_custom1 <>", value, "ostCustom1");
            return (Criteria) this;
        }

        public Criteria andOstCustom1GreaterThan(String value) {
            addCriterion("ost_custom1 >", value, "ostCustom1");
            return (Criteria) this;
        }

        public Criteria andOstCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("ost_custom1 >=", value, "ostCustom1");
            return (Criteria) this;
        }

        public Criteria andOstCustom1LessThan(String value) {
            addCriterion("ost_custom1 <", value, "ostCustom1");
            return (Criteria) this;
        }

        public Criteria andOstCustom1LessThanOrEqualTo(String value) {
            addCriterion("ost_custom1 <=", value, "ostCustom1");
            return (Criteria) this;
        }

        public Criteria andOstCustom1Like(String value) {
            addCriterion("ost_custom1 like", value, "ostCustom1");
            return (Criteria) this;
        }

        public Criteria andOstCustom1NotLike(String value) {
            addCriterion("ost_custom1 not like", value, "ostCustom1");
            return (Criteria) this;
        }

        public Criteria andOstCustom1In(List<String> values) {
            addCriterion("ost_custom1 in", values, "ostCustom1");
            return (Criteria) this;
        }

        public Criteria andOstCustom1NotIn(List<String> values) {
            addCriterion("ost_custom1 not in", values, "ostCustom1");
            return (Criteria) this;
        }

        public Criteria andOstCustom1Between(String value1, String value2) {
            addCriterion("ost_custom1 between", value1, value2, "ostCustom1");
            return (Criteria) this;
        }

        public Criteria andOstCustom1NotBetween(String value1, String value2) {
            addCriterion("ost_custom1 not between", value1, value2, "ostCustom1");
            return (Criteria) this;
        }

        public Criteria andOstCustom2IsNull() {
            addCriterion("ost_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andOstCustom2IsNotNull() {
            addCriterion("ost_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andOstCustom2EqualTo(String value) {
            addCriterion("ost_custom2 =", value, "ostCustom2");
            return (Criteria) this;
        }

        public Criteria andOstCustom2NotEqualTo(String value) {
            addCriterion("ost_custom2 <>", value, "ostCustom2");
            return (Criteria) this;
        }

        public Criteria andOstCustom2GreaterThan(String value) {
            addCriterion("ost_custom2 >", value, "ostCustom2");
            return (Criteria) this;
        }

        public Criteria andOstCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("ost_custom2 >=", value, "ostCustom2");
            return (Criteria) this;
        }

        public Criteria andOstCustom2LessThan(String value) {
            addCriterion("ost_custom2 <", value, "ostCustom2");
            return (Criteria) this;
        }

        public Criteria andOstCustom2LessThanOrEqualTo(String value) {
            addCriterion("ost_custom2 <=", value, "ostCustom2");
            return (Criteria) this;
        }

        public Criteria andOstCustom2Like(String value) {
            addCriterion("ost_custom2 like", value, "ostCustom2");
            return (Criteria) this;
        }

        public Criteria andOstCustom2NotLike(String value) {
            addCriterion("ost_custom2 not like", value, "ostCustom2");
            return (Criteria) this;
        }

        public Criteria andOstCustom2In(List<String> values) {
            addCriterion("ost_custom2 in", values, "ostCustom2");
            return (Criteria) this;
        }

        public Criteria andOstCustom2NotIn(List<String> values) {
            addCriterion("ost_custom2 not in", values, "ostCustom2");
            return (Criteria) this;
        }

        public Criteria andOstCustom2Between(String value1, String value2) {
            addCriterion("ost_custom2 between", value1, value2, "ostCustom2");
            return (Criteria) this;
        }

        public Criteria andOstCustom2NotBetween(String value1, String value2) {
            addCriterion("ost_custom2 not between", value1, value2, "ostCustom2");
            return (Criteria) this;
        }

        public Criteria andOstCustom3IsNull() {
            addCriterion("ost_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andOstCustom3IsNotNull() {
            addCriterion("ost_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andOstCustom3EqualTo(String value) {
            addCriterion("ost_custom3 =", value, "ostCustom3");
            return (Criteria) this;
        }

        public Criteria andOstCustom3NotEqualTo(String value) {
            addCriterion("ost_custom3 <>", value, "ostCustom3");
            return (Criteria) this;
        }

        public Criteria andOstCustom3GreaterThan(String value) {
            addCriterion("ost_custom3 >", value, "ostCustom3");
            return (Criteria) this;
        }

        public Criteria andOstCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("ost_custom3 >=", value, "ostCustom3");
            return (Criteria) this;
        }

        public Criteria andOstCustom3LessThan(String value) {
            addCriterion("ost_custom3 <", value, "ostCustom3");
            return (Criteria) this;
        }

        public Criteria andOstCustom3LessThanOrEqualTo(String value) {
            addCriterion("ost_custom3 <=", value, "ostCustom3");
            return (Criteria) this;
        }

        public Criteria andOstCustom3Like(String value) {
            addCriterion("ost_custom3 like", value, "ostCustom3");
            return (Criteria) this;
        }

        public Criteria andOstCustom3NotLike(String value) {
            addCriterion("ost_custom3 not like", value, "ostCustom3");
            return (Criteria) this;
        }

        public Criteria andOstCustom3In(List<String> values) {
            addCriterion("ost_custom3 in", values, "ostCustom3");
            return (Criteria) this;
        }

        public Criteria andOstCustom3NotIn(List<String> values) {
            addCriterion("ost_custom3 not in", values, "ostCustom3");
            return (Criteria) this;
        }

        public Criteria andOstCustom3Between(String value1, String value2) {
            addCriterion("ost_custom3 between", value1, value2, "ostCustom3");
            return (Criteria) this;
        }

        public Criteria andOstCustom3NotBetween(String value1, String value2) {
            addCriterion("ost_custom3 not between", value1, value2, "ostCustom3");
            return (Criteria) this;
        }

        public Criteria andOstCustom4IsNull() {
            addCriterion("ost_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andOstCustom4IsNotNull() {
            addCriterion("ost_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andOstCustom4EqualTo(String value) {
            addCriterion("ost_custom4 =", value, "ostCustom4");
            return (Criteria) this;
        }

        public Criteria andOstCustom4NotEqualTo(String value) {
            addCriterion("ost_custom4 <>", value, "ostCustom4");
            return (Criteria) this;
        }

        public Criteria andOstCustom4GreaterThan(String value) {
            addCriterion("ost_custom4 >", value, "ostCustom4");
            return (Criteria) this;
        }

        public Criteria andOstCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("ost_custom4 >=", value, "ostCustom4");
            return (Criteria) this;
        }

        public Criteria andOstCustom4LessThan(String value) {
            addCriterion("ost_custom4 <", value, "ostCustom4");
            return (Criteria) this;
        }

        public Criteria andOstCustom4LessThanOrEqualTo(String value) {
            addCriterion("ost_custom4 <=", value, "ostCustom4");
            return (Criteria) this;
        }

        public Criteria andOstCustom4Like(String value) {
            addCriterion("ost_custom4 like", value, "ostCustom4");
            return (Criteria) this;
        }

        public Criteria andOstCustom4NotLike(String value) {
            addCriterion("ost_custom4 not like", value, "ostCustom4");
            return (Criteria) this;
        }

        public Criteria andOstCustom4In(List<String> values) {
            addCriterion("ost_custom4 in", values, "ostCustom4");
            return (Criteria) this;
        }

        public Criteria andOstCustom4NotIn(List<String> values) {
            addCriterion("ost_custom4 not in", values, "ostCustom4");
            return (Criteria) this;
        }

        public Criteria andOstCustom4Between(String value1, String value2) {
            addCriterion("ost_custom4 between", value1, value2, "ostCustom4");
            return (Criteria) this;
        }

        public Criteria andOstCustom4NotBetween(String value1, String value2) {
            addCriterion("ost_custom4 not between", value1, value2, "ostCustom4");
            return (Criteria) this;
        }

        public Criteria andOstCustom5IsNull() {
            addCriterion("ost_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andOstCustom5IsNotNull() {
            addCriterion("ost_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andOstCustom5EqualTo(String value) {
            addCriterion("ost_custom5 =", value, "ostCustom5");
            return (Criteria) this;
        }

        public Criteria andOstCustom5NotEqualTo(String value) {
            addCriterion("ost_custom5 <>", value, "ostCustom5");
            return (Criteria) this;
        }

        public Criteria andOstCustom5GreaterThan(String value) {
            addCriterion("ost_custom5 >", value, "ostCustom5");
            return (Criteria) this;
        }

        public Criteria andOstCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("ost_custom5 >=", value, "ostCustom5");
            return (Criteria) this;
        }

        public Criteria andOstCustom5LessThan(String value) {
            addCriterion("ost_custom5 <", value, "ostCustom5");
            return (Criteria) this;
        }

        public Criteria andOstCustom5LessThanOrEqualTo(String value) {
            addCriterion("ost_custom5 <=", value, "ostCustom5");
            return (Criteria) this;
        }

        public Criteria andOstCustom5Like(String value) {
            addCriterion("ost_custom5 like", value, "ostCustom5");
            return (Criteria) this;
        }

        public Criteria andOstCustom5NotLike(String value) {
            addCriterion("ost_custom5 not like", value, "ostCustom5");
            return (Criteria) this;
        }

        public Criteria andOstCustom5In(List<String> values) {
            addCriterion("ost_custom5 in", values, "ostCustom5");
            return (Criteria) this;
        }

        public Criteria andOstCustom5NotIn(List<String> values) {
            addCriterion("ost_custom5 not in", values, "ostCustom5");
            return (Criteria) this;
        }

        public Criteria andOstCustom5Between(String value1, String value2) {
            addCriterion("ost_custom5 between", value1, value2, "ostCustom5");
            return (Criteria) this;
        }

        public Criteria andOstCustom5NotBetween(String value1, String value2) {
            addCriterion("ost_custom5 not between", value1, value2, "ostCustom5");
            return (Criteria) this;
        }

        public Criteria andOstCustom6IsNull() {
            addCriterion("ost_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andOstCustom6IsNotNull() {
            addCriterion("ost_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andOstCustom6EqualTo(String value) {
            addCriterion("ost_custom6 =", value, "ostCustom6");
            return (Criteria) this;
        }

        public Criteria andOstCustom6NotEqualTo(String value) {
            addCriterion("ost_custom6 <>", value, "ostCustom6");
            return (Criteria) this;
        }

        public Criteria andOstCustom6GreaterThan(String value) {
            addCriterion("ost_custom6 >", value, "ostCustom6");
            return (Criteria) this;
        }

        public Criteria andOstCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("ost_custom6 >=", value, "ostCustom6");
            return (Criteria) this;
        }

        public Criteria andOstCustom6LessThan(String value) {
            addCriterion("ost_custom6 <", value, "ostCustom6");
            return (Criteria) this;
        }

        public Criteria andOstCustom6LessThanOrEqualTo(String value) {
            addCriterion("ost_custom6 <=", value, "ostCustom6");
            return (Criteria) this;
        }

        public Criteria andOstCustom6Like(String value) {
            addCriterion("ost_custom6 like", value, "ostCustom6");
            return (Criteria) this;
        }

        public Criteria andOstCustom6NotLike(String value) {
            addCriterion("ost_custom6 not like", value, "ostCustom6");
            return (Criteria) this;
        }

        public Criteria andOstCustom6In(List<String> values) {
            addCriterion("ost_custom6 in", values, "ostCustom6");
            return (Criteria) this;
        }

        public Criteria andOstCustom6NotIn(List<String> values) {
            addCriterion("ost_custom6 not in", values, "ostCustom6");
            return (Criteria) this;
        }

        public Criteria andOstCustom6Between(String value1, String value2) {
            addCriterion("ost_custom6 between", value1, value2, "ostCustom6");
            return (Criteria) this;
        }

        public Criteria andOstCustom6NotBetween(String value1, String value2) {
            addCriterion("ost_custom6 not between", value1, value2, "ostCustom6");
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