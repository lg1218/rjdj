package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MaterialsMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialsMainExample() {
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

        public Criteria andMmIdIsNull() {
            addCriterion("mm_id is null");
            return (Criteria) this;
        }

        public Criteria andMmIdIsNotNull() {
            addCriterion("mm_id is not null");
            return (Criteria) this;
        }

        public Criteria andMmIdEqualTo(Integer value) {
            addCriterion("mm_id =", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdNotEqualTo(Integer value) {
            addCriterion("mm_id <>", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdGreaterThan(Integer value) {
            addCriterion("mm_id >", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mm_id >=", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdLessThan(Integer value) {
            addCriterion("mm_id <", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdLessThanOrEqualTo(Integer value) {
            addCriterion("mm_id <=", value, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdIn(List<Integer> values) {
            addCriterion("mm_id in", values, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdNotIn(List<Integer> values) {
            addCriterion("mm_id not in", values, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdBetween(Integer value1, Integer value2) {
            addCriterion("mm_id between", value1, value2, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mm_id not between", value1, value2, "mmId");
            return (Criteria) this;
        }

        public Criteria andMmNameIsNull() {
            addCriterion("mm_name is null");
            return (Criteria) this;
        }

        public Criteria andMmNameIsNotNull() {
            addCriterion("mm_name is not null");
            return (Criteria) this;
        }

        public Criteria andMmNameEqualTo(String value) {
            addCriterion("mm_name =", value, "mmName");
            return (Criteria) this;
        }

        public Criteria andMmNameNotEqualTo(String value) {
            addCriterion("mm_name <>", value, "mmName");
            return (Criteria) this;
        }

        public Criteria andMmNameGreaterThan(String value) {
            addCriterion("mm_name >", value, "mmName");
            return (Criteria) this;
        }

        public Criteria andMmNameGreaterThanOrEqualTo(String value) {
            addCriterion("mm_name >=", value, "mmName");
            return (Criteria) this;
        }

        public Criteria andMmNameLessThan(String value) {
            addCriterion("mm_name <", value, "mmName");
            return (Criteria) this;
        }

        public Criteria andMmNameLessThanOrEqualTo(String value) {
            addCriterion("mm_name <=", value, "mmName");
            return (Criteria) this;
        }

        public Criteria andMmNameLike(String value) {
            addCriterion("mm_name like", value, "mmName");
            return (Criteria) this;
        }

        public Criteria andMmNameNotLike(String value) {
            addCriterion("mm_name not like", value, "mmName");
            return (Criteria) this;
        }

        public Criteria andMmNameIn(List<String> values) {
            addCriterion("mm_name in", values, "mmName");
            return (Criteria) this;
        }

        public Criteria andMmNameNotIn(List<String> values) {
            addCriterion("mm_name not in", values, "mmName");
            return (Criteria) this;
        }

        public Criteria andMmNameBetween(String value1, String value2) {
            addCriterion("mm_name between", value1, value2, "mmName");
            return (Criteria) this;
        }

        public Criteria andMmNameNotBetween(String value1, String value2) {
            addCriterion("mm_name not between", value1, value2, "mmName");
            return (Criteria) this;
        }

        public Criteria andMmXhIsNull() {
            addCriterion("mm_xh is null");
            return (Criteria) this;
        }

        public Criteria andMmXhIsNotNull() {
            addCriterion("mm_xh is not null");
            return (Criteria) this;
        }

        public Criteria andMmXhEqualTo(String value) {
            addCriterion("mm_xh =", value, "mmXh");
            return (Criteria) this;
        }

        public Criteria andMmXhNotEqualTo(String value) {
            addCriterion("mm_xh <>", value, "mmXh");
            return (Criteria) this;
        }

        public Criteria andMmXhGreaterThan(String value) {
            addCriterion("mm_xh >", value, "mmXh");
            return (Criteria) this;
        }

        public Criteria andMmXhGreaterThanOrEqualTo(String value) {
            addCriterion("mm_xh >=", value, "mmXh");
            return (Criteria) this;
        }

        public Criteria andMmXhLessThan(String value) {
            addCriterion("mm_xh <", value, "mmXh");
            return (Criteria) this;
        }

        public Criteria andMmXhLessThanOrEqualTo(String value) {
            addCriterion("mm_xh <=", value, "mmXh");
            return (Criteria) this;
        }

        public Criteria andMmXhLike(String value) {
            addCriterion("mm_xh like", value, "mmXh");
            return (Criteria) this;
        }

        public Criteria andMmXhNotLike(String value) {
            addCriterion("mm_xh not like", value, "mmXh");
            return (Criteria) this;
        }

        public Criteria andMmXhIn(List<String> values) {
            addCriterion("mm_xh in", values, "mmXh");
            return (Criteria) this;
        }

        public Criteria andMmXhNotIn(List<String> values) {
            addCriterion("mm_xh not in", values, "mmXh");
            return (Criteria) this;
        }

        public Criteria andMmXhBetween(String value1, String value2) {
            addCriterion("mm_xh between", value1, value2, "mmXh");
            return (Criteria) this;
        }

        public Criteria andMmXhNotBetween(String value1, String value2) {
            addCriterion("mm_xh not between", value1, value2, "mmXh");
            return (Criteria) this;
        }

        public Criteria andMmEnameIsNull() {
            addCriterion("mm_ename is null");
            return (Criteria) this;
        }

        public Criteria andMmEnameIsNotNull() {
            addCriterion("mm_ename is not null");
            return (Criteria) this;
        }

        public Criteria andMmEnameEqualTo(String value) {
            addCriterion("mm_ename =", value, "mmEname");
            return (Criteria) this;
        }

        public Criteria andMmEnameNotEqualTo(String value) {
            addCriterion("mm_ename <>", value, "mmEname");
            return (Criteria) this;
        }

        public Criteria andMmEnameGreaterThan(String value) {
            addCriterion("mm_ename >", value, "mmEname");
            return (Criteria) this;
        }

        public Criteria andMmEnameGreaterThanOrEqualTo(String value) {
            addCriterion("mm_ename >=", value, "mmEname");
            return (Criteria) this;
        }

        public Criteria andMmEnameLessThan(String value) {
            addCriterion("mm_ename <", value, "mmEname");
            return (Criteria) this;
        }

        public Criteria andMmEnameLessThanOrEqualTo(String value) {
            addCriterion("mm_ename <=", value, "mmEname");
            return (Criteria) this;
        }

        public Criteria andMmEnameLike(String value) {
            addCriterion("mm_ename like", value, "mmEname");
            return (Criteria) this;
        }

        public Criteria andMmEnameNotLike(String value) {
            addCriterion("mm_ename not like", value, "mmEname");
            return (Criteria) this;
        }

        public Criteria andMmEnameIn(List<String> values) {
            addCriterion("mm_ename in", values, "mmEname");
            return (Criteria) this;
        }

        public Criteria andMmEnameNotIn(List<String> values) {
            addCriterion("mm_ename not in", values, "mmEname");
            return (Criteria) this;
        }

        public Criteria andMmEnameBetween(String value1, String value2) {
            addCriterion("mm_ename between", value1, value2, "mmEname");
            return (Criteria) this;
        }

        public Criteria andMmEnameNotBetween(String value1, String value2) {
            addCriterion("mm_ename not between", value1, value2, "mmEname");
            return (Criteria) this;
        }

        public Criteria andMmMtidIsNull() {
            addCriterion("mm_mtid is null");
            return (Criteria) this;
        }

        public Criteria andMmMtidIsNotNull() {
            addCriterion("mm_mtid is not null");
            return (Criteria) this;
        }

        public Criteria andMmMtidEqualTo(Integer value) {
            addCriterion("mm_mtid =", value, "mmMtid");
            return (Criteria) this;
        }

        public Criteria andMmMtidNotEqualTo(Integer value) {
            addCriterion("mm_mtid <>", value, "mmMtid");
            return (Criteria) this;
        }

        public Criteria andMmMtidGreaterThan(Integer value) {
            addCriterion("mm_mtid >", value, "mmMtid");
            return (Criteria) this;
        }

        public Criteria andMmMtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mm_mtid >=", value, "mmMtid");
            return (Criteria) this;
        }

        public Criteria andMmMtidLessThan(Integer value) {
            addCriterion("mm_mtid <", value, "mmMtid");
            return (Criteria) this;
        }

        public Criteria andMmMtidLessThanOrEqualTo(Integer value) {
            addCriterion("mm_mtid <=", value, "mmMtid");
            return (Criteria) this;
        }

        public Criteria andMmMtidIn(List<Integer> values) {
            addCriterion("mm_mtid in", values, "mmMtid");
            return (Criteria) this;
        }

        public Criteria andMmMtidNotIn(List<Integer> values) {
            addCriterion("mm_mtid not in", values, "mmMtid");
            return (Criteria) this;
        }

        public Criteria andMmMtidBetween(Integer value1, Integer value2) {
            addCriterion("mm_mtid between", value1, value2, "mmMtid");
            return (Criteria) this;
        }

        public Criteria andMmMtidNotBetween(Integer value1, Integer value2) {
            addCriterion("mm_mtid not between", value1, value2, "mmMtid");
            return (Criteria) this;
        }

        public Criteria andMmUidIsNull() {
            addCriterion("mm_uid is null");
            return (Criteria) this;
        }

        public Criteria andMmUidIsNotNull() {
            addCriterion("mm_uid is not null");
            return (Criteria) this;
        }

        public Criteria andMmUidEqualTo(Integer value) {
            addCriterion("mm_uid =", value, "mmUid");
            return (Criteria) this;
        }

        public Criteria andMmUidNotEqualTo(Integer value) {
            addCriterion("mm_uid <>", value, "mmUid");
            return (Criteria) this;
        }

        public Criteria andMmUidGreaterThan(Integer value) {
            addCriterion("mm_uid >", value, "mmUid");
            return (Criteria) this;
        }

        public Criteria andMmUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mm_uid >=", value, "mmUid");
            return (Criteria) this;
        }

        public Criteria andMmUidLessThan(Integer value) {
            addCriterion("mm_uid <", value, "mmUid");
            return (Criteria) this;
        }

        public Criteria andMmUidLessThanOrEqualTo(Integer value) {
            addCriterion("mm_uid <=", value, "mmUid");
            return (Criteria) this;
        }

        public Criteria andMmUidIn(List<Integer> values) {
            addCriterion("mm_uid in", values, "mmUid");
            return (Criteria) this;
        }

        public Criteria andMmUidNotIn(List<Integer> values) {
            addCriterion("mm_uid not in", values, "mmUid");
            return (Criteria) this;
        }

        public Criteria andMmUidBetween(Integer value1, Integer value2) {
            addCriterion("mm_uid between", value1, value2, "mmUid");
            return (Criteria) this;
        }

        public Criteria andMmUidNotBetween(Integer value1, Integer value2) {
            addCriterion("mm_uid not between", value1, value2, "mmUid");
            return (Criteria) this;
        }

        public Criteria andMmTxmnumIsNull() {
            addCriterion("mm_txmnum is null");
            return (Criteria) this;
        }

        public Criteria andMmTxmnumIsNotNull() {
            addCriterion("mm_txmnum is not null");
            return (Criteria) this;
        }

        public Criteria andMmTxmnumEqualTo(String value) {
            addCriterion("mm_txmnum =", value, "mmTxmnum");
            return (Criteria) this;
        }

        public Criteria andMmTxmnumNotEqualTo(String value) {
            addCriterion("mm_txmnum <>", value, "mmTxmnum");
            return (Criteria) this;
        }

        public Criteria andMmTxmnumGreaterThan(String value) {
            addCriterion("mm_txmnum >", value, "mmTxmnum");
            return (Criteria) this;
        }

        public Criteria andMmTxmnumGreaterThanOrEqualTo(String value) {
            addCriterion("mm_txmnum >=", value, "mmTxmnum");
            return (Criteria) this;
        }

        public Criteria andMmTxmnumLessThan(String value) {
            addCriterion("mm_txmnum <", value, "mmTxmnum");
            return (Criteria) this;
        }

        public Criteria andMmTxmnumLessThanOrEqualTo(String value) {
            addCriterion("mm_txmnum <=", value, "mmTxmnum");
            return (Criteria) this;
        }

        public Criteria andMmTxmnumLike(String value) {
            addCriterion("mm_txmnum like", value, "mmTxmnum");
            return (Criteria) this;
        }

        public Criteria andMmTxmnumNotLike(String value) {
            addCriterion("mm_txmnum not like", value, "mmTxmnum");
            return (Criteria) this;
        }

        public Criteria andMmTxmnumIn(List<String> values) {
            addCriterion("mm_txmnum in", values, "mmTxmnum");
            return (Criteria) this;
        }

        public Criteria andMmTxmnumNotIn(List<String> values) {
            addCriterion("mm_txmnum not in", values, "mmTxmnum");
            return (Criteria) this;
        }

        public Criteria andMmTxmnumBetween(String value1, String value2) {
            addCriterion("mm_txmnum between", value1, value2, "mmTxmnum");
            return (Criteria) this;
        }

        public Criteria andMmTxmnumNotBetween(String value1, String value2) {
            addCriterion("mm_txmnum not between", value1, value2, "mmTxmnum");
            return (Criteria) this;
        }

        public Criteria andMmJyoutIsNull() {
            addCriterion("mm_jyout is null");
            return (Criteria) this;
        }

        public Criteria andMmJyoutIsNotNull() {
            addCriterion("mm_jyout is not null");
            return (Criteria) this;
        }

        public Criteria andMmJyoutEqualTo(Double value) {
            addCriterion("mm_jyout =", value, "mmJyout");
            return (Criteria) this;
        }

        public Criteria andMmJyoutNotEqualTo(Double value) {
            addCriterion("mm_jyout <>", value, "mmJyout");
            return (Criteria) this;
        }

        public Criteria andMmJyoutGreaterThan(Double value) {
            addCriterion("mm_jyout >", value, "mmJyout");
            return (Criteria) this;
        }

        public Criteria andMmJyoutGreaterThanOrEqualTo(Double value) {
            addCriterion("mm_jyout >=", value, "mmJyout");
            return (Criteria) this;
        }

        public Criteria andMmJyoutLessThan(Double value) {
            addCriterion("mm_jyout <", value, "mmJyout");
            return (Criteria) this;
        }

        public Criteria andMmJyoutLessThanOrEqualTo(Double value) {
            addCriterion("mm_jyout <=", value, "mmJyout");
            return (Criteria) this;
        }

        public Criteria andMmJyoutIn(List<Double> values) {
            addCriterion("mm_jyout in", values, "mmJyout");
            return (Criteria) this;
        }

        public Criteria andMmJyoutNotIn(List<Double> values) {
            addCriterion("mm_jyout not in", values, "mmJyout");
            return (Criteria) this;
        }

        public Criteria andMmJyoutBetween(Double value1, Double value2) {
            addCriterion("mm_jyout between", value1, value2, "mmJyout");
            return (Criteria) this;
        }

        public Criteria andMmJyoutNotBetween(Double value1, Double value2) {
            addCriterion("mm_jyout not between", value1, value2, "mmJyout");
            return (Criteria) this;
        }

        public Criteria andMmJyoutAIsNull() {
            addCriterion("mm_jyout_a is null");
            return (Criteria) this;
        }

        public Criteria andMmJyoutAIsNotNull() {
            addCriterion("mm_jyout_a is not null");
            return (Criteria) this;
        }

        public Criteria andMmJyoutAEqualTo(Double value) {
            addCriterion("mm_jyout_a =", value, "mmJyoutA");
            return (Criteria) this;
        }

        public Criteria andMmJyoutANotEqualTo(Double value) {
            addCriterion("mm_jyout_a <>", value, "mmJyoutA");
            return (Criteria) this;
        }

        public Criteria andMmJyoutAGreaterThan(Double value) {
            addCriterion("mm_jyout_a >", value, "mmJyoutA");
            return (Criteria) this;
        }

        public Criteria andMmJyoutAGreaterThanOrEqualTo(Double value) {
            addCriterion("mm_jyout_a >=", value, "mmJyoutA");
            return (Criteria) this;
        }

        public Criteria andMmJyoutALessThan(Double value) {
            addCriterion("mm_jyout_a <", value, "mmJyoutA");
            return (Criteria) this;
        }

        public Criteria andMmJyoutALessThanOrEqualTo(Double value) {
            addCriterion("mm_jyout_a <=", value, "mmJyoutA");
            return (Criteria) this;
        }

        public Criteria andMmJyoutAIn(List<Double> values) {
            addCriterion("mm_jyout_a in", values, "mmJyoutA");
            return (Criteria) this;
        }

        public Criteria andMmJyoutANotIn(List<Double> values) {
            addCriterion("mm_jyout_a not in", values, "mmJyoutA");
            return (Criteria) this;
        }

        public Criteria andMmJyoutABetween(Double value1, Double value2) {
            addCriterion("mm_jyout_a between", value1, value2, "mmJyoutA");
            return (Criteria) this;
        }

        public Criteria andMmJyoutANotBetween(Double value1, Double value2) {
            addCriterion("mm_jyout_a not between", value1, value2, "mmJyoutA");
            return (Criteria) this;
        }

        public Criteria andMmJyoutBIsNull() {
            addCriterion("mm_jyout_b is null");
            return (Criteria) this;
        }

        public Criteria andMmJyoutBIsNotNull() {
            addCriterion("mm_jyout_b is not null");
            return (Criteria) this;
        }

        public Criteria andMmJyoutBEqualTo(Double value) {
            addCriterion("mm_jyout_b =", value, "mmJyoutB");
            return (Criteria) this;
        }

        public Criteria andMmJyoutBNotEqualTo(Double value) {
            addCriterion("mm_jyout_b <>", value, "mmJyoutB");
            return (Criteria) this;
        }

        public Criteria andMmJyoutBGreaterThan(Double value) {
            addCriterion("mm_jyout_b >", value, "mmJyoutB");
            return (Criteria) this;
        }

        public Criteria andMmJyoutBGreaterThanOrEqualTo(Double value) {
            addCriterion("mm_jyout_b >=", value, "mmJyoutB");
            return (Criteria) this;
        }

        public Criteria andMmJyoutBLessThan(Double value) {
            addCriterion("mm_jyout_b <", value, "mmJyoutB");
            return (Criteria) this;
        }

        public Criteria andMmJyoutBLessThanOrEqualTo(Double value) {
            addCriterion("mm_jyout_b <=", value, "mmJyoutB");
            return (Criteria) this;
        }

        public Criteria andMmJyoutBIn(List<Double> values) {
            addCriterion("mm_jyout_b in", values, "mmJyoutB");
            return (Criteria) this;
        }

        public Criteria andMmJyoutBNotIn(List<Double> values) {
            addCriterion("mm_jyout_b not in", values, "mmJyoutB");
            return (Criteria) this;
        }

        public Criteria andMmJyoutBBetween(Double value1, Double value2) {
            addCriterion("mm_jyout_b between", value1, value2, "mmJyoutB");
            return (Criteria) this;
        }

        public Criteria andMmJyoutBNotBetween(Double value1, Double value2) {
            addCriterion("mm_jyout_b not between", value1, value2, "mmJyoutB");
            return (Criteria) this;
        }

        public Criteria andMmJyoutCIsNull() {
            addCriterion("mm_jyout_c is null");
            return (Criteria) this;
        }

        public Criteria andMmJyoutCIsNotNull() {
            addCriterion("mm_jyout_c is not null");
            return (Criteria) this;
        }

        public Criteria andMmJyoutCEqualTo(Double value) {
            addCriterion("mm_jyout_c =", value, "mmJyoutC");
            return (Criteria) this;
        }

        public Criteria andMmJyoutCNotEqualTo(Double value) {
            addCriterion("mm_jyout_c <>", value, "mmJyoutC");
            return (Criteria) this;
        }

        public Criteria andMmJyoutCGreaterThan(Double value) {
            addCriterion("mm_jyout_c >", value, "mmJyoutC");
            return (Criteria) this;
        }

        public Criteria andMmJyoutCGreaterThanOrEqualTo(Double value) {
            addCriterion("mm_jyout_c >=", value, "mmJyoutC");
            return (Criteria) this;
        }

        public Criteria andMmJyoutCLessThan(Double value) {
            addCriterion("mm_jyout_c <", value, "mmJyoutC");
            return (Criteria) this;
        }

        public Criteria andMmJyoutCLessThanOrEqualTo(Double value) {
            addCriterion("mm_jyout_c <=", value, "mmJyoutC");
            return (Criteria) this;
        }

        public Criteria andMmJyoutCIn(List<Double> values) {
            addCriterion("mm_jyout_c in", values, "mmJyoutC");
            return (Criteria) this;
        }

        public Criteria andMmJyoutCNotIn(List<Double> values) {
            addCriterion("mm_jyout_c not in", values, "mmJyoutC");
            return (Criteria) this;
        }

        public Criteria andMmJyoutCBetween(Double value1, Double value2) {
            addCriterion("mm_jyout_c between", value1, value2, "mmJyoutC");
            return (Criteria) this;
        }

        public Criteria andMmJyoutCNotBetween(Double value1, Double value2) {
            addCriterion("mm_jyout_c not between", value1, value2, "mmJyoutC");
            return (Criteria) this;
        }

        public Criteria andMmJyoutDIsNull() {
            addCriterion("mm_jyout_d is null");
            return (Criteria) this;
        }

        public Criteria andMmJyoutDIsNotNull() {
            addCriterion("mm_jyout_d is not null");
            return (Criteria) this;
        }

        public Criteria andMmJyoutDEqualTo(Double value) {
            addCriterion("mm_jyout_d =", value, "mmJyoutD");
            return (Criteria) this;
        }

        public Criteria andMmJyoutDNotEqualTo(Double value) {
            addCriterion("mm_jyout_d <>", value, "mmJyoutD");
            return (Criteria) this;
        }

        public Criteria andMmJyoutDGreaterThan(Double value) {
            addCriterion("mm_jyout_d >", value, "mmJyoutD");
            return (Criteria) this;
        }

        public Criteria andMmJyoutDGreaterThanOrEqualTo(Double value) {
            addCriterion("mm_jyout_d >=", value, "mmJyoutD");
            return (Criteria) this;
        }

        public Criteria andMmJyoutDLessThan(Double value) {
            addCriterion("mm_jyout_d <", value, "mmJyoutD");
            return (Criteria) this;
        }

        public Criteria andMmJyoutDLessThanOrEqualTo(Double value) {
            addCriterion("mm_jyout_d <=", value, "mmJyoutD");
            return (Criteria) this;
        }

        public Criteria andMmJyoutDIn(List<Double> values) {
            addCriterion("mm_jyout_d in", values, "mmJyoutD");
            return (Criteria) this;
        }

        public Criteria andMmJyoutDNotIn(List<Double> values) {
            addCriterion("mm_jyout_d not in", values, "mmJyoutD");
            return (Criteria) this;
        }

        public Criteria andMmJyoutDBetween(Double value1, Double value2) {
            addCriterion("mm_jyout_d between", value1, value2, "mmJyoutD");
            return (Criteria) this;
        }

        public Criteria andMmJyoutDNotBetween(Double value1, Double value2) {
            addCriterion("mm_jyout_d not between", value1, value2, "mmJyoutD");
            return (Criteria) this;
        }

        public Criteria andMmJyoutEIsNull() {
            addCriterion("mm_jyout_e is null");
            return (Criteria) this;
        }

        public Criteria andMmJyoutEIsNotNull() {
            addCriterion("mm_jyout_e is not null");
            return (Criteria) this;
        }

        public Criteria andMmJyoutEEqualTo(Double value) {
            addCriterion("mm_jyout_e =", value, "mmJyoutE");
            return (Criteria) this;
        }

        public Criteria andMmJyoutENotEqualTo(Double value) {
            addCriterion("mm_jyout_e <>", value, "mmJyoutE");
            return (Criteria) this;
        }

        public Criteria andMmJyoutEGreaterThan(Double value) {
            addCriterion("mm_jyout_e >", value, "mmJyoutE");
            return (Criteria) this;
        }

        public Criteria andMmJyoutEGreaterThanOrEqualTo(Double value) {
            addCriterion("mm_jyout_e >=", value, "mmJyoutE");
            return (Criteria) this;
        }

        public Criteria andMmJyoutELessThan(Double value) {
            addCriterion("mm_jyout_e <", value, "mmJyoutE");
            return (Criteria) this;
        }

        public Criteria andMmJyoutELessThanOrEqualTo(Double value) {
            addCriterion("mm_jyout_e <=", value, "mmJyoutE");
            return (Criteria) this;
        }

        public Criteria andMmJyoutEIn(List<Double> values) {
            addCriterion("mm_jyout_e in", values, "mmJyoutE");
            return (Criteria) this;
        }

        public Criteria andMmJyoutENotIn(List<Double> values) {
            addCriterion("mm_jyout_e not in", values, "mmJyoutE");
            return (Criteria) this;
        }

        public Criteria andMmJyoutEBetween(Double value1, Double value2) {
            addCriterion("mm_jyout_e between", value1, value2, "mmJyoutE");
            return (Criteria) this;
        }

        public Criteria andMmJyoutENotBetween(Double value1, Double value2) {
            addCriterion("mm_jyout_e not between", value1, value2, "mmJyoutE");
            return (Criteria) this;
        }

        public Criteria andMmJyoutFIsNull() {
            addCriterion("mm_jyout_f is null");
            return (Criteria) this;
        }

        public Criteria andMmJyoutFIsNotNull() {
            addCriterion("mm_jyout_f is not null");
            return (Criteria) this;
        }

        public Criteria andMmJyoutFEqualTo(Double value) {
            addCriterion("mm_jyout_f =", value, "mmJyoutF");
            return (Criteria) this;
        }

        public Criteria andMmJyoutFNotEqualTo(Double value) {
            addCriterion("mm_jyout_f <>", value, "mmJyoutF");
            return (Criteria) this;
        }

        public Criteria andMmJyoutFGreaterThan(Double value) {
            addCriterion("mm_jyout_f >", value, "mmJyoutF");
            return (Criteria) this;
        }

        public Criteria andMmJyoutFGreaterThanOrEqualTo(Double value) {
            addCriterion("mm_jyout_f >=", value, "mmJyoutF");
            return (Criteria) this;
        }

        public Criteria andMmJyoutFLessThan(Double value) {
            addCriterion("mm_jyout_f <", value, "mmJyoutF");
            return (Criteria) this;
        }

        public Criteria andMmJyoutFLessThanOrEqualTo(Double value) {
            addCriterion("mm_jyout_f <=", value, "mmJyoutF");
            return (Criteria) this;
        }

        public Criteria andMmJyoutFIn(List<Double> values) {
            addCriterion("mm_jyout_f in", values, "mmJyoutF");
            return (Criteria) this;
        }

        public Criteria andMmJyoutFNotIn(List<Double> values) {
            addCriterion("mm_jyout_f not in", values, "mmJyoutF");
            return (Criteria) this;
        }

        public Criteria andMmJyoutFBetween(Double value1, Double value2) {
            addCriterion("mm_jyout_f between", value1, value2, "mmJyoutF");
            return (Criteria) this;
        }

        public Criteria andMmJyoutFNotBetween(Double value1, Double value2) {
            addCriterion("mm_jyout_f not between", value1, value2, "mmJyoutF");
            return (Criteria) this;
        }

        public Criteria andMmBzjjIsNull() {
            addCriterion("mm_bzjj is null");
            return (Criteria) this;
        }

        public Criteria andMmBzjjIsNotNull() {
            addCriterion("mm_bzjj is not null");
            return (Criteria) this;
        }

        public Criteria andMmBzjjEqualTo(Double value) {
            addCriterion("mm_bzjj =", value, "mmBzjj");
            return (Criteria) this;
        }

        public Criteria andMmBzjjNotEqualTo(Double value) {
            addCriterion("mm_bzjj <>", value, "mmBzjj");
            return (Criteria) this;
        }

        public Criteria andMmBzjjGreaterThan(Double value) {
            addCriterion("mm_bzjj >", value, "mmBzjj");
            return (Criteria) this;
        }

        public Criteria andMmBzjjGreaterThanOrEqualTo(Double value) {
            addCriterion("mm_bzjj >=", value, "mmBzjj");
            return (Criteria) this;
        }

        public Criteria andMmBzjjLessThan(Double value) {
            addCriterion("mm_bzjj <", value, "mmBzjj");
            return (Criteria) this;
        }

        public Criteria andMmBzjjLessThanOrEqualTo(Double value) {
            addCriterion("mm_bzjj <=", value, "mmBzjj");
            return (Criteria) this;
        }

        public Criteria andMmBzjjIn(List<Double> values) {
            addCriterion("mm_bzjj in", values, "mmBzjj");
            return (Criteria) this;
        }

        public Criteria andMmBzjjNotIn(List<Double> values) {
            addCriterion("mm_bzjj not in", values, "mmBzjj");
            return (Criteria) this;
        }

        public Criteria andMmBzjjBetween(Double value1, Double value2) {
            addCriterion("mm_bzjj between", value1, value2, "mmBzjj");
            return (Criteria) this;
        }

        public Criteria andMmBzjjNotBetween(Double value1, Double value2) {
            addCriterion("mm_bzjj not between", value1, value2, "mmBzjj");
            return (Criteria) this;
        }

        public Criteria andMmCidIsNull() {
            addCriterion("mm_cid is null");
            return (Criteria) this;
        }

        public Criteria andMmCidIsNotNull() {
            addCriterion("mm_cid is not null");
            return (Criteria) this;
        }

        public Criteria andMmCidEqualTo(Integer value) {
            addCriterion("mm_cid =", value, "mmCid");
            return (Criteria) this;
        }

        public Criteria andMmCidNotEqualTo(Integer value) {
            addCriterion("mm_cid <>", value, "mmCid");
            return (Criteria) this;
        }

        public Criteria andMmCidGreaterThan(Integer value) {
            addCriterion("mm_cid >", value, "mmCid");
            return (Criteria) this;
        }

        public Criteria andMmCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mm_cid >=", value, "mmCid");
            return (Criteria) this;
        }

        public Criteria andMmCidLessThan(Integer value) {
            addCriterion("mm_cid <", value, "mmCid");
            return (Criteria) this;
        }

        public Criteria andMmCidLessThanOrEqualTo(Integer value) {
            addCriterion("mm_cid <=", value, "mmCid");
            return (Criteria) this;
        }

        public Criteria andMmCidIn(List<Integer> values) {
            addCriterion("mm_cid in", values, "mmCid");
            return (Criteria) this;
        }

        public Criteria andMmCidNotIn(List<Integer> values) {
            addCriterion("mm_cid not in", values, "mmCid");
            return (Criteria) this;
        }

        public Criteria andMmCidBetween(Integer value1, Integer value2) {
            addCriterion("mm_cid between", value1, value2, "mmCid");
            return (Criteria) this;
        }

        public Criteria andMmCidNotBetween(Integer value1, Integer value2) {
            addCriterion("mm_cid not between", value1, value2, "mmCid");
            return (Criteria) this;
        }

        public Criteria andMmMmxtIsNull() {
            addCriterion("mm_mmxt is null");
            return (Criteria) this;
        }

        public Criteria andMmMmxtIsNotNull() {
            addCriterion("mm_mmxt is not null");
            return (Criteria) this;
        }

        public Criteria andMmMmxtEqualTo(Integer value) {
            addCriterion("mm_mmxt =", value, "mmMmxt");
            return (Criteria) this;
        }

        public Criteria andMmMmxtNotEqualTo(Integer value) {
            addCriterion("mm_mmxt <>", value, "mmMmxt");
            return (Criteria) this;
        }

        public Criteria andMmMmxtGreaterThan(Integer value) {
            addCriterion("mm_mmxt >", value, "mmMmxt");
            return (Criteria) this;
        }

        public Criteria andMmMmxtGreaterThanOrEqualTo(Integer value) {
            addCriterion("mm_mmxt >=", value, "mmMmxt");
            return (Criteria) this;
        }

        public Criteria andMmMmxtLessThan(Integer value) {
            addCriterion("mm_mmxt <", value, "mmMmxt");
            return (Criteria) this;
        }

        public Criteria andMmMmxtLessThanOrEqualTo(Integer value) {
            addCriterion("mm_mmxt <=", value, "mmMmxt");
            return (Criteria) this;
        }

        public Criteria andMmMmxtIn(List<Integer> values) {
            addCriterion("mm_mmxt in", values, "mmMmxt");
            return (Criteria) this;
        }

        public Criteria andMmMmxtNotIn(List<Integer> values) {
            addCriterion("mm_mmxt not in", values, "mmMmxt");
            return (Criteria) this;
        }

        public Criteria andMmMmxtBetween(Integer value1, Integer value2) {
            addCriterion("mm_mmxt between", value1, value2, "mmMmxt");
            return (Criteria) this;
        }

        public Criteria andMmMmxtNotBetween(Integer value1, Integer value2) {
            addCriterion("mm_mmxt not between", value1, value2, "mmMmxt");
            return (Criteria) this;
        }

        public Criteria andMmDpriceFlagIsNull() {
            addCriterion("mm_dprice_flag is null");
            return (Criteria) this;
        }

        public Criteria andMmDpriceFlagIsNotNull() {
            addCriterion("mm_dprice_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMmDpriceFlagEqualTo(Boolean value) {
            addCriterion("mm_dprice_flag =", value, "mmDpriceFlag");
            return (Criteria) this;
        }

        public Criteria andMmDpriceFlagNotEqualTo(Boolean value) {
            addCriterion("mm_dprice_flag <>", value, "mmDpriceFlag");
            return (Criteria) this;
        }

        public Criteria andMmDpriceFlagGreaterThan(Boolean value) {
            addCriterion("mm_dprice_flag >", value, "mmDpriceFlag");
            return (Criteria) this;
        }

        public Criteria andMmDpriceFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mm_dprice_flag >=", value, "mmDpriceFlag");
            return (Criteria) this;
        }

        public Criteria andMmDpriceFlagLessThan(Boolean value) {
            addCriterion("mm_dprice_flag <", value, "mmDpriceFlag");
            return (Criteria) this;
        }

        public Criteria andMmDpriceFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("mm_dprice_flag <=", value, "mmDpriceFlag");
            return (Criteria) this;
        }

        public Criteria andMmDpriceFlagIn(List<Boolean> values) {
            addCriterion("mm_dprice_flag in", values, "mmDpriceFlag");
            return (Criteria) this;
        }

        public Criteria andMmDpriceFlagNotIn(List<Boolean> values) {
            addCriterion("mm_dprice_flag not in", values, "mmDpriceFlag");
            return (Criteria) this;
        }

        public Criteria andMmDpriceFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("mm_dprice_flag between", value1, value2, "mmDpriceFlag");
            return (Criteria) this;
        }

        public Criteria andMmDpriceFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mm_dprice_flag not between", value1, value2, "mmDpriceFlag");
            return (Criteria) this;
        }

        public Criteria andMmTiidIsNull() {
            addCriterion("mm_tiid is null");
            return (Criteria) this;
        }

        public Criteria andMmTiidIsNotNull() {
            addCriterion("mm_tiid is not null");
            return (Criteria) this;
        }

        public Criteria andMmTiidEqualTo(Integer value) {
            addCriterion("mm_tiid =", value, "mmTiid");
            return (Criteria) this;
        }

        public Criteria andMmTiidNotEqualTo(Integer value) {
            addCriterion("mm_tiid <>", value, "mmTiid");
            return (Criteria) this;
        }

        public Criteria andMmTiidGreaterThan(Integer value) {
            addCriterion("mm_tiid >", value, "mmTiid");
            return (Criteria) this;
        }

        public Criteria andMmTiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mm_tiid >=", value, "mmTiid");
            return (Criteria) this;
        }

        public Criteria andMmTiidLessThan(Integer value) {
            addCriterion("mm_tiid <", value, "mmTiid");
            return (Criteria) this;
        }

        public Criteria andMmTiidLessThanOrEqualTo(Integer value) {
            addCriterion("mm_tiid <=", value, "mmTiid");
            return (Criteria) this;
        }

        public Criteria andMmTiidIn(List<Integer> values) {
            addCriterion("mm_tiid in", values, "mmTiid");
            return (Criteria) this;
        }

        public Criteria andMmTiidNotIn(List<Integer> values) {
            addCriterion("mm_tiid not in", values, "mmTiid");
            return (Criteria) this;
        }

        public Criteria andMmTiidBetween(Integer value1, Integer value2) {
            addCriterion("mm_tiid between", value1, value2, "mmTiid");
            return (Criteria) this;
        }

        public Criteria andMmTiidNotBetween(Integer value1, Integer value2) {
            addCriterion("mm_tiid not between", value1, value2, "mmTiid");
            return (Criteria) this;
        }

        public Criteria andMmSlvIsNull() {
            addCriterion("mm_slv is null");
            return (Criteria) this;
        }

        public Criteria andMmSlvIsNotNull() {
            addCriterion("mm_slv is not null");
            return (Criteria) this;
        }

        public Criteria andMmSlvEqualTo(Double value) {
            addCriterion("mm_slv =", value, "mmSlv");
            return (Criteria) this;
        }

        public Criteria andMmSlvNotEqualTo(Double value) {
            addCriterion("mm_slv <>", value, "mmSlv");
            return (Criteria) this;
        }

        public Criteria andMmSlvGreaterThan(Double value) {
            addCriterion("mm_slv >", value, "mmSlv");
            return (Criteria) this;
        }

        public Criteria andMmSlvGreaterThanOrEqualTo(Double value) {
            addCriterion("mm_slv >=", value, "mmSlv");
            return (Criteria) this;
        }

        public Criteria andMmSlvLessThan(Double value) {
            addCriterion("mm_slv <", value, "mmSlv");
            return (Criteria) this;
        }

        public Criteria andMmSlvLessThanOrEqualTo(Double value) {
            addCriterion("mm_slv <=", value, "mmSlv");
            return (Criteria) this;
        }

        public Criteria andMmSlvIn(List<Double> values) {
            addCriterion("mm_slv in", values, "mmSlv");
            return (Criteria) this;
        }

        public Criteria andMmSlvNotIn(List<Double> values) {
            addCriterion("mm_slv not in", values, "mmSlv");
            return (Criteria) this;
        }

        public Criteria andMmSlvBetween(Double value1, Double value2) {
            addCriterion("mm_slv between", value1, value2, "mmSlv");
            return (Criteria) this;
        }

        public Criteria andMmSlvNotBetween(Double value1, Double value2) {
            addCriterion("mm_slv not between", value1, value2, "mmSlv");
            return (Criteria) this;
        }

        public Criteria andMmCgbeforeDateIsNull() {
            addCriterion("mm_cgbefore_date is null");
            return (Criteria) this;
        }

        public Criteria andMmCgbeforeDateIsNotNull() {
            addCriterion("mm_cgbefore_date is not null");
            return (Criteria) this;
        }

        public Criteria andMmCgbeforeDateEqualTo(Integer value) {
            addCriterion("mm_cgbefore_date =", value, "mmCgbeforeDate");
            return (Criteria) this;
        }

        public Criteria andMmCgbeforeDateNotEqualTo(Integer value) {
            addCriterion("mm_cgbefore_date <>", value, "mmCgbeforeDate");
            return (Criteria) this;
        }

        public Criteria andMmCgbeforeDateGreaterThan(Integer value) {
            addCriterion("mm_cgbefore_date >", value, "mmCgbeforeDate");
            return (Criteria) this;
        }

        public Criteria andMmCgbeforeDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("mm_cgbefore_date >=", value, "mmCgbeforeDate");
            return (Criteria) this;
        }

        public Criteria andMmCgbeforeDateLessThan(Integer value) {
            addCriterion("mm_cgbefore_date <", value, "mmCgbeforeDate");
            return (Criteria) this;
        }

        public Criteria andMmCgbeforeDateLessThanOrEqualTo(Integer value) {
            addCriterion("mm_cgbefore_date <=", value, "mmCgbeforeDate");
            return (Criteria) this;
        }

        public Criteria andMmCgbeforeDateIn(List<Integer> values) {
            addCriterion("mm_cgbefore_date in", values, "mmCgbeforeDate");
            return (Criteria) this;
        }

        public Criteria andMmCgbeforeDateNotIn(List<Integer> values) {
            addCriterion("mm_cgbefore_date not in", values, "mmCgbeforeDate");
            return (Criteria) this;
        }

        public Criteria andMmCgbeforeDateBetween(Integer value1, Integer value2) {
            addCriterion("mm_cgbefore_date between", value1, value2, "mmCgbeforeDate");
            return (Criteria) this;
        }

        public Criteria andMmCgbeforeDateNotBetween(Integer value1, Integer value2) {
            addCriterion("mm_cgbefore_date not between", value1, value2, "mmCgbeforeDate");
            return (Criteria) this;
        }

        public Criteria andMmMainSmidIsNull() {
            addCriterion("mm_main_smid is null");
            return (Criteria) this;
        }

        public Criteria andMmMainSmidIsNotNull() {
            addCriterion("mm_main_smid is not null");
            return (Criteria) this;
        }

        public Criteria andMmMainSmidEqualTo(String value) {
            addCriterion("mm_main_smid =", value, "mmMainSmid");
            return (Criteria) this;
        }

        public Criteria andMmMainSmidNotEqualTo(String value) {
            addCriterion("mm_main_smid <>", value, "mmMainSmid");
            return (Criteria) this;
        }

        public Criteria andMmMainSmidGreaterThan(String value) {
            addCriterion("mm_main_smid >", value, "mmMainSmid");
            return (Criteria) this;
        }

        public Criteria andMmMainSmidGreaterThanOrEqualTo(String value) {
            addCriterion("mm_main_smid >=", value, "mmMainSmid");
            return (Criteria) this;
        }

        public Criteria andMmMainSmidLessThan(String value) {
            addCriterion("mm_main_smid <", value, "mmMainSmid");
            return (Criteria) this;
        }

        public Criteria andMmMainSmidLessThanOrEqualTo(String value) {
            addCriterion("mm_main_smid <=", value, "mmMainSmid");
            return (Criteria) this;
        }

        public Criteria andMmMainSmidLike(String value) {
            addCriterion("mm_main_smid like", value, "mmMainSmid");
            return (Criteria) this;
        }

        public Criteria andMmMainSmidNotLike(String value) {
            addCriterion("mm_main_smid not like", value, "mmMainSmid");
            return (Criteria) this;
        }

        public Criteria andMmMainSmidIn(List<String> values) {
            addCriterion("mm_main_smid in", values, "mmMainSmid");
            return (Criteria) this;
        }

        public Criteria andMmMainSmidNotIn(List<String> values) {
            addCriterion("mm_main_smid not in", values, "mmMainSmid");
            return (Criteria) this;
        }

        public Criteria andMmMainSmidBetween(String value1, String value2) {
            addCriterion("mm_main_smid between", value1, value2, "mmMainSmid");
            return (Criteria) this;
        }

        public Criteria andMmMainSmidNotBetween(String value1, String value2) {
            addCriterion("mm_main_smid not between", value1, value2, "mmMainSmid");
            return (Criteria) this;
        }

        public Criteria andMmNearCkDateIsNull() {
            addCriterion("mm_near_ck_date is null");
            return (Criteria) this;
        }

        public Criteria andMmNearCkDateIsNotNull() {
            addCriterion("mm_near_ck_date is not null");
            return (Criteria) this;
        }

        public Criteria andMmNearCkDateEqualTo(Date value) {
            addCriterionForJDBCDate("mm_near_ck_date =", value, "mmNearCkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearCkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("mm_near_ck_date <>", value, "mmNearCkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearCkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("mm_near_ck_date >", value, "mmNearCkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearCkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mm_near_ck_date >=", value, "mmNearCkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearCkDateLessThan(Date value) {
            addCriterionForJDBCDate("mm_near_ck_date <", value, "mmNearCkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearCkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mm_near_ck_date <=", value, "mmNearCkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearCkDateIn(List<Date> values) {
            addCriterionForJDBCDate("mm_near_ck_date in", values, "mmNearCkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearCkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("mm_near_ck_date not in", values, "mmNearCkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearCkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mm_near_ck_date between", value1, value2, "mmNearCkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearCkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mm_near_ck_date not between", value1, value2, "mmNearCkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearRkDateIsNull() {
            addCriterion("mm_near_rk_date is null");
            return (Criteria) this;
        }

        public Criteria andMmNearRkDateIsNotNull() {
            addCriterion("mm_near_rk_date is not null");
            return (Criteria) this;
        }

        public Criteria andMmNearRkDateEqualTo(Date value) {
            addCriterionForJDBCDate("mm_near_rk_date =", value, "mmNearRkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearRkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("mm_near_rk_date <>", value, "mmNearRkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearRkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("mm_near_rk_date >", value, "mmNearRkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearRkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mm_near_rk_date >=", value, "mmNearRkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearRkDateLessThan(Date value) {
            addCriterionForJDBCDate("mm_near_rk_date <", value, "mmNearRkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearRkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mm_near_rk_date <=", value, "mmNearRkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearRkDateIn(List<Date> values) {
            addCriterionForJDBCDate("mm_near_rk_date in", values, "mmNearRkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearRkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("mm_near_rk_date not in", values, "mmNearRkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearRkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mm_near_rk_date between", value1, value2, "mmNearRkDate");
            return (Criteria) this;
        }

        public Criteria andMmNearRkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mm_near_rk_date not between", value1, value2, "mmNearRkDate");
            return (Criteria) this;
        }

        public Criteria andMmDzDaysIsNull() {
            addCriterion("mm_dz_days is null");
            return (Criteria) this;
        }

        public Criteria andMmDzDaysIsNotNull() {
            addCriterion("mm_dz_days is not null");
            return (Criteria) this;
        }

        public Criteria andMmDzDaysEqualTo(Integer value) {
            addCriterion("mm_dz_days =", value, "mmDzDays");
            return (Criteria) this;
        }

        public Criteria andMmDzDaysNotEqualTo(Integer value) {
            addCriterion("mm_dz_days <>", value, "mmDzDays");
            return (Criteria) this;
        }

        public Criteria andMmDzDaysGreaterThan(Integer value) {
            addCriterion("mm_dz_days >", value, "mmDzDays");
            return (Criteria) this;
        }

        public Criteria andMmDzDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("mm_dz_days >=", value, "mmDzDays");
            return (Criteria) this;
        }

        public Criteria andMmDzDaysLessThan(Integer value) {
            addCriterion("mm_dz_days <", value, "mmDzDays");
            return (Criteria) this;
        }

        public Criteria andMmDzDaysLessThanOrEqualTo(Integer value) {
            addCriterion("mm_dz_days <=", value, "mmDzDays");
            return (Criteria) this;
        }

        public Criteria andMmDzDaysIn(List<Integer> values) {
            addCriterion("mm_dz_days in", values, "mmDzDays");
            return (Criteria) this;
        }

        public Criteria andMmDzDaysNotIn(List<Integer> values) {
            addCriterion("mm_dz_days not in", values, "mmDzDays");
            return (Criteria) this;
        }

        public Criteria andMmDzDaysBetween(Integer value1, Integer value2) {
            addCriterion("mm_dz_days between", value1, value2, "mmDzDays");
            return (Criteria) this;
        }

        public Criteria andMmDzDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("mm_dz_days not between", value1, value2, "mmDzDays");
            return (Criteria) this;
        }

        public Criteria andMmJinCkDateIsNull() {
            addCriterion("mm_jin_ck_date is null");
            return (Criteria) this;
        }

        public Criteria andMmJinCkDateIsNotNull() {
            addCriterion("mm_jin_ck_date is not null");
            return (Criteria) this;
        }

        public Criteria andMmJinCkDateEqualTo(Date value) {
            addCriterionForJDBCDate("mm_jin_ck_date =", value, "mmJinCkDate");
            return (Criteria) this;
        }

        public Criteria andMmJinCkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("mm_jin_ck_date <>", value, "mmJinCkDate");
            return (Criteria) this;
        }

        public Criteria andMmJinCkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("mm_jin_ck_date >", value, "mmJinCkDate");
            return (Criteria) this;
        }

        public Criteria andMmJinCkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mm_jin_ck_date >=", value, "mmJinCkDate");
            return (Criteria) this;
        }

        public Criteria andMmJinCkDateLessThan(Date value) {
            addCriterionForJDBCDate("mm_jin_ck_date <", value, "mmJinCkDate");
            return (Criteria) this;
        }

        public Criteria andMmJinCkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mm_jin_ck_date <=", value, "mmJinCkDate");
            return (Criteria) this;
        }

        public Criteria andMmJinCkDateIn(List<Date> values) {
            addCriterionForJDBCDate("mm_jin_ck_date in", values, "mmJinCkDate");
            return (Criteria) this;
        }

        public Criteria andMmJinCkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("mm_jin_ck_date not in", values, "mmJinCkDate");
            return (Criteria) this;
        }

        public Criteria andMmJinCkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mm_jin_ck_date between", value1, value2, "mmJinCkDate");
            return (Criteria) this;
        }

        public Criteria andMmJinCkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mm_jin_ck_date not between", value1, value2, "mmJinCkDate");
            return (Criteria) this;
        }

        public Criteria andMmStopDateIsNull() {
            addCriterion("mm_stop_date is null");
            return (Criteria) this;
        }

        public Criteria andMmStopDateIsNotNull() {
            addCriterion("mm_stop_date is not null");
            return (Criteria) this;
        }

        public Criteria andMmStopDateEqualTo(Date value) {
            addCriterionForJDBCDate("mm_stop_date =", value, "mmStopDate");
            return (Criteria) this;
        }

        public Criteria andMmStopDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("mm_stop_date <>", value, "mmStopDate");
            return (Criteria) this;
        }

        public Criteria andMmStopDateGreaterThan(Date value) {
            addCriterionForJDBCDate("mm_stop_date >", value, "mmStopDate");
            return (Criteria) this;
        }

        public Criteria andMmStopDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mm_stop_date >=", value, "mmStopDate");
            return (Criteria) this;
        }

        public Criteria andMmStopDateLessThan(Date value) {
            addCriterionForJDBCDate("mm_stop_date <", value, "mmStopDate");
            return (Criteria) this;
        }

        public Criteria andMmStopDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mm_stop_date <=", value, "mmStopDate");
            return (Criteria) this;
        }

        public Criteria andMmStopDateIn(List<Date> values) {
            addCriterionForJDBCDate("mm_stop_date in", values, "mmStopDate");
            return (Criteria) this;
        }

        public Criteria andMmStopDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("mm_stop_date not in", values, "mmStopDate");
            return (Criteria) this;
        }

        public Criteria andMmStopDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mm_stop_date between", value1, value2, "mmStopDate");
            return (Criteria) this;
        }

        public Criteria andMmStopDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mm_stop_date not between", value1, value2, "mmStopDate");
            return (Criteria) this;
        }

        public Criteria andMmRemarkIsNull() {
            addCriterion("mm_remark is null");
            return (Criteria) this;
        }

        public Criteria andMmRemarkIsNotNull() {
            addCriterion("mm_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMmRemarkEqualTo(String value) {
            addCriterion("mm_remark =", value, "mmRemark");
            return (Criteria) this;
        }

        public Criteria andMmRemarkNotEqualTo(String value) {
            addCriterion("mm_remark <>", value, "mmRemark");
            return (Criteria) this;
        }

        public Criteria andMmRemarkGreaterThan(String value) {
            addCriterion("mm_remark >", value, "mmRemark");
            return (Criteria) this;
        }

        public Criteria andMmRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("mm_remark >=", value, "mmRemark");
            return (Criteria) this;
        }

        public Criteria andMmRemarkLessThan(String value) {
            addCriterion("mm_remark <", value, "mmRemark");
            return (Criteria) this;
        }

        public Criteria andMmRemarkLessThanOrEqualTo(String value) {
            addCriterion("mm_remark <=", value, "mmRemark");
            return (Criteria) this;
        }

        public Criteria andMmRemarkLike(String value) {
            addCriterion("mm_remark like", value, "mmRemark");
            return (Criteria) this;
        }

        public Criteria andMmRemarkNotLike(String value) {
            addCriterion("mm_remark not like", value, "mmRemark");
            return (Criteria) this;
        }

        public Criteria andMmRemarkIn(List<String> values) {
            addCriterion("mm_remark in", values, "mmRemark");
            return (Criteria) this;
        }

        public Criteria andMmRemarkNotIn(List<String> values) {
            addCriterion("mm_remark not in", values, "mmRemark");
            return (Criteria) this;
        }

        public Criteria andMmRemarkBetween(String value1, String value2) {
            addCriterion("mm_remark between", value1, value2, "mmRemark");
            return (Criteria) this;
        }

        public Criteria andMmRemarkNotBetween(String value1, String value2) {
            addCriterion("mm_remark not between", value1, value2, "mmRemark");
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