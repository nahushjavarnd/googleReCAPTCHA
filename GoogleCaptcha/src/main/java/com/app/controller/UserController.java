package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.User;
import com.app.service.UserService;
import com.app.validator.CaptchaValidator;

@Controller
//The @Controller annotation indicates that a particular class serves the role of a controller.
// There is no need to extend any controller base class or reference the Servlet API.


// @RequestMapping — the HTTP Method
// The HTTP method parameter has no default. So, if we don't specify a value, it's going to map to any HTTP request.




// mapping an HTTP request to a method using some basic criteria.
@RequestMapping("/user")
public class UserController {
	
	
	// The @Autowired annotation marks a Constructor, Setter method, Properties and Config() method as to be autowired
	//that is ‘injecting beans'(Objects) at runtime by Spring Dependency Injection mechanism which is clearly depicted from the image below as shown:
	@Autowired
	private UserService service;
	@Autowired
	private CaptchaValidator validator;
	
	
	
	@GetMapping("/register") // Getmapping is a Spring notation and is widely used in mapping HTTP GET requests
	public String registerUser(Model model) {
		model.addAttribute("user", new User());
		return "registerUser";
	}
	
	
	//The @PostMapping is specialized version of @RequestMapping annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. POST) . 
	// The @PostMapping annotated methods in the @Controller annotated classes handle the HTTP POST requests matched with given URI expression.
	
	@PostMapping("/save")
	public String saveUser(@ModelAttribute User user, Model model, @RequestParam("g-recaptcha-response") String captcha) {
		
		if(validator.isValidCaptcha(captcha)) {
			
			Integer id = service.creatUser(user);
			model.addAttribute("messages","User with id : '"+id +"' Saved Successfuly !");
			model.addAttribute("user", new User());
						
		}else {
			model.addAttribute("messages", "please validate captcha first");
		}
		return "registerUser";
	}
	
	
	// Annotation Type GetMapping. Annotation for mapping HTTP GET requests onto specific handler methods.
	// Specifically, @GetMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. GET) 
	
	@GetMapping("/all")
	public String getAllUsers(Model model) {
		List<User> users= service.getAllUsers();
		model.addAttribute("list", users);
		return "listUsers";
	}
	

}
