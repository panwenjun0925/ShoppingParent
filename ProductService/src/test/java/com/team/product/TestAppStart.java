package com.team.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther: YouQi
 * @Date: 2018/11/22 00:33
 * @Description:
 * @Version: 1.0
 */
@ComponentScan({"com.team.product", "com.unitils.boot.autoconfigure"})
@SpringBootApplication
public class TestAppStart {
    public static void main(String[] args) {
        SpringApplication.run(TestAppStart.class, args);
    }
}
