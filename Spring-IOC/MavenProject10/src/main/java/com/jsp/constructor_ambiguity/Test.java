package com.jsp.constructor_ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jsp/constructor_ambiguity/Config.xml");
		
		Sample s1 = (Sample) context.getBean("sample");
		System.out.println(s1);
		
		Sample s2 = (Sample) context.getBean("sample1");
		System.out.println(s2);
	}
}
