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
}
