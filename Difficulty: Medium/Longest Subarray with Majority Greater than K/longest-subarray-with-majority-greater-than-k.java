//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution {
    static int longestSubarray(int[] arr, int k) {
        // Code Here
        int n = arr.length;

        // Step 1: Transform the array
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = (arr[i] > k) ? 1 : -1;
        }

        // Step 2: Use prefix sum and hashmap to find longest subarray with positive sum
        int maxLen = 0, prefixSum = 0;
        Map<Integer, Integer> firstOccurrence = new HashMap<>();

        for (int i = 0; i < n; i++) {
            prefixSum += diff[i];

            // Case 1: If prefixSum > 0, subarray [0..i] is valid
            if (prefixSum > 0) {
                maxLen = i + 1;
            }

            // Case 2: Try to find the earliest index where prefixSum - 1 occurred
            // (i.e., a previous prefix sum that was 1 less)
            else if (firstOccurrence.containsKey(prefixSum - 1)) {
                maxLen = Math.max(maxLen, i - firstOccurrence.get(prefixSum - 1));
            }

            // Store the first occurrence of this prefixSum
            firstOccurrence.putIfAbsent(prefixSum, i);
        }

        return maxLen;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");
            int n = tokens.length;
            int[] arr = new int[n];

            int i = 0;
            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                arr[i] = Integer.parseInt(token);
                i++;
            }

            int k = Integer.parseInt(br.readLine().trim());
            System.out.println(new Solution().longestSubarray(arr, k));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends