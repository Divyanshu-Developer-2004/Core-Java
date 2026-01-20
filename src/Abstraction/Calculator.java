package Abstraction;

public abstract class Calculator {
	
	public abstract int add(int a,int b);//Abstract method
	
	public abstract int multi(int a,int b);//Abstract method
	
	public int sub(int a,int b) {//Concrete method has implementation i.e.body
		return a-b;
	}
}
