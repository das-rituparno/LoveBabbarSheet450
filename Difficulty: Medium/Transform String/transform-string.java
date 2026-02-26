// User function Template for Java

class Solution {
    int transform(String a, String b) {
        // code here
        if (a.length() != b.length()) return -1;
        int n = a.length();
        int[] alphabets =new int[256];
        for (int i=0; i<n; i++) {
            alphabets[a.charAt(i)]++;
            alphabets[b.charAt(i)]--;
        }
        for (int item : alphabets) {
            if (item != 0) {
                return -1;
            }
        }

        int first = n-1, last = n-1;
        int match = 0;

        while (first >= 0) {
            if (a.charAt(first) == b.charAt(last)) {
                match++;
                first--;
                last--;
            }
            else first--;
        }

        return n-match;
    }
}