package com.vaniit.corejava.oops;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee e = new Employee(102,"Aarohi", 40000);
		e.setId(101);
		e.setName("Vani");
		e.setSalary(34345);
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
	}

}
