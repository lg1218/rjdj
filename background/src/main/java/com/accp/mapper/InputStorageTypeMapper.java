package com.accp.mapper;

import com.accp.domain.InputStorageType;
import com.accp.domain.InputStorageTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InputStorageTypeMapper {
    int countByExample(InputStorageTypeExample example);

    int deleteByExample(InputStorageTypeExample example);

    int deleteByPrimaryKey(String istId);

    int insert(InputStorageType record);

    int insertSelective(InputStorageType record);

    List<InputStorageType> selectByExample(InputStorageTypeExample example);

    InputStorageType selectByPrimaryKey(String istId);

    int updateByExampleSelective(@Param("record") InputStorageType record, @Param("example") InputStorageTypeExample example);

    int updateByExample(@Param("record") InputStorageType record, @Param("example") InputStorageTypeExample example);

    int updateByPrimaryKeySelective(InputStorageType record);

    int updateByPrimaryKey(InputStorageType record);
}