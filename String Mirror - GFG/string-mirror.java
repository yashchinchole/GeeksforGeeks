//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String str;
            str = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.stringMirror(str);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

class Solution {
    public static String stringMirror(String str) {
        int n = str.length();
        if (n == 1) {
            return str + str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.substring(0, 2);
        }
        int i;
        for (i = 0; i < n - 1; i++) {
            if (str.charAt(i + 1) <= str.charAt(i)) {
                continue;
            }
            break;
        }
        String firstHalf = str.substring(0, i + 1);
        String secondHalf = "";
        for (int j = i; j >= 0; j--) {
            secondHalf += str.charAt(j);
        }
        return firstHalf + secondHalf;
    }
}