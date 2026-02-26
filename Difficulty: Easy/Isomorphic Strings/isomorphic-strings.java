class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();
        
        for(int i=0; i<s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            
            if(map.containsKey(ch1)) {
                if(map.get(ch1) != ch2) {
                    return false;
                }
            }
            
            else {
                if(used.contains(ch2)) {
                    return false;
                }
                
                map.put(ch1, ch2);
                used.add(ch2);
            }
        }
        
        return true;
    }
}