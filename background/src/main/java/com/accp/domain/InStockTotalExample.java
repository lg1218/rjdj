package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class InStockTotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InStockTotalExample() {
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

        public Criteria andIstIdIsNull() {
            addCriterion("ist_id is null");
            return (Criteria) this;
        }

        public Criteria andIstIdIsNotNull() {
            addCriterion("ist_id is not null");
            return (Criteria) this;
        }

        public Criteria andIstIdEqualTo(Integer value) {
            addCriterion("ist_id =", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdNotEqualTo(Integer value) {
            addCriterion("ist_id <>", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdGreaterThan(Integer value) {
            addCriterion("ist_id >", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ist_id >=", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdLessThan(Integer value) {
            addCriterion("ist_id <", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdLessThanOrEqualTo(Integer value) {
            addCriterion("ist_id <=", value, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdIn(List<Integer> values) {
            addCriterion("ist_id in", values, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdNotIn(List<Integer> values) {
            addCriterion("ist_id not in", values, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdBetween(Integer value1, Integer value2) {
            addCriterion("ist_id between", value1, value2, "istId");
            return (Criteria) this;
        }

        public Criteria andIstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ist_id not between", value1, value2, "istId");
            return (Criteria) this;
        }

        public Criteria andIstMmIdIsNull() {
            addCriterion("ist_mm_id is null");
            return (Criteria) this;
        }

        public Criteria andIstMmIdIsNotNull() {
            addCriterion("ist_mm_id is not null");
            return (Criteria) this;
        }

        public Criteria andIstMmIdEqualTo(String value) {
            addCriterion("ist_mm_id =", value, "istMmId");
            return (Criteria) this;
        }

        public Criteria andIstMmIdNotEqualTo(String value) {
            addCriterion("ist_mm_id <>", value, "istMmId");
            return (Criteria) this;
        }

        public Criteria andIstMmIdGreaterThan(String value) {
            addCriterion("ist_mm_id >", value, "istMmId");
            return (Criteria) this;
        }

        public Criteria andIstMmIdGreaterThanOrEqualTo(String value) {
            addCriterion("ist_mm_id >=", value, "istMmId");
            return (Criteria) this;
        }

        public Criteria andIstMmIdLessThan(String value) {
            addCriterion("ist_mm_id <", value, "istMmId");
            return (Criteria) this;
        }

        public Criteria andIstMmIdLessThanOrEqualTo(String value) {
            addCriterion("ist_mm_id <=", value, "istMmId");
            return (Criteria) this;
        }

        public Criteria andIstMmIdLike(String value) {
            addCriterion("ist_mm_id like", value, "istMmId");
            return (Criteria) this;
        }

        public Criteria andIstMmIdNotLike(String value) {
            addCriterion("ist_mm_id not like", value, "istMmId");
            return (Criteria) this;
        }

        public Criteria andIstMmIdIn(List<String> values) {
            addCriterion("ist_mm_id in", values, "istMmId");
            return (Criteria) this;
        }

        public Criteria andIstMmIdNotIn(List<String> values) {
            addCriterion("ist_mm_id not in", values, "istMmId");
            return (Criteria) this;
        }

        public Criteria andIstMmIdBetween(String value1, String value2) {
            addCriterion("ist_mm_id between", value1, value2, "istMmId");
            return (Criteria) this;
        }

        public Criteria andIstMmIdNotBetween(String value1, String value2) {
            addCriterion("ist_mm_id not between", value1, value2, "istMmId");
            return (Criteria) this;
        }

        public Criteria andIstNumIsNull() {
            addCriterion("ist_num is null");
            return (Criteria) this;
        }

        public Criteria andIstNumIsNotNull() {
            addCriterion("ist_num is not null");
            return (Criteria) this;
        }

        public Criteria andIstNumEqualTo(Integer value) {
            addCriterion("ist_num =", value, "istNum");
            return (Criteria) this;
        }

        public Criteria andIstNumNotEqualTo(Integer value) {
            addCriterion("ist_num <>", value, "istNum");
            return (Criteria) this;
        }

        public Criteria andIstNumGreaterThan(Integer value) {
            addCriterion("ist_num >", value, "istNum");
            return (Criteria) this;
        }

        public Criteria andIstNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ist_num >=", value, "istNum");
            return (Criteria) this;
        }

        public Criteria andIstNumLessThan(Integer value) {
            addCriterion("ist_num <", value, "istNum");
            return (Criteria) this;
        }

        public Criteria andIstNumLessThanOrEqualTo(Integer value) {
            addCriterion("ist_num <=", value, "istNum");
            return (Criteria) this;
        }

        public Criteria andIstNumIn(List<Integer> values) {
            addCriterion("ist_num in", values, "istNum");
            return (Criteria) this;
        }

        public Criteria andIstNumNotIn(List<Integer> values) {
            addCriterion("ist_num not in", values, "istNum");
            return (Criteria) this;
        }

        public Criteria andIstNumBetween(Integer value1, Integer value2) {
            addCriterion("ist_num between", value1, value2, "istNum");
            return (Criteria) this;
        }

        public Criteria andIstNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ist_num not between", value1, value2, "istNum");
            return (Criteria) this;
        }

        public Criteria andIstDpriceIsNull() {
            addCriterion("ist_dprice is null");
            return (Criteria) this;
        }

        public Criteria andIstDpriceIsNotNull() {
            addCriterion("ist_dprice is not null");
            return (Criteria) this;
        }

        public Criteria andIstDpriceEqualTo(Double value) {
            addCriterion("ist_dprice =", value, "istDprice");
            return (Criteria) this;
        }

        public Criteria andIstDpriceNotEqualTo(Double value) {
            addCriterion("ist_dprice <>", value, "istDprice");
            return (Criteria) this;
        }

        public Criteria andIstDpriceGreaterThan(Double value) {
            addCriterion("ist_dprice >", value, "istDprice");
            return (Criteria) this;
        }

        public Criteria andIstDpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ist_dprice >=", value, "istDprice");
            return (Criteria) this;
        }

        public Criteria andIstDpriceLessThan(Double value) {
            addCriterion("ist_dprice <", value, "istDprice");
            return (Criteria) this;
        }

        public Criteria andIstDpriceLessThanOrEqualTo(Double value) {
            addCriterion("ist_dprice <=", value, "istDprice");
            return (Criteria) this;
        }

        public Criteria andIstDpriceIn(List<Double> values) {
            addCriterion("ist_dprice in", values, "istDprice");
            return (Criteria) this;
        }

        public Criteria andIstDpriceNotIn(List<Double> values) {
            addCriterion("ist_dprice not in", values, "istDprice");
            return (Criteria) this;
        }

        public Criteria andIstDpriceBetween(Double value1, Double value2) {
            addCriterion("ist_dprice between", value1, value2, "istDprice");
            return (Criteria) this;
        }

        public Criteria andIstDpriceNotBetween(Double value1, Double value2) {
            addCriterion("ist_dprice not between", value1, value2, "istDprice");
            return (Criteria) this;
        }

        public Criteria andIstTotalmoneyIsNull() {
            addCriterion("ist_totalMoney is null");
            return (Criteria) this;
        }

        public Criteria andIstTotalmoneyIsNotNull() {
            addCriterion("ist_totalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andIstTotalmoneyEqualTo(Double value) {
            addCriterion("ist_totalMoney =", value, "istTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIstTotalmoneyNotEqualTo(Double value) {
            addCriterion("ist_totalMoney <>", value, "istTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIstTotalmoneyGreaterThan(Double value) {
            addCriterion("ist_totalMoney >", value, "istTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIstTotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ist_totalMoney >=", value, "istTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIstTotalmoneyLessThan(Double value) {
            addCriterion("ist_totalMoney <", value, "istTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIstTotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("ist_totalMoney <=", value, "istTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIstTotalmoneyIn(List<Double> values) {
            addCriterion("ist_totalMoney in", values, "istTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIstTotalmoneyNotIn(List<Double> values) {
            addCriterion("ist_totalMoney not in", values, "istTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIstTotalmoneyBetween(Double value1, Double value2) {
            addCriterion("ist_totalMoney between", value1, value2, "istTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIstTotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("ist_totalMoney not between", value1, value2, "istTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIstMmAnqnumIsNull() {
            addCriterion("ist_mm_anqnum is null");
            return (Criteria) this;
        }

        public Criteria andIstMmAnqnumIsNotNull() {
            addCriterion("ist_mm_anqnum is not null");
            return (Criteria) this;
        }

        public Criteria andIstMmAnqnumEqualTo(Integer value) {
            addCriterion("ist_mm_anqnum =", value, "istMmAnqnum");
            return (Criteria) this;
        }

        public Criteria andIstMmAnqnumNotEqualTo(Integer value) {
            addCriterion("ist_mm_anqnum <>", value, "istMmAnqnum");
            return (Criteria) this;
        }

        public Criteria andIstMmAnqnumGreaterThan(Integer value) {
            addCriterion("ist_mm_anqnum >", value, "istMmAnqnum");
            return (Criteria) this;
        }

        public Criteria andIstMmAnqnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ist_mm_anqnum >=", value, "istMmAnqnum");
            return (Criteria) this;
        }

        public Criteria andIstMmAnqnumLessThan(Integer value) {
            addCriterion("ist_mm_anqnum <", value, "istMmAnqnum");
            return (Criteria) this;
        }

        public Criteria andIstMmAnqnumLessThanOrEqualTo(Integer value) {
            addCriterion("ist_mm_anqnum <=", value, "istMmAnqnum");
            return (Criteria) this;
        }

        public Criteria andIstMmAnqnumIn(List<Integer> values) {
            addCriterion("ist_mm_anqnum in", values, "istMmAnqnum");
            return (Criteria) this;
        }

        public Criteria andIstMmAnqnumNotIn(List<Integer> values) {
            addCriterion("ist_mm_anqnum not in", values, "istMmAnqnum");
            return (Criteria) this;
        }

        public Criteria andIstMmAnqnumBetween(Integer value1, Integer value2) {
            addCriterion("ist_mm_anqnum between", value1, value2, "istMmAnqnum");
            return (Criteria) this;
        }

        public Criteria andIstMmAnqnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ist_mm_anqnum not between", value1, value2, "istMmAnqnum");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalnumIsNull() {
            addCriterion("ist_mm_start_totalnum is null");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalnumIsNotNull() {
            addCriterion("ist_mm_start_totalnum is not null");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalnumEqualTo(Integer value) {
            addCriterion("ist_mm_start_totalnum =", value, "istMmStartTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalnumNotEqualTo(Integer value) {
            addCriterion("ist_mm_start_totalnum <>", value, "istMmStartTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalnumGreaterThan(Integer value) {
            addCriterion("ist_mm_start_totalnum >", value, "istMmStartTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ist_mm_start_totalnum >=", value, "istMmStartTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalnumLessThan(Integer value) {
            addCriterion("ist_mm_start_totalnum <", value, "istMmStartTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalnumLessThanOrEqualTo(Integer value) {
            addCriterion("ist_mm_start_totalnum <=", value, "istMmStartTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalnumIn(List<Integer> values) {
            addCriterion("ist_mm_start_totalnum in", values, "istMmStartTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalnumNotIn(List<Integer> values) {
            addCriterion("ist_mm_start_totalnum not in", values, "istMmStartTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalnumBetween(Integer value1, Integer value2) {
            addCriterion("ist_mm_start_totalnum between", value1, value2, "istMmStartTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ist_mm_start_totalnum not between", value1, value2, "istMmStartTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmStartPjcpriceIsNull() {
            addCriterion("ist_mm_start_pjcprice is null");
            return (Criteria) this;
        }

        public Criteria andIstMmStartPjcpriceIsNotNull() {
            addCriterion("ist_mm_start_pjcprice is not null");
            return (Criteria) this;
        }

        public Criteria andIstMmStartPjcpriceEqualTo(Double value) {
            addCriterion("ist_mm_start_pjcprice =", value, "istMmStartPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartPjcpriceNotEqualTo(Double value) {
            addCriterion("ist_mm_start_pjcprice <>", value, "istMmStartPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartPjcpriceGreaterThan(Double value) {
            addCriterion("ist_mm_start_pjcprice >", value, "istMmStartPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartPjcpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ist_mm_start_pjcprice >=", value, "istMmStartPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartPjcpriceLessThan(Double value) {
            addCriterion("ist_mm_start_pjcprice <", value, "istMmStartPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartPjcpriceLessThanOrEqualTo(Double value) {
            addCriterion("ist_mm_start_pjcprice <=", value, "istMmStartPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartPjcpriceIn(List<Double> values) {
            addCriterion("ist_mm_start_pjcprice in", values, "istMmStartPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartPjcpriceNotIn(List<Double> values) {
            addCriterion("ist_mm_start_pjcprice not in", values, "istMmStartPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartPjcpriceBetween(Double value1, Double value2) {
            addCriterion("ist_mm_start_pjcprice between", value1, value2, "istMmStartPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartPjcpriceNotBetween(Double value1, Double value2) {
            addCriterion("ist_mm_start_pjcprice not between", value1, value2, "istMmStartPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartBbPjcpriceIsNull() {
            addCriterion("Ist_mm_start_bb_pjcprice is null");
            return (Criteria) this;
        }

        public Criteria andIstMmStartBbPjcpriceIsNotNull() {
            addCriterion("Ist_mm_start_bb_pjcprice is not null");
            return (Criteria) this;
        }

        public Criteria andIstMmStartBbPjcpriceEqualTo(Double value) {
            addCriterion("Ist_mm_start_bb_pjcprice =", value, "istMmStartBbPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartBbPjcpriceNotEqualTo(Double value) {
            addCriterion("Ist_mm_start_bb_pjcprice <>", value, "istMmStartBbPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartBbPjcpriceGreaterThan(Double value) {
            addCriterion("Ist_mm_start_bb_pjcprice >", value, "istMmStartBbPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartBbPjcpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Ist_mm_start_bb_pjcprice >=", value, "istMmStartBbPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartBbPjcpriceLessThan(Double value) {
            addCriterion("Ist_mm_start_bb_pjcprice <", value, "istMmStartBbPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartBbPjcpriceLessThanOrEqualTo(Double value) {
            addCriterion("Ist_mm_start_bb_pjcprice <=", value, "istMmStartBbPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartBbPjcpriceIn(List<Double> values) {
            addCriterion("Ist_mm_start_bb_pjcprice in", values, "istMmStartBbPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartBbPjcpriceNotIn(List<Double> values) {
            addCriterion("Ist_mm_start_bb_pjcprice not in", values, "istMmStartBbPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartBbPjcpriceBetween(Double value1, Double value2) {
            addCriterion("Ist_mm_start_bb_pjcprice between", value1, value2, "istMmStartBbPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartBbPjcpriceNotBetween(Double value1, Double value2) {
            addCriterion("Ist_mm_start_bb_pjcprice not between", value1, value2, "istMmStartBbPjcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalcpriceIsNull() {
            addCriterion("Ist_mm_start_totalcprice is null");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalcpriceIsNotNull() {
            addCriterion("Ist_mm_start_totalcprice is not null");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalcpriceEqualTo(Double value) {
            addCriterion("Ist_mm_start_totalcprice =", value, "istMmStartTotalcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalcpriceNotEqualTo(Double value) {
            addCriterion("Ist_mm_start_totalcprice <>", value, "istMmStartTotalcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalcpriceGreaterThan(Double value) {
            addCriterion("Ist_mm_start_totalcprice >", value, "istMmStartTotalcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalcpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Ist_mm_start_totalcprice >=", value, "istMmStartTotalcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalcpriceLessThan(Double value) {
            addCriterion("Ist_mm_start_totalcprice <", value, "istMmStartTotalcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalcpriceLessThanOrEqualTo(Double value) {
            addCriterion("Ist_mm_start_totalcprice <=", value, "istMmStartTotalcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalcpriceIn(List<Double> values) {
            addCriterion("Ist_mm_start_totalcprice in", values, "istMmStartTotalcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalcpriceNotIn(List<Double> values) {
            addCriterion("Ist_mm_start_totalcprice not in", values, "istMmStartTotalcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalcpriceBetween(Double value1, Double value2) {
            addCriterion("Ist_mm_start_totalcprice between", value1, value2, "istMmStartTotalcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmStartTotalcpriceNotBetween(Double value1, Double value2) {
            addCriterion("Ist_mm_start_totalcprice not between", value1, value2, "istMmStartTotalcprice");
            return (Criteria) this;
        }

        public Criteria andIstMmDyAnqcunIsNull() {
            addCriterion("Ist_mm_dy_anqcun is null");
            return (Criteria) this;
        }

        public Criteria andIstMmDyAnqcunIsNotNull() {
            addCriterion("Ist_mm_dy_anqcun is not null");
            return (Criteria) this;
        }

        public Criteria andIstMmDyAnqcunEqualTo(Integer value) {
            addCriterion("Ist_mm_dy_anqcun =", value, "istMmDyAnqcun");
            return (Criteria) this;
        }

        public Criteria andIstMmDyAnqcunNotEqualTo(Integer value) {
            addCriterion("Ist_mm_dy_anqcun <>", value, "istMmDyAnqcun");
            return (Criteria) this;
        }

        public Criteria andIstMmDyAnqcunGreaterThan(Integer value) {
            addCriterion("Ist_mm_dy_anqcun >", value, "istMmDyAnqcun");
            return (Criteria) this;
        }

        public Criteria andIstMmDyAnqcunGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ist_mm_dy_anqcun >=", value, "istMmDyAnqcun");
            return (Criteria) this;
        }

        public Criteria andIstMmDyAnqcunLessThan(Integer value) {
            addCriterion("Ist_mm_dy_anqcun <", value, "istMmDyAnqcun");
            return (Criteria) this;
        }

        public Criteria andIstMmDyAnqcunLessThanOrEqualTo(Integer value) {
            addCriterion("Ist_mm_dy_anqcun <=", value, "istMmDyAnqcun");
            return (Criteria) this;
        }

        public Criteria andIstMmDyAnqcunIn(List<Integer> values) {
            addCriterion("Ist_mm_dy_anqcun in", values, "istMmDyAnqcun");
            return (Criteria) this;
        }

        public Criteria andIstMmDyAnqcunNotIn(List<Integer> values) {
            addCriterion("Ist_mm_dy_anqcun not in", values, "istMmDyAnqcun");
            return (Criteria) this;
        }

        public Criteria andIstMmDyAnqcunBetween(Integer value1, Integer value2) {
            addCriterion("Ist_mm_dy_anqcun between", value1, value2, "istMmDyAnqcun");
            return (Criteria) this;
        }

        public Criteria andIstMmDyAnqcunNotBetween(Integer value1, Integer value2) {
            addCriterion("Ist_mm_dy_anqcun not between", value1, value2, "istMmDyAnqcun");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalnumIsNull() {
            addCriterion("Ist_mm_now_totalnum is null");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalnumIsNotNull() {
            addCriterion("Ist_mm_now_totalnum is not null");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalnumEqualTo(Integer value) {
            addCriterion("Ist_mm_now_totalnum =", value, "istMmNowTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalnumNotEqualTo(Integer value) {
            addCriterion("Ist_mm_now_totalnum <>", value, "istMmNowTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalnumGreaterThan(Integer value) {
            addCriterion("Ist_mm_now_totalnum >", value, "istMmNowTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ist_mm_now_totalnum >=", value, "istMmNowTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalnumLessThan(Integer value) {
            addCriterion("Ist_mm_now_totalnum <", value, "istMmNowTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalnumLessThanOrEqualTo(Integer value) {
            addCriterion("Ist_mm_now_totalnum <=", value, "istMmNowTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalnumIn(List<Integer> values) {
            addCriterion("Ist_mm_now_totalnum in", values, "istMmNowTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalnumNotIn(List<Integer> values) {
            addCriterion("Ist_mm_now_totalnum not in", values, "istMmNowTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalnumBetween(Integer value1, Integer value2) {
            addCriterion("Ist_mm_now_totalnum between", value1, value2, "istMmNowTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalnumNotBetween(Integer value1, Integer value2) {
            addCriterion("Ist_mm_now_totalnum not between", value1, value2, "istMmNowTotalnum");
            return (Criteria) this;
        }

        public Criteria andIstMmNowPccpriceIsNull() {
            addCriterion("Ist_mm_now_pccprice is null");
            return (Criteria) this;
        }

        public Criteria andIstMmNowPccpriceIsNotNull() {
            addCriterion("Ist_mm_now_pccprice is not null");
            return (Criteria) this;
        }

        public Criteria andIstMmNowPccpriceEqualTo(Double value) {
            addCriterion("Ist_mm_now_pccprice =", value, "istMmNowPccprice");
            return (Criteria) this;
        }

        public Criteria andIstMmNowPccpriceNotEqualTo(Double value) {
            addCriterion("Ist_mm_now_pccprice <>", value, "istMmNowPccprice");
            return (Criteria) this;
        }

        public Criteria andIstMmNowPccpriceGreaterThan(Double value) {
            addCriterion("Ist_mm_now_pccprice >", value, "istMmNowPccprice");
            return (Criteria) this;
        }

        public Criteria andIstMmNowPccpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Ist_mm_now_pccprice >=", value, "istMmNowPccprice");
            return (Criteria) this;
        }

        public Criteria andIstMmNowPccpriceLessThan(Double value) {
            addCriterion("Ist_mm_now_pccprice <", value, "istMmNowPccprice");
            return (Criteria) this;
        }

        public Criteria andIstMmNowPccpriceLessThanOrEqualTo(Double value) {
            addCriterion("Ist_mm_now_pccprice <=", value, "istMmNowPccprice");
            return (Criteria) this;
        }

        public Criteria andIstMmNowPccpriceIn(List<Double> values) {
            addCriterion("Ist_mm_now_pccprice in", values, "istMmNowPccprice");
            return (Criteria) this;
        }

        public Criteria andIstMmNowPccpriceNotIn(List<Double> values) {
            addCriterion("Ist_mm_now_pccprice not in", values, "istMmNowPccprice");
            return (Criteria) this;
        }

        public Criteria andIstMmNowPccpriceBetween(Double value1, Double value2) {
            addCriterion("Ist_mm_now_pccprice between", value1, value2, "istMmNowPccprice");
            return (Criteria) this;
        }

        public Criteria andIstMmNowPccpriceNotBetween(Double value1, Double value2) {
            addCriterion("Ist_mm_now_pccprice not between", value1, value2, "istMmNowPccprice");
            return (Criteria) this;
        }

        public Criteria andIstMmNowBztotalcbIsNull() {
            addCriterion("Ist_mm_now_bztotalcb is null");
            return (Criteria) this;
        }

        public Criteria andIstMmNowBztotalcbIsNotNull() {
            addCriterion("Ist_mm_now_bztotalcb is not null");
            return (Criteria) this;
        }

        public Criteria andIstMmNowBztotalcbEqualTo(Double value) {
            addCriterion("Ist_mm_now_bztotalcb =", value, "istMmNowBztotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowBztotalcbNotEqualTo(Double value) {
            addCriterion("Ist_mm_now_bztotalcb <>", value, "istMmNowBztotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowBztotalcbGreaterThan(Double value) {
            addCriterion("Ist_mm_now_bztotalcb >", value, "istMmNowBztotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowBztotalcbGreaterThanOrEqualTo(Double value) {
            addCriterion("Ist_mm_now_bztotalcb >=", value, "istMmNowBztotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowBztotalcbLessThan(Double value) {
            addCriterion("Ist_mm_now_bztotalcb <", value, "istMmNowBztotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowBztotalcbLessThanOrEqualTo(Double value) {
            addCriterion("Ist_mm_now_bztotalcb <=", value, "istMmNowBztotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowBztotalcbIn(List<Double> values) {
            addCriterion("Ist_mm_now_bztotalcb in", values, "istMmNowBztotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowBztotalcbNotIn(List<Double> values) {
            addCriterion("Ist_mm_now_bztotalcb not in", values, "istMmNowBztotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowBztotalcbBetween(Double value1, Double value2) {
            addCriterion("Ist_mm_now_bztotalcb between", value1, value2, "istMmNowBztotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowBztotalcbNotBetween(Double value1, Double value2) {
            addCriterion("Ist_mm_now_bztotalcb not between", value1, value2, "istMmNowBztotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalcbIsNull() {
            addCriterion("Ist_mm_now_totalcb is null");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalcbIsNotNull() {
            addCriterion("Ist_mm_now_totalcb is not null");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalcbEqualTo(Double value) {
            addCriterion("Ist_mm_now_totalcb =", value, "istMmNowTotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalcbNotEqualTo(Double value) {
            addCriterion("Ist_mm_now_totalcb <>", value, "istMmNowTotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalcbGreaterThan(Double value) {
            addCriterion("Ist_mm_now_totalcb >", value, "istMmNowTotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalcbGreaterThanOrEqualTo(Double value) {
            addCriterion("Ist_mm_now_totalcb >=", value, "istMmNowTotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalcbLessThan(Double value) {
            addCriterion("Ist_mm_now_totalcb <", value, "istMmNowTotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalcbLessThanOrEqualTo(Double value) {
            addCriterion("Ist_mm_now_totalcb <=", value, "istMmNowTotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalcbIn(List<Double> values) {
            addCriterion("Ist_mm_now_totalcb in", values, "istMmNowTotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalcbNotIn(List<Double> values) {
            addCriterion("Ist_mm_now_totalcb not in", values, "istMmNowTotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalcbBetween(Double value1, Double value2) {
            addCriterion("Ist_mm_now_totalcb between", value1, value2, "istMmNowTotalcb");
            return (Criteria) this;
        }

        public Criteria andIstMmNowTotalcbNotBetween(Double value1, Double value2) {
            addCriterion("Ist_mm_now_totalcb not between", value1, value2, "istMmNowTotalcb");
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