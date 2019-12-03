package com.accp.config;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
   
@Configuration
public class MvcConfig extends WebMvcConfigurationSupport {
	 

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/")
				.addResourceLocations("file:/D:/git/tupian/");
		super.addResourceHandlers(registry);
	}

	@Override
	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		StringHttpMessageConverter string = new StringHttpMessageConverter(StandardCharsets.UTF_8);
		converters.add(string);
		converters.add(new MappingJackson2HttpMessageConverter());
		converters.add(new ByteArrayHttpMessageConverter());
		super.configureMessageConverters(converters);
	}
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加拦截的请求，并排除几个不拦截的请求
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/", "/page/login","/js/**","/css/**","/images/**","/user/GetImage","/user/logins");
        //权限
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/shop/**","/staff/**}","/shopall/**","/position/**","/model/**")
        .excludePathPatterns("/js/**","/css/**","/images/**","/shop/toselectBysid","/staff/toselectBysid","/staff/tozjdp","/staff/tozjzw")
        .excludePathPatterns("/model/toselectmodel","/position/topositionselect","/position/toselectpositionByid")
        .addPathPatterns("/rest/commoditysort/getAll","/rest/commoditysort/updateByPrimaryKeySelective","/rest/commoditysort/insertSelective","/rest/commoditysort/deleteByPrimaryKey"
        		,"/rest/commodity/getCommodityAll","/rest/commodity/insertCommodity","/rest/commodity/updategoods","/rest/commodity/deleteCommodity"
        		,"/rest/supplier/getAll","/rest/supplier/updateByPrimaryKeySelective","/rest/supplier/insertSelective","/rest/supplier/deleteByPrimaryKey"
        		,"/rest/purchase/getAll/**","/rest/purchase/insertPurchase","/rest/purchase/updateByPrimaryKeySelective","/rest/purchase/deletePurchaseAndDetails")
        .excludePathPatterns("");
    }
	
}
