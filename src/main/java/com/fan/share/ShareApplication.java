package com.fan.share;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@MapperScan("com.fan.share.dao")
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ShareApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShareApplication.class, args);
    }

}
