package Day1_Assignment.SectionA;

public class Shift_Array_By_d_Times {
	public static void main(String[] args) {
		int[] a= {1,1,3,3,8,8,8,8,8,9,9,9,10};
		int[] b=shiftByDTimes(a,4);
		for(int i=0;i<a.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] shiftByDTimes(int[] a,int d) {
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int new_d=(d%a.length);
			if(i<new_d)
				b[a.length+i-new_d]=a[i];
			else
				b[i-new_d]=a[i];
		}
		return b;
	}
}
