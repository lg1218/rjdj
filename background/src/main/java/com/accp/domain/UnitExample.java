package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class UnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UnitExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUEnameIsNull() {
            addCriterion("u_ename is null");
            return (Criteria) this;
        }

        public Criteria andUEnameIsNotNull() {
            addCriterion("u_ename is not null");
            return (Criteria) this;
        }

        public Criteria andUEnameEqualTo(String value) {
            addCriterion("u_ename =", value, "uEname");
            return (Criteria) this;
        }

        public Criteria andUEnameNotEqualTo(String value) {
            addCriterion("u_ename <>", value, "uEname");
            return (Criteria) this;
        }

        public Criteria andUEnameGreaterThan(String value) {
            addCriterion("u_ename >", value, "uEname");
            return (Criteria) this;
        }

        public Criteria andUEnameGreaterThanOrEqualTo(String value) {
            addCriterion("u_ename >=", value, "uEname");
            return (Criteria) this;
        }

        public Criteria andUEnameLessThan(String value) {
            addCriterion("u_ename <", value, "uEname");
            return (Criteria) this;
        }

        public Criteria andUEnameLessThanOrEqualTo(String value) {
            addCriterion("u_ename <=", value, "uEname");
            return (Criteria) this;
        }

        public Criteria andUEnameLike(String value) {
            addCriterion("u_ename like", value, "uEname");
            return (Criteria) this;
        }

        public Criteria andUEnameNotLike(String value) {
            addCriterion("u_ename not like", value, "uEname");
            return (Criteria) this;
        }

        public Criteria andUEnameIn(List<String> values) {
            addCriterion("u_ename in", values, "uEname");
            return (Criteria) this;
        }

        public Criteria andUEnameNotIn(List<String> values) {
            addCriterion("u_ename not in", values, "uEname");
            return (Criteria) this;
        }

        public Criteria andUEnameBetween(String value1, String value2) {
            addCriterion("u_ename between", value1, value2, "uEname");
            return (Criteria) this;
        }

        public Criteria andUEnameNotBetween(String value1, String value2) {
            addCriterion("u_ename not between", value1, value2, "uEname");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andBz1IsNull() {
            addCriterion("bz1 is null");
            return (Criteria) this;
        }

        public Criteria andBz1IsNotNull() {
            addCriterion("bz1 is not null");
            return (Criteria) this;
        }

        public Criteria andBz1EqualTo(String value) {
            addCriterion("bz1 =", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotEqualTo(String value) {
            addCriterion("bz1 <>", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThan(String value) {
            addCriterion("bz1 >", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThanOrEqualTo(String value) {
            addCriterion("bz1 >=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThan(String value) {
            addCriterion("bz1 <", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThanOrEqualTo(String value) {
            addCriterion("bz1 <=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1Like(String value) {
            addCriterion("bz1 like", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotLike(String value) {
            addCriterion("bz1 not like", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1In(List<String> values) {
            addCriterion("bz1 in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotIn(List<String> values) {
            addCriterion("bz1 not in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1Between(String value1, String value2) {
            addCriterion("bz1 between", value1, value2, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotBetween(String value1, String value2) {
            addCriterion("bz1 not between", value1, value2, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz2IsNull() {
            addCriterion("bz2 is null");
            return (Criteria) this;
        }

        public Criteria andBz2IsNotNull() {
            addCriterion("bz2 is not null");
            return (Criteria) this;
        }

        public Criteria andBz2EqualTo(String value) {
            addCriterion("bz2 =", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotEqualTo(String value) {
            addCriterion("bz2 <>", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2GreaterThan(String value) {
            addCriterion("bz2 >", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2GreaterThanOrEqualTo(String value) {
            addCriterion("bz2 >=", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2LessThan(String value) {
            addCriterion("bz2 <", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2LessThanOrEqualTo(String value) {
            addCriterion("bz2 <=", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2Like(String value) {
            addCriterion("bz2 like", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotLike(String value) {
            addCriterion("bz2 not like", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2In(List<String> values) {
            addCriterion("bz2 in", values, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotIn(List<String> values) {
            addCriterion("bz2 not in", values, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2Between(String value1, String value2) {
            addCriterion("bz2 between", value1, value2, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotBetween(String value1, String value2) {
            addCriterion("bz2 not between", value1, value2, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz3IsNull() {
            addCriterion("bz3 is null");
            return (Criteria) this;
        }

        public Criteria andBz3IsNotNull() {
            addCriterion("bz3 is not null");
            return (Criteria) this;
        }

        public Criteria andBz3EqualTo(String value) {
            addCriterion("bz3 =", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotEqualTo(String value) {
            addCriterion("bz3 <>", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3GreaterThan(String value) {
            addCriterion("bz3 >", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3GreaterThanOrEqualTo(String value) {
            addCriterion("bz3 >=", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3LessThan(String value) {
            addCriterion("bz3 <", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3LessThanOrEqualTo(String value) {
            addCriterion("bz3 <=", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3Like(String value) {
            addCriterion("bz3 like", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotLike(String value) {
            addCriterion("bz3 not like", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3In(List<String> values) {
            addCriterion("bz3 in", values, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotIn(List<String> values) {
            addCriterion("bz3 not in", values, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3Between(String value1, String value2) {
            addCriterion("bz3 between", value1, value2, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotBetween(String value1, String value2) {
            addCriterion("bz3 not between", value1, value2, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz4IsNull() {
            addCriterion("bz4 is null");
            return (Criteria) this;
        }

        public Criteria andBz4IsNotNull() {
            addCriterion("bz4 is not null");
            return (Criteria) this;
        }

        public Criteria andBz4EqualTo(String value) {
            addCriterion("bz4 =", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4NotEqualTo(String value) {
            addCriterion("bz4 <>", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4GreaterThan(String value) {
            addCriterion("bz4 >", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4GreaterThanOrEqualTo(String value) {
            addCriterion("bz4 >=", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4LessThan(String value) {
            addCriterion("bz4 <", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4LessThanOrEqualTo(String value) {
            addCriterion("bz4 <=", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4Like(String value) {
            addCriterion("bz4 like", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4NotLike(String value) {
            addCriterion("bz4 not like", value, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4In(List<String> values) {
            addCriterion("bz4 in", values, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4NotIn(List<String> values) {
            addCriterion("bz4 not in", values, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4Between(String value1, String value2) {
            addCriterion("bz4 between", value1, value2, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz4NotBetween(String value1, String value2) {
            addCriterion("bz4 not between", value1, value2, "bz4");
            return (Criteria) this;
        }

        public Criteria andBz5IsNull() {
            addCriterion("bz5 is null");
            return (Criteria) this;
        }

        public Criteria andBz5IsNotNull() {
            addCriterion("bz5 is not null");
            return (Criteria) this;
        }

        public Criteria andBz5EqualTo(String value) {
            addCriterion("bz5 =", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5NotEqualTo(String value) {
            addCriterion("bz5 <>", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5GreaterThan(String value) {
            addCriterion("bz5 >", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5GreaterThanOrEqualTo(String value) {
            addCriterion("bz5 >=", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5LessThan(String value) {
            addCriterion("bz5 <", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5LessThanOrEqualTo(String value) {
            addCriterion("bz5 <=", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5Like(String value) {
            addCriterion("bz5 like", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5NotLike(String value) {
            addCriterion("bz5 not like", value, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5In(List<String> values) {
            addCriterion("bz5 in", values, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5NotIn(List<String> values) {
            addCriterion("bz5 not in", values, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5Between(String value1, String value2) {
            addCriterion("bz5 between", value1, value2, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz5NotBetween(String value1, String value2) {
            addCriterion("bz5 not between", value1, value2, "bz5");
            return (Criteria) this;
        }

        public Criteria andBz6IsNull() {
            addCriterion("bz6 is null");
            return (Criteria) this;
        }

        public Criteria andBz6IsNotNull() {
            addCriterion("bz6 is not null");
            return (Criteria) this;
        }

        public Criteria andBz6EqualTo(String value) {
            addCriterion("bz6 =", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6NotEqualTo(String value) {
            addCriterion("bz6 <>", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6GreaterThan(String value) {
            addCriterion("bz6 >", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6GreaterThanOrEqualTo(String value) {
            addCriterion("bz6 >=", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6LessThan(String value) {
            addCriterion("bz6 <", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6LessThanOrEqualTo(String value) {
            addCriterion("bz6 <=", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6Like(String value) {
            addCriterion("bz6 like", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6NotLike(String value) {
            addCriterion("bz6 not like", value, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6In(List<String> values) {
            addCriterion("bz6 in", values, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6NotIn(List<String> values) {
            addCriterion("bz6 not in", values, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6Between(String value1, String value2) {
            addCriterion("bz6 between", value1, value2, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz6NotBetween(String value1, String value2) {
            addCriterion("bz6 not between", value1, value2, "bz6");
            return (Criteria) this;
        }

        public Criteria andBz7IsNull() {
            addCriterion("bz7 is null");
            return (Criteria) this;
        }

        public Criteria andBz7IsNotNull() {
            addCriterion("bz7 is not null");
            return (Criteria) this;
        }

        public Criteria andBz7EqualTo(String value) {
            addCriterion("bz7 =", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7NotEqualTo(String value) {
            addCriterion("bz7 <>", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7GreaterThan(String value) {
            addCriterion("bz7 >", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7GreaterThanOrEqualTo(String value) {
            addCriterion("bz7 >=", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7LessThan(String value) {
            addCriterion("bz7 <", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7LessThanOrEqualTo(String value) {
            addCriterion("bz7 <=", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7Like(String value) {
            addCriterion("bz7 like", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7NotLike(String value) {
            addCriterion("bz7 not like", value, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7In(List<String> values) {
            addCriterion("bz7 in", values, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7NotIn(List<String> values) {
            addCriterion("bz7 not in", values, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7Between(String value1, String value2) {
            addCriterion("bz7 between", value1, value2, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz7NotBetween(String value1, String value2) {
            addCriterion("bz7 not between", value1, value2, "bz7");
            return (Criteria) this;
        }

        public Criteria andBz8IsNull() {
            addCriterion("bz8 is null");
            return (Criteria) this;
        }

        public Criteria andBz8IsNotNull() {
            addCriterion("bz8 is not null");
            return (Criteria) this;
        }

        public Criteria andBz8EqualTo(String value) {
            addCriterion("bz8 =", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8NotEqualTo(String value) {
            addCriterion("bz8 <>", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8GreaterThan(String value) {
            addCriterion("bz8 >", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8GreaterThanOrEqualTo(String value) {
            addCriterion("bz8 >=", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8LessThan(String value) {
            addCriterion("bz8 <", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8LessThanOrEqualTo(String value) {
            addCriterion("bz8 <=", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8Like(String value) {
            addCriterion("bz8 like", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8NotLike(String value) {
            addCriterion("bz8 not like", value, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8In(List<String> values) {
            addCriterion("bz8 in", values, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8NotIn(List<String> values) {
            addCriterion("bz8 not in", values, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8Between(String value1, String value2) {
            addCriterion("bz8 between", value1, value2, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz8NotBetween(String value1, String value2) {
            addCriterion("bz8 not between", value1, value2, "bz8");
            return (Criteria) this;
        }

        public Criteria andBz9IsNull() {
            addCriterion("bz9 is null");
            return (Criteria) this;
        }

        public Criteria andBz9IsNotNull() {
            addCriterion("bz9 is not null");
            return (Criteria) this;
        }

        public Criteria andBz9EqualTo(String value) {
            addCriterion("bz9 =", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9NotEqualTo(String value) {
            addCriterion("bz9 <>", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9GreaterThan(String value) {
            addCriterion("bz9 >", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9GreaterThanOrEqualTo(String value) {
            addCriterion("bz9 >=", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9LessThan(String value) {
            addCriterion("bz9 <", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9LessThanOrEqualTo(String value) {
            addCriterion("bz9 <=", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9Like(String value) {
            addCriterion("bz9 like", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9NotLike(String value) {
            addCriterion("bz9 not like", value, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9In(List<String> values) {
            addCriterion("bz9 in", values, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9NotIn(List<String> values) {
            addCriterion("bz9 not in", values, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9Between(String value1, String value2) {
            addCriterion("bz9 between", value1, value2, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz9NotBetween(String value1, String value2) {
            addCriterion("bz9 not between", value1, value2, "bz9");
            return (Criteria) this;
        }

        public Criteria andBz10IsNull() {
            addCriterion("bz10 is null");
            return (Criteria) this;
        }

        public Criteria andBz10IsNotNull() {
            addCriterion("bz10 is not null");
            return (Criteria) this;
        }

        public Criteria andBz10EqualTo(String value) {
            addCriterion("bz10 =", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10NotEqualTo(String value) {
            addCriterion("bz10 <>", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10GreaterThan(String value) {
            addCriterion("bz10 >", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10GreaterThanOrEqualTo(String value) {
            addCriterion("bz10 >=", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10LessThan(String value) {
            addCriterion("bz10 <", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10LessThanOrEqualTo(String value) {
            addCriterion("bz10 <=", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10Like(String value) {
            addCriterion("bz10 like", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10NotLike(String value) {
            addCriterion("bz10 not like", value, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10In(List<String> values) {
            addCriterion("bz10 in", values, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10NotIn(List<String> values) {
            addCriterion("bz10 not in", values, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10Between(String value1, String value2) {
            addCriterion("bz10 between", value1, value2, "bz10");
            return (Criteria) this;
        }

        public Criteria andBz10NotBetween(String value1, String value2) {
            addCriterion("bz10 not between", value1, value2, "bz10");
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