package com.accp.mapper;

import com.accp.domain.SupplierMain;
import com.accp.domain.SupplierMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierMainMapper {
    int countByExample(SupplierMainExample example);

    int deleteByExample(SupplierMainExample example);

    int deleteByPrimaryKey(Integer smid);

    int insert(SupplierMain record);

    int insertSelective(SupplierMain record);

    List<SupplierMain> selectByExample(SupplierMainExample example);

    SupplierMain selectByPrimaryKey(Integer smid);

    int updateByExampleSelective(@Param("record") SupplierMain record, @Param("example") SupplierMainExample example);

    int updateByExample(@Param("record") SupplierMain record, @Param("example") SupplierMainExample example);

    int updateByPrimaryKeySelective(SupplierMain record);

    int updateByPrimaryKey(SupplierMain record);
}