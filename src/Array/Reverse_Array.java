package Array;

import java.util.Scanner;

public class Reverse_Array {
	
	public static void inputInt (int[]a) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the integer values");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public static void reverseArray(int[] a) {
		for(int i=0;i<(a.length)/2;i++) {
			int temp=a[a.length-i-1];
			a[a.length-1-i]=a[i];
			a[i]=temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many elements you want to put: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b;
		inputInt(a);
		reverseArray(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
