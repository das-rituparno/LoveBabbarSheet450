class Solution {
    public static int solve(int n, String s) {
        // code here
        HashSet<Character> working = new HashSet<>();
        HashSet<Character> rejected = new HashSet<>();
        int walked_away = 0;

        for (char item : s.toCharArray()) {
            // If customer already using computer → departure
            if (working.contains(item)) {
                working.remove(item);
            }
            // If customer was rejected earlier → ignore departure
            else if(rejected.contains(item)) {
                continue;
            }
            // First arrival
            else {
                if (working.size() < n) {
                    working.add(item);
                }
                else {
                    walked_away++;
                    rejected.add(item);
                }
            }
        }
        return walked_away;
    }
}
