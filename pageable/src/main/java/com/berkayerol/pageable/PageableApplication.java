package com.berkayerol.pageable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.berkayerol"})
@ComponentScan(basePackages = {"com.berkayerol"})
@EnableJpaRepositories(basePackages = {"com.berkayerol"})
@SpringBootApplication
public class PageableApplication {

	public static void main(String[] args) {
		SpringApplication.run(PageableApplication.class, args);
	}

}
