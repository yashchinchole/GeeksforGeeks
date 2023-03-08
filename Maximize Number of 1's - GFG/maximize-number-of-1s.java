//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int m = Integer.parseInt(br.readLine().trim());

            int ans = new Solve().findZeroes(arr, n, m);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solve {
    int findZeroes(int arr[], int n, int m) {
    int maxCount = 0;
    int left = 0, right = 0;
    int zeroCount = 0;

    while (right < n) {
        if (arr[right] == 0) {
            zeroCount++;
        }

        while (zeroCount > m) {
            if (arr[left] == 0) {
                zeroCount--;
            }
            left++;
        }

        maxCount = Math.max(maxCount, right - left + 1);
        right++;
    }

    return maxCount;
}

}