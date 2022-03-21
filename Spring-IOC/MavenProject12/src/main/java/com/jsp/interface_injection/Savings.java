package com.jsp.interface_injection;

import org.springframework.stereotype.Component;

@Component
public class Savings implements Account{

	@Override
	public void withdraw() {
		
		System.out.println("withdraw from savings account");
		
	}

	@Override
	public void deposit() {
		
		System.out.println("deposit to withdraw account");
		
	}

}
