package com.jinshipark.yhq.mapper;

import com.jinshipark.yhq.model.JinshiparkCouponOrderHistory;
import com.jinshipark.yhq.model.JinshiparkCouponOrderHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JinshiparkCouponOrderHistoryMapper {
    long countByExample(JinshiparkCouponOrderHistoryExample example);

    int deleteByExample(JinshiparkCouponOrderHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JinshiparkCouponOrderHistory record);

    int insertSelective(JinshiparkCouponOrderHistory record);

    List<JinshiparkCouponOrderHistory> selectByExample(JinshiparkCouponOrderHistoryExample example);

    JinshiparkCouponOrderHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JinshiparkCouponOrderHistory record, @Param("example") JinshiparkCouponOrderHistoryExample example);

    int updateByExample(@Param("record") JinshiparkCouponOrderHistory record, @Param("example") JinshiparkCouponOrderHistoryExample example);

    int updateByPrimaryKeySelective(JinshiparkCouponOrderHistory record);

    int updateByPrimaryKey(JinshiparkCouponOrderHistory record);
}