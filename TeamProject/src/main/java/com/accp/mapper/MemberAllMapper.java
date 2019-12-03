package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.domain.MemberAll;

public interface MemberAllMapper {
	List<MemberAll> selectmember();
	int insertrddetails(MemberAll memberall);
	int insertrecord(MemberAll memberall);
	int updatememberjf(MemberAll memberall);
	int updaterecord(@Param("ddh")String ddh);
}
