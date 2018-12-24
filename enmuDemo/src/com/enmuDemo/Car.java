package com.enmuDemo;

public enum Car {
	BMW(80),AUDI(50),HONDA(30),AUTO(20);
	private int price;
	Car(int p){
		price = p;
	}
	
	int getPrice() {
		return price;
	}
}
