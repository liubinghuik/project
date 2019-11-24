package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Modelposition;
import com.accp.mapper.ModelpositionMapper;

@Service
@Transactional
public class ModelpositionService {
	@Autowired
	ModelpositionMapper modelpositionmapper;
	public int insertmodelposition(Modelposition modelposition) {
		return modelpositionmapper.insertmodelposition(modelposition);
	}
	 public int deletemodelposition(int pid) {
		 return modelpositionmapper.deletemodelposition(pid);
	 }
}
