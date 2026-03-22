// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) {
        // your code here
        int val = 0;
        for(int item : arr) {
            val ^= item;
        }
        return val;
    }
}