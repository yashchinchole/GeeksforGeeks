//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        
        int t = Integer.parseInt(br.readLine()); 

        while(t > 0){
            
            String input_line1[] = br.readLine().trim().split("\\s+");
            int X = Integer.parseInt(input_line1[0]);
            int Y = Integer.parseInt(input_line1[1]);
            
            String S = br.readLine(); 
            
            Solution ob = new Solution();
		
            System.out.println(ob.solve(X,Y,S)); 

            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static long solve(int X,int Y, String S)
	{    
        int l=S.length();
        String p = "pr",q = "rp";
        if(Y>X) {
            p="rp";
            q="pr";
            int kl=X;
            X=Y;
            Y=kl;
        }
        int j=l;
        do{
            j=S.length();
            S = S.replaceAll(p,"");
        }while(j!=S.length());
        long x = (l-S.length())/2;
        l=S.length();
        do{
            j=S.length();
            S = S.replaceAll(q,"");
        }while(j!=S.length());
        long y = (l-S.length())/2;
        return x*X + y*Y;
	}
} 
