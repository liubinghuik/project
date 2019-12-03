package com.accp.mapper;

import com.accp.domain.Size;
import com.accp.domain.SizeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SizeMapper {
    int countByExample(SizeExample example);

    int deleteByExample(SizeExample example);

    int deleteByPrimaryKey(Integer sizeid);

    int insert(Size record);

    int insertSelective(Size record);

    List<Size> selectByExample(SizeExample example);

    Size selectByPrimaryKey(Integer sizeid);

    int updateByExampleSelective(@Param("record") Size record, @Param("example") SizeExample example);

    int updateByExample(@Param("record") Size record, @Param("example") SizeExample example);

    int updateByPrimaryKeySelective(Size record);

    int updateByPrimaryKey(Size record);
    
    @Select("select * from size where sizename = #{name}")
    Size querySizeByName(@Param("name")String name);
}