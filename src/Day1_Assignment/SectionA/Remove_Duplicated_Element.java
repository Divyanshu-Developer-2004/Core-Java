package Day1_Assignment.SectionA;

public class Remove_Duplicated_Element {
	public static void main(String[] args) {
		int[] a= {1,1,3,3,8,8,8,8,8,9,9,9,10};
		a=removeDuplicate(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] removeDuplicate(int[] a) {
		
		int c=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1])
				c++;
		}
		c++;
		int[] b=new int[c];
		c=0;
		b[c++]=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]!=a[i-1])
				b[c++]=a[i];
		}
		return b;
	}
}
