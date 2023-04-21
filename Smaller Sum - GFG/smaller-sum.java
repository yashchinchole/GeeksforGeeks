//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine());
            String s[]=in.readLine().trim().split(" ");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            Solution ob=new Solution();
            long ans[]=ob.smallerSum(n,a);
            for(long i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public long[] smallerSum(int n, int arr[]) {
        int max = 0;
        for (int i = 0; i < n; i++)
            max = Math.max(max, arr[i]);

        long[] prefix = new long[max + 1];
        long[] ans = new long[n];

        for (int i = 0; i < n; i++)
            prefix[arr[i]] += arr[i];

        long sum = prefix[0];
        for (int i = 1; i <= max; i++) {
            long p = prefix[i];
            prefix[i] = sum;
            sum += p;
        }

        for (int i = 0; i < n; i++)
            ans[i] = prefix[arr[i]];
            
        return ans;
    }
}