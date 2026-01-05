class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int item : arr) {
            pq.add(item);
            if(pq.size() > k) {
                pq.remove();
            }
        }
        return pq.peek();
    }
}
