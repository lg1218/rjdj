package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class EducationalBackgroundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EducationalBackgroundExample() {
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

        public Criteria andEbIdIsNull() {
            addCriterion("eb_id is null");
            return (Criteria) this;
        }

        public Criteria andEbIdIsNotNull() {
            addCriterion("eb_id is not null");
            return (Criteria) this;
        }

        public Criteria andEbIdEqualTo(String value) {
            addCriterion("eb_id =", value, "ebId");
            return (Criteria) this;
        }

        public Criteria andEbIdNotEqualTo(String value) {
            addCriterion("eb_id <>", value, "ebId");
            return (Criteria) this;
        }

        public Criteria andEbIdGreaterThan(String value) {
            addCriterion("eb_id >", value, "ebId");
            return (Criteria) this;
        }

        public Criteria andEbIdGreaterThanOrEqualTo(String value) {
            addCriterion("eb_id >=", value, "ebId");
            return (Criteria) this;
        }

        public Criteria andEbIdLessThan(String value) {
            addCriterion("eb_id <", value, "ebId");
            return (Criteria) this;
        }

        public Criteria andEbIdLessThanOrEqualTo(String value) {
            addCriterion("eb_id <=", value, "ebId");
            return (Criteria) this;
        }

        public Criteria andEbIdLike(String value) {
            addCriterion("eb_id like", value, "ebId");
            return (Criteria) this;
        }

        public Criteria andEbIdNotLike(String value) {
            addCriterion("eb_id not like", value, "ebId");
            return (Criteria) this;
        }

        public Criteria andEbIdIn(List<String> values) {
            addCriterion("eb_id in", values, "ebId");
            return (Criteria) this;
        }

        public Criteria andEbIdNotIn(List<String> values) {
            addCriterion("eb_id not in", values, "ebId");
            return (Criteria) this;
        }

        public Criteria andEbIdBetween(String value1, String value2) {
            addCriterion("eb_id between", value1, value2, "ebId");
            return (Criteria) this;
        }

        public Criteria andEbIdNotBetween(String value1, String value2) {
            addCriterion("eb_id not between", value1, value2, "ebId");
            return (Criteria) this;
        }

        public Criteria andEbNameIsNull() {
            addCriterion("eb_name is null");
            return (Criteria) this;
        }

        public Criteria andEbNameIsNotNull() {
            addCriterion("eb_name is not null");
            return (Criteria) this;
        }

        public Criteria andEbNameEqualTo(String value) {
            addCriterion("eb_name =", value, "ebName");
            return (Criteria) this;
        }

        public Criteria andEbNameNotEqualTo(String value) {
            addCriterion("eb_name <>", value, "ebName");
            return (Criteria) this;
        }

        public Criteria andEbNameGreaterThan(String value) {
            addCriterion("eb_name >", value, "ebName");
            return (Criteria) this;
        }

        public Criteria andEbNameGreaterThanOrEqualTo(String value) {
            addCriterion("eb_name >=", value, "ebName");
            return (Criteria) this;
        }

        public Criteria andEbNameLessThan(String value) {
            addCriterion("eb_name <", value, "ebName");
            return (Criteria) this;
        }

        public Criteria andEbNameLessThanOrEqualTo(String value) {
            addCriterion("eb_name <=", value, "ebName");
            return (Criteria) this;
        }

        public Criteria andEbNameLike(String value) {
            addCriterion("eb_name like", value, "ebName");
            return (Criteria) this;
        }

        public Criteria andEbNameNotLike(String value) {
            addCriterion("eb_name not like", value, "ebName");
            return (Criteria) this;
        }

        public Criteria andEbNameIn(List<String> values) {
            addCriterion("eb_name in", values, "ebName");
            return (Criteria) this;
        }

        public Criteria andEbNameNotIn(List<String> values) {
            addCriterion("eb_name not in", values, "ebName");
            return (Criteria) this;
        }

        public Criteria andEbNameBetween(String value1, String value2) {
            addCriterion("eb_name between", value1, value2, "ebName");
            return (Criteria) this;
        }

        public Criteria andEbNameNotBetween(String value1, String value2) {
            addCriterion("eb_name not between", value1, value2, "ebName");
            return (Criteria) this;
        }

        public Criteria andEbEnglishNameIsNull() {
            addCriterion("eb_english_name is null");
            return (Criteria) this;
        }

        public Criteria andEbEnglishNameIsNotNull() {
            addCriterion("eb_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andEbEnglishNameEqualTo(String value) {
            addCriterion("eb_english_name =", value, "ebEnglishName");
            return (Criteria) this;
        }

        public Criteria andEbEnglishNameNotEqualTo(String value) {
            addCriterion("eb_english_name <>", value, "ebEnglishName");
            return (Criteria) this;
        }

        public Criteria andEbEnglishNameGreaterThan(String value) {
            addCriterion("eb_english_name >", value, "ebEnglishName");
            return (Criteria) this;
        }

        public Criteria andEbEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("eb_english_name >=", value, "ebEnglishName");
            return (Criteria) this;
        }

        public Criteria andEbEnglishNameLessThan(String value) {
            addCriterion("eb_english_name <", value, "ebEnglishName");
            return (Criteria) this;
        }

        public Criteria andEbEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("eb_english_name <=", value, "ebEnglishName");
            return (Criteria) this;
        }

        public Criteria andEbEnglishNameLike(String value) {
            addCriterion("eb_english_name like", value, "ebEnglishName");
            return (Criteria) this;
        }

        public Criteria andEbEnglishNameNotLike(String value) {
            addCriterion("eb_english_name not like", value, "ebEnglishName");
            return (Criteria) this;
        }

        public Criteria andEbEnglishNameIn(List<String> values) {
            addCriterion("eb_english_name in", values, "ebEnglishName");
            return (Criteria) this;
        }

        public Criteria andEbEnglishNameNotIn(List<String> values) {
            addCriterion("eb_english_name not in", values, "ebEnglishName");
            return (Criteria) this;
        }

        public Criteria andEbEnglishNameBetween(String value1, String value2) {
            addCriterion("eb_english_name between", value1, value2, "ebEnglishName");
            return (Criteria) this;
        }

        public Criteria andEbEnglishNameNotBetween(String value1, String value2) {
            addCriterion("eb_english_name not between", value1, value2, "ebEnglishName");
            return (Criteria) this;
        }

        public Criteria andEbRemarkIsNull() {
            addCriterion("eb_remark is null");
            return (Criteria) this;
        }

        public Criteria andEbRemarkIsNotNull() {
            addCriterion("eb_remark is not null");
            return (Criteria) this;
        }

        public Criteria andEbRemarkEqualTo(String value) {
            addCriterion("eb_remark =", value, "ebRemark");
            return (Criteria) this;
        }

        public Criteria andEbRemarkNotEqualTo(String value) {
            addCriterion("eb_remark <>", value, "ebRemark");
            return (Criteria) this;
        }

        public Criteria andEbRemarkGreaterThan(String value) {
            addCriterion("eb_remark >", value, "ebRemark");
            return (Criteria) this;
        }

        public Criteria andEbRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("eb_remark >=", value, "ebRemark");
            return (Criteria) this;
        }

        public Criteria andEbRemarkLessThan(String value) {
            addCriterion("eb_remark <", value, "ebRemark");
            return (Criteria) this;
        }

        public Criteria andEbRemarkLessThanOrEqualTo(String value) {
            addCriterion("eb_remark <=", value, "ebRemark");
            return (Criteria) this;
        }

        public Criteria andEbRemarkLike(String value) {
            addCriterion("eb_remark like", value, "ebRemark");
            return (Criteria) this;
        }

        public Criteria andEbRemarkNotLike(String value) {
            addCriterion("eb_remark not like", value, "ebRemark");
            return (Criteria) this;
        }

        public Criteria andEbRemarkIn(List<String> values) {
            addCriterion("eb_remark in", values, "ebRemark");
            return (Criteria) this;
        }

        public Criteria andEbRemarkNotIn(List<String> values) {
            addCriterion("eb_remark not in", values, "ebRemark");
            return (Criteria) this;
        }

        public Criteria andEbRemarkBetween(String value1, String value2) {
            addCriterion("eb_remark between", value1, value2, "ebRemark");
            return (Criteria) this;
        }

        public Criteria andEbRemarkNotBetween(String value1, String value2) {
            addCriterion("eb_remark not between", value1, value2, "ebRemark");
            return (Criteria) this;
        }

        public Criteria andEbAuditingIsNull() {
            addCriterion("eb_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andEbAuditingIsNotNull() {
            addCriterion("eb_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andEbAuditingEqualTo(String value) {
            addCriterion("eb_Auditing =", value, "ebAuditing");
            return (Criteria) this;
        }

        public Criteria andEbAuditingNotEqualTo(String value) {
            addCriterion("eb_Auditing <>", value, "ebAuditing");
            return (Criteria) this;
        }

        public Criteria andEbAuditingGreaterThan(String value) {
            addCriterion("eb_Auditing >", value, "ebAuditing");
            return (Criteria) this;
        }

        public Criteria andEbAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("eb_Auditing >=", value, "ebAuditing");
            return (Criteria) this;
        }

        public Criteria andEbAuditingLessThan(String value) {
            addCriterion("eb_Auditing <", value, "ebAuditing");
            return (Criteria) this;
        }

        public Criteria andEbAuditingLessThanOrEqualTo(String value) {
            addCriterion("eb_Auditing <=", value, "ebAuditing");
            return (Criteria) this;
        }

        public Criteria andEbAuditingLike(String value) {
            addCriterion("eb_Auditing like", value, "ebAuditing");
            return (Criteria) this;
        }

        public Criteria andEbAuditingNotLike(String value) {
            addCriterion("eb_Auditing not like", value, "ebAuditing");
            return (Criteria) this;
        }

        public Criteria andEbAuditingIn(List<String> values) {
            addCriterion("eb_Auditing in", values, "ebAuditing");
            return (Criteria) this;
        }

        public Criteria andEbAuditingNotIn(List<String> values) {
            addCriterion("eb_Auditing not in", values, "ebAuditing");
            return (Criteria) this;
        }

        public Criteria andEbAuditingBetween(String value1, String value2) {
            addCriterion("eb_Auditing between", value1, value2, "ebAuditing");
            return (Criteria) this;
        }

        public Criteria andEbAuditingNotBetween(String value1, String value2) {
            addCriterion("eb_Auditing not between", value1, value2, "ebAuditing");
            return (Criteria) this;
        }

        public Criteria andEbYnIsNull() {
            addCriterion("eb_yn is null");
            return (Criteria) this;
        }

        public Criteria andEbYnIsNotNull() {
            addCriterion("eb_yn is not null");
            return (Criteria) this;
        }

        public Criteria andEbYnEqualTo(String value) {
            addCriterion("eb_yn =", value, "ebYn");
            return (Criteria) this;
        }

        public Criteria andEbYnNotEqualTo(String value) {
            addCriterion("eb_yn <>", value, "ebYn");
            return (Criteria) this;
        }

        public Criteria andEbYnGreaterThan(String value) {
            addCriterion("eb_yn >", value, "ebYn");
            return (Criteria) this;
        }

        public Criteria andEbYnGreaterThanOrEqualTo(String value) {
            addCriterion("eb_yn >=", value, "ebYn");
            return (Criteria) this;
        }

        public Criteria andEbYnLessThan(String value) {
            addCriterion("eb_yn <", value, "ebYn");
            return (Criteria) this;
        }

        public Criteria andEbYnLessThanOrEqualTo(String value) {
            addCriterion("eb_yn <=", value, "ebYn");
            return (Criteria) this;
        }

        public Criteria andEbYnLike(String value) {
            addCriterion("eb_yn like", value, "ebYn");
            return (Criteria) this;
        }

        public Criteria andEbYnNotLike(String value) {
            addCriterion("eb_yn not like", value, "ebYn");
            return (Criteria) this;
        }

        public Criteria andEbYnIn(List<String> values) {
            addCriterion("eb_yn in", values, "ebYn");
            return (Criteria) this;
        }

        public Criteria andEbYnNotIn(List<String> values) {
            addCriterion("eb_yn not in", values, "ebYn");
            return (Criteria) this;
        }

        public Criteria andEbYnBetween(String value1, String value2) {
            addCriterion("eb_yn between", value1, value2, "ebYn");
            return (Criteria) this;
        }

        public Criteria andEbYnNotBetween(String value1, String value2) {
            addCriterion("eb_yn not between", value1, value2, "ebYn");
            return (Criteria) this;
        }

        public Criteria andEbCustom1IsNull() {
            addCriterion("eb_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andEbCustom1IsNotNull() {
            addCriterion("eb_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andEbCustom1EqualTo(String value) {
            addCriterion("eb_custom1 =", value, "ebCustom1");
            return (Criteria) this;
        }

        public Criteria andEbCustom1NotEqualTo(String value) {
            addCriterion("eb_custom1 <>", value, "ebCustom1");
            return (Criteria) this;
        }

        public Criteria andEbCustom1GreaterThan(String value) {
            addCriterion("eb_custom1 >", value, "ebCustom1");
            return (Criteria) this;
        }

        public Criteria andEbCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("eb_custom1 >=", value, "ebCustom1");
            return (Criteria) this;
        }

        public Criteria andEbCustom1LessThan(String value) {
            addCriterion("eb_custom1 <", value, "ebCustom1");
            return (Criteria) this;
        }

        public Criteria andEbCustom1LessThanOrEqualTo(String value) {
            addCriterion("eb_custom1 <=", value, "ebCustom1");
            return (Criteria) this;
        }

        public Criteria andEbCustom1Like(String value) {
            addCriterion("eb_custom1 like", value, "ebCustom1");
            return (Criteria) this;
        }

        public Criteria andEbCustom1NotLike(String value) {
            addCriterion("eb_custom1 not like", value, "ebCustom1");
            return (Criteria) this;
        }

        public Criteria andEbCustom1In(List<String> values) {
            addCriterion("eb_custom1 in", values, "ebCustom1");
            return (Criteria) this;
        }

        public Criteria andEbCustom1NotIn(List<String> values) {
            addCriterion("eb_custom1 not in", values, "ebCustom1");
            return (Criteria) this;
        }

        public Criteria andEbCustom1Between(String value1, String value2) {
            addCriterion("eb_custom1 between", value1, value2, "ebCustom1");
            return (Criteria) this;
        }

        public Criteria andEbCustom1NotBetween(String value1, String value2) {
            addCriterion("eb_custom1 not between", value1, value2, "ebCustom1");
            return (Criteria) this;
        }

        public Criteria andEbCustom2IsNull() {
            addCriterion("eb_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andEbCustom2IsNotNull() {
            addCriterion("eb_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andEbCustom2EqualTo(String value) {
            addCriterion("eb_custom2 =", value, "ebCustom2");
            return (Criteria) this;
        }

        public Criteria andEbCustom2NotEqualTo(String value) {
            addCriterion("eb_custom2 <>", value, "ebCustom2");
            return (Criteria) this;
        }

        public Criteria andEbCustom2GreaterThan(String value) {
            addCriterion("eb_custom2 >", value, "ebCustom2");
            return (Criteria) this;
        }

        public Criteria andEbCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("eb_custom2 >=", value, "ebCustom2");
            return (Criteria) this;
        }

        public Criteria andEbCustom2LessThan(String value) {
            addCriterion("eb_custom2 <", value, "ebCustom2");
            return (Criteria) this;
        }

        public Criteria andEbCustom2LessThanOrEqualTo(String value) {
            addCriterion("eb_custom2 <=", value, "ebCustom2");
            return (Criteria) this;
        }

        public Criteria andEbCustom2Like(String value) {
            addCriterion("eb_custom2 like", value, "ebCustom2");
            return (Criteria) this;
        }

        public Criteria andEbCustom2NotLike(String value) {
            addCriterion("eb_custom2 not like", value, "ebCustom2");
            return (Criteria) this;
        }

        public Criteria andEbCustom2In(List<String> values) {
            addCriterion("eb_custom2 in", values, "ebCustom2");
            return (Criteria) this;
        }

        public Criteria andEbCustom2NotIn(List<String> values) {
            addCriterion("eb_custom2 not in", values, "ebCustom2");
            return (Criteria) this;
        }

        public Criteria andEbCustom2Between(String value1, String value2) {
            addCriterion("eb_custom2 between", value1, value2, "ebCustom2");
            return (Criteria) this;
        }

        public Criteria andEbCustom2NotBetween(String value1, String value2) {
            addCriterion("eb_custom2 not between", value1, value2, "ebCustom2");
            return (Criteria) this;
        }

        public Criteria andEbCustom3IsNull() {
            addCriterion("eb_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andEbCustom3IsNotNull() {
            addCriterion("eb_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andEbCustom3EqualTo(String value) {
            addCriterion("eb_custom3 =", value, "ebCustom3");
            return (Criteria) this;
        }

        public Criteria andEbCustom3NotEqualTo(String value) {
            addCriterion("eb_custom3 <>", value, "ebCustom3");
            return (Criteria) this;
        }

        public Criteria andEbCustom3GreaterThan(String value) {
            addCriterion("eb_custom3 >", value, "ebCustom3");
            return (Criteria) this;
        }

        public Criteria andEbCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("eb_custom3 >=", value, "ebCustom3");
            return (Criteria) this;
        }

        public Criteria andEbCustom3LessThan(String value) {
            addCriterion("eb_custom3 <", value, "ebCustom3");
            return (Criteria) this;
        }

        public Criteria andEbCustom3LessThanOrEqualTo(String value) {
            addCriterion("eb_custom3 <=", value, "ebCustom3");
            return (Criteria) this;
        }

        public Criteria andEbCustom3Like(String value) {
            addCriterion("eb_custom3 like", value, "ebCustom3");
            return (Criteria) this;
        }

        public Criteria andEbCustom3NotLike(String value) {
            addCriterion("eb_custom3 not like", value, "ebCustom3");
            return (Criteria) this;
        }

        public Criteria andEbCustom3In(List<String> values) {
            addCriterion("eb_custom3 in", values, "ebCustom3");
            return (Criteria) this;
        }

        public Criteria andEbCustom3NotIn(List<String> values) {
            addCriterion("eb_custom3 not in", values, "ebCustom3");
            return (Criteria) this;
        }

        public Criteria andEbCustom3Between(String value1, String value2) {
            addCriterion("eb_custom3 between", value1, value2, "ebCustom3");
            return (Criteria) this;
        }

        public Criteria andEbCustom3NotBetween(String value1, String value2) {
            addCriterion("eb_custom3 not between", value1, value2, "ebCustom3");
            return (Criteria) this;
        }

        public Criteria andEbCustom4IsNull() {
            addCriterion("eb_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andEbCustom4IsNotNull() {
            addCriterion("eb_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andEbCustom4EqualTo(String value) {
            addCriterion("eb_custom4 =", value, "ebCustom4");
            return (Criteria) this;
        }

        public Criteria andEbCustom4NotEqualTo(String value) {
            addCriterion("eb_custom4 <>", value, "ebCustom4");
            return (Criteria) this;
        }

        public Criteria andEbCustom4GreaterThan(String value) {
            addCriterion("eb_custom4 >", value, "ebCustom4");
            return (Criteria) this;
        }

        public Criteria andEbCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("eb_custom4 >=", value, "ebCustom4");
            return (Criteria) this;
        }

        public Criteria andEbCustom4LessThan(String value) {
            addCriterion("eb_custom4 <", value, "ebCustom4");
            return (Criteria) this;
        }

        public Criteria andEbCustom4LessThanOrEqualTo(String value) {
            addCriterion("eb_custom4 <=", value, "ebCustom4");
            return (Criteria) this;
        }

        public Criteria andEbCustom4Like(String value) {
            addCriterion("eb_custom4 like", value, "ebCustom4");
            return (Criteria) this;
        }

        public Criteria andEbCustom4NotLike(String value) {
            addCriterion("eb_custom4 not like", value, "ebCustom4");
            return (Criteria) this;
        }

        public Criteria andEbCustom4In(List<String> values) {
            addCriterion("eb_custom4 in", values, "ebCustom4");
            return (Criteria) this;
        }

        public Criteria andEbCustom4NotIn(List<String> values) {
            addCriterion("eb_custom4 not in", values, "ebCustom4");
            return (Criteria) this;
        }

        public Criteria andEbCustom4Between(String value1, String value2) {
            addCriterion("eb_custom4 between", value1, value2, "ebCustom4");
            return (Criteria) this;
        }

        public Criteria andEbCustom4NotBetween(String value1, String value2) {
            addCriterion("eb_custom4 not between", value1, value2, "ebCustom4");
            return (Criteria) this;
        }

        public Criteria andEbCustom5IsNull() {
            addCriterion("eb_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andEbCustom5IsNotNull() {
            addCriterion("eb_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andEbCustom5EqualTo(String value) {
            addCriterion("eb_custom5 =", value, "ebCustom5");
            return (Criteria) this;
        }

        public Criteria andEbCustom5NotEqualTo(String value) {
            addCriterion("eb_custom5 <>", value, "ebCustom5");
            return (Criteria) this;
        }

        public Criteria andEbCustom5GreaterThan(String value) {
            addCriterion("eb_custom5 >", value, "ebCustom5");
            return (Criteria) this;
        }

        public Criteria andEbCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("eb_custom5 >=", value, "ebCustom5");
            return (Criteria) this;
        }

        public Criteria andEbCustom5LessThan(String value) {
            addCriterion("eb_custom5 <", value, "ebCustom5");
            return (Criteria) this;
        }

        public Criteria andEbCustom5LessThanOrEqualTo(String value) {
            addCriterion("eb_custom5 <=", value, "ebCustom5");
            return (Criteria) this;
        }

        public Criteria andEbCustom5Like(String value) {
            addCriterion("eb_custom5 like", value, "ebCustom5");
            return (Criteria) this;
        }

        public Criteria andEbCustom5NotLike(String value) {
            addCriterion("eb_custom5 not like", value, "ebCustom5");
            return (Criteria) this;
        }

        public Criteria andEbCustom5In(List<String> values) {
            addCriterion("eb_custom5 in", values, "ebCustom5");
            return (Criteria) this;
        }

        public Criteria andEbCustom5NotIn(List<String> values) {
            addCriterion("eb_custom5 not in", values, "ebCustom5");
            return (Criteria) this;
        }

        public Criteria andEbCustom5Between(String value1, String value2) {
            addCriterion("eb_custom5 between", value1, value2, "ebCustom5");
            return (Criteria) this;
        }

        public Criteria andEbCustom5NotBetween(String value1, String value2) {
            addCriterion("eb_custom5 not between", value1, value2, "ebCustom5");
            return (Criteria) this;
        }

        public Criteria andEbCustom6IsNull() {
            addCriterion("eb_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andEbCustom6IsNotNull() {
            addCriterion("eb_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andEbCustom6EqualTo(String value) {
            addCriterion("eb_custom6 =", value, "ebCustom6");
            return (Criteria) this;
        }

        public Criteria andEbCustom6NotEqualTo(String value) {
            addCriterion("eb_custom6 <>", value, "ebCustom6");
            return (Criteria) this;
        }

        public Criteria andEbCustom6GreaterThan(String value) {
            addCriterion("eb_custom6 >", value, "ebCustom6");
            return (Criteria) this;
        }

        public Criteria andEbCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("eb_custom6 >=", value, "ebCustom6");
            return (Criteria) this;
        }

        public Criteria andEbCustom6LessThan(String value) {
            addCriterion("eb_custom6 <", value, "ebCustom6");
            return (Criteria) this;
        }

        public Criteria andEbCustom6LessThanOrEqualTo(String value) {
            addCriterion("eb_custom6 <=", value, "ebCustom6");
            return (Criteria) this;
        }

        public Criteria andEbCustom6Like(String value) {
            addCriterion("eb_custom6 like", value, "ebCustom6");
            return (Criteria) this;
        }

        public Criteria andEbCustom6NotLike(String value) {
            addCriterion("eb_custom6 not like", value, "ebCustom6");
            return (Criteria) this;
        }

        public Criteria andEbCustom6In(List<String> values) {
            addCriterion("eb_custom6 in", values, "ebCustom6");
            return (Criteria) this;
        }

        public Criteria andEbCustom6NotIn(List<String> values) {
            addCriterion("eb_custom6 not in", values, "ebCustom6");
            return (Criteria) this;
        }

        public Criteria andEbCustom6Between(String value1, String value2) {
            addCriterion("eb_custom6 between", value1, value2, "ebCustom6");
            return (Criteria) this;
        }

        public Criteria andEbCustom6NotBetween(String value1, String value2) {
            addCriterion("eb_custom6 not between", value1, value2, "ebCustom6");
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