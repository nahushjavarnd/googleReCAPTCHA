package com.app.service;

import java.util.List;

import com.app.entity.User;

public interface UserService {
	
	Integer creatUser(User user);
	List<User> getAllUsers();

}
