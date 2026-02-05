package Day3_Assignment.PartC;
import java.util.HashSet;
public class check_Duplicate_in_K_Range {
	
    public static boolean containsNearbyDuplicate(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (set.contains(arr[i]))
                return true;

            set.add(arr[i]);

            if (i >= k)
                set.remove(arr[i - k]);
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5};
        int k = 3;

        System.out.println(containsNearbyDuplicate(arr, k));
	}
}
