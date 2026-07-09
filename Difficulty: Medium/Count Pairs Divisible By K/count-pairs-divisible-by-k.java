class Solution {
    public int countKdivPairs(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(int item : arr) {
            int remainder = item % k;
            
            if(remainder < 0) {
                remainder += k;
            }
            
            int complement = (k - remainder) % k;
            if(map.containsKey(complement)) {
                count += map.get(complement);
            }
            
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}