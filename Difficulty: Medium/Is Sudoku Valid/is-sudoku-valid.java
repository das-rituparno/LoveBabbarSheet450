class Solution {
    static boolean isValid(int mat[][]) {
        // code here
        Set<String> seen = new HashSet<>();
        
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat.length; j++) {
                if(mat[i][j] == 0) continue;
                
                String row = mat[i][j] + " in row " + i;
                String col = mat[i][j] + " in col " + j;
                
                if(seen.contains(row) || seen.contains(col)) {
                    return false;
                }
                
                seen.add(row);
                seen.add(col);
            }
        }
        return true;
    }
}
/*
Time Complexity - o(n^2) -> as using a nested loop
Space COmplexity - o(n^2) -> as storing 2D elements in the set
*/