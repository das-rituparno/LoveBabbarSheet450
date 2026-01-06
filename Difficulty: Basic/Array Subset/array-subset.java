
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        int i=0, j=0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int it : a) {
            map.put(it, map.getOrDefault(it, 0)+1);
        }
        
        for(int it : b) {
            if(!map.containsKey(it) || map.get(it) == 0) return false;
            map.put(it, map.get(it)-1);
        }
        
        return true;
    }
}
