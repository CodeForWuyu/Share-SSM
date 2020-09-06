package com.fan.share.service.user.impl;

import com.fan.share.dao.PermissionDao;
import com.fan.share.entity.Permission;
import com.fan.share.service.user.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/9/6 14:36
 */
public class PermissionServiceImpl implements IPermissionService {
    @Autowired
    private PermissionDao permissionDao;

    @Override
    public List<Permission> permissions() {
        try{
            return permissionDao.selectList(null);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Permission selectById(int id) {
        try{
            return permissionDao.selectById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
