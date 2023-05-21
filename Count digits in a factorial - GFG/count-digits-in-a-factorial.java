//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.facDigits(N));
        }
    }
}
// } Driver Code Ends

class Solution {
    int facDigits(int N) {
        double digits = 0.0;
        for (int i = 2; i <= N; i++)
            digits += Math.log10(i);
        return (int) Math.floor(digits) + 1;
    }
}