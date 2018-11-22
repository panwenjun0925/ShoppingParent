package com.team.brandserver.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 11:53
 * @Description:
 * @Version: 1.0
 */
@SpringBootConfiguration
@ComponentScan(basePackages = {"com.team.brandserver"})
@MapperScan(basePackages = {"com.team.brandserver.mapper"})
public class AppConfig {
}
