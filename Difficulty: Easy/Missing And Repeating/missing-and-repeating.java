class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        int[] frequency = new int[n+1];
        ArrayList <Integer> list = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            frequency[arr[i]]++;
        }

        int missing = -1, repeated = -1;
        for (int i=1; i<=arr.length; i++) {
            if (frequency[i] == 0) missing = i;
            else if (frequency[i] == 2) repeated = i;
        }

        list.add(repeated);
        list.add(missing);
        return list;
    }
}
