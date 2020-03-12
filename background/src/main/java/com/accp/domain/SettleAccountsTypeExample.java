package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SettleAccountsTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettleAccountsTypeExample() {
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

        public Criteria andSatIdIsNull() {
            addCriterion("sat_id is null");
            return (Criteria) this;
        }

        public Criteria andSatIdIsNotNull() {
            addCriterion("sat_id is not null");
            return (Criteria) this;
        }

        public Criteria andSatIdEqualTo(String value) {
            addCriterion("sat_id =", value, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdNotEqualTo(String value) {
            addCriterion("sat_id <>", value, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdGreaterThan(String value) {
            addCriterion("sat_id >", value, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdGreaterThanOrEqualTo(String value) {
            addCriterion("sat_id >=", value, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdLessThan(String value) {
            addCriterion("sat_id <", value, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdLessThanOrEqualTo(String value) {
            addCriterion("sat_id <=", value, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdLike(String value) {
            addCriterion("sat_id like", value, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdNotLike(String value) {
            addCriterion("sat_id not like", value, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdIn(List<String> values) {
            addCriterion("sat_id in", values, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdNotIn(List<String> values) {
            addCriterion("sat_id not in", values, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdBetween(String value1, String value2) {
            addCriterion("sat_id between", value1, value2, "satId");
            return (Criteria) this;
        }

        public Criteria andSatIdNotBetween(String value1, String value2) {
            addCriterion("sat_id not between", value1, value2, "satId");
            return (Criteria) this;
        }

        public Criteria andSatNameIsNull() {
            addCriterion("sat_name is null");
            return (Criteria) this;
        }

        public Criteria andSatNameIsNotNull() {
            addCriterion("sat_name is not null");
            return (Criteria) this;
        }

        public Criteria andSatNameEqualTo(String value) {
            addCriterion("sat_name =", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameNotEqualTo(String value) {
            addCriterion("sat_name <>", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameGreaterThan(String value) {
            addCriterion("sat_name >", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameGreaterThanOrEqualTo(String value) {
            addCriterion("sat_name >=", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameLessThan(String value) {
            addCriterion("sat_name <", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameLessThanOrEqualTo(String value) {
            addCriterion("sat_name <=", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameLike(String value) {
            addCriterion("sat_name like", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameNotLike(String value) {
            addCriterion("sat_name not like", value, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameIn(List<String> values) {
            addCriterion("sat_name in", values, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameNotIn(List<String> values) {
            addCriterion("sat_name not in", values, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameBetween(String value1, String value2) {
            addCriterion("sat_name between", value1, value2, "satName");
            return (Criteria) this;
        }

        public Criteria andSatNameNotBetween(String value1, String value2) {
            addCriterion("sat_name not between", value1, value2, "satName");
            return (Criteria) this;
        }

        public Criteria andSatEnglishNameIsNull() {
            addCriterion("sat_english_name is null");
            return (Criteria) this;
        }

        public Criteria andSatEnglishNameIsNotNull() {
            addCriterion("sat_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andSatEnglishNameEqualTo(String value) {
            addCriterion("sat_english_name =", value, "satEnglishName");
            return (Criteria) this;
        }

        public Criteria andSatEnglishNameNotEqualTo(String value) {
            addCriterion("sat_english_name <>", value, "satEnglishName");
            return (Criteria) this;
        }

        public Criteria andSatEnglishNameGreaterThan(String value) {
            addCriterion("sat_english_name >", value, "satEnglishName");
            return (Criteria) this;
        }

        public Criteria andSatEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("sat_english_name >=", value, "satEnglishName");
            return (Criteria) this;
        }

        public Criteria andSatEnglishNameLessThan(String value) {
            addCriterion("sat_english_name <", value, "satEnglishName");
            return (Criteria) this;
        }

        public Criteria andSatEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("sat_english_name <=", value, "satEnglishName");
            return (Criteria) this;
        }

        public Criteria andSatEnglishNameLike(String value) {
            addCriterion("sat_english_name like", value, "satEnglishName");
            return (Criteria) this;
        }

        public Criteria andSatEnglishNameNotLike(String value) {
            addCriterion("sat_english_name not like", value, "satEnglishName");
            return (Criteria) this;
        }

        public Criteria andSatEnglishNameIn(List<String> values) {
            addCriterion("sat_english_name in", values, "satEnglishName");
            return (Criteria) this;
        }

        public Criteria andSatEnglishNameNotIn(List<String> values) {
            addCriterion("sat_english_name not in", values, "satEnglishName");
            return (Criteria) this;
        }

        public Criteria andSatEnglishNameBetween(String value1, String value2) {
            addCriterion("sat_english_name between", value1, value2, "satEnglishName");
            return (Criteria) this;
        }

        public Criteria andSatEnglishNameNotBetween(String value1, String value2) {
            addCriterion("sat_english_name not between", value1, value2, "satEnglishName");
            return (Criteria) this;
        }

        public Criteria andSatSubjectIsNull() {
            addCriterion("sat_subject is null");
            return (Criteria) this;
        }

        public Criteria andSatSubjectIsNotNull() {
            addCriterion("sat_subject is not null");
            return (Criteria) this;
        }

        public Criteria andSatSubjectEqualTo(String value) {
            addCriterion("sat_subject =", value, "satSubject");
            return (Criteria) this;
        }

        public Criteria andSatSubjectNotEqualTo(String value) {
            addCriterion("sat_subject <>", value, "satSubject");
            return (Criteria) this;
        }

        public Criteria andSatSubjectGreaterThan(String value) {
            addCriterion("sat_subject >", value, "satSubject");
            return (Criteria) this;
        }

        public Criteria andSatSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("sat_subject >=", value, "satSubject");
            return (Criteria) this;
        }

        public Criteria andSatSubjectLessThan(String value) {
            addCriterion("sat_subject <", value, "satSubject");
            return (Criteria) this;
        }

        public Criteria andSatSubjectLessThanOrEqualTo(String value) {
            addCriterion("sat_subject <=", value, "satSubject");
            return (Criteria) this;
        }

        public Criteria andSatSubjectLike(String value) {
            addCriterion("sat_subject like", value, "satSubject");
            return (Criteria) this;
        }

        public Criteria andSatSubjectNotLike(String value) {
            addCriterion("sat_subject not like", value, "satSubject");
            return (Criteria) this;
        }

        public Criteria andSatSubjectIn(List<String> values) {
            addCriterion("sat_subject in", values, "satSubject");
            return (Criteria) this;
        }

        public Criteria andSatSubjectNotIn(List<String> values) {
            addCriterion("sat_subject not in", values, "satSubject");
            return (Criteria) this;
        }

        public Criteria andSatSubjectBetween(String value1, String value2) {
            addCriterion("sat_subject between", value1, value2, "satSubject");
            return (Criteria) this;
        }

        public Criteria andSatSubjectNotBetween(String value1, String value2) {
            addCriterion("sat_subject not between", value1, value2, "satSubject");
            return (Criteria) this;
        }

        public Criteria andSatRemarkIsNull() {
            addCriterion("sat_remark is null");
            return (Criteria) this;
        }

        public Criteria andSatRemarkIsNotNull() {
            addCriterion("sat_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSatRemarkEqualTo(String value) {
            addCriterion("sat_remark =", value, "satRemark");
            return (Criteria) this;
        }

        public Criteria andSatRemarkNotEqualTo(String value) {
            addCriterion("sat_remark <>", value, "satRemark");
            return (Criteria) this;
        }

        public Criteria andSatRemarkGreaterThan(String value) {
            addCriterion("sat_remark >", value, "satRemark");
            return (Criteria) this;
        }

        public Criteria andSatRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sat_remark >=", value, "satRemark");
            return (Criteria) this;
        }

        public Criteria andSatRemarkLessThan(String value) {
            addCriterion("sat_remark <", value, "satRemark");
            return (Criteria) this;
        }

        public Criteria andSatRemarkLessThanOrEqualTo(String value) {
            addCriterion("sat_remark <=", value, "satRemark");
            return (Criteria) this;
        }

        public Criteria andSatRemarkLike(String value) {
            addCriterion("sat_remark like", value, "satRemark");
            return (Criteria) this;
        }

        public Criteria andSatRemarkNotLike(String value) {
            addCriterion("sat_remark not like", value, "satRemark");
            return (Criteria) this;
        }

        public Criteria andSatRemarkIn(List<String> values) {
            addCriterion("sat_remark in", values, "satRemark");
            return (Criteria) this;
        }

        public Criteria andSatRemarkNotIn(List<String> values) {
            addCriterion("sat_remark not in", values, "satRemark");
            return (Criteria) this;
        }

        public Criteria andSatRemarkBetween(String value1, String value2) {
            addCriterion("sat_remark between", value1, value2, "satRemark");
            return (Criteria) this;
        }

        public Criteria andSatRemarkNotBetween(String value1, String value2) {
            addCriterion("sat_remark not between", value1, value2, "satRemark");
            return (Criteria) this;
        }

        public Criteria andSatAuditingIsNull() {
            addCriterion("sat_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andSatAuditingIsNotNull() {
            addCriterion("sat_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andSatAuditingEqualTo(String value) {
            addCriterion("sat_Auditing =", value, "satAuditing");
            return (Criteria) this;
        }

        public Criteria andSatAuditingNotEqualTo(String value) {
            addCriterion("sat_Auditing <>", value, "satAuditing");
            return (Criteria) this;
        }

        public Criteria andSatAuditingGreaterThan(String value) {
            addCriterion("sat_Auditing >", value, "satAuditing");
            return (Criteria) this;
        }

        public Criteria andSatAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("sat_Auditing >=", value, "satAuditing");
            return (Criteria) this;
        }

        public Criteria andSatAuditingLessThan(String value) {
            addCriterion("sat_Auditing <", value, "satAuditing");
            return (Criteria) this;
        }

        public Criteria andSatAuditingLessThanOrEqualTo(String value) {
            addCriterion("sat_Auditing <=", value, "satAuditing");
            return (Criteria) this;
        }

        public Criteria andSatAuditingLike(String value) {
            addCriterion("sat_Auditing like", value, "satAuditing");
            return (Criteria) this;
        }

        public Criteria andSatAuditingNotLike(String value) {
            addCriterion("sat_Auditing not like", value, "satAuditing");
            return (Criteria) this;
        }

        public Criteria andSatAuditingIn(List<String> values) {
            addCriterion("sat_Auditing in", values, "satAuditing");
            return (Criteria) this;
        }

        public Criteria andSatAuditingNotIn(List<String> values) {
            addCriterion("sat_Auditing not in", values, "satAuditing");
            return (Criteria) this;
        }

        public Criteria andSatAuditingBetween(String value1, String value2) {
            addCriterion("sat_Auditing between", value1, value2, "satAuditing");
            return (Criteria) this;
        }

        public Criteria andSatAuditingNotBetween(String value1, String value2) {
            addCriterion("sat_Auditing not between", value1, value2, "satAuditing");
            return (Criteria) this;
        }

        public Criteria andSatYnIsNull() {
            addCriterion("sat_yn is null");
            return (Criteria) this;
        }

        public Criteria andSatYnIsNotNull() {
            addCriterion("sat_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSatYnEqualTo(String value) {
            addCriterion("sat_yn =", value, "satYn");
            return (Criteria) this;
        }

        public Criteria andSatYnNotEqualTo(String value) {
            addCriterion("sat_yn <>", value, "satYn");
            return (Criteria) this;
        }

        public Criteria andSatYnGreaterThan(String value) {
            addCriterion("sat_yn >", value, "satYn");
            return (Criteria) this;
        }

        public Criteria andSatYnGreaterThanOrEqualTo(String value) {
            addCriterion("sat_yn >=", value, "satYn");
            return (Criteria) this;
        }

        public Criteria andSatYnLessThan(String value) {
            addCriterion("sat_yn <", value, "satYn");
            return (Criteria) this;
        }

        public Criteria andSatYnLessThanOrEqualTo(String value) {
            addCriterion("sat_yn <=", value, "satYn");
            return (Criteria) this;
        }

        public Criteria andSatYnLike(String value) {
            addCriterion("sat_yn like", value, "satYn");
            return (Criteria) this;
        }

        public Criteria andSatYnNotLike(String value) {
            addCriterion("sat_yn not like", value, "satYn");
            return (Criteria) this;
        }

        public Criteria andSatYnIn(List<String> values) {
            addCriterion("sat_yn in", values, "satYn");
            return (Criteria) this;
        }

        public Criteria andSatYnNotIn(List<String> values) {
            addCriterion("sat_yn not in", values, "satYn");
            return (Criteria) this;
        }

        public Criteria andSatYnBetween(String value1, String value2) {
            addCriterion("sat_yn between", value1, value2, "satYn");
            return (Criteria) this;
        }

        public Criteria andSatYnNotBetween(String value1, String value2) {
            addCriterion("sat_yn not between", value1, value2, "satYn");
            return (Criteria) this;
        }

        public Criteria andSatCustom1IsNull() {
            addCriterion("sat_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andSatCustom1IsNotNull() {
            addCriterion("sat_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andSatCustom1EqualTo(String value) {
            addCriterion("sat_custom1 =", value, "satCustom1");
            return (Criteria) this;
        }

        public Criteria andSatCustom1NotEqualTo(String value) {
            addCriterion("sat_custom1 <>", value, "satCustom1");
            return (Criteria) this;
        }

        public Criteria andSatCustom1GreaterThan(String value) {
            addCriterion("sat_custom1 >", value, "satCustom1");
            return (Criteria) this;
        }

        public Criteria andSatCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("sat_custom1 >=", value, "satCustom1");
            return (Criteria) this;
        }

        public Criteria andSatCustom1LessThan(String value) {
            addCriterion("sat_custom1 <", value, "satCustom1");
            return (Criteria) this;
        }

        public Criteria andSatCustom1LessThanOrEqualTo(String value) {
            addCriterion("sat_custom1 <=", value, "satCustom1");
            return (Criteria) this;
        }

        public Criteria andSatCustom1Like(String value) {
            addCriterion("sat_custom1 like", value, "satCustom1");
            return (Criteria) this;
        }

        public Criteria andSatCustom1NotLike(String value) {
            addCriterion("sat_custom1 not like", value, "satCustom1");
            return (Criteria) this;
        }

        public Criteria andSatCustom1In(List<String> values) {
            addCriterion("sat_custom1 in", values, "satCustom1");
            return (Criteria) this;
        }

        public Criteria andSatCustom1NotIn(List<String> values) {
            addCriterion("sat_custom1 not in", values, "satCustom1");
            return (Criteria) this;
        }

        public Criteria andSatCustom1Between(String value1, String value2) {
            addCriterion("sat_custom1 between", value1, value2, "satCustom1");
            return (Criteria) this;
        }

        public Criteria andSatCustom1NotBetween(String value1, String value2) {
            addCriterion("sat_custom1 not between", value1, value2, "satCustom1");
            return (Criteria) this;
        }

        public Criteria andSatCustom2IsNull() {
            addCriterion("sat_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andSatCustom2IsNotNull() {
            addCriterion("sat_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andSatCustom2EqualTo(String value) {
            addCriterion("sat_custom2 =", value, "satCustom2");
            return (Criteria) this;
        }

        public Criteria andSatCustom2NotEqualTo(String value) {
            addCriterion("sat_custom2 <>", value, "satCustom2");
            return (Criteria) this;
        }

        public Criteria andSatCustom2GreaterThan(String value) {
            addCriterion("sat_custom2 >", value, "satCustom2");
            return (Criteria) this;
        }

        public Criteria andSatCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("sat_custom2 >=", value, "satCustom2");
            return (Criteria) this;
        }

        public Criteria andSatCustom2LessThan(String value) {
            addCriterion("sat_custom2 <", value, "satCustom2");
            return (Criteria) this;
        }

        public Criteria andSatCustom2LessThanOrEqualTo(String value) {
            addCriterion("sat_custom2 <=", value, "satCustom2");
            return (Criteria) this;
        }

        public Criteria andSatCustom2Like(String value) {
            addCriterion("sat_custom2 like", value, "satCustom2");
            return (Criteria) this;
        }

        public Criteria andSatCustom2NotLike(String value) {
            addCriterion("sat_custom2 not like", value, "satCustom2");
            return (Criteria) this;
        }

        public Criteria andSatCustom2In(List<String> values) {
            addCriterion("sat_custom2 in", values, "satCustom2");
            return (Criteria) this;
        }

        public Criteria andSatCustom2NotIn(List<String> values) {
            addCriterion("sat_custom2 not in", values, "satCustom2");
            return (Criteria) this;
        }

        public Criteria andSatCustom2Between(String value1, String value2) {
            addCriterion("sat_custom2 between", value1, value2, "satCustom2");
            return (Criteria) this;
        }

        public Criteria andSatCustom2NotBetween(String value1, String value2) {
            addCriterion("sat_custom2 not between", value1, value2, "satCustom2");
            return (Criteria) this;
        }

        public Criteria andSatCustom3IsNull() {
            addCriterion("sat_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andSatCustom3IsNotNull() {
            addCriterion("sat_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andSatCustom3EqualTo(String value) {
            addCriterion("sat_custom3 =", value, "satCustom3");
            return (Criteria) this;
        }

        public Criteria andSatCustom3NotEqualTo(String value) {
            addCriterion("sat_custom3 <>", value, "satCustom3");
            return (Criteria) this;
        }

        public Criteria andSatCustom3GreaterThan(String value) {
            addCriterion("sat_custom3 >", value, "satCustom3");
            return (Criteria) this;
        }

        public Criteria andSatCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("sat_custom3 >=", value, "satCustom3");
            return (Criteria) this;
        }

        public Criteria andSatCustom3LessThan(String value) {
            addCriterion("sat_custom3 <", value, "satCustom3");
            return (Criteria) this;
        }

        public Criteria andSatCustom3LessThanOrEqualTo(String value) {
            addCriterion("sat_custom3 <=", value, "satCustom3");
            return (Criteria) this;
        }

        public Criteria andSatCustom3Like(String value) {
            addCriterion("sat_custom3 like", value, "satCustom3");
            return (Criteria) this;
        }

        public Criteria andSatCustom3NotLike(String value) {
            addCriterion("sat_custom3 not like", value, "satCustom3");
            return (Criteria) this;
        }

        public Criteria andSatCustom3In(List<String> values) {
            addCriterion("sat_custom3 in", values, "satCustom3");
            return (Criteria) this;
        }

        public Criteria andSatCustom3NotIn(List<String> values) {
            addCriterion("sat_custom3 not in", values, "satCustom3");
            return (Criteria) this;
        }

        public Criteria andSatCustom3Between(String value1, String value2) {
            addCriterion("sat_custom3 between", value1, value2, "satCustom3");
            return (Criteria) this;
        }

        public Criteria andSatCustom3NotBetween(String value1, String value2) {
            addCriterion("sat_custom3 not between", value1, value2, "satCustom3");
            return (Criteria) this;
        }

        public Criteria andSatCustom4IsNull() {
            addCriterion("sat_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andSatCustom4IsNotNull() {
            addCriterion("sat_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andSatCustom4EqualTo(String value) {
            addCriterion("sat_custom4 =", value, "satCustom4");
            return (Criteria) this;
        }

        public Criteria andSatCustom4NotEqualTo(String value) {
            addCriterion("sat_custom4 <>", value, "satCustom4");
            return (Criteria) this;
        }

        public Criteria andSatCustom4GreaterThan(String value) {
            addCriterion("sat_custom4 >", value, "satCustom4");
            return (Criteria) this;
        }

        public Criteria andSatCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("sat_custom4 >=", value, "satCustom4");
            return (Criteria) this;
        }

        public Criteria andSatCustom4LessThan(String value) {
            addCriterion("sat_custom4 <", value, "satCustom4");
            return (Criteria) this;
        }

        public Criteria andSatCustom4LessThanOrEqualTo(String value) {
            addCriterion("sat_custom4 <=", value, "satCustom4");
            return (Criteria) this;
        }

        public Criteria andSatCustom4Like(String value) {
            addCriterion("sat_custom4 like", value, "satCustom4");
            return (Criteria) this;
        }

        public Criteria andSatCustom4NotLike(String value) {
            addCriterion("sat_custom4 not like", value, "satCustom4");
            return (Criteria) this;
        }

        public Criteria andSatCustom4In(List<String> values) {
            addCriterion("sat_custom4 in", values, "satCustom4");
            return (Criteria) this;
        }

        public Criteria andSatCustom4NotIn(List<String> values) {
            addCriterion("sat_custom4 not in", values, "satCustom4");
            return (Criteria) this;
        }

        public Criteria andSatCustom4Between(String value1, String value2) {
            addCriterion("sat_custom4 between", value1, value2, "satCustom4");
            return (Criteria) this;
        }

        public Criteria andSatCustom4NotBetween(String value1, String value2) {
            addCriterion("sat_custom4 not between", value1, value2, "satCustom4");
            return (Criteria) this;
        }

        public Criteria andSatCustom5IsNull() {
            addCriterion("sat_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andSatCustom5IsNotNull() {
            addCriterion("sat_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andSatCustom5EqualTo(String value) {
            addCriterion("sat_custom5 =", value, "satCustom5");
            return (Criteria) this;
        }

        public Criteria andSatCustom5NotEqualTo(String value) {
            addCriterion("sat_custom5 <>", value, "satCustom5");
            return (Criteria) this;
        }

        public Criteria andSatCustom5GreaterThan(String value) {
            addCriterion("sat_custom5 >", value, "satCustom5");
            return (Criteria) this;
        }

        public Criteria andSatCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("sat_custom5 >=", value, "satCustom5");
            return (Criteria) this;
        }

        public Criteria andSatCustom5LessThan(String value) {
            addCriterion("sat_custom5 <", value, "satCustom5");
            return (Criteria) this;
        }

        public Criteria andSatCustom5LessThanOrEqualTo(String value) {
            addCriterion("sat_custom5 <=", value, "satCustom5");
            return (Criteria) this;
        }

        public Criteria andSatCustom5Like(String value) {
            addCriterion("sat_custom5 like", value, "satCustom5");
            return (Criteria) this;
        }

        public Criteria andSatCustom5NotLike(String value) {
            addCriterion("sat_custom5 not like", value, "satCustom5");
            return (Criteria) this;
        }

        public Criteria andSatCustom5In(List<String> values) {
            addCriterion("sat_custom5 in", values, "satCustom5");
            return (Criteria) this;
        }

        public Criteria andSatCustom5NotIn(List<String> values) {
            addCriterion("sat_custom5 not in", values, "satCustom5");
            return (Criteria) this;
        }

        public Criteria andSatCustom5Between(String value1, String value2) {
            addCriterion("sat_custom5 between", value1, value2, "satCustom5");
            return (Criteria) this;
        }

        public Criteria andSatCustom5NotBetween(String value1, String value2) {
            addCriterion("sat_custom5 not between", value1, value2, "satCustom5");
            return (Criteria) this;
        }

        public Criteria andSatCustom6IsNull() {
            addCriterion("sat_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andSatCustom6IsNotNull() {
            addCriterion("sat_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andSatCustom6EqualTo(String value) {
            addCriterion("sat_custom6 =", value, "satCustom6");
            return (Criteria) this;
        }

        public Criteria andSatCustom6NotEqualTo(String value) {
            addCriterion("sat_custom6 <>", value, "satCustom6");
            return (Criteria) this;
        }

        public Criteria andSatCustom6GreaterThan(String value) {
            addCriterion("sat_custom6 >", value, "satCustom6");
            return (Criteria) this;
        }

        public Criteria andSatCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("sat_custom6 >=", value, "satCustom6");
            return (Criteria) this;
        }

        public Criteria andSatCustom6LessThan(String value) {
            addCriterion("sat_custom6 <", value, "satCustom6");
            return (Criteria) this;
        }

        public Criteria andSatCustom6LessThanOrEqualTo(String value) {
            addCriterion("sat_custom6 <=", value, "satCustom6");
            return (Criteria) this;
        }

        public Criteria andSatCustom6Like(String value) {
            addCriterion("sat_custom6 like", value, "satCustom6");
            return (Criteria) this;
        }

        public Criteria andSatCustom6NotLike(String value) {
            addCriterion("sat_custom6 not like", value, "satCustom6");
            return (Criteria) this;
        }

        public Criteria andSatCustom6In(List<String> values) {
            addCriterion("sat_custom6 in", values, "satCustom6");
            return (Criteria) this;
        }

        public Criteria andSatCustom6NotIn(List<String> values) {
            addCriterion("sat_custom6 not in", values, "satCustom6");
            return (Criteria) this;
        }

        public Criteria andSatCustom6Between(String value1, String value2) {
            addCriterion("sat_custom6 between", value1, value2, "satCustom6");
            return (Criteria) this;
        }

        public Criteria andSatCustom6NotBetween(String value1, String value2) {
            addCriterion("sat_custom6 not between", value1, value2, "satCustom6");
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