class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, max_sum = 0;
        
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            
            if(sum == 0) max_sum = i+1;
            
            if(map.containsKey(sum)) {
                max_sum = Math.max(max_sum, i-map.get(sum));
            }
            else map.put(sum, i);
        }
        return max_sum;
    }
}