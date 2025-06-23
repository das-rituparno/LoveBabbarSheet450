// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        
        int prefix_sum = 0;
        int longest_subarray = 0;
        
        for(int i=0; i<arr.length; i++) {
            prefix_sum += arr[i];
            if(map.containsKey(prefix_sum-k)) {
                int previous_index = map.get(prefix_sum-k);
                longest_subarray = Math.max(longest_subarray, i-previous_index);
            }
            if (!map.containsKey(prefix_sum)) {
                map.put(prefix_sum, i);
            }
        }
        
        return longest_subarray;
    }
}
