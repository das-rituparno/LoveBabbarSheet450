// User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int position = 1;
        
        for (int i : sorted) {
            if (!map.containsKey(i)) map.put(i, position++);
        }

        for (int i=0; i<arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
