package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Model;
import com.accp.service.ModelService;

@Controller
@RequestMapping("/model")
public class ModelController {
	@Autowired
	ModelService ModelService;
	@RequestMapping("/toselectmodel")
	@ResponseBody
	public List<Model> selectModelAll(){
		 return ModelService.selectModelAll();
	}
}
