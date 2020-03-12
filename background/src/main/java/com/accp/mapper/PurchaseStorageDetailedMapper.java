package com.accp.mapper;

import com.accp.domain.PurchaseStorageDetailed;
import com.accp.domain.PurchaseStorageDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseStorageDetailedMapper {
    int countByExample(PurchaseStorageDetailedExample example);

    int deleteByExample(PurchaseStorageDetailedExample example);

    int deleteByPrimaryKey(String psdId);

    int insert(PurchaseStorageDetailed record);

    int insertSelective(PurchaseStorageDetailed record);

    List<PurchaseStorageDetailed> selectByExample(PurchaseStorageDetailedExample example);

    PurchaseStorageDetailed selectByPrimaryKey(String psdId);

    int updateByExampleSelective(@Param("record") PurchaseStorageDetailed record, @Param("example") PurchaseStorageDetailedExample example);

    int updateByExample(@Param("record") PurchaseStorageDetailed record, @Param("example") PurchaseStorageDetailedExample example);

    int updateByPrimaryKeySelective(PurchaseStorageDetailed record);

    int updateByPrimaryKey(PurchaseStorageDetailed record);
}