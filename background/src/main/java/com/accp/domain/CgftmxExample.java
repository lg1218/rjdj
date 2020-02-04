package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CgftmxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CgftmxExample() {
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

        public Criteria andCgftmxidIsNull() {
            addCriterion("cgftmxid is null");
            return (Criteria) this;
        }

        public Criteria andCgftmxidIsNotNull() {
            addCriterion("cgftmxid is not null");
            return (Criteria) this;
        }

        public Criteria andCgftmxidEqualTo(Integer value) {
            addCriterion("cgftmxid =", value, "cgftmxid");
            return (Criteria) this;
        }

        public Criteria andCgftmxidNotEqualTo(Integer value) {
            addCriterion("cgftmxid <>", value, "cgftmxid");
            return (Criteria) this;
        }

        public Criteria andCgftmxidGreaterThan(Integer value) {
            addCriterion("cgftmxid >", value, "cgftmxid");
            return (Criteria) this;
        }

        public Criteria andCgftmxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cgftmxid >=", value, "cgftmxid");
            return (Criteria) this;
        }

        public Criteria andCgftmxidLessThan(Integer value) {
            addCriterion("cgftmxid <", value, "cgftmxid");
            return (Criteria) this;
        }

        public Criteria andCgftmxidLessThanOrEqualTo(Integer value) {
            addCriterion("cgftmxid <=", value, "cgftmxid");
            return (Criteria) this;
        }

        public Criteria andCgftmxidIn(List<Integer> values) {
            addCriterion("cgftmxid in", values, "cgftmxid");
            return (Criteria) this;
        }

        public Criteria andCgftmxidNotIn(List<Integer> values) {
            addCriterion("cgftmxid not in", values, "cgftmxid");
            return (Criteria) this;
        }

        public Criteria andCgftmxidBetween(Integer value1, Integer value2) {
            addCriterion("cgftmxid between", value1, value2, "cgftmxid");
            return (Criteria) this;
        }

        public Criteria andCgftmxidNotBetween(Integer value1, Integer value2) {
            addCriterion("cgftmxid not between", value1, value2, "cgftmxid");
            return (Criteria) this;
        }

        public Criteria andCgftidIsNull() {
            addCriterion("cgftid is null");
            return (Criteria) this;
        }

        public Criteria andCgftidIsNotNull() {
            addCriterion("cgftid is not null");
            return (Criteria) this;
        }

        public Criteria andCgftidEqualTo(String value) {
            addCriterion("cgftid =", value, "cgftid");
            return (Criteria) this;
        }

        public Criteria andCgftidNotEqualTo(String value) {
            addCriterion("cgftid <>", value, "cgftid");
            return (Criteria) this;
        }

        public Criteria andCgftidGreaterThan(String value) {
            addCriterion("cgftid >", value, "cgftid");
            return (Criteria) this;
        }

        public Criteria andCgftidGreaterThanOrEqualTo(String value) {
            addCriterion("cgftid >=", value, "cgftid");
            return (Criteria) this;
        }

        public Criteria andCgftidLessThan(String value) {
            addCriterion("cgftid <", value, "cgftid");
            return (Criteria) this;
        }

        public Criteria andCgftidLessThanOrEqualTo(String value) {
            addCriterion("cgftid <=", value, "cgftid");
            return (Criteria) this;
        }

        public Criteria andCgftidLike(String value) {
            addCriterion("cgftid like", value, "cgftid");
            return (Criteria) this;
        }

        public Criteria andCgftidNotLike(String value) {
            addCriterion("cgftid not like", value, "cgftid");
            return (Criteria) this;
        }

        public Criteria andCgftidIn(List<String> values) {
            addCriterion("cgftid in", values, "cgftid");
            return (Criteria) this;
        }

        public Criteria andCgftidNotIn(List<String> values) {
            addCriterion("cgftid not in", values, "cgftid");
            return (Criteria) this;
        }

        public Criteria andCgftidBetween(String value1, String value2) {
            addCriterion("cgftid between", value1, value2, "cgftid");
            return (Criteria) this;
        }

        public Criteria andCgftidNotBetween(String value1, String value2) {
            addCriterion("cgftid not between", value1, value2, "cgftid");
            return (Criteria) this;
        }

        public Criteria andCgftmxfyidIsNull() {
            addCriterion("cgftmxfyid is null");
            return (Criteria) this;
        }

        public Criteria andCgftmxfyidIsNotNull() {
            addCriterion("cgftmxfyid is not null");
            return (Criteria) this;
        }

        public Criteria andCgftmxfyidEqualTo(Integer value) {
            addCriterion("cgftmxfyid =", value, "cgftmxfyid");
            return (Criteria) this;
        }

        public Criteria andCgftmxfyidNotEqualTo(Integer value) {
            addCriterion("cgftmxfyid <>", value, "cgftmxfyid");
            return (Criteria) this;
        }

        public Criteria andCgftmxfyidGreaterThan(Integer value) {
            addCriterion("cgftmxfyid >", value, "cgftmxfyid");
            return (Criteria) this;
        }

        public Criteria andCgftmxfyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cgftmxfyid >=", value, "cgftmxfyid");
            return (Criteria) this;
        }

        public Criteria andCgftmxfyidLessThan(Integer value) {
            addCriterion("cgftmxfyid <", value, "cgftmxfyid");
            return (Criteria) this;
        }

        public Criteria andCgftmxfyidLessThanOrEqualTo(Integer value) {
            addCriterion("cgftmxfyid <=", value, "cgftmxfyid");
            return (Criteria) this;
        }

        public Criteria andCgftmxfyidIn(List<Integer> values) {
            addCriterion("cgftmxfyid in", values, "cgftmxfyid");
            return (Criteria) this;
        }

        public Criteria andCgftmxfyidNotIn(List<Integer> values) {
            addCriterion("cgftmxfyid not in", values, "cgftmxfyid");
            return (Criteria) this;
        }

        public Criteria andCgftmxfyidBetween(Integer value1, Integer value2) {
            addCriterion("cgftmxfyid between", value1, value2, "cgftmxfyid");
            return (Criteria) this;
        }

        public Criteria andCgftmxfyidNotBetween(Integer value1, Integer value2) {
            addCriterion("cgftmxfyid not between", value1, value2, "cgftmxfyid");
            return (Criteria) this;
        }

        public Criteria andCgftmxfynameIsNull() {
            addCriterion("cgftmxfyname is null");
            return (Criteria) this;
        }

        public Criteria andCgftmxfynameIsNotNull() {
            addCriterion("cgftmxfyname is not null");
            return (Criteria) this;
        }

        public Criteria andCgftmxfynameEqualTo(String value) {
            addCriterion("cgftmxfyname =", value, "cgftmxfyname");
            return (Criteria) this;
        }

        public Criteria andCgftmxfynameNotEqualTo(String value) {
            addCriterion("cgftmxfyname <>", value, "cgftmxfyname");
            return (Criteria) this;
        }

        public Criteria andCgftmxfynameGreaterThan(String value) {
            addCriterion("cgftmxfyname >", value, "cgftmxfyname");
            return (Criteria) this;
        }

        public Criteria andCgftmxfynameGreaterThanOrEqualTo(String value) {
            addCriterion("cgftmxfyname >=", value, "cgftmxfyname");
            return (Criteria) this;
        }

        public Criteria andCgftmxfynameLessThan(String value) {
            addCriterion("cgftmxfyname <", value, "cgftmxfyname");
            return (Criteria) this;
        }

        public Criteria andCgftmxfynameLessThanOrEqualTo(String value) {
            addCriterion("cgftmxfyname <=", value, "cgftmxfyname");
            return (Criteria) this;
        }

        public Criteria andCgftmxfynameLike(String value) {
            addCriterion("cgftmxfyname like", value, "cgftmxfyname");
            return (Criteria) this;
        }

        public Criteria andCgftmxfynameNotLike(String value) {
            addCriterion("cgftmxfyname not like", value, "cgftmxfyname");
            return (Criteria) this;
        }

        public Criteria andCgftmxfynameIn(List<String> values) {
            addCriterion("cgftmxfyname in", values, "cgftmxfyname");
            return (Criteria) this;
        }

        public Criteria andCgftmxfynameNotIn(List<String> values) {
            addCriterion("cgftmxfyname not in", values, "cgftmxfyname");
            return (Criteria) this;
        }

        public Criteria andCgftmxfynameBetween(String value1, String value2) {
            addCriterion("cgftmxfyname between", value1, value2, "cgftmxfyname");
            return (Criteria) this;
        }

        public Criteria andCgftmxfynameNotBetween(String value1, String value2) {
            addCriterion("cgftmxfyname not between", value1, value2, "cgftmxfyname");
            return (Criteria) this;
        }

        public Criteria andCgftmxbbIsNull() {
            addCriterion("cgftmxbb is null");
            return (Criteria) this;
        }

        public Criteria andCgftmxbbIsNotNull() {
            addCriterion("cgftmxbb is not null");
            return (Criteria) this;
        }

        public Criteria andCgftmxbbEqualTo(String value) {
            addCriterion("cgftmxbb =", value, "cgftmxbb");
            return (Criteria) this;
        }

        public Criteria andCgftmxbbNotEqualTo(String value) {
            addCriterion("cgftmxbb <>", value, "cgftmxbb");
            return (Criteria) this;
        }

        public Criteria andCgftmxbbGreaterThan(String value) {
            addCriterion("cgftmxbb >", value, "cgftmxbb");
            return (Criteria) this;
        }

        public Criteria andCgftmxbbGreaterThanOrEqualTo(String value) {
            addCriterion("cgftmxbb >=", value, "cgftmxbb");
            return (Criteria) this;
        }

        public Criteria andCgftmxbbLessThan(String value) {
            addCriterion("cgftmxbb <", value, "cgftmxbb");
            return (Criteria) this;
        }

        public Criteria andCgftmxbbLessThanOrEqualTo(String value) {
            addCriterion("cgftmxbb <=", value, "cgftmxbb");
            return (Criteria) this;
        }

        public Criteria andCgftmxbbLike(String value) {
            addCriterion("cgftmxbb like", value, "cgftmxbb");
            return (Criteria) this;
        }

        public Criteria andCgftmxbbNotLike(String value) {
            addCriterion("cgftmxbb not like", value, "cgftmxbb");
            return (Criteria) this;
        }

        public Criteria andCgftmxbbIn(List<String> values) {
            addCriterion("cgftmxbb in", values, "cgftmxbb");
            return (Criteria) this;
        }

        public Criteria andCgftmxbbNotIn(List<String> values) {
            addCriterion("cgftmxbb not in", values, "cgftmxbb");
            return (Criteria) this;
        }

        public Criteria andCgftmxbbBetween(String value1, String value2) {
            addCriterion("cgftmxbb between", value1, value2, "cgftmxbb");
            return (Criteria) this;
        }

        public Criteria andCgftmxbbNotBetween(String value1, String value2) {
            addCriterion("cgftmxbb not between", value1, value2, "cgftmxbb");
            return (Criteria) this;
        }

        public Criteria andCgftmxhlIsNull() {
            addCriterion("cgftmxhl is null");
            return (Criteria) this;
        }

        public Criteria andCgftmxhlIsNotNull() {
            addCriterion("cgftmxhl is not null");
            return (Criteria) this;
        }

        public Criteria andCgftmxhlEqualTo(String value) {
            addCriterion("cgftmxhl =", value, "cgftmxhl");
            return (Criteria) this;
        }

        public Criteria andCgftmxhlNotEqualTo(String value) {
            addCriterion("cgftmxhl <>", value, "cgftmxhl");
            return (Criteria) this;
        }

        public Criteria andCgftmxhlGreaterThan(String value) {
            addCriterion("cgftmxhl >", value, "cgftmxhl");
            return (Criteria) this;
        }

        public Criteria andCgftmxhlGreaterThanOrEqualTo(String value) {
            addCriterion("cgftmxhl >=", value, "cgftmxhl");
            return (Criteria) this;
        }

        public Criteria andCgftmxhlLessThan(String value) {
            addCriterion("cgftmxhl <", value, "cgftmxhl");
            return (Criteria) this;
        }

        public Criteria andCgftmxhlLessThanOrEqualTo(String value) {
            addCriterion("cgftmxhl <=", value, "cgftmxhl");
            return (Criteria) this;
        }

        public Criteria andCgftmxhlLike(String value) {
            addCriterion("cgftmxhl like", value, "cgftmxhl");
            return (Criteria) this;
        }

        public Criteria andCgftmxhlNotLike(String value) {
            addCriterion("cgftmxhl not like", value, "cgftmxhl");
            return (Criteria) this;
        }

        public Criteria andCgftmxhlIn(List<String> values) {
            addCriterion("cgftmxhl in", values, "cgftmxhl");
            return (Criteria) this;
        }

        public Criteria andCgftmxhlNotIn(List<String> values) {
            addCriterion("cgftmxhl not in", values, "cgftmxhl");
            return (Criteria) this;
        }

        public Criteria andCgftmxhlBetween(String value1, String value2) {
            addCriterion("cgftmxhl between", value1, value2, "cgftmxhl");
            return (Criteria) this;
        }

        public Criteria andCgftmxhlNotBetween(String value1, String value2) {
            addCriterion("cgftmxhl not between", value1, value2, "cgftmxhl");
            return (Criteria) this;
        }

        public Criteria andCgftmxjeIsNull() {
            addCriterion("cgftmxje is null");
            return (Criteria) this;
        }

        public Criteria andCgftmxjeIsNotNull() {
            addCriterion("cgftmxje is not null");
            return (Criteria) this;
        }

        public Criteria andCgftmxjeEqualTo(Double value) {
            addCriterion("cgftmxje =", value, "cgftmxje");
            return (Criteria) this;
        }

        public Criteria andCgftmxjeNotEqualTo(Double value) {
            addCriterion("cgftmxje <>", value, "cgftmxje");
            return (Criteria) this;
        }

        public Criteria andCgftmxjeGreaterThan(Double value) {
            addCriterion("cgftmxje >", value, "cgftmxje");
            return (Criteria) this;
        }

        public Criteria andCgftmxjeGreaterThanOrEqualTo(Double value) {
            addCriterion("cgftmxje >=", value, "cgftmxje");
            return (Criteria) this;
        }

        public Criteria andCgftmxjeLessThan(Double value) {
            addCriterion("cgftmxje <", value, "cgftmxje");
            return (Criteria) this;
        }

        public Criteria andCgftmxjeLessThanOrEqualTo(Double value) {
            addCriterion("cgftmxje <=", value, "cgftmxje");
            return (Criteria) this;
        }

        public Criteria andCgftmxjeIn(List<Double> values) {
            addCriterion("cgftmxje in", values, "cgftmxje");
            return (Criteria) this;
        }

        public Criteria andCgftmxjeNotIn(List<Double> values) {
            addCriterion("cgftmxje not in", values, "cgftmxje");
            return (Criteria) this;
        }

        public Criteria andCgftmxjeBetween(Double value1, Double value2) {
            addCriterion("cgftmxje between", value1, value2, "cgftmxje");
            return (Criteria) this;
        }

        public Criteria andCgftmxjeNotBetween(Double value1, Double value2) {
            addCriterion("cgftmxje not between", value1, value2, "cgftmxje");
            return (Criteria) this;
        }

        public Criteria andCgftmxjebwIsNull() {
            addCriterion("cgftmxjebw is null");
            return (Criteria) this;
        }

        public Criteria andCgftmxjebwIsNotNull() {
            addCriterion("cgftmxjebw is not null");
            return (Criteria) this;
        }

        public Criteria andCgftmxjebwEqualTo(String value) {
            addCriterion("cgftmxjebw =", value, "cgftmxjebw");
            return (Criteria) this;
        }

        public Criteria andCgftmxjebwNotEqualTo(String value) {
            addCriterion("cgftmxjebw <>", value, "cgftmxjebw");
            return (Criteria) this;
        }

        public Criteria andCgftmxjebwGreaterThan(String value) {
            addCriterion("cgftmxjebw >", value, "cgftmxjebw");
            return (Criteria) this;
        }

        public Criteria andCgftmxjebwGreaterThanOrEqualTo(String value) {
            addCriterion("cgftmxjebw >=", value, "cgftmxjebw");
            return (Criteria) this;
        }

        public Criteria andCgftmxjebwLessThan(String value) {
            addCriterion("cgftmxjebw <", value, "cgftmxjebw");
            return (Criteria) this;
        }

        public Criteria andCgftmxjebwLessThanOrEqualTo(String value) {
            addCriterion("cgftmxjebw <=", value, "cgftmxjebw");
            return (Criteria) this;
        }

        public Criteria andCgftmxjebwLike(String value) {
            addCriterion("cgftmxjebw like", value, "cgftmxjebw");
            return (Criteria) this;
        }

        public Criteria andCgftmxjebwNotLike(String value) {
            addCriterion("cgftmxjebw not like", value, "cgftmxjebw");
            return (Criteria) this;
        }

        public Criteria andCgftmxjebwIn(List<String> values) {
            addCriterion("cgftmxjebw in", values, "cgftmxjebw");
            return (Criteria) this;
        }

        public Criteria andCgftmxjebwNotIn(List<String> values) {
            addCriterion("cgftmxjebw not in", values, "cgftmxjebw");
            return (Criteria) this;
        }

        public Criteria andCgftmxjebwBetween(String value1, String value2) {
            addCriterion("cgftmxjebw between", value1, value2, "cgftmxjebw");
            return (Criteria) this;
        }

        public Criteria andCgftmxjebwNotBetween(String value1, String value2) {
            addCriterion("cgftmxjebw not between", value1, value2, "cgftmxjebw");
            return (Criteria) this;
        }

        public Criteria andCgftmxby1IsNull() {
            addCriterion("cgftmxby1 is null");
            return (Criteria) this;
        }

        public Criteria andCgftmxby1IsNotNull() {
            addCriterion("cgftmxby1 is not null");
            return (Criteria) this;
        }

        public Criteria andCgftmxby1EqualTo(String value) {
            addCriterion("cgftmxby1 =", value, "cgftmxby1");
            return (Criteria) this;
        }

        public Criteria andCgftmxby1NotEqualTo(String value) {
            addCriterion("cgftmxby1 <>", value, "cgftmxby1");
            return (Criteria) this;
        }

        public Criteria andCgftmxby1GreaterThan(String value) {
            addCriterion("cgftmxby1 >", value, "cgftmxby1");
            return (Criteria) this;
        }

        public Criteria andCgftmxby1GreaterThanOrEqualTo(String value) {
            addCriterion("cgftmxby1 >=", value, "cgftmxby1");
            return (Criteria) this;
        }

        public Criteria andCgftmxby1LessThan(String value) {
            addCriterion("cgftmxby1 <", value, "cgftmxby1");
            return (Criteria) this;
        }

        public Criteria andCgftmxby1LessThanOrEqualTo(String value) {
            addCriterion("cgftmxby1 <=", value, "cgftmxby1");
            return (Criteria) this;
        }

        public Criteria andCgftmxby1Like(String value) {
            addCriterion("cgftmxby1 like", value, "cgftmxby1");
            return (Criteria) this;
        }

        public Criteria andCgftmxby1NotLike(String value) {
            addCriterion("cgftmxby1 not like", value, "cgftmxby1");
            return (Criteria) this;
        }

        public Criteria andCgftmxby1In(List<String> values) {
            addCriterion("cgftmxby1 in", values, "cgftmxby1");
            return (Criteria) this;
        }

        public Criteria andCgftmxby1NotIn(List<String> values) {
            addCriterion("cgftmxby1 not in", values, "cgftmxby1");
            return (Criteria) this;
        }

        public Criteria andCgftmxby1Between(String value1, String value2) {
            addCriterion("cgftmxby1 between", value1, value2, "cgftmxby1");
            return (Criteria) this;
        }

        public Criteria andCgftmxby1NotBetween(String value1, String value2) {
            addCriterion("cgftmxby1 not between", value1, value2, "cgftmxby1");
            return (Criteria) this;
        }

        public Criteria andCgftmxby2IsNull() {
            addCriterion("cgftmxby2 is null");
            return (Criteria) this;
        }

        public Criteria andCgftmxby2IsNotNull() {
            addCriterion("cgftmxby2 is not null");
            return (Criteria) this;
        }

        public Criteria andCgftmxby2EqualTo(String value) {
            addCriterion("cgftmxby2 =", value, "cgftmxby2");
            return (Criteria) this;
        }

        public Criteria andCgftmxby2NotEqualTo(String value) {
            addCriterion("cgftmxby2 <>", value, "cgftmxby2");
            return (Criteria) this;
        }

        public Criteria andCgftmxby2GreaterThan(String value) {
            addCriterion("cgftmxby2 >", value, "cgftmxby2");
            return (Criteria) this;
        }

        public Criteria andCgftmxby2GreaterThanOrEqualTo(String value) {
            addCriterion("cgftmxby2 >=", value, "cgftmxby2");
            return (Criteria) this;
        }

        public Criteria andCgftmxby2LessThan(String value) {
            addCriterion("cgftmxby2 <", value, "cgftmxby2");
            return (Criteria) this;
        }

        public Criteria andCgftmxby2LessThanOrEqualTo(String value) {
            addCriterion("cgftmxby2 <=", value, "cgftmxby2");
            return (Criteria) this;
        }

        public Criteria andCgftmxby2Like(String value) {
            addCriterion("cgftmxby2 like", value, "cgftmxby2");
            return (Criteria) this;
        }

        public Criteria andCgftmxby2NotLike(String value) {
            addCriterion("cgftmxby2 not like", value, "cgftmxby2");
            return (Criteria) this;
        }

        public Criteria andCgftmxby2In(List<String> values) {
            addCriterion("cgftmxby2 in", values, "cgftmxby2");
            return (Criteria) this;
        }

        public Criteria andCgftmxby2NotIn(List<String> values) {
            addCriterion("cgftmxby2 not in", values, "cgftmxby2");
            return (Criteria) this;
        }

        public Criteria andCgftmxby2Between(String value1, String value2) {
            addCriterion("cgftmxby2 between", value1, value2, "cgftmxby2");
            return (Criteria) this;
        }

        public Criteria andCgftmxby2NotBetween(String value1, String value2) {
            addCriterion("cgftmxby2 not between", value1, value2, "cgftmxby2");
            return (Criteria) this;
        }

        public Criteria andCgftmxby3IsNull() {
            addCriterion("cgftmxby3 is null");
            return (Criteria) this;
        }

        public Criteria andCgftmxby3IsNotNull() {
            addCriterion("cgftmxby3 is not null");
            return (Criteria) this;
        }

        public Criteria andCgftmxby3EqualTo(String value) {
            addCriterion("cgftmxby3 =", value, "cgftmxby3");
            return (Criteria) this;
        }

        public Criteria andCgftmxby3NotEqualTo(String value) {
            addCriterion("cgftmxby3 <>", value, "cgftmxby3");
            return (Criteria) this;
        }

        public Criteria andCgftmxby3GreaterThan(String value) {
            addCriterion("cgftmxby3 >", value, "cgftmxby3");
            return (Criteria) this;
        }

        public Criteria andCgftmxby3GreaterThanOrEqualTo(String value) {
            addCriterion("cgftmxby3 >=", value, "cgftmxby3");
            return (Criteria) this;
        }

        public Criteria andCgftmxby3LessThan(String value) {
            addCriterion("cgftmxby3 <", value, "cgftmxby3");
            return (Criteria) this;
        }

        public Criteria andCgftmxby3LessThanOrEqualTo(String value) {
            addCriterion("cgftmxby3 <=", value, "cgftmxby3");
            return (Criteria) this;
        }

        public Criteria andCgftmxby3Like(String value) {
            addCriterion("cgftmxby3 like", value, "cgftmxby3");
            return (Criteria) this;
        }

        public Criteria andCgftmxby3NotLike(String value) {
            addCriterion("cgftmxby3 not like", value, "cgftmxby3");
            return (Criteria) this;
        }

        public Criteria andCgftmxby3In(List<String> values) {
            addCriterion("cgftmxby3 in", values, "cgftmxby3");
            return (Criteria) this;
        }

        public Criteria andCgftmxby3NotIn(List<String> values) {
            addCriterion("cgftmxby3 not in", values, "cgftmxby3");
            return (Criteria) this;
        }

        public Criteria andCgftmxby3Between(String value1, String value2) {
            addCriterion("cgftmxby3 between", value1, value2, "cgftmxby3");
            return (Criteria) this;
        }

        public Criteria andCgftmxby3NotBetween(String value1, String value2) {
            addCriterion("cgftmxby3 not between", value1, value2, "cgftmxby3");
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