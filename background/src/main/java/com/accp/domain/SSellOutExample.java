package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SSellOutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SSellOutExample() {
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

        public Criteria andOuNumberIsNull() {
            addCriterion("ou_number is null");
            return (Criteria) this;
        }

        public Criteria andOuNumberIsNotNull() {
            addCriterion("ou_number is not null");
            return (Criteria) this;
        }

        public Criteria andOuNumberEqualTo(String value) {
            addCriterion("ou_number =", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberNotEqualTo(String value) {
            addCriterion("ou_number <>", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberGreaterThan(String value) {
            addCriterion("ou_number >", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ou_number >=", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberLessThan(String value) {
            addCriterion("ou_number <", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberLessThanOrEqualTo(String value) {
            addCriterion("ou_number <=", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberLike(String value) {
            addCriterion("ou_number like", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberNotLike(String value) {
            addCriterion("ou_number not like", value, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberIn(List<String> values) {
            addCriterion("ou_number in", values, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberNotIn(List<String> values) {
            addCriterion("ou_number not in", values, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberBetween(String value1, String value2) {
            addCriterion("ou_number between", value1, value2, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuNumberNotBetween(String value1, String value2) {
            addCriterion("ou_number not between", value1, value2, "ouNumber");
            return (Criteria) this;
        }

        public Criteria andOuDataIsNull() {
            addCriterion("ou_data is null");
            return (Criteria) this;
        }

        public Criteria andOuDataIsNotNull() {
            addCriterion("ou_data is not null");
            return (Criteria) this;
        }

        public Criteria andOuDataEqualTo(Date value) {
            addCriterionForJDBCDate("ou_data =", value, "ouData");
            return (Criteria) this;
        }

        public Criteria andOuDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("ou_data <>", value, "ouData");
            return (Criteria) this;
        }

        public Criteria andOuDataGreaterThan(Date value) {
            addCriterionForJDBCDate("ou_data >", value, "ouData");
            return (Criteria) this;
        }

        public Criteria andOuDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ou_data >=", value, "ouData");
            return (Criteria) this;
        }

        public Criteria andOuDataLessThan(Date value) {
            addCriterionForJDBCDate("ou_data <", value, "ouData");
            return (Criteria) this;
        }

        public Criteria andOuDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ou_data <=", value, "ouData");
            return (Criteria) this;
        }

        public Criteria andOuDataIn(List<Date> values) {
            addCriterionForJDBCDate("ou_data in", values, "ouData");
            return (Criteria) this;
        }

        public Criteria andOuDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("ou_data not in", values, "ouData");
            return (Criteria) this;
        }

        public Criteria andOuDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ou_data between", value1, value2, "ouData");
            return (Criteria) this;
        }

        public Criteria andOuDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ou_data not between", value1, value2, "ouData");
            return (Criteria) this;
        }

        public Criteria andOuClientnameIsNull() {
            addCriterion("ou_clientName is null");
            return (Criteria) this;
        }

        public Criteria andOuClientnameIsNotNull() {
            addCriterion("ou_clientName is not null");
            return (Criteria) this;
        }

        public Criteria andOuClientnameEqualTo(String value) {
            addCriterion("ou_clientName =", value, "ouClientname");
            return (Criteria) this;
        }

        public Criteria andOuClientnameNotEqualTo(String value) {
            addCriterion("ou_clientName <>", value, "ouClientname");
            return (Criteria) this;
        }

        public Criteria andOuClientnameGreaterThan(String value) {
            addCriterion("ou_clientName >", value, "ouClientname");
            return (Criteria) this;
        }

        public Criteria andOuClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("ou_clientName >=", value, "ouClientname");
            return (Criteria) this;
        }

        public Criteria andOuClientnameLessThan(String value) {
            addCriterion("ou_clientName <", value, "ouClientname");
            return (Criteria) this;
        }

        public Criteria andOuClientnameLessThanOrEqualTo(String value) {
            addCriterion("ou_clientName <=", value, "ouClientname");
            return (Criteria) this;
        }

        public Criteria andOuClientnameLike(String value) {
            addCriterion("ou_clientName like", value, "ouClientname");
            return (Criteria) this;
        }

        public Criteria andOuClientnameNotLike(String value) {
            addCriterion("ou_clientName not like", value, "ouClientname");
            return (Criteria) this;
        }

        public Criteria andOuClientnameIn(List<String> values) {
            addCriterion("ou_clientName in", values, "ouClientname");
            return (Criteria) this;
        }

        public Criteria andOuClientnameNotIn(List<String> values) {
            addCriterion("ou_clientName not in", values, "ouClientname");
            return (Criteria) this;
        }

        public Criteria andOuClientnameBetween(String value1, String value2) {
            addCriterion("ou_clientName between", value1, value2, "ouClientname");
            return (Criteria) this;
        }

        public Criteria andOuClientnameNotBetween(String value1, String value2) {
            addCriterion("ou_clientName not between", value1, value2, "ouClientname");
            return (Criteria) this;
        }

        public Criteria andOuLocationIsNull() {
            addCriterion("ou_location is null");
            return (Criteria) this;
        }

        public Criteria andOuLocationIsNotNull() {
            addCriterion("ou_location is not null");
            return (Criteria) this;
        }

        public Criteria andOuLocationEqualTo(String value) {
            addCriterion("ou_location =", value, "ouLocation");
            return (Criteria) this;
        }

        public Criteria andOuLocationNotEqualTo(String value) {
            addCriterion("ou_location <>", value, "ouLocation");
            return (Criteria) this;
        }

        public Criteria andOuLocationGreaterThan(String value) {
            addCriterion("ou_location >", value, "ouLocation");
            return (Criteria) this;
        }

        public Criteria andOuLocationGreaterThanOrEqualTo(String value) {
            addCriterion("ou_location >=", value, "ouLocation");
            return (Criteria) this;
        }

        public Criteria andOuLocationLessThan(String value) {
            addCriterion("ou_location <", value, "ouLocation");
            return (Criteria) this;
        }

        public Criteria andOuLocationLessThanOrEqualTo(String value) {
            addCriterion("ou_location <=", value, "ouLocation");
            return (Criteria) this;
        }

        public Criteria andOuLocationLike(String value) {
            addCriterion("ou_location like", value, "ouLocation");
            return (Criteria) this;
        }

        public Criteria andOuLocationNotLike(String value) {
            addCriterion("ou_location not like", value, "ouLocation");
            return (Criteria) this;
        }

        public Criteria andOuLocationIn(List<String> values) {
            addCriterion("ou_location in", values, "ouLocation");
            return (Criteria) this;
        }

        public Criteria andOuLocationNotIn(List<String> values) {
            addCriterion("ou_location not in", values, "ouLocation");
            return (Criteria) this;
        }

        public Criteria andOuLocationBetween(String value1, String value2) {
            addCriterion("ou_location between", value1, value2, "ouLocation");
            return (Criteria) this;
        }

        public Criteria andOuLocationNotBetween(String value1, String value2) {
            addCriterion("ou_location not between", value1, value2, "ouLocation");
            return (Criteria) this;
        }

        public Criteria andOuTaxIsNull() {
            addCriterion("ou_tax is null");
            return (Criteria) this;
        }

        public Criteria andOuTaxIsNotNull() {
            addCriterion("ou_tax is not null");
            return (Criteria) this;
        }

        public Criteria andOuTaxEqualTo(Integer value) {
            addCriterion("ou_tax =", value, "ouTax");
            return (Criteria) this;
        }

        public Criteria andOuTaxNotEqualTo(Integer value) {
            addCriterion("ou_tax <>", value, "ouTax");
            return (Criteria) this;
        }

        public Criteria andOuTaxGreaterThan(Integer value) {
            addCriterion("ou_tax >", value, "ouTax");
            return (Criteria) this;
        }

        public Criteria andOuTaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("ou_tax >=", value, "ouTax");
            return (Criteria) this;
        }

        public Criteria andOuTaxLessThan(Integer value) {
            addCriterion("ou_tax <", value, "ouTax");
            return (Criteria) this;
        }

        public Criteria andOuTaxLessThanOrEqualTo(Integer value) {
            addCriterion("ou_tax <=", value, "ouTax");
            return (Criteria) this;
        }

        public Criteria andOuTaxIn(List<Integer> values) {
            addCriterion("ou_tax in", values, "ouTax");
            return (Criteria) this;
        }

        public Criteria andOuTaxNotIn(List<Integer> values) {
            addCriterion("ou_tax not in", values, "ouTax");
            return (Criteria) this;
        }

        public Criteria andOuTaxBetween(Integer value1, Integer value2) {
            addCriterion("ou_tax between", value1, value2, "ouTax");
            return (Criteria) this;
        }

        public Criteria andOuTaxNotBetween(Integer value1, Integer value2) {
            addCriterion("ou_tax not between", value1, value2, "ouTax");
            return (Criteria) this;
        }

        public Criteria andOuStorageIsNull() {
            addCriterion("ou_storage is null");
            return (Criteria) this;
        }

        public Criteria andOuStorageIsNotNull() {
            addCriterion("ou_storage is not null");
            return (Criteria) this;
        }

        public Criteria andOuStorageEqualTo(String value) {
            addCriterion("ou_storage =", value, "ouStorage");
            return (Criteria) this;
        }

        public Criteria andOuStorageNotEqualTo(String value) {
            addCriterion("ou_storage <>", value, "ouStorage");
            return (Criteria) this;
        }

        public Criteria andOuStorageGreaterThan(String value) {
            addCriterion("ou_storage >", value, "ouStorage");
            return (Criteria) this;
        }

        public Criteria andOuStorageGreaterThanOrEqualTo(String value) {
            addCriterion("ou_storage >=", value, "ouStorage");
            return (Criteria) this;
        }

        public Criteria andOuStorageLessThan(String value) {
            addCriterion("ou_storage <", value, "ouStorage");
            return (Criteria) this;
        }

        public Criteria andOuStorageLessThanOrEqualTo(String value) {
            addCriterion("ou_storage <=", value, "ouStorage");
            return (Criteria) this;
        }

        public Criteria andOuStorageLike(String value) {
            addCriterion("ou_storage like", value, "ouStorage");
            return (Criteria) this;
        }

        public Criteria andOuStorageNotLike(String value) {
            addCriterion("ou_storage not like", value, "ouStorage");
            return (Criteria) this;
        }

        public Criteria andOuStorageIn(List<String> values) {
            addCriterion("ou_storage in", values, "ouStorage");
            return (Criteria) this;
        }

        public Criteria andOuStorageNotIn(List<String> values) {
            addCriterion("ou_storage not in", values, "ouStorage");
            return (Criteria) this;
        }

        public Criteria andOuStorageBetween(String value1, String value2) {
            addCriterion("ou_storage between", value1, value2, "ouStorage");
            return (Criteria) this;
        }

        public Criteria andOuStorageNotBetween(String value1, String value2) {
            addCriterion("ou_storage not between", value1, value2, "ouStorage");
            return (Criteria) this;
        }

        public Criteria andOuStoragetypeIsNull() {
            addCriterion("ou_storageType is null");
            return (Criteria) this;
        }

        public Criteria andOuStoragetypeIsNotNull() {
            addCriterion("ou_storageType is not null");
            return (Criteria) this;
        }

        public Criteria andOuStoragetypeEqualTo(String value) {
            addCriterion("ou_storageType =", value, "ouStoragetype");
            return (Criteria) this;
        }

        public Criteria andOuStoragetypeNotEqualTo(String value) {
            addCriterion("ou_storageType <>", value, "ouStoragetype");
            return (Criteria) this;
        }

        public Criteria andOuStoragetypeGreaterThan(String value) {
            addCriterion("ou_storageType >", value, "ouStoragetype");
            return (Criteria) this;
        }

        public Criteria andOuStoragetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ou_storageType >=", value, "ouStoragetype");
            return (Criteria) this;
        }

        public Criteria andOuStoragetypeLessThan(String value) {
            addCriterion("ou_storageType <", value, "ouStoragetype");
            return (Criteria) this;
        }

        public Criteria andOuStoragetypeLessThanOrEqualTo(String value) {
            addCriterion("ou_storageType <=", value, "ouStoragetype");
            return (Criteria) this;
        }

        public Criteria andOuStoragetypeLike(String value) {
            addCriterion("ou_storageType like", value, "ouStoragetype");
            return (Criteria) this;
        }

        public Criteria andOuStoragetypeNotLike(String value) {
            addCriterion("ou_storageType not like", value, "ouStoragetype");
            return (Criteria) this;
        }

        public Criteria andOuStoragetypeIn(List<String> values) {
            addCriterion("ou_storageType in", values, "ouStoragetype");
            return (Criteria) this;
        }

        public Criteria andOuStoragetypeNotIn(List<String> values) {
            addCriterion("ou_storageType not in", values, "ouStoragetype");
            return (Criteria) this;
        }

        public Criteria andOuStoragetypeBetween(String value1, String value2) {
            addCriterion("ou_storageType between", value1, value2, "ouStoragetype");
            return (Criteria) this;
        }

        public Criteria andOuStoragetypeNotBetween(String value1, String value2) {
            addCriterion("ou_storageType not between", value1, value2, "ouStoragetype");
            return (Criteria) this;
        }

        public Criteria andOuRmbIsNull() {
            addCriterion("ou_RMB is null");
            return (Criteria) this;
        }

        public Criteria andOuRmbIsNotNull() {
            addCriterion("ou_RMB is not null");
            return (Criteria) this;
        }

        public Criteria andOuRmbEqualTo(String value) {
            addCriterion("ou_RMB =", value, "ouRmb");
            return (Criteria) this;
        }

        public Criteria andOuRmbNotEqualTo(String value) {
            addCriterion("ou_RMB <>", value, "ouRmb");
            return (Criteria) this;
        }

        public Criteria andOuRmbGreaterThan(String value) {
            addCriterion("ou_RMB >", value, "ouRmb");
            return (Criteria) this;
        }

        public Criteria andOuRmbGreaterThanOrEqualTo(String value) {
            addCriterion("ou_RMB >=", value, "ouRmb");
            return (Criteria) this;
        }

        public Criteria andOuRmbLessThan(String value) {
            addCriterion("ou_RMB <", value, "ouRmb");
            return (Criteria) this;
        }

        public Criteria andOuRmbLessThanOrEqualTo(String value) {
            addCriterion("ou_RMB <=", value, "ouRmb");
            return (Criteria) this;
        }

        public Criteria andOuRmbLike(String value) {
            addCriterion("ou_RMB like", value, "ouRmb");
            return (Criteria) this;
        }

        public Criteria andOuRmbNotLike(String value) {
            addCriterion("ou_RMB not like", value, "ouRmb");
            return (Criteria) this;
        }

        public Criteria andOuRmbIn(List<String> values) {
            addCriterion("ou_RMB in", values, "ouRmb");
            return (Criteria) this;
        }

        public Criteria andOuRmbNotIn(List<String> values) {
            addCriterion("ou_RMB not in", values, "ouRmb");
            return (Criteria) this;
        }

        public Criteria andOuRmbBetween(String value1, String value2) {
            addCriterion("ou_RMB between", value1, value2, "ouRmb");
            return (Criteria) this;
        }

        public Criteria andOuRmbNotBetween(String value1, String value2) {
            addCriterion("ou_RMB not between", value1, value2, "ouRmb");
            return (Criteria) this;
        }

        public Criteria andOuParitiesIsNull() {
            addCriterion("ou_parities is null");
            return (Criteria) this;
        }

        public Criteria andOuParitiesIsNotNull() {
            addCriterion("ou_parities is not null");
            return (Criteria) this;
        }

        public Criteria andOuParitiesEqualTo(Integer value) {
            addCriterion("ou_parities =", value, "ouParities");
            return (Criteria) this;
        }

        public Criteria andOuParitiesNotEqualTo(Integer value) {
            addCriterion("ou_parities <>", value, "ouParities");
            return (Criteria) this;
        }

        public Criteria andOuParitiesGreaterThan(Integer value) {
            addCriterion("ou_parities >", value, "ouParities");
            return (Criteria) this;
        }

        public Criteria andOuParitiesGreaterThanOrEqualTo(Integer value) {
            addCriterion("ou_parities >=", value, "ouParities");
            return (Criteria) this;
        }

        public Criteria andOuParitiesLessThan(Integer value) {
            addCriterion("ou_parities <", value, "ouParities");
            return (Criteria) this;
        }

        public Criteria andOuParitiesLessThanOrEqualTo(Integer value) {
            addCriterion("ou_parities <=", value, "ouParities");
            return (Criteria) this;
        }

        public Criteria andOuParitiesIn(List<Integer> values) {
            addCriterion("ou_parities in", values, "ouParities");
            return (Criteria) this;
        }

        public Criteria andOuParitiesNotIn(List<Integer> values) {
            addCriterion("ou_parities not in", values, "ouParities");
            return (Criteria) this;
        }

        public Criteria andOuParitiesBetween(Integer value1, Integer value2) {
            addCriterion("ou_parities between", value1, value2, "ouParities");
            return (Criteria) this;
        }

        public Criteria andOuParitiesNotBetween(Integer value1, Integer value2) {
            addCriterion("ou_parities not between", value1, value2, "ouParities");
            return (Criteria) this;
        }

        public Criteria andOuSalesmanIsNull() {
            addCriterion("ou_salesman is null");
            return (Criteria) this;
        }

        public Criteria andOuSalesmanIsNotNull() {
            addCriterion("ou_salesman is not null");
            return (Criteria) this;
        }

        public Criteria andOuSalesmanEqualTo(String value) {
            addCriterion("ou_salesman =", value, "ouSalesman");
            return (Criteria) this;
        }

        public Criteria andOuSalesmanNotEqualTo(String value) {
            addCriterion("ou_salesman <>", value, "ouSalesman");
            return (Criteria) this;
        }

        public Criteria andOuSalesmanGreaterThan(String value) {
            addCriterion("ou_salesman >", value, "ouSalesman");
            return (Criteria) this;
        }

        public Criteria andOuSalesmanGreaterThanOrEqualTo(String value) {
            addCriterion("ou_salesman >=", value, "ouSalesman");
            return (Criteria) this;
        }

        public Criteria andOuSalesmanLessThan(String value) {
            addCriterion("ou_salesman <", value, "ouSalesman");
            return (Criteria) this;
        }

        public Criteria andOuSalesmanLessThanOrEqualTo(String value) {
            addCriterion("ou_salesman <=", value, "ouSalesman");
            return (Criteria) this;
        }

        public Criteria andOuSalesmanLike(String value) {
            addCriterion("ou_salesman like", value, "ouSalesman");
            return (Criteria) this;
        }

        public Criteria andOuSalesmanNotLike(String value) {
            addCriterion("ou_salesman not like", value, "ouSalesman");
            return (Criteria) this;
        }

        public Criteria andOuSalesmanIn(List<String> values) {
            addCriterion("ou_salesman in", values, "ouSalesman");
            return (Criteria) this;
        }

        public Criteria andOuSalesmanNotIn(List<String> values) {
            addCriterion("ou_salesman not in", values, "ouSalesman");
            return (Criteria) this;
        }

        public Criteria andOuSalesmanBetween(String value1, String value2) {
            addCriterion("ou_salesman between", value1, value2, "ouSalesman");
            return (Criteria) this;
        }

        public Criteria andOuSalesmanNotBetween(String value1, String value2) {
            addCriterion("ou_salesman not between", value1, value2, "ouSalesman");
            return (Criteria) this;
        }

        public Criteria andOuDepartmentIsNull() {
            addCriterion("ou_department is null");
            return (Criteria) this;
        }

        public Criteria andOuDepartmentIsNotNull() {
            addCriterion("ou_department is not null");
            return (Criteria) this;
        }

        public Criteria andOuDepartmentEqualTo(String value) {
            addCriterion("ou_department =", value, "ouDepartment");
            return (Criteria) this;
        }

        public Criteria andOuDepartmentNotEqualTo(String value) {
            addCriterion("ou_department <>", value, "ouDepartment");
            return (Criteria) this;
        }

        public Criteria andOuDepartmentGreaterThan(String value) {
            addCriterion("ou_department >", value, "ouDepartment");
            return (Criteria) this;
        }

        public Criteria andOuDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("ou_department >=", value, "ouDepartment");
            return (Criteria) this;
        }

        public Criteria andOuDepartmentLessThan(String value) {
            addCriterion("ou_department <", value, "ouDepartment");
            return (Criteria) this;
        }

        public Criteria andOuDepartmentLessThanOrEqualTo(String value) {
            addCriterion("ou_department <=", value, "ouDepartment");
            return (Criteria) this;
        }

        public Criteria andOuDepartmentLike(String value) {
            addCriterion("ou_department like", value, "ouDepartment");
            return (Criteria) this;
        }

        public Criteria andOuDepartmentNotLike(String value) {
            addCriterion("ou_department not like", value, "ouDepartment");
            return (Criteria) this;
        }

        public Criteria andOuDepartmentIn(List<String> values) {
            addCriterion("ou_department in", values, "ouDepartment");
            return (Criteria) this;
        }

        public Criteria andOuDepartmentNotIn(List<String> values) {
            addCriterion("ou_department not in", values, "ouDepartment");
            return (Criteria) this;
        }

        public Criteria andOuDepartmentBetween(String value1, String value2) {
            addCriterion("ou_department between", value1, value2, "ouDepartment");
            return (Criteria) this;
        }

        public Criteria andOuDepartmentNotBetween(String value1, String value2) {
            addCriterion("ou_department not between", value1, value2, "ouDepartment");
            return (Criteria) this;
        }

        public Criteria andOuDebtbelongIsNull() {
            addCriterion("ou_debtBelong is null");
            return (Criteria) this;
        }

        public Criteria andOuDebtbelongIsNotNull() {
            addCriterion("ou_debtBelong is not null");
            return (Criteria) this;
        }

        public Criteria andOuDebtbelongEqualTo(String value) {
            addCriterion("ou_debtBelong =", value, "ouDebtbelong");
            return (Criteria) this;
        }

        public Criteria andOuDebtbelongNotEqualTo(String value) {
            addCriterion("ou_debtBelong <>", value, "ouDebtbelong");
            return (Criteria) this;
        }

        public Criteria andOuDebtbelongGreaterThan(String value) {
            addCriterion("ou_debtBelong >", value, "ouDebtbelong");
            return (Criteria) this;
        }

        public Criteria andOuDebtbelongGreaterThanOrEqualTo(String value) {
            addCriterion("ou_debtBelong >=", value, "ouDebtbelong");
            return (Criteria) this;
        }

        public Criteria andOuDebtbelongLessThan(String value) {
            addCriterion("ou_debtBelong <", value, "ouDebtbelong");
            return (Criteria) this;
        }

        public Criteria andOuDebtbelongLessThanOrEqualTo(String value) {
            addCriterion("ou_debtBelong <=", value, "ouDebtbelong");
            return (Criteria) this;
        }

        public Criteria andOuDebtbelongLike(String value) {
            addCriterion("ou_debtBelong like", value, "ouDebtbelong");
            return (Criteria) this;
        }

        public Criteria andOuDebtbelongNotLike(String value) {
            addCriterion("ou_debtBelong not like", value, "ouDebtbelong");
            return (Criteria) this;
        }

        public Criteria andOuDebtbelongIn(List<String> values) {
            addCriterion("ou_debtBelong in", values, "ouDebtbelong");
            return (Criteria) this;
        }

        public Criteria andOuDebtbelongNotIn(List<String> values) {
            addCriterion("ou_debtBelong not in", values, "ouDebtbelong");
            return (Criteria) this;
        }

        public Criteria andOuDebtbelongBetween(String value1, String value2) {
            addCriterion("ou_debtBelong between", value1, value2, "ouDebtbelong");
            return (Criteria) this;
        }

        public Criteria andOuDebtbelongNotBetween(String value1, String value2) {
            addCriterion("ou_debtBelong not between", value1, value2, "ouDebtbelong");
            return (Criteria) this;
        }

        public Criteria andOuDedateIsNull() {
            addCriterion("ou_deDate is null");
            return (Criteria) this;
        }

        public Criteria andOuDedateIsNotNull() {
            addCriterion("ou_deDate is not null");
            return (Criteria) this;
        }

        public Criteria andOuDedateEqualTo(Date value) {
            addCriterionForJDBCDate("ou_deDate =", value, "ouDedate");
            return (Criteria) this;
        }

        public Criteria andOuDedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ou_deDate <>", value, "ouDedate");
            return (Criteria) this;
        }

        public Criteria andOuDedateGreaterThan(Date value) {
            addCriterionForJDBCDate("ou_deDate >", value, "ouDedate");
            return (Criteria) this;
        }

        public Criteria andOuDedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ou_deDate >=", value, "ouDedate");
            return (Criteria) this;
        }

        public Criteria andOuDedateLessThan(Date value) {
            addCriterionForJDBCDate("ou_deDate <", value, "ouDedate");
            return (Criteria) this;
        }

        public Criteria andOuDedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ou_deDate <=", value, "ouDedate");
            return (Criteria) this;
        }

        public Criteria andOuDedateIn(List<Date> values) {
            addCriterionForJDBCDate("ou_deDate in", values, "ouDedate");
            return (Criteria) this;
        }

        public Criteria andOuDedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ou_deDate not in", values, "ouDedate");
            return (Criteria) this;
        }

        public Criteria andOuDedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ou_deDate between", value1, value2, "ouDedate");
            return (Criteria) this;
        }

        public Criteria andOuDedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ou_deDate not between", value1, value2, "ouDedate");
            return (Criteria) this;
        }

        public Criteria andOuDebttypeIsNull() {
            addCriterion("ou_debtType is null");
            return (Criteria) this;
        }

        public Criteria andOuDebttypeIsNotNull() {
            addCriterion("ou_debtType is not null");
            return (Criteria) this;
        }

        public Criteria andOuDebttypeEqualTo(String value) {
            addCriterion("ou_debtType =", value, "ouDebttype");
            return (Criteria) this;
        }

        public Criteria andOuDebttypeNotEqualTo(String value) {
            addCriterion("ou_debtType <>", value, "ouDebttype");
            return (Criteria) this;
        }

        public Criteria andOuDebttypeGreaterThan(String value) {
            addCriterion("ou_debtType >", value, "ouDebttype");
            return (Criteria) this;
        }

        public Criteria andOuDebttypeGreaterThanOrEqualTo(String value) {
            addCriterion("ou_debtType >=", value, "ouDebttype");
            return (Criteria) this;
        }

        public Criteria andOuDebttypeLessThan(String value) {
            addCriterion("ou_debtType <", value, "ouDebttype");
            return (Criteria) this;
        }

        public Criteria andOuDebttypeLessThanOrEqualTo(String value) {
            addCriterion("ou_debtType <=", value, "ouDebttype");
            return (Criteria) this;
        }

        public Criteria andOuDebttypeLike(String value) {
            addCriterion("ou_debtType like", value, "ouDebttype");
            return (Criteria) this;
        }

        public Criteria andOuDebttypeNotLike(String value) {
            addCriterion("ou_debtType not like", value, "ouDebttype");
            return (Criteria) this;
        }

        public Criteria andOuDebttypeIn(List<String> values) {
            addCriterion("ou_debtType in", values, "ouDebttype");
            return (Criteria) this;
        }

        public Criteria andOuDebttypeNotIn(List<String> values) {
            addCriterion("ou_debtType not in", values, "ouDebttype");
            return (Criteria) this;
        }

        public Criteria andOuDebttypeBetween(String value1, String value2) {
            addCriterion("ou_debtType between", value1, value2, "ouDebttype");
            return (Criteria) this;
        }

        public Criteria andOuDebttypeNotBetween(String value1, String value2) {
            addCriterion("ou_debtType not between", value1, value2, "ouDebttype");
            return (Criteria) this;
        }

        public Criteria andOuDeyearIsNull() {
            addCriterion("ou_deYear is null");
            return (Criteria) this;
        }

        public Criteria andOuDeyearIsNotNull() {
            addCriterion("ou_deYear is not null");
            return (Criteria) this;
        }

        public Criteria andOuDeyearEqualTo(Integer value) {
            addCriterion("ou_deYear =", value, "ouDeyear");
            return (Criteria) this;
        }

        public Criteria andOuDeyearNotEqualTo(Integer value) {
            addCriterion("ou_deYear <>", value, "ouDeyear");
            return (Criteria) this;
        }

        public Criteria andOuDeyearGreaterThan(Integer value) {
            addCriterion("ou_deYear >", value, "ouDeyear");
            return (Criteria) this;
        }

        public Criteria andOuDeyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("ou_deYear >=", value, "ouDeyear");
            return (Criteria) this;
        }

        public Criteria andOuDeyearLessThan(Integer value) {
            addCriterion("ou_deYear <", value, "ouDeyear");
            return (Criteria) this;
        }

        public Criteria andOuDeyearLessThanOrEqualTo(Integer value) {
            addCriterion("ou_deYear <=", value, "ouDeyear");
            return (Criteria) this;
        }

        public Criteria andOuDeyearIn(List<Integer> values) {
            addCriterion("ou_deYear in", values, "ouDeyear");
            return (Criteria) this;
        }

        public Criteria andOuDeyearNotIn(List<Integer> values) {
            addCriterion("ou_deYear not in", values, "ouDeyear");
            return (Criteria) this;
        }

        public Criteria andOuDeyearBetween(Integer value1, Integer value2) {
            addCriterion("ou_deYear between", value1, value2, "ouDeyear");
            return (Criteria) this;
        }

        public Criteria andOuDeyearNotBetween(Integer value1, Integer value2) {
            addCriterion("ou_deYear not between", value1, value2, "ouDeyear");
            return (Criteria) this;
        }

        public Criteria andOuDebtmonthIsNull() {
            addCriterion("ou_debtMonth is null");
            return (Criteria) this;
        }

        public Criteria andOuDebtmonthIsNotNull() {
            addCriterion("ou_debtMonth is not null");
            return (Criteria) this;
        }

        public Criteria andOuDebtmonthEqualTo(Date value) {
            addCriterionForJDBCDate("ou_debtMonth =", value, "ouDebtmonth");
            return (Criteria) this;
        }

        public Criteria andOuDebtmonthNotEqualTo(Date value) {
            addCriterionForJDBCDate("ou_debtMonth <>", value, "ouDebtmonth");
            return (Criteria) this;
        }

        public Criteria andOuDebtmonthGreaterThan(Date value) {
            addCriterionForJDBCDate("ou_debtMonth >", value, "ouDebtmonth");
            return (Criteria) this;
        }

        public Criteria andOuDebtmonthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ou_debtMonth >=", value, "ouDebtmonth");
            return (Criteria) this;
        }

        public Criteria andOuDebtmonthLessThan(Date value) {
            addCriterionForJDBCDate("ou_debtMonth <", value, "ouDebtmonth");
            return (Criteria) this;
        }

        public Criteria andOuDebtmonthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ou_debtMonth <=", value, "ouDebtmonth");
            return (Criteria) this;
        }

        public Criteria andOuDebtmonthIn(List<Date> values) {
            addCriterionForJDBCDate("ou_debtMonth in", values, "ouDebtmonth");
            return (Criteria) this;
        }

        public Criteria andOuDebtmonthNotIn(List<Date> values) {
            addCriterionForJDBCDate("ou_debtMonth not in", values, "ouDebtmonth");
            return (Criteria) this;
        }

        public Criteria andOuDebtmonthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ou_debtMonth between", value1, value2, "ouDebtmonth");
            return (Criteria) this;
        }

        public Criteria andOuDebtmonthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ou_debtMonth not between", value1, value2, "ouDebtmonth");
            return (Criteria) this;
        }

        public Criteria andOuNeostaffIsNull() {
            addCriterion("ou_neoStaff is null");
            return (Criteria) this;
        }

        public Criteria andOuNeostaffIsNotNull() {
            addCriterion("ou_neoStaff is not null");
            return (Criteria) this;
        }

        public Criteria andOuNeostaffEqualTo(String value) {
            addCriterion("ou_neoStaff =", value, "ouNeostaff");
            return (Criteria) this;
        }

        public Criteria andOuNeostaffNotEqualTo(String value) {
            addCriterion("ou_neoStaff <>", value, "ouNeostaff");
            return (Criteria) this;
        }

        public Criteria andOuNeostaffGreaterThan(String value) {
            addCriterion("ou_neoStaff >", value, "ouNeostaff");
            return (Criteria) this;
        }

        public Criteria andOuNeostaffGreaterThanOrEqualTo(String value) {
            addCriterion("ou_neoStaff >=", value, "ouNeostaff");
            return (Criteria) this;
        }

        public Criteria andOuNeostaffLessThan(String value) {
            addCriterion("ou_neoStaff <", value, "ouNeostaff");
            return (Criteria) this;
        }

        public Criteria andOuNeostaffLessThanOrEqualTo(String value) {
            addCriterion("ou_neoStaff <=", value, "ouNeostaff");
            return (Criteria) this;
        }

        public Criteria andOuNeostaffLike(String value) {
            addCriterion("ou_neoStaff like", value, "ouNeostaff");
            return (Criteria) this;
        }

        public Criteria andOuNeostaffNotLike(String value) {
            addCriterion("ou_neoStaff not like", value, "ouNeostaff");
            return (Criteria) this;
        }

        public Criteria andOuNeostaffIn(List<String> values) {
            addCriterion("ou_neoStaff in", values, "ouNeostaff");
            return (Criteria) this;
        }

        public Criteria andOuNeostaffNotIn(List<String> values) {
            addCriterion("ou_neoStaff not in", values, "ouNeostaff");
            return (Criteria) this;
        }

        public Criteria andOuNeostaffBetween(String value1, String value2) {
            addCriterion("ou_neoStaff between", value1, value2, "ouNeostaff");
            return (Criteria) this;
        }

        public Criteria andOuNeostaffNotBetween(String value1, String value2) {
            addCriterion("ou_neoStaff not between", value1, value2, "ouNeostaff");
            return (Criteria) this;
        }

        public Criteria andOuCheckstaffIsNull() {
            addCriterion("ou_checkStaff is null");
            return (Criteria) this;
        }

        public Criteria andOuCheckstaffIsNotNull() {
            addCriterion("ou_checkStaff is not null");
            return (Criteria) this;
        }

        public Criteria andOuCheckstaffEqualTo(String value) {
            addCriterion("ou_checkStaff =", value, "ouCheckstaff");
            return (Criteria) this;
        }

        public Criteria andOuCheckstaffNotEqualTo(String value) {
            addCriterion("ou_checkStaff <>", value, "ouCheckstaff");
            return (Criteria) this;
        }

        public Criteria andOuCheckstaffGreaterThan(String value) {
            addCriterion("ou_checkStaff >", value, "ouCheckstaff");
            return (Criteria) this;
        }

        public Criteria andOuCheckstaffGreaterThanOrEqualTo(String value) {
            addCriterion("ou_checkStaff >=", value, "ouCheckstaff");
            return (Criteria) this;
        }

        public Criteria andOuCheckstaffLessThan(String value) {
            addCriterion("ou_checkStaff <", value, "ouCheckstaff");
            return (Criteria) this;
        }

        public Criteria andOuCheckstaffLessThanOrEqualTo(String value) {
            addCriterion("ou_checkStaff <=", value, "ouCheckstaff");
            return (Criteria) this;
        }

        public Criteria andOuCheckstaffLike(String value) {
            addCriterion("ou_checkStaff like", value, "ouCheckstaff");
            return (Criteria) this;
        }

        public Criteria andOuCheckstaffNotLike(String value) {
            addCriterion("ou_checkStaff not like", value, "ouCheckstaff");
            return (Criteria) this;
        }

        public Criteria andOuCheckstaffIn(List<String> values) {
            addCriterion("ou_checkStaff in", values, "ouCheckstaff");
            return (Criteria) this;
        }

        public Criteria andOuCheckstaffNotIn(List<String> values) {
            addCriterion("ou_checkStaff not in", values, "ouCheckstaff");
            return (Criteria) this;
        }

        public Criteria andOuCheckstaffBetween(String value1, String value2) {
            addCriterion("ou_checkStaff between", value1, value2, "ouCheckstaff");
            return (Criteria) this;
        }

        public Criteria andOuCheckstaffNotBetween(String value1, String value2) {
            addCriterion("ou_checkStaff not between", value1, value2, "ouCheckstaff");
            return (Criteria) this;
        }

        public Criteria andOuItemIsNull() {
            addCriterion("ou_item is null");
            return (Criteria) this;
        }

        public Criteria andOuItemIsNotNull() {
            addCriterion("ou_item is not null");
            return (Criteria) this;
        }

        public Criteria andOuItemEqualTo(String value) {
            addCriterion("ou_item =", value, "ouItem");
            return (Criteria) this;
        }

        public Criteria andOuItemNotEqualTo(String value) {
            addCriterion("ou_item <>", value, "ouItem");
            return (Criteria) this;
        }

        public Criteria andOuItemGreaterThan(String value) {
            addCriterion("ou_item >", value, "ouItem");
            return (Criteria) this;
        }

        public Criteria andOuItemGreaterThanOrEqualTo(String value) {
            addCriterion("ou_item >=", value, "ouItem");
            return (Criteria) this;
        }

        public Criteria andOuItemLessThan(String value) {
            addCriterion("ou_item <", value, "ouItem");
            return (Criteria) this;
        }

        public Criteria andOuItemLessThanOrEqualTo(String value) {
            addCriterion("ou_item <=", value, "ouItem");
            return (Criteria) this;
        }

        public Criteria andOuItemLike(String value) {
            addCriterion("ou_item like", value, "ouItem");
            return (Criteria) this;
        }

        public Criteria andOuItemNotLike(String value) {
            addCriterion("ou_item not like", value, "ouItem");
            return (Criteria) this;
        }

        public Criteria andOuItemIn(List<String> values) {
            addCriterion("ou_item in", values, "ouItem");
            return (Criteria) this;
        }

        public Criteria andOuItemNotIn(List<String> values) {
            addCriterion("ou_item not in", values, "ouItem");
            return (Criteria) this;
        }

        public Criteria andOuItemBetween(String value1, String value2) {
            addCriterion("ou_item between", value1, value2, "ouItem");
            return (Criteria) this;
        }

        public Criteria andOuItemNotBetween(String value1, String value2) {
            addCriterion("ou_item not between", value1, value2, "ouItem");
            return (Criteria) this;
        }

        public Criteria andOuByzd1IsNull() {
            addCriterion("ou_byzd1 is null");
            return (Criteria) this;
        }

        public Criteria andOuByzd1IsNotNull() {
            addCriterion("ou_byzd1 is not null");
            return (Criteria) this;
        }

        public Criteria andOuByzd1EqualTo(String value) {
            addCriterion("ou_byzd1 =", value, "ouByzd1");
            return (Criteria) this;
        }

        public Criteria andOuByzd1NotEqualTo(String value) {
            addCriterion("ou_byzd1 <>", value, "ouByzd1");
            return (Criteria) this;
        }

        public Criteria andOuByzd1GreaterThan(String value) {
            addCriterion("ou_byzd1 >", value, "ouByzd1");
            return (Criteria) this;
        }

        public Criteria andOuByzd1GreaterThanOrEqualTo(String value) {
            addCriterion("ou_byzd1 >=", value, "ouByzd1");
            return (Criteria) this;
        }

        public Criteria andOuByzd1LessThan(String value) {
            addCriterion("ou_byzd1 <", value, "ouByzd1");
            return (Criteria) this;
        }

        public Criteria andOuByzd1LessThanOrEqualTo(String value) {
            addCriterion("ou_byzd1 <=", value, "ouByzd1");
            return (Criteria) this;
        }

        public Criteria andOuByzd1Like(String value) {
            addCriterion("ou_byzd1 like", value, "ouByzd1");
            return (Criteria) this;
        }

        public Criteria andOuByzd1NotLike(String value) {
            addCriterion("ou_byzd1 not like", value, "ouByzd1");
            return (Criteria) this;
        }

        public Criteria andOuByzd1In(List<String> values) {
            addCriterion("ou_byzd1 in", values, "ouByzd1");
            return (Criteria) this;
        }

        public Criteria andOuByzd1NotIn(List<String> values) {
            addCriterion("ou_byzd1 not in", values, "ouByzd1");
            return (Criteria) this;
        }

        public Criteria andOuByzd1Between(String value1, String value2) {
            addCriterion("ou_byzd1 between", value1, value2, "ouByzd1");
            return (Criteria) this;
        }

        public Criteria andOuByzd1NotBetween(String value1, String value2) {
            addCriterion("ou_byzd1 not between", value1, value2, "ouByzd1");
            return (Criteria) this;
        }

        public Criteria andOuByzd2IsNull() {
            addCriterion("ou_byzd2 is null");
            return (Criteria) this;
        }

        public Criteria andOuByzd2IsNotNull() {
            addCriterion("ou_byzd2 is not null");
            return (Criteria) this;
        }

        public Criteria andOuByzd2EqualTo(String value) {
            addCriterion("ou_byzd2 =", value, "ouByzd2");
            return (Criteria) this;
        }

        public Criteria andOuByzd2NotEqualTo(String value) {
            addCriterion("ou_byzd2 <>", value, "ouByzd2");
            return (Criteria) this;
        }

        public Criteria andOuByzd2GreaterThan(String value) {
            addCriterion("ou_byzd2 >", value, "ouByzd2");
            return (Criteria) this;
        }

        public Criteria andOuByzd2GreaterThanOrEqualTo(String value) {
            addCriterion("ou_byzd2 >=", value, "ouByzd2");
            return (Criteria) this;
        }

        public Criteria andOuByzd2LessThan(String value) {
            addCriterion("ou_byzd2 <", value, "ouByzd2");
            return (Criteria) this;
        }

        public Criteria andOuByzd2LessThanOrEqualTo(String value) {
            addCriterion("ou_byzd2 <=", value, "ouByzd2");
            return (Criteria) this;
        }

        public Criteria andOuByzd2Like(String value) {
            addCriterion("ou_byzd2 like", value, "ouByzd2");
            return (Criteria) this;
        }

        public Criteria andOuByzd2NotLike(String value) {
            addCriterion("ou_byzd2 not like", value, "ouByzd2");
            return (Criteria) this;
        }

        public Criteria andOuByzd2In(List<String> values) {
            addCriterion("ou_byzd2 in", values, "ouByzd2");
            return (Criteria) this;
        }

        public Criteria andOuByzd2NotIn(List<String> values) {
            addCriterion("ou_byzd2 not in", values, "ouByzd2");
            return (Criteria) this;
        }

        public Criteria andOuByzd2Between(String value1, String value2) {
            addCriterion("ou_byzd2 between", value1, value2, "ouByzd2");
            return (Criteria) this;
        }

        public Criteria andOuByzd2NotBetween(String value1, String value2) {
            addCriterion("ou_byzd2 not between", value1, value2, "ouByzd2");
            return (Criteria) this;
        }

        public Criteria andOuByzd3IsNull() {
            addCriterion("ou_byzd3 is null");
            return (Criteria) this;
        }

        public Criteria andOuByzd3IsNotNull() {
            addCriterion("ou_byzd3 is not null");
            return (Criteria) this;
        }

        public Criteria andOuByzd3EqualTo(String value) {
            addCriterion("ou_byzd3 =", value, "ouByzd3");
            return (Criteria) this;
        }

        public Criteria andOuByzd3NotEqualTo(String value) {
            addCriterion("ou_byzd3 <>", value, "ouByzd3");
            return (Criteria) this;
        }

        public Criteria andOuByzd3GreaterThan(String value) {
            addCriterion("ou_byzd3 >", value, "ouByzd3");
            return (Criteria) this;
        }

        public Criteria andOuByzd3GreaterThanOrEqualTo(String value) {
            addCriterion("ou_byzd3 >=", value, "ouByzd3");
            return (Criteria) this;
        }

        public Criteria andOuByzd3LessThan(String value) {
            addCriterion("ou_byzd3 <", value, "ouByzd3");
            return (Criteria) this;
        }

        public Criteria andOuByzd3LessThanOrEqualTo(String value) {
            addCriterion("ou_byzd3 <=", value, "ouByzd3");
            return (Criteria) this;
        }

        public Criteria andOuByzd3Like(String value) {
            addCriterion("ou_byzd3 like", value, "ouByzd3");
            return (Criteria) this;
        }

        public Criteria andOuByzd3NotLike(String value) {
            addCriterion("ou_byzd3 not like", value, "ouByzd3");
            return (Criteria) this;
        }

        public Criteria andOuByzd3In(List<String> values) {
            addCriterion("ou_byzd3 in", values, "ouByzd3");
            return (Criteria) this;
        }

        public Criteria andOuByzd3NotIn(List<String> values) {
            addCriterion("ou_byzd3 not in", values, "ouByzd3");
            return (Criteria) this;
        }

        public Criteria andOuByzd3Between(String value1, String value2) {
            addCriterion("ou_byzd3 between", value1, value2, "ouByzd3");
            return (Criteria) this;
        }

        public Criteria andOuByzd3NotBetween(String value1, String value2) {
            addCriterion("ou_byzd3 not between", value1, value2, "ouByzd3");
            return (Criteria) this;
        }

        public Criteria andOuByzd4IsNull() {
            addCriterion("ou_byzd4 is null");
            return (Criteria) this;
        }

        public Criteria andOuByzd4IsNotNull() {
            addCriterion("ou_byzd4 is not null");
            return (Criteria) this;
        }

        public Criteria andOuByzd4EqualTo(String value) {
            addCriterion("ou_byzd4 =", value, "ouByzd4");
            return (Criteria) this;
        }

        public Criteria andOuByzd4NotEqualTo(String value) {
            addCriterion("ou_byzd4 <>", value, "ouByzd4");
            return (Criteria) this;
        }

        public Criteria andOuByzd4GreaterThan(String value) {
            addCriterion("ou_byzd4 >", value, "ouByzd4");
            return (Criteria) this;
        }

        public Criteria andOuByzd4GreaterThanOrEqualTo(String value) {
            addCriterion("ou_byzd4 >=", value, "ouByzd4");
            return (Criteria) this;
        }

        public Criteria andOuByzd4LessThan(String value) {
            addCriterion("ou_byzd4 <", value, "ouByzd4");
            return (Criteria) this;
        }

        public Criteria andOuByzd4LessThanOrEqualTo(String value) {
            addCriterion("ou_byzd4 <=", value, "ouByzd4");
            return (Criteria) this;
        }

        public Criteria andOuByzd4Like(String value) {
            addCriterion("ou_byzd4 like", value, "ouByzd4");
            return (Criteria) this;
        }

        public Criteria andOuByzd4NotLike(String value) {
            addCriterion("ou_byzd4 not like", value, "ouByzd4");
            return (Criteria) this;
        }

        public Criteria andOuByzd4In(List<String> values) {
            addCriterion("ou_byzd4 in", values, "ouByzd4");
            return (Criteria) this;
        }

        public Criteria andOuByzd4NotIn(List<String> values) {
            addCriterion("ou_byzd4 not in", values, "ouByzd4");
            return (Criteria) this;
        }

        public Criteria andOuByzd4Between(String value1, String value2) {
            addCriterion("ou_byzd4 between", value1, value2, "ouByzd4");
            return (Criteria) this;
        }

        public Criteria andOuByzd4NotBetween(String value1, String value2) {
            addCriterion("ou_byzd4 not between", value1, value2, "ouByzd4");
            return (Criteria) this;
        }

        public Criteria andOuByzd5IsNull() {
            addCriterion("ou_byzd5 is null");
            return (Criteria) this;
        }

        public Criteria andOuByzd5IsNotNull() {
            addCriterion("ou_byzd5 is not null");
            return (Criteria) this;
        }

        public Criteria andOuByzd5EqualTo(String value) {
            addCriterion("ou_byzd5 =", value, "ouByzd5");
            return (Criteria) this;
        }

        public Criteria andOuByzd5NotEqualTo(String value) {
            addCriterion("ou_byzd5 <>", value, "ouByzd5");
            return (Criteria) this;
        }

        public Criteria andOuByzd5GreaterThan(String value) {
            addCriterion("ou_byzd5 >", value, "ouByzd5");
            return (Criteria) this;
        }

        public Criteria andOuByzd5GreaterThanOrEqualTo(String value) {
            addCriterion("ou_byzd5 >=", value, "ouByzd5");
            return (Criteria) this;
        }

        public Criteria andOuByzd5LessThan(String value) {
            addCriterion("ou_byzd5 <", value, "ouByzd5");
            return (Criteria) this;
        }

        public Criteria andOuByzd5LessThanOrEqualTo(String value) {
            addCriterion("ou_byzd5 <=", value, "ouByzd5");
            return (Criteria) this;
        }

        public Criteria andOuByzd5Like(String value) {
            addCriterion("ou_byzd5 like", value, "ouByzd5");
            return (Criteria) this;
        }

        public Criteria andOuByzd5NotLike(String value) {
            addCriterion("ou_byzd5 not like", value, "ouByzd5");
            return (Criteria) this;
        }

        public Criteria andOuByzd5In(List<String> values) {
            addCriterion("ou_byzd5 in", values, "ouByzd5");
            return (Criteria) this;
        }

        public Criteria andOuByzd5NotIn(List<String> values) {
            addCriterion("ou_byzd5 not in", values, "ouByzd5");
            return (Criteria) this;
        }

        public Criteria andOuByzd5Between(String value1, String value2) {
            addCriterion("ou_byzd5 between", value1, value2, "ouByzd5");
            return (Criteria) this;
        }

        public Criteria andOuByzd5NotBetween(String value1, String value2) {
            addCriterion("ou_byzd5 not between", value1, value2, "ouByzd5");
            return (Criteria) this;
        }

        public Criteria andOuByzd6IsNull() {
            addCriterion("ou_byzd6 is null");
            return (Criteria) this;
        }

        public Criteria andOuByzd6IsNotNull() {
            addCriterion("ou_byzd6 is not null");
            return (Criteria) this;
        }

        public Criteria andOuByzd6EqualTo(String value) {
            addCriterion("ou_byzd6 =", value, "ouByzd6");
            return (Criteria) this;
        }

        public Criteria andOuByzd6NotEqualTo(String value) {
            addCriterion("ou_byzd6 <>", value, "ouByzd6");
            return (Criteria) this;
        }

        public Criteria andOuByzd6GreaterThan(String value) {
            addCriterion("ou_byzd6 >", value, "ouByzd6");
            return (Criteria) this;
        }

        public Criteria andOuByzd6GreaterThanOrEqualTo(String value) {
            addCriterion("ou_byzd6 >=", value, "ouByzd6");
            return (Criteria) this;
        }

        public Criteria andOuByzd6LessThan(String value) {
            addCriterion("ou_byzd6 <", value, "ouByzd6");
            return (Criteria) this;
        }

        public Criteria andOuByzd6LessThanOrEqualTo(String value) {
            addCriterion("ou_byzd6 <=", value, "ouByzd6");
            return (Criteria) this;
        }

        public Criteria andOuByzd6Like(String value) {
            addCriterion("ou_byzd6 like", value, "ouByzd6");
            return (Criteria) this;
        }

        public Criteria andOuByzd6NotLike(String value) {
            addCriterion("ou_byzd6 not like", value, "ouByzd6");
            return (Criteria) this;
        }

        public Criteria andOuByzd6In(List<String> values) {
            addCriterion("ou_byzd6 in", values, "ouByzd6");
            return (Criteria) this;
        }

        public Criteria andOuByzd6NotIn(List<String> values) {
            addCriterion("ou_byzd6 not in", values, "ouByzd6");
            return (Criteria) this;
        }

        public Criteria andOuByzd6Between(String value1, String value2) {
            addCriterion("ou_byzd6 between", value1, value2, "ouByzd6");
            return (Criteria) this;
        }

        public Criteria andOuByzd6NotBetween(String value1, String value2) {
            addCriterion("ou_byzd6 not between", value1, value2, "ouByzd6");
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