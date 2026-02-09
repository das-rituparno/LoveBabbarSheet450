class Solution {
    public int findMin(int[] arr) {
        // code here
        int start = 0;
        int end = arr.length-1;
        int potential = 0;
        
        while(start < end) {
            int mid = (start+end)/2;
            
            if(arr[mid] > arr[end]) {
                start = mid+1;
            }
            else end = mid;
        }
        
        return arr[start];
    }
}
