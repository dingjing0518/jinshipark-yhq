package com.jinshipark.yhq.mapper;

import com.jinshipark.yhq.model.JinshiparkCouponOrder;
import com.jinshipark.yhq.model.JinshiparkCouponOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JinshiparkCouponOrderMapper {
    long countByExample(JinshiparkCouponOrderExample example);

    int deleteByExample(JinshiparkCouponOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JinshiparkCouponOrder record);

    int insertSelective(JinshiparkCouponOrder record);

    List<JinshiparkCouponOrder> selectByExample(JinshiparkCouponOrderExample example);

    JinshiparkCouponOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JinshiparkCouponOrder record, @Param("example") JinshiparkCouponOrderExample example);

    int updateByExample(@Param("record") JinshiparkCouponOrder record, @Param("example") JinshiparkCouponOrderExample example);

    int updateByPrimaryKeySelective(JinshiparkCouponOrder record);

    int updateByPrimaryKey(JinshiparkCouponOrder record);
}