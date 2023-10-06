//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] >= 0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }
        
        int i = 0;
        int j = 0;
        int index = 0;
        
        while(i < pos.size() && j < neg.size()) {
            arr[index] = pos.get(i++);
            arr[index+1] = neg.get(j++);
            index = index + 2;
        }
        
        while(i < pos.size()) {
            arr[index++] = pos.get(i++);
        }
        
        while(j < neg.size()) {
            arr[index++] = neg.get(j++);
        }
    }
}