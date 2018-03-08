package org.config.server.git;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigServerApp.class).web(true).run(args);
	}
}
