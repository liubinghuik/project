package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.User;
import com.accp.mapper.UserMapper;

@Service
@Transactional
public class UserService {
	@Autowired
	UserMapper usermapper;
	//根据账号和密码查询是否有此用户
	/*
	 * public User selectUserByaccountAndPwd(User user) { return
	 * usermapper.selectUserByaccountAndPwd(user); }
	 */
}
