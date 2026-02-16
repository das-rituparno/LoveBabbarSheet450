class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int index = 0;
        while (index < a.length) {
            if (a[index] > b[0]) {
                int temp = a[index];
                a[index] = b[0];
                b[0] = temp;

                int k;
                int first = b[0];
                for (k=1; k<b.length && first > b[k]; k++) {
                    b[k-1] = b[k];
                }
                b[k-1] = first;
            }
            index++;
        }
    }
}
/*
Time Complexity - O(N)
Space Complexity - O(1)
*/