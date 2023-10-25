package com.redolf.pagination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.redolf.pagination.*")
public class PaginationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginationApplication.class, args);
	}

}
