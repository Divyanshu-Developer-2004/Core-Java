package Operators;

public class Assign_8_divisiblity {
	public static void main(String[] args) {
		int n=105;
		String s=((n%3==0)&&(n%5==0))?n+" is divisible by both 3 and 5":n+" is not divisible by both 3 and 5";
		System.out.println(s);
	}
}
