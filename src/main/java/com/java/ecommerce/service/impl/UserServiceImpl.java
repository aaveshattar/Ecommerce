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
	public User findUserByJwtToken(String jwt) {
		
		return null;
	}

	@Override
	public User findUserByEmail(String email) {
		
		return null;
	}

}
