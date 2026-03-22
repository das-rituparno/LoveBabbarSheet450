class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int highest = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i] >= highest) {
                list.add(arr[i]);
                highest = Math.max(highest, arr[i]);
            }
            
        }
        Collections.reverse(list);
        return list;
    }
}
