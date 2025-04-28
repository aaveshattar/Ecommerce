package com.java.ecommerce.service;

import com.java.ecommerce.response.SignupRequest;

public interface AuthService {
	
	void sentLoginOtp(String email) throws Exception;
	
	String createUser(SignupRequest req) throws Exception;

}
