package com.jsp.MavenProject5;

import java.util.Map;

public class Country {
	private String name;
	
	private Map<String, String> stateAndLanguage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getStateAndLanguage() {
		return stateAndLanguage;
	}

	public void setStateAndLanguage(Map<String, String> stateAndLanguage) {
		this.stateAndLanguage = stateAndLanguage;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", stateAndLanguage=" + stateAndLanguage + "]";
	}
	
	

	
	
}
