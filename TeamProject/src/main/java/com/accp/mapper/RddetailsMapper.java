package com.accp.mapper;

import com.accp.domain.Rddetails;
import com.accp.domain.RddetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RddetailsMapper {
    int countByExample(RddetailsExample example);

    int deleteByExample(RddetailsExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Rddetails record);

    int insertSelective(Rddetails record);

    List<Rddetails> selectByExample(RddetailsExample example);

    Rddetails selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Rddetails record, @Param("example") RddetailsExample example);

    int updateByExample(@Param("record") Rddetails record, @Param("example") RddetailsExample example);

    int updateByPrimaryKeySelective(Rddetails record);

    int updateByPrimaryKey(Rddetails record);
}