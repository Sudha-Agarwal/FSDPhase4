package com.learning.decimal.springBoot.LearnSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.learning.decimal.springBoot.LearnSpringBoot.courses")
//@EntityScan("com.learning.decimal.springBoot.LearnSpringBoot.courses.bean")
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}
}
