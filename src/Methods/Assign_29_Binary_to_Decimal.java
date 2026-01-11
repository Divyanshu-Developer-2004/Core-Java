package Methods;
import java.util.Scanner;
public class Assign_29_Binary_to_Decimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Binary number : ");
		int b = sc.nextInt();
		int d=B_to_D(b);
		System.out.println("Binary ("+b+") --> Decimal("+d+")");
	}
	// Binary to Decimal converter
	public static int B_to_D(int n) {
		int sum=0,c=0;
		while(n!=0) {
			sum+=((n%10)*power(2,c++));
			n/=10;
		}
		return sum;
	}
	
	// Power function
	public static int power(int b, int p) {
		int r = 1;
		for (int i = 1; i <= p; i++) {
			r *= b;
		}
		return r;
	}
}
