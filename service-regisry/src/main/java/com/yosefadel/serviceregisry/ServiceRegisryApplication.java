package com.yosefadel.serviceregisry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // enable this application as a Eureka server
public class ServiceRegisryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegisryApplication.class, args);
    }

}
