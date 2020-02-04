package com.accp.mapper;

import com.accp.domain.QTakeprepay;
import com.accp.domain.QTakeprepayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QTakeprepayMapper {
    int countByExample(QTakeprepayExample example);

    int deleteByExample(QTakeprepayExample example);

    int insert(QTakeprepay record);

    int insertSelective(QTakeprepay record);

    List<QTakeprepay> selectByExample(QTakeprepayExample example);

    int updateByExampleSelective(@Param("record") QTakeprepay record, @Param("example") QTakeprepayExample example);

    int updateByExample(@Param("record") QTakeprepay record, @Param("example") QTakeprepayExample example);
}