package com.fan.share.config;

import com.fan.share.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author fanlu
 * @version 1.0
 * @date 2020/10/6 16:07
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    private IUserService userService;

    @Autowired
    public void setUserService(IUserService userService){
        this.userService = userService;
    }

    /**
     * 匹配 "/register" 路径，不需要权限即可访问
     * 匹配 "/user" 及其以下所有路径，都需要 "USER" 权限
     * 登录地址为 "/login"，登录成功返回响应状态码
     * 退出登录的地址为 "/logout"，退出成功返回响应状态码
     * 禁用 CSRF
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/login", "/register","/user","/share").permitAll()
//                .antMatchers("/user/**").hasAuthority("USER")
                .antMatchers("/admin/**").hasAuthority("ADMIN")
                .and()
                .logout().logoutUrl("/logout")
                .logoutSuccessHandler(new CustomLogoutSuccessHandler())
                .clearAuthentication(true).permitAll()
                .and()
                .exceptionHandling().authenticationEntryPoint(new CustomAuthenticationEntryPoint())
                .accessDeniedHandler(new CustomAccessDeniedHandler())
                .and()
                .csrf().disable();

        http.addFilterAt(customJSONLoginFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    /**
     * 自定义认证过滤器
     */
    private CustomJSONLoginFilter customJSONLoginFilter() {
        CustomJSONLoginFilter customJSONLoginFilter = new CustomJSONLoginFilter("/user", userService);
        customJSONLoginFilter.setAuthenticationFailureHandler(new CustomAuthenticationFailureHandler());
        customJSONLoginFilter.setAuthenticationSuccessHandler(new CustomAuthenticationSuccessHandler());
        return customJSONLoginFilter;
    }
}
