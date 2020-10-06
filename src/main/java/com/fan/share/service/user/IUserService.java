package com.fan.share.service.user;

import com.fan.share.dto.UserDTO;
import com.fan.share.entity.User;

import java.sql.Timestamp;
import java.util.List;

/**
 * 用户业务功能接口
 * @author fanlu
 * @version 1.0
 * @date 2020/9/6 12:51
 */
public interface IUserService {

    //获取所有用户
    public List<User> users();

    //根据id获取指定用户
    public User selectUserById(int id);

    // 按照用户名查询用户
    public User selectUserByUserName(String username);

    // 新增用户
    public int add(UserDTO userDTO);

    // 删除用户
    public int delete(long id);

    // 更新用户
    public int update(long id,UserDTO userDTO);

    // 条件查询
    public List<User> queryUsers(String name, Timestamp joinTime,Long roleId);

    // 根据用户名获取用户信息
    public User getByUsername(String username);

}
