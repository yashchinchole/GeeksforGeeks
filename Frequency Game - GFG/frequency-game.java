//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

// Position this line where user code will be pasted.

// Driver class with main function
class GFG {
    // Main function
    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());

        // Iterating over testcases
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            int arr[] = new int[n];

            String s[]=in.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            System.out.println(obj.LargButMinFreq(arr, n));
        }
    }
}
// } Driver Code Ends

class Solution {
    public static int LargButMinFreq(int arr[], int n) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (!freqMap.containsKey(num))
                freqMap.put(num, 1);
            else
                freqMap.put(num, freqMap.get(num) + 1);
        }

        int minFreq = Integer.MAX_VALUE;
        for (int freq : freqMap.values())
            minFreq = Math.min(minFreq, freq);

        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (freqMap.get(num) == minFreq)
                res = Math.max(res, num);
        }

        return res;
    }
}