package Day2_Assignment.Level3;
import java.util.Queue;
import java.util.LinkedList;;
public class FirstNonRepeatingCharacter {
    public static char firstNonRepeating(String stream) {
        int[] freq = new int[256];
        char result='\u0000';
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < stream.length(); i++) {
            char ch = stream.charAt(i);

            freq[ch]++;
            q.add(ch);

            while (!q.isEmpty() && freq[q.peek()] > 1) {
                q.poll();
            }

            if (q.isEmpty())
                result='\u0000';
            else
                result=q.peek();
        }
        return result;
    }

    public static void main(String[] args) {
        String stream = "aabdec";
        System.out.println(firstNonRepeating(stream));
    }
}
