//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s = in.readLine();

            Solution ob = new Solution();
            out.println(ob.decodeString(s));

            out.println("~");
        }
        out.close();
    }
}
// } Driver Code Ends



class Solution {
    static String decodeString(String s) {
        // code here
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                num = (num*10) + (ch - '0');
            }
            
            else if(ch == '[') {
                numStack.push(num);
                stringStack.push(sb);
                num = 0;
                sb = new StringBuilder();
            }
            
            else if(ch == ']') {
                int count = numStack.pop();
                StringBuilder temp = stringStack.pop();
                for(int i=0; i<count; i++) {
                    temp.append(sb);
                }
                sb = temp;
            }
            
            else {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}