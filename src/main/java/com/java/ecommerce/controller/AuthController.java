package com.java.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ecommerce.model.User;
import com.java.ecommerce.repository.UserRepository;
import com.java.ecommerce.response.SignupRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

	private final UserRepository userRepository;
	
	@PostMapping("/signup")
	private ResponseEntity<User> createUserHandler(@RequestBody SignupRequest req){
		User user=new User();
		user.setEmail(req.getEmail());
		user.setFullName(req.getFullName());
		User savedUser = userRepository.save(user);
		return ResponseEntity.ok(savedUser);
	} 
}
