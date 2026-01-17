package Array;

import java.util.Scanner;

public class Digit_Sum_Array {
	
	public static void inputInt (int[]a) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the integer values");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public static int digitSum(int n) {
		int a,sum=0;
		while(n>0) {
			a=n%10;
			sum+=a;
			n/=10;
		}
		return sum;
		//System.out.println("Sum of Digits : "+sum);
	}
	
	public static void digitSumArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			a[i]=digitSum(a[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many elements you want to put: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b;
		inputInt(a);
		digitSumArray(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
}
