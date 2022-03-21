package com.jsp.Constructor_Injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jsp/Constructor_Injection/Config.xml");
	
		Student s1 = (Student) context.getBean("student");
		
		System.out.println(s1);
	}

}
