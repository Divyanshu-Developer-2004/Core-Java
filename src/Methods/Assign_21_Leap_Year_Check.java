package Methods;
import java.util.Scanner;
public class Assign_21_Leap_Year_Check {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the year");
		  int y=sc.nextInt();
		  String s=(Leap_Year(y))?+y+" is a Leap Year":y+" is not a Leap Year";
		  System.out.println(s);
	}

	private static boolean Leap_Year(int y) {
		if((y%400==0)||((y%100!=0)&&(y%4==0)))
			return true;
		else 
			return false;
	}
}
