package com.accp.config;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


import com.accp.domain.ShopAll;


@Component//让spring容器创建该类对象，表示其它组建
public class MyInterceptor  implements HandlerInterceptor {
	
	

	/***
	 * 
	 * 执行控制器之前执行该方法，返回false表示不执行控制器
	 * 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		/* System.out.println("preHandler"); */
		HttpSession session = request.getSession();
		 List<ShopAll> list =(List<ShopAll>)session.getAttribute("zwdqx");
		
		  String path = request.getRequestURI();
		  System.out.println(path);
		  boolean flag = false; 
		  for(ShopAll m :list) {
  			  if(path.equals(m.getPath())) {
  					  flag = true;
  					  return flag; 
  			  } 
  		  }
		  return flag;
	}
	
	/**
	 * 
	 * 控制成功执行，没有发生异常情况
	 * 
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		/* System.out.println("postHandler"); */
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	/**
	 * 不管是否发生异常都会被执行
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		/* System.out.println("afterCOmpletion"); */
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
}
