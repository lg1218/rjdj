package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DbExample() {
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

        public Criteria andDbdateIsNull() {
            addCriterion("dbdate is null");
            return (Criteria) this;
        }

        public Criteria andDbdateIsNotNull() {
            addCriterion("dbdate is not null");
            return (Criteria) this;
        }

        public Criteria andDbdateEqualTo(Date value) {
            addCriterionForJDBCDate("dbdate =", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("dbdate <>", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateGreaterThan(Date value) {
            addCriterionForJDBCDate("dbdate >", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dbdate >=", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateLessThan(Date value) {
            addCriterionForJDBCDate("dbdate <", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dbdate <=", value, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateIn(List<Date> values) {
            addCriterionForJDBCDate("dbdate in", values, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("dbdate not in", values, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dbdate between", value1, value2, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dbdate not between", value1, value2, "dbdate");
            return (Criteria) this;
        }

        public Criteria andDbdiaoruIsNull() {
            addCriterion("dbdiaoru is null");
            return (Criteria) this;
        }

        public Criteria andDbdiaoruIsNotNull() {
            addCriterion("dbdiaoru is not null");
            return (Criteria) this;
        }

        public Criteria andDbdiaoruEqualTo(Integer value) {
            addCriterion("dbdiaoru =", value, "dbdiaoru");
            return (Criteria) this;
        }

        public Criteria andDbdiaoruNotEqualTo(Integer value) {
            addCriterion("dbdiaoru <>", value, "dbdiaoru");
            return (Criteria) this;
        }

        public Criteria andDbdiaoruGreaterThan(Integer value) {
            addCriterion("dbdiaoru >", value, "dbdiaoru");
            return (Criteria) this;
        }

        public Criteria andDbdiaoruGreaterThanOrEqualTo(Integer value) {
            addCriterion("dbdiaoru >=", value, "dbdiaoru");
            return (Criteria) this;
        }

        public Criteria andDbdiaoruLessThan(Integer value) {
            addCriterion("dbdiaoru <", value, "dbdiaoru");
            return (Criteria) this;
        }

        public Criteria andDbdiaoruLessThanOrEqualTo(Integer value) {
            addCriterion("dbdiaoru <=", value, "dbdiaoru");
            return (Criteria) this;
        }

        public Criteria andDbdiaoruIn(List<Integer> values) {
            addCriterion("dbdiaoru in", values, "dbdiaoru");
            return (Criteria) this;
        }

        public Criteria andDbdiaoruNotIn(List<Integer> values) {
            addCriterion("dbdiaoru not in", values, "dbdiaoru");
            return (Criteria) this;
        }

        public Criteria andDbdiaoruBetween(Integer value1, Integer value2) {
            addCriterion("dbdiaoru between", value1, value2, "dbdiaoru");
            return (Criteria) this;
        }

        public Criteria andDbdiaoruNotBetween(Integer value1, Integer value2) {
            addCriterion("dbdiaoru not between", value1, value2, "dbdiaoru");
            return (Criteria) this;
        }

        public Criteria andDbdiaochuIsNull() {
            addCriterion("dbdiaochu is null");
            return (Criteria) this;
        }

        public Criteria andDbdiaochuIsNotNull() {
            addCriterion("dbdiaochu is not null");
            return (Criteria) this;
        }

        public Criteria andDbdiaochuEqualTo(Integer value) {
            addCriterion("dbdiaochu =", value, "dbdiaochu");
            return (Criteria) this;
        }

        public Criteria andDbdiaochuNotEqualTo(Integer value) {
            addCriterion("dbdiaochu <>", value, "dbdiaochu");
            return (Criteria) this;
        }

        public Criteria andDbdiaochuGreaterThan(Integer value) {
            addCriterion("dbdiaochu >", value, "dbdiaochu");
            return (Criteria) this;
        }

        public Criteria andDbdiaochuGreaterThanOrEqualTo(Integer value) {
            addCriterion("dbdiaochu >=", value, "dbdiaochu");
            return (Criteria) this;
        }

        public Criteria andDbdiaochuLessThan(Integer value) {
            addCriterion("dbdiaochu <", value, "dbdiaochu");
            return (Criteria) this;
        }

        public Criteria andDbdiaochuLessThanOrEqualTo(Integer value) {
            addCriterion("dbdiaochu <=", value, "dbdiaochu");
            return (Criteria) this;
        }

        public Criteria andDbdiaochuIn(List<Integer> values) {
            addCriterion("dbdiaochu in", values, "dbdiaochu");
            return (Criteria) this;
        }

        public Criteria andDbdiaochuNotIn(List<Integer> values) {
            addCriterion("dbdiaochu not in", values, "dbdiaochu");
            return (Criteria) this;
        }

        public Criteria andDbdiaochuBetween(Integer value1, Integer value2) {
            addCriterion("dbdiaochu between", value1, value2, "dbdiaochu");
            return (Criteria) this;
        }

        public Criteria andDbdiaochuNotBetween(Integer value1, Integer value2) {
            addCriterion("dbdiaochu not between", value1, value2, "dbdiaochu");
            return (Criteria) this;
        }

        public Criteria andDbzdIsNull() {
            addCriterion("dbzd is null");
            return (Criteria) this;
        }

        public Criteria andDbzdIsNotNull() {
            addCriterion("dbzd is not null");
            return (Criteria) this;
        }

        public Criteria andDbzdEqualTo(String value) {
            addCriterion("dbzd =", value, "dbzd");
            return (Criteria) this;
        }

        public Criteria andDbzdNotEqualTo(String value) {
            addCriterion("dbzd <>", value, "dbzd");
            return (Criteria) this;
        }

        public Criteria andDbzdGreaterThan(String value) {
            addCriterion("dbzd >", value, "dbzd");
            return (Criteria) this;
        }

        public Criteria andDbzdGreaterThanOrEqualTo(String value) {
            addCriterion("dbzd >=", value, "dbzd");
            return (Criteria) this;
        }

        public Criteria andDbzdLessThan(String value) {
            addCriterion("dbzd <", value, "dbzd");
            return (Criteria) this;
        }

        public Criteria andDbzdLessThanOrEqualTo(String value) {
            addCriterion("dbzd <=", value, "dbzd");
            return (Criteria) this;
        }

        public Criteria andDbzdLike(String value) {
            addCriterion("dbzd like", value, "dbzd");
            return (Criteria) this;
        }

        public Criteria andDbzdNotLike(String value) {
            addCriterion("dbzd not like", value, "dbzd");
            return (Criteria) this;
        }

        public Criteria andDbzdIn(List<String> values) {
            addCriterion("dbzd in", values, "dbzd");
            return (Criteria) this;
        }

        public Criteria andDbzdNotIn(List<String> values) {
            addCriterion("dbzd not in", values, "dbzd");
            return (Criteria) this;
        }

        public Criteria andDbzdBetween(String value1, String value2) {
            addCriterion("dbzd between", value1, value2, "dbzd");
            return (Criteria) this;
        }

        public Criteria andDbzdNotBetween(String value1, String value2) {
            addCriterion("dbzd not between", value1, value2, "dbzd");
            return (Criteria) this;
        }

        public Criteria andDbfhIsNull() {
            addCriterion("dbfh is null");
            return (Criteria) this;
        }

        public Criteria andDbfhIsNotNull() {
            addCriterion("dbfh is not null");
            return (Criteria) this;
        }

        public Criteria andDbfhEqualTo(String value) {
            addCriterion("dbfh =", value, "dbfh");
            return (Criteria) this;
        }

        public Criteria andDbfhNotEqualTo(String value) {
            addCriterion("dbfh <>", value, "dbfh");
            return (Criteria) this;
        }

        public Criteria andDbfhGreaterThan(String value) {
            addCriterion("dbfh >", value, "dbfh");
            return (Criteria) this;
        }

        public Criteria andDbfhGreaterThanOrEqualTo(String value) {
            addCriterion("dbfh >=", value, "dbfh");
            return (Criteria) this;
        }

        public Criteria andDbfhLessThan(String value) {
            addCriterion("dbfh <", value, "dbfh");
            return (Criteria) this;
        }

        public Criteria andDbfhLessThanOrEqualTo(String value) {
            addCriterion("dbfh <=", value, "dbfh");
            return (Criteria) this;
        }

        public Criteria andDbfhLike(String value) {
            addCriterion("dbfh like", value, "dbfh");
            return (Criteria) this;
        }

        public Criteria andDbfhNotLike(String value) {
            addCriterion("dbfh not like", value, "dbfh");
            return (Criteria) this;
        }

        public Criteria andDbfhIn(List<String> values) {
            addCriterion("dbfh in", values, "dbfh");
            return (Criteria) this;
        }

        public Criteria andDbfhNotIn(List<String> values) {
            addCriterion("dbfh not in", values, "dbfh");
            return (Criteria) this;
        }

        public Criteria andDbfhBetween(String value1, String value2) {
            addCriterion("dbfh between", value1, value2, "dbfh");
            return (Criteria) this;
        }

        public Criteria andDbfhNotBetween(String value1, String value2) {
            addCriterion("dbfh not between", value1, value2, "dbfh");
            return (Criteria) this;
        }

        public Criteria andDbbeizhuIsNull() {
            addCriterion("dbbeizhu is null");
            return (Criteria) this;
        }

        public Criteria andDbbeizhuIsNotNull() {
            addCriterion("dbbeizhu is not null");
            return (Criteria) this;
        }

        public Criteria andDbbeizhuEqualTo(String value) {
            addCriterion("dbbeizhu =", value, "dbbeizhu");
            return (Criteria) this;
        }

        public Criteria andDbbeizhuNotEqualTo(String value) {
            addCriterion("dbbeizhu <>", value, "dbbeizhu");
            return (Criteria) this;
        }

        public Criteria andDbbeizhuGreaterThan(String value) {
            addCriterion("dbbeizhu >", value, "dbbeizhu");
            return (Criteria) this;
        }

        public Criteria andDbbeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("dbbeizhu >=", value, "dbbeizhu");
            return (Criteria) this;
        }

        public Criteria andDbbeizhuLessThan(String value) {
            addCriterion("dbbeizhu <", value, "dbbeizhu");
            return (Criteria) this;
        }

        public Criteria andDbbeizhuLessThanOrEqualTo(String value) {
            addCriterion("dbbeizhu <=", value, "dbbeizhu");
            return (Criteria) this;
        }

        public Criteria andDbbeizhuLike(String value) {
            addCriterion("dbbeizhu like", value, "dbbeizhu");
            return (Criteria) this;
        }

        public Criteria andDbbeizhuNotLike(String value) {
            addCriterion("dbbeizhu not like", value, "dbbeizhu");
            return (Criteria) this;
        }

        public Criteria andDbbeizhuIn(List<String> values) {
            addCriterion("dbbeizhu in", values, "dbbeizhu");
            return (Criteria) this;
        }

        public Criteria andDbbeizhuNotIn(List<String> values) {
            addCriterion("dbbeizhu not in", values, "dbbeizhu");
            return (Criteria) this;
        }

        public Criteria andDbbeizhuBetween(String value1, String value2) {
            addCriterion("dbbeizhu between", value1, value2, "dbbeizhu");
            return (Criteria) this;
        }

        public Criteria andDbbeizhuNotBetween(String value1, String value2) {
            addCriterion("dbbeizhu not between", value1, value2, "dbbeizhu");
            return (Criteria) this;
        }

        public Criteria andDbby1IsNull() {
            addCriterion("dbby1 is null");
            return (Criteria) this;
        }

        public Criteria andDbby1IsNotNull() {
            addCriterion("dbby1 is not null");
            return (Criteria) this;
        }

        public Criteria andDbby1EqualTo(String value) {
            addCriterion("dbby1 =", value, "dbby1");
            return (Criteria) this;
        }

        public Criteria andDbby1NotEqualTo(String value) {
            addCriterion("dbby1 <>", value, "dbby1");
            return (Criteria) this;
        }

        public Criteria andDbby1GreaterThan(String value) {
            addCriterion("dbby1 >", value, "dbby1");
            return (Criteria) this;
        }

        public Criteria andDbby1GreaterThanOrEqualTo(String value) {
            addCriterion("dbby1 >=", value, "dbby1");
            return (Criteria) this;
        }

        public Criteria andDbby1LessThan(String value) {
            addCriterion("dbby1 <", value, "dbby1");
            return (Criteria) this;
        }

        public Criteria andDbby1LessThanOrEqualTo(String value) {
            addCriterion("dbby1 <=", value, "dbby1");
            return (Criteria) this;
        }

        public Criteria andDbby1Like(String value) {
            addCriterion("dbby1 like", value, "dbby1");
            return (Criteria) this;
        }

        public Criteria andDbby1NotLike(String value) {
            addCriterion("dbby1 not like", value, "dbby1");
            return (Criteria) this;
        }

        public Criteria andDbby1In(List<String> values) {
            addCriterion("dbby1 in", values, "dbby1");
            return (Criteria) this;
        }

        public Criteria andDbby1NotIn(List<String> values) {
            addCriterion("dbby1 not in", values, "dbby1");
            return (Criteria) this;
        }

        public Criteria andDbby1Between(String value1, String value2) {
            addCriterion("dbby1 between", value1, value2, "dbby1");
            return (Criteria) this;
        }

        public Criteria andDbby1NotBetween(String value1, String value2) {
            addCriterion("dbby1 not between", value1, value2, "dbby1");
            return (Criteria) this;
        }

        public Criteria andDbby2IsNull() {
            addCriterion("dbby2 is null");
            return (Criteria) this;
        }

        public Criteria andDbby2IsNotNull() {
            addCriterion("dbby2 is not null");
            return (Criteria) this;
        }

        public Criteria andDbby2EqualTo(String value) {
            addCriterion("dbby2 =", value, "dbby2");
            return (Criteria) this;
        }

        public Criteria andDbby2NotEqualTo(String value) {
            addCriterion("dbby2 <>", value, "dbby2");
            return (Criteria) this;
        }

        public Criteria andDbby2GreaterThan(String value) {
            addCriterion("dbby2 >", value, "dbby2");
            return (Criteria) this;
        }

        public Criteria andDbby2GreaterThanOrEqualTo(String value) {
            addCriterion("dbby2 >=", value, "dbby2");
            return (Criteria) this;
        }

        public Criteria andDbby2LessThan(String value) {
            addCriterion("dbby2 <", value, "dbby2");
            return (Criteria) this;
        }

        public Criteria andDbby2LessThanOrEqualTo(String value) {
            addCriterion("dbby2 <=", value, "dbby2");
            return (Criteria) this;
        }

        public Criteria andDbby2Like(String value) {
            addCriterion("dbby2 like", value, "dbby2");
            return (Criteria) this;
        }

        public Criteria andDbby2NotLike(String value) {
            addCriterion("dbby2 not like", value, "dbby2");
            return (Criteria) this;
        }

        public Criteria andDbby2In(List<String> values) {
            addCriterion("dbby2 in", values, "dbby2");
            return (Criteria) this;
        }

        public Criteria andDbby2NotIn(List<String> values) {
            addCriterion("dbby2 not in", values, "dbby2");
            return (Criteria) this;
        }

        public Criteria andDbby2Between(String value1, String value2) {
            addCriterion("dbby2 between", value1, value2, "dbby2");
            return (Criteria) this;
        }

        public Criteria andDbby2NotBetween(String value1, String value2) {
            addCriterion("dbby2 not between", value1, value2, "dbby2");
            return (Criteria) this;
        }

        public Criteria andDbby3IsNull() {
            addCriterion("dbby3 is null");
            return (Criteria) this;
        }

        public Criteria andDbby3IsNotNull() {
            addCriterion("dbby3 is not null");
            return (Criteria) this;
        }

        public Criteria andDbby3EqualTo(String value) {
            addCriterion("dbby3 =", value, "dbby3");
            return (Criteria) this;
        }

        public Criteria andDbby3NotEqualTo(String value) {
            addCriterion("dbby3 <>", value, "dbby3");
            return (Criteria) this;
        }

        public Criteria andDbby3GreaterThan(String value) {
            addCriterion("dbby3 >", value, "dbby3");
            return (Criteria) this;
        }

        public Criteria andDbby3GreaterThanOrEqualTo(String value) {
            addCriterion("dbby3 >=", value, "dbby3");
            return (Criteria) this;
        }

        public Criteria andDbby3LessThan(String value) {
            addCriterion("dbby3 <", value, "dbby3");
            return (Criteria) this;
        }

        public Criteria andDbby3LessThanOrEqualTo(String value) {
            addCriterion("dbby3 <=", value, "dbby3");
            return (Criteria) this;
        }

        public Criteria andDbby3Like(String value) {
            addCriterion("dbby3 like", value, "dbby3");
            return (Criteria) this;
        }

        public Criteria andDbby3NotLike(String value) {
            addCriterion("dbby3 not like", value, "dbby3");
            return (Criteria) this;
        }

        public Criteria andDbby3In(List<String> values) {
            addCriterion("dbby3 in", values, "dbby3");
            return (Criteria) this;
        }

        public Criteria andDbby3NotIn(List<String> values) {
            addCriterion("dbby3 not in", values, "dbby3");
            return (Criteria) this;
        }

        public Criteria andDbby3Between(String value1, String value2) {
            addCriterion("dbby3 between", value1, value2, "dbby3");
            return (Criteria) this;
        }

        public Criteria andDbby3NotBetween(String value1, String value2) {
            addCriterion("dbby3 not between", value1, value2, "dbby3");
            return (Criteria) this;
        }

        public Criteria andDbztIsNull() {
            addCriterion("dbzt is null");
            return (Criteria) this;
        }

        public Criteria andDbztIsNotNull() {
            addCriterion("dbzt is not null");
            return (Criteria) this;
        }

        public Criteria andDbztEqualTo(Integer value) {
            addCriterion("dbzt =", value, "dbzt");
            return (Criteria) this;
        }

        public Criteria andDbztNotEqualTo(Integer value) {
            addCriterion("dbzt <>", value, "dbzt");
            return (Criteria) this;
        }

        public Criteria andDbztGreaterThan(Integer value) {
            addCriterion("dbzt >", value, "dbzt");
            return (Criteria) this;
        }

        public Criteria andDbztGreaterThanOrEqualTo(Integer value) {
            addCriterion("dbzt >=", value, "dbzt");
            return (Criteria) this;
        }

        public Criteria andDbztLessThan(Integer value) {
            addCriterion("dbzt <", value, "dbzt");
            return (Criteria) this;
        }

        public Criteria andDbztLessThanOrEqualTo(Integer value) {
            addCriterion("dbzt <=", value, "dbzt");
            return (Criteria) this;
        }

        public Criteria andDbztIn(List<Integer> values) {
            addCriterion("dbzt in", values, "dbzt");
            return (Criteria) this;
        }

        public Criteria andDbztNotIn(List<Integer> values) {
            addCriterion("dbzt not in", values, "dbzt");
            return (Criteria) this;
        }

        public Criteria andDbztBetween(Integer value1, Integer value2) {
            addCriterion("dbzt between", value1, value2, "dbzt");
            return (Criteria) this;
        }

        public Criteria andDbztNotBetween(Integer value1, Integer value2) {
            addCriterion("dbzt not between", value1, value2, "dbzt");
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