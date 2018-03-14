package com.cloud.helloworldcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HelloWorldCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldCloudApplication.class, args);
	}
}