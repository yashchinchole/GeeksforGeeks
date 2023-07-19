//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends

class Solution {
    static char nonrepeatingCharacter(String S) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : S.toCharArray())
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        for (char c : S.toCharArray())
            if (charCount.get(c) == 1)
                return c;
        return '$';
    }
}