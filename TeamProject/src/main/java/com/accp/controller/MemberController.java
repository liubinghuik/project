package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Member;
import com.accp.domain.Memberclass;

import com.accp.service.MemberService;

import ch.qos.logback.core.pattern.parser.Parser;

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
	//新增会员insertMember
	@RequestMapping(value = "insertMember", method = RequestMethod.POST)
	@ResponseBody
	public int insertMember(@RequestBody Member m) {
		return ms.insertMember(m);
	}
	//查询指定会员信息
	@RequestMapping(value = "selectMember", method = RequestMethod.GET)
	@ResponseBody
	public Member selectMember(Integer id) {
		return ms.selectMember(id);
	}
	//编辑会员
	@RequestMapping(value = "updateMember", method = RequestMethod.POST)
	@ResponseBody
	public int updateMember(@RequestBody Member m) {
		return ms.updateMember(m);
	}
	//导出所有会员信息到Excel
	@RequestMapping("/exportExcel")
	@ResponseBody
	public ResponseEntity<byte []> exportExcel(String ids){
		String [] sid=ids.split(",");
		List<Member> lm = new ArrayList<Member>();
		for(String s:sid) {
			 Integer i = new Integer(s);
	         int x = i.intValue();
	        
			lm.add(ms.selectMemberById(x));
		}
		//导出学生信息为excel
		/*
		 * Workbook wb = new XSSFWorkbook(); Sheet sheet = wb.createSheet();
		 */
		 
		return null;
	}
	
	
}
