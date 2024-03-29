//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends

class Solution {
    
    // helper method to get gcd of 2 numbers.
    static Long gcd(Long a, Long b)
    {
        if(a == 0)
          return b;
          
        return gcd(b%a, a);
    }
    
    static Long[] lcmAndGcd(Long A , Long B) {
        
        Long[] arr = new Long[2];
        
        Long g = gcd(A,B);
        Long l = (A*B)/g;
        
        arr[0] = l;
        arr[1] = g;
        
        return arr;
    }
};