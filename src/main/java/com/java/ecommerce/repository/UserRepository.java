package com.java.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.ecommerce.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
