class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        while (a[n-1] > b[0]) {
            int temp = a[n-1];
            a[n-1] = b[0];
            b[0] = temp;

            int i = n-2;
            while (i >= 0 && a[i] > a[i+1]) {
                int dummy = a[i+1];
                a[i+1] = a[i];
                a[i] = dummy;
                i--;
            }

            int j = 1;
            while (j < b.length && b[j] < b[j-1]) {
                int dummy = b[j-1];
                b[j-1] = b[j];
                b[j] = dummy;
                j++;
            }
        }
    }
}
