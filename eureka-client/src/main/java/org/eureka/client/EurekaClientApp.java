package org.eureka.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaClientApp.class).web(true).run(args);
	}
}
