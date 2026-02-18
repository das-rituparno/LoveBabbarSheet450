

class Solution {
    static int minJumps(int[] arr) {
        // code here
        if(arr[0] == 0)  return -1;
        if(arr.length <= 1) return 0;
        
        int jumps = 1;
        int reach = arr[0];
        int step = arr[0];
        
        for(int i=1; i<arr.length; i++) {
            if(i == arr.length-1) return jumps;
            reach = Math.max(reach, arr[i] + i);
            step--;
            
            if(step == 0) {
                jumps++;
                if(i >= reach) return -1;
                step = reach - i;
            }
        }
        return -1;
    }
}