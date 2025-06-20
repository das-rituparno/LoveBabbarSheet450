class Solution {
    static boolean isIntersect(int[][] intervals) {
        // Code Here
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        
        int[] current = intervals[0];
        for(int i=1; i<intervals.length; i++) {
            int[] next = intervals[i];
            
            if(current[1] >= next[0]) {
                return true;
            }
            else {
                current = next;
            }
        }
        
        return false;
    }
}