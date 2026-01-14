class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        List<Integer> police = new ArrayList<>();
        List<Integer> thieves = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 'P') police.add(i);
            else if (arr[i] == 'T') { thieves.add(i);
            }
        }

        int i =0, j=0, count = 0;
        while (i < police.size() && j < thieves.size()) {
            int p = police.get(i);
            int t = thieves.get(j);

            if (Math.abs(p-t) <= k) {
                count++;
                i++;
                j++;
            }
            else if(t < p - k) {
                j++;
            }
            else {
                i++;
            }
        }
        return count;
    }
}