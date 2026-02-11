// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n = arr.length;
        int m = arr[0].length;
        int row = 0;
        int col = m-1;
        int max_ones = -1;

        while (row < n && col >= 0) {
            if (arr[row][col] == 1) {
                max_ones = row;
                col--;
            }
            else {
                row++;
            }
        }
        
        return max_ones;
    }
}