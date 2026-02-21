class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            if (item.getValue() > arr.length/k) {
                count++;
            }
        }
        return count;
    }
}