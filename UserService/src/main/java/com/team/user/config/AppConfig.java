package com.team.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: qin
 * @Date: 2018/11/22 12:23
 * @Description:
 * @Version: 1.0
 */
@SpringBootConfiguration
@ComponentScan(basePackages = {"com.team.user"})
@MapperScan(basePackages = {"com.team.user.mapper"})
public class AppConfig {

}
