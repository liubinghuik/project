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
	public User selectUserByaccountAndPwd(User user) {
		 return usermapper.selectUserByaccountAndPwd(user);
	}
	public int insertuser(User user) {
		return usermapper.insertuser(user);
	}
	//根据id查询是否有此用户
	public User selectUserByuid(int id) {
		 return usermapper.selectUserByuid(id);
	}
    public User selectUserByuaccount(String uaccount) {
    	return usermapper.selectUserByuaccount(uaccount);
    }
	//修改用户信息
	public int updateUserByuidxx(User user) {
		return usermapper.updateUserByuidxx(user);
	}
	public int updateUserByuaccountAndupwd(User user) {
		 return usermapper.updateUserByuaccountAndupwd(user);
	}
	//修改用户图片路径
	public int updateUserByuserpic(User user) {
		return usermapper.updateUserByuserpic(user);
	}
	public int deleteUser(int uid) {
		return usermapper.deleteUser(uid);
	}
}
