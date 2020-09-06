package com.fan.share.service.user.impl;

import com.fan.share.dao.UserDao;
import com.fan.share.dto.UserDTO;
import com.fan.share.entity.User;
import com.fan.share.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**用户业务功能实现类
 * @author fanlu
 * @version 1.0
 * @date 2020/9/6 13:16
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> users() {
        return userDao.selectList( null);
    }

    @Override
    public User selectUserById(int id) {
        try{
            return userDao.selectById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> selectUsers() {
        return null;
    }

    @Override
    public int add(UserDTO userDTO) {
        try{
            userDao.insert(userDTO.toUser());
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    @Override
    public int delete(int id) {
        try{
            userDao.deleteById(id);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}
