package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Member;
import com.accp.domain.Memberclass;
import com.accp.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	MemberService ms;
	
	
	//会员信息页面
	//1.会员查询
	@RequestMapping("/SelectMemberInfo")
	@ResponseBody
	public List<Member> SelectMemberInfo(/* Model model */) {
		List<Member> list =ms.SelectMemberInfo(); 
		for(int i=0;i<list.size();i++) {
			list.get(i).setMb(ms.selectMemberLevel(list.get(i).getMcid()));
		}
		
		return list;
		
	}
	
	//2.会员等级查询
		@RequestMapping("/selectMemberClass")
		@ResponseBody
		public List<Memberclass> SelectMemberclass() {
			List<Memberclass> list =ms.selectMemberClass(); 
			return list;
		}
	//3.会员查询，模糊查询
	@RequestMapping("/selectAllMember")
	@ResponseBody
	public List<Member> selectAllMember(int vid,String mname){
		
		List<Member> list =ms.selectAllMember(mname);
		
		for(int i=0;i<list.size();i++) {
			
			list.get(i).setMb(ms.selectMemberLevel(list.get(i).getMcid()));
			if(vid!=0) {
				if(list.get(i).getMcid()!=vid) {
					
					list.remove(i);
					i--;
				}
			}
		}
		 
		return list;
	}
}
