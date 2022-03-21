package com.jsp.MavenProject1;



//bean class
public class Student {
	
	private int id;
	
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}




/*
<beans> tag --> to configure the configuration file
<bean> tag -->to create the object in .xml file

		
	--> value as Element
		<property name="id">
		<value>1234</value>
		</property>

	--> value as attribute
  		<property name = "name" value = "John" >
  		
	--> value as P-schema
		<bean name = "ipl" class = "com.jsp.MavenProject3.Ipl" p:teamName="RCB" p:captainName="Virat">

</property>

 ============================================================



*/