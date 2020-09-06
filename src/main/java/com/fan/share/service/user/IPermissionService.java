package com.fan.share.service.user;

import com.fan.share.entity.Permission;

import java.time.Period;
import java.util.List;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/9/6 14:26
 */
public interface IPermissionService {

    //获取所有权限
    public List<Permission> permissions();

    //根据id获取权限详情
    public Permission selectById(int id);
}
