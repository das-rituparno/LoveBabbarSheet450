class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int sum = 0, potential = Integer.MIN_VALUE;
        for(int item : arr) {
            sum += item;
            potential = Math.max(potential, sum);
            if(sum < 0) sum = 0;
        }
        return potential;
    }
}
