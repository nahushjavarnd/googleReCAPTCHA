package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	// Rest template is used to create application that containe RESTFUL Webservices. You can use the exchange() meythod to 
 	//consume the web services for all HTTP Methods. 
	
	
// To Create Bean for Rest Template to auto wiring the Rest Template Object
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	
}
