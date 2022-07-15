package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 // @Data is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, 
//@Getter / @Setter and @RequiredArgsConstructor together: In other words, @Data generates 

@Data
@Entity // A class which can be stored in the data base via orm
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class User {
	
	@Id  // primery key
	@GeneratedValue(strategy = GenerationType.IDENTITY)// genration strategy of primary key
	private Integer id;
	private String name;
	private String email;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
