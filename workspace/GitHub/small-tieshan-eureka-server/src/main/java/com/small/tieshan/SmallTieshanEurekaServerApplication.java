package com.small.tieshan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SmallTieshanEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallTieshanEurekaServerApplication.class, args);
    }
}
