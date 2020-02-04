package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PSMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PSMainExample() {
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

        public Criteria andPsmIdIsNull() {
            addCriterion("psm_id is null");
            return (Criteria) this;
        }

        public Criteria andPsmIdIsNotNull() {
            addCriterion("psm_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsmIdEqualTo(Integer value) {
            addCriterion("psm_id =", value, "psmId");
            return (Criteria) this;
        }

        public Criteria andPsmIdNotEqualTo(Integer value) {
            addCriterion("psm_id <>", value, "psmId");
            return (Criteria) this;
        }

        public Criteria andPsmIdGreaterThan(Integer value) {
            addCriterion("psm_id >", value, "psmId");
            return (Criteria) this;
        }

        public Criteria andPsmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("psm_id >=", value, "psmId");
            return (Criteria) this;
        }

        public Criteria andPsmIdLessThan(Integer value) {
            addCriterion("psm_id <", value, "psmId");
            return (Criteria) this;
        }

        public Criteria andPsmIdLessThanOrEqualTo(Integer value) {
            addCriterion("psm_id <=", value, "psmId");
            return (Criteria) this;
        }

        public Criteria andPsmIdIn(List<Integer> values) {
            addCriterion("psm_id in", values, "psmId");
            return (Criteria) this;
        }

        public Criteria andPsmIdNotIn(List<Integer> values) {
            addCriterion("psm_id not in", values, "psmId");
            return (Criteria) this;
        }

        public Criteria andPsmIdBetween(Integer value1, Integer value2) {
            addCriterion("psm_id between", value1, value2, "psmId");
            return (Criteria) this;
        }

        public Criteria andPsmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("psm_id not between", value1, value2, "psmId");
            return (Criteria) this;
        }

        public Criteria andPsmNumIsNull() {
            addCriterion("psm_num is null");
            return (Criteria) this;
        }

        public Criteria andPsmNumIsNotNull() {
            addCriterion("psm_num is not null");
            return (Criteria) this;
        }

        public Criteria andPsmNumEqualTo(String value) {
            addCriterion("psm_num =", value, "psmNum");
            return (Criteria) this;
        }

        public Criteria andPsmNumNotEqualTo(String value) {
            addCriterion("psm_num <>", value, "psmNum");
            return (Criteria) this;
        }

        public Criteria andPsmNumGreaterThan(String value) {
            addCriterion("psm_num >", value, "psmNum");
            return (Criteria) this;
        }

        public Criteria andPsmNumGreaterThanOrEqualTo(String value) {
            addCriterion("psm_num >=", value, "psmNum");
            return (Criteria) this;
        }

        public Criteria andPsmNumLessThan(String value) {
            addCriterion("psm_num <", value, "psmNum");
            return (Criteria) this;
        }

        public Criteria andPsmNumLessThanOrEqualTo(String value) {
            addCriterion("psm_num <=", value, "psmNum");
            return (Criteria) this;
        }

        public Criteria andPsmNumLike(String value) {
            addCriterion("psm_num like", value, "psmNum");
            return (Criteria) this;
        }

        public Criteria andPsmNumNotLike(String value) {
            addCriterion("psm_num not like", value, "psmNum");
            return (Criteria) this;
        }

        public Criteria andPsmNumIn(List<String> values) {
            addCriterion("psm_num in", values, "psmNum");
            return (Criteria) this;
        }

        public Criteria andPsmNumNotIn(List<String> values) {
            addCriterion("psm_num not in", values, "psmNum");
            return (Criteria) this;
        }

        public Criteria andPsmNumBetween(String value1, String value2) {
            addCriterion("psm_num between", value1, value2, "psmNum");
            return (Criteria) this;
        }

        public Criteria andPsmNumNotBetween(String value1, String value2) {
            addCriterion("psm_num not between", value1, value2, "psmNum");
            return (Criteria) this;
        }

        public Criteria andPsmDateIsNull() {
            addCriterion("psm_date is null");
            return (Criteria) this;
        }

        public Criteria andPsmDateIsNotNull() {
            addCriterion("psm_date is not null");
            return (Criteria) this;
        }

        public Criteria andPsmDateEqualTo(Date value) {
            addCriterionForJDBCDate("psm_date =", value, "psmDate");
            return (Criteria) this;
        }

        public Criteria andPsmDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("psm_date <>", value, "psmDate");
            return (Criteria) this;
        }

        public Criteria andPsmDateGreaterThan(Date value) {
            addCriterionForJDBCDate("psm_date >", value, "psmDate");
            return (Criteria) this;
        }

        public Criteria andPsmDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("psm_date >=", value, "psmDate");
            return (Criteria) this;
        }

        public Criteria andPsmDateLessThan(Date value) {
            addCriterionForJDBCDate("psm_date <", value, "psmDate");
            return (Criteria) this;
        }

        public Criteria andPsmDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("psm_date <=", value, "psmDate");
            return (Criteria) this;
        }

        public Criteria andPsmDateIn(List<Date> values) {
            addCriterionForJDBCDate("psm_date in", values, "psmDate");
            return (Criteria) this;
        }

        public Criteria andPsmDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("psm_date not in", values, "psmDate");
            return (Criteria) this;
        }

        public Criteria andPsmDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("psm_date between", value1, value2, "psmDate");
            return (Criteria) this;
        }

        public Criteria andPsmDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("psm_date not between", value1, value2, "psmDate");
            return (Criteria) this;
        }

        public Criteria andPsmSmIdIsNull() {
            addCriterion("psm_sm_id is null");
            return (Criteria) this;
        }

        public Criteria andPsmSmIdIsNotNull() {
            addCriterion("psm_sm_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsmSmIdEqualTo(Integer value) {
            addCriterion("psm_sm_id =", value, "psmSmId");
            return (Criteria) this;
        }

        public Criteria andPsmSmIdNotEqualTo(Integer value) {
            addCriterion("psm_sm_id <>", value, "psmSmId");
            return (Criteria) this;
        }

        public Criteria andPsmSmIdGreaterThan(Integer value) {
            addCriterion("psm_sm_id >", value, "psmSmId");
            return (Criteria) this;
        }

        public Criteria andPsmSmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("psm_sm_id >=", value, "psmSmId");
            return (Criteria) this;
        }

        public Criteria andPsmSmIdLessThan(Integer value) {
            addCriterion("psm_sm_id <", value, "psmSmId");
            return (Criteria) this;
        }

        public Criteria andPsmSmIdLessThanOrEqualTo(Integer value) {
            addCriterion("psm_sm_id <=", value, "psmSmId");
            return (Criteria) this;
        }

        public Criteria andPsmSmIdIn(List<Integer> values) {
            addCriterion("psm_sm_id in", values, "psmSmId");
            return (Criteria) this;
        }

        public Criteria andPsmSmIdNotIn(List<Integer> values) {
            addCriterion("psm_sm_id not in", values, "psmSmId");
            return (Criteria) this;
        }

        public Criteria andPsmSmIdBetween(Integer value1, Integer value2) {
            addCriterion("psm_sm_id between", value1, value2, "psmSmId");
            return (Criteria) this;
        }

        public Criteria andPsmSmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("psm_sm_id not between", value1, value2, "psmSmId");
            return (Criteria) this;
        }

        public Criteria andPsmTypeidIsNull() {
            addCriterion("psm_typeid is null");
            return (Criteria) this;
        }

        public Criteria andPsmTypeidIsNotNull() {
            addCriterion("psm_typeid is not null");
            return (Criteria) this;
        }

        public Criteria andPsmTypeidEqualTo(Integer value) {
            addCriterion("psm_typeid =", value, "psmTypeid");
            return (Criteria) this;
        }

        public Criteria andPsmTypeidNotEqualTo(Integer value) {
            addCriterion("psm_typeid <>", value, "psmTypeid");
            return (Criteria) this;
        }

        public Criteria andPsmTypeidGreaterThan(Integer value) {
            addCriterion("psm_typeid >", value, "psmTypeid");
            return (Criteria) this;
        }

        public Criteria andPsmTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("psm_typeid >=", value, "psmTypeid");
            return (Criteria) this;
        }

        public Criteria andPsmTypeidLessThan(Integer value) {
            addCriterion("psm_typeid <", value, "psmTypeid");
            return (Criteria) this;
        }

        public Criteria andPsmTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("psm_typeid <=", value, "psmTypeid");
            return (Criteria) this;
        }

        public Criteria andPsmTypeidIn(List<Integer> values) {
            addCriterion("psm_typeid in", values, "psmTypeid");
            return (Criteria) this;
        }

        public Criteria andPsmTypeidNotIn(List<Integer> values) {
            addCriterion("psm_typeid not in", values, "psmTypeid");
            return (Criteria) this;
        }

        public Criteria andPsmTypeidBetween(Integer value1, Integer value2) {
            addCriterion("psm_typeid between", value1, value2, "psmTypeid");
            return (Criteria) this;
        }

        public Criteria andPsmTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("psm_typeid not between", value1, value2, "psmTypeid");
            return (Criteria) this;
        }

        public Criteria andPsmBbIdIsNull() {
            addCriterion("psm_bb_id is null");
            return (Criteria) this;
        }

        public Criteria andPsmBbIdIsNotNull() {
            addCriterion("psm_bb_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsmBbIdEqualTo(Integer value) {
            addCriterion("psm_bb_id =", value, "psmBbId");
            return (Criteria) this;
        }

        public Criteria andPsmBbIdNotEqualTo(Integer value) {
            addCriterion("psm_bb_id <>", value, "psmBbId");
            return (Criteria) this;
        }

        public Criteria andPsmBbIdGreaterThan(Integer value) {
            addCriterion("psm_bb_id >", value, "psmBbId");
            return (Criteria) this;
        }

        public Criteria andPsmBbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("psm_bb_id >=", value, "psmBbId");
            return (Criteria) this;
        }

        public Criteria andPsmBbIdLessThan(Integer value) {
            addCriterion("psm_bb_id <", value, "psmBbId");
            return (Criteria) this;
        }

        public Criteria andPsmBbIdLessThanOrEqualTo(Integer value) {
            addCriterion("psm_bb_id <=", value, "psmBbId");
            return (Criteria) this;
        }

        public Criteria andPsmBbIdIn(List<Integer> values) {
            addCriterion("psm_bb_id in", values, "psmBbId");
            return (Criteria) this;
        }

        public Criteria andPsmBbIdNotIn(List<Integer> values) {
            addCriterion("psm_bb_id not in", values, "psmBbId");
            return (Criteria) this;
        }

        public Criteria andPsmBbIdBetween(Integer value1, Integer value2) {
            addCriterion("psm_bb_id between", value1, value2, "psmBbId");
            return (Criteria) this;
        }

        public Criteria andPsmBbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("psm_bb_id not between", value1, value2, "psmBbId");
            return (Criteria) this;
        }

        public Criteria andPsmFlaghsIsNull() {
            addCriterion("psm_flaghs is null");
            return (Criteria) this;
        }

        public Criteria andPsmFlaghsIsNotNull() {
            addCriterion("psm_flaghs is not null");
            return (Criteria) this;
        }

        public Criteria andPsmFlaghsEqualTo(Boolean value) {
            addCriterion("psm_flaghs =", value, "psmFlaghs");
            return (Criteria) this;
        }

        public Criteria andPsmFlaghsNotEqualTo(Boolean value) {
            addCriterion("psm_flaghs <>", value, "psmFlaghs");
            return (Criteria) this;
        }

        public Criteria andPsmFlaghsGreaterThan(Boolean value) {
            addCriterion("psm_flaghs >", value, "psmFlaghs");
            return (Criteria) this;
        }

        public Criteria andPsmFlaghsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("psm_flaghs >=", value, "psmFlaghs");
            return (Criteria) this;
        }

        public Criteria andPsmFlaghsLessThan(Boolean value) {
            addCriterion("psm_flaghs <", value, "psmFlaghs");
            return (Criteria) this;
        }

        public Criteria andPsmFlaghsLessThanOrEqualTo(Boolean value) {
            addCriterion("psm_flaghs <=", value, "psmFlaghs");
            return (Criteria) this;
        }

        public Criteria andPsmFlaghsIn(List<Boolean> values) {
            addCriterion("psm_flaghs in", values, "psmFlaghs");
            return (Criteria) this;
        }

        public Criteria andPsmFlaghsNotIn(List<Boolean> values) {
            addCriterion("psm_flaghs not in", values, "psmFlaghs");
            return (Criteria) this;
        }

        public Criteria andPsmFlaghsBetween(Boolean value1, Boolean value2) {
            addCriterion("psm_flaghs between", value1, value2, "psmFlaghs");
            return (Criteria) this;
        }

        public Criteria andPsmFlaghsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("psm_flaghs not between", value1, value2, "psmFlaghs");
            return (Criteria) this;
        }

        public Criteria andPsmCkIdIsNull() {
            addCriterion("psm_ck_id is null");
            return (Criteria) this;
        }

        public Criteria andPsmCkIdIsNotNull() {
            addCriterion("psm_ck_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsmCkIdEqualTo(Integer value) {
            addCriterion("psm_ck_id =", value, "psmCkId");
            return (Criteria) this;
        }

        public Criteria andPsmCkIdNotEqualTo(Integer value) {
            addCriterion("psm_ck_id <>", value, "psmCkId");
            return (Criteria) this;
        }

        public Criteria andPsmCkIdGreaterThan(Integer value) {
            addCriterion("psm_ck_id >", value, "psmCkId");
            return (Criteria) this;
        }

        public Criteria andPsmCkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("psm_ck_id >=", value, "psmCkId");
            return (Criteria) this;
        }

        public Criteria andPsmCkIdLessThan(Integer value) {
            addCriterion("psm_ck_id <", value, "psmCkId");
            return (Criteria) this;
        }

        public Criteria andPsmCkIdLessThanOrEqualTo(Integer value) {
            addCriterion("psm_ck_id <=", value, "psmCkId");
            return (Criteria) this;
        }

        public Criteria andPsmCkIdIn(List<Integer> values) {
            addCriterion("psm_ck_id in", values, "psmCkId");
            return (Criteria) this;
        }

        public Criteria andPsmCkIdNotIn(List<Integer> values) {
            addCriterion("psm_ck_id not in", values, "psmCkId");
            return (Criteria) this;
        }

        public Criteria andPsmCkIdBetween(Integer value1, Integer value2) {
            addCriterion("psm_ck_id between", value1, value2, "psmCkId");
            return (Criteria) this;
        }

        public Criteria andPsmCkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("psm_ck_id not between", value1, value2, "psmCkId");
            return (Criteria) this;
        }

        public Criteria andPsmGwmyflagIsNull() {
            addCriterion("psm_gwmyflag is null");
            return (Criteria) this;
        }

        public Criteria andPsmGwmyflagIsNotNull() {
            addCriterion("psm_gwmyflag is not null");
            return (Criteria) this;
        }

        public Criteria andPsmGwmyflagEqualTo(Boolean value) {
            addCriterion("psm_gwmyflag =", value, "psmGwmyflag");
            return (Criteria) this;
        }

        public Criteria andPsmGwmyflagNotEqualTo(Boolean value) {
            addCriterion("psm_gwmyflag <>", value, "psmGwmyflag");
            return (Criteria) this;
        }

        public Criteria andPsmGwmyflagGreaterThan(Boolean value) {
            addCriterion("psm_gwmyflag >", value, "psmGwmyflag");
            return (Criteria) this;
        }

        public Criteria andPsmGwmyflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("psm_gwmyflag >=", value, "psmGwmyflag");
            return (Criteria) this;
        }

        public Criteria andPsmGwmyflagLessThan(Boolean value) {
            addCriterion("psm_gwmyflag <", value, "psmGwmyflag");
            return (Criteria) this;
        }

        public Criteria andPsmGwmyflagLessThanOrEqualTo(Boolean value) {
            addCriterion("psm_gwmyflag <=", value, "psmGwmyflag");
            return (Criteria) this;
        }

        public Criteria andPsmGwmyflagIn(List<Boolean> values) {
            addCriterion("psm_gwmyflag in", values, "psmGwmyflag");
            return (Criteria) this;
        }

        public Criteria andPsmGwmyflagNotIn(List<Boolean> values) {
            addCriterion("psm_gwmyflag not in", values, "psmGwmyflag");
            return (Criteria) this;
        }

        public Criteria andPsmGwmyflagBetween(Boolean value1, Boolean value2) {
            addCriterion("psm_gwmyflag between", value1, value2, "psmGwmyflag");
            return (Criteria) this;
        }

        public Criteria andPsmGwmyflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("psm_gwmyflag not between", value1, value2, "psmGwmyflag");
            return (Criteria) this;
        }

        public Criteria andPsmPznumIsNull() {
            addCriterion("psm_pznum is null");
            return (Criteria) this;
        }

        public Criteria andPsmPznumIsNotNull() {
            addCriterion("psm_pznum is not null");
            return (Criteria) this;
        }

        public Criteria andPsmPznumEqualTo(String value) {
            addCriterion("psm_pznum =", value, "psmPznum");
            return (Criteria) this;
        }

        public Criteria andPsmPznumNotEqualTo(String value) {
            addCriterion("psm_pznum <>", value, "psmPznum");
            return (Criteria) this;
        }

        public Criteria andPsmPznumGreaterThan(String value) {
            addCriterion("psm_pznum >", value, "psmPznum");
            return (Criteria) this;
        }

        public Criteria andPsmPznumGreaterThanOrEqualTo(String value) {
            addCriterion("psm_pznum >=", value, "psmPznum");
            return (Criteria) this;
        }

        public Criteria andPsmPznumLessThan(String value) {
            addCriterion("psm_pznum <", value, "psmPznum");
            return (Criteria) this;
        }

        public Criteria andPsmPznumLessThanOrEqualTo(String value) {
            addCriterion("psm_pznum <=", value, "psmPznum");
            return (Criteria) this;
        }

        public Criteria andPsmPznumLike(String value) {
            addCriterion("psm_pznum like", value, "psmPznum");
            return (Criteria) this;
        }

        public Criteria andPsmPznumNotLike(String value) {
            addCriterion("psm_pznum not like", value, "psmPznum");
            return (Criteria) this;
        }

        public Criteria andPsmPznumIn(List<String> values) {
            addCriterion("psm_pznum in", values, "psmPznum");
            return (Criteria) this;
        }

        public Criteria andPsmPznumNotIn(List<String> values) {
            addCriterion("psm_pznum not in", values, "psmPznum");
            return (Criteria) this;
        }

        public Criteria andPsmPznumBetween(String value1, String value2) {
            addCriterion("psm_pznum between", value1, value2, "psmPznum");
            return (Criteria) this;
        }

        public Criteria andPsmPznumNotBetween(String value1, String value2) {
            addCriterion("psm_pznum not between", value1, value2, "psmPznum");
            return (Criteria) this;
        }

        public Criteria andPsmCgpfmidIsNull() {
            addCriterion("psm_cgpfmid is null");
            return (Criteria) this;
        }

        public Criteria andPsmCgpfmidIsNotNull() {
            addCriterion("psm_cgpfmid is not null");
            return (Criteria) this;
        }

        public Criteria andPsmCgpfmidEqualTo(Integer value) {
            addCriterion("psm_cgpfmid =", value, "psmCgpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmCgpfmidNotEqualTo(Integer value) {
            addCriterion("psm_cgpfmid <>", value, "psmCgpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmCgpfmidGreaterThan(Integer value) {
            addCriterion("psm_cgpfmid >", value, "psmCgpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmCgpfmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("psm_cgpfmid >=", value, "psmCgpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmCgpfmidLessThan(Integer value) {
            addCriterion("psm_cgpfmid <", value, "psmCgpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmCgpfmidLessThanOrEqualTo(Integer value) {
            addCriterion("psm_cgpfmid <=", value, "psmCgpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmCgpfmidIn(List<Integer> values) {
            addCriterion("psm_cgpfmid in", values, "psmCgpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmCgpfmidNotIn(List<Integer> values) {
            addCriterion("psm_cgpfmid not in", values, "psmCgpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmCgpfmidBetween(Integer value1, Integer value2) {
            addCriterion("psm_cgpfmid between", value1, value2, "psmCgpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmCgpfmidNotBetween(Integer value1, Integer value2) {
            addCriterion("psm_cgpfmid not between", value1, value2, "psmCgpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmZdpfmidIsNull() {
            addCriterion("psm_zdpfmid is null");
            return (Criteria) this;
        }

        public Criteria andPsmZdpfmidIsNotNull() {
            addCriterion("psm_zdpfmid is not null");
            return (Criteria) this;
        }

        public Criteria andPsmZdpfmidEqualTo(Integer value) {
            addCriterion("psm_zdpfmid =", value, "psmZdpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmZdpfmidNotEqualTo(Integer value) {
            addCriterion("psm_zdpfmid <>", value, "psmZdpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmZdpfmidGreaterThan(Integer value) {
            addCriterion("psm_zdpfmid >", value, "psmZdpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmZdpfmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("psm_zdpfmid >=", value, "psmZdpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmZdpfmidLessThan(Integer value) {
            addCriterion("psm_zdpfmid <", value, "psmZdpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmZdpfmidLessThanOrEqualTo(Integer value) {
            addCriterion("psm_zdpfmid <=", value, "psmZdpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmZdpfmidIn(List<Integer> values) {
            addCriterion("psm_zdpfmid in", values, "psmZdpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmZdpfmidNotIn(List<Integer> values) {
            addCriterion("psm_zdpfmid not in", values, "psmZdpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmZdpfmidBetween(Integer value1, Integer value2) {
            addCriterion("psm_zdpfmid between", value1, value2, "psmZdpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmZdpfmidNotBetween(Integer value1, Integer value2) {
            addCriterion("psm_zdpfmid not between", value1, value2, "psmZdpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmFhpfmidIsNull() {
            addCriterion("psm_fhpfmid is null");
            return (Criteria) this;
        }

        public Criteria andPsmFhpfmidIsNotNull() {
            addCriterion("psm_fhpfmid is not null");
            return (Criteria) this;
        }

        public Criteria andPsmFhpfmidEqualTo(Integer value) {
            addCriterion("psm_fhpfmid =", value, "psmFhpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmFhpfmidNotEqualTo(Integer value) {
            addCriterion("psm_fhpfmid <>", value, "psmFhpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmFhpfmidGreaterThan(Integer value) {
            addCriterion("psm_fhpfmid >", value, "psmFhpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmFhpfmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("psm_fhpfmid >=", value, "psmFhpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmFhpfmidLessThan(Integer value) {
            addCriterion("psm_fhpfmid <", value, "psmFhpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmFhpfmidLessThanOrEqualTo(Integer value) {
            addCriterion("psm_fhpfmid <=", value, "psmFhpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmFhpfmidIn(List<Integer> values) {
            addCriterion("psm_fhpfmid in", values, "psmFhpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmFhpfmidNotIn(List<Integer> values) {
            addCriterion("psm_fhpfmid not in", values, "psmFhpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmFhpfmidBetween(Integer value1, Integer value2) {
            addCriterion("psm_fhpfmid between", value1, value2, "psmFhpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmFhpfmidNotBetween(Integer value1, Integer value2) {
            addCriterion("psm_fhpfmid not between", value1, value2, "psmFhpfmid");
            return (Criteria) this;
        }

        public Criteria andPsmSsprojectIsNull() {
            addCriterion("psm_ssproject is null");
            return (Criteria) this;
        }

        public Criteria andPsmSsprojectIsNotNull() {
            addCriterion("psm_ssproject is not null");
            return (Criteria) this;
        }

        public Criteria andPsmSsprojectEqualTo(Integer value) {
            addCriterion("psm_ssproject =", value, "psmSsproject");
            return (Criteria) this;
        }

        public Criteria andPsmSsprojectNotEqualTo(Integer value) {
            addCriterion("psm_ssproject <>", value, "psmSsproject");
            return (Criteria) this;
        }

        public Criteria andPsmSsprojectGreaterThan(Integer value) {
            addCriterion("psm_ssproject >", value, "psmSsproject");
            return (Criteria) this;
        }

        public Criteria andPsmSsprojectGreaterThanOrEqualTo(Integer value) {
            addCriterion("psm_ssproject >=", value, "psmSsproject");
            return (Criteria) this;
        }

        public Criteria andPsmSsprojectLessThan(Integer value) {
            addCriterion("psm_ssproject <", value, "psmSsproject");
            return (Criteria) this;
        }

        public Criteria andPsmSsprojectLessThanOrEqualTo(Integer value) {
            addCriterion("psm_ssproject <=", value, "psmSsproject");
            return (Criteria) this;
        }

        public Criteria andPsmSsprojectIn(List<Integer> values) {
            addCriterion("psm_ssproject in", values, "psmSsproject");
            return (Criteria) this;
        }

        public Criteria andPsmSsprojectNotIn(List<Integer> values) {
            addCriterion("psm_ssproject not in", values, "psmSsproject");
            return (Criteria) this;
        }

        public Criteria andPsmSsprojectBetween(Integer value1, Integer value2) {
            addCriterion("psm_ssproject between", value1, value2, "psmSsproject");
            return (Criteria) this;
        }

        public Criteria andPsmSsprojectNotBetween(Integer value1, Integer value2) {
            addCriterion("psm_ssproject not between", value1, value2, "psmSsproject");
            return (Criteria) this;
        }

        public Criteria andPsmZkgsSmidIsNull() {
            addCriterion("psm_zkgs_smid is null");
            return (Criteria) this;
        }

        public Criteria andPsmZkgsSmidIsNotNull() {
            addCriterion("psm_zkgs_smid is not null");
            return (Criteria) this;
        }

        public Criteria andPsmZkgsSmidEqualTo(String value) {
            addCriterion("psm_zkgs_smid =", value, "psmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPsmZkgsSmidNotEqualTo(String value) {
            addCriterion("psm_zkgs_smid <>", value, "psmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPsmZkgsSmidGreaterThan(String value) {
            addCriterion("psm_zkgs_smid >", value, "psmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPsmZkgsSmidGreaterThanOrEqualTo(String value) {
            addCriterion("psm_zkgs_smid >=", value, "psmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPsmZkgsSmidLessThan(String value) {
            addCriterion("psm_zkgs_smid <", value, "psmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPsmZkgsSmidLessThanOrEqualTo(String value) {
            addCriterion("psm_zkgs_smid <=", value, "psmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPsmZkgsSmidLike(String value) {
            addCriterion("psm_zkgs_smid like", value, "psmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPsmZkgsSmidNotLike(String value) {
            addCriterion("psm_zkgs_smid not like", value, "psmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPsmZkgsSmidIn(List<String> values) {
            addCriterion("psm_zkgs_smid in", values, "psmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPsmZkgsSmidNotIn(List<String> values) {
            addCriterion("psm_zkgs_smid not in", values, "psmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPsmZkgsSmidBetween(String value1, String value2) {
            addCriterion("psm_zkgs_smid between", value1, value2, "psmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPsmZkgsSmidNotBetween(String value1, String value2) {
            addCriterion("psm_zkgs_smid not between", value1, value2, "psmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPsmFkwhereIsNull() {
            addCriterion("psm_fkwhere is null");
            return (Criteria) this;
        }

        public Criteria andPsmFkwhereIsNotNull() {
            addCriterion("psm_fkwhere is not null");
            return (Criteria) this;
        }

        public Criteria andPsmFkwhereEqualTo(Integer value) {
            addCriterion("psm_fkwhere =", value, "psmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPsmFkwhereNotEqualTo(Integer value) {
            addCriterion("psm_fkwhere <>", value, "psmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPsmFkwhereGreaterThan(Integer value) {
            addCriterion("psm_fkwhere >", value, "psmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPsmFkwhereGreaterThanOrEqualTo(Integer value) {
            addCriterion("psm_fkwhere >=", value, "psmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPsmFkwhereLessThan(Integer value) {
            addCriterion("psm_fkwhere <", value, "psmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPsmFkwhereLessThanOrEqualTo(Integer value) {
            addCriterion("psm_fkwhere <=", value, "psmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPsmFkwhereIn(List<Integer> values) {
            addCriterion("psm_fkwhere in", values, "psmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPsmFkwhereNotIn(List<Integer> values) {
            addCriterion("psm_fkwhere not in", values, "psmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPsmFkwhereBetween(Integer value1, Integer value2) {
            addCriterion("psm_fkwhere between", value1, value2, "psmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPsmFkwhereNotBetween(Integer value1, Integer value2) {
            addCriterion("psm_fkwhere not between", value1, value2, "psmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPsmWheredayIsNull() {
            addCriterion("psm_whereday is null");
            return (Criteria) this;
        }

        public Criteria andPsmWheredayIsNotNull() {
            addCriterion("psm_whereday is not null");
            return (Criteria) this;
        }

        public Criteria andPsmWheredayEqualTo(Integer value) {
            addCriterion("psm_whereday =", value, "psmWhereday");
            return (Criteria) this;
        }

        public Criteria andPsmWheredayNotEqualTo(Integer value) {
            addCriterion("psm_whereday <>", value, "psmWhereday");
            return (Criteria) this;
        }

        public Criteria andPsmWheredayGreaterThan(Integer value) {
            addCriterion("psm_whereday >", value, "psmWhereday");
            return (Criteria) this;
        }

        public Criteria andPsmWheredayGreaterThanOrEqualTo(Integer value) {
            addCriterion("psm_whereday >=", value, "psmWhereday");
            return (Criteria) this;
        }

        public Criteria andPsmWheredayLessThan(Integer value) {
            addCriterion("psm_whereday <", value, "psmWhereday");
            return (Criteria) this;
        }

        public Criteria andPsmWheredayLessThanOrEqualTo(Integer value) {
            addCriterion("psm_whereday <=", value, "psmWhereday");
            return (Criteria) this;
        }

        public Criteria andPsmWheredayIn(List<Integer> values) {
            addCriterion("psm_whereday in", values, "psmWhereday");
            return (Criteria) this;
        }

        public Criteria andPsmWheredayNotIn(List<Integer> values) {
            addCriterion("psm_whereday not in", values, "psmWhereday");
            return (Criteria) this;
        }

        public Criteria andPsmWheredayBetween(Integer value1, Integer value2) {
            addCriterion("psm_whereday between", value1, value2, "psmWhereday");
            return (Criteria) this;
        }

        public Criteria andPsmWheredayNotBetween(Integer value1, Integer value2) {
            addCriterion("psm_whereday not between", value1, value2, "psmWhereday");
            return (Criteria) this;
        }

        public Criteria andPsmFkDateIsNull() {
            addCriterion("psm_fk_date is null");
            return (Criteria) this;
        }

        public Criteria andPsmFkDateIsNotNull() {
            addCriterion("psm_fk_date is not null");
            return (Criteria) this;
        }

        public Criteria andPsmFkDateEqualTo(Date value) {
            addCriterionForJDBCDate("psm_fk_date =", value, "psmFkDate");
            return (Criteria) this;
        }

        public Criteria andPsmFkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("psm_fk_date <>", value, "psmFkDate");
            return (Criteria) this;
        }

        public Criteria andPsmFkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("psm_fk_date >", value, "psmFkDate");
            return (Criteria) this;
        }

        public Criteria andPsmFkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("psm_fk_date >=", value, "psmFkDate");
            return (Criteria) this;
        }

        public Criteria andPsmFkDateLessThan(Date value) {
            addCriterionForJDBCDate("psm_fk_date <", value, "psmFkDate");
            return (Criteria) this;
        }

        public Criteria andPsmFkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("psm_fk_date <=", value, "psmFkDate");
            return (Criteria) this;
        }

        public Criteria andPsmFkDateIn(List<Date> values) {
            addCriterionForJDBCDate("psm_fk_date in", values, "psmFkDate");
            return (Criteria) this;
        }

        public Criteria andPsmFkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("psm_fk_date not in", values, "psmFkDate");
            return (Criteria) this;
        }

        public Criteria andPsmFkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("psm_fk_date between", value1, value2, "psmFkDate");
            return (Criteria) this;
        }

        public Criteria andPsmFkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("psm_fk_date not between", value1, value2, "psmFkDate");
            return (Criteria) this;
        }

        public Criteria andPsmFkMonthIsNull() {
            addCriterion("psm_fk_month is null");
            return (Criteria) this;
        }

        public Criteria andPsmFkMonthIsNotNull() {
            addCriterion("psm_fk_month is not null");
            return (Criteria) this;
        }

        public Criteria andPsmFkMonthEqualTo(Date value) {
            addCriterionForJDBCDate("psm_fk_month =", value, "psmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPsmFkMonthNotEqualTo(Date value) {
            addCriterionForJDBCDate("psm_fk_month <>", value, "psmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPsmFkMonthGreaterThan(Date value) {
            addCriterionForJDBCDate("psm_fk_month >", value, "psmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPsmFkMonthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("psm_fk_month >=", value, "psmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPsmFkMonthLessThan(Date value) {
            addCriterionForJDBCDate("psm_fk_month <", value, "psmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPsmFkMonthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("psm_fk_month <=", value, "psmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPsmFkMonthIn(List<Date> values) {
            addCriterionForJDBCDate("psm_fk_month in", values, "psmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPsmFkMonthNotIn(List<Date> values) {
            addCriterionForJDBCDate("psm_fk_month not in", values, "psmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPsmFkMonthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("psm_fk_month between", value1, value2, "psmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPsmFkMonthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("psm_fk_month not between", value1, value2, "psmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPsmRemarkIsNull() {
            addCriterion("psm_remark is null");
            return (Criteria) this;
        }

        public Criteria andPsmRemarkIsNotNull() {
            addCriterion("psm_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPsmRemarkEqualTo(String value) {
            addCriterion("psm_remark =", value, "psmRemark");
            return (Criteria) this;
        }

        public Criteria andPsmRemarkNotEqualTo(String value) {
            addCriterion("psm_remark <>", value, "psmRemark");
            return (Criteria) this;
        }

        public Criteria andPsmRemarkGreaterThan(String value) {
            addCriterion("psm_remark >", value, "psmRemark");
            return (Criteria) this;
        }

        public Criteria andPsmRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("psm_remark >=", value, "psmRemark");
            return (Criteria) this;
        }

        public Criteria andPsmRemarkLessThan(String value) {
            addCriterion("psm_remark <", value, "psmRemark");
            return (Criteria) this;
        }

        public Criteria andPsmRemarkLessThanOrEqualTo(String value) {
            addCriterion("psm_remark <=", value, "psmRemark");
            return (Criteria) this;
        }

        public Criteria andPsmRemarkLike(String value) {
            addCriterion("psm_remark like", value, "psmRemark");
            return (Criteria) this;
        }

        public Criteria andPsmRemarkNotLike(String value) {
            addCriterion("psm_remark not like", value, "psmRemark");
            return (Criteria) this;
        }

        public Criteria andPsmRemarkIn(List<String> values) {
            addCriterion("psm_remark in", values, "psmRemark");
            return (Criteria) this;
        }

        public Criteria andPsmRemarkNotIn(List<String> values) {
            addCriterion("psm_remark not in", values, "psmRemark");
            return (Criteria) this;
        }

        public Criteria andPsmRemarkBetween(String value1, String value2) {
            addCriterion("psm_remark between", value1, value2, "psmRemark");
            return (Criteria) this;
        }

        public Criteria andPsmRemarkNotBetween(String value1, String value2) {
            addCriterion("psm_remark not between", value1, value2, "psmRemark");
            return (Criteria) this;
        }

        public Criteria andPsmHdStatusIsNull() {
            addCriterion("psm_hd_status is null");
            return (Criteria) this;
        }

        public Criteria andPsmHdStatusIsNotNull() {
            addCriterion("psm_hd_status is not null");
            return (Criteria) this;
        }

        public Criteria andPsmHdStatusEqualTo(Integer value) {
            addCriterion("psm_hd_status =", value, "psmHdStatus");
            return (Criteria) this;
        }

        public Criteria andPsmHdStatusNotEqualTo(Integer value) {
            addCriterion("psm_hd_status <>", value, "psmHdStatus");
            return (Criteria) this;
        }

        public Criteria andPsmHdStatusGreaterThan(Integer value) {
            addCriterion("psm_hd_status >", value, "psmHdStatus");
            return (Criteria) this;
        }

        public Criteria andPsmHdStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("psm_hd_status >=", value, "psmHdStatus");
            return (Criteria) this;
        }

        public Criteria andPsmHdStatusLessThan(Integer value) {
            addCriterion("psm_hd_status <", value, "psmHdStatus");
            return (Criteria) this;
        }

        public Criteria andPsmHdStatusLessThanOrEqualTo(Integer value) {
            addCriterion("psm_hd_status <=", value, "psmHdStatus");
            return (Criteria) this;
        }

        public Criteria andPsmHdStatusIn(List<Integer> values) {
            addCriterion("psm_hd_status in", values, "psmHdStatus");
            return (Criteria) this;
        }

        public Criteria andPsmHdStatusNotIn(List<Integer> values) {
            addCriterion("psm_hd_status not in", values, "psmHdStatus");
            return (Criteria) this;
        }

        public Criteria andPsmHdStatusBetween(Integer value1, Integer value2) {
            addCriterion("psm_hd_status between", value1, value2, "psmHdStatus");
            return (Criteria) this;
        }

        public Criteria andPsmHdStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("psm_hd_status not between", value1, value2, "psmHdStatus");
            return (Criteria) this;
        }

        public Criteria andPsmHsTotalmoneyIsNull() {
            addCriterion("psm_hs_totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andPsmHsTotalmoneyIsNotNull() {
            addCriterion("psm_hs_totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPsmHsTotalmoneyEqualTo(Double value) {
            addCriterion("psm_hs_totalmoney =", value, "psmHsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmHsTotalmoneyNotEqualTo(Double value) {
            addCriterion("psm_hs_totalmoney <>", value, "psmHsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmHsTotalmoneyGreaterThan(Double value) {
            addCriterion("psm_hs_totalmoney >", value, "psmHsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmHsTotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("psm_hs_totalmoney >=", value, "psmHsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmHsTotalmoneyLessThan(Double value) {
            addCriterion("psm_hs_totalmoney <", value, "psmHsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmHsTotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("psm_hs_totalmoney <=", value, "psmHsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmHsTotalmoneyIn(List<Double> values) {
            addCriterion("psm_hs_totalmoney in", values, "psmHsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmHsTotalmoneyNotIn(List<Double> values) {
            addCriterion("psm_hs_totalmoney not in", values, "psmHsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmHsTotalmoneyBetween(Double value1, Double value2) {
            addCriterion("psm_hs_totalmoney between", value1, value2, "psmHsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmHsTotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("psm_hs_totalmoney not between", value1, value2, "psmHsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmNothsTotalmoneyIsNull() {
            addCriterion("psm_noths_totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andPsmNothsTotalmoneyIsNotNull() {
            addCriterion("psm_noths_totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPsmNothsTotalmoneyEqualTo(Double value) {
            addCriterion("psm_noths_totalmoney =", value, "psmNothsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmNothsTotalmoneyNotEqualTo(Double value) {
            addCriterion("psm_noths_totalmoney <>", value, "psmNothsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmNothsTotalmoneyGreaterThan(Double value) {
            addCriterion("psm_noths_totalmoney >", value, "psmNothsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmNothsTotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("psm_noths_totalmoney >=", value, "psmNothsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmNothsTotalmoneyLessThan(Double value) {
            addCriterion("psm_noths_totalmoney <", value, "psmNothsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmNothsTotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("psm_noths_totalmoney <=", value, "psmNothsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmNothsTotalmoneyIn(List<Double> values) {
            addCriterion("psm_noths_totalmoney in", values, "psmNothsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmNothsTotalmoneyNotIn(List<Double> values) {
            addCriterion("psm_noths_totalmoney not in", values, "psmNothsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmNothsTotalmoneyBetween(Double value1, Double value2) {
            addCriterion("psm_noths_totalmoney between", value1, value2, "psmNothsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsmNothsTotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("psm_noths_totalmoney not between", value1, value2, "psmNothsTotalmoney");
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