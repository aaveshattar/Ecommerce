package com.java.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.ecommerce.model.Seller;

public interface SellerRepository  extends JpaRepository<Seller, Long>{

	Seller findByEmail(String email);
}
