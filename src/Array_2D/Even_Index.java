package Array_2D;

public class Even_Index {
	public static void evenIndex(int[][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]%2==0) {
					System.out.print("("+i+","+j+") ");
				}
			}

		}
		System.out.println();
	}
}
