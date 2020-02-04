package com.accp.mapper;

import com.accp.domain.KehuType;
import com.accp.domain.KehuTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KehuTypeMapper {
    int countByExample(KehuTypeExample example);

    int deleteByExample(KehuTypeExample example);

    int deleteByPrimaryKey(Integer kulId);

    int insert(KehuType record);

    int insertSelective(KehuType record);

    List<KehuType> selectByExample(KehuTypeExample example);

    KehuType selectByPrimaryKey(Integer kulId);

    int updateByExampleSelective(@Param("record") KehuType record, @Param("example") KehuTypeExample example);

    int updateByExample(@Param("record") KehuType record, @Param("example") KehuTypeExample example);

    int updateByPrimaryKeySelective(KehuType record);

    int updateByPrimaryKey(KehuType record);
}