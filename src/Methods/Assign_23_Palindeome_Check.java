package Methods;
import java.util.Scanner;
public class Assign_23_Palindeome_Check {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number : ");
		int n=sc.nextInt();
		String s=Palindrome(n);
		System.out.println(s);
	}

	public static String Palindrome(int n) {
		int a=n,n2=0;
		while(a!=0) {
			n2=(n2*10)+(a%10);
			a/=10;
		}
		if(n2==n)
			return "Good";
		else
			return "Bad";
	}
}
