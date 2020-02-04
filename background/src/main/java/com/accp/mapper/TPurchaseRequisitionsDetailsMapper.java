package com.accp.mapper;

import com.accp.domain.TPurchaseRequisitionsDetails;
import com.accp.domain.TPurchaseRequisitionsDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPurchaseRequisitionsDetailsMapper {
    int countByExample(TPurchaseRequisitionsDetailsExample example);

    int deleteByExample(TPurchaseRequisitionsDetailsExample example);

    int insert(TPurchaseRequisitionsDetails record);

    int insertSelective(TPurchaseRequisitionsDetails record);

    List<TPurchaseRequisitionsDetails> selectByExample(TPurchaseRequisitionsDetailsExample example);

    int updateByExampleSelective(@Param("record") TPurchaseRequisitionsDetails record, @Param("example") TPurchaseRequisitionsDetailsExample example);

    int updateByExample(@Param("record") TPurchaseRequisitionsDetails record, @Param("example") TPurchaseRequisitionsDetailsExample example);
}