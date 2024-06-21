//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends

class Solution {
    long ExtractNumber(String S) {
        String[] a = S.split(" ");
        long max = Long.MIN_VALUE; // Initialize with minimum long value to handle comparison correctly

        for (String value : a) {
            if (!value.isEmpty() && Character.isDigit(value.charAt(0)) && !value.contains("9")) {
                max = Math.max(max, Long.parseLong(value));
            }
        }

        // If max is still Long.MIN_VALUE, it means no valid number was found, so return -1
        return max == Long.MIN_VALUE ? -1 : max;
    }
}