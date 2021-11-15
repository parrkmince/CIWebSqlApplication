package com.ihis.efass.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CIWebSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CIWebSqlApplication.class, args);
	}

}
