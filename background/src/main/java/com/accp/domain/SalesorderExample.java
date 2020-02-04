package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SalesorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesorderExample() {
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

        public Criteria andSoDocumentnumberIsNull() {
            addCriterion("so_documentnumber is null");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberIsNotNull() {
            addCriterion("so_documentnumber is not null");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberEqualTo(String value) {
            addCriterion("so_documentnumber =", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberNotEqualTo(String value) {
            addCriterion("so_documentnumber <>", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberGreaterThan(String value) {
            addCriterion("so_documentnumber >", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberGreaterThanOrEqualTo(String value) {
            addCriterion("so_documentnumber >=", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberLessThan(String value) {
            addCriterion("so_documentnumber <", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberLessThanOrEqualTo(String value) {
            addCriterion("so_documentnumber <=", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberLike(String value) {
            addCriterion("so_documentnumber like", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberNotLike(String value) {
            addCriterion("so_documentnumber not like", value, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberIn(List<String> values) {
            addCriterion("so_documentnumber in", values, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberNotIn(List<String> values) {
            addCriterion("so_documentnumber not in", values, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberBetween(String value1, String value2) {
            addCriterion("so_documentnumber between", value1, value2, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentnumberNotBetween(String value1, String value2) {
            addCriterion("so_documentnumber not between", value1, value2, "soDocumentnumber");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeIsNull() {
            addCriterion("so_Document_time is null");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeIsNotNull() {
            addCriterion("so_Document_time is not null");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeEqualTo(Date value) {
            addCriterionForJDBCDate("so_Document_time =", value, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("so_Document_time <>", value, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("so_Document_time >", value, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("so_Document_time >=", value, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeLessThan(Date value) {
            addCriterionForJDBCDate("so_Document_time <", value, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("so_Document_time <=", value, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeIn(List<Date> values) {
            addCriterionForJDBCDate("so_Document_time in", values, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("so_Document_time not in", values, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("so_Document_time between", value1, value2, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDocumentTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("so_Document_time not between", value1, value2, "soDocumentTime");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressIsNull() {
            addCriterion("so_Delivery_address is null");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressIsNotNull() {
            addCriterion("so_Delivery_address is not null");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressEqualTo(String value) {
            addCriterion("so_Delivery_address =", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressNotEqualTo(String value) {
            addCriterion("so_Delivery_address <>", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressGreaterThan(String value) {
            addCriterion("so_Delivery_address >", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("so_Delivery_address >=", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressLessThan(String value) {
            addCriterion("so_Delivery_address <", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("so_Delivery_address <=", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressLike(String value) {
            addCriterion("so_Delivery_address like", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressNotLike(String value) {
            addCriterion("so_Delivery_address not like", value, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressIn(List<String> values) {
            addCriterion("so_Delivery_address in", values, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressNotIn(List<String> values) {
            addCriterion("so_Delivery_address not in", values, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressBetween(String value1, String value2) {
            addCriterion("so_Delivery_address between", value1, value2, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("so_Delivery_address not between", value1, value2, "soDeliveryAddress");
            return (Criteria) this;
        }

        public Criteria andSoMarketTypeIsNull() {
            addCriterion("\"so_ market_type\" is null");
            return (Criteria) this;
        }

        public Criteria andSoMarketTypeIsNotNull() {
            addCriterion("\"so_ market_type\" is not null");
            return (Criteria) this;
        }

        public Criteria andSoMarketTypeEqualTo(String value) {
            addCriterion("\"so_ market_type\" =", value, "soMarketType");
            return (Criteria) this;
        }

        public Criteria andSoMarketTypeNotEqualTo(String value) {
            addCriterion("\"so_ market_type\" <>", value, "soMarketType");
            return (Criteria) this;
        }

        public Criteria andSoMarketTypeGreaterThan(String value) {
            addCriterion("\"so_ market_type\" >", value, "soMarketType");
            return (Criteria) this;
        }

        public Criteria andSoMarketTypeGreaterThanOrEqualTo(String value) {
            addCriterion("\"so_ market_type\" >=", value, "soMarketType");
            return (Criteria) this;
        }

        public Criteria andSoMarketTypeLessThan(String value) {
            addCriterion("\"so_ market_type\" <", value, "soMarketType");
            return (Criteria) this;
        }

        public Criteria andSoMarketTypeLessThanOrEqualTo(String value) {
            addCriterion("\"so_ market_type\" <=", value, "soMarketType");
            return (Criteria) this;
        }

        public Criteria andSoMarketTypeLike(String value) {
            addCriterion("\"so_ market_type\" like", value, "soMarketType");
            return (Criteria) this;
        }

        public Criteria andSoMarketTypeNotLike(String value) {
            addCriterion("\"so_ market_type\" not like", value, "soMarketType");
            return (Criteria) this;
        }

        public Criteria andSoMarketTypeIn(List<String> values) {
            addCriterion("\"so_ market_type\" in", values, "soMarketType");
            return (Criteria) this;
        }

        public Criteria andSoMarketTypeNotIn(List<String> values) {
            addCriterion("\"so_ market_type\" not in", values, "soMarketType");
            return (Criteria) this;
        }

        public Criteria andSoMarketTypeBetween(String value1, String value2) {
            addCriterion("\"so_ market_type\" between", value1, value2, "soMarketType");
            return (Criteria) this;
        }

        public Criteria andSoMarketTypeNotBetween(String value1, String value2) {
            addCriterion("\"so_ market_type\" not between", value1, value2, "soMarketType");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderIsNull() {
            addCriterion("so_customerorder is null");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderIsNotNull() {
            addCriterion("so_customerorder is not null");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderEqualTo(String value) {
            addCriterion("so_customerorder =", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderNotEqualTo(String value) {
            addCriterion("so_customerorder <>", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderGreaterThan(String value) {
            addCriterion("so_customerorder >", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderGreaterThanOrEqualTo(String value) {
            addCriterion("so_customerorder >=", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderLessThan(String value) {
            addCriterion("so_customerorder <", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderLessThanOrEqualTo(String value) {
            addCriterion("so_customerorder <=", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderLike(String value) {
            addCriterion("so_customerorder like", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderNotLike(String value) {
            addCriterion("so_customerorder not like", value, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderIn(List<String> values) {
            addCriterion("so_customerorder in", values, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderNotIn(List<String> values) {
            addCriterion("so_customerorder not in", values, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderBetween(String value1, String value2) {
            addCriterion("so_customerorder between", value1, value2, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoCustomerorderNotBetween(String value1, String value2) {
            addCriterion("so_customerorder not between", value1, value2, "soCustomerorder");
            return (Criteria) this;
        }

        public Criteria andSoTaxIsNull() {
            addCriterion("so_tax is null");
            return (Criteria) this;
        }

        public Criteria andSoTaxIsNotNull() {
            addCriterion("so_tax is not null");
            return (Criteria) this;
        }

        public Criteria andSoTaxEqualTo(Integer value) {
            addCriterion("so_tax =", value, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxNotEqualTo(Integer value) {
            addCriterion("so_tax <>", value, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxGreaterThan(Integer value) {
            addCriterion("so_tax >", value, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("so_tax >=", value, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxLessThan(Integer value) {
            addCriterion("so_tax <", value, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxLessThanOrEqualTo(Integer value) {
            addCriterion("so_tax <=", value, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxIn(List<Integer> values) {
            addCriterion("so_tax in", values, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxNotIn(List<Integer> values) {
            addCriterion("so_tax not in", values, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxBetween(Integer value1, Integer value2) {
            addCriterion("so_tax between", value1, value2, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoTaxNotBetween(Integer value1, Integer value2) {
            addCriterion("so_tax not between", value1, value2, "soTax");
            return (Criteria) this;
        }

        public Criteria andSoCoinArewellIsNull() {
            addCriterion("so_Coin_arewell is null");
            return (Criteria) this;
        }

        public Criteria andSoCoinArewellIsNotNull() {
            addCriterion("so_Coin_arewell is not null");
            return (Criteria) this;
        }

        public Criteria andSoCoinArewellEqualTo(String value) {
            addCriterion("so_Coin_arewell =", value, "soCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSoCoinArewellNotEqualTo(String value) {
            addCriterion("so_Coin_arewell <>", value, "soCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSoCoinArewellGreaterThan(String value) {
            addCriterion("so_Coin_arewell >", value, "soCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSoCoinArewellGreaterThanOrEqualTo(String value) {
            addCriterion("so_Coin_arewell >=", value, "soCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSoCoinArewellLessThan(String value) {
            addCriterion("so_Coin_arewell <", value, "soCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSoCoinArewellLessThanOrEqualTo(String value) {
            addCriterion("so_Coin_arewell <=", value, "soCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSoCoinArewellLike(String value) {
            addCriterion("so_Coin_arewell like", value, "soCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSoCoinArewellNotLike(String value) {
            addCriterion("so_Coin_arewell not like", value, "soCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSoCoinArewellIn(List<String> values) {
            addCriterion("so_Coin_arewell in", values, "soCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSoCoinArewellNotIn(List<String> values) {
            addCriterion("so_Coin_arewell not in", values, "soCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSoCoinArewellBetween(String value1, String value2) {
            addCriterion("so_Coin_arewell between", value1, value2, "soCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSoCoinArewellNotBetween(String value1, String value2) {
            addCriterion("so_Coin_arewell not between", value1, value2, "soCoinArewell");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticIsNull() {
            addCriterion("so_Oder_static is null");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticIsNotNull() {
            addCriterion("so_Oder_static is not null");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticEqualTo(Integer value) {
            addCriterion("so_Oder_static =", value, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticNotEqualTo(Integer value) {
            addCriterion("so_Oder_static <>", value, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticGreaterThan(Integer value) {
            addCriterion("so_Oder_static >", value, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticGreaterThanOrEqualTo(Integer value) {
            addCriterion("so_Oder_static >=", value, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticLessThan(Integer value) {
            addCriterion("so_Oder_static <", value, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticLessThanOrEqualTo(Integer value) {
            addCriterion("so_Oder_static <=", value, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticIn(List<Integer> values) {
            addCriterion("so_Oder_static in", values, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticNotIn(List<Integer> values) {
            addCriterion("so_Oder_static not in", values, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticBetween(Integer value1, Integer value2) {
            addCriterion("so_Oder_static between", value1, value2, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoOderStaticNotBetween(Integer value1, Integer value2) {
            addCriterion("so_Oder_static not between", value1, value2, "soOderStatic");
            return (Criteria) this;
        }

        public Criteria andSoBusinessPersonnelIsNull() {
            addCriterion("so_Business_personnel is null");
            return (Criteria) this;
        }

        public Criteria andSoBusinessPersonnelIsNotNull() {
            addCriterion("so_Business_personnel is not null");
            return (Criteria) this;
        }

        public Criteria andSoBusinessPersonnelEqualTo(String value) {
            addCriterion("so_Business_personnel =", value, "soBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSoBusinessPersonnelNotEqualTo(String value) {
            addCriterion("so_Business_personnel <>", value, "soBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSoBusinessPersonnelGreaterThan(String value) {
            addCriterion("so_Business_personnel >", value, "soBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSoBusinessPersonnelGreaterThanOrEqualTo(String value) {
            addCriterion("so_Business_personnel >=", value, "soBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSoBusinessPersonnelLessThan(String value) {
            addCriterion("so_Business_personnel <", value, "soBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSoBusinessPersonnelLessThanOrEqualTo(String value) {
            addCriterion("so_Business_personnel <=", value, "soBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSoBusinessPersonnelLike(String value) {
            addCriterion("so_Business_personnel like", value, "soBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSoBusinessPersonnelNotLike(String value) {
            addCriterion("so_Business_personnel not like", value, "soBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSoBusinessPersonnelIn(List<String> values) {
            addCriterion("so_Business_personnel in", values, "soBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSoBusinessPersonnelNotIn(List<String> values) {
            addCriterion("so_Business_personnel not in", values, "soBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSoBusinessPersonnelBetween(String value1, String value2) {
            addCriterion("so_Business_personnel between", value1, value2, "soBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSoBusinessPersonnelNotBetween(String value1, String value2) {
            addCriterion("so_Business_personnel not between", value1, value2, "soBusinessPersonnel");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateDepartmentIsNull() {
            addCriterion("so_Subordinate_department is null");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateDepartmentIsNotNull() {
            addCriterion("so_Subordinate_department is not null");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateDepartmentEqualTo(String value) {
            addCriterion("so_Subordinate_department =", value, "soSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateDepartmentNotEqualTo(String value) {
            addCriterion("so_Subordinate_department <>", value, "soSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateDepartmentGreaterThan(String value) {
            addCriterion("so_Subordinate_department >", value, "soSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("so_Subordinate_department >=", value, "soSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateDepartmentLessThan(String value) {
            addCriterion("so_Subordinate_department <", value, "soSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateDepartmentLessThanOrEqualTo(String value) {
            addCriterion("so_Subordinate_department <=", value, "soSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateDepartmentLike(String value) {
            addCriterion("so_Subordinate_department like", value, "soSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateDepartmentNotLike(String value) {
            addCriterion("so_Subordinate_department not like", value, "soSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateDepartmentIn(List<String> values) {
            addCriterion("so_Subordinate_department in", values, "soSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateDepartmentNotIn(List<String> values) {
            addCriterion("so_Subordinate_department not in", values, "soSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateDepartmentBetween(String value1, String value2) {
            addCriterion("so_Subordinate_department between", value1, value2, "soSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateDepartmentNotBetween(String value1, String value2) {
            addCriterion("so_Subordinate_department not between", value1, value2, "soSubordinateDepartment");
            return (Criteria) this;
        }

        public Criteria andSoMonographIsNull() {
            addCriterion("so_monograph is null");
            return (Criteria) this;
        }

        public Criteria andSoMonographIsNotNull() {
            addCriterion("so_monograph is not null");
            return (Criteria) this;
        }

        public Criteria andSoMonographEqualTo(String value) {
            addCriterion("so_monograph =", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographNotEqualTo(String value) {
            addCriterion("so_monograph <>", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographGreaterThan(String value) {
            addCriterion("so_monograph >", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographGreaterThanOrEqualTo(String value) {
            addCriterion("so_monograph >=", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographLessThan(String value) {
            addCriterion("so_monograph <", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographLessThanOrEqualTo(String value) {
            addCriterion("so_monograph <=", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographLike(String value) {
            addCriterion("so_monograph like", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographNotLike(String value) {
            addCriterion("so_monograph not like", value, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographIn(List<String> values) {
            addCriterion("so_monograph in", values, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographNotIn(List<String> values) {
            addCriterion("so_monograph not in", values, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographBetween(String value1, String value2) {
            addCriterion("so_monograph between", value1, value2, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoMonographNotBetween(String value1, String value2) {
            addCriterion("so_monograph not between", value1, value2, "soMonograph");
            return (Criteria) this;
        }

        public Criteria andSoReviewerIsNull() {
            addCriterion("so_reviewer is null");
            return (Criteria) this;
        }

        public Criteria andSoReviewerIsNotNull() {
            addCriterion("so_reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andSoReviewerEqualTo(String value) {
            addCriterion("so_reviewer =", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerNotEqualTo(String value) {
            addCriterion("so_reviewer <>", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerGreaterThan(String value) {
            addCriterion("so_reviewer >", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("so_reviewer >=", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerLessThan(String value) {
            addCriterion("so_reviewer <", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerLessThanOrEqualTo(String value) {
            addCriterion("so_reviewer <=", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerLike(String value) {
            addCriterion("so_reviewer like", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerNotLike(String value) {
            addCriterion("so_reviewer not like", value, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerIn(List<String> values) {
            addCriterion("so_reviewer in", values, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerNotIn(List<String> values) {
            addCriterion("so_reviewer not in", values, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerBetween(String value1, String value2) {
            addCriterion("so_reviewer between", value1, value2, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoReviewerNotBetween(String value1, String value2) {
            addCriterion("so_reviewer not between", value1, value2, "soReviewer");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateIsNull() {
            addCriterion("so_Subordinate is null");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateIsNotNull() {
            addCriterion("so_Subordinate is not null");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateEqualTo(String value) {
            addCriterion("so_Subordinate =", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateNotEqualTo(String value) {
            addCriterion("so_Subordinate <>", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateGreaterThan(String value) {
            addCriterion("so_Subordinate >", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateGreaterThanOrEqualTo(String value) {
            addCriterion("so_Subordinate >=", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateLessThan(String value) {
            addCriterion("so_Subordinate <", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateLessThanOrEqualTo(String value) {
            addCriterion("so_Subordinate <=", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateLike(String value) {
            addCriterion("so_Subordinate like", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateNotLike(String value) {
            addCriterion("so_Subordinate not like", value, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateIn(List<String> values) {
            addCriterion("so_Subordinate in", values, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateNotIn(List<String> values) {
            addCriterion("so_Subordinate not in", values, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateBetween(String value1, String value2) {
            addCriterion("so_Subordinate between", value1, value2, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoSubordinateNotBetween(String value1, String value2) {
            addCriterion("so_Subordinate not between", value1, value2, "soSubordinate");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordIsNull() {
            addCriterion("so_watchword is null");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordIsNotNull() {
            addCriterion("so_watchword is not null");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordEqualTo(String value) {
            addCriterion("so_watchword =", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordNotEqualTo(String value) {
            addCriterion("so_watchword <>", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordGreaterThan(String value) {
            addCriterion("so_watchword >", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordGreaterThanOrEqualTo(String value) {
            addCriterion("so_watchword >=", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordLessThan(String value) {
            addCriterion("so_watchword <", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordLessThanOrEqualTo(String value) {
            addCriterion("so_watchword <=", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordLike(String value) {
            addCriterion("so_watchword like", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordNotLike(String value) {
            addCriterion("so_watchword not like", value, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordIn(List<String> values) {
            addCriterion("so_watchword in", values, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordNotIn(List<String> values) {
            addCriterion("so_watchword not in", values, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordBetween(String value1, String value2) {
            addCriterion("so_watchword between", value1, value2, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoWatchwordNotBetween(String value1, String value2) {
            addCriterion("so_watchword not between", value1, value2, "soWatchword");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseIsNull() {
            addCriterion("so_Tailclause is null");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseIsNotNull() {
            addCriterion("so_Tailclause is not null");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseEqualTo(String value) {
            addCriterion("so_Tailclause =", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseNotEqualTo(String value) {
            addCriterion("so_Tailclause <>", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseGreaterThan(String value) {
            addCriterion("so_Tailclause >", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseGreaterThanOrEqualTo(String value) {
            addCriterion("so_Tailclause >=", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseLessThan(String value) {
            addCriterion("so_Tailclause <", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseLessThanOrEqualTo(String value) {
            addCriterion("so_Tailclause <=", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseLike(String value) {
            addCriterion("so_Tailclause like", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseNotLike(String value) {
            addCriterion("so_Tailclause not like", value, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseIn(List<String> values) {
            addCriterion("so_Tailclause in", values, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseNotIn(List<String> values) {
            addCriterion("so_Tailclause not in", values, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseBetween(String value1, String value2) {
            addCriterion("so_Tailclause between", value1, value2, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoTailclauseNotBetween(String value1, String value2) {
            addCriterion("so_Tailclause not between", value1, value2, "soTailclause");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn1IsNull() {
            addCriterion("so_Self_bound_column1 is null");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn1IsNotNull() {
            addCriterion("so_Self_bound_column1 is not null");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn1EqualTo(String value) {
            addCriterion("so_Self_bound_column1 =", value, "soSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn1NotEqualTo(String value) {
            addCriterion("so_Self_bound_column1 <>", value, "soSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn1GreaterThan(String value) {
            addCriterion("so_Self_bound_column1 >", value, "soSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn1GreaterThanOrEqualTo(String value) {
            addCriterion("so_Self_bound_column1 >=", value, "soSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn1LessThan(String value) {
            addCriterion("so_Self_bound_column1 <", value, "soSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn1LessThanOrEqualTo(String value) {
            addCriterion("so_Self_bound_column1 <=", value, "soSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn1Like(String value) {
            addCriterion("so_Self_bound_column1 like", value, "soSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn1NotLike(String value) {
            addCriterion("so_Self_bound_column1 not like", value, "soSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn1In(List<String> values) {
            addCriterion("so_Self_bound_column1 in", values, "soSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn1NotIn(List<String> values) {
            addCriterion("so_Self_bound_column1 not in", values, "soSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn1Between(String value1, String value2) {
            addCriterion("so_Self_bound_column1 between", value1, value2, "soSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn1NotBetween(String value1, String value2) {
            addCriterion("so_Self_bound_column1 not between", value1, value2, "soSelfBoundColumn1");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn2IsNull() {
            addCriterion("so_Self_bound_column2 is null");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn2IsNotNull() {
            addCriterion("so_Self_bound_column2 is not null");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn2EqualTo(String value) {
            addCriterion("so_Self_bound_column2 =", value, "soSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn2NotEqualTo(String value) {
            addCriterion("so_Self_bound_column2 <>", value, "soSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn2GreaterThan(String value) {
            addCriterion("so_Self_bound_column2 >", value, "soSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn2GreaterThanOrEqualTo(String value) {
            addCriterion("so_Self_bound_column2 >=", value, "soSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn2LessThan(String value) {
            addCriterion("so_Self_bound_column2 <", value, "soSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn2LessThanOrEqualTo(String value) {
            addCriterion("so_Self_bound_column2 <=", value, "soSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn2Like(String value) {
            addCriterion("so_Self_bound_column2 like", value, "soSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn2NotLike(String value) {
            addCriterion("so_Self_bound_column2 not like", value, "soSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn2In(List<String> values) {
            addCriterion("so_Self_bound_column2 in", values, "soSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn2NotIn(List<String> values) {
            addCriterion("so_Self_bound_column2 not in", values, "soSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn2Between(String value1, String value2) {
            addCriterion("so_Self_bound_column2 between", value1, value2, "soSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSoSelfBoundColumn2NotBetween(String value1, String value2) {
            addCriterion("so_Self_bound_column2 not between", value1, value2, "soSelfBoundColumn2");
            return (Criteria) this;
        }

        public Criteria andSoRemarkIsNull() {
            addCriterion("So_remark is null");
            return (Criteria) this;
        }

        public Criteria andSoRemarkIsNotNull() {
            addCriterion("So_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSoRemarkEqualTo(String value) {
            addCriterion("So_remark =", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkNotEqualTo(String value) {
            addCriterion("So_remark <>", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkGreaterThan(String value) {
            addCriterion("So_remark >", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("So_remark >=", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkLessThan(String value) {
            addCriterion("So_remark <", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkLessThanOrEqualTo(String value) {
            addCriterion("So_remark <=", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkLike(String value) {
            addCriterion("So_remark like", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkNotLike(String value) {
            addCriterion("So_remark not like", value, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkIn(List<String> values) {
            addCriterion("So_remark in", values, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkNotIn(List<String> values) {
            addCriterion("So_remark not in", values, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkBetween(String value1, String value2) {
            addCriterion("So_remark between", value1, value2, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoRemarkNotBetween(String value1, String value2) {
            addCriterion("So_remark not between", value1, value2, "soRemark");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipIsNull() {
            addCriterion("so_account_ownership is null");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipIsNotNull() {
            addCriterion("so_account_ownership is not null");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipEqualTo(String value) {
            addCriterion("so_account_ownership =", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipNotEqualTo(String value) {
            addCriterion("so_account_ownership <>", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipGreaterThan(String value) {
            addCriterion("so_account_ownership >", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipGreaterThanOrEqualTo(String value) {
            addCriterion("so_account_ownership >=", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipLessThan(String value) {
            addCriterion("so_account_ownership <", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipLessThanOrEqualTo(String value) {
            addCriterion("so_account_ownership <=", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipLike(String value) {
            addCriterion("so_account_ownership like", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipNotLike(String value) {
            addCriterion("so_account_ownership not like", value, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipIn(List<String> values) {
            addCriterion("so_account_ownership in", values, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipNotIn(List<String> values) {
            addCriterion("so_account_ownership not in", values, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipBetween(String value1, String value2) {
            addCriterion("so_account_ownership between", value1, value2, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoAccountOwnershipNotBetween(String value1, String value2) {
            addCriterion("so_account_ownership not between", value1, value2, "soAccountOwnership");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeIsNull() {
            addCriterion("so_collection_time is null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeIsNotNull() {
            addCriterion("so_collection_time is not null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeEqualTo(Date value) {
            addCriterionForJDBCDate("so_collection_time =", value, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("so_collection_time <>", value, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("so_collection_time >", value, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("so_collection_time >=", value, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeLessThan(Date value) {
            addCriterionForJDBCDate("so_collection_time <", value, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("so_collection_time <=", value, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeIn(List<Date> values) {
            addCriterionForJDBCDate("so_collection_time in", values, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("so_collection_time not in", values, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("so_collection_time between", value1, value2, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("so_collection_time not between", value1, value2, "soCollectionTime");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthIsNull() {
            addCriterion("so_collection_month is null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthIsNotNull() {
            addCriterion("so_collection_month is not null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthEqualTo(Date value) {
            addCriterionForJDBCDate("so_collection_month =", value, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthNotEqualTo(Date value) {
            addCriterionForJDBCDate("so_collection_month <>", value, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthGreaterThan(Date value) {
            addCriterionForJDBCDate("so_collection_month >", value, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("so_collection_month >=", value, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthLessThan(Date value) {
            addCriterionForJDBCDate("so_collection_month <", value, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("so_collection_month <=", value, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthIn(List<Date> values) {
            addCriterionForJDBCDate("so_collection_month in", values, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthNotIn(List<Date> values) {
            addCriterionForJDBCDate("so_collection_month not in", values, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("so_collection_month between", value1, value2, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionMonthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("so_collection_month not between", value1, value2, "soCollectionMonth");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsIsNull() {
            addCriterion("so_collection_terms is null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsIsNotNull() {
            addCriterion("so_collection_terms is not null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsEqualTo(String value) {
            addCriterion("so_collection_terms =", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsNotEqualTo(String value) {
            addCriterion("so_collection_terms <>", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsGreaterThan(String value) {
            addCriterion("so_collection_terms >", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsGreaterThanOrEqualTo(String value) {
            addCriterion("so_collection_terms >=", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsLessThan(String value) {
            addCriterion("so_collection_terms <", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsLessThanOrEqualTo(String value) {
            addCriterion("so_collection_terms <=", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsLike(String value) {
            addCriterion("so_collection_terms like", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsNotLike(String value) {
            addCriterion("so_collection_terms not like", value, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsIn(List<String> values) {
            addCriterion("so_collection_terms in", values, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsNotIn(List<String> values) {
            addCriterion("so_collection_terms not in", values, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsBetween(String value1, String value2) {
            addCriterion("so_collection_terms between", value1, value2, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsNotBetween(String value1, String value2) {
            addCriterion("so_collection_terms not between", value1, value2, "soCollectionTerms");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayIsNull() {
            addCriterion("so_collection_terms_day is null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayIsNotNull() {
            addCriterion("so_collection_terms_day is not null");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayEqualTo(String value) {
            addCriterion("so_collection_terms_day =", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayNotEqualTo(String value) {
            addCriterion("so_collection_terms_day <>", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayGreaterThan(String value) {
            addCriterion("so_collection_terms_day >", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayGreaterThanOrEqualTo(String value) {
            addCriterion("so_collection_terms_day >=", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayLessThan(String value) {
            addCriterion("so_collection_terms_day <", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayLessThanOrEqualTo(String value) {
            addCriterion("so_collection_terms_day <=", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayLike(String value) {
            addCriterion("so_collection_terms_day like", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayNotLike(String value) {
            addCriterion("so_collection_terms_day not like", value, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayIn(List<String> values) {
            addCriterion("so_collection_terms_day in", values, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayNotIn(List<String> values) {
            addCriterion("so_collection_terms_day not in", values, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayBetween(String value1, String value2) {
            addCriterion("so_collection_terms_day between", value1, value2, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoCollectionTermsDayNotBetween(String value1, String value2) {
            addCriterion("so_collection_terms_day not between", value1, value2, "soCollectionTermsDay");
            return (Criteria) this;
        }

        public Criteria andSoSpare1IsNull() {
            addCriterion("so_Spare1 is null");
            return (Criteria) this;
        }

        public Criteria andSoSpare1IsNotNull() {
            addCriterion("so_Spare1 is not null");
            return (Criteria) this;
        }

        public Criteria andSoSpare1EqualTo(String value) {
            addCriterion("so_Spare1 =", value, "soSpare1");
            return (Criteria) this;
        }

        public Criteria andSoSpare1NotEqualTo(String value) {
            addCriterion("so_Spare1 <>", value, "soSpare1");
            return (Criteria) this;
        }

        public Criteria andSoSpare1GreaterThan(String value) {
            addCriterion("so_Spare1 >", value, "soSpare1");
            return (Criteria) this;
        }

        public Criteria andSoSpare1GreaterThanOrEqualTo(String value) {
            addCriterion("so_Spare1 >=", value, "soSpare1");
            return (Criteria) this;
        }

        public Criteria andSoSpare1LessThan(String value) {
            addCriterion("so_Spare1 <", value, "soSpare1");
            return (Criteria) this;
        }

        public Criteria andSoSpare1LessThanOrEqualTo(String value) {
            addCriterion("so_Spare1 <=", value, "soSpare1");
            return (Criteria) this;
        }

        public Criteria andSoSpare1Like(String value) {
            addCriterion("so_Spare1 like", value, "soSpare1");
            return (Criteria) this;
        }

        public Criteria andSoSpare1NotLike(String value) {
            addCriterion("so_Spare1 not like", value, "soSpare1");
            return (Criteria) this;
        }

        public Criteria andSoSpare1In(List<String> values) {
            addCriterion("so_Spare1 in", values, "soSpare1");
            return (Criteria) this;
        }

        public Criteria andSoSpare1NotIn(List<String> values) {
            addCriterion("so_Spare1 not in", values, "soSpare1");
            return (Criteria) this;
        }

        public Criteria andSoSpare1Between(String value1, String value2) {
            addCriterion("so_Spare1 between", value1, value2, "soSpare1");
            return (Criteria) this;
        }

        public Criteria andSoSpare1NotBetween(String value1, String value2) {
            addCriterion("so_Spare1 not between", value1, value2, "soSpare1");
            return (Criteria) this;
        }

        public Criteria andSoSpare2IsNull() {
            addCriterion("so_Spare2 is null");
            return (Criteria) this;
        }

        public Criteria andSoSpare2IsNotNull() {
            addCriterion("so_Spare2 is not null");
            return (Criteria) this;
        }

        public Criteria andSoSpare2EqualTo(String value) {
            addCriterion("so_Spare2 =", value, "soSpare2");
            return (Criteria) this;
        }

        public Criteria andSoSpare2NotEqualTo(String value) {
            addCriterion("so_Spare2 <>", value, "soSpare2");
            return (Criteria) this;
        }

        public Criteria andSoSpare2GreaterThan(String value) {
            addCriterion("so_Spare2 >", value, "soSpare2");
            return (Criteria) this;
        }

        public Criteria andSoSpare2GreaterThanOrEqualTo(String value) {
            addCriterion("so_Spare2 >=", value, "soSpare2");
            return (Criteria) this;
        }

        public Criteria andSoSpare2LessThan(String value) {
            addCriterion("so_Spare2 <", value, "soSpare2");
            return (Criteria) this;
        }

        public Criteria andSoSpare2LessThanOrEqualTo(String value) {
            addCriterion("so_Spare2 <=", value, "soSpare2");
            return (Criteria) this;
        }

        public Criteria andSoSpare2Like(String value) {
            addCriterion("so_Spare2 like", value, "soSpare2");
            return (Criteria) this;
        }

        public Criteria andSoSpare2NotLike(String value) {
            addCriterion("so_Spare2 not like", value, "soSpare2");
            return (Criteria) this;
        }

        public Criteria andSoSpare2In(List<String> values) {
            addCriterion("so_Spare2 in", values, "soSpare2");
            return (Criteria) this;
        }

        public Criteria andSoSpare2NotIn(List<String> values) {
            addCriterion("so_Spare2 not in", values, "soSpare2");
            return (Criteria) this;
        }

        public Criteria andSoSpare2Between(String value1, String value2) {
            addCriterion("so_Spare2 between", value1, value2, "soSpare2");
            return (Criteria) this;
        }

        public Criteria andSoSpare2NotBetween(String value1, String value2) {
            addCriterion("so_Spare2 not between", value1, value2, "soSpare2");
            return (Criteria) this;
        }

        public Criteria andSoSpare3IsNull() {
            addCriterion("so_Spare3 is null");
            return (Criteria) this;
        }

        public Criteria andSoSpare3IsNotNull() {
            addCriterion("so_Spare3 is not null");
            return (Criteria) this;
        }

        public Criteria andSoSpare3EqualTo(String value) {
            addCriterion("so_Spare3 =", value, "soSpare3");
            return (Criteria) this;
        }

        public Criteria andSoSpare3NotEqualTo(String value) {
            addCriterion("so_Spare3 <>", value, "soSpare3");
            return (Criteria) this;
        }

        public Criteria andSoSpare3GreaterThan(String value) {
            addCriterion("so_Spare3 >", value, "soSpare3");
            return (Criteria) this;
        }

        public Criteria andSoSpare3GreaterThanOrEqualTo(String value) {
            addCriterion("so_Spare3 >=", value, "soSpare3");
            return (Criteria) this;
        }

        public Criteria andSoSpare3LessThan(String value) {
            addCriterion("so_Spare3 <", value, "soSpare3");
            return (Criteria) this;
        }

        public Criteria andSoSpare3LessThanOrEqualTo(String value) {
            addCriterion("so_Spare3 <=", value, "soSpare3");
            return (Criteria) this;
        }

        public Criteria andSoSpare3Like(String value) {
            addCriterion("so_Spare3 like", value, "soSpare3");
            return (Criteria) this;
        }

        public Criteria andSoSpare3NotLike(String value) {
            addCriterion("so_Spare3 not like", value, "soSpare3");
            return (Criteria) this;
        }

        public Criteria andSoSpare3In(List<String> values) {
            addCriterion("so_Spare3 in", values, "soSpare3");
            return (Criteria) this;
        }

        public Criteria andSoSpare3NotIn(List<String> values) {
            addCriterion("so_Spare3 not in", values, "soSpare3");
            return (Criteria) this;
        }

        public Criteria andSoSpare3Between(String value1, String value2) {
            addCriterion("so_Spare3 between", value1, value2, "soSpare3");
            return (Criteria) this;
        }

        public Criteria andSoSpare3NotBetween(String value1, String value2) {
            addCriterion("so_Spare3 not between", value1, value2, "soSpare3");
            return (Criteria) this;
        }

        public Criteria andSoSpare4IsNull() {
            addCriterion("so_Spare4 is null");
            return (Criteria) this;
        }

        public Criteria andSoSpare4IsNotNull() {
            addCriterion("so_Spare4 is not null");
            return (Criteria) this;
        }

        public Criteria andSoSpare4EqualTo(String value) {
            addCriterion("so_Spare4 =", value, "soSpare4");
            return (Criteria) this;
        }

        public Criteria andSoSpare4NotEqualTo(String value) {
            addCriterion("so_Spare4 <>", value, "soSpare4");
            return (Criteria) this;
        }

        public Criteria andSoSpare4GreaterThan(String value) {
            addCriterion("so_Spare4 >", value, "soSpare4");
            return (Criteria) this;
        }

        public Criteria andSoSpare4GreaterThanOrEqualTo(String value) {
            addCriterion("so_Spare4 >=", value, "soSpare4");
            return (Criteria) this;
        }

        public Criteria andSoSpare4LessThan(String value) {
            addCriterion("so_Spare4 <", value, "soSpare4");
            return (Criteria) this;
        }

        public Criteria andSoSpare4LessThanOrEqualTo(String value) {
            addCriterion("so_Spare4 <=", value, "soSpare4");
            return (Criteria) this;
        }

        public Criteria andSoSpare4Like(String value) {
            addCriterion("so_Spare4 like", value, "soSpare4");
            return (Criteria) this;
        }

        public Criteria andSoSpare4NotLike(String value) {
            addCriterion("so_Spare4 not like", value, "soSpare4");
            return (Criteria) this;
        }

        public Criteria andSoSpare4In(List<String> values) {
            addCriterion("so_Spare4 in", values, "soSpare4");
            return (Criteria) this;
        }

        public Criteria andSoSpare4NotIn(List<String> values) {
            addCriterion("so_Spare4 not in", values, "soSpare4");
            return (Criteria) this;
        }

        public Criteria andSoSpare4Between(String value1, String value2) {
            addCriterion("so_Spare4 between", value1, value2, "soSpare4");
            return (Criteria) this;
        }

        public Criteria andSoSpare4NotBetween(String value1, String value2) {
            addCriterion("so_Spare4 not between", value1, value2, "soSpare4");
            return (Criteria) this;
        }

        public Criteria andSoSpare5IsNull() {
            addCriterion("so_Spare5 is null");
            return (Criteria) this;
        }

        public Criteria andSoSpare5IsNotNull() {
            addCriterion("so_Spare5 is not null");
            return (Criteria) this;
        }

        public Criteria andSoSpare5EqualTo(String value) {
            addCriterion("so_Spare5 =", value, "soSpare5");
            return (Criteria) this;
        }

        public Criteria andSoSpare5NotEqualTo(String value) {
            addCriterion("so_Spare5 <>", value, "soSpare5");
            return (Criteria) this;
        }

        public Criteria andSoSpare5GreaterThan(String value) {
            addCriterion("so_Spare5 >", value, "soSpare5");
            return (Criteria) this;
        }

        public Criteria andSoSpare5GreaterThanOrEqualTo(String value) {
            addCriterion("so_Spare5 >=", value, "soSpare5");
            return (Criteria) this;
        }

        public Criteria andSoSpare5LessThan(String value) {
            addCriterion("so_Spare5 <", value, "soSpare5");
            return (Criteria) this;
        }

        public Criteria andSoSpare5LessThanOrEqualTo(String value) {
            addCriterion("so_Spare5 <=", value, "soSpare5");
            return (Criteria) this;
        }

        public Criteria andSoSpare5Like(String value) {
            addCriterion("so_Spare5 like", value, "soSpare5");
            return (Criteria) this;
        }

        public Criteria andSoSpare5NotLike(String value) {
            addCriterion("so_Spare5 not like", value, "soSpare5");
            return (Criteria) this;
        }

        public Criteria andSoSpare5In(List<String> values) {
            addCriterion("so_Spare5 in", values, "soSpare5");
            return (Criteria) this;
        }

        public Criteria andSoSpare5NotIn(List<String> values) {
            addCriterion("so_Spare5 not in", values, "soSpare5");
            return (Criteria) this;
        }

        public Criteria andSoSpare5Between(String value1, String value2) {
            addCriterion("so_Spare5 between", value1, value2, "soSpare5");
            return (Criteria) this;
        }

        public Criteria andSoSpare5NotBetween(String value1, String value2) {
            addCriterion("so_Spare5 not between", value1, value2, "soSpare5");
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