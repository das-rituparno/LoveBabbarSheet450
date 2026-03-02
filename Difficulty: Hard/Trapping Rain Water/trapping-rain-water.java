class Solution {
    public int maxWater(int arr[]) {
        // code here
        int left = 0;
        int max_left = 0;
        int right = arr.length-1;;
        int max_right = 0;
        int trapping_water = 0;
        
        while(left < right) {
            if(arr[left] < arr[right]) {
                if(max_left <= arr[left]) {
                    max_left = arr[left];
                }
                else {
                    trapping_water += max_left - arr[left];
                }
                left++;
            }
            else {
                if(max_right <= arr[right]) {
                    max_right = arr[right];
                }
                else {
                    trapping_water += max_right - arr[right];
                }
                right--;
            }
        }
        return trapping_water;
    }
}
