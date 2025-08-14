package com.todocodeacademy.config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
//Anotation para habilitar nuestro servidor de configuraciones
@EnableConfigServer
//Anotation para habilitar que EurekaServer nos encuentre
@EnableDiscoveryClient

public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
