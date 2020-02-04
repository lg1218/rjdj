package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KehuMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KehuMainExample() {
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

        public Criteria andKhidIsNull() {
            addCriterion("khid is null");
            return (Criteria) this;
        }

        public Criteria andKhidIsNotNull() {
            addCriterion("khid is not null");
            return (Criteria) this;
        }

        public Criteria andKhidEqualTo(Integer value) {
            addCriterion("khid =", value, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidNotEqualTo(Integer value) {
            addCriterion("khid <>", value, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidGreaterThan(Integer value) {
            addCriterion("khid >", value, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidGreaterThanOrEqualTo(Integer value) {
            addCriterion("khid >=", value, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidLessThan(Integer value) {
            addCriterion("khid <", value, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidLessThanOrEqualTo(Integer value) {
            addCriterion("khid <=", value, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidIn(List<Integer> values) {
            addCriterion("khid in", values, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidNotIn(List<Integer> values) {
            addCriterion("khid not in", values, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidBetween(Integer value1, Integer value2) {
            addCriterion("khid between", value1, value2, "khid");
            return (Criteria) this;
        }

        public Criteria andKhidNotBetween(Integer value1, Integer value2) {
            addCriterion("khid not between", value1, value2, "khid");
            return (Criteria) this;
        }

        public Criteria andKhfnameIsNull() {
            addCriterion("khfname is null");
            return (Criteria) this;
        }

        public Criteria andKhfnameIsNotNull() {
            addCriterion("khfname is not null");
            return (Criteria) this;
        }

        public Criteria andKhfnameEqualTo(String value) {
            addCriterion("khfname =", value, "khfname");
            return (Criteria) this;
        }

        public Criteria andKhfnameNotEqualTo(String value) {
            addCriterion("khfname <>", value, "khfname");
            return (Criteria) this;
        }

        public Criteria andKhfnameGreaterThan(String value) {
            addCriterion("khfname >", value, "khfname");
            return (Criteria) this;
        }

        public Criteria andKhfnameGreaterThanOrEqualTo(String value) {
            addCriterion("khfname >=", value, "khfname");
            return (Criteria) this;
        }

        public Criteria andKhfnameLessThan(String value) {
            addCriterion("khfname <", value, "khfname");
            return (Criteria) this;
        }

        public Criteria andKhfnameLessThanOrEqualTo(String value) {
            addCriterion("khfname <=", value, "khfname");
            return (Criteria) this;
        }

        public Criteria andKhfnameLike(String value) {
            addCriterion("khfname like", value, "khfname");
            return (Criteria) this;
        }

        public Criteria andKhfnameNotLike(String value) {
            addCriterion("khfname not like", value, "khfname");
            return (Criteria) this;
        }

        public Criteria andKhfnameIn(List<String> values) {
            addCriterion("khfname in", values, "khfname");
            return (Criteria) this;
        }

        public Criteria andKhfnameNotIn(List<String> values) {
            addCriterion("khfname not in", values, "khfname");
            return (Criteria) this;
        }

        public Criteria andKhfnameBetween(String value1, String value2) {
            addCriterion("khfname between", value1, value2, "khfname");
            return (Criteria) this;
        }

        public Criteria andKhfnameNotBetween(String value1, String value2) {
            addCriterion("khfname not between", value1, value2, "khfname");
            return (Criteria) this;
        }

        public Criteria andKhsnameIsNull() {
            addCriterion("khsname is null");
            return (Criteria) this;
        }

        public Criteria andKhsnameIsNotNull() {
            addCriterion("khsname is not null");
            return (Criteria) this;
        }

        public Criteria andKhsnameEqualTo(String value) {
            addCriterion("khsname =", value, "khsname");
            return (Criteria) this;
        }

        public Criteria andKhsnameNotEqualTo(String value) {
            addCriterion("khsname <>", value, "khsname");
            return (Criteria) this;
        }

        public Criteria andKhsnameGreaterThan(String value) {
            addCriterion("khsname >", value, "khsname");
            return (Criteria) this;
        }

        public Criteria andKhsnameGreaterThanOrEqualTo(String value) {
            addCriterion("khsname >=", value, "khsname");
            return (Criteria) this;
        }

        public Criteria andKhsnameLessThan(String value) {
            addCriterion("khsname <", value, "khsname");
            return (Criteria) this;
        }

        public Criteria andKhsnameLessThanOrEqualTo(String value) {
            addCriterion("khsname <=", value, "khsname");
            return (Criteria) this;
        }

        public Criteria andKhsnameLike(String value) {
            addCriterion("khsname like", value, "khsname");
            return (Criteria) this;
        }

        public Criteria andKhsnameNotLike(String value) {
            addCriterion("khsname not like", value, "khsname");
            return (Criteria) this;
        }

        public Criteria andKhsnameIn(List<String> values) {
            addCriterion("khsname in", values, "khsname");
            return (Criteria) this;
        }

        public Criteria andKhsnameNotIn(List<String> values) {
            addCriterion("khsname not in", values, "khsname");
            return (Criteria) this;
        }

        public Criteria andKhsnameBetween(String value1, String value2) {
            addCriterion("khsname between", value1, value2, "khsname");
            return (Criteria) this;
        }

        public Criteria andKhsnameNotBetween(String value1, String value2) {
            addCriterion("khsname not between", value1, value2, "khsname");
            return (Criteria) this;
        }

        public Criteria andKhefnameIsNull() {
            addCriterion("khefname is null");
            return (Criteria) this;
        }

        public Criteria andKhefnameIsNotNull() {
            addCriterion("khefname is not null");
            return (Criteria) this;
        }

        public Criteria andKhefnameEqualTo(String value) {
            addCriterion("khefname =", value, "khefname");
            return (Criteria) this;
        }

        public Criteria andKhefnameNotEqualTo(String value) {
            addCriterion("khefname <>", value, "khefname");
            return (Criteria) this;
        }

        public Criteria andKhefnameGreaterThan(String value) {
            addCriterion("khefname >", value, "khefname");
            return (Criteria) this;
        }

        public Criteria andKhefnameGreaterThanOrEqualTo(String value) {
            addCriterion("khefname >=", value, "khefname");
            return (Criteria) this;
        }

        public Criteria andKhefnameLessThan(String value) {
            addCriterion("khefname <", value, "khefname");
            return (Criteria) this;
        }

        public Criteria andKhefnameLessThanOrEqualTo(String value) {
            addCriterion("khefname <=", value, "khefname");
            return (Criteria) this;
        }

        public Criteria andKhefnameLike(String value) {
            addCriterion("khefname like", value, "khefname");
            return (Criteria) this;
        }

        public Criteria andKhefnameNotLike(String value) {
            addCriterion("khefname not like", value, "khefname");
            return (Criteria) this;
        }

        public Criteria andKhefnameIn(List<String> values) {
            addCriterion("khefname in", values, "khefname");
            return (Criteria) this;
        }

        public Criteria andKhefnameNotIn(List<String> values) {
            addCriterion("khefname not in", values, "khefname");
            return (Criteria) this;
        }

        public Criteria andKhefnameBetween(String value1, String value2) {
            addCriterion("khefname between", value1, value2, "khefname");
            return (Criteria) this;
        }

        public Criteria andKhefnameNotBetween(String value1, String value2) {
            addCriterion("khefname not between", value1, value2, "khefname");
            return (Criteria) this;
        }

        public Criteria andKhssnameIsNull() {
            addCriterion("khssname is null");
            return (Criteria) this;
        }

        public Criteria andKhssnameIsNotNull() {
            addCriterion("khssname is not null");
            return (Criteria) this;
        }

        public Criteria andKhssnameEqualTo(String value) {
            addCriterion("khssname =", value, "khssname");
            return (Criteria) this;
        }

        public Criteria andKhssnameNotEqualTo(String value) {
            addCriterion("khssname <>", value, "khssname");
            return (Criteria) this;
        }

        public Criteria andKhssnameGreaterThan(String value) {
            addCriterion("khssname >", value, "khssname");
            return (Criteria) this;
        }

        public Criteria andKhssnameGreaterThanOrEqualTo(String value) {
            addCriterion("khssname >=", value, "khssname");
            return (Criteria) this;
        }

        public Criteria andKhssnameLessThan(String value) {
            addCriterion("khssname <", value, "khssname");
            return (Criteria) this;
        }

        public Criteria andKhssnameLessThanOrEqualTo(String value) {
            addCriterion("khssname <=", value, "khssname");
            return (Criteria) this;
        }

        public Criteria andKhssnameLike(String value) {
            addCriterion("khssname like", value, "khssname");
            return (Criteria) this;
        }

        public Criteria andKhssnameNotLike(String value) {
            addCriterion("khssname not like", value, "khssname");
            return (Criteria) this;
        }

        public Criteria andKhssnameIn(List<String> values) {
            addCriterion("khssname in", values, "khssname");
            return (Criteria) this;
        }

        public Criteria andKhssnameNotIn(List<String> values) {
            addCriterion("khssname not in", values, "khssname");
            return (Criteria) this;
        }

        public Criteria andKhssnameBetween(String value1, String value2) {
            addCriterion("khssname between", value1, value2, "khssname");
            return (Criteria) this;
        }

        public Criteria andKhssnameNotBetween(String value1, String value2) {
            addCriterion("khssname not between", value1, value2, "khssname");
            return (Criteria) this;
        }

        public Criteria andKhavidIsNull() {
            addCriterion("khavid is null");
            return (Criteria) this;
        }

        public Criteria andKhavidIsNotNull() {
            addCriterion("khavid is not null");
            return (Criteria) this;
        }

        public Criteria andKhavidEqualTo(Integer value) {
            addCriterion("khavid =", value, "khavid");
            return (Criteria) this;
        }

        public Criteria andKhavidNotEqualTo(Integer value) {
            addCriterion("khavid <>", value, "khavid");
            return (Criteria) this;
        }

        public Criteria andKhavidGreaterThan(Integer value) {
            addCriterion("khavid >", value, "khavid");
            return (Criteria) this;
        }

        public Criteria andKhavidGreaterThanOrEqualTo(Integer value) {
            addCriterion("khavid >=", value, "khavid");
            return (Criteria) this;
        }

        public Criteria andKhavidLessThan(Integer value) {
            addCriterion("khavid <", value, "khavid");
            return (Criteria) this;
        }

        public Criteria andKhavidLessThanOrEqualTo(Integer value) {
            addCriterion("khavid <=", value, "khavid");
            return (Criteria) this;
        }

        public Criteria andKhavidIn(List<Integer> values) {
            addCriterion("khavid in", values, "khavid");
            return (Criteria) this;
        }

        public Criteria andKhavidNotIn(List<Integer> values) {
            addCriterion("khavid not in", values, "khavid");
            return (Criteria) this;
        }

        public Criteria andKhavidBetween(Integer value1, Integer value2) {
            addCriterion("khavid between", value1, value2, "khavid");
            return (Criteria) this;
        }

        public Criteria andKhavidNotBetween(Integer value1, Integer value2) {
            addCriterion("khavid not between", value1, value2, "khavid");
            return (Criteria) this;
        }

        public Criteria andKhtypeidIsNull() {
            addCriterion("khtypeid is null");
            return (Criteria) this;
        }

        public Criteria andKhtypeidIsNotNull() {
            addCriterion("khtypeid is not null");
            return (Criteria) this;
        }

        public Criteria andKhtypeidEqualTo(Integer value) {
            addCriterion("khtypeid =", value, "khtypeid");
            return (Criteria) this;
        }

        public Criteria andKhtypeidNotEqualTo(Integer value) {
            addCriterion("khtypeid <>", value, "khtypeid");
            return (Criteria) this;
        }

        public Criteria andKhtypeidGreaterThan(Integer value) {
            addCriterion("khtypeid >", value, "khtypeid");
            return (Criteria) this;
        }

        public Criteria andKhtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("khtypeid >=", value, "khtypeid");
            return (Criteria) this;
        }

        public Criteria andKhtypeidLessThan(Integer value) {
            addCriterion("khtypeid <", value, "khtypeid");
            return (Criteria) this;
        }

        public Criteria andKhtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("khtypeid <=", value, "khtypeid");
            return (Criteria) this;
        }

        public Criteria andKhtypeidIn(List<Integer> values) {
            addCriterion("khtypeid in", values, "khtypeid");
            return (Criteria) this;
        }

        public Criteria andKhtypeidNotIn(List<Integer> values) {
            addCriterion("khtypeid not in", values, "khtypeid");
            return (Criteria) this;
        }

        public Criteria andKhtypeidBetween(Integer value1, Integer value2) {
            addCriterion("khtypeid between", value1, value2, "khtypeid");
            return (Criteria) this;
        }

        public Criteria andKhtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("khtypeid not between", value1, value2, "khtypeid");
            return (Criteria) this;
        }

        public Criteria andKhareaidIsNull() {
            addCriterion("khAreaid is null");
            return (Criteria) this;
        }

        public Criteria andKhareaidIsNotNull() {
            addCriterion("khAreaid is not null");
            return (Criteria) this;
        }

        public Criteria andKhareaidEqualTo(Integer value) {
            addCriterion("khAreaid =", value, "khareaid");
            return (Criteria) this;
        }

        public Criteria andKhareaidNotEqualTo(Integer value) {
            addCriterion("khAreaid <>", value, "khareaid");
            return (Criteria) this;
        }

        public Criteria andKhareaidGreaterThan(Integer value) {
            addCriterion("khAreaid >", value, "khareaid");
            return (Criteria) this;
        }

        public Criteria andKhareaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("khAreaid >=", value, "khareaid");
            return (Criteria) this;
        }

        public Criteria andKhareaidLessThan(Integer value) {
            addCriterion("khAreaid <", value, "khareaid");
            return (Criteria) this;
        }

        public Criteria andKhareaidLessThanOrEqualTo(Integer value) {
            addCriterion("khAreaid <=", value, "khareaid");
            return (Criteria) this;
        }

        public Criteria andKhareaidIn(List<Integer> values) {
            addCriterion("khAreaid in", values, "khareaid");
            return (Criteria) this;
        }

        public Criteria andKhareaidNotIn(List<Integer> values) {
            addCriterion("khAreaid not in", values, "khareaid");
            return (Criteria) this;
        }

        public Criteria andKhareaidBetween(Integer value1, Integer value2) {
            addCriterion("khAreaid between", value1, value2, "khareaid");
            return (Criteria) this;
        }

        public Criteria andKhareaidNotBetween(Integer value1, Integer value2) {
            addCriterion("khAreaid not between", value1, value2, "khareaid");
            return (Criteria) this;
        }

        public Criteria andKhcurrencyidIsNull() {
            addCriterion("khCurrencyid is null");
            return (Criteria) this;
        }

        public Criteria andKhcurrencyidIsNotNull() {
            addCriterion("khCurrencyid is not null");
            return (Criteria) this;
        }

        public Criteria andKhcurrencyidEqualTo(Integer value) {
            addCriterion("khCurrencyid =", value, "khcurrencyid");
            return (Criteria) this;
        }

        public Criteria andKhcurrencyidNotEqualTo(Integer value) {
            addCriterion("khCurrencyid <>", value, "khcurrencyid");
            return (Criteria) this;
        }

        public Criteria andKhcurrencyidGreaterThan(Integer value) {
            addCriterion("khCurrencyid >", value, "khcurrencyid");
            return (Criteria) this;
        }

        public Criteria andKhcurrencyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("khCurrencyid >=", value, "khcurrencyid");
            return (Criteria) this;
        }

        public Criteria andKhcurrencyidLessThan(Integer value) {
            addCriterion("khCurrencyid <", value, "khcurrencyid");
            return (Criteria) this;
        }

        public Criteria andKhcurrencyidLessThanOrEqualTo(Integer value) {
            addCriterion("khCurrencyid <=", value, "khcurrencyid");
            return (Criteria) this;
        }

        public Criteria andKhcurrencyidIn(List<Integer> values) {
            addCriterion("khCurrencyid in", values, "khcurrencyid");
            return (Criteria) this;
        }

        public Criteria andKhcurrencyidNotIn(List<Integer> values) {
            addCriterion("khCurrencyid not in", values, "khcurrencyid");
            return (Criteria) this;
        }

        public Criteria andKhcurrencyidBetween(Integer value1, Integer value2) {
            addCriterion("khCurrencyid between", value1, value2, "khcurrencyid");
            return (Criteria) this;
        }

        public Criteria andKhcurrencyidNotBetween(Integer value1, Integer value2) {
            addCriterion("khCurrencyid not between", value1, value2, "khcurrencyid");
            return (Criteria) this;
        }

        public Criteria andKhFzManIsNull() {
            addCriterion("kh_fz_man is null");
            return (Criteria) this;
        }

        public Criteria andKhFzManIsNotNull() {
            addCriterion("kh_fz_man is not null");
            return (Criteria) this;
        }

        public Criteria andKhFzManEqualTo(String value) {
            addCriterion("kh_fz_man =", value, "khFzMan");
            return (Criteria) this;
        }

        public Criteria andKhFzManNotEqualTo(String value) {
            addCriterion("kh_fz_man <>", value, "khFzMan");
            return (Criteria) this;
        }

        public Criteria andKhFzManGreaterThan(String value) {
            addCriterion("kh_fz_man >", value, "khFzMan");
            return (Criteria) this;
        }

        public Criteria andKhFzManGreaterThanOrEqualTo(String value) {
            addCriterion("kh_fz_man >=", value, "khFzMan");
            return (Criteria) this;
        }

        public Criteria andKhFzManLessThan(String value) {
            addCriterion("kh_fz_man <", value, "khFzMan");
            return (Criteria) this;
        }

        public Criteria andKhFzManLessThanOrEqualTo(String value) {
            addCriterion("kh_fz_man <=", value, "khFzMan");
            return (Criteria) this;
        }

        public Criteria andKhFzManLike(String value) {
            addCriterion("kh_fz_man like", value, "khFzMan");
            return (Criteria) this;
        }

        public Criteria andKhFzManNotLike(String value) {
            addCriterion("kh_fz_man not like", value, "khFzMan");
            return (Criteria) this;
        }

        public Criteria andKhFzManIn(List<String> values) {
            addCriterion("kh_fz_man in", values, "khFzMan");
            return (Criteria) this;
        }

        public Criteria andKhFzManNotIn(List<String> values) {
            addCriterion("kh_fz_man not in", values, "khFzMan");
            return (Criteria) this;
        }

        public Criteria andKhFzManBetween(String value1, String value2) {
            addCriterion("kh_fz_man between", value1, value2, "khFzMan");
            return (Criteria) this;
        }

        public Criteria andKhFzManNotBetween(String value1, String value2) {
            addCriterion("kh_fz_man not between", value1, value2, "khFzMan");
            return (Criteria) this;
        }

        public Criteria andKhLxManIsNull() {
            addCriterion("kh_lx_man is null");
            return (Criteria) this;
        }

        public Criteria andKhLxManIsNotNull() {
            addCriterion("kh_lx_man is not null");
            return (Criteria) this;
        }

        public Criteria andKhLxManEqualTo(String value) {
            addCriterion("kh_lx_man =", value, "khLxMan");
            return (Criteria) this;
        }

        public Criteria andKhLxManNotEqualTo(String value) {
            addCriterion("kh_lx_man <>", value, "khLxMan");
            return (Criteria) this;
        }

        public Criteria andKhLxManGreaterThan(String value) {
            addCriterion("kh_lx_man >", value, "khLxMan");
            return (Criteria) this;
        }

        public Criteria andKhLxManGreaterThanOrEqualTo(String value) {
            addCriterion("kh_lx_man >=", value, "khLxMan");
            return (Criteria) this;
        }

        public Criteria andKhLxManLessThan(String value) {
            addCriterion("kh_lx_man <", value, "khLxMan");
            return (Criteria) this;
        }

        public Criteria andKhLxManLessThanOrEqualTo(String value) {
            addCriterion("kh_lx_man <=", value, "khLxMan");
            return (Criteria) this;
        }

        public Criteria andKhLxManLike(String value) {
            addCriterion("kh_lx_man like", value, "khLxMan");
            return (Criteria) this;
        }

        public Criteria andKhLxManNotLike(String value) {
            addCriterion("kh_lx_man not like", value, "khLxMan");
            return (Criteria) this;
        }

        public Criteria andKhLxManIn(List<String> values) {
            addCriterion("kh_lx_man in", values, "khLxMan");
            return (Criteria) this;
        }

        public Criteria andKhLxManNotIn(List<String> values) {
            addCriterion("kh_lx_man not in", values, "khLxMan");
            return (Criteria) this;
        }

        public Criteria andKhLxManBetween(String value1, String value2) {
            addCriterion("kh_lx_man between", value1, value2, "khLxMan");
            return (Criteria) this;
        }

        public Criteria andKhLxManNotBetween(String value1, String value2) {
            addCriterion("kh_lx_man not between", value1, value2, "khLxMan");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneoneIsNull() {
            addCriterion("kh_lx_phoneone is null");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneoneIsNotNull() {
            addCriterion("kh_lx_phoneone is not null");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneoneEqualTo(String value) {
            addCriterion("kh_lx_phoneone =", value, "khLxPhoneone");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneoneNotEqualTo(String value) {
            addCriterion("kh_lx_phoneone <>", value, "khLxPhoneone");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneoneGreaterThan(String value) {
            addCriterion("kh_lx_phoneone >", value, "khLxPhoneone");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneoneGreaterThanOrEqualTo(String value) {
            addCriterion("kh_lx_phoneone >=", value, "khLxPhoneone");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneoneLessThan(String value) {
            addCriterion("kh_lx_phoneone <", value, "khLxPhoneone");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneoneLessThanOrEqualTo(String value) {
            addCriterion("kh_lx_phoneone <=", value, "khLxPhoneone");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneoneLike(String value) {
            addCriterion("kh_lx_phoneone like", value, "khLxPhoneone");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneoneNotLike(String value) {
            addCriterion("kh_lx_phoneone not like", value, "khLxPhoneone");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneoneIn(List<String> values) {
            addCriterion("kh_lx_phoneone in", values, "khLxPhoneone");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneoneNotIn(List<String> values) {
            addCriterion("kh_lx_phoneone not in", values, "khLxPhoneone");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneoneBetween(String value1, String value2) {
            addCriterion("kh_lx_phoneone between", value1, value2, "khLxPhoneone");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneoneNotBetween(String value1, String value2) {
            addCriterion("kh_lx_phoneone not between", value1, value2, "khLxPhoneone");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonetwoIsNull() {
            addCriterion("kh_lx_phonetwo is null");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonetwoIsNotNull() {
            addCriterion("kh_lx_phonetwo is not null");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonetwoEqualTo(String value) {
            addCriterion("kh_lx_phonetwo =", value, "khLxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonetwoNotEqualTo(String value) {
            addCriterion("kh_lx_phonetwo <>", value, "khLxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonetwoGreaterThan(String value) {
            addCriterion("kh_lx_phonetwo >", value, "khLxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonetwoGreaterThanOrEqualTo(String value) {
            addCriterion("kh_lx_phonetwo >=", value, "khLxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonetwoLessThan(String value) {
            addCriterion("kh_lx_phonetwo <", value, "khLxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonetwoLessThanOrEqualTo(String value) {
            addCriterion("kh_lx_phonetwo <=", value, "khLxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonetwoLike(String value) {
            addCriterion("kh_lx_phonetwo like", value, "khLxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonetwoNotLike(String value) {
            addCriterion("kh_lx_phonetwo not like", value, "khLxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonetwoIn(List<String> values) {
            addCriterion("kh_lx_phonetwo in", values, "khLxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonetwoNotIn(List<String> values) {
            addCriterion("kh_lx_phonetwo not in", values, "khLxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonetwoBetween(String value1, String value2) {
            addCriterion("kh_lx_phonetwo between", value1, value2, "khLxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonetwoNotBetween(String value1, String value2) {
            addCriterion("kh_lx_phonetwo not between", value1, value2, "khLxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonethreeIsNull() {
            addCriterion("kh_lx_phonethree is null");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonethreeIsNotNull() {
            addCriterion("kh_lx_phonethree is not null");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonethreeEqualTo(String value) {
            addCriterion("kh_lx_phonethree =", value, "khLxPhonethree");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonethreeNotEqualTo(String value) {
            addCriterion("kh_lx_phonethree <>", value, "khLxPhonethree");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonethreeGreaterThan(String value) {
            addCriterion("kh_lx_phonethree >", value, "khLxPhonethree");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonethreeGreaterThanOrEqualTo(String value) {
            addCriterion("kh_lx_phonethree >=", value, "khLxPhonethree");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonethreeLessThan(String value) {
            addCriterion("kh_lx_phonethree <", value, "khLxPhonethree");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonethreeLessThanOrEqualTo(String value) {
            addCriterion("kh_lx_phonethree <=", value, "khLxPhonethree");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonethreeLike(String value) {
            addCriterion("kh_lx_phonethree like", value, "khLxPhonethree");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonethreeNotLike(String value) {
            addCriterion("kh_lx_phonethree not like", value, "khLxPhonethree");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonethreeIn(List<String> values) {
            addCriterion("kh_lx_phonethree in", values, "khLxPhonethree");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonethreeNotIn(List<String> values) {
            addCriterion("kh_lx_phonethree not in", values, "khLxPhonethree");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonethreeBetween(String value1, String value2) {
            addCriterion("kh_lx_phonethree between", value1, value2, "khLxPhonethree");
            return (Criteria) this;
        }

        public Criteria andKhLxPhonethreeNotBetween(String value1, String value2) {
            addCriterion("kh_lx_phonethree not between", value1, value2, "khLxPhonethree");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneMobileIsNull() {
            addCriterion("kh_lx_phone_mobile is null");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneMobileIsNotNull() {
            addCriterion("kh_lx_phone_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneMobileEqualTo(String value) {
            addCriterion("kh_lx_phone_mobile =", value, "khLxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneMobileNotEqualTo(String value) {
            addCriterion("kh_lx_phone_mobile <>", value, "khLxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneMobileGreaterThan(String value) {
            addCriterion("kh_lx_phone_mobile >", value, "khLxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneMobileGreaterThanOrEqualTo(String value) {
            addCriterion("kh_lx_phone_mobile >=", value, "khLxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneMobileLessThan(String value) {
            addCriterion("kh_lx_phone_mobile <", value, "khLxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneMobileLessThanOrEqualTo(String value) {
            addCriterion("kh_lx_phone_mobile <=", value, "khLxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneMobileLike(String value) {
            addCriterion("kh_lx_phone_mobile like", value, "khLxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneMobileNotLike(String value) {
            addCriterion("kh_lx_phone_mobile not like", value, "khLxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneMobileIn(List<String> values) {
            addCriterion("kh_lx_phone_mobile in", values, "khLxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneMobileNotIn(List<String> values) {
            addCriterion("kh_lx_phone_mobile not in", values, "khLxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneMobileBetween(String value1, String value2) {
            addCriterion("kh_lx_phone_mobile between", value1, value2, "khLxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andKhLxPhoneMobileNotBetween(String value1, String value2) {
            addCriterion("kh_lx_phone_mobile not between", value1, value2, "khLxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andKhYhNumuIsNull() {
            addCriterion("kh_yh_numu is null");
            return (Criteria) this;
        }

        public Criteria andKhYhNumuIsNotNull() {
            addCriterion("kh_yh_numu is not null");
            return (Criteria) this;
        }

        public Criteria andKhYhNumuEqualTo(String value) {
            addCriterion("kh_yh_numu =", value, "khYhNumu");
            return (Criteria) this;
        }

        public Criteria andKhYhNumuNotEqualTo(String value) {
            addCriterion("kh_yh_numu <>", value, "khYhNumu");
            return (Criteria) this;
        }

        public Criteria andKhYhNumuGreaterThan(String value) {
            addCriterion("kh_yh_numu >", value, "khYhNumu");
            return (Criteria) this;
        }

        public Criteria andKhYhNumuGreaterThanOrEqualTo(String value) {
            addCriterion("kh_yh_numu >=", value, "khYhNumu");
            return (Criteria) this;
        }

        public Criteria andKhYhNumuLessThan(String value) {
            addCriterion("kh_yh_numu <", value, "khYhNumu");
            return (Criteria) this;
        }

        public Criteria andKhYhNumuLessThanOrEqualTo(String value) {
            addCriterion("kh_yh_numu <=", value, "khYhNumu");
            return (Criteria) this;
        }

        public Criteria andKhYhNumuLike(String value) {
            addCriterion("kh_yh_numu like", value, "khYhNumu");
            return (Criteria) this;
        }

        public Criteria andKhYhNumuNotLike(String value) {
            addCriterion("kh_yh_numu not like", value, "khYhNumu");
            return (Criteria) this;
        }

        public Criteria andKhYhNumuIn(List<String> values) {
            addCriterion("kh_yh_numu in", values, "khYhNumu");
            return (Criteria) this;
        }

        public Criteria andKhYhNumuNotIn(List<String> values) {
            addCriterion("kh_yh_numu not in", values, "khYhNumu");
            return (Criteria) this;
        }

        public Criteria andKhYhNumuBetween(String value1, String value2) {
            addCriterion("kh_yh_numu between", value1, value2, "khYhNumu");
            return (Criteria) this;
        }

        public Criteria andKhYhNumuNotBetween(String value1, String value2) {
            addCriterion("kh_yh_numu not between", value1, value2, "khYhNumu");
            return (Criteria) this;
        }

        public Criteria andKhYhNumIsNull() {
            addCriterion("kh_yh_num is null");
            return (Criteria) this;
        }

        public Criteria andKhYhNumIsNotNull() {
            addCriterion("kh_yh_num is not null");
            return (Criteria) this;
        }

        public Criteria andKhYhNumEqualTo(Integer value) {
            addCriterion("kh_yh_num =", value, "khYhNum");
            return (Criteria) this;
        }

        public Criteria andKhYhNumNotEqualTo(Integer value) {
            addCriterion("kh_yh_num <>", value, "khYhNum");
            return (Criteria) this;
        }

        public Criteria andKhYhNumGreaterThan(Integer value) {
            addCriterion("kh_yh_num >", value, "khYhNum");
            return (Criteria) this;
        }

        public Criteria andKhYhNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("kh_yh_num >=", value, "khYhNum");
            return (Criteria) this;
        }

        public Criteria andKhYhNumLessThan(Integer value) {
            addCriterion("kh_yh_num <", value, "khYhNum");
            return (Criteria) this;
        }

        public Criteria andKhYhNumLessThanOrEqualTo(Integer value) {
            addCriterion("kh_yh_num <=", value, "khYhNum");
            return (Criteria) this;
        }

        public Criteria andKhYhNumIn(List<Integer> values) {
            addCriterion("kh_yh_num in", values, "khYhNum");
            return (Criteria) this;
        }

        public Criteria andKhYhNumNotIn(List<Integer> values) {
            addCriterion("kh_yh_num not in", values, "khYhNum");
            return (Criteria) this;
        }

        public Criteria andKhYhNumBetween(Integer value1, Integer value2) {
            addCriterion("kh_yh_num between", value1, value2, "khYhNum");
            return (Criteria) this;
        }

        public Criteria andKhYhNumNotBetween(Integer value1, Integer value2) {
            addCriterion("kh_yh_num not between", value1, value2, "khYhNum");
            return (Criteria) this;
        }

        public Criteria andKhXsManIdIsNull() {
            addCriterion("kh_xs_man_id is null");
            return (Criteria) this;
        }

        public Criteria andKhXsManIdIsNotNull() {
            addCriterion("kh_xs_man_id is not null");
            return (Criteria) this;
        }

        public Criteria andKhXsManIdEqualTo(Integer value) {
            addCriterion("kh_xs_man_id =", value, "khXsManId");
            return (Criteria) this;
        }

        public Criteria andKhXsManIdNotEqualTo(Integer value) {
            addCriterion("kh_xs_man_id <>", value, "khXsManId");
            return (Criteria) this;
        }

        public Criteria andKhXsManIdGreaterThan(Integer value) {
            addCriterion("kh_xs_man_id >", value, "khXsManId");
            return (Criteria) this;
        }

        public Criteria andKhXsManIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kh_xs_man_id >=", value, "khXsManId");
            return (Criteria) this;
        }

        public Criteria andKhXsManIdLessThan(Integer value) {
            addCriterion("kh_xs_man_id <", value, "khXsManId");
            return (Criteria) this;
        }

        public Criteria andKhXsManIdLessThanOrEqualTo(Integer value) {
            addCriterion("kh_xs_man_id <=", value, "khXsManId");
            return (Criteria) this;
        }

        public Criteria andKhXsManIdIn(List<Integer> values) {
            addCriterion("kh_xs_man_id in", values, "khXsManId");
            return (Criteria) this;
        }

        public Criteria andKhXsManIdNotIn(List<Integer> values) {
            addCriterion("kh_xs_man_id not in", values, "khXsManId");
            return (Criteria) this;
        }

        public Criteria andKhXsManIdBetween(Integer value1, Integer value2) {
            addCriterion("kh_xs_man_id between", value1, value2, "khXsManId");
            return (Criteria) this;
        }

        public Criteria andKhXsManIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kh_xs_man_id not between", value1, value2, "khXsManId");
            return (Criteria) this;
        }

        public Criteria andKhSwNumsIsNull() {
            addCriterion("kh_sw_nums is null");
            return (Criteria) this;
        }

        public Criteria andKhSwNumsIsNotNull() {
            addCriterion("kh_sw_nums is not null");
            return (Criteria) this;
        }

        public Criteria andKhSwNumsEqualTo(String value) {
            addCriterion("kh_sw_nums =", value, "khSwNums");
            return (Criteria) this;
        }

        public Criteria andKhSwNumsNotEqualTo(String value) {
            addCriterion("kh_sw_nums <>", value, "khSwNums");
            return (Criteria) this;
        }

        public Criteria andKhSwNumsGreaterThan(String value) {
            addCriterion("kh_sw_nums >", value, "khSwNums");
            return (Criteria) this;
        }

        public Criteria andKhSwNumsGreaterThanOrEqualTo(String value) {
            addCriterion("kh_sw_nums >=", value, "khSwNums");
            return (Criteria) this;
        }

        public Criteria andKhSwNumsLessThan(String value) {
            addCriterion("kh_sw_nums <", value, "khSwNums");
            return (Criteria) this;
        }

        public Criteria andKhSwNumsLessThanOrEqualTo(String value) {
            addCriterion("kh_sw_nums <=", value, "khSwNums");
            return (Criteria) this;
        }

        public Criteria andKhSwNumsLike(String value) {
            addCriterion("kh_sw_nums like", value, "khSwNums");
            return (Criteria) this;
        }

        public Criteria andKhSwNumsNotLike(String value) {
            addCriterion("kh_sw_nums not like", value, "khSwNums");
            return (Criteria) this;
        }

        public Criteria andKhSwNumsIn(List<String> values) {
            addCriterion("kh_sw_nums in", values, "khSwNums");
            return (Criteria) this;
        }

        public Criteria andKhSwNumsNotIn(List<String> values) {
            addCriterion("kh_sw_nums not in", values, "khSwNums");
            return (Criteria) this;
        }

        public Criteria andKhSwNumsBetween(String value1, String value2) {
            addCriterion("kh_sw_nums between", value1, value2, "khSwNums");
            return (Criteria) this;
        }

        public Criteria andKhSwNumsNotBetween(String value1, String value2) {
            addCriterion("kh_sw_nums not between", value1, value2, "khSwNums");
            return (Criteria) this;
        }

        public Criteria andKhZbMoneyIsNull() {
            addCriterion("kh_zb_money is null");
            return (Criteria) this;
        }

        public Criteria andKhZbMoneyIsNotNull() {
            addCriterion("kh_zb_money is not null");
            return (Criteria) this;
        }

        public Criteria andKhZbMoneyEqualTo(Double value) {
            addCriterion("kh_zb_money =", value, "khZbMoney");
            return (Criteria) this;
        }

        public Criteria andKhZbMoneyNotEqualTo(Double value) {
            addCriterion("kh_zb_money <>", value, "khZbMoney");
            return (Criteria) this;
        }

        public Criteria andKhZbMoneyGreaterThan(Double value) {
            addCriterion("kh_zb_money >", value, "khZbMoney");
            return (Criteria) this;
        }

        public Criteria andKhZbMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("kh_zb_money >=", value, "khZbMoney");
            return (Criteria) this;
        }

        public Criteria andKhZbMoneyLessThan(Double value) {
            addCriterion("kh_zb_money <", value, "khZbMoney");
            return (Criteria) this;
        }

        public Criteria andKhZbMoneyLessThanOrEqualTo(Double value) {
            addCriterion("kh_zb_money <=", value, "khZbMoney");
            return (Criteria) this;
        }

        public Criteria andKhZbMoneyIn(List<Double> values) {
            addCriterion("kh_zb_money in", values, "khZbMoney");
            return (Criteria) this;
        }

        public Criteria andKhZbMoneyNotIn(List<Double> values) {
            addCriterion("kh_zb_money not in", values, "khZbMoney");
            return (Criteria) this;
        }

        public Criteria andKhZbMoneyBetween(Double value1, Double value2) {
            addCriterion("kh_zb_money between", value1, value2, "khZbMoney");
            return (Criteria) this;
        }

        public Criteria andKhZbMoneyNotBetween(Double value1, Double value2) {
            addCriterion("kh_zb_money not between", value1, value2, "khZbMoney");
            return (Criteria) this;
        }

        public Criteria andKhHyTypeIsNull() {
            addCriterion("kh_hy_type is null");
            return (Criteria) this;
        }

        public Criteria andKhHyTypeIsNotNull() {
            addCriterion("kh_hy_type is not null");
            return (Criteria) this;
        }

        public Criteria andKhHyTypeEqualTo(String value) {
            addCriterion("kh_hy_type =", value, "khHyType");
            return (Criteria) this;
        }

        public Criteria andKhHyTypeNotEqualTo(String value) {
            addCriterion("kh_hy_type <>", value, "khHyType");
            return (Criteria) this;
        }

        public Criteria andKhHyTypeGreaterThan(String value) {
            addCriterion("kh_hy_type >", value, "khHyType");
            return (Criteria) this;
        }

        public Criteria andKhHyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("kh_hy_type >=", value, "khHyType");
            return (Criteria) this;
        }

        public Criteria andKhHyTypeLessThan(String value) {
            addCriterion("kh_hy_type <", value, "khHyType");
            return (Criteria) this;
        }

        public Criteria andKhHyTypeLessThanOrEqualTo(String value) {
            addCriterion("kh_hy_type <=", value, "khHyType");
            return (Criteria) this;
        }

        public Criteria andKhHyTypeLike(String value) {
            addCriterion("kh_hy_type like", value, "khHyType");
            return (Criteria) this;
        }

        public Criteria andKhHyTypeNotLike(String value) {
            addCriterion("kh_hy_type not like", value, "khHyType");
            return (Criteria) this;
        }

        public Criteria andKhHyTypeIn(List<String> values) {
            addCriterion("kh_hy_type in", values, "khHyType");
            return (Criteria) this;
        }

        public Criteria andKhHyTypeNotIn(List<String> values) {
            addCriterion("kh_hy_type not in", values, "khHyType");
            return (Criteria) this;
        }

        public Criteria andKhHyTypeBetween(String value1, String value2) {
            addCriterion("kh_hy_type between", value1, value2, "khHyType");
            return (Criteria) this;
        }

        public Criteria andKhHyTypeNotBetween(String value1, String value2) {
            addCriterion("kh_hy_type not between", value1, value2, "khHyType");
            return (Criteria) this;
        }

        public Criteria andKhEMailIsNull() {
            addCriterion("kh_e_mail is null");
            return (Criteria) this;
        }

        public Criteria andKhEMailIsNotNull() {
            addCriterion("kh_e_mail is not null");
            return (Criteria) this;
        }

        public Criteria andKhEMailEqualTo(String value) {
            addCriterion("kh_e_mail =", value, "khEMail");
            return (Criteria) this;
        }

        public Criteria andKhEMailNotEqualTo(String value) {
            addCriterion("kh_e_mail <>", value, "khEMail");
            return (Criteria) this;
        }

        public Criteria andKhEMailGreaterThan(String value) {
            addCriterion("kh_e_mail >", value, "khEMail");
            return (Criteria) this;
        }

        public Criteria andKhEMailGreaterThanOrEqualTo(String value) {
            addCriterion("kh_e_mail >=", value, "khEMail");
            return (Criteria) this;
        }

        public Criteria andKhEMailLessThan(String value) {
            addCriterion("kh_e_mail <", value, "khEMail");
            return (Criteria) this;
        }

        public Criteria andKhEMailLessThanOrEqualTo(String value) {
            addCriterion("kh_e_mail <=", value, "khEMail");
            return (Criteria) this;
        }

        public Criteria andKhEMailLike(String value) {
            addCriterion("kh_e_mail like", value, "khEMail");
            return (Criteria) this;
        }

        public Criteria andKhEMailNotLike(String value) {
            addCriterion("kh_e_mail not like", value, "khEMail");
            return (Criteria) this;
        }

        public Criteria andKhEMailIn(List<String> values) {
            addCriterion("kh_e_mail in", values, "khEMail");
            return (Criteria) this;
        }

        public Criteria andKhEMailNotIn(List<String> values) {
            addCriterion("kh_e_mail not in", values, "khEMail");
            return (Criteria) this;
        }

        public Criteria andKhEMailBetween(String value1, String value2) {
            addCriterion("kh_e_mail between", value1, value2, "khEMail");
            return (Criteria) this;
        }

        public Criteria andKhEMailNotBetween(String value1, String value2) {
            addCriterion("kh_e_mail not between", value1, value2, "khEMail");
            return (Criteria) this;
        }

        public Criteria andKhIntelAddressIsNull() {
            addCriterion("kh_intel_address is null");
            return (Criteria) this;
        }

        public Criteria andKhIntelAddressIsNotNull() {
            addCriterion("kh_intel_address is not null");
            return (Criteria) this;
        }

        public Criteria andKhIntelAddressEqualTo(String value) {
            addCriterion("kh_intel_address =", value, "khIntelAddress");
            return (Criteria) this;
        }

        public Criteria andKhIntelAddressNotEqualTo(String value) {
            addCriterion("kh_intel_address <>", value, "khIntelAddress");
            return (Criteria) this;
        }

        public Criteria andKhIntelAddressGreaterThan(String value) {
            addCriterion("kh_intel_address >", value, "khIntelAddress");
            return (Criteria) this;
        }

        public Criteria andKhIntelAddressGreaterThanOrEqualTo(String value) {
            addCriterion("kh_intel_address >=", value, "khIntelAddress");
            return (Criteria) this;
        }

        public Criteria andKhIntelAddressLessThan(String value) {
            addCriterion("kh_intel_address <", value, "khIntelAddress");
            return (Criteria) this;
        }

        public Criteria andKhIntelAddressLessThanOrEqualTo(String value) {
            addCriterion("kh_intel_address <=", value, "khIntelAddress");
            return (Criteria) this;
        }

        public Criteria andKhIntelAddressLike(String value) {
            addCriterion("kh_intel_address like", value, "khIntelAddress");
            return (Criteria) this;
        }

        public Criteria andKhIntelAddressNotLike(String value) {
            addCriterion("kh_intel_address not like", value, "khIntelAddress");
            return (Criteria) this;
        }

        public Criteria andKhIntelAddressIn(List<String> values) {
            addCriterion("kh_intel_address in", values, "khIntelAddress");
            return (Criteria) this;
        }

        public Criteria andKhIntelAddressNotIn(List<String> values) {
            addCriterion("kh_intel_address not in", values, "khIntelAddress");
            return (Criteria) this;
        }

        public Criteria andKhIntelAddressBetween(String value1, String value2) {
            addCriterion("kh_intel_address between", value1, value2, "khIntelAddress");
            return (Criteria) this;
        }

        public Criteria andKhIntelAddressNotBetween(String value1, String value2) {
            addCriterion("kh_intel_address not between", value1, value2, "khIntelAddress");
            return (Criteria) this;
        }

        public Criteria andKhCzNumIsNull() {
            addCriterion("kh_cz_num is null");
            return (Criteria) this;
        }

        public Criteria andKhCzNumIsNotNull() {
            addCriterion("kh_cz_num is not null");
            return (Criteria) this;
        }

        public Criteria andKhCzNumEqualTo(String value) {
            addCriterion("kh_cz_num =", value, "khCzNum");
            return (Criteria) this;
        }

        public Criteria andKhCzNumNotEqualTo(String value) {
            addCriterion("kh_cz_num <>", value, "khCzNum");
            return (Criteria) this;
        }

        public Criteria andKhCzNumGreaterThan(String value) {
            addCriterion("kh_cz_num >", value, "khCzNum");
            return (Criteria) this;
        }

        public Criteria andKhCzNumGreaterThanOrEqualTo(String value) {
            addCriterion("kh_cz_num >=", value, "khCzNum");
            return (Criteria) this;
        }

        public Criteria andKhCzNumLessThan(String value) {
            addCriterion("kh_cz_num <", value, "khCzNum");
            return (Criteria) this;
        }

        public Criteria andKhCzNumLessThanOrEqualTo(String value) {
            addCriterion("kh_cz_num <=", value, "khCzNum");
            return (Criteria) this;
        }

        public Criteria andKhCzNumLike(String value) {
            addCriterion("kh_cz_num like", value, "khCzNum");
            return (Criteria) this;
        }

        public Criteria andKhCzNumNotLike(String value) {
            addCriterion("kh_cz_num not like", value, "khCzNum");
            return (Criteria) this;
        }

        public Criteria andKhCzNumIn(List<String> values) {
            addCriterion("kh_cz_num in", values, "khCzNum");
            return (Criteria) this;
        }

        public Criteria andKhCzNumNotIn(List<String> values) {
            addCriterion("kh_cz_num not in", values, "khCzNum");
            return (Criteria) this;
        }

        public Criteria andKhCzNumBetween(String value1, String value2) {
            addCriterion("kh_cz_num between", value1, value2, "khCzNum");
            return (Criteria) this;
        }

        public Criteria andKhCzNumNotBetween(String value1, String value2) {
            addCriterion("kh_cz_num not between", value1, value2, "khCzNum");
            return (Criteria) this;
        }

        public Criteria andKhStartcgRkDateIsNull() {
            addCriterion("kh_startcg_rk_date is null");
            return (Criteria) this;
        }

        public Criteria andKhStartcgRkDateIsNotNull() {
            addCriterion("kh_startcg_rk_date is not null");
            return (Criteria) this;
        }

        public Criteria andKhStartcgRkDateEqualTo(Date value) {
            addCriterionForJDBCDate("kh_startcg_rk_date =", value, "khStartcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgRkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("kh_startcg_rk_date <>", value, "khStartcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgRkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("kh_startcg_rk_date >", value, "khStartcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgRkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("kh_startcg_rk_date >=", value, "khStartcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgRkDateLessThan(Date value) {
            addCriterionForJDBCDate("kh_startcg_rk_date <", value, "khStartcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgRkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("kh_startcg_rk_date <=", value, "khStartcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgRkDateIn(List<Date> values) {
            addCriterionForJDBCDate("kh_startcg_rk_date in", values, "khStartcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgRkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("kh_startcg_rk_date not in", values, "khStartcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgRkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("kh_startcg_rk_date between", value1, value2, "khStartcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgRkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("kh_startcg_rk_date not between", value1, value2, "khStartcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgThDateIsNull() {
            addCriterion("kh_startcg_th_date is null");
            return (Criteria) this;
        }

        public Criteria andKhStartcgThDateIsNotNull() {
            addCriterion("kh_startcg_th_date is not null");
            return (Criteria) this;
        }

        public Criteria andKhStartcgThDateEqualTo(Date value) {
            addCriterionForJDBCDate("kh_startcg_th_date =", value, "khStartcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgThDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("kh_startcg_th_date <>", value, "khStartcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgThDateGreaterThan(Date value) {
            addCriterionForJDBCDate("kh_startcg_th_date >", value, "khStartcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgThDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("kh_startcg_th_date >=", value, "khStartcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgThDateLessThan(Date value) {
            addCriterionForJDBCDate("kh_startcg_th_date <", value, "khStartcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgThDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("kh_startcg_th_date <=", value, "khStartcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgThDateIn(List<Date> values) {
            addCriterionForJDBCDate("kh_startcg_th_date in", values, "khStartcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgThDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("kh_startcg_th_date not in", values, "khStartcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgThDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("kh_startcg_th_date between", value1, value2, "khStartcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhStartcgThDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("kh_startcg_th_date not between", value1, value2, "khStartcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgRkDateIsNull() {
            addCriterion("kh_nearcg_rk_date is null");
            return (Criteria) this;
        }

        public Criteria andKhNearcgRkDateIsNotNull() {
            addCriterion("kh_nearcg_rk_date is not null");
            return (Criteria) this;
        }

        public Criteria andKhNearcgRkDateEqualTo(Date value) {
            addCriterionForJDBCDate("kh_nearcg_rk_date =", value, "khNearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgRkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("kh_nearcg_rk_date <>", value, "khNearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgRkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("kh_nearcg_rk_date >", value, "khNearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgRkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("kh_nearcg_rk_date >=", value, "khNearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgRkDateLessThan(Date value) {
            addCriterionForJDBCDate("kh_nearcg_rk_date <", value, "khNearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgRkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("kh_nearcg_rk_date <=", value, "khNearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgRkDateIn(List<Date> values) {
            addCriterionForJDBCDate("kh_nearcg_rk_date in", values, "khNearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgRkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("kh_nearcg_rk_date not in", values, "khNearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgRkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("kh_nearcg_rk_date between", value1, value2, "khNearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgRkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("kh_nearcg_rk_date not between", value1, value2, "khNearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgThDateIsNull() {
            addCriterion("kh_nearcg_th_date is null");
            return (Criteria) this;
        }

        public Criteria andKhNearcgThDateIsNotNull() {
            addCriterion("kh_nearcg_th_date is not null");
            return (Criteria) this;
        }

        public Criteria andKhNearcgThDateEqualTo(Date value) {
            addCriterionForJDBCDate("kh_nearcg_th_date =", value, "khNearcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgThDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("kh_nearcg_th_date <>", value, "khNearcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgThDateGreaterThan(Date value) {
            addCriterionForJDBCDate("kh_nearcg_th_date >", value, "khNearcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgThDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("kh_nearcg_th_date >=", value, "khNearcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgThDateLessThan(Date value) {
            addCriterionForJDBCDate("kh_nearcg_th_date <", value, "khNearcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgThDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("kh_nearcg_th_date <=", value, "khNearcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgThDateIn(List<Date> values) {
            addCriterionForJDBCDate("kh_nearcg_th_date in", values, "khNearcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgThDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("kh_nearcg_th_date not in", values, "khNearcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgThDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("kh_nearcg_th_date between", value1, value2, "khNearcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhNearcgThDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("kh_nearcg_th_date not between", value1, value2, "khNearcgThDate");
            return (Criteria) this;
        }

        public Criteria andKhPriceHsBlIsNull() {
            addCriterion("kh_price_hs_bl is null");
            return (Criteria) this;
        }

        public Criteria andKhPriceHsBlIsNotNull() {
            addCriterion("kh_price_hs_bl is not null");
            return (Criteria) this;
        }

        public Criteria andKhPriceHsBlEqualTo(Boolean value) {
            addCriterion("kh_price_hs_bl =", value, "khPriceHsBl");
            return (Criteria) this;
        }

        public Criteria andKhPriceHsBlNotEqualTo(Boolean value) {
            addCriterion("kh_price_hs_bl <>", value, "khPriceHsBl");
            return (Criteria) this;
        }

        public Criteria andKhPriceHsBlGreaterThan(Boolean value) {
            addCriterion("kh_price_hs_bl >", value, "khPriceHsBl");
            return (Criteria) this;
        }

        public Criteria andKhPriceHsBlGreaterThanOrEqualTo(Boolean value) {
            addCriterion("kh_price_hs_bl >=", value, "khPriceHsBl");
            return (Criteria) this;
        }

        public Criteria andKhPriceHsBlLessThan(Boolean value) {
            addCriterion("kh_price_hs_bl <", value, "khPriceHsBl");
            return (Criteria) this;
        }

        public Criteria andKhPriceHsBlLessThanOrEqualTo(Boolean value) {
            addCriterion("kh_price_hs_bl <=", value, "khPriceHsBl");
            return (Criteria) this;
        }

        public Criteria andKhPriceHsBlIn(List<Boolean> values) {
            addCriterion("kh_price_hs_bl in", values, "khPriceHsBl");
            return (Criteria) this;
        }

        public Criteria andKhPriceHsBlNotIn(List<Boolean> values) {
            addCriterion("kh_price_hs_bl not in", values, "khPriceHsBl");
            return (Criteria) this;
        }

        public Criteria andKhPriceHsBlBetween(Boolean value1, Boolean value2) {
            addCriterion("kh_price_hs_bl between", value1, value2, "khPriceHsBl");
            return (Criteria) this;
        }

        public Criteria andKhPriceHsBlNotBetween(Boolean value1, Boolean value2) {
            addCriterion("kh_price_hs_bl not between", value1, value2, "khPriceHsBl");
            return (Criteria) this;
        }

        public Criteria andKhEndJyDateIsNull() {
            addCriterion("kh_end_jy_date is null");
            return (Criteria) this;
        }

        public Criteria andKhEndJyDateIsNotNull() {
            addCriterion("kh_end_jy_date is not null");
            return (Criteria) this;
        }

        public Criteria andKhEndJyDateEqualTo(Date value) {
            addCriterionForJDBCDate("kh_end_jy_date =", value, "khEndJyDate");
            return (Criteria) this;
        }

        public Criteria andKhEndJyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("kh_end_jy_date <>", value, "khEndJyDate");
            return (Criteria) this;
        }

        public Criteria andKhEndJyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("kh_end_jy_date >", value, "khEndJyDate");
            return (Criteria) this;
        }

        public Criteria andKhEndJyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("kh_end_jy_date >=", value, "khEndJyDate");
            return (Criteria) this;
        }

        public Criteria andKhEndJyDateLessThan(Date value) {
            addCriterionForJDBCDate("kh_end_jy_date <", value, "khEndJyDate");
            return (Criteria) this;
        }

        public Criteria andKhEndJyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("kh_end_jy_date <=", value, "khEndJyDate");
            return (Criteria) this;
        }

        public Criteria andKhEndJyDateIn(List<Date> values) {
            addCriterionForJDBCDate("kh_end_jy_date in", values, "khEndJyDate");
            return (Criteria) this;
        }

        public Criteria andKhEndJyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("kh_end_jy_date not in", values, "khEndJyDate");
            return (Criteria) this;
        }

        public Criteria andKhEndJyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("kh_end_jy_date between", value1, value2, "khEndJyDate");
            return (Criteria) this;
        }

        public Criteria andKhEndJyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("kh_end_jy_date not between", value1, value2, "khEndJyDate");
            return (Criteria) this;
        }

        public Criteria andKhZkTotalmoneyIsNull() {
            addCriterion("kh_zk_totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andKhZkTotalmoneyIsNotNull() {
            addCriterion("kh_zk_totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andKhZkTotalmoneyEqualTo(Double value) {
            addCriterion("kh_zk_totalmoney =", value, "khZkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andKhZkTotalmoneyNotEqualTo(Double value) {
            addCriterion("kh_zk_totalmoney <>", value, "khZkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andKhZkTotalmoneyGreaterThan(Double value) {
            addCriterion("kh_zk_totalmoney >", value, "khZkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andKhZkTotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("kh_zk_totalmoney >=", value, "khZkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andKhZkTotalmoneyLessThan(Double value) {
            addCriterion("kh_zk_totalmoney <", value, "khZkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andKhZkTotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("kh_zk_totalmoney <=", value, "khZkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andKhZkTotalmoneyIn(List<Double> values) {
            addCriterion("kh_zk_totalmoney in", values, "khZkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andKhZkTotalmoneyNotIn(List<Double> values) {
            addCriterion("kh_zk_totalmoney not in", values, "khZkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andKhZkTotalmoneyBetween(Double value1, Double value2) {
            addCriterion("kh_zk_totalmoney between", value1, value2, "khZkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andKhZkTotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("kh_zk_totalmoney not between", value1, value2, "khZkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andKhSyMoneyIsNull() {
            addCriterion("kh_sy_money is null");
            return (Criteria) this;
        }

        public Criteria andKhSyMoneyIsNotNull() {
            addCriterion("kh_sy_money is not null");
            return (Criteria) this;
        }

        public Criteria andKhSyMoneyEqualTo(Double value) {
            addCriterion("kh_sy_money =", value, "khSyMoney");
            return (Criteria) this;
        }

        public Criteria andKhSyMoneyNotEqualTo(Double value) {
            addCriterion("kh_sy_money <>", value, "khSyMoney");
            return (Criteria) this;
        }

        public Criteria andKhSyMoneyGreaterThan(Double value) {
            addCriterion("kh_sy_money >", value, "khSyMoney");
            return (Criteria) this;
        }

        public Criteria andKhSyMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("kh_sy_money >=", value, "khSyMoney");
            return (Criteria) this;
        }

        public Criteria andKhSyMoneyLessThan(Double value) {
            addCriterion("kh_sy_money <", value, "khSyMoney");
            return (Criteria) this;
        }

        public Criteria andKhSyMoneyLessThanOrEqualTo(Double value) {
            addCriterion("kh_sy_money <=", value, "khSyMoney");
            return (Criteria) this;
        }

        public Criteria andKhSyMoneyIn(List<Double> values) {
            addCriterion("kh_sy_money in", values, "khSyMoney");
            return (Criteria) this;
        }

        public Criteria andKhSyMoneyNotIn(List<Double> values) {
            addCriterion("kh_sy_money not in", values, "khSyMoney");
            return (Criteria) this;
        }

        public Criteria andKhSyMoneyBetween(Double value1, Double value2) {
            addCriterion("kh_sy_money between", value1, value2, "khSyMoney");
            return (Criteria) this;
        }

        public Criteria andKhSyMoneyNotBetween(Double value1, Double value2) {
            addCriterion("kh_sy_money not between", value1, value2, "khSyMoney");
            return (Criteria) this;
        }

        public Criteria andKhFkWhereIsNull() {
            addCriterion("kh_fk_where is null");
            return (Criteria) this;
        }

        public Criteria andKhFkWhereIsNotNull() {
            addCriterion("kh_fk_where is not null");
            return (Criteria) this;
        }

        public Criteria andKhFkWhereEqualTo(Integer value) {
            addCriterion("kh_fk_where =", value, "khFkWhere");
            return (Criteria) this;
        }

        public Criteria andKhFkWhereNotEqualTo(Integer value) {
            addCriterion("kh_fk_where <>", value, "khFkWhere");
            return (Criteria) this;
        }

        public Criteria andKhFkWhereGreaterThan(Integer value) {
            addCriterion("kh_fk_where >", value, "khFkWhere");
            return (Criteria) this;
        }

        public Criteria andKhFkWhereGreaterThanOrEqualTo(Integer value) {
            addCriterion("kh_fk_where >=", value, "khFkWhere");
            return (Criteria) this;
        }

        public Criteria andKhFkWhereLessThan(Integer value) {
            addCriterion("kh_fk_where <", value, "khFkWhere");
            return (Criteria) this;
        }

        public Criteria andKhFkWhereLessThanOrEqualTo(Integer value) {
            addCriterion("kh_fk_where <=", value, "khFkWhere");
            return (Criteria) this;
        }

        public Criteria andKhFkWhereIn(List<Integer> values) {
            addCriterion("kh_fk_where in", values, "khFkWhere");
            return (Criteria) this;
        }

        public Criteria andKhFkWhereNotIn(List<Integer> values) {
            addCriterion("kh_fk_where not in", values, "khFkWhere");
            return (Criteria) this;
        }

        public Criteria andKhFkWhereBetween(Integer value1, Integer value2) {
            addCriterion("kh_fk_where between", value1, value2, "khFkWhere");
            return (Criteria) this;
        }

        public Criteria andKhFkWhereNotBetween(Integer value1, Integer value2) {
            addCriterion("kh_fk_where not between", value1, value2, "khFkWhere");
            return (Criteria) this;
        }

        public Criteria andKhWhereDayIsNull() {
            addCriterion("kh_where_day is null");
            return (Criteria) this;
        }

        public Criteria andKhWhereDayIsNotNull() {
            addCriterion("kh_where_day is not null");
            return (Criteria) this;
        }

        public Criteria andKhWhereDayEqualTo(Integer value) {
            addCriterion("kh_where_day =", value, "khWhereDay");
            return (Criteria) this;
        }

        public Criteria andKhWhereDayNotEqualTo(Integer value) {
            addCriterion("kh_where_day <>", value, "khWhereDay");
            return (Criteria) this;
        }

        public Criteria andKhWhereDayGreaterThan(Integer value) {
            addCriterion("kh_where_day >", value, "khWhereDay");
            return (Criteria) this;
        }

        public Criteria andKhWhereDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("kh_where_day >=", value, "khWhereDay");
            return (Criteria) this;
        }

        public Criteria andKhWhereDayLessThan(Integer value) {
            addCriterion("kh_where_day <", value, "khWhereDay");
            return (Criteria) this;
        }

        public Criteria andKhWhereDayLessThanOrEqualTo(Integer value) {
            addCriterion("kh_where_day <=", value, "khWhereDay");
            return (Criteria) this;
        }

        public Criteria andKhWhereDayIn(List<Integer> values) {
            addCriterion("kh_where_day in", values, "khWhereDay");
            return (Criteria) this;
        }

        public Criteria andKhWhereDayNotIn(List<Integer> values) {
            addCriterion("kh_where_day not in", values, "khWhereDay");
            return (Criteria) this;
        }

        public Criteria andKhWhereDayBetween(Integer value1, Integer value2) {
            addCriterion("kh_where_day between", value1, value2, "khWhereDay");
            return (Criteria) this;
        }

        public Criteria andKhWhereDayNotBetween(Integer value1, Integer value2) {
            addCriterion("kh_where_day not between", value1, value2, "khWhereDay");
            return (Criteria) this;
        }

        public Criteria andKhMonthJzDateIsNull() {
            addCriterion("kh_month_jz_date is null");
            return (Criteria) this;
        }

        public Criteria andKhMonthJzDateIsNotNull() {
            addCriterion("kh_month_jz_date is not null");
            return (Criteria) this;
        }

        public Criteria andKhMonthJzDateEqualTo(Date value) {
            addCriterionForJDBCDate("kh_month_jz_date =", value, "khMonthJzDate");
            return (Criteria) this;
        }

        public Criteria andKhMonthJzDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("kh_month_jz_date <>", value, "khMonthJzDate");
            return (Criteria) this;
        }

        public Criteria andKhMonthJzDateGreaterThan(Date value) {
            addCriterionForJDBCDate("kh_month_jz_date >", value, "khMonthJzDate");
            return (Criteria) this;
        }

        public Criteria andKhMonthJzDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("kh_month_jz_date >=", value, "khMonthJzDate");
            return (Criteria) this;
        }

        public Criteria andKhMonthJzDateLessThan(Date value) {
            addCriterionForJDBCDate("kh_month_jz_date <", value, "khMonthJzDate");
            return (Criteria) this;
        }

        public Criteria andKhMonthJzDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("kh_month_jz_date <=", value, "khMonthJzDate");
            return (Criteria) this;
        }

        public Criteria andKhMonthJzDateIn(List<Date> values) {
            addCriterionForJDBCDate("kh_month_jz_date in", values, "khMonthJzDate");
            return (Criteria) this;
        }

        public Criteria andKhMonthJzDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("kh_month_jz_date not in", values, "khMonthJzDate");
            return (Criteria) this;
        }

        public Criteria andKhMonthJzDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("kh_month_jz_date between", value1, value2, "khMonthJzDate");
            return (Criteria) this;
        }

        public Criteria andKhMonthJzDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("kh_month_jz_date not between", value1, value2, "khMonthJzDate");
            return (Criteria) this;
        }

        public Criteria andKhXyLevelIsNull() {
            addCriterion("kh_xy_level is null");
            return (Criteria) this;
        }

        public Criteria andKhXyLevelIsNotNull() {
            addCriterion("kh_xy_level is not null");
            return (Criteria) this;
        }

        public Criteria andKhXyLevelEqualTo(Integer value) {
            addCriterion("kh_xy_level =", value, "khXyLevel");
            return (Criteria) this;
        }

        public Criteria andKhXyLevelNotEqualTo(Integer value) {
            addCriterion("kh_xy_level <>", value, "khXyLevel");
            return (Criteria) this;
        }

        public Criteria andKhXyLevelGreaterThan(Integer value) {
            addCriterion("kh_xy_level >", value, "khXyLevel");
            return (Criteria) this;
        }

        public Criteria andKhXyLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("kh_xy_level >=", value, "khXyLevel");
            return (Criteria) this;
        }

        public Criteria andKhXyLevelLessThan(Integer value) {
            addCriterion("kh_xy_level <", value, "khXyLevel");
            return (Criteria) this;
        }

        public Criteria andKhXyLevelLessThanOrEqualTo(Integer value) {
            addCriterion("kh_xy_level <=", value, "khXyLevel");
            return (Criteria) this;
        }

        public Criteria andKhXyLevelIn(List<Integer> values) {
            addCriterion("kh_xy_level in", values, "khXyLevel");
            return (Criteria) this;
        }

        public Criteria andKhXyLevelNotIn(List<Integer> values) {
            addCriterion("kh_xy_level not in", values, "khXyLevel");
            return (Criteria) this;
        }

        public Criteria andKhXyLevelBetween(Integer value1, Integer value2) {
            addCriterion("kh_xy_level between", value1, value2, "khXyLevel");
            return (Criteria) this;
        }

        public Criteria andKhXyLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("kh_xy_level not between", value1, value2, "khXyLevel");
            return (Criteria) this;
        }

        public Criteria andKhFpTypeidIsNull() {
            addCriterion("kh_fp_typeid is null");
            return (Criteria) this;
        }

        public Criteria andKhFpTypeidIsNotNull() {
            addCriterion("kh_fp_typeid is not null");
            return (Criteria) this;
        }

        public Criteria andKhFpTypeidEqualTo(Integer value) {
            addCriterion("kh_fp_typeid =", value, "khFpTypeid");
            return (Criteria) this;
        }

        public Criteria andKhFpTypeidNotEqualTo(Integer value) {
            addCriterion("kh_fp_typeid <>", value, "khFpTypeid");
            return (Criteria) this;
        }

        public Criteria andKhFpTypeidGreaterThan(Integer value) {
            addCriterion("kh_fp_typeid >", value, "khFpTypeid");
            return (Criteria) this;
        }

        public Criteria andKhFpTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kh_fp_typeid >=", value, "khFpTypeid");
            return (Criteria) this;
        }

        public Criteria andKhFpTypeidLessThan(Integer value) {
            addCriterion("kh_fp_typeid <", value, "khFpTypeid");
            return (Criteria) this;
        }

        public Criteria andKhFpTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("kh_fp_typeid <=", value, "khFpTypeid");
            return (Criteria) this;
        }

        public Criteria andKhFpTypeidIn(List<Integer> values) {
            addCriterion("kh_fp_typeid in", values, "khFpTypeid");
            return (Criteria) this;
        }

        public Criteria andKhFpTypeidNotIn(List<Integer> values) {
            addCriterion("kh_fp_typeid not in", values, "khFpTypeid");
            return (Criteria) this;
        }

        public Criteria andKhFpTypeidBetween(Integer value1, Integer value2) {
            addCriterion("kh_fp_typeid between", value1, value2, "khFpTypeid");
            return (Criteria) this;
        }

        public Criteria andKhFpTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("kh_fp_typeid not between", value1, value2, "khFpTypeid");
            return (Criteria) this;
        }

        public Criteria andKhStartYinfMoneyIsNull() {
            addCriterion("kh_start_yinf_money is null");
            return (Criteria) this;
        }

        public Criteria andKhStartYinfMoneyIsNotNull() {
            addCriterion("kh_start_yinf_money is not null");
            return (Criteria) this;
        }

        public Criteria andKhStartYinfMoneyEqualTo(Double value) {
            addCriterion("kh_start_yinf_money =", value, "khStartYinfMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYinfMoneyNotEqualTo(Double value) {
            addCriterion("kh_start_yinf_money <>", value, "khStartYinfMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYinfMoneyGreaterThan(Double value) {
            addCriterion("kh_start_yinf_money >", value, "khStartYinfMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYinfMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("kh_start_yinf_money >=", value, "khStartYinfMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYinfMoneyLessThan(Double value) {
            addCriterion("kh_start_yinf_money <", value, "khStartYinfMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYinfMoneyLessThanOrEqualTo(Double value) {
            addCriterion("kh_start_yinf_money <=", value, "khStartYinfMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYinfMoneyIn(List<Double> values) {
            addCriterion("kh_start_yinf_money in", values, "khStartYinfMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYinfMoneyNotIn(List<Double> values) {
            addCriterion("kh_start_yinf_money not in", values, "khStartYinfMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYinfMoneyBetween(Double value1, Double value2) {
            addCriterion("kh_start_yinf_money between", value1, value2, "khStartYinfMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYinfMoneyNotBetween(Double value1, Double value2) {
            addCriterion("kh_start_yinf_money not between", value1, value2, "khStartYinfMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYufMoneyIsNull() {
            addCriterion("kh_start_yuf_money is null");
            return (Criteria) this;
        }

        public Criteria andKhStartYufMoneyIsNotNull() {
            addCriterion("kh_start_yuf_money is not null");
            return (Criteria) this;
        }

        public Criteria andKhStartYufMoneyEqualTo(Double value) {
            addCriterion("kh_start_yuf_money =", value, "khStartYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYufMoneyNotEqualTo(Double value) {
            addCriterion("kh_start_yuf_money <>", value, "khStartYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYufMoneyGreaterThan(Double value) {
            addCriterion("kh_start_yuf_money >", value, "khStartYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYufMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("kh_start_yuf_money >=", value, "khStartYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYufMoneyLessThan(Double value) {
            addCriterion("kh_start_yuf_money <", value, "khStartYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYufMoneyLessThanOrEqualTo(Double value) {
            addCriterion("kh_start_yuf_money <=", value, "khStartYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYufMoneyIn(List<Double> values) {
            addCriterion("kh_start_yuf_money in", values, "khStartYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYufMoneyNotIn(List<Double> values) {
            addCriterion("kh_start_yuf_money not in", values, "khStartYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYufMoneyBetween(Double value1, Double value2) {
            addCriterion("kh_start_yuf_money between", value1, value2, "khStartYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhStartYufMoneyNotBetween(Double value1, Double value2) {
            addCriterion("kh_start_yuf_money not between", value1, value2, "khStartYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhLastYufMoneyIsNull() {
            addCriterion("kh_last_yuf_money is null");
            return (Criteria) this;
        }

        public Criteria andKhLastYufMoneyIsNotNull() {
            addCriterion("kh_last_yuf_money is not null");
            return (Criteria) this;
        }

        public Criteria andKhLastYufMoneyEqualTo(Double value) {
            addCriterion("kh_last_yuf_money =", value, "khLastYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhLastYufMoneyNotEqualTo(Double value) {
            addCriterion("kh_last_yuf_money <>", value, "khLastYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhLastYufMoneyGreaterThan(Double value) {
            addCriterion("kh_last_yuf_money >", value, "khLastYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhLastYufMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("kh_last_yuf_money >=", value, "khLastYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhLastYufMoneyLessThan(Double value) {
            addCriterion("kh_last_yuf_money <", value, "khLastYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhLastYufMoneyLessThanOrEqualTo(Double value) {
            addCriterion("kh_last_yuf_money <=", value, "khLastYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhLastYufMoneyIn(List<Double> values) {
            addCriterion("kh_last_yuf_money in", values, "khLastYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhLastYufMoneyNotIn(List<Double> values) {
            addCriterion("kh_last_yuf_money not in", values, "khLastYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhLastYufMoneyBetween(Double value1, Double value2) {
            addCriterion("kh_last_yuf_money between", value1, value2, "khLastYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhLastYufMoneyNotBetween(Double value1, Double value2) {
            addCriterion("kh_last_yuf_money not between", value1, value2, "khLastYufMoney");
            return (Criteria) this;
        }

        public Criteria andKhLastYinfMonetIsNull() {
            addCriterion("kh_last_yinf_monet is null");
            return (Criteria) this;
        }

        public Criteria andKhLastYinfMonetIsNotNull() {
            addCriterion("kh_last_yinf_monet is not null");
            return (Criteria) this;
        }

        public Criteria andKhLastYinfMonetEqualTo(Double value) {
            addCriterion("kh_last_yinf_monet =", value, "khLastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andKhLastYinfMonetNotEqualTo(Double value) {
            addCriterion("kh_last_yinf_monet <>", value, "khLastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andKhLastYinfMonetGreaterThan(Double value) {
            addCriterion("kh_last_yinf_monet >", value, "khLastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andKhLastYinfMonetGreaterThanOrEqualTo(Double value) {
            addCriterion("kh_last_yinf_monet >=", value, "khLastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andKhLastYinfMonetLessThan(Double value) {
            addCriterion("kh_last_yinf_monet <", value, "khLastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andKhLastYinfMonetLessThanOrEqualTo(Double value) {
            addCriterion("kh_last_yinf_monet <=", value, "khLastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andKhLastYinfMonetIn(List<Double> values) {
            addCriterion("kh_last_yinf_monet in", values, "khLastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andKhLastYinfMonetNotIn(List<Double> values) {
            addCriterion("kh_last_yinf_monet not in", values, "khLastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andKhLastYinfMonetBetween(Double value1, Double value2) {
            addCriterion("kh_last_yinf_monet between", value1, value2, "khLastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andKhLastYinfMonetNotBetween(Double value1, Double value2) {
            addCriterion("kh_last_yinf_monet not between", value1, value2, "khLastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andKhYufzkSubjectidIsNull() {
            addCriterion("kh_yufzk_subjectid is null");
            return (Criteria) this;
        }

        public Criteria andKhYufzkSubjectidIsNotNull() {
            addCriterion("kh_yufzk_subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andKhYufzkSubjectidEqualTo(Integer value) {
            addCriterion("kh_yufzk_subjectid =", value, "khYufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYufzkSubjectidNotEqualTo(Integer value) {
            addCriterion("kh_yufzk_subjectid <>", value, "khYufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYufzkSubjectidGreaterThan(Integer value) {
            addCriterion("kh_yufzk_subjectid >", value, "khYufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYufzkSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kh_yufzk_subjectid >=", value, "khYufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYufzkSubjectidLessThan(Integer value) {
            addCriterion("kh_yufzk_subjectid <", value, "khYufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYufzkSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("kh_yufzk_subjectid <=", value, "khYufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYufzkSubjectidIn(List<Integer> values) {
            addCriterion("kh_yufzk_subjectid in", values, "khYufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYufzkSubjectidNotIn(List<Integer> values) {
            addCriterion("kh_yufzk_subjectid not in", values, "khYufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYufzkSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("kh_yufzk_subjectid between", value1, value2, "khYufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYufzkSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("kh_yufzk_subjectid not between", value1, value2, "khYufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzkSubjectidIsNull() {
            addCriterion("kh_yinfzk_subjectid is null");
            return (Criteria) this;
        }

        public Criteria andKhYinfzkSubjectidIsNotNull() {
            addCriterion("kh_yinfzk_subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andKhYinfzkSubjectidEqualTo(Integer value) {
            addCriterion("kh_yinfzk_subjectid =", value, "khYinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzkSubjectidNotEqualTo(Integer value) {
            addCriterion("kh_yinfzk_subjectid <>", value, "khYinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzkSubjectidGreaterThan(Integer value) {
            addCriterion("kh_yinfzk_subjectid >", value, "khYinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzkSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kh_yinfzk_subjectid >=", value, "khYinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzkSubjectidLessThan(Integer value) {
            addCriterion("kh_yinfzk_subjectid <", value, "khYinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzkSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("kh_yinfzk_subjectid <=", value, "khYinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzkSubjectidIn(List<Integer> values) {
            addCriterion("kh_yinfzk_subjectid in", values, "khYinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzkSubjectidNotIn(List<Integer> values) {
            addCriterion("kh_yinfzk_subjectid not in", values, "khYinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzkSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("kh_yinfzk_subjectid between", value1, value2, "khYinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzkSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("kh_yinfzk_subjectid not between", value1, value2, "khYinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzgSubjectidIsNull() {
            addCriterion("kh_yinfzg_subjectid is null");
            return (Criteria) this;
        }

        public Criteria andKhYinfzgSubjectidIsNotNull() {
            addCriterion("kh_yinfzg_subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andKhYinfzgSubjectidEqualTo(Integer value) {
            addCriterion("kh_yinfzg_subjectid =", value, "khYinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzgSubjectidNotEqualTo(Integer value) {
            addCriterion("kh_yinfzg_subjectid <>", value, "khYinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzgSubjectidGreaterThan(Integer value) {
            addCriterion("kh_yinfzg_subjectid >", value, "khYinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzgSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kh_yinfzg_subjectid >=", value, "khYinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzgSubjectidLessThan(Integer value) {
            addCriterion("kh_yinfzg_subjectid <", value, "khYinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzgSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("kh_yinfzg_subjectid <=", value, "khYinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzgSubjectidIn(List<Integer> values) {
            addCriterion("kh_yinfzg_subjectid in", values, "khYinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzgSubjectidNotIn(List<Integer> values) {
            addCriterion("kh_yinfzg_subjectid not in", values, "khYinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzgSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("kh_yinfzg_subjectid between", value1, value2, "khYinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhYinfzgSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("kh_yinfzg_subjectid not between", value1, value2, "khYinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andKhRemarkIsNull() {
            addCriterion("kh_remark is null");
            return (Criteria) this;
        }

        public Criteria andKhRemarkIsNotNull() {
            addCriterion("kh_remark is not null");
            return (Criteria) this;
        }

        public Criteria andKhRemarkEqualTo(String value) {
            addCriterion("kh_remark =", value, "khRemark");
            return (Criteria) this;
        }

        public Criteria andKhRemarkNotEqualTo(String value) {
            addCriterion("kh_remark <>", value, "khRemark");
            return (Criteria) this;
        }

        public Criteria andKhRemarkGreaterThan(String value) {
            addCriterion("kh_remark >", value, "khRemark");
            return (Criteria) this;
        }

        public Criteria andKhRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("kh_remark >=", value, "khRemark");
            return (Criteria) this;
        }

        public Criteria andKhRemarkLessThan(String value) {
            addCriterion("kh_remark <", value, "khRemark");
            return (Criteria) this;
        }

        public Criteria andKhRemarkLessThanOrEqualTo(String value) {
            addCriterion("kh_remark <=", value, "khRemark");
            return (Criteria) this;
        }

        public Criteria andKhRemarkLike(String value) {
            addCriterion("kh_remark like", value, "khRemark");
            return (Criteria) this;
        }

        public Criteria andKhRemarkNotLike(String value) {
            addCriterion("kh_remark not like", value, "khRemark");
            return (Criteria) this;
        }

        public Criteria andKhRemarkIn(List<String> values) {
            addCriterion("kh_remark in", values, "khRemark");
            return (Criteria) this;
        }

        public Criteria andKhRemarkNotIn(List<String> values) {
            addCriterion("kh_remark not in", values, "khRemark");
            return (Criteria) this;
        }

        public Criteria andKhRemarkBetween(String value1, String value2) {
            addCriterion("kh_remark between", value1, value2, "khRemark");
            return (Criteria) this;
        }

        public Criteria andKhRemarkNotBetween(String value1, String value2) {
            addCriterion("kh_remark not between", value1, value2, "khRemark");
            return (Criteria) this;
        }

        public Criteria andKhBz1IsNull() {
            addCriterion("kh_Bz1 is null");
            return (Criteria) this;
        }

        public Criteria andKhBz1IsNotNull() {
            addCriterion("kh_Bz1 is not null");
            return (Criteria) this;
        }

        public Criteria andKhBz1EqualTo(String value) {
            addCriterion("kh_Bz1 =", value, "khBz1");
            return (Criteria) this;
        }

        public Criteria andKhBz1NotEqualTo(String value) {
            addCriterion("kh_Bz1 <>", value, "khBz1");
            return (Criteria) this;
        }

        public Criteria andKhBz1GreaterThan(String value) {
            addCriterion("kh_Bz1 >", value, "khBz1");
            return (Criteria) this;
        }

        public Criteria andKhBz1GreaterThanOrEqualTo(String value) {
            addCriterion("kh_Bz1 >=", value, "khBz1");
            return (Criteria) this;
        }

        public Criteria andKhBz1LessThan(String value) {
            addCriterion("kh_Bz1 <", value, "khBz1");
            return (Criteria) this;
        }

        public Criteria andKhBz1LessThanOrEqualTo(String value) {
            addCriterion("kh_Bz1 <=", value, "khBz1");
            return (Criteria) this;
        }

        public Criteria andKhBz1Like(String value) {
            addCriterion("kh_Bz1 like", value, "khBz1");
            return (Criteria) this;
        }

        public Criteria andKhBz1NotLike(String value) {
            addCriterion("kh_Bz1 not like", value, "khBz1");
            return (Criteria) this;
        }

        public Criteria andKhBz1In(List<String> values) {
            addCriterion("kh_Bz1 in", values, "khBz1");
            return (Criteria) this;
        }

        public Criteria andKhBz1NotIn(List<String> values) {
            addCriterion("kh_Bz1 not in", values, "khBz1");
            return (Criteria) this;
        }

        public Criteria andKhBz1Between(String value1, String value2) {
            addCriterion("kh_Bz1 between", value1, value2, "khBz1");
            return (Criteria) this;
        }

        public Criteria andKhBz1NotBetween(String value1, String value2) {
            addCriterion("kh_Bz1 not between", value1, value2, "khBz1");
            return (Criteria) this;
        }

        public Criteria andKhBz2IsNull() {
            addCriterion("kh_Bz2 is null");
            return (Criteria) this;
        }

        public Criteria andKhBz2IsNotNull() {
            addCriterion("kh_Bz2 is not null");
            return (Criteria) this;
        }

        public Criteria andKhBz2EqualTo(String value) {
            addCriterion("kh_Bz2 =", value, "khBz2");
            return (Criteria) this;
        }

        public Criteria andKhBz2NotEqualTo(String value) {
            addCriterion("kh_Bz2 <>", value, "khBz2");
            return (Criteria) this;
        }

        public Criteria andKhBz2GreaterThan(String value) {
            addCriterion("kh_Bz2 >", value, "khBz2");
            return (Criteria) this;
        }

        public Criteria andKhBz2GreaterThanOrEqualTo(String value) {
            addCriterion("kh_Bz2 >=", value, "khBz2");
            return (Criteria) this;
        }

        public Criteria andKhBz2LessThan(String value) {
            addCriterion("kh_Bz2 <", value, "khBz2");
            return (Criteria) this;
        }

        public Criteria andKhBz2LessThanOrEqualTo(String value) {
            addCriterion("kh_Bz2 <=", value, "khBz2");
            return (Criteria) this;
        }

        public Criteria andKhBz2Like(String value) {
            addCriterion("kh_Bz2 like", value, "khBz2");
            return (Criteria) this;
        }

        public Criteria andKhBz2NotLike(String value) {
            addCriterion("kh_Bz2 not like", value, "khBz2");
            return (Criteria) this;
        }

        public Criteria andKhBz2In(List<String> values) {
            addCriterion("kh_Bz2 in", values, "khBz2");
            return (Criteria) this;
        }

        public Criteria andKhBz2NotIn(List<String> values) {
            addCriterion("kh_Bz2 not in", values, "khBz2");
            return (Criteria) this;
        }

        public Criteria andKhBz2Between(String value1, String value2) {
            addCriterion("kh_Bz2 between", value1, value2, "khBz2");
            return (Criteria) this;
        }

        public Criteria andKhBz2NotBetween(String value1, String value2) {
            addCriterion("kh_Bz2 not between", value1, value2, "khBz2");
            return (Criteria) this;
        }

        public Criteria andKhBz3IsNull() {
            addCriterion("kh_Bz3 is null");
            return (Criteria) this;
        }

        public Criteria andKhBz3IsNotNull() {
            addCriterion("kh_Bz3 is not null");
            return (Criteria) this;
        }

        public Criteria andKhBz3EqualTo(String value) {
            addCriterion("kh_Bz3 =", value, "khBz3");
            return (Criteria) this;
        }

        public Criteria andKhBz3NotEqualTo(String value) {
            addCriterion("kh_Bz3 <>", value, "khBz3");
            return (Criteria) this;
        }

        public Criteria andKhBz3GreaterThan(String value) {
            addCriterion("kh_Bz3 >", value, "khBz3");
            return (Criteria) this;
        }

        public Criteria andKhBz3GreaterThanOrEqualTo(String value) {
            addCriterion("kh_Bz3 >=", value, "khBz3");
            return (Criteria) this;
        }

        public Criteria andKhBz3LessThan(String value) {
            addCriterion("kh_Bz3 <", value, "khBz3");
            return (Criteria) this;
        }

        public Criteria andKhBz3LessThanOrEqualTo(String value) {
            addCriterion("kh_Bz3 <=", value, "khBz3");
            return (Criteria) this;
        }

        public Criteria andKhBz3Like(String value) {
            addCriterion("kh_Bz3 like", value, "khBz3");
            return (Criteria) this;
        }

        public Criteria andKhBz3NotLike(String value) {
            addCriterion("kh_Bz3 not like", value, "khBz3");
            return (Criteria) this;
        }

        public Criteria andKhBz3In(List<String> values) {
            addCriterion("kh_Bz3 in", values, "khBz3");
            return (Criteria) this;
        }

        public Criteria andKhBz3NotIn(List<String> values) {
            addCriterion("kh_Bz3 not in", values, "khBz3");
            return (Criteria) this;
        }

        public Criteria andKhBz3Between(String value1, String value2) {
            addCriterion("kh_Bz3 between", value1, value2, "khBz3");
            return (Criteria) this;
        }

        public Criteria andKhBz3NotBetween(String value1, String value2) {
            addCriterion("kh_Bz3 not between", value1, value2, "khBz3");
            return (Criteria) this;
        }

        public Criteria andKhBz4IsNull() {
            addCriterion("kh_Bz4 is null");
            return (Criteria) this;
        }

        public Criteria andKhBz4IsNotNull() {
            addCriterion("kh_Bz4 is not null");
            return (Criteria) this;
        }

        public Criteria andKhBz4EqualTo(String value) {
            addCriterion("kh_Bz4 =", value, "khBz4");
            return (Criteria) this;
        }

        public Criteria andKhBz4NotEqualTo(String value) {
            addCriterion("kh_Bz4 <>", value, "khBz4");
            return (Criteria) this;
        }

        public Criteria andKhBz4GreaterThan(String value) {
            addCriterion("kh_Bz4 >", value, "khBz4");
            return (Criteria) this;
        }

        public Criteria andKhBz4GreaterThanOrEqualTo(String value) {
            addCriterion("kh_Bz4 >=", value, "khBz4");
            return (Criteria) this;
        }

        public Criteria andKhBz4LessThan(String value) {
            addCriterion("kh_Bz4 <", value, "khBz4");
            return (Criteria) this;
        }

        public Criteria andKhBz4LessThanOrEqualTo(String value) {
            addCriterion("kh_Bz4 <=", value, "khBz4");
            return (Criteria) this;
        }

        public Criteria andKhBz4Like(String value) {
            addCriterion("kh_Bz4 like", value, "khBz4");
            return (Criteria) this;
        }

        public Criteria andKhBz4NotLike(String value) {
            addCriterion("kh_Bz4 not like", value, "khBz4");
            return (Criteria) this;
        }

        public Criteria andKhBz4In(List<String> values) {
            addCriterion("kh_Bz4 in", values, "khBz4");
            return (Criteria) this;
        }

        public Criteria andKhBz4NotIn(List<String> values) {
            addCriterion("kh_Bz4 not in", values, "khBz4");
            return (Criteria) this;
        }

        public Criteria andKhBz4Between(String value1, String value2) {
            addCriterion("kh_Bz4 between", value1, value2, "khBz4");
            return (Criteria) this;
        }

        public Criteria andKhBz4NotBetween(String value1, String value2) {
            addCriterion("kh_Bz4 not between", value1, value2, "khBz4");
            return (Criteria) this;
        }

        public Criteria andKhBz5IsNull() {
            addCriterion("kh_Bz5 is null");
            return (Criteria) this;
        }

        public Criteria andKhBz5IsNotNull() {
            addCriterion("kh_Bz5 is not null");
            return (Criteria) this;
        }

        public Criteria andKhBz5EqualTo(String value) {
            addCriterion("kh_Bz5 =", value, "khBz5");
            return (Criteria) this;
        }

        public Criteria andKhBz5NotEqualTo(String value) {
            addCriterion("kh_Bz5 <>", value, "khBz5");
            return (Criteria) this;
        }

        public Criteria andKhBz5GreaterThan(String value) {
            addCriterion("kh_Bz5 >", value, "khBz5");
            return (Criteria) this;
        }

        public Criteria andKhBz5GreaterThanOrEqualTo(String value) {
            addCriterion("kh_Bz5 >=", value, "khBz5");
            return (Criteria) this;
        }

        public Criteria andKhBz5LessThan(String value) {
            addCriterion("kh_Bz5 <", value, "khBz5");
            return (Criteria) this;
        }

        public Criteria andKhBz5LessThanOrEqualTo(String value) {
            addCriterion("kh_Bz5 <=", value, "khBz5");
            return (Criteria) this;
        }

        public Criteria andKhBz5Like(String value) {
            addCriterion("kh_Bz5 like", value, "khBz5");
            return (Criteria) this;
        }

        public Criteria andKhBz5NotLike(String value) {
            addCriterion("kh_Bz5 not like", value, "khBz5");
            return (Criteria) this;
        }

        public Criteria andKhBz5In(List<String> values) {
            addCriterion("kh_Bz5 in", values, "khBz5");
            return (Criteria) this;
        }

        public Criteria andKhBz5NotIn(List<String> values) {
            addCriterion("kh_Bz5 not in", values, "khBz5");
            return (Criteria) this;
        }

        public Criteria andKhBz5Between(String value1, String value2) {
            addCriterion("kh_Bz5 between", value1, value2, "khBz5");
            return (Criteria) this;
        }

        public Criteria andKhBz5NotBetween(String value1, String value2) {
            addCriterion("kh_Bz5 not between", value1, value2, "khBz5");
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