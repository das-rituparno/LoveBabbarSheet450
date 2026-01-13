class Solution {
    public boolean canServe(int[] arr) {
        // code here
        HashMap<Integer, Integer> notes = new HashMap<>();
        for (int item : arr) {

            if (item == 10) {
                if (notes.getOrDefault(5, 0) >= 1) {
                    notes.put(5, notes.get(5) - 1);
                } else return false;
            }
            else if (item == 20) {
                if (notes.getOrDefault(10, 0) >= 1 &&
                        notes.getOrDefault(5, 0) >= 1) {
                    notes.put(10, notes.get(10) - 1);
                    notes.put(5, notes.get(5) - 1);
                } else if (notes.getOrDefault(5, 0) >= 3) {
                    notes.put(5, notes.get(5) - 3);
                } else return false;
            }

            notes.put(item, notes.getOrDefault(item, 0) + 1);
        }

        return true;
    }
}