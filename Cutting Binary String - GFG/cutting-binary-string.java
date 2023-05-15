//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            
            System.out.println(ob.cuts(s));
        }
    } 
} 

// } Driver Code Ends

class Solution {
    static int cuts(String s) {
        int n = s.length();
        int dp[] = new int[n + 1];
        Arrays.fill(dp, (int) 1e9);
        dp[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++)
                if (checkPowerOf5(s.substring(i, j + 1)))
                    dp[i] = Math.min(dp[j + 1] + 1, dp[i]);
        }
        int res = dp[0];
        return res >= (int) 1e9 ? -1 : res;
    }

    static boolean checkPowerOf5(String str) {
        if (str.charAt(0) == '0')
            return false;
        long p = 1, temp = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            temp += p * (str.charAt(i) - '0');
            p *= 2;
        }
        long n = 1;
        while (n <= temp) {
            if (n == temp)
                return true;
            n *= 5;
        }
        return false;
    }
}