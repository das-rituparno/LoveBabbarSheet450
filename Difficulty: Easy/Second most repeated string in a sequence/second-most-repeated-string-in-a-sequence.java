// User function Template for Java

class Solution {
    String secFrequent(String arr[], int N) {
        // your code here
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        int count = 0;
        for (String item : arr) {
            map.put(item, map.getOrDefault(item,0)+1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>(
                        (a, b) -> Integer.compare(b.getValue(), a.getValue())
                );
        pq.addAll(map.entrySet());
        pq.poll();
        return pq.poll().getKey();
    }
}