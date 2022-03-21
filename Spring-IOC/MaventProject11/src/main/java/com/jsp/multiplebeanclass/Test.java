package com.jsp.multiplebeanclass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jsp/multiplebeanclass/Config.xml");
		
		College c1 = (College) context.getBean("college");
		
		System.out.println(c1);
	}
}
