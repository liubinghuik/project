package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.domain.Positionjurisdiction;
import com.accp.mapper.PositionjurisdictionMapper;

@Service
@Transactional
public class PositionjurisdictionService {
	@Autowired
	PositionjurisdictionMapper positionjurisdictionmapper;
	
	/* 新增 */
    public int insertSelective(Positionjurisdiction record) {
    	return positionjurisdictionmapper.insertSelective(record);
    }

	/* 修改and删除 */
    public int deletepositionjurisdictionBypid(int pid) {
    	return positionjurisdictionmapper.deletepositionjurisdictionBypid(pid);
    }
}
