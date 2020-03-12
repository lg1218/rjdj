package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class MoneybelongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoneybelongExample() {
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

        public Criteria andMoneybelongIdIsNull() {
            addCriterion("moneybelong_id is null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongIdIsNotNull() {
            addCriterion("moneybelong_id is not null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongIdEqualTo(String value) {
            addCriterion("moneybelong_id =", value, "moneybelongId");
            return (Criteria) this;
        }

        public Criteria andMoneybelongIdNotEqualTo(String value) {
            addCriterion("moneybelong_id <>", value, "moneybelongId");
            return (Criteria) this;
        }

        public Criteria andMoneybelongIdGreaterThan(String value) {
            addCriterion("moneybelong_id >", value, "moneybelongId");
            return (Criteria) this;
        }

        public Criteria andMoneybelongIdGreaterThanOrEqualTo(String value) {
            addCriterion("moneybelong_id >=", value, "moneybelongId");
            return (Criteria) this;
        }

        public Criteria andMoneybelongIdLessThan(String value) {
            addCriterion("moneybelong_id <", value, "moneybelongId");
            return (Criteria) this;
        }

        public Criteria andMoneybelongIdLessThanOrEqualTo(String value) {
            addCriterion("moneybelong_id <=", value, "moneybelongId");
            return (Criteria) this;
        }

        public Criteria andMoneybelongIdLike(String value) {
            addCriterion("moneybelong_id like", value, "moneybelongId");
            return (Criteria) this;
        }

        public Criteria andMoneybelongIdNotLike(String value) {
            addCriterion("moneybelong_id not like", value, "moneybelongId");
            return (Criteria) this;
        }

        public Criteria andMoneybelongIdIn(List<String> values) {
            addCriterion("moneybelong_id in", values, "moneybelongId");
            return (Criteria) this;
        }

        public Criteria andMoneybelongIdNotIn(List<String> values) {
            addCriterion("moneybelong_id not in", values, "moneybelongId");
            return (Criteria) this;
        }

        public Criteria andMoneybelongIdBetween(String value1, String value2) {
            addCriterion("moneybelong_id between", value1, value2, "moneybelongId");
            return (Criteria) this;
        }

        public Criteria andMoneybelongIdNotBetween(String value1, String value2) {
            addCriterion("moneybelong_id not between", value1, value2, "moneybelongId");
            return (Criteria) this;
        }

        public Criteria andMoneybelongNameIsNull() {
            addCriterion("moneybelong_name is null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongNameIsNotNull() {
            addCriterion("moneybelong_name is not null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongNameEqualTo(String value) {
            addCriterion("moneybelong_name =", value, "moneybelongName");
            return (Criteria) this;
        }

        public Criteria andMoneybelongNameNotEqualTo(String value) {
            addCriterion("moneybelong_name <>", value, "moneybelongName");
            return (Criteria) this;
        }

        public Criteria andMoneybelongNameGreaterThan(String value) {
            addCriterion("moneybelong_name >", value, "moneybelongName");
            return (Criteria) this;
        }

        public Criteria andMoneybelongNameGreaterThanOrEqualTo(String value) {
            addCriterion("moneybelong_name >=", value, "moneybelongName");
            return (Criteria) this;
        }

        public Criteria andMoneybelongNameLessThan(String value) {
            addCriterion("moneybelong_name <", value, "moneybelongName");
            return (Criteria) this;
        }

        public Criteria andMoneybelongNameLessThanOrEqualTo(String value) {
            addCriterion("moneybelong_name <=", value, "moneybelongName");
            return (Criteria) this;
        }

        public Criteria andMoneybelongNameLike(String value) {
            addCriterion("moneybelong_name like", value, "moneybelongName");
            return (Criteria) this;
        }

        public Criteria andMoneybelongNameNotLike(String value) {
            addCriterion("moneybelong_name not like", value, "moneybelongName");
            return (Criteria) this;
        }

        public Criteria andMoneybelongNameIn(List<String> values) {
            addCriterion("moneybelong_name in", values, "moneybelongName");
            return (Criteria) this;
        }

        public Criteria andMoneybelongNameNotIn(List<String> values) {
            addCriterion("moneybelong_name not in", values, "moneybelongName");
            return (Criteria) this;
        }

        public Criteria andMoneybelongNameBetween(String value1, String value2) {
            addCriterion("moneybelong_name between", value1, value2, "moneybelongName");
            return (Criteria) this;
        }

        public Criteria andMoneybelongNameNotBetween(String value1, String value2) {
            addCriterion("moneybelong_name not between", value1, value2, "moneybelongName");
            return (Criteria) this;
        }

        public Criteria andMoneybelongTypeIsNull() {
            addCriterion("moneybelong_type is null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongTypeIsNotNull() {
            addCriterion("moneybelong_type is not null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongTypeEqualTo(String value) {
            addCriterion("moneybelong_type =", value, "moneybelongType");
            return (Criteria) this;
        }

        public Criteria andMoneybelongTypeNotEqualTo(String value) {
            addCriterion("moneybelong_type <>", value, "moneybelongType");
            return (Criteria) this;
        }

        public Criteria andMoneybelongTypeGreaterThan(String value) {
            addCriterion("moneybelong_type >", value, "moneybelongType");
            return (Criteria) this;
        }

        public Criteria andMoneybelongTypeGreaterThanOrEqualTo(String value) {
            addCriterion("moneybelong_type >=", value, "moneybelongType");
            return (Criteria) this;
        }

        public Criteria andMoneybelongTypeLessThan(String value) {
            addCriterion("moneybelong_type <", value, "moneybelongType");
            return (Criteria) this;
        }

        public Criteria andMoneybelongTypeLessThanOrEqualTo(String value) {
            addCriterion("moneybelong_type <=", value, "moneybelongType");
            return (Criteria) this;
        }

        public Criteria andMoneybelongTypeLike(String value) {
            addCriterion("moneybelong_type like", value, "moneybelongType");
            return (Criteria) this;
        }

        public Criteria andMoneybelongTypeNotLike(String value) {
            addCriterion("moneybelong_type not like", value, "moneybelongType");
            return (Criteria) this;
        }

        public Criteria andMoneybelongTypeIn(List<String> values) {
            addCriterion("moneybelong_type in", values, "moneybelongType");
            return (Criteria) this;
        }

        public Criteria andMoneybelongTypeNotIn(List<String> values) {
            addCriterion("moneybelong_type not in", values, "moneybelongType");
            return (Criteria) this;
        }

        public Criteria andMoneybelongTypeBetween(String value1, String value2) {
            addCriterion("moneybelong_type between", value1, value2, "moneybelongType");
            return (Criteria) this;
        }

        public Criteria andMoneybelongTypeNotBetween(String value1, String value2) {
            addCriterion("moneybelong_type not between", value1, value2, "moneybelongType");
            return (Criteria) this;
        }

        public Criteria andMoneybelongRemarksIsNull() {
            addCriterion("moneybelong_remarks is null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongRemarksIsNotNull() {
            addCriterion("moneybelong_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongRemarksEqualTo(String value) {
            addCriterion("moneybelong_remarks =", value, "moneybelongRemarks");
            return (Criteria) this;
        }

        public Criteria andMoneybelongRemarksNotEqualTo(String value) {
            addCriterion("moneybelong_remarks <>", value, "moneybelongRemarks");
            return (Criteria) this;
        }

        public Criteria andMoneybelongRemarksGreaterThan(String value) {
            addCriterion("moneybelong_remarks >", value, "moneybelongRemarks");
            return (Criteria) this;
        }

        public Criteria andMoneybelongRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("moneybelong_remarks >=", value, "moneybelongRemarks");
            return (Criteria) this;
        }

        public Criteria andMoneybelongRemarksLessThan(String value) {
            addCriterion("moneybelong_remarks <", value, "moneybelongRemarks");
            return (Criteria) this;
        }

        public Criteria andMoneybelongRemarksLessThanOrEqualTo(String value) {
            addCriterion("moneybelong_remarks <=", value, "moneybelongRemarks");
            return (Criteria) this;
        }

        public Criteria andMoneybelongRemarksLike(String value) {
            addCriterion("moneybelong_remarks like", value, "moneybelongRemarks");
            return (Criteria) this;
        }

        public Criteria andMoneybelongRemarksNotLike(String value) {
            addCriterion("moneybelong_remarks not like", value, "moneybelongRemarks");
            return (Criteria) this;
        }

        public Criteria andMoneybelongRemarksIn(List<String> values) {
            addCriterion("moneybelong_remarks in", values, "moneybelongRemarks");
            return (Criteria) this;
        }

        public Criteria andMoneybelongRemarksNotIn(List<String> values) {
            addCriterion("moneybelong_remarks not in", values, "moneybelongRemarks");
            return (Criteria) this;
        }

        public Criteria andMoneybelongRemarksBetween(String value1, String value2) {
            addCriterion("moneybelong_remarks between", value1, value2, "moneybelongRemarks");
            return (Criteria) this;
        }

        public Criteria andMoneybelongRemarksNotBetween(String value1, String value2) {
            addCriterion("moneybelong_remarks not between", value1, value2, "moneybelongRemarks");
            return (Criteria) this;
        }

        public Criteria andMoneybelongAuditingIsNull() {
            addCriterion("moneybelong_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongAuditingIsNotNull() {
            addCriterion("moneybelong_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongAuditingEqualTo(String value) {
            addCriterion("moneybelong_Auditing =", value, "moneybelongAuditing");
            return (Criteria) this;
        }

        public Criteria andMoneybelongAuditingNotEqualTo(String value) {
            addCriterion("moneybelong_Auditing <>", value, "moneybelongAuditing");
            return (Criteria) this;
        }

        public Criteria andMoneybelongAuditingGreaterThan(String value) {
            addCriterion("moneybelong_Auditing >", value, "moneybelongAuditing");
            return (Criteria) this;
        }

        public Criteria andMoneybelongAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("moneybelong_Auditing >=", value, "moneybelongAuditing");
            return (Criteria) this;
        }

        public Criteria andMoneybelongAuditingLessThan(String value) {
            addCriterion("moneybelong_Auditing <", value, "moneybelongAuditing");
            return (Criteria) this;
        }

        public Criteria andMoneybelongAuditingLessThanOrEqualTo(String value) {
            addCriterion("moneybelong_Auditing <=", value, "moneybelongAuditing");
            return (Criteria) this;
        }

        public Criteria andMoneybelongAuditingLike(String value) {
            addCriterion("moneybelong_Auditing like", value, "moneybelongAuditing");
            return (Criteria) this;
        }

        public Criteria andMoneybelongAuditingNotLike(String value) {
            addCriterion("moneybelong_Auditing not like", value, "moneybelongAuditing");
            return (Criteria) this;
        }

        public Criteria andMoneybelongAuditingIn(List<String> values) {
            addCriterion("moneybelong_Auditing in", values, "moneybelongAuditing");
            return (Criteria) this;
        }

        public Criteria andMoneybelongAuditingNotIn(List<String> values) {
            addCriterion("moneybelong_Auditing not in", values, "moneybelongAuditing");
            return (Criteria) this;
        }

        public Criteria andMoneybelongAuditingBetween(String value1, String value2) {
            addCriterion("moneybelong_Auditing between", value1, value2, "moneybelongAuditing");
            return (Criteria) this;
        }

        public Criteria andMoneybelongAuditingNotBetween(String value1, String value2) {
            addCriterion("moneybelong_Auditing not between", value1, value2, "moneybelongAuditing");
            return (Criteria) this;
        }

        public Criteria andMoneybelongYnIsNull() {
            addCriterion("moneybelong_yn is null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongYnIsNotNull() {
            addCriterion("moneybelong_yn is not null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongYnEqualTo(String value) {
            addCriterion("moneybelong_yn =", value, "moneybelongYn");
            return (Criteria) this;
        }

        public Criteria andMoneybelongYnNotEqualTo(String value) {
            addCriterion("moneybelong_yn <>", value, "moneybelongYn");
            return (Criteria) this;
        }

        public Criteria andMoneybelongYnGreaterThan(String value) {
            addCriterion("moneybelong_yn >", value, "moneybelongYn");
            return (Criteria) this;
        }

        public Criteria andMoneybelongYnGreaterThanOrEqualTo(String value) {
            addCriterion("moneybelong_yn >=", value, "moneybelongYn");
            return (Criteria) this;
        }

        public Criteria andMoneybelongYnLessThan(String value) {
            addCriterion("moneybelong_yn <", value, "moneybelongYn");
            return (Criteria) this;
        }

        public Criteria andMoneybelongYnLessThanOrEqualTo(String value) {
            addCriterion("moneybelong_yn <=", value, "moneybelongYn");
            return (Criteria) this;
        }

        public Criteria andMoneybelongYnLike(String value) {
            addCriterion("moneybelong_yn like", value, "moneybelongYn");
            return (Criteria) this;
        }

        public Criteria andMoneybelongYnNotLike(String value) {
            addCriterion("moneybelong_yn not like", value, "moneybelongYn");
            return (Criteria) this;
        }

        public Criteria andMoneybelongYnIn(List<String> values) {
            addCriterion("moneybelong_yn in", values, "moneybelongYn");
            return (Criteria) this;
        }

        public Criteria andMoneybelongYnNotIn(List<String> values) {
            addCriterion("moneybelong_yn not in", values, "moneybelongYn");
            return (Criteria) this;
        }

        public Criteria andMoneybelongYnBetween(String value1, String value2) {
            addCriterion("moneybelong_yn between", value1, value2, "moneybelongYn");
            return (Criteria) this;
        }

        public Criteria andMoneybelongYnNotBetween(String value1, String value2) {
            addCriterion("moneybelong_yn not between", value1, value2, "moneybelongYn");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom1IsNull() {
            addCriterion("moneybelong_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom1IsNotNull() {
            addCriterion("moneybelong_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom1EqualTo(String value) {
            addCriterion("moneybelong_custom1 =", value, "moneybelongCustom1");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom1NotEqualTo(String value) {
            addCriterion("moneybelong_custom1 <>", value, "moneybelongCustom1");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom1GreaterThan(String value) {
            addCriterion("moneybelong_custom1 >", value, "moneybelongCustom1");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("moneybelong_custom1 >=", value, "moneybelongCustom1");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom1LessThan(String value) {
            addCriterion("moneybelong_custom1 <", value, "moneybelongCustom1");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom1LessThanOrEqualTo(String value) {
            addCriterion("moneybelong_custom1 <=", value, "moneybelongCustom1");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom1Like(String value) {
            addCriterion("moneybelong_custom1 like", value, "moneybelongCustom1");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom1NotLike(String value) {
            addCriterion("moneybelong_custom1 not like", value, "moneybelongCustom1");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom1In(List<String> values) {
            addCriterion("moneybelong_custom1 in", values, "moneybelongCustom1");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom1NotIn(List<String> values) {
            addCriterion("moneybelong_custom1 not in", values, "moneybelongCustom1");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom1Between(String value1, String value2) {
            addCriterion("moneybelong_custom1 between", value1, value2, "moneybelongCustom1");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom1NotBetween(String value1, String value2) {
            addCriterion("moneybelong_custom1 not between", value1, value2, "moneybelongCustom1");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom2IsNull() {
            addCriterion("moneybelong_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom2IsNotNull() {
            addCriterion("moneybelong_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom2EqualTo(String value) {
            addCriterion("moneybelong_custom2 =", value, "moneybelongCustom2");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom2NotEqualTo(String value) {
            addCriterion("moneybelong_custom2 <>", value, "moneybelongCustom2");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom2GreaterThan(String value) {
            addCriterion("moneybelong_custom2 >", value, "moneybelongCustom2");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("moneybelong_custom2 >=", value, "moneybelongCustom2");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom2LessThan(String value) {
            addCriterion("moneybelong_custom2 <", value, "moneybelongCustom2");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom2LessThanOrEqualTo(String value) {
            addCriterion("moneybelong_custom2 <=", value, "moneybelongCustom2");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom2Like(String value) {
            addCriterion("moneybelong_custom2 like", value, "moneybelongCustom2");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom2NotLike(String value) {
            addCriterion("moneybelong_custom2 not like", value, "moneybelongCustom2");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom2In(List<String> values) {
            addCriterion("moneybelong_custom2 in", values, "moneybelongCustom2");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom2NotIn(List<String> values) {
            addCriterion("moneybelong_custom2 not in", values, "moneybelongCustom2");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom2Between(String value1, String value2) {
            addCriterion("moneybelong_custom2 between", value1, value2, "moneybelongCustom2");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom2NotBetween(String value1, String value2) {
            addCriterion("moneybelong_custom2 not between", value1, value2, "moneybelongCustom2");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom3IsNull() {
            addCriterion("moneybelong_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom3IsNotNull() {
            addCriterion("moneybelong_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom3EqualTo(String value) {
            addCriterion("moneybelong_custom3 =", value, "moneybelongCustom3");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom3NotEqualTo(String value) {
            addCriterion("moneybelong_custom3 <>", value, "moneybelongCustom3");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom3GreaterThan(String value) {
            addCriterion("moneybelong_custom3 >", value, "moneybelongCustom3");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("moneybelong_custom3 >=", value, "moneybelongCustom3");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom3LessThan(String value) {
            addCriterion("moneybelong_custom3 <", value, "moneybelongCustom3");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom3LessThanOrEqualTo(String value) {
            addCriterion("moneybelong_custom3 <=", value, "moneybelongCustom3");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom3Like(String value) {
            addCriterion("moneybelong_custom3 like", value, "moneybelongCustom3");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom3NotLike(String value) {
            addCriterion("moneybelong_custom3 not like", value, "moneybelongCustom3");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom3In(List<String> values) {
            addCriterion("moneybelong_custom3 in", values, "moneybelongCustom3");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom3NotIn(List<String> values) {
            addCriterion("moneybelong_custom3 not in", values, "moneybelongCustom3");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom3Between(String value1, String value2) {
            addCriterion("moneybelong_custom3 between", value1, value2, "moneybelongCustom3");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom3NotBetween(String value1, String value2) {
            addCriterion("moneybelong_custom3 not between", value1, value2, "moneybelongCustom3");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom4IsNull() {
            addCriterion("moneybelong_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom4IsNotNull() {
            addCriterion("moneybelong_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom4EqualTo(String value) {
            addCriterion("moneybelong_custom4 =", value, "moneybelongCustom4");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom4NotEqualTo(String value) {
            addCriterion("moneybelong_custom4 <>", value, "moneybelongCustom4");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom4GreaterThan(String value) {
            addCriterion("moneybelong_custom4 >", value, "moneybelongCustom4");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("moneybelong_custom4 >=", value, "moneybelongCustom4");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom4LessThan(String value) {
            addCriterion("moneybelong_custom4 <", value, "moneybelongCustom4");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom4LessThanOrEqualTo(String value) {
            addCriterion("moneybelong_custom4 <=", value, "moneybelongCustom4");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom4Like(String value) {
            addCriterion("moneybelong_custom4 like", value, "moneybelongCustom4");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom4NotLike(String value) {
            addCriterion("moneybelong_custom4 not like", value, "moneybelongCustom4");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom4In(List<String> values) {
            addCriterion("moneybelong_custom4 in", values, "moneybelongCustom4");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom4NotIn(List<String> values) {
            addCriterion("moneybelong_custom4 not in", values, "moneybelongCustom4");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom4Between(String value1, String value2) {
            addCriterion("moneybelong_custom4 between", value1, value2, "moneybelongCustom4");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom4NotBetween(String value1, String value2) {
            addCriterion("moneybelong_custom4 not between", value1, value2, "moneybelongCustom4");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom5IsNull() {
            addCriterion("moneybelong_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom5IsNotNull() {
            addCriterion("moneybelong_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom5EqualTo(String value) {
            addCriterion("moneybelong_custom5 =", value, "moneybelongCustom5");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom5NotEqualTo(String value) {
            addCriterion("moneybelong_custom5 <>", value, "moneybelongCustom5");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom5GreaterThan(String value) {
            addCriterion("moneybelong_custom5 >", value, "moneybelongCustom5");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("moneybelong_custom5 >=", value, "moneybelongCustom5");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom5LessThan(String value) {
            addCriterion("moneybelong_custom5 <", value, "moneybelongCustom5");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom5LessThanOrEqualTo(String value) {
            addCriterion("moneybelong_custom5 <=", value, "moneybelongCustom5");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom5Like(String value) {
            addCriterion("moneybelong_custom5 like", value, "moneybelongCustom5");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom5NotLike(String value) {
            addCriterion("moneybelong_custom5 not like", value, "moneybelongCustom5");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom5In(List<String> values) {
            addCriterion("moneybelong_custom5 in", values, "moneybelongCustom5");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom5NotIn(List<String> values) {
            addCriterion("moneybelong_custom5 not in", values, "moneybelongCustom5");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom5Between(String value1, String value2) {
            addCriterion("moneybelong_custom5 between", value1, value2, "moneybelongCustom5");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom5NotBetween(String value1, String value2) {
            addCriterion("moneybelong_custom5 not between", value1, value2, "moneybelongCustom5");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom6IsNull() {
            addCriterion("moneybelong_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom6IsNotNull() {
            addCriterion("moneybelong_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom6EqualTo(String value) {
            addCriterion("moneybelong_custom6 =", value, "moneybelongCustom6");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom6NotEqualTo(String value) {
            addCriterion("moneybelong_custom6 <>", value, "moneybelongCustom6");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom6GreaterThan(String value) {
            addCriterion("moneybelong_custom6 >", value, "moneybelongCustom6");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("moneybelong_custom6 >=", value, "moneybelongCustom6");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom6LessThan(String value) {
            addCriterion("moneybelong_custom6 <", value, "moneybelongCustom6");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom6LessThanOrEqualTo(String value) {
            addCriterion("moneybelong_custom6 <=", value, "moneybelongCustom6");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom6Like(String value) {
            addCriterion("moneybelong_custom6 like", value, "moneybelongCustom6");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom6NotLike(String value) {
            addCriterion("moneybelong_custom6 not like", value, "moneybelongCustom6");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom6In(List<String> values) {
            addCriterion("moneybelong_custom6 in", values, "moneybelongCustom6");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom6NotIn(List<String> values) {
            addCriterion("moneybelong_custom6 not in", values, "moneybelongCustom6");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom6Between(String value1, String value2) {
            addCriterion("moneybelong_custom6 between", value1, value2, "moneybelongCustom6");
            return (Criteria) this;
        }

        public Criteria andMoneybelongCustom6NotBetween(String value1, String value2) {
            addCriterion("moneybelong_custom6 not between", value1, value2, "moneybelongCustom6");
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