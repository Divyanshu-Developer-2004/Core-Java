package Array;

import java.util.Scanner;

public class Even_element1 {
	public static void inputInt (int[]a,int n) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the integer values");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public static int[] even_elem(int[] a) {
		
		int c=0;
		int[] b;
			for(int i=0;i<a.length;i++) {
				if(a[i]%2==0)
					c++;
			}
		b=new int[c];
		c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				b[c]=a[i];
				c++;
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
		inputInt(a, n);
		b=even_elem(a);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}
}
