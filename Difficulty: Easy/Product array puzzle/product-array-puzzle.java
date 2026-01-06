// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int[] nums = new int[arr.length];
        int left_sum = 1, right_sum = 1;

        for (int i=0; i<arr.length; i++) {
            nums[i] = left_sum;
            left_sum *= arr[i];
        }
        for (int i=arr.length-1; i>=0; i--) {
            nums[i] *= right_sum;
            right_sum *= arr[i];
        }

        return nums;
    }
}
