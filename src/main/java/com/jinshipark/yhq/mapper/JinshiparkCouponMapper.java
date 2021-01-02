package com.jinshipark.yhq.mapper;

import com.jinshipark.yhq.model.JinshiparkCoupon;
import com.jinshipark.yhq.model.JinshiparkCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JinshiparkCouponMapper {
    long countByExample(JinshiparkCouponExample example);

    int deleteByExample(JinshiparkCouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JinshiparkCoupon record);

    int insertSelective(JinshiparkCoupon record);

    List<JinshiparkCoupon> selectByExample(JinshiparkCouponExample example);

    JinshiparkCoupon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JinshiparkCoupon record, @Param("example") JinshiparkCouponExample example);

    int updateByExample(@Param("record") JinshiparkCoupon record, @Param("example") JinshiparkCouponExample example);

    int updateByPrimaryKeySelective(JinshiparkCoupon record);

    int updateByPrimaryKey(JinshiparkCoupon record);

    int updateCount(JinshiparkCoupon record);
}