package com.ttn.springBootAssign;

import com.ttn.springBootAssign.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAssignApplication {
	//Ques.3
	@Bean
	User user(){
		return  new User();
	}
	public static void main(String[] args) {

		SpringApplication.run(SpringBootAssignApplication.class, args);
	}
}
