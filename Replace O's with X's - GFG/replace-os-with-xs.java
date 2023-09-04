//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends

class Solution {
    static char[][] fill(int n, int m, char a[][]) {
        int[] delrow = { -1, 0, 1, 0 };
        int[] delcol = { 0, 1, 0, -1 };
        int[][] visited = new int[n][m];
        for (int i = 0; i < n; i++) {
            if (visited[i][0] == 0 && a[i][0] == 'O') {
                dfs(i, 0, visited, a, delrow, delcol);
            }
            if (visited[i][m - 1] == 0 && a[i][m - 1] == 'O') {
                dfs(i, m - 1, visited, a, delrow, delcol);
            }
        }
        for (int j = 0; j < m; j++) {
            if (visited[0][j] == 0 && a[0][j] == 'O') {
                dfs(0, j, visited, a, delrow, delcol);
            }
            if (visited[n - 1][j] == 0 && a[n - 1][j] == 'O') {
                dfs(n - 1, j, visited, a, delrow, delcol);
            }
        }
        char[][] ans = a;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 'O' && visited[i][j] == 0) {
                    ans[i][j] = 'X';
                }
            }
        }
        return ans;
    }

    static void dfs(int i, int j, int[][] visited, char[][] a, int[] delrow, int[] delcol) {
        visited[i][j] = 1;
        int n = a.length;
        int m = a[0].length;
        for (int k = 0; k < 4; k++) {
            int nrow = i + delrow[k];
            int ncol = j + delcol[k];
            if (nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && visited[nrow][ncol] == 0
                    && a[nrow][ncol] == 'O') {
                dfs(nrow, ncol, visited, a, delrow, delcol);
            }
        }
    }
}