package com.java.ecommerce.service;

import org.springframework.mail.MailException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmailService {

	private final JavaMailSender javaMailSender;
	
	public void sendVerificationOtpEmail(String userEmail, String otp, String subject, String text) {
		
		try {
			
		}catch(MailException e) {
			throw new MailSendException("failed to send email");
		}
	}
}
