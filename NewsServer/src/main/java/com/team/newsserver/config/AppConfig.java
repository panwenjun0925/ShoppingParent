package com.team.newsserver.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: daixiao
 * @Date: 2018/11/22 12:17
 * @Description:
 * @Version: 1.0
 */
@SpringBootConfiguration
@ComponentScan(basePackages = {"com.team.newsserver"})
@MapperScan(basePackages = {"com.team.newsserver.mapper"})
public class AppConfig {
}
