
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] + x) || set.contains(arr[i] - x)) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
