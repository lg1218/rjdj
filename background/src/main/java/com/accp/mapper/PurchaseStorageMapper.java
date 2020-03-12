package com.accp.mapper;

import com.accp.domain.PurchaseStorage;
import com.accp.domain.PurchaseStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PurchaseStorageMapper {
    int countByExample(PurchaseStorageExample example);

    int deleteByExample(PurchaseStorageExample example);

    int deleteByPrimaryKey(String psId);

    int insert(PurchaseStorage record);

    int insertSelective(PurchaseStorage record);

    List<PurchaseStorage> selectByExample(PurchaseStorageExample example);

    PurchaseStorage selectByPrimaryKey(String psId);

    int updateByExampleSelective(@Param("record") PurchaseStorage record, @Param("example") PurchaseStorageExample example);

    int updateByExample(@Param("record") PurchaseStorage record, @Param("example") PurchaseStorageExample example);

    int updateByPrimaryKeySelective(PurchaseStorage record);

    int updateByPrimaryKey(PurchaseStorage record);

    //查询日期最大的id
    int selectMaxpsId();
}