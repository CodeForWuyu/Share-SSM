package com.fan.share.dto;

import cn.hutool.core.bean.BeanUtil;
import com.fan.share.entity.User;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/9/6 14:00
 */
public class UserDTO implements Serializable {
    // 唯一id
    private Long id;
    // 唯一用户名
    private String username;
    // 用户密码
    private String password;
    // 用户角色
    private Long roleId;
    // 真实姓名
    private String realName;
    // 电话号码
    private String phonenumber;
    // 电子邮箱
    private String email;
    // 生日
    private Date birthday;
    // 注册时间
    private Timestamp joinTime;


    // 转换为用户实体类
    public User toUser(){
        User user = new User();
        BeanUtil.copyProperties(this, user);
        return user;
    }
}
