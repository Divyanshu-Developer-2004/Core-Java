package Array;
import java.util.Scanner;

import Loop.Sum_digit;
public class Array_Sum1 {
	
	public static void inputInt (int[]a,int n) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the integer values");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public static void sum(int[]a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("Sum = "+sum);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many elements you want to put: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		inputInt(a, n);
		sum(a);
	}
}
