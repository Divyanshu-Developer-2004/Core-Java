package Array;

import java.util.Scanner;

public class Array_Modification {
	
	public static int[] addElementInIndex(int[] a, int ele,int index) {
		int[] b=new int[a.length+1];
		int c=0;
		for(int i=0;i<a.length+1;i++) {
			if(i<index) {
				b[i]=a[c];
				c++;
			}
			if(i>index) {
				b[i]=a[c];
				c++;
			}
		}
		b[index]=ele;
		return b;
	}
	
	public static void replaceElementInIndex(int[] a, int ele,int index) {
		a[index]=ele;
	}
	
	public static int[] removeElementInIndex(int[] a,int index) {
		int[] b=new int[a.length-1];
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(i==index) 
				continue;
			else {
				b[c]=a[i];
				c++;
			}
		}
		return b;
	}
	
	public static void display(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a= {4,5,76,88,3};
		a=addElementInIndex(a, 99, 3);
		display(a);
		replaceElementInIndex(a, 11, 2);
		display(a);
		a=removeElementInIndex(a,4);
		display(a);
		
	}
}
