package com.accp.mapper;

import com.accp.domain.TPurchaseInquiryDetails;
import com.accp.domain.TPurchaseInquiryDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPurchaseInquiryDetailsMapper {
    int countByExample(TPurchaseInquiryDetailsExample example);

    int deleteByExample(TPurchaseInquiryDetailsExample example);

    int deleteByPrimaryKey(String serno);

    int insert(TPurchaseInquiryDetails record);

    int insertSelective(TPurchaseInquiryDetails record);

    List<TPurchaseInquiryDetails> selectByExample(TPurchaseInquiryDetailsExample example);

    TPurchaseInquiryDetails selectByPrimaryKey(String serno);

    int updateByExampleSelective(@Param("record") TPurchaseInquiryDetails record, @Param("example") TPurchaseInquiryDetailsExample example);

    int updateByExample(@Param("record") TPurchaseInquiryDetails record, @Param("example") TPurchaseInquiryDetailsExample example);

    int updateByPrimaryKeySelective(TPurchaseInquiryDetails record);

    int updateByPrimaryKey(TPurchaseInquiryDetails record);
}