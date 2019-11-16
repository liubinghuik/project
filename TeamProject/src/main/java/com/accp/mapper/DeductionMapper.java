package com.accp.mapper;

import com.accp.domain.Deduction;
import com.accp.domain.DeductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeductionMapper {
    int countByExample(DeductionExample example);

    int deleteByExample(DeductionExample example);

    int deleteByPrimaryKey(Integer ddid);

    int insert(Deduction record);

    int insertSelective(Deduction record);

    List<Deduction> selectByExample(DeductionExample example);

    Deduction selectByPrimaryKey(Integer ddid);

    int updateByExampleSelective(@Param("record") Deduction record, @Param("example") DeductionExample example);

    int updateByExample(@Param("record") Deduction record, @Param("example") DeductionExample example);

    int updateByPrimaryKeySelective(Deduction record);

    int updateByPrimaryKey(Deduction record);
}