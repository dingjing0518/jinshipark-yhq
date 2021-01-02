package com.jinshipark.yhq.mapper2;

import com.jinshipark.yhq.model.LincensePlate;
import com.jinshipark.yhq.model.LincensePlateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LincensePlateMapper {
    long countByExample(LincensePlateExample example);

    int deleteByExample(LincensePlateExample example);

    int deleteByPrimaryKey(Integer lpId);

    int insert(LincensePlate record);

    int insertSelective(LincensePlate record);

    List<LincensePlate> selectByExample(LincensePlateExample example);

    LincensePlate selectByPrimaryKey(Integer lpId);

    int updateByExampleSelective(@Param("record") LincensePlate record, @Param("example") LincensePlateExample example);

    int updateByExample(@Param("record") LincensePlate record, @Param("example") LincensePlateExample example);

    int updateByPrimaryKeySelective(LincensePlate record);

    int updateByPrimaryKey(LincensePlate record);
}