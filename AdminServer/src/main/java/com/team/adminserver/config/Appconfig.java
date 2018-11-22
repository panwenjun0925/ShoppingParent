package com.team.adminserver.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: daixiao
 * @Date: 2018/11/21 20:06
 * @Description:
 * @Version: 1.0
 */
@SpringBootConfiguration
@ComponentScan(basePackages = {"com.team.adminserver"})
@MapperScan(basePackages = {"com.team.adminserver.mapper"})
public class Appconfig {

}
