package com.accp.mapper;

import com.accp.domain.Member;
import com.accp.domain.MemberExample;
import com.accp.domain.Memberclass;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
	//查询等级
	List<Memberclass> selectMemberClass();
	
	
    int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}