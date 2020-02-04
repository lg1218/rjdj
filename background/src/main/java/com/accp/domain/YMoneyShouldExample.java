package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YMoneyShouldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YMoneyShouldExample() {
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

        public Criteria andClientIsNull() {
            addCriterion("client is null");
            return (Criteria) this;
        }

        public Criteria andClientIsNotNull() {
            addCriterion("client is not null");
            return (Criteria) this;
        }

        public Criteria andClientEqualTo(String value) {
            addCriterion("client =", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotEqualTo(String value) {
            addCriterion("client <>", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThan(String value) {
            addCriterion("client >", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientGreaterThanOrEqualTo(String value) {
            addCriterion("client >=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThan(String value) {
            addCriterion("client <", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLessThanOrEqualTo(String value) {
            addCriterion("client <=", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientLike(String value) {
            addCriterion("client like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotLike(String value) {
            addCriterion("client not like", value, "client");
            return (Criteria) this;
        }

        public Criteria andClientIn(List<String> values) {
            addCriterion("client in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotIn(List<String> values) {
            addCriterion("client not in", values, "client");
            return (Criteria) this;
        }

        public Criteria andClientBetween(String value1, String value2) {
            addCriterion("client between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andClientNotBetween(String value1, String value2) {
            addCriterion("client not between", value1, value2, "client");
            return (Criteria) this;
        }

        public Criteria andOnterminationoftheaccountIsNull() {
            addCriterion("onTerminationOfTheAccount is null");
            return (Criteria) this;
        }

        public Criteria andOnterminationoftheaccountIsNotNull() {
            addCriterion("onTerminationOfTheAccount is not null");
            return (Criteria) this;
        }

        public Criteria andOnterminationoftheaccountEqualTo(Date value) {
            addCriterionForJDBCDate("onTerminationOfTheAccount =", value, "onterminationoftheaccount");
            return (Criteria) this;
        }

        public Criteria andOnterminationoftheaccountNotEqualTo(Date value) {
            addCriterionForJDBCDate("onTerminationOfTheAccount <>", value, "onterminationoftheaccount");
            return (Criteria) this;
        }

        public Criteria andOnterminationoftheaccountGreaterThan(Date value) {
            addCriterionForJDBCDate("onTerminationOfTheAccount >", value, "onterminationoftheaccount");
            return (Criteria) this;
        }

        public Criteria andOnterminationoftheaccountGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("onTerminationOfTheAccount >=", value, "onterminationoftheaccount");
            return (Criteria) this;
        }

        public Criteria andOnterminationoftheaccountLessThan(Date value) {
            addCriterionForJDBCDate("onTerminationOfTheAccount <", value, "onterminationoftheaccount");
            return (Criteria) this;
        }

        public Criteria andOnterminationoftheaccountLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("onTerminationOfTheAccount <=", value, "onterminationoftheaccount");
            return (Criteria) this;
        }

        public Criteria andOnterminationoftheaccountIn(List<Date> values) {
            addCriterionForJDBCDate("onTerminationOfTheAccount in", values, "onterminationoftheaccount");
            return (Criteria) this;
        }

        public Criteria andOnterminationoftheaccountNotIn(List<Date> values) {
            addCriterionForJDBCDate("onTerminationOfTheAccount not in", values, "onterminationoftheaccount");
            return (Criteria) this;
        }

        public Criteria andOnterminationoftheaccountBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("onTerminationOfTheAccount between", value1, value2, "onterminationoftheaccount");
            return (Criteria) this;
        }

        public Criteria andOnterminationoftheaccountNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("onTerminationOfTheAccount not between", value1, value2, "onterminationoftheaccount");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNull() {
            addCriterion("discount_rate is null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNotNull() {
            addCriterion("discount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateEqualTo(String value) {
            addCriterion("discount_rate =", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotEqualTo(String value) {
            addCriterion("discount_rate <>", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThan(String value) {
            addCriterion("discount_rate >", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThanOrEqualTo(String value) {
            addCriterion("discount_rate >=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThan(String value) {
            addCriterion("discount_rate <", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThanOrEqualTo(String value) {
            addCriterion("discount_rate <=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLike(String value) {
            addCriterion("discount_rate like", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotLike(String value) {
            addCriterion("discount_rate not like", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIn(List<String> values) {
            addCriterion("discount_rate in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotIn(List<String> values) {
            addCriterion("discount_rate not in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateBetween(String value1, String value2) {
            addCriterion("discount_rate between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotBetween(String value1, String value2) {
            addCriterion("discount_rate not between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andClearingForm1IsNull() {
            addCriterion("clearing_form1 is null");
            return (Criteria) this;
        }

        public Criteria andClearingForm1IsNotNull() {
            addCriterion("clearing_form1 is not null");
            return (Criteria) this;
        }

        public Criteria andClearingForm1EqualTo(String value) {
            addCriterion("clearing_form1 =", value, "clearingForm1");
            return (Criteria) this;
        }

        public Criteria andClearingForm1NotEqualTo(String value) {
            addCriterion("clearing_form1 <>", value, "clearingForm1");
            return (Criteria) this;
        }

        public Criteria andClearingForm1GreaterThan(String value) {
            addCriterion("clearing_form1 >", value, "clearingForm1");
            return (Criteria) this;
        }

        public Criteria andClearingForm1GreaterThanOrEqualTo(String value) {
            addCriterion("clearing_form1 >=", value, "clearingForm1");
            return (Criteria) this;
        }

        public Criteria andClearingForm1LessThan(String value) {
            addCriterion("clearing_form1 <", value, "clearingForm1");
            return (Criteria) this;
        }

        public Criteria andClearingForm1LessThanOrEqualTo(String value) {
            addCriterion("clearing_form1 <=", value, "clearingForm1");
            return (Criteria) this;
        }

        public Criteria andClearingForm1Like(String value) {
            addCriterion("clearing_form1 like", value, "clearingForm1");
            return (Criteria) this;
        }

        public Criteria andClearingForm1NotLike(String value) {
            addCriterion("clearing_form1 not like", value, "clearingForm1");
            return (Criteria) this;
        }

        public Criteria andClearingForm1In(List<String> values) {
            addCriterion("clearing_form1 in", values, "clearingForm1");
            return (Criteria) this;
        }

        public Criteria andClearingForm1NotIn(List<String> values) {
            addCriterion("clearing_form1 not in", values, "clearingForm1");
            return (Criteria) this;
        }

        public Criteria andClearingForm1Between(String value1, String value2) {
            addCriterion("clearing_form1 between", value1, value2, "clearingForm1");
            return (Criteria) this;
        }

        public Criteria andClearingForm1NotBetween(String value1, String value2) {
            addCriterion("clearing_form1 not between", value1, value2, "clearingForm1");
            return (Criteria) this;
        }

        public Criteria andClearingForm2IsNull() {
            addCriterion("clearing_form2 is null");
            return (Criteria) this;
        }

        public Criteria andClearingForm2IsNotNull() {
            addCriterion("clearing_form2 is not null");
            return (Criteria) this;
        }

        public Criteria andClearingForm2EqualTo(String value) {
            addCriterion("clearing_form2 =", value, "clearingForm2");
            return (Criteria) this;
        }

        public Criteria andClearingForm2NotEqualTo(String value) {
            addCriterion("clearing_form2 <>", value, "clearingForm2");
            return (Criteria) this;
        }

        public Criteria andClearingForm2GreaterThan(String value) {
            addCriterion("clearing_form2 >", value, "clearingForm2");
            return (Criteria) this;
        }

        public Criteria andClearingForm2GreaterThanOrEqualTo(String value) {
            addCriterion("clearing_form2 >=", value, "clearingForm2");
            return (Criteria) this;
        }

        public Criteria andClearingForm2LessThan(String value) {
            addCriterion("clearing_form2 <", value, "clearingForm2");
            return (Criteria) this;
        }

        public Criteria andClearingForm2LessThanOrEqualTo(String value) {
            addCriterion("clearing_form2 <=", value, "clearingForm2");
            return (Criteria) this;
        }

        public Criteria andClearingForm2Like(String value) {
            addCriterion("clearing_form2 like", value, "clearingForm2");
            return (Criteria) this;
        }

        public Criteria andClearingForm2NotLike(String value) {
            addCriterion("clearing_form2 not like", value, "clearingForm2");
            return (Criteria) this;
        }

        public Criteria andClearingForm2In(List<String> values) {
            addCriterion("clearing_form2 in", values, "clearingForm2");
            return (Criteria) this;
        }

        public Criteria andClearingForm2NotIn(List<String> values) {
            addCriterion("clearing_form2 not in", values, "clearingForm2");
            return (Criteria) this;
        }

        public Criteria andClearingForm2Between(String value1, String value2) {
            addCriterion("clearing_form2 between", value1, value2, "clearingForm2");
            return (Criteria) this;
        }

        public Criteria andClearingForm2NotBetween(String value1, String value2) {
            addCriterion("clearing_form2 not between", value1, value2, "clearingForm2");
            return (Criteria) this;
        }

        public Criteria andClearingForm3IsNull() {
            addCriterion("clearing_form3 is null");
            return (Criteria) this;
        }

        public Criteria andClearingForm3IsNotNull() {
            addCriterion("clearing_form3 is not null");
            return (Criteria) this;
        }

        public Criteria andClearingForm3EqualTo(String value) {
            addCriterion("clearing_form3 =", value, "clearingForm3");
            return (Criteria) this;
        }

        public Criteria andClearingForm3NotEqualTo(String value) {
            addCriterion("clearing_form3 <>", value, "clearingForm3");
            return (Criteria) this;
        }

        public Criteria andClearingForm3GreaterThan(String value) {
            addCriterion("clearing_form3 >", value, "clearingForm3");
            return (Criteria) this;
        }

        public Criteria andClearingForm3GreaterThanOrEqualTo(String value) {
            addCriterion("clearing_form3 >=", value, "clearingForm3");
            return (Criteria) this;
        }

        public Criteria andClearingForm3LessThan(String value) {
            addCriterion("clearing_form3 <", value, "clearingForm3");
            return (Criteria) this;
        }

        public Criteria andClearingForm3LessThanOrEqualTo(String value) {
            addCriterion("clearing_form3 <=", value, "clearingForm3");
            return (Criteria) this;
        }

        public Criteria andClearingForm3Like(String value) {
            addCriterion("clearing_form3 like", value, "clearingForm3");
            return (Criteria) this;
        }

        public Criteria andClearingForm3NotLike(String value) {
            addCriterion("clearing_form3 not like", value, "clearingForm3");
            return (Criteria) this;
        }

        public Criteria andClearingForm3In(List<String> values) {
            addCriterion("clearing_form3 in", values, "clearingForm3");
            return (Criteria) this;
        }

        public Criteria andClearingForm3NotIn(List<String> values) {
            addCriterion("clearing_form3 not in", values, "clearingForm3");
            return (Criteria) this;
        }

        public Criteria andClearingForm3Between(String value1, String value2) {
            addCriterion("clearing_form3 between", value1, value2, "clearingForm3");
            return (Criteria) this;
        }

        public Criteria andClearingForm3NotBetween(String value1, String value2) {
            addCriterion("clearing_form3 not between", value1, value2, "clearingForm3");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andMakepersonIsNull() {
            addCriterion("makePerson is null");
            return (Criteria) this;
        }

        public Criteria andMakepersonIsNotNull() {
            addCriterion("makePerson is not null");
            return (Criteria) this;
        }

        public Criteria andMakepersonEqualTo(String value) {
            addCriterion("makePerson =", value, "makeperson");
            return (Criteria) this;
        }

        public Criteria andMakepersonNotEqualTo(String value) {
            addCriterion("makePerson <>", value, "makeperson");
            return (Criteria) this;
        }

        public Criteria andMakepersonGreaterThan(String value) {
            addCriterion("makePerson >", value, "makeperson");
            return (Criteria) this;
        }

        public Criteria andMakepersonGreaterThanOrEqualTo(String value) {
            addCriterion("makePerson >=", value, "makeperson");
            return (Criteria) this;
        }

        public Criteria andMakepersonLessThan(String value) {
            addCriterion("makePerson <", value, "makeperson");
            return (Criteria) this;
        }

        public Criteria andMakepersonLessThanOrEqualTo(String value) {
            addCriterion("makePerson <=", value, "makeperson");
            return (Criteria) this;
        }

        public Criteria andMakepersonLike(String value) {
            addCriterion("makePerson like", value, "makeperson");
            return (Criteria) this;
        }

        public Criteria andMakepersonNotLike(String value) {
            addCriterion("makePerson not like", value, "makeperson");
            return (Criteria) this;
        }

        public Criteria andMakepersonIn(List<String> values) {
            addCriterion("makePerson in", values, "makeperson");
            return (Criteria) this;
        }

        public Criteria andMakepersonNotIn(List<String> values) {
            addCriterion("makePerson not in", values, "makeperson");
            return (Criteria) this;
        }

        public Criteria andMakepersonBetween(String value1, String value2) {
            addCriterion("makePerson between", value1, value2, "makeperson");
            return (Criteria) this;
        }

        public Criteria andMakepersonNotBetween(String value1, String value2) {
            addCriterion("makePerson not between", value1, value2, "makeperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIsNull() {
            addCriterion("checkPerson is null");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIsNotNull() {
            addCriterion("checkPerson is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpersonEqualTo(String value) {
            addCriterion("checkPerson =", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotEqualTo(String value) {
            addCriterion("checkPerson <>", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonGreaterThan(String value) {
            addCriterion("checkPerson >", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonGreaterThanOrEqualTo(String value) {
            addCriterion("checkPerson >=", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLessThan(String value) {
            addCriterion("checkPerson <", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLessThanOrEqualTo(String value) {
            addCriterion("checkPerson <=", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLike(String value) {
            addCriterion("checkPerson like", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotLike(String value) {
            addCriterion("checkPerson not like", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIn(List<String> values) {
            addCriterion("checkPerson in", values, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotIn(List<String> values) {
            addCriterion("checkPerson not in", values, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonBetween(String value1, String value2) {
            addCriterion("checkPerson between", value1, value2, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotBetween(String value1, String value2) {
            addCriterion("checkPerson not between", value1, value2, "checkperson");
            return (Criteria) this;
        }

        public Criteria andSubordinatetotheprojectIsNull() {
            addCriterion("subordinateToTheProject is null");
            return (Criteria) this;
        }

        public Criteria andSubordinatetotheprojectIsNotNull() {
            addCriterion("subordinateToTheProject is not null");
            return (Criteria) this;
        }

        public Criteria andSubordinatetotheprojectEqualTo(String value) {
            addCriterion("subordinateToTheProject =", value, "subordinatetotheproject");
            return (Criteria) this;
        }

        public Criteria andSubordinatetotheprojectNotEqualTo(String value) {
            addCriterion("subordinateToTheProject <>", value, "subordinatetotheproject");
            return (Criteria) this;
        }

        public Criteria andSubordinatetotheprojectGreaterThan(String value) {
            addCriterion("subordinateToTheProject >", value, "subordinatetotheproject");
            return (Criteria) this;
        }

        public Criteria andSubordinatetotheprojectGreaterThanOrEqualTo(String value) {
            addCriterion("subordinateToTheProject >=", value, "subordinatetotheproject");
            return (Criteria) this;
        }

        public Criteria andSubordinatetotheprojectLessThan(String value) {
            addCriterion("subordinateToTheProject <", value, "subordinatetotheproject");
            return (Criteria) this;
        }

        public Criteria andSubordinatetotheprojectLessThanOrEqualTo(String value) {
            addCriterion("subordinateToTheProject <=", value, "subordinatetotheproject");
            return (Criteria) this;
        }

        public Criteria andSubordinatetotheprojectLike(String value) {
            addCriterion("subordinateToTheProject like", value, "subordinatetotheproject");
            return (Criteria) this;
        }

        public Criteria andSubordinatetotheprojectNotLike(String value) {
            addCriterion("subordinateToTheProject not like", value, "subordinatetotheproject");
            return (Criteria) this;
        }

        public Criteria andSubordinatetotheprojectIn(List<String> values) {
            addCriterion("subordinateToTheProject in", values, "subordinatetotheproject");
            return (Criteria) this;
        }

        public Criteria andSubordinatetotheprojectNotIn(List<String> values) {
            addCriterion("subordinateToTheProject not in", values, "subordinatetotheproject");
            return (Criteria) this;
        }

        public Criteria andSubordinatetotheprojectBetween(String value1, String value2) {
            addCriterion("subordinateToTheProject between", value1, value2, "subordinatetotheproject");
            return (Criteria) this;
        }

        public Criteria andSubordinatetotheprojectNotBetween(String value1, String value2) {
            addCriterion("subordinateToTheProject not between", value1, value2, "subordinatetotheproject");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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

        public Criteria andYMoneyShouldIsNull() {
            addCriterion("y_money_should is null");
            return (Criteria) this;
        }

        public Criteria andYMoneyShouldIsNotNull() {
            addCriterion("y_money_should is not null");
            return (Criteria) this;
        }

        public Criteria andYMoneyShouldEqualTo(String value) {
            addCriterion("y_money_should =", value, "yMoneyShould");
            return (Criteria) this;
        }

        public Criteria andYMoneyShouldNotEqualTo(String value) {
            addCriterion("y_money_should <>", value, "yMoneyShould");
            return (Criteria) this;
        }

        public Criteria andYMoneyShouldGreaterThan(String value) {
            addCriterion("y_money_should >", value, "yMoneyShould");
            return (Criteria) this;
        }

        public Criteria andYMoneyShouldGreaterThanOrEqualTo(String value) {
            addCriterion("y_money_should >=", value, "yMoneyShould");
            return (Criteria) this;
        }

        public Criteria andYMoneyShouldLessThan(String value) {
            addCriterion("y_money_should <", value, "yMoneyShould");
            return (Criteria) this;
        }

        public Criteria andYMoneyShouldLessThanOrEqualTo(String value) {
            addCriterion("y_money_should <=", value, "yMoneyShould");
            return (Criteria) this;
        }

        public Criteria andYMoneyShouldLike(String value) {
            addCriterion("y_money_should like", value, "yMoneyShould");
            return (Criteria) this;
        }

        public Criteria andYMoneyShouldNotLike(String value) {
            addCriterion("y_money_should not like", value, "yMoneyShould");
            return (Criteria) this;
        }

        public Criteria andYMoneyShouldIn(List<String> values) {
            addCriterion("y_money_should in", values, "yMoneyShould");
            return (Criteria) this;
        }

        public Criteria andYMoneyShouldNotIn(List<String> values) {
            addCriterion("y_money_should not in", values, "yMoneyShould");
            return (Criteria) this;
        }

        public Criteria andYMoneyShouldBetween(String value1, String value2) {
            addCriterion("y_money_should between", value1, value2, "yMoneyShould");
            return (Criteria) this;
        }

        public Criteria andYMoneyShouldNotBetween(String value1, String value2) {
            addCriterion("y_money_should not between", value1, value2, "yMoneyShould");
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