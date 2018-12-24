package com.enmuDemo;

public class CarMain {
	public static void main(String[] args) {
		for(Car c : Car.values()) {
			System.out.println(c+"车需要："+c.getPrice()+"万元");
		}
	}

}
