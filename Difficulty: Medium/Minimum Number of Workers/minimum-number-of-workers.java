class Solution {
    public int minMen(int arr[]) {
        // code here
        int n = arr.length;

        // Step 1: Convert array into intervals
        List<int[]> intervals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                int start = Math.max(0, i - arr[i]);
                int end = Math.min(n - 1, i + arr[i]);
                intervals.add(new int[]{start, end});
            }
        }

        // Step 2: Sort intervals by start time
        intervals.sort(Comparator.comparingInt(a -> a[0]));

        int count = 0;        // number of people selected
        int coveredTill = 0;  // current time slot to cover
        int i = 0;

        // Step 3: Greedy coverage
        while (coveredTill < n) {
            int farthest = coveredTill;

            // Try to extend coverage using all intervals
            // that start at or before coveredTill
            while (i < intervals.size() && intervals.get(i)[0] <= coveredTill) {
                farthest = Math.max(farthest, intervals.get(i)[1] + 1);
                i++;
            }

            // If we cannot extend coverage, return -1
            if (farthest == coveredTill) {
                return -1;
            }

            count++;
            coveredTill = farthest;
        }

        return count;
    }
}