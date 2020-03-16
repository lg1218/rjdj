package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class SalesReturnWarehouseDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesReturnWarehouseDetailedExample() {
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

        public Criteria andZiidIsNull() {
            addCriterion("ziid is null");
            return (Criteria) this;
        }

        public Criteria andZiidIsNotNull() {
            addCriterion("ziid is not null");
            return (Criteria) this;
        }

        public Criteria andZiidEqualTo(String value) {
            addCriterion("ziid =", value, "ziid");
            return (Criteria) this;
        }

        public Criteria andZiidNotEqualTo(String value) {
            addCriterion("ziid <>", value, "ziid");
            return (Criteria) this;
        }

        public Criteria andZiidGreaterThan(String value) {
            addCriterion("ziid >", value, "ziid");
            return (Criteria) this;
        }

        public Criteria andZiidGreaterThanOrEqualTo(String value) {
            addCriterion("ziid >=", value, "ziid");
            return (Criteria) this;
        }

        public Criteria andZiidLessThan(String value) {
            addCriterion("ziid <", value, "ziid");
            return (Criteria) this;
        }

        public Criteria andZiidLessThanOrEqualTo(String value) {
            addCriterion("ziid <=", value, "ziid");
            return (Criteria) this;
        }

        public Criteria andZiidLike(String value) {
            addCriterion("ziid like", value, "ziid");
            return (Criteria) this;
        }

        public Criteria andZiidNotLike(String value) {
            addCriterion("ziid not like", value, "ziid");
            return (Criteria) this;
        }

        public Criteria andZiidIn(List<String> values) {
            addCriterion("ziid in", values, "ziid");
            return (Criteria) this;
        }

        public Criteria andZiidNotIn(List<String> values) {
            addCriterion("ziid not in", values, "ziid");
            return (Criteria) this;
        }

        public Criteria andZiidBetween(String value1, String value2) {
            addCriterion("ziid between", value1, value2, "ziid");
            return (Criteria) this;
        }

        public Criteria andZiidNotBetween(String value1, String value2) {
            addCriterion("ziid not between", value1, value2, "ziid");
            return (Criteria) this;
        }

        public Criteria andZuidIsNull() {
            addCriterion("zuid is null");
            return (Criteria) this;
        }

        public Criteria andZuidIsNotNull() {
            addCriterion("zuid is not null");
            return (Criteria) this;
        }

        public Criteria andZuidEqualTo(String value) {
            addCriterion("zuid =", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidNotEqualTo(String value) {
            addCriterion("zuid <>", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidGreaterThan(String value) {
            addCriterion("zuid >", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidGreaterThanOrEqualTo(String value) {
            addCriterion("zuid >=", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidLessThan(String value) {
            addCriterion("zuid <", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidLessThanOrEqualTo(String value) {
            addCriterion("zuid <=", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidLike(String value) {
            addCriterion("zuid like", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidNotLike(String value) {
            addCriterion("zuid not like", value, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidIn(List<String> values) {
            addCriterion("zuid in", values, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidNotIn(List<String> values) {
            addCriterion("zuid not in", values, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidBetween(String value1, String value2) {
            addCriterion("zuid between", value1, value2, "zuid");
            return (Criteria) this;
        }

        public Criteria andZuidNotBetween(String value1, String value2) {
            addCriterion("zuid not between", value1, value2, "zuid");
            return (Criteria) this;
        }

        public Criteria andMatterIdIsNull() {
            addCriterion("matter_id is null");
            return (Criteria) this;
        }

        public Criteria andMatterIdIsNotNull() {
            addCriterion("matter_id is not null");
            return (Criteria) this;
        }

        public Criteria andMatterIdEqualTo(String value) {
            addCriterion("matter_id =", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotEqualTo(String value) {
            addCriterion("matter_id <>", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdGreaterThan(String value) {
            addCriterion("matter_id >", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdGreaterThanOrEqualTo(String value) {
            addCriterion("matter_id >=", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLessThan(String value) {
            addCriterion("matter_id <", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLessThanOrEqualTo(String value) {
            addCriterion("matter_id <=", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLike(String value) {
            addCriterion("matter_id like", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotLike(String value) {
            addCriterion("matter_id not like", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdIn(List<String> values) {
            addCriterion("matter_id in", values, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotIn(List<String> values) {
            addCriterion("matter_id not in", values, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdBetween(String value1, String value2) {
            addCriterion("matter_id between", value1, value2, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotBetween(String value1, String value2) {
            addCriterion("matter_id not between", value1, value2, "matterId");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNull() {
            addCriterion("engname is null");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNotNull() {
            addCriterion("engname is not null");
            return (Criteria) this;
        }

        public Criteria andEngnameEqualTo(String value) {
            addCriterion("engname =", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotEqualTo(String value) {
            addCriterion("engname <>", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThan(String value) {
            addCriterion("engname >", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("engname >=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThan(String value) {
            addCriterion("engname <", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThanOrEqualTo(String value) {
            addCriterion("engname <=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLike(String value) {
            addCriterion("engname like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotLike(String value) {
            addCriterion("engname not like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameIn(List<String> values) {
            addCriterion("engname in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotIn(List<String> values) {
            addCriterion("engname not in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameBetween(String value1, String value2) {
            addCriterion("engname between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotBetween(String value1, String value2) {
            addCriterion("engname not between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIncludeTaxIsNull() {
            addCriterion("include_tax is null");
            return (Criteria) this;
        }

        public Criteria andIncludeTaxIsNotNull() {
            addCriterion("include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeTaxEqualTo(String value) {
            addCriterion("include_tax =", value, "includeTax");
            return (Criteria) this;
        }

        public Criteria andIncludeTaxNotEqualTo(String value) {
            addCriterion("include_tax <>", value, "includeTax");
            return (Criteria) this;
        }

        public Criteria andIncludeTaxGreaterThan(String value) {
            addCriterion("include_tax >", value, "includeTax");
            return (Criteria) this;
        }

        public Criteria andIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("include_tax >=", value, "includeTax");
            return (Criteria) this;
        }

        public Criteria andIncludeTaxLessThan(String value) {
            addCriterion("include_tax <", value, "includeTax");
            return (Criteria) this;
        }

        public Criteria andIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("include_tax <=", value, "includeTax");
            return (Criteria) this;
        }

        public Criteria andIncludeTaxLike(String value) {
            addCriterion("include_tax like", value, "includeTax");
            return (Criteria) this;
        }

        public Criteria andIncludeTaxNotLike(String value) {
            addCriterion("include_tax not like", value, "includeTax");
            return (Criteria) this;
        }

        public Criteria andIncludeTaxIn(List<String> values) {
            addCriterion("include_tax in", values, "includeTax");
            return (Criteria) this;
        }

        public Criteria andIncludeTaxNotIn(List<String> values) {
            addCriterion("include_tax not in", values, "includeTax");
            return (Criteria) this;
        }

        public Criteria andIncludeTaxBetween(String value1, String value2) {
            addCriterion("include_tax between", value1, value2, "includeTax");
            return (Criteria) this;
        }

        public Criteria andIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("include_tax not between", value1, value2, "includeTax");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Double value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Double value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Double value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Double value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Double value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Double value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Double> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Double> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Double value1, Double value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Double value1, Double value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andZqunitpriceIsNull() {
            addCriterion("zqUnitPrice is null");
            return (Criteria) this;
        }

        public Criteria andZqunitpriceIsNotNull() {
            addCriterion("zqUnitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andZqunitpriceEqualTo(Double value) {
            addCriterion("zqUnitPrice =", value, "zqunitprice");
            return (Criteria) this;
        }

        public Criteria andZqunitpriceNotEqualTo(Double value) {
            addCriterion("zqUnitPrice <>", value, "zqunitprice");
            return (Criteria) this;
        }

        public Criteria andZqunitpriceGreaterThan(Double value) {
            addCriterion("zqUnitPrice >", value, "zqunitprice");
            return (Criteria) this;
        }

        public Criteria andZqunitpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("zqUnitPrice >=", value, "zqunitprice");
            return (Criteria) this;
        }

        public Criteria andZqunitpriceLessThan(Double value) {
            addCriterion("zqUnitPrice <", value, "zqunitprice");
            return (Criteria) this;
        }

        public Criteria andZqunitpriceLessThanOrEqualTo(Double value) {
            addCriterion("zqUnitPrice <=", value, "zqunitprice");
            return (Criteria) this;
        }

        public Criteria andZqunitpriceIn(List<Double> values) {
            addCriterion("zqUnitPrice in", values, "zqunitprice");
            return (Criteria) this;
        }

        public Criteria andZqunitpriceNotIn(List<Double> values) {
            addCriterion("zqUnitPrice not in", values, "zqunitprice");
            return (Criteria) this;
        }

        public Criteria andZqunitpriceBetween(Double value1, Double value2) {
            addCriterion("zqUnitPrice between", value1, value2, "zqunitprice");
            return (Criteria) this;
        }

        public Criteria andZqunitpriceNotBetween(Double value1, Double value2) {
            addCriterion("zqUnitPrice not between", value1, value2, "zqunitprice");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("Discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("Discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("Discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("Discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("Discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("Discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("Discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("Discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("Discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("Discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("Discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("Discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNull() {
            addCriterion("UnitPrice is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNotNull() {
            addCriterion("UnitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceEqualTo(Double value) {
            addCriterion("UnitPrice =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(Double value) {
            addCriterion("UnitPrice <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(Double value) {
            addCriterion("UnitPrice >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("UnitPrice >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(Double value) {
            addCriterion("UnitPrice <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(Double value) {
            addCriterion("UnitPrice <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<Double> values) {
            addCriterion("UnitPrice in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<Double> values) {
            addCriterion("UnitPrice not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(Double value1, Double value2) {
            addCriterion("UnitPrice between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(Double value1, Double value2) {
            addCriterion("UnitPrice not between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceIsNull() {
            addCriterion("Sqd_Price is null");
            return (Criteria) this;
        }

        public Criteria andSqdPriceIsNotNull() {
            addCriterion("Sqd_Price is not null");
            return (Criteria) this;
        }

        public Criteria andSqdPriceEqualTo(Double value) {
            addCriterion("Sqd_Price =", value, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceNotEqualTo(Double value) {
            addCriterion("Sqd_Price <>", value, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceGreaterThan(Double value) {
            addCriterion("Sqd_Price >", value, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Sqd_Price >=", value, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceLessThan(Double value) {
            addCriterion("Sqd_Price <", value, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceLessThanOrEqualTo(Double value) {
            addCriterion("Sqd_Price <=", value, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceIn(List<Double> values) {
            addCriterion("Sqd_Price in", values, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceNotIn(List<Double> values) {
            addCriterion("Sqd_Price not in", values, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceBetween(Double value1, Double value2) {
            addCriterion("Sqd_Price between", value1, value2, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andSqdPriceNotBetween(Double value1, Double value2) {
            addCriterion("Sqd_Price not between", value1, value2, "sqdPrice");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNull() {
            addCriterion("TaxRate is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("TaxRate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(Float value) {
            addCriterion("TaxRate =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(Float value) {
            addCriterion("TaxRate <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(Float value) {
            addCriterion("TaxRate >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(Float value) {
            addCriterion("TaxRate >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(Float value) {
            addCriterion("TaxRate <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(Float value) {
            addCriterion("TaxRate <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<Float> values) {
            addCriterion("TaxRate in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<Float> values) {
            addCriterion("TaxRate not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(Float value1, Float value2) {
            addCriterion("TaxRate between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(Float value1, Float value2) {
            addCriterion("TaxRate not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxlimitIsNull() {
            addCriterion("Taxlimit is null");
            return (Criteria) this;
        }

        public Criteria andTaxlimitIsNotNull() {
            addCriterion("Taxlimit is not null");
            return (Criteria) this;
        }

        public Criteria andTaxlimitEqualTo(Double value) {
            addCriterion("Taxlimit =", value, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitNotEqualTo(Double value) {
            addCriterion("Taxlimit <>", value, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitGreaterThan(Double value) {
            addCriterion("Taxlimit >", value, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitGreaterThanOrEqualTo(Double value) {
            addCriterion("Taxlimit >=", value, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitLessThan(Double value) {
            addCriterion("Taxlimit <", value, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitLessThanOrEqualTo(Double value) {
            addCriterion("Taxlimit <=", value, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitIn(List<Double> values) {
            addCriterion("Taxlimit in", values, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitNotIn(List<Double> values) {
            addCriterion("Taxlimit not in", values, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitBetween(Double value1, Double value2) {
            addCriterion("Taxlimit between", value1, value2, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxlimitNotBetween(Double value1, Double value2) {
            addCriterion("Taxlimit not between", value1, value2, "taxlimit");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceIsNull() {
            addCriterion("TaxInclusivePrice is null");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceIsNotNull() {
            addCriterion("TaxInclusivePrice is not null");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceEqualTo(Double value) {
            addCriterion("TaxInclusivePrice =", value, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceNotEqualTo(Double value) {
            addCriterion("TaxInclusivePrice <>", value, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceGreaterThan(Double value) {
            addCriterion("TaxInclusivePrice >", value, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("TaxInclusivePrice >=", value, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceLessThan(Double value) {
            addCriterion("TaxInclusivePrice <", value, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceLessThanOrEqualTo(Double value) {
            addCriterion("TaxInclusivePrice <=", value, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceIn(List<Double> values) {
            addCriterion("TaxInclusivePrice in", values, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceNotIn(List<Double> values) {
            addCriterion("TaxInclusivePrice not in", values, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceBetween(Double value1, Double value2) {
            addCriterion("TaxInclusivePrice between", value1, value2, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andTaxinclusivepriceNotBetween(Double value1, Double value2) {
            addCriterion("TaxInclusivePrice not between", value1, value2, "taxinclusiveprice");
            return (Criteria) this;
        }

        public Criteria andComplimentartIsNull() {
            addCriterion("Complimentart is null");
            return (Criteria) this;
        }

        public Criteria andComplimentartIsNotNull() {
            addCriterion("Complimentart is not null");
            return (Criteria) this;
        }

        public Criteria andComplimentartEqualTo(Integer value) {
            addCriterion("Complimentart =", value, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartNotEqualTo(Integer value) {
            addCriterion("Complimentart <>", value, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartGreaterThan(Integer value) {
            addCriterion("Complimentart >", value, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartGreaterThanOrEqualTo(Integer value) {
            addCriterion("Complimentart >=", value, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartLessThan(Integer value) {
            addCriterion("Complimentart <", value, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartLessThanOrEqualTo(Integer value) {
            addCriterion("Complimentart <=", value, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartIn(List<Integer> values) {
            addCriterion("Complimentart in", values, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartNotIn(List<Integer> values) {
            addCriterion("Complimentart not in", values, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartBetween(Integer value1, Integer value2) {
            addCriterion("Complimentart between", value1, value2, "complimentart");
            return (Criteria) this;
        }

        public Criteria andComplimentartNotBetween(Integer value1, Integer value2) {
            addCriterion("Complimentart not between", value1, value2, "complimentart");
            return (Criteria) this;
        }

        public Criteria andItemremarkIsNull() {
            addCriterion("ItemRemark is null");
            return (Criteria) this;
        }

        public Criteria andItemremarkIsNotNull() {
            addCriterion("ItemRemark is not null");
            return (Criteria) this;
        }

        public Criteria andItemremarkEqualTo(String value) {
            addCriterion("ItemRemark =", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkNotEqualTo(String value) {
            addCriterion("ItemRemark <>", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkGreaterThan(String value) {
            addCriterion("ItemRemark >", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkGreaterThanOrEqualTo(String value) {
            addCriterion("ItemRemark >=", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkLessThan(String value) {
            addCriterion("ItemRemark <", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkLessThanOrEqualTo(String value) {
            addCriterion("ItemRemark <=", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkLike(String value) {
            addCriterion("ItemRemark like", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkNotLike(String value) {
            addCriterion("ItemRemark not like", value, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkIn(List<String> values) {
            addCriterion("ItemRemark in", values, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkNotIn(List<String> values) {
            addCriterion("ItemRemark not in", values, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkBetween(String value1, String value2) {
            addCriterion("ItemRemark between", value1, value2, "itemremark");
            return (Criteria) this;
        }

        public Criteria andItemremarkNotBetween(String value1, String value2) {
            addCriterion("ItemRemark not between", value1, value2, "itemremark");
            return (Criteria) this;
        }

        public Criteria andAuditingIsNull() {
            addCriterion("auditing is null");
            return (Criteria) this;
        }

        public Criteria andAuditingIsNotNull() {
            addCriterion("auditing is not null");
            return (Criteria) this;
        }

        public Criteria andAuditingEqualTo(Integer value) {
            addCriterion("auditing =", value, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingNotEqualTo(Integer value) {
            addCriterion("auditing <>", value, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingGreaterThan(Integer value) {
            addCriterion("auditing >", value, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditing >=", value, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingLessThan(Integer value) {
            addCriterion("auditing <", value, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingLessThanOrEqualTo(Integer value) {
            addCriterion("auditing <=", value, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingIn(List<Integer> values) {
            addCriterion("auditing in", values, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingNotIn(List<Integer> values) {
            addCriterion("auditing not in", values, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingBetween(Integer value1, Integer value2) {
            addCriterion("auditing between", value1, value2, "auditing");
            return (Criteria) this;
        }

        public Criteria andAuditingNotBetween(Integer value1, Integer value2) {
            addCriterion("auditing not between", value1, value2, "auditing");
            return (Criteria) this;
        }

        public Criteria andDeletIsNull() {
            addCriterion("delet is null");
            return (Criteria) this;
        }

        public Criteria andDeletIsNotNull() {
            addCriterion("delet is not null");
            return (Criteria) this;
        }

        public Criteria andDeletEqualTo(Integer value) {
            addCriterion("delet =", value, "delet");
            return (Criteria) this;
        }

        public Criteria andDeletNotEqualTo(Integer value) {
            addCriterion("delet <>", value, "delet");
            return (Criteria) this;
        }

        public Criteria andDeletGreaterThan(Integer value) {
            addCriterion("delet >", value, "delet");
            return (Criteria) this;
        }

        public Criteria andDeletGreaterThanOrEqualTo(Integer value) {
            addCriterion("delet >=", value, "delet");
            return (Criteria) this;
        }

        public Criteria andDeletLessThan(Integer value) {
            addCriterion("delet <", value, "delet");
            return (Criteria) this;
        }

        public Criteria andDeletLessThanOrEqualTo(Integer value) {
            addCriterion("delet <=", value, "delet");
            return (Criteria) this;
        }

        public Criteria andDeletIn(List<Integer> values) {
            addCriterion("delet in", values, "delet");
            return (Criteria) this;
        }

        public Criteria andDeletNotIn(List<Integer> values) {
            addCriterion("delet not in", values, "delet");
            return (Criteria) this;
        }

        public Criteria andDeletBetween(Integer value1, Integer value2) {
            addCriterion("delet between", value1, value2, "delet");
            return (Criteria) this;
        }

        public Criteria andDeletNotBetween(Integer value1, Integer value2) {
            addCriterion("delet not between", value1, value2, "delet");
            return (Criteria) this;
        }

        public Criteria andSourcelistIsNull() {
            addCriterion("SourceList is null");
            return (Criteria) this;
        }

        public Criteria andSourcelistIsNotNull() {
            addCriterion("SourceList is not null");
            return (Criteria) this;
        }

        public Criteria andSourcelistEqualTo(String value) {
            addCriterion("SourceList =", value, "sourcelist");
            return (Criteria) this;
        }

        public Criteria andSourcelistNotEqualTo(String value) {
            addCriterion("SourceList <>", value, "sourcelist");
            return (Criteria) this;
        }

        public Criteria andSourcelistGreaterThan(String value) {
            addCriterion("SourceList >", value, "sourcelist");
            return (Criteria) this;
        }

        public Criteria andSourcelistGreaterThanOrEqualTo(String value) {
            addCriterion("SourceList >=", value, "sourcelist");
            return (Criteria) this;
        }

        public Criteria andSourcelistLessThan(String value) {
            addCriterion("SourceList <", value, "sourcelist");
            return (Criteria) this;
        }

        public Criteria andSourcelistLessThanOrEqualTo(String value) {
            addCriterion("SourceList <=", value, "sourcelist");
            return (Criteria) this;
        }

        public Criteria andSourcelistLike(String value) {
            addCriterion("SourceList like", value, "sourcelist");
            return (Criteria) this;
        }

        public Criteria andSourcelistNotLike(String value) {
            addCriterion("SourceList not like", value, "sourcelist");
            return (Criteria) this;
        }

        public Criteria andSourcelistIn(List<String> values) {
            addCriterion("SourceList in", values, "sourcelist");
            return (Criteria) this;
        }

        public Criteria andSourcelistNotIn(List<String> values) {
            addCriterion("SourceList not in", values, "sourcelist");
            return (Criteria) this;
        }

        public Criteria andSourcelistBetween(String value1, String value2) {
            addCriterion("SourceList between", value1, value2, "sourcelist");
            return (Criteria) this;
        }

        public Criteria andSourcelistNotBetween(String value1, String value2) {
            addCriterion("SourceList not between", value1, value2, "sourcelist");
            return (Criteria) this;
        }

        public Criteria andSourcenumberIsNull() {
            addCriterion("SourceNumber is null");
            return (Criteria) this;
        }

        public Criteria andSourcenumberIsNotNull() {
            addCriterion("SourceNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSourcenumberEqualTo(String value) {
            addCriterion("SourceNumber =", value, "sourcenumber");
            return (Criteria) this;
        }

        public Criteria andSourcenumberNotEqualTo(String value) {
            addCriterion("SourceNumber <>", value, "sourcenumber");
            return (Criteria) this;
        }

        public Criteria andSourcenumberGreaterThan(String value) {
            addCriterion("SourceNumber >", value, "sourcenumber");
            return (Criteria) this;
        }

        public Criteria andSourcenumberGreaterThanOrEqualTo(String value) {
            addCriterion("SourceNumber >=", value, "sourcenumber");
            return (Criteria) this;
        }

        public Criteria andSourcenumberLessThan(String value) {
            addCriterion("SourceNumber <", value, "sourcenumber");
            return (Criteria) this;
        }

        public Criteria andSourcenumberLessThanOrEqualTo(String value) {
            addCriterion("SourceNumber <=", value, "sourcenumber");
            return (Criteria) this;
        }

        public Criteria andSourcenumberLike(String value) {
            addCriterion("SourceNumber like", value, "sourcenumber");
            return (Criteria) this;
        }

        public Criteria andSourcenumberNotLike(String value) {
            addCriterion("SourceNumber not like", value, "sourcenumber");
            return (Criteria) this;
        }

        public Criteria andSourcenumberIn(List<String> values) {
            addCriterion("SourceNumber in", values, "sourcenumber");
            return (Criteria) this;
        }

        public Criteria andSourcenumberNotIn(List<String> values) {
            addCriterion("SourceNumber not in", values, "sourcenumber");
            return (Criteria) this;
        }

        public Criteria andSourcenumberBetween(String value1, String value2) {
            addCriterion("SourceNumber between", value1, value2, "sourcenumber");
            return (Criteria) this;
        }

        public Criteria andSourcenumberNotBetween(String value1, String value2) {
            addCriterion("SourceNumber not between", value1, value2, "sourcenumber");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumIsNull() {
            addCriterion("srwd_nomake_invoice_num is null");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumIsNotNull() {
            addCriterion("srwd_nomake_invoice_num is not null");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumEqualTo(Integer value) {
            addCriterion("srwd_nomake_invoice_num =", value, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumNotEqualTo(Integer value) {
            addCriterion("srwd_nomake_invoice_num <>", value, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumGreaterThan(Integer value) {
            addCriterion("srwd_nomake_invoice_num >", value, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("srwd_nomake_invoice_num >=", value, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumLessThan(Integer value) {
            addCriterion("srwd_nomake_invoice_num <", value, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumLessThanOrEqualTo(Integer value) {
            addCriterion("srwd_nomake_invoice_num <=", value, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumIn(List<Integer> values) {
            addCriterion("srwd_nomake_invoice_num in", values, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumNotIn(List<Integer> values) {
            addCriterion("srwd_nomake_invoice_num not in", values, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumBetween(Integer value1, Integer value2) {
            addCriterion("srwd_nomake_invoice_num between", value1, value2, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andSrwdNomakeInvoiceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("srwd_nomake_invoice_num not between", value1, value2, "srwdNomakeInvoiceNum");
            return (Criteria) this;
        }

        public Criteria andCustom3IsNull() {
            addCriterion("custom3 is null");
            return (Criteria) this;
        }

        public Criteria andCustom3IsNotNull() {
            addCriterion("custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom3EqualTo(String value) {
            addCriterion("custom3 =", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3NotEqualTo(String value) {
            addCriterion("custom3 <>", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3GreaterThan(String value) {
            addCriterion("custom3 >", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("custom3 >=", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3LessThan(String value) {
            addCriterion("custom3 <", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3LessThanOrEqualTo(String value) {
            addCriterion("custom3 <=", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3Like(String value) {
            addCriterion("custom3 like", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3NotLike(String value) {
            addCriterion("custom3 not like", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3In(List<String> values) {
            addCriterion("custom3 in", values, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3NotIn(List<String> values) {
            addCriterion("custom3 not in", values, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3Between(String value1, String value2) {
            addCriterion("custom3 between", value1, value2, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3NotBetween(String value1, String value2) {
            addCriterion("custom3 not between", value1, value2, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom4IsNull() {
            addCriterion("custom4 is null");
            return (Criteria) this;
        }

        public Criteria andCustom4IsNotNull() {
            addCriterion("custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom4EqualTo(String value) {
            addCriterion("custom4 =", value, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4NotEqualTo(String value) {
            addCriterion("custom4 <>", value, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4GreaterThan(String value) {
            addCriterion("custom4 >", value, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("custom4 >=", value, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4LessThan(String value) {
            addCriterion("custom4 <", value, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4LessThanOrEqualTo(String value) {
            addCriterion("custom4 <=", value, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4Like(String value) {
            addCriterion("custom4 like", value, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4NotLike(String value) {
            addCriterion("custom4 not like", value, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4In(List<String> values) {
            addCriterion("custom4 in", values, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4NotIn(List<String> values) {
            addCriterion("custom4 not in", values, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4Between(String value1, String value2) {
            addCriterion("custom4 between", value1, value2, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4NotBetween(String value1, String value2) {
            addCriterion("custom4 not between", value1, value2, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom5IsNull() {
            addCriterion("custom5 is null");
            return (Criteria) this;
        }

        public Criteria andCustom5IsNotNull() {
            addCriterion("custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom5EqualTo(String value) {
            addCriterion("custom5 =", value, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5NotEqualTo(String value) {
            addCriterion("custom5 <>", value, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5GreaterThan(String value) {
            addCriterion("custom5 >", value, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("custom5 >=", value, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5LessThan(String value) {
            addCriterion("custom5 <", value, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5LessThanOrEqualTo(String value) {
            addCriterion("custom5 <=", value, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5Like(String value) {
            addCriterion("custom5 like", value, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5NotLike(String value) {
            addCriterion("custom5 not like", value, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5In(List<String> values) {
            addCriterion("custom5 in", values, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5NotIn(List<String> values) {
            addCriterion("custom5 not in", values, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5Between(String value1, String value2) {
            addCriterion("custom5 between", value1, value2, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5NotBetween(String value1, String value2) {
            addCriterion("custom5 not between", value1, value2, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom6IsNull() {
            addCriterion("custom6 is null");
            return (Criteria) this;
        }

        public Criteria andCustom6IsNotNull() {
            addCriterion("custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom6EqualTo(String value) {
            addCriterion("custom6 =", value, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6NotEqualTo(String value) {
            addCriterion("custom6 <>", value, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6GreaterThan(String value) {
            addCriterion("custom6 >", value, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("custom6 >=", value, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6LessThan(String value) {
            addCriterion("custom6 <", value, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6LessThanOrEqualTo(String value) {
            addCriterion("custom6 <=", value, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6Like(String value) {
            addCriterion("custom6 like", value, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6NotLike(String value) {
            addCriterion("custom6 not like", value, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6In(List<String> values) {
            addCriterion("custom6 in", values, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6NotIn(List<String> values) {
            addCriterion("custom6 not in", values, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6Between(String value1, String value2) {
            addCriterion("custom6 between", value1, value2, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6NotBetween(String value1, String value2) {
            addCriterion("custom6 not between", value1, value2, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom1IsNull() {
            addCriterion("custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCustom1IsNotNull() {
            addCriterion("custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom1EqualTo(String value) {
            addCriterion("custom1 =", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotEqualTo(String value) {
            addCriterion("custom1 <>", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1GreaterThan(String value) {
            addCriterion("custom1 >", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("custom1 >=", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1LessThan(String value) {
            addCriterion("custom1 <", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1LessThanOrEqualTo(String value) {
            addCriterion("custom1 <=", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1Like(String value) {
            addCriterion("custom1 like", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotLike(String value) {
            addCriterion("custom1 not like", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1In(List<String> values) {
            addCriterion("custom1 in", values, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotIn(List<String> values) {
            addCriterion("custom1 not in", values, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1Between(String value1, String value2) {
            addCriterion("custom1 between", value1, value2, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotBetween(String value1, String value2) {
            addCriterion("custom1 not between", value1, value2, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom2IsNull() {
            addCriterion("custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCustom2IsNotNull() {
            addCriterion("custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom2EqualTo(String value) {
            addCriterion("custom2 =", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotEqualTo(String value) {
            addCriterion("custom2 <>", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2GreaterThan(String value) {
            addCriterion("custom2 >", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("custom2 >=", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2LessThan(String value) {
            addCriterion("custom2 <", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2LessThanOrEqualTo(String value) {
            addCriterion("custom2 <=", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2Like(String value) {
            addCriterion("custom2 like", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotLike(String value) {
            addCriterion("custom2 not like", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2In(List<String> values) {
            addCriterion("custom2 in", values, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotIn(List<String> values) {
            addCriterion("custom2 not in", values, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2Between(String value1, String value2) {
            addCriterion("custom2 between", value1, value2, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotBetween(String value1, String value2) {
            addCriterion("custom2 not between", value1, value2, "custom2");
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