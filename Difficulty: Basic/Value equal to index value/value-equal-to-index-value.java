//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine().trim());

        while (t-- > 0) {
            String line = scanner.nextLine().trim();
            String[] parts = line.split("\\s+");
            List<Integer> nums = new ArrayList<>();
            for (String part : parts) {
                nums.add(Integer.parseInt(part));
            }

            Solution ob = new Solution();
            List<Integer> ans = ob.valueEqualToIndex(nums);
            if (ans.isEmpty()) {
                System.out.println("Not Found");
            } else {
                for (int x : ans) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        
System.out.println("~");
}
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        List<Integer> result = new ArrayList<>();
        
        // Iterate through the list (0-based index)
        for (int i = 0; i < nums.size(); i++) {
            // Check if the value equals the 1-based index (i+1)
            if (nums.get(i) == i + 1) {
                result.add(i + 1);  // Add the 1-based index to the result
            }
        }
        
        return result;
    }
}