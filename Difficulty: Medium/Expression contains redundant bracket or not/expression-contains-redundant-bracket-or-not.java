class Solution {
    public static boolean checkRedundancy(String s) {
        // code here
        Stack<Character> st = new Stack<>();

        for (char it : s.toCharArray()) {
            if (it == ')') {
                boolean sign = false;
                
                while(st.size() != 0 && st.peek() != '(') {
                    char top = st.pop();
                    if(top == '+' || top == '-' ||
                    top == '*' || top == '/') {
                        sign = true;
                    }
                }
                st.pop();
                if(!sign) return true;
            }
            else st.push(it);
        }
        return false;
    }
}

/*
Time Complexity - O(n)
Space Complexity - O(n)
*/