package com.team.address;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class AddressStrat {
    private static Logger logger=Logger.getLogger(AddressStrat.class);

    public static void main(String[] args) {

        SpringApplication.run(AddressStrat.class, args);
        logger.info("SpringBoot Start Success");
    }
}
