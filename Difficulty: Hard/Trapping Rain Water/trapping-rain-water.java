class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int left = 0, right = n - 1;
        int ans = 0;
        int maxLeft = 0, maxRight = 0;
        
        while(left <= right) {
            if(arr[left] < arr[right]) {
                if(arr[left] > maxLeft) maxLeft = arr[left];
                else ans += maxLeft - arr[left];
                left++;
            }
            else {
                if(arr[right] > maxRight) maxRight = arr[right];
                else ans += maxRight - arr[right];
                right--;
            }
        }
        return ans;
    }
}
