package com.fan.share.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fan.share.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/9/6 13:04
 */
@Repository
public interface UserDao extends BaseMapper<User> {
}
