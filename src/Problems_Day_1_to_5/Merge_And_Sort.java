package Problems_Day_1_to_5;
import java.util.*;
public class Merge_And_Sort {
	public static void main(String[] args) {
		int[] a= {1,2,5,7,9};
		int[] b= {2,3,4,6,8};
		
		int[] c=merge(a,b);
		System.out.println(Arrays.toString(c));
	}
	
	public static int[] merge(int[] a,int[] b) {
		int[] c=new int[a.length+b.length];
		int i,j,k;
		for(i=0,j=0,k=0;i<a.length&&j<b.length;) {
			if(a[i]<b[j]) {
				c[k++]=a[i++];
			}else{
				c[k++]=b[j++];
			}
		}
		while(i<a.length)
			c[k++]=a[i++];
		while(j<b.length)
			c[k++]=b[j++];
		return c;
	}
}
