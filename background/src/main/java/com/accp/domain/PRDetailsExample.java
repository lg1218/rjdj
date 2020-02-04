package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PRDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PRDetailsExample() {
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

        public Criteria andPrdLineidIsNull() {
            addCriterion("prd_lineid is null");
            return (Criteria) this;
        }

        public Criteria andPrdLineidIsNotNull() {
            addCriterion("prd_lineid is not null");
            return (Criteria) this;
        }

        public Criteria andPrdLineidEqualTo(Integer value) {
            addCriterion("prd_lineid =", value, "prdLineid");
            return (Criteria) this;
        }

        public Criteria andPrdLineidNotEqualTo(Integer value) {
            addCriterion("prd_lineid <>", value, "prdLineid");
            return (Criteria) this;
        }

        public Criteria andPrdLineidGreaterThan(Integer value) {
            addCriterion("prd_lineid >", value, "prdLineid");
            return (Criteria) this;
        }

        public Criteria andPrdLineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prd_lineid >=", value, "prdLineid");
            return (Criteria) this;
        }

        public Criteria andPrdLineidLessThan(Integer value) {
            addCriterion("prd_lineid <", value, "prdLineid");
            return (Criteria) this;
        }

        public Criteria andPrdLineidLessThanOrEqualTo(Integer value) {
            addCriterion("prd_lineid <=", value, "prdLineid");
            return (Criteria) this;
        }

        public Criteria andPrdLineidIn(List<Integer> values) {
            addCriterion("prd_lineid in", values, "prdLineid");
            return (Criteria) this;
        }

        public Criteria andPrdLineidNotIn(List<Integer> values) {
            addCriterion("prd_lineid not in", values, "prdLineid");
            return (Criteria) this;
        }

        public Criteria andPrdLineidBetween(Integer value1, Integer value2) {
            addCriterion("prd_lineid between", value1, value2, "prdLineid");
            return (Criteria) this;
        }

        public Criteria andPrdLineidNotBetween(Integer value1, Integer value2) {
            addCriterion("prd_lineid not between", value1, value2, "prdLineid");
            return (Criteria) this;
        }

        public Criteria andPrdMmidIsNull() {
            addCriterion("prd_mmid is null");
            return (Criteria) this;
        }

        public Criteria andPrdMmidIsNotNull() {
            addCriterion("prd_mmid is not null");
            return (Criteria) this;
        }

        public Criteria andPrdMmidEqualTo(Integer value) {
            addCriterion("prd_mmid =", value, "prdMmid");
            return (Criteria) this;
        }

        public Criteria andPrdMmidNotEqualTo(Integer value) {
            addCriterion("prd_mmid <>", value, "prdMmid");
            return (Criteria) this;
        }

        public Criteria andPrdMmidGreaterThan(Integer value) {
            addCriterion("prd_mmid >", value, "prdMmid");
            return (Criteria) this;
        }

        public Criteria andPrdMmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prd_mmid >=", value, "prdMmid");
            return (Criteria) this;
        }

        public Criteria andPrdMmidLessThan(Integer value) {
            addCriterion("prd_mmid <", value, "prdMmid");
            return (Criteria) this;
        }

        public Criteria andPrdMmidLessThanOrEqualTo(Integer value) {
            addCriterion("prd_mmid <=", value, "prdMmid");
            return (Criteria) this;
        }

        public Criteria andPrdMmidIn(List<Integer> values) {
            addCriterion("prd_mmid in", values, "prdMmid");
            return (Criteria) this;
        }

        public Criteria andPrdMmidNotIn(List<Integer> values) {
            addCriterion("prd_mmid not in", values, "prdMmid");
            return (Criteria) this;
        }

        public Criteria andPrdMmidBetween(Integer value1, Integer value2) {
            addCriterion("prd_mmid between", value1, value2, "prdMmid");
            return (Criteria) this;
        }

        public Criteria andPrdMmidNotBetween(Integer value1, Integer value2) {
            addCriterion("prd_mmid not between", value1, value2, "prdMmid");
            return (Criteria) this;
        }

        public Criteria andPrdPrmidIsNull() {
            addCriterion("prd_prmid is null");
            return (Criteria) this;
        }

        public Criteria andPrdPrmidIsNotNull() {
            addCriterion("prd_prmid is not null");
            return (Criteria) this;
        }

        public Criteria andPrdPrmidEqualTo(Integer value) {
            addCriterion("prd_prmid =", value, "prdPrmid");
            return (Criteria) this;
        }

        public Criteria andPrdPrmidNotEqualTo(Integer value) {
            addCriterion("prd_prmid <>", value, "prdPrmid");
            return (Criteria) this;
        }

        public Criteria andPrdPrmidGreaterThan(Integer value) {
            addCriterion("prd_prmid >", value, "prdPrmid");
            return (Criteria) this;
        }

        public Criteria andPrdPrmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prd_prmid >=", value, "prdPrmid");
            return (Criteria) this;
        }

        public Criteria andPrdPrmidLessThan(Integer value) {
            addCriterion("prd_prmid <", value, "prdPrmid");
            return (Criteria) this;
        }

        public Criteria andPrdPrmidLessThanOrEqualTo(Integer value) {
            addCriterion("prd_prmid <=", value, "prdPrmid");
            return (Criteria) this;
        }

        public Criteria andPrdPrmidIn(List<Integer> values) {
            addCriterion("prd_prmid in", values, "prdPrmid");
            return (Criteria) this;
        }

        public Criteria andPrdPrmidNotIn(List<Integer> values) {
            addCriterion("prd_prmid not in", values, "prdPrmid");
            return (Criteria) this;
        }

        public Criteria andPrdPrmidBetween(Integer value1, Integer value2) {
            addCriterion("prd_prmid between", value1, value2, "prdPrmid");
            return (Criteria) this;
        }

        public Criteria andPrdPrmidNotBetween(Integer value1, Integer value2) {
            addCriterion("prd_prmid not between", value1, value2, "prdPrmid");
            return (Criteria) this;
        }

        public Criteria andPrdMmnameIsNull() {
            addCriterion("prd_mmname is null");
            return (Criteria) this;
        }

        public Criteria andPrdMmnameIsNotNull() {
            addCriterion("prd_mmname is not null");
            return (Criteria) this;
        }

        public Criteria andPrdMmnameEqualTo(String value) {
            addCriterion("prd_mmname =", value, "prdMmname");
            return (Criteria) this;
        }

        public Criteria andPrdMmnameNotEqualTo(String value) {
            addCriterion("prd_mmname <>", value, "prdMmname");
            return (Criteria) this;
        }

        public Criteria andPrdMmnameGreaterThan(String value) {
            addCriterion("prd_mmname >", value, "prdMmname");
            return (Criteria) this;
        }

        public Criteria andPrdMmnameGreaterThanOrEqualTo(String value) {
            addCriterion("prd_mmname >=", value, "prdMmname");
            return (Criteria) this;
        }

        public Criteria andPrdMmnameLessThan(String value) {
            addCriterion("prd_mmname <", value, "prdMmname");
            return (Criteria) this;
        }

        public Criteria andPrdMmnameLessThanOrEqualTo(String value) {
            addCriterion("prd_mmname <=", value, "prdMmname");
            return (Criteria) this;
        }

        public Criteria andPrdMmnameLike(String value) {
            addCriterion("prd_mmname like", value, "prdMmname");
            return (Criteria) this;
        }

        public Criteria andPrdMmnameNotLike(String value) {
            addCriterion("prd_mmname not like", value, "prdMmname");
            return (Criteria) this;
        }

        public Criteria andPrdMmnameIn(List<String> values) {
            addCriterion("prd_mmname in", values, "prdMmname");
            return (Criteria) this;
        }

        public Criteria andPrdMmnameNotIn(List<String> values) {
            addCriterion("prd_mmname not in", values, "prdMmname");
            return (Criteria) this;
        }

        public Criteria andPrdMmnameBetween(String value1, String value2) {
            addCriterion("prd_mmname between", value1, value2, "prdMmname");
            return (Criteria) this;
        }

        public Criteria andPrdMmnameNotBetween(String value1, String value2) {
            addCriterion("prd_mmname not between", value1, value2, "prdMmname");
            return (Criteria) this;
        }

        public Criteria andPrdMmxhIsNull() {
            addCriterion("prd_mmxh is null");
            return (Criteria) this;
        }

        public Criteria andPrdMmxhIsNotNull() {
            addCriterion("prd_mmxh is not null");
            return (Criteria) this;
        }

        public Criteria andPrdMmxhEqualTo(String value) {
            addCriterion("prd_mmxh =", value, "prdMmxh");
            return (Criteria) this;
        }

        public Criteria andPrdMmxhNotEqualTo(String value) {
            addCriterion("prd_mmxh <>", value, "prdMmxh");
            return (Criteria) this;
        }

        public Criteria andPrdMmxhGreaterThan(String value) {
            addCriterion("prd_mmxh >", value, "prdMmxh");
            return (Criteria) this;
        }

        public Criteria andPrdMmxhGreaterThanOrEqualTo(String value) {
            addCriterion("prd_mmxh >=", value, "prdMmxh");
            return (Criteria) this;
        }

        public Criteria andPrdMmxhLessThan(String value) {
            addCriterion("prd_mmxh <", value, "prdMmxh");
            return (Criteria) this;
        }

        public Criteria andPrdMmxhLessThanOrEqualTo(String value) {
            addCriterion("prd_mmxh <=", value, "prdMmxh");
            return (Criteria) this;
        }

        public Criteria andPrdMmxhLike(String value) {
            addCriterion("prd_mmxh like", value, "prdMmxh");
            return (Criteria) this;
        }

        public Criteria andPrdMmxhNotLike(String value) {
            addCriterion("prd_mmxh not like", value, "prdMmxh");
            return (Criteria) this;
        }

        public Criteria andPrdMmxhIn(List<String> values) {
            addCriterion("prd_mmxh in", values, "prdMmxh");
            return (Criteria) this;
        }

        public Criteria andPrdMmxhNotIn(List<String> values) {
            addCriterion("prd_mmxh not in", values, "prdMmxh");
            return (Criteria) this;
        }

        public Criteria andPrdMmxhBetween(String value1, String value2) {
            addCriterion("prd_mmxh between", value1, value2, "prdMmxh");
            return (Criteria) this;
        }

        public Criteria andPrdMmxhNotBetween(String value1, String value2) {
            addCriterion("prd_mmxh not between", value1, value2, "prdMmxh");
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

        public Criteria andPrdLyDbIsNull() {
            addCriterion("prd_ly_db is null");
            return (Criteria) this;
        }

        public Criteria andPrdLyDbIsNotNull() {
            addCriterion("prd_ly_db is not null");
            return (Criteria) this;
        }

        public Criteria andPrdLyDbEqualTo(String value) {
            addCriterion("prd_ly_db =", value, "prdLyDb");
            return (Criteria) this;
        }

        public Criteria andPrdLyDbNotEqualTo(String value) {
            addCriterion("prd_ly_db <>", value, "prdLyDb");
            return (Criteria) this;
        }

        public Criteria andPrdLyDbGreaterThan(String value) {
            addCriterion("prd_ly_db >", value, "prdLyDb");
            return (Criteria) this;
        }

        public Criteria andPrdLyDbGreaterThanOrEqualTo(String value) {
            addCriterion("prd_ly_db >=", value, "prdLyDb");
            return (Criteria) this;
        }

        public Criteria andPrdLyDbLessThan(String value) {
            addCriterion("prd_ly_db <", value, "prdLyDb");
            return (Criteria) this;
        }

        public Criteria andPrdLyDbLessThanOrEqualTo(String value) {
            addCriterion("prd_ly_db <=", value, "prdLyDb");
            return (Criteria) this;
        }

        public Criteria andPrdLyDbLike(String value) {
            addCriterion("prd_ly_db like", value, "prdLyDb");
            return (Criteria) this;
        }

        public Criteria andPrdLyDbNotLike(String value) {
            addCriterion("prd_ly_db not like", value, "prdLyDb");
            return (Criteria) this;
        }

        public Criteria andPrdLyDbIn(List<String> values) {
            addCriterion("prd_ly_db in", values, "prdLyDb");
            return (Criteria) this;
        }

        public Criteria andPrdLyDbNotIn(List<String> values) {
            addCriterion("prd_ly_db not in", values, "prdLyDb");
            return (Criteria) this;
        }

        public Criteria andPrdLyDbBetween(String value1, String value2) {
            addCriterion("prd_ly_db between", value1, value2, "prdLyDb");
            return (Criteria) this;
        }

        public Criteria andPrdLyDbNotBetween(String value1, String value2) {
            addCriterion("prd_ly_db not between", value1, value2, "prdLyDb");
            return (Criteria) this;
        }

        public Criteria andPrdLyDhIsNull() {
            addCriterion("prd_ly_dh is null");
            return (Criteria) this;
        }

        public Criteria andPrdLyDhIsNotNull() {
            addCriterion("prd_ly_dh is not null");
            return (Criteria) this;
        }

        public Criteria andPrdLyDhEqualTo(String value) {
            addCriterion("prd_ly_dh =", value, "prdLyDh");
            return (Criteria) this;
        }

        public Criteria andPrdLyDhNotEqualTo(String value) {
            addCriterion("prd_ly_dh <>", value, "prdLyDh");
            return (Criteria) this;
        }

        public Criteria andPrdLyDhGreaterThan(String value) {
            addCriterion("prd_ly_dh >", value, "prdLyDh");
            return (Criteria) this;
        }

        public Criteria andPrdLyDhGreaterThanOrEqualTo(String value) {
            addCriterion("prd_ly_dh >=", value, "prdLyDh");
            return (Criteria) this;
        }

        public Criteria andPrdLyDhLessThan(String value) {
            addCriterion("prd_ly_dh <", value, "prdLyDh");
            return (Criteria) this;
        }

        public Criteria andPrdLyDhLessThanOrEqualTo(String value) {
            addCriterion("prd_ly_dh <=", value, "prdLyDh");
            return (Criteria) this;
        }

        public Criteria andPrdLyDhLike(String value) {
            addCriterion("prd_ly_dh like", value, "prdLyDh");
            return (Criteria) this;
        }

        public Criteria andPrdLyDhNotLike(String value) {
            addCriterion("prd_ly_dh not like", value, "prdLyDh");
            return (Criteria) this;
        }

        public Criteria andPrdLyDhIn(List<String> values) {
            addCriterion("prd_ly_dh in", values, "prdLyDh");
            return (Criteria) this;
        }

        public Criteria andPrdLyDhNotIn(List<String> values) {
            addCriterion("prd_ly_dh not in", values, "prdLyDh");
            return (Criteria) this;
        }

        public Criteria andPrdLyDhBetween(String value1, String value2) {
            addCriterion("prd_ly_dh between", value1, value2, "prdLyDh");
            return (Criteria) this;
        }

        public Criteria andPrdLyDhNotBetween(String value1, String value2) {
            addCriterion("prd_ly_dh not between", value1, value2, "prdLyDh");
            return (Criteria) this;
        }

        public Criteria andPrdFlagZpIsNull() {
            addCriterion("prd_flag_zp is null");
            return (Criteria) this;
        }

        public Criteria andPrdFlagZpIsNotNull() {
            addCriterion("prd_flag_zp is not null");
            return (Criteria) this;
        }

        public Criteria andPrdFlagZpEqualTo(Boolean value) {
            addCriterion("prd_flag_zp =", value, "prdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPrdFlagZpNotEqualTo(Boolean value) {
            addCriterion("prd_flag_zp <>", value, "prdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPrdFlagZpGreaterThan(Boolean value) {
            addCriterion("prd_flag_zp >", value, "prdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPrdFlagZpGreaterThanOrEqualTo(Boolean value) {
            addCriterion("prd_flag_zp >=", value, "prdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPrdFlagZpLessThan(Boolean value) {
            addCriterion("prd_flag_zp <", value, "prdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPrdFlagZpLessThanOrEqualTo(Boolean value) {
            addCriterion("prd_flag_zp <=", value, "prdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPrdFlagZpIn(List<Boolean> values) {
            addCriterion("prd_flag_zp in", values, "prdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPrdFlagZpNotIn(List<Boolean> values) {
            addCriterion("prd_flag_zp not in", values, "prdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPrdFlagZpBetween(Boolean value1, Boolean value2) {
            addCriterion("prd_flag_zp between", value1, value2, "prdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPrdFlagZpNotBetween(Boolean value1, Boolean value2) {
            addCriterion("prd_flag_zp not between", value1, value2, "prdFlagZp");
            return (Criteria) this;
        }

        public Criteria andPrdWkpNumIsNull() {
            addCriterion("prd_wkp_num is null");
            return (Criteria) this;
        }

        public Criteria andPrdWkpNumIsNotNull() {
            addCriterion("prd_wkp_num is not null");
            return (Criteria) this;
        }

        public Criteria andPrdWkpNumEqualTo(Integer value) {
            addCriterion("prd_wkp_num =", value, "prdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPrdWkpNumNotEqualTo(Integer value) {
            addCriterion("prd_wkp_num <>", value, "prdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPrdWkpNumGreaterThan(Integer value) {
            addCriterion("prd_wkp_num >", value, "prdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPrdWkpNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("prd_wkp_num >=", value, "prdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPrdWkpNumLessThan(Integer value) {
            addCriterion("prd_wkp_num <", value, "prdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPrdWkpNumLessThanOrEqualTo(Integer value) {
            addCriterion("prd_wkp_num <=", value, "prdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPrdWkpNumIn(List<Integer> values) {
            addCriterion("prd_wkp_num in", values, "prdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPrdWkpNumNotIn(List<Integer> values) {
            addCriterion("prd_wkp_num not in", values, "prdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPrdWkpNumBetween(Integer value1, Integer value2) {
            addCriterion("prd_wkp_num between", value1, value2, "prdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPrdWkpNumNotBetween(Integer value1, Integer value2) {
            addCriterion("prd_wkp_num not between", value1, value2, "prdWkpNum");
            return (Criteria) this;
        }

        public Criteria andPrdRemarkIsNull() {
            addCriterion("prd_remark is null");
            return (Criteria) this;
        }

        public Criteria andPrdRemarkIsNotNull() {
            addCriterion("prd_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPrdRemarkEqualTo(String value) {
            addCriterion("prd_remark =", value, "prdRemark");
            return (Criteria) this;
        }

        public Criteria andPrdRemarkNotEqualTo(String value) {
            addCriterion("prd_remark <>", value, "prdRemark");
            return (Criteria) this;
        }

        public Criteria andPrdRemarkGreaterThan(String value) {
            addCriterion("prd_remark >", value, "prdRemark");
            return (Criteria) this;
        }

        public Criteria andPrdRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("prd_remark >=", value, "prdRemark");
            return (Criteria) this;
        }

        public Criteria andPrdRemarkLessThan(String value) {
            addCriterion("prd_remark <", value, "prdRemark");
            return (Criteria) this;
        }

        public Criteria andPrdRemarkLessThanOrEqualTo(String value) {
            addCriterion("prd_remark <=", value, "prdRemark");
            return (Criteria) this;
        }

        public Criteria andPrdRemarkLike(String value) {
            addCriterion("prd_remark like", value, "prdRemark");
            return (Criteria) this;
        }

        public Criteria andPrdRemarkNotLike(String value) {
            addCriterion("prd_remark not like", value, "prdRemark");
            return (Criteria) this;
        }

        public Criteria andPrdRemarkIn(List<String> values) {
            addCriterion("prd_remark in", values, "prdRemark");
            return (Criteria) this;
        }

        public Criteria andPrdRemarkNotIn(List<String> values) {
            addCriterion("prd_remark not in", values, "prdRemark");
            return (Criteria) this;
        }

        public Criteria andPrdRemarkBetween(String value1, String value2) {
            addCriterion("prd_remark between", value1, value2, "prdRemark");
            return (Criteria) this;
        }

        public Criteria andPrdRemarkNotBetween(String value1, String value2) {
            addCriterion("prd_remark not between", value1, value2, "prdRemark");
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