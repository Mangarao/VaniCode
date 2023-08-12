package com.vaniit.corejava.oops;

public class Calculator {

	double sum(int a, double b) {
		return a + b;
	}

	int sum(int a, int b, int c) {
		return a + b+c;
	}
	
	long sum(long a, long b) {
		return a + b;
	}
	
	double sum(double a, int b) {
		System.out.println("sum with double parameter is called");
		return a+b;
	}

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		double sum = c1.sum(10L, 20L);
		System.out.println(sum);

	}

}
