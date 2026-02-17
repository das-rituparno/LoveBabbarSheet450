
class Solution {
    public static int overlapInt(int[][] arr) {
        // code here
         List<int[]> points = new ArrayList<>();
        int n = arr.length;
//        {{1, 2}, {2, 4}, {3, 6}};
        //converting intervals into start and end points
        for (int i=0; i<arr.length; i++) {
            points.add(new int[]{arr[i][0], 1});   // Start
            points.add(new int[]{arr[i][1], -1});  // End
        }

        // If time same → end (-1) should come before start (+1)
        Collections.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int active = 0;
        int maxOverlap = 0;

        // Step 3: Sweep
        for (int[] point : points) {
            active += point[1];
            maxOverlap = Math.max(maxOverlap, active);
        }

        return maxOverlap;
    }
}
