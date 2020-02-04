package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TPurchaseInquiryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPurchaseInquiryExample() {
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

        public Criteria andBillnoIsNull() {
            addCriterion("billno is null");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNotNull() {
            addCriterion("billno is not null");
            return (Criteria) this;
        }

        public Criteria andBillnoEqualTo(String value) {
            addCriterion("billno =", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotEqualTo(String value) {
            addCriterion("billno <>", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThan(String value) {
            addCriterion("billno >", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("billno >=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThan(String value) {
            addCriterion("billno <", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThanOrEqualTo(String value) {
            addCriterion("billno <=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLike(String value) {
            addCriterion("billno like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotLike(String value) {
            addCriterion("billno not like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoIn(List<String> values) {
            addCriterion("billno in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotIn(List<String> values) {
            addCriterion("billno not in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoBetween(String value1, String value2) {
            addCriterion("billno between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotBetween(String value1, String value2) {
            addCriterion("billno not between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBilldateIsNull() {
            addCriterion("billdate is null");
            return (Criteria) this;
        }

        public Criteria andBilldateIsNotNull() {
            addCriterion("billdate is not null");
            return (Criteria) this;
        }

        public Criteria andBilldateEqualTo(Date value) {
            addCriterionForJDBCDate("billdate =", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotEqualTo(Date value) {
            addCriterionForJDBCDate("billdate <>", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateGreaterThan(Date value) {
            addCriterionForJDBCDate("billdate >", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("billdate >=", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateLessThan(Date value) {
            addCriterionForJDBCDate("billdate <", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("billdate <=", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateIn(List<Date> values) {
            addCriterionForJDBCDate("billdate in", values, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotIn(List<Date> values) {
            addCriterionForJDBCDate("billdate not in", values, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("billdate between", value1, value2, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("billdate not between", value1, value2, "billdate");
            return (Criteria) this;
        }

        public Criteria andCurridIsNull() {
            addCriterion("currid is null");
            return (Criteria) this;
        }

        public Criteria andCurridIsNotNull() {
            addCriterion("currid is not null");
            return (Criteria) this;
        }

        public Criteria andCurridEqualTo(Integer value) {
            addCriterion("currid =", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridNotEqualTo(Integer value) {
            addCriterion("currid <>", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridGreaterThan(Integer value) {
            addCriterion("currid >", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridGreaterThanOrEqualTo(Integer value) {
            addCriterion("currid >=", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridLessThan(Integer value) {
            addCriterion("currid <", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridLessThanOrEqualTo(Integer value) {
            addCriterion("currid <=", value, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridIn(List<Integer> values) {
            addCriterion("currid in", values, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridNotIn(List<Integer> values) {
            addCriterion("currid not in", values, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridBetween(Integer value1, Integer value2) {
            addCriterion("currid between", value1, value2, "currid");
            return (Criteria) this;
        }

        public Criteria andCurridNotBetween(Integer value1, Integer value2) {
            addCriterion("currid not between", value1, value2, "currid");
            return (Criteria) this;
        }

        public Criteria andExchrateIsNull() {
            addCriterion("exchrate is null");
            return (Criteria) this;
        }

        public Criteria andExchrateIsNotNull() {
            addCriterion("exchrate is not null");
            return (Criteria) this;
        }

        public Criteria andExchrateEqualTo(Double value) {
            addCriterion("exchrate =", value, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateNotEqualTo(Double value) {
            addCriterion("exchrate <>", value, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateGreaterThan(Double value) {
            addCriterion("exchrate >", value, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateGreaterThanOrEqualTo(Double value) {
            addCriterion("exchrate >=", value, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateLessThan(Double value) {
            addCriterion("exchrate <", value, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateLessThanOrEqualTo(Double value) {
            addCriterion("exchrate <=", value, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateIn(List<Double> values) {
            addCriterion("exchrate in", values, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateNotIn(List<Double> values) {
            addCriterion("exchrate not in", values, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateBetween(Double value1, Double value2) {
            addCriterion("exchrate between", value1, value2, "exchrate");
            return (Criteria) this;
        }

        public Criteria andExchrateNotBetween(Double value1, Double value2) {
            addCriterion("exchrate not between", value1, value2, "exchrate");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNull() {
            addCriterion("addressid is null");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNotNull() {
            addCriterion("addressid is not null");
            return (Criteria) this;
        }

        public Criteria andAddressidEqualTo(String value) {
            addCriterion("addressid =", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotEqualTo(String value) {
            addCriterion("addressid <>", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThan(String value) {
            addCriterion("addressid >", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThanOrEqualTo(String value) {
            addCriterion("addressid >=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThan(String value) {
            addCriterion("addressid <", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThanOrEqualTo(String value) {
            addCriterion("addressid <=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLike(String value) {
            addCriterion("addressid like", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotLike(String value) {
            addCriterion("addressid not like", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidIn(List<String> values) {
            addCriterion("addressid in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotIn(List<String> values) {
            addCriterion("addressid not in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidBetween(String value1, String value2) {
            addCriterion("addressid between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotBetween(String value1, String value2) {
            addCriterion("addressid not between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andValiddateIsNull() {
            addCriterion("validdate is null");
            return (Criteria) this;
        }

        public Criteria andValiddateIsNotNull() {
            addCriterion("validdate is not null");
            return (Criteria) this;
        }

        public Criteria andValiddateEqualTo(Date value) {
            addCriterionForJDBCDate("validdate =", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("validdate <>", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateGreaterThan(Date value) {
            addCriterionForJDBCDate("validdate >", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validdate >=", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateLessThan(Date value) {
            addCriterionForJDBCDate("validdate <", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validdate <=", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateIn(List<Date> values) {
            addCriterionForJDBCDate("validdate in", values, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("validdate not in", values, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validdate between", value1, value2, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validdate not between", value1, value2, "validdate");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxIsNull() {
            addCriterion("priceoftax is null");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxIsNotNull() {
            addCriterion("priceoftax is not null");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxEqualTo(Integer value) {
            addCriterion("priceoftax =", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxNotEqualTo(Integer value) {
            addCriterion("priceoftax <>", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxGreaterThan(Integer value) {
            addCriterion("priceoftax >", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("priceoftax >=", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxLessThan(Integer value) {
            addCriterion("priceoftax <", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxLessThanOrEqualTo(Integer value) {
            addCriterion("priceoftax <=", value, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxIn(List<Integer> values) {
            addCriterion("priceoftax in", values, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxNotIn(List<Integer> values) {
            addCriterion("priceoftax not in", values, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxBetween(Integer value1, Integer value2) {
            addCriterion("priceoftax between", value1, value2, "priceoftax");
            return (Criteria) this;
        }

        public Criteria andPriceoftaxNotBetween(Integer value1, Integer value2) {
            addCriterion("priceoftax not between", value1, value2, "priceoftax");
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

        public Criteria andOutaddressIsNull() {
            addCriterion("outaddress is null");
            return (Criteria) this;
        }

        public Criteria andOutaddressIsNotNull() {
            addCriterion("outaddress is not null");
            return (Criteria) this;
        }

        public Criteria andOutaddressEqualTo(String value) {
            addCriterion("outaddress =", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressNotEqualTo(String value) {
            addCriterion("outaddress <>", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressGreaterThan(String value) {
            addCriterion("outaddress >", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressGreaterThanOrEqualTo(String value) {
            addCriterion("outaddress >=", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressLessThan(String value) {
            addCriterion("outaddress <", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressLessThanOrEqualTo(String value) {
            addCriterion("outaddress <=", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressLike(String value) {
            addCriterion("outaddress like", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressNotLike(String value) {
            addCriterion("outaddress not like", value, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressIn(List<String> values) {
            addCriterion("outaddress in", values, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressNotIn(List<String> values) {
            addCriterion("outaddress not in", values, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressBetween(String value1, String value2) {
            addCriterion("outaddress between", value1, value2, "outaddress");
            return (Criteria) this;
        }

        public Criteria andOutaddressNotBetween(String value1, String value2) {
            addCriterion("outaddress not between", value1, value2, "outaddress");
            return (Criteria) this;
        }

        public Criteria andSalesnameIsNull() {
            addCriterion("salesname is null");
            return (Criteria) this;
        }

        public Criteria andSalesnameIsNotNull() {
            addCriterion("salesname is not null");
            return (Criteria) this;
        }

        public Criteria andSalesnameEqualTo(String value) {
            addCriterion("salesname =", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameNotEqualTo(String value) {
            addCriterion("salesname <>", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameGreaterThan(String value) {
            addCriterion("salesname >", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameGreaterThanOrEqualTo(String value) {
            addCriterion("salesname >=", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameLessThan(String value) {
            addCriterion("salesname <", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameLessThanOrEqualTo(String value) {
            addCriterion("salesname <=", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameLike(String value) {
            addCriterion("salesname like", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameNotLike(String value) {
            addCriterion("salesname not like", value, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameIn(List<String> values) {
            addCriterion("salesname in", values, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameNotIn(List<String> values) {
            addCriterion("salesname not in", values, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameBetween(String value1, String value2) {
            addCriterion("salesname between", value1, value2, "salesname");
            return (Criteria) this;
        }

        public Criteria andSalesnameNotBetween(String value1, String value2) {
            addCriterion("salesname not between", value1, value2, "salesname");
            return (Criteria) this;
        }

        public Criteria andDepartidIsNull() {
            addCriterion("departid is null");
            return (Criteria) this;
        }

        public Criteria andDepartidIsNotNull() {
            addCriterion("departid is not null");
            return (Criteria) this;
        }

        public Criteria andDepartidEqualTo(Integer value) {
            addCriterion("departid =", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotEqualTo(Integer value) {
            addCriterion("departid <>", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThan(Integer value) {
            addCriterion("departid >", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departid >=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThan(Integer value) {
            addCriterion("departid <", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidLessThanOrEqualTo(Integer value) {
            addCriterion("departid <=", value, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidIn(List<Integer> values) {
            addCriterion("departid in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotIn(List<Integer> values) {
            addCriterion("departid not in", values, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidBetween(Integer value1, Integer value2) {
            addCriterion("departid between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andDepartidNotBetween(Integer value1, Integer value2) {
            addCriterion("departid not between", value1, value2, "departid");
            return (Criteria) this;
        }

        public Criteria andMakerIsNull() {
            addCriterion("maker is null");
            return (Criteria) this;
        }

        public Criteria andMakerIsNotNull() {
            addCriterion("maker is not null");
            return (Criteria) this;
        }

        public Criteria andMakerEqualTo(String value) {
            addCriterion("maker =", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotEqualTo(String value) {
            addCriterion("maker <>", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerGreaterThan(String value) {
            addCriterion("maker >", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerGreaterThanOrEqualTo(String value) {
            addCriterion("maker >=", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLessThan(String value) {
            addCriterion("maker <", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLessThanOrEqualTo(String value) {
            addCriterion("maker <=", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLike(String value) {
            addCriterion("maker like", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotLike(String value) {
            addCriterion("maker not like", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerIn(List<String> values) {
            addCriterion("maker in", values, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotIn(List<String> values) {
            addCriterion("maker not in", values, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerBetween(String value1, String value2) {
            addCriterion("maker between", value1, value2, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotBetween(String value1, String value2) {
            addCriterion("maker not between", value1, value2, "maker");
            return (Criteria) this;
        }

        public Criteria andPermitterIsNull() {
            addCriterion("permitter is null");
            return (Criteria) this;
        }

        public Criteria andPermitterIsNotNull() {
            addCriterion("permitter is not null");
            return (Criteria) this;
        }

        public Criteria andPermitterEqualTo(String value) {
            addCriterion("permitter =", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterNotEqualTo(String value) {
            addCriterion("permitter <>", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterGreaterThan(String value) {
            addCriterion("permitter >", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterGreaterThanOrEqualTo(String value) {
            addCriterion("permitter >=", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterLessThan(String value) {
            addCriterion("permitter <", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterLessThanOrEqualTo(String value) {
            addCriterion("permitter <=", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterLike(String value) {
            addCriterion("permitter like", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterNotLike(String value) {
            addCriterion("permitter not like", value, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterIn(List<String> values) {
            addCriterion("permitter in", values, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterNotIn(List<String> values) {
            addCriterion("permitter not in", values, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterBetween(String value1, String value2) {
            addCriterion("permitter between", value1, value2, "permitter");
            return (Criteria) this;
        }

        public Criteria andPermitterNotBetween(String value1, String value2) {
            addCriterion("permitter not between", value1, value2, "permitter");
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