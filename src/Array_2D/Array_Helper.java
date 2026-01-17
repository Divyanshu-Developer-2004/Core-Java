package Array_2D;
import java.util.Scanner;
public class Array_Helper {
	
	public static void input(int[][]a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements :");
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter element in row "+i);
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
	}
	
	public static void display(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] RowWiseSum(int[][] a) {
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum+=a[i][j];
			}
			System.out.println("The sum of row "+i+" is "+sum);
		}
		return a;
	}
	
	public static int[][] ColumnWiseSum(int[][] a) {
		for(int i=0;i<a[0].length;i++) {
			int sum=0;
			for(int j=0;j<a.length;j++) {
				sum+=a[j][i];
			}
			System.out.println("The sum of column "+i+" is "+sum);
		}
		return a;
	}
}
