//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] price = new int[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                price[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            sln.stockBuySell(price, n);
        }
    }
}
// } Driver Code Ends

class Solution {
    public void stockBuySell(int[] price, int n) {
        int i = 0, j = 0, flag = 0;
        while (i < n - 1) {
            while (i < n - 1 && price[i + 1] > price[i])
                i++;
            if (i != j && price[i] > price[j]) {
                flag = 1;
                System.out.print("(" + j + " " + i + ") ");
            }
            j = i + 1;
            i = j;
        }
        if (flag == 0)
            System.out.print("No Profit");
        System.out.println();
    }
}