class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix_sum = 0;
        int count = 0;
        map.put(prefix_sum,1);

        for (int item : arr) {
            prefix_sum += item;
            if (map.containsKey(prefix_sum)) {
                count += map.get(prefix_sum);
            }
            map.put(prefix_sum, map.getOrDefault(prefix_sum, 0)+1);
        }
        return count;
    }
}
