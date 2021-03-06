package com.accp.mapper;

import com.accp.domain.Memberclass;
import com.accp.domain.Model;
import com.accp.domain.ModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelMapper {
	
    int countByExample(ModelExample example);

    int deleteByExample(ModelExample example);

    int deleteByPrimaryKey(Integer moid);

    int insert(Model record);

    int insertSelective(Model record);

    List<Model> selectByExample(ModelExample example);

    Model selectByPrimaryKey(Integer moid);

    int updateByExampleSelective(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByExample(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
    
    List<Model> selectModelAll();

}