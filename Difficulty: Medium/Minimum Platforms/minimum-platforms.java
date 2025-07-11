// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);

        int n = arr.length;
        int platformNeeded = 0;
        int maxPlatforms = 0;
        int i=0,j=0;

        while(i < arr.length && j < dep.length) {
            if (arr[i] <= dep[j]) {
                platformNeeded++;
                i++;
            }
            else {
                platformNeeded--;
                j++;
            }

            maxPlatforms = Math.max(platformNeeded, maxPlatforms);
        }
        return maxPlatforms;
    }
}
