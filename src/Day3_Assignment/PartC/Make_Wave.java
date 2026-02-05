package Day3_Assignment.PartC;
import java.util.Arrays;
public class Make_Wave {
	public static void makeWave(int[] a) {
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i+=2) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	}
	
	public static void main(String[] args) {
		int[] a= {1,2,6,4,7,3,5};
		makeWave(a);
		System.out.println(Arrays.toString(a));
	}
}
