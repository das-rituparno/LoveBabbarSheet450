class Solution {
    public static ArrayList<Integer> valueEqualToIndex(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == i+1) {
                res.add(arr[i]);
            }
        }
        return res;
    }
}
