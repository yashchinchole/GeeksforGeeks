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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends

class Solution {
    static String longestPalin(String S) {
        int start = 0, end = 0;
        int low, high;
        for (int i = 0; i < S.length(); i++) {
            low = i - 1;
            high = i;
            while (low >= 0 && high < S.length() && S.charAt(low) == S.charAt(high)) {
                if (high - low + 1 > end) {
                    end = high - low + 1;
                    start = low;
                }
                low--;
                high++;
            }
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < S.length() && S.charAt(low) == S.charAt(high)) {
                if (high - low + 1 > end) {
                    end = high - low + 1;
                    start = low;
                }
                low--;
                high++;
            }

        }
        if (end == 0)
            return S.substring(start, start + 1);
        return S.substring(start, start + end);
    }
}