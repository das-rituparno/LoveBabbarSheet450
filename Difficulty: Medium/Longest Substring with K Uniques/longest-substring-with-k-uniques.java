class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int left = 0;
        int right = 0;
        int unique_character = -1;
        Map<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {
            char rc = s.charAt(right);
            map.put(rc, map.getOrDefault(rc,0)+1);

            while (map.size() > k) {
                char lc = s.charAt(left);
                map.put(lc, map.get(lc)-1);
                if (map.get(lc) == 0) map.remove(lc);
                left++;
            }
            if (map.size() == k) unique_character = Math.max(right-left+1, unique_character);
            right++;
        }
        return unique_character;
    }
}