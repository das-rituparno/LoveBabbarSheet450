// User function Template for Java

class Solution {
    static List<Integer> minPartition(int n) {
        // code here
        int[] notes = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        
        List<Integer> list = new ArrayList<>();
        for (int i=notes.length-1; i>=0; i--) {
            while (n >= notes[i]) {
                list.add(notes[i]);
                n -= notes[i];
            }
        }

        return list;
    }
}