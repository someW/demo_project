package com.demo;

public class ClassB extends ClassA{
	public ClassB() {
		System.out.println("HelloB");
	}
	
    { System.out.println("I'm B class"); }
    
    static { System.out.println("static B"); }
    
    public static void main(String[] args) {
    	 System.out.println("-------main start-------");
         new ClassB();
         new ClassB();
         System.out.println("-------main end-------");
	}

}
