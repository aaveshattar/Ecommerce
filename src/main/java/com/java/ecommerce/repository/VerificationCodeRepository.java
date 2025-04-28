package com.java.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.ecommerce.model.VerificationCode;

public interface VerificationCodeRepository extends JpaRepository<VerificationCode,Long>{

	VerificationCode findByEmail(String email);
}
