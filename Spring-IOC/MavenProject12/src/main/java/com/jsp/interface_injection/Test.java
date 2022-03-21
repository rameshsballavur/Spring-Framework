package com.jsp.interface_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jsp/interface_injection/Config.xml");
		
		Customer c1 = (Customer) context.getBean("customer");
		
		System.out.println(c1);
		
		Account a1 = c1.getAccount();
		a1.deposit();
		a1.withdraw();
	}
}
