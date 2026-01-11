package Methods;
import java.util.Scanner;
public class Assign_24_Check_Happy_Number {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the number : ");
		 int n=sc.nextInt();
		 String s=(Happy(n))?"Happy":"UnHappy";
		 System.out.println(s);
	}
	//check number is Happy number or not
	public static boolean Happy(int n) {
		int a=n;
		boolean flag=true;
		while((a!=1)) {
			a=square_sum_digit(a);
			System.out.print(a+"->");
			if(a==n && n!=1) {
				flag=false;
				break;
			}
		}
		System.out.println();
		return flag;
	}
	//return sum of square of digits
	public static int square_sum_digit(int n) {
		int r=0;
		while(n!=0) {
			r+=(n%10)*(n%10);
			n/=10;
		}
		return r;
	}
}
