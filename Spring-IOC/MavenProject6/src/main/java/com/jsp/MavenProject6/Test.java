package com.jsp.MavenProject6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jsp/MavenProject6/Config.xml");
		
		Person p1 = (Person) context.getBean("person");
		
		System.out.println(p1);
	}
}
