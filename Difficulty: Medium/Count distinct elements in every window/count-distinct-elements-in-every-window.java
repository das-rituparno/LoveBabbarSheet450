class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, right = 0;

        while (right < arr.length) {
            map.put(arr[right], map.getOrDefault(arr[right], 0)+1);

            if(right-left+1 == k) {
                list.add(map.size());

                //Remove left element
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) map.remove(arr[left]);
                left++;
            }
            right++;
        }
        return list;
    }
}