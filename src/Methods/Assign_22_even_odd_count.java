package Methods;
import java.util.Scanner;
public class Assign_22_even_odd_count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		System.out.println(n+" even number of digit is equal to odd number of digit : "+even_odd_count(n));
	}

	private static boolean even_odd_count(int n) {
		int ev=0,od=0;
		while(n!=0) {
			if(n%2==0) {
				ev++;
			}
			else {
				od++;
			}
			n/=10;
		}
		
		if(ev==od)
			return true;
		else
			return false;
	}
}
