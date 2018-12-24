package com.demo;

public class ClassA {

	public ClassA() {
		System.out.println("HelloA");
	}
	
	{ System.out.println("I'm A class"); }
    
    static { System.out.println("static A"); }
}
