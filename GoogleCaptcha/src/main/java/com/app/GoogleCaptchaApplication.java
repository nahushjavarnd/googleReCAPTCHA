package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// @SpringBootApplication annotation and invoke SpringApplication.run() method.


// Spring Boot @SpringBootApplication annotation is used to mark a configuration class that declares one or 
//more @Bean methods and also triggers auto-configuration and component scanning. 
//It’s same as declaring a class with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations.


@SpringBootApplication // (@configurtion + @EnableAutoConfigurtion + @Componentscan)
// 1) It will behave act as bean.
// 2) example: Spring Boot auto-configuration can automatically configure the Thymeleaf template resolver
// 3) It is mainly used to scan the classes and packages to create the bean.
public class GoogleCaptchaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleCaptchaApplication.class, args);
		
		// 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
		
		// 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
		
		
		
	}

}
