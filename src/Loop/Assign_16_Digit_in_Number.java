package Loop;

public class Assign_16_Digit_in_Number {
	public static void main(String[] args) {
		int n=18764,c=0,a=n;
		while(n>0) {
			c++;
			n/=10;
		}
		System.out.println("Number of Digit in "+a+" is "+c);
	}
}
