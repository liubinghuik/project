package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import com.accp.domain.Recharge;
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
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet();
		 
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("会员编号");
		titleRow.createCell(1).setCellValue("会员姓名");
		titleRow.createCell(2).setCellValue("会员密码");
		titleRow.createCell(3).setCellValue("会员电话");
		titleRow.createCell(4).setCellValue("成交金额");
		titleRow.createCell(5).setCellValue("余额");
		titleRow.createCell(6).setCellValue("会员积分");
		titleRow.createCell(7).setCellValue("微信号");
		titleRow.createCell(8).setCellValue("省份");
		titleRow.createCell(9).setCellValue("城市");
		titleRow.createCell(10).setCellValue("地区");
		titleRow.createCell(1).setCellValue("街道");
		titleRow.createCell(12).setCellValue("创建时间");
		titleRow.createCell(13).setCellValue("会员编号");
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<lm.size();i++) {
			Row row = sheet.createRow(i+1);
			
			
			Cell MidCell = row.createCell(0);
			MidCell.setCellValue(lm.get(i).getMid());
			Cell MnameCell = row.createCell(1);
			MnameCell.setCellValue(lm.get(i).getMname());
			Cell MpasswordCell = row.createCell(2);
			MpasswordCell.setCellValue(lm.get(i).getMpassword());
			Cell MphoneCell = row.createCell(3);
			MphoneCell.setCellValue(lm.get(i).getMphone());
			Cell MmoneyCell = row.createCell(4);
			MmoneyCell.setCellValue(lm.get(i).getMmoney());
			Cell MbalanceCell = row.createCell(5);
			MbalanceCell.setCellValue(lm.get(i).getMbalance());
			Cell MintegralCell = row.createCell(6);
			MintegralCell.setCellValue(lm.get(i).getMintegral());
			Cell WechatidCell = row.createCell(7);
			WechatidCell.setCellValue(lm.get(i).getWechatid());
			Cell ProvincenameCell = row.createCell(8);
			ProvincenameCell.setCellValue(lm.get(i).getProvincename());
			Cell CitynameCell = row.createCell(9);
			CitynameCell.setCellValue(lm.get(i).getCityname());
			Cell RegionnameCell = row.createCell(10);
			RegionnameCell.setCellValue(lm.get(i).getRegionname());
			Cell StreetCell = row.createCell(11);
			StreetCell.setCellValue(lm.get(i).getStreet());
			
			
			
			
			
			Cell CreatetimeCell = row.createCell(12);
			if(lm.get(i).getCreatetime()!=null) {
				CreatetimeCell.setCellValue(f.format(lm.get(i).getCreatetime()));
			}
			Cell McidCell = row.createCell(13);
			McidCell.setCellValue(lm.get(i).getMcid());
			
		}
		HttpHeaders headers = new HttpHeaders();
		ByteArrayOutputStream bot = new ByteArrayOutputStream();
		try {
			wb.write(bot);
			
			headers.setContentDispositionFormData("attachment", new String("导出的会员信息.xlsx".getBytes("utf-8"),"iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<byte[]>(bot.toByteArray(), headers, HttpStatus.OK);
	}
	//查询积分设置是否关闭
	@RequestMapping(value = "selectDeduction", method = RequestMethod.GET)
	@ResponseBody
	public int selectDeduction() {
		return ms.selectDeduction();
	}
	//设置积分是否可用
	@RequestMapping(value = "updateDeduction", method = RequestMethod.POST)
	@ResponseBody
	public int updateDeduction(int wtd) {
		return ms.updateDeduction(wtd);
	}
	//设置多少积分可抵一元
	@RequestMapping(value = "updateDeductionJF", method = RequestMethod.POST)
	@ResponseBody
	public int updateDeductionJF(int Jf) {
		return ms.updateDeductionJF(Jf);
	}
	//查询现有的积分
	@RequestMapping(value = "selectDeductionJf", method = RequestMethod.GET)
	@ResponseBody
	public int selectDeductionJf() {
		return ms.selectDeductionJf();
	}
	//将金额充值到会员表余额
	@RequestMapping(value = "updateMoney", method = RequestMethod.POST)
	@ResponseBody
	public int updateMoney(@RequestBody Recharge r) {
		Member m=new Member(r.getMid(),r.getRemoney());
		return ms.updateMoney(m);
	}
	//将充值记录录入到充值表
	@RequestMapping(value = "insertRecharge", method = RequestMethod.POST)
	@ResponseBody
	public int insertRecharge(@RequestBody Recharge c) {
		return ms.insertRecharge(c);
	}
	
}
