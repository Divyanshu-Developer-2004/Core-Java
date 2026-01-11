package Methods;
import java.util.Scanner;
public class Assign_28_Decimal_to_Binary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		String b=D_to_B(n);
		System.out.println("Decimal("+n+") ---> Binary("+b+")");
	}
	//decimal to binary converter
	public static String D_to_B(int n) {
		String b="";
		while(n!=0) {
			b=(n%2)+b;
			n/=2;
		}
		return b;
	}
}
