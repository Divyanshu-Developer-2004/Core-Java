package Methods;
import java.util.Scanner;
public class Assign_25_Check_Strong_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		String s=(Strong(n))?"Strong":"Not Strong";
		System.out.println(s);
	}
	//to check Strong number
	public static boolean Strong(int n) {
		int a=n,sum=0;
		while(a!=0) {
			sum+=Factorial(a%10);
			a/=10;
		}
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}
	//to calculate sum of factorial
	public static int Factorial(int n) {
		int r=1;
		while(n!=0) {
			r*=n;
			n--;
		}
		return r;
	}
}
