class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        //1  1  4  6  6  8  9  10 and 7

        int smallest = arr[0] + k; //3...8
        int largest = arr[n-1] - k;  //8...3

        int mi, ma;
        int ans = arr[n - 1] - arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i]-k < 0) continue;

            mi = Math.min(smallest, arr[i] - k); //-1, 3, 3, 3...X, X, X, 1, 1, 1
            ma = Math.max(largest, arr[i-1] + k);  //8, 8, 10, 12...8, 11, 13, 15, 16, 17
            ans = Math.min(ma-mi, ans); // 5 7 9...X, X, X, 14, 15, 16
        }
        return ans;
        
    }
}
/*
Time Complexity - O(N)
Sapce Complexity - O(1)
*/
