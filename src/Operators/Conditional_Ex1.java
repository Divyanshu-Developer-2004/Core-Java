package Operators;

public class Conditional_Ex1 {
	public static void main(String[] args) {
		int a=5,b=10;
		String s1=(a>b)?"a grater than b":"a less than b";
		String s2=(a>b)?a+" grater than "+b:a+" less than "+b;
		System.out.println(s1);
		System.out.println(s2);
	}
}
