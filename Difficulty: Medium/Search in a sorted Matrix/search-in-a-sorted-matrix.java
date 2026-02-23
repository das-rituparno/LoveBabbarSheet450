class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        int start = 0;
        int end = m*n-1;
        
        while(start <= end) {
            int mid = (start+end)/2;
            
            int row = mid/m;
            int col = mid%m;
            
            if(mat[row][col] == x) return true;
            else if(mat[row][col] < x) start = mid+1;
            else end = mid-1;
        }
        
        return false;
    }
}
