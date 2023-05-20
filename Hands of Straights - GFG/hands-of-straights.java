//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            boolean ans = obj.isStraightHand(n, k, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends

class Solution {
    public boolean isStraightHand(int N, int groupSize, int[] hand) {
        if (hand.length % groupSize != 0)
            return false;

        TreeMap<Integer, Integer> freqMap = new TreeMap<>();

        for (int card : hand)
            freqMap.put(card, freqMap.getOrDefault(card, 0) + 1);

        while (!freqMap.isEmpty()) {
            int curr = freqMap.firstKey();

            for (int i = curr; i < curr + groupSize; i++) {
                if (!freqMap.containsKey(i))
                    return false;

                int freq = freqMap.get(i);

                if (freq == 1)
                    freqMap.remove(i);
                else
                    freqMap.replace(i, freq - 1);
            }
        }
        return true;
    }
}