package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InOutWarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InOutWarehouseExample() {
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

        public Criteria andIowTypeIdIsNull() {
            addCriterion("iow_type_id is null");
            return (Criteria) this;
        }

        public Criteria andIowTypeIdIsNotNull() {
            addCriterion("iow_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andIowTypeIdEqualTo(Integer value) {
            addCriterion("iow_type_id =", value, "iowTypeId");
            return (Criteria) this;
        }

        public Criteria andIowTypeIdNotEqualTo(Integer value) {
            addCriterion("iow_type_id <>", value, "iowTypeId");
            return (Criteria) this;
        }

        public Criteria andIowTypeIdGreaterThan(Integer value) {
            addCriterion("iow_type_id >", value, "iowTypeId");
            return (Criteria) this;
        }

        public Criteria andIowTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iow_type_id >=", value, "iowTypeId");
            return (Criteria) this;
        }

        public Criteria andIowTypeIdLessThan(Integer value) {
            addCriterion("iow_type_id <", value, "iowTypeId");
            return (Criteria) this;
        }

        public Criteria andIowTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("iow_type_id <=", value, "iowTypeId");
            return (Criteria) this;
        }

        public Criteria andIowTypeIdIn(List<Integer> values) {
            addCriterion("iow_type_id in", values, "iowTypeId");
            return (Criteria) this;
        }

        public Criteria andIowTypeIdNotIn(List<Integer> values) {
            addCriterion("iow_type_id not in", values, "iowTypeId");
            return (Criteria) this;
        }

        public Criteria andIowTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("iow_type_id between", value1, value2, "iowTypeId");
            return (Criteria) this;
        }

        public Criteria andIowTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iow_type_id not between", value1, value2, "iowTypeId");
            return (Criteria) this;
        }

        public Criteria andIowIdIsNull() {
            addCriterion("iow_id is null");
            return (Criteria) this;
        }

        public Criteria andIowIdIsNotNull() {
            addCriterion("iow_id is not null");
            return (Criteria) this;
        }

        public Criteria andIowIdEqualTo(String value) {
            addCriterion("iow_id =", value, "iowId");
            return (Criteria) this;
        }

        public Criteria andIowIdNotEqualTo(String value) {
            addCriterion("iow_id <>", value, "iowId");
            return (Criteria) this;
        }

        public Criteria andIowIdGreaterThan(String value) {
            addCriterion("iow_id >", value, "iowId");
            return (Criteria) this;
        }

        public Criteria andIowIdGreaterThanOrEqualTo(String value) {
            addCriterion("iow_id >=", value, "iowId");
            return (Criteria) this;
        }

        public Criteria andIowIdLessThan(String value) {
            addCriterion("iow_id <", value, "iowId");
            return (Criteria) this;
        }

        public Criteria andIowIdLessThanOrEqualTo(String value) {
            addCriterion("iow_id <=", value, "iowId");
            return (Criteria) this;
        }

        public Criteria andIowIdLike(String value) {
            addCriterion("iow_id like", value, "iowId");
            return (Criteria) this;
        }

        public Criteria andIowIdNotLike(String value) {
            addCriterion("iow_id not like", value, "iowId");
            return (Criteria) this;
        }

        public Criteria andIowIdIn(List<String> values) {
            addCriterion("iow_id in", values, "iowId");
            return (Criteria) this;
        }

        public Criteria andIowIdNotIn(List<String> values) {
            addCriterion("iow_id not in", values, "iowId");
            return (Criteria) this;
        }

        public Criteria andIowIdBetween(String value1, String value2) {
            addCriterion("iow_id between", value1, value2, "iowId");
            return (Criteria) this;
        }

        public Criteria andIowIdNotBetween(String value1, String value2) {
            addCriterion("iow_id not between", value1, value2, "iowId");
            return (Criteria) this;
        }

        public Criteria andIowLineidIsNull() {
            addCriterion("iow_lineid is null");
            return (Criteria) this;
        }

        public Criteria andIowLineidIsNotNull() {
            addCriterion("iow_lineid is not null");
            return (Criteria) this;
        }

        public Criteria andIowLineidEqualTo(Integer value) {
            addCriterion("iow_lineid =", value, "iowLineid");
            return (Criteria) this;
        }

        public Criteria andIowLineidNotEqualTo(Integer value) {
            addCriterion("iow_lineid <>", value, "iowLineid");
            return (Criteria) this;
        }

        public Criteria andIowLineidGreaterThan(Integer value) {
            addCriterion("iow_lineid >", value, "iowLineid");
            return (Criteria) this;
        }

        public Criteria andIowLineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iow_lineid >=", value, "iowLineid");
            return (Criteria) this;
        }

        public Criteria andIowLineidLessThan(Integer value) {
            addCriterion("iow_lineid <", value, "iowLineid");
            return (Criteria) this;
        }

        public Criteria andIowLineidLessThanOrEqualTo(Integer value) {
            addCriterion("iow_lineid <=", value, "iowLineid");
            return (Criteria) this;
        }

        public Criteria andIowLineidIn(List<Integer> values) {
            addCriterion("iow_lineid in", values, "iowLineid");
            return (Criteria) this;
        }

        public Criteria andIowLineidNotIn(List<Integer> values) {
            addCriterion("iow_lineid not in", values, "iowLineid");
            return (Criteria) this;
        }

        public Criteria andIowLineidBetween(Integer value1, Integer value2) {
            addCriterion("iow_lineid between", value1, value2, "iowLineid");
            return (Criteria) this;
        }

        public Criteria andIowLineidNotBetween(Integer value1, Integer value2) {
            addCriterion("iow_lineid not between", value1, value2, "iowLineid");
            return (Criteria) this;
        }

        public Criteria andIowWIdIsNull() {
            addCriterion("iow_w_id is null");
            return (Criteria) this;
        }

        public Criteria andIowWIdIsNotNull() {
            addCriterion("iow_w_id is not null");
            return (Criteria) this;
        }

        public Criteria andIowWIdEqualTo(Integer value) {
            addCriterion("iow_w_id =", value, "iowWId");
            return (Criteria) this;
        }

        public Criteria andIowWIdNotEqualTo(Integer value) {
            addCriterion("iow_w_id <>", value, "iowWId");
            return (Criteria) this;
        }

        public Criteria andIowWIdGreaterThan(Integer value) {
            addCriterion("iow_w_id >", value, "iowWId");
            return (Criteria) this;
        }

        public Criteria andIowWIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iow_w_id >=", value, "iowWId");
            return (Criteria) this;
        }

        public Criteria andIowWIdLessThan(Integer value) {
            addCriterion("iow_w_id <", value, "iowWId");
            return (Criteria) this;
        }

        public Criteria andIowWIdLessThanOrEqualTo(Integer value) {
            addCriterion("iow_w_id <=", value, "iowWId");
            return (Criteria) this;
        }

        public Criteria andIowWIdIn(List<Integer> values) {
            addCriterion("iow_w_id in", values, "iowWId");
            return (Criteria) this;
        }

        public Criteria andIowWIdNotIn(List<Integer> values) {
            addCriterion("iow_w_id not in", values, "iowWId");
            return (Criteria) this;
        }

        public Criteria andIowWIdBetween(Integer value1, Integer value2) {
            addCriterion("iow_w_id between", value1, value2, "iowWId");
            return (Criteria) this;
        }

        public Criteria andIowWIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iow_w_id not between", value1, value2, "iowWId");
            return (Criteria) this;
        }

        public Criteria andIowNumIsNull() {
            addCriterion("iow_num is null");
            return (Criteria) this;
        }

        public Criteria andIowNumIsNotNull() {
            addCriterion("iow_num is not null");
            return (Criteria) this;
        }

        public Criteria andIowNumEqualTo(Integer value) {
            addCriterion("iow_num =", value, "iowNum");
            return (Criteria) this;
        }

        public Criteria andIowNumNotEqualTo(Integer value) {
            addCriterion("iow_num <>", value, "iowNum");
            return (Criteria) this;
        }

        public Criteria andIowNumGreaterThan(Integer value) {
            addCriterion("iow_num >", value, "iowNum");
            return (Criteria) this;
        }

        public Criteria andIowNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("iow_num >=", value, "iowNum");
            return (Criteria) this;
        }

        public Criteria andIowNumLessThan(Integer value) {
            addCriterion("iow_num <", value, "iowNum");
            return (Criteria) this;
        }

        public Criteria andIowNumLessThanOrEqualTo(Integer value) {
            addCriterion("iow_num <=", value, "iowNum");
            return (Criteria) this;
        }

        public Criteria andIowNumIn(List<Integer> values) {
            addCriterion("iow_num in", values, "iowNum");
            return (Criteria) this;
        }

        public Criteria andIowNumNotIn(List<Integer> values) {
            addCriterion("iow_num not in", values, "iowNum");
            return (Criteria) this;
        }

        public Criteria andIowNumBetween(Integer value1, Integer value2) {
            addCriterion("iow_num between", value1, value2, "iowNum");
            return (Criteria) this;
        }

        public Criteria andIowNumNotBetween(Integer value1, Integer value2) {
            addCriterion("iow_num not between", value1, value2, "iowNum");
            return (Criteria) this;
        }

        public Criteria andIowCbdpriceIsNull() {
            addCriterion("iow_cbdprice is null");
            return (Criteria) this;
        }

        public Criteria andIowCbdpriceIsNotNull() {
            addCriterion("iow_cbdprice is not null");
            return (Criteria) this;
        }

        public Criteria andIowCbdpriceEqualTo(Double value) {
            addCriterion("iow_cbdprice =", value, "iowCbdprice");
            return (Criteria) this;
        }

        public Criteria andIowCbdpriceNotEqualTo(Double value) {
            addCriterion("iow_cbdprice <>", value, "iowCbdprice");
            return (Criteria) this;
        }

        public Criteria andIowCbdpriceGreaterThan(Double value) {
            addCriterion("iow_cbdprice >", value, "iowCbdprice");
            return (Criteria) this;
        }

        public Criteria andIowCbdpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("iow_cbdprice >=", value, "iowCbdprice");
            return (Criteria) this;
        }

        public Criteria andIowCbdpriceLessThan(Double value) {
            addCriterion("iow_cbdprice <", value, "iowCbdprice");
            return (Criteria) this;
        }

        public Criteria andIowCbdpriceLessThanOrEqualTo(Double value) {
            addCriterion("iow_cbdprice <=", value, "iowCbdprice");
            return (Criteria) this;
        }

        public Criteria andIowCbdpriceIn(List<Double> values) {
            addCriterion("iow_cbdprice in", values, "iowCbdprice");
            return (Criteria) this;
        }

        public Criteria andIowCbdpriceNotIn(List<Double> values) {
            addCriterion("iow_cbdprice not in", values, "iowCbdprice");
            return (Criteria) this;
        }

        public Criteria andIowCbdpriceBetween(Double value1, Double value2) {
            addCriterion("iow_cbdprice between", value1, value2, "iowCbdprice");
            return (Criteria) this;
        }

        public Criteria andIowCbdpriceNotBetween(Double value1, Double value2) {
            addCriterion("iow_cbdprice not between", value1, value2, "iowCbdprice");
            return (Criteria) this;
        }

        public Criteria andIowTotalmoneyIsNull() {
            addCriterion("iow_totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andIowTotalmoneyIsNotNull() {
            addCriterion("iow_totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andIowTotalmoneyEqualTo(Double value) {
            addCriterion("iow_totalmoney =", value, "iowTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIowTotalmoneyNotEqualTo(Double value) {
            addCriterion("iow_totalmoney <>", value, "iowTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIowTotalmoneyGreaterThan(Double value) {
            addCriterion("iow_totalmoney >", value, "iowTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIowTotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("iow_totalmoney >=", value, "iowTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIowTotalmoneyLessThan(Double value) {
            addCriterion("iow_totalmoney <", value, "iowTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIowTotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("iow_totalmoney <=", value, "iowTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIowTotalmoneyIn(List<Double> values) {
            addCriterion("iow_totalmoney in", values, "iowTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIowTotalmoneyNotIn(List<Double> values) {
            addCriterion("iow_totalmoney not in", values, "iowTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIowTotalmoneyBetween(Double value1, Double value2) {
            addCriterion("iow_totalmoney between", value1, value2, "iowTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIowTotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("iow_totalmoney not between", value1, value2, "iowTotalmoney");
            return (Criteria) this;
        }

        public Criteria andTowIomDateIsNull() {
            addCriterion("tow_iom_date is null");
            return (Criteria) this;
        }

        public Criteria andTowIomDateIsNotNull() {
            addCriterion("tow_iom_date is not null");
            return (Criteria) this;
        }

        public Criteria andTowIomDateEqualTo(Date value) {
            addCriterionForJDBCDate("tow_iom_date =", value, "towIomDate");
            return (Criteria) this;
        }

        public Criteria andTowIomDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("tow_iom_date <>", value, "towIomDate");
            return (Criteria) this;
        }

        public Criteria andTowIomDateGreaterThan(Date value) {
            addCriterionForJDBCDate("tow_iom_date >", value, "towIomDate");
            return (Criteria) this;
        }

        public Criteria andTowIomDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tow_iom_date >=", value, "towIomDate");
            return (Criteria) this;
        }

        public Criteria andTowIomDateLessThan(Date value) {
            addCriterionForJDBCDate("tow_iom_date <", value, "towIomDate");
            return (Criteria) this;
        }

        public Criteria andTowIomDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tow_iom_date <=", value, "towIomDate");
            return (Criteria) this;
        }

        public Criteria andTowIomDateIn(List<Date> values) {
            addCriterionForJDBCDate("tow_iom_date in", values, "towIomDate");
            return (Criteria) this;
        }

        public Criteria andTowIomDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("tow_iom_date not in", values, "towIomDate");
            return (Criteria) this;
        }

        public Criteria andTowIomDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tow_iom_date between", value1, value2, "towIomDate");
            return (Criteria) this;
        }

        public Criteria andTowIomDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tow_iom_date not between", value1, value2, "towIomDate");
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