package com.java.ecommerce.service;

import com.java.ecommerce.response.SignupRequest;

public interface AuthService {
	
	
	String createUser(SignupRequest req);

}
