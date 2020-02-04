package com.accp.mapper;

import com.accp.domain.KStoreAdjustpriecedetail;
import com.accp.domain.KStoreAdjustpriecedetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KStoreAdjustpriecedetailMapper {
    int countByExample(KStoreAdjustpriecedetailExample example);

    int deleteByExample(KStoreAdjustpriecedetailExample example);

    int deleteByPrimaryKey(Integer apId);

    int insert(KStoreAdjustpriecedetail record);

    int insertSelective(KStoreAdjustpriecedetail record);

    List<KStoreAdjustpriecedetail> selectByExample(KStoreAdjustpriecedetailExample example);

    KStoreAdjustpriecedetail selectByPrimaryKey(Integer apId);

    int updateByExampleSelective(@Param("record") KStoreAdjustpriecedetail record, @Param("example") KStoreAdjustpriecedetailExample example);

    int updateByExample(@Param("record") KStoreAdjustpriecedetail record, @Param("example") KStoreAdjustpriecedetailExample example);

    int updateByPrimaryKeySelective(KStoreAdjustpriecedetail record);

    int updateByPrimaryKey(KStoreAdjustpriecedetail record);
}