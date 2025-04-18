package com.java.ecommerce.model;

import com.java.ecommerce.domain.PaymentStatus;

import lombok.Data;

@Data
public class PaymentDetails {
	
	private String paymentId;
	private String razorpayPaymentLinkId;
	private String razorpayPaymentLinkReferenceId;
	private String razorpayPaymentLinkStatus;
	private String razorpayPaymentIdZWSF;
	private PaymentStatus status;

}
