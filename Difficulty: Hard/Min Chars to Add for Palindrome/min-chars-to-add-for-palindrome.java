//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public static int minChar(String s) {
        // Reverse the string
        String reversed = new StringBuilder(s).reverse().toString();

        // Create a combined string with a delimiter to avoid overlap
        String combined = s + "#" + reversed;

        // Build the prefix-suffix array for the combined string
        int n = combined.length();
        int[] lps = new int[n];

        int j = 0; // Tracks the length of the current prefix-suffix match
        for (int i = 1; i < n; i++) {
            while (j > 0 && combined.charAt(i) != combined.charAt(j)) {
                j = lps[j - 1];
            }
            if (combined.charAt(i) == combined.charAt(j)) {
                j++;
            }
            lps[i] = j;
        }

        // The value of lps[n-1] gives the length of the longest palindromic suffix
        int longestPalindromicSuffix = lps[n - 1];

        // Subtract this length from the original string's length to find the answer
        return s.length() - longestPalindromicSuffix;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        var sc = new FastReader();
        int test = sc.nextInt();
        while (test-- > 0) {
            String s = sc.nextString();
            System.out.println(Solution.minChar(s));

            System.out.println("~");
        }
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        private void read() throws IOException {
            st = new StringTokenizer(br.readLine());
        }

        public String nextString() throws IOException {
            while (!st.hasMoreTokens()) read();
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(nextString());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(nextString());
        }
    }
}
// } Driver Code Ends