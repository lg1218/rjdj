package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SupplierMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierMainExample() {
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

        public Criteria andSmidIsNull() {
            addCriterion("smid is null");
            return (Criteria) this;
        }

        public Criteria andSmidIsNotNull() {
            addCriterion("smid is not null");
            return (Criteria) this;
        }

        public Criteria andSmidEqualTo(Integer value) {
            addCriterion("smid =", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidNotEqualTo(Integer value) {
            addCriterion("smid <>", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidGreaterThan(Integer value) {
            addCriterion("smid >", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("smid >=", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidLessThan(Integer value) {
            addCriterion("smid <", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidLessThanOrEqualTo(Integer value) {
            addCriterion("smid <=", value, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidIn(List<Integer> values) {
            addCriterion("smid in", values, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidNotIn(List<Integer> values) {
            addCriterion("smid not in", values, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidBetween(Integer value1, Integer value2) {
            addCriterion("smid between", value1, value2, "smid");
            return (Criteria) this;
        }

        public Criteria andSmidNotBetween(Integer value1, Integer value2) {
            addCriterion("smid not between", value1, value2, "smid");
            return (Criteria) this;
        }

        public Criteria andSmfnameIsNull() {
            addCriterion("smfname is null");
            return (Criteria) this;
        }

        public Criteria andSmfnameIsNotNull() {
            addCriterion("smfname is not null");
            return (Criteria) this;
        }

        public Criteria andSmfnameEqualTo(String value) {
            addCriterion("smfname =", value, "smfname");
            return (Criteria) this;
        }

        public Criteria andSmfnameNotEqualTo(String value) {
            addCriterion("smfname <>", value, "smfname");
            return (Criteria) this;
        }

        public Criteria andSmfnameGreaterThan(String value) {
            addCriterion("smfname >", value, "smfname");
            return (Criteria) this;
        }

        public Criteria andSmfnameGreaterThanOrEqualTo(String value) {
            addCriterion("smfname >=", value, "smfname");
            return (Criteria) this;
        }

        public Criteria andSmfnameLessThan(String value) {
            addCriterion("smfname <", value, "smfname");
            return (Criteria) this;
        }

        public Criteria andSmfnameLessThanOrEqualTo(String value) {
            addCriterion("smfname <=", value, "smfname");
            return (Criteria) this;
        }

        public Criteria andSmfnameLike(String value) {
            addCriterion("smfname like", value, "smfname");
            return (Criteria) this;
        }

        public Criteria andSmfnameNotLike(String value) {
            addCriterion("smfname not like", value, "smfname");
            return (Criteria) this;
        }

        public Criteria andSmfnameIn(List<String> values) {
            addCriterion("smfname in", values, "smfname");
            return (Criteria) this;
        }

        public Criteria andSmfnameNotIn(List<String> values) {
            addCriterion("smfname not in", values, "smfname");
            return (Criteria) this;
        }

        public Criteria andSmfnameBetween(String value1, String value2) {
            addCriterion("smfname between", value1, value2, "smfname");
            return (Criteria) this;
        }

        public Criteria andSmfnameNotBetween(String value1, String value2) {
            addCriterion("smfname not between", value1, value2, "smfname");
            return (Criteria) this;
        }

        public Criteria andSmsnameIsNull() {
            addCriterion("smsname is null");
            return (Criteria) this;
        }

        public Criteria andSmsnameIsNotNull() {
            addCriterion("smsname is not null");
            return (Criteria) this;
        }

        public Criteria andSmsnameEqualTo(String value) {
            addCriterion("smsname =", value, "smsname");
            return (Criteria) this;
        }

        public Criteria andSmsnameNotEqualTo(String value) {
            addCriterion("smsname <>", value, "smsname");
            return (Criteria) this;
        }

        public Criteria andSmsnameGreaterThan(String value) {
            addCriterion("smsname >", value, "smsname");
            return (Criteria) this;
        }

        public Criteria andSmsnameGreaterThanOrEqualTo(String value) {
            addCriterion("smsname >=", value, "smsname");
            return (Criteria) this;
        }

        public Criteria andSmsnameLessThan(String value) {
            addCriterion("smsname <", value, "smsname");
            return (Criteria) this;
        }

        public Criteria andSmsnameLessThanOrEqualTo(String value) {
            addCriterion("smsname <=", value, "smsname");
            return (Criteria) this;
        }

        public Criteria andSmsnameLike(String value) {
            addCriterion("smsname like", value, "smsname");
            return (Criteria) this;
        }

        public Criteria andSmsnameNotLike(String value) {
            addCriterion("smsname not like", value, "smsname");
            return (Criteria) this;
        }

        public Criteria andSmsnameIn(List<String> values) {
            addCriterion("smsname in", values, "smsname");
            return (Criteria) this;
        }

        public Criteria andSmsnameNotIn(List<String> values) {
            addCriterion("smsname not in", values, "smsname");
            return (Criteria) this;
        }

        public Criteria andSmsnameBetween(String value1, String value2) {
            addCriterion("smsname between", value1, value2, "smsname");
            return (Criteria) this;
        }

        public Criteria andSmsnameNotBetween(String value1, String value2) {
            addCriterion("smsname not between", value1, value2, "smsname");
            return (Criteria) this;
        }

        public Criteria andSmefnameIsNull() {
            addCriterion("smefname is null");
            return (Criteria) this;
        }

        public Criteria andSmefnameIsNotNull() {
            addCriterion("smefname is not null");
            return (Criteria) this;
        }

        public Criteria andSmefnameEqualTo(String value) {
            addCriterion("smefname =", value, "smefname");
            return (Criteria) this;
        }

        public Criteria andSmefnameNotEqualTo(String value) {
            addCriterion("smefname <>", value, "smefname");
            return (Criteria) this;
        }

        public Criteria andSmefnameGreaterThan(String value) {
            addCriterion("smefname >", value, "smefname");
            return (Criteria) this;
        }

        public Criteria andSmefnameGreaterThanOrEqualTo(String value) {
            addCriterion("smefname >=", value, "smefname");
            return (Criteria) this;
        }

        public Criteria andSmefnameLessThan(String value) {
            addCriterion("smefname <", value, "smefname");
            return (Criteria) this;
        }

        public Criteria andSmefnameLessThanOrEqualTo(String value) {
            addCriterion("smefname <=", value, "smefname");
            return (Criteria) this;
        }

        public Criteria andSmefnameLike(String value) {
            addCriterion("smefname like", value, "smefname");
            return (Criteria) this;
        }

        public Criteria andSmefnameNotLike(String value) {
            addCriterion("smefname not like", value, "smefname");
            return (Criteria) this;
        }

        public Criteria andSmefnameIn(List<String> values) {
            addCriterion("smefname in", values, "smefname");
            return (Criteria) this;
        }

        public Criteria andSmefnameNotIn(List<String> values) {
            addCriterion("smefname not in", values, "smefname");
            return (Criteria) this;
        }

        public Criteria andSmefnameBetween(String value1, String value2) {
            addCriterion("smefname between", value1, value2, "smefname");
            return (Criteria) this;
        }

        public Criteria andSmefnameNotBetween(String value1, String value2) {
            addCriterion("smefname not between", value1, value2, "smefname");
            return (Criteria) this;
        }

        public Criteria andSmssnameIsNull() {
            addCriterion("smssname is null");
            return (Criteria) this;
        }

        public Criteria andSmssnameIsNotNull() {
            addCriterion("smssname is not null");
            return (Criteria) this;
        }

        public Criteria andSmssnameEqualTo(String value) {
            addCriterion("smssname =", value, "smssname");
            return (Criteria) this;
        }

        public Criteria andSmssnameNotEqualTo(String value) {
            addCriterion("smssname <>", value, "smssname");
            return (Criteria) this;
        }

        public Criteria andSmssnameGreaterThan(String value) {
            addCriterion("smssname >", value, "smssname");
            return (Criteria) this;
        }

        public Criteria andSmssnameGreaterThanOrEqualTo(String value) {
            addCriterion("smssname >=", value, "smssname");
            return (Criteria) this;
        }

        public Criteria andSmssnameLessThan(String value) {
            addCriterion("smssname <", value, "smssname");
            return (Criteria) this;
        }

        public Criteria andSmssnameLessThanOrEqualTo(String value) {
            addCriterion("smssname <=", value, "smssname");
            return (Criteria) this;
        }

        public Criteria andSmssnameLike(String value) {
            addCriterion("smssname like", value, "smssname");
            return (Criteria) this;
        }

        public Criteria andSmssnameNotLike(String value) {
            addCriterion("smssname not like", value, "smssname");
            return (Criteria) this;
        }

        public Criteria andSmssnameIn(List<String> values) {
            addCriterion("smssname in", values, "smssname");
            return (Criteria) this;
        }

        public Criteria andSmssnameNotIn(List<String> values) {
            addCriterion("smssname not in", values, "smssname");
            return (Criteria) this;
        }

        public Criteria andSmssnameBetween(String value1, String value2) {
            addCriterion("smssname between", value1, value2, "smssname");
            return (Criteria) this;
        }

        public Criteria andSmssnameNotBetween(String value1, String value2) {
            addCriterion("smssname not between", value1, value2, "smssname");
            return (Criteria) this;
        }

        public Criteria andSmavidIsNull() {
            addCriterion("smavid is null");
            return (Criteria) this;
        }

        public Criteria andSmavidIsNotNull() {
            addCriterion("smavid is not null");
            return (Criteria) this;
        }

        public Criteria andSmavidEqualTo(Integer value) {
            addCriterion("smavid =", value, "smavid");
            return (Criteria) this;
        }

        public Criteria andSmavidNotEqualTo(Integer value) {
            addCriterion("smavid <>", value, "smavid");
            return (Criteria) this;
        }

        public Criteria andSmavidGreaterThan(Integer value) {
            addCriterion("smavid >", value, "smavid");
            return (Criteria) this;
        }

        public Criteria andSmavidGreaterThanOrEqualTo(Integer value) {
            addCriterion("smavid >=", value, "smavid");
            return (Criteria) this;
        }

        public Criteria andSmavidLessThan(Integer value) {
            addCriterion("smavid <", value, "smavid");
            return (Criteria) this;
        }

        public Criteria andSmavidLessThanOrEqualTo(Integer value) {
            addCriterion("smavid <=", value, "smavid");
            return (Criteria) this;
        }

        public Criteria andSmavidIn(List<Integer> values) {
            addCriterion("smavid in", values, "smavid");
            return (Criteria) this;
        }

        public Criteria andSmavidNotIn(List<Integer> values) {
            addCriterion("smavid not in", values, "smavid");
            return (Criteria) this;
        }

        public Criteria andSmavidBetween(Integer value1, Integer value2) {
            addCriterion("smavid between", value1, value2, "smavid");
            return (Criteria) this;
        }

        public Criteria andSmavidNotBetween(Integer value1, Integer value2) {
            addCriterion("smavid not between", value1, value2, "smavid");
            return (Criteria) this;
        }

        public Criteria andSmtypeidIsNull() {
            addCriterion("smtypeid is null");
            return (Criteria) this;
        }

        public Criteria andSmtypeidIsNotNull() {
            addCriterion("smtypeid is not null");
            return (Criteria) this;
        }

        public Criteria andSmtypeidEqualTo(Integer value) {
            addCriterion("smtypeid =", value, "smtypeid");
            return (Criteria) this;
        }

        public Criteria andSmtypeidNotEqualTo(Integer value) {
            addCriterion("smtypeid <>", value, "smtypeid");
            return (Criteria) this;
        }

        public Criteria andSmtypeidGreaterThan(Integer value) {
            addCriterion("smtypeid >", value, "smtypeid");
            return (Criteria) this;
        }

        public Criteria andSmtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("smtypeid >=", value, "smtypeid");
            return (Criteria) this;
        }

        public Criteria andSmtypeidLessThan(Integer value) {
            addCriterion("smtypeid <", value, "smtypeid");
            return (Criteria) this;
        }

        public Criteria andSmtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("smtypeid <=", value, "smtypeid");
            return (Criteria) this;
        }

        public Criteria andSmtypeidIn(List<Integer> values) {
            addCriterion("smtypeid in", values, "smtypeid");
            return (Criteria) this;
        }

        public Criteria andSmtypeidNotIn(List<Integer> values) {
            addCriterion("smtypeid not in", values, "smtypeid");
            return (Criteria) this;
        }

        public Criteria andSmtypeidBetween(Integer value1, Integer value2) {
            addCriterion("smtypeid between", value1, value2, "smtypeid");
            return (Criteria) this;
        }

        public Criteria andSmtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("smtypeid not between", value1, value2, "smtypeid");
            return (Criteria) this;
        }

        public Criteria andSmareaidIsNull() {
            addCriterion("smareaid is null");
            return (Criteria) this;
        }

        public Criteria andSmareaidIsNotNull() {
            addCriterion("smareaid is not null");
            return (Criteria) this;
        }

        public Criteria andSmareaidEqualTo(Integer value) {
            addCriterion("smareaid =", value, "smareaid");
            return (Criteria) this;
        }

        public Criteria andSmareaidNotEqualTo(Integer value) {
            addCriterion("smareaid <>", value, "smareaid");
            return (Criteria) this;
        }

        public Criteria andSmareaidGreaterThan(Integer value) {
            addCriterion("smareaid >", value, "smareaid");
            return (Criteria) this;
        }

        public Criteria andSmareaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("smareaid >=", value, "smareaid");
            return (Criteria) this;
        }

        public Criteria andSmareaidLessThan(Integer value) {
            addCriterion("smareaid <", value, "smareaid");
            return (Criteria) this;
        }

        public Criteria andSmareaidLessThanOrEqualTo(Integer value) {
            addCriterion("smareaid <=", value, "smareaid");
            return (Criteria) this;
        }

        public Criteria andSmareaidIn(List<Integer> values) {
            addCriterion("smareaid in", values, "smareaid");
            return (Criteria) this;
        }

        public Criteria andSmareaidNotIn(List<Integer> values) {
            addCriterion("smareaid not in", values, "smareaid");
            return (Criteria) this;
        }

        public Criteria andSmareaidBetween(Integer value1, Integer value2) {
            addCriterion("smareaid between", value1, value2, "smareaid");
            return (Criteria) this;
        }

        public Criteria andSmareaidNotBetween(Integer value1, Integer value2) {
            addCriterion("smareaid not between", value1, value2, "smareaid");
            return (Criteria) this;
        }

        public Criteria andSmcurrencyidIsNull() {
            addCriterion("smcurrencyid is null");
            return (Criteria) this;
        }

        public Criteria andSmcurrencyidIsNotNull() {
            addCriterion("smcurrencyid is not null");
            return (Criteria) this;
        }

        public Criteria andSmcurrencyidEqualTo(Integer value) {
            addCriterion("smcurrencyid =", value, "smcurrencyid");
            return (Criteria) this;
        }

        public Criteria andSmcurrencyidNotEqualTo(Integer value) {
            addCriterion("smcurrencyid <>", value, "smcurrencyid");
            return (Criteria) this;
        }

        public Criteria andSmcurrencyidGreaterThan(Integer value) {
            addCriterion("smcurrencyid >", value, "smcurrencyid");
            return (Criteria) this;
        }

        public Criteria andSmcurrencyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("smcurrencyid >=", value, "smcurrencyid");
            return (Criteria) this;
        }

        public Criteria andSmcurrencyidLessThan(Integer value) {
            addCriterion("smcurrencyid <", value, "smcurrencyid");
            return (Criteria) this;
        }

        public Criteria andSmcurrencyidLessThanOrEqualTo(Integer value) {
            addCriterion("smcurrencyid <=", value, "smcurrencyid");
            return (Criteria) this;
        }

        public Criteria andSmcurrencyidIn(List<Integer> values) {
            addCriterion("smcurrencyid in", values, "smcurrencyid");
            return (Criteria) this;
        }

        public Criteria andSmcurrencyidNotIn(List<Integer> values) {
            addCriterion("smcurrencyid not in", values, "smcurrencyid");
            return (Criteria) this;
        }

        public Criteria andSmcurrencyidBetween(Integer value1, Integer value2) {
            addCriterion("smcurrencyid between", value1, value2, "smcurrencyid");
            return (Criteria) this;
        }

        public Criteria andSmcurrencyidNotBetween(Integer value1, Integer value2) {
            addCriterion("smcurrencyid not between", value1, value2, "smcurrencyid");
            return (Criteria) this;
        }

        public Criteria andFzManIsNull() {
            addCriterion("fz_man is null");
            return (Criteria) this;
        }

        public Criteria andFzManIsNotNull() {
            addCriterion("fz_man is not null");
            return (Criteria) this;
        }

        public Criteria andFzManEqualTo(String value) {
            addCriterion("fz_man =", value, "fzMan");
            return (Criteria) this;
        }

        public Criteria andFzManNotEqualTo(String value) {
            addCriterion("fz_man <>", value, "fzMan");
            return (Criteria) this;
        }

        public Criteria andFzManGreaterThan(String value) {
            addCriterion("fz_man >", value, "fzMan");
            return (Criteria) this;
        }

        public Criteria andFzManGreaterThanOrEqualTo(String value) {
            addCriterion("fz_man >=", value, "fzMan");
            return (Criteria) this;
        }

        public Criteria andFzManLessThan(String value) {
            addCriterion("fz_man <", value, "fzMan");
            return (Criteria) this;
        }

        public Criteria andFzManLessThanOrEqualTo(String value) {
            addCriterion("fz_man <=", value, "fzMan");
            return (Criteria) this;
        }

        public Criteria andFzManLike(String value) {
            addCriterion("fz_man like", value, "fzMan");
            return (Criteria) this;
        }

        public Criteria andFzManNotLike(String value) {
            addCriterion("fz_man not like", value, "fzMan");
            return (Criteria) this;
        }

        public Criteria andFzManIn(List<String> values) {
            addCriterion("fz_man in", values, "fzMan");
            return (Criteria) this;
        }

        public Criteria andFzManNotIn(List<String> values) {
            addCriterion("fz_man not in", values, "fzMan");
            return (Criteria) this;
        }

        public Criteria andFzManBetween(String value1, String value2) {
            addCriterion("fz_man between", value1, value2, "fzMan");
            return (Criteria) this;
        }

        public Criteria andFzManNotBetween(String value1, String value2) {
            addCriterion("fz_man not between", value1, value2, "fzMan");
            return (Criteria) this;
        }

        public Criteria andLxManIsNull() {
            addCriterion("lx_man is null");
            return (Criteria) this;
        }

        public Criteria andLxManIsNotNull() {
            addCriterion("lx_man is not null");
            return (Criteria) this;
        }

        public Criteria andLxManEqualTo(String value) {
            addCriterion("lx_man =", value, "lxMan");
            return (Criteria) this;
        }

        public Criteria andLxManNotEqualTo(String value) {
            addCriterion("lx_man <>", value, "lxMan");
            return (Criteria) this;
        }

        public Criteria andLxManGreaterThan(String value) {
            addCriterion("lx_man >", value, "lxMan");
            return (Criteria) this;
        }

        public Criteria andLxManGreaterThanOrEqualTo(String value) {
            addCriterion("lx_man >=", value, "lxMan");
            return (Criteria) this;
        }

        public Criteria andLxManLessThan(String value) {
            addCriterion("lx_man <", value, "lxMan");
            return (Criteria) this;
        }

        public Criteria andLxManLessThanOrEqualTo(String value) {
            addCriterion("lx_man <=", value, "lxMan");
            return (Criteria) this;
        }

        public Criteria andLxManLike(String value) {
            addCriterion("lx_man like", value, "lxMan");
            return (Criteria) this;
        }

        public Criteria andLxManNotLike(String value) {
            addCriterion("lx_man not like", value, "lxMan");
            return (Criteria) this;
        }

        public Criteria andLxManIn(List<String> values) {
            addCriterion("lx_man in", values, "lxMan");
            return (Criteria) this;
        }

        public Criteria andLxManNotIn(List<String> values) {
            addCriterion("lx_man not in", values, "lxMan");
            return (Criteria) this;
        }

        public Criteria andLxManBetween(String value1, String value2) {
            addCriterion("lx_man between", value1, value2, "lxMan");
            return (Criteria) this;
        }

        public Criteria andLxManNotBetween(String value1, String value2) {
            addCriterion("lx_man not between", value1, value2, "lxMan");
            return (Criteria) this;
        }

        public Criteria andLxPhoneoneIsNull() {
            addCriterion("lx_phoneone is null");
            return (Criteria) this;
        }

        public Criteria andLxPhoneoneIsNotNull() {
            addCriterion("lx_phoneone is not null");
            return (Criteria) this;
        }

        public Criteria andLxPhoneoneEqualTo(String value) {
            addCriterion("lx_phoneone =", value, "lxPhoneone");
            return (Criteria) this;
        }

        public Criteria andLxPhoneoneNotEqualTo(String value) {
            addCriterion("lx_phoneone <>", value, "lxPhoneone");
            return (Criteria) this;
        }

        public Criteria andLxPhoneoneGreaterThan(String value) {
            addCriterion("lx_phoneone >", value, "lxPhoneone");
            return (Criteria) this;
        }

        public Criteria andLxPhoneoneGreaterThanOrEqualTo(String value) {
            addCriterion("lx_phoneone >=", value, "lxPhoneone");
            return (Criteria) this;
        }

        public Criteria andLxPhoneoneLessThan(String value) {
            addCriterion("lx_phoneone <", value, "lxPhoneone");
            return (Criteria) this;
        }

        public Criteria andLxPhoneoneLessThanOrEqualTo(String value) {
            addCriterion("lx_phoneone <=", value, "lxPhoneone");
            return (Criteria) this;
        }

        public Criteria andLxPhoneoneLike(String value) {
            addCriterion("lx_phoneone like", value, "lxPhoneone");
            return (Criteria) this;
        }

        public Criteria andLxPhoneoneNotLike(String value) {
            addCriterion("lx_phoneone not like", value, "lxPhoneone");
            return (Criteria) this;
        }

        public Criteria andLxPhoneoneIn(List<String> values) {
            addCriterion("lx_phoneone in", values, "lxPhoneone");
            return (Criteria) this;
        }

        public Criteria andLxPhoneoneNotIn(List<String> values) {
            addCriterion("lx_phoneone not in", values, "lxPhoneone");
            return (Criteria) this;
        }

        public Criteria andLxPhoneoneBetween(String value1, String value2) {
            addCriterion("lx_phoneone between", value1, value2, "lxPhoneone");
            return (Criteria) this;
        }

        public Criteria andLxPhoneoneNotBetween(String value1, String value2) {
            addCriterion("lx_phoneone not between", value1, value2, "lxPhoneone");
            return (Criteria) this;
        }

        public Criteria andLxPhonetwoIsNull() {
            addCriterion("lx_phonetwo is null");
            return (Criteria) this;
        }

        public Criteria andLxPhonetwoIsNotNull() {
            addCriterion("lx_phonetwo is not null");
            return (Criteria) this;
        }

        public Criteria andLxPhonetwoEqualTo(String value) {
            addCriterion("lx_phonetwo =", value, "lxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andLxPhonetwoNotEqualTo(String value) {
            addCriterion("lx_phonetwo <>", value, "lxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andLxPhonetwoGreaterThan(String value) {
            addCriterion("lx_phonetwo >", value, "lxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andLxPhonetwoGreaterThanOrEqualTo(String value) {
            addCriterion("lx_phonetwo >=", value, "lxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andLxPhonetwoLessThan(String value) {
            addCriterion("lx_phonetwo <", value, "lxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andLxPhonetwoLessThanOrEqualTo(String value) {
            addCriterion("lx_phonetwo <=", value, "lxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andLxPhonetwoLike(String value) {
            addCriterion("lx_phonetwo like", value, "lxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andLxPhonetwoNotLike(String value) {
            addCriterion("lx_phonetwo not like", value, "lxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andLxPhonetwoIn(List<String> values) {
            addCriterion("lx_phonetwo in", values, "lxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andLxPhonetwoNotIn(List<String> values) {
            addCriterion("lx_phonetwo not in", values, "lxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andLxPhonetwoBetween(String value1, String value2) {
            addCriterion("lx_phonetwo between", value1, value2, "lxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andLxPhonetwoNotBetween(String value1, String value2) {
            addCriterion("lx_phonetwo not between", value1, value2, "lxPhonetwo");
            return (Criteria) this;
        }

        public Criteria andLxPhonethreeIsNull() {
            addCriterion("lx_phonethree is null");
            return (Criteria) this;
        }

        public Criteria andLxPhonethreeIsNotNull() {
            addCriterion("lx_phonethree is not null");
            return (Criteria) this;
        }

        public Criteria andLxPhonethreeEqualTo(String value) {
            addCriterion("lx_phonethree =", value, "lxPhonethree");
            return (Criteria) this;
        }

        public Criteria andLxPhonethreeNotEqualTo(String value) {
            addCriterion("lx_phonethree <>", value, "lxPhonethree");
            return (Criteria) this;
        }

        public Criteria andLxPhonethreeGreaterThan(String value) {
            addCriterion("lx_phonethree >", value, "lxPhonethree");
            return (Criteria) this;
        }

        public Criteria andLxPhonethreeGreaterThanOrEqualTo(String value) {
            addCriterion("lx_phonethree >=", value, "lxPhonethree");
            return (Criteria) this;
        }

        public Criteria andLxPhonethreeLessThan(String value) {
            addCriterion("lx_phonethree <", value, "lxPhonethree");
            return (Criteria) this;
        }

        public Criteria andLxPhonethreeLessThanOrEqualTo(String value) {
            addCriterion("lx_phonethree <=", value, "lxPhonethree");
            return (Criteria) this;
        }

        public Criteria andLxPhonethreeLike(String value) {
            addCriterion("lx_phonethree like", value, "lxPhonethree");
            return (Criteria) this;
        }

        public Criteria andLxPhonethreeNotLike(String value) {
            addCriterion("lx_phonethree not like", value, "lxPhonethree");
            return (Criteria) this;
        }

        public Criteria andLxPhonethreeIn(List<String> values) {
            addCriterion("lx_phonethree in", values, "lxPhonethree");
            return (Criteria) this;
        }

        public Criteria andLxPhonethreeNotIn(List<String> values) {
            addCriterion("lx_phonethree not in", values, "lxPhonethree");
            return (Criteria) this;
        }

        public Criteria andLxPhonethreeBetween(String value1, String value2) {
            addCriterion("lx_phonethree between", value1, value2, "lxPhonethree");
            return (Criteria) this;
        }

        public Criteria andLxPhonethreeNotBetween(String value1, String value2) {
            addCriterion("lx_phonethree not between", value1, value2, "lxPhonethree");
            return (Criteria) this;
        }

        public Criteria andLxPhoneMobileIsNull() {
            addCriterion("lx_phone_mobile is null");
            return (Criteria) this;
        }

        public Criteria andLxPhoneMobileIsNotNull() {
            addCriterion("lx_phone_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andLxPhoneMobileEqualTo(String value) {
            addCriterion("lx_phone_mobile =", value, "lxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andLxPhoneMobileNotEqualTo(String value) {
            addCriterion("lx_phone_mobile <>", value, "lxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andLxPhoneMobileGreaterThan(String value) {
            addCriterion("lx_phone_mobile >", value, "lxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andLxPhoneMobileGreaterThanOrEqualTo(String value) {
            addCriterion("lx_phone_mobile >=", value, "lxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andLxPhoneMobileLessThan(String value) {
            addCriterion("lx_phone_mobile <", value, "lxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andLxPhoneMobileLessThanOrEqualTo(String value) {
            addCriterion("lx_phone_mobile <=", value, "lxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andLxPhoneMobileLike(String value) {
            addCriterion("lx_phone_mobile like", value, "lxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andLxPhoneMobileNotLike(String value) {
            addCriterion("lx_phone_mobile not like", value, "lxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andLxPhoneMobileIn(List<String> values) {
            addCriterion("lx_phone_mobile in", values, "lxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andLxPhoneMobileNotIn(List<String> values) {
            addCriterion("lx_phone_mobile not in", values, "lxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andLxPhoneMobileBetween(String value1, String value2) {
            addCriterion("lx_phone_mobile between", value1, value2, "lxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andLxPhoneMobileNotBetween(String value1, String value2) {
            addCriterion("lx_phone_mobile not between", value1, value2, "lxPhoneMobile");
            return (Criteria) this;
        }

        public Criteria andYhNumIsNull() {
            addCriterion("yh_num is null");
            return (Criteria) this;
        }

        public Criteria andYhNumIsNotNull() {
            addCriterion("yh_num is not null");
            return (Criteria) this;
        }

        public Criteria andYhNumEqualTo(String value) {
            addCriterion("yh_num =", value, "yhNum");
            return (Criteria) this;
        }

        public Criteria andYhNumNotEqualTo(String value) {
            addCriterion("yh_num <>", value, "yhNum");
            return (Criteria) this;
        }

        public Criteria andYhNumGreaterThan(String value) {
            addCriterion("yh_num >", value, "yhNum");
            return (Criteria) this;
        }

        public Criteria andYhNumGreaterThanOrEqualTo(String value) {
            addCriterion("yh_num >=", value, "yhNum");
            return (Criteria) this;
        }

        public Criteria andYhNumLessThan(String value) {
            addCriterion("yh_num <", value, "yhNum");
            return (Criteria) this;
        }

        public Criteria andYhNumLessThanOrEqualTo(String value) {
            addCriterion("yh_num <=", value, "yhNum");
            return (Criteria) this;
        }

        public Criteria andYhNumLike(String value) {
            addCriterion("yh_num like", value, "yhNum");
            return (Criteria) this;
        }

        public Criteria andYhNumNotLike(String value) {
            addCriterion("yh_num not like", value, "yhNum");
            return (Criteria) this;
        }

        public Criteria andYhNumIn(List<String> values) {
            addCriterion("yh_num in", values, "yhNum");
            return (Criteria) this;
        }

        public Criteria andYhNumNotIn(List<String> values) {
            addCriterion("yh_num not in", values, "yhNum");
            return (Criteria) this;
        }

        public Criteria andYhNumBetween(String value1, String value2) {
            addCriterion("yh_num between", value1, value2, "yhNum");
            return (Criteria) this;
        }

        public Criteria andYhNumNotBetween(String value1, String value2) {
            addCriterion("yh_num not between", value1, value2, "yhNum");
            return (Criteria) this;
        }

        public Criteria andKhyhNumIsNull() {
            addCriterion("khyh_num is null");
            return (Criteria) this;
        }

        public Criteria andKhyhNumIsNotNull() {
            addCriterion("khyh_num is not null");
            return (Criteria) this;
        }

        public Criteria andKhyhNumEqualTo(Integer value) {
            addCriterion("khyh_num =", value, "khyhNum");
            return (Criteria) this;
        }

        public Criteria andKhyhNumNotEqualTo(Integer value) {
            addCriterion("khyh_num <>", value, "khyhNum");
            return (Criteria) this;
        }

        public Criteria andKhyhNumGreaterThan(Integer value) {
            addCriterion("khyh_num >", value, "khyhNum");
            return (Criteria) this;
        }

        public Criteria andKhyhNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("khyh_num >=", value, "khyhNum");
            return (Criteria) this;
        }

        public Criteria andKhyhNumLessThan(Integer value) {
            addCriterion("khyh_num <", value, "khyhNum");
            return (Criteria) this;
        }

        public Criteria andKhyhNumLessThanOrEqualTo(Integer value) {
            addCriterion("khyh_num <=", value, "khyhNum");
            return (Criteria) this;
        }

        public Criteria andKhyhNumIn(List<Integer> values) {
            addCriterion("khyh_num in", values, "khyhNum");
            return (Criteria) this;
        }

        public Criteria andKhyhNumNotIn(List<Integer> values) {
            addCriterion("khyh_num not in", values, "khyhNum");
            return (Criteria) this;
        }

        public Criteria andKhyhNumBetween(Integer value1, Integer value2) {
            addCriterion("khyh_num between", value1, value2, "khyhNum");
            return (Criteria) this;
        }

        public Criteria andKhyhNumNotBetween(Integer value1, Integer value2) {
            addCriterion("khyh_num not between", value1, value2, "khyhNum");
            return (Criteria) this;
        }

        public Criteria andCgManIdIsNull() {
            addCriterion("cg_man_id is null");
            return (Criteria) this;
        }

        public Criteria andCgManIdIsNotNull() {
            addCriterion("cg_man_id is not null");
            return (Criteria) this;
        }

        public Criteria andCgManIdEqualTo(Integer value) {
            addCriterion("cg_man_id =", value, "cgManId");
            return (Criteria) this;
        }

        public Criteria andCgManIdNotEqualTo(Integer value) {
            addCriterion("cg_man_id <>", value, "cgManId");
            return (Criteria) this;
        }

        public Criteria andCgManIdGreaterThan(Integer value) {
            addCriterion("cg_man_id >", value, "cgManId");
            return (Criteria) this;
        }

        public Criteria andCgManIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cg_man_id >=", value, "cgManId");
            return (Criteria) this;
        }

        public Criteria andCgManIdLessThan(Integer value) {
            addCriterion("cg_man_id <", value, "cgManId");
            return (Criteria) this;
        }

        public Criteria andCgManIdLessThanOrEqualTo(Integer value) {
            addCriterion("cg_man_id <=", value, "cgManId");
            return (Criteria) this;
        }

        public Criteria andCgManIdIn(List<Integer> values) {
            addCriterion("cg_man_id in", values, "cgManId");
            return (Criteria) this;
        }

        public Criteria andCgManIdNotIn(List<Integer> values) {
            addCriterion("cg_man_id not in", values, "cgManId");
            return (Criteria) this;
        }

        public Criteria andCgManIdBetween(Integer value1, Integer value2) {
            addCriterion("cg_man_id between", value1, value2, "cgManId");
            return (Criteria) this;
        }

        public Criteria andCgManIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cg_man_id not between", value1, value2, "cgManId");
            return (Criteria) this;
        }

        public Criteria andSwNumsIsNull() {
            addCriterion("sw_nums is null");
            return (Criteria) this;
        }

        public Criteria andSwNumsIsNotNull() {
            addCriterion("sw_nums is not null");
            return (Criteria) this;
        }

        public Criteria andSwNumsEqualTo(String value) {
            addCriterion("sw_nums =", value, "swNums");
            return (Criteria) this;
        }

        public Criteria andSwNumsNotEqualTo(String value) {
            addCriterion("sw_nums <>", value, "swNums");
            return (Criteria) this;
        }

        public Criteria andSwNumsGreaterThan(String value) {
            addCriterion("sw_nums >", value, "swNums");
            return (Criteria) this;
        }

        public Criteria andSwNumsGreaterThanOrEqualTo(String value) {
            addCriterion("sw_nums >=", value, "swNums");
            return (Criteria) this;
        }

        public Criteria andSwNumsLessThan(String value) {
            addCriterion("sw_nums <", value, "swNums");
            return (Criteria) this;
        }

        public Criteria andSwNumsLessThanOrEqualTo(String value) {
            addCriterion("sw_nums <=", value, "swNums");
            return (Criteria) this;
        }

        public Criteria andSwNumsLike(String value) {
            addCriterion("sw_nums like", value, "swNums");
            return (Criteria) this;
        }

        public Criteria andSwNumsNotLike(String value) {
            addCriterion("sw_nums not like", value, "swNums");
            return (Criteria) this;
        }

        public Criteria andSwNumsIn(List<String> values) {
            addCriterion("sw_nums in", values, "swNums");
            return (Criteria) this;
        }

        public Criteria andSwNumsNotIn(List<String> values) {
            addCriterion("sw_nums not in", values, "swNums");
            return (Criteria) this;
        }

        public Criteria andSwNumsBetween(String value1, String value2) {
            addCriterion("sw_nums between", value1, value2, "swNums");
            return (Criteria) this;
        }

        public Criteria andSwNumsNotBetween(String value1, String value2) {
            addCriterion("sw_nums not between", value1, value2, "swNums");
            return (Criteria) this;
        }

        public Criteria andZbMoneyIsNull() {
            addCriterion("zb_money is null");
            return (Criteria) this;
        }

        public Criteria andZbMoneyIsNotNull() {
            addCriterion("zb_money is not null");
            return (Criteria) this;
        }

        public Criteria andZbMoneyEqualTo(Double value) {
            addCriterion("zb_money =", value, "zbMoney");
            return (Criteria) this;
        }

        public Criteria andZbMoneyNotEqualTo(Double value) {
            addCriterion("zb_money <>", value, "zbMoney");
            return (Criteria) this;
        }

        public Criteria andZbMoneyGreaterThan(Double value) {
            addCriterion("zb_money >", value, "zbMoney");
            return (Criteria) this;
        }

        public Criteria andZbMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("zb_money >=", value, "zbMoney");
            return (Criteria) this;
        }

        public Criteria andZbMoneyLessThan(Double value) {
            addCriterion("zb_money <", value, "zbMoney");
            return (Criteria) this;
        }

        public Criteria andZbMoneyLessThanOrEqualTo(Double value) {
            addCriterion("zb_money <=", value, "zbMoney");
            return (Criteria) this;
        }

        public Criteria andZbMoneyIn(List<Double> values) {
            addCriterion("zb_money in", values, "zbMoney");
            return (Criteria) this;
        }

        public Criteria andZbMoneyNotIn(List<Double> values) {
            addCriterion("zb_money not in", values, "zbMoney");
            return (Criteria) this;
        }

        public Criteria andZbMoneyBetween(Double value1, Double value2) {
            addCriterion("zb_money between", value1, value2, "zbMoney");
            return (Criteria) this;
        }

        public Criteria andZbMoneyNotBetween(Double value1, Double value2) {
            addCriterion("zb_money not between", value1, value2, "zbMoney");
            return (Criteria) this;
        }

        public Criteria andHyTypeIsNull() {
            addCriterion("hy_type is null");
            return (Criteria) this;
        }

        public Criteria andHyTypeIsNotNull() {
            addCriterion("hy_type is not null");
            return (Criteria) this;
        }

        public Criteria andHyTypeEqualTo(String value) {
            addCriterion("hy_type =", value, "hyType");
            return (Criteria) this;
        }

        public Criteria andHyTypeNotEqualTo(String value) {
            addCriterion("hy_type <>", value, "hyType");
            return (Criteria) this;
        }

        public Criteria andHyTypeGreaterThan(String value) {
            addCriterion("hy_type >", value, "hyType");
            return (Criteria) this;
        }

        public Criteria andHyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hy_type >=", value, "hyType");
            return (Criteria) this;
        }

        public Criteria andHyTypeLessThan(String value) {
            addCriterion("hy_type <", value, "hyType");
            return (Criteria) this;
        }

        public Criteria andHyTypeLessThanOrEqualTo(String value) {
            addCriterion("hy_type <=", value, "hyType");
            return (Criteria) this;
        }

        public Criteria andHyTypeLike(String value) {
            addCriterion("hy_type like", value, "hyType");
            return (Criteria) this;
        }

        public Criteria andHyTypeNotLike(String value) {
            addCriterion("hy_type not like", value, "hyType");
            return (Criteria) this;
        }

        public Criteria andHyTypeIn(List<String> values) {
            addCriterion("hy_type in", values, "hyType");
            return (Criteria) this;
        }

        public Criteria andHyTypeNotIn(List<String> values) {
            addCriterion("hy_type not in", values, "hyType");
            return (Criteria) this;
        }

        public Criteria andHyTypeBetween(String value1, String value2) {
            addCriterion("hy_type between", value1, value2, "hyType");
            return (Criteria) this;
        }

        public Criteria andHyTypeNotBetween(String value1, String value2) {
            addCriterion("hy_type not between", value1, value2, "hyType");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("e_mail is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("e_mail is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("e_mail =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("e_mail <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("e_mail >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("e_mail >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("e_mail <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("e_mail <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("e_mail like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("e_mail not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("e_mail in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("e_mail not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("e_mail between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("e_mail not between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andIntelAddressIsNull() {
            addCriterion("intel_address is null");
            return (Criteria) this;
        }

        public Criteria andIntelAddressIsNotNull() {
            addCriterion("intel_address is not null");
            return (Criteria) this;
        }

        public Criteria andIntelAddressEqualTo(String value) {
            addCriterion("intel_address =", value, "intelAddress");
            return (Criteria) this;
        }

        public Criteria andIntelAddressNotEqualTo(String value) {
            addCriterion("intel_address <>", value, "intelAddress");
            return (Criteria) this;
        }

        public Criteria andIntelAddressGreaterThan(String value) {
            addCriterion("intel_address >", value, "intelAddress");
            return (Criteria) this;
        }

        public Criteria andIntelAddressGreaterThanOrEqualTo(String value) {
            addCriterion("intel_address >=", value, "intelAddress");
            return (Criteria) this;
        }

        public Criteria andIntelAddressLessThan(String value) {
            addCriterion("intel_address <", value, "intelAddress");
            return (Criteria) this;
        }

        public Criteria andIntelAddressLessThanOrEqualTo(String value) {
            addCriterion("intel_address <=", value, "intelAddress");
            return (Criteria) this;
        }

        public Criteria andIntelAddressLike(String value) {
            addCriterion("intel_address like", value, "intelAddress");
            return (Criteria) this;
        }

        public Criteria andIntelAddressNotLike(String value) {
            addCriterion("intel_address not like", value, "intelAddress");
            return (Criteria) this;
        }

        public Criteria andIntelAddressIn(List<String> values) {
            addCriterion("intel_address in", values, "intelAddress");
            return (Criteria) this;
        }

        public Criteria andIntelAddressNotIn(List<String> values) {
            addCriterion("intel_address not in", values, "intelAddress");
            return (Criteria) this;
        }

        public Criteria andIntelAddressBetween(String value1, String value2) {
            addCriterion("intel_address between", value1, value2, "intelAddress");
            return (Criteria) this;
        }

        public Criteria andIntelAddressNotBetween(String value1, String value2) {
            addCriterion("intel_address not between", value1, value2, "intelAddress");
            return (Criteria) this;
        }

        public Criteria andCzNumIsNull() {
            addCriterion("cz_num is null");
            return (Criteria) this;
        }

        public Criteria andCzNumIsNotNull() {
            addCriterion("cz_num is not null");
            return (Criteria) this;
        }

        public Criteria andCzNumEqualTo(String value) {
            addCriterion("cz_num =", value, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumNotEqualTo(String value) {
            addCriterion("cz_num <>", value, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumGreaterThan(String value) {
            addCriterion("cz_num >", value, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumGreaterThanOrEqualTo(String value) {
            addCriterion("cz_num >=", value, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumLessThan(String value) {
            addCriterion("cz_num <", value, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumLessThanOrEqualTo(String value) {
            addCriterion("cz_num <=", value, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumLike(String value) {
            addCriterion("cz_num like", value, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumNotLike(String value) {
            addCriterion("cz_num not like", value, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumIn(List<String> values) {
            addCriterion("cz_num in", values, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumNotIn(List<String> values) {
            addCriterion("cz_num not in", values, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumBetween(String value1, String value2) {
            addCriterion("cz_num between", value1, value2, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumNotBetween(String value1, String value2) {
            addCriterion("cz_num not between", value1, value2, "czNum");
            return (Criteria) this;
        }

        public Criteria andStartcgRkDateIsNull() {
            addCriterion("startcg_rk_date is null");
            return (Criteria) this;
        }

        public Criteria andStartcgRkDateIsNotNull() {
            addCriterion("startcg_rk_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartcgRkDateEqualTo(Date value) {
            addCriterionForJDBCDate("startcg_rk_date =", value, "startcgRkDate");
            return (Criteria) this;
        }

        public Criteria andStartcgRkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("startcg_rk_date <>", value, "startcgRkDate");
            return (Criteria) this;
        }

        public Criteria andStartcgRkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("startcg_rk_date >", value, "startcgRkDate");
            return (Criteria) this;
        }

        public Criteria andStartcgRkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startcg_rk_date >=", value, "startcgRkDate");
            return (Criteria) this;
        }

        public Criteria andStartcgRkDateLessThan(Date value) {
            addCriterionForJDBCDate("startcg_rk_date <", value, "startcgRkDate");
            return (Criteria) this;
        }

        public Criteria andStartcgRkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startcg_rk_date <=", value, "startcgRkDate");
            return (Criteria) this;
        }

        public Criteria andStartcgRkDateIn(List<Date> values) {
            addCriterionForJDBCDate("startcg_rk_date in", values, "startcgRkDate");
            return (Criteria) this;
        }

        public Criteria andStartcgRkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("startcg_rk_date not in", values, "startcgRkDate");
            return (Criteria) this;
        }

        public Criteria andStartcgRkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startcg_rk_date between", value1, value2, "startcgRkDate");
            return (Criteria) this;
        }

        public Criteria andStartcgRkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startcg_rk_date not between", value1, value2, "startcgRkDate");
            return (Criteria) this;
        }

        public Criteria andStartcgThDateIsNull() {
            addCriterion("startcg_th_date is null");
            return (Criteria) this;
        }

        public Criteria andStartcgThDateIsNotNull() {
            addCriterion("startcg_th_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartcgThDateEqualTo(Date value) {
            addCriterionForJDBCDate("startcg_th_date =", value, "startcgThDate");
            return (Criteria) this;
        }

        public Criteria andStartcgThDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("startcg_th_date <>", value, "startcgThDate");
            return (Criteria) this;
        }

        public Criteria andStartcgThDateGreaterThan(Date value) {
            addCriterionForJDBCDate("startcg_th_date >", value, "startcgThDate");
            return (Criteria) this;
        }

        public Criteria andStartcgThDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startcg_th_date >=", value, "startcgThDate");
            return (Criteria) this;
        }

        public Criteria andStartcgThDateLessThan(Date value) {
            addCriterionForJDBCDate("startcg_th_date <", value, "startcgThDate");
            return (Criteria) this;
        }

        public Criteria andStartcgThDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startcg_th_date <=", value, "startcgThDate");
            return (Criteria) this;
        }

        public Criteria andStartcgThDateIn(List<Date> values) {
            addCriterionForJDBCDate("startcg_th_date in", values, "startcgThDate");
            return (Criteria) this;
        }

        public Criteria andStartcgThDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("startcg_th_date not in", values, "startcgThDate");
            return (Criteria) this;
        }

        public Criteria andStartcgThDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startcg_th_date between", value1, value2, "startcgThDate");
            return (Criteria) this;
        }

        public Criteria andStartcgThDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startcg_th_date not between", value1, value2, "startcgThDate");
            return (Criteria) this;
        }

        public Criteria andNearcgRkDateIsNull() {
            addCriterion("nearcg_rk_date is null");
            return (Criteria) this;
        }

        public Criteria andNearcgRkDateIsNotNull() {
            addCriterion("nearcg_rk_date is not null");
            return (Criteria) this;
        }

        public Criteria andNearcgRkDateEqualTo(Date value) {
            addCriterionForJDBCDate("nearcg_rk_date =", value, "nearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andNearcgRkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("nearcg_rk_date <>", value, "nearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andNearcgRkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("nearcg_rk_date >", value, "nearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andNearcgRkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nearcg_rk_date >=", value, "nearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andNearcgRkDateLessThan(Date value) {
            addCriterionForJDBCDate("nearcg_rk_date <", value, "nearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andNearcgRkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nearcg_rk_date <=", value, "nearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andNearcgRkDateIn(List<Date> values) {
            addCriterionForJDBCDate("nearcg_rk_date in", values, "nearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andNearcgRkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("nearcg_rk_date not in", values, "nearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andNearcgRkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nearcg_rk_date between", value1, value2, "nearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andNearcgRkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nearcg_rk_date not between", value1, value2, "nearcgRkDate");
            return (Criteria) this;
        }

        public Criteria andNearcgThDateIsNull() {
            addCriterion("nearcg_th_date is null");
            return (Criteria) this;
        }

        public Criteria andNearcgThDateIsNotNull() {
            addCriterion("nearcg_th_date is not null");
            return (Criteria) this;
        }

        public Criteria andNearcgThDateEqualTo(Date value) {
            addCriterionForJDBCDate("nearcg_th_date =", value, "nearcgThDate");
            return (Criteria) this;
        }

        public Criteria andNearcgThDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("nearcg_th_date <>", value, "nearcgThDate");
            return (Criteria) this;
        }

        public Criteria andNearcgThDateGreaterThan(Date value) {
            addCriterionForJDBCDate("nearcg_th_date >", value, "nearcgThDate");
            return (Criteria) this;
        }

        public Criteria andNearcgThDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nearcg_th_date >=", value, "nearcgThDate");
            return (Criteria) this;
        }

        public Criteria andNearcgThDateLessThan(Date value) {
            addCriterionForJDBCDate("nearcg_th_date <", value, "nearcgThDate");
            return (Criteria) this;
        }

        public Criteria andNearcgThDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("nearcg_th_date <=", value, "nearcgThDate");
            return (Criteria) this;
        }

        public Criteria andNearcgThDateIn(List<Date> values) {
            addCriterionForJDBCDate("nearcg_th_date in", values, "nearcgThDate");
            return (Criteria) this;
        }

        public Criteria andNearcgThDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("nearcg_th_date not in", values, "nearcgThDate");
            return (Criteria) this;
        }

        public Criteria andNearcgThDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nearcg_th_date between", value1, value2, "nearcgThDate");
            return (Criteria) this;
        }

        public Criteria andNearcgThDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("nearcg_th_date not between", value1, value2, "nearcgThDate");
            return (Criteria) this;
        }

        public Criteria andPriceHsBlIsNull() {
            addCriterion("price_hs_bl is null");
            return (Criteria) this;
        }

        public Criteria andPriceHsBlIsNotNull() {
            addCriterion("price_hs_bl is not null");
            return (Criteria) this;
        }

        public Criteria andPriceHsBlEqualTo(Boolean value) {
            addCriterion("price_hs_bl =", value, "priceHsBl");
            return (Criteria) this;
        }

        public Criteria andPriceHsBlNotEqualTo(Boolean value) {
            addCriterion("price_hs_bl <>", value, "priceHsBl");
            return (Criteria) this;
        }

        public Criteria andPriceHsBlGreaterThan(Boolean value) {
            addCriterion("price_hs_bl >", value, "priceHsBl");
            return (Criteria) this;
        }

        public Criteria andPriceHsBlGreaterThanOrEqualTo(Boolean value) {
            addCriterion("price_hs_bl >=", value, "priceHsBl");
            return (Criteria) this;
        }

        public Criteria andPriceHsBlLessThan(Boolean value) {
            addCriterion("price_hs_bl <", value, "priceHsBl");
            return (Criteria) this;
        }

        public Criteria andPriceHsBlLessThanOrEqualTo(Boolean value) {
            addCriterion("price_hs_bl <=", value, "priceHsBl");
            return (Criteria) this;
        }

        public Criteria andPriceHsBlIn(List<Boolean> values) {
            addCriterion("price_hs_bl in", values, "priceHsBl");
            return (Criteria) this;
        }

        public Criteria andPriceHsBlNotIn(List<Boolean> values) {
            addCriterion("price_hs_bl not in", values, "priceHsBl");
            return (Criteria) this;
        }

        public Criteria andPriceHsBlBetween(Boolean value1, Boolean value2) {
            addCriterion("price_hs_bl between", value1, value2, "priceHsBl");
            return (Criteria) this;
        }

        public Criteria andPriceHsBlNotBetween(Boolean value1, Boolean value2) {
            addCriterion("price_hs_bl not between", value1, value2, "priceHsBl");
            return (Criteria) this;
        }

        public Criteria andEndJyDateIsNull() {
            addCriterion("end_jy_date is null");
            return (Criteria) this;
        }

        public Criteria andEndJyDateIsNotNull() {
            addCriterion("end_jy_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndJyDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_jy_date =", value, "endJyDate");
            return (Criteria) this;
        }

        public Criteria andEndJyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_jy_date <>", value, "endJyDate");
            return (Criteria) this;
        }

        public Criteria andEndJyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_jy_date >", value, "endJyDate");
            return (Criteria) this;
        }

        public Criteria andEndJyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_jy_date >=", value, "endJyDate");
            return (Criteria) this;
        }

        public Criteria andEndJyDateLessThan(Date value) {
            addCriterionForJDBCDate("end_jy_date <", value, "endJyDate");
            return (Criteria) this;
        }

        public Criteria andEndJyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_jy_date <=", value, "endJyDate");
            return (Criteria) this;
        }

        public Criteria andEndJyDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_jy_date in", values, "endJyDate");
            return (Criteria) this;
        }

        public Criteria andEndJyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_jy_date not in", values, "endJyDate");
            return (Criteria) this;
        }

        public Criteria andEndJyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_jy_date between", value1, value2, "endJyDate");
            return (Criteria) this;
        }

        public Criteria andEndJyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_jy_date not between", value1, value2, "endJyDate");
            return (Criteria) this;
        }

        public Criteria andZkTotalmoneyIsNull() {
            addCriterion("zk_totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andZkTotalmoneyIsNotNull() {
            addCriterion("zk_totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andZkTotalmoneyEqualTo(Double value) {
            addCriterion("zk_totalmoney =", value, "zkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andZkTotalmoneyNotEqualTo(Double value) {
            addCriterion("zk_totalmoney <>", value, "zkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andZkTotalmoneyGreaterThan(Double value) {
            addCriterion("zk_totalmoney >", value, "zkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andZkTotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("zk_totalmoney >=", value, "zkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andZkTotalmoneyLessThan(Double value) {
            addCriterion("zk_totalmoney <", value, "zkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andZkTotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("zk_totalmoney <=", value, "zkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andZkTotalmoneyIn(List<Double> values) {
            addCriterion("zk_totalmoney in", values, "zkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andZkTotalmoneyNotIn(List<Double> values) {
            addCriterion("zk_totalmoney not in", values, "zkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andZkTotalmoneyBetween(Double value1, Double value2) {
            addCriterion("zk_totalmoney between", value1, value2, "zkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andZkTotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("zk_totalmoney not between", value1, value2, "zkTotalmoney");
            return (Criteria) this;
        }

        public Criteria andSyMoneyIsNull() {
            addCriterion("sy_money is null");
            return (Criteria) this;
        }

        public Criteria andSyMoneyIsNotNull() {
            addCriterion("sy_money is not null");
            return (Criteria) this;
        }

        public Criteria andSyMoneyEqualTo(Double value) {
            addCriterion("sy_money =", value, "syMoney");
            return (Criteria) this;
        }

        public Criteria andSyMoneyNotEqualTo(Double value) {
            addCriterion("sy_money <>", value, "syMoney");
            return (Criteria) this;
        }

        public Criteria andSyMoneyGreaterThan(Double value) {
            addCriterion("sy_money >", value, "syMoney");
            return (Criteria) this;
        }

        public Criteria andSyMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("sy_money >=", value, "syMoney");
            return (Criteria) this;
        }

        public Criteria andSyMoneyLessThan(Double value) {
            addCriterion("sy_money <", value, "syMoney");
            return (Criteria) this;
        }

        public Criteria andSyMoneyLessThanOrEqualTo(Double value) {
            addCriterion("sy_money <=", value, "syMoney");
            return (Criteria) this;
        }

        public Criteria andSyMoneyIn(List<Double> values) {
            addCriterion("sy_money in", values, "syMoney");
            return (Criteria) this;
        }

        public Criteria andSyMoneyNotIn(List<Double> values) {
            addCriterion("sy_money not in", values, "syMoney");
            return (Criteria) this;
        }

        public Criteria andSyMoneyBetween(Double value1, Double value2) {
            addCriterion("sy_money between", value1, value2, "syMoney");
            return (Criteria) this;
        }

        public Criteria andSyMoneyNotBetween(Double value1, Double value2) {
            addCriterion("sy_money not between", value1, value2, "syMoney");
            return (Criteria) this;
        }

        public Criteria andFkWhereIsNull() {
            addCriterion("fk_where is null");
            return (Criteria) this;
        }

        public Criteria andFkWhereIsNotNull() {
            addCriterion("fk_where is not null");
            return (Criteria) this;
        }

        public Criteria andFkWhereEqualTo(Integer value) {
            addCriterion("fk_where =", value, "fkWhere");
            return (Criteria) this;
        }

        public Criteria andFkWhereNotEqualTo(Integer value) {
            addCriterion("fk_where <>", value, "fkWhere");
            return (Criteria) this;
        }

        public Criteria andFkWhereGreaterThan(Integer value) {
            addCriterion("fk_where >", value, "fkWhere");
            return (Criteria) this;
        }

        public Criteria andFkWhereGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_where >=", value, "fkWhere");
            return (Criteria) this;
        }

        public Criteria andFkWhereLessThan(Integer value) {
            addCriterion("fk_where <", value, "fkWhere");
            return (Criteria) this;
        }

        public Criteria andFkWhereLessThanOrEqualTo(Integer value) {
            addCriterion("fk_where <=", value, "fkWhere");
            return (Criteria) this;
        }

        public Criteria andFkWhereIn(List<Integer> values) {
            addCriterion("fk_where in", values, "fkWhere");
            return (Criteria) this;
        }

        public Criteria andFkWhereNotIn(List<Integer> values) {
            addCriterion("fk_where not in", values, "fkWhere");
            return (Criteria) this;
        }

        public Criteria andFkWhereBetween(Integer value1, Integer value2) {
            addCriterion("fk_where between", value1, value2, "fkWhere");
            return (Criteria) this;
        }

        public Criteria andFkWhereNotBetween(Integer value1, Integer value2) {
            addCriterion("fk_where not between", value1, value2, "fkWhere");
            return (Criteria) this;
        }

        public Criteria andWhereDayIsNull() {
            addCriterion("where_day is null");
            return (Criteria) this;
        }

        public Criteria andWhereDayIsNotNull() {
            addCriterion("where_day is not null");
            return (Criteria) this;
        }

        public Criteria andWhereDayEqualTo(Integer value) {
            addCriterion("where_day =", value, "whereDay");
            return (Criteria) this;
        }

        public Criteria andWhereDayNotEqualTo(Integer value) {
            addCriterion("where_day <>", value, "whereDay");
            return (Criteria) this;
        }

        public Criteria andWhereDayGreaterThan(Integer value) {
            addCriterion("where_day >", value, "whereDay");
            return (Criteria) this;
        }

        public Criteria andWhereDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("where_day >=", value, "whereDay");
            return (Criteria) this;
        }

        public Criteria andWhereDayLessThan(Integer value) {
            addCriterion("where_day <", value, "whereDay");
            return (Criteria) this;
        }

        public Criteria andWhereDayLessThanOrEqualTo(Integer value) {
            addCriterion("where_day <=", value, "whereDay");
            return (Criteria) this;
        }

        public Criteria andWhereDayIn(List<Integer> values) {
            addCriterion("where_day in", values, "whereDay");
            return (Criteria) this;
        }

        public Criteria andWhereDayNotIn(List<Integer> values) {
            addCriterion("where_day not in", values, "whereDay");
            return (Criteria) this;
        }

        public Criteria andWhereDayBetween(Integer value1, Integer value2) {
            addCriterion("where_day between", value1, value2, "whereDay");
            return (Criteria) this;
        }

        public Criteria andWhereDayNotBetween(Integer value1, Integer value2) {
            addCriterion("where_day not between", value1, value2, "whereDay");
            return (Criteria) this;
        }

        public Criteria andMonthJzDateIsNull() {
            addCriterion("month_jz_date is null");
            return (Criteria) this;
        }

        public Criteria andMonthJzDateIsNotNull() {
            addCriterion("month_jz_date is not null");
            return (Criteria) this;
        }

        public Criteria andMonthJzDateEqualTo(Date value) {
            addCriterionForJDBCDate("month_jz_date =", value, "monthJzDate");
            return (Criteria) this;
        }

        public Criteria andMonthJzDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("month_jz_date <>", value, "monthJzDate");
            return (Criteria) this;
        }

        public Criteria andMonthJzDateGreaterThan(Date value) {
            addCriterionForJDBCDate("month_jz_date >", value, "monthJzDate");
            return (Criteria) this;
        }

        public Criteria andMonthJzDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("month_jz_date >=", value, "monthJzDate");
            return (Criteria) this;
        }

        public Criteria andMonthJzDateLessThan(Date value) {
            addCriterionForJDBCDate("month_jz_date <", value, "monthJzDate");
            return (Criteria) this;
        }

        public Criteria andMonthJzDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("month_jz_date <=", value, "monthJzDate");
            return (Criteria) this;
        }

        public Criteria andMonthJzDateIn(List<Date> values) {
            addCriterionForJDBCDate("month_jz_date in", values, "monthJzDate");
            return (Criteria) this;
        }

        public Criteria andMonthJzDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("month_jz_date not in", values, "monthJzDate");
            return (Criteria) this;
        }

        public Criteria andMonthJzDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("month_jz_date between", value1, value2, "monthJzDate");
            return (Criteria) this;
        }

        public Criteria andMonthJzDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("month_jz_date not between", value1, value2, "monthJzDate");
            return (Criteria) this;
        }

        public Criteria andXyLevelIsNull() {
            addCriterion("xy_level is null");
            return (Criteria) this;
        }

        public Criteria andXyLevelIsNotNull() {
            addCriterion("xy_level is not null");
            return (Criteria) this;
        }

        public Criteria andXyLevelEqualTo(Integer value) {
            addCriterion("xy_level =", value, "xyLevel");
            return (Criteria) this;
        }

        public Criteria andXyLevelNotEqualTo(Integer value) {
            addCriterion("xy_level <>", value, "xyLevel");
            return (Criteria) this;
        }

        public Criteria andXyLevelGreaterThan(Integer value) {
            addCriterion("xy_level >", value, "xyLevel");
            return (Criteria) this;
        }

        public Criteria andXyLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("xy_level >=", value, "xyLevel");
            return (Criteria) this;
        }

        public Criteria andXyLevelLessThan(Integer value) {
            addCriterion("xy_level <", value, "xyLevel");
            return (Criteria) this;
        }

        public Criteria andXyLevelLessThanOrEqualTo(Integer value) {
            addCriterion("xy_level <=", value, "xyLevel");
            return (Criteria) this;
        }

        public Criteria andXyLevelIn(List<Integer> values) {
            addCriterion("xy_level in", values, "xyLevel");
            return (Criteria) this;
        }

        public Criteria andXyLevelNotIn(List<Integer> values) {
            addCriterion("xy_level not in", values, "xyLevel");
            return (Criteria) this;
        }

        public Criteria andXyLevelBetween(Integer value1, Integer value2) {
            addCriterion("xy_level between", value1, value2, "xyLevel");
            return (Criteria) this;
        }

        public Criteria andXyLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("xy_level not between", value1, value2, "xyLevel");
            return (Criteria) this;
        }

        public Criteria andFpTypeidIsNull() {
            addCriterion("fp_typeid is null");
            return (Criteria) this;
        }

        public Criteria andFpTypeidIsNotNull() {
            addCriterion("fp_typeid is not null");
            return (Criteria) this;
        }

        public Criteria andFpTypeidEqualTo(Integer value) {
            addCriterion("fp_typeid =", value, "fpTypeid");
            return (Criteria) this;
        }

        public Criteria andFpTypeidNotEqualTo(Integer value) {
            addCriterion("fp_typeid <>", value, "fpTypeid");
            return (Criteria) this;
        }

        public Criteria andFpTypeidGreaterThan(Integer value) {
            addCriterion("fp_typeid >", value, "fpTypeid");
            return (Criteria) this;
        }

        public Criteria andFpTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fp_typeid >=", value, "fpTypeid");
            return (Criteria) this;
        }

        public Criteria andFpTypeidLessThan(Integer value) {
            addCriterion("fp_typeid <", value, "fpTypeid");
            return (Criteria) this;
        }

        public Criteria andFpTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("fp_typeid <=", value, "fpTypeid");
            return (Criteria) this;
        }

        public Criteria andFpTypeidIn(List<Integer> values) {
            addCriterion("fp_typeid in", values, "fpTypeid");
            return (Criteria) this;
        }

        public Criteria andFpTypeidNotIn(List<Integer> values) {
            addCriterion("fp_typeid not in", values, "fpTypeid");
            return (Criteria) this;
        }

        public Criteria andFpTypeidBetween(Integer value1, Integer value2) {
            addCriterion("fp_typeid between", value1, value2, "fpTypeid");
            return (Criteria) this;
        }

        public Criteria andFpTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("fp_typeid not between", value1, value2, "fpTypeid");
            return (Criteria) this;
        }

        public Criteria andStartYufMoneyIsNull() {
            addCriterion("start_yuf_money is null");
            return (Criteria) this;
        }

        public Criteria andStartYufMoneyIsNotNull() {
            addCriterion("start_yuf_money is not null");
            return (Criteria) this;
        }

        public Criteria andStartYufMoneyEqualTo(Double value) {
            addCriterion("start_yuf_money =", value, "startYufMoney");
            return (Criteria) this;
        }

        public Criteria andStartYufMoneyNotEqualTo(Double value) {
            addCriterion("start_yuf_money <>", value, "startYufMoney");
            return (Criteria) this;
        }

        public Criteria andStartYufMoneyGreaterThan(Double value) {
            addCriterion("start_yuf_money >", value, "startYufMoney");
            return (Criteria) this;
        }

        public Criteria andStartYufMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("start_yuf_money >=", value, "startYufMoney");
            return (Criteria) this;
        }

        public Criteria andStartYufMoneyLessThan(Double value) {
            addCriterion("start_yuf_money <", value, "startYufMoney");
            return (Criteria) this;
        }

        public Criteria andStartYufMoneyLessThanOrEqualTo(Double value) {
            addCriterion("start_yuf_money <=", value, "startYufMoney");
            return (Criteria) this;
        }

        public Criteria andStartYufMoneyIn(List<Double> values) {
            addCriterion("start_yuf_money in", values, "startYufMoney");
            return (Criteria) this;
        }

        public Criteria andStartYufMoneyNotIn(List<Double> values) {
            addCriterion("start_yuf_money not in", values, "startYufMoney");
            return (Criteria) this;
        }

        public Criteria andStartYufMoneyBetween(Double value1, Double value2) {
            addCriterion("start_yuf_money between", value1, value2, "startYufMoney");
            return (Criteria) this;
        }

        public Criteria andStartYufMoneyNotBetween(Double value1, Double value2) {
            addCriterion("start_yuf_money not between", value1, value2, "startYufMoney");
            return (Criteria) this;
        }

        public Criteria andStartYinfMoneyIsNull() {
            addCriterion("start_yinf_money is null");
            return (Criteria) this;
        }

        public Criteria andStartYinfMoneyIsNotNull() {
            addCriterion("start_yinf_money is not null");
            return (Criteria) this;
        }

        public Criteria andStartYinfMoneyEqualTo(Double value) {
            addCriterion("start_yinf_money =", value, "startYinfMoney");
            return (Criteria) this;
        }

        public Criteria andStartYinfMoneyNotEqualTo(Double value) {
            addCriterion("start_yinf_money <>", value, "startYinfMoney");
            return (Criteria) this;
        }

        public Criteria andStartYinfMoneyGreaterThan(Double value) {
            addCriterion("start_yinf_money >", value, "startYinfMoney");
            return (Criteria) this;
        }

        public Criteria andStartYinfMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("start_yinf_money >=", value, "startYinfMoney");
            return (Criteria) this;
        }

        public Criteria andStartYinfMoneyLessThan(Double value) {
            addCriterion("start_yinf_money <", value, "startYinfMoney");
            return (Criteria) this;
        }

        public Criteria andStartYinfMoneyLessThanOrEqualTo(Double value) {
            addCriterion("start_yinf_money <=", value, "startYinfMoney");
            return (Criteria) this;
        }

        public Criteria andStartYinfMoneyIn(List<Double> values) {
            addCriterion("start_yinf_money in", values, "startYinfMoney");
            return (Criteria) this;
        }

        public Criteria andStartYinfMoneyNotIn(List<Double> values) {
            addCriterion("start_yinf_money not in", values, "startYinfMoney");
            return (Criteria) this;
        }

        public Criteria andStartYinfMoneyBetween(Double value1, Double value2) {
            addCriterion("start_yinf_money between", value1, value2, "startYinfMoney");
            return (Criteria) this;
        }

        public Criteria andStartYinfMoneyNotBetween(Double value1, Double value2) {
            addCriterion("start_yinf_money not between", value1, value2, "startYinfMoney");
            return (Criteria) this;
        }

        public Criteria andLastYufMoneyIsNull() {
            addCriterion("last_yuf_money is null");
            return (Criteria) this;
        }

        public Criteria andLastYufMoneyIsNotNull() {
            addCriterion("last_yuf_money is not null");
            return (Criteria) this;
        }

        public Criteria andLastYufMoneyEqualTo(Double value) {
            addCriterion("last_yuf_money =", value, "lastYufMoney");
            return (Criteria) this;
        }

        public Criteria andLastYufMoneyNotEqualTo(Double value) {
            addCriterion("last_yuf_money <>", value, "lastYufMoney");
            return (Criteria) this;
        }

        public Criteria andLastYufMoneyGreaterThan(Double value) {
            addCriterion("last_yuf_money >", value, "lastYufMoney");
            return (Criteria) this;
        }

        public Criteria andLastYufMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("last_yuf_money >=", value, "lastYufMoney");
            return (Criteria) this;
        }

        public Criteria andLastYufMoneyLessThan(Double value) {
            addCriterion("last_yuf_money <", value, "lastYufMoney");
            return (Criteria) this;
        }

        public Criteria andLastYufMoneyLessThanOrEqualTo(Double value) {
            addCriterion("last_yuf_money <=", value, "lastYufMoney");
            return (Criteria) this;
        }

        public Criteria andLastYufMoneyIn(List<Double> values) {
            addCriterion("last_yuf_money in", values, "lastYufMoney");
            return (Criteria) this;
        }

        public Criteria andLastYufMoneyNotIn(List<Double> values) {
            addCriterion("last_yuf_money not in", values, "lastYufMoney");
            return (Criteria) this;
        }

        public Criteria andLastYufMoneyBetween(Double value1, Double value2) {
            addCriterion("last_yuf_money between", value1, value2, "lastYufMoney");
            return (Criteria) this;
        }

        public Criteria andLastYufMoneyNotBetween(Double value1, Double value2) {
            addCriterion("last_yuf_money not between", value1, value2, "lastYufMoney");
            return (Criteria) this;
        }

        public Criteria andLastYinfMonetIsNull() {
            addCriterion("last_yinf_monet is null");
            return (Criteria) this;
        }

        public Criteria andLastYinfMonetIsNotNull() {
            addCriterion("last_yinf_monet is not null");
            return (Criteria) this;
        }

        public Criteria andLastYinfMonetEqualTo(Double value) {
            addCriterion("last_yinf_monet =", value, "lastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andLastYinfMonetNotEqualTo(Double value) {
            addCriterion("last_yinf_monet <>", value, "lastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andLastYinfMonetGreaterThan(Double value) {
            addCriterion("last_yinf_monet >", value, "lastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andLastYinfMonetGreaterThanOrEqualTo(Double value) {
            addCriterion("last_yinf_monet >=", value, "lastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andLastYinfMonetLessThan(Double value) {
            addCriterion("last_yinf_monet <", value, "lastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andLastYinfMonetLessThanOrEqualTo(Double value) {
            addCriterion("last_yinf_monet <=", value, "lastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andLastYinfMonetIn(List<Double> values) {
            addCriterion("last_yinf_monet in", values, "lastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andLastYinfMonetNotIn(List<Double> values) {
            addCriterion("last_yinf_monet not in", values, "lastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andLastYinfMonetBetween(Double value1, Double value2) {
            addCriterion("last_yinf_monet between", value1, value2, "lastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andLastYinfMonetNotBetween(Double value1, Double value2) {
            addCriterion("last_yinf_monet not between", value1, value2, "lastYinfMonet");
            return (Criteria) this;
        }

        public Criteria andYufzkSubjectidIsNull() {
            addCriterion("yufzk_subjectid is null");
            return (Criteria) this;
        }

        public Criteria andYufzkSubjectidIsNotNull() {
            addCriterion("yufzk_subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andYufzkSubjectidEqualTo(Integer value) {
            addCriterion("yufzk_subjectid =", value, "yufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYufzkSubjectidNotEqualTo(Integer value) {
            addCriterion("yufzk_subjectid <>", value, "yufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYufzkSubjectidGreaterThan(Integer value) {
            addCriterion("yufzk_subjectid >", value, "yufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYufzkSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yufzk_subjectid >=", value, "yufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYufzkSubjectidLessThan(Integer value) {
            addCriterion("yufzk_subjectid <", value, "yufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYufzkSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("yufzk_subjectid <=", value, "yufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYufzkSubjectidIn(List<Integer> values) {
            addCriterion("yufzk_subjectid in", values, "yufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYufzkSubjectidNotIn(List<Integer> values) {
            addCriterion("yufzk_subjectid not in", values, "yufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYufzkSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("yufzk_subjectid between", value1, value2, "yufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYufzkSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("yufzk_subjectid not between", value1, value2, "yufzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzkSubjectidIsNull() {
            addCriterion("yinfzk_subjectid is null");
            return (Criteria) this;
        }

        public Criteria andYinfzkSubjectidIsNotNull() {
            addCriterion("yinfzk_subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andYinfzkSubjectidEqualTo(Integer value) {
            addCriterion("yinfzk_subjectid =", value, "yinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzkSubjectidNotEqualTo(Integer value) {
            addCriterion("yinfzk_subjectid <>", value, "yinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzkSubjectidGreaterThan(Integer value) {
            addCriterion("yinfzk_subjectid >", value, "yinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzkSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yinfzk_subjectid >=", value, "yinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzkSubjectidLessThan(Integer value) {
            addCriterion("yinfzk_subjectid <", value, "yinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzkSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("yinfzk_subjectid <=", value, "yinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzkSubjectidIn(List<Integer> values) {
            addCriterion("yinfzk_subjectid in", values, "yinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzkSubjectidNotIn(List<Integer> values) {
            addCriterion("yinfzk_subjectid not in", values, "yinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzkSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("yinfzk_subjectid between", value1, value2, "yinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzkSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("yinfzk_subjectid not between", value1, value2, "yinfzkSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzgSubjectidIsNull() {
            addCriterion("yinfzg_subjectid is null");
            return (Criteria) this;
        }

        public Criteria andYinfzgSubjectidIsNotNull() {
            addCriterion("yinfzg_subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andYinfzgSubjectidEqualTo(Integer value) {
            addCriterion("yinfzg_subjectid =", value, "yinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzgSubjectidNotEqualTo(Integer value) {
            addCriterion("yinfzg_subjectid <>", value, "yinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzgSubjectidGreaterThan(Integer value) {
            addCriterion("yinfzg_subjectid >", value, "yinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzgSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yinfzg_subjectid >=", value, "yinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzgSubjectidLessThan(Integer value) {
            addCriterion("yinfzg_subjectid <", value, "yinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzgSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("yinfzg_subjectid <=", value, "yinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzgSubjectidIn(List<Integer> values) {
            addCriterion("yinfzg_subjectid in", values, "yinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzgSubjectidNotIn(List<Integer> values) {
            addCriterion("yinfzg_subjectid not in", values, "yinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzgSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("yinfzg_subjectid between", value1, value2, "yinfzgSubjectid");
            return (Criteria) this;
        }

        public Criteria andYinfzgSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("yinfzg_subjectid not between", value1, value2, "yinfzgSubjectid");
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

        public Criteria andBz1IsNull() {
            addCriterion("bz1 is null");
            return (Criteria) this;
        }

        public Criteria andBz1IsNotNull() {
            addCriterion("bz1 is not null");
            return (Criteria) this;
        }

        public Criteria andBz1EqualTo(Integer value) {
            addCriterion("bz1 =", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotEqualTo(Integer value) {
            addCriterion("bz1 <>", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThan(Integer value) {
            addCriterion("bz1 >", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThanOrEqualTo(Integer value) {
            addCriterion("bz1 >=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThan(Integer value) {
            addCriterion("bz1 <", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThanOrEqualTo(Integer value) {
            addCriterion("bz1 <=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1In(List<Integer> values) {
            addCriterion("bz1 in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotIn(List<Integer> values) {
            addCriterion("bz1 not in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1Between(Integer value1, Integer value2) {
            addCriterion("bz1 between", value1, value2, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotBetween(Integer value1, Integer value2) {
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

        public Criteria andBz2EqualTo(Integer value) {
            addCriterion("bz2 =", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotEqualTo(Integer value) {
            addCriterion("bz2 <>", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2GreaterThan(Integer value) {
            addCriterion("bz2 >", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2GreaterThanOrEqualTo(Integer value) {
            addCriterion("bz2 >=", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2LessThan(Integer value) {
            addCriterion("bz2 <", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2LessThanOrEqualTo(Integer value) {
            addCriterion("bz2 <=", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2In(List<Integer> values) {
            addCriterion("bz2 in", values, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotIn(List<Integer> values) {
            addCriterion("bz2 not in", values, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2Between(Integer value1, Integer value2) {
            addCriterion("bz2 between", value1, value2, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotBetween(Integer value1, Integer value2) {
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