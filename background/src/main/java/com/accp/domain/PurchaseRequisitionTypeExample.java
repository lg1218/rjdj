package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PurchaseRequisitionTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseRequisitionTypeExample() {
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

        public Criteria andPrtIdIsNull() {
            addCriterion("prt_id is null");
            return (Criteria) this;
        }

        public Criteria andPrtIdIsNotNull() {
            addCriterion("prt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrtIdEqualTo(String value) {
            addCriterion("prt_id =", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdNotEqualTo(String value) {
            addCriterion("prt_id <>", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdGreaterThan(String value) {
            addCriterion("prt_id >", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdGreaterThanOrEqualTo(String value) {
            addCriterion("prt_id >=", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdLessThan(String value) {
            addCriterion("prt_id <", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdLessThanOrEqualTo(String value) {
            addCriterion("prt_id <=", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdLike(String value) {
            addCriterion("prt_id like", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdNotLike(String value) {
            addCriterion("prt_id not like", value, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdIn(List<String> values) {
            addCriterion("prt_id in", values, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdNotIn(List<String> values) {
            addCriterion("prt_id not in", values, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdBetween(String value1, String value2) {
            addCriterion("prt_id between", value1, value2, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtIdNotBetween(String value1, String value2) {
            addCriterion("prt_id not between", value1, value2, "prtId");
            return (Criteria) this;
        }

        public Criteria andPrtNameIsNull() {
            addCriterion("prt_name is null");
            return (Criteria) this;
        }

        public Criteria andPrtNameIsNotNull() {
            addCriterion("prt_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrtNameEqualTo(String value) {
            addCriterion("prt_name =", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameNotEqualTo(String value) {
            addCriterion("prt_name <>", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameGreaterThan(String value) {
            addCriterion("prt_name >", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameGreaterThanOrEqualTo(String value) {
            addCriterion("prt_name >=", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameLessThan(String value) {
            addCriterion("prt_name <", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameLessThanOrEqualTo(String value) {
            addCriterion("prt_name <=", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameLike(String value) {
            addCriterion("prt_name like", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameNotLike(String value) {
            addCriterion("prt_name not like", value, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameIn(List<String> values) {
            addCriterion("prt_name in", values, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameNotIn(List<String> values) {
            addCriterion("prt_name not in", values, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameBetween(String value1, String value2) {
            addCriterion("prt_name between", value1, value2, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtNameNotBetween(String value1, String value2) {
            addCriterion("prt_name not between", value1, value2, "prtName");
            return (Criteria) this;
        }

        public Criteria andPrtEngnameIsNull() {
            addCriterion("prt_engname is null");
            return (Criteria) this;
        }

        public Criteria andPrtEngnameIsNotNull() {
            addCriterion("prt_engname is not null");
            return (Criteria) this;
        }

        public Criteria andPrtEngnameEqualTo(String value) {
            addCriterion("prt_engname =", value, "prtEngname");
            return (Criteria) this;
        }

        public Criteria andPrtEngnameNotEqualTo(String value) {
            addCriterion("prt_engname <>", value, "prtEngname");
            return (Criteria) this;
        }

        public Criteria andPrtEngnameGreaterThan(String value) {
            addCriterion("prt_engname >", value, "prtEngname");
            return (Criteria) this;
        }

        public Criteria andPrtEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("prt_engname >=", value, "prtEngname");
            return (Criteria) this;
        }

        public Criteria andPrtEngnameLessThan(String value) {
            addCriterion("prt_engname <", value, "prtEngname");
            return (Criteria) this;
        }

        public Criteria andPrtEngnameLessThanOrEqualTo(String value) {
            addCriterion("prt_engname <=", value, "prtEngname");
            return (Criteria) this;
        }

        public Criteria andPrtEngnameLike(String value) {
            addCriterion("prt_engname like", value, "prtEngname");
            return (Criteria) this;
        }

        public Criteria andPrtEngnameNotLike(String value) {
            addCriterion("prt_engname not like", value, "prtEngname");
            return (Criteria) this;
        }

        public Criteria andPrtEngnameIn(List<String> values) {
            addCriterion("prt_engname in", values, "prtEngname");
            return (Criteria) this;
        }

        public Criteria andPrtEngnameNotIn(List<String> values) {
            addCriterion("prt_engname not in", values, "prtEngname");
            return (Criteria) this;
        }

        public Criteria andPrtEngnameBetween(String value1, String value2) {
            addCriterion("prt_engname between", value1, value2, "prtEngname");
            return (Criteria) this;
        }

        public Criteria andPrtEngnameNotBetween(String value1, String value2) {
            addCriterion("prt_engname not between", value1, value2, "prtEngname");
            return (Criteria) this;
        }

        public Criteria andPrtRemarkIsNull() {
            addCriterion("prt_remark is null");
            return (Criteria) this;
        }

        public Criteria andPrtRemarkIsNotNull() {
            addCriterion("prt_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPrtRemarkEqualTo(String value) {
            addCriterion("prt_remark =", value, "prtRemark");
            return (Criteria) this;
        }

        public Criteria andPrtRemarkNotEqualTo(String value) {
            addCriterion("prt_remark <>", value, "prtRemark");
            return (Criteria) this;
        }

        public Criteria andPrtRemarkGreaterThan(String value) {
            addCriterion("prt_remark >", value, "prtRemark");
            return (Criteria) this;
        }

        public Criteria andPrtRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("prt_remark >=", value, "prtRemark");
            return (Criteria) this;
        }

        public Criteria andPrtRemarkLessThan(String value) {
            addCriterion("prt_remark <", value, "prtRemark");
            return (Criteria) this;
        }

        public Criteria andPrtRemarkLessThanOrEqualTo(String value) {
            addCriterion("prt_remark <=", value, "prtRemark");
            return (Criteria) this;
        }

        public Criteria andPrtRemarkLike(String value) {
            addCriterion("prt_remark like", value, "prtRemark");
            return (Criteria) this;
        }

        public Criteria andPrtRemarkNotLike(String value) {
            addCriterion("prt_remark not like", value, "prtRemark");
            return (Criteria) this;
        }

        public Criteria andPrtRemarkIn(List<String> values) {
            addCriterion("prt_remark in", values, "prtRemark");
            return (Criteria) this;
        }

        public Criteria andPrtRemarkNotIn(List<String> values) {
            addCriterion("prt_remark not in", values, "prtRemark");
            return (Criteria) this;
        }

        public Criteria andPrtRemarkBetween(String value1, String value2) {
            addCriterion("prt_remark between", value1, value2, "prtRemark");
            return (Criteria) this;
        }

        public Criteria andPrtRemarkNotBetween(String value1, String value2) {
            addCriterion("prt_remark not between", value1, value2, "prtRemark");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionIsNull() {
            addCriterion("prt_audition is null");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionIsNotNull() {
            addCriterion("prt_audition is not null");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionEqualTo(String value) {
            addCriterion("prt_audition =", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionNotEqualTo(String value) {
            addCriterion("prt_audition <>", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionGreaterThan(String value) {
            addCriterion("prt_audition >", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("prt_audition >=", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionLessThan(String value) {
            addCriterion("prt_audition <", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionLessThanOrEqualTo(String value) {
            addCriterion("prt_audition <=", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionLike(String value) {
            addCriterion("prt_audition like", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionNotLike(String value) {
            addCriterion("prt_audition not like", value, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionIn(List<String> values) {
            addCriterion("prt_audition in", values, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionNotIn(List<String> values) {
            addCriterion("prt_audition not in", values, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionBetween(String value1, String value2) {
            addCriterion("prt_audition between", value1, value2, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtAuditionNotBetween(String value1, String value2) {
            addCriterion("prt_audition not between", value1, value2, "prtAudition");
            return (Criteria) this;
        }

        public Criteria andPrtYnIsNull() {
            addCriterion("prt_yn is null");
            return (Criteria) this;
        }

        public Criteria andPrtYnIsNotNull() {
            addCriterion("prt_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPrtYnEqualTo(String value) {
            addCriterion("prt_yn =", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnNotEqualTo(String value) {
            addCriterion("prt_yn <>", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnGreaterThan(String value) {
            addCriterion("prt_yn >", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnGreaterThanOrEqualTo(String value) {
            addCriterion("prt_yn >=", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnLessThan(String value) {
            addCriterion("prt_yn <", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnLessThanOrEqualTo(String value) {
            addCriterion("prt_yn <=", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnLike(String value) {
            addCriterion("prt_yn like", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnNotLike(String value) {
            addCriterion("prt_yn not like", value, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnIn(List<String> values) {
            addCriterion("prt_yn in", values, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnNotIn(List<String> values) {
            addCriterion("prt_yn not in", values, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnBetween(String value1, String value2) {
            addCriterion("prt_yn between", value1, value2, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtYnNotBetween(String value1, String value2) {
            addCriterion("prt_yn not between", value1, value2, "prtYn");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1IsNull() {
            addCriterion("prt_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1IsNotNull() {
            addCriterion("prt_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1EqualTo(String value) {
            addCriterion("prt_custom1 =", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1NotEqualTo(String value) {
            addCriterion("prt_custom1 <>", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1GreaterThan(String value) {
            addCriterion("prt_custom1 >", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("prt_custom1 >=", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1LessThan(String value) {
            addCriterion("prt_custom1 <", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1LessThanOrEqualTo(String value) {
            addCriterion("prt_custom1 <=", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1Like(String value) {
            addCriterion("prt_custom1 like", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1NotLike(String value) {
            addCriterion("prt_custom1 not like", value, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1In(List<String> values) {
            addCriterion("prt_custom1 in", values, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1NotIn(List<String> values) {
            addCriterion("prt_custom1 not in", values, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1Between(String value1, String value2) {
            addCriterion("prt_custom1 between", value1, value2, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom1NotBetween(String value1, String value2) {
            addCriterion("prt_custom1 not between", value1, value2, "prtCustom1");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2IsNull() {
            addCriterion("prt_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2IsNotNull() {
            addCriterion("prt_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2EqualTo(String value) {
            addCriterion("prt_custom2 =", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2NotEqualTo(String value) {
            addCriterion("prt_custom2 <>", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2GreaterThan(String value) {
            addCriterion("prt_custom2 >", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("prt_custom2 >=", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2LessThan(String value) {
            addCriterion("prt_custom2 <", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2LessThanOrEqualTo(String value) {
            addCriterion("prt_custom2 <=", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2Like(String value) {
            addCriterion("prt_custom2 like", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2NotLike(String value) {
            addCriterion("prt_custom2 not like", value, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2In(List<String> values) {
            addCriterion("prt_custom2 in", values, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2NotIn(List<String> values) {
            addCriterion("prt_custom2 not in", values, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2Between(String value1, String value2) {
            addCriterion("prt_custom2 between", value1, value2, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom2NotBetween(String value1, String value2) {
            addCriterion("prt_custom2 not between", value1, value2, "prtCustom2");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3IsNull() {
            addCriterion("prt_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3IsNotNull() {
            addCriterion("prt_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3EqualTo(String value) {
            addCriterion("prt_custom3 =", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3NotEqualTo(String value) {
            addCriterion("prt_custom3 <>", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3GreaterThan(String value) {
            addCriterion("prt_custom3 >", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("prt_custom3 >=", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3LessThan(String value) {
            addCriterion("prt_custom3 <", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3LessThanOrEqualTo(String value) {
            addCriterion("prt_custom3 <=", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3Like(String value) {
            addCriterion("prt_custom3 like", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3NotLike(String value) {
            addCriterion("prt_custom3 not like", value, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3In(List<String> values) {
            addCriterion("prt_custom3 in", values, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3NotIn(List<String> values) {
            addCriterion("prt_custom3 not in", values, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3Between(String value1, String value2) {
            addCriterion("prt_custom3 between", value1, value2, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom3NotBetween(String value1, String value2) {
            addCriterion("prt_custom3 not between", value1, value2, "prtCustom3");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4IsNull() {
            addCriterion("prt_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4IsNotNull() {
            addCriterion("prt_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4EqualTo(String value) {
            addCriterion("prt_custom4 =", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4NotEqualTo(String value) {
            addCriterion("prt_custom4 <>", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4GreaterThan(String value) {
            addCriterion("prt_custom4 >", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("prt_custom4 >=", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4LessThan(String value) {
            addCriterion("prt_custom4 <", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4LessThanOrEqualTo(String value) {
            addCriterion("prt_custom4 <=", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4Like(String value) {
            addCriterion("prt_custom4 like", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4NotLike(String value) {
            addCriterion("prt_custom4 not like", value, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4In(List<String> values) {
            addCriterion("prt_custom4 in", values, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4NotIn(List<String> values) {
            addCriterion("prt_custom4 not in", values, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4Between(String value1, String value2) {
            addCriterion("prt_custom4 between", value1, value2, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom4NotBetween(String value1, String value2) {
            addCriterion("prt_custom4 not between", value1, value2, "prtCustom4");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5IsNull() {
            addCriterion("prt_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5IsNotNull() {
            addCriterion("prt_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5EqualTo(String value) {
            addCriterion("prt_custom5 =", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5NotEqualTo(String value) {
            addCriterion("prt_custom5 <>", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5GreaterThan(String value) {
            addCriterion("prt_custom5 >", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("prt_custom5 >=", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5LessThan(String value) {
            addCriterion("prt_custom5 <", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5LessThanOrEqualTo(String value) {
            addCriterion("prt_custom5 <=", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5Like(String value) {
            addCriterion("prt_custom5 like", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5NotLike(String value) {
            addCriterion("prt_custom5 not like", value, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5In(List<String> values) {
            addCriterion("prt_custom5 in", values, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5NotIn(List<String> values) {
            addCriterion("prt_custom5 not in", values, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5Between(String value1, String value2) {
            addCriterion("prt_custom5 between", value1, value2, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom5NotBetween(String value1, String value2) {
            addCriterion("prt_custom5 not between", value1, value2, "prtCustom5");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6IsNull() {
            addCriterion("prt_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6IsNotNull() {
            addCriterion("prt_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6EqualTo(String value) {
            addCriterion("prt_custom6 =", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6NotEqualTo(String value) {
            addCriterion("prt_custom6 <>", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6GreaterThan(String value) {
            addCriterion("prt_custom6 >", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("prt_custom6 >=", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6LessThan(String value) {
            addCriterion("prt_custom6 <", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6LessThanOrEqualTo(String value) {
            addCriterion("prt_custom6 <=", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6Like(String value) {
            addCriterion("prt_custom6 like", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6NotLike(String value) {
            addCriterion("prt_custom6 not like", value, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6In(List<String> values) {
            addCriterion("prt_custom6 in", values, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6NotIn(List<String> values) {
            addCriterion("prt_custom6 not in", values, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6Between(String value1, String value2) {
            addCriterion("prt_custom6 between", value1, value2, "prtCustom6");
            return (Criteria) this;
        }

        public Criteria andPrtCustom6NotBetween(String value1, String value2) {
            addCriterion("prt_custom6 not between", value1, value2, "prtCustom6");
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