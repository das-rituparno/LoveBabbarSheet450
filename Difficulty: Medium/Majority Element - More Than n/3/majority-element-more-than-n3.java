class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int count1 = 0;
        int count2 = 0;
        int candidate1 = 0;
        int candidate2 = 0;
        
        for(int item : arr) {
            if(item == candidate1) count1++;
            else if(item == candidate2) count2++;
            else if(count1 == 0) {
                candidate1 = item;
                count1++;
            }
            else if(count2 == 0) {
                candidate2 = item;
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        
        count1 = 0;
        count2 = 0;
        for(int item : arr) {
            if(item == candidate1) count1++;
            else if(item == candidate2) count2++;
        }
        
        if(count1 > n/3) list.add(candidate1);
        if(count2 > n/3) list.add(candidate2);
        
        Collections.sort(list);
        return list;
    }
}