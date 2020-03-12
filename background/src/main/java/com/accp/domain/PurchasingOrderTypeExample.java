package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PurchasingOrderTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchasingOrderTypeExample() {
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

        public Criteria andPotIdIsNull() {
            addCriterion("pot_id is null");
            return (Criteria) this;
        }

        public Criteria andPotIdIsNotNull() {
            addCriterion("pot_id is not null");
            return (Criteria) this;
        }

        public Criteria andPotIdEqualTo(String value) {
            addCriterion("pot_id =", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdNotEqualTo(String value) {
            addCriterion("pot_id <>", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdGreaterThan(String value) {
            addCriterion("pot_id >", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdGreaterThanOrEqualTo(String value) {
            addCriterion("pot_id >=", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdLessThan(String value) {
            addCriterion("pot_id <", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdLessThanOrEqualTo(String value) {
            addCriterion("pot_id <=", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdLike(String value) {
            addCriterion("pot_id like", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdNotLike(String value) {
            addCriterion("pot_id not like", value, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdIn(List<String> values) {
            addCriterion("pot_id in", values, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdNotIn(List<String> values) {
            addCriterion("pot_id not in", values, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdBetween(String value1, String value2) {
            addCriterion("pot_id between", value1, value2, "potId");
            return (Criteria) this;
        }

        public Criteria andPotIdNotBetween(String value1, String value2) {
            addCriterion("pot_id not between", value1, value2, "potId");
            return (Criteria) this;
        }

        public Criteria andPotNameIsNull() {
            addCriterion("pot_name is null");
            return (Criteria) this;
        }

        public Criteria andPotNameIsNotNull() {
            addCriterion("pot_name is not null");
            return (Criteria) this;
        }

        public Criteria andPotNameEqualTo(String value) {
            addCriterion("pot_name =", value, "potName");
            return (Criteria) this;
        }

        public Criteria andPotNameNotEqualTo(String value) {
            addCriterion("pot_name <>", value, "potName");
            return (Criteria) this;
        }

        public Criteria andPotNameGreaterThan(String value) {
            addCriterion("pot_name >", value, "potName");
            return (Criteria) this;
        }

        public Criteria andPotNameGreaterThanOrEqualTo(String value) {
            addCriterion("pot_name >=", value, "potName");
            return (Criteria) this;
        }

        public Criteria andPotNameLessThan(String value) {
            addCriterion("pot_name <", value, "potName");
            return (Criteria) this;
        }

        public Criteria andPotNameLessThanOrEqualTo(String value) {
            addCriterion("pot_name <=", value, "potName");
            return (Criteria) this;
        }

        public Criteria andPotNameLike(String value) {
            addCriterion("pot_name like", value, "potName");
            return (Criteria) this;
        }

        public Criteria andPotNameNotLike(String value) {
            addCriterion("pot_name not like", value, "potName");
            return (Criteria) this;
        }

        public Criteria andPotNameIn(List<String> values) {
            addCriterion("pot_name in", values, "potName");
            return (Criteria) this;
        }

        public Criteria andPotNameNotIn(List<String> values) {
            addCriterion("pot_name not in", values, "potName");
            return (Criteria) this;
        }

        public Criteria andPotNameBetween(String value1, String value2) {
            addCriterion("pot_name between", value1, value2, "potName");
            return (Criteria) this;
        }

        public Criteria andPotNameNotBetween(String value1, String value2) {
            addCriterion("pot_name not between", value1, value2, "potName");
            return (Criteria) this;
        }

        public Criteria andPotEngnameIsNull() {
            addCriterion("pot_engname is null");
            return (Criteria) this;
        }

        public Criteria andPotEngnameIsNotNull() {
            addCriterion("pot_engname is not null");
            return (Criteria) this;
        }

        public Criteria andPotEngnameEqualTo(String value) {
            addCriterion("pot_engname =", value, "potEngname");
            return (Criteria) this;
        }

        public Criteria andPotEngnameNotEqualTo(String value) {
            addCriterion("pot_engname <>", value, "potEngname");
            return (Criteria) this;
        }

        public Criteria andPotEngnameGreaterThan(String value) {
            addCriterion("pot_engname >", value, "potEngname");
            return (Criteria) this;
        }

        public Criteria andPotEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("pot_engname >=", value, "potEngname");
            return (Criteria) this;
        }

        public Criteria andPotEngnameLessThan(String value) {
            addCriterion("pot_engname <", value, "potEngname");
            return (Criteria) this;
        }

        public Criteria andPotEngnameLessThanOrEqualTo(String value) {
            addCriterion("pot_engname <=", value, "potEngname");
            return (Criteria) this;
        }

        public Criteria andPotEngnameLike(String value) {
            addCriterion("pot_engname like", value, "potEngname");
            return (Criteria) this;
        }

        public Criteria andPotEngnameNotLike(String value) {
            addCriterion("pot_engname not like", value, "potEngname");
            return (Criteria) this;
        }

        public Criteria andPotEngnameIn(List<String> values) {
            addCriterion("pot_engname in", values, "potEngname");
            return (Criteria) this;
        }

        public Criteria andPotEngnameNotIn(List<String> values) {
            addCriterion("pot_engname not in", values, "potEngname");
            return (Criteria) this;
        }

        public Criteria andPotEngnameBetween(String value1, String value2) {
            addCriterion("pot_engname between", value1, value2, "potEngname");
            return (Criteria) this;
        }

        public Criteria andPotEngnameNotBetween(String value1, String value2) {
            addCriterion("pot_engname not between", value1, value2, "potEngname");
            return (Criteria) this;
        }

        public Criteria andPotRemarkIsNull() {
            addCriterion("pot_remark is null");
            return (Criteria) this;
        }

        public Criteria andPotRemarkIsNotNull() {
            addCriterion("pot_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPotRemarkEqualTo(String value) {
            addCriterion("pot_remark =", value, "potRemark");
            return (Criteria) this;
        }

        public Criteria andPotRemarkNotEqualTo(String value) {
            addCriterion("pot_remark <>", value, "potRemark");
            return (Criteria) this;
        }

        public Criteria andPotRemarkGreaterThan(String value) {
            addCriterion("pot_remark >", value, "potRemark");
            return (Criteria) this;
        }

        public Criteria andPotRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pot_remark >=", value, "potRemark");
            return (Criteria) this;
        }

        public Criteria andPotRemarkLessThan(String value) {
            addCriterion("pot_remark <", value, "potRemark");
            return (Criteria) this;
        }

        public Criteria andPotRemarkLessThanOrEqualTo(String value) {
            addCriterion("pot_remark <=", value, "potRemark");
            return (Criteria) this;
        }

        public Criteria andPotRemarkLike(String value) {
            addCriterion("pot_remark like", value, "potRemark");
            return (Criteria) this;
        }

        public Criteria andPotRemarkNotLike(String value) {
            addCriterion("pot_remark not like", value, "potRemark");
            return (Criteria) this;
        }

        public Criteria andPotRemarkIn(List<String> values) {
            addCriterion("pot_remark in", values, "potRemark");
            return (Criteria) this;
        }

        public Criteria andPotRemarkNotIn(List<String> values) {
            addCriterion("pot_remark not in", values, "potRemark");
            return (Criteria) this;
        }

        public Criteria andPotRemarkBetween(String value1, String value2) {
            addCriterion("pot_remark between", value1, value2, "potRemark");
            return (Criteria) this;
        }

        public Criteria andPotRemarkNotBetween(String value1, String value2) {
            addCriterion("pot_remark not between", value1, value2, "potRemark");
            return (Criteria) this;
        }

        public Criteria andPotAuditionIsNull() {
            addCriterion("pot_audition is null");
            return (Criteria) this;
        }

        public Criteria andPotAuditionIsNotNull() {
            addCriterion("pot_audition is not null");
            return (Criteria) this;
        }

        public Criteria andPotAuditionEqualTo(String value) {
            addCriterion("pot_audition =", value, "potAudition");
            return (Criteria) this;
        }

        public Criteria andPotAuditionNotEqualTo(String value) {
            addCriterion("pot_audition <>", value, "potAudition");
            return (Criteria) this;
        }

        public Criteria andPotAuditionGreaterThan(String value) {
            addCriterion("pot_audition >", value, "potAudition");
            return (Criteria) this;
        }

        public Criteria andPotAuditionGreaterThanOrEqualTo(String value) {
            addCriterion("pot_audition >=", value, "potAudition");
            return (Criteria) this;
        }

        public Criteria andPotAuditionLessThan(String value) {
            addCriterion("pot_audition <", value, "potAudition");
            return (Criteria) this;
        }

        public Criteria andPotAuditionLessThanOrEqualTo(String value) {
            addCriterion("pot_audition <=", value, "potAudition");
            return (Criteria) this;
        }

        public Criteria andPotAuditionLike(String value) {
            addCriterion("pot_audition like", value, "potAudition");
            return (Criteria) this;
        }

        public Criteria andPotAuditionNotLike(String value) {
            addCriterion("pot_audition not like", value, "potAudition");
            return (Criteria) this;
        }

        public Criteria andPotAuditionIn(List<String> values) {
            addCriterion("pot_audition in", values, "potAudition");
            return (Criteria) this;
        }

        public Criteria andPotAuditionNotIn(List<String> values) {
            addCriterion("pot_audition not in", values, "potAudition");
            return (Criteria) this;
        }

        public Criteria andPotAuditionBetween(String value1, String value2) {
            addCriterion("pot_audition between", value1, value2, "potAudition");
            return (Criteria) this;
        }

        public Criteria andPotAuditionNotBetween(String value1, String value2) {
            addCriterion("pot_audition not between", value1, value2, "potAudition");
            return (Criteria) this;
        }

        public Criteria andPotYnIsNull() {
            addCriterion("pot_yn is null");
            return (Criteria) this;
        }

        public Criteria andPotYnIsNotNull() {
            addCriterion("pot_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPotYnEqualTo(String value) {
            addCriterion("pot_yn =", value, "potYn");
            return (Criteria) this;
        }

        public Criteria andPotYnNotEqualTo(String value) {
            addCriterion("pot_yn <>", value, "potYn");
            return (Criteria) this;
        }

        public Criteria andPotYnGreaterThan(String value) {
            addCriterion("pot_yn >", value, "potYn");
            return (Criteria) this;
        }

        public Criteria andPotYnGreaterThanOrEqualTo(String value) {
            addCriterion("pot_yn >=", value, "potYn");
            return (Criteria) this;
        }

        public Criteria andPotYnLessThan(String value) {
            addCriterion("pot_yn <", value, "potYn");
            return (Criteria) this;
        }

        public Criteria andPotYnLessThanOrEqualTo(String value) {
            addCriterion("pot_yn <=", value, "potYn");
            return (Criteria) this;
        }

        public Criteria andPotYnLike(String value) {
            addCriterion("pot_yn like", value, "potYn");
            return (Criteria) this;
        }

        public Criteria andPotYnNotLike(String value) {
            addCriterion("pot_yn not like", value, "potYn");
            return (Criteria) this;
        }

        public Criteria andPotYnIn(List<String> values) {
            addCriterion("pot_yn in", values, "potYn");
            return (Criteria) this;
        }

        public Criteria andPotYnNotIn(List<String> values) {
            addCriterion("pot_yn not in", values, "potYn");
            return (Criteria) this;
        }

        public Criteria andPotYnBetween(String value1, String value2) {
            addCriterion("pot_yn between", value1, value2, "potYn");
            return (Criteria) this;
        }

        public Criteria andPotYnNotBetween(String value1, String value2) {
            addCriterion("pot_yn not between", value1, value2, "potYn");
            return (Criteria) this;
        }

        public Criteria andPotCustom1IsNull() {
            addCriterion("pot_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andPotCustom1IsNotNull() {
            addCriterion("pot_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andPotCustom1EqualTo(String value) {
            addCriterion("pot_custom1 =", value, "potCustom1");
            return (Criteria) this;
        }

        public Criteria andPotCustom1NotEqualTo(String value) {
            addCriterion("pot_custom1 <>", value, "potCustom1");
            return (Criteria) this;
        }

        public Criteria andPotCustom1GreaterThan(String value) {
            addCriterion("pot_custom1 >", value, "potCustom1");
            return (Criteria) this;
        }

        public Criteria andPotCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("pot_custom1 >=", value, "potCustom1");
            return (Criteria) this;
        }

        public Criteria andPotCustom1LessThan(String value) {
            addCriterion("pot_custom1 <", value, "potCustom1");
            return (Criteria) this;
        }

        public Criteria andPotCustom1LessThanOrEqualTo(String value) {
            addCriterion("pot_custom1 <=", value, "potCustom1");
            return (Criteria) this;
        }

        public Criteria andPotCustom1Like(String value) {
            addCriterion("pot_custom1 like", value, "potCustom1");
            return (Criteria) this;
        }

        public Criteria andPotCustom1NotLike(String value) {
            addCriterion("pot_custom1 not like", value, "potCustom1");
            return (Criteria) this;
        }

        public Criteria andPotCustom1In(List<String> values) {
            addCriterion("pot_custom1 in", values, "potCustom1");
            return (Criteria) this;
        }

        public Criteria andPotCustom1NotIn(List<String> values) {
            addCriterion("pot_custom1 not in", values, "potCustom1");
            return (Criteria) this;
        }

        public Criteria andPotCustom1Between(String value1, String value2) {
            addCriterion("pot_custom1 between", value1, value2, "potCustom1");
            return (Criteria) this;
        }

        public Criteria andPotCustom1NotBetween(String value1, String value2) {
            addCriterion("pot_custom1 not between", value1, value2, "potCustom1");
            return (Criteria) this;
        }

        public Criteria andPotCustom2IsNull() {
            addCriterion("pot_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPotCustom2IsNotNull() {
            addCriterion("pot_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPotCustom2EqualTo(String value) {
            addCriterion("pot_custom2 =", value, "potCustom2");
            return (Criteria) this;
        }

        public Criteria andPotCustom2NotEqualTo(String value) {
            addCriterion("pot_custom2 <>", value, "potCustom2");
            return (Criteria) this;
        }

        public Criteria andPotCustom2GreaterThan(String value) {
            addCriterion("pot_custom2 >", value, "potCustom2");
            return (Criteria) this;
        }

        public Criteria andPotCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("pot_custom2 >=", value, "potCustom2");
            return (Criteria) this;
        }

        public Criteria andPotCustom2LessThan(String value) {
            addCriterion("pot_custom2 <", value, "potCustom2");
            return (Criteria) this;
        }

        public Criteria andPotCustom2LessThanOrEqualTo(String value) {
            addCriterion("pot_custom2 <=", value, "potCustom2");
            return (Criteria) this;
        }

        public Criteria andPotCustom2Like(String value) {
            addCriterion("pot_custom2 like", value, "potCustom2");
            return (Criteria) this;
        }

        public Criteria andPotCustom2NotLike(String value) {
            addCriterion("pot_custom2 not like", value, "potCustom2");
            return (Criteria) this;
        }

        public Criteria andPotCustom2In(List<String> values) {
            addCriterion("pot_custom2 in", values, "potCustom2");
            return (Criteria) this;
        }

        public Criteria andPotCustom2NotIn(List<String> values) {
            addCriterion("pot_custom2 not in", values, "potCustom2");
            return (Criteria) this;
        }

        public Criteria andPotCustom2Between(String value1, String value2) {
            addCriterion("pot_custom2 between", value1, value2, "potCustom2");
            return (Criteria) this;
        }

        public Criteria andPotCustom2NotBetween(String value1, String value2) {
            addCriterion("pot_custom2 not between", value1, value2, "potCustom2");
            return (Criteria) this;
        }

        public Criteria andPotCustom3IsNull() {
            addCriterion("pot_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPotCustom3IsNotNull() {
            addCriterion("pot_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPotCustom3EqualTo(String value) {
            addCriterion("pot_custom3 =", value, "potCustom3");
            return (Criteria) this;
        }

        public Criteria andPotCustom3NotEqualTo(String value) {
            addCriterion("pot_custom3 <>", value, "potCustom3");
            return (Criteria) this;
        }

        public Criteria andPotCustom3GreaterThan(String value) {
            addCriterion("pot_custom3 >", value, "potCustom3");
            return (Criteria) this;
        }

        public Criteria andPotCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("pot_custom3 >=", value, "potCustom3");
            return (Criteria) this;
        }

        public Criteria andPotCustom3LessThan(String value) {
            addCriterion("pot_custom3 <", value, "potCustom3");
            return (Criteria) this;
        }

        public Criteria andPotCustom3LessThanOrEqualTo(String value) {
            addCriterion("pot_custom3 <=", value, "potCustom3");
            return (Criteria) this;
        }

        public Criteria andPotCustom3Like(String value) {
            addCriterion("pot_custom3 like", value, "potCustom3");
            return (Criteria) this;
        }

        public Criteria andPotCustom3NotLike(String value) {
            addCriterion("pot_custom3 not like", value, "potCustom3");
            return (Criteria) this;
        }

        public Criteria andPotCustom3In(List<String> values) {
            addCriterion("pot_custom3 in", values, "potCustom3");
            return (Criteria) this;
        }

        public Criteria andPotCustom3NotIn(List<String> values) {
            addCriterion("pot_custom3 not in", values, "potCustom3");
            return (Criteria) this;
        }

        public Criteria andPotCustom3Between(String value1, String value2) {
            addCriterion("pot_custom3 between", value1, value2, "potCustom3");
            return (Criteria) this;
        }

        public Criteria andPotCustom3NotBetween(String value1, String value2) {
            addCriterion("pot_custom3 not between", value1, value2, "potCustom3");
            return (Criteria) this;
        }

        public Criteria andPotCustom4IsNull() {
            addCriterion("pot_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPotCustom4IsNotNull() {
            addCriterion("pot_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPotCustom4EqualTo(String value) {
            addCriterion("pot_custom4 =", value, "potCustom4");
            return (Criteria) this;
        }

        public Criteria andPotCustom4NotEqualTo(String value) {
            addCriterion("pot_custom4 <>", value, "potCustom4");
            return (Criteria) this;
        }

        public Criteria andPotCustom4GreaterThan(String value) {
            addCriterion("pot_custom4 >", value, "potCustom4");
            return (Criteria) this;
        }

        public Criteria andPotCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("pot_custom4 >=", value, "potCustom4");
            return (Criteria) this;
        }

        public Criteria andPotCustom4LessThan(String value) {
            addCriterion("pot_custom4 <", value, "potCustom4");
            return (Criteria) this;
        }

        public Criteria andPotCustom4LessThanOrEqualTo(String value) {
            addCriterion("pot_custom4 <=", value, "potCustom4");
            return (Criteria) this;
        }

        public Criteria andPotCustom4Like(String value) {
            addCriterion("pot_custom4 like", value, "potCustom4");
            return (Criteria) this;
        }

        public Criteria andPotCustom4NotLike(String value) {
            addCriterion("pot_custom4 not like", value, "potCustom4");
            return (Criteria) this;
        }

        public Criteria andPotCustom4In(List<String> values) {
            addCriterion("pot_custom4 in", values, "potCustom4");
            return (Criteria) this;
        }

        public Criteria andPotCustom4NotIn(List<String> values) {
            addCriterion("pot_custom4 not in", values, "potCustom4");
            return (Criteria) this;
        }

        public Criteria andPotCustom4Between(String value1, String value2) {
            addCriterion("pot_custom4 between", value1, value2, "potCustom4");
            return (Criteria) this;
        }

        public Criteria andPotCustom4NotBetween(String value1, String value2) {
            addCriterion("pot_custom4 not between", value1, value2, "potCustom4");
            return (Criteria) this;
        }

        public Criteria andPotCustom5IsNull() {
            addCriterion("pot_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPotCustom5IsNotNull() {
            addCriterion("pot_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPotCustom5EqualTo(String value) {
            addCriterion("pot_custom5 =", value, "potCustom5");
            return (Criteria) this;
        }

        public Criteria andPotCustom5NotEqualTo(String value) {
            addCriterion("pot_custom5 <>", value, "potCustom5");
            return (Criteria) this;
        }

        public Criteria andPotCustom5GreaterThan(String value) {
            addCriterion("pot_custom5 >", value, "potCustom5");
            return (Criteria) this;
        }

        public Criteria andPotCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("pot_custom5 >=", value, "potCustom5");
            return (Criteria) this;
        }

        public Criteria andPotCustom5LessThan(String value) {
            addCriterion("pot_custom5 <", value, "potCustom5");
            return (Criteria) this;
        }

        public Criteria andPotCustom5LessThanOrEqualTo(String value) {
            addCriterion("pot_custom5 <=", value, "potCustom5");
            return (Criteria) this;
        }

        public Criteria andPotCustom5Like(String value) {
            addCriterion("pot_custom5 like", value, "potCustom5");
            return (Criteria) this;
        }

        public Criteria andPotCustom5NotLike(String value) {
            addCriterion("pot_custom5 not like", value, "potCustom5");
            return (Criteria) this;
        }

        public Criteria andPotCustom5In(List<String> values) {
            addCriterion("pot_custom5 in", values, "potCustom5");
            return (Criteria) this;
        }

        public Criteria andPotCustom5NotIn(List<String> values) {
            addCriterion("pot_custom5 not in", values, "potCustom5");
            return (Criteria) this;
        }

        public Criteria andPotCustom5Between(String value1, String value2) {
            addCriterion("pot_custom5 between", value1, value2, "potCustom5");
            return (Criteria) this;
        }

        public Criteria andPotCustom5NotBetween(String value1, String value2) {
            addCriterion("pot_custom5 not between", value1, value2, "potCustom5");
            return (Criteria) this;
        }

        public Criteria andPotCustom6IsNull() {
            addCriterion("pot_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPotCustom6IsNotNull() {
            addCriterion("pot_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPotCustom6EqualTo(String value) {
            addCriterion("pot_custom6 =", value, "potCustom6");
            return (Criteria) this;
        }

        public Criteria andPotCustom6NotEqualTo(String value) {
            addCriterion("pot_custom6 <>", value, "potCustom6");
            return (Criteria) this;
        }

        public Criteria andPotCustom6GreaterThan(String value) {
            addCriterion("pot_custom6 >", value, "potCustom6");
            return (Criteria) this;
        }

        public Criteria andPotCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("pot_custom6 >=", value, "potCustom6");
            return (Criteria) this;
        }

        public Criteria andPotCustom6LessThan(String value) {
            addCriterion("pot_custom6 <", value, "potCustom6");
            return (Criteria) this;
        }

        public Criteria andPotCustom6LessThanOrEqualTo(String value) {
            addCriterion("pot_custom6 <=", value, "potCustom6");
            return (Criteria) this;
        }

        public Criteria andPotCustom6Like(String value) {
            addCriterion("pot_custom6 like", value, "potCustom6");
            return (Criteria) this;
        }

        public Criteria andPotCustom6NotLike(String value) {
            addCriterion("pot_custom6 not like", value, "potCustom6");
            return (Criteria) this;
        }

        public Criteria andPotCustom6In(List<String> values) {
            addCriterion("pot_custom6 in", values, "potCustom6");
            return (Criteria) this;
        }

        public Criteria andPotCustom6NotIn(List<String> values) {
            addCriterion("pot_custom6 not in", values, "potCustom6");
            return (Criteria) this;
        }

        public Criteria andPotCustom6Between(String value1, String value2) {
            addCriterion("pot_custom6 between", value1, value2, "potCustom6");
            return (Criteria) this;
        }

        public Criteria andPotCustom6NotBetween(String value1, String value2) {
            addCriterion("pot_custom6 not between", value1, value2, "potCustom6");
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