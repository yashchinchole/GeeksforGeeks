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
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends

class Solution {
    static int next(int n, List<Integer> v) {
        if (n == 1)
            return v.get(0);
        if (!v.subList(1, v.size()).contains(n)) {
            v.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = sum;
            return next(n, v);
        } else {
            v.set(0, v.get(0) + 1);
            return next(v.get(0), v);
        }
    }

    static int nextHappy(int N) {
        List<Integer> v = new ArrayList<>();
        v.add(N + 1);
        v.add(0);
        int x = next(N + 1, v);
        return x;
    }
}