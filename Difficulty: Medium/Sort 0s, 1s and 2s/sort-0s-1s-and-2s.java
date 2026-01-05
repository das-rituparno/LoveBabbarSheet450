class Solution {
    public void sort012(int[] arr) {
        // code here
        int start = 0, mid = 0, end = arr.length-1;
        
        while(mid <= end) {
            if(arr[mid] == 0) {
                swap(arr, start, mid);
                start++;
                mid++;
            }
            else if(arr[mid] == 2) {
                swap(arr, mid, end);
                end--;
            }
            else mid++;
        }
    }
    
    public void swap(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}