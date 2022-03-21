package com.jsp.constructor_ambiguity;

public class Sample {
	
	public Sample(double a, double b) {
		System.out.println("double - type arguments");
		System.out.println(a);
		System.out.println(b);
	}
	
	public Sample(int a, int b) {
		System.out.println("integer - typ arguments");
		System.out.println(a);
		System.out.println(b);
	}
	
	public Sample(String a, String b) {
		System.out.println("String - type argumets");
		System.out.println(a);
		System.out.println(b);
	}
}
