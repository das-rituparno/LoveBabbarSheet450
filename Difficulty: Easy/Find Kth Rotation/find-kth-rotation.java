class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int[] temp = arr.clone();
        Arrays.sort(temp);
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == temp[0]) {
                return i;
            }
        }
        return -1;
    }
}