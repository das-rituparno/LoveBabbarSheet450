class Solution {
    public void setMatrixZeroes(int[][] matrix) {
        // code here
         Set<Integer> row_zero = new HashSet<>();
        Set<Integer> col_zero = new HashSet<>();

        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row_zero.add(i);
                    col_zero.add(j);
                }
            }
        }

        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (row_zero.contains(i) || col_zero.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
/*
Time Complexity - o(n^2) -> as using nested for loop 2n^2 ~ n^2
Space Complexity - o(n) -> as storing n*m ~ n elements in the set
*/