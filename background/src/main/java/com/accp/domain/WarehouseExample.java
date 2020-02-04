package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class WarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseExample() {
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

        public Criteria andWIdIsNull() {
            addCriterion("w_id is null");
            return (Criteria) this;
        }

        public Criteria andWIdIsNotNull() {
            addCriterion("w_id is not null");
            return (Criteria) this;
        }

        public Criteria andWIdEqualTo(Integer value) {
            addCriterion("w_id =", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotEqualTo(Integer value) {
            addCriterion("w_id <>", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdGreaterThan(Integer value) {
            addCriterion("w_id >", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_id >=", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdLessThan(Integer value) {
            addCriterion("w_id <", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdLessThanOrEqualTo(Integer value) {
            addCriterion("w_id <=", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdIn(List<Integer> values) {
            addCriterion("w_id in", values, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotIn(List<Integer> values) {
            addCriterion("w_id not in", values, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdBetween(Integer value1, Integer value2) {
            addCriterion("w_id between", value1, value2, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotBetween(Integer value1, Integer value2) {
            addCriterion("w_id not between", value1, value2, "wId");
            return (Criteria) this;
        }

        public Criteria andWNameIsNull() {
            addCriterion("w_name is null");
            return (Criteria) this;
        }

        public Criteria andWNameIsNotNull() {
            addCriterion("w_name is not null");
            return (Criteria) this;
        }

        public Criteria andWNameEqualTo(String value) {
            addCriterion("w_name =", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameNotEqualTo(String value) {
            addCriterion("w_name <>", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameGreaterThan(String value) {
            addCriterion("w_name >", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameGreaterThanOrEqualTo(String value) {
            addCriterion("w_name >=", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameLessThan(String value) {
            addCriterion("w_name <", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameLessThanOrEqualTo(String value) {
            addCriterion("w_name <=", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameLike(String value) {
            addCriterion("w_name like", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameNotLike(String value) {
            addCriterion("w_name not like", value, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameIn(List<String> values) {
            addCriterion("w_name in", values, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameNotIn(List<String> values) {
            addCriterion("w_name not in", values, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameBetween(String value1, String value2) {
            addCriterion("w_name between", value1, value2, "wName");
            return (Criteria) this;
        }

        public Criteria andWNameNotBetween(String value1, String value2) {
            addCriterion("w_name not between", value1, value2, "wName");
            return (Criteria) this;
        }

        public Criteria andWJnameIsNull() {
            addCriterion("w_jname is null");
            return (Criteria) this;
        }

        public Criteria andWJnameIsNotNull() {
            addCriterion("w_jname is not null");
            return (Criteria) this;
        }

        public Criteria andWJnameEqualTo(String value) {
            addCriterion("w_jname =", value, "wJname");
            return (Criteria) this;
        }

        public Criteria andWJnameNotEqualTo(String value) {
            addCriterion("w_jname <>", value, "wJname");
            return (Criteria) this;
        }

        public Criteria andWJnameGreaterThan(String value) {
            addCriterion("w_jname >", value, "wJname");
            return (Criteria) this;
        }

        public Criteria andWJnameGreaterThanOrEqualTo(String value) {
            addCriterion("w_jname >=", value, "wJname");
            return (Criteria) this;
        }

        public Criteria andWJnameLessThan(String value) {
            addCriterion("w_jname <", value, "wJname");
            return (Criteria) this;
        }

        public Criteria andWJnameLessThanOrEqualTo(String value) {
            addCriterion("w_jname <=", value, "wJname");
            return (Criteria) this;
        }

        public Criteria andWJnameLike(String value) {
            addCriterion("w_jname like", value, "wJname");
            return (Criteria) this;
        }

        public Criteria andWJnameNotLike(String value) {
            addCriterion("w_jname not like", value, "wJname");
            return (Criteria) this;
        }

        public Criteria andWJnameIn(List<String> values) {
            addCriterion("w_jname in", values, "wJname");
            return (Criteria) this;
        }

        public Criteria andWJnameNotIn(List<String> values) {
            addCriterion("w_jname not in", values, "wJname");
            return (Criteria) this;
        }

        public Criteria andWJnameBetween(String value1, String value2) {
            addCriterion("w_jname between", value1, value2, "wJname");
            return (Criteria) this;
        }

        public Criteria andWJnameNotBetween(String value1, String value2) {
            addCriterion("w_jname not between", value1, value2, "wJname");
            return (Criteria) this;
        }

        public Criteria andWEnameIsNull() {
            addCriterion("w_ename is null");
            return (Criteria) this;
        }

        public Criteria andWEnameIsNotNull() {
            addCriterion("w_ename is not null");
            return (Criteria) this;
        }

        public Criteria andWEnameEqualTo(String value) {
            addCriterion("w_ename =", value, "wEname");
            return (Criteria) this;
        }

        public Criteria andWEnameNotEqualTo(String value) {
            addCriterion("w_ename <>", value, "wEname");
            return (Criteria) this;
        }

        public Criteria andWEnameGreaterThan(String value) {
            addCriterion("w_ename >", value, "wEname");
            return (Criteria) this;
        }

        public Criteria andWEnameGreaterThanOrEqualTo(String value) {
            addCriterion("w_ename >=", value, "wEname");
            return (Criteria) this;
        }

        public Criteria andWEnameLessThan(String value) {
            addCriterion("w_ename <", value, "wEname");
            return (Criteria) this;
        }

        public Criteria andWEnameLessThanOrEqualTo(String value) {
            addCriterion("w_ename <=", value, "wEname");
            return (Criteria) this;
        }

        public Criteria andWEnameLike(String value) {
            addCriterion("w_ename like", value, "wEname");
            return (Criteria) this;
        }

        public Criteria andWEnameNotLike(String value) {
            addCriterion("w_ename not like", value, "wEname");
            return (Criteria) this;
        }

        public Criteria andWEnameIn(List<String> values) {
            addCriterion("w_ename in", values, "wEname");
            return (Criteria) this;
        }

        public Criteria andWEnameNotIn(List<String> values) {
            addCriterion("w_ename not in", values, "wEname");
            return (Criteria) this;
        }

        public Criteria andWEnameBetween(String value1, String value2) {
            addCriterion("w_ename between", value1, value2, "wEname");
            return (Criteria) this;
        }

        public Criteria andWEnameNotBetween(String value1, String value2) {
            addCriterion("w_ename not between", value1, value2, "wEname");
            return (Criteria) this;
        }

        public Criteria andWLxManIsNull() {
            addCriterion("w_lx_man is null");
            return (Criteria) this;
        }

        public Criteria andWLxManIsNotNull() {
            addCriterion("w_lx_man is not null");
            return (Criteria) this;
        }

        public Criteria andWLxManEqualTo(String value) {
            addCriterion("w_lx_man =", value, "wLxMan");
            return (Criteria) this;
        }

        public Criteria andWLxManNotEqualTo(String value) {
            addCriterion("w_lx_man <>", value, "wLxMan");
            return (Criteria) this;
        }

        public Criteria andWLxManGreaterThan(String value) {
            addCriterion("w_lx_man >", value, "wLxMan");
            return (Criteria) this;
        }

        public Criteria andWLxManGreaterThanOrEqualTo(String value) {
            addCriterion("w_lx_man >=", value, "wLxMan");
            return (Criteria) this;
        }

        public Criteria andWLxManLessThan(String value) {
            addCriterion("w_lx_man <", value, "wLxMan");
            return (Criteria) this;
        }

        public Criteria andWLxManLessThanOrEqualTo(String value) {
            addCriterion("w_lx_man <=", value, "wLxMan");
            return (Criteria) this;
        }

        public Criteria andWLxManLike(String value) {
            addCriterion("w_lx_man like", value, "wLxMan");
            return (Criteria) this;
        }

        public Criteria andWLxManNotLike(String value) {
            addCriterion("w_lx_man not like", value, "wLxMan");
            return (Criteria) this;
        }

        public Criteria andWLxManIn(List<String> values) {
            addCriterion("w_lx_man in", values, "wLxMan");
            return (Criteria) this;
        }

        public Criteria andWLxManNotIn(List<String> values) {
            addCriterion("w_lx_man not in", values, "wLxMan");
            return (Criteria) this;
        }

        public Criteria andWLxManBetween(String value1, String value2) {
            addCriterion("w_lx_man between", value1, value2, "wLxMan");
            return (Criteria) this;
        }

        public Criteria andWLxManNotBetween(String value1, String value2) {
            addCriterion("w_lx_man not between", value1, value2, "wLxMan");
            return (Criteria) this;
        }

        public Criteria andWLxPhoneIsNull() {
            addCriterion("w_lx_phone is null");
            return (Criteria) this;
        }

        public Criteria andWLxPhoneIsNotNull() {
            addCriterion("w_lx_phone is not null");
            return (Criteria) this;
        }

        public Criteria andWLxPhoneEqualTo(String value) {
            addCriterion("w_lx_phone =", value, "wLxPhone");
            return (Criteria) this;
        }

        public Criteria andWLxPhoneNotEqualTo(String value) {
            addCriterion("w_lx_phone <>", value, "wLxPhone");
            return (Criteria) this;
        }

        public Criteria andWLxPhoneGreaterThan(String value) {
            addCriterion("w_lx_phone >", value, "wLxPhone");
            return (Criteria) this;
        }

        public Criteria andWLxPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("w_lx_phone >=", value, "wLxPhone");
            return (Criteria) this;
        }

        public Criteria andWLxPhoneLessThan(String value) {
            addCriterion("w_lx_phone <", value, "wLxPhone");
            return (Criteria) this;
        }

        public Criteria andWLxPhoneLessThanOrEqualTo(String value) {
            addCriterion("w_lx_phone <=", value, "wLxPhone");
            return (Criteria) this;
        }

        public Criteria andWLxPhoneLike(String value) {
            addCriterion("w_lx_phone like", value, "wLxPhone");
            return (Criteria) this;
        }

        public Criteria andWLxPhoneNotLike(String value) {
            addCriterion("w_lx_phone not like", value, "wLxPhone");
            return (Criteria) this;
        }

        public Criteria andWLxPhoneIn(List<String> values) {
            addCriterion("w_lx_phone in", values, "wLxPhone");
            return (Criteria) this;
        }

        public Criteria andWLxPhoneNotIn(List<String> values) {
            addCriterion("w_lx_phone not in", values, "wLxPhone");
            return (Criteria) this;
        }

        public Criteria andWLxPhoneBetween(String value1, String value2) {
            addCriterion("w_lx_phone between", value1, value2, "wLxPhone");
            return (Criteria) this;
        }

        public Criteria andWLxPhoneNotBetween(String value1, String value2) {
            addCriterion("w_lx_phone not between", value1, value2, "wLxPhone");
            return (Criteria) this;
        }

        public Criteria andWCkAddressIsNull() {
            addCriterion("w_ck_address is null");
            return (Criteria) this;
        }

        public Criteria andWCkAddressIsNotNull() {
            addCriterion("w_ck_address is not null");
            return (Criteria) this;
        }

        public Criteria andWCkAddressEqualTo(String value) {
            addCriterion("w_ck_address =", value, "wCkAddress");
            return (Criteria) this;
        }

        public Criteria andWCkAddressNotEqualTo(String value) {
            addCriterion("w_ck_address <>", value, "wCkAddress");
            return (Criteria) this;
        }

        public Criteria andWCkAddressGreaterThan(String value) {
            addCriterion("w_ck_address >", value, "wCkAddress");
            return (Criteria) this;
        }

        public Criteria andWCkAddressGreaterThanOrEqualTo(String value) {
            addCriterion("w_ck_address >=", value, "wCkAddress");
            return (Criteria) this;
        }

        public Criteria andWCkAddressLessThan(String value) {
            addCriterion("w_ck_address <", value, "wCkAddress");
            return (Criteria) this;
        }

        public Criteria andWCkAddressLessThanOrEqualTo(String value) {
            addCriterion("w_ck_address <=", value, "wCkAddress");
            return (Criteria) this;
        }

        public Criteria andWCkAddressLike(String value) {
            addCriterion("w_ck_address like", value, "wCkAddress");
            return (Criteria) this;
        }

        public Criteria andWCkAddressNotLike(String value) {
            addCriterion("w_ck_address not like", value, "wCkAddress");
            return (Criteria) this;
        }

        public Criteria andWCkAddressIn(List<String> values) {
            addCriterion("w_ck_address in", values, "wCkAddress");
            return (Criteria) this;
        }

        public Criteria andWCkAddressNotIn(List<String> values) {
            addCriterion("w_ck_address not in", values, "wCkAddress");
            return (Criteria) this;
        }

        public Criteria andWCkAddressBetween(String value1, String value2) {
            addCriterion("w_ck_address between", value1, value2, "wCkAddress");
            return (Criteria) this;
        }

        public Criteria andWCkAddressNotBetween(String value1, String value2) {
            addCriterion("w_ck_address not between", value1, value2, "wCkAddress");
            return (Criteria) this;
        }

        public Criteria andWRemarkIsNull() {
            addCriterion("w_remark is null");
            return (Criteria) this;
        }

        public Criteria andWRemarkIsNotNull() {
            addCriterion("w_remark is not null");
            return (Criteria) this;
        }

        public Criteria andWRemarkEqualTo(String value) {
            addCriterion("w_remark =", value, "wRemark");
            return (Criteria) this;
        }

        public Criteria andWRemarkNotEqualTo(String value) {
            addCriterion("w_remark <>", value, "wRemark");
            return (Criteria) this;
        }

        public Criteria andWRemarkGreaterThan(String value) {
            addCriterion("w_remark >", value, "wRemark");
            return (Criteria) this;
        }

        public Criteria andWRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("w_remark >=", value, "wRemark");
            return (Criteria) this;
        }

        public Criteria andWRemarkLessThan(String value) {
            addCriterion("w_remark <", value, "wRemark");
            return (Criteria) this;
        }

        public Criteria andWRemarkLessThanOrEqualTo(String value) {
            addCriterion("w_remark <=", value, "wRemark");
            return (Criteria) this;
        }

        public Criteria andWRemarkLike(String value) {
            addCriterion("w_remark like", value, "wRemark");
            return (Criteria) this;
        }

        public Criteria andWRemarkNotLike(String value) {
            addCriterion("w_remark not like", value, "wRemark");
            return (Criteria) this;
        }

        public Criteria andWRemarkIn(List<String> values) {
            addCriterion("w_remark in", values, "wRemark");
            return (Criteria) this;
        }

        public Criteria andWRemarkNotIn(List<String> values) {
            addCriterion("w_remark not in", values, "wRemark");
            return (Criteria) this;
        }

        public Criteria andWRemarkBetween(String value1, String value2) {
            addCriterion("w_remark between", value1, value2, "wRemark");
            return (Criteria) this;
        }

        public Criteria andWRemarkNotBetween(String value1, String value2) {
            addCriterion("w_remark not between", value1, value2, "wRemark");
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