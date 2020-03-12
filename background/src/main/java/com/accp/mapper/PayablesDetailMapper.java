package com.accp.mapper;

import com.accp.domain.PayablesDetail;
import com.accp.domain.PayablesDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayablesDetailMapper {
    int countByExample(PayablesDetailExample example);

    int deleteByExample(PayablesDetailExample example);

    int deleteByPrimaryKey(String paydetailId);

    int insert(PayablesDetail record);

    int insertSelective(PayablesDetail record);

    List<PayablesDetail> selectByExample(PayablesDetailExample example);

    PayablesDetail selectByPrimaryKey(String paydetailId);

    int updateByExampleSelective(@Param("record") PayablesDetail record, @Param("example") PayablesDetailExample example);

    int updateByExample(@Param("record") PayablesDetail record, @Param("example") PayablesDetailExample example);

    int updateByPrimaryKeySelective(PayablesDetail record);

    int updateByPrimaryKey(PayablesDetail record);
}