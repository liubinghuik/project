package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Position;
import com.accp.domain.Shop;
import com.accp.domain.ShopAll;
import com.accp.domain.Staff;
import com.accp.domain.User;
import com.accp.service.PositionService;
import com.accp.service.ShopAllService;
import com.accp.service.ShopService;
import com.accp.service.StaffService;
import com.accp.service.UserService;

@Controller
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	StaffService staffservice;
	@Autowired
	ShopService shopservice;
	@Autowired
	PositionService positionservice;
	@Autowired
	ShopAllService shopallservice;
	@Autowired
	UserService userservice;
	
	//加载店铺
	@RequestMapping("/tozjdp")
	@ResponseBody
	public List<Shop> selectShopAll(String account){
		return shopservice.selectShopAll(account);
	}
	//加载职位
	@RequestMapping("/tozjzw")
	@ResponseBody
	public List<Position> selectPositionAll(){
		return positionservice.selectPositionAll();
	}
	//新增员工
	@RequestMapping("/toxzstaff")
	@ResponseBody
	public String insertstaff(@RequestBody Staff staff) {
		//新增员工
		User qq=new User(staff.getJobnumber(),staff.getStpwd(),"15094242006","75518dbba09e4bb796f7a22a3fe594a2!400x400.jpg","服饰");
		if(staffservice.insertstaff(staff)>0) {
			//新增用户
			if(userservice.insertuser(qq)>0) {
				return "0";
			}
		}else {
			return "1";
		}
		return null;
	}
	//根据对应的员工id查询对应的员工信息
	@RequestMapping("/toselectBysid")
	@ResponseBody
	public ShopAll selectStaffBystid(int stid) {
		return shopallservice.selectStaffBystid(stid);
	}
	//修改员工
	@RequestMapping("/toxgstaff")
	@ResponseBody
	public String updatestaff(@RequestBody Staff staff) {
		//根据员工id查询出员工工号
		Staff st=staffservice.selectstaffBystid(staff.getStid());
		/*再根据员工工号查询对应的用户*/
		User uu=userservice.selectUserByuaccount(st.getJobnumber());
		User cc=new User(uu.getUid(),staff.getJobnumber(),staff.getStpwd());
		/* 再修改员工表 */
		if(staffservice.updatestaff(staff)>0) {
			/* 再修改用户表 */
			if(userservice.updateUserByuaccountAndupwd(cc)>0) {
				return "0";
			}
		}else {
			return "1";
		}
		return null;
	}
	//删除员工
	@RequestMapping("/deletestaff")
	@ResponseBody
	public String updatestaffdelete(int stid) {
		//根据员工id查询出员工工号
		Staff st=staffservice.selectstaffBystid(stid);
		/*再根据员工工号查询对应的用户*/
		User uu=userservice.selectUserByuaccount(st.getJobnumber());
		if(staffservice.updatestaffdelete(stid)>0) {
			if(userservice.deleteUser(uu.getUid())>0) {
				return "0";
			}
		}else {
			return "1";
		}
		return null;
	}
}
