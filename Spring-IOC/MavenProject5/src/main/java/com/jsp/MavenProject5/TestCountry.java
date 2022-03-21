package com.jsp.MavenProject5;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountry {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jsp/MavenProject5/Config.xml");
		
		Country c1 = (Country)context.getBean("country");
		
		System.out.println(c1);
		
		Map<String,String> map = c1.getStateAndLanguage();
		System.out.println(map.getClass());
		
	}
}
