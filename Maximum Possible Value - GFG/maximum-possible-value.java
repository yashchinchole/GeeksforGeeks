//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int N = Integer.parseInt(read.readLine().trim());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);
            input_line = read.readLine().trim().split("\\s+");
            int B[]= new int[N];
            for(int i = 0; i < N; i++)
                B[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            long ans = ob.maxPossibleValue(N, A, B); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long maxPossibleValue(int N, int A[] ,int B[]) {
        long ans = 0;
        int totalSticks = 0;
        int length = 0;
        int unit = 0;
        int minm = Integer.MAX_VALUE;
        
        for(int  i = 0; i < N; i++)
        {
            length = A[i];
            unit = B[i];
            
            if(unit % 2 == 1)
                unit--;
            
            if(unit >= 2)
                minm = Math.min(minm, length);
            
            ans += (length * unit);
            totalSticks += unit;
        }
        
        if(totalSticks % 4 != 0)
            ans -= (2 * minm);
        
        return ans;
    }
} 