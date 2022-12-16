package com.foodmood.be.configprimo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServicePrimoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServicePrimoApplication.class, args);
	}

}
