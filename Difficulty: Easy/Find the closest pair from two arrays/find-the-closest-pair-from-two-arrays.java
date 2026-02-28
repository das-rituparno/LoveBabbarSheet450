class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
         ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = arr2.length-1;
        int min_diff = Integer.MAX_VALUE;
        int res1 = -1;
        int res2 = -1;

        while (i < arr1.length && j >= 0) {

            int sum = arr1[i] + arr2[j];
            int diff = Math.abs(sum - x);

            if (diff < min_diff) {
                min_diff = diff;
                res1 = arr1[i];
                res2 = arr2[j];
            }

            if (sum > x) {
                j--;
            } else {
                i++;
            }
        }

        list.add(res1);
        list.add(res2);
        return list;
    }
}