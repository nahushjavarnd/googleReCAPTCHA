package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.entity.User;
import com.app.repository.UserRepository;
import com.app.service.UserService;


@SpringBootTest
class GoogleCaptchaApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@MockBean
	private UserRepository user;
	
	@Autowired
	private UserService userService;

	
	@Test
	public void getAllUsersTest() {
		
		when(user.findAll()).thenReturn(Stream.of(new User(),new User()).collect(Collectors.toList()));
		assertEquals(2, userService.getAllUsers().size());
	}

	
	
	
}
