class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        return helper_class(arr, arr.length, sum);
    }
    
    public static Boolean helper_class(int[] arr, int n, int sum) {
        //Base Condition
        if(sum == 0) return true;
        if(n == 0) return false;
        
        //Choice Diagram
        if(arr[n-1] <= sum) {
            return helper_class(arr, n-1, sum - arr[n-1]) ||
            helper_class(arr, n-1, sum);
        }
        else {
            return helper_class(arr, n-1, sum);
        }
    }
}