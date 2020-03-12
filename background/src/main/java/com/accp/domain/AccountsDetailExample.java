package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountsDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountsDetailExample() {
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

        public Criteria andAccedeIdIsNull() {
            addCriterion("accede_id is null");
            return (Criteria) this;
        }

        public Criteria andAccedeIdIsNotNull() {
            addCriterion("accede_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccedeIdEqualTo(Integer value) {
            addCriterion("accede_id =", value, "accedeId");
            return (Criteria) this;
        }

        public Criteria andAccedeIdNotEqualTo(Integer value) {
            addCriterion("accede_id <>", value, "accedeId");
            return (Criteria) this;
        }

        public Criteria andAccedeIdGreaterThan(Integer value) {
            addCriterion("accede_id >", value, "accedeId");
            return (Criteria) this;
        }

        public Criteria andAccedeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("accede_id >=", value, "accedeId");
            return (Criteria) this;
        }

        public Criteria andAccedeIdLessThan(Integer value) {
            addCriterion("accede_id <", value, "accedeId");
            return (Criteria) this;
        }

        public Criteria andAccedeIdLessThanOrEqualTo(Integer value) {
            addCriterion("accede_id <=", value, "accedeId");
            return (Criteria) this;
        }

        public Criteria andAccedeIdIn(List<Integer> values) {
            addCriterion("accede_id in", values, "accedeId");
            return (Criteria) this;
        }

        public Criteria andAccedeIdNotIn(List<Integer> values) {
            addCriterion("accede_id not in", values, "accedeId");
            return (Criteria) this;
        }

        public Criteria andAccedeIdBetween(Integer value1, Integer value2) {
            addCriterion("accede_id between", value1, value2, "accedeId");
            return (Criteria) this;
        }

        public Criteria andAccedeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("accede_id not between", value1, value2, "accedeId");
            return (Criteria) this;
        }

        public Criteria andAccedeTypeIsNull() {
            addCriterion("accede_type is null");
            return (Criteria) this;
        }

        public Criteria andAccedeTypeIsNotNull() {
            addCriterion("accede_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccedeTypeEqualTo(String value) {
            addCriterion("accede_type =", value, "accedeType");
            return (Criteria) this;
        }

        public Criteria andAccedeTypeNotEqualTo(String value) {
            addCriterion("accede_type <>", value, "accedeType");
            return (Criteria) this;
        }

        public Criteria andAccedeTypeGreaterThan(String value) {
            addCriterion("accede_type >", value, "accedeType");
            return (Criteria) this;
        }

        public Criteria andAccedeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("accede_type >=", value, "accedeType");
            return (Criteria) this;
        }

        public Criteria andAccedeTypeLessThan(String value) {
            addCriterion("accede_type <", value, "accedeType");
            return (Criteria) this;
        }

        public Criteria andAccedeTypeLessThanOrEqualTo(String value) {
            addCriterion("accede_type <=", value, "accedeType");
            return (Criteria) this;
        }

        public Criteria andAccedeTypeLike(String value) {
            addCriterion("accede_type like", value, "accedeType");
            return (Criteria) this;
        }

        public Criteria andAccedeTypeNotLike(String value) {
            addCriterion("accede_type not like", value, "accedeType");
            return (Criteria) this;
        }

        public Criteria andAccedeTypeIn(List<String> values) {
            addCriterion("accede_type in", values, "accedeType");
            return (Criteria) this;
        }

        public Criteria andAccedeTypeNotIn(List<String> values) {
            addCriterion("accede_type not in", values, "accedeType");
            return (Criteria) this;
        }

        public Criteria andAccedeTypeBetween(String value1, String value2) {
            addCriterion("accede_type between", value1, value2, "accedeType");
            return (Criteria) this;
        }

        public Criteria andAccedeTypeNotBetween(String value1, String value2) {
            addCriterion("accede_type not between", value1, value2, "accedeType");
            return (Criteria) this;
        }

        public Criteria andAccedeNumberIsNull() {
            addCriterion("accede_number is null");
            return (Criteria) this;
        }

        public Criteria andAccedeNumberIsNotNull() {
            addCriterion("accede_number is not null");
            return (Criteria) this;
        }

        public Criteria andAccedeNumberEqualTo(String value) {
            addCriterion("accede_number =", value, "accedeNumber");
            return (Criteria) this;
        }

        public Criteria andAccedeNumberNotEqualTo(String value) {
            addCriterion("accede_number <>", value, "accedeNumber");
            return (Criteria) this;
        }

        public Criteria andAccedeNumberGreaterThan(String value) {
            addCriterion("accede_number >", value, "accedeNumber");
            return (Criteria) this;
        }

        public Criteria andAccedeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("accede_number >=", value, "accedeNumber");
            return (Criteria) this;
        }

        public Criteria andAccedeNumberLessThan(String value) {
            addCriterion("accede_number <", value, "accedeNumber");
            return (Criteria) this;
        }

        public Criteria andAccedeNumberLessThanOrEqualTo(String value) {
            addCriterion("accede_number <=", value, "accedeNumber");
            return (Criteria) this;
        }

        public Criteria andAccedeNumberLike(String value) {
            addCriterion("accede_number like", value, "accedeNumber");
            return (Criteria) this;
        }

        public Criteria andAccedeNumberNotLike(String value) {
            addCriterion("accede_number not like", value, "accedeNumber");
            return (Criteria) this;
        }

        public Criteria andAccedeNumberIn(List<String> values) {
            addCriterion("accede_number in", values, "accedeNumber");
            return (Criteria) this;
        }

        public Criteria andAccedeNumberNotIn(List<String> values) {
            addCriterion("accede_number not in", values, "accedeNumber");
            return (Criteria) this;
        }

        public Criteria andAccedeNumberBetween(String value1, String value2) {
            addCriterion("accede_number between", value1, value2, "accedeNumber");
            return (Criteria) this;
        }

        public Criteria andAccedeNumberNotBetween(String value1, String value2) {
            addCriterion("accede_number not between", value1, value2, "accedeNumber");
            return (Criteria) this;
        }

        public Criteria andAccedeDateIsNull() {
            addCriterion("accede_date is null");
            return (Criteria) this;
        }

        public Criteria andAccedeDateIsNotNull() {
            addCriterion("accede_date is not null");
            return (Criteria) this;
        }

        public Criteria andAccedeDateEqualTo(Date value) {
            addCriterion("accede_date =", value, "accedeDate");
            return (Criteria) this;
        }

        public Criteria andAccedeDateNotEqualTo(Date value) {
            addCriterion("accede_date <>", value, "accedeDate");
            return (Criteria) this;
        }

        public Criteria andAccedeDateGreaterThan(Date value) {
            addCriterion("accede_date >", value, "accedeDate");
            return (Criteria) this;
        }

        public Criteria andAccedeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("accede_date >=", value, "accedeDate");
            return (Criteria) this;
        }

        public Criteria andAccedeDateLessThan(Date value) {
            addCriterion("accede_date <", value, "accedeDate");
            return (Criteria) this;
        }

        public Criteria andAccedeDateLessThanOrEqualTo(Date value) {
            addCriterion("accede_date <=", value, "accedeDate");
            return (Criteria) this;
        }

        public Criteria andAccedeDateIn(List<Date> values) {
            addCriterion("accede_date in", values, "accedeDate");
            return (Criteria) this;
        }

        public Criteria andAccedeDateNotIn(List<Date> values) {
            addCriterion("accede_date not in", values, "accedeDate");
            return (Criteria) this;
        }

        public Criteria andAccedeDateBetween(Date value1, Date value2) {
            addCriterion("accede_date between", value1, value2, "accedeDate");
            return (Criteria) this;
        }

        public Criteria andAccedeDateNotBetween(Date value1, Date value2) {
            addCriterion("accede_date not between", value1, value2, "accedeDate");
            return (Criteria) this;
        }

        public Criteria andAccedePcIdIsNull() {
            addCriterion("accede_pc_id is null");
            return (Criteria) this;
        }

        public Criteria andAccedePcIdIsNotNull() {
            addCriterion("accede_pc_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccedePcIdEqualTo(String value) {
            addCriterion("accede_pc_id =", value, "accedePcId");
            return (Criteria) this;
        }

        public Criteria andAccedePcIdNotEqualTo(String value) {
            addCriterion("accede_pc_id <>", value, "accedePcId");
            return (Criteria) this;
        }

        public Criteria andAccedePcIdGreaterThan(String value) {
            addCriterion("accede_pc_id >", value, "accedePcId");
            return (Criteria) this;
        }

        public Criteria andAccedePcIdGreaterThanOrEqualTo(String value) {
            addCriterion("accede_pc_id >=", value, "accedePcId");
            return (Criteria) this;
        }

        public Criteria andAccedePcIdLessThan(String value) {
            addCriterion("accede_pc_id <", value, "accedePcId");
            return (Criteria) this;
        }

        public Criteria andAccedePcIdLessThanOrEqualTo(String value) {
            addCriterion("accede_pc_id <=", value, "accedePcId");
            return (Criteria) this;
        }

        public Criteria andAccedePcIdLike(String value) {
            addCriterion("accede_pc_id like", value, "accedePcId");
            return (Criteria) this;
        }

        public Criteria andAccedePcIdNotLike(String value) {
            addCriterion("accede_pc_id not like", value, "accedePcId");
            return (Criteria) this;
        }

        public Criteria andAccedePcIdIn(List<String> values) {
            addCriterion("accede_pc_id in", values, "accedePcId");
            return (Criteria) this;
        }

        public Criteria andAccedePcIdNotIn(List<String> values) {
            addCriterion("accede_pc_id not in", values, "accedePcId");
            return (Criteria) this;
        }

        public Criteria andAccedePcIdBetween(String value1, String value2) {
            addCriterion("accede_pc_id between", value1, value2, "accedePcId");
            return (Criteria) this;
        }

        public Criteria andAccedePcIdNotBetween(String value1, String value2) {
            addCriterion("accede_pc_id not between", value1, value2, "accedePcId");
            return (Criteria) this;
        }

        public Criteria andAccedePcNameIsNull() {
            addCriterion("accede_pc_name is null");
            return (Criteria) this;
        }

        public Criteria andAccedePcNameIsNotNull() {
            addCriterion("accede_pc_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccedePcNameEqualTo(String value) {
            addCriterion("accede_pc_name =", value, "accedePcName");
            return (Criteria) this;
        }

        public Criteria andAccedePcNameNotEqualTo(String value) {
            addCriterion("accede_pc_name <>", value, "accedePcName");
            return (Criteria) this;
        }

        public Criteria andAccedePcNameGreaterThan(String value) {
            addCriterion("accede_pc_name >", value, "accedePcName");
            return (Criteria) this;
        }

        public Criteria andAccedePcNameGreaterThanOrEqualTo(String value) {
            addCriterion("accede_pc_name >=", value, "accedePcName");
            return (Criteria) this;
        }

        public Criteria andAccedePcNameLessThan(String value) {
            addCriterion("accede_pc_name <", value, "accedePcName");
            return (Criteria) this;
        }

        public Criteria andAccedePcNameLessThanOrEqualTo(String value) {
            addCriterion("accede_pc_name <=", value, "accedePcName");
            return (Criteria) this;
        }

        public Criteria andAccedePcNameLike(String value) {
            addCriterion("accede_pc_name like", value, "accedePcName");
            return (Criteria) this;
        }

        public Criteria andAccedePcNameNotLike(String value) {
            addCriterion("accede_pc_name not like", value, "accedePcName");
            return (Criteria) this;
        }

        public Criteria andAccedePcNameIn(List<String> values) {
            addCriterion("accede_pc_name in", values, "accedePcName");
            return (Criteria) this;
        }

        public Criteria andAccedePcNameNotIn(List<String> values) {
            addCriterion("accede_pc_name not in", values, "accedePcName");
            return (Criteria) this;
        }

        public Criteria andAccedePcNameBetween(String value1, String value2) {
            addCriterion("accede_pc_name between", value1, value2, "accedePcName");
            return (Criteria) this;
        }

        public Criteria andAccedePcNameNotBetween(String value1, String value2) {
            addCriterion("accede_pc_name not between", value1, value2, "accedePcName");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamIdIsNull() {
            addCriterion("accede_team_id is null");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamIdIsNotNull() {
            addCriterion("accede_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamIdEqualTo(String value) {
            addCriterion("accede_team_id =", value, "accedeTeamId");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamIdNotEqualTo(String value) {
            addCriterion("accede_team_id <>", value, "accedeTeamId");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamIdGreaterThan(String value) {
            addCriterion("accede_team_id >", value, "accedeTeamId");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("accede_team_id >=", value, "accedeTeamId");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamIdLessThan(String value) {
            addCriterion("accede_team_id <", value, "accedeTeamId");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamIdLessThanOrEqualTo(String value) {
            addCriterion("accede_team_id <=", value, "accedeTeamId");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamIdLike(String value) {
            addCriterion("accede_team_id like", value, "accedeTeamId");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamIdNotLike(String value) {
            addCriterion("accede_team_id not like", value, "accedeTeamId");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamIdIn(List<String> values) {
            addCriterion("accede_team_id in", values, "accedeTeamId");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamIdNotIn(List<String> values) {
            addCriterion("accede_team_id not in", values, "accedeTeamId");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamIdBetween(String value1, String value2) {
            addCriterion("accede_team_id between", value1, value2, "accedeTeamId");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamIdNotBetween(String value1, String value2) {
            addCriterion("accede_team_id not between", value1, value2, "accedeTeamId");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamNameIsNull() {
            addCriterion("accede_team_name is null");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamNameIsNotNull() {
            addCriterion("accede_team_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamNameEqualTo(String value) {
            addCriterion("accede_team_name =", value, "accedeTeamName");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamNameNotEqualTo(String value) {
            addCriterion("accede_team_name <>", value, "accedeTeamName");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamNameGreaterThan(String value) {
            addCriterion("accede_team_name >", value, "accedeTeamName");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("accede_team_name >=", value, "accedeTeamName");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamNameLessThan(String value) {
            addCriterion("accede_team_name <", value, "accedeTeamName");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamNameLessThanOrEqualTo(String value) {
            addCriterion("accede_team_name <=", value, "accedeTeamName");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamNameLike(String value) {
            addCriterion("accede_team_name like", value, "accedeTeamName");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamNameNotLike(String value) {
            addCriterion("accede_team_name not like", value, "accedeTeamName");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamNameIn(List<String> values) {
            addCriterion("accede_team_name in", values, "accedeTeamName");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamNameNotIn(List<String> values) {
            addCriterion("accede_team_name not in", values, "accedeTeamName");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamNameBetween(String value1, String value2) {
            addCriterion("accede_team_name between", value1, value2, "accedeTeamName");
            return (Criteria) this;
        }

        public Criteria andAccedeTeamNameNotBetween(String value1, String value2) {
            addCriterion("accede_team_name not between", value1, value2, "accedeTeamName");
            return (Criteria) this;
        }

        public Criteria andAccedeBuyerIsNull() {
            addCriterion("accede_buyer is null");
            return (Criteria) this;
        }

        public Criteria andAccedeBuyerIsNotNull() {
            addCriterion("accede_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andAccedeBuyerEqualTo(String value) {
            addCriterion("accede_buyer =", value, "accedeBuyer");
            return (Criteria) this;
        }

        public Criteria andAccedeBuyerNotEqualTo(String value) {
            addCriterion("accede_buyer <>", value, "accedeBuyer");
            return (Criteria) this;
        }

        public Criteria andAccedeBuyerGreaterThan(String value) {
            addCriterion("accede_buyer >", value, "accedeBuyer");
            return (Criteria) this;
        }

        public Criteria andAccedeBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("accede_buyer >=", value, "accedeBuyer");
            return (Criteria) this;
        }

        public Criteria andAccedeBuyerLessThan(String value) {
            addCriterion("accede_buyer <", value, "accedeBuyer");
            return (Criteria) this;
        }

        public Criteria andAccedeBuyerLessThanOrEqualTo(String value) {
            addCriterion("accede_buyer <=", value, "accedeBuyer");
            return (Criteria) this;
        }

        public Criteria andAccedeBuyerLike(String value) {
            addCriterion("accede_buyer like", value, "accedeBuyer");
            return (Criteria) this;
        }

        public Criteria andAccedeBuyerNotLike(String value) {
            addCriterion("accede_buyer not like", value, "accedeBuyer");
            return (Criteria) this;
        }

        public Criteria andAccedeBuyerIn(List<String> values) {
            addCriterion("accede_buyer in", values, "accedeBuyer");
            return (Criteria) this;
        }

        public Criteria andAccedeBuyerNotIn(List<String> values) {
            addCriterion("accede_buyer not in", values, "accedeBuyer");
            return (Criteria) this;
        }

        public Criteria andAccedeBuyerBetween(String value1, String value2) {
            addCriterion("accede_buyer between", value1, value2, "accedeBuyer");
            return (Criteria) this;
        }

        public Criteria andAccedeBuyerNotBetween(String value1, String value2) {
            addCriterion("accede_buyer not between", value1, value2, "accedeBuyer");
            return (Criteria) this;
        }

        public Criteria andAccedeProjectNameIsNull() {
            addCriterion("accede_project_name is null");
            return (Criteria) this;
        }

        public Criteria andAccedeProjectNameIsNotNull() {
            addCriterion("accede_project_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccedeProjectNameEqualTo(String value) {
            addCriterion("accede_project_name =", value, "accedeProjectName");
            return (Criteria) this;
        }

        public Criteria andAccedeProjectNameNotEqualTo(String value) {
            addCriterion("accede_project_name <>", value, "accedeProjectName");
            return (Criteria) this;
        }

        public Criteria andAccedeProjectNameGreaterThan(String value) {
            addCriterion("accede_project_name >", value, "accedeProjectName");
            return (Criteria) this;
        }

        public Criteria andAccedeProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("accede_project_name >=", value, "accedeProjectName");
            return (Criteria) this;
        }

        public Criteria andAccedeProjectNameLessThan(String value) {
            addCriterion("accede_project_name <", value, "accedeProjectName");
            return (Criteria) this;
        }

        public Criteria andAccedeProjectNameLessThanOrEqualTo(String value) {
            addCriterion("accede_project_name <=", value, "accedeProjectName");
            return (Criteria) this;
        }

        public Criteria andAccedeProjectNameLike(String value) {
            addCriterion("accede_project_name like", value, "accedeProjectName");
            return (Criteria) this;
        }

        public Criteria andAccedeProjectNameNotLike(String value) {
            addCriterion("accede_project_name not like", value, "accedeProjectName");
            return (Criteria) this;
        }

        public Criteria andAccedeProjectNameIn(List<String> values) {
            addCriterion("accede_project_name in", values, "accedeProjectName");
            return (Criteria) this;
        }

        public Criteria andAccedeProjectNameNotIn(List<String> values) {
            addCriterion("accede_project_name not in", values, "accedeProjectName");
            return (Criteria) this;
        }

        public Criteria andAccedeProjectNameBetween(String value1, String value2) {
            addCriterion("accede_project_name between", value1, value2, "accedeProjectName");
            return (Criteria) this;
        }

        public Criteria andAccedeProjectNameNotBetween(String value1, String value2) {
            addCriterion("accede_project_name not between", value1, value2, "accedeProjectName");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrencyIsNull() {
            addCriterion("accede_currency is null");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrencyIsNotNull() {
            addCriterion("accede_currency is not null");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrencyEqualTo(String value) {
            addCriterion("accede_currency =", value, "accedeCurrency");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrencyNotEqualTo(String value) {
            addCriterion("accede_currency <>", value, "accedeCurrency");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrencyGreaterThan(String value) {
            addCriterion("accede_currency >", value, "accedeCurrency");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("accede_currency >=", value, "accedeCurrency");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrencyLessThan(String value) {
            addCriterion("accede_currency <", value, "accedeCurrency");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrencyLessThanOrEqualTo(String value) {
            addCriterion("accede_currency <=", value, "accedeCurrency");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrencyLike(String value) {
            addCriterion("accede_currency like", value, "accedeCurrency");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrencyNotLike(String value) {
            addCriterion("accede_currency not like", value, "accedeCurrency");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrencyIn(List<String> values) {
            addCriterion("accede_currency in", values, "accedeCurrency");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrencyNotIn(List<String> values) {
            addCriterion("accede_currency not in", values, "accedeCurrency");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrencyBetween(String value1, String value2) {
            addCriterion("accede_currency between", value1, value2, "accedeCurrency");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrencyNotBetween(String value1, String value2) {
            addCriterion("accede_currency not between", value1, value2, "accedeCurrency");
            return (Criteria) this;
        }

        public Criteria andAccedeExchangeRateIsNull() {
            addCriterion("accede_exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andAccedeExchangeRateIsNotNull() {
            addCriterion("accede_exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAccedeExchangeRateEqualTo(Double value) {
            addCriterion("accede_exchange_rate =", value, "accedeExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccedeExchangeRateNotEqualTo(Double value) {
            addCriterion("accede_exchange_rate <>", value, "accedeExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccedeExchangeRateGreaterThan(Double value) {
            addCriterion("accede_exchange_rate >", value, "accedeExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccedeExchangeRateGreaterThanOrEqualTo(Double value) {
            addCriterion("accede_exchange_rate >=", value, "accedeExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccedeExchangeRateLessThan(Double value) {
            addCriterion("accede_exchange_rate <", value, "accedeExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccedeExchangeRateLessThanOrEqualTo(Double value) {
            addCriterion("accede_exchange_rate <=", value, "accedeExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccedeExchangeRateIn(List<Double> values) {
            addCriterion("accede_exchange_rate in", values, "accedeExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccedeExchangeRateNotIn(List<Double> values) {
            addCriterion("accede_exchange_rate not in", values, "accedeExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccedeExchangeRateBetween(Double value1, Double value2) {
            addCriterion("accede_exchange_rate between", value1, value2, "accedeExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccedeExchangeRateNotBetween(Double value1, Double value2) {
            addCriterion("accede_exchange_rate not between", value1, value2, "accedeExchangeRate");
            return (Criteria) this;
        }

        public Criteria andAccedePayablesmainPriceIsNull() {
            addCriterion("accede_payablesmain_price is null");
            return (Criteria) this;
        }

        public Criteria andAccedePayablesmainPriceIsNotNull() {
            addCriterion("accede_payablesmain_price is not null");
            return (Criteria) this;
        }

        public Criteria andAccedePayablesmainPriceEqualTo(Double value) {
            addCriterion("accede_payablesmain_price =", value, "accedePayablesmainPrice");
            return (Criteria) this;
        }

        public Criteria andAccedePayablesmainPriceNotEqualTo(Double value) {
            addCriterion("accede_payablesmain_price <>", value, "accedePayablesmainPrice");
            return (Criteria) this;
        }

        public Criteria andAccedePayablesmainPriceGreaterThan(Double value) {
            addCriterion("accede_payablesmain_price >", value, "accedePayablesmainPrice");
            return (Criteria) this;
        }

        public Criteria andAccedePayablesmainPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("accede_payablesmain_price >=", value, "accedePayablesmainPrice");
            return (Criteria) this;
        }

        public Criteria andAccedePayablesmainPriceLessThan(Double value) {
            addCriterion("accede_payablesmain_price <", value, "accedePayablesmainPrice");
            return (Criteria) this;
        }

        public Criteria andAccedePayablesmainPriceLessThanOrEqualTo(Double value) {
            addCriterion("accede_payablesmain_price <=", value, "accedePayablesmainPrice");
            return (Criteria) this;
        }

        public Criteria andAccedePayablesmainPriceIn(List<Double> values) {
            addCriterion("accede_payablesmain_price in", values, "accedePayablesmainPrice");
            return (Criteria) this;
        }

        public Criteria andAccedePayablesmainPriceNotIn(List<Double> values) {
            addCriterion("accede_payablesmain_price not in", values, "accedePayablesmainPrice");
            return (Criteria) this;
        }

        public Criteria andAccedePayablesmainPriceBetween(Double value1, Double value2) {
            addCriterion("accede_payablesmain_price between", value1, value2, "accedePayablesmainPrice");
            return (Criteria) this;
        }

        public Criteria andAccedePayablesmainPriceNotBetween(Double value1, Double value2) {
            addCriterion("accede_payablesmain_price not between", value1, value2, "accedePayablesmainPrice");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrentbalanceIsNull() {
            addCriterion("accede_currentbalance is null");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrentbalanceIsNotNull() {
            addCriterion("accede_currentbalance is not null");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrentbalanceEqualTo(Double value) {
            addCriterion("accede_currentbalance =", value, "accedeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrentbalanceNotEqualTo(Double value) {
            addCriterion("accede_currentbalance <>", value, "accedeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrentbalanceGreaterThan(Double value) {
            addCriterion("accede_currentbalance >", value, "accedeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrentbalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("accede_currentbalance >=", value, "accedeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrentbalanceLessThan(Double value) {
            addCriterion("accede_currentbalance <", value, "accedeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrentbalanceLessThanOrEqualTo(Double value) {
            addCriterion("accede_currentbalance <=", value, "accedeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrentbalanceIn(List<Double> values) {
            addCriterion("accede_currentbalance in", values, "accedeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrentbalanceNotIn(List<Double> values) {
            addCriterion("accede_currentbalance not in", values, "accedeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrentbalanceBetween(Double value1, Double value2) {
            addCriterion("accede_currentbalance between", value1, value2, "accedeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAccedeCurrentbalanceNotBetween(Double value1, Double value2) {
            addCriterion("accede_currentbalance not between", value1, value2, "accedeCurrentbalance");
            return (Criteria) this;
        }

        public Criteria andAccedeDiscountamountIsNull() {
            addCriterion("accede_discountamount is null");
            return (Criteria) this;
        }

        public Criteria andAccedeDiscountamountIsNotNull() {
            addCriterion("accede_discountamount is not null");
            return (Criteria) this;
        }

        public Criteria andAccedeDiscountamountEqualTo(Double value) {
            addCriterion("accede_discountamount =", value, "accedeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andAccedeDiscountamountNotEqualTo(Double value) {
            addCriterion("accede_discountamount <>", value, "accedeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andAccedeDiscountamountGreaterThan(Double value) {
            addCriterion("accede_discountamount >", value, "accedeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andAccedeDiscountamountGreaterThanOrEqualTo(Double value) {
            addCriterion("accede_discountamount >=", value, "accedeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andAccedeDiscountamountLessThan(Double value) {
            addCriterion("accede_discountamount <", value, "accedeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andAccedeDiscountamountLessThanOrEqualTo(Double value) {
            addCriterion("accede_discountamount <=", value, "accedeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andAccedeDiscountamountIn(List<Double> values) {
            addCriterion("accede_discountamount in", values, "accedeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andAccedeDiscountamountNotIn(List<Double> values) {
            addCriterion("accede_discountamount not in", values, "accedeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andAccedeDiscountamountBetween(Double value1, Double value2) {
            addCriterion("accede_discountamount between", value1, value2, "accedeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andAccedeDiscountamountNotBetween(Double value1, Double value2) {
            addCriterion("accede_discountamount not between", value1, value2, "accedeDiscountamount");
            return (Criteria) this;
        }

        public Criteria andAccedeAmountchargedIsNull() {
            addCriterion("accede_amountcharged is null");
            return (Criteria) this;
        }

        public Criteria andAccedeAmountchargedIsNotNull() {
            addCriterion("accede_amountcharged is not null");
            return (Criteria) this;
        }

        public Criteria andAccedeAmountchargedEqualTo(Double value) {
            addCriterion("accede_amountcharged =", value, "accedeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andAccedeAmountchargedNotEqualTo(Double value) {
            addCriterion("accede_amountcharged <>", value, "accedeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andAccedeAmountchargedGreaterThan(Double value) {
            addCriterion("accede_amountcharged >", value, "accedeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andAccedeAmountchargedGreaterThanOrEqualTo(Double value) {
            addCriterion("accede_amountcharged >=", value, "accedeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andAccedeAmountchargedLessThan(Double value) {
            addCriterion("accede_amountcharged <", value, "accedeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andAccedeAmountchargedLessThanOrEqualTo(Double value) {
            addCriterion("accede_amountcharged <=", value, "accedeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andAccedeAmountchargedIn(List<Double> values) {
            addCriterion("accede_amountcharged in", values, "accedeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andAccedeAmountchargedNotIn(List<Double> values) {
            addCriterion("accede_amountcharged not in", values, "accedeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andAccedeAmountchargedBetween(Double value1, Double value2) {
            addCriterion("accede_amountcharged between", value1, value2, "accedeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andAccedeAmountchargedNotBetween(Double value1, Double value2) {
            addCriterion("accede_amountcharged not between", value1, value2, "accedeAmountcharged");
            return (Criteria) this;
        }

        public Criteria andAccedeOffsetamountIsNull() {
            addCriterion("accede_offsetamount is null");
            return (Criteria) this;
        }

        public Criteria andAccedeOffsetamountIsNotNull() {
            addCriterion("accede_offsetamount is not null");
            return (Criteria) this;
        }

        public Criteria andAccedeOffsetamountEqualTo(Double value) {
            addCriterion("accede_offsetamount =", value, "accedeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andAccedeOffsetamountNotEqualTo(Double value) {
            addCriterion("accede_offsetamount <>", value, "accedeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andAccedeOffsetamountGreaterThan(Double value) {
            addCriterion("accede_offsetamount >", value, "accedeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andAccedeOffsetamountGreaterThanOrEqualTo(Double value) {
            addCriterion("accede_offsetamount >=", value, "accedeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andAccedeOffsetamountLessThan(Double value) {
            addCriterion("accede_offsetamount <", value, "accedeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andAccedeOffsetamountLessThanOrEqualTo(Double value) {
            addCriterion("accede_offsetamount <=", value, "accedeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andAccedeOffsetamountIn(List<Double> values) {
            addCriterion("accede_offsetamount in", values, "accedeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andAccedeOffsetamountNotIn(List<Double> values) {
            addCriterion("accede_offsetamount not in", values, "accedeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andAccedeOffsetamountBetween(Double value1, Double value2) {
            addCriterion("accede_offsetamount between", value1, value2, "accedeOffsetamount");
            return (Criteria) this;
        }

        public Criteria andAccedeOffsetamountNotBetween(Double value1, Double value2) {
            addCriterion("accede_offsetamount not between", value1, value2, "accedeOffsetamount");
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