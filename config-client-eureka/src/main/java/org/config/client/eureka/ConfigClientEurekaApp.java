package org.config.client.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientEurekaApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigClientEurekaApp.class).web(true).run(args);
	}
}
