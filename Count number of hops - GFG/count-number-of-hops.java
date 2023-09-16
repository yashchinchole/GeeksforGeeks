//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG implements Runnable {
    public void run() {
        try {
            BufferedReader in;
            PrintWriter out;
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(in.readLine().trim());

                Solution g = new Solution();
                out.println(g.countWays(n));
            }
            out.close();
        } catch (Exception e) {
            ;
        }
    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new GFG(), "whatever", 1 << 26).start();
    }
}
// } Driver Code Ends

class Solution {
    static long countWays(int n) {
        int mod = (int) 1e9 + 7;
        int arr[] = new int[] { 1, 2, 4 };
        if (n <= 3)
            return arr[n - 1];
        for (int i = 4; i <= n; i++) {
            long total = 0l + arr[0] + arr[1] + arr[2];
            total %= mod;
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = (int) total;
        }
        return arr[2];
    }
}