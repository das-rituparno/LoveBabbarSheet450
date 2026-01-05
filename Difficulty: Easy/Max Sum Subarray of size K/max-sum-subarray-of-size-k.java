class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int left = 0, right = 0, sum = 0, potential = 0;
        
        while(right < arr.length) {
            sum += arr[right];
            if(right - left + 1 == k) {
                potential = Math.max(potential, sum);
                sum -= arr[left++];
            }
            right++;
        }
        return potential;
    }
}