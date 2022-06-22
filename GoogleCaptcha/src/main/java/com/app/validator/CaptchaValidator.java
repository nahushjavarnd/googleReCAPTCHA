package com.app.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.app.entity.CaptchaResponse;


// an annotion that allows spring to automaticlly detecy our custom beans. In other Words, Without having to write any explicit code.
// Spring Will: Scan our appliction for classed annotated with @component  instantiate them and inject any specified dependcies into them
@Component
public class CaptchaValidator {
	
	@Autowired
	private RestTemplate restTemplate;
	
public boolean isValidCaptcha(String captcha) {
		
		String url= "https://www.google.com/recaptcha/api/siteverify";
		String params="?secret=6LevZ5AgAAAAAFRxPSFqE_Miyu18FQTCYHKMrQLV&response="+captcha;
		String completeUrl=url+params;
		CaptchaResponse resp= restTemplate.postForObject(completeUrl, null, CaptchaResponse.class);
		return resp.isSuccess();
	}


}
