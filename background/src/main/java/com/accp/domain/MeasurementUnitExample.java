package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class MeasurementUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeasurementUnitExample() {
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

        public Criteria andMuIdIsNull() {
            addCriterion("mu_id is null");
            return (Criteria) this;
        }

        public Criteria andMuIdIsNotNull() {
            addCriterion("mu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMuIdEqualTo(String value) {
            addCriterion("mu_id =", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdNotEqualTo(String value) {
            addCriterion("mu_id <>", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdGreaterThan(String value) {
            addCriterion("mu_id >", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdGreaterThanOrEqualTo(String value) {
            addCriterion("mu_id >=", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdLessThan(String value) {
            addCriterion("mu_id <", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdLessThanOrEqualTo(String value) {
            addCriterion("mu_id <=", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdLike(String value) {
            addCriterion("mu_id like", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdNotLike(String value) {
            addCriterion("mu_id not like", value, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdIn(List<String> values) {
            addCriterion("mu_id in", values, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdNotIn(List<String> values) {
            addCriterion("mu_id not in", values, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdBetween(String value1, String value2) {
            addCriterion("mu_id between", value1, value2, "muId");
            return (Criteria) this;
        }

        public Criteria andMuIdNotBetween(String value1, String value2) {
            addCriterion("mu_id not between", value1, value2, "muId");
            return (Criteria) this;
        }

        public Criteria andMuNameIsNull() {
            addCriterion("mu_name is null");
            return (Criteria) this;
        }

        public Criteria andMuNameIsNotNull() {
            addCriterion("mu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMuNameEqualTo(String value) {
            addCriterion("mu_name =", value, "muName");
            return (Criteria) this;
        }

        public Criteria andMuNameNotEqualTo(String value) {
            addCriterion("mu_name <>", value, "muName");
            return (Criteria) this;
        }

        public Criteria andMuNameGreaterThan(String value) {
            addCriterion("mu_name >", value, "muName");
            return (Criteria) this;
        }

        public Criteria andMuNameGreaterThanOrEqualTo(String value) {
            addCriterion("mu_name >=", value, "muName");
            return (Criteria) this;
        }

        public Criteria andMuNameLessThan(String value) {
            addCriterion("mu_name <", value, "muName");
            return (Criteria) this;
        }

        public Criteria andMuNameLessThanOrEqualTo(String value) {
            addCriterion("mu_name <=", value, "muName");
            return (Criteria) this;
        }

        public Criteria andMuNameLike(String value) {
            addCriterion("mu_name like", value, "muName");
            return (Criteria) this;
        }

        public Criteria andMuNameNotLike(String value) {
            addCriterion("mu_name not like", value, "muName");
            return (Criteria) this;
        }

        public Criteria andMuNameIn(List<String> values) {
            addCriterion("mu_name in", values, "muName");
            return (Criteria) this;
        }

        public Criteria andMuNameNotIn(List<String> values) {
            addCriterion("mu_name not in", values, "muName");
            return (Criteria) this;
        }

        public Criteria andMuNameBetween(String value1, String value2) {
            addCriterion("mu_name between", value1, value2, "muName");
            return (Criteria) this;
        }

        public Criteria andMuNameNotBetween(String value1, String value2) {
            addCriterion("mu_name not between", value1, value2, "muName");
            return (Criteria) this;
        }

        public Criteria andMuEnglistNameIsNull() {
            addCriterion("mu_englist_name is null");
            return (Criteria) this;
        }

        public Criteria andMuEnglistNameIsNotNull() {
            addCriterion("mu_englist_name is not null");
            return (Criteria) this;
        }

        public Criteria andMuEnglistNameEqualTo(String value) {
            addCriterion("mu_englist_name =", value, "muEnglistName");
            return (Criteria) this;
        }

        public Criteria andMuEnglistNameNotEqualTo(String value) {
            addCriterion("mu_englist_name <>", value, "muEnglistName");
            return (Criteria) this;
        }

        public Criteria andMuEnglistNameGreaterThan(String value) {
            addCriterion("mu_englist_name >", value, "muEnglistName");
            return (Criteria) this;
        }

        public Criteria andMuEnglistNameGreaterThanOrEqualTo(String value) {
            addCriterion("mu_englist_name >=", value, "muEnglistName");
            return (Criteria) this;
        }

        public Criteria andMuEnglistNameLessThan(String value) {
            addCriterion("mu_englist_name <", value, "muEnglistName");
            return (Criteria) this;
        }

        public Criteria andMuEnglistNameLessThanOrEqualTo(String value) {
            addCriterion("mu_englist_name <=", value, "muEnglistName");
            return (Criteria) this;
        }

        public Criteria andMuEnglistNameLike(String value) {
            addCriterion("mu_englist_name like", value, "muEnglistName");
            return (Criteria) this;
        }

        public Criteria andMuEnglistNameNotLike(String value) {
            addCriterion("mu_englist_name not like", value, "muEnglistName");
            return (Criteria) this;
        }

        public Criteria andMuEnglistNameIn(List<String> values) {
            addCriterion("mu_englist_name in", values, "muEnglistName");
            return (Criteria) this;
        }

        public Criteria andMuEnglistNameNotIn(List<String> values) {
            addCriterion("mu_englist_name not in", values, "muEnglistName");
            return (Criteria) this;
        }

        public Criteria andMuEnglistNameBetween(String value1, String value2) {
            addCriterion("mu_englist_name between", value1, value2, "muEnglistName");
            return (Criteria) this;
        }

        public Criteria andMuEnglistNameNotBetween(String value1, String value2) {
            addCriterion("mu_englist_name not between", value1, value2, "muEnglistName");
            return (Criteria) this;
        }

        public Criteria andMuRemarkIsNull() {
            addCriterion("mu_remark is null");
            return (Criteria) this;
        }

        public Criteria andMuRemarkIsNotNull() {
            addCriterion("mu_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMuRemarkEqualTo(String value) {
            addCriterion("mu_remark =", value, "muRemark");
            return (Criteria) this;
        }

        public Criteria andMuRemarkNotEqualTo(String value) {
            addCriterion("mu_remark <>", value, "muRemark");
            return (Criteria) this;
        }

        public Criteria andMuRemarkGreaterThan(String value) {
            addCriterion("mu_remark >", value, "muRemark");
            return (Criteria) this;
        }

        public Criteria andMuRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("mu_remark >=", value, "muRemark");
            return (Criteria) this;
        }

        public Criteria andMuRemarkLessThan(String value) {
            addCriterion("mu_remark <", value, "muRemark");
            return (Criteria) this;
        }

        public Criteria andMuRemarkLessThanOrEqualTo(String value) {
            addCriterion("mu_remark <=", value, "muRemark");
            return (Criteria) this;
        }

        public Criteria andMuRemarkLike(String value) {
            addCriterion("mu_remark like", value, "muRemark");
            return (Criteria) this;
        }

        public Criteria andMuRemarkNotLike(String value) {
            addCriterion("mu_remark not like", value, "muRemark");
            return (Criteria) this;
        }

        public Criteria andMuRemarkIn(List<String> values) {
            addCriterion("mu_remark in", values, "muRemark");
            return (Criteria) this;
        }

        public Criteria andMuRemarkNotIn(List<String> values) {
            addCriterion("mu_remark not in", values, "muRemark");
            return (Criteria) this;
        }

        public Criteria andMuRemarkBetween(String value1, String value2) {
            addCriterion("mu_remark between", value1, value2, "muRemark");
            return (Criteria) this;
        }

        public Criteria andMuRemarkNotBetween(String value1, String value2) {
            addCriterion("mu_remark not between", value1, value2, "muRemark");
            return (Criteria) this;
        }

        public Criteria andMuAuditingIsNull() {
            addCriterion("mu_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andMuAuditingIsNotNull() {
            addCriterion("mu_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andMuAuditingEqualTo(String value) {
            addCriterion("mu_Auditing =", value, "muAuditing");
            return (Criteria) this;
        }

        public Criteria andMuAuditingNotEqualTo(String value) {
            addCriterion("mu_Auditing <>", value, "muAuditing");
            return (Criteria) this;
        }

        public Criteria andMuAuditingGreaterThan(String value) {
            addCriterion("mu_Auditing >", value, "muAuditing");
            return (Criteria) this;
        }

        public Criteria andMuAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("mu_Auditing >=", value, "muAuditing");
            return (Criteria) this;
        }

        public Criteria andMuAuditingLessThan(String value) {
            addCriterion("mu_Auditing <", value, "muAuditing");
            return (Criteria) this;
        }

        public Criteria andMuAuditingLessThanOrEqualTo(String value) {
            addCriterion("mu_Auditing <=", value, "muAuditing");
            return (Criteria) this;
        }

        public Criteria andMuAuditingLike(String value) {
            addCriterion("mu_Auditing like", value, "muAuditing");
            return (Criteria) this;
        }

        public Criteria andMuAuditingNotLike(String value) {
            addCriterion("mu_Auditing not like", value, "muAuditing");
            return (Criteria) this;
        }

        public Criteria andMuAuditingIn(List<String> values) {
            addCriterion("mu_Auditing in", values, "muAuditing");
            return (Criteria) this;
        }

        public Criteria andMuAuditingNotIn(List<String> values) {
            addCriterion("mu_Auditing not in", values, "muAuditing");
            return (Criteria) this;
        }

        public Criteria andMuAuditingBetween(String value1, String value2) {
            addCriterion("mu_Auditing between", value1, value2, "muAuditing");
            return (Criteria) this;
        }

        public Criteria andMuAuditingNotBetween(String value1, String value2) {
            addCriterion("mu_Auditing not between", value1, value2, "muAuditing");
            return (Criteria) this;
        }

        public Criteria andMuYnIsNull() {
            addCriterion("mu_yn is null");
            return (Criteria) this;
        }

        public Criteria andMuYnIsNotNull() {
            addCriterion("mu_yn is not null");
            return (Criteria) this;
        }

        public Criteria andMuYnEqualTo(String value) {
            addCriterion("mu_yn =", value, "muYn");
            return (Criteria) this;
        }

        public Criteria andMuYnNotEqualTo(String value) {
            addCriterion("mu_yn <>", value, "muYn");
            return (Criteria) this;
        }

        public Criteria andMuYnGreaterThan(String value) {
            addCriterion("mu_yn >", value, "muYn");
            return (Criteria) this;
        }

        public Criteria andMuYnGreaterThanOrEqualTo(String value) {
            addCriterion("mu_yn >=", value, "muYn");
            return (Criteria) this;
        }

        public Criteria andMuYnLessThan(String value) {
            addCriterion("mu_yn <", value, "muYn");
            return (Criteria) this;
        }

        public Criteria andMuYnLessThanOrEqualTo(String value) {
            addCriterion("mu_yn <=", value, "muYn");
            return (Criteria) this;
        }

        public Criteria andMuYnLike(String value) {
            addCriterion("mu_yn like", value, "muYn");
            return (Criteria) this;
        }

        public Criteria andMuYnNotLike(String value) {
            addCriterion("mu_yn not like", value, "muYn");
            return (Criteria) this;
        }

        public Criteria andMuYnIn(List<String> values) {
            addCriterion("mu_yn in", values, "muYn");
            return (Criteria) this;
        }

        public Criteria andMuYnNotIn(List<String> values) {
            addCriterion("mu_yn not in", values, "muYn");
            return (Criteria) this;
        }

        public Criteria andMuYnBetween(String value1, String value2) {
            addCriterion("mu_yn between", value1, value2, "muYn");
            return (Criteria) this;
        }

        public Criteria andMuYnNotBetween(String value1, String value2) {
            addCriterion("mu_yn not between", value1, value2, "muYn");
            return (Criteria) this;
        }

        public Criteria andMuCustom1IsNull() {
            addCriterion("mu_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andMuCustom1IsNotNull() {
            addCriterion("mu_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andMuCustom1EqualTo(String value) {
            addCriterion("mu_custom1 =", value, "muCustom1");
            return (Criteria) this;
        }

        public Criteria andMuCustom1NotEqualTo(String value) {
            addCriterion("mu_custom1 <>", value, "muCustom1");
            return (Criteria) this;
        }

        public Criteria andMuCustom1GreaterThan(String value) {
            addCriterion("mu_custom1 >", value, "muCustom1");
            return (Criteria) this;
        }

        public Criteria andMuCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("mu_custom1 >=", value, "muCustom1");
            return (Criteria) this;
        }

        public Criteria andMuCustom1LessThan(String value) {
            addCriterion("mu_custom1 <", value, "muCustom1");
            return (Criteria) this;
        }

        public Criteria andMuCustom1LessThanOrEqualTo(String value) {
            addCriterion("mu_custom1 <=", value, "muCustom1");
            return (Criteria) this;
        }

        public Criteria andMuCustom1Like(String value) {
            addCriterion("mu_custom1 like", value, "muCustom1");
            return (Criteria) this;
        }

        public Criteria andMuCustom1NotLike(String value) {
            addCriterion("mu_custom1 not like", value, "muCustom1");
            return (Criteria) this;
        }

        public Criteria andMuCustom1In(List<String> values) {
            addCriterion("mu_custom1 in", values, "muCustom1");
            return (Criteria) this;
        }

        public Criteria andMuCustom1NotIn(List<String> values) {
            addCriterion("mu_custom1 not in", values, "muCustom1");
            return (Criteria) this;
        }

        public Criteria andMuCustom1Between(String value1, String value2) {
            addCriterion("mu_custom1 between", value1, value2, "muCustom1");
            return (Criteria) this;
        }

        public Criteria andMuCustom1NotBetween(String value1, String value2) {
            addCriterion("mu_custom1 not between", value1, value2, "muCustom1");
            return (Criteria) this;
        }

        public Criteria andMuCustom2IsNull() {
            addCriterion("mu_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andMuCustom2IsNotNull() {
            addCriterion("mu_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andMuCustom2EqualTo(String value) {
            addCriterion("mu_custom2 =", value, "muCustom2");
            return (Criteria) this;
        }

        public Criteria andMuCustom2NotEqualTo(String value) {
            addCriterion("mu_custom2 <>", value, "muCustom2");
            return (Criteria) this;
        }

        public Criteria andMuCustom2GreaterThan(String value) {
            addCriterion("mu_custom2 >", value, "muCustom2");
            return (Criteria) this;
        }

        public Criteria andMuCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("mu_custom2 >=", value, "muCustom2");
            return (Criteria) this;
        }

        public Criteria andMuCustom2LessThan(String value) {
            addCriterion("mu_custom2 <", value, "muCustom2");
            return (Criteria) this;
        }

        public Criteria andMuCustom2LessThanOrEqualTo(String value) {
            addCriterion("mu_custom2 <=", value, "muCustom2");
            return (Criteria) this;
        }

        public Criteria andMuCustom2Like(String value) {
            addCriterion("mu_custom2 like", value, "muCustom2");
            return (Criteria) this;
        }

        public Criteria andMuCustom2NotLike(String value) {
            addCriterion("mu_custom2 not like", value, "muCustom2");
            return (Criteria) this;
        }

        public Criteria andMuCustom2In(List<String> values) {
            addCriterion("mu_custom2 in", values, "muCustom2");
            return (Criteria) this;
        }

        public Criteria andMuCustom2NotIn(List<String> values) {
            addCriterion("mu_custom2 not in", values, "muCustom2");
            return (Criteria) this;
        }

        public Criteria andMuCustom2Between(String value1, String value2) {
            addCriterion("mu_custom2 between", value1, value2, "muCustom2");
            return (Criteria) this;
        }

        public Criteria andMuCustom2NotBetween(String value1, String value2) {
            addCriterion("mu_custom2 not between", value1, value2, "muCustom2");
            return (Criteria) this;
        }

        public Criteria andMuCustom3IsNull() {
            addCriterion("mu_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andMuCustom3IsNotNull() {
            addCriterion("mu_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andMuCustom3EqualTo(String value) {
            addCriterion("mu_custom3 =", value, "muCustom3");
            return (Criteria) this;
        }

        public Criteria andMuCustom3NotEqualTo(String value) {
            addCriterion("mu_custom3 <>", value, "muCustom3");
            return (Criteria) this;
        }

        public Criteria andMuCustom3GreaterThan(String value) {
            addCriterion("mu_custom3 >", value, "muCustom3");
            return (Criteria) this;
        }

        public Criteria andMuCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("mu_custom3 >=", value, "muCustom3");
            return (Criteria) this;
        }

        public Criteria andMuCustom3LessThan(String value) {
            addCriterion("mu_custom3 <", value, "muCustom3");
            return (Criteria) this;
        }

        public Criteria andMuCustom3LessThanOrEqualTo(String value) {
            addCriterion("mu_custom3 <=", value, "muCustom3");
            return (Criteria) this;
        }

        public Criteria andMuCustom3Like(String value) {
            addCriterion("mu_custom3 like", value, "muCustom3");
            return (Criteria) this;
        }

        public Criteria andMuCustom3NotLike(String value) {
            addCriterion("mu_custom3 not like", value, "muCustom3");
            return (Criteria) this;
        }

        public Criteria andMuCustom3In(List<String> values) {
            addCriterion("mu_custom3 in", values, "muCustom3");
            return (Criteria) this;
        }

        public Criteria andMuCustom3NotIn(List<String> values) {
            addCriterion("mu_custom3 not in", values, "muCustom3");
            return (Criteria) this;
        }

        public Criteria andMuCustom3Between(String value1, String value2) {
            addCriterion("mu_custom3 between", value1, value2, "muCustom3");
            return (Criteria) this;
        }

        public Criteria andMuCustom3NotBetween(String value1, String value2) {
            addCriterion("mu_custom3 not between", value1, value2, "muCustom3");
            return (Criteria) this;
        }

        public Criteria andMuCustom4IsNull() {
            addCriterion("mu_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andMuCustom4IsNotNull() {
            addCriterion("mu_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andMuCustom4EqualTo(String value) {
            addCriterion("mu_custom4 =", value, "muCustom4");
            return (Criteria) this;
        }

        public Criteria andMuCustom4NotEqualTo(String value) {
            addCriterion("mu_custom4 <>", value, "muCustom4");
            return (Criteria) this;
        }

        public Criteria andMuCustom4GreaterThan(String value) {
            addCriterion("mu_custom4 >", value, "muCustom4");
            return (Criteria) this;
        }

        public Criteria andMuCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("mu_custom4 >=", value, "muCustom4");
            return (Criteria) this;
        }

        public Criteria andMuCustom4LessThan(String value) {
            addCriterion("mu_custom4 <", value, "muCustom4");
            return (Criteria) this;
        }

        public Criteria andMuCustom4LessThanOrEqualTo(String value) {
            addCriterion("mu_custom4 <=", value, "muCustom4");
            return (Criteria) this;
        }

        public Criteria andMuCustom4Like(String value) {
            addCriterion("mu_custom4 like", value, "muCustom4");
            return (Criteria) this;
        }

        public Criteria andMuCustom4NotLike(String value) {
            addCriterion("mu_custom4 not like", value, "muCustom4");
            return (Criteria) this;
        }

        public Criteria andMuCustom4In(List<String> values) {
            addCriterion("mu_custom4 in", values, "muCustom4");
            return (Criteria) this;
        }

        public Criteria andMuCustom4NotIn(List<String> values) {
            addCriterion("mu_custom4 not in", values, "muCustom4");
            return (Criteria) this;
        }

        public Criteria andMuCustom4Between(String value1, String value2) {
            addCriterion("mu_custom4 between", value1, value2, "muCustom4");
            return (Criteria) this;
        }

        public Criteria andMuCustom4NotBetween(String value1, String value2) {
            addCriterion("mu_custom4 not between", value1, value2, "muCustom4");
            return (Criteria) this;
        }

        public Criteria andMuCustom5IsNull() {
            addCriterion("mu_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andMuCustom5IsNotNull() {
            addCriterion("mu_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andMuCustom5EqualTo(String value) {
            addCriterion("mu_custom5 =", value, "muCustom5");
            return (Criteria) this;
        }

        public Criteria andMuCustom5NotEqualTo(String value) {
            addCriterion("mu_custom5 <>", value, "muCustom5");
            return (Criteria) this;
        }

        public Criteria andMuCustom5GreaterThan(String value) {
            addCriterion("mu_custom5 >", value, "muCustom5");
            return (Criteria) this;
        }

        public Criteria andMuCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("mu_custom5 >=", value, "muCustom5");
            return (Criteria) this;
        }

        public Criteria andMuCustom5LessThan(String value) {
            addCriterion("mu_custom5 <", value, "muCustom5");
            return (Criteria) this;
        }

        public Criteria andMuCustom5LessThanOrEqualTo(String value) {
            addCriterion("mu_custom5 <=", value, "muCustom5");
            return (Criteria) this;
        }

        public Criteria andMuCustom5Like(String value) {
            addCriterion("mu_custom5 like", value, "muCustom5");
            return (Criteria) this;
        }

        public Criteria andMuCustom5NotLike(String value) {
            addCriterion("mu_custom5 not like", value, "muCustom5");
            return (Criteria) this;
        }

        public Criteria andMuCustom5In(List<String> values) {
            addCriterion("mu_custom5 in", values, "muCustom5");
            return (Criteria) this;
        }

        public Criteria andMuCustom5NotIn(List<String> values) {
            addCriterion("mu_custom5 not in", values, "muCustom5");
            return (Criteria) this;
        }

        public Criteria andMuCustom5Between(String value1, String value2) {
            addCriterion("mu_custom5 between", value1, value2, "muCustom5");
            return (Criteria) this;
        }

        public Criteria andMuCustom5NotBetween(String value1, String value2) {
            addCriterion("mu_custom5 not between", value1, value2, "muCustom5");
            return (Criteria) this;
        }

        public Criteria andMuCustom6IsNull() {
            addCriterion("mu_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andMuCustom6IsNotNull() {
            addCriterion("mu_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andMuCustom6EqualTo(String value) {
            addCriterion("mu_custom6 =", value, "muCustom6");
            return (Criteria) this;
        }

        public Criteria andMuCustom6NotEqualTo(String value) {
            addCriterion("mu_custom6 <>", value, "muCustom6");
            return (Criteria) this;
        }

        public Criteria andMuCustom6GreaterThan(String value) {
            addCriterion("mu_custom6 >", value, "muCustom6");
            return (Criteria) this;
        }

        public Criteria andMuCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("mu_custom6 >=", value, "muCustom6");
            return (Criteria) this;
        }

        public Criteria andMuCustom6LessThan(String value) {
            addCriterion("mu_custom6 <", value, "muCustom6");
            return (Criteria) this;
        }

        public Criteria andMuCustom6LessThanOrEqualTo(String value) {
            addCriterion("mu_custom6 <=", value, "muCustom6");
            return (Criteria) this;
        }

        public Criteria andMuCustom6Like(String value) {
            addCriterion("mu_custom6 like", value, "muCustom6");
            return (Criteria) this;
        }

        public Criteria andMuCustom6NotLike(String value) {
            addCriterion("mu_custom6 not like", value, "muCustom6");
            return (Criteria) this;
        }

        public Criteria andMuCustom6In(List<String> values) {
            addCriterion("mu_custom6 in", values, "muCustom6");
            return (Criteria) this;
        }

        public Criteria andMuCustom6NotIn(List<String> values) {
            addCriterion("mu_custom6 not in", values, "muCustom6");
            return (Criteria) this;
        }

        public Criteria andMuCustom6Between(String value1, String value2) {
            addCriterion("mu_custom6 between", value1, value2, "muCustom6");
            return (Criteria) this;
        }

        public Criteria andMuCustom6NotBetween(String value1, String value2) {
            addCriterion("mu_custom6 not between", value1, value2, "muCustom6");
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