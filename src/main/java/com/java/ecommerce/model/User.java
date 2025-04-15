package com.java.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	private String Password;

	private String email;
	
	private String fullName;
	
	private String mobile;
	
	private Enum role;
	
	private String roles;
}
