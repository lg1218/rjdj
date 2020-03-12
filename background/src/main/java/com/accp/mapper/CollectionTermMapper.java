package com.accp.mapper;

import com.accp.domain.CollectionTerm;
import com.accp.domain.CollectionTermExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectionTermMapper {
    int countByExample(CollectionTermExample example);

    int deleteByExample(CollectionTermExample example);

    int deleteByPrimaryKey(String coteId);

    int insert(CollectionTerm record);

    int insertSelective(CollectionTerm record);

    List<CollectionTerm> selectByExample(CollectionTermExample example);

    CollectionTerm selectByPrimaryKey(String coteId);

    int updateByExampleSelective(@Param("record") CollectionTerm record, @Param("example") CollectionTermExample example);

    int updateByExample(@Param("record") CollectionTerm record, @Param("example") CollectionTermExample example);

    int updateByPrimaryKeySelective(CollectionTerm record);

    int updateByPrimaryKey(CollectionTerm record);
}