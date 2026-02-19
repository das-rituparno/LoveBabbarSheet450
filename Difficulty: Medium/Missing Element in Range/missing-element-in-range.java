class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int item : arr) set.add(item);
        
        for(int i=low; i<=high; i++) {
            if(!set.contains(i)) {
                list.add(i);
            }
        }
        
        return list;
    }
}