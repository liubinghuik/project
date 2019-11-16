package com.accp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.service.UserService;
import com.accp.util.ImageUtil;

@Controller
@RequestMapping("/User")
public class UserController {
	@Autowired
	UserService userservice;
	
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
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/logins")
	public void logins() {
		
	}
}
