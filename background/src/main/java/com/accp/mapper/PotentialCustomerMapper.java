package com.accp.mapper;

import com.accp.domain.PotentialCustomer;
import com.accp.domain.PotentialCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PotentialCustomerMapper {
    int countByExample(PotentialCustomerExample example);

    int deleteByExample(PotentialCustomerExample example);

    int deleteByPrimaryKey(String pcId);

    int insert(PotentialCustomer record);

    int insertSelective(PotentialCustomer record);

    List<PotentialCustomer> selectByExample(PotentialCustomerExample example);

    PotentialCustomer selectByPrimaryKey(String pcId);

    int updateByExampleSelective(@Param("record") PotentialCustomer record, @Param("example") PotentialCustomerExample example);

    int updateByExample(@Param("record") PotentialCustomer record, @Param("example") PotentialCustomerExample example);

    int updateByPrimaryKeySelective(PotentialCustomer record);

    int updateByPrimaryKey(PotentialCustomer record);
}