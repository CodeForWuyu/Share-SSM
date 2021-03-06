package com.fan.share.entity;

import cn.hutool.core.bean.BeanUtil;
import com.fan.share.dao.UserDao;
import com.fan.share.dto.UserDTO;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/9/2 8:32
 */

@Data
public class User {
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Timestamp getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Timestamp joinTime) {
        this.joinTime = joinTime;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", roleId=" + roleId +
                ", realName='" + realName + '\'' +
                ", phoneNumber='" + phonenumber + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                ", joinTime=" + joinTime +
                '}';
    }

    // 将user类转换为user传输对象
    public UserDTO toDTO(){
        UserDTO userDTO = new UserDTO();
        BeanUtil.copyProperties(this, userDTO);
        return userDTO;
    }
}
