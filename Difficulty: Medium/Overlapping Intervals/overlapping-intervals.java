class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> list = new ArrayList<>();
        int[] current = arr[0];
        list.add(current);
        
        for(int i=1; i<arr.length; i++) {
            int[] next = arr[i];
            
            //if overlapping intervals exists
            if(current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            }
            else {
                current = next;
                list.add(current);
            }
        }
        
        return list;
    }
}