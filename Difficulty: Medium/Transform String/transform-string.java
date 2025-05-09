//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transform (A, B));
                
System.out.println("~");
}
        }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int transform(String A, String B) {
        // code here
        // GeeksForGeeks
        // ForGeeksGeeks
        
        if(A.length() != B.length()) return -1;
        
        int[] count = new int[256];
        for(char c : A.toCharArray()) count[c]++;
        for(char c : B.toCharArray()) count[c]--;
        
        for(int c : count) {
            if(c != 0) return -1;
        }
        
        int i = A.length()-1;
        int j = B.length()-1;
        
        while(i >= 0) {
            if(A.charAt(i) == B.charAt(j)) j--;
            i--;
        }
        
        return j+1;
    }
}