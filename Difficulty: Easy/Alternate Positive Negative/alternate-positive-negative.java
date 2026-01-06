// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int even = 0, odd = 1;
        
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        
        for(int i : arr) {
            if(i < 0) n.add(i);
            else p.add(i);
        }
        
        int i=0, j=0, idx = 0;
        while(i < p.size() && j < n.size()) {
            arr.set(idx++, p.get(i++));
            arr.set(idx++, n.get(j++));
        }
        
        while(i < p.size()) {
            arr.set(idx++, p.get(i++));
        }
        while(j < n.size()) {
            arr.set(idx++, n.get(j++));
        }
    }
}