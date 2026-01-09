class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        int left = 0, right = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (right < arr.length) {
            //expand the window
            map.put(arr[right], map.getOrDefault(arr[right], 0)+1);

            //shrink the window
            while (map.size() > k) {
                map.put(arr[left], map.get(arr[left])-1);

                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }

            //count valid sub-arrays
            count += right-left+1;
            right++;
        }
        
        return count;
    }
}
