package com.vaniit.corejava.oops;
//Method overriding is achieved through Inheritance
interface Vehicle{
	public void run();
}

public class Car implements Vehicle {
	
	@Override
	public void run() {
		System.out.println("Car is running smoothly...");
	}
	
	public static void main(String[] args) {
		new Car().run();
		
	}

}
