package com.accp.mapper;

import com.accp.domain.Modelposition;
import com.accp.domain.ModelpositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelpositionMapper {
    int countByExample(ModelpositionExample example);

    int deleteByExample(ModelpositionExample example);

    int deleteByPrimaryKey(Integer mpid);

    int insert(Modelposition record);

    int insertSelective(Modelposition record);

    List<Modelposition> selectByExample(ModelpositionExample example);

    Modelposition selectByPrimaryKey(Integer mpid);

    int updateByExampleSelective(@Param("record") Modelposition record, @Param("example") ModelpositionExample example);

    int updateByExample(@Param("record") Modelposition record, @Param("example") ModelpositionExample example);

    int updateByPrimaryKeySelective(Modelposition record);

    int updateByPrimaryKey(Modelposition record);
    int insertmodelposition(Modelposition modelposition);
    int deletemodelposition(int pid);

}