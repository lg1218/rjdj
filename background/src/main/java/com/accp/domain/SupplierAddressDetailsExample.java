package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SupplierAddressDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierAddressDetailsExample() {
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

        public Criteria andSadIdIsNull() {
            addCriterion("sad_id is null");
            return (Criteria) this;
        }

        public Criteria andSadIdIsNotNull() {
            addCriterion("sad_id is not null");
            return (Criteria) this;
        }

        public Criteria andSadIdEqualTo(Integer value) {
            addCriterion("sad_id =", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdNotEqualTo(Integer value) {
            addCriterion("sad_id <>", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdGreaterThan(Integer value) {
            addCriterion("sad_id >", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sad_id >=", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdLessThan(Integer value) {
            addCriterion("sad_id <", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdLessThanOrEqualTo(Integer value) {
            addCriterion("sad_id <=", value, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdIn(List<Integer> values) {
            addCriterion("sad_id in", values, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdNotIn(List<Integer> values) {
            addCriterion("sad_id not in", values, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdBetween(Integer value1, Integer value2) {
            addCriterion("sad_id between", value1, value2, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sad_id not between", value1, value2, "sadId");
            return (Criteria) this;
        }

        public Criteria andSadSmidIsNull() {
            addCriterion("sad_smid is null");
            return (Criteria) this;
        }

        public Criteria andSadSmidIsNotNull() {
            addCriterion("sad_smid is not null");
            return (Criteria) this;
        }

        public Criteria andSadSmidEqualTo(Integer value) {
            addCriterion("sad_smid =", value, "sadSmid");
            return (Criteria) this;
        }

        public Criteria andSadSmidNotEqualTo(Integer value) {
            addCriterion("sad_smid <>", value, "sadSmid");
            return (Criteria) this;
        }

        public Criteria andSadSmidGreaterThan(Integer value) {
            addCriterion("sad_smid >", value, "sadSmid");
            return (Criteria) this;
        }

        public Criteria andSadSmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sad_smid >=", value, "sadSmid");
            return (Criteria) this;
        }

        public Criteria andSadSmidLessThan(Integer value) {
            addCriterion("sad_smid <", value, "sadSmid");
            return (Criteria) this;
        }

        public Criteria andSadSmidLessThanOrEqualTo(Integer value) {
            addCriterion("sad_smid <=", value, "sadSmid");
            return (Criteria) this;
        }

        public Criteria andSadSmidIn(List<Integer> values) {
            addCriterion("sad_smid in", values, "sadSmid");
            return (Criteria) this;
        }

        public Criteria andSadSmidNotIn(List<Integer> values) {
            addCriterion("sad_smid not in", values, "sadSmid");
            return (Criteria) this;
        }

        public Criteria andSadSmidBetween(Integer value1, Integer value2) {
            addCriterion("sad_smid between", value1, value2, "sadSmid");
            return (Criteria) this;
        }

        public Criteria andSadSmidNotBetween(Integer value1, Integer value2) {
            addCriterion("sad_smid not between", value1, value2, "sadSmid");
            return (Criteria) this;
        }

        public Criteria andSadAddressIsNull() {
            addCriterion("sad_address is null");
            return (Criteria) this;
        }

        public Criteria andSadAddressIsNotNull() {
            addCriterion("sad_address is not null");
            return (Criteria) this;
        }

        public Criteria andSadAddressEqualTo(String value) {
            addCriterion("sad_address =", value, "sadAddress");
            return (Criteria) this;
        }

        public Criteria andSadAddressNotEqualTo(String value) {
            addCriterion("sad_address <>", value, "sadAddress");
            return (Criteria) this;
        }

        public Criteria andSadAddressGreaterThan(String value) {
            addCriterion("sad_address >", value, "sadAddress");
            return (Criteria) this;
        }

        public Criteria andSadAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sad_address >=", value, "sadAddress");
            return (Criteria) this;
        }

        public Criteria andSadAddressLessThan(String value) {
            addCriterion("sad_address <", value, "sadAddress");
            return (Criteria) this;
        }

        public Criteria andSadAddressLessThanOrEqualTo(String value) {
            addCriterion("sad_address <=", value, "sadAddress");
            return (Criteria) this;
        }

        public Criteria andSadAddressLike(String value) {
            addCriterion("sad_address like", value, "sadAddress");
            return (Criteria) this;
        }

        public Criteria andSadAddressNotLike(String value) {
            addCriterion("sad_address not like", value, "sadAddress");
            return (Criteria) this;
        }

        public Criteria andSadAddressIn(List<String> values) {
            addCriterion("sad_address in", values, "sadAddress");
            return (Criteria) this;
        }

        public Criteria andSadAddressNotIn(List<String> values) {
            addCriterion("sad_address not in", values, "sadAddress");
            return (Criteria) this;
        }

        public Criteria andSadAddressBetween(String value1, String value2) {
            addCriterion("sad_address between", value1, value2, "sadAddress");
            return (Criteria) this;
        }

        public Criteria andSadAddressNotBetween(String value1, String value2) {
            addCriterion("sad_address not between", value1, value2, "sadAddress");
            return (Criteria) this;
        }

        public Criteria andSadEmailIsNull() {
            addCriterion("sad_email is null");
            return (Criteria) this;
        }

        public Criteria andSadEmailIsNotNull() {
            addCriterion("sad_email is not null");
            return (Criteria) this;
        }

        public Criteria andSadEmailEqualTo(String value) {
            addCriterion("sad_email =", value, "sadEmail");
            return (Criteria) this;
        }

        public Criteria andSadEmailNotEqualTo(String value) {
            addCriterion("sad_email <>", value, "sadEmail");
            return (Criteria) this;
        }

        public Criteria andSadEmailGreaterThan(String value) {
            addCriterion("sad_email >", value, "sadEmail");
            return (Criteria) this;
        }

        public Criteria andSadEmailGreaterThanOrEqualTo(String value) {
            addCriterion("sad_email >=", value, "sadEmail");
            return (Criteria) this;
        }

        public Criteria andSadEmailLessThan(String value) {
            addCriterion("sad_email <", value, "sadEmail");
            return (Criteria) this;
        }

        public Criteria andSadEmailLessThanOrEqualTo(String value) {
            addCriterion("sad_email <=", value, "sadEmail");
            return (Criteria) this;
        }

        public Criteria andSadEmailLike(String value) {
            addCriterion("sad_email like", value, "sadEmail");
            return (Criteria) this;
        }

        public Criteria andSadEmailNotLike(String value) {
            addCriterion("sad_email not like", value, "sadEmail");
            return (Criteria) this;
        }

        public Criteria andSadEmailIn(List<String> values) {
            addCriterion("sad_email in", values, "sadEmail");
            return (Criteria) this;
        }

        public Criteria andSadEmailNotIn(List<String> values) {
            addCriterion("sad_email not in", values, "sadEmail");
            return (Criteria) this;
        }

        public Criteria andSadEmailBetween(String value1, String value2) {
            addCriterion("sad_email between", value1, value2, "sadEmail");
            return (Criteria) this;
        }

        public Criteria andSadEmailNotBetween(String value1, String value2) {
            addCriterion("sad_email not between", value1, value2, "sadEmail");
            return (Criteria) this;
        }

        public Criteria andSadLxManIsNull() {
            addCriterion("sad_lx_man is null");
            return (Criteria) this;
        }

        public Criteria andSadLxManIsNotNull() {
            addCriterion("sad_lx_man is not null");
            return (Criteria) this;
        }

        public Criteria andSadLxManEqualTo(String value) {
            addCriterion("sad_lx_man =", value, "sadLxMan");
            return (Criteria) this;
        }

        public Criteria andSadLxManNotEqualTo(String value) {
            addCriterion("sad_lx_man <>", value, "sadLxMan");
            return (Criteria) this;
        }

        public Criteria andSadLxManGreaterThan(String value) {
            addCriterion("sad_lx_man >", value, "sadLxMan");
            return (Criteria) this;
        }

        public Criteria andSadLxManGreaterThanOrEqualTo(String value) {
            addCriterion("sad_lx_man >=", value, "sadLxMan");
            return (Criteria) this;
        }

        public Criteria andSadLxManLessThan(String value) {
            addCriterion("sad_lx_man <", value, "sadLxMan");
            return (Criteria) this;
        }

        public Criteria andSadLxManLessThanOrEqualTo(String value) {
            addCriterion("sad_lx_man <=", value, "sadLxMan");
            return (Criteria) this;
        }

        public Criteria andSadLxManLike(String value) {
            addCriterion("sad_lx_man like", value, "sadLxMan");
            return (Criteria) this;
        }

        public Criteria andSadLxManNotLike(String value) {
            addCriterion("sad_lx_man not like", value, "sadLxMan");
            return (Criteria) this;
        }

        public Criteria andSadLxManIn(List<String> values) {
            addCriterion("sad_lx_man in", values, "sadLxMan");
            return (Criteria) this;
        }

        public Criteria andSadLxManNotIn(List<String> values) {
            addCriterion("sad_lx_man not in", values, "sadLxMan");
            return (Criteria) this;
        }

        public Criteria andSadLxManBetween(String value1, String value2) {
            addCriterion("sad_lx_man between", value1, value2, "sadLxMan");
            return (Criteria) this;
        }

        public Criteria andSadLxManNotBetween(String value1, String value2) {
            addCriterion("sad_lx_man not between", value1, value2, "sadLxMan");
            return (Criteria) this;
        }

        public Criteria andSadLxLxIsNull() {
            addCriterion("sad_lx_lx is null");
            return (Criteria) this;
        }

        public Criteria andSadLxLxIsNotNull() {
            addCriterion("sad_lx_lx is not null");
            return (Criteria) this;
        }

        public Criteria andSadLxLxEqualTo(String value) {
            addCriterion("sad_lx_lx =", value, "sadLxLx");
            return (Criteria) this;
        }

        public Criteria andSadLxLxNotEqualTo(String value) {
            addCriterion("sad_lx_lx <>", value, "sadLxLx");
            return (Criteria) this;
        }

        public Criteria andSadLxLxGreaterThan(String value) {
            addCriterion("sad_lx_lx >", value, "sadLxLx");
            return (Criteria) this;
        }

        public Criteria andSadLxLxGreaterThanOrEqualTo(String value) {
            addCriterion("sad_lx_lx >=", value, "sadLxLx");
            return (Criteria) this;
        }

        public Criteria andSadLxLxLessThan(String value) {
            addCriterion("sad_lx_lx <", value, "sadLxLx");
            return (Criteria) this;
        }

        public Criteria andSadLxLxLessThanOrEqualTo(String value) {
            addCriterion("sad_lx_lx <=", value, "sadLxLx");
            return (Criteria) this;
        }

        public Criteria andSadLxLxLike(String value) {
            addCriterion("sad_lx_lx like", value, "sadLxLx");
            return (Criteria) this;
        }

        public Criteria andSadLxLxNotLike(String value) {
            addCriterion("sad_lx_lx not like", value, "sadLxLx");
            return (Criteria) this;
        }

        public Criteria andSadLxLxIn(List<String> values) {
            addCriterion("sad_lx_lx in", values, "sadLxLx");
            return (Criteria) this;
        }

        public Criteria andSadLxLxNotIn(List<String> values) {
            addCriterion("sad_lx_lx not in", values, "sadLxLx");
            return (Criteria) this;
        }

        public Criteria andSadLxLxBetween(String value1, String value2) {
            addCriterion("sad_lx_lx between", value1, value2, "sadLxLx");
            return (Criteria) this;
        }

        public Criteria andSadLxLxNotBetween(String value1, String value2) {
            addCriterion("sad_lx_lx not between", value1, value2, "sadLxLx");
            return (Criteria) this;
        }

        public Criteria andSadLxPhoneIsNull() {
            addCriterion("sad_lx_phone is null");
            return (Criteria) this;
        }

        public Criteria andSadLxPhoneIsNotNull() {
            addCriterion("sad_lx_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSadLxPhoneEqualTo(String value) {
            addCriterion("sad_lx_phone =", value, "sadLxPhone");
            return (Criteria) this;
        }

        public Criteria andSadLxPhoneNotEqualTo(String value) {
            addCriterion("sad_lx_phone <>", value, "sadLxPhone");
            return (Criteria) this;
        }

        public Criteria andSadLxPhoneGreaterThan(String value) {
            addCriterion("sad_lx_phone >", value, "sadLxPhone");
            return (Criteria) this;
        }

        public Criteria andSadLxPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("sad_lx_phone >=", value, "sadLxPhone");
            return (Criteria) this;
        }

        public Criteria andSadLxPhoneLessThan(String value) {
            addCriterion("sad_lx_phone <", value, "sadLxPhone");
            return (Criteria) this;
        }

        public Criteria andSadLxPhoneLessThanOrEqualTo(String value) {
            addCriterion("sad_lx_phone <=", value, "sadLxPhone");
            return (Criteria) this;
        }

        public Criteria andSadLxPhoneLike(String value) {
            addCriterion("sad_lx_phone like", value, "sadLxPhone");
            return (Criteria) this;
        }

        public Criteria andSadLxPhoneNotLike(String value) {
            addCriterion("sad_lx_phone not like", value, "sadLxPhone");
            return (Criteria) this;
        }

        public Criteria andSadLxPhoneIn(List<String> values) {
            addCriterion("sad_lx_phone in", values, "sadLxPhone");
            return (Criteria) this;
        }

        public Criteria andSadLxPhoneNotIn(List<String> values) {
            addCriterion("sad_lx_phone not in", values, "sadLxPhone");
            return (Criteria) this;
        }

        public Criteria andSadLxPhoneBetween(String value1, String value2) {
            addCriterion("sad_lx_phone between", value1, value2, "sadLxPhone");
            return (Criteria) this;
        }

        public Criteria andSadLxPhoneNotBetween(String value1, String value2) {
            addCriterion("sad_lx_phone not between", value1, value2, "sadLxPhone");
            return (Criteria) this;
        }

        public Criteria andSadCzNumIsNull() {
            addCriterion("sad_cz_num is null");
            return (Criteria) this;
        }

        public Criteria andSadCzNumIsNotNull() {
            addCriterion("sad_cz_num is not null");
            return (Criteria) this;
        }

        public Criteria andSadCzNumEqualTo(String value) {
            addCriterion("sad_cz_num =", value, "sadCzNum");
            return (Criteria) this;
        }

        public Criteria andSadCzNumNotEqualTo(String value) {
            addCriterion("sad_cz_num <>", value, "sadCzNum");
            return (Criteria) this;
        }

        public Criteria andSadCzNumGreaterThan(String value) {
            addCriterion("sad_cz_num >", value, "sadCzNum");
            return (Criteria) this;
        }

        public Criteria andSadCzNumGreaterThanOrEqualTo(String value) {
            addCriterion("sad_cz_num >=", value, "sadCzNum");
            return (Criteria) this;
        }

        public Criteria andSadCzNumLessThan(String value) {
            addCriterion("sad_cz_num <", value, "sadCzNum");
            return (Criteria) this;
        }

        public Criteria andSadCzNumLessThanOrEqualTo(String value) {
            addCriterion("sad_cz_num <=", value, "sadCzNum");
            return (Criteria) this;
        }

        public Criteria andSadCzNumLike(String value) {
            addCriterion("sad_cz_num like", value, "sadCzNum");
            return (Criteria) this;
        }

        public Criteria andSadCzNumNotLike(String value) {
            addCriterion("sad_cz_num not like", value, "sadCzNum");
            return (Criteria) this;
        }

        public Criteria andSadCzNumIn(List<String> values) {
            addCriterion("sad_cz_num in", values, "sadCzNum");
            return (Criteria) this;
        }

        public Criteria andSadCzNumNotIn(List<String> values) {
            addCriterion("sad_cz_num not in", values, "sadCzNum");
            return (Criteria) this;
        }

        public Criteria andSadCzNumBetween(String value1, String value2) {
            addCriterion("sad_cz_num between", value1, value2, "sadCzNum");
            return (Criteria) this;
        }

        public Criteria andSadCzNumNotBetween(String value1, String value2) {
            addCriterion("sad_cz_num not between", value1, value2, "sadCzNum");
            return (Criteria) this;
        }

        public Criteria andSadRunwayIsNull() {
            addCriterion("sad_runway is null");
            return (Criteria) this;
        }

        public Criteria andSadRunwayIsNotNull() {
            addCriterion("sad_runway is not null");
            return (Criteria) this;
        }

        public Criteria andSadRunwayEqualTo(String value) {
            addCriterion("sad_runway =", value, "sadRunway");
            return (Criteria) this;
        }

        public Criteria andSadRunwayNotEqualTo(String value) {
            addCriterion("sad_runway <>", value, "sadRunway");
            return (Criteria) this;
        }

        public Criteria andSadRunwayGreaterThan(String value) {
            addCriterion("sad_runway >", value, "sadRunway");
            return (Criteria) this;
        }

        public Criteria andSadRunwayGreaterThanOrEqualTo(String value) {
            addCriterion("sad_runway >=", value, "sadRunway");
            return (Criteria) this;
        }

        public Criteria andSadRunwayLessThan(String value) {
            addCriterion("sad_runway <", value, "sadRunway");
            return (Criteria) this;
        }

        public Criteria andSadRunwayLessThanOrEqualTo(String value) {
            addCriterion("sad_runway <=", value, "sadRunway");
            return (Criteria) this;
        }

        public Criteria andSadRunwayLike(String value) {
            addCriterion("sad_runway like", value, "sadRunway");
            return (Criteria) this;
        }

        public Criteria andSadRunwayNotLike(String value) {
            addCriterion("sad_runway not like", value, "sadRunway");
            return (Criteria) this;
        }

        public Criteria andSadRunwayIn(List<String> values) {
            addCriterion("sad_runway in", values, "sadRunway");
            return (Criteria) this;
        }

        public Criteria andSadRunwayNotIn(List<String> values) {
            addCriterion("sad_runway not in", values, "sadRunway");
            return (Criteria) this;
        }

        public Criteria andSadRunwayBetween(String value1, String value2) {
            addCriterion("sad_runway between", value1, value2, "sadRunway");
            return (Criteria) this;
        }

        public Criteria andSadRunwayNotBetween(String value1, String value2) {
            addCriterion("sad_runway not between", value1, value2, "sadRunway");
            return (Criteria) this;
        }

        public Criteria andSadRemarkIsNull() {
            addCriterion("sad_remark is null");
            return (Criteria) this;
        }

        public Criteria andSadRemarkIsNotNull() {
            addCriterion("sad_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSadRemarkEqualTo(String value) {
            addCriterion("sad_remark =", value, "sadRemark");
            return (Criteria) this;
        }

        public Criteria andSadRemarkNotEqualTo(String value) {
            addCriterion("sad_remark <>", value, "sadRemark");
            return (Criteria) this;
        }

        public Criteria andSadRemarkGreaterThan(String value) {
            addCriterion("sad_remark >", value, "sadRemark");
            return (Criteria) this;
        }

        public Criteria andSadRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sad_remark >=", value, "sadRemark");
            return (Criteria) this;
        }

        public Criteria andSadRemarkLessThan(String value) {
            addCriterion("sad_remark <", value, "sadRemark");
            return (Criteria) this;
        }

        public Criteria andSadRemarkLessThanOrEqualTo(String value) {
            addCriterion("sad_remark <=", value, "sadRemark");
            return (Criteria) this;
        }

        public Criteria andSadRemarkLike(String value) {
            addCriterion("sad_remark like", value, "sadRemark");
            return (Criteria) this;
        }

        public Criteria andSadRemarkNotLike(String value) {
            addCriterion("sad_remark not like", value, "sadRemark");
            return (Criteria) this;
        }

        public Criteria andSadRemarkIn(List<String> values) {
            addCriterion("sad_remark in", values, "sadRemark");
            return (Criteria) this;
        }

        public Criteria andSadRemarkNotIn(List<String> values) {
            addCriterion("sad_remark not in", values, "sadRemark");
            return (Criteria) this;
        }

        public Criteria andSadRemarkBetween(String value1, String value2) {
            addCriterion("sad_remark between", value1, value2, "sadRemark");
            return (Criteria) this;
        }

        public Criteria andSadRemarkNotBetween(String value1, String value2) {
            addCriterion("sad_remark not between", value1, value2, "sadRemark");
            return (Criteria) this;
        }

        public Criteria andSadBz1IsNull() {
            addCriterion("sad_bz1 is null");
            return (Criteria) this;
        }

        public Criteria andSadBz1IsNotNull() {
            addCriterion("sad_bz1 is not null");
            return (Criteria) this;
        }

        public Criteria andSadBz1EqualTo(String value) {
            addCriterion("sad_bz1 =", value, "sadBz1");
            return (Criteria) this;
        }

        public Criteria andSadBz1NotEqualTo(String value) {
            addCriterion("sad_bz1 <>", value, "sadBz1");
            return (Criteria) this;
        }

        public Criteria andSadBz1GreaterThan(String value) {
            addCriterion("sad_bz1 >", value, "sadBz1");
            return (Criteria) this;
        }

        public Criteria andSadBz1GreaterThanOrEqualTo(String value) {
            addCriterion("sad_bz1 >=", value, "sadBz1");
            return (Criteria) this;
        }

        public Criteria andSadBz1LessThan(String value) {
            addCriterion("sad_bz1 <", value, "sadBz1");
            return (Criteria) this;
        }

        public Criteria andSadBz1LessThanOrEqualTo(String value) {
            addCriterion("sad_bz1 <=", value, "sadBz1");
            return (Criteria) this;
        }

        public Criteria andSadBz1Like(String value) {
            addCriterion("sad_bz1 like", value, "sadBz1");
            return (Criteria) this;
        }

        public Criteria andSadBz1NotLike(String value) {
            addCriterion("sad_bz1 not like", value, "sadBz1");
            return (Criteria) this;
        }

        public Criteria andSadBz1In(List<String> values) {
            addCriterion("sad_bz1 in", values, "sadBz1");
            return (Criteria) this;
        }

        public Criteria andSadBz1NotIn(List<String> values) {
            addCriterion("sad_bz1 not in", values, "sadBz1");
            return (Criteria) this;
        }

        public Criteria andSadBz1Between(String value1, String value2) {
            addCriterion("sad_bz1 between", value1, value2, "sadBz1");
            return (Criteria) this;
        }

        public Criteria andSadBz1NotBetween(String value1, String value2) {
            addCriterion("sad_bz1 not between", value1, value2, "sadBz1");
            return (Criteria) this;
        }

        public Criteria andSadBz2IsNull() {
            addCriterion("sad_bz2 is null");
            return (Criteria) this;
        }

        public Criteria andSadBz2IsNotNull() {
            addCriterion("sad_bz2 is not null");
            return (Criteria) this;
        }

        public Criteria andSadBz2EqualTo(String value) {
            addCriterion("sad_bz2 =", value, "sadBz2");
            return (Criteria) this;
        }

        public Criteria andSadBz2NotEqualTo(String value) {
            addCriterion("sad_bz2 <>", value, "sadBz2");
            return (Criteria) this;
        }

        public Criteria andSadBz2GreaterThan(String value) {
            addCriterion("sad_bz2 >", value, "sadBz2");
            return (Criteria) this;
        }

        public Criteria andSadBz2GreaterThanOrEqualTo(String value) {
            addCriterion("sad_bz2 >=", value, "sadBz2");
            return (Criteria) this;
        }

        public Criteria andSadBz2LessThan(String value) {
            addCriterion("sad_bz2 <", value, "sadBz2");
            return (Criteria) this;
        }

        public Criteria andSadBz2LessThanOrEqualTo(String value) {
            addCriterion("sad_bz2 <=", value, "sadBz2");
            return (Criteria) this;
        }

        public Criteria andSadBz2Like(String value) {
            addCriterion("sad_bz2 like", value, "sadBz2");
            return (Criteria) this;
        }

        public Criteria andSadBz2NotLike(String value) {
            addCriterion("sad_bz2 not like", value, "sadBz2");
            return (Criteria) this;
        }

        public Criteria andSadBz2In(List<String> values) {
            addCriterion("sad_bz2 in", values, "sadBz2");
            return (Criteria) this;
        }

        public Criteria andSadBz2NotIn(List<String> values) {
            addCriterion("sad_bz2 not in", values, "sadBz2");
            return (Criteria) this;
        }

        public Criteria andSadBz2Between(String value1, String value2) {
            addCriterion("sad_bz2 between", value1, value2, "sadBz2");
            return (Criteria) this;
        }

        public Criteria andSadBz2NotBetween(String value1, String value2) {
            addCriterion("sad_bz2 not between", value1, value2, "sadBz2");
            return (Criteria) this;
        }

        public Criteria andSadBz3IsNull() {
            addCriterion("sad_bz3 is null");
            return (Criteria) this;
        }

        public Criteria andSadBz3IsNotNull() {
            addCriterion("sad_bz3 is not null");
            return (Criteria) this;
        }

        public Criteria andSadBz3EqualTo(String value) {
            addCriterion("sad_bz3 =", value, "sadBz3");
            return (Criteria) this;
        }

        public Criteria andSadBz3NotEqualTo(String value) {
            addCriterion("sad_bz3 <>", value, "sadBz3");
            return (Criteria) this;
        }

        public Criteria andSadBz3GreaterThan(String value) {
            addCriterion("sad_bz3 >", value, "sadBz3");
            return (Criteria) this;
        }

        public Criteria andSadBz3GreaterThanOrEqualTo(String value) {
            addCriterion("sad_bz3 >=", value, "sadBz3");
            return (Criteria) this;
        }

        public Criteria andSadBz3LessThan(String value) {
            addCriterion("sad_bz3 <", value, "sadBz3");
            return (Criteria) this;
        }

        public Criteria andSadBz3LessThanOrEqualTo(String value) {
            addCriterion("sad_bz3 <=", value, "sadBz3");
            return (Criteria) this;
        }

        public Criteria andSadBz3Like(String value) {
            addCriterion("sad_bz3 like", value, "sadBz3");
            return (Criteria) this;
        }

        public Criteria andSadBz3NotLike(String value) {
            addCriterion("sad_bz3 not like", value, "sadBz3");
            return (Criteria) this;
        }

        public Criteria andSadBz3In(List<String> values) {
            addCriterion("sad_bz3 in", values, "sadBz3");
            return (Criteria) this;
        }

        public Criteria andSadBz3NotIn(List<String> values) {
            addCriterion("sad_bz3 not in", values, "sadBz3");
            return (Criteria) this;
        }

        public Criteria andSadBz3Between(String value1, String value2) {
            addCriterion("sad_bz3 between", value1, value2, "sadBz3");
            return (Criteria) this;
        }

        public Criteria andSadBz3NotBetween(String value1, String value2) {
            addCriterion("sad_bz3 not between", value1, value2, "sadBz3");
            return (Criteria) this;
        }

        public Criteria andSadBz4IsNull() {
            addCriterion("sad_bz4 is null");
            return (Criteria) this;
        }

        public Criteria andSadBz4IsNotNull() {
            addCriterion("sad_bz4 is not null");
            return (Criteria) this;
        }

        public Criteria andSadBz4EqualTo(String value) {
            addCriterion("sad_bz4 =", value, "sadBz4");
            return (Criteria) this;
        }

        public Criteria andSadBz4NotEqualTo(String value) {
            addCriterion("sad_bz4 <>", value, "sadBz4");
            return (Criteria) this;
        }

        public Criteria andSadBz4GreaterThan(String value) {
            addCriterion("sad_bz4 >", value, "sadBz4");
            return (Criteria) this;
        }

        public Criteria andSadBz4GreaterThanOrEqualTo(String value) {
            addCriterion("sad_bz4 >=", value, "sadBz4");
            return (Criteria) this;
        }

        public Criteria andSadBz4LessThan(String value) {
            addCriterion("sad_bz4 <", value, "sadBz4");
            return (Criteria) this;
        }

        public Criteria andSadBz4LessThanOrEqualTo(String value) {
            addCriterion("sad_bz4 <=", value, "sadBz4");
            return (Criteria) this;
        }

        public Criteria andSadBz4Like(String value) {
            addCriterion("sad_bz4 like", value, "sadBz4");
            return (Criteria) this;
        }

        public Criteria andSadBz4NotLike(String value) {
            addCriterion("sad_bz4 not like", value, "sadBz4");
            return (Criteria) this;
        }

        public Criteria andSadBz4In(List<String> values) {
            addCriterion("sad_bz4 in", values, "sadBz4");
            return (Criteria) this;
        }

        public Criteria andSadBz4NotIn(List<String> values) {
            addCriterion("sad_bz4 not in", values, "sadBz4");
            return (Criteria) this;
        }

        public Criteria andSadBz4Between(String value1, String value2) {
            addCriterion("sad_bz4 between", value1, value2, "sadBz4");
            return (Criteria) this;
        }

        public Criteria andSadBz4NotBetween(String value1, String value2) {
            addCriterion("sad_bz4 not between", value1, value2, "sadBz4");
            return (Criteria) this;
        }

        public Criteria andSadBz5IsNull() {
            addCriterion("sad_bz5 is null");
            return (Criteria) this;
        }

        public Criteria andSadBz5IsNotNull() {
            addCriterion("sad_bz5 is not null");
            return (Criteria) this;
        }

        public Criteria andSadBz5EqualTo(String value) {
            addCriterion("sad_bz5 =", value, "sadBz5");
            return (Criteria) this;
        }

        public Criteria andSadBz5NotEqualTo(String value) {
            addCriterion("sad_bz5 <>", value, "sadBz5");
            return (Criteria) this;
        }

        public Criteria andSadBz5GreaterThan(String value) {
            addCriterion("sad_bz5 >", value, "sadBz5");
            return (Criteria) this;
        }

        public Criteria andSadBz5GreaterThanOrEqualTo(String value) {
            addCriterion("sad_bz5 >=", value, "sadBz5");
            return (Criteria) this;
        }

        public Criteria andSadBz5LessThan(String value) {
            addCriterion("sad_bz5 <", value, "sadBz5");
            return (Criteria) this;
        }

        public Criteria andSadBz5LessThanOrEqualTo(String value) {
            addCriterion("sad_bz5 <=", value, "sadBz5");
            return (Criteria) this;
        }

        public Criteria andSadBz5Like(String value) {
            addCriterion("sad_bz5 like", value, "sadBz5");
            return (Criteria) this;
        }

        public Criteria andSadBz5NotLike(String value) {
            addCriterion("sad_bz5 not like", value, "sadBz5");
            return (Criteria) this;
        }

        public Criteria andSadBz5In(List<String> values) {
            addCriterion("sad_bz5 in", values, "sadBz5");
            return (Criteria) this;
        }

        public Criteria andSadBz5NotIn(List<String> values) {
            addCriterion("sad_bz5 not in", values, "sadBz5");
            return (Criteria) this;
        }

        public Criteria andSadBz5Between(String value1, String value2) {
            addCriterion("sad_bz5 between", value1, value2, "sadBz5");
            return (Criteria) this;
        }

        public Criteria andSadBz5NotBetween(String value1, String value2) {
            addCriterion("sad_bz5 not between", value1, value2, "sadBz5");
            return (Criteria) this;
        }

        public Criteria andSadBz6IsNull() {
            addCriterion("sad_bz6 is null");
            return (Criteria) this;
        }

        public Criteria andSadBz6IsNotNull() {
            addCriterion("sad_bz6 is not null");
            return (Criteria) this;
        }

        public Criteria andSadBz6EqualTo(String value) {
            addCriterion("sad_bz6 =", value, "sadBz6");
            return (Criteria) this;
        }

        public Criteria andSadBz6NotEqualTo(String value) {
            addCriterion("sad_bz6 <>", value, "sadBz6");
            return (Criteria) this;
        }

        public Criteria andSadBz6GreaterThan(String value) {
            addCriterion("sad_bz6 >", value, "sadBz6");
            return (Criteria) this;
        }

        public Criteria andSadBz6GreaterThanOrEqualTo(String value) {
            addCriterion("sad_bz6 >=", value, "sadBz6");
            return (Criteria) this;
        }

        public Criteria andSadBz6LessThan(String value) {
            addCriterion("sad_bz6 <", value, "sadBz6");
            return (Criteria) this;
        }

        public Criteria andSadBz6LessThanOrEqualTo(String value) {
            addCriterion("sad_bz6 <=", value, "sadBz6");
            return (Criteria) this;
        }

        public Criteria andSadBz6Like(String value) {
            addCriterion("sad_bz6 like", value, "sadBz6");
            return (Criteria) this;
        }

        public Criteria andSadBz6NotLike(String value) {
            addCriterion("sad_bz6 not like", value, "sadBz6");
            return (Criteria) this;
        }

        public Criteria andSadBz6In(List<String> values) {
            addCriterion("sad_bz6 in", values, "sadBz6");
            return (Criteria) this;
        }

        public Criteria andSadBz6NotIn(List<String> values) {
            addCriterion("sad_bz6 not in", values, "sadBz6");
            return (Criteria) this;
        }

        public Criteria andSadBz6Between(String value1, String value2) {
            addCriterion("sad_bz6 between", value1, value2, "sadBz6");
            return (Criteria) this;
        }

        public Criteria andSadBz6NotBetween(String value1, String value2) {
            addCriterion("sad_bz6 not between", value1, value2, "sadBz6");
            return (Criteria) this;
        }

        public Criteria andSadBz7IsNull() {
            addCriterion("sad_bz7 is null");
            return (Criteria) this;
        }

        public Criteria andSadBz7IsNotNull() {
            addCriterion("sad_bz7 is not null");
            return (Criteria) this;
        }

        public Criteria andSadBz7EqualTo(String value) {
            addCriterion("sad_bz7 =", value, "sadBz7");
            return (Criteria) this;
        }

        public Criteria andSadBz7NotEqualTo(String value) {
            addCriterion("sad_bz7 <>", value, "sadBz7");
            return (Criteria) this;
        }

        public Criteria andSadBz7GreaterThan(String value) {
            addCriterion("sad_bz7 >", value, "sadBz7");
            return (Criteria) this;
        }

        public Criteria andSadBz7GreaterThanOrEqualTo(String value) {
            addCriterion("sad_bz7 >=", value, "sadBz7");
            return (Criteria) this;
        }

        public Criteria andSadBz7LessThan(String value) {
            addCriterion("sad_bz7 <", value, "sadBz7");
            return (Criteria) this;
        }

        public Criteria andSadBz7LessThanOrEqualTo(String value) {
            addCriterion("sad_bz7 <=", value, "sadBz7");
            return (Criteria) this;
        }

        public Criteria andSadBz7Like(String value) {
            addCriterion("sad_bz7 like", value, "sadBz7");
            return (Criteria) this;
        }

        public Criteria andSadBz7NotLike(String value) {
            addCriterion("sad_bz7 not like", value, "sadBz7");
            return (Criteria) this;
        }

        public Criteria andSadBz7In(List<String> values) {
            addCriterion("sad_bz7 in", values, "sadBz7");
            return (Criteria) this;
        }

        public Criteria andSadBz7NotIn(List<String> values) {
            addCriterion("sad_bz7 not in", values, "sadBz7");
            return (Criteria) this;
        }

        public Criteria andSadBz7Between(String value1, String value2) {
            addCriterion("sad_bz7 between", value1, value2, "sadBz7");
            return (Criteria) this;
        }

        public Criteria andSadBz7NotBetween(String value1, String value2) {
            addCriterion("sad_bz7 not between", value1, value2, "sadBz7");
            return (Criteria) this;
        }

        public Criteria andSadBz8IsNull() {
            addCriterion("sad_bz8 is null");
            return (Criteria) this;
        }

        public Criteria andSadBz8IsNotNull() {
            addCriterion("sad_bz8 is not null");
            return (Criteria) this;
        }

        public Criteria andSadBz8EqualTo(String value) {
            addCriterion("sad_bz8 =", value, "sadBz8");
            return (Criteria) this;
        }

        public Criteria andSadBz8NotEqualTo(String value) {
            addCriterion("sad_bz8 <>", value, "sadBz8");
            return (Criteria) this;
        }

        public Criteria andSadBz8GreaterThan(String value) {
            addCriterion("sad_bz8 >", value, "sadBz8");
            return (Criteria) this;
        }

        public Criteria andSadBz8GreaterThanOrEqualTo(String value) {
            addCriterion("sad_bz8 >=", value, "sadBz8");
            return (Criteria) this;
        }

        public Criteria andSadBz8LessThan(String value) {
            addCriterion("sad_bz8 <", value, "sadBz8");
            return (Criteria) this;
        }

        public Criteria andSadBz8LessThanOrEqualTo(String value) {
            addCriterion("sad_bz8 <=", value, "sadBz8");
            return (Criteria) this;
        }

        public Criteria andSadBz8Like(String value) {
            addCriterion("sad_bz8 like", value, "sadBz8");
            return (Criteria) this;
        }

        public Criteria andSadBz8NotLike(String value) {
            addCriterion("sad_bz8 not like", value, "sadBz8");
            return (Criteria) this;
        }

        public Criteria andSadBz8In(List<String> values) {
            addCriterion("sad_bz8 in", values, "sadBz8");
            return (Criteria) this;
        }

        public Criteria andSadBz8NotIn(List<String> values) {
            addCriterion("sad_bz8 not in", values, "sadBz8");
            return (Criteria) this;
        }

        public Criteria andSadBz8Between(String value1, String value2) {
            addCriterion("sad_bz8 between", value1, value2, "sadBz8");
            return (Criteria) this;
        }

        public Criteria andSadBz8NotBetween(String value1, String value2) {
            addCriterion("sad_bz8 not between", value1, value2, "sadBz8");
            return (Criteria) this;
        }

        public Criteria andSadBz9IsNull() {
            addCriterion("sad_bz9 is null");
            return (Criteria) this;
        }

        public Criteria andSadBz9IsNotNull() {
            addCriterion("sad_bz9 is not null");
            return (Criteria) this;
        }

        public Criteria andSadBz9EqualTo(String value) {
            addCriterion("sad_bz9 =", value, "sadBz9");
            return (Criteria) this;
        }

        public Criteria andSadBz9NotEqualTo(String value) {
            addCriterion("sad_bz9 <>", value, "sadBz9");
            return (Criteria) this;
        }

        public Criteria andSadBz9GreaterThan(String value) {
            addCriterion("sad_bz9 >", value, "sadBz9");
            return (Criteria) this;
        }

        public Criteria andSadBz9GreaterThanOrEqualTo(String value) {
            addCriterion("sad_bz9 >=", value, "sadBz9");
            return (Criteria) this;
        }

        public Criteria andSadBz9LessThan(String value) {
            addCriterion("sad_bz9 <", value, "sadBz9");
            return (Criteria) this;
        }

        public Criteria andSadBz9LessThanOrEqualTo(String value) {
            addCriterion("sad_bz9 <=", value, "sadBz9");
            return (Criteria) this;
        }

        public Criteria andSadBz9Like(String value) {
            addCriterion("sad_bz9 like", value, "sadBz9");
            return (Criteria) this;
        }

        public Criteria andSadBz9NotLike(String value) {
            addCriterion("sad_bz9 not like", value, "sadBz9");
            return (Criteria) this;
        }

        public Criteria andSadBz9In(List<String> values) {
            addCriterion("sad_bz9 in", values, "sadBz9");
            return (Criteria) this;
        }

        public Criteria andSadBz9NotIn(List<String> values) {
            addCriterion("sad_bz9 not in", values, "sadBz9");
            return (Criteria) this;
        }

        public Criteria andSadBz9Between(String value1, String value2) {
            addCriterion("sad_bz9 between", value1, value2, "sadBz9");
            return (Criteria) this;
        }

        public Criteria andSadBz9NotBetween(String value1, String value2) {
            addCriterion("sad_bz9 not between", value1, value2, "sadBz9");
            return (Criteria) this;
        }

        public Criteria andSadBz10IsNull() {
            addCriterion("sad_bz10 is null");
            return (Criteria) this;
        }

        public Criteria andSadBz10IsNotNull() {
            addCriterion("sad_bz10 is not null");
            return (Criteria) this;
        }

        public Criteria andSadBz10EqualTo(String value) {
            addCriterion("sad_bz10 =", value, "sadBz10");
            return (Criteria) this;
        }

        public Criteria andSadBz10NotEqualTo(String value) {
            addCriterion("sad_bz10 <>", value, "sadBz10");
            return (Criteria) this;
        }

        public Criteria andSadBz10GreaterThan(String value) {
            addCriterion("sad_bz10 >", value, "sadBz10");
            return (Criteria) this;
        }

        public Criteria andSadBz10GreaterThanOrEqualTo(String value) {
            addCriterion("sad_bz10 >=", value, "sadBz10");
            return (Criteria) this;
        }

        public Criteria andSadBz10LessThan(String value) {
            addCriterion("sad_bz10 <", value, "sadBz10");
            return (Criteria) this;
        }

        public Criteria andSadBz10LessThanOrEqualTo(String value) {
            addCriterion("sad_bz10 <=", value, "sadBz10");
            return (Criteria) this;
        }

        public Criteria andSadBz10Like(String value) {
            addCriterion("sad_bz10 like", value, "sadBz10");
            return (Criteria) this;
        }

        public Criteria andSadBz10NotLike(String value) {
            addCriterion("sad_bz10 not like", value, "sadBz10");
            return (Criteria) this;
        }

        public Criteria andSadBz10In(List<String> values) {
            addCriterion("sad_bz10 in", values, "sadBz10");
            return (Criteria) this;
        }

        public Criteria andSadBz10NotIn(List<String> values) {
            addCriterion("sad_bz10 not in", values, "sadBz10");
            return (Criteria) this;
        }

        public Criteria andSadBz10Between(String value1, String value2) {
            addCriterion("sad_bz10 between", value1, value2, "sadBz10");
            return (Criteria) this;
        }

        public Criteria andSadBz10NotBetween(String value1, String value2) {
            addCriterion("sad_bz10 not between", value1, value2, "sadBz10");
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