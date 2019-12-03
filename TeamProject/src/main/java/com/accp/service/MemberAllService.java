package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.MemberAll;
import com.accp.mapper.MemberAllMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional
public class MemberAllService {
	@Autowired
	MemberAllMapper memberallmapper;
	//查询所有会员
	public PageInfo<MemberAll> selectmember(int pageNum){
		PageHelper.startPage(pageNum, 10);
		List<MemberAll> list=memberallmapper.selectmember();
		PageInfo<MemberAll> page=new PageInfo<>(list);
		return page;
	}
	//新增成交记录详情
	public int insertrddetails(MemberAll memberall) {
		return memberallmapper.insertrddetails(memberall);
	}
	//新增成交记录
	public int insertrecord(MemberAll memberall) {
		return memberallmapper.insertrecord(memberall);
	}
	//修改状态
	public int updaterecord(String ddh){
		return memberallmapper.updaterecord(ddh);
	}
	//修改会员积分
	public int updatememberjf(MemberAll memberall) {
		return memberallmapper.updatememberjf(memberall);
	}
	
	
}
