// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int longest_subarray = 0;
        int prefix_sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(prefix_sum, -1);
        
        for(int i=0; i<arr.length; i++) {
            prefix_sum += arr[i];
            if(map.containsKey(prefix_sum-k)) {
                longest_subarray = Math.max(longest_subarray, i - map.get(prefix_sum-k));
            }
            if(!map.containsKey(prefix_sum)) {
                map.put(prefix_sum, i);
            }
        }
        
        return longest_subarray;
    }
}
/*
10, 5, 2, 7, 1, -10
10-0
15-1
17-2
24-3
25-4
15-5
longest - 
*/