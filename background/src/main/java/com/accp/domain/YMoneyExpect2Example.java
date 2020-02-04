package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class YMoneyExpect2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YMoneyExpect2Example() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSourseorderIsNull() {
            addCriterion("sourseOrder is null");
            return (Criteria) this;
        }

        public Criteria andSourseorderIsNotNull() {
            addCriterion("sourseOrder is not null");
            return (Criteria) this;
        }

        public Criteria andSourseorderEqualTo(String value) {
            addCriterion("sourseOrder =", value, "sourseorder");
            return (Criteria) this;
        }

        public Criteria andSourseorderNotEqualTo(String value) {
            addCriterion("sourseOrder <>", value, "sourseorder");
            return (Criteria) this;
        }

        public Criteria andSourseorderGreaterThan(String value) {
            addCriterion("sourseOrder >", value, "sourseorder");
            return (Criteria) this;
        }

        public Criteria andSourseorderGreaterThanOrEqualTo(String value) {
            addCriterion("sourseOrder >=", value, "sourseorder");
            return (Criteria) this;
        }

        public Criteria andSourseorderLessThan(String value) {
            addCriterion("sourseOrder <", value, "sourseorder");
            return (Criteria) this;
        }

        public Criteria andSourseorderLessThanOrEqualTo(String value) {
            addCriterion("sourseOrder <=", value, "sourseorder");
            return (Criteria) this;
        }

        public Criteria andSourseorderLike(String value) {
            addCriterion("sourseOrder like", value, "sourseorder");
            return (Criteria) this;
        }

        public Criteria andSourseorderNotLike(String value) {
            addCriterion("sourseOrder not like", value, "sourseorder");
            return (Criteria) this;
        }

        public Criteria andSourseorderIn(List<String> values) {
            addCriterion("sourseOrder in", values, "sourseorder");
            return (Criteria) this;
        }

        public Criteria andSourseorderNotIn(List<String> values) {
            addCriterion("sourseOrder not in", values, "sourseorder");
            return (Criteria) this;
        }

        public Criteria andSourseorderBetween(String value1, String value2) {
            addCriterion("sourseOrder between", value1, value2, "sourseorder");
            return (Criteria) this;
        }

        public Criteria andSourseorderNotBetween(String value1, String value2) {
            addCriterion("sourseOrder not between", value1, value2, "sourseorder");
            return (Criteria) this;
        }

        public Criteria andSoursenumberIsNull() {
            addCriterion("sourseNumber is null");
            return (Criteria) this;
        }

        public Criteria andSoursenumberIsNotNull() {
            addCriterion("sourseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSoursenumberEqualTo(String value) {
            addCriterion("sourseNumber =", value, "soursenumber");
            return (Criteria) this;
        }

        public Criteria andSoursenumberNotEqualTo(String value) {
            addCriterion("sourseNumber <>", value, "soursenumber");
            return (Criteria) this;
        }

        public Criteria andSoursenumberGreaterThan(String value) {
            addCriterion("sourseNumber >", value, "soursenumber");
            return (Criteria) this;
        }

        public Criteria andSoursenumberGreaterThanOrEqualTo(String value) {
            addCriterion("sourseNumber >=", value, "soursenumber");
            return (Criteria) this;
        }

        public Criteria andSoursenumberLessThan(String value) {
            addCriterion("sourseNumber <", value, "soursenumber");
            return (Criteria) this;
        }

        public Criteria andSoursenumberLessThanOrEqualTo(String value) {
            addCriterion("sourseNumber <=", value, "soursenumber");
            return (Criteria) this;
        }

        public Criteria andSoursenumberLike(String value) {
            addCriterion("sourseNumber like", value, "soursenumber");
            return (Criteria) this;
        }

        public Criteria andSoursenumberNotLike(String value) {
            addCriterion("sourseNumber not like", value, "soursenumber");
            return (Criteria) this;
        }

        public Criteria andSoursenumberIn(List<String> values) {
            addCriterion("sourseNumber in", values, "soursenumber");
            return (Criteria) this;
        }

        public Criteria andSoursenumberNotIn(List<String> values) {
            addCriterion("sourseNumber not in", values, "soursenumber");
            return (Criteria) this;
        }

        public Criteria andSoursenumberBetween(String value1, String value2) {
            addCriterion("sourseNumber between", value1, value2, "soursenumber");
            return (Criteria) this;
        }

        public Criteria andSoursenumberNotBetween(String value1, String value2) {
            addCriterion("sourseNumber not between", value1, value2, "soursenumber");
            return (Criteria) this;
        }

        public Criteria andSourcelinenumberIsNull() {
            addCriterion("sourceLineNumber is null");
            return (Criteria) this;
        }

        public Criteria andSourcelinenumberIsNotNull() {
            addCriterion("sourceLineNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSourcelinenumberEqualTo(String value) {
            addCriterion("sourceLineNumber =", value, "sourcelinenumber");
            return (Criteria) this;
        }

        public Criteria andSourcelinenumberNotEqualTo(String value) {
            addCriterion("sourceLineNumber <>", value, "sourcelinenumber");
            return (Criteria) this;
        }

        public Criteria andSourcelinenumberGreaterThan(String value) {
            addCriterion("sourceLineNumber >", value, "sourcelinenumber");
            return (Criteria) this;
        }

        public Criteria andSourcelinenumberGreaterThanOrEqualTo(String value) {
            addCriterion("sourceLineNumber >=", value, "sourcelinenumber");
            return (Criteria) this;
        }

        public Criteria andSourcelinenumberLessThan(String value) {
            addCriterion("sourceLineNumber <", value, "sourcelinenumber");
            return (Criteria) this;
        }

        public Criteria andSourcelinenumberLessThanOrEqualTo(String value) {
            addCriterion("sourceLineNumber <=", value, "sourcelinenumber");
            return (Criteria) this;
        }

        public Criteria andSourcelinenumberLike(String value) {
            addCriterion("sourceLineNumber like", value, "sourcelinenumber");
            return (Criteria) this;
        }

        public Criteria andSourcelinenumberNotLike(String value) {
            addCriterion("sourceLineNumber not like", value, "sourcelinenumber");
            return (Criteria) this;
        }

        public Criteria andSourcelinenumberIn(List<String> values) {
            addCriterion("sourceLineNumber in", values, "sourcelinenumber");
            return (Criteria) this;
        }

        public Criteria andSourcelinenumberNotIn(List<String> values) {
            addCriterion("sourceLineNumber not in", values, "sourcelinenumber");
            return (Criteria) this;
        }

        public Criteria andSourcelinenumberBetween(String value1, String value2) {
            addCriterion("sourceLineNumber between", value1, value2, "sourcelinenumber");
            return (Criteria) this;
        }

        public Criteria andSourcelinenumberNotBetween(String value1, String value2) {
            addCriterion("sourceLineNumber not between", value1, value2, "sourcelinenumber");
            return (Criteria) this;
        }

        public Criteria andTheamountinadvance1IsNull() {
            addCriterion("theAmountInAdvance1 is null");
            return (Criteria) this;
        }

        public Criteria andTheamountinadvance1IsNotNull() {
            addCriterion("theAmountInAdvance1 is not null");
            return (Criteria) this;
        }

        public Criteria andTheamountinadvance1EqualTo(Double value) {
            addCriterion("theAmountInAdvance1 =", value, "theamountinadvance1");
            return (Criteria) this;
        }

        public Criteria andTheamountinadvance1NotEqualTo(Double value) {
            addCriterion("theAmountInAdvance1 <>", value, "theamountinadvance1");
            return (Criteria) this;
        }

        public Criteria andTheamountinadvance1GreaterThan(Double value) {
            addCriterion("theAmountInAdvance1 >", value, "theamountinadvance1");
            return (Criteria) this;
        }

        public Criteria andTheamountinadvance1GreaterThanOrEqualTo(Double value) {
            addCriterion("theAmountInAdvance1 >=", value, "theamountinadvance1");
            return (Criteria) this;
        }

        public Criteria andTheamountinadvance1LessThan(Double value) {
            addCriterion("theAmountInAdvance1 <", value, "theamountinadvance1");
            return (Criteria) this;
        }

        public Criteria andTheamountinadvance1LessThanOrEqualTo(Double value) {
            addCriterion("theAmountInAdvance1 <=", value, "theamountinadvance1");
            return (Criteria) this;
        }

        public Criteria andTheamountinadvance1In(List<Double> values) {
            addCriterion("theAmountInAdvance1 in", values, "theamountinadvance1");
            return (Criteria) this;
        }

        public Criteria andTheamountinadvance1NotIn(List<Double> values) {
            addCriterion("theAmountInAdvance1 not in", values, "theamountinadvance1");
            return (Criteria) this;
        }

        public Criteria andTheamountinadvance1Between(Double value1, Double value2) {
            addCriterion("theAmountInAdvance1 between", value1, value2, "theamountinadvance1");
            return (Criteria) this;
        }

        public Criteria andTheamountinadvance1NotBetween(Double value1, Double value2) {
            addCriterion("theAmountInAdvance1 not between", value1, value2, "theamountinadvance1");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamountIsNull() {
            addCriterion("theOriginalSingleAmount is null");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamountIsNotNull() {
            addCriterion("theOriginalSingleAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamountEqualTo(Double value) {
            addCriterion("theOriginalSingleAmount =", value, "theoriginalsingleamount");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamountNotEqualTo(Double value) {
            addCriterion("theOriginalSingleAmount <>", value, "theoriginalsingleamount");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamountGreaterThan(Double value) {
            addCriterion("theOriginalSingleAmount >", value, "theoriginalsingleamount");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamountGreaterThanOrEqualTo(Double value) {
            addCriterion("theOriginalSingleAmount >=", value, "theoriginalsingleamount");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamountLessThan(Double value) {
            addCriterion("theOriginalSingleAmount <", value, "theoriginalsingleamount");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamountLessThanOrEqualTo(Double value) {
            addCriterion("theOriginalSingleAmount <=", value, "theoriginalsingleamount");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamountIn(List<Double> values) {
            addCriterion("theOriginalSingleAmount in", values, "theoriginalsingleamount");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamountNotIn(List<Double> values) {
            addCriterion("theOriginalSingleAmount not in", values, "theoriginalsingleamount");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamountBetween(Double value1, Double value2) {
            addCriterion("theOriginalSingleAmount between", value1, value2, "theoriginalsingleamount");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamountNotBetween(Double value1, Double value2) {
            addCriterion("theOriginalSingleAmount not between", value1, value2, "theoriginalsingleamount");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamount1IsNull() {
            addCriterion("theOriginalSingleAmount1 is null");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamount1IsNotNull() {
            addCriterion("theOriginalSingleAmount1 is not null");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamount1EqualTo(Double value) {
            addCriterion("theOriginalSingleAmount1 =", value, "theoriginalsingleamount1");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamount1NotEqualTo(Double value) {
            addCriterion("theOriginalSingleAmount1 <>", value, "theoriginalsingleamount1");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamount1GreaterThan(Double value) {
            addCriterion("theOriginalSingleAmount1 >", value, "theoriginalsingleamount1");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamount1GreaterThanOrEqualTo(Double value) {
            addCriterion("theOriginalSingleAmount1 >=", value, "theoriginalsingleamount1");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamount1LessThan(Double value) {
            addCriterion("theOriginalSingleAmount1 <", value, "theoriginalsingleamount1");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamount1LessThanOrEqualTo(Double value) {
            addCriterion("theOriginalSingleAmount1 <=", value, "theoriginalsingleamount1");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamount1In(List<Double> values) {
            addCriterion("theOriginalSingleAmount1 in", values, "theoriginalsingleamount1");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamount1NotIn(List<Double> values) {
            addCriterion("theOriginalSingleAmount1 not in", values, "theoriginalsingleamount1");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamount1Between(Double value1, Double value2) {
            addCriterion("theOriginalSingleAmount1 between", value1, value2, "theoriginalsingleamount1");
            return (Criteria) this;
        }

        public Criteria andTheoriginalsingleamount1NotBetween(Double value1, Double value2) {
            addCriterion("theOriginalSingleAmount1 not between", value1, value2, "theoriginalsingleamount1");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNull() {
            addCriterion("remark3 is null");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNotNull() {
            addCriterion("remark3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark3EqualTo(String value) {
            addCriterion("remark3 =", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotEqualTo(String value) {
            addCriterion("remark3 <>", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThan(String value) {
            addCriterion("remark3 >", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("remark3 >=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThan(String value) {
            addCriterion("remark3 <", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThanOrEqualTo(String value) {
            addCriterion("remark3 <=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Like(String value) {
            addCriterion("remark3 like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotLike(String value) {
            addCriterion("remark3 not like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3In(List<String> values) {
            addCriterion("remark3 in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotIn(List<String> values) {
            addCriterion("remark3 not in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Between(String value1, String value2) {
            addCriterion("remark3 between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotBetween(String value1, String value2) {
            addCriterion("remark3 not between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNull() {
            addCriterion("remark4 is null");
            return (Criteria) this;
        }

        public Criteria andRemark4IsNotNull() {
            addCriterion("remark4 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark4EqualTo(String value) {
            addCriterion("remark4 =", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotEqualTo(String value) {
            addCriterion("remark4 <>", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThan(String value) {
            addCriterion("remark4 >", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4GreaterThanOrEqualTo(String value) {
            addCriterion("remark4 >=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThan(String value) {
            addCriterion("remark4 <", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4LessThanOrEqualTo(String value) {
            addCriterion("remark4 <=", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Like(String value) {
            addCriterion("remark4 like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotLike(String value) {
            addCriterion("remark4 not like", value, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4In(List<String> values) {
            addCriterion("remark4 in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotIn(List<String> values) {
            addCriterion("remark4 not in", values, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4Between(String value1, String value2) {
            addCriterion("remark4 between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark4NotBetween(String value1, String value2) {
            addCriterion("remark4 not between", value1, value2, "remark4");
            return (Criteria) this;
        }

        public Criteria andRemark5IsNull() {
            addCriterion("remark5 is null");
            return (Criteria) this;
        }

        public Criteria andRemark5IsNotNull() {
            addCriterion("remark5 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark5EqualTo(String value) {
            addCriterion("remark5 =", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotEqualTo(String value) {
            addCriterion("remark5 <>", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5GreaterThan(String value) {
            addCriterion("remark5 >", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5GreaterThanOrEqualTo(String value) {
            addCriterion("remark5 >=", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5LessThan(String value) {
            addCriterion("remark5 <", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5LessThanOrEqualTo(String value) {
            addCriterion("remark5 <=", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5Like(String value) {
            addCriterion("remark5 like", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotLike(String value) {
            addCriterion("remark5 not like", value, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5In(List<String> values) {
            addCriterion("remark5 in", values, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotIn(List<String> values) {
            addCriterion("remark5 not in", values, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5Between(String value1, String value2) {
            addCriterion("remark5 between", value1, value2, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark5NotBetween(String value1, String value2) {
            addCriterion("remark5 not between", value1, value2, "remark5");
            return (Criteria) this;
        }

        public Criteria andRemark6IsNull() {
            addCriterion("remark6 is null");
            return (Criteria) this;
        }

        public Criteria andRemark6IsNotNull() {
            addCriterion("remark6 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark6EqualTo(String value) {
            addCriterion("remark6 =", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotEqualTo(String value) {
            addCriterion("remark6 <>", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6GreaterThan(String value) {
            addCriterion("remark6 >", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6GreaterThanOrEqualTo(String value) {
            addCriterion("remark6 >=", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6LessThan(String value) {
            addCriterion("remark6 <", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6LessThanOrEqualTo(String value) {
            addCriterion("remark6 <=", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6Like(String value) {
            addCriterion("remark6 like", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotLike(String value) {
            addCriterion("remark6 not like", value, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6In(List<String> values) {
            addCriterion("remark6 in", values, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotIn(List<String> values) {
            addCriterion("remark6 not in", values, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6Between(String value1, String value2) {
            addCriterion("remark6 between", value1, value2, "remark6");
            return (Criteria) this;
        }

        public Criteria andRemark6NotBetween(String value1, String value2) {
            addCriterion("remark6 not between", value1, value2, "remark6");
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