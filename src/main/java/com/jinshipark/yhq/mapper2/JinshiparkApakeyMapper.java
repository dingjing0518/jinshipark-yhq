package com.jinshipark.yhq.mapper2;

import com.jinshipark.yhq.model.JinshiparkApakey;
import com.jinshipark.yhq.model.JinshiparkApakeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JinshiparkApakeyMapper {
    long countByExample(JinshiparkApakeyExample example);

    int deleteByExample(JinshiparkApakeyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JinshiparkApakey record);

    int insertSelective(JinshiparkApakey record);

    List<JinshiparkApakey> selectByExample(JinshiparkApakeyExample example);

    JinshiparkApakey selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JinshiparkApakey record, @Param("example") JinshiparkApakeyExample example);

    int updateByExample(@Param("record") JinshiparkApakey record, @Param("example") JinshiparkApakeyExample example);

    int updateByPrimaryKeySelective(JinshiparkApakey record);

    int updateByPrimaryKey(JinshiparkApakey record);
}