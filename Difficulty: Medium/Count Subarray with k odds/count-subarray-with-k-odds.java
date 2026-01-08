class Solution {
    public int countSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> frequency = new HashMap<>();
        frequency.put(0, 1);
        int count = 0, sum = 0;

        for (int item : arr) {
            sum += (item%2);

            if (frequency.containsKey(sum-k)) {
                count += frequency.get(sum-k);
            }

            frequency.put(sum, frequency.getOrDefault(sum,0)+1);
        }

        return count;
    }
}
