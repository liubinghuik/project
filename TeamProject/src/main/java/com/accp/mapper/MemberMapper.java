package com.accp.mapper;

import com.accp.domain.Member;
import com.accp.domain.MemberExample;
import com.accp.domain.Memberclass;

import com.accp.service.MemberService;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
	//查询等级
	List<Memberclass> selectMemberClass();
	Memberclass selectMemberLevel(int id);
	List<Member> selectAllMember(String mname);
	//添加等级
	int insertClass(Memberclass mb);
	//修改等级
	int updateClass(Memberclass mb);
	//软删除等级
	int deleteClass1(Integer id);
	//硬删除等级
	int deleteClass2(Integer id);
	//恢复删除的会员等级
	int updateHuiFu(Integer id);
	
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