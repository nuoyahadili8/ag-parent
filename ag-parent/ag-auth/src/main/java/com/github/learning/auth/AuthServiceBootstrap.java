package com.github.learning.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.github.learning.auth")
class AuthServiceBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(AuthServiceBootstrap.class,args);
    }
}
