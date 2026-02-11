class Solution {
    public static int firstRepeated(int[] nums) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int item : nums) {
            map.put(item, map.getOrDefault(item,0)+1);
        }

        for (int i=0; i<nums.length; i++) {
            if (map.get(nums[i]) > 1) {
                return i+1;
            }
        }
        return -1;
    }
}
