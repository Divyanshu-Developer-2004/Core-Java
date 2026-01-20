package Array_1D_Assignment;
import java.util.Scanner;
public class Question_1_to_10 {
	
	//Method to Take Elements from user
	public static void inputElements(int[] a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements in the Array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println();
	}
	
	//1.Method to pint all elements in the array
	public static void printElements(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	//2.Method to print even index elements
	public static void printEvenElement(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(i%2==0)
				System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	//3.Method to print odd index elements
	public static void printOddElement(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(i%2!=0)
				System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	//4.Method to print sum of elements of a given Array
	public static void printSumOfElements(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("Sum of elements ="+sum);
	}
	
	//5.Method to print product of elements of a given Array
	public static void printProductOfElements(int[] a) {
		int pro=1;
		for(int i=0;i<a.length;i++) {
			pro*=a[i];
		}
		System.out.println("Product of elements ="+pro);
	}
	
	//6.Method to reverse an array without using third array
	public static void reverseArray(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		printElements(a);
	}
	
	//7.Method to copy Array
	public static int[] copyArray(int[] a) {
		int[] copy=new int[a.length];
		for(int i=0;i<a.length;i++) {
			copy[i]=a[i];
		}
		return copy;
	}
	
	//8.Method to reverse an array using new array
	public static void reverseNewArray(int[] a,int[] new_arr) {
		new_arr=new int[a.length];
		for(int i=0;i<a.length;i++) {
			new_arr[i]=a[a.length-1-i];
		}
	}
	
	//9.Method to find largest Element in an array
	public static int largestElementInArray(int[] a) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i])
				max=a[i];
		}
		return max;
	}
	
	//10.Method to find second largest Element in an array
	public static int secondLargestElementInArray(int[] a) {
		int max=largestElementInArray(a);
		int max_2=a[0];
		for(int i=0;i<a.length;i++) {
			if(max_2<a[i] && max_2<max)
				max_2=a[i];
		}
		return max_2;
	}
}
