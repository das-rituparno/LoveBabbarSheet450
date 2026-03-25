class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int row = 0;
        int col = mat[0].length-1;
        
        while(row < mat.length && col >= 0) {
            if(mat[row][col] == x) {
                return true;
            }
            else if(mat[row][col] > x) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
}
/*
1  5  9
14 20 21
30 34 43
*/