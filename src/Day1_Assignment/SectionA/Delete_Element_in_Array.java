package Day1_Assignment.SectionA;

public class Delete_Element_in_Array {
	public static void main(String[] args) {
		int[] a=new int[4];
		a[0]=33;
		a[1]=23;
		a[2]=98;
		a[3]=11;
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		a=deleteElement(a, 2);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] deleteElement(int[] a,int index) {
		int[] b=new int[(a.length)-1];
		for(int i=0,c=0;i<a.length;i++) {
			if(i==index)
				continue;
			b[c++]=a[i];
		}
		return b;
	}
}
