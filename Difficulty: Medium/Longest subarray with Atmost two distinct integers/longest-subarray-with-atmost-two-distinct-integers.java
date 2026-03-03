class Solution {
    public int totalElements(int[] arr) {
        // code here
        int left = 0;
        int right = 0;
        HashMap<Integer, Integer> seen = new HashMap<>();
        int longest_length = 0;

        while (right < arr.length) {
            seen.put(arr[right], seen.getOrDefault(arr[right], 0)+1);

            while (seen.size() > 2) {
                seen.put(arr[left], seen.get(arr[left])-1);
                if (seen.get(arr[left]) == 0) seen.remove(arr[left]);
                left++;
            }

            longest_length = Math.max(longest_length, right-left+1);
            right++;
        }
        return longest_length;
    }
}