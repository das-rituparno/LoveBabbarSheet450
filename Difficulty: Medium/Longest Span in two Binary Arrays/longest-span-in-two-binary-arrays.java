
class Solution {
    public int longestCommonSum(int[] a1, int[] a2) {
        // Code here
        int n = a1.length;
        int[] diff = new int[n];
        
        for(int i=0; i<n; i++) {
            diff[i] = a1[i]-a2[i];
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix_sum = 0;
        int max_len = 0;
        
        for(int i=0; i<n; i++) {
            prefix_sum += diff[i];
            
            if(prefix_sum == 0) {
                max_len = i+1;
            }
            if (map.containsKey(prefix_sum)) {
                int prevIndex = map.get(prefix_sum);
                max_len = Math.max(max_len, i - prevIndex);
            } else {
                map.put(prefix_sum, i);
            }
        }
        
        return max_len;
    }
}

/*
a1 = [0, 1, 0, 1, 1, 1, 1]
a2 = [1, 1, 1, 0, 0, 1, 0]


sum1 = 0,   1,   1,   2,   3,   4,   5
sum2 = 1,   2,   3,   3,   3,   4,   4

diff = -1,  0,   -1,   1,  1,  0,   1
*/