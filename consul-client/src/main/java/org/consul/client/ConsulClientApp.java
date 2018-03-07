package org.consul.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConsulClientApp.class).web(true).run(args);
	}
}
