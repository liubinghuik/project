package com.accp.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.ShopAll;
import com.accp.domain.Staff;
import com.accp.domain.User;
import com.accp.service.ShopAllService;
import com.accp.service.StaffService;
import com.accp.service.UserService;
import com.accp.util.ImageUtil;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userservice;
	@Autowired
	ShopAllService shopallservice;
	@Autowired
	StaffService staffservice;
	
	@RequestMapping("/GetImage")
	public void GetImage(HttpServletResponse response,HttpServletRequest request) throws IOException {
		response.setContentType("image/jpeg");
        //禁止图像缓存
        response.setHeader("Pragma","no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        HttpSession session = request.getSession();
        ImageUtil imageUtil = new ImageUtil(120, 40, 5,30);
        //code为session中保存的验证码
        session.setAttribute("code", imageUtil.getCode());
        imageUtil.write(response.getOutputStream());
	}

	//登录验证
		@RequestMapping("/logins")
		@ResponseBody
		public String logins(String uaccount,String upwd,String yzm,HttpSession session) {
			User uu=new User(uaccount,upwd);
			User user=userservice.selectUserByaccountAndPwd(uu);
			if(user!=null) {
				String code = (String) session.getAttribute("code");
				if(yzm.equals(code)) {
					List<ShopAll> shopall=shopallservice.selectShopAllByjobnumber(uaccount);
					session.setAttribute("zwdqx", shopall);
					session.setAttribute("user", user);
					return "0";
				}else{
					return "1";
				}
			}else {
				return "2";
			}
		}
		//查询用户 权限
		@RequestMapping("/cxcsope")
		@ResponseBody
		public List<ShopAll> selectsope(HttpSession session) {
			List<ShopAll> shopall=(List<ShopAll>) session.getAttribute("zwdqx");
			return shopall;
		}
		//修改用户信息
		@RequestMapping("/toupdate")
		@ResponseBody
		public String toupdate(@RequestBody User uu,HttpSession session){
			//根据uid查询uname
			User qq=userservice.selectUserByuid(uu.getUid());
			/*再根据uname查出对应的员工表*/
			Staff st= staffservice.selectstaffByjobnumber(qq.getUaccount());
			/*再修改账户信息*/
			Staff vv=new Staff(st.getStid(),uu.getUaccount(),uu.getUpwd());
		  if(userservice.updateUserByuidxx(uu)>0) {
			  if(staffservice.updateByPrimaryKeySelective(vv)>0) {
				  User user=userservice.selectUserByuid(uu.getUid());
				  session.setAttribute("user",user);
				  return "0";
			  }
		  }else { 
			  return "1"; 
		  }
		return null;
		}
		//修改用户头像(文件上传)
		@RequestMapping("/upload")
		@ResponseBody
		public String upload(HttpSession session,MultipartFile file,int id){
			File directory = new File("/D:/git/tupian");
			if(!directory.exists()) {
				directory.mkdirs();
			}
			try {
				String url = "/D:/git/tupian/";
				url = url+"/"+file.getOriginalFilename();
				File f = new File(url);
				file.transferTo(f);
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			User uu=new User(id,file.getOriginalFilename());
			 if(userservice.updateUserByuserpic(uu)>0) { 
				 User user=userservice.selectUserByuid(uu.getUid());
				 session.setAttribute("user",user); 
				 return file.getOriginalFilename(); 
			 }else {
				 return "1"; 
			}
		}
		//退出同时销毁session
		@RequestMapping("/tologout")
		public String tologin(HttpSession session) {
			session.invalidate();
			return "login";
		}
}		
/*
 * import java.io.IOException;
 * 
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse; import
 * javax.servlet.http.HttpSession;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping;
 * 
 * import com.accp.service.UserService; import com.accp.util.ImageUtil;
 * 
 * @Controller
 * 
 * @RequestMapping("/User") public class UserController {
 * 
 * @Autowired UserService userservice;
 * 
 * @RequestMapping("/GetImage") public void GetImage(HttpServletResponse
 * response,HttpServletRequest request) throws IOException {
 * response.setContentType("image/jpeg"); //禁止图像缓存
 * response.setHeader("Pragma","no-cache"); response.setHeader("Cache-Control",
 * "no-cache"); response.setDateHeader("Expires", 0); HttpSession session =
 * request.getSession(); ImageUtil imageUtil = new ImageUtil(120, 40, 5,30);
 * //code为session中保存的验证码 session.setAttribute("code", imageUtil.getCode());
 * imageUtil.write(response.getOutputStream()); }
 * 
 * @RequestMapping("/login") public String login() { return "login"; }
 * 
 * @RequestMapping("/index") public String index() { return "index"; }
 * 
 * @RequestMapping("/logins") public void logins() {
 * 
 * } }
 */
