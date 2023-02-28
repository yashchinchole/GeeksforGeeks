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
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
        // code here
       int ans = 0;
        if (str.equalsIgnoreCase("Integer") || str.equalsIgnoreCase("Float")) {
            ans = 4;
        } else if (str.equalsIgnoreCase("Character")) {
            ans = 1;
        } else if (str.equalsIgnoreCase("Double") || str.equalsIgnoreCase("Long")) {
            ans = 8;
        }
        return ans;
    }
}