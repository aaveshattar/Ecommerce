package com.java.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.ecommerce.model.Cart;

public interface CartRepository extends JpaRepository<Cart,Long> {

}
