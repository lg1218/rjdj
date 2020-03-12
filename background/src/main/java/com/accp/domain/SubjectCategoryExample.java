package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SubjectCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjectCategoryExample() {
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

        public Criteria andScIdIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andScIdIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andScIdEqualTo(String value) {
            addCriterion("sc_id =", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotEqualTo(String value) {
            addCriterion("sc_id <>", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThan(String value) {
            addCriterion("sc_id >", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThanOrEqualTo(String value) {
            addCriterion("sc_id >=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThan(String value) {
            addCriterion("sc_id <", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThanOrEqualTo(String value) {
            addCriterion("sc_id <=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLike(String value) {
            addCriterion("sc_id like", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotLike(String value) {
            addCriterion("sc_id not like", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdIn(List<String> values) {
            addCriterion("sc_id in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotIn(List<String> values) {
            addCriterion("sc_id not in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdBetween(String value1, String value2) {
            addCriterion("sc_id between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotBetween(String value1, String value2) {
            addCriterion("sc_id not between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScNameIsNull() {
            addCriterion("sc_name is null");
            return (Criteria) this;
        }

        public Criteria andScNameIsNotNull() {
            addCriterion("sc_name is not null");
            return (Criteria) this;
        }

        public Criteria andScNameEqualTo(String value) {
            addCriterion("sc_name =", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotEqualTo(String value) {
            addCriterion("sc_name <>", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThan(String value) {
            addCriterion("sc_name >", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThanOrEqualTo(String value) {
            addCriterion("sc_name >=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThan(String value) {
            addCriterion("sc_name <", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThanOrEqualTo(String value) {
            addCriterion("sc_name <=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLike(String value) {
            addCriterion("sc_name like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotLike(String value) {
            addCriterion("sc_name not like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameIn(List<String> values) {
            addCriterion("sc_name in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotIn(List<String> values) {
            addCriterion("sc_name not in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameBetween(String value1, String value2) {
            addCriterion("sc_name between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotBetween(String value1, String value2) {
            addCriterion("sc_name not between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScEngnameIsNull() {
            addCriterion("sc_engname is null");
            return (Criteria) this;
        }

        public Criteria andScEngnameIsNotNull() {
            addCriterion("sc_engname is not null");
            return (Criteria) this;
        }

        public Criteria andScEngnameEqualTo(String value) {
            addCriterion("sc_engname =", value, "scEngname");
            return (Criteria) this;
        }

        public Criteria andScEngnameNotEqualTo(String value) {
            addCriterion("sc_engname <>", value, "scEngname");
            return (Criteria) this;
        }

        public Criteria andScEngnameGreaterThan(String value) {
            addCriterion("sc_engname >", value, "scEngname");
            return (Criteria) this;
        }

        public Criteria andScEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("sc_engname >=", value, "scEngname");
            return (Criteria) this;
        }

        public Criteria andScEngnameLessThan(String value) {
            addCriterion("sc_engname <", value, "scEngname");
            return (Criteria) this;
        }

        public Criteria andScEngnameLessThanOrEqualTo(String value) {
            addCriterion("sc_engname <=", value, "scEngname");
            return (Criteria) this;
        }

        public Criteria andScEngnameLike(String value) {
            addCriterion("sc_engname like", value, "scEngname");
            return (Criteria) this;
        }

        public Criteria andScEngnameNotLike(String value) {
            addCriterion("sc_engname not like", value, "scEngname");
            return (Criteria) this;
        }

        public Criteria andScEngnameIn(List<String> values) {
            addCriterion("sc_engname in", values, "scEngname");
            return (Criteria) this;
        }

        public Criteria andScEngnameNotIn(List<String> values) {
            addCriterion("sc_engname not in", values, "scEngname");
            return (Criteria) this;
        }

        public Criteria andScEngnameBetween(String value1, String value2) {
            addCriterion("sc_engname between", value1, value2, "scEngname");
            return (Criteria) this;
        }

        public Criteria andScEngnameNotBetween(String value1, String value2) {
            addCriterion("sc_engname not between", value1, value2, "scEngname");
            return (Criteria) this;
        }

        public Criteria andScRemarkIsNull() {
            addCriterion("sc_remark is null");
            return (Criteria) this;
        }

        public Criteria andScRemarkIsNotNull() {
            addCriterion("sc_remark is not null");
            return (Criteria) this;
        }

        public Criteria andScRemarkEqualTo(String value) {
            addCriterion("sc_remark =", value, "scRemark");
            return (Criteria) this;
        }

        public Criteria andScRemarkNotEqualTo(String value) {
            addCriterion("sc_remark <>", value, "scRemark");
            return (Criteria) this;
        }

        public Criteria andScRemarkGreaterThan(String value) {
            addCriterion("sc_remark >", value, "scRemark");
            return (Criteria) this;
        }

        public Criteria andScRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sc_remark >=", value, "scRemark");
            return (Criteria) this;
        }

        public Criteria andScRemarkLessThan(String value) {
            addCriterion("sc_remark <", value, "scRemark");
            return (Criteria) this;
        }

        public Criteria andScRemarkLessThanOrEqualTo(String value) {
            addCriterion("sc_remark <=", value, "scRemark");
            return (Criteria) this;
        }

        public Criteria andScRemarkLike(String value) {
            addCriterion("sc_remark like", value, "scRemark");
            return (Criteria) this;
        }

        public Criteria andScRemarkNotLike(String value) {
            addCriterion("sc_remark not like", value, "scRemark");
            return (Criteria) this;
        }

        public Criteria andScRemarkIn(List<String> values) {
            addCriterion("sc_remark in", values, "scRemark");
            return (Criteria) this;
        }

        public Criteria andScRemarkNotIn(List<String> values) {
            addCriterion("sc_remark not in", values, "scRemark");
            return (Criteria) this;
        }

        public Criteria andScRemarkBetween(String value1, String value2) {
            addCriterion("sc_remark between", value1, value2, "scRemark");
            return (Criteria) this;
        }

        public Criteria andScRemarkNotBetween(String value1, String value2) {
            addCriterion("sc_remark not between", value1, value2, "scRemark");
            return (Criteria) this;
        }

        public Criteria andScAuditingIsNull() {
            addCriterion("sc_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andScAuditingIsNotNull() {
            addCriterion("sc_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andScAuditingEqualTo(String value) {
            addCriterion("sc_Auditing =", value, "scAuditing");
            return (Criteria) this;
        }

        public Criteria andScAuditingNotEqualTo(String value) {
            addCriterion("sc_Auditing <>", value, "scAuditing");
            return (Criteria) this;
        }

        public Criteria andScAuditingGreaterThan(String value) {
            addCriterion("sc_Auditing >", value, "scAuditing");
            return (Criteria) this;
        }

        public Criteria andScAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("sc_Auditing >=", value, "scAuditing");
            return (Criteria) this;
        }

        public Criteria andScAuditingLessThan(String value) {
            addCriterion("sc_Auditing <", value, "scAuditing");
            return (Criteria) this;
        }

        public Criteria andScAuditingLessThanOrEqualTo(String value) {
            addCriterion("sc_Auditing <=", value, "scAuditing");
            return (Criteria) this;
        }

        public Criteria andScAuditingLike(String value) {
            addCriterion("sc_Auditing like", value, "scAuditing");
            return (Criteria) this;
        }

        public Criteria andScAuditingNotLike(String value) {
            addCriterion("sc_Auditing not like", value, "scAuditing");
            return (Criteria) this;
        }

        public Criteria andScAuditingIn(List<String> values) {
            addCriterion("sc_Auditing in", values, "scAuditing");
            return (Criteria) this;
        }

        public Criteria andScAuditingNotIn(List<String> values) {
            addCriterion("sc_Auditing not in", values, "scAuditing");
            return (Criteria) this;
        }

        public Criteria andScAuditingBetween(String value1, String value2) {
            addCriterion("sc_Auditing between", value1, value2, "scAuditing");
            return (Criteria) this;
        }

        public Criteria andScAuditingNotBetween(String value1, String value2) {
            addCriterion("sc_Auditing not between", value1, value2, "scAuditing");
            return (Criteria) this;
        }

        public Criteria andScYnIsNull() {
            addCriterion("sc_yn is null");
            return (Criteria) this;
        }

        public Criteria andScYnIsNotNull() {
            addCriterion("sc_yn is not null");
            return (Criteria) this;
        }

        public Criteria andScYnEqualTo(String value) {
            addCriterion("sc_yn =", value, "scYn");
            return (Criteria) this;
        }

        public Criteria andScYnNotEqualTo(String value) {
            addCriterion("sc_yn <>", value, "scYn");
            return (Criteria) this;
        }

        public Criteria andScYnGreaterThan(String value) {
            addCriterion("sc_yn >", value, "scYn");
            return (Criteria) this;
        }

        public Criteria andScYnGreaterThanOrEqualTo(String value) {
            addCriterion("sc_yn >=", value, "scYn");
            return (Criteria) this;
        }

        public Criteria andScYnLessThan(String value) {
            addCriterion("sc_yn <", value, "scYn");
            return (Criteria) this;
        }

        public Criteria andScYnLessThanOrEqualTo(String value) {
            addCriterion("sc_yn <=", value, "scYn");
            return (Criteria) this;
        }

        public Criteria andScYnLike(String value) {
            addCriterion("sc_yn like", value, "scYn");
            return (Criteria) this;
        }

        public Criteria andScYnNotLike(String value) {
            addCriterion("sc_yn not like", value, "scYn");
            return (Criteria) this;
        }

        public Criteria andScYnIn(List<String> values) {
            addCriterion("sc_yn in", values, "scYn");
            return (Criteria) this;
        }

        public Criteria andScYnNotIn(List<String> values) {
            addCriterion("sc_yn not in", values, "scYn");
            return (Criteria) this;
        }

        public Criteria andScYnBetween(String value1, String value2) {
            addCriterion("sc_yn between", value1, value2, "scYn");
            return (Criteria) this;
        }

        public Criteria andScYnNotBetween(String value1, String value2) {
            addCriterion("sc_yn not between", value1, value2, "scYn");
            return (Criteria) this;
        }

        public Criteria andScCustom1IsNull() {
            addCriterion("sc_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andScCustom1IsNotNull() {
            addCriterion("sc_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andScCustom1EqualTo(String value) {
            addCriterion("sc_custom1 =", value, "scCustom1");
            return (Criteria) this;
        }

        public Criteria andScCustom1NotEqualTo(String value) {
            addCriterion("sc_custom1 <>", value, "scCustom1");
            return (Criteria) this;
        }

        public Criteria andScCustom1GreaterThan(String value) {
            addCriterion("sc_custom1 >", value, "scCustom1");
            return (Criteria) this;
        }

        public Criteria andScCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("sc_custom1 >=", value, "scCustom1");
            return (Criteria) this;
        }

        public Criteria andScCustom1LessThan(String value) {
            addCriterion("sc_custom1 <", value, "scCustom1");
            return (Criteria) this;
        }

        public Criteria andScCustom1LessThanOrEqualTo(String value) {
            addCriterion("sc_custom1 <=", value, "scCustom1");
            return (Criteria) this;
        }

        public Criteria andScCustom1Like(String value) {
            addCriterion("sc_custom1 like", value, "scCustom1");
            return (Criteria) this;
        }

        public Criteria andScCustom1NotLike(String value) {
            addCriterion("sc_custom1 not like", value, "scCustom1");
            return (Criteria) this;
        }

        public Criteria andScCustom1In(List<String> values) {
            addCriterion("sc_custom1 in", values, "scCustom1");
            return (Criteria) this;
        }

        public Criteria andScCustom1NotIn(List<String> values) {
            addCriterion("sc_custom1 not in", values, "scCustom1");
            return (Criteria) this;
        }

        public Criteria andScCustom1Between(String value1, String value2) {
            addCriterion("sc_custom1 between", value1, value2, "scCustom1");
            return (Criteria) this;
        }

        public Criteria andScCustom1NotBetween(String value1, String value2) {
            addCriterion("sc_custom1 not between", value1, value2, "scCustom1");
            return (Criteria) this;
        }

        public Criteria andScCustom2IsNull() {
            addCriterion("sc_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andScCustom2IsNotNull() {
            addCriterion("sc_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andScCustom2EqualTo(String value) {
            addCriterion("sc_custom2 =", value, "scCustom2");
            return (Criteria) this;
        }

        public Criteria andScCustom2NotEqualTo(String value) {
            addCriterion("sc_custom2 <>", value, "scCustom2");
            return (Criteria) this;
        }

        public Criteria andScCustom2GreaterThan(String value) {
            addCriterion("sc_custom2 >", value, "scCustom2");
            return (Criteria) this;
        }

        public Criteria andScCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("sc_custom2 >=", value, "scCustom2");
            return (Criteria) this;
        }

        public Criteria andScCustom2LessThan(String value) {
            addCriterion("sc_custom2 <", value, "scCustom2");
            return (Criteria) this;
        }

        public Criteria andScCustom2LessThanOrEqualTo(String value) {
            addCriterion("sc_custom2 <=", value, "scCustom2");
            return (Criteria) this;
        }

        public Criteria andScCustom2Like(String value) {
            addCriterion("sc_custom2 like", value, "scCustom2");
            return (Criteria) this;
        }

        public Criteria andScCustom2NotLike(String value) {
            addCriterion("sc_custom2 not like", value, "scCustom2");
            return (Criteria) this;
        }

        public Criteria andScCustom2In(List<String> values) {
            addCriterion("sc_custom2 in", values, "scCustom2");
            return (Criteria) this;
        }

        public Criteria andScCustom2NotIn(List<String> values) {
            addCriterion("sc_custom2 not in", values, "scCustom2");
            return (Criteria) this;
        }

        public Criteria andScCustom2Between(String value1, String value2) {
            addCriterion("sc_custom2 between", value1, value2, "scCustom2");
            return (Criteria) this;
        }

        public Criteria andScCustom2NotBetween(String value1, String value2) {
            addCriterion("sc_custom2 not between", value1, value2, "scCustom2");
            return (Criteria) this;
        }

        public Criteria andScCustom3IsNull() {
            addCriterion("sc_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andScCustom3IsNotNull() {
            addCriterion("sc_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andScCustom3EqualTo(String value) {
            addCriterion("sc_custom3 =", value, "scCustom3");
            return (Criteria) this;
        }

        public Criteria andScCustom3NotEqualTo(String value) {
            addCriterion("sc_custom3 <>", value, "scCustom3");
            return (Criteria) this;
        }

        public Criteria andScCustom3GreaterThan(String value) {
            addCriterion("sc_custom3 >", value, "scCustom3");
            return (Criteria) this;
        }

        public Criteria andScCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("sc_custom3 >=", value, "scCustom3");
            return (Criteria) this;
        }

        public Criteria andScCustom3LessThan(String value) {
            addCriterion("sc_custom3 <", value, "scCustom3");
            return (Criteria) this;
        }

        public Criteria andScCustom3LessThanOrEqualTo(String value) {
            addCriterion("sc_custom3 <=", value, "scCustom3");
            return (Criteria) this;
        }

        public Criteria andScCustom3Like(String value) {
            addCriterion("sc_custom3 like", value, "scCustom3");
            return (Criteria) this;
        }

        public Criteria andScCustom3NotLike(String value) {
            addCriterion("sc_custom3 not like", value, "scCustom3");
            return (Criteria) this;
        }

        public Criteria andScCustom3In(List<String> values) {
            addCriterion("sc_custom3 in", values, "scCustom3");
            return (Criteria) this;
        }

        public Criteria andScCustom3NotIn(List<String> values) {
            addCriterion("sc_custom3 not in", values, "scCustom3");
            return (Criteria) this;
        }

        public Criteria andScCustom3Between(String value1, String value2) {
            addCriterion("sc_custom3 between", value1, value2, "scCustom3");
            return (Criteria) this;
        }

        public Criteria andScCustom3NotBetween(String value1, String value2) {
            addCriterion("sc_custom3 not between", value1, value2, "scCustom3");
            return (Criteria) this;
        }

        public Criteria andScCustom4IsNull() {
            addCriterion("sc_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andScCustom4IsNotNull() {
            addCriterion("sc_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andScCustom4EqualTo(String value) {
            addCriterion("sc_custom4 =", value, "scCustom4");
            return (Criteria) this;
        }

        public Criteria andScCustom4NotEqualTo(String value) {
            addCriterion("sc_custom4 <>", value, "scCustom4");
            return (Criteria) this;
        }

        public Criteria andScCustom4GreaterThan(String value) {
            addCriterion("sc_custom4 >", value, "scCustom4");
            return (Criteria) this;
        }

        public Criteria andScCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("sc_custom4 >=", value, "scCustom4");
            return (Criteria) this;
        }

        public Criteria andScCustom4LessThan(String value) {
            addCriterion("sc_custom4 <", value, "scCustom4");
            return (Criteria) this;
        }

        public Criteria andScCustom4LessThanOrEqualTo(String value) {
            addCriterion("sc_custom4 <=", value, "scCustom4");
            return (Criteria) this;
        }

        public Criteria andScCustom4Like(String value) {
            addCriterion("sc_custom4 like", value, "scCustom4");
            return (Criteria) this;
        }

        public Criteria andScCustom4NotLike(String value) {
            addCriterion("sc_custom4 not like", value, "scCustom4");
            return (Criteria) this;
        }

        public Criteria andScCustom4In(List<String> values) {
            addCriterion("sc_custom4 in", values, "scCustom4");
            return (Criteria) this;
        }

        public Criteria andScCustom4NotIn(List<String> values) {
            addCriterion("sc_custom4 not in", values, "scCustom4");
            return (Criteria) this;
        }

        public Criteria andScCustom4Between(String value1, String value2) {
            addCriterion("sc_custom4 between", value1, value2, "scCustom4");
            return (Criteria) this;
        }

        public Criteria andScCustom4NotBetween(String value1, String value2) {
            addCriterion("sc_custom4 not between", value1, value2, "scCustom4");
            return (Criteria) this;
        }

        public Criteria andScCustom5IsNull() {
            addCriterion("sc_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andScCustom5IsNotNull() {
            addCriterion("sc_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andScCustom5EqualTo(String value) {
            addCriterion("sc_custom5 =", value, "scCustom5");
            return (Criteria) this;
        }

        public Criteria andScCustom5NotEqualTo(String value) {
            addCriterion("sc_custom5 <>", value, "scCustom5");
            return (Criteria) this;
        }

        public Criteria andScCustom5GreaterThan(String value) {
            addCriterion("sc_custom5 >", value, "scCustom5");
            return (Criteria) this;
        }

        public Criteria andScCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("sc_custom5 >=", value, "scCustom5");
            return (Criteria) this;
        }

        public Criteria andScCustom5LessThan(String value) {
            addCriterion("sc_custom5 <", value, "scCustom5");
            return (Criteria) this;
        }

        public Criteria andScCustom5LessThanOrEqualTo(String value) {
            addCriterion("sc_custom5 <=", value, "scCustom5");
            return (Criteria) this;
        }

        public Criteria andScCustom5Like(String value) {
            addCriterion("sc_custom5 like", value, "scCustom5");
            return (Criteria) this;
        }

        public Criteria andScCustom5NotLike(String value) {
            addCriterion("sc_custom5 not like", value, "scCustom5");
            return (Criteria) this;
        }

        public Criteria andScCustom5In(List<String> values) {
            addCriterion("sc_custom5 in", values, "scCustom5");
            return (Criteria) this;
        }

        public Criteria andScCustom5NotIn(List<String> values) {
            addCriterion("sc_custom5 not in", values, "scCustom5");
            return (Criteria) this;
        }

        public Criteria andScCustom5Between(String value1, String value2) {
            addCriterion("sc_custom5 between", value1, value2, "scCustom5");
            return (Criteria) this;
        }

        public Criteria andScCustom5NotBetween(String value1, String value2) {
            addCriterion("sc_custom5 not between", value1, value2, "scCustom5");
            return (Criteria) this;
        }

        public Criteria andScCustom6IsNull() {
            addCriterion("sc_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andScCustom6IsNotNull() {
            addCriterion("sc_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andScCustom6EqualTo(String value) {
            addCriterion("sc_custom6 =", value, "scCustom6");
            return (Criteria) this;
        }

        public Criteria andScCustom6NotEqualTo(String value) {
            addCriterion("sc_custom6 <>", value, "scCustom6");
            return (Criteria) this;
        }

        public Criteria andScCustom6GreaterThan(String value) {
            addCriterion("sc_custom6 >", value, "scCustom6");
            return (Criteria) this;
        }

        public Criteria andScCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("sc_custom6 >=", value, "scCustom6");
            return (Criteria) this;
        }

        public Criteria andScCustom6LessThan(String value) {
            addCriterion("sc_custom6 <", value, "scCustom6");
            return (Criteria) this;
        }

        public Criteria andScCustom6LessThanOrEqualTo(String value) {
            addCriterion("sc_custom6 <=", value, "scCustom6");
            return (Criteria) this;
        }

        public Criteria andScCustom6Like(String value) {
            addCriterion("sc_custom6 like", value, "scCustom6");
            return (Criteria) this;
        }

        public Criteria andScCustom6NotLike(String value) {
            addCriterion("sc_custom6 not like", value, "scCustom6");
            return (Criteria) this;
        }

        public Criteria andScCustom6In(List<String> values) {
            addCriterion("sc_custom6 in", values, "scCustom6");
            return (Criteria) this;
        }

        public Criteria andScCustom6NotIn(List<String> values) {
            addCriterion("sc_custom6 not in", values, "scCustom6");
            return (Criteria) this;
        }

        public Criteria andScCustom6Between(String value1, String value2) {
            addCriterion("sc_custom6 between", value1, value2, "scCustom6");
            return (Criteria) this;
        }

        public Criteria andScCustom6NotBetween(String value1, String value2) {
            addCriterion("sc_custom6 not between", value1, value2, "scCustom6");
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