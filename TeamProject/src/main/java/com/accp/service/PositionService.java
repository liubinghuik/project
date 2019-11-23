package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Position;
import com.accp.mapper.PositionMapper;

@Service
@Transactional
public class PositionService {
	@Autowired
	PositionMapper positionmapper;
	
	//查询所有职位
    public List<Position> selectPositionAll(){
    	return positionmapper.selectPositionAll();
    }
    public int insertpositionBypname(String name) {
    	return positionmapper.insertpositionBypname(name);
    }
    public Position selectpositionBypname(String name) {
    	return positionmapper.selectpositionBypname(name);
    }
    public Position selectpositionBypid(int pid) {
    	return positionmapper.selectpositionBypid(pid);
    }
    public int updatepositionBypid(Position position) {
    	return positionmapper.updatepositionBypid(position);
    }
    public int deletepositionBypid(int pid) {
    	return positionmapper.deletepositionBypid(pid);
    }
}
