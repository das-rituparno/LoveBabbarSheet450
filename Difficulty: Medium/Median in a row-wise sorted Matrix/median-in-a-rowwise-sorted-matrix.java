class Solution {
    public int median(int[][] matrix) {
        // code here
        int[] flatten_array = new int[matrix.length * matrix[0].length];
        int idx = 0;
        int median = 0;
        
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                flatten_array[idx++] = matrix[i][j];
            }
        }
        Arrays.sort(flatten_array);
        median = flatten_array[flatten_array.length/2];
        return median;
    }
}
/*
Time Complexity - o(n*mlog(n*m)) -> as nested array with sorting method.
Space Complexity - o(n*m)
*/