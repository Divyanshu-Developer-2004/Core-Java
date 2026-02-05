package Day3_Assignment.PartC;
import java.util.Arrays;
public class Smallest_In_Array {
    public static int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);          
        return arr[k - 1];         
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("Kth Smallest: " + kthSmallest(arr, k));
    }
}
