//{ Driver Code Starts
//Initial Template for Java


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
            System.out.println(ob.largestPrimeFactor(N));
        }
    }
}
// } Driver Code Ends

class Solution {
    static long largestPrimeFactor(int N) {
        long res = 0;
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                res = i;
                N = N / i;
            }
        }
        if (N > 1)
            res = N;
        return res;
    }
}