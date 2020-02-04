package com.accp.mapper;

import com.accp.domain.KehuAddress;
import com.accp.domain.KehuAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KehuAddressMapper {
    int countByExample(KehuAddressExample example);

    int deleteByExample(KehuAddressExample example);

    int deleteByPrimaryKey(Integer kudId);

    int insert(KehuAddress record);

    int insertSelective(KehuAddress record);

    List<KehuAddress> selectByExample(KehuAddressExample example);

    KehuAddress selectByPrimaryKey(Integer kudId);

    int updateByExampleSelective(@Param("record") KehuAddress record, @Param("example") KehuAddressExample example);

    int updateByExample(@Param("record") KehuAddress record, @Param("example") KehuAddressExample example);

    int updateByPrimaryKeySelective(KehuAddress record);

    int updateByPrimaryKey(KehuAddress record);
}