//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends

class Solution {
    public int[] singleNumber(int[] nums) {
        int x[] = new int[2], i, p = 0;
        Arrays.sort(nums);
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                i++;
            else
                x[p++] = nums[i];
        }
        if (p == 1)
            x[p] = nums[i];
        return x;
    }
}