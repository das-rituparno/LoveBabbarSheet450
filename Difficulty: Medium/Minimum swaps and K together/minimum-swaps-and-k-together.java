// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Complete the function
        int good_count = 0;
        int bad_count = 0;
        
        for(int item : arr) {
            if (item <= k) good_count++;
        }
        for(int i=0; i<good_count; i++) {
            if(arr[i] > k) bad_count++;
        }
        
        int left = 0;
        int right = good_count;
        int min_swap = bad_count;
        while(right < arr.length) {
            if(arr[left] > k) bad_count--;
            left++;
            if(arr[right] > k) bad_count++;
            right++;
            min_swap = Math.min(min_swap, bad_count);
        }
        return min_swap;
    }
}