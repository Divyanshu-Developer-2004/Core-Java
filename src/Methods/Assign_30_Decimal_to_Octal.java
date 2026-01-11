package Methods;
import java.util.Scanner;
public class Assign_30_Decimal_to_Octal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Decimal number : ");
		int n=sc.nextInt();
		String o=D_to_O(n);
		System.out.println("Decimal("+n+") ---> Octal("+o+")");
	}
	//decimal to Octal converter
	public static String D_to_O(int n) {
		String o="";
		while(n!=0) {
			o=(n%8)+o;
			n/=8;
		}
		return o;
	}
}
