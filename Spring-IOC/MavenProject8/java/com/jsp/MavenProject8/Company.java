package com.jsp.MavenProject8;

import java.util.List;
import java.util.Set;

public class Company {
	private String companyName;
	private List<String> managers;
	private Set<String> projects;
	
	public Company(String companyName, List<String> managers, Set<String> projects) {
		super();
		this.companyName = companyName;
		this.managers = managers;
		this.projects = projects;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<String> getManagers() {
		return managers;
	}
	public void setManagers(List<String> managers) {
		this.managers = managers;
	}
	public Set<String> getProjects() {
		return projects;
	}
	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", managers=" + managers + ", projects=" + projects + "]";
	}
	
	
	
}
