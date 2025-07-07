class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(arr.length, -1));
        Stack<Integer> st = new Stack<>();
        
        for (int i=2*arr.length-1; i>=0; i--) {
            int idx = i%arr.length;
            while (!st.isEmpty() && arr[idx] >= st.peek()) {
                st.pop();
            }
            if (i < arr.length) {
                list.set(idx, st.isEmpty() ? -1 : st.peek());
            }

            st.push(arr[idx]);
        }
        
        return list;
    }
}