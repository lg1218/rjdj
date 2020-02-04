package com.accp.mapper;

import com.accp.domain.TaxItems;
import com.accp.domain.TaxItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaxItemsMapper {
    int countByExample(TaxItemsExample example);

    int deleteByExample(TaxItemsExample example);

    int deleteByPrimaryKey(Integer tiId);

    int insert(TaxItems record);

    int insertSelective(TaxItems record);

    List<TaxItems> selectByExample(TaxItemsExample example);

    TaxItems selectByPrimaryKey(Integer tiId);

    int updateByExampleSelective(@Param("record") TaxItems record, @Param("example") TaxItemsExample example);

    int updateByExample(@Param("record") TaxItems record, @Param("example") TaxItemsExample example);

    int updateByPrimaryKeySelective(TaxItems record);

    int updateByPrimaryKey(TaxItems record);
}