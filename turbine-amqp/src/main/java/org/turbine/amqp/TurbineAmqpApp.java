package org.turbine.amqp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbineStream
public class TurbineAmqpApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(TurbineAmqpApp.class).web(true).run(args);
	}
}
