package com.jsp.MavenProject4;

import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	
		public static void main(String[] args) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jsp/MavenProject4/Config.xml");
			
			Employee e1 = (Employee) context.getBean("employee");
			
			System.out.println(e1);
			
			Set<Long> s1 = e1.getContactNumber();
			System.out.println(s1.getClass());
		}
}
