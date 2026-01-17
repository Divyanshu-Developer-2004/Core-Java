package Array;
import java.util.Scanner;
public class Example1 {
	
	public static void input (int[]a,int n) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the integer values");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public static void input (float[]a,int n) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the float values");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextFloat();
		}
	}
	
	public static void input (String[]a,int n) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String values");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLine();
		}
	}
	
	public static void input (char[]a,int n) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Character values");
		for(int i=0;i<n;i++) {
			a[i]=sc.next().charAt(0);
		}
	}
	
	public static void input (boolean[]a,int n) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Boolean values");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextBoolean();
		}
	}
	
	public static void main(String[] args) {
		int[] a=new int[3];
		char[] c=new char[2];
		String[] s=new String[2];
		float[] f=new float[3];
		boolean[] b=new boolean[2];
		System.out.println(a.length);
		
		input(a,3);
		input(f,3);
		input(b,2);
		input(c,2);
		input(s,2);
		
		int i=0;
		for(i=0;i<3;i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		
		for(i=0;i<2;i++) {
			System.out.println(s[i]);
		}
		System.out.println();
		
		for(i=0;i<2;i++) {
			System.out.println(b[i]);
		}
		System.out.println();
		
		for(i=0;i<2;i++) {
			System.out.println(c[i]);
		}
		System.out.println();
		
		for(i=0;i<3;i++) {
			System.out.println(f[i]);
		}
		System.out.println();
	}
}
