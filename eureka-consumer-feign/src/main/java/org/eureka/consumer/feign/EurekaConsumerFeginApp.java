package org.eureka.consumer.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class EurekaConsumerFeginApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaConsumerFeginApp.class).web(true).run(args);
	}
}
