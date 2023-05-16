//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String srgs[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s1[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPossible(n, m, s));
        }
    }
}
// } Driver Code Ends

class Solution {
    static int isPossible(int n, int m, String s) {
        int countH = 0, countV = 0, maxH = 0, minH = 0, maxV = 0, minV = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'L') {
                countH--;
                if (countH < minH)
                    minH = countH;
            } else if (c == 'R') {
                countH++;
                if (countH > maxH)
                    maxH = countH;
            } else if (c == 'U') {
                countV++;
                if (countV > maxV)
                    maxV = countV;
            } else {
                countV--;
                if (countV < minV)
                    minV = countV;
            }
        }

        if (maxV - minV + 1 > n || maxH - minH + 1 > m)
            return 0;
        return 1;
    }
}