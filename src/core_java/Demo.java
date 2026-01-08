package core_java;

public class Demo {
	
	 public static void main(String[] args) {
		int a=10;
		long b=a; 
		System.out.println(b); //widening
		
		long c=20;
		int d=(int)c;
		System.out.println(d); //narrowing no data loss
		
		double a1=55.55;
		int b1=(int)a1;
		System.out.println(b1); //narrowing data loss
	}
}