package com.accp.mapper;

import com.accp.domain.ReceivableDetail;
import com.accp.domain.ReceivableDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceivableDetailMapper {
    int countByExample(ReceivableDetailExample example);

    int deleteByExample(ReceivableDetailExample example);

    int insert(ReceivableDetail record);

    int insertSelective(ReceivableDetail record);

    List<ReceivableDetail> selectByExample(ReceivableDetailExample example);

    int updateByExampleSelective(@Param("record") ReceivableDetail record, @Param("example") ReceivableDetailExample example);

    int updateByExample(@Param("record") ReceivableDetail record, @Param("example") ReceivableDetailExample example);
}