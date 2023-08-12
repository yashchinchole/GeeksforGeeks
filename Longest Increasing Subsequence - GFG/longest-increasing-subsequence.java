//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends

class Solution {
    static int lowerbound(int[] arr, int size, int x) {
        int low = 0, high = size - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return ans;
    }

    static int longestSubsequence(int size, int a[]) {
        int[] ans = new int[size];
        int sz = 0;
        ans[sz++] = a[0];

        for (int i = 1; i < size; i++) {
            if (ans[sz - 1] < a[i]) {
                ans[sz++] = a[i];
            } else {
                int index = lowerbound(ans, sz, a[i]);

                ans[index] = a[i];
            }
        }

        return sz;
    }
}