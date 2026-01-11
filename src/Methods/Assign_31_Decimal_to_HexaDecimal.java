package Methods;
import java.util.Scanner;
public class Assign_31_Decimal_to_HexaDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Decimal number : ");
		int n=sc.nextInt();
		String hd=D_to_HD(n);
		System.out.println("Decimal("+n+") ---> Hexa-Decimal("+hd+")");
	}
	//decimal to Hexa-Decimal converter
	public static String D_to_HD(int n) {
		String hd="";
		while(n!=0) {
			int a=n%16;
			if(a<10)
				hd=a+hd;
			else
				hd=((char)(a+55))+hd;
			n/=16;
		}
		return hd;
	}
}
