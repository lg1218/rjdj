package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PRMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PRMainExample() {
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

        public Criteria andPrmIdIsNull() {
            addCriterion("prm_id is null");
            return (Criteria) this;
        }

        public Criteria andPrmIdIsNotNull() {
            addCriterion("prm_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrmIdEqualTo(Integer value) {
            addCriterion("prm_id =", value, "prmId");
            return (Criteria) this;
        }

        public Criteria andPrmIdNotEqualTo(Integer value) {
            addCriterion("prm_id <>", value, "prmId");
            return (Criteria) this;
        }

        public Criteria andPrmIdGreaterThan(Integer value) {
            addCriterion("prm_id >", value, "prmId");
            return (Criteria) this;
        }

        public Criteria andPrmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prm_id >=", value, "prmId");
            return (Criteria) this;
        }

        public Criteria andPrmIdLessThan(Integer value) {
            addCriterion("prm_id <", value, "prmId");
            return (Criteria) this;
        }

        public Criteria andPrmIdLessThanOrEqualTo(Integer value) {
            addCriterion("prm_id <=", value, "prmId");
            return (Criteria) this;
        }

        public Criteria andPrmIdIn(List<Integer> values) {
            addCriterion("prm_id in", values, "prmId");
            return (Criteria) this;
        }

        public Criteria andPrmIdNotIn(List<Integer> values) {
            addCriterion("prm_id not in", values, "prmId");
            return (Criteria) this;
        }

        public Criteria andPrmIdBetween(Integer value1, Integer value2) {
            addCriterion("prm_id between", value1, value2, "prmId");
            return (Criteria) this;
        }

        public Criteria andPrmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prm_id not between", value1, value2, "prmId");
            return (Criteria) this;
        }

        public Criteria andPrmNumIsNull() {
            addCriterion("prm_num is null");
            return (Criteria) this;
        }

        public Criteria andPrmNumIsNotNull() {
            addCriterion("prm_num is not null");
            return (Criteria) this;
        }

        public Criteria andPrmNumEqualTo(String value) {
            addCriterion("prm_num =", value, "prmNum");
            return (Criteria) this;
        }

        public Criteria andPrmNumNotEqualTo(String value) {
            addCriterion("prm_num <>", value, "prmNum");
            return (Criteria) this;
        }

        public Criteria andPrmNumGreaterThan(String value) {
            addCriterion("prm_num >", value, "prmNum");
            return (Criteria) this;
        }

        public Criteria andPrmNumGreaterThanOrEqualTo(String value) {
            addCriterion("prm_num >=", value, "prmNum");
            return (Criteria) this;
        }

        public Criteria andPrmNumLessThan(String value) {
            addCriterion("prm_num <", value, "prmNum");
            return (Criteria) this;
        }

        public Criteria andPrmNumLessThanOrEqualTo(String value) {
            addCriterion("prm_num <=", value, "prmNum");
            return (Criteria) this;
        }

        public Criteria andPrmNumLike(String value) {
            addCriterion("prm_num like", value, "prmNum");
            return (Criteria) this;
        }

        public Criteria andPrmNumNotLike(String value) {
            addCriterion("prm_num not like", value, "prmNum");
            return (Criteria) this;
        }

        public Criteria andPrmNumIn(List<String> values) {
            addCriterion("prm_num in", values, "prmNum");
            return (Criteria) this;
        }

        public Criteria andPrmNumNotIn(List<String> values) {
            addCriterion("prm_num not in", values, "prmNum");
            return (Criteria) this;
        }

        public Criteria andPrmNumBetween(String value1, String value2) {
            addCriterion("prm_num between", value1, value2, "prmNum");
            return (Criteria) this;
        }

        public Criteria andPrmNumNotBetween(String value1, String value2) {
            addCriterion("prm_num not between", value1, value2, "prmNum");
            return (Criteria) this;
        }

        public Criteria andPrmDateIsNull() {
            addCriterion("prm_date is null");
            return (Criteria) this;
        }

        public Criteria andPrmDateIsNotNull() {
            addCriterion("prm_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrmDateEqualTo(Date value) {
            addCriterionForJDBCDate("prm_date =", value, "prmDate");
            return (Criteria) this;
        }

        public Criteria andPrmDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("prm_date <>", value, "prmDate");
            return (Criteria) this;
        }

        public Criteria andPrmDateGreaterThan(Date value) {
            addCriterionForJDBCDate("prm_date >", value, "prmDate");
            return (Criteria) this;
        }

        public Criteria andPrmDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prm_date >=", value, "prmDate");
            return (Criteria) this;
        }

        public Criteria andPrmDateLessThan(Date value) {
            addCriterionForJDBCDate("prm_date <", value, "prmDate");
            return (Criteria) this;
        }

        public Criteria andPrmDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prm_date <=", value, "prmDate");
            return (Criteria) this;
        }

        public Criteria andPrmDateIn(List<Date> values) {
            addCriterionForJDBCDate("prm_date in", values, "prmDate");
            return (Criteria) this;
        }

        public Criteria andPrmDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("prm_date not in", values, "prmDate");
            return (Criteria) this;
        }

        public Criteria andPrmDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prm_date between", value1, value2, "prmDate");
            return (Criteria) this;
        }

        public Criteria andPrmDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prm_date not between", value1, value2, "prmDate");
            return (Criteria) this;
        }

        public Criteria andPrmSmidIsNull() {
            addCriterion("prm_smid is null");
            return (Criteria) this;
        }

        public Criteria andPrmSmidIsNotNull() {
            addCriterion("prm_smid is not null");
            return (Criteria) this;
        }

        public Criteria andPrmSmidEqualTo(Integer value) {
            addCriterion("prm_smid =", value, "prmSmid");
            return (Criteria) this;
        }

        public Criteria andPrmSmidNotEqualTo(Integer value) {
            addCriterion("prm_smid <>", value, "prmSmid");
            return (Criteria) this;
        }

        public Criteria andPrmSmidGreaterThan(Integer value) {
            addCriterion("prm_smid >", value, "prmSmid");
            return (Criteria) this;
        }

        public Criteria andPrmSmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prm_smid >=", value, "prmSmid");
            return (Criteria) this;
        }

        public Criteria andPrmSmidLessThan(Integer value) {
            addCriterion("prm_smid <", value, "prmSmid");
            return (Criteria) this;
        }

        public Criteria andPrmSmidLessThanOrEqualTo(Integer value) {
            addCriterion("prm_smid <=", value, "prmSmid");
            return (Criteria) this;
        }

        public Criteria andPrmSmidIn(List<Integer> values) {
            addCriterion("prm_smid in", values, "prmSmid");
            return (Criteria) this;
        }

        public Criteria andPrmSmidNotIn(List<Integer> values) {
            addCriterion("prm_smid not in", values, "prmSmid");
            return (Criteria) this;
        }

        public Criteria andPrmSmidBetween(Integer value1, Integer value2) {
            addCriterion("prm_smid between", value1, value2, "prmSmid");
            return (Criteria) this;
        }

        public Criteria andPrmSmidNotBetween(Integer value1, Integer value2) {
            addCriterion("prm_smid not between", value1, value2, "prmSmid");
            return (Criteria) this;
        }

        public Criteria andPrmFlagCxrkIsNull() {
            addCriterion("prm_flag_cxrk is null");
            return (Criteria) this;
        }

        public Criteria andPrmFlagCxrkIsNotNull() {
            addCriterion("prm_flag_cxrk is not null");
            return (Criteria) this;
        }

        public Criteria andPrmFlagCxrkEqualTo(Boolean value) {
            addCriterion("prm_flag_cxrk =", value, "prmFlagCxrk");
            return (Criteria) this;
        }

        public Criteria andPrmFlagCxrkNotEqualTo(Boolean value) {
            addCriterion("prm_flag_cxrk <>", value, "prmFlagCxrk");
            return (Criteria) this;
        }

        public Criteria andPrmFlagCxrkGreaterThan(Boolean value) {
            addCriterion("prm_flag_cxrk >", value, "prmFlagCxrk");
            return (Criteria) this;
        }

        public Criteria andPrmFlagCxrkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("prm_flag_cxrk >=", value, "prmFlagCxrk");
            return (Criteria) this;
        }

        public Criteria andPrmFlagCxrkLessThan(Boolean value) {
            addCriterion("prm_flag_cxrk <", value, "prmFlagCxrk");
            return (Criteria) this;
        }

        public Criteria andPrmFlagCxrkLessThanOrEqualTo(Boolean value) {
            addCriterion("prm_flag_cxrk <=", value, "prmFlagCxrk");
            return (Criteria) this;
        }

        public Criteria andPrmFlagCxrkIn(List<Boolean> values) {
            addCriterion("prm_flag_cxrk in", values, "prmFlagCxrk");
            return (Criteria) this;
        }

        public Criteria andPrmFlagCxrkNotIn(List<Boolean> values) {
            addCriterion("prm_flag_cxrk not in", values, "prmFlagCxrk");
            return (Criteria) this;
        }

        public Criteria andPrmFlagCxrkBetween(Boolean value1, Boolean value2) {
            addCriterion("prm_flag_cxrk between", value1, value2, "prmFlagCxrk");
            return (Criteria) this;
        }

        public Criteria andPrmFlagCxrkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("prm_flag_cxrk not between", value1, value2, "prmFlagCxrk");
            return (Criteria) this;
        }

        public Criteria andPrmBbIdIsNull() {
            addCriterion("prm_bb_id is null");
            return (Criteria) this;
        }

        public Criteria andPrmBbIdIsNotNull() {
            addCriterion("prm_bb_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrmBbIdEqualTo(Integer value) {
            addCriterion("prm_bb_id =", value, "prmBbId");
            return (Criteria) this;
        }

        public Criteria andPrmBbIdNotEqualTo(Integer value) {
            addCriterion("prm_bb_id <>", value, "prmBbId");
            return (Criteria) this;
        }

        public Criteria andPrmBbIdGreaterThan(Integer value) {
            addCriterion("prm_bb_id >", value, "prmBbId");
            return (Criteria) this;
        }

        public Criteria andPrmBbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prm_bb_id >=", value, "prmBbId");
            return (Criteria) this;
        }

        public Criteria andPrmBbIdLessThan(Integer value) {
            addCriterion("prm_bb_id <", value, "prmBbId");
            return (Criteria) this;
        }

        public Criteria andPrmBbIdLessThanOrEqualTo(Integer value) {
            addCriterion("prm_bb_id <=", value, "prmBbId");
            return (Criteria) this;
        }

        public Criteria andPrmBbIdIn(List<Integer> values) {
            addCriterion("prm_bb_id in", values, "prmBbId");
            return (Criteria) this;
        }

        public Criteria andPrmBbIdNotIn(List<Integer> values) {
            addCriterion("prm_bb_id not in", values, "prmBbId");
            return (Criteria) this;
        }

        public Criteria andPrmBbIdBetween(Integer value1, Integer value2) {
            addCriterion("prm_bb_id between", value1, value2, "prmBbId");
            return (Criteria) this;
        }

        public Criteria andPrmBbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prm_bb_id not between", value1, value2, "prmBbId");
            return (Criteria) this;
        }

        public Criteria andPrmFlagDpriceIsNull() {
            addCriterion("prm_flag_dprice is null");
            return (Criteria) this;
        }

        public Criteria andPrmFlagDpriceIsNotNull() {
            addCriterion("prm_flag_dprice is not null");
            return (Criteria) this;
        }

        public Criteria andPrmFlagDpriceEqualTo(Boolean value) {
            addCriterion("prm_flag_dprice =", value, "prmFlagDprice");
            return (Criteria) this;
        }

        public Criteria andPrmFlagDpriceNotEqualTo(Boolean value) {
            addCriterion("prm_flag_dprice <>", value, "prmFlagDprice");
            return (Criteria) this;
        }

        public Criteria andPrmFlagDpriceGreaterThan(Boolean value) {
            addCriterion("prm_flag_dprice >", value, "prmFlagDprice");
            return (Criteria) this;
        }

        public Criteria andPrmFlagDpriceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("prm_flag_dprice >=", value, "prmFlagDprice");
            return (Criteria) this;
        }

        public Criteria andPrmFlagDpriceLessThan(Boolean value) {
            addCriterion("prm_flag_dprice <", value, "prmFlagDprice");
            return (Criteria) this;
        }

        public Criteria andPrmFlagDpriceLessThanOrEqualTo(Boolean value) {
            addCriterion("prm_flag_dprice <=", value, "prmFlagDprice");
            return (Criteria) this;
        }

        public Criteria andPrmFlagDpriceIn(List<Boolean> values) {
            addCriterion("prm_flag_dprice in", values, "prmFlagDprice");
            return (Criteria) this;
        }

        public Criteria andPrmFlagDpriceNotIn(List<Boolean> values) {
            addCriterion("prm_flag_dprice not in", values, "prmFlagDprice");
            return (Criteria) this;
        }

        public Criteria andPrmFlagDpriceBetween(Boolean value1, Boolean value2) {
            addCriterion("prm_flag_dprice between", value1, value2, "prmFlagDprice");
            return (Criteria) this;
        }

        public Criteria andPrmFlagDpriceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("prm_flag_dprice not between", value1, value2, "prmFlagDprice");
            return (Criteria) this;
        }

        public Criteria andPrmWarehoseIdIsNull() {
            addCriterion("prm_warehose_id is null");
            return (Criteria) this;
        }

        public Criteria andPrmWarehoseIdIsNotNull() {
            addCriterion("prm_warehose_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrmWarehoseIdEqualTo(Integer value) {
            addCriterion("prm_warehose_id =", value, "prmWarehoseId");
            return (Criteria) this;
        }

        public Criteria andPrmWarehoseIdNotEqualTo(Integer value) {
            addCriterion("prm_warehose_id <>", value, "prmWarehoseId");
            return (Criteria) this;
        }

        public Criteria andPrmWarehoseIdGreaterThan(Integer value) {
            addCriterion("prm_warehose_id >", value, "prmWarehoseId");
            return (Criteria) this;
        }

        public Criteria andPrmWarehoseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prm_warehose_id >=", value, "prmWarehoseId");
            return (Criteria) this;
        }

        public Criteria andPrmWarehoseIdLessThan(Integer value) {
            addCriterion("prm_warehose_id <", value, "prmWarehoseId");
            return (Criteria) this;
        }

        public Criteria andPrmWarehoseIdLessThanOrEqualTo(Integer value) {
            addCriterion("prm_warehose_id <=", value, "prmWarehoseId");
            return (Criteria) this;
        }

        public Criteria andPrmWarehoseIdIn(List<Integer> values) {
            addCriterion("prm_warehose_id in", values, "prmWarehoseId");
            return (Criteria) this;
        }

        public Criteria andPrmWarehoseIdNotIn(List<Integer> values) {
            addCriterion("prm_warehose_id not in", values, "prmWarehoseId");
            return (Criteria) this;
        }

        public Criteria andPrmWarehoseIdBetween(Integer value1, Integer value2) {
            addCriterion("prm_warehose_id between", value1, value2, "prmWarehoseId");
            return (Criteria) this;
        }

        public Criteria andPrmWarehoseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prm_warehose_id not between", value1, value2, "prmWarehoseId");
            return (Criteria) this;
        }

        public Criteria andPrmGywyFlagIsNull() {
            addCriterion("prm_gywy_flag is null");
            return (Criteria) this;
        }

        public Criteria andPrmGywyFlagIsNotNull() {
            addCriterion("prm_gywy_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPrmGywyFlagEqualTo(Boolean value) {
            addCriterion("prm_gywy_flag =", value, "prmGywyFlag");
            return (Criteria) this;
        }

        public Criteria andPrmGywyFlagNotEqualTo(Boolean value) {
            addCriterion("prm_gywy_flag <>", value, "prmGywyFlag");
            return (Criteria) this;
        }

        public Criteria andPrmGywyFlagGreaterThan(Boolean value) {
            addCriterion("prm_gywy_flag >", value, "prmGywyFlag");
            return (Criteria) this;
        }

        public Criteria andPrmGywyFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("prm_gywy_flag >=", value, "prmGywyFlag");
            return (Criteria) this;
        }

        public Criteria andPrmGywyFlagLessThan(Boolean value) {
            addCriterion("prm_gywy_flag <", value, "prmGywyFlag");
            return (Criteria) this;
        }

        public Criteria andPrmGywyFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("prm_gywy_flag <=", value, "prmGywyFlag");
            return (Criteria) this;
        }

        public Criteria andPrmGywyFlagIn(List<Boolean> values) {
            addCriterion("prm_gywy_flag in", values, "prmGywyFlag");
            return (Criteria) this;
        }

        public Criteria andPrmGywyFlagNotIn(List<Boolean> values) {
            addCriterion("prm_gywy_flag not in", values, "prmGywyFlag");
            return (Criteria) this;
        }

        public Criteria andPrmGywyFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("prm_gywy_flag between", value1, value2, "prmGywyFlag");
            return (Criteria) this;
        }

        public Criteria andPrmGywyFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("prm_gywy_flag not between", value1, value2, "prmGywyFlag");
            return (Criteria) this;
        }

        public Criteria andPrmPznumIsNull() {
            addCriterion("prm_pznum is null");
            return (Criteria) this;
        }

        public Criteria andPrmPznumIsNotNull() {
            addCriterion("prm_pznum is not null");
            return (Criteria) this;
        }

        public Criteria andPrmPznumEqualTo(String value) {
            addCriterion("prm_pznum =", value, "prmPznum");
            return (Criteria) this;
        }

        public Criteria andPrmPznumNotEqualTo(String value) {
            addCriterion("prm_pznum <>", value, "prmPznum");
            return (Criteria) this;
        }

        public Criteria andPrmPznumGreaterThan(String value) {
            addCriterion("prm_pznum >", value, "prmPznum");
            return (Criteria) this;
        }

        public Criteria andPrmPznumGreaterThanOrEqualTo(String value) {
            addCriterion("prm_pznum >=", value, "prmPznum");
            return (Criteria) this;
        }

        public Criteria andPrmPznumLessThan(String value) {
            addCriterion("prm_pznum <", value, "prmPznum");
            return (Criteria) this;
        }

        public Criteria andPrmPznumLessThanOrEqualTo(String value) {
            addCriterion("prm_pznum <=", value, "prmPznum");
            return (Criteria) this;
        }

        public Criteria andPrmPznumLike(String value) {
            addCriterion("prm_pznum like", value, "prmPznum");
            return (Criteria) this;
        }

        public Criteria andPrmPznumNotLike(String value) {
            addCriterion("prm_pznum not like", value, "prmPznum");
            return (Criteria) this;
        }

        public Criteria andPrmPznumIn(List<String> values) {
            addCriterion("prm_pznum in", values, "prmPznum");
            return (Criteria) this;
        }

        public Criteria andPrmPznumNotIn(List<String> values) {
            addCriterion("prm_pznum not in", values, "prmPznum");
            return (Criteria) this;
        }

        public Criteria andPrmPznumBetween(String value1, String value2) {
            addCriterion("prm_pznum between", value1, value2, "prmPznum");
            return (Criteria) this;
        }

        public Criteria andPrmPznumNotBetween(String value1, String value2) {
            addCriterion("prm_pznum not between", value1, value2, "prmPznum");
            return (Criteria) this;
        }

        public Criteria andPrmCgPfmidIsNull() {
            addCriterion("prm_cg_pfmid is null");
            return (Criteria) this;
        }

        public Criteria andPrmCgPfmidIsNotNull() {
            addCriterion("prm_cg_pfmid is not null");
            return (Criteria) this;
        }

        public Criteria andPrmCgPfmidEqualTo(Integer value) {
            addCriterion("prm_cg_pfmid =", value, "prmCgPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmCgPfmidNotEqualTo(Integer value) {
            addCriterion("prm_cg_pfmid <>", value, "prmCgPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmCgPfmidGreaterThan(Integer value) {
            addCriterion("prm_cg_pfmid >", value, "prmCgPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmCgPfmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prm_cg_pfmid >=", value, "prmCgPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmCgPfmidLessThan(Integer value) {
            addCriterion("prm_cg_pfmid <", value, "prmCgPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmCgPfmidLessThanOrEqualTo(Integer value) {
            addCriterion("prm_cg_pfmid <=", value, "prmCgPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmCgPfmidIn(List<Integer> values) {
            addCriterion("prm_cg_pfmid in", values, "prmCgPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmCgPfmidNotIn(List<Integer> values) {
            addCriterion("prm_cg_pfmid not in", values, "prmCgPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmCgPfmidBetween(Integer value1, Integer value2) {
            addCriterion("prm_cg_pfmid between", value1, value2, "prmCgPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmCgPfmidNotBetween(Integer value1, Integer value2) {
            addCriterion("prm_cg_pfmid not between", value1, value2, "prmCgPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmZdPfmidIsNull() {
            addCriterion("prm_zd_pfmid is null");
            return (Criteria) this;
        }

        public Criteria andPrmZdPfmidIsNotNull() {
            addCriterion("prm_zd_pfmid is not null");
            return (Criteria) this;
        }

        public Criteria andPrmZdPfmidEqualTo(Integer value) {
            addCriterion("prm_zd_pfmid =", value, "prmZdPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmZdPfmidNotEqualTo(Integer value) {
            addCriterion("prm_zd_pfmid <>", value, "prmZdPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmZdPfmidGreaterThan(Integer value) {
            addCriterion("prm_zd_pfmid >", value, "prmZdPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmZdPfmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prm_zd_pfmid >=", value, "prmZdPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmZdPfmidLessThan(Integer value) {
            addCriterion("prm_zd_pfmid <", value, "prmZdPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmZdPfmidLessThanOrEqualTo(Integer value) {
            addCriterion("prm_zd_pfmid <=", value, "prmZdPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmZdPfmidIn(List<Integer> values) {
            addCriterion("prm_zd_pfmid in", values, "prmZdPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmZdPfmidNotIn(List<Integer> values) {
            addCriterion("prm_zd_pfmid not in", values, "prmZdPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmZdPfmidBetween(Integer value1, Integer value2) {
            addCriterion("prm_zd_pfmid between", value1, value2, "prmZdPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmZdPfmidNotBetween(Integer value1, Integer value2) {
            addCriterion("prm_zd_pfmid not between", value1, value2, "prmZdPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmFhPfmidIsNull() {
            addCriterion("prm_fh_pfmid is null");
            return (Criteria) this;
        }

        public Criteria andPrmFhPfmidIsNotNull() {
            addCriterion("prm_fh_pfmid is not null");
            return (Criteria) this;
        }

        public Criteria andPrmFhPfmidEqualTo(Integer value) {
            addCriterion("prm_fh_pfmid =", value, "prmFhPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmFhPfmidNotEqualTo(Integer value) {
            addCriterion("prm_fh_pfmid <>", value, "prmFhPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmFhPfmidGreaterThan(Integer value) {
            addCriterion("prm_fh_pfmid >", value, "prmFhPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmFhPfmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prm_fh_pfmid >=", value, "prmFhPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmFhPfmidLessThan(Integer value) {
            addCriterion("prm_fh_pfmid <", value, "prmFhPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmFhPfmidLessThanOrEqualTo(Integer value) {
            addCriterion("prm_fh_pfmid <=", value, "prmFhPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmFhPfmidIn(List<Integer> values) {
            addCriterion("prm_fh_pfmid in", values, "prmFhPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmFhPfmidNotIn(List<Integer> values) {
            addCriterion("prm_fh_pfmid not in", values, "prmFhPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmFhPfmidBetween(Integer value1, Integer value2) {
            addCriterion("prm_fh_pfmid between", value1, value2, "prmFhPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmFhPfmidNotBetween(Integer value1, Integer value2) {
            addCriterion("prm_fh_pfmid not between", value1, value2, "prmFhPfmid");
            return (Criteria) this;
        }

        public Criteria andPrmSsprojectIsNull() {
            addCriterion("prm_ssproject is null");
            return (Criteria) this;
        }

        public Criteria andPrmSsprojectIsNotNull() {
            addCriterion("prm_ssproject is not null");
            return (Criteria) this;
        }

        public Criteria andPrmSsprojectEqualTo(Integer value) {
            addCriterion("prm_ssproject =", value, "prmSsproject");
            return (Criteria) this;
        }

        public Criteria andPrmSsprojectNotEqualTo(Integer value) {
            addCriterion("prm_ssproject <>", value, "prmSsproject");
            return (Criteria) this;
        }

        public Criteria andPrmSsprojectGreaterThan(Integer value) {
            addCriterion("prm_ssproject >", value, "prmSsproject");
            return (Criteria) this;
        }

        public Criteria andPrmSsprojectGreaterThanOrEqualTo(Integer value) {
            addCriterion("prm_ssproject >=", value, "prmSsproject");
            return (Criteria) this;
        }

        public Criteria andPrmSsprojectLessThan(Integer value) {
            addCriterion("prm_ssproject <", value, "prmSsproject");
            return (Criteria) this;
        }

        public Criteria andPrmSsprojectLessThanOrEqualTo(Integer value) {
            addCriterion("prm_ssproject <=", value, "prmSsproject");
            return (Criteria) this;
        }

        public Criteria andPrmSsprojectIn(List<Integer> values) {
            addCriterion("prm_ssproject in", values, "prmSsproject");
            return (Criteria) this;
        }

        public Criteria andPrmSsprojectNotIn(List<Integer> values) {
            addCriterion("prm_ssproject not in", values, "prmSsproject");
            return (Criteria) this;
        }

        public Criteria andPrmSsprojectBetween(Integer value1, Integer value2) {
            addCriterion("prm_ssproject between", value1, value2, "prmSsproject");
            return (Criteria) this;
        }

        public Criteria andPrmSsprojectNotBetween(Integer value1, Integer value2) {
            addCriterion("prm_ssproject not between", value1, value2, "prmSsproject");
            return (Criteria) this;
        }

        public Criteria andPrmZkgsSmidIsNull() {
            addCriterion("prm_zkgs_smid is null");
            return (Criteria) this;
        }

        public Criteria andPrmZkgsSmidIsNotNull() {
            addCriterion("prm_zkgs_smid is not null");
            return (Criteria) this;
        }

        public Criteria andPrmZkgsSmidEqualTo(String value) {
            addCriterion("prm_zkgs_smid =", value, "prmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPrmZkgsSmidNotEqualTo(String value) {
            addCriterion("prm_zkgs_smid <>", value, "prmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPrmZkgsSmidGreaterThan(String value) {
            addCriterion("prm_zkgs_smid >", value, "prmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPrmZkgsSmidGreaterThanOrEqualTo(String value) {
            addCriterion("prm_zkgs_smid >=", value, "prmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPrmZkgsSmidLessThan(String value) {
            addCriterion("prm_zkgs_smid <", value, "prmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPrmZkgsSmidLessThanOrEqualTo(String value) {
            addCriterion("prm_zkgs_smid <=", value, "prmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPrmZkgsSmidLike(String value) {
            addCriterion("prm_zkgs_smid like", value, "prmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPrmZkgsSmidNotLike(String value) {
            addCriterion("prm_zkgs_smid not like", value, "prmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPrmZkgsSmidIn(List<String> values) {
            addCriterion("prm_zkgs_smid in", values, "prmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPrmZkgsSmidNotIn(List<String> values) {
            addCriterion("prm_zkgs_smid not in", values, "prmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPrmZkgsSmidBetween(String value1, String value2) {
            addCriterion("prm_zkgs_smid between", value1, value2, "prmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPrmZkgsSmidNotBetween(String value1, String value2) {
            addCriterion("prm_zkgs_smid not between", value1, value2, "prmZkgsSmid");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereIsNull() {
            addCriterion("prm_fkwhere is null");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereIsNotNull() {
            addCriterion("prm_fkwhere is not null");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereEqualTo(Integer value) {
            addCriterion("prm_fkwhere =", value, "prmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereNotEqualTo(Integer value) {
            addCriterion("prm_fkwhere <>", value, "prmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereGreaterThan(Integer value) {
            addCriterion("prm_fkwhere >", value, "prmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereGreaterThanOrEqualTo(Integer value) {
            addCriterion("prm_fkwhere >=", value, "prmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereLessThan(Integer value) {
            addCriterion("prm_fkwhere <", value, "prmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereLessThanOrEqualTo(Integer value) {
            addCriterion("prm_fkwhere <=", value, "prmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereIn(List<Integer> values) {
            addCriterion("prm_fkwhere in", values, "prmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereNotIn(List<Integer> values) {
            addCriterion("prm_fkwhere not in", values, "prmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereBetween(Integer value1, Integer value2) {
            addCriterion("prm_fkwhere between", value1, value2, "prmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereNotBetween(Integer value1, Integer value2) {
            addCriterion("prm_fkwhere not between", value1, value2, "prmFkwhere");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereDayIsNull() {
            addCriterion("prm_fkwhere_day is null");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereDayIsNotNull() {
            addCriterion("prm_fkwhere_day is not null");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereDayEqualTo(Integer value) {
            addCriterion("prm_fkwhere_day =", value, "prmFkwhereDay");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereDayNotEqualTo(Integer value) {
            addCriterion("prm_fkwhere_day <>", value, "prmFkwhereDay");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereDayGreaterThan(Integer value) {
            addCriterion("prm_fkwhere_day >", value, "prmFkwhereDay");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("prm_fkwhere_day >=", value, "prmFkwhereDay");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereDayLessThan(Integer value) {
            addCriterion("prm_fkwhere_day <", value, "prmFkwhereDay");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereDayLessThanOrEqualTo(Integer value) {
            addCriterion("prm_fkwhere_day <=", value, "prmFkwhereDay");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereDayIn(List<Integer> values) {
            addCriterion("prm_fkwhere_day in", values, "prmFkwhereDay");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereDayNotIn(List<Integer> values) {
            addCriterion("prm_fkwhere_day not in", values, "prmFkwhereDay");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereDayBetween(Integer value1, Integer value2) {
            addCriterion("prm_fkwhere_day between", value1, value2, "prmFkwhereDay");
            return (Criteria) this;
        }

        public Criteria andPrmFkwhereDayNotBetween(Integer value1, Integer value2) {
            addCriterion("prm_fkwhere_day not between", value1, value2, "prmFkwhereDay");
            return (Criteria) this;
        }

        public Criteria andPrmFkDateIsNull() {
            addCriterion("prm_fk_date is null");
            return (Criteria) this;
        }

        public Criteria andPrmFkDateIsNotNull() {
            addCriterion("prm_fk_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrmFkDateEqualTo(Date value) {
            addCriterionForJDBCDate("prm_fk_date =", value, "prmFkDate");
            return (Criteria) this;
        }

        public Criteria andPrmFkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("prm_fk_date <>", value, "prmFkDate");
            return (Criteria) this;
        }

        public Criteria andPrmFkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("prm_fk_date >", value, "prmFkDate");
            return (Criteria) this;
        }

        public Criteria andPrmFkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prm_fk_date >=", value, "prmFkDate");
            return (Criteria) this;
        }

        public Criteria andPrmFkDateLessThan(Date value) {
            addCriterionForJDBCDate("prm_fk_date <", value, "prmFkDate");
            return (Criteria) this;
        }

        public Criteria andPrmFkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prm_fk_date <=", value, "prmFkDate");
            return (Criteria) this;
        }

        public Criteria andPrmFkDateIn(List<Date> values) {
            addCriterionForJDBCDate("prm_fk_date in", values, "prmFkDate");
            return (Criteria) this;
        }

        public Criteria andPrmFkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("prm_fk_date not in", values, "prmFkDate");
            return (Criteria) this;
        }

        public Criteria andPrmFkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prm_fk_date between", value1, value2, "prmFkDate");
            return (Criteria) this;
        }

        public Criteria andPrmFkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prm_fk_date not between", value1, value2, "prmFkDate");
            return (Criteria) this;
        }

        public Criteria andPrmFkMonthIsNull() {
            addCriterion("prm_fk_month is null");
            return (Criteria) this;
        }

        public Criteria andPrmFkMonthIsNotNull() {
            addCriterion("prm_fk_month is not null");
            return (Criteria) this;
        }

        public Criteria andPrmFkMonthEqualTo(Date value) {
            addCriterionForJDBCDate("prm_fk_month =", value, "prmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPrmFkMonthNotEqualTo(Date value) {
            addCriterionForJDBCDate("prm_fk_month <>", value, "prmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPrmFkMonthGreaterThan(Date value) {
            addCriterionForJDBCDate("prm_fk_month >", value, "prmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPrmFkMonthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prm_fk_month >=", value, "prmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPrmFkMonthLessThan(Date value) {
            addCriterionForJDBCDate("prm_fk_month <", value, "prmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPrmFkMonthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("prm_fk_month <=", value, "prmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPrmFkMonthIn(List<Date> values) {
            addCriterionForJDBCDate("prm_fk_month in", values, "prmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPrmFkMonthNotIn(List<Date> values) {
            addCriterionForJDBCDate("prm_fk_month not in", values, "prmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPrmFkMonthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prm_fk_month between", value1, value2, "prmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPrmFkMonthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("prm_fk_month not between", value1, value2, "prmFkMonth");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkIsNull() {
            addCriterion("prm_remark is null");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkIsNotNull() {
            addCriterion("prm_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkEqualTo(String value) {
            addCriterion("prm_remark =", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkNotEqualTo(String value) {
            addCriterion("prm_remark <>", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkGreaterThan(String value) {
            addCriterion("prm_remark >", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("prm_remark >=", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkLessThan(String value) {
            addCriterion("prm_remark <", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkLessThanOrEqualTo(String value) {
            addCriterion("prm_remark <=", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkLike(String value) {
            addCriterion("prm_remark like", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkNotLike(String value) {
            addCriterion("prm_remark not like", value, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkIn(List<String> values) {
            addCriterion("prm_remark in", values, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkNotIn(List<String> values) {
            addCriterion("prm_remark not in", values, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkBetween(String value1, String value2) {
            addCriterion("prm_remark between", value1, value2, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmRemarkNotBetween(String value1, String value2) {
            addCriterion("prm_remark not between", value1, value2, "prmRemark");
            return (Criteria) this;
        }

        public Criteria andPrmHdStausIsNull() {
            addCriterion("prm_hd_staus is null");
            return (Criteria) this;
        }

        public Criteria andPrmHdStausIsNotNull() {
            addCriterion("prm_hd_staus is not null");
            return (Criteria) this;
        }

        public Criteria andPrmHdStausEqualTo(Integer value) {
            addCriterion("prm_hd_staus =", value, "prmHdStaus");
            return (Criteria) this;
        }

        public Criteria andPrmHdStausNotEqualTo(Integer value) {
            addCriterion("prm_hd_staus <>", value, "prmHdStaus");
            return (Criteria) this;
        }

        public Criteria andPrmHdStausGreaterThan(Integer value) {
            addCriterion("prm_hd_staus >", value, "prmHdStaus");
            return (Criteria) this;
        }

        public Criteria andPrmHdStausGreaterThanOrEqualTo(Integer value) {
            addCriterion("prm_hd_staus >=", value, "prmHdStaus");
            return (Criteria) this;
        }

        public Criteria andPrmHdStausLessThan(Integer value) {
            addCriterion("prm_hd_staus <", value, "prmHdStaus");
            return (Criteria) this;
        }

        public Criteria andPrmHdStausLessThanOrEqualTo(Integer value) {
            addCriterion("prm_hd_staus <=", value, "prmHdStaus");
            return (Criteria) this;
        }

        public Criteria andPrmHdStausIn(List<Integer> values) {
            addCriterion("prm_hd_staus in", values, "prmHdStaus");
            return (Criteria) this;
        }

        public Criteria andPrmHdStausNotIn(List<Integer> values) {
            addCriterion("prm_hd_staus not in", values, "prmHdStaus");
            return (Criteria) this;
        }

        public Criteria andPrmHdStausBetween(Integer value1, Integer value2) {
            addCriterion("prm_hd_staus between", value1, value2, "prmHdStaus");
            return (Criteria) this;
        }

        public Criteria andPrmHdStausNotBetween(Integer value1, Integer value2) {
            addCriterion("prm_hd_staus not between", value1, value2, "prmHdStaus");
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