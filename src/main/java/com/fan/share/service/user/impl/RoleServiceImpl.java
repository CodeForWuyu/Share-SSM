package com.fan.share.service.user.impl;

import com.fan.share.dao.RoleDao;
import com.fan.share.entity.Role;
import com.fan.share.service.user.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/9/6 14:30
 */
@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> roles() {
        try{
            return roleDao.selectList(null);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Role selectById(int id) {
        try{
            return roleDao.selectById(id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
