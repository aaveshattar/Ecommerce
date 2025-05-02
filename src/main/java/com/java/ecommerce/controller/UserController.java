package com.java.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.java.ecommerce.domain.USER_ROLE;
import com.java.ecommerce.model.User;
import com.java.ecommerce.response.AuthResponse;
import com.java.ecommerce.response.SignupRequest;
import com.java.ecommerce.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;
	
	@GetMapping("/users/profile")
	private ResponseEntity<User> createUserHandler(@RequestHeader("Authorization") String jwt) throws Exception{
		
		User user=userService.findUserByJwtToken(jwt);
		
		return ResponseEntity.ok(user);
	} 
	
	
}
