//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSum(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int maxSum(int n) 
    { 
        //code here.
        if(n==0 ||n==1) {
           return n;
        }
        int value1 = (n/2);
        int value2 = (n/3);
        int value3 = (n/4);
        int ans = maxSum(value1) + maxSum(value2) + maxSum(value3);
        return Math.max(ans,n);
    } 
}
