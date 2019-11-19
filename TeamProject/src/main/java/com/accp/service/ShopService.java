package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Shop;
import com.accp.mapper.ShopMapper;

@Service
@Transactional
public class ShopService {
	@Autowired
	ShopMapper shopmapper;
	//根据账户查询对应的店铺
	
}
