//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String read[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(read[0]);
            int r = Integer.parseInt(read[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nCr(n, r));
        }
    }
}
// } Driver Code Ends

class Solution {
    static int nCr(int n, int r) {
        long[][] dp = new long[2][r + 1];
        dp[0][0] = 1;
        int m = 1000000007;
        for (int i = 1; i <= n; i++) {
            int nn = i % 2;
            dp[nn][0] = 1;
            for (int j = 1; j <= i && j <= r; j++) {
                dp[nn][j] = dp[(i + 1) % 2][j - 1] + dp[(i + 1) % 2][j];
                dp[nn][j] %= m;
            }
        }
        return (int) dp[n % 2][r];
    }
}