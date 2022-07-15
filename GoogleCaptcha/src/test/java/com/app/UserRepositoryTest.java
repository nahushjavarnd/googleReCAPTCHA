package com.app;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.app.entity.User;
import com.app.repository.UserRepository;
 
@DataJpaTest
@AutoConfigureTestDatabase
class UserRepositoryTest {

		@Autowired
		private UserRepository repository;
		
		
		@Test
		public void saveUser() {
			User user = new User();
					user.setId(201);
					user.setName("Lumiya");
					user.setEmail("lumiya@gmail.com");
					
				repository.save(user);
				Assertions.assertThat(user.getId()).isGreaterThan(0);
		
		}
		

}
