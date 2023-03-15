//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    int ans = obj.specialPalindrome(s1,s2);
		    System.out.println(ans);
		    
		    
		    
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    public  static int specialPalindrome(String a, String b){
       int l1=a.length();
       int l2=b.length();
       
       int ans= Integer.MAX_VALUE;
       
       for(int i=0 ;i<=l1-l2; i++){
           String temp = a.substring(0,i)+ b+ a.substring(i+l2);
           
           int cost=0;
           for(int j=i; j<i+l2;j++){
               if(temp.charAt(j)!=a.charAt(j)){
                   cost++;
               }
           }
           
           boolean flag=false;
           
           for(int j=0; j<l1/2; j++){
               if((j<i || j>=i+l2) && (temp.charAt(j)!=temp.charAt(l1-j-1))){
                   cost++;
               }
               else if((l1-j-1)>=i+l2 && (temp.charAt(j)!=temp.charAt(l1-j-1)) ){
                   cost++;
               }
               else if(temp.charAt(j)!=temp.charAt(l1-j-1)){
                   flag=true;
                   break;
               }
           }
           
           if(flag==false){
               ans= Math.min(ans,cost);
           }
           
       }
       
       if(ans==Integer.MAX_VALUE){
           return -1;
       }
       
       return ans;
    }
}