class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int it : arr) {
            map.put(it, map.getOrDefault(it, 0)+1);
        }
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(n, 0));
        Stack<Integer> st = new Stack<>();

        for (int i=n-1; i>=0; i--) {
            while (!st.isEmpty() && map.get(arr[i]) >= map.get(st.peek())) {
                st.pop();
            }
            list.set(i, st.isEmpty() ? -1 : st.peek());
            
            st.push(arr[i]);
        }

        return list;
    }
}