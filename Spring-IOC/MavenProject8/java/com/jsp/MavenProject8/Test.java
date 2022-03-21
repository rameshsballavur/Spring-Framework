package com.jsp.MavenProject8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jsp/MavenProject8/Config.xml");
	
		Company c1 = (Company) context.getBean("company");
		
		System.out.println(c1);
	}
}
