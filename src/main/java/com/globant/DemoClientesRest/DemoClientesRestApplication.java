package com.globant.DemoClientesRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.globant.DemoClientesRest"})
public class DemoClientesRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoClientesRestApplication.class, args);
	}

}
