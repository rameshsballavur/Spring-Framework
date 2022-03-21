package com.jsp.MavenProject3;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIpl {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jsp/MavenProject3/Config.xml");
		
		Ipl t1 = (Ipl) context.getBean("ipl");
		
		System.out.println(t1);
		
		List<String> list =t1.getPlayers();
		System.out.println(list.getClass());
		
	}
}
