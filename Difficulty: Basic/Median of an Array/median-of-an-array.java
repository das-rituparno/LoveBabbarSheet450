class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        // 90, 100, 78, 89, 67
        // 67. 78. 89. 90. 100
        
        Arrays.sort(arr);
        int n = arr.length;

        if (n % 2 == 0) {
            return (arr[n/2 - 1] + arr[n/2]) / 2.0;
        } else {
            return arr[n/2];
        }
    }
}
