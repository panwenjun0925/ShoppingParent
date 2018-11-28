package com.team.web;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;


/**
 * @Auther: PWJ
 * @Date: 2018/11/20 20:40
 * @Description:
 * @Version: 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Import(FdfsClientConfig.class)
public class AppWebStart {
    public static void main(String[] args) {
        SpringApplication.run(AppWebStart.class, args);
    }
}
