package com.team.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jmx.support.RegistrationPolicy;

/**
 * @Auther: YouQi
 * @Date: 2018/11/28 19:58
 * @Description:
 * @Version: 1.0
 */
@Configuration
@EnableMBeanExport(registration= RegistrationPolicy.IGNORE_EXISTING)
public class FdfsConfiguration {
}
