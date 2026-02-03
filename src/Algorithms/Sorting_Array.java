package Algorithms;
import java.util.*;
public class Sorting_Array {
	public static void main(String[] args) {
		int[] a= {1,3,66,4,7,10,9,11,44};
		int[] b=bubbleSort(a);
		System.out.println(Arrays.toString(b));
	}
	
	//Bubble sort
	public static int[] bubbleSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			boolean flag=false;
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					flag=false;
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			if(flag==false)
				break;
		}
		return a;
	}
	
	//Merge Sort
	public static void mergeSort(int[] a,int start,int end) {
		if(start>=end)
			return;
		
		int mid=start+((end-start)/2);
		
		mergeSort(a, start, mid);
		mergeSort(a, mid+1, end);
		merge(a,start,mid,end);
	}
	
	//Merging
	public static void merge(int[] a,int start,int mid,int end) {
		int m=mid-start+1;
		int n=end-mid;
		
		int[] arr1=new int[m];
		int[] arr2=new int[n];
		
		for(int i=0;i<m;i++) {
			arr1[i]=a[i+start];
		}
		for(int i=0;i<n;i++) {
			arr1[i]=a[end-n+i];
		}
		
		int[] arr3=new int[m+n];
		
		int[] c=new int[a.length+arr2.length];
		int i,j,k;
		for(i=0,j=0,k=0;i<a.length&&j<arr2.length;) {
			if(arr1[i]<arr2[j]) {
				arr3[k++]=arr1[i++];
			}else{
				arr3[k++]=arr2[j++];
			}
		}
		while(i<m)
			arr3[k++]=arr1[i++];
		while(j<n)
			arr3[k++]=arr2[j++];
		
		for(int l=0;l<a.length;i++) {
			a[l]=arr3[l];
	}
	}
}

