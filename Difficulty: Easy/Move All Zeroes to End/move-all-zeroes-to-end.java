class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int slow = 0;
        
        for(int fast=0; fast<arr.length; fast++) {
            if(arr[fast] != 0) {
                swap(arr, slow, fast);
                slow++;
            }
        }
    }
    
    void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}