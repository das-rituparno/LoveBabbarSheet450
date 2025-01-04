//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        if(arr == null || arr.length == 0) return 0;
        int first = firstOccurence(arr, target);
        if(first == -1) return 0;
        int last = lastOccurence(arr, target);
        return last-first+1;
    }
    
    public int firstOccurence(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int potential = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                potential = mid;
                high = mid-1;
            }
            else if(nums[mid] > target) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return potential;
    }

    public int lastOccurence(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int potential = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                potential = mid;
                low = mid+1;
            }
            else if(nums[mid] > target) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return potential;
    }
}
