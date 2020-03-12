package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamExample() {
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

        public Criteria andTeamIdIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(String value) {
            addCriterion("team_id =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(String value) {
            addCriterion("team_id <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(String value) {
            addCriterion("team_id >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("team_id >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(String value) {
            addCriterion("team_id <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(String value) {
            addCriterion("team_id <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLike(String value) {
            addCriterion("team_id like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotLike(String value) {
            addCriterion("team_id not like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<String> values) {
            addCriterion("team_id in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<String> values) {
            addCriterion("team_id not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(String value1, String value2) {
            addCriterion("team_id between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(String value1, String value2) {
            addCriterion("team_id not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNull() {
            addCriterion("team_name is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("team_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("team_name =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("team_name <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("team_name >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("team_name >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("team_name <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("team_name <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("team_name like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("team_name not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("team_name in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("team_name not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("team_name between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("team_name not between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamEnglishNameIsNull() {
            addCriterion("team_english_name is null");
            return (Criteria) this;
        }

        public Criteria andTeamEnglishNameIsNotNull() {
            addCriterion("team_english_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeamEnglishNameEqualTo(String value) {
            addCriterion("team_english_name =", value, "teamEnglishName");
            return (Criteria) this;
        }

        public Criteria andTeamEnglishNameNotEqualTo(String value) {
            addCriterion("team_english_name <>", value, "teamEnglishName");
            return (Criteria) this;
        }

        public Criteria andTeamEnglishNameGreaterThan(String value) {
            addCriterion("team_english_name >", value, "teamEnglishName");
            return (Criteria) this;
        }

        public Criteria andTeamEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("team_english_name >=", value, "teamEnglishName");
            return (Criteria) this;
        }

        public Criteria andTeamEnglishNameLessThan(String value) {
            addCriterion("team_english_name <", value, "teamEnglishName");
            return (Criteria) this;
        }

        public Criteria andTeamEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("team_english_name <=", value, "teamEnglishName");
            return (Criteria) this;
        }

        public Criteria andTeamEnglishNameLike(String value) {
            addCriterion("team_english_name like", value, "teamEnglishName");
            return (Criteria) this;
        }

        public Criteria andTeamEnglishNameNotLike(String value) {
            addCriterion("team_english_name not like", value, "teamEnglishName");
            return (Criteria) this;
        }

        public Criteria andTeamEnglishNameIn(List<String> values) {
            addCriterion("team_english_name in", values, "teamEnglishName");
            return (Criteria) this;
        }

        public Criteria andTeamEnglishNameNotIn(List<String> values) {
            addCriterion("team_english_name not in", values, "teamEnglishName");
            return (Criteria) this;
        }

        public Criteria andTeamEnglishNameBetween(String value1, String value2) {
            addCriterion("team_english_name between", value1, value2, "teamEnglishName");
            return (Criteria) this;
        }

        public Criteria andTeamEnglishNameNotBetween(String value1, String value2) {
            addCriterion("team_english_name not between", value1, value2, "teamEnglishName");
            return (Criteria) this;
        }

        public Criteria andTeamAbateIsNull() {
            addCriterion("team_abate is null");
            return (Criteria) this;
        }

        public Criteria andTeamAbateIsNotNull() {
            addCriterion("team_abate is not null");
            return (Criteria) this;
        }

        public Criteria andTeamAbateEqualTo(Date value) {
            addCriterionForJDBCDate("team_abate =", value, "teamAbate");
            return (Criteria) this;
        }

        public Criteria andTeamAbateNotEqualTo(Date value) {
            addCriterionForJDBCDate("team_abate <>", value, "teamAbate");
            return (Criteria) this;
        }

        public Criteria andTeamAbateGreaterThan(Date value) {
            addCriterionForJDBCDate("team_abate >", value, "teamAbate");
            return (Criteria) this;
        }

        public Criteria andTeamAbateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("team_abate >=", value, "teamAbate");
            return (Criteria) this;
        }

        public Criteria andTeamAbateLessThan(Date value) {
            addCriterionForJDBCDate("team_abate <", value, "teamAbate");
            return (Criteria) this;
        }

        public Criteria andTeamAbateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("team_abate <=", value, "teamAbate");
            return (Criteria) this;
        }

        public Criteria andTeamAbateIn(List<Date> values) {
            addCriterionForJDBCDate("team_abate in", values, "teamAbate");
            return (Criteria) this;
        }

        public Criteria andTeamAbateNotIn(List<Date> values) {
            addCriterionForJDBCDate("team_abate not in", values, "teamAbate");
            return (Criteria) this;
        }

        public Criteria andTeamAbateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("team_abate between", value1, value2, "teamAbate");
            return (Criteria) this;
        }

        public Criteria andTeamAbateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("team_abate not between", value1, value2, "teamAbate");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkIsNull() {
            addCriterion("team_remark is null");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkIsNotNull() {
            addCriterion("team_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkEqualTo(String value) {
            addCriterion("team_remark =", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkNotEqualTo(String value) {
            addCriterion("team_remark <>", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkGreaterThan(String value) {
            addCriterion("team_remark >", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("team_remark >=", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkLessThan(String value) {
            addCriterion("team_remark <", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkLessThanOrEqualTo(String value) {
            addCriterion("team_remark <=", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkLike(String value) {
            addCriterion("team_remark like", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkNotLike(String value) {
            addCriterion("team_remark not like", value, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkIn(List<String> values) {
            addCriterion("team_remark in", values, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkNotIn(List<String> values) {
            addCriterion("team_remark not in", values, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkBetween(String value1, String value2) {
            addCriterion("team_remark between", value1, value2, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamRemarkNotBetween(String value1, String value2) {
            addCriterion("team_remark not between", value1, value2, "teamRemark");
            return (Criteria) this;
        }

        public Criteria andTeamAuditingIsNull() {
            addCriterion("team_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andTeamAuditingIsNotNull() {
            addCriterion("team_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andTeamAuditingEqualTo(String value) {
            addCriterion("team_Auditing =", value, "teamAuditing");
            return (Criteria) this;
        }

        public Criteria andTeamAuditingNotEqualTo(String value) {
            addCriterion("team_Auditing <>", value, "teamAuditing");
            return (Criteria) this;
        }

        public Criteria andTeamAuditingGreaterThan(String value) {
            addCriterion("team_Auditing >", value, "teamAuditing");
            return (Criteria) this;
        }

        public Criteria andTeamAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("team_Auditing >=", value, "teamAuditing");
            return (Criteria) this;
        }

        public Criteria andTeamAuditingLessThan(String value) {
            addCriterion("team_Auditing <", value, "teamAuditing");
            return (Criteria) this;
        }

        public Criteria andTeamAuditingLessThanOrEqualTo(String value) {
            addCriterion("team_Auditing <=", value, "teamAuditing");
            return (Criteria) this;
        }

        public Criteria andTeamAuditingLike(String value) {
            addCriterion("team_Auditing like", value, "teamAuditing");
            return (Criteria) this;
        }

        public Criteria andTeamAuditingNotLike(String value) {
            addCriterion("team_Auditing not like", value, "teamAuditing");
            return (Criteria) this;
        }

        public Criteria andTeamAuditingIn(List<String> values) {
            addCriterion("team_Auditing in", values, "teamAuditing");
            return (Criteria) this;
        }

        public Criteria andTeamAuditingNotIn(List<String> values) {
            addCriterion("team_Auditing not in", values, "teamAuditing");
            return (Criteria) this;
        }

        public Criteria andTeamAuditingBetween(String value1, String value2) {
            addCriterion("team_Auditing between", value1, value2, "teamAuditing");
            return (Criteria) this;
        }

        public Criteria andTeamAuditingNotBetween(String value1, String value2) {
            addCriterion("team_Auditing not between", value1, value2, "teamAuditing");
            return (Criteria) this;
        }

        public Criteria andTeamYnIsNull() {
            addCriterion("team_yn is null");
            return (Criteria) this;
        }

        public Criteria andTeamYnIsNotNull() {
            addCriterion("team_yn is not null");
            return (Criteria) this;
        }

        public Criteria andTeamYnEqualTo(String value) {
            addCriterion("team_yn =", value, "teamYn");
            return (Criteria) this;
        }

        public Criteria andTeamYnNotEqualTo(String value) {
            addCriterion("team_yn <>", value, "teamYn");
            return (Criteria) this;
        }

        public Criteria andTeamYnGreaterThan(String value) {
            addCriterion("team_yn >", value, "teamYn");
            return (Criteria) this;
        }

        public Criteria andTeamYnGreaterThanOrEqualTo(String value) {
            addCriterion("team_yn >=", value, "teamYn");
            return (Criteria) this;
        }

        public Criteria andTeamYnLessThan(String value) {
            addCriterion("team_yn <", value, "teamYn");
            return (Criteria) this;
        }

        public Criteria andTeamYnLessThanOrEqualTo(String value) {
            addCriterion("team_yn <=", value, "teamYn");
            return (Criteria) this;
        }

        public Criteria andTeamYnLike(String value) {
            addCriterion("team_yn like", value, "teamYn");
            return (Criteria) this;
        }

        public Criteria andTeamYnNotLike(String value) {
            addCriterion("team_yn not like", value, "teamYn");
            return (Criteria) this;
        }

        public Criteria andTeamYnIn(List<String> values) {
            addCriterion("team_yn in", values, "teamYn");
            return (Criteria) this;
        }

        public Criteria andTeamYnNotIn(List<String> values) {
            addCriterion("team_yn not in", values, "teamYn");
            return (Criteria) this;
        }

        public Criteria andTeamYnBetween(String value1, String value2) {
            addCriterion("team_yn between", value1, value2, "teamYn");
            return (Criteria) this;
        }

        public Criteria andTeamYnNotBetween(String value1, String value2) {
            addCriterion("team_yn not between", value1, value2, "teamYn");
            return (Criteria) this;
        }

        public Criteria andTeamCustom1IsNull() {
            addCriterion("team_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andTeamCustom1IsNotNull() {
            addCriterion("team_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCustom1EqualTo(String value) {
            addCriterion("team_custom1 =", value, "teamCustom1");
            return (Criteria) this;
        }

        public Criteria andTeamCustom1NotEqualTo(String value) {
            addCriterion("team_custom1 <>", value, "teamCustom1");
            return (Criteria) this;
        }

        public Criteria andTeamCustom1GreaterThan(String value) {
            addCriterion("team_custom1 >", value, "teamCustom1");
            return (Criteria) this;
        }

        public Criteria andTeamCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("team_custom1 >=", value, "teamCustom1");
            return (Criteria) this;
        }

        public Criteria andTeamCustom1LessThan(String value) {
            addCriterion("team_custom1 <", value, "teamCustom1");
            return (Criteria) this;
        }

        public Criteria andTeamCustom1LessThanOrEqualTo(String value) {
            addCriterion("team_custom1 <=", value, "teamCustom1");
            return (Criteria) this;
        }

        public Criteria andTeamCustom1Like(String value) {
            addCriterion("team_custom1 like", value, "teamCustom1");
            return (Criteria) this;
        }

        public Criteria andTeamCustom1NotLike(String value) {
            addCriterion("team_custom1 not like", value, "teamCustom1");
            return (Criteria) this;
        }

        public Criteria andTeamCustom1In(List<String> values) {
            addCriterion("team_custom1 in", values, "teamCustom1");
            return (Criteria) this;
        }

        public Criteria andTeamCustom1NotIn(List<String> values) {
            addCriterion("team_custom1 not in", values, "teamCustom1");
            return (Criteria) this;
        }

        public Criteria andTeamCustom1Between(String value1, String value2) {
            addCriterion("team_custom1 between", value1, value2, "teamCustom1");
            return (Criteria) this;
        }

        public Criteria andTeamCustom1NotBetween(String value1, String value2) {
            addCriterion("team_custom1 not between", value1, value2, "teamCustom1");
            return (Criteria) this;
        }

        public Criteria andTeamCustom2IsNull() {
            addCriterion("team_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andTeamCustom2IsNotNull() {
            addCriterion("team_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCustom2EqualTo(String value) {
            addCriterion("team_custom2 =", value, "teamCustom2");
            return (Criteria) this;
        }

        public Criteria andTeamCustom2NotEqualTo(String value) {
            addCriterion("team_custom2 <>", value, "teamCustom2");
            return (Criteria) this;
        }

        public Criteria andTeamCustom2GreaterThan(String value) {
            addCriterion("team_custom2 >", value, "teamCustom2");
            return (Criteria) this;
        }

        public Criteria andTeamCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("team_custom2 >=", value, "teamCustom2");
            return (Criteria) this;
        }

        public Criteria andTeamCustom2LessThan(String value) {
            addCriterion("team_custom2 <", value, "teamCustom2");
            return (Criteria) this;
        }

        public Criteria andTeamCustom2LessThanOrEqualTo(String value) {
            addCriterion("team_custom2 <=", value, "teamCustom2");
            return (Criteria) this;
        }

        public Criteria andTeamCustom2Like(String value) {
            addCriterion("team_custom2 like", value, "teamCustom2");
            return (Criteria) this;
        }

        public Criteria andTeamCustom2NotLike(String value) {
            addCriterion("team_custom2 not like", value, "teamCustom2");
            return (Criteria) this;
        }

        public Criteria andTeamCustom2In(List<String> values) {
            addCriterion("team_custom2 in", values, "teamCustom2");
            return (Criteria) this;
        }

        public Criteria andTeamCustom2NotIn(List<String> values) {
            addCriterion("team_custom2 not in", values, "teamCustom2");
            return (Criteria) this;
        }

        public Criteria andTeamCustom2Between(String value1, String value2) {
            addCriterion("team_custom2 between", value1, value2, "teamCustom2");
            return (Criteria) this;
        }

        public Criteria andTeamCustom2NotBetween(String value1, String value2) {
            addCriterion("team_custom2 not between", value1, value2, "teamCustom2");
            return (Criteria) this;
        }

        public Criteria andTeamCustom3IsNull() {
            addCriterion("team_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andTeamCustom3IsNotNull() {
            addCriterion("team_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCustom3EqualTo(String value) {
            addCriterion("team_custom3 =", value, "teamCustom3");
            return (Criteria) this;
        }

        public Criteria andTeamCustom3NotEqualTo(String value) {
            addCriterion("team_custom3 <>", value, "teamCustom3");
            return (Criteria) this;
        }

        public Criteria andTeamCustom3GreaterThan(String value) {
            addCriterion("team_custom3 >", value, "teamCustom3");
            return (Criteria) this;
        }

        public Criteria andTeamCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("team_custom3 >=", value, "teamCustom3");
            return (Criteria) this;
        }

        public Criteria andTeamCustom3LessThan(String value) {
            addCriterion("team_custom3 <", value, "teamCustom3");
            return (Criteria) this;
        }

        public Criteria andTeamCustom3LessThanOrEqualTo(String value) {
            addCriterion("team_custom3 <=", value, "teamCustom3");
            return (Criteria) this;
        }

        public Criteria andTeamCustom3Like(String value) {
            addCriterion("team_custom3 like", value, "teamCustom3");
            return (Criteria) this;
        }

        public Criteria andTeamCustom3NotLike(String value) {
            addCriterion("team_custom3 not like", value, "teamCustom3");
            return (Criteria) this;
        }

        public Criteria andTeamCustom3In(List<String> values) {
            addCriterion("team_custom3 in", values, "teamCustom3");
            return (Criteria) this;
        }

        public Criteria andTeamCustom3NotIn(List<String> values) {
            addCriterion("team_custom3 not in", values, "teamCustom3");
            return (Criteria) this;
        }

        public Criteria andTeamCustom3Between(String value1, String value2) {
            addCriterion("team_custom3 between", value1, value2, "teamCustom3");
            return (Criteria) this;
        }

        public Criteria andTeamCustom3NotBetween(String value1, String value2) {
            addCriterion("team_custom3 not between", value1, value2, "teamCustom3");
            return (Criteria) this;
        }

        public Criteria andTeamCustom4IsNull() {
            addCriterion("team_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andTeamCustom4IsNotNull() {
            addCriterion("team_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCustom4EqualTo(String value) {
            addCriterion("team_custom4 =", value, "teamCustom4");
            return (Criteria) this;
        }

        public Criteria andTeamCustom4NotEqualTo(String value) {
            addCriterion("team_custom4 <>", value, "teamCustom4");
            return (Criteria) this;
        }

        public Criteria andTeamCustom4GreaterThan(String value) {
            addCriterion("team_custom4 >", value, "teamCustom4");
            return (Criteria) this;
        }

        public Criteria andTeamCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("team_custom4 >=", value, "teamCustom4");
            return (Criteria) this;
        }

        public Criteria andTeamCustom4LessThan(String value) {
            addCriterion("team_custom4 <", value, "teamCustom4");
            return (Criteria) this;
        }

        public Criteria andTeamCustom4LessThanOrEqualTo(String value) {
            addCriterion("team_custom4 <=", value, "teamCustom4");
            return (Criteria) this;
        }

        public Criteria andTeamCustom4Like(String value) {
            addCriterion("team_custom4 like", value, "teamCustom4");
            return (Criteria) this;
        }

        public Criteria andTeamCustom4NotLike(String value) {
            addCriterion("team_custom4 not like", value, "teamCustom4");
            return (Criteria) this;
        }

        public Criteria andTeamCustom4In(List<String> values) {
            addCriterion("team_custom4 in", values, "teamCustom4");
            return (Criteria) this;
        }

        public Criteria andTeamCustom4NotIn(List<String> values) {
            addCriterion("team_custom4 not in", values, "teamCustom4");
            return (Criteria) this;
        }

        public Criteria andTeamCustom4Between(String value1, String value2) {
            addCriterion("team_custom4 between", value1, value2, "teamCustom4");
            return (Criteria) this;
        }

        public Criteria andTeamCustom4NotBetween(String value1, String value2) {
            addCriterion("team_custom4 not between", value1, value2, "teamCustom4");
            return (Criteria) this;
        }

        public Criteria andTeamCustom5IsNull() {
            addCriterion("team_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andTeamCustom5IsNotNull() {
            addCriterion("team_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCustom5EqualTo(String value) {
            addCriterion("team_custom5 =", value, "teamCustom5");
            return (Criteria) this;
        }

        public Criteria andTeamCustom5NotEqualTo(String value) {
            addCriterion("team_custom5 <>", value, "teamCustom5");
            return (Criteria) this;
        }

        public Criteria andTeamCustom5GreaterThan(String value) {
            addCriterion("team_custom5 >", value, "teamCustom5");
            return (Criteria) this;
        }

        public Criteria andTeamCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("team_custom5 >=", value, "teamCustom5");
            return (Criteria) this;
        }

        public Criteria andTeamCustom5LessThan(String value) {
            addCriterion("team_custom5 <", value, "teamCustom5");
            return (Criteria) this;
        }

        public Criteria andTeamCustom5LessThanOrEqualTo(String value) {
            addCriterion("team_custom5 <=", value, "teamCustom5");
            return (Criteria) this;
        }

        public Criteria andTeamCustom5Like(String value) {
            addCriterion("team_custom5 like", value, "teamCustom5");
            return (Criteria) this;
        }

        public Criteria andTeamCustom5NotLike(String value) {
            addCriterion("team_custom5 not like", value, "teamCustom5");
            return (Criteria) this;
        }

        public Criteria andTeamCustom5In(List<String> values) {
            addCriterion("team_custom5 in", values, "teamCustom5");
            return (Criteria) this;
        }

        public Criteria andTeamCustom5NotIn(List<String> values) {
            addCriterion("team_custom5 not in", values, "teamCustom5");
            return (Criteria) this;
        }

        public Criteria andTeamCustom5Between(String value1, String value2) {
            addCriterion("team_custom5 between", value1, value2, "teamCustom5");
            return (Criteria) this;
        }

        public Criteria andTeamCustom5NotBetween(String value1, String value2) {
            addCriterion("team_custom5 not between", value1, value2, "teamCustom5");
            return (Criteria) this;
        }

        public Criteria andTeamCustom6IsNull() {
            addCriterion("team_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andTeamCustom6IsNotNull() {
            addCriterion("team_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCustom6EqualTo(String value) {
            addCriterion("team_custom6 =", value, "teamCustom6");
            return (Criteria) this;
        }

        public Criteria andTeamCustom6NotEqualTo(String value) {
            addCriterion("team_custom6 <>", value, "teamCustom6");
            return (Criteria) this;
        }

        public Criteria andTeamCustom6GreaterThan(String value) {
            addCriterion("team_custom6 >", value, "teamCustom6");
            return (Criteria) this;
        }

        public Criteria andTeamCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("team_custom6 >=", value, "teamCustom6");
            return (Criteria) this;
        }

        public Criteria andTeamCustom6LessThan(String value) {
            addCriterion("team_custom6 <", value, "teamCustom6");
            return (Criteria) this;
        }

        public Criteria andTeamCustom6LessThanOrEqualTo(String value) {
            addCriterion("team_custom6 <=", value, "teamCustom6");
            return (Criteria) this;
        }

        public Criteria andTeamCustom6Like(String value) {
            addCriterion("team_custom6 like", value, "teamCustom6");
            return (Criteria) this;
        }

        public Criteria andTeamCustom6NotLike(String value) {
            addCriterion("team_custom6 not like", value, "teamCustom6");
            return (Criteria) this;
        }

        public Criteria andTeamCustom6In(List<String> values) {
            addCriterion("team_custom6 in", values, "teamCustom6");
            return (Criteria) this;
        }

        public Criteria andTeamCustom6NotIn(List<String> values) {
            addCriterion("team_custom6 not in", values, "teamCustom6");
            return (Criteria) this;
        }

        public Criteria andTeamCustom6Between(String value1, String value2) {
            addCriterion("team_custom6 between", value1, value2, "teamCustom6");
            return (Criteria) this;
        }

        public Criteria andTeamCustom6NotBetween(String value1, String value2) {
            addCriterion("team_custom6 not between", value1, value2, "teamCustom6");
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