class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        deleteMiddleElement(s, 0, s.size());
    }
    
    public void deleteMiddleElement(Stack<Integer> st, int current, int size) {
        //Base Condition
        if(current == size/2) {
            st.pop();
            return;
        }
        
        //Hypothesis
        int temp = st.pop();
        deleteMiddleElement(st, current+1, size);
        
        //Induction
        st.push(temp);
    }
}