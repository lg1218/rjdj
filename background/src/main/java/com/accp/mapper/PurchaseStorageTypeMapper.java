package com.accp.mapper;

import com.accp.domain.PurchaseStorageType;
import com.accp.domain.PurchaseStorageTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseStorageTypeMapper {
    int countByExample(PurchaseStorageTypeExample example);

    int deleteByExample(PurchaseStorageTypeExample example);

    int deleteByPrimaryKey(String pstId);

    int insert(PurchaseStorageType record);

    int insertSelective(PurchaseStorageType record);

    List<PurchaseStorageType> selectByExample(PurchaseStorageTypeExample example);

    PurchaseStorageType selectByPrimaryKey(String pstId);

    int updateByExampleSelective(@Param("record") PurchaseStorageType record, @Param("example") PurchaseStorageTypeExample example);

    int updateByExample(@Param("record") PurchaseStorageType record, @Param("example") PurchaseStorageTypeExample example);

    int updateByPrimaryKeySelective(PurchaseStorageType record);

    int updateByPrimaryKey(PurchaseStorageType record);
}