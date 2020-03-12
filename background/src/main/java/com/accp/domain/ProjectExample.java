package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectEnglishNameIsNull() {
            addCriterion("project_english_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectEnglishNameIsNotNull() {
            addCriterion("project_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEnglishNameEqualTo(String value) {
            addCriterion("project_english_name =", value, "projectEnglishName");
            return (Criteria) this;
        }

        public Criteria andProjectEnglishNameNotEqualTo(String value) {
            addCriterion("project_english_name <>", value, "projectEnglishName");
            return (Criteria) this;
        }

        public Criteria andProjectEnglishNameGreaterThan(String value) {
            addCriterion("project_english_name >", value, "projectEnglishName");
            return (Criteria) this;
        }

        public Criteria andProjectEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_english_name >=", value, "projectEnglishName");
            return (Criteria) this;
        }

        public Criteria andProjectEnglishNameLessThan(String value) {
            addCriterion("project_english_name <", value, "projectEnglishName");
            return (Criteria) this;
        }

        public Criteria andProjectEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("project_english_name <=", value, "projectEnglishName");
            return (Criteria) this;
        }

        public Criteria andProjectEnglishNameLike(String value) {
            addCriterion("project_english_name like", value, "projectEnglishName");
            return (Criteria) this;
        }

        public Criteria andProjectEnglishNameNotLike(String value) {
            addCriterion("project_english_name not like", value, "projectEnglishName");
            return (Criteria) this;
        }

        public Criteria andProjectEnglishNameIn(List<String> values) {
            addCriterion("project_english_name in", values, "projectEnglishName");
            return (Criteria) this;
        }

        public Criteria andProjectEnglishNameNotIn(List<String> values) {
            addCriterion("project_english_name not in", values, "projectEnglishName");
            return (Criteria) this;
        }

        public Criteria andProjectEnglishNameBetween(String value1, String value2) {
            addCriterion("project_english_name between", value1, value2, "projectEnglishName");
            return (Criteria) this;
        }

        public Criteria andProjectEnglishNameNotBetween(String value1, String value2) {
            addCriterion("project_english_name not between", value1, value2, "projectEnglishName");
            return (Criteria) this;
        }

        public Criteria andProjectAbateIsNull() {
            addCriterion("project_abate is null");
            return (Criteria) this;
        }

        public Criteria andProjectAbateIsNotNull() {
            addCriterion("project_abate is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAbateEqualTo(Date value) {
            addCriterionForJDBCDate("project_abate =", value, "projectAbate");
            return (Criteria) this;
        }

        public Criteria andProjectAbateNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_abate <>", value, "projectAbate");
            return (Criteria) this;
        }

        public Criteria andProjectAbateGreaterThan(Date value) {
            addCriterionForJDBCDate("project_abate >", value, "projectAbate");
            return (Criteria) this;
        }

        public Criteria andProjectAbateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_abate >=", value, "projectAbate");
            return (Criteria) this;
        }

        public Criteria andProjectAbateLessThan(Date value) {
            addCriterionForJDBCDate("project_abate <", value, "projectAbate");
            return (Criteria) this;
        }

        public Criteria andProjectAbateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_abate <=", value, "projectAbate");
            return (Criteria) this;
        }

        public Criteria andProjectAbateIn(List<Date> values) {
            addCriterionForJDBCDate("project_abate in", values, "projectAbate");
            return (Criteria) this;
        }

        public Criteria andProjectAbateNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_abate not in", values, "projectAbate");
            return (Criteria) this;
        }

        public Criteria andProjectAbateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_abate between", value1, value2, "projectAbate");
            return (Criteria) this;
        }

        public Criteria andProjectAbateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_abate not between", value1, value2, "projectAbate");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkIsNull() {
            addCriterion("project_remark is null");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkIsNotNull() {
            addCriterion("project_remark is not null");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkEqualTo(String value) {
            addCriterion("project_remark =", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkNotEqualTo(String value) {
            addCriterion("project_remark <>", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkGreaterThan(String value) {
            addCriterion("project_remark >", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("project_remark >=", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkLessThan(String value) {
            addCriterion("project_remark <", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkLessThanOrEqualTo(String value) {
            addCriterion("project_remark <=", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkLike(String value) {
            addCriterion("project_remark like", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkNotLike(String value) {
            addCriterion("project_remark not like", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkIn(List<String> values) {
            addCriterion("project_remark in", values, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkNotIn(List<String> values) {
            addCriterion("project_remark not in", values, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkBetween(String value1, String value2) {
            addCriterion("project_remark between", value1, value2, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkNotBetween(String value1, String value2) {
            addCriterion("project_remark not between", value1, value2, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectAuditingIsNull() {
            addCriterion("project_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andProjectAuditingIsNotNull() {
            addCriterion("project_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAuditingEqualTo(String value) {
            addCriterion("project_Auditing =", value, "projectAuditing");
            return (Criteria) this;
        }

        public Criteria andProjectAuditingNotEqualTo(String value) {
            addCriterion("project_Auditing <>", value, "projectAuditing");
            return (Criteria) this;
        }

        public Criteria andProjectAuditingGreaterThan(String value) {
            addCriterion("project_Auditing >", value, "projectAuditing");
            return (Criteria) this;
        }

        public Criteria andProjectAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("project_Auditing >=", value, "projectAuditing");
            return (Criteria) this;
        }

        public Criteria andProjectAuditingLessThan(String value) {
            addCriterion("project_Auditing <", value, "projectAuditing");
            return (Criteria) this;
        }

        public Criteria andProjectAuditingLessThanOrEqualTo(String value) {
            addCriterion("project_Auditing <=", value, "projectAuditing");
            return (Criteria) this;
        }

        public Criteria andProjectAuditingLike(String value) {
            addCriterion("project_Auditing like", value, "projectAuditing");
            return (Criteria) this;
        }

        public Criteria andProjectAuditingNotLike(String value) {
            addCriterion("project_Auditing not like", value, "projectAuditing");
            return (Criteria) this;
        }

        public Criteria andProjectAuditingIn(List<String> values) {
            addCriterion("project_Auditing in", values, "projectAuditing");
            return (Criteria) this;
        }

        public Criteria andProjectAuditingNotIn(List<String> values) {
            addCriterion("project_Auditing not in", values, "projectAuditing");
            return (Criteria) this;
        }

        public Criteria andProjectAuditingBetween(String value1, String value2) {
            addCriterion("project_Auditing between", value1, value2, "projectAuditing");
            return (Criteria) this;
        }

        public Criteria andProjectAuditingNotBetween(String value1, String value2) {
            addCriterion("project_Auditing not between", value1, value2, "projectAuditing");
            return (Criteria) this;
        }

        public Criteria andProjectYnIsNull() {
            addCriterion("project_yn is null");
            return (Criteria) this;
        }

        public Criteria andProjectYnIsNotNull() {
            addCriterion("project_yn is not null");
            return (Criteria) this;
        }

        public Criteria andProjectYnEqualTo(String value) {
            addCriterion("project_yn =", value, "projectYn");
            return (Criteria) this;
        }

        public Criteria andProjectYnNotEqualTo(String value) {
            addCriterion("project_yn <>", value, "projectYn");
            return (Criteria) this;
        }

        public Criteria andProjectYnGreaterThan(String value) {
            addCriterion("project_yn >", value, "projectYn");
            return (Criteria) this;
        }

        public Criteria andProjectYnGreaterThanOrEqualTo(String value) {
            addCriterion("project_yn >=", value, "projectYn");
            return (Criteria) this;
        }

        public Criteria andProjectYnLessThan(String value) {
            addCriterion("project_yn <", value, "projectYn");
            return (Criteria) this;
        }

        public Criteria andProjectYnLessThanOrEqualTo(String value) {
            addCriterion("project_yn <=", value, "projectYn");
            return (Criteria) this;
        }

        public Criteria andProjectYnLike(String value) {
            addCriterion("project_yn like", value, "projectYn");
            return (Criteria) this;
        }

        public Criteria andProjectYnNotLike(String value) {
            addCriterion("project_yn not like", value, "projectYn");
            return (Criteria) this;
        }

        public Criteria andProjectYnIn(List<String> values) {
            addCriterion("project_yn in", values, "projectYn");
            return (Criteria) this;
        }

        public Criteria andProjectYnNotIn(List<String> values) {
            addCriterion("project_yn not in", values, "projectYn");
            return (Criteria) this;
        }

        public Criteria andProjectYnBetween(String value1, String value2) {
            addCriterion("project_yn between", value1, value2, "projectYn");
            return (Criteria) this;
        }

        public Criteria andProjectYnNotBetween(String value1, String value2) {
            addCriterion("project_yn not between", value1, value2, "projectYn");
            return (Criteria) this;
        }

        public Criteria andProjectCustom1IsNull() {
            addCriterion("project_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andProjectCustom1IsNotNull() {
            addCriterion("project_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCustom1EqualTo(String value) {
            addCriterion("project_custom1 =", value, "projectCustom1");
            return (Criteria) this;
        }

        public Criteria andProjectCustom1NotEqualTo(String value) {
            addCriterion("project_custom1 <>", value, "projectCustom1");
            return (Criteria) this;
        }

        public Criteria andProjectCustom1GreaterThan(String value) {
            addCriterion("project_custom1 >", value, "projectCustom1");
            return (Criteria) this;
        }

        public Criteria andProjectCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("project_custom1 >=", value, "projectCustom1");
            return (Criteria) this;
        }

        public Criteria andProjectCustom1LessThan(String value) {
            addCriterion("project_custom1 <", value, "projectCustom1");
            return (Criteria) this;
        }

        public Criteria andProjectCustom1LessThanOrEqualTo(String value) {
            addCriterion("project_custom1 <=", value, "projectCustom1");
            return (Criteria) this;
        }

        public Criteria andProjectCustom1Like(String value) {
            addCriterion("project_custom1 like", value, "projectCustom1");
            return (Criteria) this;
        }

        public Criteria andProjectCustom1NotLike(String value) {
            addCriterion("project_custom1 not like", value, "projectCustom1");
            return (Criteria) this;
        }

        public Criteria andProjectCustom1In(List<String> values) {
            addCriterion("project_custom1 in", values, "projectCustom1");
            return (Criteria) this;
        }

        public Criteria andProjectCustom1NotIn(List<String> values) {
            addCriterion("project_custom1 not in", values, "projectCustom1");
            return (Criteria) this;
        }

        public Criteria andProjectCustom1Between(String value1, String value2) {
            addCriterion("project_custom1 between", value1, value2, "projectCustom1");
            return (Criteria) this;
        }

        public Criteria andProjectCustom1NotBetween(String value1, String value2) {
            addCriterion("project_custom1 not between", value1, value2, "projectCustom1");
            return (Criteria) this;
        }

        public Criteria andProjectCustom2IsNull() {
            addCriterion("project_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andProjectCustom2IsNotNull() {
            addCriterion("project_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCustom2EqualTo(String value) {
            addCriterion("project_custom2 =", value, "projectCustom2");
            return (Criteria) this;
        }

        public Criteria andProjectCustom2NotEqualTo(String value) {
            addCriterion("project_custom2 <>", value, "projectCustom2");
            return (Criteria) this;
        }

        public Criteria andProjectCustom2GreaterThan(String value) {
            addCriterion("project_custom2 >", value, "projectCustom2");
            return (Criteria) this;
        }

        public Criteria andProjectCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("project_custom2 >=", value, "projectCustom2");
            return (Criteria) this;
        }

        public Criteria andProjectCustom2LessThan(String value) {
            addCriterion("project_custom2 <", value, "projectCustom2");
            return (Criteria) this;
        }

        public Criteria andProjectCustom2LessThanOrEqualTo(String value) {
            addCriterion("project_custom2 <=", value, "projectCustom2");
            return (Criteria) this;
        }

        public Criteria andProjectCustom2Like(String value) {
            addCriterion("project_custom2 like", value, "projectCustom2");
            return (Criteria) this;
        }

        public Criteria andProjectCustom2NotLike(String value) {
            addCriterion("project_custom2 not like", value, "projectCustom2");
            return (Criteria) this;
        }

        public Criteria andProjectCustom2In(List<String> values) {
            addCriterion("project_custom2 in", values, "projectCustom2");
            return (Criteria) this;
        }

        public Criteria andProjectCustom2NotIn(List<String> values) {
            addCriterion("project_custom2 not in", values, "projectCustom2");
            return (Criteria) this;
        }

        public Criteria andProjectCustom2Between(String value1, String value2) {
            addCriterion("project_custom2 between", value1, value2, "projectCustom2");
            return (Criteria) this;
        }

        public Criteria andProjectCustom2NotBetween(String value1, String value2) {
            addCriterion("project_custom2 not between", value1, value2, "projectCustom2");
            return (Criteria) this;
        }

        public Criteria andProjectCustom3IsNull() {
            addCriterion("project_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andProjectCustom3IsNotNull() {
            addCriterion("project_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCustom3EqualTo(String value) {
            addCriterion("project_custom3 =", value, "projectCustom3");
            return (Criteria) this;
        }

        public Criteria andProjectCustom3NotEqualTo(String value) {
            addCriterion("project_custom3 <>", value, "projectCustom3");
            return (Criteria) this;
        }

        public Criteria andProjectCustom3GreaterThan(String value) {
            addCriterion("project_custom3 >", value, "projectCustom3");
            return (Criteria) this;
        }

        public Criteria andProjectCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("project_custom3 >=", value, "projectCustom3");
            return (Criteria) this;
        }

        public Criteria andProjectCustom3LessThan(String value) {
            addCriterion("project_custom3 <", value, "projectCustom3");
            return (Criteria) this;
        }

        public Criteria andProjectCustom3LessThanOrEqualTo(String value) {
            addCriterion("project_custom3 <=", value, "projectCustom3");
            return (Criteria) this;
        }

        public Criteria andProjectCustom3Like(String value) {
            addCriterion("project_custom3 like", value, "projectCustom3");
            return (Criteria) this;
        }

        public Criteria andProjectCustom3NotLike(String value) {
            addCriterion("project_custom3 not like", value, "projectCustom3");
            return (Criteria) this;
        }

        public Criteria andProjectCustom3In(List<String> values) {
            addCriterion("project_custom3 in", values, "projectCustom3");
            return (Criteria) this;
        }

        public Criteria andProjectCustom3NotIn(List<String> values) {
            addCriterion("project_custom3 not in", values, "projectCustom3");
            return (Criteria) this;
        }

        public Criteria andProjectCustom3Between(String value1, String value2) {
            addCriterion("project_custom3 between", value1, value2, "projectCustom3");
            return (Criteria) this;
        }

        public Criteria andProjectCustom3NotBetween(String value1, String value2) {
            addCriterion("project_custom3 not between", value1, value2, "projectCustom3");
            return (Criteria) this;
        }

        public Criteria andProjectCustom4IsNull() {
            addCriterion("project_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andProjectCustom4IsNotNull() {
            addCriterion("project_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCustom4EqualTo(String value) {
            addCriterion("project_custom4 =", value, "projectCustom4");
            return (Criteria) this;
        }

        public Criteria andProjectCustom4NotEqualTo(String value) {
            addCriterion("project_custom4 <>", value, "projectCustom4");
            return (Criteria) this;
        }

        public Criteria andProjectCustom4GreaterThan(String value) {
            addCriterion("project_custom4 >", value, "projectCustom4");
            return (Criteria) this;
        }

        public Criteria andProjectCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("project_custom4 >=", value, "projectCustom4");
            return (Criteria) this;
        }

        public Criteria andProjectCustom4LessThan(String value) {
            addCriterion("project_custom4 <", value, "projectCustom4");
            return (Criteria) this;
        }

        public Criteria andProjectCustom4LessThanOrEqualTo(String value) {
            addCriterion("project_custom4 <=", value, "projectCustom4");
            return (Criteria) this;
        }

        public Criteria andProjectCustom4Like(String value) {
            addCriterion("project_custom4 like", value, "projectCustom4");
            return (Criteria) this;
        }

        public Criteria andProjectCustom4NotLike(String value) {
            addCriterion("project_custom4 not like", value, "projectCustom4");
            return (Criteria) this;
        }

        public Criteria andProjectCustom4In(List<String> values) {
            addCriterion("project_custom4 in", values, "projectCustom4");
            return (Criteria) this;
        }

        public Criteria andProjectCustom4NotIn(List<String> values) {
            addCriterion("project_custom4 not in", values, "projectCustom4");
            return (Criteria) this;
        }

        public Criteria andProjectCustom4Between(String value1, String value2) {
            addCriterion("project_custom4 between", value1, value2, "projectCustom4");
            return (Criteria) this;
        }

        public Criteria andProjectCustom4NotBetween(String value1, String value2) {
            addCriterion("project_custom4 not between", value1, value2, "projectCustom4");
            return (Criteria) this;
        }

        public Criteria andProjectCustom5IsNull() {
            addCriterion("project_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andProjectCustom5IsNotNull() {
            addCriterion("project_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCustom5EqualTo(String value) {
            addCriterion("project_custom5 =", value, "projectCustom5");
            return (Criteria) this;
        }

        public Criteria andProjectCustom5NotEqualTo(String value) {
            addCriterion("project_custom5 <>", value, "projectCustom5");
            return (Criteria) this;
        }

        public Criteria andProjectCustom5GreaterThan(String value) {
            addCriterion("project_custom5 >", value, "projectCustom5");
            return (Criteria) this;
        }

        public Criteria andProjectCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("project_custom5 >=", value, "projectCustom5");
            return (Criteria) this;
        }

        public Criteria andProjectCustom5LessThan(String value) {
            addCriterion("project_custom5 <", value, "projectCustom5");
            return (Criteria) this;
        }

        public Criteria andProjectCustom5LessThanOrEqualTo(String value) {
            addCriterion("project_custom5 <=", value, "projectCustom5");
            return (Criteria) this;
        }

        public Criteria andProjectCustom5Like(String value) {
            addCriterion("project_custom5 like", value, "projectCustom5");
            return (Criteria) this;
        }

        public Criteria andProjectCustom5NotLike(String value) {
            addCriterion("project_custom5 not like", value, "projectCustom5");
            return (Criteria) this;
        }

        public Criteria andProjectCustom5In(List<String> values) {
            addCriterion("project_custom5 in", values, "projectCustom5");
            return (Criteria) this;
        }

        public Criteria andProjectCustom5NotIn(List<String> values) {
            addCriterion("project_custom5 not in", values, "projectCustom5");
            return (Criteria) this;
        }

        public Criteria andProjectCustom5Between(String value1, String value2) {
            addCriterion("project_custom5 between", value1, value2, "projectCustom5");
            return (Criteria) this;
        }

        public Criteria andProjectCustom5NotBetween(String value1, String value2) {
            addCriterion("project_custom5 not between", value1, value2, "projectCustom5");
            return (Criteria) this;
        }

        public Criteria andProjectCustom6IsNull() {
            addCriterion("project_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andProjectCustom6IsNotNull() {
            addCriterion("project_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCustom6EqualTo(String value) {
            addCriterion("project_custom6 =", value, "projectCustom6");
            return (Criteria) this;
        }

        public Criteria andProjectCustom6NotEqualTo(String value) {
            addCriterion("project_custom6 <>", value, "projectCustom6");
            return (Criteria) this;
        }

        public Criteria andProjectCustom6GreaterThan(String value) {
            addCriterion("project_custom6 >", value, "projectCustom6");
            return (Criteria) this;
        }

        public Criteria andProjectCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("project_custom6 >=", value, "projectCustom6");
            return (Criteria) this;
        }

        public Criteria andProjectCustom6LessThan(String value) {
            addCriterion("project_custom6 <", value, "projectCustom6");
            return (Criteria) this;
        }

        public Criteria andProjectCustom6LessThanOrEqualTo(String value) {
            addCriterion("project_custom6 <=", value, "projectCustom6");
            return (Criteria) this;
        }

        public Criteria andProjectCustom6Like(String value) {
            addCriterion("project_custom6 like", value, "projectCustom6");
            return (Criteria) this;
        }

        public Criteria andProjectCustom6NotLike(String value) {
            addCriterion("project_custom6 not like", value, "projectCustom6");
            return (Criteria) this;
        }

        public Criteria andProjectCustom6In(List<String> values) {
            addCriterion("project_custom6 in", values, "projectCustom6");
            return (Criteria) this;
        }

        public Criteria andProjectCustom6NotIn(List<String> values) {
            addCriterion("project_custom6 not in", values, "projectCustom6");
            return (Criteria) this;
        }

        public Criteria andProjectCustom6Between(String value1, String value2) {
            addCriterion("project_custom6 between", value1, value2, "projectCustom6");
            return (Criteria) this;
        }

        public Criteria andProjectCustom6NotBetween(String value1, String value2) {
            addCriterion("project_custom6 not between", value1, value2, "projectCustom6");
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