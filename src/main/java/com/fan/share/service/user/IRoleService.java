package com.fan.share.service.user;

import com.fan.share.entity.Role;

import java.util.List;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/9/6 14:26
 */
public interface IRoleService {

    // 获取所有角色列表
    public List<Role> roles();

    // 根据id获取权限
    public Role selectById(int id);

}
