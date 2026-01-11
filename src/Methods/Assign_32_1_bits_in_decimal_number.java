package Methods;
import java.util.Scanner;
public class Assign_32_1_bits_in_decimal_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		int b=D_to_B(n);
		int c=count_1(b);
		System.out.println(b);
		System.out.println("Numer of bit 1 in decimal("+n+") is "+c);
	}
	//count number of 1 bits
	public static int count_1(int n) {
		int c=0;
		while(n!=0) {
			if(n%10==1) {
				c++;
			}
			n/=10;
		}
		return c;
	}
	//decimal to binary converter
	public static int D_to_B(int n) {
		int b=0,c=0;
		while(n!=0) {
			if((n%2)==0) {
				c++;
			}
			else {
				b+=power(10,c++);
			}
			n/=2;
		}
		return b;
	}
	//power calculation method
	public static int power(int b, int p) {
		int r=1;
		for(int i=1;i<=p;i++) {
			r*=b;
		}
		return r;
	}
	
}
