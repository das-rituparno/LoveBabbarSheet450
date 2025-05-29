class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr) {
            pq.add(i);
            if(pq.size() > k) {
                pq.remove();
            }
        }

        while (!pq.isEmpty()) {
            list.add(pq.remove());
        }
        Collections.reverse(list);
        return list;
    }
}
