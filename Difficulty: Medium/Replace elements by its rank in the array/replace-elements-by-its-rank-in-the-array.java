// User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
        int[] sorted_array = arr.clone();
        Arrays.sort(sorted_array);

        int index = 1;
        int[] result = new int[sorted_array.length];
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i=0; i<sorted_array.length; i++) {
            if (!map.containsKey(sorted_array[i])) {
                map.put(sorted_array[i], index++);
            }
        }

        for (int i=0; i<result.length; i++) {
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}

/*
Time Complexity - O(n log n), used sorting
Space Complexity - O(n)
*/