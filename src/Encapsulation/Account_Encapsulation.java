package Encapsulation;

public class Account_Encapsulation {
	private int id;
	private double balance;
	private int pass;
	
	public Account_Encapsulation(int id,int pass) {
		this.id=id;
		this.pass=pass;
	}
	
	public void setBalance(double balance,int pass) {
		if(balance<0) {
			System.out.println("Invalid balance to to stored");
		}
		else {
			if(this.pass==pass) {
				this.balance=balance;
			}
			else {
				System.out.println("Incorrect Password");
			}
		}
	}
	
	public double getBalance(int pass) {
		if(this.pass==pass) {
			return balance;
		}
		else {
			System.out.println("InCorrect Password");
			return -1.0;
		}
	}
	
	public void setID(int id,int pass) 
	{
		if(this.pass==pass) {
			this.id=id;
		}
		else {
			System.out.println("InCorrect Password");
		}
	}
	
	public int getID(int pass) {
		if(this.pass==pass) {
			return this.id;
		}
		else {
			System.out.println("InCorrect Password");
			return -1;
		}
	}
}
