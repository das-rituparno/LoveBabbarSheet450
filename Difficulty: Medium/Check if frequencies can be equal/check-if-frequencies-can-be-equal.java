class Solution {
    boolean sameFreq(String str) {
        // code here
        // Step 1: Count frequency of each character
        Map<Character, Integer> frequency = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Count how many times each frequency appears
        Map<Integer, Integer> freqCount = new HashMap<>();
        for (int freq : frequency.values()) {
            freqCount.put(freq, freqCount.getOrDefault(freq, 0) + 1);
        }

        // Case 1: all characters have the same frequency
        if (freqCount.size() == 1) {
            return true;
        }

        // Case 2: more than 2 different frequencies – impossible
        if (freqCount.size() > 2) {
            return false;
        }

        // Case 3: exactly 2 different frequencies
        int f1 = 0, f2 = 0, c1 = 0, c2 = 0;
        boolean first = true;

        for (Map.Entry<Integer, Integer> entry : freqCount.entrySet()) {
            if (first) {
                f1 = entry.getKey();
                c1 = entry.getValue();
                first = false;
            } else {
                f2 = entry.getKey();
                c2 = entry.getValue();
            }
        }

        // One of the frequencies is 1 and occurs only once (e.g., {1=1, 3=4})
        if ((f1 == 1 && c1 == 1) || (f2 == 1 && c2 == 1)) {
            return true;
        }

        // Difference between freqs is 1 and higher freq occurs only once (e.g., {2=1, 3=4})
        if ((Math.abs(f1 - f2) == 1) &&
                ((f1 > f2 && c1 == 1) || (f2 > f1 && c2 == 1))) {
            return true;
        }

        // Otherwise, not possible
        return false;
    }
}