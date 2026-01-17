package Encapsulation;

public class Driver2_Encapsulation {

	public static void main(String[] args) {
		Account_Encapsulation a1=new Account_Encapsulation(1001,12345);
		Account_Encapsulation a2=new Account_Encapsulation(999,678910);
		a1.setBalance(45000.0,12345);
		a2.setBalance(22000,44444);
		System.out.println(a1.getBalance(12345));
	}
}
