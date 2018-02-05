package com.github.learning.erueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EruekaBootstap {

	public static void main(String[] args) {
		SpringApplication.run(EruekaBootstap.class,args);
	}

}
