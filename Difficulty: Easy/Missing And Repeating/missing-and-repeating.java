//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import ArrayList
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // Get the result as an ArrayList<Integer>
            ArrayList<Integer> ans = new Solution().findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;

        // Expected sum and square sum (using long to avoid overflow)
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSquareSum = (long) n * (n + 1) * (2 * n + 1) / 6;

        // Actual sum and square sum
        long actualSum = 0;
        long actualSquareSum = 0;

        for (int num : arr) {
            actualSum += num; // Sum of array elements
            actualSquareSum += (long) num * num; // Sum of squares of array elements
        }

        // Differences
        long diffSum = expectedSum - actualSum; // missing - repeating (a - b)
        long diffSquareSum = expectedSquareSum - actualSquareSum; // missing^2 - repeating^2 (a^2 - b^2)

        // Solve equations
        long sumMissingAndRepeating = diffSquareSum / diffSum; // missing + repeating (a + b)
        int missing = (int) ((diffSum + sumMissingAndRepeating) / 2); // missing = (diffSum + sum) / 2
        int repeating = (int) (sumMissingAndRepeating - missing); // repeating = sum - missing

        // Add results to the list
        res.add(repeating);
        res.add(missing);

        return res;
    }
}
