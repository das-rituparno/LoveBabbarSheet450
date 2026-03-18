class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int i = 0;
        int j = 0;
        int platform = 0;
        int required_platform = 0;

        Arrays.sort(arr);
        Arrays.sort(dep);

        while (i < arr.length && j < dep.length) {
            if (arr[i] <= dep[j]) {
                platform++;
                i++;
            }
            else {
                platform--;
                j++;
            }
            required_platform = Math.max(required_platform, platform);
        }
        return required_platform;
    }
}
/*
Time Complexity - o(nlogn)
Space Complexity - o(n)
*/
