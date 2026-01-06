class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Set<Integer> set = new HashSet<>();
        int maxStreak = 0;
        
        for (int it : arr) {
            set.add(it);
        }

        for(int it : set) {
            if (!set.contains(it-1)) {
                int current = it;
                int currentStreak = 1;
                while (set.contains(current+1)) {
                    currentStreak++;
                    current++;
                }
                maxStreak = Math.max(maxStreak, currentStreak);
            }
        }
        return maxStreak;
    }
}