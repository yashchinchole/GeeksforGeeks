//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends

class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        int count_5 = 0, count_10 = 0;
        for (int i = 0; i < N; i++) {
            if (bills[i] == 5)
                count_5++;
            else if (bills[i] == 10) {
                count_5--;
                count_10++;
            } else {
                if (count_10 > 0)
                    count_10--;
                else
                    count_5 -= 2;
                count_5--;
            }
            if (count_5 < 0 || count_10 < 0)
                return false;
        }
        return true;
    }
}