package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppEurekaServerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AppEurekaServerApplication.class, args);
		new SpringApplicationBuilder(AppEurekaServerApplication.class).web(true).run(args);
	}
}
