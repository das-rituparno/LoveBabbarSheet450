// User function Template for Java

class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        long count = 0;

        for (int i=0; i<arr.length-2; i++) {
            int first = i;
            int second = i+1;
            int third = arr.length-1;

            while (second < third) {
                long total_sum = arr[first] + arr[second] + arr[third];

                if (total_sum < sum) {
                    count += (third - second);
                    second++;
                }
                else {
                    third--;
                }
            }
        }
        return count;
    }
}
