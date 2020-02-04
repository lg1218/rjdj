package com.accp.mapper;

import com.accp.domain.KehuAddressDetails;
import com.accp.domain.KehuAddressDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KehuAddressDetailsMapper {
    int countByExample(KehuAddressDetailsExample example);

    int deleteByExample(KehuAddressDetailsExample example);

    int deleteByPrimaryKey(Integer kudDSadId);

    int insert(KehuAddressDetails record);

    int insertSelective(KehuAddressDetails record);

    List<KehuAddressDetails> selectByExample(KehuAddressDetailsExample example);

    KehuAddressDetails selectByPrimaryKey(Integer kudDSadId);

    int updateByExampleSelective(@Param("record") KehuAddressDetails record, @Param("example") KehuAddressDetailsExample example);

    int updateByExample(@Param("record") KehuAddressDetails record, @Param("example") KehuAddressDetailsExample example);

    int updateByPrimaryKeySelective(KehuAddressDetails record);

    int updateByPrimaryKey(KehuAddressDetails record);
}