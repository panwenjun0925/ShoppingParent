package com.team.address.AppConfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: qin
 * @Date: 2018/11/21 10:43
 * @Description:
 * @Version: 1.0
 */
@SpringBootConfiguration
@ComponentScan(basePackages = {"com.team.address"})
@MapperScan(basePackages = {"com.team.address.mapper"})
public class AppConfig {

}
