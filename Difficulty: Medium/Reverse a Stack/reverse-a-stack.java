// User function Template for Java

class Solution {
    static void reverse(Stack<Integer> s) {
        // add your code here
        // Base Condition
        if(s.isEmpty()) return;
        
        // Hypothesis
        int temp = s.pop();
        reverse(s);
        
        // Infuction
        insertAtBottom(s, temp);
    }
    
    static void insertAtBottom(Stack<Integer> st, int temp) {
        // Base Condition
        if(st.isEmpty()) {
            st.push(temp);
            return;
        }
        
        // Hypothesis
        int last = st.pop();
        insertAtBottom(st, temp);
        
        // Induction
        st.push(last);
    }
}