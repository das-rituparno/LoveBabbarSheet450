class Solution {
    String removeSpaces(String s) {
        // code here
        String res = "";
        for(char c : s.toCharArray()) {
            if(c != ' ') {
                res += c;
            }
        }
        return res;
    }
}