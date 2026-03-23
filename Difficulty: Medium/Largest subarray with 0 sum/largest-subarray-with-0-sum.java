class Solution {
    int maxLength(int arr[]) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max_length = 0;
        map.put(0, -1);
        
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(map.containsKey(sum)) {
                max_length = Math.max(i - map.get(sum), max_length);
            }
            else {
                map.put(sum, i);
            }
        }
        return max_length;
    }
}
/*
15, -2, 2, -8, 1, 7, 10, 23
15  13  15  7  8  15  25  48
*/