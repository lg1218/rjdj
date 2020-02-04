package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class KehuAddressDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KehuAddressDetailsExample() {
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

        public Criteria andKudDSadIdIsNull() {
            addCriterion("kud_d_sad_id is null");
            return (Criteria) this;
        }

        public Criteria andKudDSadIdIsNotNull() {
            addCriterion("kud_d_sad_id is not null");
            return (Criteria) this;
        }

        public Criteria andKudDSadIdEqualTo(Integer value) {
            addCriterion("kud_d_sad_id =", value, "kudDSadId");
            return (Criteria) this;
        }

        public Criteria andKudDSadIdNotEqualTo(Integer value) {
            addCriterion("kud_d_sad_id <>", value, "kudDSadId");
            return (Criteria) this;
        }

        public Criteria andKudDSadIdGreaterThan(Integer value) {
            addCriterion("kud_d_sad_id >", value, "kudDSadId");
            return (Criteria) this;
        }

        public Criteria andKudDSadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kud_d_sad_id >=", value, "kudDSadId");
            return (Criteria) this;
        }

        public Criteria andKudDSadIdLessThan(Integer value) {
            addCriterion("kud_d_sad_id <", value, "kudDSadId");
            return (Criteria) this;
        }

        public Criteria andKudDSadIdLessThanOrEqualTo(Integer value) {
            addCriterion("kud_d_sad_id <=", value, "kudDSadId");
            return (Criteria) this;
        }

        public Criteria andKudDSadIdIn(List<Integer> values) {
            addCriterion("kud_d_sad_id in", values, "kudDSadId");
            return (Criteria) this;
        }

        public Criteria andKudDSadIdNotIn(List<Integer> values) {
            addCriterion("kud_d_sad_id not in", values, "kudDSadId");
            return (Criteria) this;
        }

        public Criteria andKudDSadIdBetween(Integer value1, Integer value2) {
            addCriterion("kud_d_sad_id between", value1, value2, "kudDSadId");
            return (Criteria) this;
        }

        public Criteria andKudDSadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kud_d_sad_id not between", value1, value2, "kudDSadId");
            return (Criteria) this;
        }

        public Criteria andKudDSmidIsNull() {
            addCriterion("kud_d_smid is null");
            return (Criteria) this;
        }

        public Criteria andKudDSmidIsNotNull() {
            addCriterion("kud_d_smid is not null");
            return (Criteria) this;
        }

        public Criteria andKudDSmidEqualTo(Integer value) {
            addCriterion("kud_d_smid =", value, "kudDSmid");
            return (Criteria) this;
        }

        public Criteria andKudDSmidNotEqualTo(Integer value) {
            addCriterion("kud_d_smid <>", value, "kudDSmid");
            return (Criteria) this;
        }

        public Criteria andKudDSmidGreaterThan(Integer value) {
            addCriterion("kud_d_smid >", value, "kudDSmid");
            return (Criteria) this;
        }

        public Criteria andKudDSmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kud_d_smid >=", value, "kudDSmid");
            return (Criteria) this;
        }

        public Criteria andKudDSmidLessThan(Integer value) {
            addCriterion("kud_d_smid <", value, "kudDSmid");
            return (Criteria) this;
        }

        public Criteria andKudDSmidLessThanOrEqualTo(Integer value) {
            addCriterion("kud_d_smid <=", value, "kudDSmid");
            return (Criteria) this;
        }

        public Criteria andKudDSmidIn(List<Integer> values) {
            addCriterion("kud_d_smid in", values, "kudDSmid");
            return (Criteria) this;
        }

        public Criteria andKudDSmidNotIn(List<Integer> values) {
            addCriterion("kud_d_smid not in", values, "kudDSmid");
            return (Criteria) this;
        }

        public Criteria andKudDSmidBetween(Integer value1, Integer value2) {
            addCriterion("kud_d_smid between", value1, value2, "kudDSmid");
            return (Criteria) this;
        }

        public Criteria andKudDSmidNotBetween(Integer value1, Integer value2) {
            addCriterion("kud_d_smid not between", value1, value2, "kudDSmid");
            return (Criteria) this;
        }

        public Criteria andKudDAddressIsNull() {
            addCriterion("kud_d_address is null");
            return (Criteria) this;
        }

        public Criteria andKudDAddressIsNotNull() {
            addCriterion("kud_d_address is not null");
            return (Criteria) this;
        }

        public Criteria andKudDAddressEqualTo(String value) {
            addCriterion("kud_d_address =", value, "kudDAddress");
            return (Criteria) this;
        }

        public Criteria andKudDAddressNotEqualTo(String value) {
            addCriterion("kud_d_address <>", value, "kudDAddress");
            return (Criteria) this;
        }

        public Criteria andKudDAddressGreaterThan(String value) {
            addCriterion("kud_d_address >", value, "kudDAddress");
            return (Criteria) this;
        }

        public Criteria andKudDAddressGreaterThanOrEqualTo(String value) {
            addCriterion("kud_d_address >=", value, "kudDAddress");
            return (Criteria) this;
        }

        public Criteria andKudDAddressLessThan(String value) {
            addCriterion("kud_d_address <", value, "kudDAddress");
            return (Criteria) this;
        }

        public Criteria andKudDAddressLessThanOrEqualTo(String value) {
            addCriterion("kud_d_address <=", value, "kudDAddress");
            return (Criteria) this;
        }

        public Criteria andKudDAddressLike(String value) {
            addCriterion("kud_d_address like", value, "kudDAddress");
            return (Criteria) this;
        }

        public Criteria andKudDAddressNotLike(String value) {
            addCriterion("kud_d_address not like", value, "kudDAddress");
            return (Criteria) this;
        }

        public Criteria andKudDAddressIn(List<String> values) {
            addCriterion("kud_d_address in", values, "kudDAddress");
            return (Criteria) this;
        }

        public Criteria andKudDAddressNotIn(List<String> values) {
            addCriterion("kud_d_address not in", values, "kudDAddress");
            return (Criteria) this;
        }

        public Criteria andKudDAddressBetween(String value1, String value2) {
            addCriterion("kud_d_address between", value1, value2, "kudDAddress");
            return (Criteria) this;
        }

        public Criteria andKudDAddressNotBetween(String value1, String value2) {
            addCriterion("kud_d_address not between", value1, value2, "kudDAddress");
            return (Criteria) this;
        }

        public Criteria andKudDEmailIsNull() {
            addCriterion("kud_d_email is null");
            return (Criteria) this;
        }

        public Criteria andKudDEmailIsNotNull() {
            addCriterion("kud_d_email is not null");
            return (Criteria) this;
        }

        public Criteria andKudDEmailEqualTo(String value) {
            addCriterion("kud_d_email =", value, "kudDEmail");
            return (Criteria) this;
        }

        public Criteria andKudDEmailNotEqualTo(String value) {
            addCriterion("kud_d_email <>", value, "kudDEmail");
            return (Criteria) this;
        }

        public Criteria andKudDEmailGreaterThan(String value) {
            addCriterion("kud_d_email >", value, "kudDEmail");
            return (Criteria) this;
        }

        public Criteria andKudDEmailGreaterThanOrEqualTo(String value) {
            addCriterion("kud_d_email >=", value, "kudDEmail");
            return (Criteria) this;
        }

        public Criteria andKudDEmailLessThan(String value) {
            addCriterion("kud_d_email <", value, "kudDEmail");
            return (Criteria) this;
        }

        public Criteria andKudDEmailLessThanOrEqualTo(String value) {
            addCriterion("kud_d_email <=", value, "kudDEmail");
            return (Criteria) this;
        }

        public Criteria andKudDEmailLike(String value) {
            addCriterion("kud_d_email like", value, "kudDEmail");
            return (Criteria) this;
        }

        public Criteria andKudDEmailNotLike(String value) {
            addCriterion("kud_d_email not like", value, "kudDEmail");
            return (Criteria) this;
        }

        public Criteria andKudDEmailIn(List<String> values) {
            addCriterion("kud_d_email in", values, "kudDEmail");
            return (Criteria) this;
        }

        public Criteria andKudDEmailNotIn(List<String> values) {
            addCriterion("kud_d_email not in", values, "kudDEmail");
            return (Criteria) this;
        }

        public Criteria andKudDEmailBetween(String value1, String value2) {
            addCriterion("kud_d_email between", value1, value2, "kudDEmail");
            return (Criteria) this;
        }

        public Criteria andKudDEmailNotBetween(String value1, String value2) {
            addCriterion("kud_d_email not between", value1, value2, "kudDEmail");
            return (Criteria) this;
        }

        public Criteria andKudDLxManIsNull() {
            addCriterion("kud_d_lx_man is null");
            return (Criteria) this;
        }

        public Criteria andKudDLxManIsNotNull() {
            addCriterion("kud_d_lx_man is not null");
            return (Criteria) this;
        }

        public Criteria andKudDLxManEqualTo(String value) {
            addCriterion("kud_d_lx_man =", value, "kudDLxMan");
            return (Criteria) this;
        }

        public Criteria andKudDLxManNotEqualTo(String value) {
            addCriterion("kud_d_lx_man <>", value, "kudDLxMan");
            return (Criteria) this;
        }

        public Criteria andKudDLxManGreaterThan(String value) {
            addCriterion("kud_d_lx_man >", value, "kudDLxMan");
            return (Criteria) this;
        }

        public Criteria andKudDLxManGreaterThanOrEqualTo(String value) {
            addCriterion("kud_d_lx_man >=", value, "kudDLxMan");
            return (Criteria) this;
        }

        public Criteria andKudDLxManLessThan(String value) {
            addCriterion("kud_d_lx_man <", value, "kudDLxMan");
            return (Criteria) this;
        }

        public Criteria andKudDLxManLessThanOrEqualTo(String value) {
            addCriterion("kud_d_lx_man <=", value, "kudDLxMan");
            return (Criteria) this;
        }

        public Criteria andKudDLxManLike(String value) {
            addCriterion("kud_d_lx_man like", value, "kudDLxMan");
            return (Criteria) this;
        }

        public Criteria andKudDLxManNotLike(String value) {
            addCriterion("kud_d_lx_man not like", value, "kudDLxMan");
            return (Criteria) this;
        }

        public Criteria andKudDLxManIn(List<String> values) {
            addCriterion("kud_d_lx_man in", values, "kudDLxMan");
            return (Criteria) this;
        }

        public Criteria andKudDLxManNotIn(List<String> values) {
            addCriterion("kud_d_lx_man not in", values, "kudDLxMan");
            return (Criteria) this;
        }

        public Criteria andKudDLxManBetween(String value1, String value2) {
            addCriterion("kud_d_lx_man between", value1, value2, "kudDLxMan");
            return (Criteria) this;
        }

        public Criteria andKudDLxManNotBetween(String value1, String value2) {
            addCriterion("kud_d_lx_man not between", value1, value2, "kudDLxMan");
            return (Criteria) this;
        }

        public Criteria andKudDLxLxIsNull() {
            addCriterion("kud_d_lx_lx is null");
            return (Criteria) this;
        }

        public Criteria andKudDLxLxIsNotNull() {
            addCriterion("kud_d_lx_lx is not null");
            return (Criteria) this;
        }

        public Criteria andKudDLxLxEqualTo(String value) {
            addCriterion("kud_d_lx_lx =", value, "kudDLxLx");
            return (Criteria) this;
        }

        public Criteria andKudDLxLxNotEqualTo(String value) {
            addCriterion("kud_d_lx_lx <>", value, "kudDLxLx");
            return (Criteria) this;
        }

        public Criteria andKudDLxLxGreaterThan(String value) {
            addCriterion("kud_d_lx_lx >", value, "kudDLxLx");
            return (Criteria) this;
        }

        public Criteria andKudDLxLxGreaterThanOrEqualTo(String value) {
            addCriterion("kud_d_lx_lx >=", value, "kudDLxLx");
            return (Criteria) this;
        }

        public Criteria andKudDLxLxLessThan(String value) {
            addCriterion("kud_d_lx_lx <", value, "kudDLxLx");
            return (Criteria) this;
        }

        public Criteria andKudDLxLxLessThanOrEqualTo(String value) {
            addCriterion("kud_d_lx_lx <=", value, "kudDLxLx");
            return (Criteria) this;
        }

        public Criteria andKudDLxLxLike(String value) {
            addCriterion("kud_d_lx_lx like", value, "kudDLxLx");
            return (Criteria) this;
        }

        public Criteria andKudDLxLxNotLike(String value) {
            addCriterion("kud_d_lx_lx not like", value, "kudDLxLx");
            return (Criteria) this;
        }

        public Criteria andKudDLxLxIn(List<String> values) {
            addCriterion("kud_d_lx_lx in", values, "kudDLxLx");
            return (Criteria) this;
        }

        public Criteria andKudDLxLxNotIn(List<String> values) {
            addCriterion("kud_d_lx_lx not in", values, "kudDLxLx");
            return (Criteria) this;
        }

        public Criteria andKudDLxLxBetween(String value1, String value2) {
            addCriterion("kud_d_lx_lx between", value1, value2, "kudDLxLx");
            return (Criteria) this;
        }

        public Criteria andKudDLxLxNotBetween(String value1, String value2) {
            addCriterion("kud_d_lx_lx not between", value1, value2, "kudDLxLx");
            return (Criteria) this;
        }

        public Criteria andKudDLxPhoneIsNull() {
            addCriterion("kud_d_lx_phone is null");
            return (Criteria) this;
        }

        public Criteria andKudDLxPhoneIsNotNull() {
            addCriterion("kud_d_lx_phone is not null");
            return (Criteria) this;
        }

        public Criteria andKudDLxPhoneEqualTo(String value) {
            addCriterion("kud_d_lx_phone =", value, "kudDLxPhone");
            return (Criteria) this;
        }

        public Criteria andKudDLxPhoneNotEqualTo(String value) {
            addCriterion("kud_d_lx_phone <>", value, "kudDLxPhone");
            return (Criteria) this;
        }

        public Criteria andKudDLxPhoneGreaterThan(String value) {
            addCriterion("kud_d_lx_phone >", value, "kudDLxPhone");
            return (Criteria) this;
        }

        public Criteria andKudDLxPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("kud_d_lx_phone >=", value, "kudDLxPhone");
            return (Criteria) this;
        }

        public Criteria andKudDLxPhoneLessThan(String value) {
            addCriterion("kud_d_lx_phone <", value, "kudDLxPhone");
            return (Criteria) this;
        }

        public Criteria andKudDLxPhoneLessThanOrEqualTo(String value) {
            addCriterion("kud_d_lx_phone <=", value, "kudDLxPhone");
            return (Criteria) this;
        }

        public Criteria andKudDLxPhoneLike(String value) {
            addCriterion("kud_d_lx_phone like", value, "kudDLxPhone");
            return (Criteria) this;
        }

        public Criteria andKudDLxPhoneNotLike(String value) {
            addCriterion("kud_d_lx_phone not like", value, "kudDLxPhone");
            return (Criteria) this;
        }

        public Criteria andKudDLxPhoneIn(List<String> values) {
            addCriterion("kud_d_lx_phone in", values, "kudDLxPhone");
            return (Criteria) this;
        }

        public Criteria andKudDLxPhoneNotIn(List<String> values) {
            addCriterion("kud_d_lx_phone not in", values, "kudDLxPhone");
            return (Criteria) this;
        }

        public Criteria andKudDLxPhoneBetween(String value1, String value2) {
            addCriterion("kud_d_lx_phone between", value1, value2, "kudDLxPhone");
            return (Criteria) this;
        }

        public Criteria andKudDLxPhoneNotBetween(String value1, String value2) {
            addCriterion("kud_d_lx_phone not between", value1, value2, "kudDLxPhone");
            return (Criteria) this;
        }

        public Criteria andKudDCzNumIsNull() {
            addCriterion("kud_d_cz_num is null");
            return (Criteria) this;
        }

        public Criteria andKudDCzNumIsNotNull() {
            addCriterion("kud_d_cz_num is not null");
            return (Criteria) this;
        }

        public Criteria andKudDCzNumEqualTo(String value) {
            addCriterion("kud_d_cz_num =", value, "kudDCzNum");
            return (Criteria) this;
        }

        public Criteria andKudDCzNumNotEqualTo(String value) {
            addCriterion("kud_d_cz_num <>", value, "kudDCzNum");
            return (Criteria) this;
        }

        public Criteria andKudDCzNumGreaterThan(String value) {
            addCriterion("kud_d_cz_num >", value, "kudDCzNum");
            return (Criteria) this;
        }

        public Criteria andKudDCzNumGreaterThanOrEqualTo(String value) {
            addCriterion("kud_d_cz_num >=", value, "kudDCzNum");
            return (Criteria) this;
        }

        public Criteria andKudDCzNumLessThan(String value) {
            addCriterion("kud_d_cz_num <", value, "kudDCzNum");
            return (Criteria) this;
        }

        public Criteria andKudDCzNumLessThanOrEqualTo(String value) {
            addCriterion("kud_d_cz_num <=", value, "kudDCzNum");
            return (Criteria) this;
        }

        public Criteria andKudDCzNumLike(String value) {
            addCriterion("kud_d_cz_num like", value, "kudDCzNum");
            return (Criteria) this;
        }

        public Criteria andKudDCzNumNotLike(String value) {
            addCriterion("kud_d_cz_num not like", value, "kudDCzNum");
            return (Criteria) this;
        }

        public Criteria andKudDCzNumIn(List<String> values) {
            addCriterion("kud_d_cz_num in", values, "kudDCzNum");
            return (Criteria) this;
        }

        public Criteria andKudDCzNumNotIn(List<String> values) {
            addCriterion("kud_d_cz_num not in", values, "kudDCzNum");
            return (Criteria) this;
        }

        public Criteria andKudDCzNumBetween(String value1, String value2) {
            addCriterion("kud_d_cz_num between", value1, value2, "kudDCzNum");
            return (Criteria) this;
        }

        public Criteria andKudDCzNumNotBetween(String value1, String value2) {
            addCriterion("kud_d_cz_num not between", value1, value2, "kudDCzNum");
            return (Criteria) this;
        }

        public Criteria andKudDRunwayIsNull() {
            addCriterion("kud_d_runway is null");
            return (Criteria) this;
        }

        public Criteria andKudDRunwayIsNotNull() {
            addCriterion("kud_d_runway is not null");
            return (Criteria) this;
        }

        public Criteria andKudDRunwayEqualTo(String value) {
            addCriterion("kud_d_runway =", value, "kudDRunway");
            return (Criteria) this;
        }

        public Criteria andKudDRunwayNotEqualTo(String value) {
            addCriterion("kud_d_runway <>", value, "kudDRunway");
            return (Criteria) this;
        }

        public Criteria andKudDRunwayGreaterThan(String value) {
            addCriterion("kud_d_runway >", value, "kudDRunway");
            return (Criteria) this;
        }

        public Criteria andKudDRunwayGreaterThanOrEqualTo(String value) {
            addCriterion("kud_d_runway >=", value, "kudDRunway");
            return (Criteria) this;
        }

        public Criteria andKudDRunwayLessThan(String value) {
            addCriterion("kud_d_runway <", value, "kudDRunway");
            return (Criteria) this;
        }

        public Criteria andKudDRunwayLessThanOrEqualTo(String value) {
            addCriterion("kud_d_runway <=", value, "kudDRunway");
            return (Criteria) this;
        }

        public Criteria andKudDRunwayLike(String value) {
            addCriterion("kud_d_runway like", value, "kudDRunway");
            return (Criteria) this;
        }

        public Criteria andKudDRunwayNotLike(String value) {
            addCriterion("kud_d_runway not like", value, "kudDRunway");
            return (Criteria) this;
        }

        public Criteria andKudDRunwayIn(List<String> values) {
            addCriterion("kud_d_runway in", values, "kudDRunway");
            return (Criteria) this;
        }

        public Criteria andKudDRunwayNotIn(List<String> values) {
            addCriterion("kud_d_runway not in", values, "kudDRunway");
            return (Criteria) this;
        }

        public Criteria andKudDRunwayBetween(String value1, String value2) {
            addCriterion("kud_d_runway between", value1, value2, "kudDRunway");
            return (Criteria) this;
        }

        public Criteria andKudDRunwayNotBetween(String value1, String value2) {
            addCriterion("kud_d_runway not between", value1, value2, "kudDRunway");
            return (Criteria) this;
        }

        public Criteria andKudDRemarkIsNull() {
            addCriterion("kud_d_remark is null");
            return (Criteria) this;
        }

        public Criteria andKudDRemarkIsNotNull() {
            addCriterion("kud_d_remark is not null");
            return (Criteria) this;
        }

        public Criteria andKudDRemarkEqualTo(String value) {
            addCriterion("kud_d_remark =", value, "kudDRemark");
            return (Criteria) this;
        }

        public Criteria andKudDRemarkNotEqualTo(String value) {
            addCriterion("kud_d_remark <>", value, "kudDRemark");
            return (Criteria) this;
        }

        public Criteria andKudDRemarkGreaterThan(String value) {
            addCriterion("kud_d_remark >", value, "kudDRemark");
            return (Criteria) this;
        }

        public Criteria andKudDRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("kud_d_remark >=", value, "kudDRemark");
            return (Criteria) this;
        }

        public Criteria andKudDRemarkLessThan(String value) {
            addCriterion("kud_d_remark <", value, "kudDRemark");
            return (Criteria) this;
        }

        public Criteria andKudDRemarkLessThanOrEqualTo(String value) {
            addCriterion("kud_d_remark <=", value, "kudDRemark");
            return (Criteria) this;
        }

        public Criteria andKudDRemarkLike(String value) {
            addCriterion("kud_d_remark like", value, "kudDRemark");
            return (Criteria) this;
        }

        public Criteria andKudDRemarkNotLike(String value) {
            addCriterion("kud_d_remark not like", value, "kudDRemark");
            return (Criteria) this;
        }

        public Criteria andKudDRemarkIn(List<String> values) {
            addCriterion("kud_d_remark in", values, "kudDRemark");
            return (Criteria) this;
        }

        public Criteria andKudDRemarkNotIn(List<String> values) {
            addCriterion("kud_d_remark not in", values, "kudDRemark");
            return (Criteria) this;
        }

        public Criteria andKudDRemarkBetween(String value1, String value2) {
            addCriterion("kud_d_remark between", value1, value2, "kudDRemark");
            return (Criteria) this;
        }

        public Criteria andKudDRemarkNotBetween(String value1, String value2) {
            addCriterion("kud_d_remark not between", value1, value2, "kudDRemark");
            return (Criteria) this;
        }

        public Criteria andKudDBz1IsNull() {
            addCriterion("kud_d_Bz1 is null");
            return (Criteria) this;
        }

        public Criteria andKudDBz1IsNotNull() {
            addCriterion("kud_d_Bz1 is not null");
            return (Criteria) this;
        }

        public Criteria andKudDBz1EqualTo(String value) {
            addCriterion("kud_d_Bz1 =", value, "kudDBz1");
            return (Criteria) this;
        }

        public Criteria andKudDBz1NotEqualTo(String value) {
            addCriterion("kud_d_Bz1 <>", value, "kudDBz1");
            return (Criteria) this;
        }

        public Criteria andKudDBz1GreaterThan(String value) {
            addCriterion("kud_d_Bz1 >", value, "kudDBz1");
            return (Criteria) this;
        }

        public Criteria andKudDBz1GreaterThanOrEqualTo(String value) {
            addCriterion("kud_d_Bz1 >=", value, "kudDBz1");
            return (Criteria) this;
        }

        public Criteria andKudDBz1LessThan(String value) {
            addCriterion("kud_d_Bz1 <", value, "kudDBz1");
            return (Criteria) this;
        }

        public Criteria andKudDBz1LessThanOrEqualTo(String value) {
            addCriterion("kud_d_Bz1 <=", value, "kudDBz1");
            return (Criteria) this;
        }

        public Criteria andKudDBz1Like(String value) {
            addCriterion("kud_d_Bz1 like", value, "kudDBz1");
            return (Criteria) this;
        }

        public Criteria andKudDBz1NotLike(String value) {
            addCriterion("kud_d_Bz1 not like", value, "kudDBz1");
            return (Criteria) this;
        }

        public Criteria andKudDBz1In(List<String> values) {
            addCriterion("kud_d_Bz1 in", values, "kudDBz1");
            return (Criteria) this;
        }

        public Criteria andKudDBz1NotIn(List<String> values) {
            addCriterion("kud_d_Bz1 not in", values, "kudDBz1");
            return (Criteria) this;
        }

        public Criteria andKudDBz1Between(String value1, String value2) {
            addCriterion("kud_d_Bz1 between", value1, value2, "kudDBz1");
            return (Criteria) this;
        }

        public Criteria andKudDBz1NotBetween(String value1, String value2) {
            addCriterion("kud_d_Bz1 not between", value1, value2, "kudDBz1");
            return (Criteria) this;
        }

        public Criteria andKudDBz2IsNull() {
            addCriterion("kud_d_Bz2 is null");
            return (Criteria) this;
        }

        public Criteria andKudDBz2IsNotNull() {
            addCriterion("kud_d_Bz2 is not null");
            return (Criteria) this;
        }

        public Criteria andKudDBz2EqualTo(String value) {
            addCriterion("kud_d_Bz2 =", value, "kudDBz2");
            return (Criteria) this;
        }

        public Criteria andKudDBz2NotEqualTo(String value) {
            addCriterion("kud_d_Bz2 <>", value, "kudDBz2");
            return (Criteria) this;
        }

        public Criteria andKudDBz2GreaterThan(String value) {
            addCriterion("kud_d_Bz2 >", value, "kudDBz2");
            return (Criteria) this;
        }

        public Criteria andKudDBz2GreaterThanOrEqualTo(String value) {
            addCriterion("kud_d_Bz2 >=", value, "kudDBz2");
            return (Criteria) this;
        }

        public Criteria andKudDBz2LessThan(String value) {
            addCriterion("kud_d_Bz2 <", value, "kudDBz2");
            return (Criteria) this;
        }

        public Criteria andKudDBz2LessThanOrEqualTo(String value) {
            addCriterion("kud_d_Bz2 <=", value, "kudDBz2");
            return (Criteria) this;
        }

        public Criteria andKudDBz2Like(String value) {
            addCriterion("kud_d_Bz2 like", value, "kudDBz2");
            return (Criteria) this;
        }

        public Criteria andKudDBz2NotLike(String value) {
            addCriterion("kud_d_Bz2 not like", value, "kudDBz2");
            return (Criteria) this;
        }

        public Criteria andKudDBz2In(List<String> values) {
            addCriterion("kud_d_Bz2 in", values, "kudDBz2");
            return (Criteria) this;
        }

        public Criteria andKudDBz2NotIn(List<String> values) {
            addCriterion("kud_d_Bz2 not in", values, "kudDBz2");
            return (Criteria) this;
        }

        public Criteria andKudDBz2Between(String value1, String value2) {
            addCriterion("kud_d_Bz2 between", value1, value2, "kudDBz2");
            return (Criteria) this;
        }

        public Criteria andKudDBz2NotBetween(String value1, String value2) {
            addCriterion("kud_d_Bz2 not between", value1, value2, "kudDBz2");
            return (Criteria) this;
        }

        public Criteria andKudDBz3IsNull() {
            addCriterion("kud_d_Bz3 is null");
            return (Criteria) this;
        }

        public Criteria andKudDBz3IsNotNull() {
            addCriterion("kud_d_Bz3 is not null");
            return (Criteria) this;
        }

        public Criteria andKudDBz3EqualTo(String value) {
            addCriterion("kud_d_Bz3 =", value, "kudDBz3");
            return (Criteria) this;
        }

        public Criteria andKudDBz3NotEqualTo(String value) {
            addCriterion("kud_d_Bz3 <>", value, "kudDBz3");
            return (Criteria) this;
        }

        public Criteria andKudDBz3GreaterThan(String value) {
            addCriterion("kud_d_Bz3 >", value, "kudDBz3");
            return (Criteria) this;
        }

        public Criteria andKudDBz3GreaterThanOrEqualTo(String value) {
            addCriterion("kud_d_Bz3 >=", value, "kudDBz3");
            return (Criteria) this;
        }

        public Criteria andKudDBz3LessThan(String value) {
            addCriterion("kud_d_Bz3 <", value, "kudDBz3");
            return (Criteria) this;
        }

        public Criteria andKudDBz3LessThanOrEqualTo(String value) {
            addCriterion("kud_d_Bz3 <=", value, "kudDBz3");
            return (Criteria) this;
        }

        public Criteria andKudDBz3Like(String value) {
            addCriterion("kud_d_Bz3 like", value, "kudDBz3");
            return (Criteria) this;
        }

        public Criteria andKudDBz3NotLike(String value) {
            addCriterion("kud_d_Bz3 not like", value, "kudDBz3");
            return (Criteria) this;
        }

        public Criteria andKudDBz3In(List<String> values) {
            addCriterion("kud_d_Bz3 in", values, "kudDBz3");
            return (Criteria) this;
        }

        public Criteria andKudDBz3NotIn(List<String> values) {
            addCriterion("kud_d_Bz3 not in", values, "kudDBz3");
            return (Criteria) this;
        }

        public Criteria andKudDBz3Between(String value1, String value2) {
            addCriterion("kud_d_Bz3 between", value1, value2, "kudDBz3");
            return (Criteria) this;
        }

        public Criteria andKudDBz3NotBetween(String value1, String value2) {
            addCriterion("kud_d_Bz3 not between", value1, value2, "kudDBz3");
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