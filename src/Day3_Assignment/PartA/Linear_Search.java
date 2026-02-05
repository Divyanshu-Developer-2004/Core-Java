package Day3_Assignment.PartA;

public class Linear_Search {
	
	//Linear Search
	public static int linearSearch(int[] a,int ele) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[]= {2,45,77,89,100,108,117,132,139,141};
		System.out.println(linearSearch(a, 108));
		System.out.println(linearSearch(a, 105));
	}
}
