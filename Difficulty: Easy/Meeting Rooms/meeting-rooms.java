class Solution {
    static boolean canAttend(int[][] arr) {
        // code here
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
        int[] current = arr[0];
        
        for(int i=1; i<arr.length; i++) {
            int[] next = arr[i];
            
            if(current[1] > next[0]) {
                return false;
            }
            
            current = next;
        }
        
        return true;
    }
}