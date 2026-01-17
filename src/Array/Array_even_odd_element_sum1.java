package Array;

import java.util.Scanner;

public class Array_even_odd_element_sum1 {
	
	public static void inputInt (int[]a,int n) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the integer values");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public static void sum_even_odd(int[]a,int n) {
		int sum_e=0,sum_o=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0)
				sum_e+=a[i];
			else
				sum_o+=a[i];
		}
		System.out.println("Sum of Odd Elements = "+sum_o);
		System.out.println("Sum of Even Elements = "+sum_e);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many elements you want to put: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		inputInt(a, n);
		sum_even_odd(a, n);
	}
}
