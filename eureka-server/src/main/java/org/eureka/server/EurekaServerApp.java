package org.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServerApp.class).web(true).run(args);
	}
}
