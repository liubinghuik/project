package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	//4.添加等级
	@RequestMapping(value = "insertClass", method = RequestMethod.POST)
	@ResponseBody
	public int insertClass(@RequestBody Memberclass mb) {
		
		return ms.insertClass(mb);
	}
	//5.修改等级
	@RequestMapping(value = "updateClass", method = RequestMethod.POST)
	@ResponseBody
	public int updateClass(@RequestBody Memberclass mb) {
		return ms.updateClass(mb);
	}
	//软删除等级
	@RequestMapping(value = "deleteClass1", method = RequestMethod.POST)
	@ResponseBody
	int deleteClass1(Integer id) {
		
		return ms.deleteClass1(id);
	}
	//硬删除等级
	@RequestMapping(value = "deleteClass2", method = RequestMethod.POST)
	@ResponseBody
	public int deleteClass2(Integer id) {
		return ms.deleteClass2(id);
	}
	//恢复删除的会员等级
	@RequestMapping(value = "updateHuiFu", method = RequestMethod.POST)
	@ResponseBody
	public int updateHuiFu(Integer id) {
		return ms.updateHuiFu(id);
	}
}
