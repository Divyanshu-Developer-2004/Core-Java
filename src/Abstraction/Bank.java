package Abstraction;

public abstract class Bank {
	
	public abstract void getInterestRate();
}

class SBI extends Bank{
	
	public void getInterestRate() {
		System.out.println("SBI bank rate is 8.9%");
	}
}

class HDFC extends Bank{
	
	public void getInterestRate() {
		System.out.println("SBI bank rate is 7.5%");
	}
}
