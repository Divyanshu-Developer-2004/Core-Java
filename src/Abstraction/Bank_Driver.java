package Abstraction;

public class Bank_Driver {
	public static void main(String[] args) {
		Bank b1=new SBI();
		Bank b2=new HDFC();
		b1.getInterestRate();
		System.out.println();
		b2.getInterestRate();
	}
}
