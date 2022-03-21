package com.jsp.MavenProject9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jsp/MavenProject9/Config.xml");
		
		Country c1 = (Country) context.getBean("country");
		
		System.out.println(c1);
	}
}
