package Array_2D_Assignment;
import java.util.Scanner;
public class Question_1_to_5 {
	
	//Method to input 2D Array
	public static void inputMatrix(int[][] a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Matrix :");
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter row "+i+" data");
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
	}
	
	//Method to print Matrix
	public static void printMatrix(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//1.Method to return largest and smallest elements in an array
	public static int[] LargestSmallestElementsInMatrix(int[][] a) {
		int[] min_max= new int[2];
		min_max[0]=a[0][0];
		min_max[1]=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]<min_max[0]) {
					min_max[0]=a[i][j];
				}
				if(a[i][j]>min_max[0]) {
					min_max[1]=a[i][j];
				}
			}
		}
		return min_max;
	}
	
	//2.Method to add two matrix of same order
	public static int[][] sumOfMatrix(int[][] a,int[][] b) {
		if(a.length != b.length || a[0].length != b[0].length) {
			System.out.println("Order of two matrix is not Same");
			return null;
		}
		
		else {
			int[][] c=new int[a.length][a[0].length];
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					c[i][j]=a[i][j]+b[i][j];
				}
			}
		return c;
		}
	}
	
	//3.Method to multiply two matrices
	public static int[][] multiplyMatrix(int[][] a,int[][] b){
		int[][] c=new int[a.length][b[0].length];
		if(a[0].length != b.length) {
			System.out.println("Cannot Multiply these two Matrix");
		}
		else {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<b[0].length;j++) {
					int sum=0;
					for(int k=0;k<b.length;k++) {
							sum+=a[i][k]*b[k][j];
					}
					c[i][j]=sum;
				}
			}
		}
		return c;
	}
	
	//4.Method to find transpose of a matrix
	public static int[][] transposeOfMatrix(int[][] a){
		int[][] c=new int[a[0].length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				c[j][i]=a[i][j];
			}
		}
		return c;
	}
	
	//5.Method to check whether a matrix is identity matrix or not
	public static boolean checkIdentityMatrix(int[][] a){
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if((i!=j && a[i][j]!=0)||(i==j && a[i][j]!=1)||(a.length!=a[0].length)) {
					flag=false;
					break;
				}
			}
		}
		return flag;
	}
}
