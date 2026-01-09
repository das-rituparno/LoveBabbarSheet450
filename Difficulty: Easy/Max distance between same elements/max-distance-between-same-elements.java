class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, max_count = 0;
        for (int i=0; i<arr.length; i++) {
            if (map.containsKey(arr[i])) {
                count = i - map.get(arr[i]);
                max_count = Math.max(count, max_count);
            }
            else map.put(arr[i], i);
        }

        return max_count;
    }
}