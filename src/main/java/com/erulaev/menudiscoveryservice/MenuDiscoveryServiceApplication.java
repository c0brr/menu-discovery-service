package com.erulaev.menudiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MenuDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuDiscoveryServiceApplication.class, args);
    }

}
