class Solution {
    public String removeKdig(String s, int k) {
        // code here
        Stack<Character> stack = new Stack<>();

    for (char digit : s.toCharArray()) {
        // Remove bigger digits from left if possible
        while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
            stack.pop();
            k--;
        }
        stack.push(digit);
    }

    // If k still remains, remove from the end
    while (k > 0 && !stack.isEmpty()) {
        stack.pop();
        k--;
    }

    // Build result while removing leading zeros
    StringBuilder sb = new StringBuilder();
    for (char c : stack) {
        if (sb.length() == 0 && c == '0') continue;
        sb.append(c);
    }

    return sb.length() == 0 ? "0" : sb.toString();
    }
}