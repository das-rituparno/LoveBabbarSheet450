class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int minimum=Integer.MAX_VALUE, maximum=Integer.MIN_VALUE;
        for(int item : arr) {
            minimum = Math.min(minimum, item);
            maximum = Math.max(maximum, item);
        }
        list.add(minimum);
        list.add(maximum);
        return list;
    }
}
