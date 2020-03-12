package com.accp.mapper;

import com.accp.domain.PurchaseInquiry;
import com.accp.domain.PurchaseInquiryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseInquiryMapper {
    int countByExample(PurchaseInquiryExample example);

    int deleteByExample(PurchaseInquiryExample example);

    int deleteByPrimaryKey(String piId);

    int insert(PurchaseInquiry record);

    int insertSelective(PurchaseInquiry record);

    List<PurchaseInquiry> selectByExample(PurchaseInquiryExample example);

    PurchaseInquiry selectByPrimaryKey(String piId);

    int updateByExampleSelective(@Param("record") PurchaseInquiry record, @Param("example") PurchaseInquiryExample example);

    int updateByExample(@Param("record") PurchaseInquiry record, @Param("example") PurchaseInquiryExample example);

    int updateByPrimaryKeySelective(PurchaseInquiry record);

    int updateByPrimaryKey(PurchaseInquiry record);
}