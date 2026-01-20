package Array_1D_Assignment;

public class Question_11_to_20 {

	//11.Method to find Frequency of Element in a given Array
	public static int frequencyOfElement(int[] a,int ele) {
		int freq=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele)
				freq++;
		}
		return freq;
	}
	
	//12.Method to return repeating elements of an array
	public static int[] repeatedElemntsOfArray(int[] a) {
		int[] ele=new int[a.length];
		int[] freq=new int[a.length];
		int c=0,dup=0;
		for(int i=0;i<a.length;i++) {
			if(findElementInArray(ele,a[i])) {
				
			}
			else {
				ele[c]=a[i];
				freq[c]=frequencyOfElement(a,a[i]);
				if(freq[c]>1)
					dup++;
				c++;
			}
		}
		int[] new_ele=new int[dup];//creating new array of new size
		for(int i=0,j=0;i<c;i++) {
			if(freq[i]>1) {
				new_ele[j]=ele[i];
				j++;
			}
		}
		return new_ele;
	}
	
	//Method to check if an Element is Present or Not in the Array
	public static boolean findElementInArray(int[] a,int el) {
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==el) {
				flag=true;
			}
		}
		return flag;
	}
	
	//13.Method to remove duplicate elements from the array
	public static int[] removeDuplicateElemntsOfArray(int[] a) {
		int[] ele=new int[a.length];
		int[] freq=new int[a.length];
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(findElementInArray(ele,a[i])) {
				
			}
			else {
				ele[c]=a[i];
				freq[c]=frequencyOfElement(a,a[i]);
				c++;
			}
		}
		int[] new_ele=new int[c];//creating new array of new size
		for(int i=0;i<c;i++) {
			new_ele[i]=ele[i];
		}
		return new_ele;
	}
	
	//14.Method to print Unique Elements in the Array
	public static int[] uniqueElemntsOfArray(int[] a) {
		int[] ele=new int[a.length];
		int[] freq=new int[a.length];
		int c=0,uni=0;
		for(int i=0;i<a.length;i++) {
			if(findElementInArray(ele,a[i])) {
				
			}
			else {
				ele[c]=a[i];
				freq[c]=frequencyOfElement(a,a[i]);
				if(freq[c]==1)
					uni++;
				c++;
			}
		}
		int[] new_ele=new int[uni];//creating new array of new size
		for(int i=0,j=0;i<c;i++) {
			if(freq[i]==1) {
				new_ele[j]=ele[i];
				j++;
			}
		}
		return new_ele;
	}
	
	//15.To find prime numbers in the given array
	public static int[] primeInArray(int[] a) {
		int[] b=new int[a.length];
		int[]c;
		int c1=0;
		for(int i=0;i<a.length;i++) {
			if(checkPrime(a[i])) {
				b[c1]=a[i];
				c1++;
			}
		}
		c=new int[c1];
		for(int i=0;i<c1;i++) {
			c[i]=b[i];
		}
		return c;
	}
	
	//Method to check prime
	public static boolean checkPrime(int n) {
		if(n==1)
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//16.Method to print Fibonacci elements of the array
	public static void fibonacciElements(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(checkFibonacci(a[i])) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
	}
	
	//Method to check fibonacci number
	public static boolean checkFibonacci(int n) {
		int a=0,b=1;
		boolean f=false;
		while(a<=n) {
			if(a==n) {
				f=true;
			}
			int temp=b;
			b=a+b;
			a=temp;
		}
		return f;
	}
	
	//17.Method to insert element in particular index in array
	public static int[] addElementInIndex(int[] a, int ele,int index) {
		int[] b=new int[a.length+1];
		int c=0;
		for(int i=0;i<a.length+1;i++) {
			if(i<index) {
				b[i]=a[c];
				c++;
			}
			if(i>index) {
				b[i]=a[c];
				c++;
			}
		}
		b[index]=ele;
		return b;
	}
	
	//18.Method to remove element in particular index in array
	public static int[] removeElementInIndex(int[] a,int index) {
		int[] b=new int[a.length-1];
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(i==index) 
				continue;
			else {
				b[c]=a[i];
				c++;
			}
		}
		return b;
	}
	
	//19.Method to return right rotated array
	public static void rightRotatedArray(int[] a) {
		int temp=a[a.length-1];
		for(int i=0;i<a.length-1;i++) {
			a[a.length-1-i]=a[a.length-2-i];
		}
		a[0]=temp;
	}
	
	//19.Method to return Left rotated array
	public static void leftRotatedArray(int[] a) {
		int temp=a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
	}
}
