package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.User;
import com.app.repository.UserRepository;
import com.app.service.UserService;

@Service
//It is used to mark the class as a service provider. So overall 
//@Service annotation is used with classes that provide some business functionalities.

public class UseriServiceImpl implements UserService  {

	
	// Autowiring feture of spring framwork enable you to inject the object depedency implicity. it internally users setter or constructor  
	// injection . Autowiring cant be used to inject primitive and string values.
	
	
	@Autowired
	private UserRepository repo; 
	

	@Override
	public Integer creatUser(User user) {
		Integer userId= repo.save(user).getId();
		return userId;
	}

	@Override
	public List<User> getAllUsers() {
		
		List<User> users= repo.findAll();
		return users;
	}

	@Override
	public User getUserById(int id) {
		
		 return repo.findById(id).get();
//		Optional<User> optional = repo.findById(id);
//		User user = null;
//		if (optional.isPresent()) {
//			user = optional.get();
//		} else {
//			throw new RuntimeException(" Employee not found for id :: " + id);
//		}
//		
//		return null;
	}

}
