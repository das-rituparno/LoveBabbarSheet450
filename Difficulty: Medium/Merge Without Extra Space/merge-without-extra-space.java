class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int idx = 0;
        while(idx < a.length) {
            if(a[idx] > b[0]) {
                int temp = a[idx];
                a[idx] = b[0];
                b[0] = temp;
                
                int k;
                int first = b[0];
                for(k=1; k<b.length && first > b[k]; k++) {
                    b[k-1] = b[k];
                }
                b[k-1] = first;
            }
            idx++;
        }
    }
}
