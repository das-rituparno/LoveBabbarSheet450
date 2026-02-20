// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        if (m == 0 || arr.size() == 0) return 0;
        if (arr.size() < m) return -1;
        
        Collections.sort(arr);

        int min_diff = Integer.MAX_VALUE;
        for (int i=0; i<=arr.size()-m; i++) {
            int diff = arr.get(i+m-1) - arr.get(i);
            min_diff = Math.min(min_diff, diff);
        }
        return min_diff;
    }
}