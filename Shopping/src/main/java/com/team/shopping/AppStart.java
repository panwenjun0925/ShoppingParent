package com.team.shopping;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Auther: qin
 * @Date: 2018/11/27 22:40
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableCasClient
public class AppStart {

    public static void main(String[] args){
        SpringApplication.run(AppStart.class,args);
    }

}
