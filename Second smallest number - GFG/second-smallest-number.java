//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] inp=read.readLine().split(" ");
            int S=Integer.parseInt(inp[0]);
            int D=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.secondSmallest(S,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String secondSmallest(int S, int D) {
        String res="";
        boolean flag=false;
        if(S==D*9)
            return "-1";
        for(int i=1;i<=D;i++)
        {
            int num;
            int R=(D-i)*9;
            if(S>R)
                num=S-R;
            else
                num=(i==1)?1:0;
            if(num>9)
                return "-1";
            if(!flag && S-num==R)
            {
                num+=1;
                flag=true;
            }
            if(!flag && i==D-1)
            {
                num+=1;
                flag=true;
            }
            S-=num;
            res+=Integer.toString(num);
        }
        
        return res;
    }
}