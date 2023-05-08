//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			String s = str[0];
			int m = Integer.parseInt(str[1]);
			Solution obj = new Solution();
			System.out.println(obj.modulo(s,m));
		}
	}
}

// } Driver Code Ends


class Solution {
    int modulo(String s, int m) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans = ans * 2 + (s.charAt(i) - '0');
            ans %= m;
        }
        return ans;
    }
}