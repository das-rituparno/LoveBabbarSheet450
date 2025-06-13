class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int low = 1;
        int high = getMax(arr);
        int res = high;
        
        while(low <= high) {
            int mid = (low+high)/2;
            
            int hours_needed = getHour(arr, mid);
            if(hours_needed <= k) {
                res = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return res;
    }
    
    public int getMax(int[] arr) {
        int res = Integer.MIN_VALUE;
        for(int i : arr) {
            res = Math.max(res, i);
        }
        return res;
    }
    
    public int getHour(int[] arr, int speed) {
        int total = 0;
        for(int i : arr) {
            total += (i+speed-1)/speed;
        }
        return total;
    }
}
