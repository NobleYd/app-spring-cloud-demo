package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
//注意虽然本服务不需要调用其他服务，但以后可能用，所以引入了feign。
public class ServiceBProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceBProviderApplication.class, args);
	}
}
