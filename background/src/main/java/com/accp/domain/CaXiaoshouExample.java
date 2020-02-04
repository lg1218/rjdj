package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CaXiaoshouExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaXiaoshouExample() {
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

        public Criteria andCaIdIsNull() {
            addCriterion("Ca_id is null");
            return (Criteria) this;
        }

        public Criteria andCaIdIsNotNull() {
            addCriterion("Ca_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaIdEqualTo(String value) {
            addCriterion("Ca_id =", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotEqualTo(String value) {
            addCriterion("Ca_id <>", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdGreaterThan(String value) {
            addCriterion("Ca_id >", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_id >=", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLessThan(String value) {
            addCriterion("Ca_id <", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLessThanOrEqualTo(String value) {
            addCriterion("Ca_id <=", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLike(String value) {
            addCriterion("Ca_id like", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotLike(String value) {
            addCriterion("Ca_id not like", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdIn(List<String> values) {
            addCriterion("Ca_id in", values, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotIn(List<String> values) {
            addCriterion("Ca_id not in", values, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdBetween(String value1, String value2) {
            addCriterion("Ca_id between", value1, value2, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotBetween(String value1, String value2) {
            addCriterion("Ca_id not between", value1, value2, "caId");
            return (Criteria) this;
        }

        public Criteria andCaClientidIsNull() {
            addCriterion("Ca_clientId is null");
            return (Criteria) this;
        }

        public Criteria andCaClientidIsNotNull() {
            addCriterion("Ca_clientId is not null");
            return (Criteria) this;
        }

        public Criteria andCaClientidEqualTo(String value) {
            addCriterion("Ca_clientId =", value, "caClientid");
            return (Criteria) this;
        }

        public Criteria andCaClientidNotEqualTo(String value) {
            addCriterion("Ca_clientId <>", value, "caClientid");
            return (Criteria) this;
        }

        public Criteria andCaClientidGreaterThan(String value) {
            addCriterion("Ca_clientId >", value, "caClientid");
            return (Criteria) this;
        }

        public Criteria andCaClientidGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_clientId >=", value, "caClientid");
            return (Criteria) this;
        }

        public Criteria andCaClientidLessThan(String value) {
            addCriterion("Ca_clientId <", value, "caClientid");
            return (Criteria) this;
        }

        public Criteria andCaClientidLessThanOrEqualTo(String value) {
            addCriterion("Ca_clientId <=", value, "caClientid");
            return (Criteria) this;
        }

        public Criteria andCaClientidLike(String value) {
            addCriterion("Ca_clientId like", value, "caClientid");
            return (Criteria) this;
        }

        public Criteria andCaClientidNotLike(String value) {
            addCriterion("Ca_clientId not like", value, "caClientid");
            return (Criteria) this;
        }

        public Criteria andCaClientidIn(List<String> values) {
            addCriterion("Ca_clientId in", values, "caClientid");
            return (Criteria) this;
        }

        public Criteria andCaClientidNotIn(List<String> values) {
            addCriterion("Ca_clientId not in", values, "caClientid");
            return (Criteria) this;
        }

        public Criteria andCaClientidBetween(String value1, String value2) {
            addCriterion("Ca_clientId between", value1, value2, "caClientid");
            return (Criteria) this;
        }

        public Criteria andCaClientidNotBetween(String value1, String value2) {
            addCriterion("Ca_clientId not between", value1, value2, "caClientid");
            return (Criteria) this;
        }

        public Criteria andCaClientnameIsNull() {
            addCriterion("Ca_clientName is null");
            return (Criteria) this;
        }

        public Criteria andCaClientnameIsNotNull() {
            addCriterion("Ca_clientName is not null");
            return (Criteria) this;
        }

        public Criteria andCaClientnameEqualTo(String value) {
            addCriterion("Ca_clientName =", value, "caClientname");
            return (Criteria) this;
        }

        public Criteria andCaClientnameNotEqualTo(String value) {
            addCriterion("Ca_clientName <>", value, "caClientname");
            return (Criteria) this;
        }

        public Criteria andCaClientnameGreaterThan(String value) {
            addCriterion("Ca_clientName >", value, "caClientname");
            return (Criteria) this;
        }

        public Criteria andCaClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_clientName >=", value, "caClientname");
            return (Criteria) this;
        }

        public Criteria andCaClientnameLessThan(String value) {
            addCriterion("Ca_clientName <", value, "caClientname");
            return (Criteria) this;
        }

        public Criteria andCaClientnameLessThanOrEqualTo(String value) {
            addCriterion("Ca_clientName <=", value, "caClientname");
            return (Criteria) this;
        }

        public Criteria andCaClientnameLike(String value) {
            addCriterion("Ca_clientName like", value, "caClientname");
            return (Criteria) this;
        }

        public Criteria andCaClientnameNotLike(String value) {
            addCriterion("Ca_clientName not like", value, "caClientname");
            return (Criteria) this;
        }

        public Criteria andCaClientnameIn(List<String> values) {
            addCriterion("Ca_clientName in", values, "caClientname");
            return (Criteria) this;
        }

        public Criteria andCaClientnameNotIn(List<String> values) {
            addCriterion("Ca_clientName not in", values, "caClientname");
            return (Criteria) this;
        }

        public Criteria andCaClientnameBetween(String value1, String value2) {
            addCriterion("Ca_clientName between", value1, value2, "caClientname");
            return (Criteria) this;
        }

        public Criteria andCaClientnameNotBetween(String value1, String value2) {
            addCriterion("Ca_clientName not between", value1, value2, "caClientname");
            return (Criteria) this;
        }

        public Criteria andCaContaintaxIsNull() {
            addCriterion("Ca_containTax is null");
            return (Criteria) this;
        }

        public Criteria andCaContaintaxIsNotNull() {
            addCriterion("Ca_containTax is not null");
            return (Criteria) this;
        }

        public Criteria andCaContaintaxEqualTo(Integer value) {
            addCriterion("Ca_containTax =", value, "caContaintax");
            return (Criteria) this;
        }

        public Criteria andCaContaintaxNotEqualTo(Integer value) {
            addCriterion("Ca_containTax <>", value, "caContaintax");
            return (Criteria) this;
        }

        public Criteria andCaContaintaxGreaterThan(Integer value) {
            addCriterion("Ca_containTax >", value, "caContaintax");
            return (Criteria) this;
        }

        public Criteria andCaContaintaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ca_containTax >=", value, "caContaintax");
            return (Criteria) this;
        }

        public Criteria andCaContaintaxLessThan(Integer value) {
            addCriterion("Ca_containTax <", value, "caContaintax");
            return (Criteria) this;
        }

        public Criteria andCaContaintaxLessThanOrEqualTo(Integer value) {
            addCriterion("Ca_containTax <=", value, "caContaintax");
            return (Criteria) this;
        }

        public Criteria andCaContaintaxIn(List<Integer> values) {
            addCriterion("Ca_containTax in", values, "caContaintax");
            return (Criteria) this;
        }

        public Criteria andCaContaintaxNotIn(List<Integer> values) {
            addCriterion("Ca_containTax not in", values, "caContaintax");
            return (Criteria) this;
        }

        public Criteria andCaContaintaxBetween(Integer value1, Integer value2) {
            addCriterion("Ca_containTax between", value1, value2, "caContaintax");
            return (Criteria) this;
        }

        public Criteria andCaContaintaxNotBetween(Integer value1, Integer value2) {
            addCriterion("Ca_containTax not between", value1, value2, "caContaintax");
            return (Criteria) this;
        }

        public Criteria andCaMoneytypeIsNull() {
            addCriterion("\"Ca moneyType\" is null");
            return (Criteria) this;
        }

        public Criteria andCaMoneytypeIsNotNull() {
            addCriterion("\"Ca moneyType\" is not null");
            return (Criteria) this;
        }

        public Criteria andCaMoneytypeEqualTo(String value) {
            addCriterion("\"Ca moneyType\" =", value, "caMoneytype");
            return (Criteria) this;
        }

        public Criteria andCaMoneytypeNotEqualTo(String value) {
            addCriterion("\"Ca moneyType\" <>", value, "caMoneytype");
            return (Criteria) this;
        }

        public Criteria andCaMoneytypeGreaterThan(String value) {
            addCriterion("\"Ca moneyType\" >", value, "caMoneytype");
            return (Criteria) this;
        }

        public Criteria andCaMoneytypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"Ca moneyType\" >=", value, "caMoneytype");
            return (Criteria) this;
        }

        public Criteria andCaMoneytypeLessThan(String value) {
            addCriterion("\"Ca moneyType\" <", value, "caMoneytype");
            return (Criteria) this;
        }

        public Criteria andCaMoneytypeLessThanOrEqualTo(String value) {
            addCriterion("\"Ca moneyType\" <=", value, "caMoneytype");
            return (Criteria) this;
        }

        public Criteria andCaMoneytypeLike(String value) {
            addCriterion("\"Ca moneyType\" like", value, "caMoneytype");
            return (Criteria) this;
        }

        public Criteria andCaMoneytypeNotLike(String value) {
            addCriterion("\"Ca moneyType\" not like", value, "caMoneytype");
            return (Criteria) this;
        }

        public Criteria andCaMoneytypeIn(List<String> values) {
            addCriterion("\"Ca moneyType\" in", values, "caMoneytype");
            return (Criteria) this;
        }

        public Criteria andCaMoneytypeNotIn(List<String> values) {
            addCriterion("\"Ca moneyType\" not in", values, "caMoneytype");
            return (Criteria) this;
        }

        public Criteria andCaMoneytypeBetween(String value1, String value2) {
            addCriterion("\"Ca moneyType\" between", value1, value2, "caMoneytype");
            return (Criteria) this;
        }

        public Criteria andCaMoneytypeNotBetween(String value1, String value2) {
            addCriterion("\"Ca moneyType\" not between", value1, value2, "caMoneytype");
            return (Criteria) this;
        }

        public Criteria andCaInsToragenameIsNull() {
            addCriterion("\"Ca_ins torageName\" is null");
            return (Criteria) this;
        }

        public Criteria andCaInsToragenameIsNotNull() {
            addCriterion("\"Ca_ins torageName\" is not null");
            return (Criteria) this;
        }

        public Criteria andCaInsToragenameEqualTo(String value) {
            addCriterion("\"Ca_ins torageName\" =", value, "caInsToragename");
            return (Criteria) this;
        }

        public Criteria andCaInsToragenameNotEqualTo(String value) {
            addCriterion("\"Ca_ins torageName\" <>", value, "caInsToragename");
            return (Criteria) this;
        }

        public Criteria andCaInsToragenameGreaterThan(String value) {
            addCriterion("\"Ca_ins torageName\" >", value, "caInsToragename");
            return (Criteria) this;
        }

        public Criteria andCaInsToragenameGreaterThanOrEqualTo(String value) {
            addCriterion("\"Ca_ins torageName\" >=", value, "caInsToragename");
            return (Criteria) this;
        }

        public Criteria andCaInsToragenameLessThan(String value) {
            addCriterion("\"Ca_ins torageName\" <", value, "caInsToragename");
            return (Criteria) this;
        }

        public Criteria andCaInsToragenameLessThanOrEqualTo(String value) {
            addCriterion("\"Ca_ins torageName\" <=", value, "caInsToragename");
            return (Criteria) this;
        }

        public Criteria andCaInsToragenameLike(String value) {
            addCriterion("\"Ca_ins torageName\" like", value, "caInsToragename");
            return (Criteria) this;
        }

        public Criteria andCaInsToragenameNotLike(String value) {
            addCriterion("\"Ca_ins torageName\" not like", value, "caInsToragename");
            return (Criteria) this;
        }

        public Criteria andCaInsToragenameIn(List<String> values) {
            addCriterion("\"Ca_ins torageName\" in", values, "caInsToragename");
            return (Criteria) this;
        }

        public Criteria andCaInsToragenameNotIn(List<String> values) {
            addCriterion("\"Ca_ins torageName\" not in", values, "caInsToragename");
            return (Criteria) this;
        }

        public Criteria andCaInsToragenameBetween(String value1, String value2) {
            addCriterion("\"Ca_ins torageName\" between", value1, value2, "caInsToragename");
            return (Criteria) this;
        }

        public Criteria andCaInsToragenameNotBetween(String value1, String value2) {
            addCriterion("\"Ca_ins torageName\" not between", value1, value2, "caInsToragename");
            return (Criteria) this;
        }

        public Criteria andCaInsTorageidIsNull() {
            addCriterion("\"Ca_ins torageId\" is null");
            return (Criteria) this;
        }

        public Criteria andCaInsTorageidIsNotNull() {
            addCriterion("\"Ca_ins torageId\" is not null");
            return (Criteria) this;
        }

        public Criteria andCaInsTorageidEqualTo(String value) {
            addCriterion("\"Ca_ins torageId\" =", value, "caInsTorageid");
            return (Criteria) this;
        }

        public Criteria andCaInsTorageidNotEqualTo(String value) {
            addCriterion("\"Ca_ins torageId\" <>", value, "caInsTorageid");
            return (Criteria) this;
        }

        public Criteria andCaInsTorageidGreaterThan(String value) {
            addCriterion("\"Ca_ins torageId\" >", value, "caInsTorageid");
            return (Criteria) this;
        }

        public Criteria andCaInsTorageidGreaterThanOrEqualTo(String value) {
            addCriterion("\"Ca_ins torageId\" >=", value, "caInsTorageid");
            return (Criteria) this;
        }

        public Criteria andCaInsTorageidLessThan(String value) {
            addCriterion("\"Ca_ins torageId\" <", value, "caInsTorageid");
            return (Criteria) this;
        }

        public Criteria andCaInsTorageidLessThanOrEqualTo(String value) {
            addCriterion("\"Ca_ins torageId\" <=", value, "caInsTorageid");
            return (Criteria) this;
        }

        public Criteria andCaInsTorageidLike(String value) {
            addCriterion("\"Ca_ins torageId\" like", value, "caInsTorageid");
            return (Criteria) this;
        }

        public Criteria andCaInsTorageidNotLike(String value) {
            addCriterion("\"Ca_ins torageId\" not like", value, "caInsTorageid");
            return (Criteria) this;
        }

        public Criteria andCaInsTorageidIn(List<String> values) {
            addCriterion("\"Ca_ins torageId\" in", values, "caInsTorageid");
            return (Criteria) this;
        }

        public Criteria andCaInsTorageidNotIn(List<String> values) {
            addCriterion("\"Ca_ins torageId\" not in", values, "caInsTorageid");
            return (Criteria) this;
        }

        public Criteria andCaInsTorageidBetween(String value1, String value2) {
            addCriterion("\"Ca_ins torageId\" between", value1, value2, "caInsTorageid");
            return (Criteria) this;
        }

        public Criteria andCaInsTorageidNotBetween(String value1, String value2) {
            addCriterion("\"Ca_ins torageId\" not between", value1, value2, "caInsTorageid");
            return (Criteria) this;
        }

        public Criteria andCaRateIsNull() {
            addCriterion("Ca_rate is null");
            return (Criteria) this;
        }

        public Criteria andCaRateIsNotNull() {
            addCriterion("Ca_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCaRateEqualTo(Double value) {
            addCriterion("Ca_rate =", value, "caRate");
            return (Criteria) this;
        }

        public Criteria andCaRateNotEqualTo(Double value) {
            addCriterion("Ca_rate <>", value, "caRate");
            return (Criteria) this;
        }

        public Criteria andCaRateGreaterThan(Double value) {
            addCriterion("Ca_rate >", value, "caRate");
            return (Criteria) this;
        }

        public Criteria andCaRateGreaterThanOrEqualTo(Double value) {
            addCriterion("Ca_rate >=", value, "caRate");
            return (Criteria) this;
        }

        public Criteria andCaRateLessThan(Double value) {
            addCriterion("Ca_rate <", value, "caRate");
            return (Criteria) this;
        }

        public Criteria andCaRateLessThanOrEqualTo(Double value) {
            addCriterion("Ca_rate <=", value, "caRate");
            return (Criteria) this;
        }

        public Criteria andCaRateIn(List<Double> values) {
            addCriterion("Ca_rate in", values, "caRate");
            return (Criteria) this;
        }

        public Criteria andCaRateNotIn(List<Double> values) {
            addCriterion("Ca_rate not in", values, "caRate");
            return (Criteria) this;
        }

        public Criteria andCaRateBetween(Double value1, Double value2) {
            addCriterion("Ca_rate between", value1, value2, "caRate");
            return (Criteria) this;
        }

        public Criteria andCaRateNotBetween(Double value1, Double value2) {
            addCriterion("Ca_rate not between", value1, value2, "caRate");
            return (Criteria) this;
        }

        public Criteria andCaAfreshinstorageIsNull() {
            addCriterion("Ca_afreshInstorage is null");
            return (Criteria) this;
        }

        public Criteria andCaAfreshinstorageIsNotNull() {
            addCriterion("Ca_afreshInstorage is not null");
            return (Criteria) this;
        }

        public Criteria andCaAfreshinstorageEqualTo(Integer value) {
            addCriterion("Ca_afreshInstorage =", value, "caAfreshinstorage");
            return (Criteria) this;
        }

        public Criteria andCaAfreshinstorageNotEqualTo(Integer value) {
            addCriterion("Ca_afreshInstorage <>", value, "caAfreshinstorage");
            return (Criteria) this;
        }

        public Criteria andCaAfreshinstorageGreaterThan(Integer value) {
            addCriterion("Ca_afreshInstorage >", value, "caAfreshinstorage");
            return (Criteria) this;
        }

        public Criteria andCaAfreshinstorageGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ca_afreshInstorage >=", value, "caAfreshinstorage");
            return (Criteria) this;
        }

        public Criteria andCaAfreshinstorageLessThan(Integer value) {
            addCriterion("Ca_afreshInstorage <", value, "caAfreshinstorage");
            return (Criteria) this;
        }

        public Criteria andCaAfreshinstorageLessThanOrEqualTo(Integer value) {
            addCriterion("Ca_afreshInstorage <=", value, "caAfreshinstorage");
            return (Criteria) this;
        }

        public Criteria andCaAfreshinstorageIn(List<Integer> values) {
            addCriterion("Ca_afreshInstorage in", values, "caAfreshinstorage");
            return (Criteria) this;
        }

        public Criteria andCaAfreshinstorageNotIn(List<Integer> values) {
            addCriterion("Ca_afreshInstorage not in", values, "caAfreshinstorage");
            return (Criteria) this;
        }

        public Criteria andCaAfreshinstorageBetween(Integer value1, Integer value2) {
            addCriterion("Ca_afreshInstorage between", value1, value2, "caAfreshinstorage");
            return (Criteria) this;
        }

        public Criteria andCaAfreshinstorageNotBetween(Integer value1, Integer value2) {
            addCriterion("Ca_afreshInstorage not between", value1, value2, "caAfreshinstorage");
            return (Criteria) this;
        }

        public Criteria andCaDateIsNull() {
            addCriterion("Ca_date is null");
            return (Criteria) this;
        }

        public Criteria andCaDateIsNotNull() {
            addCriterion("Ca_date is not null");
            return (Criteria) this;
        }

        public Criteria andCaDateEqualTo(Date value) {
            addCriterionForJDBCDate("Ca_date =", value, "caDate");
            return (Criteria) this;
        }

        public Criteria andCaDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Ca_date <>", value, "caDate");
            return (Criteria) this;
        }

        public Criteria andCaDateGreaterThan(Date value) {
            addCriterionForJDBCDate("Ca_date >", value, "caDate");
            return (Criteria) this;
        }

        public Criteria andCaDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Ca_date >=", value, "caDate");
            return (Criteria) this;
        }

        public Criteria andCaDateLessThan(Date value) {
            addCriterionForJDBCDate("Ca_date <", value, "caDate");
            return (Criteria) this;
        }

        public Criteria andCaDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Ca_date <=", value, "caDate");
            return (Criteria) this;
        }

        public Criteria andCaDateIn(List<Date> values) {
            addCriterionForJDBCDate("Ca_date in", values, "caDate");
            return (Criteria) this;
        }

        public Criteria andCaDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Ca_date not in", values, "caDate");
            return (Criteria) this;
        }

        public Criteria andCaDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Ca_date between", value1, value2, "caDate");
            return (Criteria) this;
        }

        public Criteria andCaDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Ca_date not between", value1, value2, "caDate");
            return (Criteria) this;
        }

        public Criteria andCaMoneyattachIsNull() {
            addCriterion("Ca_moneyAttach is null");
            return (Criteria) this;
        }

        public Criteria andCaMoneyattachIsNotNull() {
            addCriterion("Ca_moneyAttach is not null");
            return (Criteria) this;
        }

        public Criteria andCaMoneyattachEqualTo(String value) {
            addCriterion("Ca_moneyAttach =", value, "caMoneyattach");
            return (Criteria) this;
        }

        public Criteria andCaMoneyattachNotEqualTo(String value) {
            addCriterion("Ca_moneyAttach <>", value, "caMoneyattach");
            return (Criteria) this;
        }

        public Criteria andCaMoneyattachGreaterThan(String value) {
            addCriterion("Ca_moneyAttach >", value, "caMoneyattach");
            return (Criteria) this;
        }

        public Criteria andCaMoneyattachGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_moneyAttach >=", value, "caMoneyattach");
            return (Criteria) this;
        }

        public Criteria andCaMoneyattachLessThan(String value) {
            addCriterion("Ca_moneyAttach <", value, "caMoneyattach");
            return (Criteria) this;
        }

        public Criteria andCaMoneyattachLessThanOrEqualTo(String value) {
            addCriterion("Ca_moneyAttach <=", value, "caMoneyattach");
            return (Criteria) this;
        }

        public Criteria andCaMoneyattachLike(String value) {
            addCriterion("Ca_moneyAttach like", value, "caMoneyattach");
            return (Criteria) this;
        }

        public Criteria andCaMoneyattachNotLike(String value) {
            addCriterion("Ca_moneyAttach not like", value, "caMoneyattach");
            return (Criteria) this;
        }

        public Criteria andCaMoneyattachIn(List<String> values) {
            addCriterion("Ca_moneyAttach in", values, "caMoneyattach");
            return (Criteria) this;
        }

        public Criteria andCaMoneyattachNotIn(List<String> values) {
            addCriterion("Ca_moneyAttach not in", values, "caMoneyattach");
            return (Criteria) this;
        }

        public Criteria andCaMoneyattachBetween(String value1, String value2) {
            addCriterion("Ca_moneyAttach between", value1, value2, "caMoneyattach");
            return (Criteria) this;
        }

        public Criteria andCaMoneyattachNotBetween(String value1, String value2) {
            addCriterion("Ca_moneyAttach not between", value1, value2, "caMoneyattach");
            return (Criteria) this;
        }

        public Criteria andCaMoneytermIsNull() {
            addCriterion("Ca_moneyTerm is null");
            return (Criteria) this;
        }

        public Criteria andCaMoneytermIsNotNull() {
            addCriterion("Ca_moneyTerm is not null");
            return (Criteria) this;
        }

        public Criteria andCaMoneytermEqualTo(String value) {
            addCriterion("Ca_moneyTerm =", value, "caMoneyterm");
            return (Criteria) this;
        }

        public Criteria andCaMoneytermNotEqualTo(String value) {
            addCriterion("Ca_moneyTerm <>", value, "caMoneyterm");
            return (Criteria) this;
        }

        public Criteria andCaMoneytermGreaterThan(String value) {
            addCriterion("Ca_moneyTerm >", value, "caMoneyterm");
            return (Criteria) this;
        }

        public Criteria andCaMoneytermGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_moneyTerm >=", value, "caMoneyterm");
            return (Criteria) this;
        }

        public Criteria andCaMoneytermLessThan(String value) {
            addCriterion("Ca_moneyTerm <", value, "caMoneyterm");
            return (Criteria) this;
        }

        public Criteria andCaMoneytermLessThanOrEqualTo(String value) {
            addCriterion("Ca_moneyTerm <=", value, "caMoneyterm");
            return (Criteria) this;
        }

        public Criteria andCaMoneytermLike(String value) {
            addCriterion("Ca_moneyTerm like", value, "caMoneyterm");
            return (Criteria) this;
        }

        public Criteria andCaMoneytermNotLike(String value) {
            addCriterion("Ca_moneyTerm not like", value, "caMoneyterm");
            return (Criteria) this;
        }

        public Criteria andCaMoneytermIn(List<String> values) {
            addCriterion("Ca_moneyTerm in", values, "caMoneyterm");
            return (Criteria) this;
        }

        public Criteria andCaMoneytermNotIn(List<String> values) {
            addCriterion("Ca_moneyTerm not in", values, "caMoneyterm");
            return (Criteria) this;
        }

        public Criteria andCaMoneytermBetween(String value1, String value2) {
            addCriterion("Ca_moneyTerm between", value1, value2, "caMoneyterm");
            return (Criteria) this;
        }

        public Criteria andCaMoneytermNotBetween(String value1, String value2) {
            addCriterion("Ca_moneyTerm not between", value1, value2, "caMoneyterm");
            return (Criteria) this;
        }

        public Criteria andCaMoneymonthIsNull() {
            addCriterion("Ca_moneyMonth is null");
            return (Criteria) this;
        }

        public Criteria andCaMoneymonthIsNotNull() {
            addCriterion("Ca_moneyMonth is not null");
            return (Criteria) this;
        }

        public Criteria andCaMoneymonthEqualTo(Date value) {
            addCriterionForJDBCDate("Ca_moneyMonth =", value, "caMoneymonth");
            return (Criteria) this;
        }

        public Criteria andCaMoneymonthNotEqualTo(Date value) {
            addCriterionForJDBCDate("Ca_moneyMonth <>", value, "caMoneymonth");
            return (Criteria) this;
        }

        public Criteria andCaMoneymonthGreaterThan(Date value) {
            addCriterionForJDBCDate("Ca_moneyMonth >", value, "caMoneymonth");
            return (Criteria) this;
        }

        public Criteria andCaMoneymonthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Ca_moneyMonth >=", value, "caMoneymonth");
            return (Criteria) this;
        }

        public Criteria andCaMoneymonthLessThan(Date value) {
            addCriterionForJDBCDate("Ca_moneyMonth <", value, "caMoneymonth");
            return (Criteria) this;
        }

        public Criteria andCaMoneymonthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Ca_moneyMonth <=", value, "caMoneymonth");
            return (Criteria) this;
        }

        public Criteria andCaMoneymonthIn(List<Date> values) {
            addCriterionForJDBCDate("Ca_moneyMonth in", values, "caMoneymonth");
            return (Criteria) this;
        }

        public Criteria andCaMoneymonthNotIn(List<Date> values) {
            addCriterionForJDBCDate("Ca_moneyMonth not in", values, "caMoneymonth");
            return (Criteria) this;
        }

        public Criteria andCaMoneymonthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Ca_moneyMonth between", value1, value2, "caMoneymonth");
            return (Criteria) this;
        }

        public Criteria andCaMoneymonthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Ca_moneyMonth not between", value1, value2, "caMoneymonth");
            return (Criteria) this;
        }

        public Criteria andCaLargessIsNull() {
            addCriterion("Ca_largess is null");
            return (Criteria) this;
        }

        public Criteria andCaLargessIsNotNull() {
            addCriterion("Ca_largess is not null");
            return (Criteria) this;
        }

        public Criteria andCaLargessEqualTo(Integer value) {
            addCriterion("Ca_largess =", value, "caLargess");
            return (Criteria) this;
        }

        public Criteria andCaLargessNotEqualTo(Integer value) {
            addCriterion("Ca_largess <>", value, "caLargess");
            return (Criteria) this;
        }

        public Criteria andCaLargessGreaterThan(Integer value) {
            addCriterion("Ca_largess >", value, "caLargess");
            return (Criteria) this;
        }

        public Criteria andCaLargessGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ca_largess >=", value, "caLargess");
            return (Criteria) this;
        }

        public Criteria andCaLargessLessThan(Integer value) {
            addCriterion("Ca_largess <", value, "caLargess");
            return (Criteria) this;
        }

        public Criteria andCaLargessLessThanOrEqualTo(Integer value) {
            addCriterion("Ca_largess <=", value, "caLargess");
            return (Criteria) this;
        }

        public Criteria andCaLargessIn(List<Integer> values) {
            addCriterion("Ca_largess in", values, "caLargess");
            return (Criteria) this;
        }

        public Criteria andCaLargessNotIn(List<Integer> values) {
            addCriterion("Ca_largess not in", values, "caLargess");
            return (Criteria) this;
        }

        public Criteria andCaLargessBetween(Integer value1, Integer value2) {
            addCriterion("Ca_largess between", value1, value2, "caLargess");
            return (Criteria) this;
        }

        public Criteria andCaLargessNotBetween(Integer value1, Integer value2) {
            addCriterion("Ca_largess not between", value1, value2, "caLargess");
            return (Criteria) this;
        }

        public Criteria andCaRemarkIsNull() {
            addCriterion("Ca_remark is null");
            return (Criteria) this;
        }

        public Criteria andCaRemarkIsNotNull() {
            addCriterion("Ca_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCaRemarkEqualTo(String value) {
            addCriterion("Ca_remark =", value, "caRemark");
            return (Criteria) this;
        }

        public Criteria andCaRemarkNotEqualTo(String value) {
            addCriterion("Ca_remark <>", value, "caRemark");
            return (Criteria) this;
        }

        public Criteria andCaRemarkGreaterThan(String value) {
            addCriterion("Ca_remark >", value, "caRemark");
            return (Criteria) this;
        }

        public Criteria andCaRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_remark >=", value, "caRemark");
            return (Criteria) this;
        }

        public Criteria andCaRemarkLessThan(String value) {
            addCriterion("Ca_remark <", value, "caRemark");
            return (Criteria) this;
        }

        public Criteria andCaRemarkLessThanOrEqualTo(String value) {
            addCriterion("Ca_remark <=", value, "caRemark");
            return (Criteria) this;
        }

        public Criteria andCaRemarkLike(String value) {
            addCriterion("Ca_remark like", value, "caRemark");
            return (Criteria) this;
        }

        public Criteria andCaRemarkNotLike(String value) {
            addCriterion("Ca_remark not like", value, "caRemark");
            return (Criteria) this;
        }

        public Criteria andCaRemarkIn(List<String> values) {
            addCriterion("Ca_remark in", values, "caRemark");
            return (Criteria) this;
        }

        public Criteria andCaRemarkNotIn(List<String> values) {
            addCriterion("Ca_remark not in", values, "caRemark");
            return (Criteria) this;
        }

        public Criteria andCaRemarkBetween(String value1, String value2) {
            addCriterion("Ca_remark between", value1, value2, "caRemark");
            return (Criteria) this;
        }

        public Criteria andCaRemarkNotBetween(String value1, String value2) {
            addCriterion("Ca_remark not between", value1, value2, "caRemark");
            return (Criteria) this;
        }

        public Criteria andCaOperationpersonIsNull() {
            addCriterion("Ca_operationPerson is null");
            return (Criteria) this;
        }

        public Criteria andCaOperationpersonIsNotNull() {
            addCriterion("Ca_operationPerson is not null");
            return (Criteria) this;
        }

        public Criteria andCaOperationpersonEqualTo(String value) {
            addCriterion("Ca_operationPerson =", value, "caOperationperson");
            return (Criteria) this;
        }

        public Criteria andCaOperationpersonNotEqualTo(String value) {
            addCriterion("Ca_operationPerson <>", value, "caOperationperson");
            return (Criteria) this;
        }

        public Criteria andCaOperationpersonGreaterThan(String value) {
            addCriterion("Ca_operationPerson >", value, "caOperationperson");
            return (Criteria) this;
        }

        public Criteria andCaOperationpersonGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_operationPerson >=", value, "caOperationperson");
            return (Criteria) this;
        }

        public Criteria andCaOperationpersonLessThan(String value) {
            addCriterion("Ca_operationPerson <", value, "caOperationperson");
            return (Criteria) this;
        }

        public Criteria andCaOperationpersonLessThanOrEqualTo(String value) {
            addCriterion("Ca_operationPerson <=", value, "caOperationperson");
            return (Criteria) this;
        }

        public Criteria andCaOperationpersonLike(String value) {
            addCriterion("Ca_operationPerson like", value, "caOperationperson");
            return (Criteria) this;
        }

        public Criteria andCaOperationpersonNotLike(String value) {
            addCriterion("Ca_operationPerson not like", value, "caOperationperson");
            return (Criteria) this;
        }

        public Criteria andCaOperationpersonIn(List<String> values) {
            addCriterion("Ca_operationPerson in", values, "caOperationperson");
            return (Criteria) this;
        }

        public Criteria andCaOperationpersonNotIn(List<String> values) {
            addCriterion("Ca_operationPerson not in", values, "caOperationperson");
            return (Criteria) this;
        }

        public Criteria andCaOperationpersonBetween(String value1, String value2) {
            addCriterion("Ca_operationPerson between", value1, value2, "caOperationperson");
            return (Criteria) this;
        }

        public Criteria andCaOperationpersonNotBetween(String value1, String value2) {
            addCriterion("Ca_operationPerson not between", value1, value2, "caOperationperson");
            return (Criteria) this;
        }

        public Criteria andCaOpidIsNull() {
            addCriterion("Ca_opId is null");
            return (Criteria) this;
        }

        public Criteria andCaOpidIsNotNull() {
            addCriterion("Ca_opId is not null");
            return (Criteria) this;
        }

        public Criteria andCaOpidEqualTo(String value) {
            addCriterion("Ca_opId =", value, "caOpid");
            return (Criteria) this;
        }

        public Criteria andCaOpidNotEqualTo(String value) {
            addCriterion("Ca_opId <>", value, "caOpid");
            return (Criteria) this;
        }

        public Criteria andCaOpidGreaterThan(String value) {
            addCriterion("Ca_opId >", value, "caOpid");
            return (Criteria) this;
        }

        public Criteria andCaOpidGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_opId >=", value, "caOpid");
            return (Criteria) this;
        }

        public Criteria andCaOpidLessThan(String value) {
            addCriterion("Ca_opId <", value, "caOpid");
            return (Criteria) this;
        }

        public Criteria andCaOpidLessThanOrEqualTo(String value) {
            addCriterion("Ca_opId <=", value, "caOpid");
            return (Criteria) this;
        }

        public Criteria andCaOpidLike(String value) {
            addCriterion("Ca_opId like", value, "caOpid");
            return (Criteria) this;
        }

        public Criteria andCaOpidNotLike(String value) {
            addCriterion("Ca_opId not like", value, "caOpid");
            return (Criteria) this;
        }

        public Criteria andCaOpidIn(List<String> values) {
            addCriterion("Ca_opId in", values, "caOpid");
            return (Criteria) this;
        }

        public Criteria andCaOpidNotIn(List<String> values) {
            addCriterion("Ca_opId not in", values, "caOpid");
            return (Criteria) this;
        }

        public Criteria andCaOpidBetween(String value1, String value2) {
            addCriterion("Ca_opId between", value1, value2, "caOpid");
            return (Criteria) this;
        }

        public Criteria andCaOpidNotBetween(String value1, String value2) {
            addCriterion("Ca_opId not between", value1, value2, "caOpid");
            return (Criteria) this;
        }

        public Criteria andCaCheckpersonIsNull() {
            addCriterion("Ca_checkPerson is null");
            return (Criteria) this;
        }

        public Criteria andCaCheckpersonIsNotNull() {
            addCriterion("Ca_checkPerson is not null");
            return (Criteria) this;
        }

        public Criteria andCaCheckpersonEqualTo(String value) {
            addCriterion("Ca_checkPerson =", value, "caCheckperson");
            return (Criteria) this;
        }

        public Criteria andCaCheckpersonNotEqualTo(String value) {
            addCriterion("Ca_checkPerson <>", value, "caCheckperson");
            return (Criteria) this;
        }

        public Criteria andCaCheckpersonGreaterThan(String value) {
            addCriterion("Ca_checkPerson >", value, "caCheckperson");
            return (Criteria) this;
        }

        public Criteria andCaCheckpersonGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_checkPerson >=", value, "caCheckperson");
            return (Criteria) this;
        }

        public Criteria andCaCheckpersonLessThan(String value) {
            addCriterion("Ca_checkPerson <", value, "caCheckperson");
            return (Criteria) this;
        }

        public Criteria andCaCheckpersonLessThanOrEqualTo(String value) {
            addCriterion("Ca_checkPerson <=", value, "caCheckperson");
            return (Criteria) this;
        }

        public Criteria andCaCheckpersonLike(String value) {
            addCriterion("Ca_checkPerson like", value, "caCheckperson");
            return (Criteria) this;
        }

        public Criteria andCaCheckpersonNotLike(String value) {
            addCriterion("Ca_checkPerson not like", value, "caCheckperson");
            return (Criteria) this;
        }

        public Criteria andCaCheckpersonIn(List<String> values) {
            addCriterion("Ca_checkPerson in", values, "caCheckperson");
            return (Criteria) this;
        }

        public Criteria andCaCheckpersonNotIn(List<String> values) {
            addCriterion("Ca_checkPerson not in", values, "caCheckperson");
            return (Criteria) this;
        }

        public Criteria andCaCheckpersonBetween(String value1, String value2) {
            addCriterion("Ca_checkPerson between", value1, value2, "caCheckperson");
            return (Criteria) this;
        }

        public Criteria andCaCheckpersonNotBetween(String value1, String value2) {
            addCriterion("Ca_checkPerson not between", value1, value2, "caCheckperson");
            return (Criteria) this;
        }

        public Criteria andCaChidIsNull() {
            addCriterion("Ca_chId is null");
            return (Criteria) this;
        }

        public Criteria andCaChidIsNotNull() {
            addCriterion("Ca_chId is not null");
            return (Criteria) this;
        }

        public Criteria andCaChidEqualTo(String value) {
            addCriterion("Ca_chId =", value, "caChid");
            return (Criteria) this;
        }

        public Criteria andCaChidNotEqualTo(String value) {
            addCriterion("Ca_chId <>", value, "caChid");
            return (Criteria) this;
        }

        public Criteria andCaChidGreaterThan(String value) {
            addCriterion("Ca_chId >", value, "caChid");
            return (Criteria) this;
        }

        public Criteria andCaChidGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_chId >=", value, "caChid");
            return (Criteria) this;
        }

        public Criteria andCaChidLessThan(String value) {
            addCriterion("Ca_chId <", value, "caChid");
            return (Criteria) this;
        }

        public Criteria andCaChidLessThanOrEqualTo(String value) {
            addCriterion("Ca_chId <=", value, "caChid");
            return (Criteria) this;
        }

        public Criteria andCaChidLike(String value) {
            addCriterion("Ca_chId like", value, "caChid");
            return (Criteria) this;
        }

        public Criteria andCaChidNotLike(String value) {
            addCriterion("Ca_chId not like", value, "caChid");
            return (Criteria) this;
        }

        public Criteria andCaChidIn(List<String> values) {
            addCriterion("Ca_chId in", values, "caChid");
            return (Criteria) this;
        }

        public Criteria andCaChidNotIn(List<String> values) {
            addCriterion("Ca_chId not in", values, "caChid");
            return (Criteria) this;
        }

        public Criteria andCaChidBetween(String value1, String value2) {
            addCriterion("Ca_chId between", value1, value2, "caChid");
            return (Criteria) this;
        }

        public Criteria andCaChidNotBetween(String value1, String value2) {
            addCriterion("Ca_chId not between", value1, value2, "caChid");
            return (Criteria) this;
        }

        public Criteria andCaMakepersonIsNull() {
            addCriterion("Ca_makePerson is null");
            return (Criteria) this;
        }

        public Criteria andCaMakepersonIsNotNull() {
            addCriterion("Ca_makePerson is not null");
            return (Criteria) this;
        }

        public Criteria andCaMakepersonEqualTo(String value) {
            addCriterion("Ca_makePerson =", value, "caMakeperson");
            return (Criteria) this;
        }

        public Criteria andCaMakepersonNotEqualTo(String value) {
            addCriterion("Ca_makePerson <>", value, "caMakeperson");
            return (Criteria) this;
        }

        public Criteria andCaMakepersonGreaterThan(String value) {
            addCriterion("Ca_makePerson >", value, "caMakeperson");
            return (Criteria) this;
        }

        public Criteria andCaMakepersonGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_makePerson >=", value, "caMakeperson");
            return (Criteria) this;
        }

        public Criteria andCaMakepersonLessThan(String value) {
            addCriterion("Ca_makePerson <", value, "caMakeperson");
            return (Criteria) this;
        }

        public Criteria andCaMakepersonLessThanOrEqualTo(String value) {
            addCriterion("Ca_makePerson <=", value, "caMakeperson");
            return (Criteria) this;
        }

        public Criteria andCaMakepersonLike(String value) {
            addCriterion("Ca_makePerson like", value, "caMakeperson");
            return (Criteria) this;
        }

        public Criteria andCaMakepersonNotLike(String value) {
            addCriterion("Ca_makePerson not like", value, "caMakeperson");
            return (Criteria) this;
        }

        public Criteria andCaMakepersonIn(List<String> values) {
            addCriterion("Ca_makePerson in", values, "caMakeperson");
            return (Criteria) this;
        }

        public Criteria andCaMakepersonNotIn(List<String> values) {
            addCriterion("Ca_makePerson not in", values, "caMakeperson");
            return (Criteria) this;
        }

        public Criteria andCaMakepersonBetween(String value1, String value2) {
            addCriterion("Ca_makePerson between", value1, value2, "caMakeperson");
            return (Criteria) this;
        }

        public Criteria andCaMakepersonNotBetween(String value1, String value2) {
            addCriterion("Ca_makePerson not between", value1, value2, "caMakeperson");
            return (Criteria) this;
        }

        public Criteria andCaMpidIsNull() {
            addCriterion("Ca_mpId is null");
            return (Criteria) this;
        }

        public Criteria andCaMpidIsNotNull() {
            addCriterion("Ca_mpId is not null");
            return (Criteria) this;
        }

        public Criteria andCaMpidEqualTo(String value) {
            addCriterion("Ca_mpId =", value, "caMpid");
            return (Criteria) this;
        }

        public Criteria andCaMpidNotEqualTo(String value) {
            addCriterion("Ca_mpId <>", value, "caMpid");
            return (Criteria) this;
        }

        public Criteria andCaMpidGreaterThan(String value) {
            addCriterion("Ca_mpId >", value, "caMpid");
            return (Criteria) this;
        }

        public Criteria andCaMpidGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_mpId >=", value, "caMpid");
            return (Criteria) this;
        }

        public Criteria andCaMpidLessThan(String value) {
            addCriterion("Ca_mpId <", value, "caMpid");
            return (Criteria) this;
        }

        public Criteria andCaMpidLessThanOrEqualTo(String value) {
            addCriterion("Ca_mpId <=", value, "caMpid");
            return (Criteria) this;
        }

        public Criteria andCaMpidLike(String value) {
            addCriterion("Ca_mpId like", value, "caMpid");
            return (Criteria) this;
        }

        public Criteria andCaMpidNotLike(String value) {
            addCriterion("Ca_mpId not like", value, "caMpid");
            return (Criteria) this;
        }

        public Criteria andCaMpidIn(List<String> values) {
            addCriterion("Ca_mpId in", values, "caMpid");
            return (Criteria) this;
        }

        public Criteria andCaMpidNotIn(List<String> values) {
            addCriterion("Ca_mpId not in", values, "caMpid");
            return (Criteria) this;
        }

        public Criteria andCaMpidBetween(String value1, String value2) {
            addCriterion("Ca_mpId between", value1, value2, "caMpid");
            return (Criteria) this;
        }

        public Criteria andCaMpidNotBetween(String value1, String value2) {
            addCriterion("Ca_mpId not between", value1, value2, "caMpid");
            return (Criteria) this;
        }

        public Criteria andCaDeptIsNull() {
            addCriterion("Ca_dept is null");
            return (Criteria) this;
        }

        public Criteria andCaDeptIsNotNull() {
            addCriterion("Ca_dept is not null");
            return (Criteria) this;
        }

        public Criteria andCaDeptEqualTo(String value) {
            addCriterion("Ca_dept =", value, "caDept");
            return (Criteria) this;
        }

        public Criteria andCaDeptNotEqualTo(String value) {
            addCriterion("Ca_dept <>", value, "caDept");
            return (Criteria) this;
        }

        public Criteria andCaDeptGreaterThan(String value) {
            addCriterion("Ca_dept >", value, "caDept");
            return (Criteria) this;
        }

        public Criteria andCaDeptGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_dept >=", value, "caDept");
            return (Criteria) this;
        }

        public Criteria andCaDeptLessThan(String value) {
            addCriterion("Ca_dept <", value, "caDept");
            return (Criteria) this;
        }

        public Criteria andCaDeptLessThanOrEqualTo(String value) {
            addCriterion("Ca_dept <=", value, "caDept");
            return (Criteria) this;
        }

        public Criteria andCaDeptLike(String value) {
            addCriterion("Ca_dept like", value, "caDept");
            return (Criteria) this;
        }

        public Criteria andCaDeptNotLike(String value) {
            addCriterion("Ca_dept not like", value, "caDept");
            return (Criteria) this;
        }

        public Criteria andCaDeptIn(List<String> values) {
            addCriterion("Ca_dept in", values, "caDept");
            return (Criteria) this;
        }

        public Criteria andCaDeptNotIn(List<String> values) {
            addCriterion("Ca_dept not in", values, "caDept");
            return (Criteria) this;
        }

        public Criteria andCaDeptBetween(String value1, String value2) {
            addCriterion("Ca_dept between", value1, value2, "caDept");
            return (Criteria) this;
        }

        public Criteria andCaDeptNotBetween(String value1, String value2) {
            addCriterion("Ca_dept not between", value1, value2, "caDept");
            return (Criteria) this;
        }

        public Criteria andCaDeptidIsNull() {
            addCriterion("Ca_deptId is null");
            return (Criteria) this;
        }

        public Criteria andCaDeptidIsNotNull() {
            addCriterion("Ca_deptId is not null");
            return (Criteria) this;
        }

        public Criteria andCaDeptidEqualTo(String value) {
            addCriterion("Ca_deptId =", value, "caDeptid");
            return (Criteria) this;
        }

        public Criteria andCaDeptidNotEqualTo(String value) {
            addCriterion("Ca_deptId <>", value, "caDeptid");
            return (Criteria) this;
        }

        public Criteria andCaDeptidGreaterThan(String value) {
            addCriterion("Ca_deptId >", value, "caDeptid");
            return (Criteria) this;
        }

        public Criteria andCaDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_deptId >=", value, "caDeptid");
            return (Criteria) this;
        }

        public Criteria andCaDeptidLessThan(String value) {
            addCriterion("Ca_deptId <", value, "caDeptid");
            return (Criteria) this;
        }

        public Criteria andCaDeptidLessThanOrEqualTo(String value) {
            addCriterion("Ca_deptId <=", value, "caDeptid");
            return (Criteria) this;
        }

        public Criteria andCaDeptidLike(String value) {
            addCriterion("Ca_deptId like", value, "caDeptid");
            return (Criteria) this;
        }

        public Criteria andCaDeptidNotLike(String value) {
            addCriterion("Ca_deptId not like", value, "caDeptid");
            return (Criteria) this;
        }

        public Criteria andCaDeptidIn(List<String> values) {
            addCriterion("Ca_deptId in", values, "caDeptid");
            return (Criteria) this;
        }

        public Criteria andCaDeptidNotIn(List<String> values) {
            addCriterion("Ca_deptId not in", values, "caDeptid");
            return (Criteria) this;
        }

        public Criteria andCaDeptidBetween(String value1, String value2) {
            addCriterion("Ca_deptId between", value1, value2, "caDeptid");
            return (Criteria) this;
        }

        public Criteria andCaDeptidNotBetween(String value1, String value2) {
            addCriterion("Ca_deptId not between", value1, value2, "caDeptid");
            return (Criteria) this;
        }

        public Criteria andCaItemIsNull() {
            addCriterion("Ca_item is null");
            return (Criteria) this;
        }

        public Criteria andCaItemIsNotNull() {
            addCriterion("Ca_item is not null");
            return (Criteria) this;
        }

        public Criteria andCaItemEqualTo(String value) {
            addCriterion("Ca_item =", value, "caItem");
            return (Criteria) this;
        }

        public Criteria andCaItemNotEqualTo(String value) {
            addCriterion("Ca_item <>", value, "caItem");
            return (Criteria) this;
        }

        public Criteria andCaItemGreaterThan(String value) {
            addCriterion("Ca_item >", value, "caItem");
            return (Criteria) this;
        }

        public Criteria andCaItemGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_item >=", value, "caItem");
            return (Criteria) this;
        }

        public Criteria andCaItemLessThan(String value) {
            addCriterion("Ca_item <", value, "caItem");
            return (Criteria) this;
        }

        public Criteria andCaItemLessThanOrEqualTo(String value) {
            addCriterion("Ca_item <=", value, "caItem");
            return (Criteria) this;
        }

        public Criteria andCaItemLike(String value) {
            addCriterion("Ca_item like", value, "caItem");
            return (Criteria) this;
        }

        public Criteria andCaItemNotLike(String value) {
            addCriterion("Ca_item not like", value, "caItem");
            return (Criteria) this;
        }

        public Criteria andCaItemIn(List<String> values) {
            addCriterion("Ca_item in", values, "caItem");
            return (Criteria) this;
        }

        public Criteria andCaItemNotIn(List<String> values) {
            addCriterion("Ca_item not in", values, "caItem");
            return (Criteria) this;
        }

        public Criteria andCaItemBetween(String value1, String value2) {
            addCriterion("Ca_item between", value1, value2, "caItem");
            return (Criteria) this;
        }

        public Criteria andCaItemNotBetween(String value1, String value2) {
            addCriterion("Ca_item not between", value1, value2, "caItem");
            return (Criteria) this;
        }

        public Criteria andCaItemidIsNull() {
            addCriterion("Ca_itemId is null");
            return (Criteria) this;
        }

        public Criteria andCaItemidIsNotNull() {
            addCriterion("Ca_itemId is not null");
            return (Criteria) this;
        }

        public Criteria andCaItemidEqualTo(String value) {
            addCriterion("Ca_itemId =", value, "caItemid");
            return (Criteria) this;
        }

        public Criteria andCaItemidNotEqualTo(String value) {
            addCriterion("Ca_itemId <>", value, "caItemid");
            return (Criteria) this;
        }

        public Criteria andCaItemidGreaterThan(String value) {
            addCriterion("Ca_itemId >", value, "caItemid");
            return (Criteria) this;
        }

        public Criteria andCaItemidGreaterThanOrEqualTo(String value) {
            addCriterion("Ca_itemId >=", value, "caItemid");
            return (Criteria) this;
        }

        public Criteria andCaItemidLessThan(String value) {
            addCriterion("Ca_itemId <", value, "caItemid");
            return (Criteria) this;
        }

        public Criteria andCaItemidLessThanOrEqualTo(String value) {
            addCriterion("Ca_itemId <=", value, "caItemid");
            return (Criteria) this;
        }

        public Criteria andCaItemidLike(String value) {
            addCriterion("Ca_itemId like", value, "caItemid");
            return (Criteria) this;
        }

        public Criteria andCaItemidNotLike(String value) {
            addCriterion("Ca_itemId not like", value, "caItemid");
            return (Criteria) this;
        }

        public Criteria andCaItemidIn(List<String> values) {
            addCriterion("Ca_itemId in", values, "caItemid");
            return (Criteria) this;
        }

        public Criteria andCaItemidNotIn(List<String> values) {
            addCriterion("Ca_itemId not in", values, "caItemid");
            return (Criteria) this;
        }

        public Criteria andCaItemidBetween(String value1, String value2) {
            addCriterion("Ca_itemId between", value1, value2, "caItemid");
            return (Criteria) this;
        }

        public Criteria andCaItemidNotBetween(String value1, String value2) {
            addCriterion("Ca_itemId not between", value1, value2, "caItemid");
            return (Criteria) this;
        }

        public Criteria andCaStateIsNull() {
            addCriterion("Ca_state is null");
            return (Criteria) this;
        }

        public Criteria andCaStateIsNotNull() {
            addCriterion("Ca_state is not null");
            return (Criteria) this;
        }

        public Criteria andCaStateEqualTo(Integer value) {
            addCriterion("Ca_state =", value, "caState");
            return (Criteria) this;
        }

        public Criteria andCaStateNotEqualTo(Integer value) {
            addCriterion("Ca_state <>", value, "caState");
            return (Criteria) this;
        }

        public Criteria andCaStateGreaterThan(Integer value) {
            addCriterion("Ca_state >", value, "caState");
            return (Criteria) this;
        }

        public Criteria andCaStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ca_state >=", value, "caState");
            return (Criteria) this;
        }

        public Criteria andCaStateLessThan(Integer value) {
            addCriterion("Ca_state <", value, "caState");
            return (Criteria) this;
        }

        public Criteria andCaStateLessThanOrEqualTo(Integer value) {
            addCriterion("Ca_state <=", value, "caState");
            return (Criteria) this;
        }

        public Criteria andCaStateIn(List<Integer> values) {
            addCriterion("Ca_state in", values, "caState");
            return (Criteria) this;
        }

        public Criteria andCaStateNotIn(List<Integer> values) {
            addCriterion("Ca_state not in", values, "caState");
            return (Criteria) this;
        }

        public Criteria andCaStateBetween(Integer value1, Integer value2) {
            addCriterion("Ca_state between", value1, value2, "caState");
            return (Criteria) this;
        }

        public Criteria andCaStateNotBetween(Integer value1, Integer value2) {
            addCriterion("Ca_state not between", value1, value2, "caState");
            return (Criteria) this;
        }

        public Criteria andCaByzd1IsNull() {
            addCriterion("Ca_byzd1 is null");
            return (Criteria) this;
        }

        public Criteria andCaByzd1IsNotNull() {
            addCriterion("Ca_byzd1 is not null");
            return (Criteria) this;
        }

        public Criteria andCaByzd1EqualTo(String value) {
            addCriterion("Ca_byzd1 =", value, "caByzd1");
            return (Criteria) this;
        }

        public Criteria andCaByzd1NotEqualTo(String value) {
            addCriterion("Ca_byzd1 <>", value, "caByzd1");
            return (Criteria) this;
        }

        public Criteria andCaByzd1GreaterThan(String value) {
            addCriterion("Ca_byzd1 >", value, "caByzd1");
            return (Criteria) this;
        }

        public Criteria andCaByzd1GreaterThanOrEqualTo(String value) {
            addCriterion("Ca_byzd1 >=", value, "caByzd1");
            return (Criteria) this;
        }

        public Criteria andCaByzd1LessThan(String value) {
            addCriterion("Ca_byzd1 <", value, "caByzd1");
            return (Criteria) this;
        }

        public Criteria andCaByzd1LessThanOrEqualTo(String value) {
            addCriterion("Ca_byzd1 <=", value, "caByzd1");
            return (Criteria) this;
        }

        public Criteria andCaByzd1Like(String value) {
            addCriterion("Ca_byzd1 like", value, "caByzd1");
            return (Criteria) this;
        }

        public Criteria andCaByzd1NotLike(String value) {
            addCriterion("Ca_byzd1 not like", value, "caByzd1");
            return (Criteria) this;
        }

        public Criteria andCaByzd1In(List<String> values) {
            addCriterion("Ca_byzd1 in", values, "caByzd1");
            return (Criteria) this;
        }

        public Criteria andCaByzd1NotIn(List<String> values) {
            addCriterion("Ca_byzd1 not in", values, "caByzd1");
            return (Criteria) this;
        }

        public Criteria andCaByzd1Between(String value1, String value2) {
            addCriterion("Ca_byzd1 between", value1, value2, "caByzd1");
            return (Criteria) this;
        }

        public Criteria andCaByzd1NotBetween(String value1, String value2) {
            addCriterion("Ca_byzd1 not between", value1, value2, "caByzd1");
            return (Criteria) this;
        }

        public Criteria andCaByzd2IsNull() {
            addCriterion("Ca_byzd2 is null");
            return (Criteria) this;
        }

        public Criteria andCaByzd2IsNotNull() {
            addCriterion("Ca_byzd2 is not null");
            return (Criteria) this;
        }

        public Criteria andCaByzd2EqualTo(String value) {
            addCriterion("Ca_byzd2 =", value, "caByzd2");
            return (Criteria) this;
        }

        public Criteria andCaByzd2NotEqualTo(String value) {
            addCriterion("Ca_byzd2 <>", value, "caByzd2");
            return (Criteria) this;
        }

        public Criteria andCaByzd2GreaterThan(String value) {
            addCriterion("Ca_byzd2 >", value, "caByzd2");
            return (Criteria) this;
        }

        public Criteria andCaByzd2GreaterThanOrEqualTo(String value) {
            addCriterion("Ca_byzd2 >=", value, "caByzd2");
            return (Criteria) this;
        }

        public Criteria andCaByzd2LessThan(String value) {
            addCriterion("Ca_byzd2 <", value, "caByzd2");
            return (Criteria) this;
        }

        public Criteria andCaByzd2LessThanOrEqualTo(String value) {
            addCriterion("Ca_byzd2 <=", value, "caByzd2");
            return (Criteria) this;
        }

        public Criteria andCaByzd2Like(String value) {
            addCriterion("Ca_byzd2 like", value, "caByzd2");
            return (Criteria) this;
        }

        public Criteria andCaByzd2NotLike(String value) {
            addCriterion("Ca_byzd2 not like", value, "caByzd2");
            return (Criteria) this;
        }

        public Criteria andCaByzd2In(List<String> values) {
            addCriterion("Ca_byzd2 in", values, "caByzd2");
            return (Criteria) this;
        }

        public Criteria andCaByzd2NotIn(List<String> values) {
            addCriterion("Ca_byzd2 not in", values, "caByzd2");
            return (Criteria) this;
        }

        public Criteria andCaByzd2Between(String value1, String value2) {
            addCriterion("Ca_byzd2 between", value1, value2, "caByzd2");
            return (Criteria) this;
        }

        public Criteria andCaByzd2NotBetween(String value1, String value2) {
            addCriterion("Ca_byzd2 not between", value1, value2, "caByzd2");
            return (Criteria) this;
        }

        public Criteria andCaByzd3IsNull() {
            addCriterion("Ca_byzd3 is null");
            return (Criteria) this;
        }

        public Criteria andCaByzd3IsNotNull() {
            addCriterion("Ca_byzd3 is not null");
            return (Criteria) this;
        }

        public Criteria andCaByzd3EqualTo(String value) {
            addCriterion("Ca_byzd3 =", value, "caByzd3");
            return (Criteria) this;
        }

        public Criteria andCaByzd3NotEqualTo(String value) {
            addCriterion("Ca_byzd3 <>", value, "caByzd3");
            return (Criteria) this;
        }

        public Criteria andCaByzd3GreaterThan(String value) {
            addCriterion("Ca_byzd3 >", value, "caByzd3");
            return (Criteria) this;
        }

        public Criteria andCaByzd3GreaterThanOrEqualTo(String value) {
            addCriterion("Ca_byzd3 >=", value, "caByzd3");
            return (Criteria) this;
        }

        public Criteria andCaByzd3LessThan(String value) {
            addCriterion("Ca_byzd3 <", value, "caByzd3");
            return (Criteria) this;
        }

        public Criteria andCaByzd3LessThanOrEqualTo(String value) {
            addCriterion("Ca_byzd3 <=", value, "caByzd3");
            return (Criteria) this;
        }

        public Criteria andCaByzd3Like(String value) {
            addCriterion("Ca_byzd3 like", value, "caByzd3");
            return (Criteria) this;
        }

        public Criteria andCaByzd3NotLike(String value) {
            addCriterion("Ca_byzd3 not like", value, "caByzd3");
            return (Criteria) this;
        }

        public Criteria andCaByzd3In(List<String> values) {
            addCriterion("Ca_byzd3 in", values, "caByzd3");
            return (Criteria) this;
        }

        public Criteria andCaByzd3NotIn(List<String> values) {
            addCriterion("Ca_byzd3 not in", values, "caByzd3");
            return (Criteria) this;
        }

        public Criteria andCaByzd3Between(String value1, String value2) {
            addCriterion("Ca_byzd3 between", value1, value2, "caByzd3");
            return (Criteria) this;
        }

        public Criteria andCaByzd3NotBetween(String value1, String value2) {
            addCriterion("Ca_byzd3 not between", value1, value2, "caByzd3");
            return (Criteria) this;
        }

        public Criteria andCaByzd4IsNull() {
            addCriterion("Ca_byzd4 is null");
            return (Criteria) this;
        }

        public Criteria andCaByzd4IsNotNull() {
            addCriterion("Ca_byzd4 is not null");
            return (Criteria) this;
        }

        public Criteria andCaByzd4EqualTo(String value) {
            addCriterion("Ca_byzd4 =", value, "caByzd4");
            return (Criteria) this;
        }

        public Criteria andCaByzd4NotEqualTo(String value) {
            addCriterion("Ca_byzd4 <>", value, "caByzd4");
            return (Criteria) this;
        }

        public Criteria andCaByzd4GreaterThan(String value) {
            addCriterion("Ca_byzd4 >", value, "caByzd4");
            return (Criteria) this;
        }

        public Criteria andCaByzd4GreaterThanOrEqualTo(String value) {
            addCriterion("Ca_byzd4 >=", value, "caByzd4");
            return (Criteria) this;
        }

        public Criteria andCaByzd4LessThan(String value) {
            addCriterion("Ca_byzd4 <", value, "caByzd4");
            return (Criteria) this;
        }

        public Criteria andCaByzd4LessThanOrEqualTo(String value) {
            addCriterion("Ca_byzd4 <=", value, "caByzd4");
            return (Criteria) this;
        }

        public Criteria andCaByzd4Like(String value) {
            addCriterion("Ca_byzd4 like", value, "caByzd4");
            return (Criteria) this;
        }

        public Criteria andCaByzd4NotLike(String value) {
            addCriterion("Ca_byzd4 not like", value, "caByzd4");
            return (Criteria) this;
        }

        public Criteria andCaByzd4In(List<String> values) {
            addCriterion("Ca_byzd4 in", values, "caByzd4");
            return (Criteria) this;
        }

        public Criteria andCaByzd4NotIn(List<String> values) {
            addCriterion("Ca_byzd4 not in", values, "caByzd4");
            return (Criteria) this;
        }

        public Criteria andCaByzd4Between(String value1, String value2) {
            addCriterion("Ca_byzd4 between", value1, value2, "caByzd4");
            return (Criteria) this;
        }

        public Criteria andCaByzd4NotBetween(String value1, String value2) {
            addCriterion("Ca_byzd4 not between", value1, value2, "caByzd4");
            return (Criteria) this;
        }

        public Criteria andCaByzd5IsNull() {
            addCriterion("Ca_byzd5 is null");
            return (Criteria) this;
        }

        public Criteria andCaByzd5IsNotNull() {
            addCriterion("Ca_byzd5 is not null");
            return (Criteria) this;
        }

        public Criteria andCaByzd5EqualTo(String value) {
            addCriterion("Ca_byzd5 =", value, "caByzd5");
            return (Criteria) this;
        }

        public Criteria andCaByzd5NotEqualTo(String value) {
            addCriterion("Ca_byzd5 <>", value, "caByzd5");
            return (Criteria) this;
        }

        public Criteria andCaByzd5GreaterThan(String value) {
            addCriterion("Ca_byzd5 >", value, "caByzd5");
            return (Criteria) this;
        }

        public Criteria andCaByzd5GreaterThanOrEqualTo(String value) {
            addCriterion("Ca_byzd5 >=", value, "caByzd5");
            return (Criteria) this;
        }

        public Criteria andCaByzd5LessThan(String value) {
            addCriterion("Ca_byzd5 <", value, "caByzd5");
            return (Criteria) this;
        }

        public Criteria andCaByzd5LessThanOrEqualTo(String value) {
            addCriterion("Ca_byzd5 <=", value, "caByzd5");
            return (Criteria) this;
        }

        public Criteria andCaByzd5Like(String value) {
            addCriterion("Ca_byzd5 like", value, "caByzd5");
            return (Criteria) this;
        }

        public Criteria andCaByzd5NotLike(String value) {
            addCriterion("Ca_byzd5 not like", value, "caByzd5");
            return (Criteria) this;
        }

        public Criteria andCaByzd5In(List<String> values) {
            addCriterion("Ca_byzd5 in", values, "caByzd5");
            return (Criteria) this;
        }

        public Criteria andCaByzd5NotIn(List<String> values) {
            addCriterion("Ca_byzd5 not in", values, "caByzd5");
            return (Criteria) this;
        }

        public Criteria andCaByzd5Between(String value1, String value2) {
            addCriterion("Ca_byzd5 between", value1, value2, "caByzd5");
            return (Criteria) this;
        }

        public Criteria andCaByzd5NotBetween(String value1, String value2) {
            addCriterion("Ca_byzd5 not between", value1, value2, "caByzd5");
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