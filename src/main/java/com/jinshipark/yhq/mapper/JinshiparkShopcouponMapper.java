package com.jinshipark.yhq.mapper;

import com.jinshipark.yhq.model.JinshiparkShopcoupon;
import com.jinshipark.yhq.model.JinshiparkShopcouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JinshiparkShopcouponMapper {
    long countByExample(JinshiparkShopcouponExample example);

    int deleteByExample(JinshiparkShopcouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JinshiparkShopcoupon record);

    int insertSelective(JinshiparkShopcoupon record);

    List<JinshiparkShopcoupon> selectByExample(JinshiparkShopcouponExample example);

    JinshiparkShopcoupon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JinshiparkShopcoupon record, @Param("example") JinshiparkShopcouponExample example);

    int updateByExample(@Param("record") JinshiparkShopcoupon record, @Param("example") JinshiparkShopcouponExample example);

    int updateByPrimaryKeySelective(JinshiparkShopcoupon record);

    int updateByPrimaryKey(JinshiparkShopcoupon record);
}