class Solution {
    int majorityElement(int arr[]) {
        // code here
        int candidate = -1;
        int count = 0;
        int max_count = 0;

        for (int item : arr) {
            if (count == 0) {
                candidate = item;
                count++;
            }
            else if(candidate == item) {
                count++;
            }
            else count--;
        }

        count = 0;
        for (int item : arr) {
            if (candidate == item) count++;
        }
        
        return count > arr.length/2 ? candidate : -1;
    }
}