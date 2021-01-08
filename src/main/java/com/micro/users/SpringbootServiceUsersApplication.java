package com.micro.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.micro.users.commons.models.entity"})
public class SpringbootServiceUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceUsersApplication.class, args);
	}

}
