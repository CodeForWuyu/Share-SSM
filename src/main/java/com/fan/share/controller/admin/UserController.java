package com.fan.share.controller.admin;

import com.fan.share.config.MsgResponse;
import com.fan.share.dto.UserDTO;
import com.fan.share.entity.User;
import com.fan.share.service.user.IUserService;
import com.fan.share.service.user.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/9/6 14:39
 */
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    private IUserService userService;

    // 获取用户列表
    @GetMapping("/all")
    public MsgResponse<List<User>> getAllUser(){
        List<User> userList = userService.users();
        if(userList==null){
            return MsgResponse.fail(404,"获取失败！");
        }
        return MsgResponse.success("成功", userList);
    }

    // 条件查询用户
    @GetMapping("/query")
    public MsgResponse<List<User>> queryUsers(@RequestParam(required = false) String name,
                                              @RequestParam(required = false) String jointime,
                                              @RequestParam(required = false) Long roleid) throws ParseException {
        Timestamp time = null;
        if(jointime!=null){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(jointime);
            time = new Timestamp(date.getTime());
        }

        List<User> users = userService.queryUsers(name,time,roleid);
        return MsgResponse.success();
    }

    // 添加用户
    @PostMapping("/add")
    public MsgResponse<User> addOneUser(@RequestBody(required = false) UserDTO userDTO){
        if(userDTO==null){
            return MsgResponse.fail(400,"缺少请求体");
        }
        userService.add(userDTO);
        return MsgResponse.success();
    }

    // 删除用户
    @DeleteMapping("/del/{id}")
    public MsgResponse<User> delOneUser(@PathVariable long id){
        userService.delete(id);
        return MsgResponse.success();
    }

    // 更新用户
    @PostMapping("/update/{id}")
    public MsgResponse<User> updateUser(@PathVariable long id,@RequestBody(required = false) UserDTO userDTO){
        userService.update(id,userDTO);
        return MsgResponse.success();
    }
}
