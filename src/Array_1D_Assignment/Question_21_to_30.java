package Array_1D_Assignment;

public class Question_21_to_30 {
	
	//21.Method to sort elements in the array normally
	public static void normalSortingOfArray(int[] a) {
		 for (int i = 0; i < a.length - 1; i++) {
	            int min_idx = i;
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[j] < a[min_idx]) {
	                    min_idx = j;
	                }
	            }
	            int temp = a[i];
	            a[i] = a[min_idx];
	            a[min_idx] = temp;           
	        }
	}
	
	//22.Method to print nth largest element of a given array
	public static void nThLargestElementInArray(int[]a,int n) {
		int[]b;
		b=Question_1_to_10.copyArray(a);
		Question_21_to_30.normalSortingOfArray(b);
		b=Question_11_to_20.removeDuplicateElemntsOfArray(b);
		System.out.println(n+"th biggest number is ="+b[b.length-n]);
	}
	
	//23.Method to print duplicate prime elements of an array
	public static void printDuplicatePrimeElements(int[] a) {
		int[] b;
		b=Question_11_to_20.primeInArray(a);
		b=Question_11_to_20.repeatedElemntsOfArray(b);
		Question_1_to_10.printElements(b);
	}
	
	//24.Method to do Linear Search in Array
	public static int linearSearchInArray(int[] a,int ele) {
		int index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	//25.Method to do binary search in an array
	public static int binarySearchInArray(int[] a,int ele) {
		int min=0,max=a.length-1,mid=-1;
		boolean f=false;
		while(min<=max) {
			mid=(min+max)/2;
			if(a[mid]==ele) {
				f=true;
				break;
			}
			else if(ele<a[mid]) {
				max=mid;
			}
			else {
				min=mid;
			}
		}
		if(f)
			return mid;
		else
			return -1;
	}
	
	//26.Method to do bubble sort of array
	public static void bubbleSortingOfArray(int[] a) {
		 for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a.length-i-1; j++) {
	                if (a[j] > a[j+1]) {
	                   int temp=a[j];
	                   a[j]=a[j+1];
	                   a[j+1]=temp;
	                }
	            }          
		 }
	}
	
	//27.Method to print first and last Character of every element of an Array
	public static void firstLastCharacter(String[] s) {
		for(String i:s) {
			System.out.print("("+i.charAt(0)+","+i.charAt(i.length()-1)+"), ");
		}
		System.out.println();
	}
	
	
	//28.Method to merge two arrays
	public static int[] mergeArray(int[]a,int[]b) {
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length+b.length;) {
			for(int j=0;j<a.length;j++) {
				c[i]=a[j];
				i++;
			}
			for(int j=0;j<b.length;j++) {
				c[i]=b[j];
				i++;
			}
		}
		return c;
	}
	
	//29.Method to merge two array zig-zag wise
	public static int[] zigZagMergeArray(int[] a,int[]b) {
		int[] c=new int[a.length+b.length];
		int c1=0;
		for(int i=0,j=0 ;i<a.length || j<b.length;i++,j++) {
			if(i<a.length) {
				c[c1]=a[i];
				c1++;
			}
			if(j<b.length) {
				c[c1]=b[j];
				c1++;
			}
		}
		return c;
	}
	//30.Method to find pair of elements whose sum is equals to given sum
	public static void pairSumInArray(int[]a,int target_sum) {
		int c=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==target_sum) {
					System.out.print("("+a[i]+","+a[j]+") ");
					c++;
				}
			}
		}
		if(c==0)
			System.out.println("No such pair Found");
	}
}
