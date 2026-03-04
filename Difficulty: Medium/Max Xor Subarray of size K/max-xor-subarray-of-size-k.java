class Solution {
    public int maxSubarrayXOR(int[] nums, int k) {
        // code here
        int left = 0;
        int right = 0;
        int xor = 0;
        int max_xor = Integer.MIN_VALUE;

        while (right < nums.length) {
            xor ^= nums[right];

            if (right-left+1 > k) {
                xor ^= nums[left];
                left++;
            }

            if (right-left+1 == k) {
                max_xor = Math.max(xor, max_xor);
            }
            right++;
        }

        return max_xor;
    }
}
