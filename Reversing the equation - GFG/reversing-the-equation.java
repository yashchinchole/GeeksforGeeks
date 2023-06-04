//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends

class Solution {
    public String reverseEqn(String S) {
        Stack<String> stack = new Stack<>();
        String operators = "+-*/";

        StringBuilder number = new StringBuilder();
        for (char c : S.toCharArray()) {
            String charString = String.valueOf(c);
            if (Character.isDigit(c)) {
                number.append(c);
            } else if (operators.contains(charString)) {
                stack.push(number.toString());
                number = new StringBuilder();
                stack.push(charString);
            }
        }
        stack.push(number.toString());

        StringBuilder reversedEqn = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedEqn.append(stack.pop());
        }

        return reversedEqn.toString();
    }
}