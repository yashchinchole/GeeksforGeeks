//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution { 
    String reverseWords(String S) { 
        StringBuilder ans = new StringBuilder(); 
        String str[] = S.split("\\."); // escape the '.' character
        for (int i = str.length - 1; i >= 0; i--) { 
            ans.append(str[i]); 
            if (i != 0) 
                ans.append("."); 
        } 
        return ans.toString(); 
    } 
}
