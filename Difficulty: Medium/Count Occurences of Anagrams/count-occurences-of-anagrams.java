// User function Template for Java

class Solution {

    int search(String t, String s) {
        // code here
        if (t.length() > s.length()) return 0;
        int[] t_frequency = new int[256];
        int[] window_frequency = new int[256];

        // build frequency for pattern string t
        for (char c : t.toCharArray()) {
            t_frequency[c]++;
        }

        int left = 0, right = 0, count = 0;
        while (right < s.length()) {
            // include current character in window
            window_frequency[s.charAt(right)]++;

            // when window size matches t length
            if (right-left+1 == t.length()) {

                // compare ASCII frequency arrays
                if (Arrays.compare(t_frequency, window_frequency) == 0) {
                    count++;
                }

                // remove left character from window
                window_frequency[s.charAt(left)]--;
                left++;
            }
            right++;
        }
        return count;
    }
}