package com.java.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ecommerce.domain.USER_ROLE;
import com.java.ecommerce.model.VerificationCode;
import com.java.ecommerce.repository.UserRepository;
import com.java.ecommerce.request.LoginRequest;
import com.java.ecommerce.response.ApiResponse;
import com.java.ecommerce.response.AuthResponse;
import com.java.ecommerce.response.SignupRequest;
import com.java.ecommerce.service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

	private final UserRepository userRepository;
	private final AuthService authService;
	@PostMapping("/signup")
	private ResponseEntity<AuthResponse> createUserHandler(@RequestBody SignupRequest req) throws Exception{
		
		String jwt=authService.createUser(req);
		
		AuthResponse res=new AuthResponse();
		res.setJwt(jwt);
		res.setMessage("register success");
		res.setRole(USER_ROLE.ROLE_CUSTOMER);
		
		
		return ResponseEntity.ok(res);
	} 
	
	@PostMapping("/sent/login-signup-otp")
	private ResponseEntity<ApiResponse> sendOtpHandler(@RequestBody VerificationCode req) throws Exception{
		
		authService.sentLoginOtp(req.getEmail());
		ApiResponse res=new ApiResponse();
		res.setMessage("Otp sent successfully");
		return ResponseEntity.ok(res);
	} 
	
	@PostMapping("/signing")
	private ResponseEntity<AuthResponse> loginHandler(@RequestBody LoginRequest req) throws Exception{
		
		AuthResponse  authResponse = authService.signing(req);
		return ResponseEntity.ok(authResponse);
	}
}
