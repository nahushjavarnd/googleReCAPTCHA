package com.app.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.app.entity.CaptchaResponse;

@Component
public class CaptchaValidator {
	
	@Autowired
	private RestTemplate restTemplate;
	
public boolean isValidCaptcha(String captcha) {
		
		String url= "https://www.google.com/recaptcha/api/siteverify";
		String params="?secret=6LdbsYQgAAAAAD09dR4n6qohRJmajJWFes3laLu-&response="+captcha;
		String completeUrl=url+params;
		CaptchaResponse resp= restTemplate.postForObject(completeUrl, null, CaptchaResponse.class);
		return resp.isSuccess();
	}

}
