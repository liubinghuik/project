package com.accp.mapper;

import com.accp.domain.User;
import com.accp.domain.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    /* 根据账号和密码查询用户表 */
    User selectUserByaccountAndPwd(User user);
    
    int insertuser(User user);
    
    /* 根据id查询用户表 */
    User selectUserByuid(int id);
    User selectUserByuaccount(String uaccount);

	/* 修改账户信息 */
    int updateUserByuidxx(User user);
    int updateUserByuaccountAndupwd(User user);

	/* 修改账户图片路径 */
    int updateUserByuserpic(User user);
    int deleteUser(int uid);

}