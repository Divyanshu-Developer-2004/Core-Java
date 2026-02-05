package Day3_Assignment.PartC;
import java.util.Arrays;
public class Largest_In_Array {
    public static int kthLargest(int[] arr, int k) {
        Arrays.sort(arr);          
        return arr[arr.length-k];
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("Kth Smallest: " + kthLargest(arr, k));
    }
}
