package com.accp.mapper;

import com.accp.domain.NegotiationStage;
import com.accp.domain.NegotiationStageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NegotiationStageMapper {
    int countByExample(NegotiationStageExample example);

    int deleteByExample(NegotiationStageExample example);

    int deleteByPrimaryKey(String nsId);

    int insert(NegotiationStage record);

    int insertSelective(NegotiationStage record);

    List<NegotiationStage> selectByExample(NegotiationStageExample example);

    NegotiationStage selectByPrimaryKey(String nsId);

    int updateByExampleSelective(@Param("record") NegotiationStage record, @Param("example") NegotiationStageExample example);

    int updateByExample(@Param("record") NegotiationStage record, @Param("example") NegotiationStageExample example);

    int updateByPrimaryKeySelective(NegotiationStage record);

    int updateByPrimaryKey(NegotiationStage record);
}