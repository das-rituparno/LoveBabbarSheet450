class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix_sum = 0;
        int count = 0;

        for (int item : arr) {
            prefix_sum ^= item;

            if(map.containsKey(prefix_sum ^ k)) {
                count += map.get(prefix_sum ^ k);
            }
            map.put(prefix_sum, map.getOrDefault(prefix_sum, 0)+1);
        }
        
        return count;
    }
}