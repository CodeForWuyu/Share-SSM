package com.fan.share;

import com.fan.share.entity.User;
import com.fan.share.service.user.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/9/6 13:29
 */
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private IUserService userService;

    @Test
    public void testUsers(){
        System.out.println("what");
        List<User> users =  userService.users();
        for (User user: users
             ) {
            System.out.println(user);
        }
    }

}
