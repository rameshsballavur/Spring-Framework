package com.jsp.interface_injection;

import org.springframework.stereotype.Component;

@Component
public class Current implements Account {

	@Override
	public void withdraw() {
		
		System.out.println("withdraw from Current account");
		
	}

	@Override
	public void deposit() {
		
		System.out.println("deposit to Current account");
	}

}
