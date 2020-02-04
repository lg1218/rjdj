package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PCheckmemuDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PCheckmemuDetailExample() {
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

        public Criteria andMeBillnoIsNull() {
            addCriterion("me_billno is null");
            return (Criteria) this;
        }

        public Criteria andMeBillnoIsNotNull() {
            addCriterion("me_billno is not null");
            return (Criteria) this;
        }

        public Criteria andMeBillnoEqualTo(String value) {
            addCriterion("me_billno =", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoNotEqualTo(String value) {
            addCriterion("me_billno <>", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoGreaterThan(String value) {
            addCriterion("me_billno >", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("me_billno >=", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoLessThan(String value) {
            addCriterion("me_billno <", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoLessThanOrEqualTo(String value) {
            addCriterion("me_billno <=", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoLike(String value) {
            addCriterion("me_billno like", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoNotLike(String value) {
            addCriterion("me_billno not like", value, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoIn(List<String> values) {
            addCriterion("me_billno in", values, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoNotIn(List<String> values) {
            addCriterion("me_billno not in", values, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoBetween(String value1, String value2) {
            addCriterion("me_billno between", value1, value2, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMeBillnoNotBetween(String value1, String value2) {
            addCriterion("me_billno not between", value1, value2, "meBillno");
            return (Criteria) this;
        }

        public Criteria andMpLineIdIsNull() {
            addCriterion("mp_line_id is null");
            return (Criteria) this;
        }

        public Criteria andMpLineIdIsNotNull() {
            addCriterion("mp_line_id is not null");
            return (Criteria) this;
        }

        public Criteria andMpLineIdEqualTo(Integer value) {
            addCriterion("mp_line_id =", value, "mpLineId");
            return (Criteria) this;
        }

        public Criteria andMpLineIdNotEqualTo(Integer value) {
            addCriterion("mp_line_id <>", value, "mpLineId");
            return (Criteria) this;
        }

        public Criteria andMpLineIdGreaterThan(Integer value) {
            addCriterion("mp_line_id >", value, "mpLineId");
            return (Criteria) this;
        }

        public Criteria andMpLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mp_line_id >=", value, "mpLineId");
            return (Criteria) this;
        }

        public Criteria andMpLineIdLessThan(Integer value) {
            addCriterion("mp_line_id <", value, "mpLineId");
            return (Criteria) this;
        }

        public Criteria andMpLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("mp_line_id <=", value, "mpLineId");
            return (Criteria) this;
        }

        public Criteria andMpLineIdIn(List<Integer> values) {
            addCriterion("mp_line_id in", values, "mpLineId");
            return (Criteria) this;
        }

        public Criteria andMpLineIdNotIn(List<Integer> values) {
            addCriterion("mp_line_id not in", values, "mpLineId");
            return (Criteria) this;
        }

        public Criteria andMpLineIdBetween(Integer value1, Integer value2) {
            addCriterion("mp_line_id between", value1, value2, "mpLineId");
            return (Criteria) this;
        }

        public Criteria andMpLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mp_line_id not between", value1, value2, "mpLineId");
            return (Criteria) this;
        }

        public Criteria andMpMmIdIsNull() {
            addCriterion("mp_mm_id is null");
            return (Criteria) this;
        }

        public Criteria andMpMmIdIsNotNull() {
            addCriterion("mp_mm_id is not null");
            return (Criteria) this;
        }

        public Criteria andMpMmIdEqualTo(Date value) {
            addCriterionForJDBCDate("mp_mm_id =", value, "mpMmId");
            return (Criteria) this;
        }

        public Criteria andMpMmIdNotEqualTo(Date value) {
            addCriterionForJDBCDate("mp_mm_id <>", value, "mpMmId");
            return (Criteria) this;
        }

        public Criteria andMpMmIdGreaterThan(Date value) {
            addCriterionForJDBCDate("mp_mm_id >", value, "mpMmId");
            return (Criteria) this;
        }

        public Criteria andMpMmIdGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mp_mm_id >=", value, "mpMmId");
            return (Criteria) this;
        }

        public Criteria andMpMmIdLessThan(Date value) {
            addCriterionForJDBCDate("mp_mm_id <", value, "mpMmId");
            return (Criteria) this;
        }

        public Criteria andMpMmIdLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mp_mm_id <=", value, "mpMmId");
            return (Criteria) this;
        }

        public Criteria andMpMmIdIn(List<Date> values) {
            addCriterionForJDBCDate("mp_mm_id in", values, "mpMmId");
            return (Criteria) this;
        }

        public Criteria andMpMmIdNotIn(List<Date> values) {
            addCriterionForJDBCDate("mp_mm_id not in", values, "mpMmId");
            return (Criteria) this;
        }

        public Criteria andMpMmIdBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mp_mm_id between", value1, value2, "mpMmId");
            return (Criteria) this;
        }

        public Criteria andMpMmIdNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mp_mm_id not between", value1, value2, "mpMmId");
            return (Criteria) this;
        }

        public Criteria andMpProdnameIsNull() {
            addCriterion("mp_prodname is null");
            return (Criteria) this;
        }

        public Criteria andMpProdnameIsNotNull() {
            addCriterion("mp_prodname is not null");
            return (Criteria) this;
        }

        public Criteria andMpProdnameEqualTo(String value) {
            addCriterion("mp_prodname =", value, "mpProdname");
            return (Criteria) this;
        }

        public Criteria andMpProdnameNotEqualTo(String value) {
            addCriterion("mp_prodname <>", value, "mpProdname");
            return (Criteria) this;
        }

        public Criteria andMpProdnameGreaterThan(String value) {
            addCriterion("mp_prodname >", value, "mpProdname");
            return (Criteria) this;
        }

        public Criteria andMpProdnameGreaterThanOrEqualTo(String value) {
            addCriterion("mp_prodname >=", value, "mpProdname");
            return (Criteria) this;
        }

        public Criteria andMpProdnameLessThan(String value) {
            addCriterion("mp_prodname <", value, "mpProdname");
            return (Criteria) this;
        }

        public Criteria andMpProdnameLessThanOrEqualTo(String value) {
            addCriterion("mp_prodname <=", value, "mpProdname");
            return (Criteria) this;
        }

        public Criteria andMpProdnameLike(String value) {
            addCriterion("mp_prodname like", value, "mpProdname");
            return (Criteria) this;
        }

        public Criteria andMpProdnameNotLike(String value) {
            addCriterion("mp_prodname not like", value, "mpProdname");
            return (Criteria) this;
        }

        public Criteria andMpProdnameIn(List<String> values) {
            addCriterion("mp_prodname in", values, "mpProdname");
            return (Criteria) this;
        }

        public Criteria andMpProdnameNotIn(List<String> values) {
            addCriterion("mp_prodname not in", values, "mpProdname");
            return (Criteria) this;
        }

        public Criteria andMpProdnameBetween(String value1, String value2) {
            addCriterion("mp_prodname between", value1, value2, "mpProdname");
            return (Criteria) this;
        }

        public Criteria andMpProdnameNotBetween(String value1, String value2) {
            addCriterion("mp_prodname not between", value1, value2, "mpProdname");
            return (Criteria) this;
        }

        public Criteria andMpProdsizeIsNull() {
            addCriterion("mp_prodsize is null");
            return (Criteria) this;
        }

        public Criteria andMpProdsizeIsNotNull() {
            addCriterion("mp_prodsize is not null");
            return (Criteria) this;
        }

        public Criteria andMpProdsizeEqualTo(Integer value) {
            addCriterion("mp_prodsize =", value, "mpProdsize");
            return (Criteria) this;
        }

        public Criteria andMpProdsizeNotEqualTo(Integer value) {
            addCriterion("mp_prodsize <>", value, "mpProdsize");
            return (Criteria) this;
        }

        public Criteria andMpProdsizeGreaterThan(Integer value) {
            addCriterion("mp_prodsize >", value, "mpProdsize");
            return (Criteria) this;
        }

        public Criteria andMpProdsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mp_prodsize >=", value, "mpProdsize");
            return (Criteria) this;
        }

        public Criteria andMpProdsizeLessThan(Integer value) {
            addCriterion("mp_prodsize <", value, "mpProdsize");
            return (Criteria) this;
        }

        public Criteria andMpProdsizeLessThanOrEqualTo(Integer value) {
            addCriterion("mp_prodsize <=", value, "mpProdsize");
            return (Criteria) this;
        }

        public Criteria andMpProdsizeIn(List<Integer> values) {
            addCriterion("mp_prodsize in", values, "mpProdsize");
            return (Criteria) this;
        }

        public Criteria andMpProdsizeNotIn(List<Integer> values) {
            addCriterion("mp_prodsize not in", values, "mpProdsize");
            return (Criteria) this;
        }

        public Criteria andMpProdsizeBetween(Integer value1, Integer value2) {
            addCriterion("mp_prodsize between", value1, value2, "mpProdsize");
            return (Criteria) this;
        }

        public Criteria andMpProdsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("mp_prodsize not between", value1, value2, "mpProdsize");
            return (Criteria) this;
        }

        public Criteria andMpUnitIsNull() {
            addCriterion("mp_unit is null");
            return (Criteria) this;
        }

        public Criteria andMpUnitIsNotNull() {
            addCriterion("mp_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMpUnitEqualTo(String value) {
            addCriterion("mp_unit =", value, "mpUnit");
            return (Criteria) this;
        }

        public Criteria andMpUnitNotEqualTo(String value) {
            addCriterion("mp_unit <>", value, "mpUnit");
            return (Criteria) this;
        }

        public Criteria andMpUnitGreaterThan(String value) {
            addCriterion("mp_unit >", value, "mpUnit");
            return (Criteria) this;
        }

        public Criteria andMpUnitGreaterThanOrEqualTo(String value) {
            addCriterion("mp_unit >=", value, "mpUnit");
            return (Criteria) this;
        }

        public Criteria andMpUnitLessThan(String value) {
            addCriterion("mp_unit <", value, "mpUnit");
            return (Criteria) this;
        }

        public Criteria andMpUnitLessThanOrEqualTo(String value) {
            addCriterion("mp_unit <=", value, "mpUnit");
            return (Criteria) this;
        }

        public Criteria andMpUnitLike(String value) {
            addCriterion("mp_unit like", value, "mpUnit");
            return (Criteria) this;
        }

        public Criteria andMpUnitNotLike(String value) {
            addCriterion("mp_unit not like", value, "mpUnit");
            return (Criteria) this;
        }

        public Criteria andMpUnitIn(List<String> values) {
            addCriterion("mp_unit in", values, "mpUnit");
            return (Criteria) this;
        }

        public Criteria andMpUnitNotIn(List<String> values) {
            addCriterion("mp_unit not in", values, "mpUnit");
            return (Criteria) this;
        }

        public Criteria andMpUnitBetween(String value1, String value2) {
            addCriterion("mp_unit between", value1, value2, "mpUnit");
            return (Criteria) this;
        }

        public Criteria andMpUnitNotBetween(String value1, String value2) {
            addCriterion("mp_unit not between", value1, value2, "mpUnit");
            return (Criteria) this;
        }

        public Criteria andMpCurqtyIsNull() {
            addCriterion("mp_curqty is null");
            return (Criteria) this;
        }

        public Criteria andMpCurqtyIsNotNull() {
            addCriterion("mp_curqty is not null");
            return (Criteria) this;
        }

        public Criteria andMpCurqtyEqualTo(Integer value) {
            addCriterion("mp_curqty =", value, "mpCurqty");
            return (Criteria) this;
        }

        public Criteria andMpCurqtyNotEqualTo(Integer value) {
            addCriterion("mp_curqty <>", value, "mpCurqty");
            return (Criteria) this;
        }

        public Criteria andMpCurqtyGreaterThan(Integer value) {
            addCriterion("mp_curqty >", value, "mpCurqty");
            return (Criteria) this;
        }

        public Criteria andMpCurqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("mp_curqty >=", value, "mpCurqty");
            return (Criteria) this;
        }

        public Criteria andMpCurqtyLessThan(Integer value) {
            addCriterion("mp_curqty <", value, "mpCurqty");
            return (Criteria) this;
        }

        public Criteria andMpCurqtyLessThanOrEqualTo(Integer value) {
            addCriterion("mp_curqty <=", value, "mpCurqty");
            return (Criteria) this;
        }

        public Criteria andMpCurqtyIn(List<Integer> values) {
            addCriterion("mp_curqty in", values, "mpCurqty");
            return (Criteria) this;
        }

        public Criteria andMpCurqtyNotIn(List<Integer> values) {
            addCriterion("mp_curqty not in", values, "mpCurqty");
            return (Criteria) this;
        }

        public Criteria andMpCurqtyBetween(Integer value1, Integer value2) {
            addCriterion("mp_curqty between", value1, value2, "mpCurqty");
            return (Criteria) this;
        }

        public Criteria andMpCurqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("mp_curqty not between", value1, value2, "mpCurqty");
            return (Criteria) this;
        }

        public Criteria andMpCheckqtyIsNull() {
            addCriterion("mp_checkqty is null");
            return (Criteria) this;
        }

        public Criteria andMpCheckqtyIsNotNull() {
            addCriterion("mp_checkqty is not null");
            return (Criteria) this;
        }

        public Criteria andMpCheckqtyEqualTo(Integer value) {
            addCriterion("mp_checkqty =", value, "mpCheckqty");
            return (Criteria) this;
        }

        public Criteria andMpCheckqtyNotEqualTo(Integer value) {
            addCriterion("mp_checkqty <>", value, "mpCheckqty");
            return (Criteria) this;
        }

        public Criteria andMpCheckqtyGreaterThan(Integer value) {
            addCriterion("mp_checkqty >", value, "mpCheckqty");
            return (Criteria) this;
        }

        public Criteria andMpCheckqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("mp_checkqty >=", value, "mpCheckqty");
            return (Criteria) this;
        }

        public Criteria andMpCheckqtyLessThan(Integer value) {
            addCriterion("mp_checkqty <", value, "mpCheckqty");
            return (Criteria) this;
        }

        public Criteria andMpCheckqtyLessThanOrEqualTo(Integer value) {
            addCriterion("mp_checkqty <=", value, "mpCheckqty");
            return (Criteria) this;
        }

        public Criteria andMpCheckqtyIn(List<Integer> values) {
            addCriterion("mp_checkqty in", values, "mpCheckqty");
            return (Criteria) this;
        }

        public Criteria andMpCheckqtyNotIn(List<Integer> values) {
            addCriterion("mp_checkqty not in", values, "mpCheckqty");
            return (Criteria) this;
        }

        public Criteria andMpCheckqtyBetween(Integer value1, Integer value2) {
            addCriterion("mp_checkqty between", value1, value2, "mpCheckqty");
            return (Criteria) this;
        }

        public Criteria andMpCheckqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("mp_checkqty not between", value1, value2, "mpCheckqty");
            return (Criteria) this;
        }

        public Criteria andMpQuantityIsNull() {
            addCriterion("mp_quantity is null");
            return (Criteria) this;
        }

        public Criteria andMpQuantityIsNotNull() {
            addCriterion("mp_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andMpQuantityEqualTo(String value) {
            addCriterion("mp_quantity =", value, "mpQuantity");
            return (Criteria) this;
        }

        public Criteria andMpQuantityNotEqualTo(String value) {
            addCriterion("mp_quantity <>", value, "mpQuantity");
            return (Criteria) this;
        }

        public Criteria andMpQuantityGreaterThan(String value) {
            addCriterion("mp_quantity >", value, "mpQuantity");
            return (Criteria) this;
        }

        public Criteria andMpQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("mp_quantity >=", value, "mpQuantity");
            return (Criteria) this;
        }

        public Criteria andMpQuantityLessThan(String value) {
            addCriterion("mp_quantity <", value, "mpQuantity");
            return (Criteria) this;
        }

        public Criteria andMpQuantityLessThanOrEqualTo(String value) {
            addCriterion("mp_quantity <=", value, "mpQuantity");
            return (Criteria) this;
        }

        public Criteria andMpQuantityLike(String value) {
            addCriterion("mp_quantity like", value, "mpQuantity");
            return (Criteria) this;
        }

        public Criteria andMpQuantityNotLike(String value) {
            addCriterion("mp_quantity not like", value, "mpQuantity");
            return (Criteria) this;
        }

        public Criteria andMpQuantityIn(List<String> values) {
            addCriterion("mp_quantity in", values, "mpQuantity");
            return (Criteria) this;
        }

        public Criteria andMpQuantityNotIn(List<String> values) {
            addCriterion("mp_quantity not in", values, "mpQuantity");
            return (Criteria) this;
        }

        public Criteria andMpQuantityBetween(String value1, String value2) {
            addCriterion("mp_quantity between", value1, value2, "mpQuantity");
            return (Criteria) this;
        }

        public Criteria andMpQuantityNotBetween(String value1, String value2) {
            addCriterion("mp_quantity not between", value1, value2, "mpQuantity");
            return (Criteria) this;
        }

        public Criteria andMpPriceIsNull() {
            addCriterion("mp_price is null");
            return (Criteria) this;
        }

        public Criteria andMpPriceIsNotNull() {
            addCriterion("mp_price is not null");
            return (Criteria) this;
        }

        public Criteria andMpPriceEqualTo(Double value) {
            addCriterion("mp_price =", value, "mpPrice");
            return (Criteria) this;
        }

        public Criteria andMpPriceNotEqualTo(Double value) {
            addCriterion("mp_price <>", value, "mpPrice");
            return (Criteria) this;
        }

        public Criteria andMpPriceGreaterThan(Double value) {
            addCriterion("mp_price >", value, "mpPrice");
            return (Criteria) this;
        }

        public Criteria andMpPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("mp_price >=", value, "mpPrice");
            return (Criteria) this;
        }

        public Criteria andMpPriceLessThan(Double value) {
            addCriterion("mp_price <", value, "mpPrice");
            return (Criteria) this;
        }

        public Criteria andMpPriceLessThanOrEqualTo(Double value) {
            addCriterion("mp_price <=", value, "mpPrice");
            return (Criteria) this;
        }

        public Criteria andMpPriceIn(List<Double> values) {
            addCriterion("mp_price in", values, "mpPrice");
            return (Criteria) this;
        }

        public Criteria andMpPriceNotIn(List<Double> values) {
            addCriterion("mp_price not in", values, "mpPrice");
            return (Criteria) this;
        }

        public Criteria andMpPriceBetween(Double value1, Double value2) {
            addCriterion("mp_price between", value1, value2, "mpPrice");
            return (Criteria) this;
        }

        public Criteria andMpPriceNotBetween(Double value1, Double value2) {
            addCriterion("mp_price not between", value1, value2, "mpPrice");
            return (Criteria) this;
        }

        public Criteria andMpAmountIsNull() {
            addCriterion("mp_amount is null");
            return (Criteria) this;
        }

        public Criteria andMpAmountIsNotNull() {
            addCriterion("mp_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMpAmountEqualTo(Double value) {
            addCriterion("mp_amount =", value, "mpAmount");
            return (Criteria) this;
        }

        public Criteria andMpAmountNotEqualTo(Double value) {
            addCriterion("mp_amount <>", value, "mpAmount");
            return (Criteria) this;
        }

        public Criteria andMpAmountGreaterThan(Double value) {
            addCriterion("mp_amount >", value, "mpAmount");
            return (Criteria) this;
        }

        public Criteria andMpAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("mp_amount >=", value, "mpAmount");
            return (Criteria) this;
        }

        public Criteria andMpAmountLessThan(Double value) {
            addCriterion("mp_amount <", value, "mpAmount");
            return (Criteria) this;
        }

        public Criteria andMpAmountLessThanOrEqualTo(Double value) {
            addCriterion("mp_amount <=", value, "mpAmount");
            return (Criteria) this;
        }

        public Criteria andMpAmountIn(List<Double> values) {
            addCriterion("mp_amount in", values, "mpAmount");
            return (Criteria) this;
        }

        public Criteria andMpAmountNotIn(List<Double> values) {
            addCriterion("mp_amount not in", values, "mpAmount");
            return (Criteria) this;
        }

        public Criteria andMpAmountBetween(Double value1, Double value2) {
            addCriterion("mp_amount between", value1, value2, "mpAmount");
            return (Criteria) this;
        }

        public Criteria andMpAmountNotBetween(Double value1, Double value2) {
            addCriterion("mp_amount not between", value1, value2, "mpAmount");
            return (Criteria) this;
        }

        public Criteria andMpBillstatusIsNull() {
            addCriterion("mp_billstatus is null");
            return (Criteria) this;
        }

        public Criteria andMpBillstatusIsNotNull() {
            addCriterion("mp_billstatus is not null");
            return (Criteria) this;
        }

        public Criteria andMpBillstatusEqualTo(Integer value) {
            addCriterion("mp_billstatus =", value, "mpBillstatus");
            return (Criteria) this;
        }

        public Criteria andMpBillstatusNotEqualTo(Integer value) {
            addCriterion("mp_billstatus <>", value, "mpBillstatus");
            return (Criteria) this;
        }

        public Criteria andMpBillstatusGreaterThan(Integer value) {
            addCriterion("mp_billstatus >", value, "mpBillstatus");
            return (Criteria) this;
        }

        public Criteria andMpBillstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("mp_billstatus >=", value, "mpBillstatus");
            return (Criteria) this;
        }

        public Criteria andMpBillstatusLessThan(Integer value) {
            addCriterion("mp_billstatus <", value, "mpBillstatus");
            return (Criteria) this;
        }

        public Criteria andMpBillstatusLessThanOrEqualTo(Integer value) {
            addCriterion("mp_billstatus <=", value, "mpBillstatus");
            return (Criteria) this;
        }

        public Criteria andMpBillstatusIn(List<Integer> values) {
            addCriterion("mp_billstatus in", values, "mpBillstatus");
            return (Criteria) this;
        }

        public Criteria andMpBillstatusNotIn(List<Integer> values) {
            addCriterion("mp_billstatus not in", values, "mpBillstatus");
            return (Criteria) this;
        }

        public Criteria andMpBillstatusBetween(Integer value1, Integer value2) {
            addCriterion("mp_billstatus between", value1, value2, "mpBillstatus");
            return (Criteria) this;
        }

        public Criteria andMpBillstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("mp_billstatus not between", value1, value2, "mpBillstatus");
            return (Criteria) this;
        }

        public Criteria andMpItemremarkIsNull() {
            addCriterion("mp_itemremark is null");
            return (Criteria) this;
        }

        public Criteria andMpItemremarkIsNotNull() {
            addCriterion("mp_itemremark is not null");
            return (Criteria) this;
        }

        public Criteria andMpItemremarkEqualTo(String value) {
            addCriterion("mp_itemremark =", value, "mpItemremark");
            return (Criteria) this;
        }

        public Criteria andMpItemremarkNotEqualTo(String value) {
            addCriterion("mp_itemremark <>", value, "mpItemremark");
            return (Criteria) this;
        }

        public Criteria andMpItemremarkGreaterThan(String value) {
            addCriterion("mp_itemremark >", value, "mpItemremark");
            return (Criteria) this;
        }

        public Criteria andMpItemremarkGreaterThanOrEqualTo(String value) {
            addCriterion("mp_itemremark >=", value, "mpItemremark");
            return (Criteria) this;
        }

        public Criteria andMpItemremarkLessThan(String value) {
            addCriterion("mp_itemremark <", value, "mpItemremark");
            return (Criteria) this;
        }

        public Criteria andMpItemremarkLessThanOrEqualTo(String value) {
            addCriterion("mp_itemremark <=", value, "mpItemremark");
            return (Criteria) this;
        }

        public Criteria andMpItemremarkLike(String value) {
            addCriterion("mp_itemremark like", value, "mpItemremark");
            return (Criteria) this;
        }

        public Criteria andMpItemremarkNotLike(String value) {
            addCriterion("mp_itemremark not like", value, "mpItemremark");
            return (Criteria) this;
        }

        public Criteria andMpItemremarkIn(List<String> values) {
            addCriterion("mp_itemremark in", values, "mpItemremark");
            return (Criteria) this;
        }

        public Criteria andMpItemremarkNotIn(List<String> values) {
            addCriterion("mp_itemremark not in", values, "mpItemremark");
            return (Criteria) this;
        }

        public Criteria andMpItemremarkBetween(String value1, String value2) {
            addCriterion("mp_itemremark between", value1, value2, "mpItemremark");
            return (Criteria) this;
        }

        public Criteria andMpItemremarkNotBetween(String value1, String value2) {
            addCriterion("mp_itemremark not between", value1, value2, "mpItemremark");
            return (Criteria) this;
        }

        public Criteria andMpSumcurqtyIsNull() {
            addCriterion("mp_sumcurqty is null");
            return (Criteria) this;
        }

        public Criteria andMpSumcurqtyIsNotNull() {
            addCriterion("mp_sumcurqty is not null");
            return (Criteria) this;
        }

        public Criteria andMpSumcurqtyEqualTo(String value) {
            addCriterion("mp_sumcurqty =", value, "mpSumcurqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcurqtyNotEqualTo(String value) {
            addCriterion("mp_sumcurqty <>", value, "mpSumcurqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcurqtyGreaterThan(String value) {
            addCriterion("mp_sumcurqty >", value, "mpSumcurqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcurqtyGreaterThanOrEqualTo(String value) {
            addCriterion("mp_sumcurqty >=", value, "mpSumcurqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcurqtyLessThan(String value) {
            addCriterion("mp_sumcurqty <", value, "mpSumcurqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcurqtyLessThanOrEqualTo(String value) {
            addCriterion("mp_sumcurqty <=", value, "mpSumcurqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcurqtyLike(String value) {
            addCriterion("mp_sumcurqty like", value, "mpSumcurqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcurqtyNotLike(String value) {
            addCriterion("mp_sumcurqty not like", value, "mpSumcurqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcurqtyIn(List<String> values) {
            addCriterion("mp_sumcurqty in", values, "mpSumcurqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcurqtyNotIn(List<String> values) {
            addCriterion("mp_sumcurqty not in", values, "mpSumcurqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcurqtyBetween(String value1, String value2) {
            addCriterion("mp_sumcurqty between", value1, value2, "mpSumcurqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcurqtyNotBetween(String value1, String value2) {
            addCriterion("mp_sumcurqty not between", value1, value2, "mpSumcurqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcheckqtyIsNull() {
            addCriterion("mp_sumcheckqty is null");
            return (Criteria) this;
        }

        public Criteria andMpSumcheckqtyIsNotNull() {
            addCriterion("mp_sumcheckqty is not null");
            return (Criteria) this;
        }

        public Criteria andMpSumcheckqtyEqualTo(String value) {
            addCriterion("mp_sumcheckqty =", value, "mpSumcheckqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcheckqtyNotEqualTo(String value) {
            addCriterion("mp_sumcheckqty <>", value, "mpSumcheckqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcheckqtyGreaterThan(String value) {
            addCriterion("mp_sumcheckqty >", value, "mpSumcheckqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcheckqtyGreaterThanOrEqualTo(String value) {
            addCriterion("mp_sumcheckqty >=", value, "mpSumcheckqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcheckqtyLessThan(String value) {
            addCriterion("mp_sumcheckqty <", value, "mpSumcheckqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcheckqtyLessThanOrEqualTo(String value) {
            addCriterion("mp_sumcheckqty <=", value, "mpSumcheckqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcheckqtyLike(String value) {
            addCriterion("mp_sumcheckqty like", value, "mpSumcheckqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcheckqtyNotLike(String value) {
            addCriterion("mp_sumcheckqty not like", value, "mpSumcheckqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcheckqtyIn(List<String> values) {
            addCriterion("mp_sumcheckqty in", values, "mpSumcheckqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcheckqtyNotIn(List<String> values) {
            addCriterion("mp_sumcheckqty not in", values, "mpSumcheckqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcheckqtyBetween(String value1, String value2) {
            addCriterion("mp_sumcheckqty between", value1, value2, "mpSumcheckqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcheckqtyNotBetween(String value1, String value2) {
            addCriterion("mp_sumcheckqty not between", value1, value2, "mpSumcheckqty");
            return (Criteria) this;
        }

        public Criteria andMpSumqtyIsNull() {
            addCriterion("mp_sumqty is null");
            return (Criteria) this;
        }

        public Criteria andMpSumqtyIsNotNull() {
            addCriterion("mp_sumqty is not null");
            return (Criteria) this;
        }

        public Criteria andMpSumqtyEqualTo(String value) {
            addCriterion("mp_sumqty =", value, "mpSumqty");
            return (Criteria) this;
        }

        public Criteria andMpSumqtyNotEqualTo(String value) {
            addCriterion("mp_sumqty <>", value, "mpSumqty");
            return (Criteria) this;
        }

        public Criteria andMpSumqtyGreaterThan(String value) {
            addCriterion("mp_sumqty >", value, "mpSumqty");
            return (Criteria) this;
        }

        public Criteria andMpSumqtyGreaterThanOrEqualTo(String value) {
            addCriterion("mp_sumqty >=", value, "mpSumqty");
            return (Criteria) this;
        }

        public Criteria andMpSumqtyLessThan(String value) {
            addCriterion("mp_sumqty <", value, "mpSumqty");
            return (Criteria) this;
        }

        public Criteria andMpSumqtyLessThanOrEqualTo(String value) {
            addCriterion("mp_sumqty <=", value, "mpSumqty");
            return (Criteria) this;
        }

        public Criteria andMpSumqtyLike(String value) {
            addCriterion("mp_sumqty like", value, "mpSumqty");
            return (Criteria) this;
        }

        public Criteria andMpSumqtyNotLike(String value) {
            addCriterion("mp_sumqty not like", value, "mpSumqty");
            return (Criteria) this;
        }

        public Criteria andMpSumqtyIn(List<String> values) {
            addCriterion("mp_sumqty in", values, "mpSumqty");
            return (Criteria) this;
        }

        public Criteria andMpSumqtyNotIn(List<String> values) {
            addCriterion("mp_sumqty not in", values, "mpSumqty");
            return (Criteria) this;
        }

        public Criteria andMpSumqtyBetween(String value1, String value2) {
            addCriterion("mp_sumqty between", value1, value2, "mpSumqty");
            return (Criteria) this;
        }

        public Criteria andMpSumqtyNotBetween(String value1, String value2) {
            addCriterion("mp_sumqty not between", value1, value2, "mpSumqty");
            return (Criteria) this;
        }

        public Criteria andMpSumcostIsNull() {
            addCriterion("mp_sumcost is null");
            return (Criteria) this;
        }

        public Criteria andMpSumcostIsNotNull() {
            addCriterion("mp_sumcost is not null");
            return (Criteria) this;
        }

        public Criteria andMpSumcostEqualTo(Double value) {
            addCriterion("mp_sumcost =", value, "mpSumcost");
            return (Criteria) this;
        }

        public Criteria andMpSumcostNotEqualTo(Double value) {
            addCriterion("mp_sumcost <>", value, "mpSumcost");
            return (Criteria) this;
        }

        public Criteria andMpSumcostGreaterThan(Double value) {
            addCriterion("mp_sumcost >", value, "mpSumcost");
            return (Criteria) this;
        }

        public Criteria andMpSumcostGreaterThanOrEqualTo(Double value) {
            addCriterion("mp_sumcost >=", value, "mpSumcost");
            return (Criteria) this;
        }

        public Criteria andMpSumcostLessThan(Double value) {
            addCriterion("mp_sumcost <", value, "mpSumcost");
            return (Criteria) this;
        }

        public Criteria andMpSumcostLessThanOrEqualTo(Double value) {
            addCriterion("mp_sumcost <=", value, "mpSumcost");
            return (Criteria) this;
        }

        public Criteria andMpSumcostIn(List<Double> values) {
            addCriterion("mp_sumcost in", values, "mpSumcost");
            return (Criteria) this;
        }

        public Criteria andMpSumcostNotIn(List<Double> values) {
            addCriterion("mp_sumcost not in", values, "mpSumcost");
            return (Criteria) this;
        }

        public Criteria andMpSumcostBetween(Double value1, Double value2) {
            addCriterion("mp_sumcost between", value1, value2, "mpSumcost");
            return (Criteria) this;
        }

        public Criteria andMpSumcostNotBetween(Double value1, Double value2) {
            addCriterion("mp_sumcost not between", value1, value2, "mpSumcost");
            return (Criteria) this;
        }

        public Criteria andMpUdef1IsNull() {
            addCriterion("mp_udef1 is null");
            return (Criteria) this;
        }

        public Criteria andMpUdef1IsNotNull() {
            addCriterion("mp_udef1 is not null");
            return (Criteria) this;
        }

        public Criteria andMpUdef1EqualTo(String value) {
            addCriterion("mp_udef1 =", value, "mpUdef1");
            return (Criteria) this;
        }

        public Criteria andMpUdef1NotEqualTo(String value) {
            addCriterion("mp_udef1 <>", value, "mpUdef1");
            return (Criteria) this;
        }

        public Criteria andMpUdef1GreaterThan(String value) {
            addCriterion("mp_udef1 >", value, "mpUdef1");
            return (Criteria) this;
        }

        public Criteria andMpUdef1GreaterThanOrEqualTo(String value) {
            addCriterion("mp_udef1 >=", value, "mpUdef1");
            return (Criteria) this;
        }

        public Criteria andMpUdef1LessThan(String value) {
            addCriterion("mp_udef1 <", value, "mpUdef1");
            return (Criteria) this;
        }

        public Criteria andMpUdef1LessThanOrEqualTo(String value) {
            addCriterion("mp_udef1 <=", value, "mpUdef1");
            return (Criteria) this;
        }

        public Criteria andMpUdef1Like(String value) {
            addCriterion("mp_udef1 like", value, "mpUdef1");
            return (Criteria) this;
        }

        public Criteria andMpUdef1NotLike(String value) {
            addCriterion("mp_udef1 not like", value, "mpUdef1");
            return (Criteria) this;
        }

        public Criteria andMpUdef1In(List<String> values) {
            addCriterion("mp_udef1 in", values, "mpUdef1");
            return (Criteria) this;
        }

        public Criteria andMpUdef1NotIn(List<String> values) {
            addCriterion("mp_udef1 not in", values, "mpUdef1");
            return (Criteria) this;
        }

        public Criteria andMpUdef1Between(String value1, String value2) {
            addCriterion("mp_udef1 between", value1, value2, "mpUdef1");
            return (Criteria) this;
        }

        public Criteria andMpUdef1NotBetween(String value1, String value2) {
            addCriterion("mp_udef1 not between", value1, value2, "mpUdef1");
            return (Criteria) this;
        }

        public Criteria andMpUdef2IsNull() {
            addCriterion("mp_udef2 is null");
            return (Criteria) this;
        }

        public Criteria andMpUdef2IsNotNull() {
            addCriterion("mp_udef2 is not null");
            return (Criteria) this;
        }

        public Criteria andMpUdef2EqualTo(String value) {
            addCriterion("mp_udef2 =", value, "mpUdef2");
            return (Criteria) this;
        }

        public Criteria andMpUdef2NotEqualTo(String value) {
            addCriterion("mp_udef2 <>", value, "mpUdef2");
            return (Criteria) this;
        }

        public Criteria andMpUdef2GreaterThan(String value) {
            addCriterion("mp_udef2 >", value, "mpUdef2");
            return (Criteria) this;
        }

        public Criteria andMpUdef2GreaterThanOrEqualTo(String value) {
            addCriterion("mp_udef2 >=", value, "mpUdef2");
            return (Criteria) this;
        }

        public Criteria andMpUdef2LessThan(String value) {
            addCriterion("mp_udef2 <", value, "mpUdef2");
            return (Criteria) this;
        }

        public Criteria andMpUdef2LessThanOrEqualTo(String value) {
            addCriterion("mp_udef2 <=", value, "mpUdef2");
            return (Criteria) this;
        }

        public Criteria andMpUdef2Like(String value) {
            addCriterion("mp_udef2 like", value, "mpUdef2");
            return (Criteria) this;
        }

        public Criteria andMpUdef2NotLike(String value) {
            addCriterion("mp_udef2 not like", value, "mpUdef2");
            return (Criteria) this;
        }

        public Criteria andMpUdef2In(List<String> values) {
            addCriterion("mp_udef2 in", values, "mpUdef2");
            return (Criteria) this;
        }

        public Criteria andMpUdef2NotIn(List<String> values) {
            addCriterion("mp_udef2 not in", values, "mpUdef2");
            return (Criteria) this;
        }

        public Criteria andMpUdef2Between(String value1, String value2) {
            addCriterion("mp_udef2 between", value1, value2, "mpUdef2");
            return (Criteria) this;
        }

        public Criteria andMpUdef2NotBetween(String value1, String value2) {
            addCriterion("mp_udef2 not between", value1, value2, "mpUdef2");
            return (Criteria) this;
        }

        public Criteria andMpRemarkIsNull() {
            addCriterion("mp_remark is null");
            return (Criteria) this;
        }

        public Criteria andMpRemarkIsNotNull() {
            addCriterion("mp_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMpRemarkEqualTo(String value) {
            addCriterion("mp_remark =", value, "mpRemark");
            return (Criteria) this;
        }

        public Criteria andMpRemarkNotEqualTo(String value) {
            addCriterion("mp_remark <>", value, "mpRemark");
            return (Criteria) this;
        }

        public Criteria andMpRemarkGreaterThan(String value) {
            addCriterion("mp_remark >", value, "mpRemark");
            return (Criteria) this;
        }

        public Criteria andMpRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("mp_remark >=", value, "mpRemark");
            return (Criteria) this;
        }

        public Criteria andMpRemarkLessThan(String value) {
            addCriterion("mp_remark <", value, "mpRemark");
            return (Criteria) this;
        }

        public Criteria andMpRemarkLessThanOrEqualTo(String value) {
            addCriterion("mp_remark <=", value, "mpRemark");
            return (Criteria) this;
        }

        public Criteria andMpRemarkLike(String value) {
            addCriterion("mp_remark like", value, "mpRemark");
            return (Criteria) this;
        }

        public Criteria andMpRemarkNotLike(String value) {
            addCriterion("mp_remark not like", value, "mpRemark");
            return (Criteria) this;
        }

        public Criteria andMpRemarkIn(List<String> values) {
            addCriterion("mp_remark in", values, "mpRemark");
            return (Criteria) this;
        }

        public Criteria andMpRemarkNotIn(List<String> values) {
            addCriterion("mp_remark not in", values, "mpRemark");
            return (Criteria) this;
        }

        public Criteria andMpRemarkBetween(String value1, String value2) {
            addCriterion("mp_remark between", value1, value2, "mpRemark");
            return (Criteria) this;
        }

        public Criteria andMpRemarkNotBetween(String value1, String value2) {
            addCriterion("mp_remark not between", value1, value2, "mpRemark");
            return (Criteria) this;
        }

        public Criteria andBy1IsNull() {
            addCriterion("by1 is null");
            return (Criteria) this;
        }

        public Criteria andBy1IsNotNull() {
            addCriterion("by1 is not null");
            return (Criteria) this;
        }

        public Criteria andBy1EqualTo(String value) {
            addCriterion("by1 =", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotEqualTo(String value) {
            addCriterion("by1 <>", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1GreaterThan(String value) {
            addCriterion("by1 >", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1GreaterThanOrEqualTo(String value) {
            addCriterion("by1 >=", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1LessThan(String value) {
            addCriterion("by1 <", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1LessThanOrEqualTo(String value) {
            addCriterion("by1 <=", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1Like(String value) {
            addCriterion("by1 like", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotLike(String value) {
            addCriterion("by1 not like", value, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1In(List<String> values) {
            addCriterion("by1 in", values, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotIn(List<String> values) {
            addCriterion("by1 not in", values, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1Between(String value1, String value2) {
            addCriterion("by1 between", value1, value2, "by1");
            return (Criteria) this;
        }

        public Criteria andBy1NotBetween(String value1, String value2) {
            addCriterion("by1 not between", value1, value2, "by1");
            return (Criteria) this;
        }

        public Criteria andBy2IsNull() {
            addCriterion("by2 is null");
            return (Criteria) this;
        }

        public Criteria andBy2IsNotNull() {
            addCriterion("by2 is not null");
            return (Criteria) this;
        }

        public Criteria andBy2EqualTo(String value) {
            addCriterion("by2 =", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotEqualTo(String value) {
            addCriterion("by2 <>", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2GreaterThan(String value) {
            addCriterion("by2 >", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2GreaterThanOrEqualTo(String value) {
            addCriterion("by2 >=", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2LessThan(String value) {
            addCriterion("by2 <", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2LessThanOrEqualTo(String value) {
            addCriterion("by2 <=", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2Like(String value) {
            addCriterion("by2 like", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotLike(String value) {
            addCriterion("by2 not like", value, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2In(List<String> values) {
            addCriterion("by2 in", values, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotIn(List<String> values) {
            addCriterion("by2 not in", values, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2Between(String value1, String value2) {
            addCriterion("by2 between", value1, value2, "by2");
            return (Criteria) this;
        }

        public Criteria andBy2NotBetween(String value1, String value2) {
            addCriterion("by2 not between", value1, value2, "by2");
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