class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        Map<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        int left = 0;

        for (int right = 0; right < arr.length; right++) {

            pq.add(arr[right]);
            freq.put(arr[right], freq.getOrDefault(arr[right], 0) + 1);

            if (right - left + 1 == k) {

                // Remove invalid elements
                while (!pq.isEmpty() && freq.get(pq.peek()) == 0) {
                    pq.poll();
                }

                result.add(pq.peek());

                // Mark outgoing element as invalid
                freq.put(arr[left], freq.get(arr[left]) - 1);
                left++;
            }
        }
        return result;
    }
}
