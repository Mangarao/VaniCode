package com.vaniit.corejava.oops;

class Parent{
	void hi() {
		System.out.println("Hi from parent");
	}
}

public class Child extends Parent {
	
	void hi() {
		System.out.println("Hi from child");
		super.hi();
	}

	public static void main(String[] args) {
		
		new Child().hi();
	
	}
}
