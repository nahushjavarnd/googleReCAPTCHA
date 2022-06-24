package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	

	//Repository layer is implemented to access the database and 
	//helps to extend the CRUD operations on the database
	
	//Like @component for data base access
	
	//Repositories are classes or components that encapsulate the logic required to access data sources.
	//They centralize common data access functionality, providing better maintainability 
	//and decoupling the infrastructure or technology used to access databases from the domain model layer.
	
	
	
}