package Methods;
import java.util.Scanner;
public class Personal_data {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name=sc.nextLine();
		System.out.print("Enter Superset ID : ");
		int Superset_ID=sc.nextInt();
		System.out.print("Enter Email Address : ");
		String email=sc.nextLine();
		System.out.print("Enter Mobile Number : ");
		long mb_no=sc.nextLong();
		System.out.print("Enter Gender : ");
		char gender=sc.next().charAt(0);
		System.out.print("Enter Marriage Status : ");
		boolean marrage_status=sc.nextBoolean();
		System.out.print("Enter Roll Number : ");
		short roll_no=sc.nextShort();
		System.out.print("Enter Age : ");
		byte age=sc.nextByte();
		System.out.print("Enter Weight : ");
		double weight=sc.nextDouble();
		System.out.print("Enter Height : ");
		float height=sc.nextFloat();
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Email Address : "+email);
		System.out.println("Roll.No : "+roll_no);
		System.out.println("Superset ID : "+Superset_ID);
		System.out.println("Mobile.No : "+mb_no);
		System.out.println("Age : "+age);
		System.out.println("Height : "+height);
		System.out.println("Weight : "+weight);
		System.out.println("Marrital Status : "+marrage_status);
	}
}
