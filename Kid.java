package com.vaniit.corejava.oops;

interface Father{
	public static final int X=10;
	
	abstract void m1();
	
}

interface Mother{
	abstract void m1();
	
}

public class Kid implements Father,Mother {
	
	@Override
	public void m1() {
		System.out.println("M1 method from Kid..");
		
	}
	
	public static void main(String[] args) {
		
		new Kid().m1();
		
	}

}
