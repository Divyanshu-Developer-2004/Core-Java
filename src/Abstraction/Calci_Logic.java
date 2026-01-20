package Abstraction;

public class Calci_Logic implements Calci {
	
	@Override
	public int add(int a,int b) {
		return a+b;
	}
	
	@Override
	public int multi(int a,int b) {
		return a*b;
	}
	
	@Override
	public int sub(int a,int b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		Calci c1=new Calci_Logic();
		System.out.println(c1.add(1,2));
	}
}
