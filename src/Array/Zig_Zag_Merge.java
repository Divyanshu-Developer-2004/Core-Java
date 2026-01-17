package Array;

import java.util.Scanner;

public class Zig_Zag_Merge {
	
	public static void inputInt (int[]a) {
		Scanner sc=new Scanner (System.in);
		//System.out.println("Enter the integer values");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public static int[] zigZagMerge(int[] a,int[]b) {
		int[] c=new int[a.length+b.length];
		int c1=0;
		for(int i=0,j=0 ;i<a.length || j<b.length;i++,j++) {
			if(i<a.length) {
				c[c1]=a[i];
				c1++;
			}
			if(j<b.length) {
				c[c1]=b[j];
				c1++;
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many elements you want to put in Array 1: ");
		int n1=sc.nextInt();
		System.out.print("Enter how many elements you want to put in Array 2: ");
		int n2=sc.nextInt();
		int[] a=new int[n1];
		int[] b=new int[n2];
		int[] c;
		System.out.println("Enter Elements in Array 1 :");
		inputInt(a);
		System.out.println("Enter Elements in Array 2 :");
		inputInt(b);
		c=zigZagMerge(a, b);
		//Printing merged array
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		
	}
}
