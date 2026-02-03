package Recursion;

public class Print_Array {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		print(a, 0);
		System.out.println();
	}
	
	public static void print(int[] a,int i) {
		if(i>=a.length)
			return;
		System.out.print(a[i]+" ");
		print(a,++i);
	}
}
