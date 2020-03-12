package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class UpdownProgramExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpdownProgramExample() {
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

        public Criteria andUpIdIsNull() {
            addCriterion("up_id is null");
            return (Criteria) this;
        }

        public Criteria andUpIdIsNotNull() {
            addCriterion("up_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpIdEqualTo(String value) {
            addCriterion("up_id =", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotEqualTo(String value) {
            addCriterion("up_id <>", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdGreaterThan(String value) {
            addCriterion("up_id >", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdGreaterThanOrEqualTo(String value) {
            addCriterion("up_id >=", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdLessThan(String value) {
            addCriterion("up_id <", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdLessThanOrEqualTo(String value) {
            addCriterion("up_id <=", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdLike(String value) {
            addCriterion("up_id like", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotLike(String value) {
            addCriterion("up_id not like", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdIn(List<String> values) {
            addCriterion("up_id in", values, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotIn(List<String> values) {
            addCriterion("up_id not in", values, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdBetween(String value1, String value2) {
            addCriterion("up_id between", value1, value2, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotBetween(String value1, String value2) {
            addCriterion("up_id not between", value1, value2, "upId");
            return (Criteria) this;
        }

        public Criteria andUpNameIsNull() {
            addCriterion("up_name is null");
            return (Criteria) this;
        }

        public Criteria andUpNameIsNotNull() {
            addCriterion("up_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpNameEqualTo(String value) {
            addCriterion("up_name =", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotEqualTo(String value) {
            addCriterion("up_name <>", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameGreaterThan(String value) {
            addCriterion("up_name >", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameGreaterThanOrEqualTo(String value) {
            addCriterion("up_name >=", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLessThan(String value) {
            addCriterion("up_name <", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLessThanOrEqualTo(String value) {
            addCriterion("up_name <=", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLike(String value) {
            addCriterion("up_name like", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotLike(String value) {
            addCriterion("up_name not like", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameIn(List<String> values) {
            addCriterion("up_name in", values, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotIn(List<String> values) {
            addCriterion("up_name not in", values, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameBetween(String value1, String value2) {
            addCriterion("up_name between", value1, value2, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotBetween(String value1, String value2) {
            addCriterion("up_name not between", value1, value2, "upName");
            return (Criteria) this;
        }

        public Criteria andUpAuditingIsNull() {
            addCriterion("up_auditing is null");
            return (Criteria) this;
        }

        public Criteria andUpAuditingIsNotNull() {
            addCriterion("up_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andUpAuditingEqualTo(String value) {
            addCriterion("up_auditing =", value, "upAuditing");
            return (Criteria) this;
        }

        public Criteria andUpAuditingNotEqualTo(String value) {
            addCriterion("up_auditing <>", value, "upAuditing");
            return (Criteria) this;
        }

        public Criteria andUpAuditingGreaterThan(String value) {
            addCriterion("up_auditing >", value, "upAuditing");
            return (Criteria) this;
        }

        public Criteria andUpAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("up_auditing >=", value, "upAuditing");
            return (Criteria) this;
        }

        public Criteria andUpAuditingLessThan(String value) {
            addCriterion("up_auditing <", value, "upAuditing");
            return (Criteria) this;
        }

        public Criteria andUpAuditingLessThanOrEqualTo(String value) {
            addCriterion("up_auditing <=", value, "upAuditing");
            return (Criteria) this;
        }

        public Criteria andUpAuditingLike(String value) {
            addCriterion("up_auditing like", value, "upAuditing");
            return (Criteria) this;
        }

        public Criteria andUpAuditingNotLike(String value) {
            addCriterion("up_auditing not like", value, "upAuditing");
            return (Criteria) this;
        }

        public Criteria andUpAuditingIn(List<String> values) {
            addCriterion("up_auditing in", values, "upAuditing");
            return (Criteria) this;
        }

        public Criteria andUpAuditingNotIn(List<String> values) {
            addCriterion("up_auditing not in", values, "upAuditing");
            return (Criteria) this;
        }

        public Criteria andUpAuditingBetween(String value1, String value2) {
            addCriterion("up_auditing between", value1, value2, "upAuditing");
            return (Criteria) this;
        }

        public Criteria andUpAuditingNotBetween(String value1, String value2) {
            addCriterion("up_auditing not between", value1, value2, "upAuditing");
            return (Criteria) this;
        }

        public Criteria andUpYnIsNull() {
            addCriterion("up_yn is null");
            return (Criteria) this;
        }

        public Criteria andUpYnIsNotNull() {
            addCriterion("up_yn is not null");
            return (Criteria) this;
        }

        public Criteria andUpYnEqualTo(String value) {
            addCriterion("up_yn =", value, "upYn");
            return (Criteria) this;
        }

        public Criteria andUpYnNotEqualTo(String value) {
            addCriterion("up_yn <>", value, "upYn");
            return (Criteria) this;
        }

        public Criteria andUpYnGreaterThan(String value) {
            addCriterion("up_yn >", value, "upYn");
            return (Criteria) this;
        }

        public Criteria andUpYnGreaterThanOrEqualTo(String value) {
            addCriterion("up_yn >=", value, "upYn");
            return (Criteria) this;
        }

        public Criteria andUpYnLessThan(String value) {
            addCriterion("up_yn <", value, "upYn");
            return (Criteria) this;
        }

        public Criteria andUpYnLessThanOrEqualTo(String value) {
            addCriterion("up_yn <=", value, "upYn");
            return (Criteria) this;
        }

        public Criteria andUpYnLike(String value) {
            addCriterion("up_yn like", value, "upYn");
            return (Criteria) this;
        }

        public Criteria andUpYnNotLike(String value) {
            addCriterion("up_yn not like", value, "upYn");
            return (Criteria) this;
        }

        public Criteria andUpYnIn(List<String> values) {
            addCriterion("up_yn in", values, "upYn");
            return (Criteria) this;
        }

        public Criteria andUpYnNotIn(List<String> values) {
            addCriterion("up_yn not in", values, "upYn");
            return (Criteria) this;
        }

        public Criteria andUpYnBetween(String value1, String value2) {
            addCriterion("up_yn between", value1, value2, "upYn");
            return (Criteria) this;
        }

        public Criteria andUpYnNotBetween(String value1, String value2) {
            addCriterion("up_yn not between", value1, value2, "upYn");
            return (Criteria) this;
        }

        public Criteria andUpCustom1IsNull() {
            addCriterion("up_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andUpCustom1IsNotNull() {
            addCriterion("up_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andUpCustom1EqualTo(String value) {
            addCriterion("up_custom1 =", value, "upCustom1");
            return (Criteria) this;
        }

        public Criteria andUpCustom1NotEqualTo(String value) {
            addCriterion("up_custom1 <>", value, "upCustom1");
            return (Criteria) this;
        }

        public Criteria andUpCustom1GreaterThan(String value) {
            addCriterion("up_custom1 >", value, "upCustom1");
            return (Criteria) this;
        }

        public Criteria andUpCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("up_custom1 >=", value, "upCustom1");
            return (Criteria) this;
        }

        public Criteria andUpCustom1LessThan(String value) {
            addCriterion("up_custom1 <", value, "upCustom1");
            return (Criteria) this;
        }

        public Criteria andUpCustom1LessThanOrEqualTo(String value) {
            addCriterion("up_custom1 <=", value, "upCustom1");
            return (Criteria) this;
        }

        public Criteria andUpCustom1Like(String value) {
            addCriterion("up_custom1 like", value, "upCustom1");
            return (Criteria) this;
        }

        public Criteria andUpCustom1NotLike(String value) {
            addCriterion("up_custom1 not like", value, "upCustom1");
            return (Criteria) this;
        }

        public Criteria andUpCustom1In(List<String> values) {
            addCriterion("up_custom1 in", values, "upCustom1");
            return (Criteria) this;
        }

        public Criteria andUpCustom1NotIn(List<String> values) {
            addCriterion("up_custom1 not in", values, "upCustom1");
            return (Criteria) this;
        }

        public Criteria andUpCustom1Between(String value1, String value2) {
            addCriterion("up_custom1 between", value1, value2, "upCustom1");
            return (Criteria) this;
        }

        public Criteria andUpCustom1NotBetween(String value1, String value2) {
            addCriterion("up_custom1 not between", value1, value2, "upCustom1");
            return (Criteria) this;
        }

        public Criteria andUpCustom2IsNull() {
            addCriterion("up_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andUpCustom2IsNotNull() {
            addCriterion("up_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andUpCustom2EqualTo(String value) {
            addCriterion("up_custom2 =", value, "upCustom2");
            return (Criteria) this;
        }

        public Criteria andUpCustom2NotEqualTo(String value) {
            addCriterion("up_custom2 <>", value, "upCustom2");
            return (Criteria) this;
        }

        public Criteria andUpCustom2GreaterThan(String value) {
            addCriterion("up_custom2 >", value, "upCustom2");
            return (Criteria) this;
        }

        public Criteria andUpCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("up_custom2 >=", value, "upCustom2");
            return (Criteria) this;
        }

        public Criteria andUpCustom2LessThan(String value) {
            addCriterion("up_custom2 <", value, "upCustom2");
            return (Criteria) this;
        }

        public Criteria andUpCustom2LessThanOrEqualTo(String value) {
            addCriterion("up_custom2 <=", value, "upCustom2");
            return (Criteria) this;
        }

        public Criteria andUpCustom2Like(String value) {
            addCriterion("up_custom2 like", value, "upCustom2");
            return (Criteria) this;
        }

        public Criteria andUpCustom2NotLike(String value) {
            addCriterion("up_custom2 not like", value, "upCustom2");
            return (Criteria) this;
        }

        public Criteria andUpCustom2In(List<String> values) {
            addCriterion("up_custom2 in", values, "upCustom2");
            return (Criteria) this;
        }

        public Criteria andUpCustom2NotIn(List<String> values) {
            addCriterion("up_custom2 not in", values, "upCustom2");
            return (Criteria) this;
        }

        public Criteria andUpCustom2Between(String value1, String value2) {
            addCriterion("up_custom2 between", value1, value2, "upCustom2");
            return (Criteria) this;
        }

        public Criteria andUpCustom2NotBetween(String value1, String value2) {
            addCriterion("up_custom2 not between", value1, value2, "upCustom2");
            return (Criteria) this;
        }

        public Criteria andUpCustom3IsNull() {
            addCriterion("up_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andUpCustom3IsNotNull() {
            addCriterion("up_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andUpCustom3EqualTo(String value) {
            addCriterion("up_custom3 =", value, "upCustom3");
            return (Criteria) this;
        }

        public Criteria andUpCustom3NotEqualTo(String value) {
            addCriterion("up_custom3 <>", value, "upCustom3");
            return (Criteria) this;
        }

        public Criteria andUpCustom3GreaterThan(String value) {
            addCriterion("up_custom3 >", value, "upCustom3");
            return (Criteria) this;
        }

        public Criteria andUpCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("up_custom3 >=", value, "upCustom3");
            return (Criteria) this;
        }

        public Criteria andUpCustom3LessThan(String value) {
            addCriterion("up_custom3 <", value, "upCustom3");
            return (Criteria) this;
        }

        public Criteria andUpCustom3LessThanOrEqualTo(String value) {
            addCriterion("up_custom3 <=", value, "upCustom3");
            return (Criteria) this;
        }

        public Criteria andUpCustom3Like(String value) {
            addCriterion("up_custom3 like", value, "upCustom3");
            return (Criteria) this;
        }

        public Criteria andUpCustom3NotLike(String value) {
            addCriterion("up_custom3 not like", value, "upCustom3");
            return (Criteria) this;
        }

        public Criteria andUpCustom3In(List<String> values) {
            addCriterion("up_custom3 in", values, "upCustom3");
            return (Criteria) this;
        }

        public Criteria andUpCustom3NotIn(List<String> values) {
            addCriterion("up_custom3 not in", values, "upCustom3");
            return (Criteria) this;
        }

        public Criteria andUpCustom3Between(String value1, String value2) {
            addCriterion("up_custom3 between", value1, value2, "upCustom3");
            return (Criteria) this;
        }

        public Criteria andUpCustom3NotBetween(String value1, String value2) {
            addCriterion("up_custom3 not between", value1, value2, "upCustom3");
            return (Criteria) this;
        }

        public Criteria andUpCustom4IsNull() {
            addCriterion("up_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andUpCustom4IsNotNull() {
            addCriterion("up_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andUpCustom4EqualTo(String value) {
            addCriterion("up_custom4 =", value, "upCustom4");
            return (Criteria) this;
        }

        public Criteria andUpCustom4NotEqualTo(String value) {
            addCriterion("up_custom4 <>", value, "upCustom4");
            return (Criteria) this;
        }

        public Criteria andUpCustom4GreaterThan(String value) {
            addCriterion("up_custom4 >", value, "upCustom4");
            return (Criteria) this;
        }

        public Criteria andUpCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("up_custom4 >=", value, "upCustom4");
            return (Criteria) this;
        }

        public Criteria andUpCustom4LessThan(String value) {
            addCriterion("up_custom4 <", value, "upCustom4");
            return (Criteria) this;
        }

        public Criteria andUpCustom4LessThanOrEqualTo(String value) {
            addCriterion("up_custom4 <=", value, "upCustom4");
            return (Criteria) this;
        }

        public Criteria andUpCustom4Like(String value) {
            addCriterion("up_custom4 like", value, "upCustom4");
            return (Criteria) this;
        }

        public Criteria andUpCustom4NotLike(String value) {
            addCriterion("up_custom4 not like", value, "upCustom4");
            return (Criteria) this;
        }

        public Criteria andUpCustom4In(List<String> values) {
            addCriterion("up_custom4 in", values, "upCustom4");
            return (Criteria) this;
        }

        public Criteria andUpCustom4NotIn(List<String> values) {
            addCriterion("up_custom4 not in", values, "upCustom4");
            return (Criteria) this;
        }

        public Criteria andUpCustom4Between(String value1, String value2) {
            addCriterion("up_custom4 between", value1, value2, "upCustom4");
            return (Criteria) this;
        }

        public Criteria andUpCustom4NotBetween(String value1, String value2) {
            addCriterion("up_custom4 not between", value1, value2, "upCustom4");
            return (Criteria) this;
        }

        public Criteria andUpCustom5IsNull() {
            addCriterion("up_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andUpCustom5IsNotNull() {
            addCriterion("up_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andUpCustom5EqualTo(String value) {
            addCriterion("up_custom5 =", value, "upCustom5");
            return (Criteria) this;
        }

        public Criteria andUpCustom5NotEqualTo(String value) {
            addCriterion("up_custom5 <>", value, "upCustom5");
            return (Criteria) this;
        }

        public Criteria andUpCustom5GreaterThan(String value) {
            addCriterion("up_custom5 >", value, "upCustom5");
            return (Criteria) this;
        }

        public Criteria andUpCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("up_custom5 >=", value, "upCustom5");
            return (Criteria) this;
        }

        public Criteria andUpCustom5LessThan(String value) {
            addCriterion("up_custom5 <", value, "upCustom5");
            return (Criteria) this;
        }

        public Criteria andUpCustom5LessThanOrEqualTo(String value) {
            addCriterion("up_custom5 <=", value, "upCustom5");
            return (Criteria) this;
        }

        public Criteria andUpCustom5Like(String value) {
            addCriterion("up_custom5 like", value, "upCustom5");
            return (Criteria) this;
        }

        public Criteria andUpCustom5NotLike(String value) {
            addCriterion("up_custom5 not like", value, "upCustom5");
            return (Criteria) this;
        }

        public Criteria andUpCustom5In(List<String> values) {
            addCriterion("up_custom5 in", values, "upCustom5");
            return (Criteria) this;
        }

        public Criteria andUpCustom5NotIn(List<String> values) {
            addCriterion("up_custom5 not in", values, "upCustom5");
            return (Criteria) this;
        }

        public Criteria andUpCustom5Between(String value1, String value2) {
            addCriterion("up_custom5 between", value1, value2, "upCustom5");
            return (Criteria) this;
        }

        public Criteria andUpCustom5NotBetween(String value1, String value2) {
            addCriterion("up_custom5 not between", value1, value2, "upCustom5");
            return (Criteria) this;
        }

        public Criteria andUpCustom6IsNull() {
            addCriterion("up_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andUpCustom6IsNotNull() {
            addCriterion("up_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andUpCustom6EqualTo(String value) {
            addCriterion("up_custom6 =", value, "upCustom6");
            return (Criteria) this;
        }

        public Criteria andUpCustom6NotEqualTo(String value) {
            addCriterion("up_custom6 <>", value, "upCustom6");
            return (Criteria) this;
        }

        public Criteria andUpCustom6GreaterThan(String value) {
            addCriterion("up_custom6 >", value, "upCustom6");
            return (Criteria) this;
        }

        public Criteria andUpCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("up_custom6 >=", value, "upCustom6");
            return (Criteria) this;
        }

        public Criteria andUpCustom6LessThan(String value) {
            addCriterion("up_custom6 <", value, "upCustom6");
            return (Criteria) this;
        }

        public Criteria andUpCustom6LessThanOrEqualTo(String value) {
            addCriterion("up_custom6 <=", value, "upCustom6");
            return (Criteria) this;
        }

        public Criteria andUpCustom6Like(String value) {
            addCriterion("up_custom6 like", value, "upCustom6");
            return (Criteria) this;
        }

        public Criteria andUpCustom6NotLike(String value) {
            addCriterion("up_custom6 not like", value, "upCustom6");
            return (Criteria) this;
        }

        public Criteria andUpCustom6In(List<String> values) {
            addCriterion("up_custom6 in", values, "upCustom6");
            return (Criteria) this;
        }

        public Criteria andUpCustom6NotIn(List<String> values) {
            addCriterion("up_custom6 not in", values, "upCustom6");
            return (Criteria) this;
        }

        public Criteria andUpCustom6Between(String value1, String value2) {
            addCriterion("up_custom6 between", value1, value2, "upCustom6");
            return (Criteria) this;
        }

        public Criteria andUpCustom6NotBetween(String value1, String value2) {
            addCriterion("up_custom6 not between", value1, value2, "upCustom6");
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