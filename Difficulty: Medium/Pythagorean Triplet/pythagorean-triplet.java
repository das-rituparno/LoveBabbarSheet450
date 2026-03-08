class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = arr[i] * arr[i];
        }
        //find max value;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        

        for(int i=max;i>0;i--){
            if(set.contains(i)){
                for(int j=0;j<n;j++){
                    if(arr[j] == max){
                        continue;
                    }
                    if(set.contains(Math.abs(i-arr[j]))){
                        return true;
                    }
                    
                }
            }
        }
        return false;
    }
}