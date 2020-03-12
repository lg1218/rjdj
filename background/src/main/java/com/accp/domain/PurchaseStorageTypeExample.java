package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PurchaseStorageTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseStorageTypeExample() {
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

        public Criteria andPstIdIsNull() {
            addCriterion("pst_id is null");
            return (Criteria) this;
        }

        public Criteria andPstIdIsNotNull() {
            addCriterion("pst_id is not null");
            return (Criteria) this;
        }

        public Criteria andPstIdEqualTo(String value) {
            addCriterion("pst_id =", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdNotEqualTo(String value) {
            addCriterion("pst_id <>", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdGreaterThan(String value) {
            addCriterion("pst_id >", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdGreaterThanOrEqualTo(String value) {
            addCriterion("pst_id >=", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdLessThan(String value) {
            addCriterion("pst_id <", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdLessThanOrEqualTo(String value) {
            addCriterion("pst_id <=", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdLike(String value) {
            addCriterion("pst_id like", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdNotLike(String value) {
            addCriterion("pst_id not like", value, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdIn(List<String> values) {
            addCriterion("pst_id in", values, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdNotIn(List<String> values) {
            addCriterion("pst_id not in", values, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdBetween(String value1, String value2) {
            addCriterion("pst_id between", value1, value2, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstIdNotBetween(String value1, String value2) {
            addCriterion("pst_id not between", value1, value2, "pstId");
            return (Criteria) this;
        }

        public Criteria andPstNameIsNull() {
            addCriterion("pst_name is null");
            return (Criteria) this;
        }

        public Criteria andPstNameIsNotNull() {
            addCriterion("pst_name is not null");
            return (Criteria) this;
        }

        public Criteria andPstNameEqualTo(String value) {
            addCriterion("pst_name =", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameNotEqualTo(String value) {
            addCriterion("pst_name <>", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameGreaterThan(String value) {
            addCriterion("pst_name >", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameGreaterThanOrEqualTo(String value) {
            addCriterion("pst_name >=", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameLessThan(String value) {
            addCriterion("pst_name <", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameLessThanOrEqualTo(String value) {
            addCriterion("pst_name <=", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameLike(String value) {
            addCriterion("pst_name like", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameNotLike(String value) {
            addCriterion("pst_name not like", value, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameIn(List<String> values) {
            addCriterion("pst_name in", values, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameNotIn(List<String> values) {
            addCriterion("pst_name not in", values, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameBetween(String value1, String value2) {
            addCriterion("pst_name between", value1, value2, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstNameNotBetween(String value1, String value2) {
            addCriterion("pst_name not between", value1, value2, "pstName");
            return (Criteria) this;
        }

        public Criteria andPstEngnameIsNull() {
            addCriterion("pst_engname is null");
            return (Criteria) this;
        }

        public Criteria andPstEngnameIsNotNull() {
            addCriterion("pst_engname is not null");
            return (Criteria) this;
        }

        public Criteria andPstEngnameEqualTo(String value) {
            addCriterion("pst_engname =", value, "pstEngname");
            return (Criteria) this;
        }

        public Criteria andPstEngnameNotEqualTo(String value) {
            addCriterion("pst_engname <>", value, "pstEngname");
            return (Criteria) this;
        }

        public Criteria andPstEngnameGreaterThan(String value) {
            addCriterion("pst_engname >", value, "pstEngname");
            return (Criteria) this;
        }

        public Criteria andPstEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("pst_engname >=", value, "pstEngname");
            return (Criteria) this;
        }

        public Criteria andPstEngnameLessThan(String value) {
            addCriterion("pst_engname <", value, "pstEngname");
            return (Criteria) this;
        }

        public Criteria andPstEngnameLessThanOrEqualTo(String value) {
            addCriterion("pst_engname <=", value, "pstEngname");
            return (Criteria) this;
        }

        public Criteria andPstEngnameLike(String value) {
            addCriterion("pst_engname like", value, "pstEngname");
            return (Criteria) this;
        }

        public Criteria andPstEngnameNotLike(String value) {
            addCriterion("pst_engname not like", value, "pstEngname");
            return (Criteria) this;
        }

        public Criteria andPstEngnameIn(List<String> values) {
            addCriterion("pst_engname in", values, "pstEngname");
            return (Criteria) this;
        }

        public Criteria andPstEngnameNotIn(List<String> values) {
            addCriterion("pst_engname not in", values, "pstEngname");
            return (Criteria) this;
        }

        public Criteria andPstEngnameBetween(String value1, String value2) {
            addCriterion("pst_engname between", value1, value2, "pstEngname");
            return (Criteria) this;
        }

        public Criteria andPstEngnameNotBetween(String value1, String value2) {
            addCriterion("pst_engname not between", value1, value2, "pstEngname");
            return (Criteria) this;
        }

        public Criteria andPstRemarkIsNull() {
            addCriterion("pst_remark is null");
            return (Criteria) this;
        }

        public Criteria andPstRemarkIsNotNull() {
            addCriterion("pst_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPstRemarkEqualTo(String value) {
            addCriterion("pst_remark =", value, "pstRemark");
            return (Criteria) this;
        }

        public Criteria andPstRemarkNotEqualTo(String value) {
            addCriterion("pst_remark <>", value, "pstRemark");
            return (Criteria) this;
        }

        public Criteria andPstRemarkGreaterThan(String value) {
            addCriterion("pst_remark >", value, "pstRemark");
            return (Criteria) this;
        }

        public Criteria andPstRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pst_remark >=", value, "pstRemark");
            return (Criteria) this;
        }

        public Criteria andPstRemarkLessThan(String value) {
            addCriterion("pst_remark <", value, "pstRemark");
            return (Criteria) this;
        }

        public Criteria andPstRemarkLessThanOrEqualTo(String value) {
            addCriterion("pst_remark <=", value, "pstRemark");
            return (Criteria) this;
        }

        public Criteria andPstRemarkLike(String value) {
            addCriterion("pst_remark like", value, "pstRemark");
            return (Criteria) this;
        }

        public Criteria andPstRemarkNotLike(String value) {
            addCriterion("pst_remark not like", value, "pstRemark");
            return (Criteria) this;
        }

        public Criteria andPstRemarkIn(List<String> values) {
            addCriterion("pst_remark in", values, "pstRemark");
            return (Criteria) this;
        }

        public Criteria andPstRemarkNotIn(List<String> values) {
            addCriterion("pst_remark not in", values, "pstRemark");
            return (Criteria) this;
        }

        public Criteria andPstRemarkBetween(String value1, String value2) {
            addCriterion("pst_remark between", value1, value2, "pstRemark");
            return (Criteria) this;
        }

        public Criteria andPstRemarkNotBetween(String value1, String value2) {
            addCriterion("pst_remark not between", value1, value2, "pstRemark");
            return (Criteria) this;
        }

        public Criteria andPstAuditionIsNull() {
            addCriterion("pst_audition is null");
            return (Criteria) this;
        }

        public Criteria andPstAuditionIsNotNull() {
            addCriterion("pst_audition is not null");
            return (Criteria) this;
        }

        public Criteria andPstAuditionEqualTo(String value) {
            addCriterion("pst_audition =", value, "pstAudition");
            return (Criteria) this;
        }

        public Criteria andPstAuditionNotEqualTo(String value) {
            addCriterion("pst_audition <>", value, "pstAudition");
            return (Criteria) this;
        }

        public Criteria andPstAuditionGreaterThan(String value) {
            addCriterion("pst_audition >", value, "pstAudition");
            return (Criteria) this;
        }

        public Criteria andPstAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("pst_audition >=", value, "pstAudition");
            return (Criteria) this;
        }

        public Criteria andPstAuditionLessThan(String value) {
            addCriterion("pst_audition <", value, "pstAudition");
            return (Criteria) this;
        }

        public Criteria andPstAuditionLessThanOrEqualTo(String value) {
            addCriterion("pst_audition <=", value, "pstAudition");
            return (Criteria) this;
        }

        public Criteria andPstAuditionLike(String value) {
            addCriterion("pst_audition like", value, "pstAudition");
            return (Criteria) this;
        }

        public Criteria andPstAuditionNotLike(String value) {
            addCriterion("pst_audition not like", value, "pstAudition");
            return (Criteria) this;
        }

        public Criteria andPstAuditionIn(List<String> values) {
            addCriterion("pst_audition in", values, "pstAudition");
            return (Criteria) this;
        }

        public Criteria andPstAuditionNotIn(List<String> values) {
            addCriterion("pst_audition not in", values, "pstAudition");
            return (Criteria) this;
        }

        public Criteria andPstAuditionBetween(String value1, String value2) {
            addCriterion("pst_audition between", value1, value2, "pstAudition");
            return (Criteria) this;
        }

        public Criteria andPstAuditionNotBetween(String value1, String value2) {
            addCriterion("pst_audition not between", value1, value2, "pstAudition");
            return (Criteria) this;
        }

        public Criteria andPstYnIsNull() {
            addCriterion("pst_yn is null");
            return (Criteria) this;
        }

        public Criteria andPstYnIsNotNull() {
            addCriterion("pst_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPstYnEqualTo(String value) {
            addCriterion("pst_yn =", value, "pstYn");
            return (Criteria) this;
        }

        public Criteria andPstYnNotEqualTo(String value) {
            addCriterion("pst_yn <>", value, "pstYn");
            return (Criteria) this;
        }

        public Criteria andPstYnGreaterThan(String value) {
            addCriterion("pst_yn >", value, "pstYn");
            return (Criteria) this;
        }

        public Criteria andPstYnGreaterThanOrEqualTo(String value) {
            addCriterion("pst_yn >=", value, "pstYn");
            return (Criteria) this;
        }

        public Criteria andPstYnLessThan(String value) {
            addCriterion("pst_yn <", value, "pstYn");
            return (Criteria) this;
        }

        public Criteria andPstYnLessThanOrEqualTo(String value) {
            addCriterion("pst_yn <=", value, "pstYn");
            return (Criteria) this;
        }

        public Criteria andPstYnLike(String value) {
            addCriterion("pst_yn like", value, "pstYn");
            return (Criteria) this;
        }

        public Criteria andPstYnNotLike(String value) {
            addCriterion("pst_yn not like", value, "pstYn");
            return (Criteria) this;
        }

        public Criteria andPstYnIn(List<String> values) {
            addCriterion("pst_yn in", values, "pstYn");
            return (Criteria) this;
        }

        public Criteria andPstYnNotIn(List<String> values) {
            addCriterion("pst_yn not in", values, "pstYn");
            return (Criteria) this;
        }

        public Criteria andPstYnBetween(String value1, String value2) {
            addCriterion("pst_yn between", value1, value2, "pstYn");
            return (Criteria) this;
        }

        public Criteria andPstYnNotBetween(String value1, String value2) {
            addCriterion("pst_yn not between", value1, value2, "pstYn");
            return (Criteria) this;
        }

        public Criteria andPstCustom1IsNull() {
            addCriterion("pst_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPstCustom1IsNotNull() {
            addCriterion("pst_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPstCustom1EqualTo(String value) {
            addCriterion("pst_custom1 =", value, "pstCustom1");
            return (Criteria) this;
        }

        public Criteria andPstCustom1NotEqualTo(String value) {
            addCriterion("pst_custom1 <>", value, "pstCustom1");
            return (Criteria) this;
        }

        public Criteria andPstCustom1GreaterThan(String value) {
            addCriterion("pst_custom1 >", value, "pstCustom1");
            return (Criteria) this;
        }

        public Criteria andPstCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("pst_custom1 >=", value, "pstCustom1");
            return (Criteria) this;
        }

        public Criteria andPstCustom1LessThan(String value) {
            addCriterion("pst_custom1 <", value, "pstCustom1");
            return (Criteria) this;
        }

        public Criteria andPstCustom1LessThanOrEqualTo(String value) {
            addCriterion("pst_custom1 <=", value, "pstCustom1");
            return (Criteria) this;
        }

        public Criteria andPstCustom1Like(String value) {
            addCriterion("pst_custom1 like", value, "pstCustom1");
            return (Criteria) this;
        }

        public Criteria andPstCustom1NotLike(String value) {
            addCriterion("pst_custom1 not like", value, "pstCustom1");
            return (Criteria) this;
        }

        public Criteria andPstCustom1In(List<String> values) {
            addCriterion("pst_custom1 in", values, "pstCustom1");
            return (Criteria) this;
        }

        public Criteria andPstCustom1NotIn(List<String> values) {
            addCriterion("pst_custom1 not in", values, "pstCustom1");
            return (Criteria) this;
        }

        public Criteria andPstCustom1Between(String value1, String value2) {
            addCriterion("pst_custom1 between", value1, value2, "pstCustom1");
            return (Criteria) this;
        }

        public Criteria andPstCustom1NotBetween(String value1, String value2) {
            addCriterion("pst_custom1 not between", value1, value2, "pstCustom1");
            return (Criteria) this;
        }

        public Criteria andPstCustom2IsNull() {
            addCriterion("pst_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPstCustom2IsNotNull() {
            addCriterion("pst_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPstCustom2EqualTo(String value) {
            addCriterion("pst_custom2 =", value, "pstCustom2");
            return (Criteria) this;
        }

        public Criteria andPstCustom2NotEqualTo(String value) {
            addCriterion("pst_custom2 <>", value, "pstCustom2");
            return (Criteria) this;
        }

        public Criteria andPstCustom2GreaterThan(String value) {
            addCriterion("pst_custom2 >", value, "pstCustom2");
            return (Criteria) this;
        }

        public Criteria andPstCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("pst_custom2 >=", value, "pstCustom2");
            return (Criteria) this;
        }

        public Criteria andPstCustom2LessThan(String value) {
            addCriterion("pst_custom2 <", value, "pstCustom2");
            return (Criteria) this;
        }

        public Criteria andPstCustom2LessThanOrEqualTo(String value) {
            addCriterion("pst_custom2 <=", value, "pstCustom2");
            return (Criteria) this;
        }

        public Criteria andPstCustom2Like(String value) {
            addCriterion("pst_custom2 like", value, "pstCustom2");
            return (Criteria) this;
        }

        public Criteria andPstCustom2NotLike(String value) {
            addCriterion("pst_custom2 not like", value, "pstCustom2");
            return (Criteria) this;
        }

        public Criteria andPstCustom2In(List<String> values) {
            addCriterion("pst_custom2 in", values, "pstCustom2");
            return (Criteria) this;
        }

        public Criteria andPstCustom2NotIn(List<String> values) {
            addCriterion("pst_custom2 not in", values, "pstCustom2");
            return (Criteria) this;
        }

        public Criteria andPstCustom2Between(String value1, String value2) {
            addCriterion("pst_custom2 between", value1, value2, "pstCustom2");
            return (Criteria) this;
        }

        public Criteria andPstCustom2NotBetween(String value1, String value2) {
            addCriterion("pst_custom2 not between", value1, value2, "pstCustom2");
            return (Criteria) this;
        }

        public Criteria andPstCustom3IsNull() {
            addCriterion("pst_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPstCustom3IsNotNull() {
            addCriterion("pst_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPstCustom3EqualTo(String value) {
            addCriterion("pst_custom3 =", value, "pstCustom3");
            return (Criteria) this;
        }

        public Criteria andPstCustom3NotEqualTo(String value) {
            addCriterion("pst_custom3 <>", value, "pstCustom3");
            return (Criteria) this;
        }

        public Criteria andPstCustom3GreaterThan(String value) {
            addCriterion("pst_custom3 >", value, "pstCustom3");
            return (Criteria) this;
        }

        public Criteria andPstCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("pst_custom3 >=", value, "pstCustom3");
            return (Criteria) this;
        }

        public Criteria andPstCustom3LessThan(String value) {
            addCriterion("pst_custom3 <", value, "pstCustom3");
            return (Criteria) this;
        }

        public Criteria andPstCustom3LessThanOrEqualTo(String value) {
            addCriterion("pst_custom3 <=", value, "pstCustom3");
            return (Criteria) this;
        }

        public Criteria andPstCustom3Like(String value) {
            addCriterion("pst_custom3 like", value, "pstCustom3");
            return (Criteria) this;
        }

        public Criteria andPstCustom3NotLike(String value) {
            addCriterion("pst_custom3 not like", value, "pstCustom3");
            return (Criteria) this;
        }

        public Criteria andPstCustom3In(List<String> values) {
            addCriterion("pst_custom3 in", values, "pstCustom3");
            return (Criteria) this;
        }

        public Criteria andPstCustom3NotIn(List<String> values) {
            addCriterion("pst_custom3 not in", values, "pstCustom3");
            return (Criteria) this;
        }

        public Criteria andPstCustom3Between(String value1, String value2) {
            addCriterion("pst_custom3 between", value1, value2, "pstCustom3");
            return (Criteria) this;
        }

        public Criteria andPstCustom3NotBetween(String value1, String value2) {
            addCriterion("pst_custom3 not between", value1, value2, "pstCustom3");
            return (Criteria) this;
        }

        public Criteria andPstCustom4IsNull() {
            addCriterion("pst_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPstCustom4IsNotNull() {
            addCriterion("pst_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPstCustom4EqualTo(String value) {
            addCriterion("pst_custom4 =", value, "pstCustom4");
            return (Criteria) this;
        }

        public Criteria andPstCustom4NotEqualTo(String value) {
            addCriterion("pst_custom4 <>", value, "pstCustom4");
            return (Criteria) this;
        }

        public Criteria andPstCustom4GreaterThan(String value) {
            addCriterion("pst_custom4 >", value, "pstCustom4");
            return (Criteria) this;
        }

        public Criteria andPstCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("pst_custom4 >=", value, "pstCustom4");
            return (Criteria) this;
        }

        public Criteria andPstCustom4LessThan(String value) {
            addCriterion("pst_custom4 <", value, "pstCustom4");
            return (Criteria) this;
        }

        public Criteria andPstCustom4LessThanOrEqualTo(String value) {
            addCriterion("pst_custom4 <=", value, "pstCustom4");
            return (Criteria) this;
        }

        public Criteria andPstCustom4Like(String value) {
            addCriterion("pst_custom4 like", value, "pstCustom4");
            return (Criteria) this;
        }

        public Criteria andPstCustom4NotLike(String value) {
            addCriterion("pst_custom4 not like", value, "pstCustom4");
            return (Criteria) this;
        }

        public Criteria andPstCustom4In(List<String> values) {
            addCriterion("pst_custom4 in", values, "pstCustom4");
            return (Criteria) this;
        }

        public Criteria andPstCustom4NotIn(List<String> values) {
            addCriterion("pst_custom4 not in", values, "pstCustom4");
            return (Criteria) this;
        }

        public Criteria andPstCustom4Between(String value1, String value2) {
            addCriterion("pst_custom4 between", value1, value2, "pstCustom4");
            return (Criteria) this;
        }

        public Criteria andPstCustom4NotBetween(String value1, String value2) {
            addCriterion("pst_custom4 not between", value1, value2, "pstCustom4");
            return (Criteria) this;
        }

        public Criteria andPstCustom5IsNull() {
            addCriterion("pst_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPstCustom5IsNotNull() {
            addCriterion("pst_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPstCustom5EqualTo(String value) {
            addCriterion("pst_custom5 =", value, "pstCustom5");
            return (Criteria) this;
        }

        public Criteria andPstCustom5NotEqualTo(String value) {
            addCriterion("pst_custom5 <>", value, "pstCustom5");
            return (Criteria) this;
        }

        public Criteria andPstCustom5GreaterThan(String value) {
            addCriterion("pst_custom5 >", value, "pstCustom5");
            return (Criteria) this;
        }

        public Criteria andPstCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("pst_custom5 >=", value, "pstCustom5");
            return (Criteria) this;
        }

        public Criteria andPstCustom5LessThan(String value) {
            addCriterion("pst_custom5 <", value, "pstCustom5");
            return (Criteria) this;
        }

        public Criteria andPstCustom5LessThanOrEqualTo(String value) {
            addCriterion("pst_custom5 <=", value, "pstCustom5");
            return (Criteria) this;
        }

        public Criteria andPstCustom5Like(String value) {
            addCriterion("pst_custom5 like", value, "pstCustom5");
            return (Criteria) this;
        }

        public Criteria andPstCustom5NotLike(String value) {
            addCriterion("pst_custom5 not like", value, "pstCustom5");
            return (Criteria) this;
        }

        public Criteria andPstCustom5In(List<String> values) {
            addCriterion("pst_custom5 in", values, "pstCustom5");
            return (Criteria) this;
        }

        public Criteria andPstCustom5NotIn(List<String> values) {
            addCriterion("pst_custom5 not in", values, "pstCustom5");
            return (Criteria) this;
        }

        public Criteria andPstCustom5Between(String value1, String value2) {
            addCriterion("pst_custom5 between", value1, value2, "pstCustom5");
            return (Criteria) this;
        }

        public Criteria andPstCustom5NotBetween(String value1, String value2) {
            addCriterion("pst_custom5 not between", value1, value2, "pstCustom5");
            return (Criteria) this;
        }

        public Criteria andPstCustom6IsNull() {
            addCriterion("pst_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPstCustom6IsNotNull() {
            addCriterion("pst_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPstCustom6EqualTo(String value) {
            addCriterion("pst_custom6 =", value, "pstCustom6");
            return (Criteria) this;
        }

        public Criteria andPstCustom6NotEqualTo(String value) {
            addCriterion("pst_custom6 <>", value, "pstCustom6");
            return (Criteria) this;
        }

        public Criteria andPstCustom6GreaterThan(String value) {
            addCriterion("pst_custom6 >", value, "pstCustom6");
            return (Criteria) this;
        }

        public Criteria andPstCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("pst_custom6 >=", value, "pstCustom6");
            return (Criteria) this;
        }

        public Criteria andPstCustom6LessThan(String value) {
            addCriterion("pst_custom6 <", value, "pstCustom6");
            return (Criteria) this;
        }

        public Criteria andPstCustom6LessThanOrEqualTo(String value) {
            addCriterion("pst_custom6 <=", value, "pstCustom6");
            return (Criteria) this;
        }

        public Criteria andPstCustom6Like(String value) {
            addCriterion("pst_custom6 like", value, "pstCustom6");
            return (Criteria) this;
        }

        public Criteria andPstCustom6NotLike(String value) {
            addCriterion("pst_custom6 not like", value, "pstCustom6");
            return (Criteria) this;
        }

        public Criteria andPstCustom6In(List<String> values) {
            addCriterion("pst_custom6 in", values, "pstCustom6");
            return (Criteria) this;
        }

        public Criteria andPstCustom6NotIn(List<String> values) {
            addCriterion("pst_custom6 not in", values, "pstCustom6");
            return (Criteria) this;
        }

        public Criteria andPstCustom6Between(String value1, String value2) {
            addCriterion("pst_custom6 between", value1, value2, "pstCustom6");
            return (Criteria) this;
        }

        public Criteria andPstCustom6NotBetween(String value1, String value2) {
            addCriterion("pst_custom6 not between", value1, value2, "pstCustom6");
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