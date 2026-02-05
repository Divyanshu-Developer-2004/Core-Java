package Day2_Assignment.Level3;
import java.util.Stack;
public class Next_Greater_Element {
    public static int nextGreater(int[] arr) {
        int result=Integer.MIN_VALUE;
    	Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            result = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        System.out.println(nextGreater(arr));
    }
}
