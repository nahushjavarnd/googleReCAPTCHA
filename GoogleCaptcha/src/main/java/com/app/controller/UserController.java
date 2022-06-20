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
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	@Autowired
	private CaptchaValidator validator;
	
	@GetMapping("/register")
	public String registerUser(Model model) {
		model.addAttribute("user", new User());
		return "registerUser";
	}
	
	
	@PostMapping("/save")
	public String saveUser(@ModelAttribute User user, Model model, @RequestParam("g-recaptcha-response") String captcha) {
		
		if(validator.isValidCaptcha(captcha)) {
			
			Integer id = service.creatUser(user);
			model.addAttribute("Messages","User with id : '"+id +"' Saved Successfuly !");
			model.addAttribute("user", new User());
						
		}else {
			model.addAttribute("Messages", "please validate captcha first");
		}
		return "registerUser";
	}
	
	@GetMapping("/all")
	public String getAllUsers(Model model) {
		List<User> users= service.getAllUsers();
		model.addAttribute("list", users);
		return "listUsers";
	}
	

}
