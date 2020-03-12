package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class IncomeCostsTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IncomeCostsTypeExample() {
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

        public Criteria andIctIdIsNull() {
            addCriterion("ict_id is null");
            return (Criteria) this;
        }

        public Criteria andIctIdIsNotNull() {
            addCriterion("ict_id is not null");
            return (Criteria) this;
        }

        public Criteria andIctIdEqualTo(String value) {
            addCriterion("ict_id =", value, "ictId");
            return (Criteria) this;
        }

        public Criteria andIctIdNotEqualTo(String value) {
            addCriterion("ict_id <>", value, "ictId");
            return (Criteria) this;
        }

        public Criteria andIctIdGreaterThan(String value) {
            addCriterion("ict_id >", value, "ictId");
            return (Criteria) this;
        }

        public Criteria andIctIdGreaterThanOrEqualTo(String value) {
            addCriterion("ict_id >=", value, "ictId");
            return (Criteria) this;
        }

        public Criteria andIctIdLessThan(String value) {
            addCriterion("ict_id <", value, "ictId");
            return (Criteria) this;
        }

        public Criteria andIctIdLessThanOrEqualTo(String value) {
            addCriterion("ict_id <=", value, "ictId");
            return (Criteria) this;
        }

        public Criteria andIctIdLike(String value) {
            addCriterion("ict_id like", value, "ictId");
            return (Criteria) this;
        }

        public Criteria andIctIdNotLike(String value) {
            addCriterion("ict_id not like", value, "ictId");
            return (Criteria) this;
        }

        public Criteria andIctIdIn(List<String> values) {
            addCriterion("ict_id in", values, "ictId");
            return (Criteria) this;
        }

        public Criteria andIctIdNotIn(List<String> values) {
            addCriterion("ict_id not in", values, "ictId");
            return (Criteria) this;
        }

        public Criteria andIctIdBetween(String value1, String value2) {
            addCriterion("ict_id between", value1, value2, "ictId");
            return (Criteria) this;
        }

        public Criteria andIctIdNotBetween(String value1, String value2) {
            addCriterion("ict_id not between", value1, value2, "ictId");
            return (Criteria) this;
        }

        public Criteria andIctNameIsNull() {
            addCriterion("ict_name is null");
            return (Criteria) this;
        }

        public Criteria andIctNameIsNotNull() {
            addCriterion("ict_name is not null");
            return (Criteria) this;
        }

        public Criteria andIctNameEqualTo(String value) {
            addCriterion("ict_name =", value, "ictName");
            return (Criteria) this;
        }

        public Criteria andIctNameNotEqualTo(String value) {
            addCriterion("ict_name <>", value, "ictName");
            return (Criteria) this;
        }

        public Criteria andIctNameGreaterThan(String value) {
            addCriterion("ict_name >", value, "ictName");
            return (Criteria) this;
        }

        public Criteria andIctNameGreaterThanOrEqualTo(String value) {
            addCriterion("ict_name >=", value, "ictName");
            return (Criteria) this;
        }

        public Criteria andIctNameLessThan(String value) {
            addCriterion("ict_name <", value, "ictName");
            return (Criteria) this;
        }

        public Criteria andIctNameLessThanOrEqualTo(String value) {
            addCriterion("ict_name <=", value, "ictName");
            return (Criteria) this;
        }

        public Criteria andIctNameLike(String value) {
            addCriterion("ict_name like", value, "ictName");
            return (Criteria) this;
        }

        public Criteria andIctNameNotLike(String value) {
            addCriterion("ict_name not like", value, "ictName");
            return (Criteria) this;
        }

        public Criteria andIctNameIn(List<String> values) {
            addCriterion("ict_name in", values, "ictName");
            return (Criteria) this;
        }

        public Criteria andIctNameNotIn(List<String> values) {
            addCriterion("ict_name not in", values, "ictName");
            return (Criteria) this;
        }

        public Criteria andIctNameBetween(String value1, String value2) {
            addCriterion("ict_name between", value1, value2, "ictName");
            return (Criteria) this;
        }

        public Criteria andIctNameNotBetween(String value1, String value2) {
            addCriterion("ict_name not between", value1, value2, "ictName");
            return (Criteria) this;
        }

        public Criteria andIctEnglishNameIsNull() {
            addCriterion("ict_english_name is null");
            return (Criteria) this;
        }

        public Criteria andIctEnglishNameIsNotNull() {
            addCriterion("ict_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andIctEnglishNameEqualTo(String value) {
            addCriterion("ict_english_name =", value, "ictEnglishName");
            return (Criteria) this;
        }

        public Criteria andIctEnglishNameNotEqualTo(String value) {
            addCriterion("ict_english_name <>", value, "ictEnglishName");
            return (Criteria) this;
        }

        public Criteria andIctEnglishNameGreaterThan(String value) {
            addCriterion("ict_english_name >", value, "ictEnglishName");
            return (Criteria) this;
        }

        public Criteria andIctEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("ict_english_name >=", value, "ictEnglishName");
            return (Criteria) this;
        }

        public Criteria andIctEnglishNameLessThan(String value) {
            addCriterion("ict_english_name <", value, "ictEnglishName");
            return (Criteria) this;
        }

        public Criteria andIctEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("ict_english_name <=", value, "ictEnglishName");
            return (Criteria) this;
        }

        public Criteria andIctEnglishNameLike(String value) {
            addCriterion("ict_english_name like", value, "ictEnglishName");
            return (Criteria) this;
        }

        public Criteria andIctEnglishNameNotLike(String value) {
            addCriterion("ict_english_name not like", value, "ictEnglishName");
            return (Criteria) this;
        }

        public Criteria andIctEnglishNameIn(List<String> values) {
            addCriterion("ict_english_name in", values, "ictEnglishName");
            return (Criteria) this;
        }

        public Criteria andIctEnglishNameNotIn(List<String> values) {
            addCriterion("ict_english_name not in", values, "ictEnglishName");
            return (Criteria) this;
        }

        public Criteria andIctEnglishNameBetween(String value1, String value2) {
            addCriterion("ict_english_name between", value1, value2, "ictEnglishName");
            return (Criteria) this;
        }

        public Criteria andIctEnglishNameNotBetween(String value1, String value2) {
            addCriterion("ict_english_name not between", value1, value2, "ictEnglishName");
            return (Criteria) this;
        }

        public Criteria andIctSubjectIsNull() {
            addCriterion("ict_subject is null");
            return (Criteria) this;
        }

        public Criteria andIctSubjectIsNotNull() {
            addCriterion("ict_subject is not null");
            return (Criteria) this;
        }

        public Criteria andIctSubjectEqualTo(String value) {
            addCriterion("ict_subject =", value, "ictSubject");
            return (Criteria) this;
        }

        public Criteria andIctSubjectNotEqualTo(String value) {
            addCriterion("ict_subject <>", value, "ictSubject");
            return (Criteria) this;
        }

        public Criteria andIctSubjectGreaterThan(String value) {
            addCriterion("ict_subject >", value, "ictSubject");
            return (Criteria) this;
        }

        public Criteria andIctSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("ict_subject >=", value, "ictSubject");
            return (Criteria) this;
        }

        public Criteria andIctSubjectLessThan(String value) {
            addCriterion("ict_subject <", value, "ictSubject");
            return (Criteria) this;
        }

        public Criteria andIctSubjectLessThanOrEqualTo(String value) {
            addCriterion("ict_subject <=", value, "ictSubject");
            return (Criteria) this;
        }

        public Criteria andIctSubjectLike(String value) {
            addCriterion("ict_subject like", value, "ictSubject");
            return (Criteria) this;
        }

        public Criteria andIctSubjectNotLike(String value) {
            addCriterion("ict_subject not like", value, "ictSubject");
            return (Criteria) this;
        }

        public Criteria andIctSubjectIn(List<String> values) {
            addCriterion("ict_subject in", values, "ictSubject");
            return (Criteria) this;
        }

        public Criteria andIctSubjectNotIn(List<String> values) {
            addCriterion("ict_subject not in", values, "ictSubject");
            return (Criteria) this;
        }

        public Criteria andIctSubjectBetween(String value1, String value2) {
            addCriterion("ict_subject between", value1, value2, "ictSubject");
            return (Criteria) this;
        }

        public Criteria andIctSubjectNotBetween(String value1, String value2) {
            addCriterion("ict_subject not between", value1, value2, "ictSubject");
            return (Criteria) this;
        }

        public Criteria andIctRemarkIsNull() {
            addCriterion("ict_remark is null");
            return (Criteria) this;
        }

        public Criteria andIctRemarkIsNotNull() {
            addCriterion("ict_remark is not null");
            return (Criteria) this;
        }

        public Criteria andIctRemarkEqualTo(String value) {
            addCriterion("ict_remark =", value, "ictRemark");
            return (Criteria) this;
        }

        public Criteria andIctRemarkNotEqualTo(String value) {
            addCriterion("ict_remark <>", value, "ictRemark");
            return (Criteria) this;
        }

        public Criteria andIctRemarkGreaterThan(String value) {
            addCriterion("ict_remark >", value, "ictRemark");
            return (Criteria) this;
        }

        public Criteria andIctRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ict_remark >=", value, "ictRemark");
            return (Criteria) this;
        }

        public Criteria andIctRemarkLessThan(String value) {
            addCriterion("ict_remark <", value, "ictRemark");
            return (Criteria) this;
        }

        public Criteria andIctRemarkLessThanOrEqualTo(String value) {
            addCriterion("ict_remark <=", value, "ictRemark");
            return (Criteria) this;
        }

        public Criteria andIctRemarkLike(String value) {
            addCriterion("ict_remark like", value, "ictRemark");
            return (Criteria) this;
        }

        public Criteria andIctRemarkNotLike(String value) {
            addCriterion("ict_remark not like", value, "ictRemark");
            return (Criteria) this;
        }

        public Criteria andIctRemarkIn(List<String> values) {
            addCriterion("ict_remark in", values, "ictRemark");
            return (Criteria) this;
        }

        public Criteria andIctRemarkNotIn(List<String> values) {
            addCriterion("ict_remark not in", values, "ictRemark");
            return (Criteria) this;
        }

        public Criteria andIctRemarkBetween(String value1, String value2) {
            addCriterion("ict_remark between", value1, value2, "ictRemark");
            return (Criteria) this;
        }

        public Criteria andIctRemarkNotBetween(String value1, String value2) {
            addCriterion("ict_remark not between", value1, value2, "ictRemark");
            return (Criteria) this;
        }

        public Criteria andIctAuditingIsNull() {
            addCriterion("ict_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andIctAuditingIsNotNull() {
            addCriterion("ict_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andIctAuditingEqualTo(String value) {
            addCriterion("ict_Auditing =", value, "ictAuditing");
            return (Criteria) this;
        }

        public Criteria andIctAuditingNotEqualTo(String value) {
            addCriterion("ict_Auditing <>", value, "ictAuditing");
            return (Criteria) this;
        }

        public Criteria andIctAuditingGreaterThan(String value) {
            addCriterion("ict_Auditing >", value, "ictAuditing");
            return (Criteria) this;
        }

        public Criteria andIctAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("ict_Auditing >=", value, "ictAuditing");
            return (Criteria) this;
        }

        public Criteria andIctAuditingLessThan(String value) {
            addCriterion("ict_Auditing <", value, "ictAuditing");
            return (Criteria) this;
        }

        public Criteria andIctAuditingLessThanOrEqualTo(String value) {
            addCriterion("ict_Auditing <=", value, "ictAuditing");
            return (Criteria) this;
        }

        public Criteria andIctAuditingLike(String value) {
            addCriterion("ict_Auditing like", value, "ictAuditing");
            return (Criteria) this;
        }

        public Criteria andIctAuditingNotLike(String value) {
            addCriterion("ict_Auditing not like", value, "ictAuditing");
            return (Criteria) this;
        }

        public Criteria andIctAuditingIn(List<String> values) {
            addCriterion("ict_Auditing in", values, "ictAuditing");
            return (Criteria) this;
        }

        public Criteria andIctAuditingNotIn(List<String> values) {
            addCriterion("ict_Auditing not in", values, "ictAuditing");
            return (Criteria) this;
        }

        public Criteria andIctAuditingBetween(String value1, String value2) {
            addCriterion("ict_Auditing between", value1, value2, "ictAuditing");
            return (Criteria) this;
        }

        public Criteria andIctAuditingNotBetween(String value1, String value2) {
            addCriterion("ict_Auditing not between", value1, value2, "ictAuditing");
            return (Criteria) this;
        }

        public Criteria andIctYnIsNull() {
            addCriterion("ict_yn is null");
            return (Criteria) this;
        }

        public Criteria andIctYnIsNotNull() {
            addCriterion("ict_yn is not null");
            return (Criteria) this;
        }

        public Criteria andIctYnEqualTo(String value) {
            addCriterion("ict_yn =", value, "ictYn");
            return (Criteria) this;
        }

        public Criteria andIctYnNotEqualTo(String value) {
            addCriterion("ict_yn <>", value, "ictYn");
            return (Criteria) this;
        }

        public Criteria andIctYnGreaterThan(String value) {
            addCriterion("ict_yn >", value, "ictYn");
            return (Criteria) this;
        }

        public Criteria andIctYnGreaterThanOrEqualTo(String value) {
            addCriterion("ict_yn >=", value, "ictYn");
            return (Criteria) this;
        }

        public Criteria andIctYnLessThan(String value) {
            addCriterion("ict_yn <", value, "ictYn");
            return (Criteria) this;
        }

        public Criteria andIctYnLessThanOrEqualTo(String value) {
            addCriterion("ict_yn <=", value, "ictYn");
            return (Criteria) this;
        }

        public Criteria andIctYnLike(String value) {
            addCriterion("ict_yn like", value, "ictYn");
            return (Criteria) this;
        }

        public Criteria andIctYnNotLike(String value) {
            addCriterion("ict_yn not like", value, "ictYn");
            return (Criteria) this;
        }

        public Criteria andIctYnIn(List<String> values) {
            addCriterion("ict_yn in", values, "ictYn");
            return (Criteria) this;
        }

        public Criteria andIctYnNotIn(List<String> values) {
            addCriterion("ict_yn not in", values, "ictYn");
            return (Criteria) this;
        }

        public Criteria andIctYnBetween(String value1, String value2) {
            addCriterion("ict_yn between", value1, value2, "ictYn");
            return (Criteria) this;
        }

        public Criteria andIctYnNotBetween(String value1, String value2) {
            addCriterion("ict_yn not between", value1, value2, "ictYn");
            return (Criteria) this;
        }

        public Criteria andIctCustom1IsNull() {
            addCriterion("ict_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andIctCustom1IsNotNull() {
            addCriterion("ict_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andIctCustom1EqualTo(String value) {
            addCriterion("ict_custom1 =", value, "ictCustom1");
            return (Criteria) this;
        }

        public Criteria andIctCustom1NotEqualTo(String value) {
            addCriterion("ict_custom1 <>", value, "ictCustom1");
            return (Criteria) this;
        }

        public Criteria andIctCustom1GreaterThan(String value) {
            addCriterion("ict_custom1 >", value, "ictCustom1");
            return (Criteria) this;
        }

        public Criteria andIctCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("ict_custom1 >=", value, "ictCustom1");
            return (Criteria) this;
        }

        public Criteria andIctCustom1LessThan(String value) {
            addCriterion("ict_custom1 <", value, "ictCustom1");
            return (Criteria) this;
        }

        public Criteria andIctCustom1LessThanOrEqualTo(String value) {
            addCriterion("ict_custom1 <=", value, "ictCustom1");
            return (Criteria) this;
        }

        public Criteria andIctCustom1Like(String value) {
            addCriterion("ict_custom1 like", value, "ictCustom1");
            return (Criteria) this;
        }

        public Criteria andIctCustom1NotLike(String value) {
            addCriterion("ict_custom1 not like", value, "ictCustom1");
            return (Criteria) this;
        }

        public Criteria andIctCustom1In(List<String> values) {
            addCriterion("ict_custom1 in", values, "ictCustom1");
            return (Criteria) this;
        }

        public Criteria andIctCustom1NotIn(List<String> values) {
            addCriterion("ict_custom1 not in", values, "ictCustom1");
            return (Criteria) this;
        }

        public Criteria andIctCustom1Between(String value1, String value2) {
            addCriterion("ict_custom1 between", value1, value2, "ictCustom1");
            return (Criteria) this;
        }

        public Criteria andIctCustom1NotBetween(String value1, String value2) {
            addCriterion("ict_custom1 not between", value1, value2, "ictCustom1");
            return (Criteria) this;
        }

        public Criteria andIctCustom2IsNull() {
            addCriterion("ict_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andIctCustom2IsNotNull() {
            addCriterion("ict_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andIctCustom2EqualTo(String value) {
            addCriterion("ict_custom2 =", value, "ictCustom2");
            return (Criteria) this;
        }

        public Criteria andIctCustom2NotEqualTo(String value) {
            addCriterion("ict_custom2 <>", value, "ictCustom2");
            return (Criteria) this;
        }

        public Criteria andIctCustom2GreaterThan(String value) {
            addCriterion("ict_custom2 >", value, "ictCustom2");
            return (Criteria) this;
        }

        public Criteria andIctCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("ict_custom2 >=", value, "ictCustom2");
            return (Criteria) this;
        }

        public Criteria andIctCustom2LessThan(String value) {
            addCriterion("ict_custom2 <", value, "ictCustom2");
            return (Criteria) this;
        }

        public Criteria andIctCustom2LessThanOrEqualTo(String value) {
            addCriterion("ict_custom2 <=", value, "ictCustom2");
            return (Criteria) this;
        }

        public Criteria andIctCustom2Like(String value) {
            addCriterion("ict_custom2 like", value, "ictCustom2");
            return (Criteria) this;
        }

        public Criteria andIctCustom2NotLike(String value) {
            addCriterion("ict_custom2 not like", value, "ictCustom2");
            return (Criteria) this;
        }

        public Criteria andIctCustom2In(List<String> values) {
            addCriterion("ict_custom2 in", values, "ictCustom2");
            return (Criteria) this;
        }

        public Criteria andIctCustom2NotIn(List<String> values) {
            addCriterion("ict_custom2 not in", values, "ictCustom2");
            return (Criteria) this;
        }

        public Criteria andIctCustom2Between(String value1, String value2) {
            addCriterion("ict_custom2 between", value1, value2, "ictCustom2");
            return (Criteria) this;
        }

        public Criteria andIctCustom2NotBetween(String value1, String value2) {
            addCriterion("ict_custom2 not between", value1, value2, "ictCustom2");
            return (Criteria) this;
        }

        public Criteria andIctCustom3IsNull() {
            addCriterion("ict_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andIctCustom3IsNotNull() {
            addCriterion("ict_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andIctCustom3EqualTo(String value) {
            addCriterion("ict_custom3 =", value, "ictCustom3");
            return (Criteria) this;
        }

        public Criteria andIctCustom3NotEqualTo(String value) {
            addCriterion("ict_custom3 <>", value, "ictCustom3");
            return (Criteria) this;
        }

        public Criteria andIctCustom3GreaterThan(String value) {
            addCriterion("ict_custom3 >", value, "ictCustom3");
            return (Criteria) this;
        }

        public Criteria andIctCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("ict_custom3 >=", value, "ictCustom3");
            return (Criteria) this;
        }

        public Criteria andIctCustom3LessThan(String value) {
            addCriterion("ict_custom3 <", value, "ictCustom3");
            return (Criteria) this;
        }

        public Criteria andIctCustom3LessThanOrEqualTo(String value) {
            addCriterion("ict_custom3 <=", value, "ictCustom3");
            return (Criteria) this;
        }

        public Criteria andIctCustom3Like(String value) {
            addCriterion("ict_custom3 like", value, "ictCustom3");
            return (Criteria) this;
        }

        public Criteria andIctCustom3NotLike(String value) {
            addCriterion("ict_custom3 not like", value, "ictCustom3");
            return (Criteria) this;
        }

        public Criteria andIctCustom3In(List<String> values) {
            addCriterion("ict_custom3 in", values, "ictCustom3");
            return (Criteria) this;
        }

        public Criteria andIctCustom3NotIn(List<String> values) {
            addCriterion("ict_custom3 not in", values, "ictCustom3");
            return (Criteria) this;
        }

        public Criteria andIctCustom3Between(String value1, String value2) {
            addCriterion("ict_custom3 between", value1, value2, "ictCustom3");
            return (Criteria) this;
        }

        public Criteria andIctCustom3NotBetween(String value1, String value2) {
            addCriterion("ict_custom3 not between", value1, value2, "ictCustom3");
            return (Criteria) this;
        }

        public Criteria andIctCustom4IsNull() {
            addCriterion("ict_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andIctCustom4IsNotNull() {
            addCriterion("ict_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andIctCustom4EqualTo(String value) {
            addCriterion("ict_custom4 =", value, "ictCustom4");
            return (Criteria) this;
        }

        public Criteria andIctCustom4NotEqualTo(String value) {
            addCriterion("ict_custom4 <>", value, "ictCustom4");
            return (Criteria) this;
        }

        public Criteria andIctCustom4GreaterThan(String value) {
            addCriterion("ict_custom4 >", value, "ictCustom4");
            return (Criteria) this;
        }

        public Criteria andIctCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("ict_custom4 >=", value, "ictCustom4");
            return (Criteria) this;
        }

        public Criteria andIctCustom4LessThan(String value) {
            addCriterion("ict_custom4 <", value, "ictCustom4");
            return (Criteria) this;
        }

        public Criteria andIctCustom4LessThanOrEqualTo(String value) {
            addCriterion("ict_custom4 <=", value, "ictCustom4");
            return (Criteria) this;
        }

        public Criteria andIctCustom4Like(String value) {
            addCriterion("ict_custom4 like", value, "ictCustom4");
            return (Criteria) this;
        }

        public Criteria andIctCustom4NotLike(String value) {
            addCriterion("ict_custom4 not like", value, "ictCustom4");
            return (Criteria) this;
        }

        public Criteria andIctCustom4In(List<String> values) {
            addCriterion("ict_custom4 in", values, "ictCustom4");
            return (Criteria) this;
        }

        public Criteria andIctCustom4NotIn(List<String> values) {
            addCriterion("ict_custom4 not in", values, "ictCustom4");
            return (Criteria) this;
        }

        public Criteria andIctCustom4Between(String value1, String value2) {
            addCriterion("ict_custom4 between", value1, value2, "ictCustom4");
            return (Criteria) this;
        }

        public Criteria andIctCustom4NotBetween(String value1, String value2) {
            addCriterion("ict_custom4 not between", value1, value2, "ictCustom4");
            return (Criteria) this;
        }

        public Criteria andIctCustom5IsNull() {
            addCriterion("ict_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andIctCustom5IsNotNull() {
            addCriterion("ict_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andIctCustom5EqualTo(String value) {
            addCriterion("ict_custom5 =", value, "ictCustom5");
            return (Criteria) this;
        }

        public Criteria andIctCustom5NotEqualTo(String value) {
            addCriterion("ict_custom5 <>", value, "ictCustom5");
            return (Criteria) this;
        }

        public Criteria andIctCustom5GreaterThan(String value) {
            addCriterion("ict_custom5 >", value, "ictCustom5");
            return (Criteria) this;
        }

        public Criteria andIctCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("ict_custom5 >=", value, "ictCustom5");
            return (Criteria) this;
        }

        public Criteria andIctCustom5LessThan(String value) {
            addCriterion("ict_custom5 <", value, "ictCustom5");
            return (Criteria) this;
        }

        public Criteria andIctCustom5LessThanOrEqualTo(String value) {
            addCriterion("ict_custom5 <=", value, "ictCustom5");
            return (Criteria) this;
        }

        public Criteria andIctCustom5Like(String value) {
            addCriterion("ict_custom5 like", value, "ictCustom5");
            return (Criteria) this;
        }

        public Criteria andIctCustom5NotLike(String value) {
            addCriterion("ict_custom5 not like", value, "ictCustom5");
            return (Criteria) this;
        }

        public Criteria andIctCustom5In(List<String> values) {
            addCriterion("ict_custom5 in", values, "ictCustom5");
            return (Criteria) this;
        }

        public Criteria andIctCustom5NotIn(List<String> values) {
            addCriterion("ict_custom5 not in", values, "ictCustom5");
            return (Criteria) this;
        }

        public Criteria andIctCustom5Between(String value1, String value2) {
            addCriterion("ict_custom5 between", value1, value2, "ictCustom5");
            return (Criteria) this;
        }

        public Criteria andIctCustom5NotBetween(String value1, String value2) {
            addCriterion("ict_custom5 not between", value1, value2, "ictCustom5");
            return (Criteria) this;
        }

        public Criteria andIctCustom6IsNull() {
            addCriterion("ict_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andIctCustom6IsNotNull() {
            addCriterion("ict_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andIctCustom6EqualTo(String value) {
            addCriterion("ict_custom6 =", value, "ictCustom6");
            return (Criteria) this;
        }

        public Criteria andIctCustom6NotEqualTo(String value) {
            addCriterion("ict_custom6 <>", value, "ictCustom6");
            return (Criteria) this;
        }

        public Criteria andIctCustom6GreaterThan(String value) {
            addCriterion("ict_custom6 >", value, "ictCustom6");
            return (Criteria) this;
        }

        public Criteria andIctCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("ict_custom6 >=", value, "ictCustom6");
            return (Criteria) this;
        }

        public Criteria andIctCustom6LessThan(String value) {
            addCriterion("ict_custom6 <", value, "ictCustom6");
            return (Criteria) this;
        }

        public Criteria andIctCustom6LessThanOrEqualTo(String value) {
            addCriterion("ict_custom6 <=", value, "ictCustom6");
            return (Criteria) this;
        }

        public Criteria andIctCustom6Like(String value) {
            addCriterion("ict_custom6 like", value, "ictCustom6");
            return (Criteria) this;
        }

        public Criteria andIctCustom6NotLike(String value) {
            addCriterion("ict_custom6 not like", value, "ictCustom6");
            return (Criteria) this;
        }

        public Criteria andIctCustom6In(List<String> values) {
            addCriterion("ict_custom6 in", values, "ictCustom6");
            return (Criteria) this;
        }

        public Criteria andIctCustom6NotIn(List<String> values) {
            addCriterion("ict_custom6 not in", values, "ictCustom6");
            return (Criteria) this;
        }

        public Criteria andIctCustom6Between(String value1, String value2) {
            addCriterion("ict_custom6 between", value1, value2, "ictCustom6");
            return (Criteria) this;
        }

        public Criteria andIctCustom6NotBetween(String value1, String value2) {
            addCriterion("ict_custom6 not between", value1, value2, "ictCustom6");
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