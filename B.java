package com.vaniit.corejava.oops;

interface A {
	public abstract void m1();

	/* / */
}

public class B implements A {

	@Override
	public void m1() {
		System.out.println("m1 method implementd");

	}

	public static void main(String[] args) {
		B b = new B();
		b.m1();
		// b.m2();
	}

}
