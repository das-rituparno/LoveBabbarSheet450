class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        // code here
        int n = mat1.length;
        int count = 0;

        // Step 1: Add all elements of mat2 to a HashSet
        HashSet<Integer> mat2Elements = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat2Elements.add(mat2[i][j]);
            }
        }

        // Step 2: Traverse mat1 and check if (x - a) exists in mat2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = mat1[i][j];
                if (mat2Elements.contains(x - a)) {
                    count++;
                }
            }
        }

        return count;
    }
}