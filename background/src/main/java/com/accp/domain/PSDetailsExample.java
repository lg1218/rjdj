package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PSDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PSDetailsExample() {
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

        public Criteria andPsdLineidIsNull() {
            addCriterion("psd_lineid is null");
            return (Criteria) this;
        }

        public Criteria andPsdLineidIsNotNull() {
            addCriterion("psd_lineid is not null");
            return (Criteria) this;
        }

        public Criteria andPsdLineidEqualTo(Integer value) {
            addCriterion("psd_lineid =", value, "psdLineid");
            return (Criteria) this;
        }

        public Criteria andPsdLineidNotEqualTo(Integer value) {
            addCriterion("psd_lineid <>", value, "psdLineid");
            return (Criteria) this;
        }

        public Criteria andPsdLineidGreaterThan(Integer value) {
            addCriterion("psd_lineid >", value, "psdLineid");
            return (Criteria) this;
        }

        public Criteria andPsdLineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("psd_lineid >=", value, "psdLineid");
            return (Criteria) this;
        }

        public Criteria andPsdLineidLessThan(Integer value) {
            addCriterion("psd_lineid <", value, "psdLineid");
            return (Criteria) this;
        }

        public Criteria andPsdLineidLessThanOrEqualTo(Integer value) {
            addCriterion("psd_lineid <=", value, "psdLineid");
            return (Criteria) this;
        }

        public Criteria andPsdLineidIn(List<Integer> values) {
            addCriterion("psd_lineid in", values, "psdLineid");
            return (Criteria) this;
        }

        public Criteria andPsdLineidNotIn(List<Integer> values) {
            addCriterion("psd_lineid not in", values, "psdLineid");
            return (Criteria) this;
        }

        public Criteria andPsdLineidBetween(Integer value1, Integer value2) {
            addCriterion("psd_lineid between", value1, value2, "psdLineid");
            return (Criteria) this;
        }

        public Criteria andPsdLineidNotBetween(Integer value1, Integer value2) {
            addCriterion("psd_lineid not between", value1, value2, "psdLineid");
            return (Criteria) this;
        }

        public Criteria andPsdPsmIdIsNull() {
            addCriterion("psd_psm_id is null");
            return (Criteria) this;
        }

        public Criteria andPsdPsmIdIsNotNull() {
            addCriterion("psd_psm_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsdPsmIdEqualTo(Integer value) {
            addCriterion("psd_psm_id =", value, "psdPsmId");
            return (Criteria) this;
        }

        public Criteria andPsdPsmIdNotEqualTo(Integer value) {
            addCriterion("psd_psm_id <>", value, "psdPsmId");
            return (Criteria) this;
        }

        public Criteria andPsdPsmIdGreaterThan(Integer value) {
            addCriterion("psd_psm_id >", value, "psdPsmId");
            return (Criteria) this;
        }

        public Criteria andPsdPsmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("psd_psm_id >=", value, "psdPsmId");
            return (Criteria) this;
        }

        public Criteria andPsdPsmIdLessThan(Integer value) {
            addCriterion("psd_psm_id <", value, "psdPsmId");
            return (Criteria) this;
        }

        public Criteria andPsdPsmIdLessThanOrEqualTo(Integer value) {
            addCriterion("psd_psm_id <=", value, "psdPsmId");
            return (Criteria) this;
        }

        public Criteria andPsdPsmIdIn(List<Integer> values) {
            addCriterion("psd_psm_id in", values, "psdPsmId");
            return (Criteria) this;
        }

        public Criteria andPsdPsmIdNotIn(List<Integer> values) {
            addCriterion("psd_psm_id not in", values, "psdPsmId");
            return (Criteria) this;
        }

        public Criteria andPsdPsmIdBetween(Integer value1, Integer value2) {
            addCriterion("psd_psm_id between", value1, value2, "psdPsmId");
            return (Criteria) this;
        }

        public Criteria andPsdPsmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("psd_psm_id not between", value1, value2, "psdPsmId");
            return (Criteria) this;
        }

        public Criteria andPsdMmIdIsNull() {
            addCriterion("psd_mm_id is null");
            return (Criteria) this;
        }

        public Criteria andPsdMmIdIsNotNull() {
            addCriterion("psd_mm_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsdMmIdEqualTo(Integer value) {
            addCriterion("psd_mm_id =", value, "psdMmId");
            return (Criteria) this;
        }

        public Criteria andPsdMmIdNotEqualTo(Integer value) {
            addCriterion("psd_mm_id <>", value, "psdMmId");
            return (Criteria) this;
        }

        public Criteria andPsdMmIdGreaterThan(Integer value) {
            addCriterion("psd_mm_id >", value, "psdMmId");
            return (Criteria) this;
        }

        public Criteria andPsdMmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("psd_mm_id >=", value, "psdMmId");
            return (Criteria) this;
        }

        public Criteria andPsdMmIdLessThan(Integer value) {
            addCriterion("psd_mm_id <", value, "psdMmId");
            return (Criteria) this;
        }

        public Criteria andPsdMmIdLessThanOrEqualTo(Integer value) {
            addCriterion("psd_mm_id <=", value, "psdMmId");
            return (Criteria) this;
        }

        public Criteria andPsdMmIdIn(List<Integer> values) {
            addCriterion("psd_mm_id in", values, "psdMmId");
            return (Criteria) this;
        }

        public Criteria andPsdMmIdNotIn(List<Integer> values) {
            addCriterion("psd_mm_id not in", values, "psdMmId");
            return (Criteria) this;
        }

        public Criteria andPsdMmIdBetween(Integer value1, Integer value2) {
            addCriterion("psd_mm_id between", value1, value2, "psdMmId");
            return (Criteria) this;
        }

        public Criteria andPsdMmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("psd_mm_id not between", value1, value2, "psdMmId");
            return (Criteria) this;
        }

        public Criteria andPsdMmnameIsNull() {
            addCriterion("psd_mmname is null");
            return (Criteria) this;
        }

        public Criteria andPsdMmnameIsNotNull() {
            addCriterion("psd_mmname is not null");
            return (Criteria) this;
        }

        public Criteria andPsdMmnameEqualTo(String value) {
            addCriterion("psd_mmname =", value, "psdMmname");
            return (Criteria) this;
        }

        public Criteria andPsdMmnameNotEqualTo(String value) {
            addCriterion("psd_mmname <>", value, "psdMmname");
            return (Criteria) this;
        }

        public Criteria andPsdMmnameGreaterThan(String value) {
            addCriterion("psd_mmname >", value, "psdMmname");
            return (Criteria) this;
        }

        public Criteria andPsdMmnameGreaterThanOrEqualTo(String value) {
            addCriterion("psd_mmname >=", value, "psdMmname");
            return (Criteria) this;
        }

        public Criteria andPsdMmnameLessThan(String value) {
            addCriterion("psd_mmname <", value, "psdMmname");
            return (Criteria) this;
        }

        public Criteria andPsdMmnameLessThanOrEqualTo(String value) {
            addCriterion("psd_mmname <=", value, "psdMmname");
            return (Criteria) this;
        }

        public Criteria andPsdMmnameLike(String value) {
            addCriterion("psd_mmname like", value, "psdMmname");
            return (Criteria) this;
        }

        public Criteria andPsdMmnameNotLike(String value) {
            addCriterion("psd_mmname not like", value, "psdMmname");
            return (Criteria) this;
        }

        public Criteria andPsdMmnameIn(List<String> values) {
            addCriterion("psd_mmname in", values, "psdMmname");
            return (Criteria) this;
        }

        public Criteria andPsdMmnameNotIn(List<String> values) {
            addCriterion("psd_mmname not in", values, "psdMmname");
            return (Criteria) this;
        }

        public Criteria andPsdMmnameBetween(String value1, String value2) {
            addCriterion("psd_mmname between", value1, value2, "psdMmname");
            return (Criteria) this;
        }

        public Criteria andPsdMmnameNotBetween(String value1, String value2) {
            addCriterion("psd_mmname not between", value1, value2, "psdMmname");
            return (Criteria) this;
        }

        public Criteria andPsdMmxhIsNull() {
            addCriterion("psd_mmxh is null");
            return (Criteria) this;
        }

        public Criteria andPsdMmxhIsNotNull() {
            addCriterion("psd_mmxh is not null");
            return (Criteria) this;
        }

        public Criteria andPsdMmxhEqualTo(String value) {
            addCriterion("psd_mmxh =", value, "psdMmxh");
            return (Criteria) this;
        }

        public Criteria andPsdMmxhNotEqualTo(String value) {
            addCriterion("psd_mmxh <>", value, "psdMmxh");
            return (Criteria) this;
        }

        public Criteria andPsdMmxhGreaterThan(String value) {
            addCriterion("psd_mmxh >", value, "psdMmxh");
            return (Criteria) this;
        }

        public Criteria andPsdMmxhGreaterThanOrEqualTo(String value) {
            addCriterion("psd_mmxh >=", value, "psdMmxh");
            return (Criteria) this;
        }

        public Criteria andPsdMmxhLessThan(String value) {
            addCriterion("psd_mmxh <", value, "psdMmxh");
            return (Criteria) this;
        }

        public Criteria andPsdMmxhLessThanOrEqualTo(String value) {
            addCriterion("psd_mmxh <=", value, "psdMmxh");
            return (Criteria) this;
        }

        public Criteria andPsdMmxhLike(String value) {
            addCriterion("psd_mmxh like", value, "psdMmxh");
            return (Criteria) this;
        }

        public Criteria andPsdMmxhNotLike(String value) {
            addCriterion("psd_mmxh not like", value, "psdMmxh");
            return (Criteria) this;
        }

        public Criteria andPsdMmxhIn(List<String> values) {
            addCriterion("psd_mmxh in", values, "psdMmxh");
            return (Criteria) this;
        }

        public Criteria andPsdMmxhNotIn(List<String> values) {
            addCriterion("psd_mmxh not in", values, "psdMmxh");
            return (Criteria) this;
        }

        public Criteria andPsdMmxhBetween(String value1, String value2) {
            addCriterion("psd_mmxh between", value1, value2, "psdMmxh");
            return (Criteria) this;
        }

        public Criteria andPsdMmxhNotBetween(String value1, String value2) {
            addCriterion("psd_mmxh not between", value1, value2, "psdMmxh");
            return (Criteria) this;
        }

        public Criteria andPsdNumIsNull() {
            addCriterion("psd_num is null");
            return (Criteria) this;
        }

        public Criteria andPsdNumIsNotNull() {
            addCriterion("psd_num is not null");
            return (Criteria) this;
        }

        public Criteria andPsdNumEqualTo(Integer value) {
            addCriterion("psd_num =", value, "psdNum");
            return (Criteria) this;
        }

        public Criteria andPsdNumNotEqualTo(Integer value) {
            addCriterion("psd_num <>", value, "psdNum");
            return (Criteria) this;
        }

        public Criteria andPsdNumGreaterThan(Integer value) {
            addCriterion("psd_num >", value, "psdNum");
            return (Criteria) this;
        }

        public Criteria andPsdNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("psd_num >=", value, "psdNum");
            return (Criteria) this;
        }

        public Criteria andPsdNumLessThan(Integer value) {
            addCriterion("psd_num <", value, "psdNum");
            return (Criteria) this;
        }

        public Criteria andPsdNumLessThanOrEqualTo(Integer value) {
            addCriterion("psd_num <=", value, "psdNum");
            return (Criteria) this;
        }

        public Criteria andPsdNumIn(List<Integer> values) {
            addCriterion("psd_num in", values, "psdNum");
            return (Criteria) this;
        }

        public Criteria andPsdNumNotIn(List<Integer> values) {
            addCriterion("psd_num not in", values, "psdNum");
            return (Criteria) this;
        }

        public Criteria andPsdNumBetween(Integer value1, Integer value2) {
            addCriterion("psd_num between", value1, value2, "psdNum");
            return (Criteria) this;
        }

        public Criteria andPsdNumNotBetween(Integer value1, Integer value2) {
            addCriterion("psd_num not between", value1, value2, "psdNum");
            return (Criteria) this;
        }

        public Criteria andPsdDpriceIsNull() {
            addCriterion("psd_dprice is null");
            return (Criteria) this;
        }

        public Criteria andPsdDpriceIsNotNull() {
            addCriterion("psd_dprice is not null");
            return (Criteria) this;
        }

        public Criteria andPsdDpriceEqualTo(Double value) {
            addCriterion("psd_dprice =", value, "psdDprice");
            return (Criteria) this;
        }

        public Criteria andPsdDpriceNotEqualTo(Double value) {
            addCriterion("psd_dprice <>", value, "psdDprice");
            return (Criteria) this;
        }

        public Criteria andPsdDpriceGreaterThan(Double value) {
            addCriterion("psd_dprice >", value, "psdDprice");
            return (Criteria) this;
        }

        public Criteria andPsdDpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("psd_dprice >=", value, "psdDprice");
            return (Criteria) this;
        }

        public Criteria andPsdDpriceLessThan(Double value) {
            addCriterion("psd_dprice <", value, "psdDprice");
            return (Criteria) this;
        }

        public Criteria andPsdDpriceLessThanOrEqualTo(Double value) {
            addCriterion("psd_dprice <=", value, "psdDprice");
            return (Criteria) this;
        }

        public Criteria andPsdDpriceIn(List<Double> values) {
            addCriterion("psd_dprice in", values, "psdDprice");
            return (Criteria) this;
        }

        public Criteria andPsdDpriceNotIn(List<Double> values) {
            addCriterion("psd_dprice not in", values, "psdDprice");
            return (Criteria) this;
        }

        public Criteria andPsdDpriceBetween(Double value1, Double value2) {
            addCriterion("psd_dprice between", value1, value2, "psdDprice");
            return (Criteria) this;
        }

        public Criteria andPsdDpriceNotBetween(Double value1, Double value2) {
            addCriterion("psd_dprice not between", value1, value2, "psdDprice");
            return (Criteria) this;
        }

        public Criteria andPsdUnameIsNull() {
            addCriterion("psd_uname is null");
            return (Criteria) this;
        }

        public Criteria andPsdUnameIsNotNull() {
            addCriterion("psd_uname is not null");
            return (Criteria) this;
        }

        public Criteria andPsdUnameEqualTo(String value) {
            addCriterion("psd_uname =", value, "psdUname");
            return (Criteria) this;
        }

        public Criteria andPsdUnameNotEqualTo(String value) {
            addCriterion("psd_uname <>", value, "psdUname");
            return (Criteria) this;
        }

        public Criteria andPsdUnameGreaterThan(String value) {
            addCriterion("psd_uname >", value, "psdUname");
            return (Criteria) this;
        }

        public Criteria andPsdUnameGreaterThanOrEqualTo(String value) {
            addCriterion("psd_uname >=", value, "psdUname");
            return (Criteria) this;
        }

        public Criteria andPsdUnameLessThan(String value) {
            addCriterion("psd_uname <", value, "psdUname");
            return (Criteria) this;
        }

        public Criteria andPsdUnameLessThanOrEqualTo(String value) {
            addCriterion("psd_uname <=", value, "psdUname");
            return (Criteria) this;
        }

        public Criteria andPsdUnameLike(String value) {
            addCriterion("psd_uname like", value, "psdUname");
            return (Criteria) this;
        }

        public Criteria andPsdUnameNotLike(String value) {
            addCriterion("psd_uname not like", value, "psdUname");
            return (Criteria) this;
        }

        public Criteria andPsdUnameIn(List<String> values) {
            addCriterion("psd_uname in", values, "psdUname");
            return (Criteria) this;
        }

        public Criteria andPsdUnameNotIn(List<String> values) {
            addCriterion("psd_uname not in", values, "psdUname");
            return (Criteria) this;
        }

        public Criteria andPsdUnameBetween(String value1, String value2) {
            addCriterion("psd_uname between", value1, value2, "psdUname");
            return (Criteria) this;
        }

        public Criteria andPsdUnameNotBetween(String value1, String value2) {
            addCriterion("psd_uname not between", value1, value2, "psdUname");
            return (Criteria) this;
        }

        public Criteria andPsdZheshuIsNull() {
            addCriterion("psd_zheshu is null");
            return (Criteria) this;
        }

        public Criteria andPsdZheshuIsNotNull() {
            addCriterion("psd_zheshu is not null");
            return (Criteria) this;
        }

        public Criteria andPsdZheshuEqualTo(Double value) {
            addCriterion("psd_zheshu =", value, "psdZheshu");
            return (Criteria) this;
        }

        public Criteria andPsdZheshuNotEqualTo(Double value) {
            addCriterion("psd_zheshu <>", value, "psdZheshu");
            return (Criteria) this;
        }

        public Criteria andPsdZheshuGreaterThan(Double value) {
            addCriterion("psd_zheshu >", value, "psdZheshu");
            return (Criteria) this;
        }

        public Criteria andPsdZheshuGreaterThanOrEqualTo(Double value) {
            addCriterion("psd_zheshu >=", value, "psdZheshu");
            return (Criteria) this;
        }

        public Criteria andPsdZheshuLessThan(Double value) {
            addCriterion("psd_zheshu <", value, "psdZheshu");
            return (Criteria) this;
        }

        public Criteria andPsdZheshuLessThanOrEqualTo(Double value) {
            addCriterion("psd_zheshu <=", value, "psdZheshu");
            return (Criteria) this;
        }

        public Criteria andPsdZheshuIn(List<Double> values) {
            addCriterion("psd_zheshu in", values, "psdZheshu");
            return (Criteria) this;
        }

        public Criteria andPsdZheshuNotIn(List<Double> values) {
            addCriterion("psd_zheshu not in", values, "psdZheshu");
            return (Criteria) this;
        }

        public Criteria andPsdZheshuBetween(Double value1, Double value2) {
            addCriterion("psd_zheshu between", value1, value2, "psdZheshu");
            return (Criteria) this;
        }

        public Criteria andPsdZheshuNotBetween(Double value1, Double value2) {
            addCriterion("psd_zheshu not between", value1, value2, "psdZheshu");
            return (Criteria) this;
        }

        public Criteria andPsdZhDpriceIsNull() {
            addCriterion("psd_zh_dprice is null");
            return (Criteria) this;
        }

        public Criteria andPsdZhDpriceIsNotNull() {
            addCriterion("psd_zh_dprice is not null");
            return (Criteria) this;
        }

        public Criteria andPsdZhDpriceEqualTo(Double value) {
            addCriterion("psd_zh_dprice =", value, "psdZhDprice");
            return (Criteria) this;
        }

        public Criteria andPsdZhDpriceNotEqualTo(Double value) {
            addCriterion("psd_zh_dprice <>", value, "psdZhDprice");
            return (Criteria) this;
        }

        public Criteria andPsdZhDpriceGreaterThan(Double value) {
            addCriterion("psd_zh_dprice >", value, "psdZhDprice");
            return (Criteria) this;
        }

        public Criteria andPsdZhDpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("psd_zh_dprice >=", value, "psdZhDprice");
            return (Criteria) this;
        }

        public Criteria andPsdZhDpriceLessThan(Double value) {
            addCriterion("psd_zh_dprice <", value, "psdZhDprice");
            return (Criteria) this;
        }

        public Criteria andPsdZhDpriceLessThanOrEqualTo(Double value) {
            addCriterion("psd_zh_dprice <=", value, "psdZhDprice");
            return (Criteria) this;
        }

        public Criteria andPsdZhDpriceIn(List<Double> values) {
            addCriterion("psd_zh_dprice in", values, "psdZhDprice");
            return (Criteria) this;
        }

        public Criteria andPsdZhDpriceNotIn(List<Double> values) {
            addCriterion("psd_zh_dprice not in", values, "psdZhDprice");
            return (Criteria) this;
        }

        public Criteria andPsdZhDpriceBetween(Double value1, Double value2) {
            addCriterion("psd_zh_dprice between", value1, value2, "psdZhDprice");
            return (Criteria) this;
        }

        public Criteria andPsdZhDpriceNotBetween(Double value1, Double value2) {
            addCriterion("psd_zh_dprice not between", value1, value2, "psdZhDprice");
            return (Criteria) this;
        }

        public Criteria andPsdBhsTotalmoneyIsNull() {
            addCriterion("psd_bhs_totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andPsdBhsTotalmoneyIsNotNull() {
            addCriterion("psd_bhs_totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPsdBhsTotalmoneyEqualTo(Double value) {
            addCriterion("psd_bhs_totalmoney =", value, "psdBhsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsdBhsTotalmoneyNotEqualTo(Double value) {
            addCriterion("psd_bhs_totalmoney <>", value, "psdBhsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsdBhsTotalmoneyGreaterThan(Double value) {
            addCriterion("psd_bhs_totalmoney >", value, "psdBhsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsdBhsTotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("psd_bhs_totalmoney >=", value, "psdBhsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsdBhsTotalmoneyLessThan(Double value) {
            addCriterion("psd_bhs_totalmoney <", value, "psdBhsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsdBhsTotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("psd_bhs_totalmoney <=", value, "psdBhsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsdBhsTotalmoneyIn(List<Double> values) {
            addCriterion("psd_bhs_totalmoney in", values, "psdBhsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsdBhsTotalmoneyNotIn(List<Double> values) {
            addCriterion("psd_bhs_totalmoney not in", values, "psdBhsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsdBhsTotalmoneyBetween(Double value1, Double value2) {
            addCriterion("psd_bhs_totalmoney between", value1, value2, "psdBhsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsdBhsTotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("psd_bhs_totalmoney not between", value1, value2, "psdBhsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andPsdSlvIsNull() {
            addCriterion("psd_slv is null");
            return (Criteria) this;
        }

        public Criteria andPsdSlvIsNotNull() {
            addCriterion("psd_slv is not null");
            return (Criteria) this;
        }

        public Criteria andPsdSlvEqualTo(Double value) {
            addCriterion("psd_slv =", value, "psdSlv");
            return (Criteria) this;
        }

        public Criteria andPsdSlvNotEqualTo(Double value) {
            addCriterion("psd_slv <>", value, "psdSlv");
            return (Criteria) this;
        }

        public Criteria andPsdSlvGreaterThan(Double value) {
            addCriterion("psd_slv >", value, "psdSlv");
            return (Criteria) this;
        }

        public Criteria andPsdSlvGreaterThanOrEqualTo(Double value) {
            addCriterion("psd_slv >=", value, "psdSlv");
            return (Criteria) this;
        }

        public Criteria andPsdSlvLessThan(Double value) {
            addCriterion("psd_slv <", value, "psdSlv");
            return (Criteria) this;
        }

        public Criteria andPsdSlvLessThanOrEqualTo(Double value) {
            addCriterion("psd_slv <=", value, "psdSlv");
            return (Criteria) this;
        }

        public Criteria andPsdSlvIn(List<Double> values) {
            addCriterion("psd_slv in", values, "psdSlv");
            return (Criteria) this;
        }

        public Criteria andPsdSlvNotIn(List<Double> values) {
            addCriterion("psd_slv not in", values, "psdSlv");
            return (Criteria) this;
        }

        public Criteria andPsdSlvBetween(Double value1, Double value2) {
            addCriterion("psd_slv between", value1, value2, "psdSlv");
            return (Criteria) this;
        }

        public Criteria andPsdSlvNotBetween(Double value1, Double value2) {
            addCriterion("psd_slv not between", value1, value2, "psdSlv");
            return (Criteria) this;
        }

        public Criteria andPsdShuieIsNull() {
            addCriterion("psd_shuie is null");
            return (Criteria) this;
        }

        public Criteria andPsdShuieIsNotNull() {
            addCriterion("psd_shuie is not null");
            return (Criteria) this;
        }

        public Criteria andPsdShuieEqualTo(Double value) {
            addCriterion("psd_shuie =", value, "psdShuie");
            return (Criteria) this;
        }

        public Criteria andPsdShuieNotEqualTo(Double value) {
            addCriterion("psd_shuie <>", value, "psdShuie");
            return (Criteria) this;
        }

        public Criteria andPsdShuieGreaterThan(Double value) {
            addCriterion("psd_shuie >", value, "psdShuie");
            return (Criteria) this;
        }

        public Criteria andPsdShuieGreaterThanOrEqualTo(Double value) {
            addCriterion("psd_shuie >=", value, "psdShuie");
            return (Criteria) this;
        }

        public Criteria andPsdShuieLessThan(Double value) {
            addCriterion("psd_shuie <", value, "psdShuie");
            return (Criteria) this;
        }

        public Criteria andPsdShuieLessThanOrEqualTo(Double value) {
            addCriterion("psd_shuie <=", value, "psdShuie");
            return (Criteria) this;
        }

        public Criteria andPsdShuieIn(List<Double> values) {
            addCriterion("psd_shuie in", values, "psdShuie");
            return (Criteria) this;
        }

        public Criteria andPsdShuieNotIn(List<Double> values) {
            addCriterion("psd_shuie not in", values, "psdShuie");
            return (Criteria) this;
        }

        public Criteria andPsdShuieBetween(Double value1, Double value2) {
            addCriterion("psd_shuie between", value1, value2, "psdShuie");
            return (Criteria) this;
        }

        public Criteria andPsdShuieNotBetween(Double value1, Double value2) {
            addCriterion("psd_shuie not between", value1, value2, "psdShuie");
            return (Criteria) this;
        }

        public Criteria andPsdTotalpriceIsNull() {
            addCriterion("psd_totalprice is null");
            return (Criteria) this;
        }

        public Criteria andPsdTotalpriceIsNotNull() {
            addCriterion("psd_totalprice is not null");
            return (Criteria) this;
        }

        public Criteria andPsdTotalpriceEqualTo(Double value) {
            addCriterion("psd_totalprice =", value, "psdTotalprice");
            return (Criteria) this;
        }

        public Criteria andPsdTotalpriceNotEqualTo(Double value) {
            addCriterion("psd_totalprice <>", value, "psdTotalprice");
            return (Criteria) this;
        }

        public Criteria andPsdTotalpriceGreaterThan(Double value) {
            addCriterion("psd_totalprice >", value, "psdTotalprice");
            return (Criteria) this;
        }

        public Criteria andPsdTotalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("psd_totalprice >=", value, "psdTotalprice");
            return (Criteria) this;
        }

        public Criteria andPsdTotalpriceLessThan(Double value) {
            addCriterion("psd_totalprice <", value, "psdTotalprice");
            return (Criteria) this;
        }

        public Criteria andPsdTotalpriceLessThanOrEqualTo(Double value) {
            addCriterion("psd_totalprice <=", value, "psdTotalprice");
            return (Criteria) this;
        }

        public Criteria andPsdTotalpriceIn(List<Double> values) {
            addCriterion("psd_totalprice in", values, "psdTotalprice");
            return (Criteria) this;
        }

        public Criteria andPsdTotalpriceNotIn(List<Double> values) {
            addCriterion("psd_totalprice not in", values, "psdTotalprice");
            return (Criteria) this;
        }

        public Criteria andPsdTotalpriceBetween(Double value1, Double value2) {
            addCriterion("psd_totalprice between", value1, value2, "psdTotalprice");
            return (Criteria) this;
        }

        public Criteria andPsdTotalpriceNotBetween(Double value1, Double value2) {
            addCriterion("psd_totalprice not between", value1, value2, "psdTotalprice");
            return (Criteria) this;
        }

        public Criteria andPsdLyDbIsNull() {
            addCriterion("psd_ly_db is null");
            return (Criteria) this;
        }

        public Criteria andPsdLyDbIsNotNull() {
            addCriterion("psd_ly_db is not null");
            return (Criteria) this;
        }

        public Criteria andPsdLyDbEqualTo(String value) {
            addCriterion("psd_ly_db =", value, "psdLyDb");
            return (Criteria) this;
        }

        public Criteria andPsdLyDbNotEqualTo(String value) {
            addCriterion("psd_ly_db <>", value, "psdLyDb");
            return (Criteria) this;
        }

        public Criteria andPsdLyDbGreaterThan(String value) {
            addCriterion("psd_ly_db >", value, "psdLyDb");
            return (Criteria) this;
        }

        public Criteria andPsdLyDbGreaterThanOrEqualTo(String value) {
            addCriterion("psd_ly_db >=", value, "psdLyDb");
            return (Criteria) this;
        }

        public Criteria andPsdLyDbLessThan(String value) {
            addCriterion("psd_ly_db <", value, "psdLyDb");
            return (Criteria) this;
        }

        public Criteria andPsdLyDbLessThanOrEqualTo(String value) {
            addCriterion("psd_ly_db <=", value, "psdLyDb");
            return (Criteria) this;
        }

        public Criteria andPsdLyDbLike(String value) {
            addCriterion("psd_ly_db like", value, "psdLyDb");
            return (Criteria) this;
        }

        public Criteria andPsdLyDbNotLike(String value) {
            addCriterion("psd_ly_db not like", value, "psdLyDb");
            return (Criteria) this;
        }

        public Criteria andPsdLyDbIn(List<String> values) {
            addCriterion("psd_ly_db in", values, "psdLyDb");
            return (Criteria) this;
        }

        public Criteria andPsdLyDbNotIn(List<String> values) {
            addCriterion("psd_ly_db not in", values, "psdLyDb");
            return (Criteria) this;
        }

        public Criteria andPsdLyDbBetween(String value1, String value2) {
            addCriterion("psd_ly_db between", value1, value2, "psdLyDb");
            return (Criteria) this;
        }

        public Criteria andPsdLyDbNotBetween(String value1, String value2) {
            addCriterion("psd_ly_db not between", value1, value2, "psdLyDb");
            return (Criteria) this;
        }

        public Criteria andPsdLyDhIsNull() {
            addCriterion("psd_ly_dh is null");
            return (Criteria) this;
        }

        public Criteria andPsdLyDhIsNotNull() {
            addCriterion("psd_ly_dh is not null");
            return (Criteria) this;
        }

        public Criteria andPsdLyDhEqualTo(String value) {
            addCriterion("psd_ly_dh =", value, "psdLyDh");
            return (Criteria) this;
        }

        public Criteria andPsdLyDhNotEqualTo(String value) {
            addCriterion("psd_ly_dh <>", value, "psdLyDh");
            return (Criteria) this;
        }

        public Criteria andPsdLyDhGreaterThan(String value) {
            addCriterion("psd_ly_dh >", value, "psdLyDh");
            return (Criteria) this;
        }

        public Criteria andPsdLyDhGreaterThanOrEqualTo(String value) {
            addCriterion("psd_ly_dh >=", value, "psdLyDh");
            return (Criteria) this;
        }

        public Criteria andPsdLyDhLessThan(String value) {
            addCriterion("psd_ly_dh <", value, "psdLyDh");
            return (Criteria) this;
        }

        public Criteria andPsdLyDhLessThanOrEqualTo(String value) {
            addCriterion("psd_ly_dh <=", value, "psdLyDh");
            return (Criteria) this;
        }

        public Criteria andPsdLyDhLike(String value) {
            addCriterion("psd_ly_dh like", value, "psdLyDh");
            return (Criteria) this;
        }

        public Criteria andPsdLyDhNotLike(String value) {
            addCriterion("psd_ly_dh not like", value, "psdLyDh");
            return (Criteria) this;
        }

        public Criteria andPsdLyDhIn(List<String> values) {
            addCriterion("psd_ly_dh in", values, "psdLyDh");
            return (Criteria) this;
        }

        public Criteria andPsdLyDhNotIn(List<String> values) {
            addCriterion("psd_ly_dh not in", values, "psdLyDh");
            return (Criteria) this;
        }

        public Criteria andPsdLyDhBetween(String value1, String value2) {
            addCriterion("psd_ly_dh between", value1, value2, "psdLyDh");
            return (Criteria) this;
        }

        public Criteria andPsdLyDhNotBetween(String value1, String value2) {
            addCriterion("psd_ly_dh not between", value1, value2, "psdLyDh");
            return (Criteria) this;
        }

        public Criteria andPsdFlagZpIsNull() {
            addCriterion("psd_flag_zp is null");
            return (Criteria) this;
        }

        public Criteria andPsdFlagZpIsNotNull() {
            addCriterion("psd_flag_zp is not null");
            return (Criteria) this;
        }

        public Criteria andPsdFlagZpEqualTo(Boolean value) {
            addCriterion("psd_flag_zp =", value, "psdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPsdFlagZpNotEqualTo(Boolean value) {
            addCriterion("psd_flag_zp <>", value, "psdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPsdFlagZpGreaterThan(Boolean value) {
            addCriterion("psd_flag_zp >", value, "psdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPsdFlagZpGreaterThanOrEqualTo(Boolean value) {
            addCriterion("psd_flag_zp >=", value, "psdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPsdFlagZpLessThan(Boolean value) {
            addCriterion("psd_flag_zp <", value, "psdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPsdFlagZpLessThanOrEqualTo(Boolean value) {
            addCriterion("psd_flag_zp <=", value, "psdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPsdFlagZpIn(List<Boolean> values) {
            addCriterion("psd_flag_zp in", values, "psdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPsdFlagZpNotIn(List<Boolean> values) {
            addCriterion("psd_flag_zp not in", values, "psdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPsdFlagZpBetween(Boolean value1, Boolean value2) {
            addCriterion("psd_flag_zp between", value1, value2, "psdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPsdFlagZpNotBetween(Boolean value1, Boolean value2) {
            addCriterion("psd_flag_zp not between", value1, value2, "psdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPsdWkpNumIsNull() {
            addCriterion("psd_wkp_num is null");
            return (Criteria) this;
        }

        public Criteria andPsdWkpNumIsNotNull() {
            addCriterion("psd_wkp_num is not null");
            return (Criteria) this;
        }

        public Criteria andPsdWkpNumEqualTo(Integer value) {
            addCriterion("psd_wkp_num =", value, "psdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPsdWkpNumNotEqualTo(Integer value) {
            addCriterion("psd_wkp_num <>", value, "psdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPsdWkpNumGreaterThan(Integer value) {
            addCriterion("psd_wkp_num >", value, "psdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPsdWkpNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("psd_wkp_num >=", value, "psdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPsdWkpNumLessThan(Integer value) {
            addCriterion("psd_wkp_num <", value, "psdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPsdWkpNumLessThanOrEqualTo(Integer value) {
            addCriterion("psd_wkp_num <=", value, "psdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPsdWkpNumIn(List<Integer> values) {
            addCriterion("psd_wkp_num in", values, "psdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPsdWkpNumNotIn(List<Integer> values) {
            addCriterion("psd_wkp_num not in", values, "psdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPsdWkpNumBetween(Integer value1, Integer value2) {
            addCriterion("psd_wkp_num between", value1, value2, "psdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPsdWkpNumNotBetween(Integer value1, Integer value2) {
            addCriterion("psd_wkp_num not between", value1, value2, "psdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkIsNull() {
            addCriterion("psd_remark is null");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkIsNotNull() {
            addCriterion("psd_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkEqualTo(String value) {
            addCriterion("psd_remark =", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkNotEqualTo(String value) {
            addCriterion("psd_remark <>", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkGreaterThan(String value) {
            addCriterion("psd_remark >", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("psd_remark >=", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkLessThan(String value) {
            addCriterion("psd_remark <", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkLessThanOrEqualTo(String value) {
            addCriterion("psd_remark <=", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkLike(String value) {
            addCriterion("psd_remark like", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkNotLike(String value) {
            addCriterion("psd_remark not like", value, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkIn(List<String> values) {
            addCriterion("psd_remark in", values, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkNotIn(List<String> values) {
            addCriterion("psd_remark not in", values, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkBetween(String value1, String value2) {
            addCriterion("psd_remark between", value1, value2, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdRemarkNotBetween(String value1, String value2) {
            addCriterion("psd_remark not between", value1, value2, "psdRemark");
            return (Criteria) this;
        }

        public Criteria andPsdFtMoneyIsNull() {
            addCriterion("psd_ft_money is null");
            return (Criteria) this;
        }

        public Criteria andPsdFtMoneyIsNotNull() {
            addCriterion("psd_ft_money is not null");
            return (Criteria) this;
        }

        public Criteria andPsdFtMoneyEqualTo(Double value) {
            addCriterion("psd_ft_money =", value, "psdFtMoney");
            return (Criteria) this;
        }

        public Criteria andPsdFtMoneyNotEqualTo(Double value) {
            addCriterion("psd_ft_money <>", value, "psdFtMoney");
            return (Criteria) this;
        }

        public Criteria andPsdFtMoneyGreaterThan(Double value) {
            addCriterion("psd_ft_money >", value, "psdFtMoney");
            return (Criteria) this;
        }

        public Criteria andPsdFtMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("psd_ft_money >=", value, "psdFtMoney");
            return (Criteria) this;
        }

        public Criteria andPsdFtMoneyLessThan(Double value) {
            addCriterion("psd_ft_money <", value, "psdFtMoney");
            return (Criteria) this;
        }

        public Criteria andPsdFtMoneyLessThanOrEqualTo(Double value) {
            addCriterion("psd_ft_money <=", value, "psdFtMoney");
            return (Criteria) this;
        }

        public Criteria andPsdFtMoneyIn(List<Double> values) {
            addCriterion("psd_ft_money in", values, "psdFtMoney");
            return (Criteria) this;
        }

        public Criteria andPsdFtMoneyNotIn(List<Double> values) {
            addCriterion("psd_ft_money not in", values, "psdFtMoney");
            return (Criteria) this;
        }

        public Criteria andPsdFtMoneyBetween(Double value1, Double value2) {
            addCriterion("psd_ft_money between", value1, value2, "psdFtMoney");
            return (Criteria) this;
        }

        public Criteria andPsdFtMoneyNotBetween(Double value1, Double value2) {
            addCriterion("psd_ft_money not between", value1, value2, "psdFtMoney");
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