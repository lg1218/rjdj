package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CollectionTermExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionTermExample() {
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

        public Criteria andCoteIdIsNull() {
            addCriterion("cote_id is null");
            return (Criteria) this;
        }

        public Criteria andCoteIdIsNotNull() {
            addCriterion("cote_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoteIdEqualTo(String value) {
            addCriterion("cote_id =", value, "coteId");
            return (Criteria) this;
        }

        public Criteria andCoteIdNotEqualTo(String value) {
            addCriterion("cote_id <>", value, "coteId");
            return (Criteria) this;
        }

        public Criteria andCoteIdGreaterThan(String value) {
            addCriterion("cote_id >", value, "coteId");
            return (Criteria) this;
        }

        public Criteria andCoteIdGreaterThanOrEqualTo(String value) {
            addCriterion("cote_id >=", value, "coteId");
            return (Criteria) this;
        }

        public Criteria andCoteIdLessThan(String value) {
            addCriterion("cote_id <", value, "coteId");
            return (Criteria) this;
        }

        public Criteria andCoteIdLessThanOrEqualTo(String value) {
            addCriterion("cote_id <=", value, "coteId");
            return (Criteria) this;
        }

        public Criteria andCoteIdLike(String value) {
            addCriterion("cote_id like", value, "coteId");
            return (Criteria) this;
        }

        public Criteria andCoteIdNotLike(String value) {
            addCriterion("cote_id not like", value, "coteId");
            return (Criteria) this;
        }

        public Criteria andCoteIdIn(List<String> values) {
            addCriterion("cote_id in", values, "coteId");
            return (Criteria) this;
        }

        public Criteria andCoteIdNotIn(List<String> values) {
            addCriterion("cote_id not in", values, "coteId");
            return (Criteria) this;
        }

        public Criteria andCoteIdBetween(String value1, String value2) {
            addCriterion("cote_id between", value1, value2, "coteId");
            return (Criteria) this;
        }

        public Criteria andCoteIdNotBetween(String value1, String value2) {
            addCriterion("cote_id not between", value1, value2, "coteId");
            return (Criteria) this;
        }

        public Criteria andCoteNameIsNull() {
            addCriterion("cote_name is null");
            return (Criteria) this;
        }

        public Criteria andCoteNameIsNotNull() {
            addCriterion("cote_name is not null");
            return (Criteria) this;
        }

        public Criteria andCoteNameEqualTo(String value) {
            addCriterion("cote_name =", value, "coteName");
            return (Criteria) this;
        }

        public Criteria andCoteNameNotEqualTo(String value) {
            addCriterion("cote_name <>", value, "coteName");
            return (Criteria) this;
        }

        public Criteria andCoteNameGreaterThan(String value) {
            addCriterion("cote_name >", value, "coteName");
            return (Criteria) this;
        }

        public Criteria andCoteNameGreaterThanOrEqualTo(String value) {
            addCriterion("cote_name >=", value, "coteName");
            return (Criteria) this;
        }

        public Criteria andCoteNameLessThan(String value) {
            addCriterion("cote_name <", value, "coteName");
            return (Criteria) this;
        }

        public Criteria andCoteNameLessThanOrEqualTo(String value) {
            addCriterion("cote_name <=", value, "coteName");
            return (Criteria) this;
        }

        public Criteria andCoteNameLike(String value) {
            addCriterion("cote_name like", value, "coteName");
            return (Criteria) this;
        }

        public Criteria andCoteNameNotLike(String value) {
            addCriterion("cote_name not like", value, "coteName");
            return (Criteria) this;
        }

        public Criteria andCoteNameIn(List<String> values) {
            addCriterion("cote_name in", values, "coteName");
            return (Criteria) this;
        }

        public Criteria andCoteNameNotIn(List<String> values) {
            addCriterion("cote_name not in", values, "coteName");
            return (Criteria) this;
        }

        public Criteria andCoteNameBetween(String value1, String value2) {
            addCriterion("cote_name between", value1, value2, "coteName");
            return (Criteria) this;
        }

        public Criteria andCoteNameNotBetween(String value1, String value2) {
            addCriterion("cote_name not between", value1, value2, "coteName");
            return (Criteria) this;
        }

        public Criteria andCoteDaysIsNull() {
            addCriterion("cote_days is null");
            return (Criteria) this;
        }

        public Criteria andCoteDaysIsNotNull() {
            addCriterion("cote_days is not null");
            return (Criteria) this;
        }

        public Criteria andCoteDaysEqualTo(Integer value) {
            addCriterion("cote_days =", value, "coteDays");
            return (Criteria) this;
        }

        public Criteria andCoteDaysNotEqualTo(Integer value) {
            addCriterion("cote_days <>", value, "coteDays");
            return (Criteria) this;
        }

        public Criteria andCoteDaysGreaterThan(Integer value) {
            addCriterion("cote_days >", value, "coteDays");
            return (Criteria) this;
        }

        public Criteria andCoteDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("cote_days >=", value, "coteDays");
            return (Criteria) this;
        }

        public Criteria andCoteDaysLessThan(Integer value) {
            addCriterion("cote_days <", value, "coteDays");
            return (Criteria) this;
        }

        public Criteria andCoteDaysLessThanOrEqualTo(Integer value) {
            addCriterion("cote_days <=", value, "coteDays");
            return (Criteria) this;
        }

        public Criteria andCoteDaysIn(List<Integer> values) {
            addCriterion("cote_days in", values, "coteDays");
            return (Criteria) this;
        }

        public Criteria andCoteDaysNotIn(List<Integer> values) {
            addCriterion("cote_days not in", values, "coteDays");
            return (Criteria) this;
        }

        public Criteria andCoteDaysBetween(Integer value1, Integer value2) {
            addCriterion("cote_days between", value1, value2, "coteDays");
            return (Criteria) this;
        }

        public Criteria andCoteDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("cote_days not between", value1, value2, "coteDays");
            return (Criteria) this;
        }

        public Criteria andCoteAuditingIsNull() {
            addCriterion("cote_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andCoteAuditingIsNotNull() {
            addCriterion("cote_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andCoteAuditingEqualTo(String value) {
            addCriterion("cote_Auditing =", value, "coteAuditing");
            return (Criteria) this;
        }

        public Criteria andCoteAuditingNotEqualTo(String value) {
            addCriterion("cote_Auditing <>", value, "coteAuditing");
            return (Criteria) this;
        }

        public Criteria andCoteAuditingGreaterThan(String value) {
            addCriterion("cote_Auditing >", value, "coteAuditing");
            return (Criteria) this;
        }

        public Criteria andCoteAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("cote_Auditing >=", value, "coteAuditing");
            return (Criteria) this;
        }

        public Criteria andCoteAuditingLessThan(String value) {
            addCriterion("cote_Auditing <", value, "coteAuditing");
            return (Criteria) this;
        }

        public Criteria andCoteAuditingLessThanOrEqualTo(String value) {
            addCriterion("cote_Auditing <=", value, "coteAuditing");
            return (Criteria) this;
        }

        public Criteria andCoteAuditingLike(String value) {
            addCriterion("cote_Auditing like", value, "coteAuditing");
            return (Criteria) this;
        }

        public Criteria andCoteAuditingNotLike(String value) {
            addCriterion("cote_Auditing not like", value, "coteAuditing");
            return (Criteria) this;
        }

        public Criteria andCoteAuditingIn(List<String> values) {
            addCriterion("cote_Auditing in", values, "coteAuditing");
            return (Criteria) this;
        }

        public Criteria andCoteAuditingNotIn(List<String> values) {
            addCriterion("cote_Auditing not in", values, "coteAuditing");
            return (Criteria) this;
        }

        public Criteria andCoteAuditingBetween(String value1, String value2) {
            addCriterion("cote_Auditing between", value1, value2, "coteAuditing");
            return (Criteria) this;
        }

        public Criteria andCoteAuditingNotBetween(String value1, String value2) {
            addCriterion("cote_Auditing not between", value1, value2, "coteAuditing");
            return (Criteria) this;
        }

        public Criteria andCoteYnIsNull() {
            addCriterion("cote_yn is null");
            return (Criteria) this;
        }

        public Criteria andCoteYnIsNotNull() {
            addCriterion("cote_yn is not null");
            return (Criteria) this;
        }

        public Criteria andCoteYnEqualTo(String value) {
            addCriterion("cote_yn =", value, "coteYn");
            return (Criteria) this;
        }

        public Criteria andCoteYnNotEqualTo(String value) {
            addCriterion("cote_yn <>", value, "coteYn");
            return (Criteria) this;
        }

        public Criteria andCoteYnGreaterThan(String value) {
            addCriterion("cote_yn >", value, "coteYn");
            return (Criteria) this;
        }

        public Criteria andCoteYnGreaterThanOrEqualTo(String value) {
            addCriterion("cote_yn >=", value, "coteYn");
            return (Criteria) this;
        }

        public Criteria andCoteYnLessThan(String value) {
            addCriterion("cote_yn <", value, "coteYn");
            return (Criteria) this;
        }

        public Criteria andCoteYnLessThanOrEqualTo(String value) {
            addCriterion("cote_yn <=", value, "coteYn");
            return (Criteria) this;
        }

        public Criteria andCoteYnLike(String value) {
            addCriterion("cote_yn like", value, "coteYn");
            return (Criteria) this;
        }

        public Criteria andCoteYnNotLike(String value) {
            addCriterion("cote_yn not like", value, "coteYn");
            return (Criteria) this;
        }

        public Criteria andCoteYnIn(List<String> values) {
            addCriterion("cote_yn in", values, "coteYn");
            return (Criteria) this;
        }

        public Criteria andCoteYnNotIn(List<String> values) {
            addCriterion("cote_yn not in", values, "coteYn");
            return (Criteria) this;
        }

        public Criteria andCoteYnBetween(String value1, String value2) {
            addCriterion("cote_yn between", value1, value2, "coteYn");
            return (Criteria) this;
        }

        public Criteria andCoteYnNotBetween(String value1, String value2) {
            addCriterion("cote_yn not between", value1, value2, "coteYn");
            return (Criteria) this;
        }

        public Criteria andCoteCustom1IsNull() {
            addCriterion("cote_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCoteCustom1IsNotNull() {
            addCriterion("cote_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCoteCustom1EqualTo(String value) {
            addCriterion("cote_custom1 =", value, "coteCustom1");
            return (Criteria) this;
        }

        public Criteria andCoteCustom1NotEqualTo(String value) {
            addCriterion("cote_custom1 <>", value, "coteCustom1");
            return (Criteria) this;
        }

        public Criteria andCoteCustom1GreaterThan(String value) {
            addCriterion("cote_custom1 >", value, "coteCustom1");
            return (Criteria) this;
        }

        public Criteria andCoteCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("cote_custom1 >=", value, "coteCustom1");
            return (Criteria) this;
        }

        public Criteria andCoteCustom1LessThan(String value) {
            addCriterion("cote_custom1 <", value, "coteCustom1");
            return (Criteria) this;
        }

        public Criteria andCoteCustom1LessThanOrEqualTo(String value) {
            addCriterion("cote_custom1 <=", value, "coteCustom1");
            return (Criteria) this;
        }

        public Criteria andCoteCustom1Like(String value) {
            addCriterion("cote_custom1 like", value, "coteCustom1");
            return (Criteria) this;
        }

        public Criteria andCoteCustom1NotLike(String value) {
            addCriterion("cote_custom1 not like", value, "coteCustom1");
            return (Criteria) this;
        }

        public Criteria andCoteCustom1In(List<String> values) {
            addCriterion("cote_custom1 in", values, "coteCustom1");
            return (Criteria) this;
        }

        public Criteria andCoteCustom1NotIn(List<String> values) {
            addCriterion("cote_custom1 not in", values, "coteCustom1");
            return (Criteria) this;
        }

        public Criteria andCoteCustom1Between(String value1, String value2) {
            addCriterion("cote_custom1 between", value1, value2, "coteCustom1");
            return (Criteria) this;
        }

        public Criteria andCoteCustom1NotBetween(String value1, String value2) {
            addCriterion("cote_custom1 not between", value1, value2, "coteCustom1");
            return (Criteria) this;
        }

        public Criteria andCoteCustom2IsNull() {
            addCriterion("cote_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCoteCustom2IsNotNull() {
            addCriterion("cote_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCoteCustom2EqualTo(String value) {
            addCriterion("cote_custom2 =", value, "coteCustom2");
            return (Criteria) this;
        }

        public Criteria andCoteCustom2NotEqualTo(String value) {
            addCriterion("cote_custom2 <>", value, "coteCustom2");
            return (Criteria) this;
        }

        public Criteria andCoteCustom2GreaterThan(String value) {
            addCriterion("cote_custom2 >", value, "coteCustom2");
            return (Criteria) this;
        }

        public Criteria andCoteCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("cote_custom2 >=", value, "coteCustom2");
            return (Criteria) this;
        }

        public Criteria andCoteCustom2LessThan(String value) {
            addCriterion("cote_custom2 <", value, "coteCustom2");
            return (Criteria) this;
        }

        public Criteria andCoteCustom2LessThanOrEqualTo(String value) {
            addCriterion("cote_custom2 <=", value, "coteCustom2");
            return (Criteria) this;
        }

        public Criteria andCoteCustom2Like(String value) {
            addCriterion("cote_custom2 like", value, "coteCustom2");
            return (Criteria) this;
        }

        public Criteria andCoteCustom2NotLike(String value) {
            addCriterion("cote_custom2 not like", value, "coteCustom2");
            return (Criteria) this;
        }

        public Criteria andCoteCustom2In(List<String> values) {
            addCriterion("cote_custom2 in", values, "coteCustom2");
            return (Criteria) this;
        }

        public Criteria andCoteCustom2NotIn(List<String> values) {
            addCriterion("cote_custom2 not in", values, "coteCustom2");
            return (Criteria) this;
        }

        public Criteria andCoteCustom2Between(String value1, String value2) {
            addCriterion("cote_custom2 between", value1, value2, "coteCustom2");
            return (Criteria) this;
        }

        public Criteria andCoteCustom2NotBetween(String value1, String value2) {
            addCriterion("cote_custom2 not between", value1, value2, "coteCustom2");
            return (Criteria) this;
        }

        public Criteria andCoteCustom3IsNull() {
            addCriterion("cote_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andCoteCustom3IsNotNull() {
            addCriterion("cote_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andCoteCustom3EqualTo(String value) {
            addCriterion("cote_custom3 =", value, "coteCustom3");
            return (Criteria) this;
        }

        public Criteria andCoteCustom3NotEqualTo(String value) {
            addCriterion("cote_custom3 <>", value, "coteCustom3");
            return (Criteria) this;
        }

        public Criteria andCoteCustom3GreaterThan(String value) {
            addCriterion("cote_custom3 >", value, "coteCustom3");
            return (Criteria) this;
        }

        public Criteria andCoteCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("cote_custom3 >=", value, "coteCustom3");
            return (Criteria) this;
        }

        public Criteria andCoteCustom3LessThan(String value) {
            addCriterion("cote_custom3 <", value, "coteCustom3");
            return (Criteria) this;
        }

        public Criteria andCoteCustom3LessThanOrEqualTo(String value) {
            addCriterion("cote_custom3 <=", value, "coteCustom3");
            return (Criteria) this;
        }

        public Criteria andCoteCustom3Like(String value) {
            addCriterion("cote_custom3 like", value, "coteCustom3");
            return (Criteria) this;
        }

        public Criteria andCoteCustom3NotLike(String value) {
            addCriterion("cote_custom3 not like", value, "coteCustom3");
            return (Criteria) this;
        }

        public Criteria andCoteCustom3In(List<String> values) {
            addCriterion("cote_custom3 in", values, "coteCustom3");
            return (Criteria) this;
        }

        public Criteria andCoteCustom3NotIn(List<String> values) {
            addCriterion("cote_custom3 not in", values, "coteCustom3");
            return (Criteria) this;
        }

        public Criteria andCoteCustom3Between(String value1, String value2) {
            addCriterion("cote_custom3 between", value1, value2, "coteCustom3");
            return (Criteria) this;
        }

        public Criteria andCoteCustom3NotBetween(String value1, String value2) {
            addCriterion("cote_custom3 not between", value1, value2, "coteCustom3");
            return (Criteria) this;
        }

        public Criteria andCoteCustom4IsNull() {
            addCriterion("cote_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andCoteCustom4IsNotNull() {
            addCriterion("cote_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andCoteCustom4EqualTo(String value) {
            addCriterion("cote_custom4 =", value, "coteCustom4");
            return (Criteria) this;
        }

        public Criteria andCoteCustom4NotEqualTo(String value) {
            addCriterion("cote_custom4 <>", value, "coteCustom4");
            return (Criteria) this;
        }

        public Criteria andCoteCustom4GreaterThan(String value) {
            addCriterion("cote_custom4 >", value, "coteCustom4");
            return (Criteria) this;
        }

        public Criteria andCoteCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("cote_custom4 >=", value, "coteCustom4");
            return (Criteria) this;
        }

        public Criteria andCoteCustom4LessThan(String value) {
            addCriterion("cote_custom4 <", value, "coteCustom4");
            return (Criteria) this;
        }

        public Criteria andCoteCustom4LessThanOrEqualTo(String value) {
            addCriterion("cote_custom4 <=", value, "coteCustom4");
            return (Criteria) this;
        }

        public Criteria andCoteCustom4Like(String value) {
            addCriterion("cote_custom4 like", value, "coteCustom4");
            return (Criteria) this;
        }

        public Criteria andCoteCustom4NotLike(String value) {
            addCriterion("cote_custom4 not like", value, "coteCustom4");
            return (Criteria) this;
        }

        public Criteria andCoteCustom4In(List<String> values) {
            addCriterion("cote_custom4 in", values, "coteCustom4");
            return (Criteria) this;
        }

        public Criteria andCoteCustom4NotIn(List<String> values) {
            addCriterion("cote_custom4 not in", values, "coteCustom4");
            return (Criteria) this;
        }

        public Criteria andCoteCustom4Between(String value1, String value2) {
            addCriterion("cote_custom4 between", value1, value2, "coteCustom4");
            return (Criteria) this;
        }

        public Criteria andCoteCustom4NotBetween(String value1, String value2) {
            addCriterion("cote_custom4 not between", value1, value2, "coteCustom4");
            return (Criteria) this;
        }

        public Criteria andCoteCustom5IsNull() {
            addCriterion("cote_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andCoteCustom5IsNotNull() {
            addCriterion("cote_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andCoteCustom5EqualTo(String value) {
            addCriterion("cote_custom5 =", value, "coteCustom5");
            return (Criteria) this;
        }

        public Criteria andCoteCustom5NotEqualTo(String value) {
            addCriterion("cote_custom5 <>", value, "coteCustom5");
            return (Criteria) this;
        }

        public Criteria andCoteCustom5GreaterThan(String value) {
            addCriterion("cote_custom5 >", value, "coteCustom5");
            return (Criteria) this;
        }

        public Criteria andCoteCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("cote_custom5 >=", value, "coteCustom5");
            return (Criteria) this;
        }

        public Criteria andCoteCustom5LessThan(String value) {
            addCriterion("cote_custom5 <", value, "coteCustom5");
            return (Criteria) this;
        }

        public Criteria andCoteCustom5LessThanOrEqualTo(String value) {
            addCriterion("cote_custom5 <=", value, "coteCustom5");
            return (Criteria) this;
        }

        public Criteria andCoteCustom5Like(String value) {
            addCriterion("cote_custom5 like", value, "coteCustom5");
            return (Criteria) this;
        }

        public Criteria andCoteCustom5NotLike(String value) {
            addCriterion("cote_custom5 not like", value, "coteCustom5");
            return (Criteria) this;
        }

        public Criteria andCoteCustom5In(List<String> values) {
            addCriterion("cote_custom5 in", values, "coteCustom5");
            return (Criteria) this;
        }

        public Criteria andCoteCustom5NotIn(List<String> values) {
            addCriterion("cote_custom5 not in", values, "coteCustom5");
            return (Criteria) this;
        }

        public Criteria andCoteCustom5Between(String value1, String value2) {
            addCriterion("cote_custom5 between", value1, value2, "coteCustom5");
            return (Criteria) this;
        }

        public Criteria andCoteCustom5NotBetween(String value1, String value2) {
            addCriterion("cote_custom5 not between", value1, value2, "coteCustom5");
            return (Criteria) this;
        }

        public Criteria andCoteCustom6IsNull() {
            addCriterion("cote_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andCoteCustom6IsNotNull() {
            addCriterion("cote_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andCoteCustom6EqualTo(String value) {
            addCriterion("cote_custom6 =", value, "coteCustom6");
            return (Criteria) this;
        }

        public Criteria andCoteCustom6NotEqualTo(String value) {
            addCriterion("cote_custom6 <>", value, "coteCustom6");
            return (Criteria) this;
        }

        public Criteria andCoteCustom6GreaterThan(String value) {
            addCriterion("cote_custom6 >", value, "coteCustom6");
            return (Criteria) this;
        }

        public Criteria andCoteCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("cote_custom6 >=", value, "coteCustom6");
            return (Criteria) this;
        }

        public Criteria andCoteCustom6LessThan(String value) {
            addCriterion("cote_custom6 <", value, "coteCustom6");
            return (Criteria) this;
        }

        public Criteria andCoteCustom6LessThanOrEqualTo(String value) {
            addCriterion("cote_custom6 <=", value, "coteCustom6");
            return (Criteria) this;
        }

        public Criteria andCoteCustom6Like(String value) {
            addCriterion("cote_custom6 like", value, "coteCustom6");
            return (Criteria) this;
        }

        public Criteria andCoteCustom6NotLike(String value) {
            addCriterion("cote_custom6 not like", value, "coteCustom6");
            return (Criteria) this;
        }

        public Criteria andCoteCustom6In(List<String> values) {
            addCriterion("cote_custom6 in", values, "coteCustom6");
            return (Criteria) this;
        }

        public Criteria andCoteCustom6NotIn(List<String> values) {
            addCriterion("cote_custom6 not in", values, "coteCustom6");
            return (Criteria) this;
        }

        public Criteria andCoteCustom6Between(String value1, String value2) {
            addCriterion("cote_custom6 between", value1, value2, "coteCustom6");
            return (Criteria) this;
        }

        public Criteria andCoteCustom6NotBetween(String value1, String value2) {
            addCriterion("cote_custom6 not between", value1, value2, "coteCustom6");
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