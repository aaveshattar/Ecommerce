package com.java.ecommerce.model;

import java.util.HashSet;
import java.util.Set;

import com.java.ecommerce.domain.PaymentMethod;
import com.java.ecommerce.domain.PaymentOrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PaymentOrder {


	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private Long amount;

	private PaymentOrderStatus status = PaymentOrderStatus.PENDING;

	private PaymentMethod paymentMethod;

	private String paymentLinkId;

	@ManyToOne
	private User user; 
    
	@OneToMany  
	private Set<Order> orders = new HashSet<>();  
	
	
}
