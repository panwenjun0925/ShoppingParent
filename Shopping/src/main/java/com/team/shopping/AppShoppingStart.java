package com.team.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/**
 * @Auther: PWJ
 * @Date: 2018/11/20 20:40
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AppShoppingStart {
    public static void main(String[] args) {
        SpringApplication.run(AppShoppingStart.class, args);
    }

}
