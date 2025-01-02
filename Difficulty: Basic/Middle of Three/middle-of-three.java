//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int A = Integer.parseInt(read.readLine());
            int B = Integer.parseInt(read.readLine());
            int C = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.middle(A, B, C));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int middle(int a, int b, int c) {
        // code here
        if((a > b && a < c) || (a > c && a < b)) return a;
        else if((b > a && b < c) || (b > c && b < a)) return b;
        else if((c > b && c < a) || (c > a && c < b)) return c;
        else return -1;
    }
}