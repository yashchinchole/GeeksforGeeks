//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>(N);
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < N; i++) {
				arr.add(Integer.parseInt(str[i]));
			}
			Solution obj = new Solution();
			System.out.println(obj.maxCoins(N, arr));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int maxCoins(int N, ArrayList<Integer> arr) {
		arr.add(1);
		arr.add(0,1);
		N = arr.size();
		int [][] d = new int[N][N];
		for(int i = 0; i < N; i++)
		{
		    Arrays.fill(d[i],0);
		}
		for(int a = N-3; a > -1; a--)
        {
            for(int b = a + 2; b < N; b++)
            {
                for(int c = a + 1; c < b; c++)
                {
                    d[a][b] = Math.max(d[a][b], d[a][c] + d[c][b] + arr.get(a) * arr.get(b) * arr.get(c));
                }
            }
        }
        return d[0][N-1];
	}
}