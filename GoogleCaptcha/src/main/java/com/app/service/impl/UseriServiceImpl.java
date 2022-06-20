package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.User;
import com.app.repository.UserRepository;
import com.app.service.UserService;

@Service
//It is used to mark the class as a service provider. So overall 
//@Service annotation is used with classes that provide some business functionalities.

public class UseriServiceImpl implements UserService  {
	
	
	@Autowired
	private UserRepository repo; 
	

	@Override
	public Integer creatUser(User user) {
		Integer userId= repo.save(user).getId();
		
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		
		return null;
	}

}
