package com.fan.share.config;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fan.share.entity.Role;
import com.fan.share.entity.User;
import com.fan.share.service.user.IRoleService;
import com.fan.share.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.StreamUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/10/6 16:13
 */
public class CustomJSONLoginFilter extends AbstractAuthenticationProcessingFilter {

    private final IUserService userService;

    @Autowired
    private IRoleService roleService;

    CustomJSONLoginFilter(String defaultFilterProcessesUrl, IUserService userService) {
        super(new AntPathRequestMatcher(defaultFilterProcessesUrl, HttpMethod.POST.name()));
        System.out.println(HttpMethod.POST.name());
        this.userService = userService;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws AuthenticationException, IOException, ServletException {
        JSONObject requestBody = getRequestBody(httpServletRequest);
        String username = requestBody.getString("username");
        String password = requestBody.getString("password");
        validateUsernameAndPassword(username, password);
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();

        //获取用户的权限,进行授权
        Role role = roleService.selectById(userService.getByUsername(username).getRoleId());
        simpleGrantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));

        return new UsernamePasswordAuthenticationToken(username, password, simpleGrantedAuthorities);
    }

    /**
     * 获取请求体
     */
    private JSONObject getRequestBody(HttpServletRequest request) throws AuthenticationException{
        try {
            StringBuilder stringBuilder = new StringBuilder();
            InputStream inputStream = request.getInputStream();
            byte[] bs = new byte[StreamUtils.BUFFER_SIZE];
            int len;
            while ((len = inputStream.read(bs)) != -1) {
                stringBuilder.append(new String(bs, 0, len));
            }
            return JSON.parseObject(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new AuthenticationServiceException("invalid request body");
    }

    /**
     * 校验用户名和密码
     */
    private void validateUsernameAndPassword(String username, String password) throws AuthenticationException {
        System.out.println(username);
        System.out.println(password);
        User user = userService.getByUsername(username);

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePassword = passwordEncoder.encode(password);

        if (user == null){
            throw new UsernameNotFoundException("user not exist");
        }
        if(!user.getPassword().equals(encodePassword)){
            throw new AuthenticationServiceException("error username or password");
        }
    }

}
