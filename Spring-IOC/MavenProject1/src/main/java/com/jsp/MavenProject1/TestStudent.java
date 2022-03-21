
package com.jsp.MavenProject1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args)
	{
	
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jsp/MavenProject1/config.xml");
			
			Student s1  = (Student) context.getBean("RCB");
			
			System.out.println(s1);
		
	}
}
