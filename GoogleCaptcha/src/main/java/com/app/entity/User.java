package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data // @Data is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, 
//@Getter / @Setter and @RequiredArgsConstructor together: In other words, @Data generates 

@Entity // A class which can be stored in the data base via orm


public class User {
	
	@Id  // primery key
	@GeneratedValue // genration strategy of primary key
	
	private Integer id;
	private String name;
	private String email;

}
