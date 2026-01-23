package Wrapper_Class;

public class Example1 {
	public static void main(String[] args) {

		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		Integer i= Integer.valueOf("123");//Converts String to Wrapper Type
		System.out.println(i+1);
		
		Boolean b=Boolean.valueOf("true");//Converts String to Wrapper Type
		System.out.println(b);
		b=Boolean.valueOf("TRUE");//Converts String to Wrapper Type ignores case
		System.out.println(b);
		b=Boolean.valueOf("TRE");//Converts String to Wrapper Type for another value gives default value false
		System.out.println(b);
		
		int a=Integer.parseInt("123");//directly converts String to primitive int
		long l=Long.parseLong("567");//directly converts String to primitive long
		
//		int c=Integer.parseInt("123a");// Gives number format Exception
//		int d=Integer.parseInt("");// Gives number format Exception
		
		String s1=Integer.toString(34);//Takes Integer and convert it to String
		
	}
	
	public static void m1(){
		int n=10;
		Integer i=n; // auto boxing Primitive to Non-Primitive
		int n2=i;// auto unboxing Non-Primitive to Primitive
		
		Integer i2=90;// auto boxing
	}
}
