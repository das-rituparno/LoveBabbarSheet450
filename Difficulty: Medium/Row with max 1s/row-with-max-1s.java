// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int row = 0;
        int col = arr[0].length-1;
        int max_ones = -1;
        
        while(row < arr.length && col >= 0) {
            if(arr[row][col] == 1) {
                max_ones = row;
                col--;
            }
            else row++;
        }
        return max_ones;
    }
}