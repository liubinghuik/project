package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Member;
import com.accp.domain.Memberclass;
import com.accp.mapper.MemberMapper;

@Service
@Transactional
public class MemberService {
	@Autowired
	MemberMapper mp;
	public List<Member> SelectMemberInfo(){
		return mp.selectByExample(null);
	}
	public List<Memberclass> selectMemberClass(){
		return mp.selectMemberClass();
	}
	public Memberclass selectMemberLevel(int id) {
		return mp.selectMemberLevel(id);
	}
	public List<Member> selectAllMember(String mname){
		return mp.selectAllMember(mname);
	}
	//添加等级
	public int insertClass(Memberclass mb) {
		return mp.insertClass(mb);
	}
	//修改等级
	public int updateClass(Memberclass mb) {
		return mp.updateClass(mb);
	}
	//软删除等级
	public int deleteClass1(Integer id) {
		return mp.deleteClass1(id);
	}
	//硬删除等级
	public int deleteClass2(Integer id) {
		return mp.deleteClass2(id);
	}
	//恢复删除的会员等级
	public int updateHuiFu(Integer id) {
		return mp.updateHuiFu(id);
	}
	//新增会员
	public int insertMember(Member m) {
		return mp.insertMember(m);
	}
	//查询指定会员信息
	public Member selectMember(Integer id) {
		return mp.selectMember(id);
	}
	//编辑会员
	public int updateMember(Member m) {
		return mp.updateMember(m);
	}
	//按编号查询会员
	public Member selectMemberById(int id) {
		return mp.selectMemberById(id);
	}
}
