package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerDemandProductsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerDemandProductsExample() {
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

        public Criteria andCdpIdIsNull() {
            addCriterion("cdp_id is null");
            return (Criteria) this;
        }

        public Criteria andCdpIdIsNotNull() {
            addCriterion("cdp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCdpIdEqualTo(String value) {
            addCriterion("cdp_id =", value, "cdpId");
            return (Criteria) this;
        }

        public Criteria andCdpIdNotEqualTo(String value) {
            addCriterion("cdp_id <>", value, "cdpId");
            return (Criteria) this;
        }

        public Criteria andCdpIdGreaterThan(String value) {
            addCriterion("cdp_id >", value, "cdpId");
            return (Criteria) this;
        }

        public Criteria andCdpIdGreaterThanOrEqualTo(String value) {
            addCriterion("cdp_id >=", value, "cdpId");
            return (Criteria) this;
        }

        public Criteria andCdpIdLessThan(String value) {
            addCriterion("cdp_id <", value, "cdpId");
            return (Criteria) this;
        }

        public Criteria andCdpIdLessThanOrEqualTo(String value) {
            addCriterion("cdp_id <=", value, "cdpId");
            return (Criteria) this;
        }

        public Criteria andCdpIdLike(String value) {
            addCriterion("cdp_id like", value, "cdpId");
            return (Criteria) this;
        }

        public Criteria andCdpIdNotLike(String value) {
            addCriterion("cdp_id not like", value, "cdpId");
            return (Criteria) this;
        }

        public Criteria andCdpIdIn(List<String> values) {
            addCriterion("cdp_id in", values, "cdpId");
            return (Criteria) this;
        }

        public Criteria andCdpIdNotIn(List<String> values) {
            addCriterion("cdp_id not in", values, "cdpId");
            return (Criteria) this;
        }

        public Criteria andCdpIdBetween(String value1, String value2) {
            addCriterion("cdp_id between", value1, value2, "cdpId");
            return (Criteria) this;
        }

        public Criteria andCdpIdNotBetween(String value1, String value2) {
            addCriterion("cdp_id not between", value1, value2, "cdpId");
            return (Criteria) this;
        }

        public Criteria andPcIdIsNull() {
            addCriterion("pc_id is null");
            return (Criteria) this;
        }

        public Criteria andPcIdIsNotNull() {
            addCriterion("pc_id is not null");
            return (Criteria) this;
        }

        public Criteria andPcIdEqualTo(String value) {
            addCriterion("pc_id =", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotEqualTo(String value) {
            addCriterion("pc_id <>", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdGreaterThan(String value) {
            addCriterion("pc_id >", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdGreaterThanOrEqualTo(String value) {
            addCriterion("pc_id >=", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLessThan(String value) {
            addCriterion("pc_id <", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLessThanOrEqualTo(String value) {
            addCriterion("pc_id <=", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLike(String value) {
            addCriterion("pc_id like", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotLike(String value) {
            addCriterion("pc_id not like", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdIn(List<String> values) {
            addCriterion("pc_id in", values, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotIn(List<String> values) {
            addCriterion("pc_id not in", values, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdBetween(String value1, String value2) {
            addCriterion("pc_id between", value1, value2, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotBetween(String value1, String value2) {
            addCriterion("pc_id not between", value1, value2, "pcId");
            return (Criteria) this;
        }

        public Criteria andCdpNameIsNull() {
            addCriterion("cdp_name is null");
            return (Criteria) this;
        }

        public Criteria andCdpNameIsNotNull() {
            addCriterion("cdp_name is not null");
            return (Criteria) this;
        }

        public Criteria andCdpNameEqualTo(String value) {
            addCriterion("cdp_name =", value, "cdpName");
            return (Criteria) this;
        }

        public Criteria andCdpNameNotEqualTo(String value) {
            addCriterion("cdp_name <>", value, "cdpName");
            return (Criteria) this;
        }

        public Criteria andCdpNameGreaterThan(String value) {
            addCriterion("cdp_name >", value, "cdpName");
            return (Criteria) this;
        }

        public Criteria andCdpNameGreaterThanOrEqualTo(String value) {
            addCriterion("cdp_name >=", value, "cdpName");
            return (Criteria) this;
        }

        public Criteria andCdpNameLessThan(String value) {
            addCriterion("cdp_name <", value, "cdpName");
            return (Criteria) this;
        }

        public Criteria andCdpNameLessThanOrEqualTo(String value) {
            addCriterion("cdp_name <=", value, "cdpName");
            return (Criteria) this;
        }

        public Criteria andCdpNameLike(String value) {
            addCriterion("cdp_name like", value, "cdpName");
            return (Criteria) this;
        }

        public Criteria andCdpNameNotLike(String value) {
            addCriterion("cdp_name not like", value, "cdpName");
            return (Criteria) this;
        }

        public Criteria andCdpNameIn(List<String> values) {
            addCriterion("cdp_name in", values, "cdpName");
            return (Criteria) this;
        }

        public Criteria andCdpNameNotIn(List<String> values) {
            addCriterion("cdp_name not in", values, "cdpName");
            return (Criteria) this;
        }

        public Criteria andCdpNameBetween(String value1, String value2) {
            addCriterion("cdp_name between", value1, value2, "cdpName");
            return (Criteria) this;
        }

        public Criteria andCdpNameNotBetween(String value1, String value2) {
            addCriterion("cdp_name not between", value1, value2, "cdpName");
            return (Criteria) this;
        }

        public Criteria andCdpSizeIsNull() {
            addCriterion("cdp_size is null");
            return (Criteria) this;
        }

        public Criteria andCdpSizeIsNotNull() {
            addCriterion("cdp_size is not null");
            return (Criteria) this;
        }

        public Criteria andCdpSizeEqualTo(String value) {
            addCriterion("cdp_size =", value, "cdpSize");
            return (Criteria) this;
        }

        public Criteria andCdpSizeNotEqualTo(String value) {
            addCriterion("cdp_size <>", value, "cdpSize");
            return (Criteria) this;
        }

        public Criteria andCdpSizeGreaterThan(String value) {
            addCriterion("cdp_size >", value, "cdpSize");
            return (Criteria) this;
        }

        public Criteria andCdpSizeGreaterThanOrEqualTo(String value) {
            addCriterion("cdp_size >=", value, "cdpSize");
            return (Criteria) this;
        }

        public Criteria andCdpSizeLessThan(String value) {
            addCriterion("cdp_size <", value, "cdpSize");
            return (Criteria) this;
        }

        public Criteria andCdpSizeLessThanOrEqualTo(String value) {
            addCriterion("cdp_size <=", value, "cdpSize");
            return (Criteria) this;
        }

        public Criteria andCdpSizeLike(String value) {
            addCriterion("cdp_size like", value, "cdpSize");
            return (Criteria) this;
        }

        public Criteria andCdpSizeNotLike(String value) {
            addCriterion("cdp_size not like", value, "cdpSize");
            return (Criteria) this;
        }

        public Criteria andCdpSizeIn(List<String> values) {
            addCriterion("cdp_size in", values, "cdpSize");
            return (Criteria) this;
        }

        public Criteria andCdpSizeNotIn(List<String> values) {
            addCriterion("cdp_size not in", values, "cdpSize");
            return (Criteria) this;
        }

        public Criteria andCdpSizeBetween(String value1, String value2) {
            addCriterion("cdp_size between", value1, value2, "cdpSize");
            return (Criteria) this;
        }

        public Criteria andCdpSizeNotBetween(String value1, String value2) {
            addCriterion("cdp_size not between", value1, value2, "cdpSize");
            return (Criteria) this;
        }

        public Criteria andCdpUnitIsNull() {
            addCriterion("cdp_unit is null");
            return (Criteria) this;
        }

        public Criteria andCdpUnitIsNotNull() {
            addCriterion("cdp_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCdpUnitEqualTo(String value) {
            addCriterion("cdp_unit =", value, "cdpUnit");
            return (Criteria) this;
        }

        public Criteria andCdpUnitNotEqualTo(String value) {
            addCriterion("cdp_unit <>", value, "cdpUnit");
            return (Criteria) this;
        }

        public Criteria andCdpUnitGreaterThan(String value) {
            addCriterion("cdp_unit >", value, "cdpUnit");
            return (Criteria) this;
        }

        public Criteria andCdpUnitGreaterThanOrEqualTo(String value) {
            addCriterion("cdp_unit >=", value, "cdpUnit");
            return (Criteria) this;
        }

        public Criteria andCdpUnitLessThan(String value) {
            addCriterion("cdp_unit <", value, "cdpUnit");
            return (Criteria) this;
        }

        public Criteria andCdpUnitLessThanOrEqualTo(String value) {
            addCriterion("cdp_unit <=", value, "cdpUnit");
            return (Criteria) this;
        }

        public Criteria andCdpUnitLike(String value) {
            addCriterion("cdp_unit like", value, "cdpUnit");
            return (Criteria) this;
        }

        public Criteria andCdpUnitNotLike(String value) {
            addCriterion("cdp_unit not like", value, "cdpUnit");
            return (Criteria) this;
        }

        public Criteria andCdpUnitIn(List<String> values) {
            addCriterion("cdp_unit in", values, "cdpUnit");
            return (Criteria) this;
        }

        public Criteria andCdpUnitNotIn(List<String> values) {
            addCriterion("cdp_unit not in", values, "cdpUnit");
            return (Criteria) this;
        }

        public Criteria andCdpUnitBetween(String value1, String value2) {
            addCriterion("cdp_unit between", value1, value2, "cdpUnit");
            return (Criteria) this;
        }

        public Criteria andCdpUnitNotBetween(String value1, String value2) {
            addCriterion("cdp_unit not between", value1, value2, "cdpUnit");
            return (Criteria) this;
        }

        public Criteria andCdpNumIsNull() {
            addCriterion("cdp_num is null");
            return (Criteria) this;
        }

        public Criteria andCdpNumIsNotNull() {
            addCriterion("cdp_num is not null");
            return (Criteria) this;
        }

        public Criteria andCdpNumEqualTo(Integer value) {
            addCriterion("cdp_num =", value, "cdpNum");
            return (Criteria) this;
        }

        public Criteria andCdpNumNotEqualTo(Integer value) {
            addCriterion("cdp_num <>", value, "cdpNum");
            return (Criteria) this;
        }

        public Criteria andCdpNumGreaterThan(Integer value) {
            addCriterion("cdp_num >", value, "cdpNum");
            return (Criteria) this;
        }

        public Criteria andCdpNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cdp_num >=", value, "cdpNum");
            return (Criteria) this;
        }

        public Criteria andCdpNumLessThan(Integer value) {
            addCriterion("cdp_num <", value, "cdpNum");
            return (Criteria) this;
        }

        public Criteria andCdpNumLessThanOrEqualTo(Integer value) {
            addCriterion("cdp_num <=", value, "cdpNum");
            return (Criteria) this;
        }

        public Criteria andCdpNumIn(List<Integer> values) {
            addCriterion("cdp_num in", values, "cdpNum");
            return (Criteria) this;
        }

        public Criteria andCdpNumNotIn(List<Integer> values) {
            addCriterion("cdp_num not in", values, "cdpNum");
            return (Criteria) this;
        }

        public Criteria andCdpNumBetween(Integer value1, Integer value2) {
            addCriterion("cdp_num between", value1, value2, "cdpNum");
            return (Criteria) this;
        }

        public Criteria andCdpNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cdp_num not between", value1, value2, "cdpNum");
            return (Criteria) this;
        }

        public Criteria andCdpAffordablePriceIsNull() {
            addCriterion("cdp_Affordable_Price is null");
            return (Criteria) this;
        }

        public Criteria andCdpAffordablePriceIsNotNull() {
            addCriterion("cdp_Affordable_Price is not null");
            return (Criteria) this;
        }

        public Criteria andCdpAffordablePriceEqualTo(Float value) {
            addCriterion("cdp_Affordable_Price =", value, "cdpAffordablePrice");
            return (Criteria) this;
        }

        public Criteria andCdpAffordablePriceNotEqualTo(Float value) {
            addCriterion("cdp_Affordable_Price <>", value, "cdpAffordablePrice");
            return (Criteria) this;
        }

        public Criteria andCdpAffordablePriceGreaterThan(Float value) {
            addCriterion("cdp_Affordable_Price >", value, "cdpAffordablePrice");
            return (Criteria) this;
        }

        public Criteria andCdpAffordablePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("cdp_Affordable_Price >=", value, "cdpAffordablePrice");
            return (Criteria) this;
        }

        public Criteria andCdpAffordablePriceLessThan(Float value) {
            addCriterion("cdp_Affordable_Price <", value, "cdpAffordablePrice");
            return (Criteria) this;
        }

        public Criteria andCdpAffordablePriceLessThanOrEqualTo(Float value) {
            addCriterion("cdp_Affordable_Price <=", value, "cdpAffordablePrice");
            return (Criteria) this;
        }

        public Criteria andCdpAffordablePriceIn(List<Float> values) {
            addCriterion("cdp_Affordable_Price in", values, "cdpAffordablePrice");
            return (Criteria) this;
        }

        public Criteria andCdpAffordablePriceNotIn(List<Float> values) {
            addCriterion("cdp_Affordable_Price not in", values, "cdpAffordablePrice");
            return (Criteria) this;
        }

        public Criteria andCdpAffordablePriceBetween(Float value1, Float value2) {
            addCriterion("cdp_Affordable_Price between", value1, value2, "cdpAffordablePrice");
            return (Criteria) this;
        }

        public Criteria andCdpAffordablePriceNotBetween(Float value1, Float value2) {
            addCriterion("cdp_Affordable_Price not between", value1, value2, "cdpAffordablePrice");
            return (Criteria) this;
        }

        public Criteria andCdpScheduledQuotationIsNull() {
            addCriterion("cdp_Scheduled_quotation is null");
            return (Criteria) this;
        }

        public Criteria andCdpScheduledQuotationIsNotNull() {
            addCriterion("cdp_Scheduled_quotation is not null");
            return (Criteria) this;
        }

        public Criteria andCdpScheduledQuotationEqualTo(Float value) {
            addCriterion("cdp_Scheduled_quotation =", value, "cdpScheduledQuotation");
            return (Criteria) this;
        }

        public Criteria andCdpScheduledQuotationNotEqualTo(Float value) {
            addCriterion("cdp_Scheduled_quotation <>", value, "cdpScheduledQuotation");
            return (Criteria) this;
        }

        public Criteria andCdpScheduledQuotationGreaterThan(Float value) {
            addCriterion("cdp_Scheduled_quotation >", value, "cdpScheduledQuotation");
            return (Criteria) this;
        }

        public Criteria andCdpScheduledQuotationGreaterThanOrEqualTo(Float value) {
            addCriterion("cdp_Scheduled_quotation >=", value, "cdpScheduledQuotation");
            return (Criteria) this;
        }

        public Criteria andCdpScheduledQuotationLessThan(Float value) {
            addCriterion("cdp_Scheduled_quotation <", value, "cdpScheduledQuotation");
            return (Criteria) this;
        }

        public Criteria andCdpScheduledQuotationLessThanOrEqualTo(Float value) {
            addCriterion("cdp_Scheduled_quotation <=", value, "cdpScheduledQuotation");
            return (Criteria) this;
        }

        public Criteria andCdpScheduledQuotationIn(List<Float> values) {
            addCriterion("cdp_Scheduled_quotation in", values, "cdpScheduledQuotation");
            return (Criteria) this;
        }

        public Criteria andCdpScheduledQuotationNotIn(List<Float> values) {
            addCriterion("cdp_Scheduled_quotation not in", values, "cdpScheduledQuotation");
            return (Criteria) this;
        }

        public Criteria andCdpScheduledQuotationBetween(Float value1, Float value2) {
            addCriterion("cdp_Scheduled_quotation between", value1, value2, "cdpScheduledQuotation");
            return (Criteria) this;
        }

        public Criteria andCdpScheduledQuotationNotBetween(Float value1, Float value2) {
            addCriterion("cdp_Scheduled_quotation not between", value1, value2, "cdpScheduledQuotation");
            return (Criteria) this;
        }

        public Criteria andCdpCounterpartOfferIsNull() {
            addCriterion("cdp_Counterpart_Offer is null");
            return (Criteria) this;
        }

        public Criteria andCdpCounterpartOfferIsNotNull() {
            addCriterion("cdp_Counterpart_Offer is not null");
            return (Criteria) this;
        }

        public Criteria andCdpCounterpartOfferEqualTo(Float value) {
            addCriterion("cdp_Counterpart_Offer =", value, "cdpCounterpartOffer");
            return (Criteria) this;
        }

        public Criteria andCdpCounterpartOfferNotEqualTo(Float value) {
            addCriterion("cdp_Counterpart_Offer <>", value, "cdpCounterpartOffer");
            return (Criteria) this;
        }

        public Criteria andCdpCounterpartOfferGreaterThan(Float value) {
            addCriterion("cdp_Counterpart_Offer >", value, "cdpCounterpartOffer");
            return (Criteria) this;
        }

        public Criteria andCdpCounterpartOfferGreaterThanOrEqualTo(Float value) {
            addCriterion("cdp_Counterpart_Offer >=", value, "cdpCounterpartOffer");
            return (Criteria) this;
        }

        public Criteria andCdpCounterpartOfferLessThan(Float value) {
            addCriterion("cdp_Counterpart_Offer <", value, "cdpCounterpartOffer");
            return (Criteria) this;
        }

        public Criteria andCdpCounterpartOfferLessThanOrEqualTo(Float value) {
            addCriterion("cdp_Counterpart_Offer <=", value, "cdpCounterpartOffer");
            return (Criteria) this;
        }

        public Criteria andCdpCounterpartOfferIn(List<Float> values) {
            addCriterion("cdp_Counterpart_Offer in", values, "cdpCounterpartOffer");
            return (Criteria) this;
        }

        public Criteria andCdpCounterpartOfferNotIn(List<Float> values) {
            addCriterion("cdp_Counterpart_Offer not in", values, "cdpCounterpartOffer");
            return (Criteria) this;
        }

        public Criteria andCdpCounterpartOfferBetween(Float value1, Float value2) {
            addCriterion("cdp_Counterpart_Offer between", value1, value2, "cdpCounterpartOffer");
            return (Criteria) this;
        }

        public Criteria andCdpCounterpartOfferNotBetween(Float value1, Float value2) {
            addCriterion("cdp_Counterpart_Offer not between", value1, value2, "cdpCounterpartOffer");
            return (Criteria) this;
        }

        public Criteria andCdpAdvanceDateIsNull() {
            addCriterion("cdp_advance_date is null");
            return (Criteria) this;
        }

        public Criteria andCdpAdvanceDateIsNotNull() {
            addCriterion("cdp_advance_date is not null");
            return (Criteria) this;
        }

        public Criteria andCdpAdvanceDateEqualTo(Date value) {
            addCriterionForJDBCDate("cdp_advance_date =", value, "cdpAdvanceDate");
            return (Criteria) this;
        }

        public Criteria andCdpAdvanceDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("cdp_advance_date <>", value, "cdpAdvanceDate");
            return (Criteria) this;
        }

        public Criteria andCdpAdvanceDateGreaterThan(Date value) {
            addCriterionForJDBCDate("cdp_advance_date >", value, "cdpAdvanceDate");
            return (Criteria) this;
        }

        public Criteria andCdpAdvanceDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cdp_advance_date >=", value, "cdpAdvanceDate");
            return (Criteria) this;
        }

        public Criteria andCdpAdvanceDateLessThan(Date value) {
            addCriterionForJDBCDate("cdp_advance_date <", value, "cdpAdvanceDate");
            return (Criteria) this;
        }

        public Criteria andCdpAdvanceDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cdp_advance_date <=", value, "cdpAdvanceDate");
            return (Criteria) this;
        }

        public Criteria andCdpAdvanceDateIn(List<Date> values) {
            addCriterionForJDBCDate("cdp_advance_date in", values, "cdpAdvanceDate");
            return (Criteria) this;
        }

        public Criteria andCdpAdvanceDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("cdp_advance_date not in", values, "cdpAdvanceDate");
            return (Criteria) this;
        }

        public Criteria andCdpAdvanceDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cdp_advance_date between", value1, value2, "cdpAdvanceDate");
            return (Criteria) this;
        }

        public Criteria andCdpAdvanceDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cdp_advance_date not between", value1, value2, "cdpAdvanceDate");
            return (Criteria) this;
        }

        public Criteria andCdpRemarkIsNull() {
            addCriterion("cdp_remark is null");
            return (Criteria) this;
        }

        public Criteria andCdpRemarkIsNotNull() {
            addCriterion("cdp_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCdpRemarkEqualTo(String value) {
            addCriterion("cdp_remark =", value, "cdpRemark");
            return (Criteria) this;
        }

        public Criteria andCdpRemarkNotEqualTo(String value) {
            addCriterion("cdp_remark <>", value, "cdpRemark");
            return (Criteria) this;
        }

        public Criteria andCdpRemarkGreaterThan(String value) {
            addCriterion("cdp_remark >", value, "cdpRemark");
            return (Criteria) this;
        }

        public Criteria andCdpRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("cdp_remark >=", value, "cdpRemark");
            return (Criteria) this;
        }

        public Criteria andCdpRemarkLessThan(String value) {
            addCriterion("cdp_remark <", value, "cdpRemark");
            return (Criteria) this;
        }

        public Criteria andCdpRemarkLessThanOrEqualTo(String value) {
            addCriterion("cdp_remark <=", value, "cdpRemark");
            return (Criteria) this;
        }

        public Criteria andCdpRemarkLike(String value) {
            addCriterion("cdp_remark like", value, "cdpRemark");
            return (Criteria) this;
        }

        public Criteria andCdpRemarkNotLike(String value) {
            addCriterion("cdp_remark not like", value, "cdpRemark");
            return (Criteria) this;
        }

        public Criteria andCdpRemarkIn(List<String> values) {
            addCriterion("cdp_remark in", values, "cdpRemark");
            return (Criteria) this;
        }

        public Criteria andCdpRemarkNotIn(List<String> values) {
            addCriterion("cdp_remark not in", values, "cdpRemark");
            return (Criteria) this;
        }

        public Criteria andCdpRemarkBetween(String value1, String value2) {
            addCriterion("cdp_remark between", value1, value2, "cdpRemark");
            return (Criteria) this;
        }

        public Criteria andCdpRemarkNotBetween(String value1, String value2) {
            addCriterion("cdp_remark not between", value1, value2, "cdpRemark");
            return (Criteria) this;
        }

        public Criteria andCdpAuditingIsNull() {
            addCriterion("cdp_Auditing is null");
            return (Criteria) this;
        }

        public Criteria andCdpAuditingIsNotNull() {
            addCriterion("cdp_Auditing is not null");
            return (Criteria) this;
        }

        public Criteria andCdpAuditingEqualTo(String value) {
            addCriterion("cdp_Auditing =", value, "cdpAuditing");
            return (Criteria) this;
        }

        public Criteria andCdpAuditingNotEqualTo(String value) {
            addCriterion("cdp_Auditing <>", value, "cdpAuditing");
            return (Criteria) this;
        }

        public Criteria andCdpAuditingGreaterThan(String value) {
            addCriterion("cdp_Auditing >", value, "cdpAuditing");
            return (Criteria) this;
        }

        public Criteria andCdpAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("cdp_Auditing >=", value, "cdpAuditing");
            return (Criteria) this;
        }

        public Criteria andCdpAuditingLessThan(String value) {
            addCriterion("cdp_Auditing <", value, "cdpAuditing");
            return (Criteria) this;
        }

        public Criteria andCdpAuditingLessThanOrEqualTo(String value) {
            addCriterion("cdp_Auditing <=", value, "cdpAuditing");
            return (Criteria) this;
        }

        public Criteria andCdpAuditingLike(String value) {
            addCriterion("cdp_Auditing like", value, "cdpAuditing");
            return (Criteria) this;
        }

        public Criteria andCdpAuditingNotLike(String value) {
            addCriterion("cdp_Auditing not like", value, "cdpAuditing");
            return (Criteria) this;
        }

        public Criteria andCdpAuditingIn(List<String> values) {
            addCriterion("cdp_Auditing in", values, "cdpAuditing");
            return (Criteria) this;
        }

        public Criteria andCdpAuditingNotIn(List<String> values) {
            addCriterion("cdp_Auditing not in", values, "cdpAuditing");
            return (Criteria) this;
        }

        public Criteria andCdpAuditingBetween(String value1, String value2) {
            addCriterion("cdp_Auditing between", value1, value2, "cdpAuditing");
            return (Criteria) this;
        }

        public Criteria andCdpAuditingNotBetween(String value1, String value2) {
            addCriterion("cdp_Auditing not between", value1, value2, "cdpAuditing");
            return (Criteria) this;
        }

        public Criteria andCdpYnIsNull() {
            addCriterion("cdp_yn is null");
            return (Criteria) this;
        }

        public Criteria andCdpYnIsNotNull() {
            addCriterion("cdp_yn is not null");
            return (Criteria) this;
        }

        public Criteria andCdpYnEqualTo(String value) {
            addCriterion("cdp_yn =", value, "cdpYn");
            return (Criteria) this;
        }

        public Criteria andCdpYnNotEqualTo(String value) {
            addCriterion("cdp_yn <>", value, "cdpYn");
            return (Criteria) this;
        }

        public Criteria andCdpYnGreaterThan(String value) {
            addCriterion("cdp_yn >", value, "cdpYn");
            return (Criteria) this;
        }

        public Criteria andCdpYnGreaterThanOrEqualTo(String value) {
            addCriterion("cdp_yn >=", value, "cdpYn");
            return (Criteria) this;
        }

        public Criteria andCdpYnLessThan(String value) {
            addCriterion("cdp_yn <", value, "cdpYn");
            return (Criteria) this;
        }

        public Criteria andCdpYnLessThanOrEqualTo(String value) {
            addCriterion("cdp_yn <=", value, "cdpYn");
            return (Criteria) this;
        }

        public Criteria andCdpYnLike(String value) {
            addCriterion("cdp_yn like", value, "cdpYn");
            return (Criteria) this;
        }

        public Criteria andCdpYnNotLike(String value) {
            addCriterion("cdp_yn not like", value, "cdpYn");
            return (Criteria) this;
        }

        public Criteria andCdpYnIn(List<String> values) {
            addCriterion("cdp_yn in", values, "cdpYn");
            return (Criteria) this;
        }

        public Criteria andCdpYnNotIn(List<String> values) {
            addCriterion("cdp_yn not in", values, "cdpYn");
            return (Criteria) this;
        }

        public Criteria andCdpYnBetween(String value1, String value2) {
            addCriterion("cdp_yn between", value1, value2, "cdpYn");
            return (Criteria) this;
        }

        public Criteria andCdpYnNotBetween(String value1, String value2) {
            addCriterion("cdp_yn not between", value1, value2, "cdpYn");
            return (Criteria) this;
        }

        public Criteria andCdpCustom1IsNull() {
            addCriterion("cdp_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCdpCustom1IsNotNull() {
            addCriterion("cdp_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCdpCustom1EqualTo(String value) {
            addCriterion("cdp_custom1 =", value, "cdpCustom1");
            return (Criteria) this;
        }

        public Criteria andCdpCustom1NotEqualTo(String value) {
            addCriterion("cdp_custom1 <>", value, "cdpCustom1");
            return (Criteria) this;
        }

        public Criteria andCdpCustom1GreaterThan(String value) {
            addCriterion("cdp_custom1 >", value, "cdpCustom1");
            return (Criteria) this;
        }

        public Criteria andCdpCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("cdp_custom1 >=", value, "cdpCustom1");
            return (Criteria) this;
        }

        public Criteria andCdpCustom1LessThan(String value) {
            addCriterion("cdp_custom1 <", value, "cdpCustom1");
            return (Criteria) this;
        }

        public Criteria andCdpCustom1LessThanOrEqualTo(String value) {
            addCriterion("cdp_custom1 <=", value, "cdpCustom1");
            return (Criteria) this;
        }

        public Criteria andCdpCustom1Like(String value) {
            addCriterion("cdp_custom1 like", value, "cdpCustom1");
            return (Criteria) this;
        }

        public Criteria andCdpCustom1NotLike(String value) {
            addCriterion("cdp_custom1 not like", value, "cdpCustom1");
            return (Criteria) this;
        }

        public Criteria andCdpCustom1In(List<String> values) {
            addCriterion("cdp_custom1 in", values, "cdpCustom1");
            return (Criteria) this;
        }

        public Criteria andCdpCustom1NotIn(List<String> values) {
            addCriterion("cdp_custom1 not in", values, "cdpCustom1");
            return (Criteria) this;
        }

        public Criteria andCdpCustom1Between(String value1, String value2) {
            addCriterion("cdp_custom1 between", value1, value2, "cdpCustom1");
            return (Criteria) this;
        }

        public Criteria andCdpCustom1NotBetween(String value1, String value2) {
            addCriterion("cdp_custom1 not between", value1, value2, "cdpCustom1");
            return (Criteria) this;
        }

        public Criteria andCdpCustom2IsNull() {
            addCriterion("cdp_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCdpCustom2IsNotNull() {
            addCriterion("cdp_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCdpCustom2EqualTo(String value) {
            addCriterion("cdp_custom2 =", value, "cdpCustom2");
            return (Criteria) this;
        }

        public Criteria andCdpCustom2NotEqualTo(String value) {
            addCriterion("cdp_custom2 <>", value, "cdpCustom2");
            return (Criteria) this;
        }

        public Criteria andCdpCustom2GreaterThan(String value) {
            addCriterion("cdp_custom2 >", value, "cdpCustom2");
            return (Criteria) this;
        }

        public Criteria andCdpCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("cdp_custom2 >=", value, "cdpCustom2");
            return (Criteria) this;
        }

        public Criteria andCdpCustom2LessThan(String value) {
            addCriterion("cdp_custom2 <", value, "cdpCustom2");
            return (Criteria) this;
        }

        public Criteria andCdpCustom2LessThanOrEqualTo(String value) {
            addCriterion("cdp_custom2 <=", value, "cdpCustom2");
            return (Criteria) this;
        }

        public Criteria andCdpCustom2Like(String value) {
            addCriterion("cdp_custom2 like", value, "cdpCustom2");
            return (Criteria) this;
        }

        public Criteria andCdpCustom2NotLike(String value) {
            addCriterion("cdp_custom2 not like", value, "cdpCustom2");
            return (Criteria) this;
        }

        public Criteria andCdpCustom2In(List<String> values) {
            addCriterion("cdp_custom2 in", values, "cdpCustom2");
            return (Criteria) this;
        }

        public Criteria andCdpCustom2NotIn(List<String> values) {
            addCriterion("cdp_custom2 not in", values, "cdpCustom2");
            return (Criteria) this;
        }

        public Criteria andCdpCustom2Between(String value1, String value2) {
            addCriterion("cdp_custom2 between", value1, value2, "cdpCustom2");
            return (Criteria) this;
        }

        public Criteria andCdpCustom2NotBetween(String value1, String value2) {
            addCriterion("cdp_custom2 not between", value1, value2, "cdpCustom2");
            return (Criteria) this;
        }

        public Criteria andCdpCustom3IsNull() {
            addCriterion("cdp_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andCdpCustom3IsNotNull() {
            addCriterion("cdp_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andCdpCustom3EqualTo(String value) {
            addCriterion("cdp_custom3 =", value, "cdpCustom3");
            return (Criteria) this;
        }

        public Criteria andCdpCustom3NotEqualTo(String value) {
            addCriterion("cdp_custom3 <>", value, "cdpCustom3");
            return (Criteria) this;
        }

        public Criteria andCdpCustom3GreaterThan(String value) {
            addCriterion("cdp_custom3 >", value, "cdpCustom3");
            return (Criteria) this;
        }

        public Criteria andCdpCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("cdp_custom3 >=", value, "cdpCustom3");
            return (Criteria) this;
        }

        public Criteria andCdpCustom3LessThan(String value) {
            addCriterion("cdp_custom3 <", value, "cdpCustom3");
            return (Criteria) this;
        }

        public Criteria andCdpCustom3LessThanOrEqualTo(String value) {
            addCriterion("cdp_custom3 <=", value, "cdpCustom3");
            return (Criteria) this;
        }

        public Criteria andCdpCustom3Like(String value) {
            addCriterion("cdp_custom3 like", value, "cdpCustom3");
            return (Criteria) this;
        }

        public Criteria andCdpCustom3NotLike(String value) {
            addCriterion("cdp_custom3 not like", value, "cdpCustom3");
            return (Criteria) this;
        }

        public Criteria andCdpCustom3In(List<String> values) {
            addCriterion("cdp_custom3 in", values, "cdpCustom3");
            return (Criteria) this;
        }

        public Criteria andCdpCustom3NotIn(List<String> values) {
            addCriterion("cdp_custom3 not in", values, "cdpCustom3");
            return (Criteria) this;
        }

        public Criteria andCdpCustom3Between(String value1, String value2) {
            addCriterion("cdp_custom3 between", value1, value2, "cdpCustom3");
            return (Criteria) this;
        }

        public Criteria andCdpCustom3NotBetween(String value1, String value2) {
            addCriterion("cdp_custom3 not between", value1, value2, "cdpCustom3");
            return (Criteria) this;
        }

        public Criteria andCdpCustom4IsNull() {
            addCriterion("cdp_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andCdpCustom4IsNotNull() {
            addCriterion("cdp_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andCdpCustom4EqualTo(String value) {
            addCriterion("cdp_custom4 =", value, "cdpCustom4");
            return (Criteria) this;
        }

        public Criteria andCdpCustom4NotEqualTo(String value) {
            addCriterion("cdp_custom4 <>", value, "cdpCustom4");
            return (Criteria) this;
        }

        public Criteria andCdpCustom4GreaterThan(String value) {
            addCriterion("cdp_custom4 >", value, "cdpCustom4");
            return (Criteria) this;
        }

        public Criteria andCdpCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("cdp_custom4 >=", value, "cdpCustom4");
            return (Criteria) this;
        }

        public Criteria andCdpCustom4LessThan(String value) {
            addCriterion("cdp_custom4 <", value, "cdpCustom4");
            return (Criteria) this;
        }

        public Criteria andCdpCustom4LessThanOrEqualTo(String value) {
            addCriterion("cdp_custom4 <=", value, "cdpCustom4");
            return (Criteria) this;
        }

        public Criteria andCdpCustom4Like(String value) {
            addCriterion("cdp_custom4 like", value, "cdpCustom4");
            return (Criteria) this;
        }

        public Criteria andCdpCustom4NotLike(String value) {
            addCriterion("cdp_custom4 not like", value, "cdpCustom4");
            return (Criteria) this;
        }

        public Criteria andCdpCustom4In(List<String> values) {
            addCriterion("cdp_custom4 in", values, "cdpCustom4");
            return (Criteria) this;
        }

        public Criteria andCdpCustom4NotIn(List<String> values) {
            addCriterion("cdp_custom4 not in", values, "cdpCustom4");
            return (Criteria) this;
        }

        public Criteria andCdpCustom4Between(String value1, String value2) {
            addCriterion("cdp_custom4 between", value1, value2, "cdpCustom4");
            return (Criteria) this;
        }

        public Criteria andCdpCustom4NotBetween(String value1, String value2) {
            addCriterion("cdp_custom4 not between", value1, value2, "cdpCustom4");
            return (Criteria) this;
        }

        public Criteria andCdpCustom5IsNull() {
            addCriterion("cdp_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andCdpCustom5IsNotNull() {
            addCriterion("cdp_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andCdpCustom5EqualTo(String value) {
            addCriterion("cdp_custom5 =", value, "cdpCustom5");
            return (Criteria) this;
        }

        public Criteria andCdpCustom5NotEqualTo(String value) {
            addCriterion("cdp_custom5 <>", value, "cdpCustom5");
            return (Criteria) this;
        }

        public Criteria andCdpCustom5GreaterThan(String value) {
            addCriterion("cdp_custom5 >", value, "cdpCustom5");
            return (Criteria) this;
        }

        public Criteria andCdpCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("cdp_custom5 >=", value, "cdpCustom5");
            return (Criteria) this;
        }

        public Criteria andCdpCustom5LessThan(String value) {
            addCriterion("cdp_custom5 <", value, "cdpCustom5");
            return (Criteria) this;
        }

        public Criteria andCdpCustom5LessThanOrEqualTo(String value) {
            addCriterion("cdp_custom5 <=", value, "cdpCustom5");
            return (Criteria) this;
        }

        public Criteria andCdpCustom5Like(String value) {
            addCriterion("cdp_custom5 like", value, "cdpCustom5");
            return (Criteria) this;
        }

        public Criteria andCdpCustom5NotLike(String value) {
            addCriterion("cdp_custom5 not like", value, "cdpCustom5");
            return (Criteria) this;
        }

        public Criteria andCdpCustom5In(List<String> values) {
            addCriterion("cdp_custom5 in", values, "cdpCustom5");
            return (Criteria) this;
        }

        public Criteria andCdpCustom5NotIn(List<String> values) {
            addCriterion("cdp_custom5 not in", values, "cdpCustom5");
            return (Criteria) this;
        }

        public Criteria andCdpCustom5Between(String value1, String value2) {
            addCriterion("cdp_custom5 between", value1, value2, "cdpCustom5");
            return (Criteria) this;
        }

        public Criteria andCdpCustom5NotBetween(String value1, String value2) {
            addCriterion("cdp_custom5 not between", value1, value2, "cdpCustom5");
            return (Criteria) this;
        }

        public Criteria andCdpCustom6IsNull() {
            addCriterion("cdp_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andCdpCustom6IsNotNull() {
            addCriterion("cdp_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andCdpCustom6EqualTo(String value) {
            addCriterion("cdp_custom6 =", value, "cdpCustom6");
            return (Criteria) this;
        }

        public Criteria andCdpCustom6NotEqualTo(String value) {
            addCriterion("cdp_custom6 <>", value, "cdpCustom6");
            return (Criteria) this;
        }

        public Criteria andCdpCustom6GreaterThan(String value) {
            addCriterion("cdp_custom6 >", value, "cdpCustom6");
            return (Criteria) this;
        }

        public Criteria andCdpCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("cdp_custom6 >=", value, "cdpCustom6");
            return (Criteria) this;
        }

        public Criteria andCdpCustom6LessThan(String value) {
            addCriterion("cdp_custom6 <", value, "cdpCustom6");
            return (Criteria) this;
        }

        public Criteria andCdpCustom6LessThanOrEqualTo(String value) {
            addCriterion("cdp_custom6 <=", value, "cdpCustom6");
            return (Criteria) this;
        }

        public Criteria andCdpCustom6Like(String value) {
            addCriterion("cdp_custom6 like", value, "cdpCustom6");
            return (Criteria) this;
        }

        public Criteria andCdpCustom6NotLike(String value) {
            addCriterion("cdp_custom6 not like", value, "cdpCustom6");
            return (Criteria) this;
        }

        public Criteria andCdpCustom6In(List<String> values) {
            addCriterion("cdp_custom6 in", values, "cdpCustom6");
            return (Criteria) this;
        }

        public Criteria andCdpCustom6NotIn(List<String> values) {
            addCriterion("cdp_custom6 not in", values, "cdpCustom6");
            return (Criteria) this;
        }

        public Criteria andCdpCustom6Between(String value1, String value2) {
            addCriterion("cdp_custom6 between", value1, value2, "cdpCustom6");
            return (Criteria) this;
        }

        public Criteria andCdpCustom6NotBetween(String value1, String value2) {
            addCriterion("cdp_custom6 not between", value1, value2, "cdpCustom6");
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