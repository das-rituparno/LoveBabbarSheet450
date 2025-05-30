class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=arr.length-1; i>=0; i--) {
            while(!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) list.add(-1);
            else list.add(st.peek());
            st.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }
}