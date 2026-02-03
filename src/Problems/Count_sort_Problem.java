package Problems;
import java.util.*;
public class Count_sort_Problem {
	public static void main(String[] args) {
		int[] a= {3,3,5,2,1,4,5,5,3,1,2};
		countSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	//Count Sort Problem
	public static void countSort(int[] a) {
		int[] hash=new int[a.length+1];
		for(int i:a) {
			hash[i]++;
		}
		
		int c=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<hash[i];j++)
				a[c++]=i;
		}
	}
}
