package Day3_Assignment.PartB;

import java.util.Arrays;

public class Sel_Bub_Inse_QuickSort {
	public static void selectionSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int max_i=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[max_i]>a[j])
					max_i=j;
			}
			int temp=a[i];
			a[i]=a[max_i];
			a[max_i]=temp;
		}
	}
	
	public static void bubbleSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	public static void insertionSort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
	
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            
            // pi is the partition return index of pivot
            int pi = partition(arr, low, high);

            // recursion calls for smaller elements
            // and greater or equals elements
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        
        // choose the pivot
        int pivot = arr[high];
        
        // index of smaller element and indicates 
        // the right position of pivot found so far
        int i = low - 1;

        // traverse arr[low..high] and move all smaller
        // elements to the left side. Elements from low to 
        // i are smaller after every iteration
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        
        // Move pivot after smaller elements and
        // return its position
        swap(arr, i + 1, high);  
        return i + 1;
    }

    // swap function
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
		int[] a= {3,1,6,5,9,7,8,10,2};
		System.out.println(Arrays.toString(a));
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
}
