class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String, ArrayList<String>> map = new HashMap<>();

        for (String item : arr) {
            char[] temp = item.toCharArray();
            Arrays.sort(temp);
            String sortedKey = new String(temp);

            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }
            map.get(sortedKey).add(item);
        }

        return new ArrayList<>(map.values());
    }
}
