package Day3_Assignment.PartB;
import java.util.Arrays;
public class Selection_Sort {
	public static void selectionSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int max_i=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[max_i]>a[j])
					max_i=j;
			}
			int temp=a[i];
			a[i]=a[max_i];
			a[max_i]=temp;
		}
	}
	
	public static void main(String[] args) {
		int[] a= {3,1,6,5,9,7,8,10,2};
		System.out.println(Arrays.toString(a));
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
}
