package com.accp.mapper;

import com.accp.domain.Payables;
import com.accp.domain.PayablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayablesMapper {
    int countByExample(PayablesExample example);

    int deleteByExample(PayablesExample example);

    int deleteByPrimaryKey(String payablesId);

    int insert(Payables record);

    int insertSelective(Payables record);

    List<Payables> selectByExample(PayablesExample example);

    Payables selectByPrimaryKey(String payablesId);

    int updateByExampleSelective(@Param("record") Payables record, @Param("example") PayablesExample example);

    int updateByExample(@Param("record") Payables record, @Param("example") PayablesExample example);

    int updateByPrimaryKeySelective(Payables record);

    int updateByPrimaryKey(Payables record);
}