//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine().trim());
            while(t-->0)
                {
                    String s = in.readLine().trim();
                    Solution ob = new Solution();
                    out.println(ob.isDivisible(s));
                }
                out.close();
        }
}    
// } Driver Code Ends

class Solution {
    int isDivisible(String s) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0)
                even += s.charAt(i) - '0';
            else
                odd += s.charAt(i) - '0';
        }
        return (Math.abs(even - odd) % 3 != 0) ? 0 : 1;
    }
}