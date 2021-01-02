package com.jinshipark.yhq.mapper;

import com.jinshipark.yhq.model.JinshiparkShop;
import com.jinshipark.yhq.model.JinshiparkShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JinshiparkShopMapper {
    long countByExample(JinshiparkShopExample example);

    int deleteByExample(JinshiparkShopExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JinshiparkShop record);

    int insertSelective(JinshiparkShop record);

    List<JinshiparkShop> selectByExample(JinshiparkShopExample example);

    JinshiparkShop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JinshiparkShop record, @Param("example") JinshiparkShopExample example);

    int updateByExample(@Param("record") JinshiparkShop record, @Param("example") JinshiparkShopExample example);

    int updateByPrimaryKeySelective(JinshiparkShop record);

    int updateByPrimaryKey(JinshiparkShop record);
}