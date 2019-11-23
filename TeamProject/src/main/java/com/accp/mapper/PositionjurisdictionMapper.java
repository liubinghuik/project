package com.accp.mapper;

import com.accp.domain.Positionjurisdiction;
import com.accp.domain.PositionjurisdictionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionjurisdictionMapper {
    int countByExample(PositionjurisdictionExample example);

    int deleteByExample(PositionjurisdictionExample example);

    int deleteByPrimaryKey(Integer pjid);

    int insert(Positionjurisdiction record);

   

    List<Positionjurisdiction> selectByExample(PositionjurisdictionExample example);

    Positionjurisdiction selectByPrimaryKey(Integer pjid);

    int updateByExampleSelective(@Param("record") Positionjurisdiction record, @Param("example") PositionjurisdictionExample example);

    int updateByExample(@Param("record") Positionjurisdiction record, @Param("example") PositionjurisdictionExample example);

    int updateByPrimaryKeySelective(Positionjurisdiction record);

    int updateByPrimaryKey(Positionjurisdiction record);
    
	/* 新增 */
    int insertSelective(Positionjurisdiction record);

	/* 修改and删除 */
    int deletepositionjurisdictionBypid(int pid);
 
}