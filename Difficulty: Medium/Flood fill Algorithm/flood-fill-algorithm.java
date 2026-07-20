class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // code here
        int n = image.length;
        int m = image[0].length;
        int[][] visit = new int[n][m];

        int original_color = image[sr][sc];
        if (original_color == newColor) return image;

        dfs_flood_fill(sr, sc, visit, image, newColor, original_color);
        return image;
    }
    private static void dfs_flood_fill(int sr, int sc, int[][] visit,
                                       int[][] image, int newColor, int original_color) {
        int n = image.length;
        int m = image[0].length;

        visit[sr][sc] = 1;
        image[sr][sc] = newColor;
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};

        for (int i=0; i<4; i++) {
            int ro = sr + dRow[i];
            int co = sc + dCol[i];

            if (ro >= 0 && ro < n && co >= 0 && co < m
            && visit[ro][co] == 0 && image[ro][co] == original_color) {
                dfs_flood_fill(ro, co, visit, image, newColor, original_color);
            }
        }
    }
}