class Solution {
    public int countSubstr(String s, int k) {
        //  code here
        if (k == 0) return 0;               

        return atMostK(s, k)                 
             - atMostK(s, k - 1);
    }
    
    public int atMostK(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, count = 0;
        
        while(right < s.length()) {
            
            //Extend the window
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            
            //Shrink the window
            while (map.size() > k) {
                char ch2 = s.charAt(left);
                map.put(ch2, map.get(ch2)-1);
                
                if (map.get(ch2) == 0) {
                    map.remove(ch2);
                }
                left++;
            }
            
            //Count SubStrings
            count += right - left + 1;
            right++;
        }
        
        return count;
    }
}