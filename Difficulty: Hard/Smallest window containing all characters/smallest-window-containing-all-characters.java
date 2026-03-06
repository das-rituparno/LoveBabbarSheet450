class Solution {
    public static String minWindow(String s, String p) {
        // code here
        int[] goal = new int[256];
        for (char i : p.toCharArray()) {
            goal[i]++;
        }

        int low = 0;
        int right = 0;
        int[] window = new int[256];
        int formed = 0;
        int min_length = Integer.MAX_VALUE;
        int min_start = 0;

        while (right < s.length()) {
            char rc = s.charAt(right);
            window[rc]++;

            if (goal[rc] > 0 && window[rc] <= goal[rc]) {
                formed++;
            }
            right++;

            while (formed == p.length()) {
                if (right - low < min_length) {
                    min_length = right - low;
                    min_start = low;
                }
                char lc = s.charAt(low);
                window[lc]--;
                if (goal[lc] > 0 && window[lc] < goal[lc]) {
                    formed--;
                }
                low++;
            }
        }
        return min_length == Integer.MAX_VALUE ? "" : s.substring(min_start, min_start + min_length);
    }
}