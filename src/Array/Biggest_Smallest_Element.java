package Array;

import java.util.Scanner;

public class Biggest_Smallest_Element {
	
	public static void inputInt (int[]a) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the integer values");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public static int[] Big_Small(int[] a) {
		int[] b=new int[2];
		b[0]=a[0];
		b[1]=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>b[1]) {
				b[1]=a[i];
			}
			if(a[i]<b[0]) {
				b[0]=a[i];
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many elements you want to put: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b;
		inputInt(a);
		b=Big_Small(a);
		System.out.println("Max element : "+b[1]);
		System.out.println("Min element : "+b[0]);
	}
}

