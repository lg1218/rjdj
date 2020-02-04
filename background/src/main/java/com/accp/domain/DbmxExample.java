package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class DbmxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbmxExample() {
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

        public Criteria andDbmxidIsNull() {
            addCriterion("dbmxid is null");
            return (Criteria) this;
        }

        public Criteria andDbmxidIsNotNull() {
            addCriterion("dbmxid is not null");
            return (Criteria) this;
        }

        public Criteria andDbmxidEqualTo(Integer value) {
            addCriterion("dbmxid =", value, "dbmxid");
            return (Criteria) this;
        }

        public Criteria andDbmxidNotEqualTo(Integer value) {
            addCriterion("dbmxid <>", value, "dbmxid");
            return (Criteria) this;
        }

        public Criteria andDbmxidGreaterThan(Integer value) {
            addCriterion("dbmxid >", value, "dbmxid");
            return (Criteria) this;
        }

        public Criteria andDbmxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dbmxid >=", value, "dbmxid");
            return (Criteria) this;
        }

        public Criteria andDbmxidLessThan(Integer value) {
            addCriterion("dbmxid <", value, "dbmxid");
            return (Criteria) this;
        }

        public Criteria andDbmxidLessThanOrEqualTo(Integer value) {
            addCriterion("dbmxid <=", value, "dbmxid");
            return (Criteria) this;
        }

        public Criteria andDbmxidIn(List<Integer> values) {
            addCriterion("dbmxid in", values, "dbmxid");
            return (Criteria) this;
        }

        public Criteria andDbmxidNotIn(List<Integer> values) {
            addCriterion("dbmxid not in", values, "dbmxid");
            return (Criteria) this;
        }

        public Criteria andDbmxidBetween(Integer value1, Integer value2) {
            addCriterion("dbmxid between", value1, value2, "dbmxid");
            return (Criteria) this;
        }

        public Criteria andDbmxidNotBetween(Integer value1, Integer value2) {
            addCriterion("dbmxid not between", value1, value2, "dbmxid");
            return (Criteria) this;
        }

        public Criteria andDbidIsNull() {
            addCriterion("dbid is null");
            return (Criteria) this;
        }

        public Criteria andDbidIsNotNull() {
            addCriterion("dbid is not null");
            return (Criteria) this;
        }

        public Criteria andDbidEqualTo(String value) {
            addCriterion("dbid =", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotEqualTo(String value) {
            addCriterion("dbid <>", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidGreaterThan(String value) {
            addCriterion("dbid >", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidGreaterThanOrEqualTo(String value) {
            addCriterion("dbid >=", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidLessThan(String value) {
            addCriterion("dbid <", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidLessThanOrEqualTo(String value) {
            addCriterion("dbid <=", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidLike(String value) {
            addCriterion("dbid like", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotLike(String value) {
            addCriterion("dbid not like", value, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidIn(List<String> values) {
            addCriterion("dbid in", values, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotIn(List<String> values) {
            addCriterion("dbid not in", values, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidBetween(String value1, String value2) {
            addCriterion("dbid between", value1, value2, "dbid");
            return (Criteria) this;
        }

        public Criteria andDbidNotBetween(String value1, String value2) {
            addCriterion("dbid not between", value1, value2, "dbid");
            return (Criteria) this;
        }

        public Criteria andEntifieridIsNull() {
            addCriterion("entifierid is null");
            return (Criteria) this;
        }

        public Criteria andEntifieridIsNotNull() {
            addCriterion("entifierid is not null");
            return (Criteria) this;
        }

        public Criteria andEntifieridEqualTo(String value) {
            addCriterion("entifierid =", value, "entifierid");
            return (Criteria) this;
        }

        public Criteria andEntifieridNotEqualTo(String value) {
            addCriterion("entifierid <>", value, "entifierid");
            return (Criteria) this;
        }

        public Criteria andEntifieridGreaterThan(String value) {
            addCriterion("entifierid >", value, "entifierid");
            return (Criteria) this;
        }

        public Criteria andEntifieridGreaterThanOrEqualTo(String value) {
            addCriterion("entifierid >=", value, "entifierid");
            return (Criteria) this;
        }

        public Criteria andEntifieridLessThan(String value) {
            addCriterion("entifierid <", value, "entifierid");
            return (Criteria) this;
        }

        public Criteria andEntifieridLessThanOrEqualTo(String value) {
            addCriterion("entifierid <=", value, "entifierid");
            return (Criteria) this;
        }

        public Criteria andEntifieridLike(String value) {
            addCriterion("entifierid like", value, "entifierid");
            return (Criteria) this;
        }

        public Criteria andEntifieridNotLike(String value) {
            addCriterion("entifierid not like", value, "entifierid");
            return (Criteria) this;
        }

        public Criteria andEntifieridIn(List<String> values) {
            addCriterion("entifierid in", values, "entifierid");
            return (Criteria) this;
        }

        public Criteria andEntifieridNotIn(List<String> values) {
            addCriterion("entifierid not in", values, "entifierid");
            return (Criteria) this;
        }

        public Criteria andEntifieridBetween(String value1, String value2) {
            addCriterion("entifierid between", value1, value2, "entifierid");
            return (Criteria) this;
        }

        public Criteria andEntifieridNotBetween(String value1, String value2) {
            addCriterion("entifierid not between", value1, value2, "entifierid");
            return (Criteria) this;
        }

        public Criteria andDbmxwlnameIsNull() {
            addCriterion("dbmxwlname is null");
            return (Criteria) this;
        }

        public Criteria andDbmxwlnameIsNotNull() {
            addCriterion("dbmxwlname is not null");
            return (Criteria) this;
        }

        public Criteria andDbmxwlnameEqualTo(String value) {
            addCriterion("dbmxwlname =", value, "dbmxwlname");
            return (Criteria) this;
        }

        public Criteria andDbmxwlnameNotEqualTo(String value) {
            addCriterion("dbmxwlname <>", value, "dbmxwlname");
            return (Criteria) this;
        }

        public Criteria andDbmxwlnameGreaterThan(String value) {
            addCriterion("dbmxwlname >", value, "dbmxwlname");
            return (Criteria) this;
        }

        public Criteria andDbmxwlnameGreaterThanOrEqualTo(String value) {
            addCriterion("dbmxwlname >=", value, "dbmxwlname");
            return (Criteria) this;
        }

        public Criteria andDbmxwlnameLessThan(String value) {
            addCriterion("dbmxwlname <", value, "dbmxwlname");
            return (Criteria) this;
        }

        public Criteria andDbmxwlnameLessThanOrEqualTo(String value) {
            addCriterion("dbmxwlname <=", value, "dbmxwlname");
            return (Criteria) this;
        }

        public Criteria andDbmxwlnameLike(String value) {
            addCriterion("dbmxwlname like", value, "dbmxwlname");
            return (Criteria) this;
        }

        public Criteria andDbmxwlnameNotLike(String value) {
            addCriterion("dbmxwlname not like", value, "dbmxwlname");
            return (Criteria) this;
        }

        public Criteria andDbmxwlnameIn(List<String> values) {
            addCriterion("dbmxwlname in", values, "dbmxwlname");
            return (Criteria) this;
        }

        public Criteria andDbmxwlnameNotIn(List<String> values) {
            addCriterion("dbmxwlname not in", values, "dbmxwlname");
            return (Criteria) this;
        }

        public Criteria andDbmxwlnameBetween(String value1, String value2) {
            addCriterion("dbmxwlname between", value1, value2, "dbmxwlname");
            return (Criteria) this;
        }

        public Criteria andDbmxwlnameNotBetween(String value1, String value2) {
            addCriterion("dbmxwlname not between", value1, value2, "dbmxwlname");
            return (Criteria) this;
        }

        public Criteria andDbmxggxhIsNull() {
            addCriterion("dbmxggxh is null");
            return (Criteria) this;
        }

        public Criteria andDbmxggxhIsNotNull() {
            addCriterion("dbmxggxh is not null");
            return (Criteria) this;
        }

        public Criteria andDbmxggxhEqualTo(String value) {
            addCriterion("dbmxggxh =", value, "dbmxggxh");
            return (Criteria) this;
        }

        public Criteria andDbmxggxhNotEqualTo(String value) {
            addCriterion("dbmxggxh <>", value, "dbmxggxh");
            return (Criteria) this;
        }

        public Criteria andDbmxggxhGreaterThan(String value) {
            addCriterion("dbmxggxh >", value, "dbmxggxh");
            return (Criteria) this;
        }

        public Criteria andDbmxggxhGreaterThanOrEqualTo(String value) {
            addCriterion("dbmxggxh >=", value, "dbmxggxh");
            return (Criteria) this;
        }

        public Criteria andDbmxggxhLessThan(String value) {
            addCriterion("dbmxggxh <", value, "dbmxggxh");
            return (Criteria) this;
        }

        public Criteria andDbmxggxhLessThanOrEqualTo(String value) {
            addCriterion("dbmxggxh <=", value, "dbmxggxh");
            return (Criteria) this;
        }

        public Criteria andDbmxggxhLike(String value) {
            addCriterion("dbmxggxh like", value, "dbmxggxh");
            return (Criteria) this;
        }

        public Criteria andDbmxggxhNotLike(String value) {
            addCriterion("dbmxggxh not like", value, "dbmxggxh");
            return (Criteria) this;
        }

        public Criteria andDbmxggxhIn(List<String> values) {
            addCriterion("dbmxggxh in", values, "dbmxggxh");
            return (Criteria) this;
        }

        public Criteria andDbmxggxhNotIn(List<String> values) {
            addCriterion("dbmxggxh not in", values, "dbmxggxh");
            return (Criteria) this;
        }

        public Criteria andDbmxggxhBetween(String value1, String value2) {
            addCriterion("dbmxggxh between", value1, value2, "dbmxggxh");
            return (Criteria) this;
        }

        public Criteria andDbmxggxhNotBetween(String value1, String value2) {
            addCriterion("dbmxggxh not between", value1, value2, "dbmxggxh");
            return (Criteria) this;
        }

        public Criteria andDbmxdwIsNull() {
            addCriterion("dbmxdw is null");
            return (Criteria) this;
        }

        public Criteria andDbmxdwIsNotNull() {
            addCriterion("dbmxdw is not null");
            return (Criteria) this;
        }

        public Criteria andDbmxdwEqualTo(String value) {
            addCriterion("dbmxdw =", value, "dbmxdw");
            return (Criteria) this;
        }

        public Criteria andDbmxdwNotEqualTo(String value) {
            addCriterion("dbmxdw <>", value, "dbmxdw");
            return (Criteria) this;
        }

        public Criteria andDbmxdwGreaterThan(String value) {
            addCriterion("dbmxdw >", value, "dbmxdw");
            return (Criteria) this;
        }

        public Criteria andDbmxdwGreaterThanOrEqualTo(String value) {
            addCriterion("dbmxdw >=", value, "dbmxdw");
            return (Criteria) this;
        }

        public Criteria andDbmxdwLessThan(String value) {
            addCriterion("dbmxdw <", value, "dbmxdw");
            return (Criteria) this;
        }

        public Criteria andDbmxdwLessThanOrEqualTo(String value) {
            addCriterion("dbmxdw <=", value, "dbmxdw");
            return (Criteria) this;
        }

        public Criteria andDbmxdwLike(String value) {
            addCriterion("dbmxdw like", value, "dbmxdw");
            return (Criteria) this;
        }

        public Criteria andDbmxdwNotLike(String value) {
            addCriterion("dbmxdw not like", value, "dbmxdw");
            return (Criteria) this;
        }

        public Criteria andDbmxdwIn(List<String> values) {
            addCriterion("dbmxdw in", values, "dbmxdw");
            return (Criteria) this;
        }

        public Criteria andDbmxdwNotIn(List<String> values) {
            addCriterion("dbmxdw not in", values, "dbmxdw");
            return (Criteria) this;
        }

        public Criteria andDbmxdwBetween(String value1, String value2) {
            addCriterion("dbmxdw between", value1, value2, "dbmxdw");
            return (Criteria) this;
        }

        public Criteria andDbmxdwNotBetween(String value1, String value2) {
            addCriterion("dbmxdw not between", value1, value2, "dbmxdw");
            return (Criteria) this;
        }

        public Criteria andDbmxslIsNull() {
            addCriterion("dbmxsl is null");
            return (Criteria) this;
        }

        public Criteria andDbmxslIsNotNull() {
            addCriterion("dbmxsl is not null");
            return (Criteria) this;
        }

        public Criteria andDbmxslEqualTo(Integer value) {
            addCriterion("dbmxsl =", value, "dbmxsl");
            return (Criteria) this;
        }

        public Criteria andDbmxslNotEqualTo(Integer value) {
            addCriterion("dbmxsl <>", value, "dbmxsl");
            return (Criteria) this;
        }

        public Criteria andDbmxslGreaterThan(Integer value) {
            addCriterion("dbmxsl >", value, "dbmxsl");
            return (Criteria) this;
        }

        public Criteria andDbmxslGreaterThanOrEqualTo(Integer value) {
            addCriterion("dbmxsl >=", value, "dbmxsl");
            return (Criteria) this;
        }

        public Criteria andDbmxslLessThan(Integer value) {
            addCriterion("dbmxsl <", value, "dbmxsl");
            return (Criteria) this;
        }

        public Criteria andDbmxslLessThanOrEqualTo(Integer value) {
            addCriterion("dbmxsl <=", value, "dbmxsl");
            return (Criteria) this;
        }

        public Criteria andDbmxslIn(List<Integer> values) {
            addCriterion("dbmxsl in", values, "dbmxsl");
            return (Criteria) this;
        }

        public Criteria andDbmxslNotIn(List<Integer> values) {
            addCriterion("dbmxsl not in", values, "dbmxsl");
            return (Criteria) this;
        }

        public Criteria andDbmxslBetween(Integer value1, Integer value2) {
            addCriterion("dbmxsl between", value1, value2, "dbmxsl");
            return (Criteria) this;
        }

        public Criteria andDbmxslNotBetween(Integer value1, Integer value2) {
            addCriterion("dbmxsl not between", value1, value2, "dbmxsl");
            return (Criteria) this;
        }

        public Criteria andDbmxphIsNull() {
            addCriterion("dbmxph is null");
            return (Criteria) this;
        }

        public Criteria andDbmxphIsNotNull() {
            addCriterion("dbmxph is not null");
            return (Criteria) this;
        }

        public Criteria andDbmxphEqualTo(String value) {
            addCriterion("dbmxph =", value, "dbmxph");
            return (Criteria) this;
        }

        public Criteria andDbmxphNotEqualTo(String value) {
            addCriterion("dbmxph <>", value, "dbmxph");
            return (Criteria) this;
        }

        public Criteria andDbmxphGreaterThan(String value) {
            addCriterion("dbmxph >", value, "dbmxph");
            return (Criteria) this;
        }

        public Criteria andDbmxphGreaterThanOrEqualTo(String value) {
            addCriterion("dbmxph >=", value, "dbmxph");
            return (Criteria) this;
        }

        public Criteria andDbmxphLessThan(String value) {
            addCriterion("dbmxph <", value, "dbmxph");
            return (Criteria) this;
        }

        public Criteria andDbmxphLessThanOrEqualTo(String value) {
            addCriterion("dbmxph <=", value, "dbmxph");
            return (Criteria) this;
        }

        public Criteria andDbmxphLike(String value) {
            addCriterion("dbmxph like", value, "dbmxph");
            return (Criteria) this;
        }

        public Criteria andDbmxphNotLike(String value) {
            addCriterion("dbmxph not like", value, "dbmxph");
            return (Criteria) this;
        }

        public Criteria andDbmxphIn(List<String> values) {
            addCriterion("dbmxph in", values, "dbmxph");
            return (Criteria) this;
        }

        public Criteria andDbmxphNotIn(List<String> values) {
            addCriterion("dbmxph not in", values, "dbmxph");
            return (Criteria) this;
        }

        public Criteria andDbmxphBetween(String value1, String value2) {
            addCriterion("dbmxph between", value1, value2, "dbmxph");
            return (Criteria) this;
        }

        public Criteria andDbmxphNotBetween(String value1, String value2) {
            addCriterion("dbmxph not between", value1, value2, "dbmxph");
            return (Criteria) this;
        }

        public Criteria andDbmxflbzIsNull() {
            addCriterion("dbmxflbz is null");
            return (Criteria) this;
        }

        public Criteria andDbmxflbzIsNotNull() {
            addCriterion("dbmxflbz is not null");
            return (Criteria) this;
        }

        public Criteria andDbmxflbzEqualTo(String value) {
            addCriterion("dbmxflbz =", value, "dbmxflbz");
            return (Criteria) this;
        }

        public Criteria andDbmxflbzNotEqualTo(String value) {
            addCriterion("dbmxflbz <>", value, "dbmxflbz");
            return (Criteria) this;
        }

        public Criteria andDbmxflbzGreaterThan(String value) {
            addCriterion("dbmxflbz >", value, "dbmxflbz");
            return (Criteria) this;
        }

        public Criteria andDbmxflbzGreaterThanOrEqualTo(String value) {
            addCriterion("dbmxflbz >=", value, "dbmxflbz");
            return (Criteria) this;
        }

        public Criteria andDbmxflbzLessThan(String value) {
            addCriterion("dbmxflbz <", value, "dbmxflbz");
            return (Criteria) this;
        }

        public Criteria andDbmxflbzLessThanOrEqualTo(String value) {
            addCriterion("dbmxflbz <=", value, "dbmxflbz");
            return (Criteria) this;
        }

        public Criteria andDbmxflbzLike(String value) {
            addCriterion("dbmxflbz like", value, "dbmxflbz");
            return (Criteria) this;
        }

        public Criteria andDbmxflbzNotLike(String value) {
            addCriterion("dbmxflbz not like", value, "dbmxflbz");
            return (Criteria) this;
        }

        public Criteria andDbmxflbzIn(List<String> values) {
            addCriterion("dbmxflbz in", values, "dbmxflbz");
            return (Criteria) this;
        }

        public Criteria andDbmxflbzNotIn(List<String> values) {
            addCriterion("dbmxflbz not in", values, "dbmxflbz");
            return (Criteria) this;
        }

        public Criteria andDbmxflbzBetween(String value1, String value2) {
            addCriterion("dbmxflbz between", value1, value2, "dbmxflbz");
            return (Criteria) this;
        }

        public Criteria andDbmxflbzNotBetween(String value1, String value2) {
            addCriterion("dbmxflbz not between", value1, value2, "dbmxflbz");
            return (Criteria) this;
        }

        public Criteria andDbmxby1IsNull() {
            addCriterion("dbmxby1 is null");
            return (Criteria) this;
        }

        public Criteria andDbmxby1IsNotNull() {
            addCriterion("dbmxby1 is not null");
            return (Criteria) this;
        }

        public Criteria andDbmxby1EqualTo(String value) {
            addCriterion("dbmxby1 =", value, "dbmxby1");
            return (Criteria) this;
        }

        public Criteria andDbmxby1NotEqualTo(String value) {
            addCriterion("dbmxby1 <>", value, "dbmxby1");
            return (Criteria) this;
        }

        public Criteria andDbmxby1GreaterThan(String value) {
            addCriterion("dbmxby1 >", value, "dbmxby1");
            return (Criteria) this;
        }

        public Criteria andDbmxby1GreaterThanOrEqualTo(String value) {
            addCriterion("dbmxby1 >=", value, "dbmxby1");
            return (Criteria) this;
        }

        public Criteria andDbmxby1LessThan(String value) {
            addCriterion("dbmxby1 <", value, "dbmxby1");
            return (Criteria) this;
        }

        public Criteria andDbmxby1LessThanOrEqualTo(String value) {
            addCriterion("dbmxby1 <=", value, "dbmxby1");
            return (Criteria) this;
        }

        public Criteria andDbmxby1Like(String value) {
            addCriterion("dbmxby1 like", value, "dbmxby1");
            return (Criteria) this;
        }

        public Criteria andDbmxby1NotLike(String value) {
            addCriterion("dbmxby1 not like", value, "dbmxby1");
            return (Criteria) this;
        }

        public Criteria andDbmxby1In(List<String> values) {
            addCriterion("dbmxby1 in", values, "dbmxby1");
            return (Criteria) this;
        }

        public Criteria andDbmxby1NotIn(List<String> values) {
            addCriterion("dbmxby1 not in", values, "dbmxby1");
            return (Criteria) this;
        }

        public Criteria andDbmxby1Between(String value1, String value2) {
            addCriterion("dbmxby1 between", value1, value2, "dbmxby1");
            return (Criteria) this;
        }

        public Criteria andDbmxby1NotBetween(String value1, String value2) {
            addCriterion("dbmxby1 not between", value1, value2, "dbmxby1");
            return (Criteria) this;
        }

        public Criteria andDbmxby2IsNull() {
            addCriterion("dbmxby2 is null");
            return (Criteria) this;
        }

        public Criteria andDbmxby2IsNotNull() {
            addCriterion("dbmxby2 is not null");
            return (Criteria) this;
        }

        public Criteria andDbmxby2EqualTo(String value) {
            addCriterion("dbmxby2 =", value, "dbmxby2");
            return (Criteria) this;
        }

        public Criteria andDbmxby2NotEqualTo(String value) {
            addCriterion("dbmxby2 <>", value, "dbmxby2");
            return (Criteria) this;
        }

        public Criteria andDbmxby2GreaterThan(String value) {
            addCriterion("dbmxby2 >", value, "dbmxby2");
            return (Criteria) this;
        }

        public Criteria andDbmxby2GreaterThanOrEqualTo(String value) {
            addCriterion("dbmxby2 >=", value, "dbmxby2");
            return (Criteria) this;
        }

        public Criteria andDbmxby2LessThan(String value) {
            addCriterion("dbmxby2 <", value, "dbmxby2");
            return (Criteria) this;
        }

        public Criteria andDbmxby2LessThanOrEqualTo(String value) {
            addCriterion("dbmxby2 <=", value, "dbmxby2");
            return (Criteria) this;
        }

        public Criteria andDbmxby2Like(String value) {
            addCriterion("dbmxby2 like", value, "dbmxby2");
            return (Criteria) this;
        }

        public Criteria andDbmxby2NotLike(String value) {
            addCriterion("dbmxby2 not like", value, "dbmxby2");
            return (Criteria) this;
        }

        public Criteria andDbmxby2In(List<String> values) {
            addCriterion("dbmxby2 in", values, "dbmxby2");
            return (Criteria) this;
        }

        public Criteria andDbmxby2NotIn(List<String> values) {
            addCriterion("dbmxby2 not in", values, "dbmxby2");
            return (Criteria) this;
        }

        public Criteria andDbmxby2Between(String value1, String value2) {
            addCriterion("dbmxby2 between", value1, value2, "dbmxby2");
            return (Criteria) this;
        }

        public Criteria andDbmxby2NotBetween(String value1, String value2) {
            addCriterion("dbmxby2 not between", value1, value2, "dbmxby2");
            return (Criteria) this;
        }

        public Criteria andDbmxby3IsNull() {
            addCriterion("dbmxby3 is null");
            return (Criteria) this;
        }

        public Criteria andDbmxby3IsNotNull() {
            addCriterion("dbmxby3 is not null");
            return (Criteria) this;
        }

        public Criteria andDbmxby3EqualTo(String value) {
            addCriterion("dbmxby3 =", value, "dbmxby3");
            return (Criteria) this;
        }

        public Criteria andDbmxby3NotEqualTo(String value) {
            addCriterion("dbmxby3 <>", value, "dbmxby3");
            return (Criteria) this;
        }

        public Criteria andDbmxby3GreaterThan(String value) {
            addCriterion("dbmxby3 >", value, "dbmxby3");
            return (Criteria) this;
        }

        public Criteria andDbmxby3GreaterThanOrEqualTo(String value) {
            addCriterion("dbmxby3 >=", value, "dbmxby3");
            return (Criteria) this;
        }

        public Criteria andDbmxby3LessThan(String value) {
            addCriterion("dbmxby3 <", value, "dbmxby3");
            return (Criteria) this;
        }

        public Criteria andDbmxby3LessThanOrEqualTo(String value) {
            addCriterion("dbmxby3 <=", value, "dbmxby3");
            return (Criteria) this;
        }

        public Criteria andDbmxby3Like(String value) {
            addCriterion("dbmxby3 like", value, "dbmxby3");
            return (Criteria) this;
        }

        public Criteria andDbmxby3NotLike(String value) {
            addCriterion("dbmxby3 not like", value, "dbmxby3");
            return (Criteria) this;
        }

        public Criteria andDbmxby3In(List<String> values) {
            addCriterion("dbmxby3 in", values, "dbmxby3");
            return (Criteria) this;
        }

        public Criteria andDbmxby3NotIn(List<String> values) {
            addCriterion("dbmxby3 not in", values, "dbmxby3");
            return (Criteria) this;
        }

        public Criteria andDbmxby3Between(String value1, String value2) {
            addCriterion("dbmxby3 between", value1, value2, "dbmxby3");
            return (Criteria) this;
        }

        public Criteria andDbmxby3NotBetween(String value1, String value2) {
            addCriterion("dbmxby3 not between", value1, value2, "dbmxby3");
            return (Criteria) this;
        }

        public Criteria andDbmxdbztIsNull() {
            addCriterion("dbmxdbzt is null");
            return (Criteria) this;
        }

        public Criteria andDbmxdbztIsNotNull() {
            addCriterion("dbmxdbzt is not null");
            return (Criteria) this;
        }

        public Criteria andDbmxdbztEqualTo(Integer value) {
            addCriterion("dbmxdbzt =", value, "dbmxdbzt");
            return (Criteria) this;
        }

        public Criteria andDbmxdbztNotEqualTo(Integer value) {
            addCriterion("dbmxdbzt <>", value, "dbmxdbzt");
            return (Criteria) this;
        }

        public Criteria andDbmxdbztGreaterThan(Integer value) {
            addCriterion("dbmxdbzt >", value, "dbmxdbzt");
            return (Criteria) this;
        }

        public Criteria andDbmxdbztGreaterThanOrEqualTo(Integer value) {
            addCriterion("dbmxdbzt >=", value, "dbmxdbzt");
            return (Criteria) this;
        }

        public Criteria andDbmxdbztLessThan(Integer value) {
            addCriterion("dbmxdbzt <", value, "dbmxdbzt");
            return (Criteria) this;
        }

        public Criteria andDbmxdbztLessThanOrEqualTo(Integer value) {
            addCriterion("dbmxdbzt <=", value, "dbmxdbzt");
            return (Criteria) this;
        }

        public Criteria andDbmxdbztIn(List<Integer> values) {
            addCriterion("dbmxdbzt in", values, "dbmxdbzt");
            return (Criteria) this;
        }

        public Criteria andDbmxdbztNotIn(List<Integer> values) {
            addCriterion("dbmxdbzt not in", values, "dbmxdbzt");
            return (Criteria) this;
        }

        public Criteria andDbmxdbztBetween(Integer value1, Integer value2) {
            addCriterion("dbmxdbzt between", value1, value2, "dbmxdbzt");
            return (Criteria) this;
        }

        public Criteria andDbmxdbztNotBetween(Integer value1, Integer value2) {
            addCriterion("dbmxdbzt not between", value1, value2, "dbmxdbzt");
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