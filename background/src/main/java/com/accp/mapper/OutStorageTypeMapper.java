package com.accp.mapper;

import com.accp.domain.OutStorageType;
import com.accp.domain.OutStorageTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutStorageTypeMapper {
    int countByExample(OutStorageTypeExample example);

    int deleteByExample(OutStorageTypeExample example);

    int deleteByPrimaryKey(String ostId);

    int insert(OutStorageType record);

    int insertSelective(OutStorageType record);

    List<OutStorageType> selectByExample(OutStorageTypeExample example);

    OutStorageType selectByPrimaryKey(String ostId);

    int updateByExampleSelective(@Param("record") OutStorageType record, @Param("example") OutStorageTypeExample example);

    int updateByExample(@Param("record") OutStorageType record, @Param("example") OutStorageTypeExample example);

    int updateByPrimaryKeySelective(OutStorageType record);

    int updateByPrimaryKey(OutStorageType record);
}