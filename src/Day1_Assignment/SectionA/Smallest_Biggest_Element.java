package Day1_Assignment.SectionA;

public class Smallest_Biggest_Element {
	public static void main(String[] args) {
		int[] a=new int[4];
		a[0]=33;
		a[1]=23;
		a[2]=98;
		a[3]=11;
		
		int max=a[0],min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i])
				min=a[i];
			if(max<a[i])
				max=a[i];
		}
		
		System.out.println("Biggest Element in Array : "+max);
		System.out.println("Smallest Element in Array : "+min);
	}
}
