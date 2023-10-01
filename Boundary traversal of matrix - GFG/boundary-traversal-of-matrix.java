//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            s = in.readLine().trim().split(" ");
            int ind=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[ind++]);
                }
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(a, n, m);
            for (int i : ans) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends

class Solution {
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (n == 0 || m == 0)
            return ans;
        if (n == 1) {
            for (int i = 0; i < m; i++)
                ans.add(matrix[0][i]);
            return ans;
        }
        if (m == 1) {
            for (int i = 0; i < n; i++)
                ans.add(matrix[i][0]);
            return ans;
        }
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        for (int i = top; i <= right; i++)
            ans.add(matrix[top][i]);
        top++;
        for (int i = top; i <= bottom; i++)
            ans.add(matrix[i][right]);
        right--;
        for (int i = right; i >= left; i--)
            ans.add(matrix[bottom][i]);
        bottom--;
        for (int i = bottom; i >= top; i--)
            ans.add(matrix[i][left]);
        left++;
        return ans;
    }
}