package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CheckDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckDetailedExample() {
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

        public Criteria andCdIdIsNull() {
            addCriterion("cd_id is null");
            return (Criteria) this;
        }

        public Criteria andCdIdIsNotNull() {
            addCriterion("cd_id is not null");
            return (Criteria) this;
        }

        public Criteria andCdIdEqualTo(String value) {
            addCriterion("cd_id =", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdNotEqualTo(String value) {
            addCriterion("cd_id <>", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdGreaterThan(String value) {
            addCriterion("cd_id >", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdGreaterThanOrEqualTo(String value) {
            addCriterion("cd_id >=", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdLessThan(String value) {
            addCriterion("cd_id <", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdLessThanOrEqualTo(String value) {
            addCriterion("cd_id <=", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdLike(String value) {
            addCriterion("cd_id like", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdNotLike(String value) {
            addCriterion("cd_id not like", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdIn(List<String> values) {
            addCriterion("cd_id in", values, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdNotIn(List<String> values) {
            addCriterion("cd_id not in", values, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdBetween(String value1, String value2) {
            addCriterion("cd_id between", value1, value2, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdNotBetween(String value1, String value2) {
            addCriterion("cd_id not between", value1, value2, "cdId");
            return (Criteria) this;
        }

        public Criteria andProofNumberIsNull() {
            addCriterion("proof_number is null");
            return (Criteria) this;
        }

        public Criteria andProofNumberIsNotNull() {
            addCriterion("proof_number is not null");
            return (Criteria) this;
        }

        public Criteria andProofNumberEqualTo(String value) {
            addCriterion("proof_number =", value, "proofNumber");
            return (Criteria) this;
        }

        public Criteria andProofNumberNotEqualTo(String value) {
            addCriterion("proof_number <>", value, "proofNumber");
            return (Criteria) this;
        }

        public Criteria andProofNumberGreaterThan(String value) {
            addCriterion("proof_number >", value, "proofNumber");
            return (Criteria) this;
        }

        public Criteria andProofNumberGreaterThanOrEqualTo(String value) {
            addCriterion("proof_number >=", value, "proofNumber");
            return (Criteria) this;
        }

        public Criteria andProofNumberLessThan(String value) {
            addCriterion("proof_number <", value, "proofNumber");
            return (Criteria) this;
        }

        public Criteria andProofNumberLessThanOrEqualTo(String value) {
            addCriterion("proof_number <=", value, "proofNumber");
            return (Criteria) this;
        }

        public Criteria andProofNumberLike(String value) {
            addCriterion("proof_number like", value, "proofNumber");
            return (Criteria) this;
        }

        public Criteria andProofNumberNotLike(String value) {
            addCriterion("proof_number not like", value, "proofNumber");
            return (Criteria) this;
        }

        public Criteria andProofNumberIn(List<String> values) {
            addCriterion("proof_number in", values, "proofNumber");
            return (Criteria) this;
        }

        public Criteria andProofNumberNotIn(List<String> values) {
            addCriterion("proof_number not in", values, "proofNumber");
            return (Criteria) this;
        }

        public Criteria andProofNumberBetween(String value1, String value2) {
            addCriterion("proof_number between", value1, value2, "proofNumber");
            return (Criteria) this;
        }

        public Criteria andProofNumberNotBetween(String value1, String value2) {
            addCriterion("proof_number not between", value1, value2, "proofNumber");
            return (Criteria) this;
        }

        public Criteria andCheckIdIsNull() {
            addCriterion("check_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckIdIsNotNull() {
            addCriterion("check_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckIdEqualTo(String value) {
            addCriterion("check_id =", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotEqualTo(String value) {
            addCriterion("check_id <>", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThan(String value) {
            addCriterion("check_id >", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThanOrEqualTo(String value) {
            addCriterion("check_id >=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThan(String value) {
            addCriterion("check_id <", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThanOrEqualTo(String value) {
            addCriterion("check_id <=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLike(String value) {
            addCriterion("check_id like", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotLike(String value) {
            addCriterion("check_id not like", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdIn(List<String> values) {
            addCriterion("check_id in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotIn(List<String> values) {
            addCriterion("check_id not in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdBetween(String value1, String value2) {
            addCriterion("check_id between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotBetween(String value1, String value2) {
            addCriterion("check_id not between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andCdNameIsNull() {
            addCriterion("cd_name is null");
            return (Criteria) this;
        }

        public Criteria andCdNameIsNotNull() {
            addCriterion("cd_name is not null");
            return (Criteria) this;
        }

        public Criteria andCdNameEqualTo(String value) {
            addCriterion("cd_name =", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameNotEqualTo(String value) {
            addCriterion("cd_name <>", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameGreaterThan(String value) {
            addCriterion("cd_name >", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameGreaterThanOrEqualTo(String value) {
            addCriterion("cd_name >=", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameLessThan(String value) {
            addCriterion("cd_name <", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameLessThanOrEqualTo(String value) {
            addCriterion("cd_name <=", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameLike(String value) {
            addCriterion("cd_name like", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameNotLike(String value) {
            addCriterion("cd_name not like", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameIn(List<String> values) {
            addCriterion("cd_name in", values, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameNotIn(List<String> values) {
            addCriterion("cd_name not in", values, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameBetween(String value1, String value2) {
            addCriterion("cd_name between", value1, value2, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameNotBetween(String value1, String value2) {
            addCriterion("cd_name not between", value1, value2, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdFormatIsNull() {
            addCriterion("cd_format is null");
            return (Criteria) this;
        }

        public Criteria andCdFormatIsNotNull() {
            addCriterion("cd_format is not null");
            return (Criteria) this;
        }

        public Criteria andCdFormatEqualTo(String value) {
            addCriterion("cd_format =", value, "cdFormat");
            return (Criteria) this;
        }

        public Criteria andCdFormatNotEqualTo(String value) {
            addCriterion("cd_format <>", value, "cdFormat");
            return (Criteria) this;
        }

        public Criteria andCdFormatGreaterThan(String value) {
            addCriterion("cd_format >", value, "cdFormat");
            return (Criteria) this;
        }

        public Criteria andCdFormatGreaterThanOrEqualTo(String value) {
            addCriterion("cd_format >=", value, "cdFormat");
            return (Criteria) this;
        }

        public Criteria andCdFormatLessThan(String value) {
            addCriterion("cd_format <", value, "cdFormat");
            return (Criteria) this;
        }

        public Criteria andCdFormatLessThanOrEqualTo(String value) {
            addCriterion("cd_format <=", value, "cdFormat");
            return (Criteria) this;
        }

        public Criteria andCdFormatLike(String value) {
            addCriterion("cd_format like", value, "cdFormat");
            return (Criteria) this;
        }

        public Criteria andCdFormatNotLike(String value) {
            addCriterion("cd_format not like", value, "cdFormat");
            return (Criteria) this;
        }

        public Criteria andCdFormatIn(List<String> values) {
            addCriterion("cd_format in", values, "cdFormat");
            return (Criteria) this;
        }

        public Criteria andCdFormatNotIn(List<String> values) {
            addCriterion("cd_format not in", values, "cdFormat");
            return (Criteria) this;
        }

        public Criteria andCdFormatBetween(String value1, String value2) {
            addCriterion("cd_format between", value1, value2, "cdFormat");
            return (Criteria) this;
        }

        public Criteria andCdFormatNotBetween(String value1, String value2) {
            addCriterion("cd_format not between", value1, value2, "cdFormat");
            return (Criteria) this;
        }

        public Criteria andCdIncludeTaxIsNull() {
            addCriterion("cd_include_tax is null");
            return (Criteria) this;
        }

        public Criteria andCdIncludeTaxIsNotNull() {
            addCriterion("cd_include_tax is not null");
            return (Criteria) this;
        }

        public Criteria andCdIncludeTaxEqualTo(String value) {
            addCriterion("cd_include_tax =", value, "cdIncludeTax");
            return (Criteria) this;
        }

        public Criteria andCdIncludeTaxNotEqualTo(String value) {
            addCriterion("cd_include_tax <>", value, "cdIncludeTax");
            return (Criteria) this;
        }

        public Criteria andCdIncludeTaxGreaterThan(String value) {
            addCriterion("cd_include_tax >", value, "cdIncludeTax");
            return (Criteria) this;
        }

        public Criteria andCdIncludeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("cd_include_tax >=", value, "cdIncludeTax");
            return (Criteria) this;
        }

        public Criteria andCdIncludeTaxLessThan(String value) {
            addCriterion("cd_include_tax <", value, "cdIncludeTax");
            return (Criteria) this;
        }

        public Criteria andCdIncludeTaxLessThanOrEqualTo(String value) {
            addCriterion("cd_include_tax <=", value, "cdIncludeTax");
            return (Criteria) this;
        }

        public Criteria andCdIncludeTaxLike(String value) {
            addCriterion("cd_include_tax like", value, "cdIncludeTax");
            return (Criteria) this;
        }

        public Criteria andCdIncludeTaxNotLike(String value) {
            addCriterion("cd_include_tax not like", value, "cdIncludeTax");
            return (Criteria) this;
        }

        public Criteria andCdIncludeTaxIn(List<String> values) {
            addCriterion("cd_include_tax in", values, "cdIncludeTax");
            return (Criteria) this;
        }

        public Criteria andCdIncludeTaxNotIn(List<String> values) {
            addCriterion("cd_include_tax not in", values, "cdIncludeTax");
            return (Criteria) this;
        }

        public Criteria andCdIncludeTaxBetween(String value1, String value2) {
            addCriterion("cd_include_tax between", value1, value2, "cdIncludeTax");
            return (Criteria) this;
        }

        public Criteria andCdIncludeTaxNotBetween(String value1, String value2) {
            addCriterion("cd_include_tax not between", value1, value2, "cdIncludeTax");
            return (Criteria) this;
        }

        public Criteria andCdVolumeIsNull() {
            addCriterion("cd_volume is null");
            return (Criteria) this;
        }

        public Criteria andCdVolumeIsNotNull() {
            addCriterion("cd_volume is not null");
            return (Criteria) this;
        }

        public Criteria andCdVolumeEqualTo(Integer value) {
            addCriterion("cd_volume =", value, "cdVolume");
            return (Criteria) this;
        }

        public Criteria andCdVolumeNotEqualTo(Integer value) {
            addCriterion("cd_volume <>", value, "cdVolume");
            return (Criteria) this;
        }

        public Criteria andCdVolumeGreaterThan(Integer value) {
            addCriterion("cd_volume >", value, "cdVolume");
            return (Criteria) this;
        }

        public Criteria andCdVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_volume >=", value, "cdVolume");
            return (Criteria) this;
        }

        public Criteria andCdVolumeLessThan(Integer value) {
            addCriterion("cd_volume <", value, "cdVolume");
            return (Criteria) this;
        }

        public Criteria andCdVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("cd_volume <=", value, "cdVolume");
            return (Criteria) this;
        }

        public Criteria andCdVolumeIn(List<Integer> values) {
            addCriterion("cd_volume in", values, "cdVolume");
            return (Criteria) this;
        }

        public Criteria andCdVolumeNotIn(List<Integer> values) {
            addCriterion("cd_volume not in", values, "cdVolume");
            return (Criteria) this;
        }

        public Criteria andCdVolumeBetween(Integer value1, Integer value2) {
            addCriterion("cd_volume between", value1, value2, "cdVolume");
            return (Criteria) this;
        }

        public Criteria andCdVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_volume not between", value1, value2, "cdVolume");
            return (Criteria) this;
        }

        public Criteria andCdInventoriesNumberIsNull() {
            addCriterion("cd_inventories_number is null");
            return (Criteria) this;
        }

        public Criteria andCdInventoriesNumberIsNotNull() {
            addCriterion("cd_inventories_number is not null");
            return (Criteria) this;
        }

        public Criteria andCdInventoriesNumberEqualTo(Integer value) {
            addCriterion("cd_inventories_number =", value, "cdInventoriesNumber");
            return (Criteria) this;
        }

        public Criteria andCdInventoriesNumberNotEqualTo(Integer value) {
            addCriterion("cd_inventories_number <>", value, "cdInventoriesNumber");
            return (Criteria) this;
        }

        public Criteria andCdInventoriesNumberGreaterThan(Integer value) {
            addCriterion("cd_inventories_number >", value, "cdInventoriesNumber");
            return (Criteria) this;
        }

        public Criteria andCdInventoriesNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_inventories_number >=", value, "cdInventoriesNumber");
            return (Criteria) this;
        }

        public Criteria andCdInventoriesNumberLessThan(Integer value) {
            addCriterion("cd_inventories_number <", value, "cdInventoriesNumber");
            return (Criteria) this;
        }

        public Criteria andCdInventoriesNumberLessThanOrEqualTo(Integer value) {
            addCriterion("cd_inventories_number <=", value, "cdInventoriesNumber");
            return (Criteria) this;
        }

        public Criteria andCdInventoriesNumberIn(List<Integer> values) {
            addCriterion("cd_inventories_number in", values, "cdInventoriesNumber");
            return (Criteria) this;
        }

        public Criteria andCdInventoriesNumberNotIn(List<Integer> values) {
            addCriterion("cd_inventories_number not in", values, "cdInventoriesNumber");
            return (Criteria) this;
        }

        public Criteria andCdInventoriesNumberBetween(Integer value1, Integer value2) {
            addCriterion("cd_inventories_number between", value1, value2, "cdInventoriesNumber");
            return (Criteria) this;
        }

        public Criteria andCdInventoriesNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_inventories_number not between", value1, value2, "cdInventoriesNumber");
            return (Criteria) this;
        }

        public Criteria andCdProfitsLossesNumberIsNull() {
            addCriterion("cd_profits_losses_number is null");
            return (Criteria) this;
        }

        public Criteria andCdProfitsLossesNumberIsNotNull() {
            addCriterion("cd_profits_losses_number is not null");
            return (Criteria) this;
        }

        public Criteria andCdProfitsLossesNumberEqualTo(Integer value) {
            addCriterion("cd_profits_losses_number =", value, "cdProfitsLossesNumber");
            return (Criteria) this;
        }

        public Criteria andCdProfitsLossesNumberNotEqualTo(Integer value) {
            addCriterion("cd_profits_losses_number <>", value, "cdProfitsLossesNumber");
            return (Criteria) this;
        }

        public Criteria andCdProfitsLossesNumberGreaterThan(Integer value) {
            addCriterion("cd_profits_losses_number >", value, "cdProfitsLossesNumber");
            return (Criteria) this;
        }

        public Criteria andCdProfitsLossesNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_profits_losses_number >=", value, "cdProfitsLossesNumber");
            return (Criteria) this;
        }

        public Criteria andCdProfitsLossesNumberLessThan(Integer value) {
            addCriterion("cd_profits_losses_number <", value, "cdProfitsLossesNumber");
            return (Criteria) this;
        }

        public Criteria andCdProfitsLossesNumberLessThanOrEqualTo(Integer value) {
            addCriterion("cd_profits_losses_number <=", value, "cdProfitsLossesNumber");
            return (Criteria) this;
        }

        public Criteria andCdProfitsLossesNumberIn(List<Integer> values) {
            addCriterion("cd_profits_losses_number in", values, "cdProfitsLossesNumber");
            return (Criteria) this;
        }

        public Criteria andCdProfitsLossesNumberNotIn(List<Integer> values) {
            addCriterion("cd_profits_losses_number not in", values, "cdProfitsLossesNumber");
            return (Criteria) this;
        }

        public Criteria andCdProfitsLossesNumberBetween(Integer value1, Integer value2) {
            addCriterion("cd_profits_losses_number between", value1, value2, "cdProfitsLossesNumber");
            return (Criteria) this;
        }

        public Criteria andCdProfitsLossesNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_profits_losses_number not between", value1, value2, "cdProfitsLossesNumber");
            return (Criteria) this;
        }

        public Criteria andCdUnitPriceIsNull() {
            addCriterion("cd_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andCdUnitPriceIsNotNull() {
            addCriterion("cd_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andCdUnitPriceEqualTo(Float value) {
            addCriterion("cd_unit_price =", value, "cdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCdUnitPriceNotEqualTo(Float value) {
            addCriterion("cd_unit_price <>", value, "cdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCdUnitPriceGreaterThan(Float value) {
            addCriterion("cd_unit_price >", value, "cdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCdUnitPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("cd_unit_price >=", value, "cdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCdUnitPriceLessThan(Float value) {
            addCriterion("cd_unit_price <", value, "cdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCdUnitPriceLessThanOrEqualTo(Float value) {
            addCriterion("cd_unit_price <=", value, "cdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCdUnitPriceIn(List<Float> values) {
            addCriterion("cd_unit_price in", values, "cdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCdUnitPriceNotIn(List<Float> values) {
            addCriterion("cd_unit_price not in", values, "cdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCdUnitPriceBetween(Float value1, Float value2) {
            addCriterion("cd_unit_price between", value1, value2, "cdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCdUnitPriceNotBetween(Float value1, Float value2) {
            addCriterion("cd_unit_price not between", value1, value2, "cdUnitPrice");
            return (Criteria) this;
        }

        public Criteria andCdLossAmountProfitIsNull() {
            addCriterion("cd_loss_amount_profit is null");
            return (Criteria) this;
        }

        public Criteria andCdLossAmountProfitIsNotNull() {
            addCriterion("cd_loss_amount_profit is not null");
            return (Criteria) this;
        }

        public Criteria andCdLossAmountProfitEqualTo(Float value) {
            addCriterion("cd_loss_amount_profit =", value, "cdLossAmountProfit");
            return (Criteria) this;
        }

        public Criteria andCdLossAmountProfitNotEqualTo(Float value) {
            addCriterion("cd_loss_amount_profit <>", value, "cdLossAmountProfit");
            return (Criteria) this;
        }

        public Criteria andCdLossAmountProfitGreaterThan(Float value) {
            addCriterion("cd_loss_amount_profit >", value, "cdLossAmountProfit");
            return (Criteria) this;
        }

        public Criteria andCdLossAmountProfitGreaterThanOrEqualTo(Float value) {
            addCriterion("cd_loss_amount_profit >=", value, "cdLossAmountProfit");
            return (Criteria) this;
        }

        public Criteria andCdLossAmountProfitLessThan(Float value) {
            addCriterion("cd_loss_amount_profit <", value, "cdLossAmountProfit");
            return (Criteria) this;
        }

        public Criteria andCdLossAmountProfitLessThanOrEqualTo(Float value) {
            addCriterion("cd_loss_amount_profit <=", value, "cdLossAmountProfit");
            return (Criteria) this;
        }

        public Criteria andCdLossAmountProfitIn(List<Float> values) {
            addCriterion("cd_loss_amount_profit in", values, "cdLossAmountProfit");
            return (Criteria) this;
        }

        public Criteria andCdLossAmountProfitNotIn(List<Float> values) {
            addCriterion("cd_loss_amount_profit not in", values, "cdLossAmountProfit");
            return (Criteria) this;
        }

        public Criteria andCdLossAmountProfitBetween(Float value1, Float value2) {
            addCriterion("cd_loss_amount_profit between", value1, value2, "cdLossAmountProfit");
            return (Criteria) this;
        }

        public Criteria andCdLossAmountProfitNotBetween(Float value1, Float value2) {
            addCriterion("cd_loss_amount_profit not between", value1, value2, "cdLossAmountProfit");
            return (Criteria) this;
        }

        public Criteria andCdBatchNumberIsNull() {
            addCriterion("cd_batch_number is null");
            return (Criteria) this;
        }

        public Criteria andCdBatchNumberIsNotNull() {
            addCriterion("cd_batch_number is not null");
            return (Criteria) this;
        }

        public Criteria andCdBatchNumberEqualTo(String value) {
            addCriterion("cd_batch_number =", value, "cdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCdBatchNumberNotEqualTo(String value) {
            addCriterion("cd_batch_number <>", value, "cdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCdBatchNumberGreaterThan(String value) {
            addCriterion("cd_batch_number >", value, "cdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCdBatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cd_batch_number >=", value, "cdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCdBatchNumberLessThan(String value) {
            addCriterion("cd_batch_number <", value, "cdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCdBatchNumberLessThanOrEqualTo(String value) {
            addCriterion("cd_batch_number <=", value, "cdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCdBatchNumberLike(String value) {
            addCriterion("cd_batch_number like", value, "cdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCdBatchNumberNotLike(String value) {
            addCriterion("cd_batch_number not like", value, "cdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCdBatchNumberIn(List<String> values) {
            addCriterion("cd_batch_number in", values, "cdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCdBatchNumberNotIn(List<String> values) {
            addCriterion("cd_batch_number not in", values, "cdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCdBatchNumberBetween(String value1, String value2) {
            addCriterion("cd_batch_number between", value1, value2, "cdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCdBatchNumberNotBetween(String value1, String value2) {
            addCriterion("cd_batch_number not between", value1, value2, "cdBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCdCauseIsNull() {
            addCriterion("cd_cause is null");
            return (Criteria) this;
        }

        public Criteria andCdCauseIsNotNull() {
            addCriterion("cd_cause is not null");
            return (Criteria) this;
        }

        public Criteria andCdCauseEqualTo(String value) {
            addCriterion("cd_cause =", value, "cdCause");
            return (Criteria) this;
        }

        public Criteria andCdCauseNotEqualTo(String value) {
            addCriterion("cd_cause <>", value, "cdCause");
            return (Criteria) this;
        }

        public Criteria andCdCauseGreaterThan(String value) {
            addCriterion("cd_cause >", value, "cdCause");
            return (Criteria) this;
        }

        public Criteria andCdCauseGreaterThanOrEqualTo(String value) {
            addCriterion("cd_cause >=", value, "cdCause");
            return (Criteria) this;
        }

        public Criteria andCdCauseLessThan(String value) {
            addCriterion("cd_cause <", value, "cdCause");
            return (Criteria) this;
        }

        public Criteria andCdCauseLessThanOrEqualTo(String value) {
            addCriterion("cd_cause <=", value, "cdCause");
            return (Criteria) this;
        }

        public Criteria andCdCauseLike(String value) {
            addCriterion("cd_cause like", value, "cdCause");
            return (Criteria) this;
        }

        public Criteria andCdCauseNotLike(String value) {
            addCriterion("cd_cause not like", value, "cdCause");
            return (Criteria) this;
        }

        public Criteria andCdCauseIn(List<String> values) {
            addCriterion("cd_cause in", values, "cdCause");
            return (Criteria) this;
        }

        public Criteria andCdCauseNotIn(List<String> values) {
            addCriterion("cd_cause not in", values, "cdCause");
            return (Criteria) this;
        }

        public Criteria andCdCauseBetween(String value1, String value2) {
            addCriterion("cd_cause between", value1, value2, "cdCause");
            return (Criteria) this;
        }

        public Criteria andCdCauseNotBetween(String value1, String value2) {
            addCriterion("cd_cause not between", value1, value2, "cdCause");
            return (Criteria) this;
        }

        public Criteria andCdAuditingIsNull() {
            addCriterion("cd_auditing is null");
            return (Criteria) this;
        }

        public Criteria andCdAuditingIsNotNull() {
            addCriterion("cd_auditing is not null");
            return (Criteria) this;
        }

        public Criteria andCdAuditingEqualTo(String value) {
            addCriterion("cd_auditing =", value, "cdAuditing");
            return (Criteria) this;
        }

        public Criteria andCdAuditingNotEqualTo(String value) {
            addCriterion("cd_auditing <>", value, "cdAuditing");
            return (Criteria) this;
        }

        public Criteria andCdAuditingGreaterThan(String value) {
            addCriterion("cd_auditing >", value, "cdAuditing");
            return (Criteria) this;
        }

        public Criteria andCdAuditingGreaterThanOrEqualTo(String value) {
            addCriterion("cd_auditing >=", value, "cdAuditing");
            return (Criteria) this;
        }

        public Criteria andCdAuditingLessThan(String value) {
            addCriterion("cd_auditing <", value, "cdAuditing");
            return (Criteria) this;
        }

        public Criteria andCdAuditingLessThanOrEqualTo(String value) {
            addCriterion("cd_auditing <=", value, "cdAuditing");
            return (Criteria) this;
        }

        public Criteria andCdAuditingLike(String value) {
            addCriterion("cd_auditing like", value, "cdAuditing");
            return (Criteria) this;
        }

        public Criteria andCdAuditingNotLike(String value) {
            addCriterion("cd_auditing not like", value, "cdAuditing");
            return (Criteria) this;
        }

        public Criteria andCdAuditingIn(List<String> values) {
            addCriterion("cd_auditing in", values, "cdAuditing");
            return (Criteria) this;
        }

        public Criteria andCdAuditingNotIn(List<String> values) {
            addCriterion("cd_auditing not in", values, "cdAuditing");
            return (Criteria) this;
        }

        public Criteria andCdAuditingBetween(String value1, String value2) {
            addCriterion("cd_auditing between", value1, value2, "cdAuditing");
            return (Criteria) this;
        }

        public Criteria andCdAuditingNotBetween(String value1, String value2) {
            addCriterion("cd_auditing not between", value1, value2, "cdAuditing");
            return (Criteria) this;
        }

        public Criteria andCdYnIsNull() {
            addCriterion("cd_yn is null");
            return (Criteria) this;
        }

        public Criteria andCdYnIsNotNull() {
            addCriterion("cd_yn is not null");
            return (Criteria) this;
        }

        public Criteria andCdYnEqualTo(String value) {
            addCriterion("cd_yn =", value, "cdYn");
            return (Criteria) this;
        }

        public Criteria andCdYnNotEqualTo(String value) {
            addCriterion("cd_yn <>", value, "cdYn");
            return (Criteria) this;
        }

        public Criteria andCdYnGreaterThan(String value) {
            addCriterion("cd_yn >", value, "cdYn");
            return (Criteria) this;
        }

        public Criteria andCdYnGreaterThanOrEqualTo(String value) {
            addCriterion("cd_yn >=", value, "cdYn");
            return (Criteria) this;
        }

        public Criteria andCdYnLessThan(String value) {
            addCriterion("cd_yn <", value, "cdYn");
            return (Criteria) this;
        }

        public Criteria andCdYnLessThanOrEqualTo(String value) {
            addCriterion("cd_yn <=", value, "cdYn");
            return (Criteria) this;
        }

        public Criteria andCdYnLike(String value) {
            addCriterion("cd_yn like", value, "cdYn");
            return (Criteria) this;
        }

        public Criteria andCdYnNotLike(String value) {
            addCriterion("cd_yn not like", value, "cdYn");
            return (Criteria) this;
        }

        public Criteria andCdYnIn(List<String> values) {
            addCriterion("cd_yn in", values, "cdYn");
            return (Criteria) this;
        }

        public Criteria andCdYnNotIn(List<String> values) {
            addCriterion("cd_yn not in", values, "cdYn");
            return (Criteria) this;
        }

        public Criteria andCdYnBetween(String value1, String value2) {
            addCriterion("cd_yn between", value1, value2, "cdYn");
            return (Criteria) this;
        }

        public Criteria andCdYnNotBetween(String value1, String value2) {
            addCriterion("cd_yn not between", value1, value2, "cdYn");
            return (Criteria) this;
        }

        public Criteria andCdCustom1IsNull() {
            addCriterion("cd_custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCdCustom1IsNotNull() {
            addCriterion("cd_custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCdCustom1EqualTo(String value) {
            addCriterion("cd_custom1 =", value, "cdCustom1");
            return (Criteria) this;
        }

        public Criteria andCdCustom1NotEqualTo(String value) {
            addCriterion("cd_custom1 <>", value, "cdCustom1");
            return (Criteria) this;
        }

        public Criteria andCdCustom1GreaterThan(String value) {
            addCriterion("cd_custom1 >", value, "cdCustom1");
            return (Criteria) this;
        }

        public Criteria andCdCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("cd_custom1 >=", value, "cdCustom1");
            return (Criteria) this;
        }

        public Criteria andCdCustom1LessThan(String value) {
            addCriterion("cd_custom1 <", value, "cdCustom1");
            return (Criteria) this;
        }

        public Criteria andCdCustom1LessThanOrEqualTo(String value) {
            addCriterion("cd_custom1 <=", value, "cdCustom1");
            return (Criteria) this;
        }

        public Criteria andCdCustom1Like(String value) {
            addCriterion("cd_custom1 like", value, "cdCustom1");
            return (Criteria) this;
        }

        public Criteria andCdCustom1NotLike(String value) {
            addCriterion("cd_custom1 not like", value, "cdCustom1");
            return (Criteria) this;
        }

        public Criteria andCdCustom1In(List<String> values) {
            addCriterion("cd_custom1 in", values, "cdCustom1");
            return (Criteria) this;
        }

        public Criteria andCdCustom1NotIn(List<String> values) {
            addCriterion("cd_custom1 not in", values, "cdCustom1");
            return (Criteria) this;
        }

        public Criteria andCdCustom1Between(String value1, String value2) {
            addCriterion("cd_custom1 between", value1, value2, "cdCustom1");
            return (Criteria) this;
        }

        public Criteria andCdCustom1NotBetween(String value1, String value2) {
            addCriterion("cd_custom1 not between", value1, value2, "cdCustom1");
            return (Criteria) this;
        }

        public Criteria andCdCustom2IsNull() {
            addCriterion("cd_custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCdCustom2IsNotNull() {
            addCriterion("cd_custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCdCustom2EqualTo(String value) {
            addCriterion("cd_custom2 =", value, "cdCustom2");
            return (Criteria) this;
        }

        public Criteria andCdCustom2NotEqualTo(String value) {
            addCriterion("cd_custom2 <>", value, "cdCustom2");
            return (Criteria) this;
        }

        public Criteria andCdCustom2GreaterThan(String value) {
            addCriterion("cd_custom2 >", value, "cdCustom2");
            return (Criteria) this;
        }

        public Criteria andCdCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("cd_custom2 >=", value, "cdCustom2");
            return (Criteria) this;
        }

        public Criteria andCdCustom2LessThan(String value) {
            addCriterion("cd_custom2 <", value, "cdCustom2");
            return (Criteria) this;
        }

        public Criteria andCdCustom2LessThanOrEqualTo(String value) {
            addCriterion("cd_custom2 <=", value, "cdCustom2");
            return (Criteria) this;
        }

        public Criteria andCdCustom2Like(String value) {
            addCriterion("cd_custom2 like", value, "cdCustom2");
            return (Criteria) this;
        }

        public Criteria andCdCustom2NotLike(String value) {
            addCriterion("cd_custom2 not like", value, "cdCustom2");
            return (Criteria) this;
        }

        public Criteria andCdCustom2In(List<String> values) {
            addCriterion("cd_custom2 in", values, "cdCustom2");
            return (Criteria) this;
        }

        public Criteria andCdCustom2NotIn(List<String> values) {
            addCriterion("cd_custom2 not in", values, "cdCustom2");
            return (Criteria) this;
        }

        public Criteria andCdCustom2Between(String value1, String value2) {
            addCriterion("cd_custom2 between", value1, value2, "cdCustom2");
            return (Criteria) this;
        }

        public Criteria andCdCustom2NotBetween(String value1, String value2) {
            addCriterion("cd_custom2 not between", value1, value2, "cdCustom2");
            return (Criteria) this;
        }

        public Criteria andCdCustom3IsNull() {
            addCriterion("cd_custom3 is null");
            return (Criteria) this;
        }

        public Criteria andCdCustom3IsNotNull() {
            addCriterion("cd_custom3 is not null");
            return (Criteria) this;
        }

        public Criteria andCdCustom3EqualTo(String value) {
            addCriterion("cd_custom3 =", value, "cdCustom3");
            return (Criteria) this;
        }

        public Criteria andCdCustom3NotEqualTo(String value) {
            addCriterion("cd_custom3 <>", value, "cdCustom3");
            return (Criteria) this;
        }

        public Criteria andCdCustom3GreaterThan(String value) {
            addCriterion("cd_custom3 >", value, "cdCustom3");
            return (Criteria) this;
        }

        public Criteria andCdCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("cd_custom3 >=", value, "cdCustom3");
            return (Criteria) this;
        }

        public Criteria andCdCustom3LessThan(String value) {
            addCriterion("cd_custom3 <", value, "cdCustom3");
            return (Criteria) this;
        }

        public Criteria andCdCustom3LessThanOrEqualTo(String value) {
            addCriterion("cd_custom3 <=", value, "cdCustom3");
            return (Criteria) this;
        }

        public Criteria andCdCustom3Like(String value) {
            addCriterion("cd_custom3 like", value, "cdCustom3");
            return (Criteria) this;
        }

        public Criteria andCdCustom3NotLike(String value) {
            addCriterion("cd_custom3 not like", value, "cdCustom3");
            return (Criteria) this;
        }

        public Criteria andCdCustom3In(List<String> values) {
            addCriterion("cd_custom3 in", values, "cdCustom3");
            return (Criteria) this;
        }

        public Criteria andCdCustom3NotIn(List<String> values) {
            addCriterion("cd_custom3 not in", values, "cdCustom3");
            return (Criteria) this;
        }

        public Criteria andCdCustom3Between(String value1, String value2) {
            addCriterion("cd_custom3 between", value1, value2, "cdCustom3");
            return (Criteria) this;
        }

        public Criteria andCdCustom3NotBetween(String value1, String value2) {
            addCriterion("cd_custom3 not between", value1, value2, "cdCustom3");
            return (Criteria) this;
        }

        public Criteria andCdCustom4IsNull() {
            addCriterion("cd_custom4 is null");
            return (Criteria) this;
        }

        public Criteria andCdCustom4IsNotNull() {
            addCriterion("cd_custom4 is not null");
            return (Criteria) this;
        }

        public Criteria andCdCustom4EqualTo(String value) {
            addCriterion("cd_custom4 =", value, "cdCustom4");
            return (Criteria) this;
        }

        public Criteria andCdCustom4NotEqualTo(String value) {
            addCriterion("cd_custom4 <>", value, "cdCustom4");
            return (Criteria) this;
        }

        public Criteria andCdCustom4GreaterThan(String value) {
            addCriterion("cd_custom4 >", value, "cdCustom4");
            return (Criteria) this;
        }

        public Criteria andCdCustom4GreaterThanOrEqualTo(String value) {
            addCriterion("cd_custom4 >=", value, "cdCustom4");
            return (Criteria) this;
        }

        public Criteria andCdCustom4LessThan(String value) {
            addCriterion("cd_custom4 <", value, "cdCustom4");
            return (Criteria) this;
        }

        public Criteria andCdCustom4LessThanOrEqualTo(String value) {
            addCriterion("cd_custom4 <=", value, "cdCustom4");
            return (Criteria) this;
        }

        public Criteria andCdCustom4Like(String value) {
            addCriterion("cd_custom4 like", value, "cdCustom4");
            return (Criteria) this;
        }

        public Criteria andCdCustom4NotLike(String value) {
            addCriterion("cd_custom4 not like", value, "cdCustom4");
            return (Criteria) this;
        }

        public Criteria andCdCustom4In(List<String> values) {
            addCriterion("cd_custom4 in", values, "cdCustom4");
            return (Criteria) this;
        }

        public Criteria andCdCustom4NotIn(List<String> values) {
            addCriterion("cd_custom4 not in", values, "cdCustom4");
            return (Criteria) this;
        }

        public Criteria andCdCustom4Between(String value1, String value2) {
            addCriterion("cd_custom4 between", value1, value2, "cdCustom4");
            return (Criteria) this;
        }

        public Criteria andCdCustom4NotBetween(String value1, String value2) {
            addCriterion("cd_custom4 not between", value1, value2, "cdCustom4");
            return (Criteria) this;
        }

        public Criteria andCdCustom5IsNull() {
            addCriterion("cd_custom5 is null");
            return (Criteria) this;
        }

        public Criteria andCdCustom5IsNotNull() {
            addCriterion("cd_custom5 is not null");
            return (Criteria) this;
        }

        public Criteria andCdCustom5EqualTo(String value) {
            addCriterion("cd_custom5 =", value, "cdCustom5");
            return (Criteria) this;
        }

        public Criteria andCdCustom5NotEqualTo(String value) {
            addCriterion("cd_custom5 <>", value, "cdCustom5");
            return (Criteria) this;
        }

        public Criteria andCdCustom5GreaterThan(String value) {
            addCriterion("cd_custom5 >", value, "cdCustom5");
            return (Criteria) this;
        }

        public Criteria andCdCustom5GreaterThanOrEqualTo(String value) {
            addCriterion("cd_custom5 >=", value, "cdCustom5");
            return (Criteria) this;
        }

        public Criteria andCdCustom5LessThan(String value) {
            addCriterion("cd_custom5 <", value, "cdCustom5");
            return (Criteria) this;
        }

        public Criteria andCdCustom5LessThanOrEqualTo(String value) {
            addCriterion("cd_custom5 <=", value, "cdCustom5");
            return (Criteria) this;
        }

        public Criteria andCdCustom5Like(String value) {
            addCriterion("cd_custom5 like", value, "cdCustom5");
            return (Criteria) this;
        }

        public Criteria andCdCustom5NotLike(String value) {
            addCriterion("cd_custom5 not like", value, "cdCustom5");
            return (Criteria) this;
        }

        public Criteria andCdCustom5In(List<String> values) {
            addCriterion("cd_custom5 in", values, "cdCustom5");
            return (Criteria) this;
        }

        public Criteria andCdCustom5NotIn(List<String> values) {
            addCriterion("cd_custom5 not in", values, "cdCustom5");
            return (Criteria) this;
        }

        public Criteria andCdCustom5Between(String value1, String value2) {
            addCriterion("cd_custom5 between", value1, value2, "cdCustom5");
            return (Criteria) this;
        }

        public Criteria andCdCustom5NotBetween(String value1, String value2) {
            addCriterion("cd_custom5 not between", value1, value2, "cdCustom5");
            return (Criteria) this;
        }

        public Criteria andCdCustom6IsNull() {
            addCriterion("cd_custom6 is null");
            return (Criteria) this;
        }

        public Criteria andCdCustom6IsNotNull() {
            addCriterion("cd_custom6 is not null");
            return (Criteria) this;
        }

        public Criteria andCdCustom6EqualTo(String value) {
            addCriterion("cd_custom6 =", value, "cdCustom6");
            return (Criteria) this;
        }

        public Criteria andCdCustom6NotEqualTo(String value) {
            addCriterion("cd_custom6 <>", value, "cdCustom6");
            return (Criteria) this;
        }

        public Criteria andCdCustom6GreaterThan(String value) {
            addCriterion("cd_custom6 >", value, "cdCustom6");
            return (Criteria) this;
        }

        public Criteria andCdCustom6GreaterThanOrEqualTo(String value) {
            addCriterion("cd_custom6 >=", value, "cdCustom6");
            return (Criteria) this;
        }

        public Criteria andCdCustom6LessThan(String value) {
            addCriterion("cd_custom6 <", value, "cdCustom6");
            return (Criteria) this;
        }

        public Criteria andCdCustom6LessThanOrEqualTo(String value) {
            addCriterion("cd_custom6 <=", value, "cdCustom6");
            return (Criteria) this;
        }

        public Criteria andCdCustom6Like(String value) {
            addCriterion("cd_custom6 like", value, "cdCustom6");
            return (Criteria) this;
        }

        public Criteria andCdCustom6NotLike(String value) {
            addCriterion("cd_custom6 not like", value, "cdCustom6");
            return (Criteria) this;
        }

        public Criteria andCdCustom6In(List<String> values) {
            addCriterion("cd_custom6 in", values, "cdCustom6");
            return (Criteria) this;
        }

        public Criteria andCdCustom6NotIn(List<String> values) {
            addCriterion("cd_custom6 not in", values, "cdCustom6");
            return (Criteria) this;
        }

        public Criteria andCdCustom6Between(String value1, String value2) {
            addCriterion("cd_custom6 between", value1, value2, "cdCustom6");
            return (Criteria) this;
        }

        public Criteria andCdCustom6NotBetween(String value1, String value2) {
            addCriterion("cd_custom6 not between", value1, value2, "cdCustom6");
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