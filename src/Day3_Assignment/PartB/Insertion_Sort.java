package Day3_Assignment.PartB;

import java.util.Arrays;

public class Insertion_Sort {
	public static void insertionSort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
	
	public static void main(String[] args) {
		int[] a= {3,1,6,5,9,7,8,10,2};
		System.out.println(Arrays.toString(a));
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
}
