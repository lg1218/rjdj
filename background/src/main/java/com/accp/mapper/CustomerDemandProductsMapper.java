package com.accp.mapper;

import com.accp.domain.CustomerDemandProducts;
import com.accp.domain.CustomerDemandProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerDemandProductsMapper {
    int countByExample(CustomerDemandProductsExample example);

    int deleteByExample(CustomerDemandProductsExample example);

    int deleteByPrimaryKey(String cdpId);

    int insert(CustomerDemandProducts record);

    int insertSelective(CustomerDemandProducts record);

    List<CustomerDemandProducts> selectByExample(CustomerDemandProductsExample example);

    CustomerDemandProducts selectByPrimaryKey(String cdpId);

    int updateByExampleSelective(@Param("record") CustomerDemandProducts record, @Param("example") CustomerDemandProductsExample example);

    int updateByExample(@Param("record") CustomerDemandProducts record, @Param("example") CustomerDemandProductsExample example);

    int updateByPrimaryKeySelective(CustomerDemandProducts record);

    int updateByPrimaryKey(CustomerDemandProducts record);
}