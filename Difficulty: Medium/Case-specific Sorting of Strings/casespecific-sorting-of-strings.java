class Solution {
    public static String caseSort(String s) {
        // code here
        StringBuilder lower = new StringBuilder();
        StringBuilder upper = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower.append(c);
            } else if (Character.isUpperCase(c)) {
                upper.append(c);
            }
        }

        char[] lowerChars = lower.toString().toCharArray();
        char[] upperChars = upper.toString().toCharArray();

        Arrays.sort(lowerChars);
        Arrays.sort(upperChars);

        int l = 0, u = 0;
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(lowerChars[l++]);
            } else {
                result.append(upperChars[u++]);
            }
        }

        return result.toString();
    }
}