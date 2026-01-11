package Methods;
import java.util.Scanner;
public class Assign_27_Check_Disarium_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		String s=(Disarium(n))?"Disarium Number":"Not a Disarium Number";
		System.out.println(s);
	}
	//Check Disarium Number or not
	public static boolean Disarium(int n) {
		int a=n,sum=0,c=count(n);
		while(a!=0) {
			sum+=power(a%10,c--);
			a/=10;
		}
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}
	//count number of digits
	public static int count(int n) {
		int c=0;
		while(n!=0) {
			c++;
			n/=10;
		}
		return c;
	}
	//Power function
	public static int power(int b, int p) {
		int r=1;
		for(int i=1;i<=p;i++) {
			r*=b;
		}
		return r;
	}
}
