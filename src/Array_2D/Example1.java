package Array_2D;
import java.util.Scanner;
public class Example1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of row : ");
		int row=sc.nextInt();
		System.out.println("Enter number of row : ");
		int col=sc.nextInt();
		int[][] a=new int[row][col];
		Array_Helper.input(a);
		System.out.println();
		//Even_Index.evenIndex(a);
		//Array_Helper.display(a);
		Array_Helper.RowWiseSum(a);
		Array_Helper.ColumnWiseSum(a);//not working properly
	}
}
