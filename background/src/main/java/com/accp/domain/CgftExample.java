package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CgftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CgftExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andCgftpzbhIsNull() {
            addCriterion("cgftpzbh is null");
            return (Criteria) this;
        }

        public Criteria andCgftpzbhIsNotNull() {
            addCriterion("cgftpzbh is not null");
            return (Criteria) this;
        }

        public Criteria andCgftpzbhEqualTo(String value) {
            addCriterion("cgftpzbh =", value, "cgftpzbh");
            return (Criteria) this;
        }

        public Criteria andCgftpzbhNotEqualTo(String value) {
            addCriterion("cgftpzbh <>", value, "cgftpzbh");
            return (Criteria) this;
        }

        public Criteria andCgftpzbhGreaterThan(String value) {
            addCriterion("cgftpzbh >", value, "cgftpzbh");
            return (Criteria) this;
        }

        public Criteria andCgftpzbhGreaterThanOrEqualTo(String value) {
            addCriterion("cgftpzbh >=", value, "cgftpzbh");
            return (Criteria) this;
        }

        public Criteria andCgftpzbhLessThan(String value) {
            addCriterion("cgftpzbh <", value, "cgftpzbh");
            return (Criteria) this;
        }

        public Criteria andCgftpzbhLessThanOrEqualTo(String value) {
            addCriterion("cgftpzbh <=", value, "cgftpzbh");
            return (Criteria) this;
        }

        public Criteria andCgftpzbhLike(String value) {
            addCriterion("cgftpzbh like", value, "cgftpzbh");
            return (Criteria) this;
        }

        public Criteria andCgftpzbhNotLike(String value) {
            addCriterion("cgftpzbh not like", value, "cgftpzbh");
            return (Criteria) this;
        }

        public Criteria andCgftpzbhIn(List<String> values) {
            addCriterion("cgftpzbh in", values, "cgftpzbh");
            return (Criteria) this;
        }

        public Criteria andCgftpzbhNotIn(List<String> values) {
            addCriterion("cgftpzbh not in", values, "cgftpzbh");
            return (Criteria) this;
        }

        public Criteria andCgftpzbhBetween(String value1, String value2) {
            addCriterion("cgftpzbh between", value1, value2, "cgftpzbh");
            return (Criteria) this;
        }

        public Criteria andCgftpzbhNotBetween(String value1, String value2) {
            addCriterion("cgftpzbh not between", value1, value2, "cgftpzbh");
            return (Criteria) this;
        }

        public Criteria andCgftfsIsNull() {
            addCriterion("cgftfs is null");
            return (Criteria) this;
        }

        public Criteria andCgftfsIsNotNull() {
            addCriterion("cgftfs is not null");
            return (Criteria) this;
        }

        public Criteria andCgftfsEqualTo(Integer value) {
            addCriterion("cgftfs =", value, "cgftfs");
            return (Criteria) this;
        }

        public Criteria andCgftfsNotEqualTo(Integer value) {
            addCriterion("cgftfs <>", value, "cgftfs");
            return (Criteria) this;
        }

        public Criteria andCgftfsGreaterThan(Integer value) {
            addCriterion("cgftfs >", value, "cgftfs");
            return (Criteria) this;
        }

        public Criteria andCgftfsGreaterThanOrEqualTo(Integer value) {
            addCriterion("cgftfs >=", value, "cgftfs");
            return (Criteria) this;
        }

        public Criteria andCgftfsLessThan(Integer value) {
            addCriterion("cgftfs <", value, "cgftfs");
            return (Criteria) this;
        }

        public Criteria andCgftfsLessThanOrEqualTo(Integer value) {
            addCriterion("cgftfs <=", value, "cgftfs");
            return (Criteria) this;
        }

        public Criteria andCgftfsIn(List<Integer> values) {
            addCriterion("cgftfs in", values, "cgftfs");
            return (Criteria) this;
        }

        public Criteria andCgftfsNotIn(List<Integer> values) {
            addCriterion("cgftfs not in", values, "cgftfs");
            return (Criteria) this;
        }

        public Criteria andCgftfsBetween(Integer value1, Integer value2) {
            addCriterion("cgftfs between", value1, value2, "cgftfs");
            return (Criteria) this;
        }

        public Criteria andCgftfsNotBetween(Integer value1, Integer value2) {
            addCriterion("cgftfs not between", value1, value2, "cgftfs");
            return (Criteria) this;
        }

        public Criteria andCgftbwbIsNull() {
            addCriterion("cgftbwb is null");
            return (Criteria) this;
        }

        public Criteria andCgftbwbIsNotNull() {
            addCriterion("cgftbwb is not null");
            return (Criteria) this;
        }

        public Criteria andCgftbwbEqualTo(Double value) {
            addCriterion("cgftbwb =", value, "cgftbwb");
            return (Criteria) this;
        }

        public Criteria andCgftbwbNotEqualTo(Double value) {
            addCriterion("cgftbwb <>", value, "cgftbwb");
            return (Criteria) this;
        }

        public Criteria andCgftbwbGreaterThan(Double value) {
            addCriterion("cgftbwb >", value, "cgftbwb");
            return (Criteria) this;
        }

        public Criteria andCgftbwbGreaterThanOrEqualTo(Double value) {
            addCriterion("cgftbwb >=", value, "cgftbwb");
            return (Criteria) this;
        }

        public Criteria andCgftbwbLessThan(Double value) {
            addCriterion("cgftbwb <", value, "cgftbwb");
            return (Criteria) this;
        }

        public Criteria andCgftbwbLessThanOrEqualTo(Double value) {
            addCriterion("cgftbwb <=", value, "cgftbwb");
            return (Criteria) this;
        }

        public Criteria andCgftbwbIn(List<Double> values) {
            addCriterion("cgftbwb in", values, "cgftbwb");
            return (Criteria) this;
        }

        public Criteria andCgftbwbNotIn(List<Double> values) {
            addCriterion("cgftbwb not in", values, "cgftbwb");
            return (Criteria) this;
        }

        public Criteria andCgftbwbBetween(Double value1, Double value2) {
            addCriterion("cgftbwb between", value1, value2, "cgftbwb");
            return (Criteria) this;
        }

        public Criteria andCgftbwbNotBetween(Double value1, Double value2) {
            addCriterion("cgftbwb not between", value1, value2, "cgftbwb");
            return (Criteria) this;
        }

        public Criteria andCgftzdIsNull() {
            addCriterion("cgftzd is null");
            return (Criteria) this;
        }

        public Criteria andCgftzdIsNotNull() {
            addCriterion("cgftzd is not null");
            return (Criteria) this;
        }

        public Criteria andCgftzdEqualTo(String value) {
            addCriterion("cgftzd =", value, "cgftzd");
            return (Criteria) this;
        }

        public Criteria andCgftzdNotEqualTo(String value) {
            addCriterion("cgftzd <>", value, "cgftzd");
            return (Criteria) this;
        }

        public Criteria andCgftzdGreaterThan(String value) {
            addCriterion("cgftzd >", value, "cgftzd");
            return (Criteria) this;
        }

        public Criteria andCgftzdGreaterThanOrEqualTo(String value) {
            addCriterion("cgftzd >=", value, "cgftzd");
            return (Criteria) this;
        }

        public Criteria andCgftzdLessThan(String value) {
            addCriterion("cgftzd <", value, "cgftzd");
            return (Criteria) this;
        }

        public Criteria andCgftzdLessThanOrEqualTo(String value) {
            addCriterion("cgftzd <=", value, "cgftzd");
            return (Criteria) this;
        }

        public Criteria andCgftzdLike(String value) {
            addCriterion("cgftzd like", value, "cgftzd");
            return (Criteria) this;
        }

        public Criteria andCgftzdNotLike(String value) {
            addCriterion("cgftzd not like", value, "cgftzd");
            return (Criteria) this;
        }

        public Criteria andCgftzdIn(List<String> values) {
            addCriterion("cgftzd in", values, "cgftzd");
            return (Criteria) this;
        }

        public Criteria andCgftzdNotIn(List<String> values) {
            addCriterion("cgftzd not in", values, "cgftzd");
            return (Criteria) this;
        }

        public Criteria andCgftzdBetween(String value1, String value2) {
            addCriterion("cgftzd between", value1, value2, "cgftzd");
            return (Criteria) this;
        }

        public Criteria andCgftzdNotBetween(String value1, String value2) {
            addCriterion("cgftzd not between", value1, value2, "cgftzd");
            return (Criteria) this;
        }

        public Criteria andCgftfhIsNull() {
            addCriterion("cgftfh is null");
            return (Criteria) this;
        }

        public Criteria andCgftfhIsNotNull() {
            addCriterion("cgftfh is not null");
            return (Criteria) this;
        }

        public Criteria andCgftfhEqualTo(String value) {
            addCriterion("cgftfh =", value, "cgftfh");
            return (Criteria) this;
        }

        public Criteria andCgftfhNotEqualTo(String value) {
            addCriterion("cgftfh <>", value, "cgftfh");
            return (Criteria) this;
        }

        public Criteria andCgftfhGreaterThan(String value) {
            addCriterion("cgftfh >", value, "cgftfh");
            return (Criteria) this;
        }

        public Criteria andCgftfhGreaterThanOrEqualTo(String value) {
            addCriterion("cgftfh >=", value, "cgftfh");
            return (Criteria) this;
        }

        public Criteria andCgftfhLessThan(String value) {
            addCriterion("cgftfh <", value, "cgftfh");
            return (Criteria) this;
        }

        public Criteria andCgftfhLessThanOrEqualTo(String value) {
            addCriterion("cgftfh <=", value, "cgftfh");
            return (Criteria) this;
        }

        public Criteria andCgftfhLike(String value) {
            addCriterion("cgftfh like", value, "cgftfh");
            return (Criteria) this;
        }

        public Criteria andCgftfhNotLike(String value) {
            addCriterion("cgftfh not like", value, "cgftfh");
            return (Criteria) this;
        }

        public Criteria andCgftfhIn(List<String> values) {
            addCriterion("cgftfh in", values, "cgftfh");
            return (Criteria) this;
        }

        public Criteria andCgftfhNotIn(List<String> values) {
            addCriterion("cgftfh not in", values, "cgftfh");
            return (Criteria) this;
        }

        public Criteria andCgftfhBetween(String value1, String value2) {
            addCriterion("cgftfh between", value1, value2, "cgftfh");
            return (Criteria) this;
        }

        public Criteria andCgftfhNotBetween(String value1, String value2) {
            addCriterion("cgftfh not between", value1, value2, "cgftfh");
            return (Criteria) this;
        }

        public Criteria andCgftby1IsNull() {
            addCriterion("cgftby1 is null");
            return (Criteria) this;
        }

        public Criteria andCgftby1IsNotNull() {
            addCriterion("cgftby1 is not null");
            return (Criteria) this;
        }

        public Criteria andCgftby1EqualTo(String value) {
            addCriterion("cgftby1 =", value, "cgftby1");
            return (Criteria) this;
        }

        public Criteria andCgftby1NotEqualTo(String value) {
            addCriterion("cgftby1 <>", value, "cgftby1");
            return (Criteria) this;
        }

        public Criteria andCgftby1GreaterThan(String value) {
            addCriterion("cgftby1 >", value, "cgftby1");
            return (Criteria) this;
        }

        public Criteria andCgftby1GreaterThanOrEqualTo(String value) {
            addCriterion("cgftby1 >=", value, "cgftby1");
            return (Criteria) this;
        }

        public Criteria andCgftby1LessThan(String value) {
            addCriterion("cgftby1 <", value, "cgftby1");
            return (Criteria) this;
        }

        public Criteria andCgftby1LessThanOrEqualTo(String value) {
            addCriterion("cgftby1 <=", value, "cgftby1");
            return (Criteria) this;
        }

        public Criteria andCgftby1Like(String value) {
            addCriterion("cgftby1 like", value, "cgftby1");
            return (Criteria) this;
        }

        public Criteria andCgftby1NotLike(String value) {
            addCriterion("cgftby1 not like", value, "cgftby1");
            return (Criteria) this;
        }

        public Criteria andCgftby1In(List<String> values) {
            addCriterion("cgftby1 in", values, "cgftby1");
            return (Criteria) this;
        }

        public Criteria andCgftby1NotIn(List<String> values) {
            addCriterion("cgftby1 not in", values, "cgftby1");
            return (Criteria) this;
        }

        public Criteria andCgftby1Between(String value1, String value2) {
            addCriterion("cgftby1 between", value1, value2, "cgftby1");
            return (Criteria) this;
        }

        public Criteria andCgftby1NotBetween(String value1, String value2) {
            addCriterion("cgftby1 not between", value1, value2, "cgftby1");
            return (Criteria) this;
        }

        public Criteria andCgftby2IsNull() {
            addCriterion("cgftby2 is null");
            return (Criteria) this;
        }

        public Criteria andCgftby2IsNotNull() {
            addCriterion("cgftby2 is not null");
            return (Criteria) this;
        }

        public Criteria andCgftby2EqualTo(String value) {
            addCriterion("cgftby2 =", value, "cgftby2");
            return (Criteria) this;
        }

        public Criteria andCgftby2NotEqualTo(String value) {
            addCriterion("cgftby2 <>", value, "cgftby2");
            return (Criteria) this;
        }

        public Criteria andCgftby2GreaterThan(String value) {
            addCriterion("cgftby2 >", value, "cgftby2");
            return (Criteria) this;
        }

        public Criteria andCgftby2GreaterThanOrEqualTo(String value) {
            addCriterion("cgftby2 >=", value, "cgftby2");
            return (Criteria) this;
        }

        public Criteria andCgftby2LessThan(String value) {
            addCriterion("cgftby2 <", value, "cgftby2");
            return (Criteria) this;
        }

        public Criteria andCgftby2LessThanOrEqualTo(String value) {
            addCriterion("cgftby2 <=", value, "cgftby2");
            return (Criteria) this;
        }

        public Criteria andCgftby2Like(String value) {
            addCriterion("cgftby2 like", value, "cgftby2");
            return (Criteria) this;
        }

        public Criteria andCgftby2NotLike(String value) {
            addCriterion("cgftby2 not like", value, "cgftby2");
            return (Criteria) this;
        }

        public Criteria andCgftby2In(List<String> values) {
            addCriterion("cgftby2 in", values, "cgftby2");
            return (Criteria) this;
        }

        public Criteria andCgftby2NotIn(List<String> values) {
            addCriterion("cgftby2 not in", values, "cgftby2");
            return (Criteria) this;
        }

        public Criteria andCgftby2Between(String value1, String value2) {
            addCriterion("cgftby2 between", value1, value2, "cgftby2");
            return (Criteria) this;
        }

        public Criteria andCgftby2NotBetween(String value1, String value2) {
            addCriterion("cgftby2 not between", value1, value2, "cgftby2");
            return (Criteria) this;
        }

        public Criteria andCgftby3IsNull() {
            addCriterion("cgftby3 is null");
            return (Criteria) this;
        }

        public Criteria andCgftby3IsNotNull() {
            addCriterion("cgftby3 is not null");
            return (Criteria) this;
        }

        public Criteria andCgftby3EqualTo(String value) {
            addCriterion("cgftby3 =", value, "cgftby3");
            return (Criteria) this;
        }

        public Criteria andCgftby3NotEqualTo(String value) {
            addCriterion("cgftby3 <>", value, "cgftby3");
            return (Criteria) this;
        }

        public Criteria andCgftby3GreaterThan(String value) {
            addCriterion("cgftby3 >", value, "cgftby3");
            return (Criteria) this;
        }

        public Criteria andCgftby3GreaterThanOrEqualTo(String value) {
            addCriterion("cgftby3 >=", value, "cgftby3");
            return (Criteria) this;
        }

        public Criteria andCgftby3LessThan(String value) {
            addCriterion("cgftby3 <", value, "cgftby3");
            return (Criteria) this;
        }

        public Criteria andCgftby3LessThanOrEqualTo(String value) {
            addCriterion("cgftby3 <=", value, "cgftby3");
            return (Criteria) this;
        }

        public Criteria andCgftby3Like(String value) {
            addCriterion("cgftby3 like", value, "cgftby3");
            return (Criteria) this;
        }

        public Criteria andCgftby3NotLike(String value) {
            addCriterion("cgftby3 not like", value, "cgftby3");
            return (Criteria) this;
        }

        public Criteria andCgftby3In(List<String> values) {
            addCriterion("cgftby3 in", values, "cgftby3");
            return (Criteria) this;
        }

        public Criteria andCgftby3NotIn(List<String> values) {
            addCriterion("cgftby3 not in", values, "cgftby3");
            return (Criteria) this;
        }

        public Criteria andCgftby3Between(String value1, String value2) {
            addCriterion("cgftby3 between", value1, value2, "cgftby3");
            return (Criteria) this;
        }

        public Criteria andCgftby3NotBetween(String value1, String value2) {
            addCriterion("cgftby3 not between", value1, value2, "cgftby3");
            return (Criteria) this;
        }

        public Criteria andCgftztIsNull() {
            addCriterion("cgftzt is null");
            return (Criteria) this;
        }

        public Criteria andCgftztIsNotNull() {
            addCriterion("cgftzt is not null");
            return (Criteria) this;
        }

        public Criteria andCgftztEqualTo(Integer value) {
            addCriterion("cgftzt =", value, "cgftzt");
            return (Criteria) this;
        }

        public Criteria andCgftztNotEqualTo(Integer value) {
            addCriterion("cgftzt <>", value, "cgftzt");
            return (Criteria) this;
        }

        public Criteria andCgftztGreaterThan(Integer value) {
            addCriterion("cgftzt >", value, "cgftzt");
            return (Criteria) this;
        }

        public Criteria andCgftztGreaterThanOrEqualTo(Integer value) {
            addCriterion("cgftzt >=", value, "cgftzt");
            return (Criteria) this;
        }

        public Criteria andCgftztLessThan(Integer value) {
            addCriterion("cgftzt <", value, "cgftzt");
            return (Criteria) this;
        }

        public Criteria andCgftztLessThanOrEqualTo(Integer value) {
            addCriterion("cgftzt <=", value, "cgftzt");
            return (Criteria) this;
        }

        public Criteria andCgftztIn(List<Integer> values) {
            addCriterion("cgftzt in", values, "cgftzt");
            return (Criteria) this;
        }

        public Criteria andCgftztNotIn(List<Integer> values) {
            addCriterion("cgftzt not in", values, "cgftzt");
            return (Criteria) this;
        }

        public Criteria andCgftztBetween(Integer value1, Integer value2) {
            addCriterion("cgftzt between", value1, value2, "cgftzt");
            return (Criteria) this;
        }

        public Criteria andCgftztNotBetween(Integer value1, Integer value2) {
            addCriterion("cgftzt not between", value1, value2, "cgftzt");
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