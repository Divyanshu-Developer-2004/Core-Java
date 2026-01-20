package Abstraction;

public interface Calci {
	
	//protected abstract int add(int a,int b); its giving error because protected access is allowed in the same pacakage which defeats the purpose of interface
	public abstract int add(int a,int b);
	
	public abstract int multi(int a,int b);
	
	int sub(int a,int b);//By default it will take it public abstract
	/*
	 * public int sub(int a,int b) { return a-b; }  cannot implement non static method in interface
	 */
	
	public static int sub(int a,int b,int c) {//can implement static method in interface
		return a-b-c;
	}
	
}
