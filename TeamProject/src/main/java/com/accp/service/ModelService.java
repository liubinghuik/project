package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Model;
import com.accp.mapper.ModelMapper;

@Service
@Transactional
public class ModelService {
	@Autowired
	ModelMapper modelmapper;
	 public List<Model> selectModelAll(){
		 return modelmapper.selectModelAll();
	 }
	
}
