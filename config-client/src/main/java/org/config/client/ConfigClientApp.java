package org.config.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ConfigClientApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigClientApp.class).web(true).run(args);
	}
}
