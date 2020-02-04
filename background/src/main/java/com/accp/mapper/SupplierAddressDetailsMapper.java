package com.accp.mapper;

import com.accp.domain.SupplierAddressDetails;
import com.accp.domain.SupplierAddressDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierAddressDetailsMapper {
    int countByExample(SupplierAddressDetailsExample example);

    int deleteByExample(SupplierAddressDetailsExample example);

    int deleteByPrimaryKey(Integer sadId);

    int insert(SupplierAddressDetails record);

    int insertSelective(SupplierAddressDetails record);

    List<SupplierAddressDetails> selectByExample(SupplierAddressDetailsExample example);

    SupplierAddressDetails selectByPrimaryKey(Integer sadId);

    int updateByExampleSelective(@Param("record") SupplierAddressDetails record, @Param("example") SupplierAddressDetailsExample example);

    int updateByExample(@Param("record") SupplierAddressDetails record, @Param("example") SupplierAddressDetailsExample example);

    int updateByPrimaryKeySelective(SupplierAddressDetails record);

    int updateByPrimaryKey(SupplierAddressDetails record);
}