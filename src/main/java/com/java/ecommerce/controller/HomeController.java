package com.java.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ecommerce.response.ApiResponse;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public ApiResponse HomeControllerHandler() {
		ApiResponse apiResponse=new ApiResponse();
		apiResponse.setMessage("Welcome to Ecommerce Project!");
		return apiResponse;
	}

}
