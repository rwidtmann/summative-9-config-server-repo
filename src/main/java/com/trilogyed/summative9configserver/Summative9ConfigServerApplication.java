package com.trilogyed.summative9configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Summative9ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Summative9ConfigServerApplication.class, args);
	}

}
