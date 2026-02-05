package Day3_Assignment.PartC;

import java.util.Arrays;

public class Sort_012 {
	public static void dutchFlagAlgo(int[] a) {
		int start=0;
		int mid=0;
		int end=a.length-1;
		while(mid<=end) {
			if(a[mid]==0) {
				int temp=a[start];
				a[start]=a[mid];
				a[mid]=temp;
				mid++;
				start++;
				
			}else if(a[mid]==1) {
				mid++;
			}else {
				int temp=a[end];
				a[end]=a[mid];
				a[mid]=temp;
				end--;
			}
		}	
	}
	
	public static void main(String[] args) {
		int[] a= {2,2,0,0,0,1,0,1,1};
		dutchFlagAlgo(a);
		System.out.println(Arrays.toString(a));
	}
}
