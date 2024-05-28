//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int w;
            w = Integer.parseInt(br.readLine());

            int[] cost = IntArray.input(br, n);

            Solution obj = new Solution();
            int res = obj.minimumCost(n, w, cost);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends

class Solution {
    private static Integer[][] dp;
    private static boolean flag;
    
    public static int minimumCost(int n, int w, int[] cost) {
        // code here
        dp = new Integer[n+1][w+1];
        flag = false;
        
        int val = solve(cost, n, w);
        return (!flag) ? -1 : val;
    }
    
    private static int solve(int[] cost, int idx, int w) {
        if (w == 0) {
            flag = true;
            return 0;
        }
        
        if (idx == 0) {
            // Didn't considered Integer.MAX_VALUE because it may overflow and result in min cost.
            return 100_000;
        }
        
        if (dp[idx][w] != null) {
            return dp[idx][w];
        }
        
        if (w >= idx && cost[idx-1] != -1) {
            int x = cost[idx-1] + solve(cost, idx-1, w-idx);
            int y = cost[idx-1] + solve(cost, idx, w-idx);
            int z = solve(cost, idx-1, w);
            
            dp[idx][w] = Math.min(x, Math.min(y, z));
        } else {
            dp[idx][w] = solve(cost, idx-1, w);
        }
        
        return dp[idx][w];
    }
}