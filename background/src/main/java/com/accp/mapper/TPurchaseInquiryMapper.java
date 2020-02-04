package com.accp.mapper;

import com.accp.domain.TPurchaseInquiry;
import com.accp.domain.TPurchaseInquiryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPurchaseInquiryMapper {
    int countByExample(TPurchaseInquiryExample example);

    int deleteByExample(TPurchaseInquiryExample example);

    int deleteByPrimaryKey(String billno);

    int insert(TPurchaseInquiry record);

    int insertSelective(TPurchaseInquiry record);

    List<TPurchaseInquiry> selectByExample(TPurchaseInquiryExample example);

    TPurchaseInquiry selectByPrimaryKey(String billno);

    int updateByExampleSelective(@Param("record") TPurchaseInquiry record, @Param("example") TPurchaseInquiryExample example);

    int updateByExample(@Param("record") TPurchaseInquiry record, @Param("example") TPurchaseInquiryExample example);

    int updateByPrimaryKeySelective(TPurchaseInquiry record);

    int updateByPrimaryKey(TPurchaseInquiry record);
}