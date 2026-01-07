class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++) {
            int first = i;
            int second = i+1;
            int third = arr.length-1;
            
            while(second < third) {
                int sum = arr[first] + arr[second] + arr[third];
                
                if(sum == target) return true;
                else if(sum > target) third--;
                else second++;
            }
        }
        return false;
    }
}
