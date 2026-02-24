class Solution {
    public String reverse(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        String res = "";
        for (char i : s.toCharArray()) {
            st.push(i);
        }
        while (!st.isEmpty()) {
            res += st.pop();
        }

        return res;
    }
}