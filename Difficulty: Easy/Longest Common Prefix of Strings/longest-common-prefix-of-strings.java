// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        if(arr.length == 1) return arr[0];
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        
        int idx = 0;
        while(first.charAt(idx) == last.charAt(idx)) {
            idx++;
        }
        
        return first.substring(0,idx);
    }
}