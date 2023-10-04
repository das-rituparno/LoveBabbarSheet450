//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long suffix = 1;
        long prefix = 1;
        long maximum = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++) {
            if(suffix == 0) suffix = 1;
            if(prefix == 0) prefix = 1;
            
            prefix *= arr[i];
            suffix *= arr[n-i-1];
            maximum = Math.max(maximum, Math.max(prefix, suffix));
        }
        
        return maximum;
    }
}