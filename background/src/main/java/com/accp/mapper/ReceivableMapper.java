package com.accp.mapper;

import com.accp.domain.Receivable;
import com.accp.domain.ReceivableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceivableMapper {
    int countByExample(ReceivableExample example);

    int deleteByExample(ReceivableExample example);

    int deleteByPrimaryKey(String receivableId);

    int insert(Receivable record);

    int insertSelective(Receivable record);

    List<Receivable> selectByExample(ReceivableExample example);

    Receivable selectByPrimaryKey(String receivableId);

    int updateByExampleSelective(@Param("record") Receivable record, @Param("example") ReceivableExample example);

    int updateByExample(@Param("record") Receivable record, @Param("example") ReceivableExample example);

    int updateByPrimaryKeySelective(Receivable record);

    int updateByPrimaryKey(Receivable record);
}