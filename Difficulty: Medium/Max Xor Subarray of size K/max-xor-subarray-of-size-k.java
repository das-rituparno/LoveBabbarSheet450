class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int left = 0, right = 0, xor = 0, maxXOR = Integer.MIN_VALUE;
        
        while(right < arr.length) {
            xor ^= arr[right];
            
            if(right-left+1 > k) {
                xor ^= arr[left];
                left++;
            }
            
            if (right - left + 1 == k) maxXOR = Math.max(maxXOR, xor);
            
            right++;
        }
        
        return maxXOR;
    }
}
