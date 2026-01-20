package Array_2D_Assignment;

public class Question_6_to_10 {
	
	//6.Method to print primary and secondary diagonal of Matrix
	public static void primaryAndSecondaryDiagonalOfMatrix(int[][] a) {
		
		if(a.length!=a[0].length) {
			System.out.println("Its not a Square Matrix");
		}
		else {
			System.out.println("---------Primary Diagonal------");
			
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[0].length;j++) {
					if(i==j)
						System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
			
			System.out.println("---------Secondary Diagonal------");
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[0].length;j++) {
					if(i+j==a.length-1)
						System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	//7.Method to print boundary elements of the matrix
	public static void printBoundaryElementsOfMatrix(int[][] a) {
		System.out.println("---------Boundary Elements--------");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(i==0 || j==0 || i==a.length-1 || j==a[0].length-1)
					System.out.print(a[i][j]+"\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//8.Method to print matrix in Spiral fashion
	public static void printElementsOfMatrixSpirally(int[][] a) {
		System.out.println("---------Elements Spiral Wise--------");
		int counter=0;
		int max_step=a.length*a[0].length;
		int i=0,j=0,mode=1,limit_up=1,limit_down=a.length-1,limit_left=0,limit_right=a[0].length-1;
		while(counter<max_step) {
			
			//Traverse left to right
			if(mode==1) {
				System.out.print(a[i][j]+" ");
				if(j==limit_right) {
					mode=2;
					limit_right--;
					j--;
					i++;
				}
				j++;
				counter++;
			}
			//Traverse up to down
			else if(mode==2) {
				System.out.print(a[i][j]+" ");
				if(i==limit_down) {
					mode=3;
					limit_down--;
					i--;
					j--;
				}
				i++;
				counter++;
			}
			//Traverse right to left
			else if(mode==3) {
				System.out.print(a[i][j]+" ");
				if(j==limit_left) {
					mode=4;
					limit_left++;
					j++;
					i--;
				}
				j--;
				counter++;
			}
			//Traverse down to up
			else {
				System.out.print(a[i][j]+" ");
				if(i==limit_up) {
					mode=1;
					limit_up++;
					i++;
					j++;
				}
				i--;
				counter++;
			}
		}
	System.out.println();
	System.out.println();
	}
	
	//9.Method to convert Given Matrix into Upper triangular matrix
	public static void toUpperTriangularMatrix(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(j<i)
					a[i][j]=0;
			}
		}
	}
	
	//10.Method to convert Given Matrix into Lower triangular matrix
	public static void toLowerTriangularMatrix(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(j>i)
					a[i][j]=0;
			}
		}
	}
}
