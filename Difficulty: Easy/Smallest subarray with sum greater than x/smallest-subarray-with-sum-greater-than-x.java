// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int left = 0, right = 0, sum = 0, min_length = Integer.MAX_VALUE;
        
        while(right < arr.length) {
            sum += arr[right];
            
            while(sum > x) {
                min_length = Math.min(min_length, right-left+1);
                sum -= arr[left];
                left++;
            }
            
            right++;
        }
        
        return min_length == Integer.MAX_VALUE ? 0 : min_length;
    }
}
