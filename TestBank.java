package com.vaniit.corejava.oops;

interface Bank{
	void rateOfInterest();
	
}

interface SBIBank{
		void checkBalance();
		void withdraw(double amt);
		void deposit(double amt);
		void transfer(double amt, long accNumber);
}

class AXIS implements Bank{

	@Override
	public void rateOfInterest() {
		System.out.println("AXIS ROI is: 10.5%");
		
	}
	
}

class ICICI implements Bank{

	@Override
	public void rateOfInterest() {
		System.out.println("ICICI ROI is: 11.5%");
		
	}
	
}

class HDFC implements Bank{

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC ROI is: 9.5%");
		
	}
	
}

public class TestBank {
	
	public static void main(String[] args) {
		//Referring child object with parent rererence.
		Bank axis = new AXIS();
		axis.rateOfInterest();
		Bank icici = new ICICI();
		icici.rateOfInterest();
		HDFC hdfc = new HDFC();
		hdfc.rateOfInterest();
	}

}
