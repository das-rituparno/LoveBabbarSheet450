//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution obj = new Solution();

            boolean a = obj.areIsomorphic(s1, s2);
            if (a)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1, String s2) {
        // Your code here
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();
        
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()) {
            char c1 = s1.charAt(idx);
            char c2 = s2.charAt(idx);
            
            if(hm1.containsKey(c1)) {
                if(hm1.get(c1) != c2) return false;
            }
            else {
                hm1.put(c1, c2);
            }
            
            if(hm2.containsKey(c2)) {
                if(hm2.get(c2) != c1) return false;
            }
            else {
                hm2.put(c2, c1);
            }
            
            idx++;
            
        }
        
        return true;
    }
}

/*
aab
xxy

hm1 = (a,x),  
hm2 =
*/