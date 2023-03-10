//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
    {
        int ans =0;
        boolean flag=false;
        int last =A[N-1];
        for(int i=0;i<N-2;i+=2)
        {
            if(A[i]!=A[i+1])
            {
                ans = A[i];
                flag =true;
                break;
            }
        }
        if(!flag)
        return last;
        else
        return ans;
    }
}