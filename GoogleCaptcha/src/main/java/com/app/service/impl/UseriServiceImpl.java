package com.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.entity.User;
import com.app.service.UserService;

@Service
//It is used to mark the class as a service provider. So overall 
//@Service annotation is used with classes that provide some business functionalities.

public class UseriServiceImpl implements UserService  {

	@Override
	public Integer creatUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
