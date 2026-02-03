package Problems;
import java.util.*;
public class Wave_Problem {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		wavePattern(a);
		System.out.println(Arrays.toString(a));
	}
	
	//Wave form
	public static void wavePattern(int[] a) {
		for(int i=0;i<a.length-1;i+=2) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}
}
