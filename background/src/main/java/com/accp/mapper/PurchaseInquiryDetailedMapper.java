package com.accp.mapper;

import com.accp.domain.PurchaseInquiryDetailed;
import com.accp.domain.PurchaseInquiryDetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseInquiryDetailedMapper {
    int countByExample(PurchaseInquiryDetailedExample example);

    int deleteByExample(PurchaseInquiryDetailedExample example);

    int deleteByPrimaryKey(String didId);

    int insert(PurchaseInquiryDetailed record);

    int insertSelective(PurchaseInquiryDetailed record);

    List<PurchaseInquiryDetailed> selectByExample(PurchaseInquiryDetailedExample example);

    PurchaseInquiryDetailed selectByPrimaryKey(String didId);

    int updateByExampleSelective(@Param("record") PurchaseInquiryDetailed record, @Param("example") PurchaseInquiryDetailedExample example);

    int updateByExample(@Param("record") PurchaseInquiryDetailed record, @Param("example") PurchaseInquiryDetailedExample example);

    int updateByPrimaryKeySelective(PurchaseInquiryDetailed record);

    int updateByPrimaryKey(PurchaseInquiryDetailed record);
}