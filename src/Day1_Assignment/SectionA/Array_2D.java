package Day1_Assignment.SectionA;

public class Array_2D {
	public static void main(String[] args) {
		int[][] a=new int[2][3];
		a[0][0]=11;
		a[0][1]=31;
		a[0][2]=54;
		a[1][0]=88;
		a[1][1]=11;
		a[1][2]=23;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
