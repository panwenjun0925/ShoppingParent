package com.team.adserver.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: daixiao
 * @Date: 2018/11/21 15:07
 * @Description:
 * @Version: 1.0
 */
@SpringBootConfiguration
@ComponentScan(basePackages = {"com.team.adserver"})
@MapperScan(basePackages = {"com.team.adserver.mapper"})
public class Appconfig {
}
