package com.jsp.MavenProject9;

import java.util.Map;

public class Country {
	private String countryName;
	private Map<String, String> stateAndLanguage;
	
	public Country(String countryName, Map<String, String> stateAndLanguage) {
		super();
		this.countryName = countryName;
		this.stateAndLanguage = stateAndLanguage;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Map<String, String> getStateAndLanguage() {
		return stateAndLanguage;
	}
	public void setStateAndLanguage(Map<String, String> stateAndLanguage) {
		this.stateAndLanguage = stateAndLanguage;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", stateAndLanguage=" + stateAndLanguage + "]";
	}
	
	
}
