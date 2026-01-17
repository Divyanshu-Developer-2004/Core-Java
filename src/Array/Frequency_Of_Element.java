package Array;

import java.util.Scanner;

public class Frequency_Of_Element {
	
	public static void inputInt (int[]a) {
		Scanner sc=new Scanner (System.in);
		//System.out.println("Enter the integer values");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public static int frequency(int[] a,int el) {
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==el) {
				c++;
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many elements you want to put in Array 1: ");
		int n1=sc.nextInt();
		int[] a=new int[n1];
		System.out.println("Enter Elements in Array 1 :");
		inputInt(a);
		System.out.println("Enter element to check frquency");
		int el=sc.nextInt();
		int f;
		
		f=frequency(a,el);
		System.out.println("The frequency of "+el+" in array is "+f);
		
	}
}
