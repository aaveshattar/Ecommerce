package com.java.ecommerce.service.impl;

import org.springframework.stereotype.Service;

import com.java.ecommerce.config.JwtProvider;
import com.java.ecommerce.model.User;
import com.java.ecommerce.repository.UserRepository;
import com.java.ecommerce.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

	private final UserRepository userRepository;
	private final JwtProvider jwtProvider;
	
	@Override
	public User findUserByJwtToken(String jwt) throws Exception {
		String email=jwtProvider.getEmailFromJwtToken(jwt);
		return this.findUserByEmail(email);
		
	}

	@Override
	public User findUserByEmail(String email) throws Exception {
		User user=userRepository.findByEmail(email);
		if(user==null) {
			throw new Exception("User not found with email - "+ email);
		}
		return user;
	}

}
