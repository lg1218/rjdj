package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PriabillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PriabillExample() {
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

        public Criteria andPriabillIdIsNull() {
            addCriterion("priabill_id is null");
            return (Criteria) this;
        }

        public Criteria andPriabillIdIsNotNull() {
            addCriterion("priabill_id is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillIdEqualTo(String value) {
            addCriterion("priabill_id =", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdNotEqualTo(String value) {
            addCriterion("priabill_id <>", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdGreaterThan(String value) {
            addCriterion("priabill_id >", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdGreaterThanOrEqualTo(String value) {
            addCriterion("priabill_id >=", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdLessThan(String value) {
            addCriterion("priabill_id <", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdLessThanOrEqualTo(String value) {
            addCriterion("priabill_id <=", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdLike(String value) {
            addCriterion("priabill_id like", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdNotLike(String value) {
            addCriterion("priabill_id not like", value, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdIn(List<String> values) {
            addCriterion("priabill_id in", values, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdNotIn(List<String> values) {
            addCriterion("priabill_id not in", values, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdBetween(String value1, String value2) {
            addCriterion("priabill_id between", value1, value2, "priabillId");
            return (Criteria) this;
        }

        public Criteria andPriabillIdNotBetween(String value1, String value2) {
            addCriterion("priabill_id not between", value1, value2, "priabillId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("supplier_id like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("supplier_id not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andScsIdIsNull() {
            addCriterion("scs_id is null");
            return (Criteria) this;
        }

        public Criteria andScsIdIsNotNull() {
            addCriterion("scs_id is not null");
            return (Criteria) this;
        }

        public Criteria andScsIdEqualTo(Integer value) {
            addCriterion("scs_id =", value, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdNotEqualTo(Integer value) {
            addCriterion("scs_id <>", value, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdGreaterThan(Integer value) {
            addCriterion("scs_id >", value, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scs_id >=", value, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdLessThan(Integer value) {
            addCriterion("scs_id <", value, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdLessThanOrEqualTo(Integer value) {
            addCriterion("scs_id <=", value, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdIn(List<Integer> values) {
            addCriterion("scs_id in", values, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdNotIn(List<Integer> values) {
            addCriterion("scs_id not in", values, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdBetween(Integer value1, Integer value2) {
            addCriterion("scs_id between", value1, value2, "scsId");
            return (Criteria) this;
        }

        public Criteria andScsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scs_id not between", value1, value2, "scsId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNull() {
            addCriterion("currency_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNotNull() {
            addCriterion("currency_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdEqualTo(String value) {
            addCriterion("currency_id =", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotEqualTo(String value) {
            addCriterion("currency_id <>", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThan(String value) {
            addCriterion("currency_id >", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("currency_id >=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThan(String value) {
            addCriterion("currency_id <", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThanOrEqualTo(String value) {
            addCriterion("currency_id <=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLike(String value) {
            addCriterion("currency_id like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotLike(String value) {
            addCriterion("currency_id not like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIn(List<String> values) {
            addCriterion("currency_id in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotIn(List<String> values) {
            addCriterion("currency_id not in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdBetween(String value1, String value2) {
            addCriterion("currency_id between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotBetween(String value1, String value2) {
            addCriterion("currency_id not between", value1, value2, "currencyId");
            return (Criteria) this;
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

        public Criteria andPriabillSupplierNameIsNull() {
            addCriterion("priabill_supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andPriabillSupplierNameIsNotNull() {
            addCriterion("priabill_supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillSupplierNameEqualTo(String value) {
            addCriterion("priabill_supplier_name =", value, "priabillSupplierName");
            return (Criteria) this;
        }

        public Criteria andPriabillSupplierNameNotEqualTo(String value) {
            addCriterion("priabill_supplier_name <>", value, "priabillSupplierName");
            return (Criteria) this;
        }

        public Criteria andPriabillSupplierNameGreaterThan(String value) {
            addCriterion("priabill_supplier_name >", value, "priabillSupplierName");
            return (Criteria) this;
        }

        public Criteria andPriabillSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("priabill_supplier_name >=", value, "priabillSupplierName");
            return (Criteria) this;
        }

        public Criteria andPriabillSupplierNameLessThan(String value) {
            addCriterion("priabill_supplier_name <", value, "priabillSupplierName");
            return (Criteria) this;
        }

        public Criteria andPriabillSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("priabill_supplier_name <=", value, "priabillSupplierName");
            return (Criteria) this;
        }

        public Criteria andPriabillSupplierNameLike(String value) {
            addCriterion("priabill_supplier_name like", value, "priabillSupplierName");
            return (Criteria) this;
        }

        public Criteria andPriabillSupplierNameNotLike(String value) {
            addCriterion("priabill_supplier_name not like", value, "priabillSupplierName");
            return (Criteria) this;
        }

        public Criteria andPriabillSupplierNameIn(List<String> values) {
            addCriterion("priabill_supplier_name in", values, "priabillSupplierName");
            return (Criteria) this;
        }

        public Criteria andPriabillSupplierNameNotIn(List<String> values) {
            addCriterion("priabill_supplier_name not in", values, "priabillSupplierName");
            return (Criteria) this;
        }

        public Criteria andPriabillSupplierNameBetween(String value1, String value2) {
            addCriterion("priabill_supplier_name between", value1, value2, "priabillSupplierName");
            return (Criteria) this;
        }

        public Criteria andPriabillSupplierNameNotBetween(String value1, String value2) {
            addCriterion("priabill_supplier_name not between", value1, value2, "priabillSupplierName");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName1IsNull() {
            addCriterion("priabill_sat_name1 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName1IsNotNull() {
            addCriterion("priabill_sat_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName1EqualTo(Integer value) {
            addCriterion("priabill_sat_name1 =", value, "priabillSatName1");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName1NotEqualTo(Integer value) {
            addCriterion("priabill_sat_name1 <>", value, "priabillSatName1");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName1GreaterThan(Integer value) {
            addCriterion("priabill_sat_name1 >", value, "priabillSatName1");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName1GreaterThanOrEqualTo(Integer value) {
            addCriterion("priabill_sat_name1 >=", value, "priabillSatName1");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName1LessThan(Integer value) {
            addCriterion("priabill_sat_name1 <", value, "priabillSatName1");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName1LessThanOrEqualTo(Integer value) {
            addCriterion("priabill_sat_name1 <=", value, "priabillSatName1");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName1In(List<Integer> values) {
            addCriterion("priabill_sat_name1 in", values, "priabillSatName1");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName1NotIn(List<Integer> values) {
            addCriterion("priabill_sat_name1 not in", values, "priabillSatName1");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName1Between(Integer value1, Integer value2) {
            addCriterion("priabill_sat_name1 between", value1, value2, "priabillSatName1");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName1NotBetween(Integer value1, Integer value2) {
            addCriterion("priabill_sat_name1 not between", value1, value2, "priabillSatName1");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice1IsNull() {
            addCriterion("priabill_Price1 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice1IsNotNull() {
            addCriterion("priabill_Price1 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice1EqualTo(Float value) {
            addCriterion("priabill_Price1 =", value, "priabillPrice1");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice1NotEqualTo(Float value) {
            addCriterion("priabill_Price1 <>", value, "priabillPrice1");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice1GreaterThan(Float value) {
            addCriterion("priabill_Price1 >", value, "priabillPrice1");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice1GreaterThanOrEqualTo(Float value) {
            addCriterion("priabill_Price1 >=", value, "priabillPrice1");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice1LessThan(Float value) {
            addCriterion("priabill_Price1 <", value, "priabillPrice1");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice1LessThanOrEqualTo(Float value) {
            addCriterion("priabill_Price1 <=", value, "priabillPrice1");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice1In(List<Float> values) {
            addCriterion("priabill_Price1 in", values, "priabillPrice1");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice1NotIn(List<Float> values) {
            addCriterion("priabill_Price1 not in", values, "priabillPrice1");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice1Between(Float value1, Float value2) {
            addCriterion("priabill_Price1 between", value1, value2, "priabillPrice1");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice1NotBetween(Float value1, Float value2) {
            addCriterion("priabill_Price1 not between", value1, value2, "priabillPrice1");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName2IsNull() {
            addCriterion("priabill_sat_name2 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName2IsNotNull() {
            addCriterion("priabill_sat_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName2EqualTo(Integer value) {
            addCriterion("priabill_sat_name2 =", value, "priabillSatName2");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName2NotEqualTo(Integer value) {
            addCriterion("priabill_sat_name2 <>", value, "priabillSatName2");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName2GreaterThan(Integer value) {
            addCriterion("priabill_sat_name2 >", value, "priabillSatName2");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName2GreaterThanOrEqualTo(Integer value) {
            addCriterion("priabill_sat_name2 >=", value, "priabillSatName2");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName2LessThan(Integer value) {
            addCriterion("priabill_sat_name2 <", value, "priabillSatName2");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName2LessThanOrEqualTo(Integer value) {
            addCriterion("priabill_sat_name2 <=", value, "priabillSatName2");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName2In(List<Integer> values) {
            addCriterion("priabill_sat_name2 in", values, "priabillSatName2");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName2NotIn(List<Integer> values) {
            addCriterion("priabill_sat_name2 not in", values, "priabillSatName2");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName2Between(Integer value1, Integer value2) {
            addCriterion("priabill_sat_name2 between", value1, value2, "priabillSatName2");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName2NotBetween(Integer value1, Integer value2) {
            addCriterion("priabill_sat_name2 not between", value1, value2, "priabillSatName2");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice2IsNull() {
            addCriterion("priabill_Price2 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice2IsNotNull() {
            addCriterion("priabill_Price2 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice2EqualTo(Float value) {
            addCriterion("priabill_Price2 =", value, "priabillPrice2");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice2NotEqualTo(Float value) {
            addCriterion("priabill_Price2 <>", value, "priabillPrice2");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice2GreaterThan(Float value) {
            addCriterion("priabill_Price2 >", value, "priabillPrice2");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice2GreaterThanOrEqualTo(Float value) {
            addCriterion("priabill_Price2 >=", value, "priabillPrice2");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice2LessThan(Float value) {
            addCriterion("priabill_Price2 <", value, "priabillPrice2");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice2LessThanOrEqualTo(Float value) {
            addCriterion("priabill_Price2 <=", value, "priabillPrice2");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice2In(List<Float> values) {
            addCriterion("priabill_Price2 in", values, "priabillPrice2");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice2NotIn(List<Float> values) {
            addCriterion("priabill_Price2 not in", values, "priabillPrice2");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice2Between(Float value1, Float value2) {
            addCriterion("priabill_Price2 between", value1, value2, "priabillPrice2");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice2NotBetween(Float value1, Float value2) {
            addCriterion("priabill_Price2 not between", value1, value2, "priabillPrice2");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName3IsNull() {
            addCriterion("priabill_sat_name3 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName3IsNotNull() {
            addCriterion("priabill_sat_name3 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName3EqualTo(Integer value) {
            addCriterion("priabill_sat_name3 =", value, "priabillSatName3");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName3NotEqualTo(Integer value) {
            addCriterion("priabill_sat_name3 <>", value, "priabillSatName3");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName3GreaterThan(Integer value) {
            addCriterion("priabill_sat_name3 >", value, "priabillSatName3");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName3GreaterThanOrEqualTo(Integer value) {
            addCriterion("priabill_sat_name3 >=", value, "priabillSatName3");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName3LessThan(Integer value) {
            addCriterion("priabill_sat_name3 <", value, "priabillSatName3");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName3LessThanOrEqualTo(Integer value) {
            addCriterion("priabill_sat_name3 <=", value, "priabillSatName3");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName3In(List<Integer> values) {
            addCriterion("priabill_sat_name3 in", values, "priabillSatName3");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName3NotIn(List<Integer> values) {
            addCriterion("priabill_sat_name3 not in", values, "priabillSatName3");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName3Between(Integer value1, Integer value2) {
            addCriterion("priabill_sat_name3 between", value1, value2, "priabillSatName3");
            return (Criteria) this;
        }

        public Criteria andPriabillSatName3NotBetween(Integer value1, Integer value2) {
            addCriterion("priabill_sat_name3 not between", value1, value2, "priabillSatName3");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice3IsNull() {
            addCriterion("priabill_Price3 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice3IsNotNull() {
            addCriterion("priabill_Price3 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice3EqualTo(Float value) {
            addCriterion("priabill_Price3 =", value, "priabillPrice3");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice3NotEqualTo(Float value) {
            addCriterion("priabill_Price3 <>", value, "priabillPrice3");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice3GreaterThan(Float value) {
            addCriterion("priabill_Price3 >", value, "priabillPrice3");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice3GreaterThanOrEqualTo(Float value) {
            addCriterion("priabill_Price3 >=", value, "priabillPrice3");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice3LessThan(Float value) {
            addCriterion("priabill_Price3 <", value, "priabillPrice3");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice3LessThanOrEqualTo(Float value) {
            addCriterion("priabill_Price3 <=", value, "priabillPrice3");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice3In(List<Float> values) {
            addCriterion("priabill_Price3 in", values, "priabillPrice3");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice3NotIn(List<Float> values) {
            addCriterion("priabill_Price3 not in", values, "priabillPrice3");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice3Between(Float value1, Float value2) {
            addCriterion("priabill_Price3 between", value1, value2, "priabillPrice3");
            return (Criteria) this;
        }

        public Criteria andPriabillPrice3NotBetween(Float value1, Float value2) {
            addCriterion("priabill_Price3 not between", value1, value2, "priabillPrice3");
            return (Criteria) this;
        }

        public Criteria andPriabillZhekouIsNull() {
            addCriterion("priabill_zhekou is null");
            return (Criteria) this;
        }

        public Criteria andPriabillZhekouIsNotNull() {
            addCriterion("priabill_zhekou is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillZhekouEqualTo(Integer value) {
            addCriterion("priabill_zhekou =", value, "priabillZhekou");
            return (Criteria) this;
        }

        public Criteria andPriabillZhekouNotEqualTo(Integer value) {
            addCriterion("priabill_zhekou <>", value, "priabillZhekou");
            return (Criteria) this;
        }

        public Criteria andPriabillZhekouGreaterThan(Integer value) {
            addCriterion("priabill_zhekou >", value, "priabillZhekou");
            return (Criteria) this;
        }

        public Criteria andPriabillZhekouGreaterThanOrEqualTo(Integer value) {
            addCriterion("priabill_zhekou >=", value, "priabillZhekou");
            return (Criteria) this;
        }

        public Criteria andPriabillZhekouLessThan(Integer value) {
            addCriterion("priabill_zhekou <", value, "priabillZhekou");
            return (Criteria) this;
        }

        public Criteria andPriabillZhekouLessThanOrEqualTo(Integer value) {
            addCriterion("priabill_zhekou <=", value, "priabillZhekou");
            return (Criteria) this;
        }

        public Criteria andPriabillZhekouIn(List<Integer> values) {
            addCriterion("priabill_zhekou in", values, "priabillZhekou");
            return (Criteria) this;
        }

        public Criteria andPriabillZhekouNotIn(List<Integer> values) {
            addCriterion("priabill_zhekou not in", values, "priabillZhekou");
            return (Criteria) this;
        }

        public Criteria andPriabillZhekouBetween(Integer value1, Integer value2) {
            addCriterion("priabill_zhekou between", value1, value2, "priabillZhekou");
            return (Criteria) this;
        }

        public Criteria andPriabillZhekouNotBetween(Integer value1, Integer value2) {
            addCriterion("priabill_zhekou not between", value1, value2, "priabillZhekou");
            return (Criteria) this;
        }

        public Criteria andPriabillEndtimeIsNull() {
            addCriterion("priabill_endtime is null");
            return (Criteria) this;
        }

        public Criteria andPriabillEndtimeIsNotNull() {
            addCriterion("priabill_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("priabill_endtime =", value, "priabillEndtime");
            return (Criteria) this;
        }

        public Criteria andPriabillEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("priabill_endtime <>", value, "priabillEndtime");
            return (Criteria) this;
        }

        public Criteria andPriabillEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("priabill_endtime >", value, "priabillEndtime");
            return (Criteria) this;
        }

        public Criteria andPriabillEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("priabill_endtime >=", value, "priabillEndtime");
            return (Criteria) this;
        }

        public Criteria andPriabillEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("priabill_endtime <", value, "priabillEndtime");
            return (Criteria) this;
        }

        public Criteria andPriabillEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("priabill_endtime <=", value, "priabillEndtime");
            return (Criteria) this;
        }

        public Criteria andPriabillEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("priabill_endtime in", values, "priabillEndtime");
            return (Criteria) this;
        }

        public Criteria andPriabillEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("priabill_endtime not in", values, "priabillEndtime");
            return (Criteria) this;
        }

        public Criteria andPriabillEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("priabill_endtime between", value1, value2, "priabillEndtime");
            return (Criteria) this;
        }

        public Criteria andPriabillEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("priabill_endtime not between", value1, value2, "priabillEndtime");
            return (Criteria) this;
        }

        public Criteria andPriabillPayablestimeIsNull() {
            addCriterion("priabill_payablestime is null");
            return (Criteria) this;
        }

        public Criteria andPriabillPayablestimeIsNotNull() {
            addCriterion("priabill_payablestime is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillPayablestimeEqualTo(Date value) {
            addCriterion("priabill_payablestime =", value, "priabillPayablestime");
            return (Criteria) this;
        }

        public Criteria andPriabillPayablestimeNotEqualTo(Date value) {
            addCriterion("priabill_payablestime <>", value, "priabillPayablestime");
            return (Criteria) this;
        }

        public Criteria andPriabillPayablestimeGreaterThan(Date value) {
            addCriterion("priabill_payablestime >", value, "priabillPayablestime");
            return (Criteria) this;
        }

        public Criteria andPriabillPayablestimeGreaterThanOrEqualTo(Date value) {
            addCriterion("priabill_payablestime >=", value, "priabillPayablestime");
            return (Criteria) this;
        }

        public Criteria andPriabillPayablestimeLessThan(Date value) {
            addCriterion("priabill_payablestime <", value, "priabillPayablestime");
            return (Criteria) this;
        }

        public Criteria andPriabillPayablestimeLessThanOrEqualTo(Date value) {
            addCriterion("priabill_payablestime <=", value, "priabillPayablestime");
            return (Criteria) this;
        }

        public Criteria andPriabillPayablestimeIn(List<Date> values) {
            addCriterion("priabill_payablestime in", values, "priabillPayablestime");
            return (Criteria) this;
        }

        public Criteria andPriabillPayablestimeNotIn(List<Date> values) {
            addCriterion("priabill_payablestime not in", values, "priabillPayablestime");
            return (Criteria) this;
        }

        public Criteria andPriabillPayablestimeBetween(Date value1, Date value2) {
            addCriterion("priabill_payablestime between", value1, value2, "priabillPayablestime");
            return (Criteria) this;
        }

        public Criteria andPriabillPayablestimeNotBetween(Date value1, Date value2) {
            addCriterion("priabill_payablestime not between", value1, value2, "priabillPayablestime");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyNameIsNull() {
            addCriterion("priabill_currency_name is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyNameIsNotNull() {
            addCriterion("priabill_currency_name is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyNameEqualTo(String value) {
            addCriterion("priabill_currency_name =", value, "priabillCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyNameNotEqualTo(String value) {
            addCriterion("priabill_currency_name <>", value, "priabillCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyNameGreaterThan(String value) {
            addCriterion("priabill_currency_name >", value, "priabillCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("priabill_currency_name >=", value, "priabillCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyNameLessThan(String value) {
            addCriterion("priabill_currency_name <", value, "priabillCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyNameLessThanOrEqualTo(String value) {
            addCriterion("priabill_currency_name <=", value, "priabillCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyNameLike(String value) {
            addCriterion("priabill_currency_name like", value, "priabillCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyNameNotLike(String value) {
            addCriterion("priabill_currency_name not like", value, "priabillCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyNameIn(List<String> values) {
            addCriterion("priabill_currency_name in", values, "priabillCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyNameNotIn(List<String> values) {
            addCriterion("priabill_currency_name not in", values, "priabillCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyNameBetween(String value1, String value2) {
            addCriterion("priabill_currency_name between", value1, value2, "priabillCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyNameNotBetween(String value1, String value2) {
            addCriterion("priabill_currency_name not between", value1, value2, "priabillCurrencyName");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyInexchangeIsNull() {
            addCriterion("priabill_currency_inexchange is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyInexchangeIsNotNull() {
            addCriterion("priabill_currency_inexchange is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyInexchangeEqualTo(String value) {
            addCriterion("priabill_currency_inexchange =", value, "priabillCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyInexchangeNotEqualTo(String value) {
            addCriterion("priabill_currency_inexchange <>", value, "priabillCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyInexchangeGreaterThan(String value) {
            addCriterion("priabill_currency_inexchange >", value, "priabillCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyInexchangeGreaterThanOrEqualTo(String value) {
            addCriterion("priabill_currency_inexchange >=", value, "priabillCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyInexchangeLessThan(String value) {
            addCriterion("priabill_currency_inexchange <", value, "priabillCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyInexchangeLessThanOrEqualTo(String value) {
            addCriterion("priabill_currency_inexchange <=", value, "priabillCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyInexchangeLike(String value) {
            addCriterion("priabill_currency_inexchange like", value, "priabillCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyInexchangeNotLike(String value) {
            addCriterion("priabill_currency_inexchange not like", value, "priabillCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyInexchangeIn(List<String> values) {
            addCriterion("priabill_currency_inexchange in", values, "priabillCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyInexchangeNotIn(List<String> values) {
            addCriterion("priabill_currency_inexchange not in", values, "priabillCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyInexchangeBetween(String value1, String value2) {
            addCriterion("priabill_currency_inexchange between", value1, value2, "priabillCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPriabillCurrencyInexchangeNotBetween(String value1, String value2) {
            addCriterion("priabill_currency_inexchange not between", value1, value2, "priabillCurrencyInexchange");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeIsNull() {
            addCriterion("priabill_type is null");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeIsNotNull() {
            addCriterion("priabill_type is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeEqualTo(String value) {
            addCriterion("priabill_type =", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeNotEqualTo(String value) {
            addCriterion("priabill_type <>", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeGreaterThan(String value) {
            addCriterion("priabill_type >", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("priabill_type >=", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeLessThan(String value) {
            addCriterion("priabill_type <", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeLessThanOrEqualTo(String value) {
            addCriterion("priabill_type <=", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeLike(String value) {
            addCriterion("priabill_type like", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeNotLike(String value) {
            addCriterion("priabill_type not like", value, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeIn(List<String> values) {
            addCriterion("priabill_type in", values, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeNotIn(List<String> values) {
            addCriterion("priabill_type not in", values, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeBetween(String value1, String value2) {
            addCriterion("priabill_type between", value1, value2, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillTypeNotBetween(String value1, String value2) {
            addCriterion("priabill_type not between", value1, value2, "priabillType");
            return (Criteria) this;
        }

        public Criteria andPriabillVouchernoIsNull() {
            addCriterion("priabill_voucherNo is null");
            return (Criteria) this;
        }

        public Criteria andPriabillVouchernoIsNotNull() {
            addCriterion("priabill_voucherNo is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillVouchernoEqualTo(String value) {
            addCriterion("priabill_voucherNo =", value, "priabillVoucherno");
            return (Criteria) this;
        }

        public Criteria andPriabillVouchernoNotEqualTo(String value) {
            addCriterion("priabill_voucherNo <>", value, "priabillVoucherno");
            return (Criteria) this;
        }

        public Criteria andPriabillVouchernoGreaterThan(String value) {
            addCriterion("priabill_voucherNo >", value, "priabillVoucherno");
            return (Criteria) this;
        }

        public Criteria andPriabillVouchernoGreaterThanOrEqualTo(String value) {
            addCriterion("priabill_voucherNo >=", value, "priabillVoucherno");
            return (Criteria) this;
        }

        public Criteria andPriabillVouchernoLessThan(String value) {
            addCriterion("priabill_voucherNo <", value, "priabillVoucherno");
            return (Criteria) this;
        }

        public Criteria andPriabillVouchernoLessThanOrEqualTo(String value) {
            addCriterion("priabill_voucherNo <=", value, "priabillVoucherno");
            return (Criteria) this;
        }

        public Criteria andPriabillVouchernoLike(String value) {
            addCriterion("priabill_voucherNo like", value, "priabillVoucherno");
            return (Criteria) this;
        }

        public Criteria andPriabillVouchernoNotLike(String value) {
            addCriterion("priabill_voucherNo not like", value, "priabillVoucherno");
            return (Criteria) this;
        }

        public Criteria andPriabillVouchernoIn(List<String> values) {
            addCriterion("priabill_voucherNo in", values, "priabillVoucherno");
            return (Criteria) this;
        }

        public Criteria andPriabillVouchernoNotIn(List<String> values) {
            addCriterion("priabill_voucherNo not in", values, "priabillVoucherno");
            return (Criteria) this;
        }

        public Criteria andPriabillVouchernoBetween(String value1, String value2) {
            addCriterion("priabill_voucherNo between", value1, value2, "priabillVoucherno");
            return (Criteria) this;
        }

        public Criteria andPriabillVouchernoNotBetween(String value1, String value2) {
            addCriterion("priabill_voucherNo not between", value1, value2, "priabillVoucherno");
            return (Criteria) this;
        }

        public Criteria andPriabillTeamNameIsNull() {
            addCriterion("priabill_team_name is null");
            return (Criteria) this;
        }

        public Criteria andPriabillTeamNameIsNotNull() {
            addCriterion("priabill_team_name is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillTeamNameEqualTo(String value) {
            addCriterion("priabill_team_name =", value, "priabillTeamName");
            return (Criteria) this;
        }

        public Criteria andPriabillTeamNameNotEqualTo(String value) {
            addCriterion("priabill_team_name <>", value, "priabillTeamName");
            return (Criteria) this;
        }

        public Criteria andPriabillTeamNameGreaterThan(String value) {
            addCriterion("priabill_team_name >", value, "priabillTeamName");
            return (Criteria) this;
        }

        public Criteria andPriabillTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("priabill_team_name >=", value, "priabillTeamName");
            return (Criteria) this;
        }

        public Criteria andPriabillTeamNameLessThan(String value) {
            addCriterion("priabill_team_name <", value, "priabillTeamName");
            return (Criteria) this;
        }

        public Criteria andPriabillTeamNameLessThanOrEqualTo(String value) {
            addCriterion("priabill_team_name <=", value, "priabillTeamName");
            return (Criteria) this;
        }

        public Criteria andPriabillTeamNameLike(String value) {
            addCriterion("priabill_team_name like", value, "priabillTeamName");
            return (Criteria) this;
        }

        public Criteria andPriabillTeamNameNotLike(String value) {
            addCriterion("priabill_team_name not like", value, "priabillTeamName");
            return (Criteria) this;
        }

        public Criteria andPriabillTeamNameIn(List<String> values) {
            addCriterion("priabill_team_name in", values, "priabillTeamName");
            return (Criteria) this;
        }

        public Criteria andPriabillTeamNameNotIn(List<String> values) {
            addCriterion("priabill_team_name not in", values, "priabillTeamName");
            return (Criteria) this;
        }

        public Criteria andPriabillTeamNameBetween(String value1, String value2) {
            addCriterion("priabill_team_name between", value1, value2, "priabillTeamName");
            return (Criteria) this;
        }

        public Criteria andPriabillTeamNameNotBetween(String value1, String value2) {
            addCriterion("priabill_team_name not between", value1, value2, "priabillTeamName");
            return (Criteria) this;
        }

        public Criteria andPriabillProjectNameIsNull() {
            addCriterion("priabill_project_name is null");
            return (Criteria) this;
        }

        public Criteria andPriabillProjectNameIsNotNull() {
            addCriterion("priabill_project_name is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillProjectNameEqualTo(String value) {
            addCriterion("priabill_project_name =", value, "priabillProjectName");
            return (Criteria) this;
        }

        public Criteria andPriabillProjectNameNotEqualTo(String value) {
            addCriterion("priabill_project_name <>", value, "priabillProjectName");
            return (Criteria) this;
        }

        public Criteria andPriabillProjectNameGreaterThan(String value) {
            addCriterion("priabill_project_name >", value, "priabillProjectName");
            return (Criteria) this;
        }

        public Criteria andPriabillProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("priabill_project_name >=", value, "priabillProjectName");
            return (Criteria) this;
        }

        public Criteria andPriabillProjectNameLessThan(String value) {
            addCriterion("priabill_project_name <", value, "priabillProjectName");
            return (Criteria) this;
        }

        public Criteria andPriabillProjectNameLessThanOrEqualTo(String value) {
            addCriterion("priabill_project_name <=", value, "priabillProjectName");
            return (Criteria) this;
        }

        public Criteria andPriabillProjectNameLike(String value) {
            addCriterion("priabill_project_name like", value, "priabillProjectName");
            return (Criteria) this;
        }

        public Criteria andPriabillProjectNameNotLike(String value) {
            addCriterion("priabill_project_name not like", value, "priabillProjectName");
            return (Criteria) this;
        }

        public Criteria andPriabillProjectNameIn(List<String> values) {
            addCriterion("priabill_project_name in", values, "priabillProjectName");
            return (Criteria) this;
        }

        public Criteria andPriabillProjectNameNotIn(List<String> values) {
            addCriterion("priabill_project_name not in", values, "priabillProjectName");
            return (Criteria) this;
        }

        public Criteria andPriabillProjectNameBetween(String value1, String value2) {
            addCriterion("priabill_project_name between", value1, value2, "priabillProjectName");
            return (Criteria) this;
        }

        public Criteria andPriabillProjectNameNotBetween(String value1, String value2) {
            addCriterion("priabill_project_name not between", value1, value2, "priabillProjectName");
            return (Criteria) this;
        }

        public Criteria andPriabillBillpersonnelIsNull() {
            addCriterion("priabill_billpersonnel is null");
            return (Criteria) this;
        }

        public Criteria andPriabillBillpersonnelIsNotNull() {
            addCriterion("priabill_billpersonnel is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillBillpersonnelEqualTo(String value) {
            addCriterion("priabill_billpersonnel =", value, "priabillBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPriabillBillpersonnelNotEqualTo(String value) {
            addCriterion("priabill_billpersonnel <>", value, "priabillBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPriabillBillpersonnelGreaterThan(String value) {
            addCriterion("priabill_billpersonnel >", value, "priabillBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPriabillBillpersonnelGreaterThanOrEqualTo(String value) {
            addCriterion("priabill_billpersonnel >=", value, "priabillBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPriabillBillpersonnelLessThan(String value) {
            addCriterion("priabill_billpersonnel <", value, "priabillBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPriabillBillpersonnelLessThanOrEqualTo(String value) {
            addCriterion("priabill_billpersonnel <=", value, "priabillBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPriabillBillpersonnelLike(String value) {
            addCriterion("priabill_billpersonnel like", value, "priabillBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPriabillBillpersonnelNotLike(String value) {
            addCriterion("priabill_billpersonnel not like", value, "priabillBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPriabillBillpersonnelIn(List<String> values) {
            addCriterion("priabill_billpersonnel in", values, "priabillBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPriabillBillpersonnelNotIn(List<String> values) {
            addCriterion("priabill_billpersonnel not in", values, "priabillBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPriabillBillpersonnelBetween(String value1, String value2) {
            addCriterion("priabill_billpersonnel between", value1, value2, "priabillBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPriabillBillpersonnelNotBetween(String value1, String value2) {
            addCriterion("priabill_billpersonnel not between", value1, value2, "priabillBillpersonnel");
            return (Criteria) this;
        }

        public Criteria andPriabillReviewersIsNull() {
            addCriterion("priabill_reviewers is null");
            return (Criteria) this;
        }

        public Criteria andPriabillReviewersIsNotNull() {
            addCriterion("priabill_reviewers is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillReviewersEqualTo(String value) {
            addCriterion("priabill_reviewers =", value, "priabillReviewers");
            return (Criteria) this;
        }

        public Criteria andPriabillReviewersNotEqualTo(String value) {
            addCriterion("priabill_reviewers <>", value, "priabillReviewers");
            return (Criteria) this;
        }

        public Criteria andPriabillReviewersGreaterThan(String value) {
            addCriterion("priabill_reviewers >", value, "priabillReviewers");
            return (Criteria) this;
        }

        public Criteria andPriabillReviewersGreaterThanOrEqualTo(String value) {
            addCriterion("priabill_reviewers >=", value, "priabillReviewers");
            return (Criteria) this;
        }

        public Criteria andPriabillReviewersLessThan(String value) {
            addCriterion("priabill_reviewers <", value, "priabillReviewers");
            return (Criteria) this;
        }

        public Criteria andPriabillReviewersLessThanOrEqualTo(String value) {
            addCriterion("priabill_reviewers <=", value, "priabillReviewers");
            return (Criteria) this;
        }

        public Criteria andPriabillReviewersLike(String value) {
            addCriterion("priabill_reviewers like", value, "priabillReviewers");
            return (Criteria) this;
        }

        public Criteria andPriabillReviewersNotLike(String value) {
            addCriterion("priabill_reviewers not like", value, "priabillReviewers");
            return (Criteria) this;
        }

        public Criteria andPriabillReviewersIn(List<String> values) {
            addCriterion("priabill_reviewers in", values, "priabillReviewers");
            return (Criteria) this;
        }

        public Criteria andPriabillReviewersNotIn(List<String> values) {
            addCriterion("priabill_reviewers not in", values, "priabillReviewers");
            return (Criteria) this;
        }

        public Criteria andPriabillReviewersBetween(String value1, String value2) {
            addCriterion("priabill_reviewers between", value1, value2, "priabillReviewers");
            return (Criteria) this;
        }

        public Criteria andPriabillReviewersNotBetween(String value1, String value2) {
            addCriterion("priabill_reviewers not between", value1, value2, "priabillReviewers");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksIsNull() {
            addCriterion("priabill_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksIsNotNull() {
            addCriterion("priabill_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksEqualTo(String value) {
            addCriterion("priabill_remarks =", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksNotEqualTo(String value) {
            addCriterion("priabill_remarks <>", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksGreaterThan(String value) {
            addCriterion("priabill_remarks >", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("priabill_remarks >=", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksLessThan(String value) {
            addCriterion("priabill_remarks <", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksLessThanOrEqualTo(String value) {
            addCriterion("priabill_remarks <=", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksLike(String value) {
            addCriterion("priabill_remarks like", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksNotLike(String value) {
            addCriterion("priabill_remarks not like", value, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksIn(List<String> values) {
            addCriterion("priabill_remarks in", values, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksNotIn(List<String> values) {
            addCriterion("priabill_remarks not in", values, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksBetween(String value1, String value2) {
            addCriterion("priabill_remarks between", value1, value2, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillRemarksNotBetween(String value1, String value2) {
            addCriterion("priabill_remarks not between", value1, value2, "priabillRemarks");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditstatusIsNull() {
            addCriterion("priabill_auditstatus is null");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditstatusIsNotNull() {
            addCriterion("priabill_auditstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditstatusEqualTo(Integer value) {
            addCriterion("priabill_auditstatus =", value, "priabillAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditstatusNotEqualTo(Integer value) {
            addCriterion("priabill_auditstatus <>", value, "priabillAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditstatusGreaterThan(Integer value) {
            addCriterion("priabill_auditstatus >", value, "priabillAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("priabill_auditstatus >=", value, "priabillAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditstatusLessThan(Integer value) {
            addCriterion("priabill_auditstatus <", value, "priabillAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditstatusLessThanOrEqualTo(Integer value) {
            addCriterion("priabill_auditstatus <=", value, "priabillAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditstatusIn(List<Integer> values) {
            addCriterion("priabill_auditstatus in", values, "priabillAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditstatusNotIn(List<Integer> values) {
            addCriterion("priabill_auditstatus not in", values, "priabillAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditstatusBetween(Integer value1, Integer value2) {
            addCriterion("priabill_auditstatus between", value1, value2, "priabillAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("priabill_auditstatus not between", value1, value2, "priabillAuditstatus");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingIsNull() {
            addCriterion("priabill_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingIsNotNull() {
            addCriterion("priabill_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingEqualTo(String value) {
            addCriterion("priabill_Auditing =", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingNotEqualTo(String value) {
            addCriterion("priabill_Auditing <>", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingGreaterThan(String value) {
            addCriterion("priabill_Auditing >", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("priabill_Auditing >=", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingLessThan(String value) {
            addCriterion("priabill_Auditing <", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingLessThanOrEqualTo(String value) {
            addCriterion("priabill_Auditing <=", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingLike(String value) {
            addCriterion("priabill_Auditing like", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingNotLike(String value) {
            addCriterion("priabill_Auditing not like", value, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingIn(List<String> values) {
            addCriterion("priabill_Auditing in", values, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingNotIn(List<String> values) {
            addCriterion("priabill_Auditing not in", values, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingBetween(String value1, String value2) {
            addCriterion("priabill_Auditing between", value1, value2, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillAuditingNotBetween(String value1, String value2) {
            addCriterion("priabill_Auditing not between", value1, value2, "priabillAuditing");
            return (Criteria) this;
        }

        public Criteria andPriabillYnIsNull() {
            addCriterion("priabill_yn is null");
            return (Criteria) this;
        }

        public Criteria andPriabillYnIsNotNull() {
            addCriterion("priabill_yn is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillYnEqualTo(String value) {
            addCriterion("priabill_yn =", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnNotEqualTo(String value) {
            addCriterion("priabill_yn <>", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnGreaterThan(String value) {
            addCriterion("priabill_yn >", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnGreaterThanOrEqualTo(String value) {
            addCriterion("priabill_yn >=", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnLessThan(String value) {
            addCriterion("priabill_yn <", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnLessThanOrEqualTo(String value) {
            addCriterion("priabill_yn <=", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnLike(String value) {
            addCriterion("priabill_yn like", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnNotLike(String value) {
            addCriterion("priabill_yn not like", value, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnIn(List<String> values) {
            addCriterion("priabill_yn in", values, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnNotIn(List<String> values) {
            addCriterion("priabill_yn not in", values, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnBetween(String value1, String value2) {
            addCriterion("priabill_yn between", value1, value2, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andPriabillYnNotBetween(String value1, String value2) {
            addCriterion("priabill_yn not between", value1, value2, "priabillYn");
            return (Criteria) this;
        }

        public Criteria andTpriabillCustom1IsNull() {
            addCriterion("tpriabill_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andTpriabillCustom1IsNotNull() {
            addCriterion("tpriabill_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andTpriabillCustom1EqualTo(String value) {
            addCriterion("tpriabill_custom1 =", value, "tpriabillCustom1");
            return (Criteria) this;
        }

        public Criteria andTpriabillCustom1NotEqualTo(String value) {
            addCriterion("tpriabill_custom1 <>", value, "tpriabillCustom1");
            return (Criteria) this;
        }

        public Criteria andTpriabillCustom1GreaterThan(String value) {
            addCriterion("tpriabill_custom1 >", value, "tpriabillCustom1");
            return (Criteria) this;
        }

        public Criteria andTpriabillCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("tpriabill_custom1 >=", value, "tpriabillCustom1");
            return (Criteria) this;
        }

        public Criteria andTpriabillCustom1LessThan(String value) {
            addCriterion("tpriabill_custom1 <", value, "tpriabillCustom1");
            return (Criteria) this;
        }

        public Criteria andTpriabillCustom1LessThanOrEqualTo(String value) {
            addCriterion("tpriabill_custom1 <=", value, "tpriabillCustom1");
            return (Criteria) this;
        }

        public Criteria andTpriabillCustom1Like(String value) {
            addCriterion("tpriabill_custom1 like", value, "tpriabillCustom1");
            return (Criteria) this;
        }

        public Criteria andTpriabillCustom1NotLike(String value) {
            addCriterion("tpriabill_custom1 not like", value, "tpriabillCustom1");
            return (Criteria) this;
        }

        public Criteria andTpriabillCustom1In(List<String> values) {
            addCriterion("tpriabill_custom1 in", values, "tpriabillCustom1");
            return (Criteria) this;
        }

        public Criteria andTpriabillCustom1NotIn(List<String> values) {
            addCriterion("tpriabill_custom1 not in", values, "tpriabillCustom1");
            return (Criteria) this;
        }

        public Criteria andTpriabillCustom1Between(String value1, String value2) {
            addCriterion("tpriabill_custom1 between", value1, value2, "tpriabillCustom1");
            return (Criteria) this;
        }

        public Criteria andTpriabillCustom1NotBetween(String value1, String value2) {
            addCriterion("tpriabill_custom1 not between", value1, value2, "tpriabillCustom1");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2IsNull() {
            addCriterion("priabill_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2IsNotNull() {
            addCriterion("priabill_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2EqualTo(String value) {
            addCriterion("priabill_custom2 =", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2NotEqualTo(String value) {
            addCriterion("priabill_custom2 <>", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2GreaterThan(String value) {
            addCriterion("priabill_custom2 >", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("priabill_custom2 >=", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2LessThan(String value) {
            addCriterion("priabill_custom2 <", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2LessThanOrEqualTo(String value) {
            addCriterion("priabill_custom2 <=", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2Like(String value) {
            addCriterion("priabill_custom2 like", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2NotLike(String value) {
            addCriterion("priabill_custom2 not like", value, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2In(List<String> values) {
            addCriterion("priabill_custom2 in", values, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2NotIn(List<String> values) {
            addCriterion("priabill_custom2 not in", values, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2Between(String value1, String value2) {
            addCriterion("priabill_custom2 between", value1, value2, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom2NotBetween(String value1, String value2) {
            addCriterion("priabill_custom2 not between", value1, value2, "priabillCustom2");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3IsNull() {
            addCriterion("priabill_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3IsNotNull() {
            addCriterion("priabill_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3EqualTo(String value) {
            addCriterion("priabill_custom3 =", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3NotEqualTo(String value) {
            addCriterion("priabill_custom3 <>", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3GreaterThan(String value) {
            addCriterion("priabill_custom3 >", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("priabill_custom3 >=", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3LessThan(String value) {
            addCriterion("priabill_custom3 <", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3LessThanOrEqualTo(String value) {
            addCriterion("priabill_custom3 <=", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3Like(String value) {
            addCriterion("priabill_custom3 like", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3NotLike(String value) {
            addCriterion("priabill_custom3 not like", value, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3In(List<String> values) {
            addCriterion("priabill_custom3 in", values, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3NotIn(List<String> values) {
            addCriterion("priabill_custom3 not in", values, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3Between(String value1, String value2) {
            addCriterion("priabill_custom3 between", value1, value2, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom3NotBetween(String value1, String value2) {
            addCriterion("priabill_custom3 not between", value1, value2, "priabillCustom3");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4IsNull() {
            addCriterion("priabill_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4IsNotNull() {
            addCriterion("priabill_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4EqualTo(String value) {
            addCriterion("priabill_custom4 =", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4NotEqualTo(String value) {
            addCriterion("priabill_custom4 <>", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4GreaterThan(String value) {
            addCriterion("priabill_custom4 >", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("priabill_custom4 >=", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4LessThan(String value) {
            addCriterion("priabill_custom4 <", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4LessThanOrEqualTo(String value) {
            addCriterion("priabill_custom4 <=", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4Like(String value) {
            addCriterion("priabill_custom4 like", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4NotLike(String value) {
            addCriterion("priabill_custom4 not like", value, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4In(List<String> values) {
            addCriterion("priabill_custom4 in", values, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4NotIn(List<String> values) {
            addCriterion("priabill_custom4 not in", values, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4Between(String value1, String value2) {
            addCriterion("priabill_custom4 between", value1, value2, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom4NotBetween(String value1, String value2) {
            addCriterion("priabill_custom4 not between", value1, value2, "priabillCustom4");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5IsNull() {
            addCriterion("priabill_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5IsNotNull() {
            addCriterion("priabill_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5EqualTo(String value) {
            addCriterion("priabill_custom5 =", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5NotEqualTo(String value) {
            addCriterion("priabill_custom5 <>", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5GreaterThan(String value) {
            addCriterion("priabill_custom5 >", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("priabill_custom5 >=", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5LessThan(String value) {
            addCriterion("priabill_custom5 <", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5LessThanOrEqualTo(String value) {
            addCriterion("priabill_custom5 <=", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5Like(String value) {
            addCriterion("priabill_custom5 like", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5NotLike(String value) {
            addCriterion("priabill_custom5 not like", value, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5In(List<String> values) {
            addCriterion("priabill_custom5 in", values, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5NotIn(List<String> values) {
            addCriterion("priabill_custom5 not in", values, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5Between(String value1, String value2) {
            addCriterion("priabill_custom5 between", value1, value2, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom5NotBetween(String value1, String value2) {
            addCriterion("priabill_custom5 not between", value1, value2, "priabillCustom5");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6IsNull() {
            addCriterion("priabill_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6IsNotNull() {
            addCriterion("priabill_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6EqualTo(String value) {
            addCriterion("priabill_custom6 =", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6NotEqualTo(String value) {
            addCriterion("priabill_custom6 <>", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6GreaterThan(String value) {
            addCriterion("priabill_custom6 >", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("priabill_custom6 >=", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6LessThan(String value) {
            addCriterion("priabill_custom6 <", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6LessThanOrEqualTo(String value) {
            addCriterion("priabill_custom6 <=", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6Like(String value) {
            addCriterion("priabill_custom6 like", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6NotLike(String value) {
            addCriterion("priabill_custom6 not like", value, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6In(List<String> values) {
            addCriterion("priabill_custom6 in", values, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6NotIn(List<String> values) {
            addCriterion("priabill_custom6 not in", values, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6Between(String value1, String value2) {
            addCriterion("priabill_custom6 between", value1, value2, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom6NotBetween(String value1, String value2) {
            addCriterion("priabill_custom6 not between", value1, value2, "priabillCustom6");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7IsNull() {
            addCriterion("priabill_custom7 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7IsNotNull() {
            addCriterion("priabill_custom7 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7EqualTo(String value) {
            addCriterion("priabill_custom7 =", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7NotEqualTo(String value) {
            addCriterion("priabill_custom7 <>", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7GreaterThan(String value) {
            addCriterion("priabill_custom7 >", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7GreaterThanOrEqualTo(String value) {
            addCriterion("priabill_custom7 >=", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7LessThan(String value) {
            addCriterion("priabill_custom7 <", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7LessThanOrEqualTo(String value) {
            addCriterion("priabill_custom7 <=", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7Like(String value) {
            addCriterion("priabill_custom7 like", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7NotLike(String value) {
            addCriterion("priabill_custom7 not like", value, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7In(List<String> values) {
            addCriterion("priabill_custom7 in", values, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7NotIn(List<String> values) {
            addCriterion("priabill_custom7 not in", values, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7Between(String value1, String value2) {
            addCriterion("priabill_custom7 between", value1, value2, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom7NotBetween(String value1, String value2) {
            addCriterion("priabill_custom7 not between", value1, value2, "priabillCustom7");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8IsNull() {
            addCriterion("priabill_custom8 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8IsNotNull() {
            addCriterion("priabill_custom8 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8EqualTo(String value) {
            addCriterion("priabill_custom8 =", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8NotEqualTo(String value) {
            addCriterion("priabill_custom8 <>", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8GreaterThan(String value) {
            addCriterion("priabill_custom8 >", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8GreaterThanOrEqualTo(String value) {
            addCriterion("priabill_custom8 >=", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8LessThan(String value) {
            addCriterion("priabill_custom8 <", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8LessThanOrEqualTo(String value) {
            addCriterion("priabill_custom8 <=", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8Like(String value) {
            addCriterion("priabill_custom8 like", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8NotLike(String value) {
            addCriterion("priabill_custom8 not like", value, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8In(List<String> values) {
            addCriterion("priabill_custom8 in", values, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8NotIn(List<String> values) {
            addCriterion("priabill_custom8 not in", values, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8Between(String value1, String value2) {
            addCriterion("priabill_custom8 between", value1, value2, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom8NotBetween(String value1, String value2) {
            addCriterion("priabill_custom8 not between", value1, value2, "priabillCustom8");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9IsNull() {
            addCriterion("priabill_custom9 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9IsNotNull() {
            addCriterion("priabill_custom9 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9EqualTo(String value) {
            addCriterion("priabill_custom9 =", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9NotEqualTo(String value) {
            addCriterion("priabill_custom9 <>", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9GreaterThan(String value) {
            addCriterion("priabill_custom9 >", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9GreaterThanOrEqualTo(String value) {
            addCriterion("priabill_custom9 >=", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9LessThan(String value) {
            addCriterion("priabill_custom9 <", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9LessThanOrEqualTo(String value) {
            addCriterion("priabill_custom9 <=", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9Like(String value) {
            addCriterion("priabill_custom9 like", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9NotLike(String value) {
            addCriterion("priabill_custom9 not like", value, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9In(List<String> values) {
            addCriterion("priabill_custom9 in", values, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9NotIn(List<String> values) {
            addCriterion("priabill_custom9 not in", values, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9Between(String value1, String value2) {
            addCriterion("priabill_custom9 between", value1, value2, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom9NotBetween(String value1, String value2) {
            addCriterion("priabill_custom9 not between", value1, value2, "priabillCustom9");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10IsNull() {
            addCriterion("priabill_custom10 is null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10IsNotNull() {
            addCriterion("priabill_custom10 is not null");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10EqualTo(String value) {
            addCriterion("priabill_custom10 =", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10NotEqualTo(String value) {
            addCriterion("priabill_custom10 <>", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10GreaterThan(String value) {
            addCriterion("priabill_custom10 >", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10GreaterThanOrEqualTo(String value) {
            addCriterion("priabill_custom10 >=", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10LessThan(String value) {
            addCriterion("priabill_custom10 <", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10LessThanOrEqualTo(String value) {
            addCriterion("priabill_custom10 <=", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10Like(String value) {
            addCriterion("priabill_custom10 like", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10NotLike(String value) {
            addCriterion("priabill_custom10 not like", value, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10In(List<String> values) {
            addCriterion("priabill_custom10 in", values, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10NotIn(List<String> values) {
            addCriterion("priabill_custom10 not in", values, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10Between(String value1, String value2) {
            addCriterion("priabill_custom10 between", value1, value2, "priabillCustom10");
            return (Criteria) this;
        }

        public Criteria andPriabillCustom10NotBetween(String value1, String value2) {
            addCriterion("priabill_custom10 not between", value1, value2, "priabillCustom10");
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