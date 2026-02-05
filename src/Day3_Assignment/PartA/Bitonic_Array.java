package Day3_Assignment.PartA;

public class Bitonic_Array {
	
	public static int peakElement(int[] a) {
		int min=0,max=a.length-1,mid=0;
		while(min<max) {
			mid=min+((max-min)/2);
			if(a[mid]<a[mid+1])
				min=mid+1;
			else
				max=mid;
		}
		return a[mid];
	}
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,60,5,4,3};
		System.out.println(peakElement(a));
	}
}
