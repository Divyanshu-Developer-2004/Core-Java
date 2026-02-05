package Problems_Day_1_to_5;

public class Minimum_Window_Size {
    public static int minWindowLength(String s, String t) {
        if (s.length() < t.length())
            return 0;

        int[] freq = new int[256];   // ASCII frequency
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i)]++;
        }

        int left = 0, right = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;

        while (right < s.length()) {
            char rc = s.charAt(right);

            if (freq[rc] > 0)
                required--;

            freq[rc]--;
            right++;

            // When all characters matched
            while (required == 0) {
                minLen = Math.min(minLen, right - left);

                char lc = s.charAt(left);
                freq[lc]++;

                if (freq[lc] > 0)
                    required++;

                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
	
	public static void main(String[] args) {
		System.out.println(minWindowLength("ADOBECODEBANC", "ABC"));//return minimum window length
	}
}
