//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long N=sc.nextLong();
			
            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for(long num : ans){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    
    static ArrayList<Long> factorialNumbers(long N){
       ArrayList<Long> ans=new ArrayList<>();
       long fact=1;
       for(long i=1;i<=N;i++){
           
         
           fact *=i;
           if(fact<=N){
             ans.add(fact);
           }
           else {
               break;
           }
       }
       
       return ans;
    }
}