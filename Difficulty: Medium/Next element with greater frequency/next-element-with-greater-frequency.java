class Solution {
    public ArrayList<Integer> findGreater(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int it : arr) {
            map.put(it, map.getOrDefault(it, 0) + 1);
        }

        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i= arr.length-1; i>=0; i--) {
            while(!st.isEmpty() && map.get(arr[i]) >= map.get(st.peek())) {
                st.pop();
            }

            list.add(st.isEmpty() ? -1 : st.peek());
            st.push(arr[i]);
        }

        Collections.reverse(list);
        return list;
    }
}