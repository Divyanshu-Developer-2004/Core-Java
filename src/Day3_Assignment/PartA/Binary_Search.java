package Day3_Assignment.PartA;

public class Binary_Search {
	
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
	
	public static void main(String[] args) {
		int a[]= {2,45,77,89,100,108,117,132,139,141};
		System.out.println(binarySearch(a, 108));
		System.out.println(binarySearch(a, 105));
	}
}
