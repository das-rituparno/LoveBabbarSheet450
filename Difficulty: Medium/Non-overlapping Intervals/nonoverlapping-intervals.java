//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.minRemoval(a);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minRemoval(int intervals[][]) {
        // Step 1: Edge case - if there are no intervals, return 0
        if (intervals.length == 0) {
            return 0;
        }

        // Step 2: Sort intervals by their end times
        java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        // Step 3: Initialize variables
        int count = 0; // To count the intervals to remove
        int prevEnd = intervals[0][1]; // End time of the last included interval

        // Step 4: Iterate through intervals
        for (int i = 1; i < intervals.length; i++) {
            // If the current interval overlaps with the previous one
            if (intervals[i][0] < prevEnd) {
                count++; // Increment the count of intervals to remove
            } else {
                // Update prevEnd to the end of the current interval
                prevEnd = intervals[i][1];
            }
        }

        // Step 5: Return the count of removed intervals
        return count;
    }
}

