package com.vidvaan.spring.boot.sprintbootapp;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprintbootappApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SprintbootappApplication.class, args);

		String[] beans = appContext.getBeanDefinitionNames();
		Arrays.sort(beans);
		for (String bean : beans) {
			System.out.println("bean Name : " + bean);
		}
	}

}
