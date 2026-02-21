class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int item : arr) set.add(item);
        
        int max_streak = 0;
        for(int num : set) {
            if(!set.contains(num-1)) {
                int current = num;
                int current_streak = 1;
                while(set.contains(current+1)) {
                    current++;
                    current_streak++;
                }
                max_streak = Math.max(max_streak, current_streak);
            }
        }
        return max_streak;
    }
}