package com.fan.share.service.user;

import com.fan.share.dto.UserDTO;
import com.fan.share.entity.User;

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

    //条件筛选用户
    public List<User> selectUsers();

    //新增用户
    public int add(UserDTO userDTO);

    //删除用户
    public int delete(int id);

}
