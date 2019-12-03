package com.accp.mapper;

import com.accp.domain.Position;
import com.accp.domain.PositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionMapper {
    int countByExample(PositionExample example);

    int deleteByExample(PositionExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Position record);

    int insertSelective(Position record);

    List<Position> selectByExample(PositionExample example);

    Position selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByExample(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
    //查询所有职位
    List<Position> selectPositionAll();
    int insertpositionBypname(String name);
    Position selectpositionBypname(String name);
    Position selectpositionBypid(int pid);
    int updatepositionBypid(Position position);
    int deletepositionBypid(int pid);

}