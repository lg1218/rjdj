package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DullSectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DullSectionExample() {
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

        public Criteria andDsIdIsNull() {
            addCriterion("ds_id is null");
            return (Criteria) this;
        }

        public Criteria andDsIdIsNotNull() {
            addCriterion("ds_id is not null");
            return (Criteria) this;
        }

        public Criteria andDsIdEqualTo(String value) {
            addCriterion("ds_id =", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdNotEqualTo(String value) {
            addCriterion("ds_id <>", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdGreaterThan(String value) {
            addCriterion("ds_id >", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdGreaterThanOrEqualTo(String value) {
            addCriterion("ds_id >=", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdLessThan(String value) {
            addCriterion("ds_id <", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdLessThanOrEqualTo(String value) {
            addCriterion("ds_id <=", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdLike(String value) {
            addCriterion("ds_id like", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdNotLike(String value) {
            addCriterion("ds_id not like", value, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdIn(List<String> values) {
            addCriterion("ds_id in", values, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdNotIn(List<String> values) {
            addCriterion("ds_id not in", values, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdBetween(String value1, String value2) {
            addCriterion("ds_id between", value1, value2, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsIdNotBetween(String value1, String value2) {
            addCriterion("ds_id not between", value1, value2, "dsId");
            return (Criteria) this;
        }

        public Criteria andDsStartdayIsNull() {
            addCriterion("ds_startday is null");
            return (Criteria) this;
        }

        public Criteria andDsStartdayIsNotNull() {
            addCriterion("ds_startday is not null");
            return (Criteria) this;
        }

        public Criteria andDsStartdayEqualTo(Integer value) {
            addCriterion("ds_startday =", value, "dsStartday");
            return (Criteria) this;
        }

        public Criteria andDsStartdayNotEqualTo(Integer value) {
            addCriterion("ds_startday <>", value, "dsStartday");
            return (Criteria) this;
        }

        public Criteria andDsStartdayGreaterThan(Integer value) {
            addCriterion("ds_startday >", value, "dsStartday");
            return (Criteria) this;
        }

        public Criteria andDsStartdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("ds_startday >=", value, "dsStartday");
            return (Criteria) this;
        }

        public Criteria andDsStartdayLessThan(Integer value) {
            addCriterion("ds_startday <", value, "dsStartday");
            return (Criteria) this;
        }

        public Criteria andDsStartdayLessThanOrEqualTo(Integer value) {
            addCriterion("ds_startday <=", value, "dsStartday");
            return (Criteria) this;
        }

        public Criteria andDsStartdayIn(List<Integer> values) {
            addCriterion("ds_startday in", values, "dsStartday");
            return (Criteria) this;
        }

        public Criteria andDsStartdayNotIn(List<Integer> values) {
            addCriterion("ds_startday not in", values, "dsStartday");
            return (Criteria) this;
        }

        public Criteria andDsStartdayBetween(Integer value1, Integer value2) {
            addCriterion("ds_startday between", value1, value2, "dsStartday");
            return (Criteria) this;
        }

        public Criteria andDsStartdayNotBetween(Integer value1, Integer value2) {
            addCriterion("ds_startday not between", value1, value2, "dsStartday");
            return (Criteria) this;
        }

        public Criteria andDsEnddateIsNull() {
            addCriterion("ds_enddate is null");
            return (Criteria) this;
        }

        public Criteria andDsEnddateIsNotNull() {
            addCriterion("ds_enddate is not null");
            return (Criteria) this;
        }

        public Criteria andDsEnddateEqualTo(Integer value) {
            addCriterion("ds_enddate =", value, "dsEnddate");
            return (Criteria) this;
        }

        public Criteria andDsEnddateNotEqualTo(Integer value) {
            addCriterion("ds_enddate <>", value, "dsEnddate");
            return (Criteria) this;
        }

        public Criteria andDsEnddateGreaterThan(Integer value) {
            addCriterion("ds_enddate >", value, "dsEnddate");
            return (Criteria) this;
        }

        public Criteria andDsEnddateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ds_enddate >=", value, "dsEnddate");
            return (Criteria) this;
        }

        public Criteria andDsEnddateLessThan(Integer value) {
            addCriterion("ds_enddate <", value, "dsEnddate");
            return (Criteria) this;
        }

        public Criteria andDsEnddateLessThanOrEqualTo(Integer value) {
            addCriterion("ds_enddate <=", value, "dsEnddate");
            return (Criteria) this;
        }

        public Criteria andDsEnddateIn(List<Integer> values) {
            addCriterion("ds_enddate in", values, "dsEnddate");
            return (Criteria) this;
        }

        public Criteria andDsEnddateNotIn(List<Integer> values) {
            addCriterion("ds_enddate not in", values, "dsEnddate");
            return (Criteria) this;
        }

        public Criteria andDsEnddateBetween(Integer value1, Integer value2) {
            addCriterion("ds_enddate between", value1, value2, "dsEnddate");
            return (Criteria) this;
        }

        public Criteria andDsEnddateNotBetween(Integer value1, Integer value2) {
            addCriterion("ds_enddate not between", value1, value2, "dsEnddate");
            return (Criteria) this;
        }

        public Criteria andDsDecorationIsNull() {
            addCriterion("ds_decoration is null");
            return (Criteria) this;
        }

        public Criteria andDsDecorationIsNotNull() {
            addCriterion("ds_decoration is not null");
            return (Criteria) this;
        }

        public Criteria andDsDecorationEqualTo(String value) {
            addCriterion("ds_decoration =", value, "dsDecoration");
            return (Criteria) this;
        }

        public Criteria andDsDecorationNotEqualTo(String value) {
            addCriterion("ds_decoration <>", value, "dsDecoration");
            return (Criteria) this;
        }

        public Criteria andDsDecorationGreaterThan(String value) {
            addCriterion("ds_decoration >", value, "dsDecoration");
            return (Criteria) this;
        }

        public Criteria andDsDecorationGreaterThanOrEqualTo(String value) {
            addCriterion("ds_decoration >=", value, "dsDecoration");
            return (Criteria) this;
        }

        public Criteria andDsDecorationLessThan(String value) {
            addCriterion("ds_decoration <", value, "dsDecoration");
            return (Criteria) this;
        }

        public Criteria andDsDecorationLessThanOrEqualTo(String value) {
            addCriterion("ds_decoration <=", value, "dsDecoration");
            return (Criteria) this;
        }

        public Criteria andDsDecorationLike(String value) {
            addCriterion("ds_decoration like", value, "dsDecoration");
            return (Criteria) this;
        }

        public Criteria andDsDecorationNotLike(String value) {
            addCriterion("ds_decoration not like", value, "dsDecoration");
            return (Criteria) this;
        }

        public Criteria andDsDecorationIn(List<String> values) {
            addCriterion("ds_decoration in", values, "dsDecoration");
            return (Criteria) this;
        }

        public Criteria andDsDecorationNotIn(List<String> values) {
            addCriterion("ds_decoration not in", values, "dsDecoration");
            return (Criteria) this;
        }

        public Criteria andDsDecorationBetween(String value1, String value2) {
            addCriterion("ds_decoration between", value1, value2, "dsDecoration");
            return (Criteria) this;
        }

        public Criteria andDsDecorationNotBetween(String value1, String value2) {
            addCriterion("ds_decoration not between", value1, value2, "dsDecoration");
            return (Criteria) this;
        }

        public Criteria andDsAuditingIsNull() {
            addCriterion("ds_auditing is null");
            return (Criteria) this;
        }

        public Criteria andDsAuditingIsNotNull() {
            addCriterion("ds_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andDsAuditingEqualTo(String value) {
            addCriterion("ds_auditing =", value, "dsAuditing");
            return (Criteria) this;
        }

        public Criteria andDsAuditingNotEqualTo(String value) {
            addCriterion("ds_auditing <>", value, "dsAuditing");
            return (Criteria) this;
        }

        public Criteria andDsAuditingGreaterThan(String value) {
            addCriterion("ds_auditing >", value, "dsAuditing");
            return (Criteria) this;
        }

        public Criteria andDsAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("ds_auditing >=", value, "dsAuditing");
            return (Criteria) this;
        }

        public Criteria andDsAuditingLessThan(String value) {
            addCriterion("ds_auditing <", value, "dsAuditing");
            return (Criteria) this;
        }

        public Criteria andDsAuditingLessThanOrEqualTo(String value) {
            addCriterion("ds_auditing <=", value, "dsAuditing");
            return (Criteria) this;
        }

        public Criteria andDsAuditingLike(String value) {
            addCriterion("ds_auditing like", value, "dsAuditing");
            return (Criteria) this;
        }

        public Criteria andDsAuditingNotLike(String value) {
            addCriterion("ds_auditing not like", value, "dsAuditing");
            return (Criteria) this;
        }

        public Criteria andDsAuditingIn(List<String> values) {
            addCriterion("ds_auditing in", values, "dsAuditing");
            return (Criteria) this;
        }

        public Criteria andDsAuditingNotIn(List<String> values) {
            addCriterion("ds_auditing not in", values, "dsAuditing");
            return (Criteria) this;
        }

        public Criteria andDsAuditingBetween(String value1, String value2) {
            addCriterion("ds_auditing between", value1, value2, "dsAuditing");
            return (Criteria) this;
        }

        public Criteria andDsAuditingNotBetween(String value1, String value2) {
            addCriterion("ds_auditing not between", value1, value2, "dsAuditing");
            return (Criteria) this;
        }

        public Criteria andDsYnIsNull() {
            addCriterion("ds_yn is null");
            return (Criteria) this;
        }

        public Criteria andDsYnIsNotNull() {
            addCriterion("ds_yn is not null");
            return (Criteria) this;
        }

        public Criteria andDsYnEqualTo(String value) {
            addCriterion("ds_yn =", value, "dsYn");
            return (Criteria) this;
        }

        public Criteria andDsYnNotEqualTo(String value) {
            addCriterion("ds_yn <>", value, "dsYn");
            return (Criteria) this;
        }

        public Criteria andDsYnGreaterThan(String value) {
            addCriterion("ds_yn >", value, "dsYn");
            return (Criteria) this;
        }

        public Criteria andDsYnGreaterThanOrEqualTo(String value) {
            addCriterion("ds_yn >=", value, "dsYn");
            return (Criteria) this;
        }

        public Criteria andDsYnLessThan(String value) {
            addCriterion("ds_yn <", value, "dsYn");
            return (Criteria) this;
        }

        public Criteria andDsYnLessThanOrEqualTo(String value) {
            addCriterion("ds_yn <=", value, "dsYn");
            return (Criteria) this;
        }

        public Criteria andDsYnLike(String value) {
            addCriterion("ds_yn like", value, "dsYn");
            return (Criteria) this;
        }

        public Criteria andDsYnNotLike(String value) {
            addCriterion("ds_yn not like", value, "dsYn");
            return (Criteria) this;
        }

        public Criteria andDsYnIn(List<String> values) {
            addCriterion("ds_yn in", values, "dsYn");
            return (Criteria) this;
        }

        public Criteria andDsYnNotIn(List<String> values) {
            addCriterion("ds_yn not in", values, "dsYn");
            return (Criteria) this;
        }

        public Criteria andDsYnBetween(String value1, String value2) {
            addCriterion("ds_yn between", value1, value2, "dsYn");
            return (Criteria) this;
        }

        public Criteria andDsYnNotBetween(String value1, String value2) {
            addCriterion("ds_yn not between", value1, value2, "dsYn");
            return (Criteria) this;
        }

        public Criteria andDsCustom1IsNull() {
            addCriterion("ds_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andDsCustom1IsNotNull() {
            addCriterion("ds_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andDsCustom1EqualTo(String value) {
            addCriterion("ds_custom1 =", value, "dsCustom1");
            return (Criteria) this;
        }

        public Criteria andDsCustom1NotEqualTo(String value) {
            addCriterion("ds_custom1 <>", value, "dsCustom1");
            return (Criteria) this;
        }

        public Criteria andDsCustom1GreaterThan(String value) {
            addCriterion("ds_custom1 >", value, "dsCustom1");
            return (Criteria) this;
        }

        public Criteria andDsCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("ds_custom1 >=", value, "dsCustom1");
            return (Criteria) this;
        }

        public Criteria andDsCustom1LessThan(String value) {
            addCriterion("ds_custom1 <", value, "dsCustom1");
            return (Criteria) this;
        }

        public Criteria andDsCustom1LessThanOrEqualTo(String value) {
            addCriterion("ds_custom1 <=", value, "dsCustom1");
            return (Criteria) this;
        }

        public Criteria andDsCustom1Like(String value) {
            addCriterion("ds_custom1 like", value, "dsCustom1");
            return (Criteria) this;
        }

        public Criteria andDsCustom1NotLike(String value) {
            addCriterion("ds_custom1 not like", value, "dsCustom1");
            return (Criteria) this;
        }

        public Criteria andDsCustom1In(List<String> values) {
            addCriterion("ds_custom1 in", values, "dsCustom1");
            return (Criteria) this;
        }

        public Criteria andDsCustom1NotIn(List<String> values) {
            addCriterion("ds_custom1 not in", values, "dsCustom1");
            return (Criteria) this;
        }

        public Criteria andDsCustom1Between(String value1, String value2) {
            addCriterion("ds_custom1 between", value1, value2, "dsCustom1");
            return (Criteria) this;
        }

        public Criteria andDsCustom1NotBetween(String value1, String value2) {
            addCriterion("ds_custom1 not between", value1, value2, "dsCustom1");
            return (Criteria) this;
        }

        public Criteria andDsCustom2IsNull() {
            addCriterion("ds_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andDsCustom2IsNotNull() {
            addCriterion("ds_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andDsCustom2EqualTo(String value) {
            addCriterion("ds_custom2 =", value, "dsCustom2");
            return (Criteria) this;
        }

        public Criteria andDsCustom2NotEqualTo(String value) {
            addCriterion("ds_custom2 <>", value, "dsCustom2");
            return (Criteria) this;
        }

        public Criteria andDsCustom2GreaterThan(String value) {
            addCriterion("ds_custom2 >", value, "dsCustom2");
            return (Criteria) this;
        }

        public Criteria andDsCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("ds_custom2 >=", value, "dsCustom2");
            return (Criteria) this;
        }

        public Criteria andDsCustom2LessThan(String value) {
            addCriterion("ds_custom2 <", value, "dsCustom2");
            return (Criteria) this;
        }

        public Criteria andDsCustom2LessThanOrEqualTo(String value) {
            addCriterion("ds_custom2 <=", value, "dsCustom2");
            return (Criteria) this;
        }

        public Criteria andDsCustom2Like(String value) {
            addCriterion("ds_custom2 like", value, "dsCustom2");
            return (Criteria) this;
        }

        public Criteria andDsCustom2NotLike(String value) {
            addCriterion("ds_custom2 not like", value, "dsCustom2");
            return (Criteria) this;
        }

        public Criteria andDsCustom2In(List<String> values) {
            addCriterion("ds_custom2 in", values, "dsCustom2");
            return (Criteria) this;
        }

        public Criteria andDsCustom2NotIn(List<String> values) {
            addCriterion("ds_custom2 not in", values, "dsCustom2");
            return (Criteria) this;
        }

        public Criteria andDsCustom2Between(String value1, String value2) {
            addCriterion("ds_custom2 between", value1, value2, "dsCustom2");
            return (Criteria) this;
        }

        public Criteria andDsCustom2NotBetween(String value1, String value2) {
            addCriterion("ds_custom2 not between", value1, value2, "dsCustom2");
            return (Criteria) this;
        }

        public Criteria andDsCustom3IsNull() {
            addCriterion("ds_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andDsCustom3IsNotNull() {
            addCriterion("ds_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andDsCustom3EqualTo(String value) {
            addCriterion("ds_custom3 =", value, "dsCustom3");
            return (Criteria) this;
        }

        public Criteria andDsCustom3NotEqualTo(String value) {
            addCriterion("ds_custom3 <>", value, "dsCustom3");
            return (Criteria) this;
        }

        public Criteria andDsCustom3GreaterThan(String value) {
            addCriterion("ds_custom3 >", value, "dsCustom3");
            return (Criteria) this;
        }

        public Criteria andDsCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("ds_custom3 >=", value, "dsCustom3");
            return (Criteria) this;
        }

        public Criteria andDsCustom3LessThan(String value) {
            addCriterion("ds_custom3 <", value, "dsCustom3");
            return (Criteria) this;
        }

        public Criteria andDsCustom3LessThanOrEqualTo(String value) {
            addCriterion("ds_custom3 <=", value, "dsCustom3");
            return (Criteria) this;
        }

        public Criteria andDsCustom3Like(String value) {
            addCriterion("ds_custom3 like", value, "dsCustom3");
            return (Criteria) this;
        }

        public Criteria andDsCustom3NotLike(String value) {
            addCriterion("ds_custom3 not like", value, "dsCustom3");
            return (Criteria) this;
        }

        public Criteria andDsCustom3In(List<String> values) {
            addCriterion("ds_custom3 in", values, "dsCustom3");
            return (Criteria) this;
        }

        public Criteria andDsCustom3NotIn(List<String> values) {
            addCriterion("ds_custom3 not in", values, "dsCustom3");
            return (Criteria) this;
        }

        public Criteria andDsCustom3Between(String value1, String value2) {
            addCriterion("ds_custom3 between", value1, value2, "dsCustom3");
            return (Criteria) this;
        }

        public Criteria andDsCustom3NotBetween(String value1, String value2) {
            addCriterion("ds_custom3 not between", value1, value2, "dsCustom3");
            return (Criteria) this;
        }

        public Criteria andDsCustom4IsNull() {
            addCriterion("ds_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andDsCustom4IsNotNull() {
            addCriterion("ds_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andDsCustom4EqualTo(String value) {
            addCriterion("ds_custom4 =", value, "dsCustom4");
            return (Criteria) this;
        }

        public Criteria andDsCustom4NotEqualTo(String value) {
            addCriterion("ds_custom4 <>", value, "dsCustom4");
            return (Criteria) this;
        }

        public Criteria andDsCustom4GreaterThan(String value) {
            addCriterion("ds_custom4 >", value, "dsCustom4");
            return (Criteria) this;
        }

        public Criteria andDsCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("ds_custom4 >=", value, "dsCustom4");
            return (Criteria) this;
        }

        public Criteria andDsCustom4LessThan(String value) {
            addCriterion("ds_custom4 <", value, "dsCustom4");
            return (Criteria) this;
        }

        public Criteria andDsCustom4LessThanOrEqualTo(String value) {
            addCriterion("ds_custom4 <=", value, "dsCustom4");
            return (Criteria) this;
        }

        public Criteria andDsCustom4Like(String value) {
            addCriterion("ds_custom4 like", value, "dsCustom4");
            return (Criteria) this;
        }

        public Criteria andDsCustom4NotLike(String value) {
            addCriterion("ds_custom4 not like", value, "dsCustom4");
            return (Criteria) this;
        }

        public Criteria andDsCustom4In(List<String> values) {
            addCriterion("ds_custom4 in", values, "dsCustom4");
            return (Criteria) this;
        }

        public Criteria andDsCustom4NotIn(List<String> values) {
            addCriterion("ds_custom4 not in", values, "dsCustom4");
            return (Criteria) this;
        }

        public Criteria andDsCustom4Between(String value1, String value2) {
            addCriterion("ds_custom4 between", value1, value2, "dsCustom4");
            return (Criteria) this;
        }

        public Criteria andDsCustom4NotBetween(String value1, String value2) {
            addCriterion("ds_custom4 not between", value1, value2, "dsCustom4");
            return (Criteria) this;
        }

        public Criteria andDsCustom5IsNull() {
            addCriterion("ds_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andDsCustom5IsNotNull() {
            addCriterion("ds_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andDsCustom5EqualTo(String value) {
            addCriterion("ds_custom5 =", value, "dsCustom5");
            return (Criteria) this;
        }

        public Criteria andDsCustom5NotEqualTo(String value) {
            addCriterion("ds_custom5 <>", value, "dsCustom5");
            return (Criteria) this;
        }

        public Criteria andDsCustom5GreaterThan(String value) {
            addCriterion("ds_custom5 >", value, "dsCustom5");
            return (Criteria) this;
        }

        public Criteria andDsCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("ds_custom5 >=", value, "dsCustom5");
            return (Criteria) this;
        }

        public Criteria andDsCustom5LessThan(String value) {
            addCriterion("ds_custom5 <", value, "dsCustom5");
            return (Criteria) this;
        }

        public Criteria andDsCustom5LessThanOrEqualTo(String value) {
            addCriterion("ds_custom5 <=", value, "dsCustom5");
            return (Criteria) this;
        }

        public Criteria andDsCustom5Like(String value) {
            addCriterion("ds_custom5 like", value, "dsCustom5");
            return (Criteria) this;
        }

        public Criteria andDsCustom5NotLike(String value) {
            addCriterion("ds_custom5 not like", value, "dsCustom5");
            return (Criteria) this;
        }

        public Criteria andDsCustom5In(List<String> values) {
            addCriterion("ds_custom5 in", values, "dsCustom5");
            return (Criteria) this;
        }

        public Criteria andDsCustom5NotIn(List<String> values) {
            addCriterion("ds_custom5 not in", values, "dsCustom5");
            return (Criteria) this;
        }

        public Criteria andDsCustom5Between(String value1, String value2) {
            addCriterion("ds_custom5 between", value1, value2, "dsCustom5");
            return (Criteria) this;
        }

        public Criteria andDsCustom5NotBetween(String value1, String value2) {
            addCriterion("ds_custom5 not between", value1, value2, "dsCustom5");
            return (Criteria) this;
        }

        public Criteria andDsCustom6IsNull() {
            addCriterion("ds_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andDsCustom6IsNotNull() {
            addCriterion("ds_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andDsCustom6EqualTo(String value) {
            addCriterion("ds_custom6 =", value, "dsCustom6");
            return (Criteria) this;
        }

        public Criteria andDsCustom6NotEqualTo(String value) {
            addCriterion("ds_custom6 <>", value, "dsCustom6");
            return (Criteria) this;
        }

        public Criteria andDsCustom6GreaterThan(String value) {
            addCriterion("ds_custom6 >", value, "dsCustom6");
            return (Criteria) this;
        }

        public Criteria andDsCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("ds_custom6 >=", value, "dsCustom6");
            return (Criteria) this;
        }

        public Criteria andDsCustom6LessThan(String value) {
            addCriterion("ds_custom6 <", value, "dsCustom6");
            return (Criteria) this;
        }

        public Criteria andDsCustom6LessThanOrEqualTo(String value) {
            addCriterion("ds_custom6 <=", value, "dsCustom6");
            return (Criteria) this;
        }

        public Criteria andDsCustom6Like(String value) {
            addCriterion("ds_custom6 like", value, "dsCustom6");
            return (Criteria) this;
        }

        public Criteria andDsCustom6NotLike(String value) {
            addCriterion("ds_custom6 not like", value, "dsCustom6");
            return (Criteria) this;
        }

        public Criteria andDsCustom6In(List<String> values) {
            addCriterion("ds_custom6 in", values, "dsCustom6");
            return (Criteria) this;
        }

        public Criteria andDsCustom6NotIn(List<String> values) {
            addCriterion("ds_custom6 not in", values, "dsCustom6");
            return (Criteria) this;
        }

        public Criteria andDsCustom6Between(String value1, String value2) {
            addCriterion("ds_custom6 between", value1, value2, "dsCustom6");
            return (Criteria) this;
        }

        public Criteria andDsCustom6NotBetween(String value1, String value2) {
            addCriterion("ds_custom6 not between", value1, value2, "dsCustom6");
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