package com.accp.mapper;

import com.accp.domain.CashaCcount;
import com.accp.domain.CashaCcountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashaCcountMapper {
    int countByExample(CashaCcountExample example);

    int deleteByExample(CashaCcountExample example);

    int deleteByPrimaryKey(String ccId);

    int insert(CashaCcount record);

    int insertSelective(CashaCcount record);

    List<CashaCcount> selectByExample(CashaCcountExample example);

    CashaCcount selectByPrimaryKey(String ccId);

    int updateByExampleSelective(@Param("record") CashaCcount record, @Param("example") CashaCcountExample example);

    int updateByExample(@Param("record") CashaCcount record, @Param("example") CashaCcountExample example);

    int updateByPrimaryKeySelective(CashaCcount record);

    int updateByPrimaryKey(CashaCcount record);
}