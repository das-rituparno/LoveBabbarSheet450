class Solution {
    public String largestSwap(String s) {
        // code here
        char[] ch = s.toCharArray();
        int n = ch.length;

        for (int i = 0; i < n - 1; i++) {
            // Find max character to the right of i
            char maxChar = ch[i];
            for (int j = i + 1; j < n; j++) {
                if (ch[j] > maxChar) maxChar = ch[j];
            }

            // If a larger char exists to the right, find its rightmost occurrence
            if (maxChar > ch[i]) {
                int swapIdx = -1;
                for (int j = n - 1; j > i; j--) {
                    if (ch[j] == maxChar) {
                        swapIdx = j;
                        break;
                    }
                }
                // Swap and return immediately
                char temp = ch[i];
                ch[i] = ch[swapIdx];
                ch[swapIdx] = temp;
                return new String(ch);
            }
        }

        return s; // already largest, no swap needed
    }
}