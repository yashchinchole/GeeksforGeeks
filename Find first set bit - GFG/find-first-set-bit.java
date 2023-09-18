//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

// } Driver Code Ends

class Solution {
    public static int getFirstSetBit(int n) {
        int ans = 0;
        while ((1 << ans) <= n) {
            if ((n & (1 << ans)) > 0)
                return ans + 1;
            ans++;
        }
        return 0;
    }
}