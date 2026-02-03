package Array;
import java.util.*;
public class Array_printing_and_initilization {
	public static void main(String[] args) {
		int[] arr= {1,4,6,7,9,0,2};
		
		System.out.println(Arrays.toString(arr));//using Arrays.toString() to print array
		System.out.println("\n\n\n");
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		
//		int[] rev=new int[arr.length];
//		for(int i=0;i<arr.length/2;i++) {
//			int temp=arr[i];
//			arr[i]=arr[arr.length-1-i];
//			arr[arr.length-1-i]=temp;
//		}
		
//		m1();
//		mdelete2();
		smallestElement();
	}
	
	//reverse array method
	public int[] rev(int[] arr) {
		int[] rev=new int[arr.length];
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		return arr;
	}
	
	//Method 2D array
	public static void m1() {
		int[][] arr= {{1,2,3,4,5},{2,4,5},{1,0,1,1}};
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
	
	//method to delete element
	public static void mdelete() {
		int[] arr= {1,2,3,4,5,6};
		arr[2]=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=Integer.MIN_VALUE)
				System.out.print(arr[i]+" ");
		}
	}
	
	//method to delete element from 2D
	public static void mdelete2() {
		int[][] arr={ {1,2,3,4,},{3,4,7},{11,33,9,90}};
		arr[2][1]=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]!=Integer.MIN_VALUE)
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//method to find min value in arr
	public static void smallestElement() {
		int[] arr= {1,2,3,-6,5,6};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}
