package com.madisfinance.madis_eureka_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MadisEurekaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MadisEurekaRegistryApplication.class, args);
	}

}
