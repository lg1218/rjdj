package com.accp.mapper;

import com.accp.domain.IncomeCostsType;
import com.accp.domain.IncomeCostsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IncomeCostsTypeMapper {
    int countByExample(IncomeCostsTypeExample example);

    int deleteByExample(IncomeCostsTypeExample example);

    int deleteByPrimaryKey(String ictId);

    int insert(IncomeCostsType record);

    int insertSelective(IncomeCostsType record);

    List<IncomeCostsType> selectByExample(IncomeCostsTypeExample example);

    IncomeCostsType selectByPrimaryKey(String ictId);

    int updateByExampleSelective(@Param("record") IncomeCostsType record, @Param("example") IncomeCostsTypeExample example);

    int updateByExample(@Param("record") IncomeCostsType record, @Param("example") IncomeCostsTypeExample example);

    int updateByPrimaryKeySelective(IncomeCostsType record);

    int updateByPrimaryKey(IncomeCostsType record);
}