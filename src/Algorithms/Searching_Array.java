package Algorithms;
import java.util.*;
public class Searching_Array {
	public static void main(String[] args) {
		int[] a= {1,4,5,77,94,34,23,11,10};
		System.out.println(linearSearch(a,77));
		
		int[] b= {1,2,5,8,10,33,57,78,99,142,155,167};
		System.out.println(binarySearch(b,167));
	}
	
	//Linear Search
	public static int linearSearch(int[] a,int ele) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele)
				return i;
		}
		return -1;
	}
	
	//Binary Search
	public static int binarySearch(int[] a,int ele) {
		int min=0,max=a.length-1,mid;
		int N=a.length;
		while(min<=max) {
			mid=min+((max-min)/2);//Doesn't give number overflow error(If array is very large then min+max/2 will be long which might not get stored in int )
			if(a[mid]==ele)
				return mid;
			else if(ele<a[mid])
				max=mid-1;
			else if(ele>a[mid])
				min=mid+1;
		}
		return -1;
	}
	
	//Binary Search in List
	public static int binarySearchList(ArrayList<Integer> list,int ele) {
		int N=list.size();
		int min=0,max=N-1,mid;
		while(min<=max) {
			mid=min+((max-min)/2);
			if(list.get(mid)==ele)
				return mid;
			else if(ele<list.get(mid))
				max=mid-1;
			else if(ele>list.get(mid))
				min=mid+1;
		}
		return -1;
	}
}
