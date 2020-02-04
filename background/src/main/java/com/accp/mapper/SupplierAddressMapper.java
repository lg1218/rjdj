package com.accp.mapper;

import com.accp.domain.SupplierAddress;
import com.accp.domain.SupplierAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierAddressMapper {
    int countByExample(SupplierAddressExample example);

    int deleteByExample(SupplierAddressExample example);

    int deleteByPrimaryKey(Integer saId);

    int insert(SupplierAddress record);

    int insertSelective(SupplierAddress record);

    List<SupplierAddress> selectByExample(SupplierAddressExample example);

    SupplierAddress selectByPrimaryKey(Integer saId);

    int updateByExampleSelective(@Param("record") SupplierAddress record, @Param("example") SupplierAddressExample example);

    int updateByExample(@Param("record") SupplierAddress record, @Param("example") SupplierAddressExample example);

    int updateByPrimaryKeySelective(SupplierAddress record);

    int updateByPrimaryKey(SupplierAddress record);
}