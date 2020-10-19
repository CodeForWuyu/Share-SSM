package com.fan.share.controller;

import com.fan.share.config.MsgResponse;
import com.fan.share.dto.UserDTO;
import com.fan.share.entity.User;
import com.fan.share.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**登陆注册接口
 * @author fanlu
 * @version 1.0
 * @date 2020/9/9 21:55
 */
@Controller
public class LoginController {

    @Autowired
    private IUserService userService;

    /**
     * 用户注册
     * @return
     */
    @PostMapping("/register")
    @ResponseBody
    public MsgResponse<String> register(@RequestBody UserDTO userDTO){
        //检查用户名是否为空
        if(userDTO.getUsername()==null || userDTO.getPassword()==null){
            return MsgResponse.fail("用户名和密码不能为空!");
        }

        // 检查用户名是否存在
        if(userService.selectUserByUserName(userDTO.getUsername())!=null){
            return MsgResponse.success("用户名已存在");
        }

        //注册成功,加入到数据库
        //TODO 密码加密
        userService.add(userDTO);

        return MsgResponse.success("注册成功");
    }

    /**
     * 登陆
     * @param userDTO
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public MsgResponse<String> login(@RequestBody UserDTO userDTO){
        // 检查用户名和密码是否为空
        if(userDTO.getUsername()==null || userDTO.getPassword()==null){
            return MsgResponse.fail("用户名或者密码为空!");
        }

        // 检查用户是否存在
        User user = userService.selectUserByUserName(userDTO.getUsername());
        if(user==null){
            return MsgResponse.fail("用户不存在!");
        }

        // 用户名与密码验证
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        if(!passwordEncoder.matches(userDTO.getPassword(),user.getPassword())){
            return MsgResponse.fail("用户名或密码错误!");
        }

        return MsgResponse.success("登陆成功!");
    }

}
