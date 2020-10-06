package com.fan.share.service.user.impl;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fan.share.dao.UserDao;
import com.fan.share.dto.UserDTO;
import com.fan.share.entity.User;
import com.fan.share.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
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
        try{
            return userDao.selectList( null);
        }catch (Exception e){
            return null;
        }
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
    public User selectUserByUserName(String username) {
        QueryWrapper<User> wrapper = new QueryWrapper<User>().eq("username",username);
        try{
            return userDao.selectOne(wrapper);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public int add(UserDTO userDTO) {
        String username = userDTO.getUsername();
        if(exist(username)){
            throw new RuntimeException("用户名已存在！");
        }
        try{
            userDao.insert(userDTO.toUser());
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    @Override
    public int delete(long id) {
        try{
            userDao.deleteById(id);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(long id, UserDTO userDTO) {
        try{
            User user = userDTO.toUser();
            user.setId(id);
            userDao.updateById(user);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public List<User> queryUsers(String name, Timestamp joinTime, Long roleId) {
        QueryWrapper<User> wrapper = new QueryWrapper<User>().like(name!=null,"username",name)
                .gt(joinTime!=null,"join_time",joinTime)
                .eq(roleId!=null,"role_id",roleId);

        try{
            return userDao.selectList( wrapper);
        }catch (Exception e){
            return null;
        }
    }

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    @Override
    public User getByUsername(String username) {
        return userDao.selectOne(new QueryWrapper<User>().eq(true, "username", username));
    }


    /**
     * 判断用户是否存在
     */
    private boolean exist(String username){
        int count = userDao.selectCount(new QueryWrapper<User>().eq(true, "username", username));
        return (count != 0);
    }

}
