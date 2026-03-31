// User function Template for Java

class Solution {
    int[][] sortedMatrix(int N, int mat[][]) {
        // code here
        int[] flatter_matrix = new int[mat.length * mat[0].length];

        int idx = 0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[0].length; j++) {
                flatter_matrix[idx++] = mat[i][j];
            }
        }
        Arrays.sort(flatter_matrix);

        idx = 0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[0].length; j++) {
                mat[i][j] = flatter_matrix[idx++];
            }
        }
        return mat;
    }
};